package com.squareup.cash.investing.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingExplanatoryViewModel {
    public final String message;

    public InvestingExplanatoryViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestingExplanatoryViewModel) && Intrinsics.areEqual(this.message, ((InvestingExplanatoryViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InvestingExplanatoryViewModel(message=", this.message, ")");
    }
}
