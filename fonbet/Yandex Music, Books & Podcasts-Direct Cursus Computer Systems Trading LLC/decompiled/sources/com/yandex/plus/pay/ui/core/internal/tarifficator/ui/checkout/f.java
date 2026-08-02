package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final int a;
    public final String b;

    public f(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && Intrinsics.d(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentVia(logoRes=");
        sb.append(this.a);
        sb.append(", text=");
        return dfi.i(sb, this.b, ')');
    }
}
