package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.internal.report.reporters.x0;
import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {
    public final com.yandex.plus.core.network.api.utils.a a;
    public final boolean b;
    public final boolean c;
    public final x0 d;
    public final boolean e;

    public x(com.yandex.plus.core.network.api.utils.a aVar, boolean z, boolean z2, x0 x0Var, boolean z3) {
        this.a = aVar;
        this.b = z;
        this.c = z2;
        this.d = x0Var;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && this.b == xVar.b && this.c == xVar.c && this.d == xVar.d && this.e == xVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + k5r.e(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accountSpec=");
        sb.append(this.a);
        sb.append(", ssoAnnouncingRequired=");
        sb.append(this.b);
        sb.append(", shouldRevokeToken=");
        sb.append(this.c);
        sb.append(", revokePlace=");
        sb.append(this.d);
        sb.append(", isRemoveAccountExplicitly=");
        return dfi.j(sb, this.e, ')');
    }
}
