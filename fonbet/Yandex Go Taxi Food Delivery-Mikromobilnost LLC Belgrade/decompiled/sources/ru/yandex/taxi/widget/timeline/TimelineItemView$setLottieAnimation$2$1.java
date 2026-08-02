package ru.yandex.taxi.widget.timeline;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widget.timeline.TimelineItemView$setLottieAnimation$2$1", f = "TimelineItemView.kt", l = {284}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class TimelineItemView$setLottieAnimation$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $lottieAnimationUrl;
    final /* synthetic */ ytz $lottieLoader;
    int label;
    final /* synthetic */ TimelineItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineItemView$setLottieAnimation$2$1(TimelineItemView timelineItemView, String str, ytz ytzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = timelineItemView;
        this.$lottieAnimationUrl = str;
        this.$lottieLoader = ytzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimelineItemView$setLottieAnimation$2$1(this.this$0, this.$lottieAnimationUrl, this.$lottieLoader, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TimelineItemView$setLottieAnimation$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lottieAnimationForCurrentItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TimelineItemView timelineItemView = this.this$0;
            String str = this.$lottieAnimationUrl;
            ytz ytzVar = this.$lottieLoader;
            this.label = 1;
            lottieAnimationForCurrentItem = timelineItemView.setLottieAnimationForCurrentItem(str, ytzVar, this);
            if (lottieAnimationForCurrentItem == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
