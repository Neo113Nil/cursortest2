package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* loaded from: classes10.dex */
public final class tv60 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final ef90 g = new ef90(255);

    public final boolean a(c5p c5pVar, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        ef90 ef90Var = this.g;
        ef90Var.H(27);
        try {
            z2 = c5pVar.H(ef90Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && ef90Var.A() == 1332176723) {
            if (ef90Var.y() == 0) {
                this.a = ef90Var.y();
                this.b = ef90Var.n();
                ef90Var.p();
                ef90Var.p();
                ef90Var.p();
                int y = ef90Var.y();
                this.c = y;
                this.d = y + 27;
                ef90Var.H(y);
                try {
                    z3 = c5pVar.H(ef90Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int y2 = ef90Var.y();
                        this.f[i] = y2;
                        this.e += y2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(c5p c5pVar, long j) {
        boolean z;
        d6z.l(c5pVar.getPosition() == c5pVar.L());
        ef90 ef90Var = this.g;
        ef90Var.H(4);
        while (true) {
            if (j != -1 && c5pVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = c5pVar.H(ef90Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            ef90Var.K(0);
            if (ef90Var.A() == 1332176723) {
                c5pVar.J();
                return true;
            }
            c5pVar.O(1);
        }
        do {
            if (j != -1 && c5pVar.getPosition() >= j) {
                break;
            }
        } while (c5pVar.z(1) != -1);
        return false;
    }
}
