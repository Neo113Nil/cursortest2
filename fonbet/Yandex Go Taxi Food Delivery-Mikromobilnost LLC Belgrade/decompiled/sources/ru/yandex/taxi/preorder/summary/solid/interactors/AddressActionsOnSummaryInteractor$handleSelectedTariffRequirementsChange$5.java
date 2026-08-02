package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.f8u;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd60;
import defpackage.wls;
import defpackage.xxd;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "selectedRequirements", "Lzy11;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5", f = "AddressActionsOnSummaryInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5 addressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5 = new AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5(this.this$0, continuation);
        addressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5.L$0 = obj;
        return addressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5 addressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5 = (AddressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5) create((Map) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressActionsOnSummaryInteractor$handleSelectedTariffRequirementsChange$5.invokeSuspend(zy11Var);
        return zy11Var;
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
        ru.yandex.taxi.preorder.source.domain.a aVar = this.this$0.c;
        sd60 sd60Var = new sd60(map == null ? kotlin.collections.b.f() : map);
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        aVar.f(j73.f0(new xxd[]{sd60Var, new f8u(map)}));
        return zy11.a;
    }
}
