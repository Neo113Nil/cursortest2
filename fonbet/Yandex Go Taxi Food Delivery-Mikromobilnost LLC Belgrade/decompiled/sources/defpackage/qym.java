package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.widget.due_timetable.adapter.DueTimetableAvailableSlotView;

/* loaded from: classes6.dex */
public final /* synthetic */ class qym implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DueTimetableAvailableSlotView b;

    public /* synthetic */ qym(DueTimetableAvailableSlotView dueTimetableAvailableSlotView, int i) {
        this.a = i;
        this.b = dueTimetableAvailableSlotView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        DueTimetableAvailableSlotView dueTimetableAvailableSlotView = this.b;
        switch (i) {
            case 0:
                DueTimetableAvailableSlotView.animateBarValue$lambda$0$0(dueTimetableAvailableSlotView, valueAnimator);
                break;
            default:
                DueTimetableAvailableSlotView.animateBarSelection$lambda$0$0(dueTimetableAvailableSlotView, valueAnimator);
                break;
        }
    }
}
