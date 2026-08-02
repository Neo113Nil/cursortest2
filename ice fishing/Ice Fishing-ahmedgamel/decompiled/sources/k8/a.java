package k8;

import I1.d;
import Q7.j;
import Q7.q;
import S0.f;
import i8.A;
import i8.c;
import i8.l;
import i8.o;
import i8.s;
import i8.u;
import i8.v;
import i8.x;
import java.util.ArrayList;
import m8.p;
import n8.h;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class a implements o {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    @Override // i8.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v a(h hVar) {
        b bVar;
        b bVar2;
        v vVar;
        int i;
        b bVar3;
        l lVar;
        int i4;
        String str;
        int length;
        System.currentTimeMillis();
        C4945n c4945n = hVar.f39688e;
        b bVar4 = new b(c4945n, null);
        c cVar = (c) c4945n.f40496z;
        if (cVar == null) {
            int i6 = c.f38198n;
            l headers = (l) c4945n.f40493w;
            kotlin.jvm.internal.h.e(headers, "headers");
            int size = headers.size();
            String str2 = null;
            int i9 = 0;
            boolean z6 = true;
            boolean z9 = false;
            boolean z10 = false;
            int i10 = -1;
            int i11 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i12 = -1;
            int i13 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (i9 < size) {
                String c9 = headers.c(i9);
                String e9 = headers.e(i9);
                if (c9.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = e9;
                        i = 0;
                        while (i < e9.length()) {
                            int length2 = e9.length();
                            int i14 = i;
                            while (true) {
                                if (i14 >= length2) {
                                    bVar3 = bVar4;
                                    i14 = e9.length();
                                    break;
                                }
                                int i15 = length2;
                                bVar3 = bVar4;
                                if (j.l0("=,;", e9.charAt(i14))) {
                                    break;
                                }
                                i14++;
                                length2 = i15;
                                bVar4 = bVar3;
                            }
                            String substring = e9.substring(i, i14);
                            kotlin.jvm.internal.h.d(substring, "substring(...)");
                            String obj = j.G0(substring).toString();
                            if (i14 != e9.length()) {
                                lVar = headers;
                                if (e9.charAt(i14) != ',' && e9.charAt(i14) != ';') {
                                    int i16 = i14 + 1;
                                    byte[] bArr = j8.c.f38494a;
                                    int length3 = e9.length();
                                    while (true) {
                                        if (i16 >= length3) {
                                            i16 = e9.length();
                                            break;
                                        }
                                        char charAt = e9.charAt(i16);
                                        int i17 = length3;
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i16++;
                                        length3 = i17;
                                    }
                                    if (i16 >= e9.length() || e9.charAt(i16) != '\"') {
                                        int length4 = e9.length();
                                        int i18 = i16;
                                        while (true) {
                                            if (i18 >= length4) {
                                                length = e9.length();
                                                break;
                                            }
                                            int i19 = length4;
                                            int i20 = i18;
                                            if (j.l0(",;", e9.charAt(i18))) {
                                                length = i20;
                                                break;
                                            }
                                            i18 = i20 + 1;
                                            length4 = i19;
                                        }
                                        String substring2 = e9.substring(i16, length);
                                        kotlin.jvm.internal.h.d(substring2, "substring(...)");
                                        str = j.G0(substring2).toString();
                                        i4 = length;
                                    } else {
                                        int i21 = i16 + 1;
                                        int p02 = j.p0(e9, '\"', i21, 4);
                                        String substring3 = e9.substring(i21, p02);
                                        kotlin.jvm.internal.h.d(substring3, "substring(...)");
                                        i4 = p02 + 1;
                                        str = substring3;
                                    }
                                    if (!"no-cache".equalsIgnoreCase(obj)) {
                                        i = i4;
                                        z9 = true;
                                    } else if ("no-store".equalsIgnoreCase(obj)) {
                                        i = i4;
                                        z10 = true;
                                    } else {
                                        if ("max-age".equalsIgnoreCase(obj)) {
                                            i10 = j8.c.l(-1, str);
                                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                            i11 = j8.c.l(-1, str);
                                        } else if ("private".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z11 = true;
                                        } else if ("public".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z12 = true;
                                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z13 = true;
                                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                                            i12 = j8.c.l(Integer.MAX_VALUE, str);
                                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                            i13 = j8.c.l(-1, str);
                                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z14 = true;
                                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z15 = true;
                                        } else if ("immutable".equalsIgnoreCase(obj)) {
                                            i = i4;
                                            z16 = true;
                                        }
                                        i = i4;
                                    }
                                    headers = lVar;
                                    bVar4 = bVar3;
                                }
                            } else {
                                lVar = headers;
                            }
                            i4 = i14 + 1;
                            str = null;
                            if (!"no-cache".equalsIgnoreCase(obj)) {
                            }
                            headers = lVar;
                            bVar4 = bVar3;
                        }
                        i9++;
                        headers = headers;
                        bVar4 = bVar4;
                    }
                } else if (!c9.equalsIgnoreCase("Pragma")) {
                    i9++;
                    headers = headers;
                    bVar4 = bVar4;
                }
                z6 = false;
                i = 0;
                while (i < e9.length()) {
                }
                i9++;
                headers = headers;
                bVar4 = bVar4;
            }
            bVar = bVar4;
            c cVar2 = new c(z9, z10, i10, i11, z11, z12, z13, i12, i13, z14, z15, z16, !z6 ? null : str2);
            c4945n.f40496z = cVar2;
            cVar = cVar2;
        } else {
            bVar = bVar4;
        }
        if (cVar.f38207j) {
            Object obj2 = null;
            bVar2 = new b(obj2, obj2);
        } else {
            bVar2 = bVar;
        }
        p call = hVar.f39684a;
        C4945n c4945n2 = (C4945n) bVar2.f38633n;
        v vVar2 = (v) bVar2.f38634u;
        if (c4945n2 == null && vVar2 == null) {
            v vVar3 = new v(c4945n, s.f38344w, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), x.f38380n, null, null, null, null, -1L, System.currentTimeMillis(), null, A.f38185a);
            kotlin.jvm.internal.h.e(call, "call");
            return vVar3;
        }
        if (c4945n2 == null) {
            kotlin.jvm.internal.h.b(vVar2);
            u b9 = vVar2.b();
            v u6 = f.u(vVar2);
            u.b("cacheResponse", u6);
            b9.f38357j = u6;
            v a9 = b9.a();
            kotlin.jvm.internal.h.e(call, "call");
            return a9;
        }
        if (vVar2 != null) {
            kotlin.jvm.internal.h.e(call, "call");
        }
        v b10 = hVar.b(c4945n2);
        if (vVar2 == null) {
            vVar = null;
        } else {
            if (b10.f38374w == 304) {
                u b11 = vVar2.b();
                l lVar2 = b10.f38376y;
                d dVar = new d(3);
                l lVar3 = vVar2.f38376y;
                int size2 = lVar3.size();
                for (int i22 = 0; i22 < size2; i22++) {
                    String c10 = lVar3.c(i22);
                    String e10 = lVar3.e(i22);
                    if ((!"Warning".equalsIgnoreCase(c10) || !q.h0(e10, "1")) && ("Content-Length".equalsIgnoreCase(c10) || "Content-Encoding".equalsIgnoreCase(c10) || "Content-Type".equalsIgnoreCase(c10) || !Z2.d.m(c10) || lVar2.a(c10) == null)) {
                        X2.a.b(dVar, c10, e10);
                    }
                }
                int size3 = lVar2.size();
                for (int i23 = 0; i23 < size3; i23++) {
                    String c11 = lVar2.c(i23);
                    if (!"Content-Length".equalsIgnoreCase(c11) && !"Content-Encoding".equalsIgnoreCase(c11) && !"Content-Type".equalsIgnoreCase(c11) && Z2.d.m(c11)) {
                        X2.a.b(dVar, c11, lVar2.e(i23));
                    }
                }
                b11.f38354f = dVar.e().d();
                b11.f38359l = b10.f38367E;
                b11.f38360m = b10.f38368F;
                v u9 = f.u(vVar2);
                u.b("cacheResponse", u9);
                b11.f38357j = u9;
                v u10 = f.u(b10);
                u.b("networkResponse", u10);
                b11.i = u10;
                b11.a();
                b10.f38377z.close();
                kotlin.jvm.internal.h.b(null);
                throw null;
            }
            vVar = null;
            j8.c.a(vVar2.f38377z);
        }
        u b12 = b10.b();
        v u11 = vVar2 != null ? f.u(vVar2) : vVar;
        u.b("cacheResponse", u11);
        b12.f38357j = u11;
        v u12 = f.u(b10);
        u.b("networkResponse", u12);
        b12.i = u12;
        return b12.a();
    }
}
