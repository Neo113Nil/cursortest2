package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f5 {

    @NotNull
    public static final e5 Companion = new e5();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ f5(int i, long j, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, d5.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return this.a == f5Var.a && Intrinsics.d(this.b, f5Var.b) && Intrinsics.d(this.c, f5Var.c) && Intrinsics.d(this.d, f5Var.d) && Intrinsics.d(this.e, f5Var.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(id=");
        sb.append(this.a);
        sb.append(", mobileproxy=");
        sb.append(this.b);
        sb.append(", webam=");
        sb.append(this.c);
        sb.append(", webamYandex=");
        sb.append(this.d);
        sb.append(", webamIdYandex=");
        return dfi.i(sb, this.e, ')');
    }
}
