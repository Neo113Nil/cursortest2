package J0;

import com.google.android.gms.internal.ads.C2675Mi;
import com.google.android.gms.internal.ads.InterfaceC2471Ai;
import g1.C4523c;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b implements InterfaceC2471Ai {

    /* renamed from: a, reason: collision with root package name */
    public int f1364a;

    /* renamed from: b, reason: collision with root package name */
    public int f1365b;

    /* renamed from: c, reason: collision with root package name */
    public int f1366c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1367d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1368e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1369f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1370g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1371h;

    public b(C2675Mi c2675Mi) {
        Objects.requireNonNull(c2675Mi);
        this.f1371h = c2675Mi;
        int i = c2675Mi.f26312h;
        this.f1367d = new short[i];
        int i6 = c2675Mi.f26306b;
        this.f1368e = new short[i * i6];
        this.f1369f = new short[i * i6];
        this.f1370g = new short[i * i6];
    }

    public int a(short[] sArr, int i, int i6, int i9) {
        int i10 = 1;
        int i11 = com.anythink.basead.exoplayer.k.p.f8473b;
        int i12 = 0;
        int i13 = 0;
        while (i6 <= i9) {
            int i14 = 0;
            for (int i15 = 0; i15 < i6; i15++) {
                int i16 = ((C2675Mi) this.f1371h).f26306b * i;
                i14 += Math.abs(sArr[i16 + i15] - sArr[(i16 + i6) + i15]);
            }
            int i17 = i14 * i12;
            int i18 = i10 * i6;
            if (i17 < i18) {
                i10 = i14;
            }
            if (i17 < i18) {
                i12 = i6;
            }
            int i19 = i14 * i11;
            int i20 = i13 * i6;
            if (i19 > i20) {
                i13 = i14;
            }
            if (i19 > i20) {
                i11 = i6;
            }
            i6++;
        }
        this.f1364a = i10 / i12;
        this.f1365b = i13 / i11;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void b(int i) {
        this.f1368e = q((short[]) this.f1368e, ((C2675Mi) this.f1371h).f26313j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public int c() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public int d(int i, int i6, int i9) {
        return a((short[]) this.f1368e, i, i6, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void e(int i, long j6, long j9) {
        int i6 = 0;
        while (true) {
            C2675Mi c2675Mi = (C2675Mi) this.f1371h;
            int i9 = c2675Mi.f26306b;
            if (i6 >= i9) {
                return;
            }
            short[] sArr = (short[]) this.f1369f;
            int i10 = c2675Mi.f26314k;
            short[] sArr2 = (short[]) this.f1370g;
            int i11 = (i * i9) + i6;
            short s9 = sArr2[i11];
            short s10 = sArr2[i11 + i9];
            long j10 = c2675Mi.f26317n * j6;
            long j11 = c2675Mi.f26316m * j9;
            long j12 = (r2 + 1) * j9;
            int i12 = i6;
            long j13 = j12 - j11;
            long j14 = j12 - j10;
            sArr[(i10 * i9) + i12] = (short) ((((j13 - j14) * s10) + (j14 * s9)) / j13);
            i6 = i12 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void f(int i) {
        this.f1370g = q((short[]) this.f1370g, ((C2675Mi) this.f1371h).f26315l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void g(int i, int i6, int i9, int i10, int i11) {
        short[] sArr = (short[]) this.f1369f;
        short[] sArr2 = (short[]) this.f1368e;
        for (int i12 = 0; i12 < i6; i12++) {
            int i13 = (i10 * i6) + i12;
            int i14 = (i11 * i6) + i12;
            int i15 = (i9 * i6) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i15] = (short) (((sArr2[i14] * i16) + ((i - i16) * sArr2[i13])) / i);
                i15 += i6;
                i13 += i6;
                i14 += i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void h() {
        this.f1366c = 0;
        this.f1364a = 0;
        this.f1365b = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public boolean i() {
        int i = this.f1364a;
        return i != 0 && ((C2675Mi) this.f1371h).f26319p != 0 && this.f1365b <= i * 3 && i + i > this.f1366c * 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void j(int i, int i6) {
        int i9;
        short[] sArr = (short[]) this.f1368e;
        int i10 = 0;
        while (true) {
            C2675Mi c2675Mi = (C2675Mi) this.f1371h;
            if (i10 >= c2675Mi.f26312h / i6) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = c2675Mi.f26306b;
                i9 = i13 * i6;
                if (i11 < i9) {
                    i12 += sArr[(i9 * i10) + (i13 * i) + i11];
                    i11++;
                }
            }
            ((short[]) this.f1367d)[i10] = (short) (i12 / i9);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void k(int i, ByteBuffer byteBuffer) {
        C2675Mi c2675Mi = (C2675Mi) this.f1371h;
        byteBuffer.asShortBuffer().get((short[]) this.f1368e, c2675Mi.f26313j * c2675Mi.f26306b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void l(int i, int i6) {
        for (int i9 = 0; i9 < ((C2675Mi) this.f1371h).f26306b * i6; i9++) {
            ((short[]) this.f1368e)[i + i9] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public /* synthetic */ Object m() {
        return (short[]) this.f1369f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void n() {
        this.f1366c = this.f1364a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public int o(int i, int i6) {
        return a((short[]) this.f1367d, 0, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void p(int i, ByteBuffer byteBuffer) {
        C2675Mi c2675Mi = (C2675Mi) this.f1371h;
        byteBuffer.asShortBuffer().put((short[]) this.f1369f, 0, c2675Mi.f26306b * i);
        byteBuffer.position(((i + i) * c2675Mi.f26306b) + byteBuffer.position());
    }

    public short[] q(short[] sArr, int i, int i6) {
        int length = sArr.length;
        int i9 = ((C2675Mi) this.f1371h).f26306b;
        int i10 = length / i9;
        return i + i6 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i6) * i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public /* synthetic */ Object r() {
        return (short[]) this.f1370g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public void t(int i) {
        this.f1369f = q((short[]) this.f1369f, ((C2675Mi) this.f1371h).f26314k, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2471Ai
    public /* synthetic */ Object w() {
        return (short[]) this.f1368e;
    }

    public b(M2.i iVar) {
        this.f1367d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0314a(false));
        this.f1368e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC0314a(true));
        String str = A.f1361a;
        this.f1369f = new z();
        this.f1370g = new a4.e();
        this.f1371h = new C4523c(6);
        this.f1364a = 4;
        this.f1365b = Integer.MAX_VALUE;
        this.f1366c = 20;
    }
}
