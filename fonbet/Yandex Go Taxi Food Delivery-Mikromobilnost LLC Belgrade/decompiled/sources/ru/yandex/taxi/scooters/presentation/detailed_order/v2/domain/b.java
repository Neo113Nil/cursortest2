package ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain;

import defpackage.ea90;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k5o0;
import defpackage.l5o0;
import defpackage.lrj0;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.rqo;
import defpackage.se90;
import defpackage.t1b0;
import defpackage.w511;
import defpackage.zuo0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.data.model.ScootersOnboardingOnActiveRideExperiment;

/* loaded from: classes6.dex */
public final class b {
    public final qwo0 a;
    public final t1b0 b;

    public b(rqo rqoVar, qwo0 qwo0Var) {
        this.a = qwo0Var;
        ScootersOnboardingOnActiveRideExperiment.Companion.getClass();
        this.b = ((jbh) rqoVar).e(ScootersOnboardingOnActiveRideExperiment.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zuo0 zuo0Var, ContinuationImpl continuationImpl) {
        ScootersOnboardingOnActiveRideInteractor$whatToShow$1 scootersOnboardingOnActiveRideInteractor$whatToShow$1;
        int i;
        ScootersOnboardingOnActiveRideExperiment scootersOnboardingOnActiveRideExperiment;
        boolean contains;
        String str;
        if (continuationImpl instanceof ScootersOnboardingOnActiveRideInteractor$whatToShow$1) {
            scootersOnboardingOnActiveRideInteractor$whatToShow$1 = (ScootersOnboardingOnActiveRideInteractor$whatToShow$1) continuationImpl;
            int i2 = scootersOnboardingOnActiveRideInteractor$whatToShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOnboardingOnActiveRideInteractor$whatToShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOnboardingOnActiveRideInteractor$whatToShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOnboardingOnActiveRideInteractor$whatToShow$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersOnboardingOnActiveRideInteractor$whatToShow$1.L$0 = zuo0Var;
                    scootersOnboardingOnActiveRideInteractor$whatToShow$1.label = 1;
                    obj = this.b.b(scootersOnboardingOnActiveRideInteractor$whatToShow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zuo0Var = (zuo0) scootersOnboardingOnActiveRideInteractor$whatToShow$1.L$0;
                    kotlin.b.b(obj);
                }
                scootersOnboardingOnActiveRideExperiment = (ScootersOnboardingOnActiveRideExperiment) obj;
                if (scootersOnboardingOnActiveRideExperiment.b) {
                    qwo0 qwo0Var = this.a;
                    if (((Number) qwo0Var.h.getValue(qwo0Var, qwo0.B[6])).intValue() <= scootersOnboardingOnActiveRideExperiment.c) {
                        jsq0 jsq0Var = scootersOnboardingOnActiveRideExperiment.d;
                        if ((zuo0Var instanceof lrj0) || (zuo0Var instanceof ea90)) {
                            contains = jsq0Var.contains(ScootersOnboardingOnActiveRideExperiment.Status.RESERVATION);
                        } else if (zuo0Var instanceof nrk0) {
                            contains = jsq0Var.contains(ScootersOnboardingOnActiveRideExperiment.Status.RIDING);
                        } else {
                            if (!(zuo0Var instanceof se90)) {
                                w511.b();
                                return null;
                            }
                            contains = jsq0Var.contains(ScootersOnboardingOnActiveRideExperiment.Status.PARKING);
                        }
                        if (contains) {
                            Iterator it = scootersOnboardingOnActiveRideExperiment.g.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Object next = it.next();
                                if (jl40.l(((ScootersOnboardingOnActiveRideExperiment.a) next).a, zuo0Var.e())) {
                                    obj2 = next;
                                    break;
                                }
                            }
                            ScootersOnboardingOnActiveRideExperiment.a aVar = (ScootersOnboardingOnActiveRideExperiment.a) obj2;
                            if (aVar == null || (str = aVar.b) == null) {
                                str = scootersOnboardingOnActiveRideExperiment.f;
                            }
                            if (str != null && str.length() != 0) {
                                return new k5o0(str);
                            }
                        }
                    }
                }
                return l5o0.a;
            }
        }
        scootersOnboardingOnActiveRideInteractor$whatToShow$1 = new ScootersOnboardingOnActiveRideInteractor$whatToShow$1(this, continuationImpl);
        Object obj3 = scootersOnboardingOnActiveRideInteractor$whatToShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnboardingOnActiveRideInteractor$whatToShow$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        scootersOnboardingOnActiveRideExperiment = (ScootersOnboardingOnActiveRideExperiment) obj3;
        if (scootersOnboardingOnActiveRideExperiment.b) {
        }
        return l5o0.a;
    }
}
