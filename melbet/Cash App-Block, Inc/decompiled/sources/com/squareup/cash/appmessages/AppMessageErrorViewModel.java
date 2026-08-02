package com.squareup.cash.appmessages;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class AppMessageErrorViewModel {
    public final int messageRes;

    public AppMessageErrorViewModel(int i) {
        this.messageRes = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageErrorViewModel) && this.messageRes == ((AppMessageErrorViewModel) obj).messageRes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.messageRes);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageRes, "AppMessageErrorViewModel(messageRes=", ")");
    }
}
