package defpackage;

/* loaded from: classes10.dex */
public final class vf11 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(g001 g001Var, f001 f001Var) {
        if (this.c > 0) {
            g001Var.c(this.d, this.e, this.f, this.g, f001Var);
            this.c = 0;
        }
    }

    public final void b(g001 g001Var, long j, int i, int i2, int i3, f001 f001Var) {
        d6z.w("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(g001Var, f001Var);
            }
        }
    }

    public final void c(c5p c5pVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        c5pVar.g(0, 10, bArr);
        c5pVar.J();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r1 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r1 == 0) {
            return;
        }
        this.b = true;
    }
}
