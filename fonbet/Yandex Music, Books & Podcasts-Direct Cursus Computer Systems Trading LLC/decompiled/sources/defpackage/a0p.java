package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0p {
    public final af5 a;
    public final c0p b;
    public final p0p c;
    public final b0p d;
    public final boolean e;
    public final String f;

    public a0p(af5 af5Var, c0p c0pVar, p0p p0pVar, b0p b0pVar, boolean z, String str) {
        af5Var.getClass();
        c0pVar.getClass();
        p0pVar.getClass();
        this.a = af5Var;
        this.b = c0pVar;
        this.c = p0pVar;
        this.d = b0pVar;
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0p)) {
            return false;
        }
        a0p a0pVar = (a0p) obj;
        return Intrinsics.d(this.a, a0pVar.a) && this.b == a0pVar.b && this.c == a0pVar.c && this.d == a0pVar.d && this.e == a0pVar.e && Intrinsics.d(this.f, a0pVar.f);
    }

    public final int hashCode() {
        int e = k5r.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        String str = this.f;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SearchConfiguration(request=" + this.a + ", context=" + this.b + ", entityType=" + this.c + ", mode=" + this.d + ", isDefaultFilter=" + this.e + ", entityId=" + this.f + ")";
    }
}
