package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import com.yandex.go.taxi.summary.shared.requirement.BubbleInfoHolder$bubblesFlow$$inlined$flatMapLatest$1;
import defpackage.mq5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vm6;
import defpackage.wkx0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.holder.TariffPagerViewHolder$onViewAttached$4$1", f = "TariffPagerViewHolder.kt", l = {212}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffPagerViewHolder$onViewAttached$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ RequirementsBubblesContainer $bubblesContainer;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerViewHolder$onViewAttached$4$1(e eVar, RequirementsBubblesContainer requirementsBubblesContainer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$bubblesContainer = requirementsBubblesContainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffPagerViewHolder$onViewAttached$4$1(this.this$0, this.$bubblesContainer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffPagerViewHolder$onViewAttached$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            vm6 vm6Var = eVar.R;
            com.yandex.go.taxi.summary.shared.expanded.repository.c cVar = eVar.Q;
            vm6Var.getClass();
            tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.summary.shared.requirement.b(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.s(new com.yandex.go.taxi.summary.shared.expanded.repository.b(cVar.c), new mq5(2)), new BubbleInfoHolder$bubblesFlow$$inlined$flatMapLatest$1(null, vm6Var))));
            vm6Var.a.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            wkx0 wkx0Var = new wkx0(this.$bubblesContainer, 0);
            this.label = 1;
            if (F.collect(wkx0Var, this) == coroutineSingletons) {
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
