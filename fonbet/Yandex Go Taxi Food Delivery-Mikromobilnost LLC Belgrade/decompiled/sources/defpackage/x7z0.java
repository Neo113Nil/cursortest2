package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.feed.global.div.custom.time_slot_histogram.TimeSlotHistogramSlotView;

/* loaded from: classes6.dex */
public final /* synthetic */ class x7z0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TimeSlotHistogramSlotView b;

    public /* synthetic */ x7z0(TimeSlotHistogramSlotView timeSlotHistogramSlotView, int i) {
        this.a = i;
        this.b = timeSlotHistogramSlotView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        TimeSlotHistogramSlotView timeSlotHistogramSlotView = this.b;
        switch (i) {
            case 0:
                TimeSlotHistogramSlotView.animateBarValue$lambda$0$0(timeSlotHistogramSlotView, valueAnimator);
                break;
            default:
                TimeSlotHistogramSlotView.animateBarSelection$lambda$0$0(timeSlotHistogramSlotView, valueAnimator);
                break;
        }
    }
}
