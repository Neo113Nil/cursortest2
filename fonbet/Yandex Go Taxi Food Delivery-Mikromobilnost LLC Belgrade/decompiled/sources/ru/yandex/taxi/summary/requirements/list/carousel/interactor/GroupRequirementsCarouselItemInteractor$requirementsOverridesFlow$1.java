package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import defpackage.dz8;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfnx0;", "tariffSelection", "Ldz8;", "carouselOverride", "", "", "Lcz8;", "<anonymous>", "(Lfnx0;Ldz8;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.carousel.interactor.GroupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1", f = "GroupRequirementsCarouselItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GroupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GroupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1 groupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1 = new GroupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1(3, (Continuation) obj3);
        groupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1.L$0 = (fnx0) obj;
        groupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1.L$1 = (dz8) obj2;
        return groupRequirementsCarouselItemInteractor$requirementsOverridesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        dz8 dz8Var = (dz8) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return dz8Var.a(fnx0Var.c.b, fnx0Var.d);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
