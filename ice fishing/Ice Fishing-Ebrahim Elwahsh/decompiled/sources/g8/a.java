package g8;

import I1.b;
import M7.j;
import S0.e;
import S0.f;
import e8.B;
import e8.c;
import e8.m;
import e8.p;
import e8.t;
import e8.v;
import e8.w;
import e8.y;
import i8.q;
import j8.h;
import java.util.ArrayList;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class a implements p {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    @Override // e8.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(h hVar) {
        e eVar;
        e eVar2;
        w wVar;
        int i;
        e eVar3;
        String str;
        int length;
        int i4;
        System.currentTimeMillis();
        C4903n c4903n = hVar.f38598e;
        e eVar4 = new e(12, c4903n, (Object) null);
        c cVar = (c) c4903n.f40106z;
        if (cVar == null) {
            int i9 = c.f37356n;
            m headers = (m) c4903n.f40103w;
            kotlin.jvm.internal.h.e(headers, "headers");
            int size = headers.size();
            String str2 = null;
            int i10 = 0;
            boolean z8 = true;
            boolean z9 = false;
            boolean z10 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i13 = -1;
            int i14 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            while (i10 < size) {
                String c4 = headers.c(i10);
                String e6 = headers.e(i10);
                if (c4.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = e6;
                        i = 0;
                        while (i < e6.length()) {
                            int length2 = e6.length();
                            int i15 = i;
                            while (true) {
                                if (i15 >= length2) {
                                    i15 = e6.length();
                                    break;
                                }
                                if (j.M("=,;", e6.charAt(i15))) {
                                    break;
                                }
                                i15++;
                            }
                            String substring = e6.substring(i, i15);
                            kotlin.jvm.internal.h.d(substring, "substring(...)");
                            String obj = j.h0(substring).toString();
                            if (i15 == e6.length() || e6.charAt(i15) == ',' || e6.charAt(i15) == ';') {
                                eVar3 = eVar4;
                                i = i15 + 1;
                                str = null;
                            } else {
                                int i16 = i15 + 1;
                                byte[] bArr = f8.c.f37814a;
                                int length3 = e6.length();
                                while (true) {
                                    if (i16 >= length3) {
                                        length = e6.length();
                                        break;
                                    }
                                    char charAt = e6.charAt(i16);
                                    int i17 = i16;
                                    if (charAt != ' ' && charAt != '\t') {
                                        length = i17;
                                        break;
                                    }
                                    i16 = i17 + 1;
                                }
                                if (length >= e6.length() || e6.charAt(length) != '\"') {
                                    int length4 = e6.length();
                                    i4 = length;
                                    while (true) {
                                        if (i4 >= length4) {
                                            eVar3 = eVar4;
                                            i4 = e6.length();
                                            break;
                                        }
                                        int i18 = length4;
                                        eVar3 = eVar4;
                                        if (j.M(",;", e6.charAt(i4))) {
                                            break;
                                        }
                                        i4++;
                                        length4 = i18;
                                        eVar4 = eVar3;
                                    }
                                    String substring2 = e6.substring(length, i4);
                                    kotlin.jvm.internal.h.d(substring2, "substring(...)");
                                    str = j.h0(substring2).toString();
                                } else {
                                    int i19 = length + 1;
                                    int Q3 = j.Q(e6, '\"', i19, 4);
                                    str = e6.substring(i19, Q3);
                                    kotlin.jvm.internal.h.d(str, "substring(...)");
                                    i4 = Q3 + 1;
                                    eVar3 = eVar4;
                                }
                                i = i4;
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                z9 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                z10 = true;
                            } else if ("max-age".equalsIgnoreCase(obj)) {
                                i11 = f8.c.l(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i12 = f8.c.l(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                z11 = true;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                z12 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                z13 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i13 = f8.c.l(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i14 = f8.c.l(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                z14 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                z15 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                z16 = true;
                            }
                            eVar4 = eVar3;
                        }
                        i10++;
                        eVar4 = eVar4;
                    }
                } else if (!c4.equalsIgnoreCase("Pragma")) {
                    i10++;
                    eVar4 = eVar4;
                }
                z8 = false;
                i = 0;
                while (i < e6.length()) {
                }
                i10++;
                eVar4 = eVar4;
            }
            eVar = eVar4;
            c cVar2 = new c(z9, z10, i11, i12, z11, z12, z13, i13, i14, z14, z15, z16, !z8 ? null : str2);
            c4903n.f40106z = cVar2;
            cVar = cVar2;
        } else {
            eVar = eVar4;
        }
        if (cVar.f37365j) {
            Object obj2 = null;
            eVar2 = new e(12, obj2, obj2);
        } else {
            eVar2 = eVar;
        }
        q call = hVar.f38594a;
        C4903n c4903n2 = (C4903n) eVar2.f2891u;
        w wVar2 = (w) eVar2.f2892v;
        if (c4903n2 == null && wVar2 == null) {
            w wVar3 = new w(c4903n, t.f37503w, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) new ArrayList(20).toArray(new String[0])), y.f37539n, null, null, null, null, -1L, System.currentTimeMillis(), null, B.f37343a);
            kotlin.jvm.internal.h.e(call, "call");
            return wVar3;
        }
        if (c4903n2 == null) {
            kotlin.jvm.internal.h.b(wVar2);
            v b9 = wVar2.b();
            w k6 = w8.a.k(wVar2);
            v.b("cacheResponse", k6);
            b9.f37516j = k6;
            w a9 = b9.a();
            kotlin.jvm.internal.h.e(call, "call");
            return a9;
        }
        if (wVar2 != null) {
            kotlin.jvm.internal.h.e(call, "call");
        }
        w b10 = hVar.b(c4903n2);
        if (wVar2 == null) {
            wVar = null;
        } else {
            if (b10.f37533w == 304) {
                v b11 = wVar2.b();
                m mVar = b10.f37535y;
                b bVar = new b(4);
                m mVar2 = wVar2.f37535y;
                int size2 = mVar2.size();
                for (int i20 = 0; i20 < size2; i20++) {
                    String c9 = mVar2.c(i20);
                    String e9 = mVar2.e(i20);
                    if ((!"Warning".equalsIgnoreCase(c9) || !M7.q.I(e9, "1")) && ("Content-Length".equalsIgnoreCase(c9) || "Content-Encoding".equalsIgnoreCase(c9) || "Content-Type".equalsIgnoreCase(c9) || !f.n(c9) || mVar.a(c9) == null)) {
                        K3.b.b(bVar, c9, e9);
                    }
                }
                int size3 = mVar.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    String c10 = mVar.c(i21);
                    if (!"Content-Length".equalsIgnoreCase(c10) && !"Content-Encoding".equalsIgnoreCase(c10) && !"Content-Type".equalsIgnoreCase(c10) && f.n(c10)) {
                        K3.b.b(bVar, c10, mVar.e(i21));
                    }
                }
                b11.f37513f = bVar.f().d();
                b11.f37518l = b10.f37526E;
                b11.f37519m = b10.f37527F;
                w k9 = w8.a.k(wVar2);
                v.b("cacheResponse", k9);
                b11.f37516j = k9;
                w k10 = w8.a.k(b10);
                v.b("networkResponse", k10);
                b11.i = k10;
                b11.a();
                b10.f37536z.close();
                kotlin.jvm.internal.h.b(null);
                throw null;
            }
            wVar = null;
            f8.c.a(wVar2.f37536z);
        }
        v b12 = b10.b();
        w k11 = wVar2 != null ? w8.a.k(wVar2) : wVar;
        v.b("cacheResponse", k11);
        b12.f37516j = k11;
        w k12 = w8.a.k(b10);
        v.b("networkResponse", k12);
        b12.i = k12;
        return b12.a();
    }
}
