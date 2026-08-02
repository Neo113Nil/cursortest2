package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.iox0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e0 implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ iox0 b;

    public e0(mth mthVar, iox0 iox0Var) {
        this.a = mthVar;
        this.b = iox0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1 tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1) {
            tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1 = (TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1) continuation;
            int i2 = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d0 d0Var = new d0(vprVar, this.b);
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.L$0 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.L$1 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.L$2 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.label = 1;
                    if (this.a.collect(d0Var, tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1 = new TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
