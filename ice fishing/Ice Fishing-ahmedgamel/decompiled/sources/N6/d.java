package N6;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2049e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f2050f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2051a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2052b;

    /* renamed from: c, reason: collision with root package name */
    public int f2053c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f2054d;

    static {
        int i = 51200;
        try {
            String b9 = k6.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b9.isEmpty()) {
                i = Integer.parseInt(b9);
            }
        } catch (Throwable unused) {
        }
        f2049e = i;
        f2050f = new ThreadLocal();
    }

    public d(OutputStream outputStream) {
        int i = f2049e;
        this.f2051a = new byte[i];
        this.f2052b = i;
        this.f2054d = outputStream;
    }

    public static int a(long j6) {
        int i;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j6) != 0) {
            i += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i + 1 : i;
    }

    public static int b(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public final void c() {
        this.f2054d.write(this.f2051a, 0, this.f2053c);
        this.f2053c = 0;
    }

    public final void d(int i) {
        if (this.f2052b - this.f2053c < i) {
            c();
        }
    }

    public final void e(byte b9) {
        if (this.f2053c == this.f2052b) {
            c();
        }
        int i = this.f2053c;
        this.f2053c = i + 1;
        this.f2051a[i] = b9;
    }

    public final void f(int i, byte[] bArr) {
        int i4 = this.f2053c;
        int i6 = this.f2052b;
        int i9 = i6 - i4;
        byte[] bArr2 = this.f2051a;
        if (i9 >= i) {
            System.arraycopy(bArr, 0, bArr2, i4, i);
            this.f2053c += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i9);
        int i10 = i - i9;
        this.f2053c = i6;
        c();
        if (i10 > i6) {
            this.f2054d.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f2053c = i10;
        }
    }

    public final void g(long j6) {
        d(8);
        int i = this.f2053c;
        int i4 = i + 1;
        this.f2053c = i4;
        byte[] bArr = this.f2051a;
        bArr[i] = (byte) (j6 & 255);
        int i6 = i + 2;
        this.f2053c = i6;
        bArr[i4] = (byte) ((j6 >> 8) & 255);
        int i9 = i + 3;
        this.f2053c = i9;
        bArr[i6] = (byte) ((j6 >> 16) & 255);
        int i10 = i + 4;
        this.f2053c = i10;
        bArr[i9] = (byte) (255 & (j6 >> 24));
        int i11 = i + 5;
        this.f2053c = i11;
        bArr[i10] = (byte) (((int) (j6 >> 32)) & com.anythink.basead.exoplayer.k.p.f9259b);
        int i12 = i + 6;
        this.f2053c = i12;
        bArr[i11] = (byte) (((int) (j6 >> 40)) & com.anythink.basead.exoplayer.k.p.f9259b);
        int i13 = i + 7;
        this.f2053c = i13;
        bArr[i12] = (byte) (((int) (j6 >> 48)) & com.anythink.basead.exoplayer.k.p.f9259b);
        this.f2053c = i + 8;
        bArr[i13] = (byte) (((int) (j6 >> 56)) & com.anythink.basead.exoplayer.k.p.f9259b);
    }

    public final void h(int i) {
        d(5);
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f2051a;
            if (i4 == 0) {
                int i6 = this.f2053c;
                this.f2053c = i6 + 1;
                bArr[i6] = (byte) i;
                return;
            } else {
                int i9 = this.f2053c;
                this.f2053c = i9 + 1;
                bArr[i9] = (byte) ((i & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                i >>>= 7;
            }
        }
    }

    public final void i(long j6) {
        d(10);
        while (true) {
            long j9 = (-128) & j6;
            byte[] bArr = this.f2051a;
            if (j9 == 0) {
                int i = this.f2053c;
                this.f2053c = i + 1;
                bArr[i] = (byte) j6;
                return;
            } else {
                int i4 = this.f2053c;
                this.f2053c = i4 + 1;
                bArr[i4] = (byte) ((((int) j6) & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                j6 >>>= 7;
            }
        }
    }
}
