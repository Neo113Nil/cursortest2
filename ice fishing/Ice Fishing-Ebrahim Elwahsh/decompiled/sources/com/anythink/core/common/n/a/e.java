package com.anythink.core.common.n.a;

import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
final class e extends com.anythink.core.common.n.a.a {
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private int f14954j;

    /* renamed from: k, reason: collision with root package name */
    private String f14955k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.a.b f14956l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f14957m;

    /* renamed from: n, reason: collision with root package name */
    private int f14958n;

    /* renamed from: o, reason: collision with root package name */
    private int f14959o;

    /* renamed from: p, reason: collision with root package name */
    private List<l> f14960p;

    /* renamed from: q, reason: collision with root package name */
    private List<l> f14961q;

    /* renamed from: r, reason: collision with root package name */
    private List<l> f14962r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f14963a;

        /* renamed from: b, reason: collision with root package name */
        private String f14964b;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14965a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14966b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14967c;

        /* renamed from: d, reason: collision with root package name */
        private int f14968d;

        /* renamed from: e, reason: collision with root package name */
        private final List<l> f14969e;

        public /* synthetic */ b(String str, int i, int i4, byte b9) {
            this(str, i, i4);
        }

        private b(String str, int i, int i4) {
            this.f14965a = str;
            this.f14966b = i;
            this.f14967c = i4;
            this.f14968d = 0;
            this.f14969e = new ArrayList();
        }

        private void a(l lVar) {
            if (lVar != null) {
                this.f14969e.add(lVar);
            }
        }

