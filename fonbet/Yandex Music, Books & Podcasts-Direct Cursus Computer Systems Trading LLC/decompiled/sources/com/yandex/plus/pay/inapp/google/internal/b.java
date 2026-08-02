package com.yandex.plus.pay.inapp.google.internal;

import defpackage.sz2;
import defpackage.uz2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {
    public final uz2 a;
    public final sz2 b;

    public b(uz2 uz2Var, sz2 sz2Var) {
        uz2Var.getClass();
        this.a = uz2Var;
        this.b = sz2Var;
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
        int hashCode = this.a.hashCode() * 31;
        sz2 sz2Var = this.b;
        return hashCode + (sz2Var == null ? 0 : sz2Var.hashCode());
    }

    public final String toString() {
        return "BillingConfigResult(billingResult=" + this.a + ", billingConfig=" + this.b + ')';
    }
}
