package com.squareup.cash.money.disclosure;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class DisclosureItemModel {
    public final String text;

    public DisclosureItemModel(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisclosureItemModel) && this.text.equals(((DisclosureItemModel) obj).text);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureItemModel(text=", this.text, ", showIcon=false)");
    }
}
