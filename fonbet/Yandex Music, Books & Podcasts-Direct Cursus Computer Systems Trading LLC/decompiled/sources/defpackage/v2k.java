package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v2k implements ttf {
    public final o3k a;
    public final vut b;
    public final x0 c;

    public v2k(o3k o3kVar, u2k u2kVar, x0 x0Var) {
        this.a = o3kVar;
        this.b = u2kVar;
        this.c = x0Var;
    }

    @Override // defpackage.ttf
    public final int a() {
        return this.b.G().b;
    }

    @Override // defpackage.ttf
    public final void b(int i, Object obj, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1201380429);
        ksw.x(obj, i, this.a.C, ild.C(1142237095, new tg3(this, i, 5), oq5Var), oq5Var, 3072);
        oq5Var.p(false);
    }

    @Override // defpackage.ttf
    public final int d(Object obj) {
        return this.c.A(obj);
    }

    @Override // defpackage.ttf
    public final Object e(int i) {
        Object C = this.c.C(i);
        return C == null ? this.b.H(i) : C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2k)) {
            return false;
        }
        return Intrinsics.d(this.b, ((v2k) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
