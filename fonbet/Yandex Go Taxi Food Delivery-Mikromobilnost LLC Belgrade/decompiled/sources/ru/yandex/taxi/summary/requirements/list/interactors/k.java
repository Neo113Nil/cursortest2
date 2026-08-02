package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.fnx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        IntercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1 intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof IntercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1) {
            intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1 = (IntercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1) continuation;
            int i2 = intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    mi31 mi31Var = ((fnx0) obj).a;
                    intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.L$0 = null;
                    intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.L$1 = null;
                    intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.L$2 = null;
                    intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.L$3 = null;
                    intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mi31Var, intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1 = new IntercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityRequirementsContactInteractor$getTariffCardConfigFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
