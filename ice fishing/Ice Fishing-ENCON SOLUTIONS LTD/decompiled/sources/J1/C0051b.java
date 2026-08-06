package J1;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: J1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0051b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051b f823a = new C0051b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0051b f824b = new C0051b();

    /* renamed from: c, reason: collision with root package name */
    public static final C0051b f825c = new C0051b();

    public static final g a(C0051b c0051b, String str) {
        g gVar = new g(str);
        g.f849d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z6 = (i4 & 8) != 0 ? false : z2;
        boolean z7 = (i4 & 16) != 0 ? false : z3;
        boolean z8 = (i4 & 32) != 0 ? false : z4;
        boolean z9 = (i4 & 64) == 0 ? z5 : false;
        kotlin.jvm.internal.i.e(str, "<this>");
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 32;
            int i8 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z9) || z1.g.S(str2, (char) codePointAt) || ((codePointAt == 37 && (!z6 || (z7 && !d(str, i6, length)))) || (codePointAt == 43 && z8)))) {
                W1.g gVar = new W1.g();
                gVar.y(str, i5, i6);
                W1.g gVar2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z8) {
                            gVar.x(z6 ? "+" : "%2B");
                        } else if (codePointAt2 < i7 || codePointAt2 == 127 || ((codePointAt2 >= i8 && !z9) || z1.g.S(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z6 || (z7 && !d(str, i6, length)))))) {
                            if (gVar2 == null) {
                                gVar2 = new W1.g();
                            }
                            gVar2.z(codePointAt2);
                            while (!gVar2.a()) {
                                byte c2 = gVar2.c();
                                gVar.u(37);
                                char[] cArr = o.f903j;
                                gVar.u(cArr[((c2 & 255) >> 4) & 15]);
                                gVar.u(cArr[c2 & 15]);
                            }
                        } else {
                            gVar.z(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 32;
                    i8 = 128;
                }
                return gVar.n(gVar.f1875b, z1.a.f8620a);
            }
            i6 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i5, length);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && K1.b.r(str.charAt(i2 + 1)) != -1 && K1.b.r(str.charAt(i4)) != -1;
    }

    public static String e(String str, int i2, int i3, boolean z2, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.i.e(str, "<this>");
        int i6 = i2;
        while (i6 < i3) {
            int i7 = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z2)) {
                W1.g gVar = new W1.g();
                gVar.y(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z2) {
                            gVar.u(32);
                            i6++;
                        }
                        gVar.z(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int r2 = K1.b.r(str.charAt(i6 + 1));
                        int r3 = K1.b.r(str.charAt(i5));
                        if (r2 != -1 && r3 != -1) {
                            gVar.u((r2 << 4) + r3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        gVar.z(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return gVar.n(gVar.f1875b, z1.a.f8620a);
            }
            i6 = i7;
        }
        String substring = str.substring(i2, i3);
        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int X2 = z1.g.X(str, '&', i2, false, 4);
            if (X2 == -1) {
                X2 = str.length();
            }
            int X3 = z1.g.X(str, '=', i2, false, 4);
            if (X3 == -1 || X3 > X2) {
                String substring = str.substring(i2, X2);
                kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i2, X3);
                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(X3 + 1, X2);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i2 = X2 + 1;
        }
        return arrayList;
    }

    public synchronized g c(String javaName) {
        g gVar;
        String str;
        try {
            kotlin.jvm.internal.i.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = g.f849d;
            gVar = (g) linkedHashMap.get(javaName);
            if (gVar == null) {
                if (z1.o.R(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring, "SSL_");
                } else if (z1.o.R(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.i.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str = kotlin.jvm.internal.i.h(substring2, "TLS_");
                } else {
                    str = javaName;
                }
                gVar = (g) linkedHashMap.get(str);
                if (gVar == null) {
                    gVar = new g(javaName);
                }
                linkedHashMap.put(javaName, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
