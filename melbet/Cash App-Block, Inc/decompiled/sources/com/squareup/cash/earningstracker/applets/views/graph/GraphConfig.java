package com.squareup.cash.earningstracker.applets.views.graph;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class GraphConfig {
    public final float effectiveHeight = 18.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GraphConfig) && Dp.m1037equalsimpl0(24.0f, 24.0f) && Dp.m1037equalsimpl0(4.0f, 4.0f) && Dp.m1037equalsimpl0(3.0f, 3.0f) && Dp.m1037equalsimpl0(6.0f, 6.0f);
    }

    public final int hashCode() {
        return Float.hashCode(6.0f) + CameraState$Type$EnumUnboxingLocalUtility.m(3.0f, CameraState$Type$EnumUnboxingLocalUtility.m(4.0f, Float.hashCode(24.0f) * 31, 31), 31);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(24.0f);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(4.0f);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GraphConfig(graphHeight=", m1038toStringimpl, ", barSpacing=", m1038toStringimpl2, ", barRadius="), Dp.m1038toStringimpl(3.0f), ", barBaselineHeight=", Dp.m1038toStringimpl(6.0f), ")");
    }
}
