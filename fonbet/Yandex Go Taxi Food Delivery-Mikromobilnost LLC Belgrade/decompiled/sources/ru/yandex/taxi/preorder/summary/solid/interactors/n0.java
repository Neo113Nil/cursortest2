package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.c8r;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p0 b;

    public n0(vpr vprVar, p0 p0Var) {
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
        TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1 trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1;
        int i;
        mi31 mi31Var;
        if (continuation instanceof TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1) {
            trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1 = (TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1) continuation;
            int i2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p0 p0Var = this.b;
                    fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) p0Var.a).n();
                    if (n != null) {
                        c8r c8rVar = p0Var.e;
                        mi31 mi31Var2 = n.a;
                        List list = ((com.yandex.go.taxi.tariffs.internal.repository.k) p0Var.f).j().a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!((za31) obj3).a.o) {
                                arrayList.add(obj3);
                            }
                        }
                        mi31Var = c8rVar.b.d(arrayList, mi31Var2, false);
                    } else {
                        mi31Var = null;
                    }
                    if (mi31Var != null) {
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.L$0 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.L$1 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.L$2 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.L$3 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.L$4 = null;
                        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.label = 1;
                        if (this.a.emit(mi31Var, trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1) == coroutineSingletons) {
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
        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1 = new TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1(this, continuation);
        Object obj22 = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$$inlined$mapNotNull$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
