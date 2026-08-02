package com.anythink.core.common.n.b.a.e;

import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.common.n.c.w;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f15923a;

    /* renamed from: b, reason: collision with root package name */
    static final Map<com.anythink.core.common.n.c.f, Integer> f15924b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15925c = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15926d = 31;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15927e = 63;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15928f = 127;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        c[] f15929a;

        /* renamed from: b, reason: collision with root package name */
        int f15930b;

        /* renamed from: c, reason: collision with root package name */
        int f15931c;

        /* renamed from: d, reason: collision with root package name */
        int f15932d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c> f15933e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15934f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15935g;

        /* renamed from: h, reason: collision with root package name */
        private int f15936h;

        public a(w wVar, byte b9) {
            this(wVar);
        }

        private int a(int i) {
            int i4;
            int i6 = 0;
            if (i > 0) {
                int length = this.f15929a.length;
                while (true) {
                    length--;
                    i4 = this.f15930b;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    int i9 = this.f15929a[length].f15922n;
                    i -= i9;
                    this.f15932d -= i9;
                    this.f15931c--;
                    i6++;
                }
                c[] cVarArr = this.f15929a;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i6, this.f15931c);
                this.f15930b += i6;
            }
            return i6;
        }

        private int c() {
            return this.f15936h;
        }

        private void d() {
            int i = this.f15936h;
            int i4 = this.f15932d;
            if (i < i4) {
                if (i == 0) {
                    e();
                } else {
                    a(i4 - i);
                }
            }
        }

        private void e() {
            Arrays.fill(this.f15929a, (Object) null);
            this.f15930b = this.f15929a.length - 1;
            this.f15931c = 0;
            this.f15932d = 0;
        }

        private void f() {
            this.f15933e.add(new c(d.a(i()), i()));
        }

        private void g() {
            a(new c(d.a(i()), i()));
        }

        private int h() {
            return this.f15934f.k() & 255;
        }

        private com.anythink.core.common.n.c.f i() {
            int h3 = h();
            boolean z6 = (h3 & 128) == 128;
            int a9 = a(h3, 127);
            return z6 ? com.anythink.core.common.n.c.f.a(k.a().a(this.f15934f.h(a9))) : this.f15934f.d(a9);
        }

        public final List<c> b() {
            ArrayList arrayList = new ArrayList(this.f15933e);
            this.f15933e.clear();
            return arrayList;
        }

        private a(w wVar) {
            this.f15933e = new ArrayList();
            this.f15929a = new c[8];
            this.f15930b = r0.length - 1;
            this.f15931c = 0;
            this.f15932d = 0;
            this.f15935g = 4096;
            this.f15936h = 4096;
            this.f15934f = com.anythink.core.common.n.c.n.a(wVar);
        }

        private int c(int i) {
            return this.f15930b + 1 + i;
        }

        private void b(int i) {
            if (g(i)) {
                this.f15933e.add(d.f15923a[i]);
                return;
            }
            int c9 = c(i - d.f15923a.length);
            if (c9 >= 0) {
                c[] cVarArr = this.f15929a;
                if (c9 < cVarArr.length) {
                    this.f15933e.add(cVarArr[c9]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void d(int i) {
            this.f15933e.add(new c(f(i), i()));
        }

        private com.anythink.core.common.n.c.f f(int i) {
            if (g(i)) {
                return d.f15923a[i].f15920l;
            }
            int c9 = c(i - d.f15923a.length);
            if (c9 >= 0) {
                c[] cVarArr = this.f15929a;
                if (c9 < cVarArr.length) {
                    return cVarArr[c9].f15920l;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private static boolean g(int i) {
            return i >= 0 && i <= d.f15923a.length - 1;
        }

        private void e(int i) {
            a(new c(f(i), i()));
        }

        public final void a() {
            while (!this.f15934f.g()) {
                byte k9 = this.f15934f.k();
                int i = k9 & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((k9 & com.anythink.core.common.s.a.c.f17103a) == 128) {
                    int a9 = a(i, 127);
                    int i4 = a9 - 1;
                    if (g(i4)) {
                        this.f15933e.add(d.f15923a[i4]);
                    } else {
                        int c9 = c(i4 - d.f15923a.length);
                        if (c9 >= 0) {
                            c[] cVarArr = this.f15929a;
                            if (c9 < cVarArr.length) {
                                this.f15933e.add(cVarArr[c9]);
                            }
                        }
                        throw new IOException(Wv.f(a9, "Header index too large "));
                    }
                } else if (i == 64) {
                    a(new c(d.a(i()), i()));
                } else if ((k9 & com.anythink.core.common.s.a.c.f17104b) == 64) {
                    a(new c(f(a(i, d.f15927e) - 1), i()));
                } else if ((k9 & 32) == 32) {
                    int a10 = a(i, 31);
                    this.f15936h = a10;
                    if (a10 >= 0 && a10 <= this.f15935g) {
                        d();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f15936h);
                    }
                } else if (i != 16 && i != 0) {
                    this.f15933e.add(new c(f(a(i, 15) - 1), i()));
                } else {
                    this.f15933e.add(new c(d.a(i()), i()));
                }
            }
        }

        private void a(c cVar) {
            this.f15933e.add(cVar);
            int i = cVar.f15922n;
            int i4 = this.f15936h;
            if (i > i4) {
                e();
                return;
            }
            a((this.f15932d + i) - i4);
            int i6 = this.f15931c + 1;
            c[] cVarArr = this.f15929a;
            if (i6 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15930b = this.f15929a.length - 1;
                this.f15929a = cVarArr2;
            }
            int i9 = this.f15930b;
            this.f15930b = i9 - 1;
            this.f15929a[i9] = cVar;
            this.f15931c++;
            this.f15932d += i;
        }

        private int a(int i, int i4) {
            int i6 = i & i4;
            if (i6 < i4) {
                return i6;
            }
            int i9 = 0;
            while (true) {
                int h3 = h();
                if ((h3 & 128) == 0) {
                    return i4 + (h3 << i9);
                }
                i4 += (h3 & 127) << i9;
                i9 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        private static final int f15937g = 4096;

        /* renamed from: h, reason: collision with root package name */
        private static final int f15938h = 16384;

        /* renamed from: a, reason: collision with root package name */
        int f15939a;

        /* renamed from: b, reason: collision with root package name */
        int f15940b;

        /* renamed from: c, reason: collision with root package name */
        c[] f15941c;

        /* renamed from: d, reason: collision with root package name */
        int f15942d;

        /* renamed from: e, reason: collision with root package name */
        int f15943e;

        /* renamed from: f, reason: collision with root package name */
        int f15944f;
        private final com.anythink.core.common.n.c.c i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f15945j;

        /* renamed from: k, reason: collision with root package name */
        private int f15946k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15947l;

        public b(com.anythink.core.common.n.c.c cVar) {
            this(cVar, (byte) 0);
        }

        private void a() {
            Arrays.fill(this.f15941c, (Object) null);
            this.f15942d = this.f15941c.length - 1;
            this.f15943e = 0;
            this.f15944f = 0;
        }

        private int b(int i) {
            int i4;
            int i6 = 0;
            if (i > 0) {
                int length = this.f15941c.length;
                while (true) {
                    length--;
                    i4 = this.f15942d;
                    if (length < i4 || i <= 0) {
                        break;
                    }
                    int i9 = this.f15941c[length].f15922n;
                    i -= i9;
                    this.f15944f -= i9;
                    this.f15943e--;
                    i6++;
                }
                c[] cVarArr = this.f15941c;
                System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i6, this.f15943e);
                c[] cVarArr2 = this.f15941c;
                int i10 = this.f15942d;
                Arrays.fill(cVarArr2, i10 + 1, i10 + 1 + i6, (Object) null);
                this.f15942d += i6;
            }
            return i6;
        }

        private b(com.anythink.core.common.n.c.c cVar, byte b9) {
            this.f15946k = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f15941c = cVarArr;
            this.f15942d = cVarArr.length - 1;
            this.f15943e = 0;
            this.f15944f = 0;
            this.f15939a = f15937g;
            this.f15940b = f15937g;
            this.f15945j = true;
            this.i = cVar;
        }

        private void a(c cVar) {
            int i = cVar.f15922n;
            int i4 = this.f15940b;
            if (i > i4) {
                a();
                return;
            }
            b((this.f15944f + i) - i4);
            int i6 = this.f15943e + 1;
            c[] cVarArr = this.f15941c;
            if (i6 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15942d = this.f15941c.length - 1;
                this.f15941c = cVarArr2;
            }
            int i9 = this.f15942d;
            this.f15942d = i9 - 1;
            this.f15941c[i9] = cVar;
            this.f15943e++;
            this.f15944f += i;
        }

        private void b() {
            int i = this.f15940b;
            int i4 = this.f15944f;
            if (i < i4) {
                if (i == 0) {
                    a();
                } else {
                    b(i4 - i);
                }
            }
        }

        public final void a(List<c> list) {
            int i;
            int i4;
            if (this.f15947l) {
                int i6 = this.f15946k;
                if (i6 < this.f15940b) {
                    a(i6, 31, 32);
                }
                this.f15947l = false;
                this.f15946k = Integer.MAX_VALUE;
                a(this.f15940b, 31, 32);
            }
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                c cVar = list.get(i9);
                com.anythink.core.common.n.c.f h3 = cVar.f15920l.h();
                com.anythink.core.common.n.c.f fVar = cVar.f15921m;
                Integer num = d.f15924b.get(h3);
                if (num != null) {
                    int intValue = num.intValue();
                    i4 = intValue + 1;
                    if (i4 > 1 && i4 < 8) {
                        c[] cVarArr = d.f15923a;
                        if (Objects.equals(cVarArr[intValue].f15921m, fVar)) {
                            i = i4;
                        } else if (Objects.equals(cVarArr[i4].f15921m, fVar)) {
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
                    int i10 = this.f15942d + 1;
                    int length = this.f15941c.length;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f15941c[i10].f15920l, h3)) {
                            if (Objects.equals(this.f15941c[i10].f15921m, fVar)) {
                                i4 = (i10 - this.f15942d) + d.f15923a.length;
                                break;
                            } else if (i == -1) {
                                i = (i10 - this.f15942d) + d.f15923a.length;
                            }
                        }
                        i10++;
                    }
                }
                if (i4 != -1) {
                    a(i4, 127, 128);
                } else if (i == -1) {
                    this.i.l(64);
                    a(h3);
                    a(fVar);
                    a(cVar);
                } else if (h3.c(c.f15910a) && !c.f15919k.equals(h3)) {
                    a(i, 15, 0);
                    a(fVar);
                } else {
                    a(i, d.f15927e, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        private void a(int i, int i4, int i6) {
            if (i < i4) {
                this.i.l(i | i6);
                return;
            }
            this.i.l(i6 | i4);
            int i9 = i - i4;
            while (i9 >= 128) {
                this.i.l(128 | (i9 & 127));
                i9 >>>= 7;
            }
            this.i.l(i9);
        }

        private void a(com.anythink.core.common.n.c.f fVar) {
            if (this.f15945j) {
                k.a();
                if (k.a(fVar) < fVar.j()) {
                    com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                    k.a();
                    k.a(fVar, cVar);
                    com.anythink.core.common.n.c.f t6 = cVar.t();
                    a(t6.j(), 127, 128);
                    this.i.d(t6);
                    return;
                }
            }
            a(fVar.j(), 127, 0);
            this.i.d(fVar);
        }

        public final void a(int i) {
            this.f15939a = i;
            int min = Math.min(i, f15938h);
            int i4 = this.f15940b;
            if (i4 == min) {
                return;
            }
            if (min < i4) {
                this.f15946k = Math.min(this.f15946k, min);
            }
            this.f15947l = true;
            this.f15940b = min;
            int i6 = this.f15944f;
            if (min < i6) {
                if (min == 0) {
                    a();
                } else {
                    b(i6 - min);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f15919k, "");
        com.anythink.core.common.n.c.f fVar = c.f15917h;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.anythink.core.common.n.c.f fVar2 = c.i;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.anythink.core.common.n.c.f fVar3 = c.f15918j;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.anythink.core.common.n.c.f fVar4 = c.f15916g;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c(ATCustomRuleKeys.AGE, ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f15923a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int i = 0;
        while (true) {
            c[] cVarArr2 = f15923a;
            if (i >= cVarArr2.length) {
                f15924b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(cVarArr2[i].f15920l)) {
                    linkedHashMap.put(cVarArr2[i].f15920l, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    private d() {
    }

    private static Map<com.anythink.core.common.n.c.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f15923a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f15923a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f15920l)) {
                linkedHashMap.put(cVarArr[i].f15920l, Integer.valueOf(i));
            }
            i++;
        }
    }

    public static com.anythink.core.common.n.c.f a(com.anythink.core.common.n.c.f fVar) {
        int j6 = fVar.j();
        for (int i = 0; i < j6; i++) {
            byte b9 = fVar.b(i);
            if (b9 >= 65 && b9 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a());
            }
        }
        return fVar;
    }
}
