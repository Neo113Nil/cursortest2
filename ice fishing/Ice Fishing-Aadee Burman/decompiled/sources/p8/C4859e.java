package p8;

import java.io.IOException;
import java.util.ArrayList;
import v7.AbstractC5128i;

/* renamed from: p8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4859e {

    /* renamed from: c, reason: collision with root package name */
    public final y8.r f39833c;

    /* renamed from: f, reason: collision with root package name */
    public int f39836f;

    /* renamed from: g, reason: collision with root package name */
    public int f39837g;

    /* renamed from: a, reason: collision with root package name */
    public int f39831a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39832b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C4858d[] f39834d = new C4858d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f39835e = 7;

    public C4859e(u uVar) {
        this.f39833c = y8.b.b(uVar);
    }

    public final int a(int i) {
        int i6;
        int i9 = 0;
        if (i > 0) {
            int length = this.f39834d.length;
            while (true) {
                length--;
                i6 = this.f39835e;
                if (length < i6 || i <= 0) {
                    break;
                }
                C4858d c4858d = this.f39834d[length];
                kotlin.jvm.internal.h.b(c4858d);
                int i10 = c4858d.f39830c;
                i -= i10;
                this.f39837g -= i10;
                this.f39836f--;
                i9++;
            }
            C4858d[] c4858dArr = this.f39834d;
            System.arraycopy(c4858dArr, i6 + 1, c4858dArr, i6 + 1 + i9, this.f39836f);
            this.f39835e += i9;
        }
        return i9;
    }

    public final y8.h b(int i) {
        if (i >= 0) {
            C4858d[] c4858dArr = g.f39846a;
            if (i <= c4858dArr.length - 1) {
                return c4858dArr[i].f39828a;
            }
        }
        int length = this.f39835e + 1 + (i - g.f39846a.length);
        if (length >= 0) {
            C4858d[] c4858dArr2 = this.f39834d;
            if (length < c4858dArr2.length) {
                C4858d c4858d = c4858dArr2[length];
                kotlin.jvm.internal.h.b(c4858d);
                return c4858d.f39828a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C4858d c4858d) {
        this.f39832b.add(c4858d);
        int i = this.f39831a;
        int i6 = c4858d.f39830c;
        if (i6 > i) {
            C4858d[] c4858dArr = this.f39834d;
            AbstractC5128i.v(c4858dArr, 0, c4858dArr.length);
            this.f39835e = this.f39834d.length - 1;
            this.f39836f = 0;
            this.f39837g = 0;
            return;
        }
        a((this.f39837g + i6) - i);
        int i9 = this.f39836f + 1;
        C4858d[] c4858dArr2 = this.f39834d;
        if (i9 > c4858dArr2.length) {
            C4858d[] c4858dArr3 = new C4858d[c4858dArr2.length * 2];
            System.arraycopy(c4858dArr2, 0, c4858dArr3, c4858dArr2.length, c4858dArr2.length);
            this.f39835e = this.f39834d.length - 1;
            this.f39834d = c4858dArr3;
        }
        int i10 = this.f39835e;
        this.f39835e = i10 - 1;
        this.f39834d[i10] = c4858d;
        this.f39836f++;
        this.f39837g += i6;
    }

    public final y8.h d() {
        int i;
        y8.r source = this.f39833c;
        byte z3 = source.z();
        byte[] bArr = j8.c.f38482a;
        int i6 = z3 & 255;
        int i9 = 0;
        boolean z6 = (z3 & com.anythink.core.common.s.a.c.f16316a) == 128;
        long e9 = e(i6, com.anythink.expressad.video.module.a.a.f21728R);
        if (!z6) {
            return source.A(e9);
        }
        y8.e eVar = new y8.e();
        int[] iArr = B.f39806a;
        kotlin.jvm.internal.h.e(source, "source");
        L2.o oVar = B.f39808c;
        L2.o oVar2 = oVar;
        int i10 = 0;
        for (long j6 = 0; j6 < e9; j6++) {
            byte z9 = source.z();
            byte[] bArr2 = j8.c.f38482a;
            i9 = (i9 << 8) | (z9 & 255);
            i10 += 8;
            while (i10 >= 8) {
                int i11 = (i9 >>> (i10 - 8)) & com.anythink.basead.exoplayer.k.p.f8473b;
                L2.o[] oVarArr = (L2.o[]) oVar2.f1665c;
                kotlin.jvm.internal.h.b(oVarArr);
                oVar2 = oVarArr[i11];
                kotlin.jvm.internal.h.b(oVar2);
                if (((L2.o[]) oVar2.f1665c) == null) {
                    eVar.X(oVar2.f1663a);
                    i10 -= oVar2.f1664b;
                    oVar2 = oVar;
                } else {
                    i10 -= 8;
                }
            }
        }
        while (i10 > 0) {
            int i12 = (i9 << (8 - i10)) & com.anythink.basead.exoplayer.k.p.f8473b;
            L2.o[] oVarArr2 = (L2.o[]) oVar2.f1665c;
            kotlin.jvm.internal.h.b(oVarArr2);
            L2.o oVar3 = oVarArr2[i12];
            kotlin.jvm.internal.h.b(oVar3);
            if (((L2.o[]) oVar3.f1665c) != null || (i = oVar3.f1664b) > i10) {
                break;
            }
            eVar.X(oVar3.f1663a);
            i10 -= i;
            oVar2 = oVar;
        }
        return eVar.B(eVar.f41950u);
    }

    public final int e(int i, int i6) {
        int i9 = i & i6;
        if (i9 < i6) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte z3 = this.f39833c.z();
            byte[] bArr = j8.c.f38482a;
            int i11 = z3 & 255;
            if ((z3 & com.anythink.core.common.s.a.c.f16316a) == 0) {
                return i6 + (i11 << i10);
            }
            i6 += (z3 & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
