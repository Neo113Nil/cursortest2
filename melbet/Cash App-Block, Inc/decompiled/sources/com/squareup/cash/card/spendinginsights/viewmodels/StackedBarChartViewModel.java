package com.squareup.cash.card.spendinginsights.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StackedBarChartViewModel {
    public final Color barColor;
    public final ArrayList bars;
    public final Color textColor;

    public final class Bar {
        public final String accessibilityLabel;
        public final StackedBarChartViewEvent$BarTapped action;
        public final StackedBarChartViewModel$Bar$BarImage$Avatar image;
        public final String label;
        public final float value;
        public final String valueText;

        public Bar(StackedBarChartViewModel$Bar$BarImage$Avatar stackedBarChartViewModel$Bar$BarImage$Avatar, String str, String str2, float f, StackedBarChartViewEvent$BarTapped stackedBarChartViewEvent$BarTapped, String str3) {
            this.image = stackedBarChartViewModel$Bar$BarImage$Avatar;
            this.label = str;
            this.valueText = str2;
            this.value = f;
            this.action = stackedBarChartViewEvent$BarTapped;
            this.accessibilityLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) obj;
            return this.image.equals(bar.image) && this.label.equals(bar.label) && this.valueText.equals(bar.valueText) && Float.compare(this.value, bar.value) == 0 && this.action.equals(bar.action) && this.accessibilityLabel.equals(bar.accessibilityLabel);
        }

        public final int hashCode() {
            return this.accessibilityLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.value, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.label), 31, this.valueText), 31), 31, this.action.clientRoute);
        }

        public final String toString() {
            return "Bar(image=" + this.image + ", label=" + this.label + ", valueText=" + this.valueText + ", value=" + this.value + ", action=" + this.action + ", accessibilityLabel=" + this.accessibilityLabel + ")";
        }
    }

    public StackedBarChartViewModel(ArrayList arrayList, Color color, Color color2) {
        color.getClass();
        color2.getClass();
        this.bars = arrayList;
        this.barColor = color;
        this.textColor = color2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackedBarChartViewModel)) {
            return false;
        }
        StackedBarChartViewModel stackedBarChartViewModel = (StackedBarChartViewModel) obj;
        return this.bars.equals(stackedBarChartViewModel.bars) && Intrinsics.areEqual(this.barColor, stackedBarChartViewModel.barColor) && Intrinsics.areEqual(this.textColor, stackedBarChartViewModel.textColor);
    }

    public final int hashCode() {
        return this.textColor.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.barColor, this.bars.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StackedBarChartViewModel(bars=" + this.bars + ", barColor=" + this.barColor + ", textColor=" + this.textColor + ")";
    }
}
