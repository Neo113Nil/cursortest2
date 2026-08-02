package defpackage;

import com.google.gson.Strictness;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class tex extends afx {
    public static final sex K = new sex();
    public static final rdx L = new rdx("closed");
    public final ArrayList H;
    public String I;
    public pcx J;

    public tex() {
        super(K);
        this.H = new ArrayList();
        this.J = fdx.a;
    }

    @Override // defpackage.afx
    public final void P(double d) {
        if (this.A != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            kbs.d(d, "JSON forbids NaN and infinities: ");
        } else {
            f0(new rdx(Double.valueOf(d)));
        }
    }

    @Override // defpackage.afx
    public final void R(long j) {
        f0(new rdx(Long.valueOf(j)));
    }

    @Override // defpackage.afx
    public final void T(Boolean bool) {
        if (bool == null) {
            f0(fdx.a);
        } else {
            f0(new rdx(bool));
        }
    }

    @Override // defpackage.afx
    public final void U(Number number) {
        if (number == null) {
            f0(fdx.a);
            return;
        }
        if (this.A != Strictness.LENIENT) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                kbs.f(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        f0(new rdx(number));
    }

    @Override // defpackage.afx
    public final void W(String str) {
        if (str == null) {
            f0(fdx.a);
        } else {
            f0(new rdx(str));
        }
    }

    @Override // defpackage.afx
    public final void Z(boolean z) {
        f0(new rdx(Boolean.valueOf(z)));
    }

    public final pcx b0() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            return this.J;
        }
        yci0.k(arrayList, "Expected one JSON element but was ");
        return null;
    }

    @Override // defpackage.afx
    public final void c() {
        wbx wbxVar = new wbx();
        f0(wbxVar);
        this.H.add(wbxVar);
    }

    @Override // defpackage.afx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(L);
        } else {
            ny61.v("Incomplete document");
        }
    }

    @Override // defpackage.afx
    public final void d() {
        jdx jdxVar = new jdx();
        f0(jdxVar);
        this.H.add(jdxVar);
    }

    public final pcx e0() {
        return (pcx) unr0.k(1, this.H);
    }

    public final void f0(pcx pcxVar) {
        if (this.I != null) {
            pcxVar.getClass();
            if (!(pcxVar instanceof fdx) || this.D) {
                jdx jdxVar = (jdx) e0();
                jdxVar.a.put(this.I, pcxVar);
            }
            this.I = null;
            return;
        }
        if (this.H.isEmpty()) {
            this.J = pcxVar;
            return;
        }
        pcx e0 = e0();
        if (!(e0 instanceof wbx)) {
            ny61.k();
            return;
        }
        wbx wbxVar = (wbx) e0;
        if (pcxVar == null) {
            pcxVar = fdx.a;
        }
        wbxVar.a.add(pcxVar);
    }

    @Override // defpackage.afx, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.afx
    public final void k() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty() || this.I != null) {
            ny61.k();
        } else if (e0() instanceof wbx) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            ny61.k();
        }
    }

    @Override // defpackage.afx
    public final void n() {
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty() || this.I != null) {
            ny61.k();
        } else if (e0() instanceof jdx) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            ny61.k();
        }
    }

    @Override // defpackage.afx
    public final void o(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.H.isEmpty() || this.I != null) {
            ny61.r("Did not expect a name");
        } else if (e0() instanceof jdx) {
            this.I = str;
        } else {
            ny61.r("Please begin an object before writing a name.");
        }
    }

    @Override // defpackage.afx
    public final afx w() {
        f0(fdx.a);
        return this;
    }
}
