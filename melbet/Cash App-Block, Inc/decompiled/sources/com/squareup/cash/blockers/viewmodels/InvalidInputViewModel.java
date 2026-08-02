package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class InvalidInputViewModel {
    public final String message;
    public final String title;

    public InvalidInputViewModel(String str, String str2) {
        str.getClass();
        this.message = str;
        this.title = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidInputViewModel)) {
            return false;
        }
        InvalidInputViewModel invalidInputViewModel = (InvalidInputViewModel) obj;
        return Intrinsics.areEqual(this.message, invalidInputViewModel.message) && Intrinsics.areEqual(this.title, invalidInputViewModel.title);
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("InvalidInputViewModel(message=", this.message, ", title=", this.title, ")");
    }
}
