package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h8 {

    @NotNull
    public static final g8 Companion = new g8();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ h8(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, f8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return Intrinsics.d(this.a, h8Var.a) && Intrinsics.d(this.b, h8Var.b) && Intrinsics.d(this.c, h8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", state=");
        return dfi.i(sb, this.c, ')');
    }
}
