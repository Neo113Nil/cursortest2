package com.squareup.cash.money.booklet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class DisclosureSection implements MoneyTabBookletSection {
    public final String text;

    public DisclosureSection(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisclosureSection) && this.text.equals(((DisclosureSection) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureSection(text=", this.text, ")");
    }
}
