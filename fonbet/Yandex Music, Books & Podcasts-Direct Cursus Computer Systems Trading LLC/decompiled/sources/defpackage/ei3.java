package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ei3 implements Closeable {
    public hi3 a;
    public boolean b;
    public xap c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void a(long j) {
        hi3 hi3Var = this.a;
        if (hi3Var == null) {
            xq0.q("not attached to a buffer");
            return;
        }
        if (!this.b) {
            xq0.q("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = hi3Var.b;
        if (j <= j2) {
            if (j < 0) {
                xq0.o(dfi.d(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                xap xapVar = hi3Var.a;
                xapVar.getClass();
                xap xapVar2 = xapVar.g;
                xapVar2.getClass();
                int i = xapVar2.c;
                long j4 = i - xapVar2.b;
                if (j4 > j3) {
                    xapVar2.c = i - ((int) j3);
                    break;
                } else {
                    hi3Var.a = xapVar2.a();
                    lbp.a(xapVar2);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                xap K0 = hi3Var.K0(i2);
                int min = (int) Math.min(j5, 8192 - K0.c);
                int i3 = K0.c + min;
                K0.c = i3;
                j5 -= min;
                if (z) {
                    this.c = K0;
                    this.d = j2;
                    this.e = K0.a;
                    this.f = i3 - min;
                    this.g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        hi3Var.b = j;
    }

    public final int b(long j) {
        hi3 hi3Var = this.a;
        if (hi3Var == null) {
            xq0.q("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = hi3Var.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                xap xapVar = hi3Var.a;
                xap xapVar2 = this.c;
                long j3 = 0;
                if (xapVar2 != null) {
                    long j4 = this.d - (this.f - xapVar2.b);
                    if (j4 > j) {
                        xapVar2 = xapVar;
                        xapVar = xapVar2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    xapVar2 = xapVar;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        xapVar2.getClass();
                        long j5 = (xapVar2.c - xapVar2.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        xapVar2 = xapVar2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        xapVar.getClass();
                        xapVar = xapVar.g;
                        xapVar.getClass();
                        j2 -= xapVar.c - xapVar.b;
                    }
                    xapVar2 = xapVar;
                    j3 = j2;
                }
                if (this.b) {
                    xapVar2.getClass();
                    if (xapVar2.d) {
                        byte[] bArr = xapVar2.a;
                        xap xapVar3 = new xap(Arrays.copyOf(bArr, bArr.length), xapVar2.b, xapVar2.c, false, true);
                        if (hi3Var.a == xapVar2) {
                            hi3Var.a = xapVar3;
                        }
                        xapVar2.b(xapVar3);
                        xap xapVar4 = xapVar3.g;
                        xapVar4.getClass();
                        xapVar4.a();
                        xapVar2 = xapVar3;
                    }
                }
                this.c = xapVar2;
                this.d = j;
                xapVar2.getClass();
                this.e = xapVar2.a;
                int i = xapVar2.b + ((int) (j - j3));
                this.f = i;
                int i2 = xapVar2.c;
                this.g = i2;
                return i2 - i;
            }
        }
        StringBuilder l = tlm.l(j, "offset=", " > size=");
        l.append(hi3Var.b);
        throw new ArrayIndexOutOfBoundsException(l.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            xq0.q("not attached to a buffer");
            return;
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.g = -1;
    }
}
