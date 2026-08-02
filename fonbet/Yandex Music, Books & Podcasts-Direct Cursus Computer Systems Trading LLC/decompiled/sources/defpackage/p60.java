package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p60 implements r2c {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final z48 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public t2c j;
    public azs k;
    public azs l;
    public fap m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        int i = dvt.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public p60() {
        z48 z48Var = new z48();
        this.b = z48Var;
        this.l = z48Var;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        fap fapVar = this.m;
        if (!(fapVar instanceof wie)) {
            if (j == 0 || !(fapVar instanceof h86)) {
                this.i = 0L;
                return;
            } else {
                this.i = (Math.max(0L, j - ((h86) fapVar).b) * 8000000) / r7.e;
                return;
            }
        }
        wie wieVar = (wie) fapVar;
        nug nugVar = wieVar.b;
        long d = nugVar.b == 0 ? -9223372036854775807L : nugVar.d(dvt.b(wieVar.a, j));
        this.i = d;
        if (Math.abs(this.o - d) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    public final int c(s2c s2cVar) {
        boolean z;
        s2cVar.n();
        byte[] bArr = this.a;
        s2cVar.A(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw r7k.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw r7k.a(null, sb.toString());
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        return e(s2cVar);
    }

    public final boolean e(s2c s2cVar) {
        s2cVar.n();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        s2cVar.A(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            s2cVar.y(bArr.length);
            return true;
        }
        s2cVar.n();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        s2cVar.A(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        s2cVar.y(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        s2c s2cVar2;
        vq1.B(this.k);
        int i = dvt.a;
        if (s2cVar.getPosition() == 0 && !e(s2cVar)) {
            throw r7k.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str = z ? "audio/amr-wb" : "audio/amr";
            String str2 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            azs azsVar = this.k;
            bsc bscVar = new bsc();
            bscVar.l = l5i.p(str);
            bscVar.m = l5i.p(str2);
            bscVar.n = i3;
            bscVar.C = 1;
            bscVar.D = i2;
            eta.o(bscVar, azsVar);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int c = c(s2cVar);
                this.e = c;
                this.f = c;
                if (this.g == -1) {
                    s2cVar.getPosition();
                    this.g = this.e;
                }
                if (this.g == this.e) {
                    this.h++;
                }
                fap fapVar = this.m;
                if (fapVar instanceof wie) {
                    wie wieVar = (wie) fapVar;
                    long j = this.i + this.d + 20000;
                    long position = s2cVar.getPosition() + this.e;
                    nug nugVar = wieVar.b;
                    int i5 = nugVar.b;
                    if (i5 == 0 || j - nugVar.d(i5 - 1) >= 100000) {
                        nug nugVar2 = wieVar.a;
                        nug nugVar3 = wieVar.b;
                        if (nugVar3.b == 0 && j > 0) {
                            nugVar2.a(0L);
                            nugVar3.a(0L);
                        }
                        nugVar2.a(position);
                        nugVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
            } catch (EOFException unused) {
                s2cVar2 = s2cVar;
            }
        }
        s2cVar2 = s2cVar;
        int c2 = this.l.c(s2cVar2, this.f, true);
        if (c2 != -1) {
            int i6 = this.f - c2;
            this.f = i6;
            if (i6 <= 0) {
                this.l.a(this.d + this.i, 1, this.e, 0, null);
                this.d += 20000;
            }
            s2cVar2.getLength();
            if (this.m == null) {
                zg2 zg2Var = new zg2(-9223372036854775807L);
                this.m = zg2Var;
                this.j.E(zg2Var);
            }
            if (i4 == -1) {
                fap fapVar2 = this.m;
                if (fapVar2 instanceof wie) {
                    ((wie) fapVar2).c = this.i + this.d;
                    this.j.E(fapVar2);
                    this.k.getClass();
                }
            }
            return i4;
        }
        i4 = -1;
        s2cVar2.getLength();
        if (this.m == null) {
        }
        if (i4 == -1) {
        }
        return i4;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.j = t2cVar;
        azs M = t2cVar.M(0, 1);
        this.k = M;
        this.l = M;
        t2cVar.K();
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
