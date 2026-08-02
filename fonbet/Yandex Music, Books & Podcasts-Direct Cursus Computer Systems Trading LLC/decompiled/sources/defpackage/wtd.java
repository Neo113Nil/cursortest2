package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wtd {
    public static final pn3 d;
    public static final pn3 e;
    public static final pn3 f;
    public static final pn3 g;
    public static final pn3 h;
    public static final pn3 i;
    public final pn3 a;
    public final pn3 b;
    public final int c;

    static {
        pn3 pn3Var = pn3.d;
        d = ovn.C(StringUtils.PROCESS_POSTFIX_DELIMITER);
        e = ovn.C(":status");
        f = ovn.C(":method");
        g = ovn.C(":path");
        h = ovn.C(":scheme");
        i = ovn.C(":authority");
    }

    public wtd(pn3 pn3Var, pn3 pn3Var2) {
        pn3Var.getClass();
        pn3Var2.getClass();
        this.a = pn3Var;
        this.b = pn3Var2;
        this.c = pn3Var2.d() + pn3Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtd)) {
            return false;
        }
        wtd wtdVar = (wtd) obj;
        return Intrinsics.d(this.a, wtdVar.a) && Intrinsics.d(this.b, wtdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.u() + ": " + this.b.u();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wtd(String str, String str2) {
        this(ovn.C(str), ovn.C(str2));
        str.getClass();
        str2.getClass();
        pn3 pn3Var = pn3.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wtd(pn3 pn3Var, String str) {
        this(pn3Var, ovn.C(str));
        pn3Var.getClass();
        str.getClass();
        pn3 pn3Var2 = pn3.d;
    }
}
