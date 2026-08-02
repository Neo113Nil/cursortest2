package defpackage;

import java.io.InputStream;

/* loaded from: classes5.dex */
public final class fi3 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij3 b;

    public /* synthetic */ fi3(ij3 ij3Var, int i) {
        this.a = i;
        this.b = ij3Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((hi3) this.b).b, Integer.MAX_VALUE);
            default:
                ikn iknVar = (ikn) this.b;
                if (!iknVar.c) {
                    return (int) Math.min(iknVar.b.b, Integer.MAX_VALUE);
                }
                kac.f("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ikn) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                hi3 hi3Var = (hi3) this.b;
                if (hi3Var.b > 0) {
                    return hi3Var.readByte() & 255;
                }
                return -1;
            default:
                ikn iknVar = (ikn) this.b;
                hi3 hi3Var2 = iknVar.b;
                if (iknVar.c) {
                    kac.f("closed");
                    return 0;
                }
                if (hi3Var2.b == 0 && iknVar.a.e0(hi3Var2, 8192L) == -1) {
                    return -1;
                }
                return hi3Var2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((hi3) this.b) + ".inputStream()";
            default:
                return ((ikn) this.b) + ".inputStream()";
        }
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((hi3) this.b).read(bArr, i, i2);
            default:
                ikn iknVar = (ikn) this.b;
                hi3 hi3Var = iknVar.b;
                if (!iknVar.c) {
                    ox6.A(bArr.length, i, i2);
                    if (hi3Var.b == 0 && iknVar.a.e0(hi3Var, 8192L) == -1) {
                        return -1;
                    }
                    return hi3Var.read(bArr, i, i2);
                }
                kac.f("closed");
                return 0;
        }
    }
}
