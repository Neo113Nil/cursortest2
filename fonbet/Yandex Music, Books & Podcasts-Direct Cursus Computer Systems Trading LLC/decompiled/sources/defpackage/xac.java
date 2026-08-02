package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class xac implements r7f {
    public final r7f a;
    public final LinkedHashMap b = new LinkedHashMap();

    public xac(r7f r7fVar) {
        this.a = r7fVar;
    }

    @Override // defpackage.r7f
    public final r7f B0() {
        this.a.B0();
        return this;
    }

    @Override // defpackage.r7f
    public final r7f J(boolean z) {
        this.a.J(z);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f Z(String str) {
        this.a.Z(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.r7f
    public final r7f i0(o5f o5fVar) {
        o5fVar.getClass();
        this.a.i0(o5fVar);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f j() {
        this.a.j();
        return this;
    }

    @Override // defpackage.r7f
    public final r7f l() {
        this.a.l();
        return this;
    }

    @Override // defpackage.r7f
    public final r7f m() {
        this.a.m();
        return this;
    }

    @Override // defpackage.r7f
    public final r7f m0(String str) {
        str.getClass();
        this.a.m0(str);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f p() {
        this.a.p();
        return this;
    }

    @Override // defpackage.r7f
    public final r7f t(long j) {
        this.a.t(j);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f u(int i) {
        this.a.u(i);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f y(double d) {
        this.a.y(d);
        return this;
    }
}
