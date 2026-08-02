package com.google.android.material.shape;

import android.graphics.RectF;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class RelativeCornerSize implements CornerSize {
    public final float percent;

    public RelativeCornerSize(float f) {
        this.percent = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float getCornerSize(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.percent;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((int) (this.percent * 100.0f), "%", new StringBuilder());
    }
}
