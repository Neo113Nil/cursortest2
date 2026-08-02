package p8;

import java.io.IOException;
import java.util.ArrayList;
import v7.AbstractC5118i;

/* renamed from: p8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4859e {

    /* renamed from: c, reason: collision with root package name */
    public final y8.r f39883c;

    /* renamed from: f, reason: collision with root package name */
    public int f39886f;

    /* renamed from: g, reason: collision with root package name */
    public int f39887g;

    /* renamed from: a, reason: collision with root package name */
    public int f39881a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39882b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C4858d[] f39884d = new C4858d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f39885e = 7;

    public C4859e(u uVar) {
        this.f39883c = y8.b.b(uVar);
    }

    public final int a(int i) {
        int i4;
        int i6 = 0;
        if (i > 0) {
            int length = this.f39884d.length;
            while (true) {
                length--;
                i4 = this.f39885e;
                if (length < i4 || i <= 0) {
                    break;
                }
                C4858d c4858d = this.f39884d[length];
                kotlin.jvm.internal.h.b(c4858d);
                int i9 = c4858d.f39880c;
                i -= i9;
                this.f39887g -= i9;
                this.f39886f--;
                i6++;
            }
            C4858d[] c4858dArr = this.f39884d;
            System.arraycopy(c4858dArr, i4 + 1, c4858dArr, i4 + 1 + i6, this.f39886f);
            this.f39885e += i6;
        }
        return i6;
    }

    public final y8.h b(int i) {
        if (i >= 0) {
            C4858d[] c4858dArr = g.f39896a;
            if (i <= c4858dArr.length - 1) {
                return c4858dArr[i].f39878a;
            }
        }
        int length = this.f39885e + 1 + (i - g.f39896a.length);
        if (length >= 0) {
            C4858d[] c4858dArr2 = this.f39884d;
            if (length < c4858dArr2.length) {
                C4858d c4858d = c4858dArr2[length];
                kotlin.jvm.internal.h.b(c4858d);
                return c4858d.f39878a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C4858d c4858d) {
        this.f39882b.add(c4858d);
        int i = this.f39881a;
        int i4 = c4858d.f39880c;
        if (i4 > i) {
            C4858d[] c4858dArr = this.f39884d;
            AbstractC5118i.y(c4858dArr, 0, c4858dArr.length);
            this.f39885e = this.f39884d.length - 1;
            this.f39886f = 0;
            this.f39887g = 0;
            return;
        }
        a((this.f39887g + i4) - i);
        int i6 = this.f39886f + 1;
        C4858d[] c4858dArr2 = this.f39884d;
        if (i6 > c4858dArr2.length) {
            C4858d[] c4858dArr3 = new C4858d[c4858dArr2.length * 2];
            System.arraycopy(c4858dArr2, 0, c4858dArr3, c4858dArr2.length, c4858dArr2.length);
            this.f39885e = this.f39884d.length - 1;
            this.f39884d = c4858dArr3;
        }
        int i9 = this.f39885e;
        this.f39885e = i9 - 1;
        this.f39884d[i9] = c4858d;
        this.f39886f++;
        this.f39887g += i4;
    }

    public final y8.h d() {
        int i;
        y8.r source = this.f39883c;
        byte z6 = source.z();
        byte[] bArr = j8.c.f38494a;
        int i4 = z6 & 255;
        int i6 = 0;
        boolean z9 = (z6 & com.anythink.core.common.s.a.c.f17103a) == 128;
        long e9 = e(i4, com.anythink.expressad.video.module.a.a.f22515R);
        if (!z9) {
            return source.A(e9);
        }
        y8.e eVar = new y8.e();
        int[] iArr = B.f39856a;
        kotlin.jvm.internal.h.e(source, "source");
        N2.p pVar = B.f39858c;
        N2.p pVar2 = pVar;
        int i9 = 0;
        for (long j6 = 0; j6 < e9; j6++) {
            byte z10 = source.z();
            byte[] bArr2 = j8.c.f38494a;
            i6 = (i6 << 8) | (z10 & 255);
            i9 += 8;
            while (i9 >= 8) {
                int i10 = (i6 >>> (i9 - 8)) & com.anythink.basead.exoplayer.k.p.f9259b;
                N2.p[] pVarArr = (N2.p[]) pVar2.f1955c;
                kotlin.jvm.internal.h.b(pVarArr);
                pVar2 = pVarArr[i10];
                kotlin.jvm.internal.h.b(pVar2);
                if (((N2.p[]) pVar2.f1955c) == null) {
                    eVar.X(pVar2.f1953a);
                    i9 -= pVar2.f1954b;
                    pVar2 = pVar;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            int i11 = (i6 << (8 - i9)) & com.anythink.basead.exoplayer.k.p.f9259b;
            N2.p[] pVarArr2 = (N2.p[]) pVar2.f1955c;
            kotlin.jvm.internal.h.b(pVarArr2);
            N2.p pVar3 = pVarArr2[i11];
            kotlin.jvm.internal.h.b(pVar3);
            if (((N2.p[]) pVar3.f1955c) != null || (i = pVar3.f1954b) > i9) {
                break;
            }
            eVar.X(pVar3.f1953a);
            i9 -= i;
            pVar2 = pVar;
        }
        return eVar.B(eVar.f41924u);
    }

    public final int e(int i, int i4) {
        int i6 = i & i4;
        if (i6 < i4) {
            return i6;
        }
        int i9 = 0;
        while (true) {
            byte z6 = this.f39883c.z();
            byte[] bArr = j8.c.f38494a;
            int i10 = z6 & 255;
            if ((z6 & com.anythink.core.common.s.a.c.f17103a) == 0) {
                return i4 + (i10 << i9);
            }
            i4 += (z6 & Byte.MAX_VALUE) << i9;
            i9 += 7;
        }
    }
}
