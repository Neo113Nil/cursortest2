package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v9 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final Long d;

    public v9(com.yandex.passport.data.models.g gVar, String str, String str2, Long l) {
        str.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9)) {
            return false;
        }
        v9 v9Var = (v9) obj;
        return this.a.equals(v9Var.a) && Intrinsics.d(this.b, v9Var.b) && Intrinsics.d(this.c, v9Var.c) && Intrinsics.d(this.d, v9Var.d);
    }

    public final int hashCode() {
        int c = k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.d;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", uidString=");
        sb.append(this.b);
        sb.append(", pushPlatform=");
        sb.append(this.c);
        sb.append(", locationId=");
        return tlm.k(sb, this.d, ')');
    }
}
