package com.yandex.plus.core.graphql.fragment;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c9 {
    public final String a;
    public final Object b;
    public final String c;
    public final Object d;

    public c9(String str, Object obj, String str2, Object obj2) {
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return this.a.equals(c9Var.a) && Intrinsics.d(this.b, c9Var.b) && Intrinsics.d(this.c, c9Var.c) && this.d.equals(c9Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvoicePayment(id=");
        sb.append(this.a);
        sb.append(", respCode=");
        sb.append(this.b);
        sb.append(", respDesc=");
        sb.append(this.c);
        sb.append(", status=");
        return f1d.j(sb, this.d, ')');
    }
}
