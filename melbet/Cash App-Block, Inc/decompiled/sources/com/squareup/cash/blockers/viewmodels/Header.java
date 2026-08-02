package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.overlays.OverlaysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Header {
    public final OverlaysKt avatar;
    public final String title;

    public Header(OverlaysKt overlaysKt, String str) {
        this.avatar = overlaysKt;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.avatar.equals(header.avatar) && Intrinsics.areEqual(this.title, header.title);
    }

    public final int hashCode() {
        int hashCode = this.avatar.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Header(avatar=" + this.avatar + ", title=" + this.title + ")";
    }
}
