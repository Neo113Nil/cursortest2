package p8;

import java.util.ArrayList;
import java.util.Arrays;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final y8.e f39841a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39843c;

    /* renamed from: g, reason: collision with root package name */
    public int f39847g;

    /* renamed from: h, reason: collision with root package name */
    public int f39848h;

    /* renamed from: b, reason: collision with root package name */
    public int f39842b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f39844d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C4858d[] f39845e = new C4858d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f39846f = 7;

    public f(y8.e eVar) {
        this.f39841a = eVar;
    }

    public final void a(int i) {
        int i6;
        if (i > 0) {
            int length = this.f39845e.length - 1;
            int i9 = 0;
            while (true) {
                i6 = this.f39846f;
                if (length < i6 || i <= 0) {
                    break;
                }
                C4858d c4858d = this.f39845e[length];
                kotlin.jvm.internal.h.b(c4858d);
                i -= c4858d.f39833c;
                int i10 = this.f39848h;
                C4858d c4858d2 = this.f39845e[length];
                kotlin.jvm.internal.h.b(c4858d2);
                this.f39848h = i10 - c4858d2.f39833c;
                this.f39847g--;
                i9++;
                length--;
            }
            C4858d[] c4858dArr = this.f39845e;
            int i11 = i6 + 1;
            System.arraycopy(c4858dArr, i11, c4858dArr, i11 + i9, this.f39847g);
            C4858d[] c4858dArr2 = this.f39845e;
            int i12 = this.f39846f + 1;
            Arrays.fill(c4858dArr2, i12, i12 + i9, (Object) null);
            this.f39846f += i9;
        }
    }

    public final void b(C4858d c4858d) {
        int i = this.f39844d;
        int i6 = c4858d.f39833c;
        if (i6 > i) {
            C4858d[] c4858dArr = this.f39845e;
            AbstractC5128i.v(c4858dArr, 0, c4858dArr.length);
            this.f39846f = this.f39845e.length - 1;
            this.f39847g = 0;
            this.f39848h = 0;
            return;
        }
        a((this.f39848h + i6) - i);
        int i9 = this.f39847g + 1;
        C4858d[] c4858dArr2 = this.f39845e;
        if (i9 > c4858dArr2.length) {
            C4858d[] c4858dArr3 = new C4858d[c4858dArr2.length * 2];
            System.arraycopy(c4858dArr2, 0, c4858dArr3, c4858dArr2.length, c4858dArr2.length);
            this.f39846f = this.f39845e.length - 1;
            this.f39845e = c4858dArr3;
        }
        int i10 = this.f39846f;
        this.f39846f = i10 - 1;
        this.f39845e[i10] = c4858d;
        this.f39847g++;
        this.f39848h += i6;
    }

    public final void c(y8.h data) {
        kotlin.jvm.internal.h.e(data, "data");
        y8.e eVar = this.f39841a;
        int[] iArr = B.f39809a;
        int a9 = data.a();
        long j6 = 0;
        for (int i = 0; i < a9; i++) {
            byte e9 = data.e(i);
            byte[] bArr = j8.c.f38482a;
            j6 += B.f39810b[e9 & 255];
        }
        if (((int) ((j6 + 7) >> 3)) >= data.a()) {
            e(data.a(), com.anythink.expressad.video.module.a.a.f21728R, 0);
            eVar.K(data);
            return;
        }
        y8.e eVar2 = new y8.e();
        int[] iArr2 = B.f39809a;
        int a10 = data.a();
        long j9 = 0;
        int i6 = 0;
        for (int i9 = 0; i9 < a10; i9++) {
            byte e10 = data.e(i9);
            byte[] bArr2 = j8.c.f38482a;
            int i10 = e10 & 255;
            int i11 = B.f39809a[i10];
            byte b9 = B.f39810b[i10];
            j9 = (j9 << b9) | i11;
            i6 += b9;
            while (i6 >= 8) {
                i6 -= 8;
                eVar2.X((int) (j9 >> i6));
            }
        }
        if (i6 > 0) {
            eVar2.X((int) ((255 >>> i6) | (j9 << (8 - i6))));
        }
        y8.h B9 = eVar2.B(eVar2.f41953u);
        e(B9.a(), com.anythink.expressad.video.module.a.a.f21728R, 128);
        eVar.K(B9);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i6;
        if (this.f39843c) {
            int i9 = this.f39842b;
            if (i9 < this.f39844d) {
                e(i9, 31, 32);
            }
            this.f39843c = false;
            this.f39842b = Integer.MAX_VALUE;
            e(this.f39844d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4858d c4858d = (C4858d) arrayList.get(i10);
            y8.h j6 = c4858d.f39831a.j();
            Integer num = (Integer) g.f39850b.get(j6);
            y8.h hVar = c4858d.f39832b;
            if (num != null) {
                int intValue = num.intValue();
                i6 = intValue + 1;
                if (2 <= i6 && i6 < 8) {
                    C4858d[] c4858dArr = g.f39849a;
                    if (kotlin.jvm.internal.h.a(c4858dArr[intValue].f39832b, hVar)) {
                        i = i6;
                    } else if (kotlin.jvm.internal.h.a(c4858dArr[i6].f39832b, hVar)) {
                        i6 = intValue + 2;
                        i = i6;
                    }
                }
                i = i6;
                i6 = -1;
            } else {
                i = -1;
                i6 = -1;
            }
            if (i6 == -1) {
                int i11 = this.f39846f + 1;
                int length = this.f39845e.length;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    C4858d c4858d2 = this.f39845e[i11];
                    kotlin.jvm.internal.h.b(c4858d2);
                    if (kotlin.jvm.internal.h.a(c4858d2.f39831a, j6)) {
                        C4858d c4858d3 = this.f39845e[i11];
                        kotlin.jvm.internal.h.b(c4858d3);
                        if (kotlin.jvm.internal.h.a(c4858d3.f39832b, hVar)) {
                            i6 = g.f39849a.length + (i11 - this.f39846f);
                            break;
                        } else if (i == -1) {
                            i = (i11 - this.f39846f) + g.f39849a.length;
                        }
                    }
                    i11++;
                }
            }
            if (i6 != -1) {
                e(i6, com.anythink.expressad.video.module.a.a.f21728R, 128);
            } else if (i == -1) {
                this.f39841a.X(64);
                c(j6);
                c(hVar);
                b(c4858d);
            } else {
                y8.h prefix = C4858d.f39826d;
                j6.getClass();
                kotlin.jvm.internal.h.e(prefix, "prefix");
                if (!j6.g(prefix, prefix.a()) || kotlin.jvm.internal.h.a(C4858d.i, j6)) {
                    e(i, 63, 64);
                    c(hVar);
                    b(c4858d);
                } else {
                    e(i, 15, 0);
                    c(hVar);
                }
            }
        }
    }

    public final void e(int i, int i6, int i9) {
        y8.e eVar = this.f39841a;
        if (i < i6) {
            eVar.X(i | i9);
            return;
        }
        eVar.X(i9 | i6);
        int i10 = i - i6;
        while (i10 >= 128) {
            eVar.X(128 | (i10 & com.anythink.expressad.video.module.a.a.f21728R));
            i10 >>>= 7;
        }
        eVar.X(i10);
    }
}
