package com.squareup.cash.card.onboarding;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class HeaderSection implements ProductDetailsPageSection {
    public final String title;

    public HeaderSection(String str) {
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeaderSection) && this.title.equals(((HeaderSection) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HeaderSection(title=", this.title, ")");
    }
}
