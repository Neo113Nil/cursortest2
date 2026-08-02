package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ThemeData {
    public final String buttonText;
    public final boolean locked;
    public final PaymentPadTheme theme;
    public final String url;

    public ThemeData(PaymentPadTheme paymentPadTheme, boolean z, String str, String str2) {
        paymentPadTheme.getClass();
        str.getClass();
        this.theme = paymentPadTheme;
        this.locked = z;
        this.buttonText = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeData)) {
            return false;
        }
        ThemeData themeData = (ThemeData) obj;
        return this.theme == themeData.theme && this.locked == themeData.locked && Intrinsics.areEqual(this.buttonText, themeData.buttonText) && Intrinsics.areEqual(this.url, themeData.url);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.theme.hashCode() * 31, 31, this.locked), 31, this.buttonText);
        String str = this.url;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeData(theme=");
        sb.append(this.theme);
        sb.append(", locked=");
        sb.append(this.locked);
        sb.append(", buttonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonText, ", url=", this.url, ")");
    }
}
