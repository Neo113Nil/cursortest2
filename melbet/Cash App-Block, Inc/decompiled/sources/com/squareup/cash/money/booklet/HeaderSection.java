package com.squareup.cash.money.booklet;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class HeaderSection implements MoneyTabBookletSection {
    public final boolean isLarge;
    public final String title;

    public HeaderSection(String str, boolean z) {
        this.title = str;
        this.isLarge = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderSection)) {
            return false;
        }
        HeaderSection headerSection = (HeaderSection) obj;
        return this.title.equals(headerSection.title) && this.isLarge == headerSection.isLarge;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isLarge) + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("HeaderSection(title=", this.title, ", isLarge=", ")", this.isLarge);
    }
}
