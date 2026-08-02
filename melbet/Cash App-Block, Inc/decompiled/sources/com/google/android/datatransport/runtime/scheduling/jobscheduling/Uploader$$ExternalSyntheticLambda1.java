package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class Uploader$$ExternalSyntheticLambda1 implements SynchronizationGuard$CriticalSection {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SQLiteEventStore f$0;

    public /* synthetic */ Uploader$$ExternalSyntheticLambda1(SQLiteEventStore sQLiteEventStore, int i) {
        this.$r8$classId = i;
        this.f$0 = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public final Object execute() {
        SQLiteDatabase db;
        int i = this.$r8$classId;
        SQLiteEventStore sQLiteEventStore = this.f$0;
        switch (i) {
            case 0:
                long time = sQLiteEventStore.wallClock.getTime() - sQLiteEventStore.config.eventCleanUpAge;
                db = sQLiteEventStore.getDb();
                db.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor rawQuery = db.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            sQLiteEventStore.recordLogEventDropped(rawQuery.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = db.delete("events", "timestamp_ms < ?", strArr);
                    db.setTransactionSuccessful();
                    db.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                sQLiteEventStore.getClass();
                int i2 = ClientMetrics.$r8$clinit;
                UnleashContext unleashContext = new UnleashContext();
                unleashContext.sessionId = null;
                unleashContext.remoteAddress = new ArrayList();
                unleashContext.properties = null;
                unleashContext.userId = "";
                HashMap hashMap = new HashMap();
                db = sQLiteEventStore.getDb();
                db.beginTransaction();
                try {
                    ClientMetrics clientMetrics = (ClientMetrics) SQLiteEventStore.tryWithCursor(db.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new PreviewView$1$$ExternalSyntheticLambda2(14, sQLiteEventStore, hashMap, unleashContext));
                    db.setTransactionSuccessful();
                    return clientMetrics;
                } finally {
                }
        }
    }
}
