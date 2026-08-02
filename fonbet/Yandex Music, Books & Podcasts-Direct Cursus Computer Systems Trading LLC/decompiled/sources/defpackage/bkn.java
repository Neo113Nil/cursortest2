package defpackage;

import kotlin.text.c;

/* loaded from: classes5.dex */
public class bkn extends y6 {
    public final mka f;
    public final char[] g;
    public int h = 128;
    public final sx0 i;

    public bkn(mka mkaVar, char[] cArr) {
        this.f = mkaVar;
        this.g = cArr;
        this.i = new sx0(cArr);
        H(0);
    }

    @Override // defpackage.y6
    public int C() {
        int z;
        char c;
        int i = this.b;
        while (true) {
            z = z(i);
            if (z == -1 || !((c = this.i.a[z]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = z + 1;
        }
        this.b = z;
        return z;
    }

    @Override // defpackage.y6
    public final String D(int i, int i2) {
        sx0 sx0Var = this.i;
        return c.l(sx0Var.a, i, Math.min(i2, sx0Var.b));
    }

    public final void H(int i) {
        sx0 sx0Var = this.i;
        char[] cArr = sx0Var.a;
        if (i != 0) {
            int i2 = this.b;
            System.arraycopy(cArr, i2, cArr, 0, (i2 + i) - i2);
        }
        int i3 = sx0Var.b;
        while (true) {
            if (i == i3) {
                break;
            }
            mka mkaVar = this.f;
            mkaVar.getClass();
            int a = ((le4) mkaVar.a).a(cArr, i, i3 - i);
            if (a == -1) {
                sx0Var.b = Math.min(sx0Var.a.length, i);
                this.h = -1;
                break;
            }
            i += a;
        }
        this.b = 0;
    }

    public final void I() {
        sd4 sd4Var = sd4.c;
        sd4Var.getClass();
        char[] cArr = this.g;
        cArr.getClass();
        if (cArr.length == 16384) {
            sd4Var.b(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // defpackage.y6
    public final void b(int i, int i2) {
        ((StringBuilder) this.e).append(this.i.a, i, i2 - i);
    }

    @Override // defpackage.y6
    public boolean c() {
        n();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return false;
            }
            char c = this.i.a[z];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = z;
                return y6.u(c);
            }
            i = z + 1;
        }
    }

    @Override // defpackage.y6
    public final String e() {
        h('\"');
        int i = this.b;
        sx0 sx0Var = this.i;
        int i2 = sx0Var.b;
        char[] cArr = sx0Var.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int z = z(i);
            int i4 = this.b;
            if (z != -1) {
                return k(sx0Var, i4, z);
            }
            int i5 = i4 - 1;
            y6.q(this, hrg.q("Expected quotation mark '\"', but had '", (i4 == sx0Var.b || i5 < 0) ? "EOF" : String.valueOf(sx0Var.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return k(sx0Var, this.b, i6);
            }
        }
        this.b = i3 + 1;
        return c.l(cArr, i, Math.min(i3, sx0Var.b));
    }

    @Override // defpackage.y6
    public byte f() {
        n();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return (byte) 10;
            }
            int i2 = z + 1;
            byte r = wct.r(this.i.a[z]);
            if (r != 3) {
                this.b = i2;
                return r;
            }
            i = i2;
        }
    }

    @Override // defpackage.y6
    public void h(char c) {
        n();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                G(c);
                throw null;
            }
            int i2 = z + 1;
            char c2 = this.i.a[z];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                G(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.y6
    public final void n() {
        int i = this.i.b - this.b;
        if (i > this.h) {
            return;
        }
        H(i);
    }

    @Override // defpackage.y6
    public final CharSequence s() {
        return this.i;
    }

    @Override // defpackage.y6
    public final String w(String str, boolean z) {
        str.getClass();
        return null;
    }

    @Override // defpackage.y6
    public final int z(int i) {
        sx0 sx0Var = this.i;
        if (i < sx0Var.b) {
            return i;
        }
        this.b = i;
        n();
        return (this.b != 0 || sx0Var.length() == 0) ? -1 : 0;
    }
}
