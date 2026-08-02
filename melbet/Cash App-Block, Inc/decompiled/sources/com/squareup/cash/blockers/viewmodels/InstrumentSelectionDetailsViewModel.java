package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InstrumentSelectionDetailsViewModel {
    public final String buttonText;
    public final String title;

    public InstrumentSelectionDetailsViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.buttonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionDetailsViewModel)) {
            return false;
        }
        InstrumentSelectionDetailsViewModel instrumentSelectionDetailsViewModel = (InstrumentSelectionDetailsViewModel) obj;
        return Intrinsics.areEqual(this.title, instrumentSelectionDetailsViewModel.title) && Intrinsics.areEqual(this.buttonText, instrumentSelectionDetailsViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("InstrumentSelectionDetailsViewModel(title=", this.title, ", buttonText=", this.buttonText, ")");
    }
}
