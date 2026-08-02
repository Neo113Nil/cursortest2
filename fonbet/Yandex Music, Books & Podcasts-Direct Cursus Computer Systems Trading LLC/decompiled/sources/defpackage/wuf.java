package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wuf implements ttf {
    public final fvf a;
    public final vuf b;
    public final atf c;
    public final x0 d;

    public wuf(fvf fvfVar, vuf vufVar, atf atfVar, x0 x0Var) {
        this.a = fvfVar;
        this.b = vufVar;
        this.c = atfVar;
        this.d = x0Var;
    }

    @Override // defpackage.ttf
    public final int a() {
        return this.b.G().b;
    }

    @Override // defpackage.ttf
    public final void b(int i, Object obj, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-462424778);
        ksw.x(obj, i, this.a.q, ild.C(-824725566, new tg3(this, i, 4), oq5Var), oq5Var, 3072);
        oq5Var.p(false);
    }

    @Override // defpackage.ttf
    public final Object c(int i) {
        return this.b.F(i);
    }

    @Override // defpackage.ttf
    public final int d(Object obj) {
        return this.d.A(obj);
    }

    @Override // defpackage.ttf
    public final Object e(int i) {
        Object C = this.d.C(i);
        return C == null ? this.b.H(i) : C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuf)) {
            return false;
        }
        return Intrinsics.d(this.b, ((wuf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
