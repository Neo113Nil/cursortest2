package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes5.dex */
public abstract class u6e {
    static {
        pn3 pn3Var = pn3.d;
        ovn.C("\"\\");
        ovn.C("\t ,=");
    }

    public static final boolean a(l3o l3oVar) {
        if (Intrinsics.d(l3oVar.a.b, "HEAD")) {
            return false;
        }
        int i = l3oVar.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || cvt.k(l3oVar) != -1) {
            return true;
        }
        String a = l3oVar.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        return "chunked".equalsIgnoreCase(a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0196, code lost:
    
        if (defpackage.zc4.y(r0, r14) == false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(fk6 fk6Var, u7e u7eVar, zvd zvdVar) {
        List list;
        int i;
        ek6 ek6Var;
        long j;
        ek6 ek6Var2;
        String str;
        fk6Var.getClass();
        u7eVar.getClass();
        zvdVar.getClass();
        if (fk6Var == fk6.a0) {
            return;
        }
        Pattern pattern = ek6.j;
        List r = zvdVar.r("Set-Cookie");
        int size = r.size();
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = null;
        while (i3 < size) {
            String str2 = (String) r.get(i3);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int h = cvt.h(str2, ';', i2, i2, 6);
            char c2 = '=';
            int h2 = cvt.h(str2, '=', i2, h, 2);
            if (h2 != h) {
                int n = cvt.n(i2, h2, str2);
                String substring = str2.substring(n, cvt.o(n, h2, str2));
                if (substring.length() != 0 && cvt.m(substring) == -1) {
                    int n2 = cvt.n(h2 + 1, h, str2);
                    String substring2 = str2.substring(n2, cvt.o(n2, h, str2));
                    if (cvt.m(substring2) == -1) {
                        int i4 = h + 1;
                        int length = str2.length();
                        int i5 = i2;
                        int i6 = i5;
                        int i7 = i6;
                        long j2 = -1;
                        long j3 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        boolean z = true;
                        while (true) {
                            if (i4 < length) {
                                int g = cvt.g(str2, c, i4, length);
                                int g2 = cvt.g(str2, c2, i4, g);
                                int n3 = cvt.n(i4, g2, str2);
                                String substring3 = str2.substring(n3, cvt.o(n3, g2, str2));
                                if (g2 < g) {
                                    int n4 = cvt.n(g2 + 1, g, str2);
                                    str = str2.substring(n4, cvt.o(n4, g, str2));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = zc4.O(str.length(), str);
                                        i6 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i4 = g + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j2 = Long.parseLong(str);
                                        if (j2 <= 0) {
                                            j2 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e) {
                                        if (!new Regex("-?\\d+").e(str)) {
                                            throw e;
                                        }
                                        j2 = c.v(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i6 = 1;
                                    i4 = g + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (c.n(str, ".", false)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String T = xv.T(StringsKt.Y(str, "."));
                                        if (T == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str4 = T;
                                        z = false;
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str3 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        i7 = 1;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        i5 = 1;
                                    }
                                    i4 = g + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = currentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j4 < currentTimeMillis || j4 > 253402300799999L) ? 253402300799999L : j4;
                                } else {
                                    j = j3;
                                }
                                String str5 = u7eVar.d;
                                if (str4 == null) {
                                    str4 = str5;
                                }
                                if (str5.length() == str4.length() || PublicSuffixDatabase.g.a(str4) != null) {
                                    i = 0;
                                    if (str3 == null || !c.v(str3, "/", false)) {
                                        String b = u7eVar.b();
                                        int W = StringsKt.W(b, '/', 0, 6);
                                        str3 = W != 0 ? b.substring(0, W) : "/";
                                    }
                                    ek6Var2 = new ek6(substring, substring2, j, str4, str3, i7, i5, i6, z);
                                    ek6Var = ek6Var2;
                                }
                                i = 0;
                                ek6Var2 = null;
                                ek6Var = ek6Var2;
                            }
                        }
                    }
                }
            }
            i = i2;
            ek6Var = null;
            if (ek6Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ek6Var);
            }
            i3++;
            i2 = i;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        } else {
            list = c5b.a;
        }
        if (list.isEmpty()) {
            return;
        }
        fk6Var.saveFromResponse(u7eVar, list);
    }
}
