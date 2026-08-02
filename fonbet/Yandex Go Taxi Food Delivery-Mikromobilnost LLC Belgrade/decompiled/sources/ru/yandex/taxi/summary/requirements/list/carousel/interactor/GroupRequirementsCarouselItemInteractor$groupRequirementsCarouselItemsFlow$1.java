package ru.yandex.taxi.summary.requirements.list.carousel.interactor;

import defpackage.cxu0;
import defpackage.dms;
import defpackage.f6v;
import defpackage.fy8;
import defpackage.h6v;
import defpackage.lx8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ygj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lf6v;", "Lhmx0;", "Lygj0;", "groupInfoIdentifiable", "Lcxu0;", "style", "Lzy11;", "<unused var>", "", "", "Lcz8;", "requirementsOverrides", "Lfy8;", "<anonymous>", "(Lru/yandex/taxi/requirements/utils/Identifiable;Lru/yandex/taxi/styling/Style;VLjava/util/Map;)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.carousel.interactor.GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1", f = "GroupRequirementsCarouselItemInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1 groupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1 = new GroupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1(this.this$0, (Continuation) obj5);
        groupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1.L$0 = (f6v) obj;
        groupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1.L$1 = (cxu0) obj2;
        groupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1.L$2 = (Map) obj4;
        return groupRequirementsCarouselItemInteractor$groupRequirementsCarouselItemsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f6v f6vVar = (f6v) this.L$0;
        cxu0 cxu0Var = (cxu0) this.L$1;
        Map map = (Map) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Object obj2 = f6vVar.b;
        h6v h6vVar = f6vVar.a;
        List list = ((ygj0) obj2).b;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof lx8) {
                arrayList.add(obj3);
            }
        }
        lx8 lx8Var = (lx8) kotlin.collections.a.R(arrayList);
        return lx8Var == null ? new f6v(h6vVar, null) : new f6v(h6vVar, new fy8(lx8Var.a, this.this$0.a.f(lx8Var.b, map, cxu0Var)));
    }
}
