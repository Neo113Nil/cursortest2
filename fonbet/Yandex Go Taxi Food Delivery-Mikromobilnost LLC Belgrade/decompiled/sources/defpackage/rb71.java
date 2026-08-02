package defpackage;

import java.io.EOFException;
import yads.cs1;

/* loaded from: classes7.dex */
public final class rb71 {
    public final dl81 a = new dl81(10);

    public final cs1 a(w971 w971Var, yx61 yx61Var) {
        dl81 dl81Var = this.a;
        cs1 cs1Var = null;
        int i = 0;
        while (true) {
            try {
                w971Var.I(dl81Var.a, 0, 10, false);
                dl81Var.m(0);
                if (dl81Var.u() != 4801587) {
                    break;
                }
                dl81Var.m(dl81Var.b + 3);
                int r = dl81Var.r();
                int i2 = r + 10;
                if (cs1Var == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(dl81Var.a, 0, bArr, 0, 10);
                    w971Var.I(bArr, 10, r, false);
                    cs1Var = new n571(yx61Var).i(i2, bArr);
                } else {
                    w971Var.c(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        w971Var.y = 0;
        w971Var.c(i, false);
        return cs1Var;
    }
}
