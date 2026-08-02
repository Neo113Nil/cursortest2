package com.squareup.cash.account.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.util.MathsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes9.dex */
public final class Sparkle {
    public final float alpha;
    public final float animationPercent;
    public final long color;
    public final boolean floatUp;
    public final float height;
    public final float initialHeight;
    public final float initialWidth;
    public final float initialX;
    public final float initialY;
    public final float lifespan;
    public final float width;
    public final float x;
    public final float y;

    public Sparkle(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, boolean z) {
        this.initialX = f;
        this.initialY = f2;
        this.initialWidth = f3;
        this.initialHeight = f4;
        this.color = j;
        this.alpha = f5;
        this.lifespan = f6;
        this.animationPercent = f7;
        this.floatUp = z;
        float min = MathsKt.min(f7, f6);
        double d = f6 / 2.0d;
        double d2 = min;
        float coerceIn = d2 >= d ? (float) RangesKt___RangesKt.coerceIn(d2 >= d ? 1.0d - ((d2 - d) / d) : d2 / d, 0.0d, 1.0d) : 1.0f;
        float f8 = f3 * coerceIn;
        this.width = f8;
        float f9 = coerceIn * f4;
        this.height = f9;
        float f10 = z ? (-(min / f6)) * 2.0f : 1.0f;
        this.x = f - (f8 / 2.0f);
        this.y = (f4 * f10) + (f2 - (f9 / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sparkle)) {
            return false;
        }
        Sparkle sparkle = (Sparkle) obj;
        return Float.compare(this.initialX, sparkle.initialX) == 0 && Float.compare(this.initialY, sparkle.initialY) == 0 && Float.compare(this.initialWidth, sparkle.initialWidth) == 0 && Float.compare(this.initialHeight, sparkle.initialHeight) == 0 && Color.m676equalsimpl0(this.color, sparkle.color) && Float.compare(this.alpha, sparkle.alpha) == 0 && Float.compare(this.lifespan, sparkle.lifespan) == 0 && Float.compare(this.animationPercent, sparkle.animationPercent) == 0 && this.floatUp == sparkle.floatUp;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.initialHeight, CameraState$Type$EnumUnboxingLocalUtility.m(this.initialWidth, CameraState$Type$EnumUnboxingLocalUtility.m(this.initialY, Float.hashCode(this.initialX) * 31, 31), 31), 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Boolean.hashCode(this.floatUp) + CameraState$Type$EnumUnboxingLocalUtility.m(this.animationPercent, CameraState$Type$EnumUnboxingLocalUtility.m(this.lifespan, CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, Recorder$$ExternalSyntheticOutline2.m(m, 31, this.color), 31), 31), 31);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.color);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Sparkle(initialX=", this.initialX, ", initialY=", this.initialY, ", initialWidth=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.initialWidth, ", initialHeight=", this.initialHeight, ", color=");
        m.append(m682toStringimpl);
        m.append(", alpha=");
        m.append(this.alpha);
        m.append(", lifespan=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.lifespan, ", animationPercent=", this.animationPercent, ", floatUp=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.floatUp, ")");
    }
}
