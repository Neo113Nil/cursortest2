package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class l0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public l0(vpr vprVar, p0 p0Var) {
        this.a = vprVar;
        this.b = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1 trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1) {
            trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1 = (TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p0 p0Var = this.b;
                    za31 e = p0Var.d.e(((com.yandex.go.taxi.tariffs.internal.repository.k) p0Var.a).h());
                    if (e != null) {
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.L$0 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.L$1 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.L$2 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.L$3 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.L$4 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(e, trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1 = new TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
