package com.airbnb.lottie.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ScaleFactor;
import com.squareup.util.cash.Countries;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u001a\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"lottieSize", "Landroidx/compose/ui/Modifier;", "width", "", "height", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationSizeNodeKt {
    public static final Modifier lottieSize(Modifier modifier, int i, int i2) {
        modifier.getClass();
        return modifier.then(new LottieAnimationSizeElement(i, i2));
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    private static final long m1495timesUQTWf7w(long j, long j2) {
        return Countries.IntSize((int) (ScaleFactor.m857getScaleXimpl(j2) * Size.m643getWidthimpl(j)), (int) (ScaleFactor.m858getScaleYimpl(j2) * Size.m640getHeightimpl(j)));
    }
}
