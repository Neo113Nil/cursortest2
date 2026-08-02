package com.squareup.cash.family.requestsponsorship.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsorSuggestionSection {
    public final String header;
    public final List suggestions;

    public SponsorSuggestionSection(String str, List list) {
        str.getClass();
        list.getClass();
        this.header = str;
        this.suggestions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsorSuggestionSection)) {
            return false;
        }
        SponsorSuggestionSection sponsorSuggestionSection = (SponsorSuggestionSection) obj;
        return Intrinsics.areEqual(this.header, sponsorSuggestionSection.header) && Intrinsics.areEqual(this.suggestions, sponsorSuggestionSection.suggestions);
    }

    public final int hashCode() {
        return this.suggestions.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SponsorSuggestionSection(header=", this.header, ", suggestions=", ")", this.suggestions);
    }
}
