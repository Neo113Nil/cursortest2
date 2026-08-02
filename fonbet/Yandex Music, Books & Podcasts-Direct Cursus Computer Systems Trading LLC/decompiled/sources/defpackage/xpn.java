package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xpn {
    public final long a;
    public final String b;
    public final String c;
    public final wpn d;

    public xpn(long j, String str, String str2, wpn wpnVar) {
        str.getClass();
        str2.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = wpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpn)) {
            return false;
        }
        xpn xpnVar = (xpn) obj;
        return this.a == xpnVar.a && Intrinsics.d(this.b, xpnVar.b) && Intrinsics.d(this.c, xpnVar.c) && Intrinsics.d(this.d, xpnVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        wpn wpnVar = this.d;
        return c + (wpnVar == null ? 0 : wpnVar.hashCode());
    }

    public final String toString() {
        return "RedirectSession(id=" + this.a + ", ynisonUrl=" + this.b + ", ticket=" + this.c + ", keepAliveParams=" + this.d + ")";
    }
}
