package defpackage;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class sv60 {
    public final tv60 a = new tv60();
    public final ef90 b = new ef90(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            tv60 tv60Var = this.a;
            if (i5 >= tv60Var.c) {
                break;
            }
            int[] iArr = tv60Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(c5p c5pVar) {
        int i;
        d6z.x(c5pVar != null);
        boolean z = this.e;
        ef90 ef90Var = this.b;
        if (z) {
            this.e = false;
            ef90Var.H(0);
        }
        while (!this.e) {
            int i2 = this.c;
            tv60 tv60Var = this.a;
            if (i2 < 0) {
                if (tv60Var.b(c5pVar, -1L) && tv60Var.a(c5pVar, true)) {
                    int i3 = tv60Var.d;
                    if ((tv60Var.a & 1) == 1 && ef90Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        c5pVar.O(i3);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(this.c);
            int i4 = this.c + this.d;
            if (a > 0) {
                ef90Var.c(ef90Var.c + a);
                try {
                    c5pVar.readFully(ef90Var.a, ef90Var.c, a);
                    ef90Var.J(ef90Var.c + a);
                    this.e = tv60Var.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == tv60Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
