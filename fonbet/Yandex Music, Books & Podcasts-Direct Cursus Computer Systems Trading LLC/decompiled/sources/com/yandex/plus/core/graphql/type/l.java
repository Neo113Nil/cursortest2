package com.yandex.plus.core.graphql.type;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final v0 e;

    public l(boolean z, String str, String str2, String str3, v0 v0Var) {
        dfi.s(str, str2, str3);
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && Intrinsics.d(this.b, lVar.b) && Intrinsics.d(this.c, lVar.c) && Intrinsics.d(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(k5r.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "CheckoutAdditionalOfferInput(isSelected=" + this.a + ", offerName=" + this.b + ", offersBatchId=" + this.c + ", positionId=" + this.d + ", upsaleStep=" + this.e + ')';
    }
}
