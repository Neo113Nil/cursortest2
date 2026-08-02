package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class csf implements ttf {
    public final tsf a;
    public final bsf b;
    public final x0 c;

    public csf(tsf tsfVar, bsf bsfVar, x0 x0Var) {
        this.a = tsfVar;
        this.b = bsfVar;
        this.c = x0Var;
    }

    @Override // defpackage.ttf
    public final int a() {
        return this.b.G().b;
    }

    @Override // defpackage.ttf
    public final void b(int i, Object obj, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1493551140);
        ksw.x(obj, i, this.a.q, ild.C(726189336, new tg3(this, i, 3), oq5Var), oq5Var, 3072);
        oq5Var.p(false);
    }

    @Override // defpackage.ttf
    public final Object c(int i) {
        return this.b.F(i);
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
        if (!(obj instanceof csf)) {
            return false;
        }
        return Intrinsics.d(this.b, ((csf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
