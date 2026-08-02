package com.yandex.passport.internal.usecase.ui;

import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {
    public final String a;
    public final com.yandex.passport.sloth.data.g b;
    public final String c;
    public final com.yandex.passport.common.core.f d;

    public i0(String str, com.yandex.passport.sloth.data.g gVar, String str2, com.yandex.passport.common.core.f fVar) {
        str.getClass();
        gVar.getClass();
        str2.getClass();
        fVar.getClass();
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.a, i0Var.a) && Intrinsics.d(this.b, i0Var.b) && Intrinsics.d(this.c, i0Var.c) && Intrinsics.d(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(trackId=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", url=");
        com.appsflyer.internal.k.y(sb, this.c, ", uid=");
        return com.appsflyer.internal.k.n(sb, this.d, ')');
    }
}
