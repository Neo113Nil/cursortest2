package com.squareup.cash.autofillweb.real;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class CashFillJsonEvents {
    public final String data;

    public CashFillJsonEvents(String str) {
        this.data = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashFillJsonEvents) && this.data.equals(((CashFillJsonEvents) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashFillJsonEvents(data=", this.data, ")");
    }
}
