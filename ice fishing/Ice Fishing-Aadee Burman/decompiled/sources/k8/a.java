package k8;

import Q7.j;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import com.bumptech.glide.g;
import i8.A;
import i8.c;
import i8.l;
import i8.o;
import i8.s;
import i8.u;
import i8.v;
import i8.x;
import java.util.ArrayList;
import m8.q;
import n8.h;
import q2.C4896n;

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
        int i6;
        String str;
        int length;
        System.currentTimeMillis();
        C4896n c4896n = hVar.f39521e;
        b bVar4 = new b(c4896n, null);
        c cVar = (c) c4896n.f40194z;
        if (cVar == null) {
            int i9 = c.f38079n;
            l headers = (l) c4896n.f40191w;
            kotlin.jvm.internal.h.e(headers, "headers");
            int size = headers.size();
            String str2 = null;
            int i10 = 0;
            boolean z3 = true;
            boolean z6 = false;
            boolean z9 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int i13 = -1;
            int i14 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (i10 < size) {
                String c9 = headers.c(i10);
                String e9 = headers.e(i10);
                if (c9.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = e9;
                        i = 0;
                        while (i < e9.length()) {
                            int length2 = e9.length();
                            int i15 = i;
                            while (true) {
                                if (i15 >= length2) {
                                    bVar3 = bVar4;
                                    i15 = e9.length();
                                    break;
                                }
                                int i16 = length2;
                                bVar3 = bVar4;
                                if (j.V("=,;", e9.charAt(i15))) {
                                    break;
                                }
                                i15++;
                                length2 = i16;
                                bVar4 = bVar3;
                            }
                            String substring = e9.substring(i, i15);
                            kotlin.jvm.internal.h.d(substring, "substring(...)");
                            String obj = j.q0(substring).toString();
                            if (i15 != e9.length()) {
                                lVar = headers;
                                if (e9.charAt(i15) != ',' && e9.charAt(i15) != ';') {
                                    int i17 = i15 + 1;
                                    byte[] bArr = j8.c.f38482a;
                                    int length3 = e9.length();
                                    while (true) {
                                        if (i17 >= length3) {
                                            i17 = e9.length();
                                            break;
                                        }
                                        char charAt = e9.charAt(i17);
                                        int i18 = length3;
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i17++;
                                        length3 = i18;
                                    }
                                    if (i17 >= e9.length() || e9.charAt(i17) != '\"') {
                                        int length4 = e9.length();
                                        int i19 = i17;
                                        while (true) {
                                            if (i19 >= length4) {
                                                length = e9.length();
                                                break;
                                            }
                                            int i20 = length4;
                                            int i21 = i19;
                                            if (j.V(",;", e9.charAt(i19))) {
                                                length = i21;
                                                break;
                                            }
                                            i19 = i21 + 1;
                                            length4 = i20;
                                        }
                                        String substring2 = e9.substring(i17, length);
                                        kotlin.jvm.internal.h.d(substring2, "substring(...)");
                                        str = j.q0(substring2).toString();
                                        i6 = length;
                                    } else {
                                        int i22 = i17 + 1;
                                        int Z8 = j.Z(e9, '\"', i22, 4);
                                        String substring3 = e9.substring(i22, Z8);
                                        kotlin.jvm.internal.h.d(substring3, "substring(...)");
                                        i6 = Z8 + 1;
                                        str = substring3;
                                    }
                                    if (!"no-cache".equalsIgnoreCase(obj)) {
                                        i = i6;
                                        z6 = true;
                                    } else if ("no-store".equalsIgnoreCase(obj)) {
                                        i = i6;
                                        z9 = true;
                                    } else {
                                        if ("max-age".equalsIgnoreCase(obj)) {
                                            i11 = j8.c.l(-1, str);
                                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                            i12 = j8.c.l(-1, str);
                                        } else if ("private".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z10 = true;
                                        } else if ("public".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z11 = true;
                                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z12 = true;
                                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                                            i13 = j8.c.l(Integer.MAX_VALUE, str);
                                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                            i14 = j8.c.l(-1, str);
                                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z13 = true;
                                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z14 = true;
                                        } else if ("immutable".equalsIgnoreCase(obj)) {
                                            i = i6;
                                            z15 = true;
                                        }
                                        i = i6;
                                    }
                                    headers = lVar;
                                    bVar4 = bVar3;
                                }
                            } else {
                                lVar = headers;
                            }
                            i6 = i15 + 1;
                            str = null;
                            if (!"no-cache".equalsIgnoreCase(obj)) {
                            }
                            headers = lVar;
                            bVar4 = bVar3;
                        }
                        i10++;
                        headers = headers;
                        bVar4 = bVar4;
                    }
                } else if (!c9.equalsIgnoreCase("Pragma")) {
                    i10++;
                    headers = headers;
                    bVar4 = bVar4;
                }
                z3 = false;
                i = 0;
                while (i < e9.length()) {
                }
                i10++;
                headers = headers;
                bVar4 = bVar4;
            }
            bVar = bVar4;
            c cVar2 = new c(z6, z9, i11, i12, z10, z11, z12, i13, i14, z13, z14, z15, !z3 ? null : str2);
            c4896n.f40194z = cVar2;
            cVar = cVar2;
        } else {
            bVar = bVar4;
        }
        if (cVar.f38088j) {
            Object obj2 = null;
            bVar2 = new b(obj2, obj2);
        } else {
            bVar2 = bVar;
        }
        q call = hVar.f39517a;
        C4896n c4896n2 = (C4896n) bVar2.f38706n;
        v vVar2 = (v) bVar2.f38707u;
        if (c4896n2 == null && vVar2 == null) {
            v vVar3 = new v(c4896n, s.f38225w, "Unsatisfiable Request (only-if-cached)", 504, null, new l((String[]) new ArrayList(20).toArray(new String[0])), x.f38261n, null, null, null, null, -1L, System.currentTimeMillis(), null, A.f38066a);
            kotlin.jvm.internal.h.e(call, "call");
            return vVar3;
        }
        if (c4896n2 == null) {
            kotlin.jvm.internal.h.b(vVar2);
            u b9 = vVar2.b();
            v i23 = e.i(vVar2);
            u.b("cacheResponse", i23);
            b9.f38238j = i23;
            v a9 = b9.a();
            kotlin.jvm.internal.h.e(call, "call");
            return a9;
        }
        if (vVar2 != null) {
            kotlin.jvm.internal.h.e(call, "call");
        }
        v b10 = hVar.b(c4896n2);
        if (vVar2 == null) {
            vVar = null;
        } else {
            if (b10.f38255w == 304) {
                u b11 = vVar2.b();
                l lVar2 = b10.f38257y;
                G1.e eVar = new G1.e(3);
                l lVar3 = vVar2.f38257y;
                int size2 = lVar3.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    String c10 = lVar3.c(i24);
                    String e10 = lVar3.e(i24);
                    if ((!"Warning".equalsIgnoreCase(c10) || !Q7.q.R(e10, "1")) && ("Content-Length".equalsIgnoreCase(c10) || "Content-Encoding".equalsIgnoreCase(c10) || "Content-Type".equalsIgnoreCase(c10) || !g.g(c10) || lVar2.a(c10) == null)) {
                        f.f(eVar, c10, e10);
                    }
                }
                int size3 = lVar2.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    String c11 = lVar2.c(i25);
                    if (!"Content-Length".equalsIgnoreCase(c11) && !"Content-Encoding".equalsIgnoreCase(c11) && !"Content-Type".equalsIgnoreCase(c11) && g.g(c11)) {
                        f.f(eVar, c11, lVar2.e(i25));
                    }
                }
                b11.f38235f = eVar.b().d();
                b11.f38240l = b10.f38248E;
                b11.f38241m = b10.f38249F;
                v i26 = e.i(vVar2);
                u.b("cacheResponse", i26);
                b11.f38238j = i26;
                v i27 = e.i(b10);
                u.b("networkResponse", i27);
                b11.i = i27;
                b11.a();
                b10.f38258z.close();
                kotlin.jvm.internal.h.b(null);
                throw null;
            }
            vVar = null;
            j8.c.a(vVar2.f38258z);
        }
        u b12 = b10.b();
        v i28 = vVar2 != null ? e.i(vVar2) : vVar;
        u.b("cacheResponse", i28);
        b12.f38238j = i28;
        v i29 = e.i(b10);
        u.b("networkResponse", i29);
        b12.i = i29;
        return b12.a();
    }
}
