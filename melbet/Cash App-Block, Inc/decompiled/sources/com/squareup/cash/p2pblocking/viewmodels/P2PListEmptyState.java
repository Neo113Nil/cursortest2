package com.squareup.cash.p2pblocking.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListEmptyState {
    public final String subtitle;
    public final String title;

    public P2PListEmptyState(String str, String str2) {
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PListEmptyState)) {
            return false;
        }
        P2PListEmptyState p2PListEmptyState = (P2PListEmptyState) obj;
        return Intrinsics.areEqual(this.title, p2PListEmptyState.title) && Intrinsics.areEqual(this.subtitle, p2PListEmptyState.subtitle);
    }

    public final int hashCode() {
        String str = this.title;
        return this.subtitle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("P2PListEmptyState(title=", this.title, ", subtitle=", this.subtitle, ")");
    }
}
