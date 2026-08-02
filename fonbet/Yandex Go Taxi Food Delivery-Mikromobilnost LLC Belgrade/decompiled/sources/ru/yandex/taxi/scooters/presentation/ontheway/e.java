package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ n a;
    public final /* synthetic */ zuo0 b;

    public e(n nVar, zuo0 zuo0Var) {
        this.a = nVar;
        this.b = zuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1 scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof ScootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1) {
            scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1 = (ScootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1) continuation;
            int i2 = scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.L$0 = null;
                    scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.L$1 = null;
                    scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.L$2 = null;
                    scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(dVar, scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1 = new ScootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnTheWayPresenter$processOneShotAction$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
