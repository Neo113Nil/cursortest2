package com.squareup.cash.investing.viewmodels.families;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentDisabledStateViewModel {
    public final String ctaText;
    public final String title;

    public DependentDisabledStateViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.ctaText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentDisabledStateViewModel)) {
            return false;
        }
        DependentDisabledStateViewModel dependentDisabledStateViewModel = (DependentDisabledStateViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentDisabledStateViewModel.title) && Intrinsics.areEqual(this.ctaText, dependentDisabledStateViewModel.ctaText);
    }

    public final int hashCode() {
        return this.ctaText.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DependentDisabledStateViewModel(title=", this.title, ", ctaText=", this.ctaText, ")");
    }
}
