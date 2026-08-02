package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sc5 {
    public final String a;
    public final String b;
    public final boolean c;
    public final jzb d;

    public sc5(String str, String str2, boolean z, jzb jzbVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = jzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc5)) {
            return false;
        }
        sc5 sc5Var = (sc5) obj;
        return Intrinsics.d(this.a, sc5Var.a) && Intrinsics.d(this.b, sc5Var.b) && this.c == sc5Var.c && this.d == sc5Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        jzb jzbVar = this.d;
        return e + (jzbVar != null ? jzbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("CommonClipUiData(title=", this.a, ", subtitle=", this.b, ", isExplicit=");
        m.append(this.c);
        m.append(", explicitType=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
