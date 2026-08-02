package com.yandex.passport.internal.usecase.ui;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {
    public final com.yandex.passport.common.core.b a;
    public final String b;
    public final String c;

    public k0(com.yandex.passport.common.core.b bVar, String str, String str2) {
        str2.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.a == k0Var.a && this.b.equals(k0Var.b) && Intrinsics.d(this.c, k0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", clientId=");
        return dfi.i(sb, this.c, ')');
    }
}
