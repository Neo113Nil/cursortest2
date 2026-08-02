package defpackage;

import androidx.core.app.q;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class kn3 extends hn3 {
    private static final long serialVersionUID = 1;
    public final byte[] d;

    public kn3(byte[] bArr) {
        this.a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    public int A() {
        return 0;
    }

    @Override // defpackage.nn3
    public byte a(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn3) || size() != ((nn3) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof kn3)) {
            return obj.equals(this);
        }
        kn3 kn3Var = (kn3) obj;
        int i = this.a;
        int i2 = kn3Var.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > kn3Var.size()) {
            tiu.e(size, size());
            return false;
        }
        if (size > kn3Var.size()) {
            q.j(kn3Var.size(), k5r.q(size, "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = kn3Var.d;
        int A = A() + size;
        int A2 = A();
        int A3 = kn3Var.A();
        while (A2 < A) {
            if (this.d[A2] != bArr[A3]) {
                return false;
            }
            A2++;
            A3++;
        }
        return true;
    }

    @Override // defpackage.nn3
    public void q(int i, byte[] bArr) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // defpackage.nn3
    public byte r(int i) {
        return this.d[i];
    }

    @Override // defpackage.nn3
    public final boolean s() {
        int A = A();
        return nut.a.M(this.d, A, size() + A) == 0;
    }

    @Override // defpackage.nn3
    public int size() {
        return this.d.length;
    }

    @Override // defpackage.nn3
    public final qr4 t() {
        return qr4.f(this.d, A(), size(), true);
    }

    @Override // defpackage.nn3
    public final int u(int i, int i2) {
        int A = A();
        Charset charset = use.a;
        for (int i3 = A; i3 < A + i2; i3++) {
            i = (i * 31) + this.d[i3];
        }
        return i;
    }

    @Override // defpackage.nn3
    public final nn3 v(int i) {
        int g = nn3.g(0, i, size());
        return g == 0 ? nn3.b : new cn3(this.d, A(), g);
    }

    @Override // defpackage.nn3
    public final String x(Charset charset) {
        return new String(this.d, A(), size(), charset);
    }

    @Override // defpackage.nn3
    public final void z(yr4 yr4Var) {
        yr4Var.u(this.d, A(), size());
    }
}
