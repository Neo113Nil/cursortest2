package com.squareup.cash.charting.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class EarningsBarChartConfig {
    public final boolean animationEnabled;
    public final float effectiveHeight = 157.0f;
    public final boolean isPlaceholder;
    public final Function1 yAxisMaxValueGetter;
    public final Function1 yAxisValueFormatter;

    public EarningsBarChartConfig(Function1 function1, Function1 function12, boolean z, boolean z2) {
        this.yAxisValueFormatter = function1;
        this.yAxisMaxValueGetter = function12;
        this.isPlaceholder = z;
        this.animationEnabled = z2;
    }

    /* renamed from: copy-Y9O4PVA$default, reason: not valid java name */
    public static EarningsBarChartConfig m3457copyY9O4PVA$default(EarningsBarChartConfig earningsBarChartConfig, Function1 function1, Function1 function12, boolean z, boolean z2, int i) {
        earningsBarChartConfig.getClass();
        earningsBarChartConfig.getClass();
        earningsBarChartConfig.getClass();
        earningsBarChartConfig.getClass();
        if ((i & 16) != 0) {
            function1 = earningsBarChartConfig.yAxisValueFormatter;
        }
        if ((i & 32) != 0) {
            function12 = earningsBarChartConfig.yAxisMaxValueGetter;
        }
        if ((i & 64) != 0) {
            z = earningsBarChartConfig.isPlaceholder;
        }
        earningsBarChartConfig.getClass();
        function1.getClass();
        function12.getClass();
        return new EarningsBarChartConfig(function1, function12, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsBarChartConfig)) {
            return false;
        }
        EarningsBarChartConfig earningsBarChartConfig = (EarningsBarChartConfig) obj;
        return Dp.m1037equalsimpl0(163.0f, 163.0f) && Dp.m1037equalsimpl0(4.0f, 4.0f) && Dp.m1037equalsimpl0(3.0f, 3.0f) && Dp.m1037equalsimpl0(6.0f, 6.0f) && this.yAxisValueFormatter.equals(earningsBarChartConfig.yAxisValueFormatter) && this.yAxisMaxValueGetter.equals(earningsBarChartConfig.yAxisMaxValueGetter) && this.isPlaceholder == earningsBarChartConfig.isPlaceholder && this.animationEnabled == earningsBarChartConfig.animationEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animationEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(CameraState$Type$EnumUnboxingLocalUtility.m(6.0f, CameraState$Type$EnumUnboxingLocalUtility.m(3.0f, CameraState$Type$EnumUnboxingLocalUtility.m(4.0f, Float.hashCode(163.0f) * 31, 31), 31), 31), 31, this.yAxisValueFormatter), 31, this.yAxisMaxValueGetter), 31, this.isPlaceholder);
    }

    public final String toString() {
        String m1038toStringimpl = Dp.m1038toStringimpl(163.0f);
        String m1038toStringimpl2 = Dp.m1038toStringimpl(4.0f);
        String m1038toStringimpl3 = Dp.m1038toStringimpl(3.0f);
        String m1038toStringimpl4 = Dp.m1038toStringimpl(6.0f);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarningsBarChartConfig(chartHeight=", m1038toStringimpl, ", barSpacing=", m1038toStringimpl2, ", barRadius=");
        Boxes$$ExternalSyntheticOutline1.m(m, m1038toStringimpl3, ", barBaselineHeight=", m1038toStringimpl4, ", yAxisValueFormatter=");
        m.append(this.yAxisValueFormatter);
        m.append(", yAxisMaxValueGetter=");
        m.append(this.yAxisMaxValueGetter);
        m.append(", isPlaceholder=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.isPlaceholder, ", animationEnabled=", this.animationEnabled, ")");
    }
}
