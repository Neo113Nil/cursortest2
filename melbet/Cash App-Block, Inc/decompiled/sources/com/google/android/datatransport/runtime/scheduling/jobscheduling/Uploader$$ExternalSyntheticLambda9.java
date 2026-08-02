package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda3;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.maps.zzai;

/* loaded from: classes4.dex */
public final /* synthetic */ class Uploader$$ExternalSyntheticLambda9 implements SynchronizationGuard$CriticalSection, SQLiteEventStore.Function {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ Uploader$$ExternalSyntheticLambda9(Object obj, long j, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        String str = (String) this.f$0;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((LogEventDropped.Reason) this.f$1).number_;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f$2;
            if (z) {
                sQLiteDatabase.execSQL(Boxes$$ExternalSyntheticOutline1.m(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        zzai zzaiVar = (zzai) this.f$0;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) zzaiVar.zab;
        long time = ((Clock) zzaiVar.zzb).getTime() + this.f$2;
        sQLiteEventStore.getClass();
        sQLiteEventStore.inTransaction(new SQLiteEventStore$$ExternalSyntheticLambda3(time, autoValue_TransportContext));
        return null;
    }
}
