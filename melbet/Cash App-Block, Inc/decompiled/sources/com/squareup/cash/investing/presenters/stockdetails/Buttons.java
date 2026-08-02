package com.squareup.cash.investing.presenters.stockdetails;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Buttons {
    public final String firstButtonLabel;
    public final String secondButtonLabel;

    public Buttons(String str, String str2) {
        this.firstButtonLabel = str;
        this.secondButtonLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Buttons)) {
            return false;
        }
        Buttons buttons = (Buttons) obj;
        return Intrinsics.areEqual(this.firstButtonLabel, buttons.firstButtonLabel) && Intrinsics.areEqual(this.secondButtonLabel, buttons.secondButtonLabel);
    }

    public final int hashCode() {
        String str = this.firstButtonLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondButtonLabel;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Buttons(firstButtonLabel=", this.firstButtonLabel, ", secondButtonLabel=", this.secondButtonLabel, ")");
    }
}
