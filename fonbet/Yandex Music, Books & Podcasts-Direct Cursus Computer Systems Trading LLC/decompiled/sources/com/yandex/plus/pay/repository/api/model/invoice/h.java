package com.yandex.plus.pay.repository.api.model.invoice;

import defpackage.k5r;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class h {
    public final ArrayList a;

    public h(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("InvoiceAdditionalOffers(offers="), this.a, ')');
    }
}
