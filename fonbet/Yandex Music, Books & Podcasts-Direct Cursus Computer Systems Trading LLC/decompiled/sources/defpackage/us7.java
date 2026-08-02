package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.trackselection.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class us7 extends v0t {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public us7(a aVar) {
        e(aVar);
        this.F = aVar.p0;
        this.G = aVar.q0;
        this.H = aVar.r0;
        this.I = aVar.s0;
        this.J = aVar.t0;
        this.K = aVar.u0;
        this.L = aVar.v0;
        SparseArray sparseArray = aVar.w0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.M = sparseArray2;
        this.N = aVar.x0.clone();
    }

    @Override // defpackage.v0t
    public final void a(s0t s0tVar) {
        this.D.put(s0tVar.a, s0tVar);
    }

    @Override // defpackage.v0t
    public final w0t b() {
        return new a(this);
    }

    @Override // defpackage.v0t
    public final v0t c() {
        super.c();
        return this;
    }

    @Override // defpackage.v0t
    public final v0t d(int i) {
        super.d(i);
        return this;
    }

    @Override // defpackage.v0t
    public final void g(boolean z) {
        this.C = z;
    }

    @Override // defpackage.v0t
    public final void h() {
        this.B = false;
    }

    @Override // defpackage.v0t
    public final v0t i() {
        this.y = -3;
        return this;
    }

    @Override // defpackage.v0t
    public final void j(int i) {
        this.s = i;
    }

    @Override // defpackage.v0t
    public final v0t k(s0t s0tVar) {
        super.k(s0tVar);
        return this;
    }

    @Override // defpackage.v0t
    public final v0t l(String str) {
        super.l(null);
        return this;
    }

    @Override // defpackage.v0t
    public final v0t m(String[] strArr) {
        super.m(strArr);
        return this;
    }

    @Override // defpackage.v0t
    public final v0t n() {
        super.n();
        return this;
    }

    @Override // defpackage.v0t
    public final v0t o(int i) {
        super.o(i);
        return this;
    }

    public final v0t p(String[] strArr) {
        this.p = v0t.f(strArr);
        return this;
    }

    public final void q(String str) {
        super.l(str);
    }

    public final void r(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.N;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
        } else {
            sparseBooleanArray.delete(i);
        }
    }

    public us7() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
