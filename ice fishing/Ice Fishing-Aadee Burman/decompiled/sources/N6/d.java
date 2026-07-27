package N6;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f1961e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f1962f;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1964b;

    /* renamed from: c, reason: collision with root package name */
    public int f1965c;

    /* renamed from: d, reason: collision with root package name */
    public OutputStream f1966d;

    static {
        int i = 51200;
        try {
            String b9 = k6.d.b("otel.experimental.otlp.buffer-size", "");
            if (!b9.isEmpty()) {
                i = Integer.parseInt(b9);
            }
        } catch (Throwable unused) {
        }
        f1961e = i;
        f1962f = new ThreadLocal();
    }

    public d(OutputStream outputStream) {
        int i = f1961e;
        this.f1963a = new byte[i];
        this.f1964b = i;
        this.f1966d = outputStream;
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
        this.f1966d.write(this.f1963a, 0, this.f1965c);
        this.f1965c = 0;
    }

    public final void d(int i) {
        if (this.f1964b - this.f1965c < i) {
            c();
        }
    }

    public final void e(byte b9) {
        if (this.f1965c == this.f1964b) {
            c();
        }
        int i = this.f1965c;
        this.f1965c = i + 1;
        this.f1963a[i] = b9;
    }

    public final void f(int i, byte[] bArr) {
        int i6 = this.f1965c;
        int i9 = this.f1964b;
        int i10 = i9 - i6;
        byte[] bArr2 = this.f1963a;
        if (i10 >= i) {
            System.arraycopy(bArr, 0, bArr2, i6, i);
            this.f1965c += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i6, i10);
        int i11 = i - i10;
        this.f1965c = i9;
        c();
        if (i11 > i9) {
            this.f1966d.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f1965c = i11;
        }
    }

    public final void g(long j6) {
        d(8);
        int i = this.f1965c;
        int i6 = i + 1;
        this.f1965c = i6;
        byte[] bArr = this.f1963a;
        bArr[i] = (byte) (j6 & 255);
        int i9 = i + 2;
        this.f1965c = i9;
        bArr[i6] = (byte) ((j6 >> 8) & 255);
        int i10 = i + 3;
        this.f1965c = i10;
        bArr[i9] = (byte) ((j6 >> 16) & 255);
        int i11 = i + 4;
        this.f1965c = i11;
        bArr[i10] = (byte) (255 & (j6 >> 24));
        int i12 = i + 5;
        this.f1965c = i12;
        bArr[i11] = (byte) (((int) (j6 >> 32)) & com.anythink.basead.exoplayer.k.p.f8473b);
        int i13 = i + 6;
        this.f1965c = i13;
        bArr[i12] = (byte) (((int) (j6 >> 40)) & com.anythink.basead.exoplayer.k.p.f8473b);
        int i14 = i + 7;
        this.f1965c = i14;
        bArr[i13] = (byte) (((int) (j6 >> 48)) & com.anythink.basead.exoplayer.k.p.f8473b);
        this.f1965c = i + 8;
        bArr[i14] = (byte) (((int) (j6 >> 56)) & com.anythink.basead.exoplayer.k.p.f8473b);
    }

    public final void h(int i) {
        d(5);
        while (true) {
            int i6 = i & (-128);
            byte[] bArr = this.f1963a;
            if (i6 == 0) {
                int i9 = this.f1965c;
                this.f1965c = i9 + 1;
                bArr[i9] = (byte) i;
                return;
            } else {
                int i10 = this.f1965c;
                this.f1965c = i10 + 1;
                bArr[i10] = (byte) ((i & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                i >>>= 7;
            }
        }
    }

    public final void i(long j6) {
        d(10);
        while (true) {
            long j9 = (-128) & j6;
            byte[] bArr = this.f1963a;
            if (j9 == 0) {
                int i = this.f1965c;
                this.f1965c = i + 1;
                bArr[i] = (byte) j6;
                return;
            } else {
                int i6 = this.f1965c;
                this.f1965c = i6 + 1;
                bArr[i6] = (byte) ((((int) j6) & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                j6 >>>= 7;
            }
        }
    }
}
