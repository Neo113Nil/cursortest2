package com.yandex.passport.sloth.data;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.passport.common.core.b a;
    public final String b;
    public final String c;

    public i(com.yandex.passport.common.core.b bVar, String str, String str2) {
        bVar.getClass();
        str.getClass();
        this.a = bVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && Intrinsics.d(this.b, iVar.b) && this.c.equals(iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothCookie(environment=");
        sb.append(this.a);
        sb.append(", returnUrl=");
        sb.append(this.b);
        sb.append(", cookies=");
        return dfi.i(sb, this.c, ')');
    }
}
