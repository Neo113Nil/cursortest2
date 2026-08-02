package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProfileConfirmSignOutViewModel {
    public final String message;

    public ProfileConfirmSignOutViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileConfirmSignOutViewModel) && Intrinsics.areEqual(this.message, ((ProfileConfirmSignOutViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileConfirmSignOutViewModel(message=", this.message, ")");
    }
}
