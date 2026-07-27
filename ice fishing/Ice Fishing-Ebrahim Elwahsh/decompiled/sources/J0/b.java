package J0;

import com.google.android.gms.internal.ads.C2759Ri;
import com.google.android.gms.internal.ads.InterfaceC4291zi;
import g1.C4524d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b implements InterfaceC4291zi {

    /* renamed from: a, reason: collision with root package name */
    public int f1289a;

    /* renamed from: b, reason: collision with root package name */
    public int f1290b;

    /* renamed from: c, reason: collision with root package name */
    public int f1291c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1292d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1293e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1294f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1295g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1296h;

    public b(C2759Ri c2759Ri) {
        Objects.requireNonNull(c2759Ri);
        this.f1296h = c2759Ri;
        int i = c2759Ri.f27407h;
        this.f1292d = new short[i];
        int i4 = c2759Ri.f27401b;
        this.f1293e = new short[i * i4];
        this.f1294f = new short[i * i4];
        this.f1295g = new short[i * i4];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public int a() {
        return 2;
    }

    public int b(short[] sArr, int i, int i4, int i9) {
        int i10 = 1;
        int i11 = com.anythink.basead.exoplayer.k.p.f8630b;
        int i12 = 0;
        int i13 = 0;
        while (i4 <= i9) {
            int i14 = 0;
            for (int i15 = 0; i15 < i4; i15++) {
                int i16 = ((C2759Ri) this.f1296h).f27401b * i;
                i14 += Math.abs(sArr[i16 + i15] - sArr[(i16 + i4) + i15]);
            }
            int i17 = i14 * i12;
            int i18 = i10 * i4;
            if (i17 < i18) {
                i10 = i14;
            }
            if (i17 < i18) {
                i12 = i4;
            }
            int i19 = i14 * i11;
            int i20 = i13 * i4;
            if (i19 > i20) {
                i13 = i14;
            }
            if (i19 > i20) {
                i11 = i4;
            }
            i4++;
        }
        this.f1289a = i10 / i12;
        this.f1290b = i13 / i11;
        return i12;
    }

    public short[] c(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i9 = ((C2759Ri) this.f1296h).f27401b;
        int i10 = length / i9;
        return i + i4 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i4) * i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void d(int i) {
        this.f1293e = c((short[]) this.f1293e, ((C2759Ri) this.f1296h).f27408j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void e() {
        this.f1291c = 0;
        this.f1289a = 0;
        this.f1290b = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public int f(int i, int i4, int i9) {
        return b((short[]) this.f1293e, i, i4, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void g(int i, long j9, long j10) {
        int i4 = 0;
        while (true) {
            C2759Ri c2759Ri = (C2759Ri) this.f1296h;
            int i9 = c2759Ri.f27401b;
            if (i4 >= i9) {
                return;
            }
            short[] sArr = (short[]) this.f1294f;
            int i10 = c2759Ri.f27409k;
            short[] sArr2 = (short[]) this.f1295g;
            int i11 = (i * i9) + i4;
            short s3 = sArr2[i11];
            short s6 = sArr2[i11 + i9];
            long j11 = c2759Ri.f27412n * j9;
            long j12 = c2759Ri.f27411m * j10;
            long j13 = (r2 + 1) * j10;
            int i12 = i4;
            long j14 = j13 - j12;
            long j15 = j13 - j11;
            sArr[(i10 * i9) + i12] = (short) ((((j14 - j15) * s6) + (j15 * s3)) / j14);
            i4 = i12 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void h(int i) {
        this.f1295g = c((short[]) this.f1295g, ((C2759Ri) this.f1296h).f27410l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public boolean i() {
        int i = this.f1289a;
        return i != 0 && ((C2759Ri) this.f1296h).f27414p != 0 && this.f1290b <= i * 3 && i + i > this.f1291c * 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void j(int i, int i4, int i9, int i10, int i11) {
        short[] sArr = (short[]) this.f1294f;
        short[] sArr2 = (short[]) this.f1293e;
        for (int i12 = 0; i12 < i4; i12++) {
            int i13 = (i10 * i4) + i12;
            int i14 = (i11 * i4) + i12;
            int i15 = (i9 * i4) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i15] = (short) (((sArr2[i14] * i16) + ((i - i16) * sArr2[i13])) / i);
                i15 += i4;
                i13 += i4;
                i14 += i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void k(int i, int i4) {
        int i9;
        short[] sArr = (short[]) this.f1293e;
        int i10 = 0;
        while (true) {
            C2759Ri c2759Ri = (C2759Ri) this.f1296h;
            if (i10 >= c2759Ri.f27407h / i4) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = c2759Ri.f27401b;
                i9 = i13 * i4;
                if (i11 < i9) {
                    i12 += sArr[(i9 * i10) + (i13 * i) + i11];
                    i11++;
                }
            }
            ((short[]) this.f1292d)[i10] = (short) (i12 / i9);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void l() {
        this.f1291c = this.f1289a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void m(int i, ByteBuffer byteBuffer) {
        C2759Ri c2759Ri = (C2759Ri) this.f1296h;
        byteBuffer.asShortBuffer().get((short[]) this.f1293e, c2759Ri.f27408j * c2759Ri.f27401b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public /* synthetic */ Object n() {
        return (short[]) this.f1294f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void o(int i, int i4) {
        for (int i9 = 0; i9 < ((C2759Ri) this.f1296h).f27401b * i4; i9++) {
            ((short[]) this.f1293e)[i + i9] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public int p(int i, int i4) {
        return b((short[]) this.f1292d, 0, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void q(int i, ByteBuffer byteBuffer) {
        C2759Ri c2759Ri = (C2759Ri) this.f1296h;
        byteBuffer.asShortBuffer().put((short[]) this.f1294f, 0, c2759Ri.f27401b * i);
        byteBuffer.position(((i + i) * c2759Ri.f27401b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public /* synthetic */ Object r() {
        return (short[]) this.f1295g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public /* synthetic */ Object t() {
        return (short[]) this.f1293e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4291zi
    public void u(int i) {
        this.f1294f = c((short[]) this.f1294f, ((C2759Ri) this.f1296h).f27409k, i);
    }

    public b(W3.e eVar) {
        this.f1292d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0314a(false));
        this.f1293e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0314a(true));
        String str = A.f1286a;
        this.f1294f = new z();
        this.f1295g = new C3.e();
        this.f1296h = new C4524d(6);
        this.f1289a = 4;
        this.f1290b = Integer.MAX_VALUE;
        this.f1291c = 20;
    }
}
