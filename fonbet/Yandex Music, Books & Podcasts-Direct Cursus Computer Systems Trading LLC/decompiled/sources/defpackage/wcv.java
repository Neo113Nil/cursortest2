package defpackage;

import java.io.Closeable;
import java.util.Random;
import java.util.zip.Deflater;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class wcv implements Closeable {
    public final gj3 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final hi3 f;
    public final hi3 g;
    public boolean h;
    public gzh i;
    public final byte[] j;
    public final ei3 k;

    public wcv(gj3 gj3Var, Random random, boolean z, boolean z2, long j) {
        gj3Var.getClass();
        this.a = gj3Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = new hi3();
        this.g = gj3Var.h();
        this.j = new byte[4];
        this.k = new ei3();
    }

    public final void a(int i, pn3 pn3Var) {
        if (this.h) {
            kac.f("closed");
            return;
        }
        int d = pn3Var.d();
        if (d > 125) {
            xq0.x("Payload size must be less than or equal to 125");
            return;
        }
        hi3 hi3Var = this.g;
        hi3Var.M0(i | 128);
        hi3Var.M0(d | 128);
        byte[] bArr = this.j;
        bArr.getClass();
        this.b.nextBytes(bArr);
        hi3Var.write(bArr, 0, bArr.length);
        if (d > 0) {
            long j = hi3Var.b;
            hi3Var.L0(pn3Var);
            ei3 ei3Var = this.k;
            ei3Var.getClass();
            hi3Var.S(ei3Var);
            ei3Var.b(j);
            uwf.K(ei3Var, bArr);
            ei3Var.close();
        }
        this.a.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, pn3 pn3Var) {
        long j;
        if (this.h) {
            kac.f("closed");
            return;
        }
        hi3 hi3Var = this.f;
        hi3Var.L0(pn3Var);
        int i2 = i | 128;
        if (this.c && pn3Var.d() >= this.e) {
            gzh gzhVar = this.i;
            if (gzhVar == null) {
                gzhVar = new gzh(0, this.d);
                this.i = gzhVar;
            }
            vu7 vu7Var = (vu7) gzhVar.e;
            hi3 hi3Var2 = gzhVar.c;
            if (hi3Var2.b != 0) {
                xq0.x("Failed requirement.");
                return;
            }
            if (gzhVar.b) {
                ((Deflater) gzhVar.d).reset();
            }
            vu7Var.t0(hi3Var, hi3Var.b);
            vu7Var.flush();
            if (hi3Var2.A0(hi3Var2.b - r3.a.length, hzh.a)) {
                long j2 = hi3Var2.b - 4;
                ei3 S = hi3Var2.S(ox6.b);
                try {
                    S.a(j2);
                    S.close();
                } finally {
                }
            } else {
                hi3Var2.M0(0);
            }
            hi3Var.t0(hi3Var2, hi3Var2.b);
            i2 = i | 192;
        }
        long j3 = hi3Var.b;
        hi3 hi3Var3 = this.g;
        hi3Var3.M0(i2);
        if (j3 <= 125) {
            hi3Var3.M0(((int) j3) | 128);
        } else {
            if (j3 > 65535) {
                hi3Var3.M0(KotlinVersion.MAX_COMPONENT_VALUE);
                xap K0 = hi3Var3.K0(8);
                byte[] bArr = K0.a;
                int i3 = K0.c;
                bArr[i3] = (byte) ((j3 >>> 56) & 255);
                j = 0;
                bArr[i3 + 1] = (byte) ((j3 >>> 48) & 255);
                bArr[i3 + 2] = (byte) ((j3 >>> 40) & 255);
                bArr[i3 + 3] = (byte) ((j3 >>> 32) & 255);
                bArr[i3 + 4] = (byte) ((j3 >>> 24) & 255);
                bArr[i3 + 5] = (byte) ((j3 >>> 16) & 255);
                bArr[i3 + 6] = (byte) ((j3 >>> 8) & 255);
                bArr[i3 + 7] = (byte) (j3 & 255);
                K0.c = i3 + 8;
                hi3Var3.b += 8;
                byte[] bArr2 = this.j;
                bArr2.getClass();
                this.b.nextBytes(bArr2);
                hi3Var3.write(bArr2, 0, bArr2.length);
                if (j3 > j) {
                    ei3 ei3Var = this.k;
                    ei3Var.getClass();
                    hi3Var.S(ei3Var);
                    ei3Var.b(j);
                    uwf.K(ei3Var, bArr2);
                    ei3Var.close();
                }
                hi3Var3.t0(hi3Var, j3);
                this.a.v();
            }
            hi3Var3.M0(254);
            hi3Var3.Q0((int) j3);
        }
        j = 0;
        byte[] bArr22 = this.j;
        bArr22.getClass();
        this.b.nextBytes(bArr22);
        hi3Var3.write(bArr22, 0, bArr22.length);
        if (j3 > j) {
        }
        hi3Var3.t0(hi3Var, j3);
        this.a.v();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gzh gzhVar = this.i;
        if (gzhVar != null) {
            gzhVar.close();
        }
    }
}
