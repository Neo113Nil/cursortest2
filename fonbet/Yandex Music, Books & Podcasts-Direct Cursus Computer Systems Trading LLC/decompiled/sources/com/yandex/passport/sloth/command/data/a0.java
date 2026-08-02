package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();
    public static final arf[] d = {btf.a(bwf.b, new com.yandex.passport.internal.push.w0(27)), null, null};
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ a0(String str, boolean z, boolean z2, int i) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && this.b == a0Var.b && this.c == a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenExternalUrlData(url=");
        com.appsflyer.internal.k.y(sb, this.a, ", isAuthUrlRequired=");
        sb.append(this.b);
        sb.append(", isWebViewClosed=");
        return dfi.j(sb, this.c, ')');
    }
}
