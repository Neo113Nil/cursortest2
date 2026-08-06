package O1;

import J1.C0051b;
import J1.m;
import J1.o;
import J1.y;
import R1.l;
import W1.j;
import i1.r;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public abstract class f {
    static {
        j jVar = j.f1876d;
        m0.j.j("\"\\");
        m0.j.j("\t ,=");
    }

    public static final boolean a(y yVar) {
        if (i.a(yVar.f1000a.f978b, "HEAD")) {
            return false;
        }
        int i2 = yVar.f1003d;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && K1.b.k(yVar) == -1 && !"chunked".equalsIgnoreCase(y.a(yVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f1, code lost:
    
        if (r3.f8637a.matcher(r0).matches() == false) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0051b c0051b, o url, m headers) {
        List list;
        int i2;
        J1.j jVar;
        int i3;
        String str;
        int i4 = 1;
        i.e(c0051b, "<this>");
        i.e(url, "url");
        i.e(headers, "headers");
        if (c0051b == C0051b.f824b) {
            return;
        }
        Pattern pattern = J1.j.f876j;
        int size = headers.size();
        int i5 = 0;
        int i6 = 0;
        ArrayList arrayList = null;
        while (i6 < size) {
            int i7 = i6 + 1;
            if ("Set-Cookie".equalsIgnoreCase(headers.b(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.d(i6));
            }
            i6 = i7;
        }
        List list2 = r.f3416a;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            i.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i8 = 0;
        ArrayList arrayList2 = null;
        while (i8 < size2) {
            int i9 = i8 + 1;
            String setCookie = (String) list.get(i8);
            i.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = K1.b.f1051a;
            char c2 = ';';
            int f2 = K1.b.f(setCookie, ';', i5, setCookie.length());
            char c3 = '=';
            int f3 = K1.b.f(setCookie, '=', i5, f2);
            if (f3 == f2) {
                i3 = i5;
                jVar = null;
                i2 = i4;
            } else {
                String y2 = K1.b.y(setCookie, i5, f3);
                if (y2.length() != 0 && K1.b.m(y2) == -1) {
                    String y3 = K1.b.y(setCookie, f3 + i4, f2);
                    if (K1.b.m(y3) == -1) {
                        int i10 = f2 + i4;
                        int length = setCookie.length();
                        long j2 = 253402300799999L;
                        boolean z2 = i4;
                        long j3 = 253402300799999L;
                        String str2 = null;
                        long j4 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = 0;
                        String str3 = null;
                        while (true) {
                            if (i10 < length) {
                                int f4 = K1.b.f(setCookie, c2, i10, length);
                                int f5 = K1.b.f(setCookie, c3, i10, f4);
                                String y4 = K1.b.y(setCookie, i10, f5);
                                String y5 = f5 < f4 ? K1.b.y(setCookie, f5 + i4, f4) : "";
                                if (y4.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = l.t(y5.length(), y5);
                                        z5 = i4;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (y4.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(y5);
                                        j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                    } catch (NumberFormatException e2) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        i.d(compile, "compile(...)");
                                        if (!compile.matcher(y5).matches()) {
                                            throw e2;
                                        }
                                        j4 = z1.o.R(y5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    i4 = 1;
                                    z5 = 1;
                                } else if (!y4.equalsIgnoreCase("domain")) {
                                    if (y4.equalsIgnoreCase("path")) {
                                        str3 = y5;
                                    } else if (y4.equalsIgnoreCase("secure")) {
                                        i4 = 1;
                                        z3 = true;
                                    } else if (y4.equalsIgnoreCase("httponly")) {
                                        i4 = 1;
                                        z4 = true;
                                    }
                                    i4 = 1;
                                } else {
                                    if (z1.o.M(y5, ".")) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String D2 = AbstractC1050a.D(z1.g.d0(y5, "."));
                                    if (D2 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = D2;
                                    i4 = 1;
                                    z2 = 0;
                                }
                                i10 = f4 + 1;
                                c2 = ';';
                                c3 = '=';
                                z5 = z5;
                                z2 = z2;
                            } else {
                                if (j4 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j4 != -1) {
                                    long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : Long.MAX_VALUE);
                                    if (j5 >= currentTimeMillis && j5 <= 253402300799999L) {
                                        j2 = j5;
                                    }
                                } else {
                                    j2 = j3;
                                }
                                String str4 = url.f907d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!i.a(str4, str2)) {
                                    if (z1.o.M(str4, str2)) {
                                        i2 = 1;
                                        if (str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                            z1.f fVar = K1.b.f1055e;
                                            fVar.getClass();
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                    i3 = 0;
                                    jVar = null;
                                }
                                i2 = 1;
                                if (str4.length() == str2.length() || PublicSuffixDatabase.f8326g.a(str2) != null) {
                                    String str5 = "/";
                                    String str6 = str3;
                                    i3 = 0;
                                    if (str6 == null || !z1.o.R(str6, "/", false)) {
                                        String b2 = url.b();
                                        int b02 = z1.g.b0(b2, '/', 0, 6);
                                        if (b02 != 0) {
                                            str5 = b2.substring(0, b02);
                                            i.d(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str = str5;
                                    } else {
                                        str = str6;
                                    }
                                    jVar = new J1.j(y2, y3, j2, str2, str, z3, z4, z5, z2);
                                }
                            }
                        }
                    }
                }
                i2 = i4;
                jVar = null;
                i3 = 0;
            }
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i4 = i2;
            i8 = i9;
            i5 = i3;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            i.d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
