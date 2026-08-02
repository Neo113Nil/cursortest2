package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements v {
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public r(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar, String str, String str2, String str3, boolean z) {
        gVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.v
    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && Intrinsics.d(this.c, rVar.c) && Intrinsics.d(this.d, rVar.d) && this.e == rVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Confirmation3ds(checkoutContent=");
        sb.append(this.a);
        sb.append(", loadingTitle=");
        sb.append(this.b);
        sb.append(", loadingSubtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isReady=");
        return dfi.j(sb, this.e, ')');
    }
}
