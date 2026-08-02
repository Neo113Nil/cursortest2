package defpackage;

import android.view.View;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class bh3 implements zg3, jpj, hg7 {
    public final /* synthetic */ int a = 4;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public bh3(mn0 mn0Var, long j) {
        String str = mn0Var.b;
        ah3 ah3Var = new ah3(3, (byte) 0);
        ah3Var.d = str;
        ah3Var.b = -1;
        ah3Var.c = -1;
        this.f = ah3Var;
        this.b = rds.e(j);
        this.c = rds.d(j);
        this.d = -1;
        this.e = -1;
        int e = rds.e(j);
        int d = rds.d(j);
        if (e < 0 || e > str.length()) {
            l1j.k(str.length(), k5r.q(e, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (d < 0 || d > str.length()) {
            l1j.k(str.length(), k5r.q(d, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (e <= d) {
            return;
        }
        xq0.x(f1d.e(e, d, "Do not set reversed range: ", " > "));
        throw null;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        View view2 = (View) this.f;
        zne g = kqvVar.a.g(519);
        int i = this.b;
        if (i >= 0) {
            view2.getLayoutParams().height = i + g.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + g.a, this.d + g.b, this.e + g.c, view2.getPaddingBottom());
        return kqvVar;
    }

    public void a(int i, int i2) {
        long P = y5g.P(i, i2);
        ((ah3) this.f).J(i, i2, "");
        long Y = h4a.Y(y5g.P(this.b, this.c), P);
        o(rds.e(Y));
        m(rds.d(Y));
        int i3 = this.d;
        if (i3 != -1) {
            long Y2 = h4a.Y(y5g.P(i3, this.e), P);
            if (rds.b(Y2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = rds.e(Y2);
                this.e = rds.d(Y2);
            }
        }
    }

    @Override // defpackage.hg7
    public int b() {
        return ((ig7) ((mka) this.f).a).b + this.c;
    }

    @Override // defpackage.hg7
    public int c() {
        return ((ig7) ((mka) this.f).a).a + this.b;
    }

    public char d(int i) {
        ah3 ah3Var = (ah3) this.f;
        n8n n8nVar = (n8n) ah3Var.e;
        if (n8nVar == null) {
            return ((String) ah3Var.d).charAt(i);
        }
        if (i < ah3Var.b) {
            return ((String) ah3Var.d).charAt(i);
        }
        int g = n8nVar.b - n8nVar.g();
        int i2 = ah3Var.b;
        if (i >= g + i2) {
            return ((String) ah3Var.d).charAt(i - ((g - ah3Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = n8nVar.c;
        char[] cArr = (char[]) n8nVar.e;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + n8nVar.d];
    }

    public rds e() {
        int i = this.d;
        if (i != -1) {
            return new rds(y5g.P(i, this.e));
        }
        return null;
    }

    @Override // defpackage.hg7
    public int f() {
        return ((ig7) ((mka) this.f).a).e + this.d;
    }

    @Override // defpackage.zg3
    public int g() {
        d7k d7kVar = (d7k) this.f;
        int i = this.c;
        if (i == 8) {
            return d7kVar.v();
        }
        if (i == 16) {
            return d7kVar.B();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int v = d7kVar.v();
        this.e = v;
        return (v & 240) >> 4;
    }

    public void h(int i, int i2, String str) {
        ah3 ah3Var = (ah3) this.f;
        if (i < 0 || i > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                xq0.x(f1d.e(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            ah3Var.J(i, i2, str);
            o(str.length() + i);
            m(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    @Override // defpackage.hg7
    public int i() {
        return ((ig7) ((mka) this.f).a).g + this.e;
    }

    public void j(int i, int i2) {
        ah3 ah3Var = (ah3) this.f;
        if (i < 0 || i > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            xq0.x(f1d.e(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    @Override // defpackage.zg3
    public int k() {
        return -1;
    }

    public void l(int i, int i2) {
        ah3 ah3Var = (ah3) this.f;
        if (i < 0 || i > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > ah3Var.r()) {
            l1j.k(ah3Var.r(), k5r.q(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            xq0.x(f1d.e(i, i2, "Do not set reversed range: ", " > "));
        } else {
            o(i);
            m(i2);
        }
    }

    public void m(int i) {
        if (!(i >= 0)) {
            tme.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    @Override // defpackage.zg3
    public int n() {
        return this.b;
    }

    public void o(int i) {
        if (!(i >= 0)) {
            tme.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((ah3) this.f).toString();
            default:
                return super.toString();
        }
    }

    public bh3(hg7 hg7Var, mka mkaVar) {
        this.f = mkaVar;
        this.b = hg7Var != null ? hg7Var.c() : 0;
        this.c = hg7Var != null ? hg7Var.b() : 0;
        this.d = hg7Var != null ? hg7Var.f() : 0;
        this.e = hg7Var != null ? hg7Var.i() : 0;
    }

    public /* synthetic */ bh3() {
    }

    public bh3(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }

    public bh3(View view, int i, int i2, int i3, int i4) {
        this.b = i;
        this.f = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public bh3(vfi vfiVar) {
        d7k d7kVar = vfiVar.g;
        this.f = d7kVar;
        d7kVar.H(12);
        this.c = d7kVar.z() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.b = d7kVar.z();
    }
}
