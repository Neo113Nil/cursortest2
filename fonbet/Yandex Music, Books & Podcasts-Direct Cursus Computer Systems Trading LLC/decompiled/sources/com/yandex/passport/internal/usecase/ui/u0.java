package com.yandex.passport.internal.usecase.ui;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 {
    public final com.yandex.passport.common.core.f a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;

    public u0(com.yandex.passport.common.core.f fVar, String str, String str2, boolean z, String str3, String str4, String str5) {
        fVar.getClass();
        str.getClass();
        str2.getClass();
        str5.getClass();
        this.a = fVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.a, u0Var.a) && Intrinsics.d(this.b, u0Var.b) && Intrinsics.d(this.c, u0Var.c) && this.d == u0Var.d && Intrinsics.d(this.e, u0Var.e) && Intrinsics.d(this.f, u0Var.f) && Intrinsics.d(this.g, u0Var.g);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.g.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(selectedUid=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", responseType=");
        sb.append(this.c);
        sb.append(", forceConfirm=");
        sb.append(this.d);
        sb.append(", callerAppId=");
        sb.append(this.e);
        sb.append(", fingerprint=");
        sb.append(this.f);
        sb.append(", state=");
        return dfi.i(sb, this.g, ')');
    }
}
