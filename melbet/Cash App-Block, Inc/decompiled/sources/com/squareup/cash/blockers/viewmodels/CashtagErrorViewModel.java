package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CashtagErrorViewModel {
    public final String message;

    public CashtagErrorViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashtagErrorViewModel) && Intrinsics.areEqual(this.message, ((CashtagErrorViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashtagErrorViewModel(message=", this.message, ")");
    }
}
