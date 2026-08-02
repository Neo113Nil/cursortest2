package J0;

import com.google.android.gms.internal.ads.C2695Mi;
import com.google.android.gms.internal.ads.InterfaceC2491Ai;
import i1.C4586c;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b implements InterfaceC2491Ai {

    /* renamed from: a, reason: collision with root package name */
    public int f1393a;

    /* renamed from: b, reason: collision with root package name */
    public int f1394b;

    /* renamed from: c, reason: collision with root package name */
    public int f1395c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1396d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1397e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1398f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1399g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1400h;

    public b(C2695Mi c2695Mi) {
        Objects.requireNonNull(c2695Mi);
        this.f1400h = c2695Mi;
        int i = c2695Mi.f27101h;
        this.f1396d = new short[i];
        int i4 = c2695Mi.f27095b;
        this.f1397e = new short[i * i4];
        this.f1398f = new short[i * i4];
        this.f1399g = new short[i * i4];
    }

    public int a(short[] sArr, int i, int i4, int i6) {
        int i9 = 1;
        int i10 = com.anythink.basead.exoplayer.k.p.f9259b;
        int i11 = 0;
        int i12 = 0;
        while (i4 <= i6) {
            int i13 = 0;
            for (int i14 = 0; i14 < i4; i14++) {
                int i15 = ((C2695Mi) this.f1400h).f27095b * i;
                i13 += Math.abs(sArr[i15 + i14] - sArr[(i15 + i4) + i14]);
            }
            int i16 = i13 * i11;
            int i17 = i9 * i4;
            if (i16 < i17) {
                i9 = i13;
            }
            if (i16 < i17) {
                i11 = i4;
            }
            int i18 = i13 * i10;
            int i19 = i12 * i4;
            if (i18 > i19) {
                i12 = i13;
            }
            if (i18 > i19) {
                i10 = i4;
            }
            i4++;
        }
        this.f1393a = i9 / i11;
        this.f1394b = i12 / i10;
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void b(int i) {
        this.f1397e = q((short[]) this.f1397e, ((C2695Mi) this.f1400h).f27102j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public int c() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public int d(int i, int i4, int i6) {
        return a((short[]) this.f1397e, i, i4, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void e(int i, long j6, long j9) {
        int i4 = 0;
        while (true) {
            C2695Mi c2695Mi = (C2695Mi) this.f1400h;
            int i6 = c2695Mi.f27095b;
            if (i4 >= i6) {
                return;
            }
            short[] sArr = (short[]) this.f1398f;
            int i9 = c2695Mi.f27103k;
            short[] sArr2 = (short[]) this.f1399g;
            int i10 = (i * i6) + i4;
            short s9 = sArr2[i10];
            short s10 = sArr2[i10 + i6];
            long j10 = c2695Mi.f27106n * j6;
            long j11 = c2695Mi.f27105m * j9;
            long j12 = (r2 + 1) * j9;
            int i11 = i4;
            long j13 = j12 - j11;
            long j14 = j12 - j10;
            sArr[(i9 * i6) + i11] = (short) ((((j13 - j14) * s10) + (j14 * s9)) / j13);
            i4 = i11 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void f(int i) {
        this.f1399g = q((short[]) this.f1399g, ((C2695Mi) this.f1400h).f27104l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void g(int i, int i4, int i6, int i9, int i10) {
        short[] sArr = (short[]) this.f1398f;
        short[] sArr2 = (short[]) this.f1397e;
        for (int i11 = 0; i11 < i4; i11++) {
            int i12 = (i9 * i4) + i11;
            int i13 = (i10 * i4) + i11;
            int i14 = (i6 * i4) + i11;
            for (int i15 = 0; i15 < i; i15++) {
                sArr[i14] = (short) (((sArr2[i13] * i15) + ((i - i15) * sArr2[i12])) / i);
                i14 += i4;
                i12 += i4;
                i13 += i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void h() {
        this.f1395c = 0;
        this.f1393a = 0;
        this.f1394b = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public boolean i() {
        int i = this.f1393a;
        return i != 0 && ((C2695Mi) this.f1400h).f27108p != 0 && this.f1394b <= i * 3 && i + i > this.f1395c * 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void j(int i, int i4) {
        int i6;
        short[] sArr = (short[]) this.f1397e;
        int i9 = 0;
        while (true) {
            C2695Mi c2695Mi = (C2695Mi) this.f1400h;
            if (i9 >= c2695Mi.f27101h / i4) {
                return;
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = c2695Mi.f27095b;
                i6 = i12 * i4;
                if (i10 < i6) {
                    i11 += sArr[(i6 * i9) + (i12 * i) + i10];
                    i10++;
                }
            }
            ((short[]) this.f1396d)[i9] = (short) (i11 / i6);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void k(int i, ByteBuffer byteBuffer) {
        C2695Mi c2695Mi = (C2695Mi) this.f1400h;
        byteBuffer.asShortBuffer().get((short[]) this.f1397e, c2695Mi.f27102j * c2695Mi.f27095b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void l(int i, int i4) {
        for (int i6 = 0; i6 < ((C2695Mi) this.f1400h).f27095b * i4; i6++) {
            ((short[]) this.f1397e)[i + i6] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public /* synthetic */ Object m() {
        return (short[]) this.f1398f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void n() {
        this.f1395c = this.f1393a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public int o(int i, int i4) {
        return a((short[]) this.f1396d, 0, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void p(int i, ByteBuffer byteBuffer) {
        C2695Mi c2695Mi = (C2695Mi) this.f1400h;
        byteBuffer.asShortBuffer().put((short[]) this.f1398f, 0, c2695Mi.f27095b * i);
        byteBuffer.position(((i + i) * c2695Mi.f27095b) + byteBuffer.position());
    }

    public short[] q(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i6 = ((C2695Mi) this.f1400h).f27095b;
        int i9 = length / i6;
        return i + i4 <= i9 ? sArr : Arrays.copyOf(sArr, (((i9 * 3) / 2) + i4) * i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public /* synthetic */ Object r() {
        return (short[]) this.f1399g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public void t(int i) {
        this.f1398f = q((short[]) this.f1398f, ((C2695Mi) this.f1400h).f27103k, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2491Ai
    public /* synthetic */ Object w() {
        return (short[]) this.f1397e;
    }

    public b(c4.e eVar) {
        this.f1396d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));
        this.f1397e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));
        String str = z.f1440a;
        this.f1398f = new y();
        this.f1399g = new G3.e(6);
        this.f1400h = new C4586c(5);
        this.f1393a = 4;
        this.f1394b = Integer.MAX_VALUE;
        this.f1395c = 20;
    }
}
