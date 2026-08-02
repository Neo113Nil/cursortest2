package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import defpackage.dz8;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fnx0 b;

    public b(vpr vprVar, fnx0 fnx0Var) {
        this.a = vprVar;
        this.b = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1 unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1) {
            unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1 = (UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = this.b;
                    Map a = ((dz8) obj).a(fnx0Var.c.b, fnx0Var.d);
                    unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1 = new UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
