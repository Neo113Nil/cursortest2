package com.squareup.cash.investing.components.stock.details;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;

/* loaded from: classes6.dex */
public final class SineWave {
    public final long color;

    public SineWave(long j) {
        this.color = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SineWave) {
            return Dp.m1037equalsimpl0(4.0f, 4.0f) && Dp.m1037equalsimpl0(125.0f, 125.0f) && Dp.m1037equalsimpl0(12.0f, 12.0f) && Color.m676equalsimpl0(this.color, ((SineWave) obj).color);
        }
        return false;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(12.0f, CameraState$Type$EnumUnboxingLocalUtility.m(125.0f, Float.hashCode(4.0f) * 31, 31), 31);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.color) + m;
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(4.0f);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(125.0f);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SineWave(width=", m1038toStringimpl, ", wavelength=", m1038toStringimpl2, ", amplitude="), Dp.m1038toStringimpl(12.0f), ", color=", Color.m682toStringimpl(this.color), ")");
    }
}
