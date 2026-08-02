package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import defpackage.fnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qw11;
import defpackage.vfx0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "Lcz8;", "override", "Lzy11;", "<unused var>", "Lf6v;", "Lhmx0;", "<anonymous>", "(Ljava/util/Map;V)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.carousel.interactor.UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2", f = "UnavailableRequirementsCarouselItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2 extends SuspendLambda implements zls {
    final /* synthetic */ fnx0 $tariffSelection;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qw11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2(qw11 qw11Var, fnx0 fnx0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = qw11Var;
        this.$tariffSelection = fnx0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2 unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2 = new UnavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2(this.this$0, this.$tariffSelection, (Continuation) obj3);
        unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2.L$0 = (Map) obj;
        return unavailableRequirementsCarouselItemInteractor$requirementsOverridesFlow$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vfx0 vfx0Var = this.this$0.d;
        mi31 mi31Var = this.$tariffSelection.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(map, vfx0.b(mi31Var));
    }
}
