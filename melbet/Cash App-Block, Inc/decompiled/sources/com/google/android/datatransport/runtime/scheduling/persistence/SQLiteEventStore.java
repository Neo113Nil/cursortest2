package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda9;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class SQLiteEventStore implements Closeable {
    public static final Encoding PROTOBUF_ENCODING = new Encoding("proto");
    public final AutoValue_EventStoreConfig config;
    public final Clock monotonicClock;
    public final Provider packageName;
    public final SchemaManager schemaManager;
    public final Clock wallClock;

    public interface Function {
        /* renamed from: apply */
        Object mo39apply(Object obj);
    }

    public final class Metadata {
        public final String key;
        public final String value;

        public Metadata(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public SQLiteEventStore(Clock clock, Clock clock2, AutoValue_EventStoreConfig autoValue_EventStoreConfig, SchemaManager schemaManager, Provider provider) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = autoValue_EventStoreConfig;
        this.packageName = provider;
    }

    public static Long getTransportContextId(SQLiteDatabase sQLiteDatabase, AutoValue_TransportContext autoValue_TransportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(autoValue_TransportContext.backendName, String.valueOf(PriorityMapping.toInt(autoValue_TransportContext.priority))));
        byte[] bArr = autoValue_TransportContext.extras;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String toIdList(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AutoValue_PersistedEvent) it.next()).id);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object tryWithCursor(Cursor cursor, Function function) {
        try {
            return function.mo39apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.schemaManager.close();
    }

    public final SQLiteDatabase getDb() {
        SchemaManager schemaManager = this.schemaManager;
        Objects.requireNonNull(schemaManager);
        Clock clock = this.monotonicClock;
        long time = clock.getTime();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (clock.getTime() >= this.config.criticalSectionEnterTimeoutMs + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object inTransaction(Function function) {
        SQLiteDatabase db = getDb();
        db.beginTransaction();
        try {
            Object mo39apply = function.mo39apply(db);
            db.setTransactionSuccessful();
            return mo39apply;
        } finally {
            db.endTransaction();
        }
    }

    public final ArrayList loadEvents(SQLiteDatabase sQLiteDatabase, AutoValue_TransportContext autoValue_TransportContext, int i) {
        ArrayList arrayList = new ArrayList();
        Long transportContextId = getTransportContextId(sQLiteDatabase, autoValue_TransportContext);
        if (transportContextId == null) {
            return arrayList;
        }
        tryWithCursor(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id"}, "context_id = ?", new String[]{transportContextId.toString()}, null, null, null, String.valueOf(i)), new PreviewView$1$$ExternalSyntheticLambda2(13, this, arrayList, autoValue_TransportContext));
        return arrayList;
    }

    public final void recordLogEventDropped(long j, LogEventDropped.Reason reason, String str) {
        inTransaction(new Uploader$$ExternalSyntheticLambda9(str, j, reason));
    }

    public final Object runCriticalSection(SynchronizationGuard$CriticalSection synchronizationGuard$CriticalSection) {
        SQLiteDatabase db = getDb();
        Clock clock = this.monotonicClock;
        long time = clock.getTime();
        while (true) {
            try {
                db.beginTransaction();
                try {
                    Object execute = synchronizationGuard$CriticalSection.execute();
                    db.setTransactionSuccessful();
                    return execute;
                } finally {
                    db.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (clock.getTime() >= this.config.criticalSectionEnterTimeoutMs + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
