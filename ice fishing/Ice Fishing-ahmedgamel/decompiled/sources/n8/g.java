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
import v7.C5125p;
import x.C5175n;

/* loaded from: classes2.dex */
public abstract class g {
    static {
        y8.h hVar = y8.h.f41925w;
        C5175n.d("\"\\");
        C5175n.d("\t ,=");
    }

    public static final boolean a(v vVar) {
        if (kotlin.jvm.internal.h.a((String) vVar.f38371n.f40492v, "HEAD")) {
            return false;
        }
        int i = vVar.f38374w;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || j8.d.f(vVar) != -1) {
            return true;
        }
        String a9 = vVar.f38376y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        return "chunked".equalsIgnoreCase(a9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ff, code lost:
    
        if (r3.f2722n.matcher(r0).matches() == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(i8.b bVar, n url, l headers) {
        List list;
        List list2;
        C5125p c5125p;
        j jVar;
        int i;
        j jVar2;
        boolean z6 = true;
        kotlin.jvm.internal.h.e(bVar, "<this>");
        kotlin.jvm.internal.h.e(url, "url");
        kotlin.jvm.internal.h.e(headers, "headers");
        if (bVar == i8.b.f38196c) {
            return;
        }
        Pattern pattern = j.f38251k;
        int size = headers.size();
        int i4 = 0;
        ArrayList arrayList = null;
        for (int i6 = 0; i6 < size; i6++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.c(i6))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.e(i6));
            }
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.h.d(list, "unmodifiableList(...)");
        } else {
            list = null;
        }
        C5125p c5125p2 = C5125p.f41221n;
        List list3 = list == null ? c5125p2 : list;
        int size2 = list3.size();
        int i9 = 0;
        ArrayList arrayList2 = null;
        while (i9 < size2) {
            String setCookie = (String) list3.get(i9);
            kotlin.jvm.internal.h.e(setCookie, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            byte[] bArr = j8.c.f38494a;
            char c9 = ';';
            int c10 = j8.c.c(setCookie, i4, setCookie.length(), ';');
            char c11 = '=';
            boolean z9 = z6;
            int c12 = j8.c.c(setCookie, i4, c10, '=');
            if (c12 != c10) {
                String m9 = j8.c.m(i4, c12, setCookie);
                if (m9.length() != 0 && j8.c.e(m9) == -1) {
                    String m10 = j8.c.m(c12 + 1, c10, setCookie);
                    if (j8.c.e(m10) == -1) {
                        int i10 = c10 + 1;
                        int length = setCookie.length();
                        long j6 = com.anythink.core.common.n.b.a.c.d.f15837a;
                        boolean z10 = z9;
                        long j9 = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z11 = false;
                        long j10 = -1;
                        boolean z12 = false;
                        String str3 = null;
                        boolean z13 = false;
                        while (true) {
                            if (i10 < length) {
                                C5125p c5125p3 = c5125p2;
                                int c13 = j8.c.c(setCookie, i10, length, c9);
                                int c14 = j8.c.c(setCookie, i10, c13, c11);
                                String m11 = j8.c.m(i10, c14, setCookie);
                                String m12 = c14 < c13 ? j8.c.m(c14 + 1, c13, setCookie) : "";
                                if (m11.equalsIgnoreCase("expires")) {
                                    try {
                                        j9 = t8.g.n(m12.length(), m12);
                                        z12 = z9;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i10 = c13 + 1;
                                    c5125p2 = c5125p3;
                                    c9 = ';';
                                    c11 = '=';
                                } else if (m11.equalsIgnoreCase("max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(m12);
                                        j10 = parseLong <= 0 ? Long.MIN_VALUE : parseLong;
                                    } catch (NumberFormatException e9) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        kotlin.jvm.internal.h.d(compile, "compile(...)");
                                        if (!compile.matcher(m12).matches()) {
                                            throw e9;
                                        }
                                        j10 = q.h0(m12, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z12 = z9;
                                    i10 = c13 + 1;
                                    c5125p2 = c5125p3;
                                    c9 = ';';
                                    c11 = '=';
                                } else {
                                    if (m11.equalsIgnoreCase("domain")) {
                                        if (q.a0(m12, com.anythink.core.common.d.j.f13164z)) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        String b9 = j8.b.b(Q7.j.x0(m12, com.anythink.core.common.d.j.f13164z));
                                        if (b9 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str = b9;
                                        z10 = false;
                                    } else if (m11.equalsIgnoreCase(com.anythink.expressad.a.f18390K)) {
                                        str2 = m12;
                                    } else if (m11.equalsIgnoreCase("secure")) {
                                        z13 = z9;
                                    } else if (m11.equalsIgnoreCase("httponly")) {
                                        z11 = z9;
                                    } else if (m11.equalsIgnoreCase("samesite")) {
                                        str3 = m12;
                                    }
                                    i10 = c13 + 1;
                                    c5125p2 = c5125p3;
                                    c9 = ';';
                                    c11 = '=';
                                }
                            } else {
                                c5125p = c5125p2;
                                if (j10 == Long.MIN_VALUE) {
                                    j6 = Long.MIN_VALUE;
                                } else if (j10 != -1) {
                                    long j11 = currentTimeMillis + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                                    if (j11 >= currentTimeMillis && j11 <= com.anythink.core.common.n.b.a.c.d.f15837a) {
                                        j6 = j11;
                                    }
                                } else {
                                    j6 = j9;
                                }
                                String str4 = url.f38281d;
                                if (str == null) {
                                    str = str4;
                                } else if (!kotlin.jvm.internal.h.a(str4, str)) {
                                    if (q.a0(str4, str) && str4.charAt((str4.length() - str.length()) - 1) == '.') {
                                        Q7.i iVar = j8.b.f38493a;
                                        Q7.i iVar2 = j8.b.f38493a;
                                        iVar2.getClass();
                                    }
                                    i = 0;
                                    jVar2 = null;
                                    jVar = jVar2;
                                }
                                if (str4.length() == str.length() || v8.a.f41228d.a(str) != null) {
                                    String str5 = "/";
                                    if (str2 == null || !q.h0(str2, "/")) {
                                        String b10 = url.b();
                                        i = 0;
                                        int u02 = Q7.j.u0(b10, 0, 6, '/');
                                        if (u02 != 0) {
                                            str5 = b10.substring(0, u02);
                                            kotlin.jvm.internal.h.d(str5, "substring(...)");
                                        }
                                        str2 = str5;
                                    } else {
                                        i = 0;
                                    }
                                    jVar2 = new j(m9, m10, j6, str, str2, z13, z11, z12, z10, str3);
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
            c5125p = c5125p2;
            jVar = null;
            i = 0;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i9++;
            c5125p2 = c5125p;
            i4 = i;
            z6 = z9;
        }
        C5125p c5125p4 = c5125p2;
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            kotlin.jvm.internal.h.d(list2, "unmodifiableList(...)");
        } else {
            list2 = null;
        }
        (list2 == null ? c5125p4 : list2).isEmpty();
    }
}
