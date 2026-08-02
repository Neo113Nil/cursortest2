package com.yandex.plus.pay.ui.common.internal.error.content;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {
    public final String a;
    public final String b;

    public k(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.a, kVar.a) && Intrinsics.d(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentErrorHintContent(title=");
        sb.append(this.a);
        sb.append(", description=");
        return dfi.i(sb, this.b, ')');
    }
}
