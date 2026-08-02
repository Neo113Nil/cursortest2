package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class snj {
    public final tnj a = new tnj();
    public final d7k b = new d7k(new byte[65025], 0);
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
            tnj tnjVar = this.a;
            if (i5 >= tnjVar.c) {
                break;
            }
            int[] iArr = tnjVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(s2c s2cVar) {
        int i;
        vq1.A(s2cVar != null);
        boolean z = this.e;
        d7k d7kVar = this.b;
        if (z) {
            this.e = false;
            d7kVar.E(0);
        }
        while (!this.e) {
            int i2 = this.c;
            tnj tnjVar = this.a;
            if (i2 < 0) {
                if (tnjVar.b(s2cVar, -1L) && tnjVar.a(s2cVar, true)) {
                    int i3 = tnjVar.d;
                    if ((tnjVar.a & 1) == 1 && d7kVar.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        s2cVar.y(i3);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(this.c);
            int i4 = this.c + this.d;
            if (a > 0) {
                d7kVar.b(d7kVar.c + a);
                try {
                    s2cVar.readFully(d7kVar.a, d7kVar.c, a);
                    d7kVar.G(d7kVar.c + a);
                    this.e = tnjVar.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == tnjVar.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
