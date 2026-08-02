package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zkn implements dh3 {
    public final dh3 a;
    public final fs1 b;
    public final String c;
    public final g40 d;
    public final jd6 e;
    public final float f;
    public final m85 g;

    public zkn(dh3 dh3Var, fs1 fs1Var, String str, g40 g40Var, jd6 jd6Var, float f, m85 m85Var) {
        this.a = dh3Var;
        this.b = fs1Var;
        this.c = str;
        this.d = g40Var;
        this.e = jd6Var;
        this.f = f;
        this.g = m85Var;
    }

    @Override // defpackage.dh3
    public final yci a(yci yciVar, g40 g40Var) {
        return this.a.a(yciVar, g40Var);
    }

    @Override // defpackage.dh3
    public final yci b(yci yciVar) {
        return this.a.b(yciVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkn)) {
            return false;
        }
        zkn zknVar = (zkn) obj;
        return Intrinsics.d(this.a, zknVar.a) && this.b.equals(zknVar.b) && Intrinsics.d(this.c, zknVar.c) && Intrinsics.d(this.d, zknVar.d) && Intrinsics.d(this.e, zknVar.e) && Float.compare(this.f, zknVar.f) == 0 && Intrinsics.d(this.g, zknVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int a = eta.a((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, this.f, 31);
        m85 m85Var = this.g;
        return Boolean.hashCode(true) + ((a + (m85Var != null ? m85Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ", clipToBounds=true)";
    }
}
