package ru.yandex.taxi.requirements.interactor;

import defpackage.jl40;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.wiq0;
import defpackage.wu1;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ mi31 c;

    public c0(vpr vprVar, e0 e0Var, mi31 mi31Var) {
        this.a = vprVar;
        this.b = e0Var;
        this.c = mi31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1 requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1;
        int i;
        wiq0 wiq0Var = this.b.c;
        if (continuation instanceof RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1) {
            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1 = (RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1) continuation;
            int i2 = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                    if (m != null) {
                        String str = m.b;
                        String h = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).h();
                        wu1 wu1Var = m.O;
                        mi31 mi31Var = this.c;
                        boolean l = jl40.l(str, mi31Var.f);
                        boolean l2 = jl40.l(h, mi31Var.b);
                        boolean l3 = jl40.l(wu1Var, mi31Var.a.O);
                        if (l && l2 && l3) {
                            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.L$0 = null;
                            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.L$1 = null;
                            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.L$2 = null;
                            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.L$3 = null;
                            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
        requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1 = new RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
