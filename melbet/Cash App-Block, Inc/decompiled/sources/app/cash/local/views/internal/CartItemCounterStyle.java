package app.cash.local.views.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class CartItemCounterStyle {
    public final long backgroundColor;
    public final long foregroundColor;
    public final long foregroundDisabledColor;
    public final float size;

    public CartItemCounterStyle(float f, long j, long j2, long j3) {
        this.size = f;
        this.foregroundColor = j;
        this.foregroundDisabledColor = j2;
        this.backgroundColor = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemCounterStyle)) {
            return false;
        }
        CartItemCounterStyle cartItemCounterStyle = (CartItemCounterStyle) obj;
        return Dp.m1037equalsimpl0(this.size, cartItemCounterStyle.size) && Color.m676equalsimpl0(this.foregroundColor, cartItemCounterStyle.foregroundColor) && Color.m676equalsimpl0(this.foregroundDisabledColor, cartItemCounterStyle.foregroundDisabledColor) && Color.m676equalsimpl0(this.backgroundColor, cartItemCounterStyle.backgroundColor);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.size) * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.backgroundColor) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.foregroundColor), 31, this.foregroundDisabledColor);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(this.size);
        String m682toStringimpl = Color.m682toStringimpl(this.foregroundColor);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartItemCounterStyle(size=", m1038toStringimpl, ", foregroundColor=", m682toStringimpl, ", foregroundDisabledColor="), Color.m682toStringimpl(this.foregroundDisabledColor), ", backgroundColor=", Color.m682toStringimpl(this.backgroundColor), ")");
    }
}
