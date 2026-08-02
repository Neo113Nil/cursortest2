package com.squareup.cash.card.onboarding;

import com.squareup.cash.wallet.data.TagFormFactor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TagThemeViewModel {
    public final TagFormFactor formFactor;
    public final String token;

    public TagThemeViewModel(String str, TagFormFactor tagFormFactor) {
        str.getClass();
        this.token = str;
        this.formFactor = tagFormFactor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagThemeViewModel)) {
            return false;
        }
        TagThemeViewModel tagThemeViewModel = (TagThemeViewModel) obj;
        return Intrinsics.areEqual(this.token, tagThemeViewModel.token) && this.formFactor == tagThemeViewModel.formFactor;
    }

    public final int hashCode() {
        return this.formFactor.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return "TagThemeViewModel(token=" + this.token + ", formFactor=" + this.formFactor + ")";
    }
}
