package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes14.dex */
public interface sg2 {
    ValueAnimator a(View view);

    ValueAnimator b(View view, uo31 uo31Var);

    default void c(ValueAnimator valueAnimator, long j) {
        valueAnimator.setDuration(j);
    }
}
