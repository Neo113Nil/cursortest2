package com.squareup.cash.account.settings.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ErrorViewModel {
    public final String message;
    public final String title;

    public ErrorViewModel(String str, String str2) {
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) obj;
        return Intrinsics.areEqual(this.title, errorViewModel.title) && Intrinsics.areEqual(this.message, errorViewModel.message);
    }

    public final int hashCode() {
        String str = this.title;
        return this.message.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ErrorViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
