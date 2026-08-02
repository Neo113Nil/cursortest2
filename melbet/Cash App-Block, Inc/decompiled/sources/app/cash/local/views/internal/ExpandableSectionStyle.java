package app.cash.local.views.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ExpandableSectionStyle {
    public final long borderColor;
    public final float borderRadius;
    public final float borderWidth;
    public final PaddingValues contentPadding;
    public final BiasAlignment.Vertical expansionIconAlignment;
    public final PaddingValues headerPadding;

    public ExpandableSectionStyle(long j, PaddingValuesImpl paddingValuesImpl, PaddingValuesImpl paddingValuesImpl2, int i) {
        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
        float f = (i & 1) != 0 ? 0.0f : 1.0f;
        j = (i & 2) != 0 ? Color.Transparent : j;
        float f2 = (i & 4) != 0 ? 0.0f : 8.0f;
        PaddingValues paddingValues = paddingValuesImpl;
        if ((i & 8) != 0) {
            PaddingValues.Companion.getClass();
            paddingValues = PaddingValues.Companion.Zero;
        }
        paddingValuesImpl2 = (i & 16) != 0 ? SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13) : paddingValuesImpl2;
        vertical = (i & 32) != 0 ? Alignment.Companion.CenterVertically : vertical;
        paddingValues.getClass();
        this.borderWidth = f;
        this.borderColor = j;
        this.borderRadius = f2;
        this.headerPadding = paddingValues;
        this.contentPadding = paddingValuesImpl2;
        this.expansionIconAlignment = vertical;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandableSectionStyle)) {
            return false;
        }
        ExpandableSectionStyle expandableSectionStyle = (ExpandableSectionStyle) obj;
        return Dp.m1037equalsimpl0(this.borderWidth, expandableSectionStyle.borderWidth) && Color.m676equalsimpl0(this.borderColor, expandableSectionStyle.borderColor) && Dp.m1037equalsimpl0(this.borderRadius, expandableSectionStyle.borderRadius) && Intrinsics.areEqual(this.headerPadding, expandableSectionStyle.headerPadding) && Intrinsics.areEqual(this.contentPadding, expandableSectionStyle.contentPadding) && Intrinsics.areEqual(this.expansionIconAlignment, expandableSectionStyle.expansionIconAlignment);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.borderWidth) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Float.hashCode(this.expansionIconAlignment.bias) + ((this.contentPadding.hashCode() + ((this.headerPadding.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.borderRadius, Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.borderColor), 31)) * 31)) * 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.borderWidth);
        String m682toStringimpl = Color.m682toStringimpl(this.borderColor);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(this.borderRadius);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExpandableSectionStyle(borderWidth=", m1038toStringimpl, ", borderColor=", m682toStringimpl, ", borderRadius=");
        m.append(m1038toStringimpl2);
        m.append(", headerPadding=");
        m.append(this.headerPadding);
        m.append(", contentPadding=");
        m.append(this.contentPadding);
        m.append(", expansionIconAlignment=");
        m.append(this.expansionIconAlignment);
        m.append(")");
        return m.toString();
    }
}
