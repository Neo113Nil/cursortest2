package com.squareup.cash.banking;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Disclosure {
    public final boolean showIcon;
    public final String text;

    public Disclosure(String str, boolean z) {
        this.text = str;
        this.showIcon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Disclosure)) {
            return false;
        }
        Disclosure disclosure = (Disclosure) obj;
        return Intrinsics.areEqual(this.text, disclosure.text) && this.showIcon == disclosure.showIcon;
    }

    public final int hashCode() {
        String str = this.text;
        return Boolean.hashCode(this.showIcon) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("Disclosure(text=", this.text, ", showIcon=", ")", this.showIcon);
    }
}
