package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class w0 extends s0 implements Iterable {
    public final d0[] a;
    public final boolean b;

    static {
        new y(8, w0.class);
    }

    public w0(d0[] d0VarArr) {
        for (d0 d0Var : d0VarArr) {
            if (d0Var == null) {
                jj4.j("'elements' cannot be null, or contain null");
                throw null;
            }
        }
        d0[] f = e0.f(d0VarArr);
        if (f.length >= 2) {
            E(f);
        }
        this.a = f;
        this.b = true;
    }

    public static byte[] B(d0 d0Var) {
        try {
            return d0Var.n().s();
        } catch (IOException unused) {
            xq0.x("cannot encode object added to SET");
            return null;
        }
    }

    public static boolean D(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static void E(d0[] d0VarArr) {
        int i;
        int length = d0VarArr.length;
        if (length < 2) {
            return;
        }
        d0 d0Var = d0VarArr[0];
        d0 d0Var2 = d0VarArr[1];
        byte[] B = B(d0Var);
        byte[] B2 = B(d0Var2);
        if (D(B2, B)) {
            d0Var2 = d0Var;
            d0Var = d0Var2;
            B2 = B;
            B = B2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            d0 d0Var3 = d0VarArr[i2];
            byte[] B3 = B(d0Var3);
            if (D(B2, B3)) {
                d0VarArr[i2 - 2] = d0Var;
                d0Var = d0Var2;
                B = B2;
                d0Var2 = d0Var3;
                B2 = B3;
            } else if (D(B, B3)) {
                d0VarArr[i2 - 2] = d0Var;
                d0Var = d0Var3;
                B = B3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    d0 d0Var4 = d0VarArr[i3 - 2];
                    if (D(B(d0Var4), B3)) {
                        break;
                    }
                    d0VarArr[i] = d0Var4;
                    i3 = i;
                }
                d0VarArr[i] = d0Var3;
            }
        }
        d0VarArr[length - 2] = d0Var;
        d0VarArr[length - 1] = d0Var2;
    }

    @Override // defpackage.s0
    public s0 A() {
        return new e07(1, this.b, this.a);
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        d0[] d0VarArr = this.a;
        int length = d0VarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += d0VarArr[length].n().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qz0(e0.f(this.a));
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof w0) {
            w0 w0Var = (w0) s0Var;
            int length = this.a.length;
            if (w0Var.a.length == length) {
                e07 e07Var = (e07) z();
                e07 e07Var2 = (e07) w0Var.z();
                for (int i = 0; i < length; i++) {
                    s0 n = e07Var.a[i].n();
                    s0 n2 = e07Var2.a[i].n();
                    if (n == n2 || n.t(n2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        d0[] d0VarArr = this.a;
        int length = d0VarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(d0VarArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // defpackage.s0
    public final boolean v() {
        return true;
    }

    @Override // defpackage.s0
    public s0 z() {
        boolean z = this.b;
        d0[] d0VarArr = this.a;
        if (!z) {
            d0VarArr = (d0[]) d0VarArr.clone();
            E(d0VarArr);
        }
        e07 e07Var = new e07(0, true, d0VarArr);
        e07Var.d = -1;
        return e07Var;
    }

    public w0(e0 e0Var) {
        if (e0Var != null) {
            d0[] k = e0Var.k();
            this.a = k;
            this.b = k.length < 2;
            return;
        }
        jj4.j("'elementVector' cannot be null");
        throw null;
    }

    public w0(d07 d07Var) {
        this.a = new d0[]{d07Var};
        this.b = true;
    }

    public w0(boolean z, d0[] d0VarArr) {
        this.a = d0VarArr;
        this.b = z || d0VarArr.length < 2;
    }

    public w0() {
        this.a = e0.e;
        this.b = true;
    }
}
