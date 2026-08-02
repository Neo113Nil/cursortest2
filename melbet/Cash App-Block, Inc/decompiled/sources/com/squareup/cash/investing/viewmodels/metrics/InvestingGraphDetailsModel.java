package com.squareup.cash.investing.viewmodels.metrics;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InvestingGraphDetailsModel {
    public final String actual;
    public final String expected;
    public final MetricsColorType labelColorType;
    public final String quarter;
    public final boolean showQuarter;
    public final String year;

    public InvestingGraphDetailsModel(boolean z, String str, String str2, MetricsColorType metricsColorType, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.showQuarter = z;
        this.quarter = str;
        this.year = str2;
        this.labelColorType = metricsColorType;
        this.expected = str3;
        this.actual = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingGraphDetailsModel)) {
            return false;
        }
        InvestingGraphDetailsModel investingGraphDetailsModel = (InvestingGraphDetailsModel) obj;
        return this.showQuarter == investingGraphDetailsModel.showQuarter && Intrinsics.areEqual(this.quarter, investingGraphDetailsModel.quarter) && Intrinsics.areEqual(this.year, investingGraphDetailsModel.year) && this.labelColorType == investingGraphDetailsModel.labelColorType && Intrinsics.areEqual(this.expected, investingGraphDetailsModel.expected) && Intrinsics.areEqual(this.actual, investingGraphDetailsModel.actual);
    }

    public final int hashCode() {
        return this.actual.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.labelColorType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showQuarter) * 31, 31, this.quarter), 31, this.year)) * 31, 31, this.expected);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("InvestingGraphDetailsModel(showQuarter=", ", quarter=", this.quarter, ", year=", this.showQuarter);
        m.append(this.year);
        m.append(", labelColorType=");
        m.append(this.labelColorType);
        m.append(", expected=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.expected, ", actual=", this.actual, ")");
    }
}
