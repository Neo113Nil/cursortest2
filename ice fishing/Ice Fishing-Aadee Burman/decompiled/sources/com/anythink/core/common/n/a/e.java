package com.anythink.core.common.n.a;

import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class e extends com.anythink.core.common.n.a.a {
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private int f14797j;

    /* renamed from: k, reason: collision with root package name */
    private String f14798k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.a.b f14799l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f14800m;

    /* renamed from: n, reason: collision with root package name */
    private int f14801n;

    /* renamed from: o, reason: collision with root package name */
    private int f14802o;

    /* renamed from: p, reason: collision with root package name */
    private List<l> f14803p;

    /* renamed from: q, reason: collision with root package name */
    private List<l> f14804q;

    /* renamed from: r, reason: collision with root package name */
    private List<l> f14805r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f14806a;

        /* renamed from: b, reason: collision with root package name */
        private String f14807b;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f14808a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14809b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14810c;

        /* renamed from: d, reason: collision with root package name */
        private int f14811d;

        /* renamed from: e, reason: collision with root package name */
        private final List<l> f14812e;

        public /* synthetic */ b(String str, int i, int i6, byte b9) {
            this(str, i, i6);
        }

        private b(String str, int i, int i6) {
            this.f14808a = str;
            this.f14809b = i;
            this.f14810c = i6;
            this.f14811d = 0;
            this.f14812e = new ArrayList();
        }

        private void a(l lVar) {
            if (lVar != null) {
                this.f14812e.add(lVar);
            }
        }

        public static /* synthetic */ void a(b bVar, l lVar) {
            bVar.f14812e.add(lVar);
        }
    }

    public e(String str, com.anythink.core.common.n.a.b bVar, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.f14798k = str;
        this.f14797j = 4;
        this.f14799l = bVar;
        this.f14800m = bArr;
        this.i = new Date().getTime() / 1000;
        if (this.f14800m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c9 = c(0);
        this.f14782e = c9;
        if (c9 != this.f14799l.f14782e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14783f = (b10 >> 3) & 7;
        this.f14801n = (b10 >> 2) & 1;
        this.f14784g = b10 & 1;
        int b11 = b(3);
        this.f14785h = (b11 >> 7) & 1;
        this.f14802o = b11 & 15;
        int d2 = d();
        b bVar2 = new b("answer", c(6), d2, b9);
        a(bVar2);
        this.f14803p = bVar2.f14812e;
        int i = d2 + bVar2.f14811d;
        b bVar3 = new b("authority", c(8), i, b9);
        a(bVar3);
        this.f14804q = bVar3.f14812e;
        String str2 = "additional";
        b bVar4 = new b(str2, c(10), i + bVar3.f14811d, b9);
        a(bVar4);
        this.f14805r = bVar4.f14812e;
    }

    private void a(b bVar) {
        int i = bVar.f14810c;
        for (int i6 = bVar.f14809b; i6 > 0; i6--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException(u1.h.g(new StringBuilder("read "), bVar.f14808a, " error"));
            }
            int i9 = i + a9.f14806a;
            short c9 = c(i9);
            short c10 = c(i9 + 2);
            int i10 = i9 + 4;
            int i11 = i9 + 7;
            byte[] bArr = this.f14800m;
            if (i11 >= bArr.length) {
                throw new IOException("read response data out of range");
            }
            int i12 = (bArr[i11] & 255) + ((bArr[i10] & 255) << 24) + ((bArr[i9 + 5] & 255) << 16) + ((bArr[i9 + 6] & 255) << 8);
            short c11 = c(i9 + 8);
            int i13 = i9 + 10;
            String a10 = a(c9, i13, c11);
            if (c10 == 1 && (c9 == 5 || c9 == this.f14799l.a())) {
                b.a(bVar, new l(a10, c9, i12, this.i, this.f14797j, this.f14798k));
            }
            i = i13 + c11;
        }
        bVar.f14811d = i - bVar.f14810c;
    }

    private void b() {
        if (this.f14800m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c9 = c(0);
        this.f14782e = c9;
        if (c9 != this.f14799l.f14782e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14783f = (b10 >> 3) & 7;
        this.f14801n = (b10 >> 2) & 1;
        this.f14784g = b10 & 1;
        int b11 = b(3);
        this.f14785h = (b11 >> 7) & 1;
        this.f14802o = b11 & 15;
        int d2 = d();
        b bVar = new b("answer", c(6), d2, b9);
        a(bVar);
        this.f14803p = bVar.f14812e;
        int i = d2 + bVar.f14811d;
        b bVar2 = new b("authority", c(8), i, b9);
        a(bVar2);
        this.f14804q = bVar2.f14812e;
        String str = "additional";
        b bVar3 = new b(str, c(10), i + bVar2.f14811d, b9);
        a(bVar3);
        this.f14805r = bVar3.f14812e;
    }

    private void c() {
        short c9 = c(0);
        this.f14782e = c9;
        if (c9 != this.f14799l.f14782e) {
            throw new IOException("question id error");
        }
        int b9 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f14783f = (b9 >> 3) & 7;
        this.f14801n = (b9 >> 2) & 1;
        this.f14784g = b9 & 1;
        int b10 = b(3);
        this.f14785h = (b10 >> 7) & 1;
        this.f14802o = b10 & 15;
    }

    private int d() {
        int i = 12;
        for (int c9 = c(4); c9 > 0; c9--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException("read Question error");
            }
            i += a9.f14806a + 4;
        }
        return i;
    }

    private int e() {
        return this.f14801n;
    }

    private int f() {
        return this.f14802o;
    }

    private List<l> g() {
        return this.f14805r;
    }

    private List<l> h() {
        return this.f14804q;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.f14782e), Integer.valueOf(this.f14784g), Integer.valueOf(this.f14785h), Integer.valueOf(this.f14801n), Integer.valueOf(this.f14802o), this.f14798k, this.f14799l, this.f14803p, this.f14804q, this.f14805r);
    }

    private int d(int i) {
        int i6 = i + 3;
        byte[] bArr = this.f14800m;
        if (i6 < bArr.length) {
            int i9 = (bArr[i] & 255) << 24;
            int i10 = (bArr[i + 1] & 255) << 16;
            return i9 + i10 + ((bArr[i + 2] & 255) << 8) + (bArr[i6] & 255);
        }
        throw new IOException("read response data out of range");
    }

    private short c(int i) {
        int i6 = i + 1;
        byte[] bArr = this.f14800m;
        if (i6 < bArr.length) {
            return (short) (((bArr[i] & 255) << 8) + (bArr[i6] & 255));
        }
        throw new IOException("read response data out of range");
    }

    private a a(int i) {
        StringBuilder sb = new StringBuilder();
        a aVar = new a((byte) 0);
        int i6 = 128;
        int i9 = i;
        do {
            int b9 = b(i9);
            int i10 = b9 & 192;
            if (i10 == 192) {
                if (aVar.f14806a <= 0) {
                    aVar.f14806a = (i9 + 2) - i;
                }
                i9 = b(i9 + 1) | ((b9 & 63) << 8);
            } else {
                if (i10 > 0) {
                    return null;
                }
                i9++;
                if (b9 > 0) {
                    if (sb.length() > 0) {
                        sb.append(com.anythink.core.common.d.j.f12378z);
                    }
                    int i11 = i9 + b9;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.f14800m, i9, i11))));
                    i9 = i11;
                }
            }
            if (b9 <= 0) {
                break;
            }
            i6--;
        } while (i6 > 0);
        aVar.f14807b = sb.toString();
        if (aVar.f14806a <= 0) {
            aVar.f14806a = i9 - i;
        }
        return aVar;
    }

    private int b(int i) {
        byte[] bArr = this.f14800m;
        if (i < bArr.length) {
            return bArr[i] & 255;
        }
        throw new IOException("read response data out of range");
    }

    private String a(int i, int i6, int i9) {
        if (i == 1) {
            if (i9 != 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b(i6));
            for (int i10 = 1; i10 < 4; i10++) {
                sb.append(com.anythink.core.common.d.j.f12378z);
                sb.append(b(i6 + i10));
            }
            return sb.toString();
        }
        if (i == 5) {
            if (i9 > 1) {
                return a(i6).f14807b;
            }
            return null;
        }
        if (i == 16) {
            if (i9 <= 0) {
                return null;
            }
            int i11 = i9 + i6;
            byte[] bArr = this.f14800m;
            if (i11 < bArr.length) {
                return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i6, i11)));
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
            int i13 = i6 + i12;
            sb2.append(b(i13));
            sb2.append(b(i13 + 1));
            i12 += 2;
        }
        return sb2.toString();
    }

    public final List<l> a() {
        return this.f14803p;
    }
}
