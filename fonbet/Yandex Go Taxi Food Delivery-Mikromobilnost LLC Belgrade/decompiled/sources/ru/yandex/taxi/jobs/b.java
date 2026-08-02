package ru.yandex.taxi.jobs;

import android.content.Context;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import defpackage.ba51;
import defpackage.ec70;
import defpackage.ez7;
import defpackage.fz7;
import defpackage.gl7;
import defpackage.gz7;
import defpackage.h3y;
import defpackage.hzk;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jst;
import defpackage.kc70;
import defpackage.ku2;
import defpackage.mka1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qv10;
import defpackage.r270;
import defpackage.rxa0;
import defpackage.t041;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w4j0;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes9.dex */
public final class b {
    public final h3y a;
    public final hzk b;
    public final ike c;
    public final i3y d;

    public b(h3y h3yVar, hzk hzkVar, Context context, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = hzkVar;
        tt2Var.getClass();
        ike e = qv10.e(uyj.a.P(1));
        this.c = e;
        this.d = kotlin.a.a(new ku2(context, 12));
        tje.N(e, null, null, new JobSchedulerImpl$1(context, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fz7 fz7Var, ContinuationImpl continuationImpl) {
        JobSchedulerImpl$awaitCancel$1 jobSchedulerImpl$awaitCancel$1;
        int i;
        if (continuationImpl instanceof JobSchedulerImpl$awaitCancel$1) {
            jobSchedulerImpl$awaitCancel$1 = (JobSchedulerImpl$awaitCancel$1) continuationImpl;
            int i2 = jobSchedulerImpl$awaitCancel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jobSchedulerImpl$awaitCancel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jobSchedulerImpl$awaitCancel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jobSchedulerImpl$awaitCancel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gl7 gl7Var = ((kc70) c(fz7Var)).c;
                    jobSchedulerImpl$awaitCancel$1.L$0 = null;
                    jobSchedulerImpl$awaitCancel$1.L$1 = null;
                    jobSchedulerImpl$awaitCancel$1.label = 1;
                    if (ooc.e(gl7Var, jobSchedulerImpl$awaitCancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        jobSchedulerImpl$awaitCancel$1 = new JobSchedulerImpl$awaitCancel$1(this, continuationImpl);
        Object obj2 = jobSchedulerImpl$awaitCancel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jobSchedulerImpl$awaitCancel$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        JobSchedulerImpl$cancelAll$1 jobSchedulerImpl$cancelAll$1;
        int i;
        if (continuationImpl instanceof JobSchedulerImpl$cancelAll$1) {
            jobSchedulerImpl$cancelAll$1 = (JobSchedulerImpl$cancelAll$1) continuationImpl;
            int i2 = jobSchedulerImpl$cancelAll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jobSchedulerImpl$cancelAll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jobSchedulerImpl$cancelAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jobSchedulerImpl$cancelAll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    gl7 gl7Var = d().a().c;
                    jobSchedulerImpl$cancelAll$1.L$0 = null;
                    jobSchedulerImpl$cancelAll$1.label = 1;
                    obj = ooc.e(gl7Var, jobSchedulerImpl$cancelAll$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return obj;
            }
        }
        jobSchedulerImpl$cancelAll$1 = new JobSchedulerImpl$cancelAll$1(this, continuationImpl);
        Object obj2 = jobSchedulerImpl$cancelAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jobSchedulerImpl$cancelAll$1.label;
        if (i != 0) {
        }
        return obj2;
    }

    public final ec70 c(gz7 gz7Var) {
        if (gz7Var instanceof fz7) {
            return d().b(((fz7) gz7Var).a);
        }
        if (!(gz7Var instanceof ez7)) {
            w511.b();
            return null;
        }
        ez7 ez7Var = (ez7) gz7Var;
        kc70 d = d().d(ez7Var.a());
        tje.N(this.c, null, null, new JobSchedulerImpl$logSilent$1(d, ez7Var.b(), null), 3);
        return d;
    }

    public final WorkManager d() {
        return (WorkManager) this.d.getValue();
    }

    public final a e(w4j0 w4j0Var) {
        ec70 g;
        jst.e.getClass();
        ba51 d = mka1.d(w4j0Var, this.b);
        if (!w4j0Var.c()) {
            WorkManager d2 = d();
            d2.getClass();
            g = d2.e(Collections.singletonList(d));
        } else if (d instanceof rxa0) {
            g = d().f(w4j0Var.b(), ExistingPeriodicWorkPolicy.UPDATE, (rxa0) d);
        } else {
            if (!(d instanceof r270)) {
                ny61.r("Invalid worker request");
                return null;
            }
            WorkManager d3 = d();
            String b = w4j0Var.b();
            ExistingWorkPolicy existingWorkPolicy = w4j0Var.a() ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE;
            d3.getClass();
            g = d3.g(b, existingWorkPolicy, Collections.singletonList((r270) d));
        }
        UUID uuid = d.a;
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        JobSchedulerImpl$schedule$result$1 jobSchedulerImpl$schedule$result$1 = new JobSchedulerImpl$schedule$result$1(g, null);
        ike ikeVar = this.c;
        a aVar = new a(uuid, tje.h(ikeVar, null, coroutineStart, jobSchedulerImpl$schedule$result$1, 1));
        tje.N(ikeVar, null, null, new JobSchedulerImpl$acquireJobWakeLock$1(aVar, w4j0Var, ((t041) this.a.get()).a(6000L, "JobSchedulerWakeLock"), null), 3);
        return aVar;
    }
}
