package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xwp {
    public final String a;
    public final String b;
    public final boolean c;

    public xwp(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwp)) {
            return false;
        }
        xwp xwpVar = (xwp) obj;
        return Intrinsics.d(this.a, xwpVar.a) && Intrinsics.d(this.b, xwpVar.b) && this.c == xwpVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("ShareInviteToFamilySwitcherUiState(title=", this.a, ", subtitle=", this.b, ", checked="), this.c, ")");
    }
}
