package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m0 implements tpr {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ p0 b;

    public m0(i0 i0Var, p0 p0Var) {
        this.a = i0Var;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1 trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1) {
            trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1 = (TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1) continuation;
            int i2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 l0Var = new l0(vprVar, this.b);
                    trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.L$0 = null;
                    trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.L$1 = null;
                    trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.L$2 = null;
                    trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(l0Var, trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1 = new TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
