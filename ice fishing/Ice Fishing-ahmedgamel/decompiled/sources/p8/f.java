package p8;

import java.util.ArrayList;
import java.util.Arrays;
import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final y8.e f39888a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39890c;

    /* renamed from: g, reason: collision with root package name */
    public int f39894g;

    /* renamed from: h, reason: collision with root package name */
    public int f39895h;

    /* renamed from: b, reason: collision with root package name */
    public int f39889b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f39891d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C4858d[] f39892e = new C4858d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f39893f = 7;

    public f(y8.e eVar) {
        this.f39888a = eVar;
    }

    public final void a(int i) {
        int i4;
        if (i > 0) {
            int length = this.f39892e.length - 1;
            int i6 = 0;
            while (true) {
                i4 = this.f39893f;
                if (length < i4 || i <= 0) {
                    break;
                }
                C4858d c4858d = this.f39892e[length];
                kotlin.jvm.internal.h.b(c4858d);
                i -= c4858d.f39880c;
                int i9 = this.f39895h;
                C4858d c4858d2 = this.f39892e[length];
                kotlin.jvm.internal.h.b(c4858d2);
                this.f39895h = i9 - c4858d2.f39880c;
                this.f39894g--;
                i6++;
                length--;
            }
            C4858d[] c4858dArr = this.f39892e;
            int i10 = i4 + 1;
            System.arraycopy(c4858dArr, i10, c4858dArr, i10 + i6, this.f39894g);
            C4858d[] c4858dArr2 = this.f39892e;
            int i11 = this.f39893f + 1;
            Arrays.fill(c4858dArr2, i11, i11 + i6, (Object) null);
            this.f39893f += i6;
        }
    }

    public final void b(C4858d c4858d) {
        int i = this.f39891d;
        int i4 = c4858d.f39880c;
        if (i4 > i) {
            C4858d[] c4858dArr = this.f39892e;
            AbstractC5118i.y(c4858dArr, 0, c4858dArr.length);
            this.f39893f = this.f39892e.length - 1;
            this.f39894g = 0;
            this.f39895h = 0;
            return;
        }
        a((this.f39895h + i4) - i);
        int i6 = this.f39894g + 1;
        C4858d[] c4858dArr2 = this.f39892e;
        if (i6 > c4858dArr2.length) {
            C4858d[] c4858dArr3 = new C4858d[c4858dArr2.length * 2];
            System.arraycopy(c4858dArr2, 0, c4858dArr3, c4858dArr2.length, c4858dArr2.length);
            this.f39893f = this.f39892e.length - 1;
            this.f39892e = c4858dArr3;
        }
        int i9 = this.f39893f;
        this.f39893f = i9 - 1;
        this.f39892e[i9] = c4858d;
        this.f39894g++;
        this.f39895h += i4;
    }

    public final void c(y8.h data) {
        kotlin.jvm.internal.h.e(data, "data");
        y8.e eVar = this.f39888a;
        int[] iArr = B.f39856a;
        int a9 = data.a();
        long j6 = 0;
        for (int i = 0; i < a9; i++) {
            byte e9 = data.e(i);
            byte[] bArr = j8.c.f38494a;
            j6 += B.f39857b[e9 & 255];
        }
        if (((int) ((j6 + 7) >> 3)) >= data.a()) {
            e(data.a(), com.anythink.expressad.video.module.a.a.f22515R, 0);
            eVar.K(data);
            return;
        }
        y8.e eVar2 = new y8.e();
        int[] iArr2 = B.f39856a;
        int a10 = data.a();
        long j9 = 0;
        int i4 = 0;
        for (int i6 = 0; i6 < a10; i6++) {
            byte e10 = data.e(i6);
            byte[] bArr2 = j8.c.f38494a;
            int i9 = e10 & 255;
            int i10 = B.f39856a[i9];
            byte b9 = B.f39857b[i9];
            j9 = (j9 << b9) | i10;
            i4 += b9;
            while (i4 >= 8) {
                i4 -= 8;
                eVar2.X((int) (j9 >> i4));
            }
        }
        if (i4 > 0) {
            eVar2.X((int) ((255 >>> i4) | (j9 << (8 - i4))));
        }
        y8.h B3 = eVar2.B(eVar2.f41924u);
        e(B3.a(), com.anythink.expressad.video.module.a.a.f22515R, 128);
        eVar.K(B3);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i4;
        if (this.f39890c) {
            int i6 = this.f39889b;
            if (i6 < this.f39891d) {
                e(i6, 31, 32);
            }
            this.f39890c = false;
            this.f39889b = Integer.MAX_VALUE;
            e(this.f39891d, 31, 32);
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C4858d c4858d = (C4858d) arrayList.get(i9);
            y8.h j6 = c4858d.f39878a.j();
            Integer num = (Integer) g.f39897b.get(j6);
            y8.h hVar = c4858d.f39879b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C4858d[] c4858dArr = g.f39896a;
                    if (kotlin.jvm.internal.h.a(c4858dArr[intValue].f39879b, hVar)) {
                        i = i4;
                    } else if (kotlin.jvm.internal.h.a(c4858dArr[i4].f39879b, hVar)) {
                        i4 = intValue + 2;
                        i = i4;
                    }
                }
                i = i4;
                i4 = -1;
            } else {
                i = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i10 = this.f39893f + 1;
                int length = this.f39892e.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    C4858d c4858d2 = this.f39892e[i10];
                    kotlin.jvm.internal.h.b(c4858d2);
                    if (kotlin.jvm.internal.h.a(c4858d2.f39878a, j6)) {
                        C4858d c4858d3 = this.f39892e[i10];
                        kotlin.jvm.internal.h.b(c4858d3);
                        if (kotlin.jvm.internal.h.a(c4858d3.f39879b, hVar)) {
                            i4 = g.f39896a.length + (i10 - this.f39893f);
                            break;
                        } else if (i == -1) {
                            i = (i10 - this.f39893f) + g.f39896a.length;
                        }
                    }
                    i10++;
                }
            }
            if (i4 != -1) {
                e(i4, com.anythink.expressad.video.module.a.a.f22515R, 128);
            } else if (i == -1) {
                this.f39888a.X(64);
                c(j6);
                c(hVar);
                b(c4858d);
            } else {
                y8.h prefix = C4858d.f39873d;
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

    public final void e(int i, int i4, int i6) {
        y8.e eVar = this.f39888a;
        if (i < i4) {
            eVar.X(i | i6);
            return;
        }
        eVar.X(i6 | i4);
        int i9 = i - i4;
        while (i9 >= 128) {
            eVar.X(128 | (i9 & com.anythink.expressad.video.module.a.a.f22515R));
            i9 >>>= 7;
        }
        eVar.X(i9);
    }
}
