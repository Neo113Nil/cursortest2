package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dn1 {
    public final xn1 a;
    public final String b;
    public final u51 c;

    public dn1(xn1 xn1Var, String str, u51 u51Var) {
        this.a = xn1Var;
        this.b = str;
        this.c = u51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        return this.a.equals(dn1Var.a) && Intrinsics.d(this.b, dn1Var.b) && this.c.equals(dn1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ArtistsInfoBlockUiItem(uiData=" + this.a + ", donationUrl=" + this.b + ", artistDomainItem=" + this.c + ")";
    }
}
