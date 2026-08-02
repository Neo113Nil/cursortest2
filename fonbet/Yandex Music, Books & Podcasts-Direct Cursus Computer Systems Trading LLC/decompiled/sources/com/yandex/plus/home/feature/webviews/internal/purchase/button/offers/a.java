package com.yandex.plus.home.feature.webviews.internal.purchase.button.offers;

import com.yandex.plus.pay.adapter.api.j;
import com.yandex.plus.pay.adapter.internal.i;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final j a;
    public final boolean b;
    public final String c;

    public a(j jVar, boolean z, String str) {
        jVar.getClass();
        str.getClass();
        this.a = jVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && this.b == aVar.b && Intrinsics.d(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(((i) this.a).a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeButtonOffer(compositeOffer=");
        sb.append(this.a);
        sb.append(", canStartAutoPayment=");
        sb.append(this.b);
        sb.append(", trackId=");
        return dfi.i(sb, this.c, ')');
    }
}
