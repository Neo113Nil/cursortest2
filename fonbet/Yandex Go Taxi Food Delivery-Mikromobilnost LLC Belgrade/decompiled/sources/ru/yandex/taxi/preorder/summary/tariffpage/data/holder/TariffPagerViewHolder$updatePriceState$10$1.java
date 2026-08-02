package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import defpackage.c1f0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z0f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.holder.TariffPagerViewHolder$updatePriceState$10$1", f = "TariffPagerViewHolder.kt", l = {312}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffPagerViewHolder$updatePriceState$10$1 extends SuspendLambda implements wls {
    final /* synthetic */ c1f0 $newState;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerViewHolder$updatePriceState$10$1(e eVar, c1f0 c1f0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$newState = c1f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffPagerViewHolder$updatePriceState$10$1(this.this$0, this.$newState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffPagerViewHolder$updatePriceState$10$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShimmeringRobotoTextView shimmeringRobotoTextView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            ShimmeringRobotoTextView shimmeringRobotoTextView2 = eVar.k0;
            ru.yandex.taxi.widget.c cVar = eVar.a0;
            FormattedText formattedText = ((z0f0) this.$newState).a;
            this.L$0 = shimmeringRobotoTextView2;
            this.label = 1;
            obj = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, this, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            shimmeringRobotoTextView = shimmeringRobotoTextView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            shimmeringRobotoTextView = (ShimmeringRobotoTextView) this.L$0;
            kotlin.b.b(obj);
        }
        shimmeringRobotoTextView.setText((CharSequence) obj);
        return zy11.a;
    }
}
