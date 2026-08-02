package com.anythink.core.common.n.b.a.e;

import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.common.n.c.w;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.icefishingapp.icefishing.AbstractC4404f;
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
    static final c[] f15136a;

    /* renamed from: b, reason: collision with root package name */
    static final Map<com.anythink.core.common.n.c.f, Integer> f15137b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f15138c = 15;

    /* renamed from: d, reason: collision with root package name */
    private static final int f15139d = 31;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15140e = 63;

    /* renamed from: f, reason: collision with root package name */
    private static final int f15141f = 127;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        c[] f15142a;

        /* renamed from: b, reason: collision with root package name */
        int f15143b;

        /* renamed from: c, reason: collision with root package name */
        int f15144c;

        /* renamed from: d, reason: collision with root package name */
        int f15145d;

        /* renamed from: e, reason: collision with root package name */
        private final List<c> f15146e;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.core.common.n.c.e f15147f;

        /* renamed from: g, reason: collision with root package name */
        private final int f15148g;

        /* renamed from: h, reason: collision with root package name */
        private int f15149h;

        public a(w wVar, byte b9) {
            this(wVar);
        }

        private int a(int i) {
            int i6;
            int i9 = 0;
            if (i > 0) {
                int length = this.f15142a.length;
                while (true) {
                    length--;
                    i6 = this.f15143b;
                    if (length < i6 || i <= 0) {
                        break;
                    }
                    int i10 = this.f15142a[length].f15135n;
                    i -= i10;
                    this.f15145d -= i10;
                    this.f15144c--;
                    i9++;
                }
                c[] cVarArr = this.f15142a;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i9, this.f15144c);
                this.f15143b += i9;
            }
            return i9;
        }

        private int c() {
            return this.f15149h;
        }

        private void d() {
            int i = this.f15149h;
            int i6 = this.f15145d;
            if (i < i6) {
                if (i == 0) {
                    e();
                } else {
                    a(i6 - i);
                }
            }
        }

        private void e() {
            Arrays.fill(this.f15142a, (Object) null);
            this.f15143b = this.f15142a.length - 1;
            this.f15144c = 0;
            this.f15145d = 0;
        }

        private void f() {
            this.f15146e.add(new c(d.a(i()), i()));
        }

        private void g() {
            a(new c(d.a(i()), i()));
        }

        private int h() {
            return this.f15147f.k() & 255;
        }

        private com.anythink.core.common.n.c.f i() {
            int h9 = h();
            boolean z3 = (h9 & 128) == 128;
            int a9 = a(h9, 127);
            return z3 ? com.anythink.core.common.n.c.f.a(k.a().a(this.f15147f.h(a9))) : this.f15147f.d(a9);
        }

        public final List<c> b() {
            ArrayList arrayList = new ArrayList(this.f15146e);
            this.f15146e.clear();
            return arrayList;
        }

        private a(w wVar) {
            this.f15146e = new ArrayList();
            this.f15142a = new c[8];
            this.f15143b = r0.length - 1;
            this.f15144c = 0;
            this.f15145d = 0;
            this.f15148g = 4096;
            this.f15149h = 4096;
            this.f15147f = com.anythink.core.common.n.c.n.a(wVar);
        }

        private int c(int i) {
            return this.f15143b + 1 + i;
        }

        private void b(int i) {
            if (g(i)) {
                this.f15146e.add(d.f15136a[i]);
                return;
            }
            int c9 = c(i - d.f15136a.length);
            if (c9 >= 0) {
                c[] cVarArr = this.f15142a;
                if (c9 < cVarArr.length) {
                    this.f15146e.add(cVarArr[c9]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private void d(int i) {
            this.f15146e.add(new c(f(i), i()));
        }

        private com.anythink.core.common.n.c.f f(int i) {
            if (g(i)) {
                return d.f15136a[i].f15133l;
            }
            int c9 = c(i - d.f15136a.length);
            if (c9 >= 0) {
                c[] cVarArr = this.f15142a;
                if (c9 < cVarArr.length) {
                    return cVarArr[c9].f15133l;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private static boolean g(int i) {
            return i >= 0 && i <= d.f15136a.length - 1;
        }

        private void e(int i) {
            a(new c(f(i), i()));
        }

        public final void a() {
            while (!this.f15147f.g()) {
                byte k9 = this.f15147f.k();
                int i = k9 & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                }
                if ((k9 & com.anythink.core.common.s.a.c.f16316a) == 128) {
                    int a9 = a(i, 127);
                    int i6 = a9 - 1;
                    if (g(i6)) {
                        this.f15146e.add(d.f15136a[i6]);
                    } else {
                        int c9 = c(i6 - d.f15136a.length);
                        if (c9 >= 0) {
                            c[] cVarArr = this.f15142a;
                            if (c9 < cVarArr.length) {
                                this.f15146e.add(cVarArr[c9]);
                            }
                        }
                        throw new IOException(AbstractC4404f.e(a9, "Header index too large "));
                    }
                } else if (i == 64) {
                    a(new c(d.a(i()), i()));
                } else if ((k9 & com.anythink.core.common.s.a.c.f16317b) == 64) {
                    a(new c(f(a(i, d.f15140e) - 1), i()));
                } else if ((k9 & 32) == 32) {
                    int a10 = a(i, 31);
                    this.f15149h = a10;
                    if (a10 >= 0 && a10 <= this.f15148g) {
                        d();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.f15149h);
                    }
                } else if (i != 16 && i != 0) {
                    this.f15146e.add(new c(f(a(i, 15) - 1), i()));
                } else {
                    this.f15146e.add(new c(d.a(i()), i()));
                }
            }
        }

        private void a(c cVar) {
            this.f15146e.add(cVar);
            int i = cVar.f15135n;
            int i6 = this.f15149h;
            if (i > i6) {
                e();
                return;
            }
            a((this.f15145d + i) - i6);
            int i9 = this.f15144c + 1;
            c[] cVarArr = this.f15142a;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15143b = this.f15142a.length - 1;
                this.f15142a = cVarArr2;
            }
            int i10 = this.f15143b;
            this.f15143b = i10 - 1;
            this.f15142a[i10] = cVar;
            this.f15144c++;
            this.f15145d += i;
        }

        private int a(int i, int i6) {
            int i9 = i & i6;
            if (i9 < i6) {
                return i9;
            }
            int i10 = 0;
            while (true) {
                int h9 = h();
                if ((h9 & 128) == 0) {
                    return i6 + (h9 << i10);
                }
                i6 += (h9 & 127) << i10;
                i10 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        private static final int f15150g = 4096;

        /* renamed from: h, reason: collision with root package name */
        private static final int f15151h = 16384;

        /* renamed from: a, reason: collision with root package name */
        int f15152a;

        /* renamed from: b, reason: collision with root package name */
        int f15153b;

        /* renamed from: c, reason: collision with root package name */
        c[] f15154c;

        /* renamed from: d, reason: collision with root package name */
        int f15155d;

        /* renamed from: e, reason: collision with root package name */
        int f15156e;

        /* renamed from: f, reason: collision with root package name */
        int f15157f;
        private final com.anythink.core.common.n.c.c i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f15158j;

        /* renamed from: k, reason: collision with root package name */
        private int f15159k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15160l;

        public b(com.anythink.core.common.n.c.c cVar) {
            this(cVar, (byte) 0);
        }

        private void a() {
            Arrays.fill(this.f15154c, (Object) null);
            this.f15155d = this.f15154c.length - 1;
            this.f15156e = 0;
            this.f15157f = 0;
        }

        private int b(int i) {
            int i6;
            int i9 = 0;
            if (i > 0) {
                int length = this.f15154c.length;
                while (true) {
                    length--;
                    i6 = this.f15155d;
                    if (length < i6 || i <= 0) {
                        break;
                    }
                    int i10 = this.f15154c[length].f15135n;
                    i -= i10;
                    this.f15157f -= i10;
                    this.f15156e--;
                    i9++;
                }
                c[] cVarArr = this.f15154c;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i9, this.f15156e);
                c[] cVarArr2 = this.f15154c;
                int i11 = this.f15155d;
                Arrays.fill(cVarArr2, i11 + 1, i11 + 1 + i9, (Object) null);
                this.f15155d += i9;
            }
            return i9;
        }

        private b(com.anythink.core.common.n.c.c cVar, byte b9) {
            this.f15159k = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f15154c = cVarArr;
            this.f15155d = cVarArr.length - 1;
            this.f15156e = 0;
            this.f15157f = 0;
            this.f15152a = f15150g;
            this.f15153b = f15150g;
            this.f15158j = true;
            this.i = cVar;
        }

        private void a(c cVar) {
            int i = cVar.f15135n;
            int i6 = this.f15153b;
            if (i > i6) {
                a();
                return;
            }
            b((this.f15157f + i) - i6);
            int i9 = this.f15156e + 1;
            c[] cVarArr = this.f15154c;
            if (i9 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f15155d = this.f15154c.length - 1;
                this.f15154c = cVarArr2;
            }
            int i10 = this.f15155d;
            this.f15155d = i10 - 1;
            this.f15154c[i10] = cVar;
            this.f15156e++;
            this.f15157f += i;
        }

        private void b() {
            int i = this.f15153b;
            int i6 = this.f15157f;
            if (i < i6) {
                if (i == 0) {
                    a();
                } else {
                    b(i6 - i);
                }
            }
        }

        public final void a(List<c> list) {
            int i;
            int i6;
            if (this.f15160l) {
                int i9 = this.f15159k;
                if (i9 < this.f15153b) {
                    a(i9, 31, 32);
                }
                this.f15160l = false;
                this.f15159k = Integer.MAX_VALUE;
                a(this.f15153b, 31, 32);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = list.get(i10);
                com.anythink.core.common.n.c.f h9 = cVar.f15133l.h();
                com.anythink.core.common.n.c.f fVar = cVar.f15134m;
                Integer num = d.f15137b.get(h9);
                if (num != null) {
                    int intValue = num.intValue();
                    i6 = intValue + 1;
                    if (i6 > 1 && i6 < 8) {
                        c[] cVarArr = d.f15136a;
                        if (Objects.equals(cVarArr[intValue].f15134m, fVar)) {
                            i = i6;
                        } else if (Objects.equals(cVarArr[i6].f15134m, fVar)) {
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
                    int i11 = this.f15155d + 1;
                    int length = this.f15154c.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f15154c[i11].f15133l, h9)) {
                            if (Objects.equals(this.f15154c[i11].f15134m, fVar)) {
                                i6 = (i11 - this.f15155d) + d.f15136a.length;
                                break;
                            } else if (i == -1) {
                                i = (i11 - this.f15155d) + d.f15136a.length;
                            }
                        }
                        i11++;
                    }
                }
                if (i6 != -1) {
                    a(i6, 127, 128);
                } else if (i == -1) {
                    this.i.l(64);
                    a(h9);
                    a(fVar);
                    a(cVar);
                } else if (h9.c(c.f15123a) && !c.f15132k.equals(h9)) {
                    a(i, 15, 0);
                    a(fVar);
                } else {
                    a(i, d.f15140e, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        private void a(int i, int i6, int i9) {
            if (i < i6) {
                this.i.l(i | i9);
                return;
            }
            this.i.l(i9 | i6);
            int i10 = i - i6;
            while (i10 >= 128) {
                this.i.l(128 | (i10 & 127));
                i10 >>>= 7;
            }
            this.i.l(i10);
        }

        private void a(com.anythink.core.common.n.c.f fVar) {
            if (this.f15158j) {
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
            this.f15152a = i;
            int min = Math.min(i, f15151h);
            int i6 = this.f15153b;
            if (i6 == min) {
                return;
            }
            if (min < i6) {
                this.f15159k = Math.min(this.f15159k, min);
            }
            this.f15160l = true;
            this.f15153b = min;
            int i9 = this.f15157f;
            if (min < i9) {
                if (min == 0) {
                    a();
                } else {
                    b(i9 - min);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f15132k, "");
        com.anythink.core.common.n.c.f fVar = c.f15130h;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.anythink.core.common.n.c.f fVar2 = c.i;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.anythink.core.common.n.c.f fVar3 = c.f15131j;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.anythink.core.common.n.c.f fVar4 = c.f15129g;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c(ATCustomRuleKeys.AGE, ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f15136a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int i = 0;
        while (true) {
            c[] cVarArr2 = f15136a;
            if (i >= cVarArr2.length) {
                f15137b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(cVarArr2[i].f15133l)) {
                    linkedHashMap.put(cVarArr2[i].f15133l, Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    private d() {
    }

    private static Map<com.anythink.core.common.n.c.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f15136a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f15136a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f15133l)) {
                linkedHashMap.put(cVarArr[i].f15133l, Integer.valueOf(i));
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
