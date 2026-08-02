package ru.yandex.taxi.preorder.summary.tariffpage.interactors;

import defpackage.i890;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1 tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1) {
            tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1 = (TariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    i890 i890Var = (i890) rsnVar.a;
                    i890 i890Var2 = (i890) rsnVar.b;
                    if (i890Var != null) {
                        String str = i890Var.b;
                        String str2 = i890Var2.b;
                        String str3 = i890Var2.c;
                        if (jl40.l(str, str2) && jl40.l(i890Var.c, str3) && i890Var.d == i890Var2.d) {
                            i890Var2 = new i890(-1, i890Var2.b, str3, i890Var2.a);
                        }
                    }
                    tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(i890Var2, tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1 = new TariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPagerDataInteractor$dataFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
