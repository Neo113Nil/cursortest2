package ru.yandex.taxi.polling;

import defpackage.c9z;
import defpackage.f9z;
import defpackage.g9z;
import defpackage.jbh;
import defpackage.kbn;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c implements t1b0 {
    public final /* synthetic */ t1b0 a;
    public final g9z b;

    public c(rqo rqoVar, g9z g9zVar) {
        this.a = ((jbh) rqoVar).e(f9z.k);
        this.b = g9zVar;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (f9z) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1 locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1;
        int i;
        kbn kbnVar;
        if (continuationImpl instanceof LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1) {
            locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1 = (LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1) continuationImpl;
            int i2 = locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label = 1;
                    obj = g(locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (c) locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.L$0;
                        kotlin.b.b(obj);
                        f9z f9zVar = (f9z) obj;
                        this.getClass();
                        return new kbn(f9zVar.j, f9zVar.h, f9zVar.i);
                    }
                    kotlin.b.b(obj);
                }
                kbnVar = (kbn) obj;
                if (kbnVar == null) {
                    return kbnVar;
                }
                tpr a = this.a.a();
                LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$2 locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$2 = new LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$2(2, null);
                locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.L$0 = this;
                locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label = 2;
                obj = kotlinx.coroutines.flow.e.x(a, locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$2, locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1);
            }
        }
        locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1 = new LocationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1(this, continuationImpl);
        Object obj2 = locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationInfoPollingExperimentProvider$awaitEarlySubscriptionConfig$1.label;
        if (i != 0) {
        }
        kbnVar = (kbn) obj2;
        if (kbnVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        LocationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1 locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1;
        Object obj;
        int i;
        f9z f9zVar;
        if (continuationImpl instanceof LocationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1) {
            locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1 = (LocationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1) continuationImpl;
            int i2 = locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.label = i2 - Integer.MIN_VALUE;
                obj = locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.label = 1;
                    obj = this.a.b(locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1);
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
                if (!((f9z) obj).b) {
                    obj = null;
                }
                f9zVar = (f9z) obj;
                if (f9zVar == null) {
                    return new kbn(f9zVar.j, f9zVar.h, f9zVar.i);
                }
                return null;
            }
        }
        locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1 = new LocationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1(this, continuationImpl);
        obj = locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationInfoPollingExperimentProvider$getCachedEarlySubscriptionConfig$1.label;
        if (i != 0) {
        }
        if (!((f9z) obj).b) {
        }
        f9zVar = (f9z) obj;
        if (f9zVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        LocationInfoPollingExperimentProvider$getPollingData$1 locationInfoPollingExperimentProvider$getPollingData$1;
        int i;
        f9z f9zVar;
        if (continuationImpl instanceof LocationInfoPollingExperimentProvider$getPollingData$1) {
            locationInfoPollingExperimentProvider$getPollingData$1 = (LocationInfoPollingExperimentProvider$getPollingData$1) continuationImpl;
            int i2 = locationInfoPollingExperimentProvider$getPollingData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationInfoPollingExperimentProvider$getPollingData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationInfoPollingExperimentProvider$getPollingData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationInfoPollingExperimentProvider$getPollingData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationInfoPollingExperimentProvider$getPollingData$1.L$0 = this;
                    locationInfoPollingExperimentProvider$getPollingData$1.label = 1;
                    obj = this.a.b(locationInfoPollingExperimentProvider$getPollingData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) locationInfoPollingExperimentProvider$getPollingData$1.L$0;
                    kotlin.b.b(obj);
                }
                f9zVar = (f9z) obj;
                g9z g9zVar = this.b;
                if (f9zVar.b) {
                    g9zVar.getClass();
                    return null;
                }
                long j = f9zVar.c;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long millis = timeUnit.toMillis(j);
                if (millis <= 0) {
                    g9zVar.getClass();
                    return null;
                }
                long millis2 = timeUnit.toMillis(f9zVar.d);
                if (millis2 <= 0) {
                    g9zVar.getClass();
                    return null;
                }
                long j2 = f9zVar.e;
                if (j2 > 0) {
                    return new c9z(millis, millis2, j2, f9zVar.f, f9zVar.g);
                }
                g9zVar.getClass();
                return null;
            }
        }
        locationInfoPollingExperimentProvider$getPollingData$1 = new LocationInfoPollingExperimentProvider$getPollingData$1(this, continuationImpl);
        Object obj2 = locationInfoPollingExperimentProvider$getPollingData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationInfoPollingExperimentProvider$getPollingData$1.label;
        if (i != 0) {
        }
        f9zVar = (f9z) obj2;
        g9z g9zVar2 = this.b;
        if (f9zVar.b) {
        }
    }
}
