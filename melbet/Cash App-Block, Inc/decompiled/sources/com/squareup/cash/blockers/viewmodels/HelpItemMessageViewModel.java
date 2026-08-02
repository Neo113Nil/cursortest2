package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class HelpItemMessageViewModel {
    public final String message;
    public final String title;

    public HelpItemMessageViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpItemMessageViewModel)) {
            return false;
        }
        HelpItemMessageViewModel helpItemMessageViewModel = (HelpItemMessageViewModel) obj;
        return Intrinsics.areEqual(this.title, helpItemMessageViewModel.title) && Intrinsics.areEqual(this.message, helpItemMessageViewModel.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("HelpItemMessageViewModel(title=", this.title, ", message=", this.message, ")");
    }
}
