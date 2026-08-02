package com.yandex.passport.api;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2 implements h2 {
    public final String a;
    public final String b;

    public f2(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return Intrinsics.d(this.a, f2Var.a) && Intrinsics.d(this.b, f2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessItem(item=");
        sb.append(this.a);
        sb.append(", params=");
        return dfi.i(sb, this.b, ')');
    }
}
