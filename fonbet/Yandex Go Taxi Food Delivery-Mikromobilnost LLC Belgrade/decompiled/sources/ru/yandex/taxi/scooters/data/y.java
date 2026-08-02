package ru.yandex.taxi.scooters.data;

import defpackage.d6z;
import defpackage.hto0;
import defpackage.ito0;
import defpackage.jbh;
import defpackage.lto0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class y implements ru.yandex.taxi.experiments.q {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ ru.yandex.taxi.experiments.q a;
    public final ito0 b;

    public y(rqo rqoVar, ito0 ito0Var) {
        hto0.Companion.getClass();
        this.a = ((jbh) rqoVar).d(hto0.f);
        this.b = ito0Var;
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
        return (hto0) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1 scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1) {
            scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1 = (ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1) continuationImpl;
            int i2 = scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.label = 1;
                    obj = this.a.b(scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1);
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
                hto0 hto0Var = (hto0) obj;
                z = hto0Var.b;
                hto0.a aVar = hto0Var.d;
                if ((!z ? this.b : null) == null) {
                    return new lto0(d6z.Y(hto0Var, aVar.a), d6z.Y(hto0Var, aVar.b));
                }
                return null;
            }
        }
        scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1 = new ScootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1(this, continuationImpl);
        Object obj2 = scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRiskyParkingExperimentRepository$getRiskyParkingMessage$1.label;
        if (i != 0) {
        }
        hto0 hto0Var2 = (hto0) obj2;
        z = hto0Var2.b;
        hto0.a aVar2 = hto0Var2.d;
        if ((!z ? this.b : null) == null) {
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
