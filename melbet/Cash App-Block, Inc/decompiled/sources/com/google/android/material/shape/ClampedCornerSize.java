package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ClampedCornerSize implements CornerSize {
    public final float target;

    public ClampedCornerSize(float f) {
        this.target = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.target == ((ClampedCornerSize) obj).target;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float getCornerSize(RectF rectF) {
        return MathUtils.clamp(this.target, RecyclerView.DECELERATION_RATE, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.target)});
    }
}
