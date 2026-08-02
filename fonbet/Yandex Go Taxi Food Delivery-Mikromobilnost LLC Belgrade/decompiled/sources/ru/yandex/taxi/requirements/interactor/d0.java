package ru.yandex.taxi.requirements.interactor;

import defpackage.ha2;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d0 implements tpr {
    public final /* synthetic */ ha2 a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ mi31 c;

    public d0(ha2 ha2Var, e0 e0Var, mi31 mi31Var) {
        this.a = ha2Var;
        this.b = e0Var;
        this.c = mi31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1 requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1;
        int i;
        if (continuation instanceof RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1) {
            requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1 = (RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1) continuation;
            int i2 = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c0 c0Var = new c0(vprVar, this.b, this.c);
                    requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.L$0 = null;
                    requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.L$1 = null;
                    requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.L$2 = null;
                    requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(c0Var, requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1) == coroutineSingletons) {
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
        requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1 = new RequirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1(this, continuation);
        Object obj2 = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsInteractor$selectedTariffEqualsFilter$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
