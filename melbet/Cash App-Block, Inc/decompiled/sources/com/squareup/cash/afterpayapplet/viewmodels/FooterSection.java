package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class FooterSection {
    public final String iconId;
    public final String text;

    public FooterSection(String str, String str2) {
        this.text = str;
        this.iconId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterSection)) {
            return false;
        }
        FooterSection footerSection = (FooterSection) obj;
        return Intrinsics.areEqual(this.text, footerSection.text) && Intrinsics.areEqual(this.iconId, footerSection.iconId);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("FooterSection(text=", this.text, ", iconId=", this.iconId, ")");
    }
}
