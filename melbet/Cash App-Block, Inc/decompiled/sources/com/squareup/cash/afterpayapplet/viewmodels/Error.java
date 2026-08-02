package com.squareup.cash.afterpayapplet.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Error implements AfterpayAppletHomeViewModel {
    public final String buttonText;
    public final String screenTitle;
    public final String subtitleText;
    public final String titleText;

    public Error(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.screenTitle = str;
        this.titleText = str2;
        this.subtitleText = str3;
        this.buttonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return Intrinsics.areEqual(this.screenTitle, error.screenTitle) && Intrinsics.areEqual(this.titleText, error.titleText) && Intrinsics.areEqual(this.subtitleText, error.subtitleText) && Intrinsics.areEqual(this.buttonText, error.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.screenTitle.hashCode() * 31, 31, this.titleText), 31, this.subtitleText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(screenTitle=", this.screenTitle, ", titleText=", this.titleText, ", subtitleText="), this.subtitleText, ", buttonText=", this.buttonText, ")");
    }
}
