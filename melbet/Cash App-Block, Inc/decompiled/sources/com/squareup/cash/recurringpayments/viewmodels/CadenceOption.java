package com.squareup.cash.recurringpayments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CadenceOption {
    public final String cadenceToken;
    public final String title;

    public CadenceOption(String str, String str2) {
        str2.getClass();
        this.title = str;
        this.cadenceToken = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CadenceOption)) {
            return false;
        }
        CadenceOption cadenceOption = (CadenceOption) obj;
        return this.title.equals(cadenceOption.title) && Intrinsics.areEqual(this.cadenceToken, cadenceOption.cadenceToken);
    }

    public final int hashCode() {
        return this.cadenceToken.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CadenceOption(title=", this.title, ", cadenceToken=", this.cadenceToken, ")");
    }
}
