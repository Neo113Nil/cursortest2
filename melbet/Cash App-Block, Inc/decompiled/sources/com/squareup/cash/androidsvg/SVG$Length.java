package com.squareup.cash.androidsvg;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class SVG$Length implements Cloneable {
    public int unit;
    public float value;

    public final float floatValue$1() {
        float f;
        float f2;
        float f3 = this.value;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.unit);
        if (ordinal == 0) {
            return f3;
        }
        if (ordinal == 3) {
            return f3 * 96.0f;
        }
        if (ordinal == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (ordinal == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (ordinal == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (ordinal != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
        float f = this.value;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.unit);
        return ordinal != 0 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? f : (f * sVGAndroidRenderer.dpi) / 6.0f : (f * sVGAndroidRenderer.dpi) / 72.0f : (f * sVGAndroidRenderer.dpi) / 25.4f : (f * sVGAndroidRenderer.dpi) / 2.54f : f * sVGAndroidRenderer.dpi : f;
    }

    public final boolean isNegative() {
        return this.value < RecyclerView.DECELERATION_RATE;
    }

    public final boolean isZero() {
        return this.value == RecyclerView.DECELERATION_RATE;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.value));
        switch (this.unit) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
