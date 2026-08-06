package Q1;

import i1.AbstractC0251h;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082e {

    /* renamed from: b, reason: collision with root package name */
    public final W1.g f1589b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1591d;

    /* renamed from: h, reason: collision with root package name */
    public int f1595h;

    /* renamed from: i, reason: collision with root package name */
    public int f1596i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1588a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f1590c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1592e = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: f, reason: collision with root package name */
    public C0080c[] f1593f = new C0080c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f1594g = 7;

    public C0082e(W1.g gVar) {
        this.f1589b = gVar;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f1593f.length - 1;
            int i4 = 0;
            while (true) {
                i3 = this.f1594g;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0080c c0080c = this.f1593f[length];
                kotlin.jvm.internal.i.b(c0080c);
                i2 -= c0080c.f1580c;
                int i5 = this.f1596i;
                C0080c c0080c2 = this.f1593f[length];
                kotlin.jvm.internal.i.b(c0080c2);
                this.f1596i = i5 - c0080c2.f1580c;
                this.f1595h--;
                i4++;
                length--;
            }
            C0080c[] c0080cArr = this.f1593f;
            int i6 = i3 + 1;
            System.arraycopy(c0080cArr, i6, c0080cArr, i6 + i4, this.f1595h);
            C0080c[] c0080cArr2 = this.f1593f;
            int i7 = this.f1594g + 1;
            Arrays.fill(c0080cArr2, i7, i7 + i4, (Object) null);
            this.f1594g += i4;
        }
    }

    public final void b(C0080c c0080c) {
        int i2 = this.f1592e;
        int i3 = c0080c.f1580c;
        if (i3 > i2) {
            C0080c[] c0080cArr = this.f1593f;
            AbstractC0251h.P(c0080cArr, 0, c0080cArr.length);
            this.f1594g = this.f1593f.length - 1;
            this.f1595h = 0;
            this.f1596i = 0;
            return;
        }
        a((this.f1596i + i3) - i2);
        int i4 = this.f1595h + 1;
        C0080c[] c0080cArr2 = this.f1593f;
        if (i4 > c0080cArr2.length) {
            C0080c[] c0080cArr3 = new C0080c[c0080cArr2.length * 2];
            System.arraycopy(c0080cArr2, 0, c0080cArr3, c0080cArr2.length, c0080cArr2.length);
            this.f1594g = this.f1593f.length - 1;
            this.f1593f = c0080cArr3;
        }
        int i5 = this.f1594g;
        this.f1594g = i5 - 1;
        this.f1593f[i5] = c0080c;
        this.f1595h++;
        this.f1596i += i3;
    }

    public final void c(W1.j data) {
        kotlin.jvm.internal.i.e(data, "data");
        W1.g gVar = this.f1589b;
        int i2 = 0;
        if (this.f1588a) {
            int[] iArr = B.f1557a;
            int a2 = data.a();
            int i3 = 0;
            long j2 = 0;
            while (i3 < a2) {
                int i4 = i3 + 1;
                byte d2 = data.d(i3);
                byte[] bArr = K1.b.f1051a;
                j2 += B.f1558b[d2 & 255];
                i3 = i4;
            }
            if (((int) ((j2 + 7) >> 3)) < data.a()) {
                W1.g gVar2 = new W1.g();
                int[] iArr2 = B.f1557a;
                int a3 = data.a();
                long j3 = 0;
                int i5 = 0;
                while (i2 < a3) {
                    int i6 = i2 + 1;
                    byte d3 = data.d(i2);
                    byte[] bArr2 = K1.b.f1051a;
                    int i7 = d3 & 255;
                    int i8 = B.f1557a[i7];
                    byte b2 = B.f1558b[i7];
                    j3 = (j3 << b2) | i8;
                    i5 += b2;
                    while (i5 >= 8) {
                        i5 -= 8;
                        gVar2.u((int) (j3 >> i5));
                    }
                    i2 = i6;
                }
                if (i5 > 0) {
                    gVar2.u((int) ((255 >>> i5) | (j3 << (8 - i5))));
                }
                W1.j k2 = gVar2.k(gVar2.f1875b);
                e(k2.a(), 127, 128);
                gVar.r(k2);
                return;
            }
        }
        e(data.a(), 127, 0);
        gVar.r(data);
    }

    public final void d(ArrayList arrayList) {
        int i2;
        int i3;
        if (this.f1591d) {
            int i4 = this.f1590c;
            if (i4 < this.f1592e) {
                e(i4, 31, 32);
            }
            this.f1591d = false;
            this.f1590c = Integer.MAX_VALUE;
            e(this.f1592e, 31, 32);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            C0080c c0080c = (C0080c) arrayList.get(i5);
            W1.j g2 = c0080c.f1578a.g();
            Integer num = (Integer) f.f1598b.get(g2);
            W1.j jVar = c0080c.f1579b;
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (2 <= i3 && i3 < 8) {
                    C0080c[] c0080cArr = f.f1597a;
                    if (kotlin.jvm.internal.i.a(c0080cArr[intValue].f1579b, jVar)) {
                        i2 = i3;
                    } else if (kotlin.jvm.internal.i.a(c0080cArr[i3].f1579b, jVar)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i7 = this.f1594g + 1;
                int length = this.f1593f.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    int i8 = i7 + 1;
                    C0080c c0080c2 = this.f1593f[i7];
                    kotlin.jvm.internal.i.b(c0080c2);
                    if (kotlin.jvm.internal.i.a(c0080c2.f1578a, g2)) {
                        C0080c c0080c3 = this.f1593f[i7];
                        kotlin.jvm.internal.i.b(c0080c3);
                        if (kotlin.jvm.internal.i.a(c0080c3.f1579b, jVar)) {
                            i3 = f.f1597a.length + (i7 - this.f1594g);
                            break;
                        } else if (i2 == -1) {
                            i2 = f.f1597a.length + (i7 - this.f1594g);
                        }
                    }
                    i7 = i8;
                }
            }
            if (i3 != -1) {
                e(i3, 127, 128);
            } else if (i2 == -1) {
                this.f1589b.u(64);
                c(g2);
                c(jVar);
                b(c0080c);
            } else {
                W1.j prefix = C0080c.f1572d;
                g2.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (!g2.f(prefix, prefix.a()) || kotlin.jvm.internal.i.a(C0080c.f1577i, g2)) {
                    e(i2, 63, 64);
                    c(jVar);
                    b(c0080c);
                } else {
                    e(i2, 15, 0);
                    c(jVar);
                }
            }
            i5 = i6;
        }
    }

    public final void e(int i2, int i3, int i4) {
        W1.g gVar = this.f1589b;
        if (i2 < i3) {
            gVar.u(i2 | i4);
            return;
        }
        gVar.u(i4 | i3);
        int i5 = i2 - i3;
        while (i5 >= 128) {
            gVar.u(128 | (i5 & 127));
            i5 >>>= 7;
        }
        gVar.u(i5);
    }
}
