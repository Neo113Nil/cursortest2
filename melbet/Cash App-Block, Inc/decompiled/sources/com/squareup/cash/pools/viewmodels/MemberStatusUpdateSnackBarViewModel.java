package com.squareup.cash.pools.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MemberStatusUpdateSnackBarViewModel {
    public final String subtitle;
    public final String title;

    public MemberStatusUpdateSnackBarViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberStatusUpdateSnackBarViewModel)) {
            return false;
        }
        MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel = (MemberStatusUpdateSnackBarViewModel) obj;
        return Intrinsics.areEqual(this.title, memberStatusUpdateSnackBarViewModel.title) && Intrinsics.areEqual(this.subtitle, memberStatusUpdateSnackBarViewModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("MemberStatusUpdateSnackBarViewModel(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
