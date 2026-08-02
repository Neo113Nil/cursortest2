package com.squareup.cash.arcade.components.button;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ButtonValues {
    public final ClipType clipType;
    public final float itemSpacing;
    public final long minSize;
    public final PaddingValues padding;
    public final TextStyle textStyle;

    public interface ClipType {

        public final class Pill implements ClipType {
            public static final Pill INSTANCE = new Pill();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Pill);
            }

            public final int hashCode() {
                return -72617869;
            }

            public final String toString() {
                return "Pill";
            }
        }

        /* loaded from: classes5.dex */
        public final class Rectangle implements ClipType {
            public static final Rectangle INSTANCE = new Rectangle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Rectangle);
            }

            public final int hashCode() {
                return -1499155851;
            }

            public final String toString() {
                return "Rectangle";
            }
        }

        /* loaded from: classes5.dex */
        public final class RoundedCorners implements ClipType {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RoundedCorners) && Dp.m1037equalsimpl0(4.0f, 4.0f);
            }

            public final int hashCode() {
                return Float.hashCode(4.0f);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RoundedCorners(radius=", Dp.m1038toStringimpl(4.0f), ")");
            }
        }
    }

    public ButtonValues(long j, float f, PaddingValues paddingValues, TextStyle textStyle, ClipType clipType) {
        this.minSize = j;
        this.itemSpacing = f;
        this.padding = paddingValues;
        this.textStyle = textStyle;
        this.clipType = clipType;
    }

    /* renamed from: copy-6-sb1mg$default, reason: not valid java name */
    public static ButtonValues m3387copy6sb1mg$default(ButtonValues buttonValues, TextStyle textStyle, int i) {
        long j = buttonValues.minSize;
        float f = (i & 2) != 0 ? buttonValues.itemSpacing : RecyclerView.DECELERATION_RATE;
        PaddingValues paddingValues = buttonValues.padding;
        if ((i & 8) != 0) {
            textStyle = buttonValues.textStyle;
        }
        return new ButtonValues(j, f, paddingValues, textStyle, buttonValues.clipType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonValues)) {
            return false;
        }
        ButtonValues buttonValues = (ButtonValues) obj;
        return DpSize.m1042equalsimpl0(this.minSize, buttonValues.minSize) && Dp.m1037equalsimpl0(this.itemSpacing, buttonValues.itemSpacing) && this.padding.equals(buttonValues.padding) && this.textStyle.equals(buttonValues.textStyle) && this.clipType.equals(buttonValues.clipType);
    }

    public final int hashCode() {
        return this.clipType.hashCode() + Recorder$$ExternalSyntheticOutline1.m(this.textStyle, (this.padding.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.itemSpacing, Long.hashCode(this.minSize) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ButtonValues(minSize=", DpSize.m1045toStringimpl(this.minSize), ", itemSpacing=", Dp.m1038toStringimpl(this.itemSpacing), ", padding=");
        m.append(this.padding);
        m.append(", textStyle=");
        m.append(this.textStyle);
        m.append(", clipType=");
        m.append(this.clipType);
        m.append(")");
        return m.toString();
    }
}
