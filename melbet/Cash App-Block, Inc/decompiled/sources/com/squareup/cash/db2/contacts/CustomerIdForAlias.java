package com.squareup.cash.db2.contacts;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerIdForAlias {
    public final String customer_id;

    public CustomerIdForAlias(String str) {
        this.customer_id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerIdForAlias) && Intrinsics.areEqual(this.customer_id, ((CustomerIdForAlias) obj).customer_id);
    }

    public final int hashCode() {
        String str = this.customer_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerIdForAlias(customer_id=", this.customer_id, ")");
    }
}
