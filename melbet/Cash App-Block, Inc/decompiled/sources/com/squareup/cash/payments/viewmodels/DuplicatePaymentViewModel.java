package com.squareup.cash.payments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DuplicatePaymentViewModel {
    public final String subtitle;
    public final String title;

    public DuplicatePaymentViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuplicatePaymentViewModel)) {
            return false;
        }
        DuplicatePaymentViewModel duplicatePaymentViewModel = (DuplicatePaymentViewModel) obj;
        return Intrinsics.areEqual(this.title, duplicatePaymentViewModel.title) && Intrinsics.areEqual(this.subtitle, duplicatePaymentViewModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DuplicatePaymentViewModel(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
