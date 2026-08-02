package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j2 {
    public final com.yandex.passport.common.core.b a;
    public final String b;

    public j2(com.yandex.passport.common.core.b bVar, String str) {
        bVar.getClass();
        this.a = bVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return this.a == j2Var.a && Intrinsics.d(this.b, j2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        return dfi.i(sb, this.b, ')');
    }
}
