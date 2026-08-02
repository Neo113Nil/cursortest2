package ru.yandex.taxi.summary.promotions.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.u051;
import defpackage.vpr;
import defpackage.ykz0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ykz0 b;
    public final /* synthetic */ u051 c;

    public c(tpr tprVar, ykz0 ykz0Var, u051 u051Var) {
        this.a = tprVar;
        this.b = ykz0Var;
        this.c = u051Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TogglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1 togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TogglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1) {
            togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1 = (TogglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1) continuation;
            int i2 = togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.L$0 = null;
                    togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.L$1 = null;
                    togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.L$2 = null;
                    togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1 = new TogglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = togglePromotionInteractor$toggleCheckedFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
