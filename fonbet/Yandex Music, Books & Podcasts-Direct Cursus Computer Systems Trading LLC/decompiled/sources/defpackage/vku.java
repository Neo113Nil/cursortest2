package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final class vku implements r2c {
    public t2c a;
    public azs b;
    public tku e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        tku tkuVar = this.e;
        if (tkuVar != null) {
            tkuVar.b(j2);
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        return cb0.t(s2cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x017a, code lost:
    
        if (r13 != 65534) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
    
        if (r17 == 32) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(s2c s2cVar, ci0 ci0Var) {
        byte[] bArr;
        int i;
        vq1.B(this.b);
        int i2 = dvt.a;
        int i3 = this.c;
        int i4 = 4;
        if (i3 == 0) {
            vq1.A(s2cVar.getPosition() == 0);
            int i5 = this.f;
            if (i5 != -1) {
                s2cVar.y(i5);
                this.c = 4;
                return 0;
            }
            if (!cb0.t(s2cVar)) {
                throw r7k.a(null, "Unsupported or unrecognized wav file type.");
            }
            s2cVar.y((int) (s2cVar.s() - s2cVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long j = -1;
        if (i3 == 1) {
            d7k d7kVar = new d7k(8);
            mdr d = mdr.d(s2cVar, d7kVar);
            if (d.a != 1685272116) {
                s2cVar.n();
            } else {
                s2cVar.u(8);
                d7kVar.H(0);
                s2cVar.A(d7kVar.a, 0, 8);
                j = d7kVar.k();
                s2cVar.y(((int) d.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    e7o.n();
                    return 0;
                }
                vq1.A(this.g != -1);
                long position = this.g - s2cVar.getPosition();
                tku tkuVar = this.e;
                tkuVar.getClass();
                return tkuVar.c(s2cVar, position) ? -1 : 0;
            }
            s2cVar.n();
            mdr E = cb0.E(1684108385, s2cVar, new d7k(8));
            s2cVar.y(8);
            Pair create = Pair.create(Long.valueOf(s2cVar.getPosition()), Long.valueOf(E.b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j2 = this.d;
            if (j2 != -1 && longValue == 4294967295L) {
                longValue = j2;
            }
            this.g = this.f + longValue;
            long length = s2cVar.getLength();
            if (length != -1 && this.g > length) {
                vq1.n0("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            tku tkuVar2 = this.e;
            tkuVar2.getClass();
            tkuVar2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        d7k d7kVar2 = new d7k(16);
        long j3 = cb0.E(1718449184, s2cVar, d7kVar2).b;
        vq1.A(j3 >= 16);
        s2cVar.A(d7kVar2.a, 0, 16);
        d7kVar2.H(0);
        int o = d7kVar2.o();
        int o2 = d7kVar2.o();
        int n = d7kVar2.n();
        d7kVar2.n();
        int o3 = d7kVar2.o();
        int o4 = d7kVar2.o();
        int i6 = ((int) j3) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            s2cVar.A(bArr, 0, i6);
        } else {
            bArr = dvt.c;
        }
        byte[] bArr2 = bArr;
        s2cVar.y((int) (s2cVar.s() - s2cVar.getPosition()));
        bh3 bh3Var = new bh3(o, o2, n, o3, o4, bArr2);
        if (o == 17) {
            this.e = new sku(this.a, this.b, bh3Var);
        } else if (o == 6) {
            this.e = new uku(this.a, this.b, bh3Var, "audio/g711-alaw", -1);
        } else if (o == 7) {
            this.e = new uku(this.a, this.b, bh3Var, "audio/g711-mlaw", -1);
        } else {
            if (o != 1) {
                if (o != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw r7k.c("Unsupported WAV format type: " + o);
                }
                this.e = new uku(this.a, this.b, bh3Var, "audio/raw", i);
            }
            i4 = dvt.I(o4);
            i = i4;
            if (i != 0) {
            }
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.a = t2cVar;
        this.b = t2cVar.M(0, 1);
        t2cVar.K();
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
