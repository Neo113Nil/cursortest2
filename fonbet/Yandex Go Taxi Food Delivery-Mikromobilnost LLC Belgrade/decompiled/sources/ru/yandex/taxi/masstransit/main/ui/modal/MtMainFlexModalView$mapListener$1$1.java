package ru.yandex.taxi.masstransit.main.ui.modal;

import defpackage.do30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView$mapListener$1$1", f = "MtMainFlexModalView.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtMainFlexModalView$mapListener$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ MtMainFlexModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtMainFlexModalView$mapListener$1$1(MtMainFlexModalView mtMainFlexModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mtMainFlexModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtMainFlexModalView$mapListener$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtMainFlexModalView$mapListener$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.minimized = false;
        MtMainFlexModalView mtMainFlexModalView = this.this$0;
        mtMainFlexModalView.setBehaviorAnchorHeight(new Integer(mtMainFlexModalView.getMaxAnchoredHeight()));
        MtMainFlexModalView mtMainFlexModalView2 = this.this$0;
        i = mtMainFlexModalView2.behaviorLastState;
        mtMainFlexModalView2.setBehaviorState(i);
        MtMainFlexModalView mtMainFlexModalView3 = this.this$0;
        mtMainFlexModalView3.post(new do30(mtMainFlexModalView3, 6));
        return zy11.a;
    }
}
