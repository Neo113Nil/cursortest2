package ru.yandex.taxi.widget.timeline;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.widget.timeline.TimelineItemView", f = "TimelineItemView.kt", l = {298}, m = "setLottieAnimationForCurrentItem", v = 2)
/* loaded from: classes6.dex */
public final class TimelineItemView$setLottieAnimationForCurrentItem$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TimelineItemView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineItemView$setLottieAnimationForCurrentItem$1(TimelineItemView timelineItemView, Continuation continuation) {
        super(continuation);
        this.this$0 = timelineItemView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lottieAnimationForCurrentItem;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lottieAnimationForCurrentItem = this.this$0.setLottieAnimationForCurrentItem(null, null, this);
        return lottieAnimationForCurrentItem;
    }
}
