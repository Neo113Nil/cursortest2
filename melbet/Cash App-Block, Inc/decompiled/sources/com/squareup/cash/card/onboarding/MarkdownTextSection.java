package com.squareup.cash.card.onboarding;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class MarkdownTextSection implements ProductDetailsPageSection {
    public final String text;

    public MarkdownTextSection(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarkdownTextSection) && this.text.equals(((MarkdownTextSection) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MarkdownTextSection(text=", this.text, ")");
    }
}
