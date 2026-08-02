package com.squareup.cash.formview.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FormCashtagViewEvent$InputChange {
    public final String input;

    public FormCashtagViewEvent$InputChange(String str) {
        str.getClass();
        this.input = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FormCashtagViewEvent$InputChange) && Intrinsics.areEqual(this.input, ((FormCashtagViewEvent$InputChange) obj).input);
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputChange(input=", this.input, ")");
    }
}
