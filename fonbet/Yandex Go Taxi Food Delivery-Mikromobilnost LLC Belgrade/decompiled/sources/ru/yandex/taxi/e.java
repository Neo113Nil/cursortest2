package ru.yandex.taxi;

import defpackage.i3y;
import defpackage.k0b0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.rtb0;
import defpackage.t1b0;
import defpackage.zf2;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class e {
    public final k0b0 a;
    public final com.yandex.go.navigation.screen.c b;
    public final i3y c;
    public mo21 d;

    public e(rqo rqoVar, k0b0 k0b0Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = k0b0Var;
        this.b = cVar;
        this.c = kotlin.a.b(LazyThreadSafetyMode.NONE, new zf2(rqoVar, 11));
    }

    public final m0 a() {
        return new m0(c(), this.b.c(), new PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PinAbsenceFeatureProviderImpl$experimentSuspend$1 pinAbsenceFeatureProviderImpl$experimentSuspend$1;
        int i;
        if (continuationImpl instanceof PinAbsenceFeatureProviderImpl$experimentSuspend$1) {
            pinAbsenceFeatureProviderImpl$experimentSuspend$1 = (PinAbsenceFeatureProviderImpl$experimentSuspend$1) continuationImpl;
            int i2 = pinAbsenceFeatureProviderImpl$experimentSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$experimentSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$experimentSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$experimentSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 e = e();
                    pinAbsenceFeatureProviderImpl$experimentSuspend$1.L$0 = this;
                    pinAbsenceFeatureProviderImpl$experimentSuspend$1.label = 1;
                    obj = e.b(pinAbsenceFeatureProviderImpl$experimentSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (e) pinAbsenceFeatureProviderImpl$experimentSuspend$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.j((rtb0) obj);
            }
        }
        pinAbsenceFeatureProviderImpl$experimentSuspend$1 = new PinAbsenceFeatureProviderImpl$experimentSuspend$1(this, continuationImpl);
        Object obj2 = pinAbsenceFeatureProviderImpl$experimentSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$experimentSuspend$1.label;
        if (i != 0) {
        }
        return this.j((rtb0) obj2);
    }

    public final b c() {
        return new b(new kotlinx.coroutines.flow.n(e().a(), new PinAbsenceFeatureProviderImpl$flowExperiment$1(this, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        PinAbsenceFeatureProviderImpl$geoTap$1 pinAbsenceFeatureProviderImpl$geoTap$1;
        int i;
        if (continuationImpl instanceof PinAbsenceFeatureProviderImpl$geoTap$1) {
            pinAbsenceFeatureProviderImpl$geoTap$1 = (PinAbsenceFeatureProviderImpl$geoTap$1) continuationImpl;
            int i2 = pinAbsenceFeatureProviderImpl$geoTap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$geoTap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$geoTap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$geoTap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 e = e();
                    pinAbsenceFeatureProviderImpl$geoTap$1.label = 1;
                    obj = e.b(pinAbsenceFeatureProviderImpl$geoTap$1);
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
                return Boolean.valueOf(((rtb0) obj).k);
            }
        }
        pinAbsenceFeatureProviderImpl$geoTap$1 = new PinAbsenceFeatureProviderImpl$geoTap$1(this, continuationImpl);
        Object obj2 = pinAbsenceFeatureProviderImpl$geoTap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$geoTap$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((rtb0) obj2).k);
    }

    public final t1b0 e() {
        return (t1b0) this.c.getValue();
    }

    public final boolean f() {
        return j((rtb0) e().c()).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        PinAbsenceFeatureProviderImpl$isSticky$1 pinAbsenceFeatureProviderImpl$isSticky$1;
        int i;
        if (continuationImpl instanceof PinAbsenceFeatureProviderImpl$isSticky$1) {
            pinAbsenceFeatureProviderImpl$isSticky$1 = (PinAbsenceFeatureProviderImpl$isSticky$1) continuationImpl;
            int i2 = pinAbsenceFeatureProviderImpl$isSticky$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$isSticky$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$isSticky$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$isSticky$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 e = e();
                    pinAbsenceFeatureProviderImpl$isSticky$1.label = 1;
                    obj = e.b(pinAbsenceFeatureProviderImpl$isSticky$1);
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
                return Boolean.valueOf(((rtb0) obj).j);
            }
        }
        pinAbsenceFeatureProviderImpl$isSticky$1 = new PinAbsenceFeatureProviderImpl$isSticky$1(this, continuationImpl);
        Object obj2 = pinAbsenceFeatureProviderImpl$isSticky$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$isSticky$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((rtb0) obj2).j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1 pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1;
        int i;
        if (continuationImpl instanceof PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1) {
            pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1 = (PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1) continuationImpl;
            int i2 = pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.label = 1;
                    obj = b(pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new Integer(((rtb0) obj).g);
            }
        }
        pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1 = new PinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1(this, continuationImpl);
        Object obj3 = pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$locationUpdateDistanceThreshold$1.label;
        if (i != 0) {
        }
        return new Integer(((rtb0) obj3).g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        PinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1 pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1;
        int i;
        if (continuationImpl instanceof PinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1) {
            pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1 = (PinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1) continuationImpl;
            int i2 = pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.label = 1;
                    obj = b(pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((rtb0) obj).i);
            }
        }
        pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1 = new PinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1(this, continuationImpl);
        Object obj3 = pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinAbsenceFeatureProviderImpl$updateSourcePointOnSummary$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((rtb0) obj3).i);
    }

    public final rtb0 j(rtb0 rtb0Var) {
        return (this.a.b() && rtb0Var.b) ? rtb0Var : rtb0.m;
    }
}
