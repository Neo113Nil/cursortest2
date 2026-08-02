package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SetPinMessageViewModel {
    public final String message;
    public final String primaryButtonText;

    public SetPinMessageViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.message = str;
        this.primaryButtonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPinMessageViewModel)) {
            return false;
        }
        SetPinMessageViewModel setPinMessageViewModel = (SetPinMessageViewModel) obj;
        return Intrinsics.areEqual(this.message, setPinMessageViewModel.message) && Intrinsics.areEqual(this.primaryButtonText, setPinMessageViewModel.primaryButtonText);
    }

    public final int hashCode() {
        return this.primaryButtonText.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SetPinMessageViewModel(message=", this.message, ", primaryButtonText=", this.primaryButtonText, ")");
    }
}
