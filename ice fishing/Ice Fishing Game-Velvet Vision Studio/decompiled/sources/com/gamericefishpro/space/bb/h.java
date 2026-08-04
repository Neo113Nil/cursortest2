package com.gamericefishpro.space.bb;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.pi.g0;
import com.gamericefishpro.space.s5.y;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.d = i;
        this.i = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws g0 {
        s sVar;
        int i = 0;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t tVar = (t) this.i;
                com.gamericefishpro.space.nb.a aVar = (com.gamericefishpro.space.nb.a) this.e;
                if (tVar.b != t.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (tVar) {
                    sVar = tVar.a;
                    tVar.a = null;
                    tVar.b = aVar;
                    break;
                }
                sVar.getClass();
                return;
            case 1:
                r rVar = (r) this.i;
                com.gamericefishpro.space.nb.a aVar2 = (com.gamericefishpro.space.nb.a) this.e;
                synchronized (rVar) {
                    try {
                        if (rVar.b == null) {
                            rVar.a.add(aVar2);
                        } else {
                            rVar.b.add(aVar2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                com.gamericefishpro.space.cb.a aVar3 = (com.gamericefishpro.space.cb.a) this.i;
                Runnable runnable = (Runnable) this.e;
                Process.setThreadPriority(aVar3.c);
                StrictMode.ThreadPolicy threadPolicy = aVar3.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 3:
                Callable callable = (Callable) this.i;
                com.gamericefishpro.space.cb.i iVar = (com.gamericefishpro.space.cb.i) ((com.gamericefishpro.space.vb.c) this.e).e;
                try {
                    iVar.j(callable.call());
                    return;
                } catch (Exception e) {
                    iVar.k(e);
                    return;
                }
            case 4:
                com.gamericefishpro.space.d.k kVar = (com.gamericefishpro.space.d.k) this.i;
                kVar.d.a(new com.gamericefishpro.space.d.d(i, (com.gamericefishpro.space.d.r) this.e, kVar));
                return;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.i;
                JobParameters jobParameters = (JobParameters) this.e;
                int i2 = JobInfoSchedulerService.d;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.d9.h.s((com.gamericefishpro.space.j1.d) this.i, (LongSparseArray) this.e);
                return;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((com.gamericefishpro.space.m6.f) this.i).f((com.gamericefishpro.space.u6.j) this.e, false);
                return;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.m6.p pVar = (com.gamericefishpro.space.m6.p) this.i;
                com.gamericefishpro.space.va.b bVar = (com.gamericefishpro.space.va.b) this.e;
                if (pVar.J.d instanceof com.gamericefishpro.space.w6.a) {
                    bVar.cancel(true);
                    return;
                }
                return;
            case 9:
                ((com.gamericefishpro.space.pi.h) this.i).C((com.gamericefishpro.space.qi.d) this.e, Unit.a);
                return;
            case 10:
                Runnable runnable2 = (Runnable) this.i;
                y yVar = (y) this.e;
                try {
                    runnable2.run();
                    return;
                } finally {
                    yVar.a();
                }
            case RequestError.STOP_TRACKING /* 11 */:
                List<com.gamericefishpro.space.r6.b> listenersList = (List) this.i;
                com.gamericefishpro.space.f5.y this$0 = (com.gamericefishpro.space.f5.y) this.e;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (com.gamericefishpro.space.r6.b bVar2 : listenersList) {
                    Object obj = this$0.e;
                    bVar2.d = obj;
                    bVar2.d(bVar2.e, obj);
                }
                return;
            case 12:
                ((com.gamericefishpro.space.t3.b) this.i).h((Typeface) this.e);
                return;
            case 13:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.i;
                com.gamericefishpro.space.r9.h hVar = (com.gamericefishpro.space.r9.h) this.e;
                com.gamericefishpro.space.tb.u uVar = FirebaseMessaging.k;
                try {
                    hVar.a(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    hVar.a.l(e2);
                    return;
                }
            case 14:
                com.gamericefishpro.space.tb.n nVar = (com.gamericefishpro.space.tb.n) this.i;
                com.gamericefishpro.space.r9.h hVar2 = (com.gamericefishpro.space.r9.h) this.e;
                try {
                    hVar2.a(nVar.b());
                    return;
                } catch (Exception e3) {
                    hVar2.a.l(e3);
                    return;
                }
            case 15:
                com.gamericefishpro.space.v6.o oVar = (com.gamericefishpro.space.v6.o) this.i;
                com.gamericefishpro.space.w6.j jVar = (com.gamericefishpro.space.w6.j) this.e;
                if (oVar.d.d instanceof com.gamericefishpro.space.w6.a) {
                    jVar.cancel(true);
                    return;
                } else {
                    jVar.k(oVar.v.getForegroundInfoAsync());
                    return;
                }
            default:
                ConstraintTrackingWorker this$1 = (ConstraintTrackingWorker) this.i;
                com.gamericefishpro.space.va.b innerFuture = (com.gamericefishpro.space.va.b) this.e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
                synchronized (this$1.e) {
                    try {
                        if (this$1.i) {
                            com.gamericefishpro.space.w6.j future = this$1.v;
                            Intrinsics.checkNotNullExpressionValue(future, "future");
                            String str = com.gamericefishpro.space.y6.a.a;
                            future.i(new com.gamericefishpro.space.l6.m());
                        } else {
                            this$1.v.k(innerFuture);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
