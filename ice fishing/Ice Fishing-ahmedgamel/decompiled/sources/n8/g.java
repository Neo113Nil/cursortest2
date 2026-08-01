package n8;

import Q7.q;
import i8.j;
import i8.l;
import i8.n;
import i8.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import v7.C5135p;
import x.C5176n;

/* loaded from: classes2.dex */
public abstract class g {
    static {
        y8.h hVar = y8.h.f41954w;
        C5176n.b("\"\\");
        C5176n.b("\t ,=");
    }

    public static final boolean a(v vVar) {
        if (kotlin.jvm.internal.h.a((String) vVar.f38252n.f40193v, "HEAD")) {
            return false;
        }
        int i = vVar.f38255w;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || j8.d.f(vVar) != -1) {
            return true;
        }
        String a9 = vVar.f38257y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        return "chunked".equalsIgnoreCase(a9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ff, code lost:
    
        if (r3.f2685n.matcher(r0).matches() == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(i8.b bVar, n url, l headers) {
        List list;
        List list2;
        C5135p c5135p;
        j jVar;
        int i;
        j jVar2;
        boolean z3 = true;
        kotlin.jvm.internal.h.e(bVar, "<this>");
        kotlin.jvm.internal.h.e(url, "url");
        kotlin.jvm.internal.h.e(headers, "headers");
        if (bVar == i8.b.f38077c) {
            return;
        }
        Pattern pattern = j.f38132k;
        int size = headers.size();
        int i6 = 0;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.c(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.e(i9));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.h.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        C5135p c5135p2 = C5135p.f41442n;
        List list3 = list == null ? c5135p2 : list;
        int size2 = list3.size();
        int i10 = 0;
        ArrayList arrayList2 = null;
        while (i10 < size2) {
            String setCookie = (String) list3.get(i10);
            kotlin.jvm.internal.h.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = j8.c.f38482a;
            char c9 = ';';
            int c10 = j8.c.c(setCookie, i6, setCookie.length(), ';');
            char c11 = '=';
            boolean z6 = z3;
            int c12 = j8.c.c(setCookie, i6, c10, '=');
            if (c12 != c10) {
                String m4 = j8.c.m(i6, c12, setCookie);
                if (m4.length() != 0 && j8.c.e(m4) == -1) {
                    String m9 = j8.c.m(c12 + 1, c10, setCookie);
                    if (j8.c.e(m9) == -1) {
                        int i11 = c10 + 1;
                        int length = setCookie.length();
                        long j6 = com.anythink.core.common.n.b.a.c.d.f15050a;
                        boolean z9 = z6;
                        long j9 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z10 = false;
                        long j10 = -1;
                        boolean z11 = false;
                        String str3 = null;
                        boolean z12 = false;
                        while (true) {
                            if (i11 < length) {
                                C5135p c5135p3 = c5135p2;
                                int c13 = j8.c.c(setCookie, i11, length, c9);
                                int c14 = j8.c.c(setCookie, i11, c13, c11);
                                String m10 = j8.c.m(i11, c14, setCookie);
                                String m11 = c14 < c13 ? j8.c.m(c14 + 1, c13, setCookie) : "";
                                if (m10.equalsIgnoreCase("expires")) {
                                    try {
                                        j9 = t8.g.u(m11.length(), m11);
                                        z11 = z6;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i11 = c13 + 1;
                                    c5135p2 = c5135p3;
                                    c9 = ';';
                                    c11 = '=';
                                } else if (m10.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(m11);
                                        j10 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e9) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.h.d(compile, "compile(...)");
                                        if (!compile.matcher(m11).matches()) {
                                            throw e9;
                                        }
                                        j10 = q.R(m11, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z11 = z6;
                                    i11 = c13 + 1;
                                    c5135p2 = c5135p3;
                                    c9 = ';';
                                    c11 = '=';
                                } else {
                                    if (m10.equalsIgnoreCase("domain")) {
                                        if (q.K(m11, com.anythink.core.common.d.j.f12378z)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b9 = j8.b.b(Q7.j.h0(m11, com.anythink.core.common.d.j.f12378z));
                                        if (b9 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str = b9;
                                        z9 = false;
                                    } else if (m10.equalsIgnoreCase(com.anythink.expressad.a.f17603K)) {
                                        str2 = m11;
                                    } else if (m10.equalsIgnoreCase("secure")) {
                                        z12 = z6;
                                    } else if (m10.equalsIgnoreCase("httponly")) {
                                        z10 = z6;
                                    } else if (m10.equalsIgnoreCase("samesite")) {
                                        str3 = m11;
                                    }
                                    i11 = c13 + 1;
                                    c5135p2 = c5135p3;
                                    c9 = ';';
                                    c11 = '=';
                                }
                            } else {
                                c5135p = c5135p2;
                                if (j10 == Long.MIN_VALUE) {
                                    j6 = Long.MIN_VALUE;
                                } else if (j10 != -1) {
                                    long j11 = currentTimeMillis + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                                    if (j11 >= currentTimeMillis && j11 <= com.anythink.core.common.n.b.a.c.d.f15050a) {
                                        j6 = j11;
                                    }
                                } else {
                                    j6 = j9;
                                }
                                String str4 = url.f38162d;
                                if (str == null) {
                                    str = str4;
                                } else if (!kotlin.jvm.internal.h.a(str4, str)) {
                                    if (q.K(str4, str) && str4.charAt((str4.length() - str.length()) - 1) == '.') {
                                        Q7.i iVar = j8.b.f38481a;
                                        Q7.i iVar2 = j8.b.f38481a;
                                        iVar2.getClass();
                                    }
                                    i = 0;
                                    jVar2 = null;
                                    jVar = jVar2;
                                }
                                if (str4.length() == str.length() || v8.a.f41449d.a(str) != null) {
                                    String str5 = "/";
                                    if (str2 == null || !q.R(str2, "/")) {
                                        String b10 = url.b();
                                        i = 0;
                                        int e02 = Q7.j.e0(b10, 0, 6, '/');
                                        if (e02 != 0) {
                                            str5 = b10.substring(0, e02);
                                            kotlin.jvm.internal.h.d(str5, "substring(...)");
                                        }
                                        str2 = str5;
                                    } else {
                                        i = 0;
                                    }
                                    jVar2 = new j(m4, m9, j6, str, str2, z12, z10, z11, z9, str3);
                                    jVar = jVar2;
                                }
                                i = 0;
                                jVar2 = null;
                                jVar = jVar2;
                            }
                        }
                    }
                }
            }
            c5135p = c5135p2;
            jVar = null;
            i = 0;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i10++;
            c5135p2 = c5135p;
            i6 = i;
            z3 = z6;
        }
        C5135p c5135p4 = c5135p2;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.h.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        (list2 == null ? c5135p4 : list2).isEmpty();
    }
}
