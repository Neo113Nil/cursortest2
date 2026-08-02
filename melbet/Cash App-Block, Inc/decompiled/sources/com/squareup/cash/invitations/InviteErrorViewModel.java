package com.squareup.cash.invitations;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InviteErrorViewModel {
    public final String message;

    public InviteErrorViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InviteErrorViewModel) && Intrinsics.areEqual(this.message, ((InviteErrorViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InviteErrorViewModel(message=", this.message, ")");
    }
}
