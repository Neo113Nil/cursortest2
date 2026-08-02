package com.squareup.cash.securityhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BookletFeatureCardLinkViewModel {
    public final String text;

    public BookletFeatureCardLinkViewModel(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookletFeatureCardLinkViewModel) && Intrinsics.areEqual(this.text, ((BookletFeatureCardLinkViewModel) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BookletFeatureCardLinkViewModel(text=", this.text, ")");
    }
}
