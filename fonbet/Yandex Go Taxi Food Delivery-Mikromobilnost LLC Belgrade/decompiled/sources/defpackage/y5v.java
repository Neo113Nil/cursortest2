package defpackage;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class y5v {
    public final ef90 a = new ef90(10);

    public final w820 a(c5p c5pVar, u5v u5vVar) {
        ef90 ef90Var = this.a;
        w820 w820Var = null;
        int i = 0;
        while (true) {
            try {
                c5pVar.g(0, 10, ef90Var.a);
                ef90Var.K(0);
                if (ef90Var.B() != 4801587) {
                    break;
                }
                ef90Var.L(3);
                int x = ef90Var.x();
                int i2 = x + 10;
                if (w820Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(ef90Var.a, 0, bArr, 0, 10);
                    c5pVar.g(10, x, bArr);
                    w820Var = new w5v(u5vVar).c(i2, bArr);
                } else {
                    c5pVar.N(x);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c5pVar.J();
        c5pVar.N(i);
        return w820Var;
    }
}
