package com.squareup.cash.p2pblocking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2PListRowTapAvatarEvent {
    public final String customerToken;

    public P2PListRowTapAvatarEvent(String str) {
        str.getClass();
        this.customerToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2PListRowTapAvatarEvent) && Intrinsics.areEqual(this.customerToken, ((P2PListRowTapAvatarEvent) obj).customerToken);
    }

    public final int hashCode() {
        return this.customerToken.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("P2PListRowTapAvatarEvent(customerToken=", this.customerToken, ")");
    }
}
