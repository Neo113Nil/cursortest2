package com.google.firebase.concurrent;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.airbnb.lottie.LottieCompositionFactory$$ExternalSyntheticLambda5;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$ExternalSyntheticLambda3;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.maps.zzai;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.squareup.scannerview.SizeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final /* synthetic */ class DelegatingScheduledExecutorService$$ExternalSyntheticLambda0 implements SynchronizationGuard$CriticalSection, DelegatingScheduledFuture.Resolver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda0(zzai zzaiVar, Iterable iterable, AutoValue_TransportContext autoValue_TransportContext, long j) {
        this.$r8$classId = 1;
        this.f$0 = zzaiVar;
        this.f$1 = iterable;
        this.f$3 = autoValue_TransportContext;
        this.f$2 = j;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public ScheduledFuture addCompleter(SizeMap sizeMap) {
        int i = this.$r8$classId;
        int i2 = 1;
        Object obj = this.f$3;
        long j = this.f$2;
        Object obj2 = this.f$1;
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = (DelegatingScheduledExecutorService) this.f$0;
        switch (i) {
            case 0:
                return delegatingScheduledExecutorService.scheduler.schedule(new DelegatingScheduledExecutorService$$ExternalSyntheticLambda4(delegatingScheduledExecutorService, (Runnable) obj2, sizeMap, i2), j, (TimeUnit) obj);
            default:
                return delegatingScheduledExecutorService.scheduler.schedule(new LottieCompositionFactory$$ExternalSyntheticLambda5(i2, delegatingScheduledExecutorService, (Callable) obj2, sizeMap), j, (TimeUnit) obj);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        zzai zzaiVar = (zzai) this.f$0;
        Iterable iterable = (Iterable) this.f$1;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$3;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) zzaiVar.zab;
        sQLiteEventStore.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(SQLiteEventStore.toIdList(iterable));
            SQLiteDatabase db = sQLiteEventStore.getDb();
            db.beginTransaction();
            try {
                db.compileStatement(concat).execute();
                Cursor rawQuery = db.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        sQLiteEventStore.recordLogEventDropped(rawQuery.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                db.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                db.setTransactionSuccessful();
            } finally {
                db.endTransaction();
            }
        }
        sQLiteEventStore.inTransaction(new SQLiteEventStore$$ExternalSyntheticLambda3(((Clock) zzaiVar.zzb).getTime() + this.f$2, autoValue_TransportContext));
        return null;
    }

    public /* synthetic */ DelegatingScheduledExecutorService$$ExternalSyntheticLambda0(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingScheduledExecutorService;
        this.f$1 = obj;
        this.f$2 = j;
        this.f$3 = timeUnit;
    }
}
