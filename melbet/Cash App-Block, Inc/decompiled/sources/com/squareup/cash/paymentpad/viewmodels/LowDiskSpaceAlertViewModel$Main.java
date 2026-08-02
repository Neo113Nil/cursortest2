package com.squareup.cash.paymentpad.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LowDiskSpaceAlertViewModel$Main {
    public final String message;
    public final String negativeButtonText;
    public final String positiveButtonText;
    public final String title;

    public LowDiskSpaceAlertViewModel$Main(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str3, str4);
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LowDiskSpaceAlertViewModel$Main)) {
            return false;
        }
        LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main = (LowDiskSpaceAlertViewModel$Main) obj;
        return Intrinsics.areEqual(this.title, lowDiskSpaceAlertViewModel$Main.title) && this.message.equals(lowDiskSpaceAlertViewModel$Main.message) && Intrinsics.areEqual(this.positiveButtonText, lowDiskSpaceAlertViewModel$Main.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, lowDiskSpaceAlertViewModel$Main.negativeButtonText);
    }

    public final int hashCode() {
        return this.negativeButtonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.positiveButtonText);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Main(title=", this.title, ", message=", this.message, ", positiveButtonText="), this.positiveButtonText, ", negativeButtonText=", this.negativeButtonText, ")");
    }
}
