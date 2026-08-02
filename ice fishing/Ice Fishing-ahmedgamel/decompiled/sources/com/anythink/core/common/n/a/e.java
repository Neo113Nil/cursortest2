package com.anythink.core.common.n.a;

import com.google.android.gms.internal.ads.Wv;
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
    private int f15583j;

    /* renamed from: k, reason: collision with root package name */
    private String f15584k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.a.b f15585l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f15586m;

    /* renamed from: n, reason: collision with root package name */
    private int f15587n;

    /* renamed from: o, reason: collision with root package name */
    private int f15588o;

    /* renamed from: p, reason: collision with root package name */
    private List<l> f15589p;

    /* renamed from: q, reason: collision with root package name */
    private List<l> f15590q;

    /* renamed from: r, reason: collision with root package name */
    private List<l> f15591r;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f15592a;

        /* renamed from: b, reason: collision with root package name */
        private String f15593b;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15594a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15595b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15596c;

        /* renamed from: d, reason: collision with root package name */
        private int f15597d;

        /* renamed from: e, reason: collision with root package name */
        private final List<l> f15598e;

        public /* synthetic */ b(String str, int i, int i4, byte b9) {
            this(str, i, i4);
        }

        private b(String str, int i, int i4) {
            this.f15594a = str;
            this.f15595b = i;
            this.f15596c = i4;
            this.f15597d = 0;
            this.f15598e = new ArrayList();
        }

        private void a(l lVar) {
            if (lVar != null) {
                this.f15598e.add(lVar);
            }
        }

        public static /* synthetic */ void a(b bVar, l lVar) {
            bVar.f15598e.add(lVar);
        }
    }

    public e(String str, com.anythink.core.common.n.a.b bVar, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.f15584k = str;
        this.f15583j = 4;
        this.f15585l = bVar;
        this.f15586m = bArr;
        this.i = new Date().getTime() / 1000;
        if (this.f15586m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c9 = c(0);
        this.f15568e = c9;
        if (c9 != this.f15585l.f15568e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f15569f = (b10 >> 3) & 7;
        this.f15587n = (b10 >> 2) & 1;
        this.f15570g = b10 & 1;
        int b11 = b(3);
        this.f15571h = (b11 >> 7) & 1;
        this.f15588o = b11 & 15;
        int d9 = d();
        b bVar2 = new b("answer", c(6), d9, b9);
        a(bVar2);
        this.f15589p = bVar2.f15598e;
        int i = d9 + bVar2.f15597d;
        b bVar3 = new b("authority", c(8), i, b9);
        a(bVar3);
        this.f15590q = bVar3.f15598e;
        String str2 = "additional";
        b bVar4 = new b(str2, c(10), i + bVar3.f15597d, b9);
        a(bVar4);
        this.f15591r = bVar4.f15598e;
    }

    private void a(b bVar) {
        int i = bVar.f15596c;
        for (int i4 = bVar.f15595b; i4 > 0; i4--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException(Wv.i(new StringBuilder("read "), bVar.f15594a, " error"));
            }
            int i6 = i + a9.f15592a;
            short c9 = c(i6);
            short c10 = c(i6 + 2);
            int i9 = i6 + 4;
            int i10 = i6 + 7;
            byte[] bArr = this.f15586m;
            if (i10 >= bArr.length) {
                throw new IOException("read response data out of range");
            }
            int i11 = (bArr[i10] & 255) + ((bArr[i9] & 255) << 24) + ((bArr[i6 + 5] & 255) << 16) + ((bArr[i6 + 6] & 255) << 8);
            short c11 = c(i6 + 8);
            int i12 = i6 + 10;
            String a10 = a(c9, i12, c11);
            if (c10 == 1 && (c9 == 5 || c9 == this.f15585l.a())) {
                b.a(bVar, new l(a10, c9, i11, this.i, this.f15583j, this.f15584k));
            }
            i = i12 + c11;
        }
        bVar.f15597d = i - bVar.f15596c;
    }

    private void b() {
        if (this.f15586m.length < 12) {
            throw new IOException("response data too small");
        }
        byte b9 = 0;
        short c9 = c(0);
        this.f15568e = c9;
        if (c9 != this.f15585l.f15568e) {
            throw new IOException("question id error");
        }
        int b10 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f15569f = (b10 >> 3) & 7;
        this.f15587n = (b10 >> 2) & 1;
        this.f15570g = b10 & 1;
        int b11 = b(3);
        this.f15571h = (b11 >> 7) & 1;
        this.f15588o = b11 & 15;
        int d9 = d();
        b bVar = new b("answer", c(6), d9, b9);
        a(bVar);
        this.f15589p = bVar.f15598e;
        int i = d9 + bVar.f15597d;
        b bVar2 = new b("authority", c(8), i, b9);
        a(bVar2);
        this.f15590q = bVar2.f15598e;
        String str = "additional";
        b bVar3 = new b(str, c(10), i + bVar2.f15597d, b9);
        a(bVar3);
        this.f15591r = bVar3.f15598e;
    }

    private void c() {
        short c9 = c(0);
        this.f15568e = c9;
        if (c9 != this.f15585l.f15568e) {
            throw new IOException("question id error");
        }
        int b9 = b(2);
        if ((b(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.f15569f = (b9 >> 3) & 7;
        this.f15587n = (b9 >> 2) & 1;
        this.f15570g = b9 & 1;
        int b10 = b(3);
        this.f15571h = (b10 >> 7) & 1;
        this.f15588o = b10 & 15;
    }

    private int d() {
        int i = 12;
        for (int c9 = c(4); c9 > 0; c9--) {
            a a9 = a(i);
            if (a9 == null) {
                throw new IOException("read Question error");
            }
            i += a9.f15592a + 4;
        }
        return i;
    }

    private int e() {
        return this.f15587n;
    }

    private int f() {
        return this.f15588o;
    }

    private List<l> g() {
        return this.f15591r;
    }

    private List<l> h() {
        return this.f15590q;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.f15568e), Integer.valueOf(this.f15570g), Integer.valueOf(this.f15571h), Integer.valueOf(this.f15587n), Integer.valueOf(this.f15588o), this.f15584k, this.f15585l, this.f15589p, this.f15590q, this.f15591r);
    }

    private int d(int i) {
        int i4 = i + 3;
        byte[] bArr = this.f15586m;
        if (i4 < bArr.length) {
            int i6 = (bArr[i] & 255) << 24;
            int i9 = (bArr[i + 1] & 255) << 16;
            return i6 + i9 + ((bArr[i + 2] & 255) << 8) + (bArr[i4] & 255);
        }
        throw new IOException("read response data out of range");
    }

    private short c(int i) {
        int i4 = i + 1;
        byte[] bArr = this.f15586m;
        if (i4 < bArr.length) {
            return (short) (((bArr[i] & 255) << 8) + (bArr[i4] & 255));
        }
        throw new IOException("read response data out of range");
    }

    private a a(int i) {
        StringBuilder sb = new StringBuilder();
        a aVar = new a((byte) 0);
        int i4 = 128;
        int i6 = i;
        do {
            int b9 = b(i6);
            int i9 = b9 & 192;
            if (i9 == 192) {
                if (aVar.f15592a <= 0) {
                    aVar.f15592a = (i6 + 2) - i;
                }
                i6 = b(i6 + 1) | ((b9 & 63) << 8);
            } else {
                if (i9 > 0) {
                    return null;
                }
                i6++;
                if (b9 > 0) {
                    if (sb.length() > 0) {
                        sb.append(com.anythink.core.common.d.j.f13164z);
                    }
                    int i10 = i6 + b9;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.f15586m, i6, i10))));
                    i6 = i10;
                }
            }
            if (b9 <= 0) {
                break;
            }
            i4--;
        } while (i4 > 0);
        aVar.f15593b = sb.toString();
        if (aVar.f15592a <= 0) {
            aVar.f15592a = i6 - i;
        }
        return aVar;
    }

    private int b(int i) {
        byte[] bArr = this.f15586m;
        if (i < bArr.length) {
            return bArr[i] & 255;
        }
        throw new IOException("read response data out of range");
    }

    private String a(int i, int i4, int i6) {
        if (i == 1) {
            if (i6 != 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b(i4));
            for (int i9 = 1; i9 < 4; i9++) {
                sb.append(com.anythink.core.common.d.j.f13164z);
                sb.append(b(i4 + i9));
            }
            return sb.toString();
        }
        if (i == 5) {
            if (i6 > 1) {
                return a(i4).f15593b;
            }
            return null;
        }
        if (i == 16) {
            if (i6 <= 0) {
                return null;
            }
            int i10 = i6 + i4;
            byte[] bArr = this.f15586m;
            if (i10 < bArr.length) {
                return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i4, i10)));
            }
            return null;
        }
        if (i != 28 || i6 != 16) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < 16) {
            sb2.append(i11 > 0 ? ":" : "");
            int i12 = i4 + i11;
            sb2.append(b(i12));
            sb2.append(b(i12 + 1));
            i11 += 2;
        }
        return sb2.toString();
    }

    public final List<l> a() {
        return this.f15589p;
    }
}
