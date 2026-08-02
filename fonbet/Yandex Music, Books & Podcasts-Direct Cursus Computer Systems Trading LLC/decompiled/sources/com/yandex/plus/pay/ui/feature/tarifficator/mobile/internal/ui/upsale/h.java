package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a a;
    public final String b;
    public final String c;

    public h(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.a aVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentLoading(content=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return dfi.i(sb, this.c, ')');
    }
}
