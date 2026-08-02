package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class lc {

    @NotNull
    public static final kc Companion = new kc();
    public final String a;
    public final hc b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ lc(int i, String str, hc hcVar, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, jc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = hcVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return Intrinsics.d(this.a, lcVar.a) && Intrinsics.d(this.b, lcVar.b) && this.c == lcVar.c && this.d == lcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append(", validForCall=");
        sb.append(this.c);
        sb.append(", validForFlashCall=");
        return dfi.j(sb, this.d, ')');
    }
}
