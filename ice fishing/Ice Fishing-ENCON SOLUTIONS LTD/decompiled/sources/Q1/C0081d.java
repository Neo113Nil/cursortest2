package Q1;

import i1.AbstractC0251h;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: Q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081d {

    /* renamed from: c, reason: collision with root package name */
    public final W1.q f1583c;

    /* renamed from: f, reason: collision with root package name */
    public int f1586f;

    /* renamed from: g, reason: collision with root package name */
    public int f1587g;

    /* renamed from: a, reason: collision with root package name */
    public int f1581a = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1582b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0080c[] f1584d = new C0080c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f1585e = 7;

    public C0081d(t tVar) {
        this.f1583c = new W1.q(tVar);
    }

    public final int a(int i2) {
        int i3;
        int i4 = 0;
        if (i2 > 0) {
            int length = this.f1584d.length;
            while (true) {
                length--;
                i3 = this.f1585e;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0080c c0080c = this.f1584d[length];
                kotlin.jvm.internal.i.b(c0080c);
                int i5 = c0080c.f1580c;
                i2 -= i5;
                this.f1587g -= i5;
                this.f1586f--;
                i4++;
            }
            C0080c[] c0080cArr = this.f1584d;
            System.arraycopy(c0080cArr, i3 + 1, c0080cArr, i3 + 1 + i4, this.f1586f);
            this.f1585e += i4;
        }
        return i4;
    }

    public final W1.j b(int i2) {
        if (i2 >= 0) {
            C0080c[] c0080cArr = f.f1597a;
            if (i2 <= c0080cArr.length - 1) {
                return c0080cArr[i2].f1578a;
            }
        }
        int length = this.f1585e + 1 + (i2 - f.f1597a.length);
        if (length >= 0) {
            C0080c[] c0080cArr2 = this.f1584d;
            if (length < c0080cArr2.length) {
                C0080c c0080c = c0080cArr2[length];
                kotlin.jvm.internal.i.b(c0080c);
                return c0080c.f1578a;
            }
        }
        throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(i2 + 1), "Header index too large "));
    }

    public final void c(C0080c c0080c) {
        this.f1582b.add(c0080c);
        int i2 = this.f1581a;
        int i3 = c0080c.f1580c;
        if (i3 > i2) {
            C0080c[] c0080cArr = this.f1584d;
            AbstractC0251h.P(c0080cArr, 0, c0080cArr.length);
            this.f1585e = this.f1584d.length - 1;
            this.f1586f = 0;
            this.f1587g = 0;
            return;
        }
        a((this.f1587g + i3) - i2);
        int i4 = this.f1586f + 1;
        C0080c[] c0080cArr2 = this.f1584d;
        if (i4 > c0080cArr2.length) {
            C0080c[] c0080cArr3 = new C0080c[c0080cArr2.length * 2];
            System.arraycopy(c0080cArr2, 0, c0080cArr3, c0080cArr2.length, c0080cArr2.length);
            this.f1585e = this.f1584d.length - 1;
            this.f1584d = c0080cArr3;
        }
        int i5 = this.f1585e;
        this.f1585e = i5 - 1;
        this.f1584d[i5] = c0080c;
        this.f1586f++;
        this.f1587g += i3;
    }

    public final W1.j d() {
        int i2;
        W1.q source = this.f1583c;
        byte c2 = source.c();
        byte[] bArr = K1.b.f1051a;
        int i3 = c2 & 255;
        int i4 = 0;
        boolean z2 = (c2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return source.j(e2);
        }
        W1.g gVar = new W1.g();
        int[] iArr = B.f1557a;
        kotlin.jvm.internal.i.e(source, "source");
        A a2 = B.f1559c;
        A a3 = a2;
        long j2 = 0;
        int i5 = 0;
        while (j2 < e2) {
            j2++;
            byte c3 = source.c();
            byte[] bArr2 = K1.b.f1051a;
            i4 = (i4 << 8) | (c3 & 255);
            i5 += 8;
            while (i5 >= 8) {
                int i6 = (i4 >>> (i5 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                A[] aArr = (A[]) a3.f1556c;
                kotlin.jvm.internal.i.b(aArr);
                a3 = aArr[i6];
                kotlin.jvm.internal.i.b(a3);
                if (((A[]) a3.f1556c) == null) {
                    gVar.u(a3.f1554a);
                    i5 -= a3.f1555b;
                    a3 = a2;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            int i7 = (i4 << (8 - i5)) & KotlinVersion.MAX_COMPONENT_VALUE;
            A[] aArr2 = (A[]) a3.f1556c;
            kotlin.jvm.internal.i.b(aArr2);
            A a4 = aArr2[i7];
            kotlin.jvm.internal.i.b(a4);
            if (((A[]) a4.f1556c) != null || (i2 = a4.f1555b) > i5) {
                break;
            }
            gVar.u(a4.f1554a);
            i5 -= i2;
            a3 = a2;
        }
        return gVar.k(gVar.f1875b);
    }

    public final int e(int i2, int i3) {
        int i4 = i2 & i3;
        if (i4 < i3) {
            return i4;
        }
        int i5 = 0;
        while (true) {
            byte c2 = this.f1583c.c();
            byte[] bArr = K1.b.f1051a;
            int i6 = c2 & 255;
            if ((c2 & 128) == 0) {
                return i3 + (i6 << i5);
            }
            i3 += (c2 & Byte.MAX_VALUE) << i5;
            i5 += 7;
        }
    }
}
