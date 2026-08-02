package com.yandex.plus.core.graphql.type;

import defpackage.q7g;

/* loaded from: classes4.dex */
public final class o {
    public final q7g a;

    public o(q7g q7gVar) {
        this.a = q7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CheckoutInvoiceAdditionalOffersInput(offers=" + this.a + ')';
    }
}
