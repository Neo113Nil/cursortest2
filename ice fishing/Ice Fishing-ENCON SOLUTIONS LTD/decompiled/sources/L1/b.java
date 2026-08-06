package L1;

import J1.c;
import J1.l;
import J1.m;
import J1.p;
import J1.t;
import J1.v;
import J1.x;
import J1.y;
import J1.z;
import O1.g;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import x0.e;
import z1.o;

/* loaded from: classes.dex */
public final class b implements p {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    @Override // J1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        e eVar;
        e eVar2;
        m mVar;
        int i2;
        int i3;
        e eVar3;
        int i4;
        String str;
        System.currentTimeMillis();
        v request = gVar.f1242e;
        i.e(request, "request");
        e eVar4 = new e(5, request, (Object) null);
        c cVar = request.f982f;
        if (cVar == null) {
            int i5 = c.f826n;
            m mVar2 = request.f979c;
            int size = mVar2.size();
            String str2 = null;
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            int i6 = -1;
            int i7 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i8 = -1;
            int i9 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                int i10 = i2 + 1;
                String b2 = mVar2.b(i2);
                String d2 = mVar2.d(i2);
                if (!o.N(b2, "Cache-Control")) {
                    i2 = o.N(b2, "Pragma") ? 0 : i10;
                } else if (str2 == null) {
                    str2 = d2;
                    i3 = 0;
                    while (i3 < d2.length()) {
                        int length = d2.length();
                        int i11 = i3;
                        while (true) {
                            if (i11 >= length) {
                                i11 = d2.length();
                                break;
                            }
                            int i12 = i11 + 1;
                            if (z1.g.S("=,;", d2.charAt(i11))) {
                                break;
                            }
                            i11 = i12;
                        }
                        String substring = d2.substring(i3, i11);
                        i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String obj = z1.g.k0(substring).toString();
                        if (i11 == d2.length() || d2.charAt(i11) == ',' || d2.charAt(i11) == ';') {
                            eVar3 = eVar4;
                            i4 = i11 + 1;
                            str = null;
                        } else {
                            int i13 = i11 + 1;
                            byte[] bArr = K1.b.f1051a;
                            int length2 = d2.length();
                            while (true) {
                                if (i13 >= length2) {
                                    i13 = d2.length();
                                    break;
                                }
                                int i14 = i13 + 1;
                                char charAt = d2.charAt(i13);
                                int i15 = length2;
                                if (charAt != ' ' && charAt != '\t') {
                                    break;
                                }
                                i13 = i14;
                                length2 = i15;
                            }
                            if (i13 >= d2.length() || d2.charAt(i13) != '\"') {
                                eVar3 = eVar4;
                                int length3 = d2.length();
                                int i16 = i13;
                                while (true) {
                                    if (i16 >= length3) {
                                        i16 = d2.length();
                                        break;
                                    }
                                    int i17 = i16 + 1;
                                    int i18 = length3;
                                    if (z1.g.S(",;", d2.charAt(i16))) {
                                        break;
                                    }
                                    i16 = i17;
                                    length3 = i18;
                                }
                                String substring2 = d2.substring(i13, i16);
                                i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str = z1.g.k0(substring2).toString();
                                i4 = i16;
                            } else {
                                int i19 = i13 + 1;
                                eVar3 = eVar4;
                                int X2 = z1.g.X(d2, '\"', i19, false, 4);
                                String substring3 = d2.substring(i19, X2);
                                i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                i4 = X2 + 1;
                                str = substring3;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i3 = i4;
                            eVar4 = eVar3;
                            z3 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i3 = i4;
                            eVar4 = eVar3;
                            z4 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = K1.b.x(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = K1.b.x(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z5 = true;
                            } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z6 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z7 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = K1.b.x(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = K1.b.x(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z8 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z9 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z10 = true;
                            }
                            i3 = i4;
                            eVar4 = eVar3;
                        }
                    }
                }
                z2 = false;
                i3 = 0;
                while (i3 < d2.length()) {
                }
            }
            eVar = eVar4;
            cVar = new c(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str2);
            request.f982f = cVar;
        } else {
            eVar = eVar4;
        }
        if (cVar.f836j) {
            Object obj2 = null;
            eVar2 = new e(5, obj2, obj2);
        } else {
            eVar2 = eVar;
        }
        N1.i call = gVar.f1238a;
        v vVar = (v) eVar2.f8530b;
        y yVar = (y) eVar2.f8531c;
        if (vVar == null && yVar == null) {
            ArrayList arrayList = new ArrayList(20);
            t tVar = t.HTTP_1_1;
            z zVar = K1.b.f1053c;
            long currentTimeMillis = System.currentTimeMillis();
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            y yVar2 = new y(request, tVar, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) array), zVar, null, null, null, -1L, currentTimeMillis, null);
            i.e(call, "call");
            return yVar2;
        }
        if (vVar == null) {
            i.b(yVar);
            x b3 = yVar.b();
            y a2 = a.a(yVar);
            x.b(a2, "cacheResponse");
            b3.f995i = a2;
            y a3 = b3.a();
            i.e(call, "call");
            return a3;
        }
        if (yVar != null) {
            i.e(call, "call");
        }
        y b4 = gVar.b(vVar);
        if (yVar != null) {
            if (b4.f1003d == 304) {
                x b5 = yVar.b();
                m mVar3 = b4.f1005f;
                l lVar = new l(0);
                m mVar4 = yVar.f1005f;
                int size2 = mVar4.size();
                int i20 = 0;
                while (i20 < size2) {
                    int i21 = i20 + 1;
                    String b6 = mVar4.b(i20);
                    String d3 = mVar4.d(i20);
                    if ("Warning".equalsIgnoreCase(b6)) {
                        mVar = mVar4;
                        if (o.R(d3, "1", false)) {
                            i20 = i21;
                            mVar4 = mVar;
                        }
                    } else {
                        mVar = mVar4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b6) || "Content-Encoding".equalsIgnoreCase(b6) || "Content-Type".equalsIgnoreCase(b6) || !a.b(b6) || mVar3.a(b6) == null) {
                        lVar.a(b6, d3);
                    }
                    i20 = i21;
                    mVar4 = mVar;
                }
                int i22 = 0;
                int size3 = mVar3.size();
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    String b7 = mVar3.b(i22);
                    if (!"Content-Length".equalsIgnoreCase(b7) && !"Content-Encoding".equalsIgnoreCase(b7) && !"Content-Type".equalsIgnoreCase(b7) && a.b(b7)) {
                        lVar.a(b7, mVar3.d(i22));
                    }
                    i22 = i23;
                }
                b5.f992f = lVar.b().c();
                b5.f997k = b4.f1010k;
                b5.f998l = b4.f1011l;
                y a4 = a.a(yVar);
                x.b(a4, "cacheResponse");
                b5.f995i = a4;
                y a5 = a.a(b4);
                x.b(a5, "networkResponse");
                b5.f994h = a5;
                b5.a();
                z zVar2 = b4.f1006g;
                i.b(zVar2);
                zVar2.close();
                i.b(null);
                throw null;
            }
            z zVar3 = yVar.f1006g;
            if (zVar3 != null) {
                K1.b.d(zVar3);
            }
        }
        x b8 = b4.b();
        y a6 = a.a(yVar);
        x.b(a6, "cacheResponse");
        b8.f995i = a6;
        y a7 = a.a(b4);
        x.b(a7, "networkResponse");
        b8.f994h = a7;
        return b8.a();
    }
}
