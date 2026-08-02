package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 implements q0 {
    public final com.yandex.passport.common.ui.a a;
    public final com.yandex.passport.common.core.f b;
    public final String c;
    public final String d;
    public final String e;

    public l0(com.yandex.passport.common.ui.a aVar, com.yandex.passport.common.core.f fVar, String str, String str2, String str3) {
        aVar.getClass();
        fVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = aVar;
        this.b = fVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a == l0Var.a && Intrinsics.d(this.b, l0Var.b) && Intrinsics.d(this.c, l0Var.c) && Intrinsics.d(this.d, l0Var.d) && Intrinsics.d(this.e, l0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(com.appsflyer.internal.k.d(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EsiaBind(theme=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", appication=");
        sb.append(this.c);
        sb.append(", consumer=");
        sb.append(this.d);
        sb.append(", scope=");
        return dfi.i(sb, this.e, ')');
    }
}
