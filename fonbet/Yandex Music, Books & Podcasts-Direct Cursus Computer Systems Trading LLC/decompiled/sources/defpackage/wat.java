package defpackage;

/* loaded from: classes.dex */
public final class wat {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(azs azsVar, zys zysVar) {
        if (this.c > 0) {
            azsVar.a(this.d, this.e, this.f, this.g, zysVar);
            this.c = 0;
        }
    }

    public final void b(azs azsVar, long j, int i, int i2, int i3, zys zysVar) {
        vq1.z("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
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
                a(azsVar, zysVar);
            }
        }
    }

    public final void c(s2c s2cVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        s2cVar.A(bArr, 0, 10);
        s2cVar.n();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.b = true;
    }
}
