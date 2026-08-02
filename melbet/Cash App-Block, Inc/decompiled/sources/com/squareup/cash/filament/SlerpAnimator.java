package com.squareup.cash.filament;

import android.animation.ValueAnimator;
import androidx.transition.ChangeImageTransform;
import com.squareup.cash.graphics.backend.math.Quat;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class SlerpAnimator extends ValueAnimator {
    public SlerpAnimator(Quat... quatArr) {
        setObjectValues(Arrays.copyOf(quatArr, quatArr.length));
        setEvaluator(new ChangeImageTransform.AnonymousClass1(1));
    }
}
