package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common;

import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends c {
    public final String a;
    public final ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, ArrayList arrayList) {
        super(null, null);
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.a, bVar.a) && Intrinsics.d(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("NoOffersByVendor(vendorType=");
        sb.append(this.a);
        sb.append(", offersIds=");
        return k5r.o(sb, this.b, ')');
    }
}