        public static /* synthetic */ void a(b bVar, l lVar) {
            bVar.f14969e.add(lVar);
        }
    }

    public e(String str, com.anythink.core.common.n.a.b bVar, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.f14955k = str;
        this.f14954j = 4;
        this.f14956l = bVar;
        this.f14957m = bArr;
        this.i = new Date().getTime() / 1000;
        if (this.f14957m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c4 = c(0);
        this.f14939e = c4;
        if (c4 != this.f14956l.f14939e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14940f = (b10 >> 3) & 7;
        this.f14958n = (b10 >> 2) & 1;
        this.f14941g = b10 & 1;
        int b11 = b(3);
        this.f14942h = (b11 >> 7) & 1;
        this.f14959o = b11 & 15;
        int d2 = d();
        b bVar2 = new b("answer", c(6), d2, b9);
        a(bVar2);
        this.f14960p = bVar2.f14969e;
        int i = d2 + bVar2.f14968d;
        b bVar3 = new b("authority", c(8), i, b9);
        a(bVar3);
        this.f14961q = bVar3.f14969e;
        String str2 = "additional";
        b bVar4 = new b(str2, c(10), i + bVar3.f14968d, b9);
        a(bVar4);
        this.f14962r = bVar4.f14969e;
    }

    private void a(b bVar) {
        int i = bVar.f14967c;
        for (int i4 = bVar.f14966b; i4 > 0; i4--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException(AbstractC5051n.g(new StringBuilder("read "), bVar.f14965a, " error"));
            }
            int i9 = i + a9.f14963a;
            short c4 = c(i9);
            short c9 = c(i9 + 2);
            int i10 = i9 + 4;
            int i11 = i9 + 7;
            byte[] bArr = this.f14957m;
            if (i11 >= bArr.length) {
                throw new IOException("read response data out of range");
            }
            int i12 = (bArr[i11] & 255) + ((bArr[i10] & 255) << 24) + ((bArr[i9 + 5] & 255) << 16) + ((bArr[i9 + 6] & 255) << 8);
            short c10 = c(i9 + 8);
            int i13 = i9 + 10;
            String a10 = a(c4, i13, c10);
            if (c9 == 1 && (c4 == 5 || c4 == this.f14956l.a())) {
                b.a(bVar, new l(a10, c4, i12, this.i, this.f14954j, this.f14955k));
            }
            i = i13 + c10;
        }
        bVar.f14968d = i - bVar.f14967c;
    }

    private void b() {
        if (this.f14957m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c4 = c(0);
        this.f14939e = c4;
        if (c4 != this.f14956l.f14939e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14940f = (b10 >> 3) & 7;
        this.f14958n = (b10 >> 2) & 1;
        this.f14941g = b10 & 1;
        int b11 = b(3);
        this.f14942h = (b11 >> 7) & 1;
        this.f14959o = b11 & 15;
        int d2 = d();
        b bVar = new b("answer", c(6), d2, b9);
        a(bVar);
        this.f14960p = bVar.f14969e;
        int i = d2 + bVar.f14968d;
        b bVar2 = new b("authority", c(8), i, b9);
        a(bVar2);
        this.f14961q = bVar2.f14969e;
        String str = "additional";
        b bVar3 = new b(str, c(10), i + bVar2.f14968d, b9);
        a(bVar3);
        this.f14962r = bVar3.f14969e;
    }

    private void c() {
        short c4 = c(0);
        this.f14939e = c4;
        if (c4 != this.f14956l.f14939e) {
            throw new IOException("question id error");
        }
        int b9 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14940f = (b9 >> 3) & 7;
        this.f14958n = (b9 >> 2) & 1;
        this.f14941g = b9 & 1;
        int b10 = b(3);
        this.f14942h = (b10 >> 7) & 1;
        this.f14959o = b10 & 15;
    }

    private int d() {
        int i = 12;
        for (int c4 = c(4); c4 > 0; c4--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException("read Question error");
            }
            i += a9.f14963a + 4;
        }
        return i;
    }

    private int e() {
        return this.f14958n;
    }

    private int f() {
        return this.f14959o;
    }

    private List<l> g() {
        return this.f14962r;
    }

    private List<l> h() {
        return this.f14961q;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.f14939e), Integer.valueOf(this.f14941g), Integer.valueOf(this.f14942h), Integer.valueOf(this.f14958n), Integer.valueOf(this.f14959o), this.f14955k, this.f14956l, this.f14960p, this.f14961q, this.f14962r);
    }

    private int d(int i) {
        int i4 = i + 3;
        byte[] bArr = this.f14957m;
        if (i4 < bArr.length) {
            int i9 = (bArr[i] & 255) << 24;
            int i10 = (bArr[i + 1] & 255) << 16;
            return i9 + i10 + ((bArr[i + 2] & 255) << 8) + (bArr[i4] & 255);
        }
        throw new IOException("read response data out of range");
    }

    private short c(int i) {
        int i4 = i + 1;
        byte[] bArr = this.f14957m;
        if (i4 < bArr.length) {
            return (short) (((bArr[i] & 255) << 8) + (bArr[i4] & 255));
        }
        throw new IOException("read response data out of range");
    }

    private a a(int i) {
        StringBuilder sb = new StringBuilder();
        a aVar = new a((byte) 0);
        int i4 = 128;
        int i9 = i;
        do {
            int b9 = b(i9);
            int i10 = b9 & 192;
            if (i10 == 192) {
                if (aVar.f14963a <= 0) {
                    aVar.f14963a = (i9 + 2) - i;
                }
                i9 = b(i9 + 1) | ((b9 & 63) << 8);
            } else {
                if (i10 > 0) {
                    return null;
                }
                i9++;
                if (b9 > 0) {
                    if (sb.length() > 0) {
                        sb.append(com.anythink.core.common.d.j.f12535z);
                    }
                    int i11 = i9 + b9;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.f14957m, i9, i11))));
                    i9 = i11;
                }
            }
            if (b9 <= 0) {
                break;
            }
            i4--;
        } while (i4 > 0);
        aVar.f14964b = sb.toString();
        if (aVar.f14963a <= 0) {
            aVar.f14963a = i9 - i;
        }
        return aVar;
    }

    private int b(int i) {
        byte[] bArr = this.f14957m;
        if (i < bArr.length) {
            return bArr[i] & 255;
        }
        throw new IOException("read response data out of range");
    }

    private String a(int i, int i4, int i9) {
        if (i == 1) {
            if (i9 != 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b(i4));
            for (int i10 = 1; i10 < 4; i10++) {
                sb.append(com.anythink.core.common.d.j.f12535z);
                sb.append(b(i4 + i10));
            }
            return sb.toString();
        }
        if (i == 5) {
            if (i9 > 1) {
                return a(i4).f14964b;
            }
            return null;
        }
        if (i == 16) {
            if (i9 <= 0) {
                return null;
            }
            int i11 = i9 + i4;
            byte[] bArr = this.f14957m;
            if (i11 < bArr.length) {
                return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i4, i11)));
            }
            return null;
        }
        if (i != 28 || i9 != 16) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (i12 < 16) {
            sb2.append(i12 > 0 ? ":" : "");
            int i13 = i4 + i12;
            sb2.append(b(i13));
            sb2.append(b(i13 + 1));
            i12 += 2;
        }
        return sb2.toString();
    }

    public final List<l> a() {
        return this.f14960p;
    }
}
