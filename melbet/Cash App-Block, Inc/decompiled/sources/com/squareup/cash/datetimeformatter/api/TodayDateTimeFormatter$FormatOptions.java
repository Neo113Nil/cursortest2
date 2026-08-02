package com.squareup.cash.datetimeformatter.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TodayDateTimeFormatter$FormatOptions {
    public final boolean alwaysShowYear;
    public final boolean formatTomorrow;
    public final boolean formatYesterday;
    public final String prefixOtherDays;
    public final String prefixToday;
    public final boolean showTime;
    public final String substituteToday;

    public TodayDateTimeFormatter$FormatOptions(int i, String str, String str2, String str3, boolean z, boolean z2) {
        str = (i & 1) != 0 ? null : str;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        str2 = (i & 8) != 0 ? null : str2;
        str3 = (i & 16) != 0 ? null : str3;
        boolean z3 = (i & 32) == 0;
        boolean z4 = (i & 64) == 0;
        this.substituteToday = str;
        this.showTime = z;
        this.alwaysShowYear = z2;
        this.prefixToday = str2;
        this.prefixOtherDays = str3;
        this.formatYesterday = z3;
        this.formatTomorrow = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodayDateTimeFormatter$FormatOptions)) {
            return false;
        }
        TodayDateTimeFormatter$FormatOptions todayDateTimeFormatter$FormatOptions = (TodayDateTimeFormatter$FormatOptions) obj;
        return Intrinsics.areEqual(this.substituteToday, todayDateTimeFormatter$FormatOptions.substituteToday) && this.showTime == todayDateTimeFormatter$FormatOptions.showTime && this.alwaysShowYear == todayDateTimeFormatter$FormatOptions.alwaysShowYear && Intrinsics.areEqual(this.prefixToday, todayDateTimeFormatter$FormatOptions.prefixToday) && Intrinsics.areEqual(this.prefixOtherDays, todayDateTimeFormatter$FormatOptions.prefixOtherDays) && this.formatYesterday == todayDateTimeFormatter$FormatOptions.formatYesterday && this.formatTomorrow == todayDateTimeFormatter$FormatOptions.formatTomorrow;
    }

    public final int hashCode() {
        String str = this.substituteToday;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.showTime), 31, this.alwaysShowYear);
        String str2 = this.prefixToday;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prefixOtherDays;
        return Boolean.hashCode(this.formatTomorrow) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.formatYesterday);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("FormatOptions(substituteToday=", this.substituteToday, ", showTime=", ", alwaysShowYear=", this.showTime);
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.alwaysShowYear, ", prefixToday=", this.prefixToday, ", prefixOtherDays=");
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.prefixOtherDays, ", formatYesterday=", this.formatYesterday, ", formatTomorrow=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.formatTomorrow, ")");
    }
}
