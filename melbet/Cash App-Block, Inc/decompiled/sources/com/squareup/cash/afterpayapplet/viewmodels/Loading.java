package com.squareup.cash.afterpayapplet.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Loading implements AfterpayAppletHomeViewModel {
    public final String screenTitle;

    public Loading(String str) {
        str.getClass();
        this.screenTitle = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Loading) && Intrinsics.areEqual(this.screenTitle, ((Loading) obj).screenTitle);
    }

    public final int hashCode() {
        return this.screenTitle.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(screenTitle=", this.screenTitle, ")");
    }
}
