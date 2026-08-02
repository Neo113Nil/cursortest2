package flex.network.cache.impl;

import com.yandex.div.state.db.StateEntry;
import defpackage.am2;
import defpackage.bvf0;
import defpackage.byg;
import defpackage.cot;
import defpackage.cyg;
import defpackage.d8;
import defpackage.d9i0;
import defpackage.dyg;
import defpackage.evu0;
import defpackage.fe7;
import defpackage.g0c;
import defpackage.i3y;
import defpackage.j73;
import defpackage.j820;
import defpackage.jc7;
import defpackage.jp50;
import defpackage.kc7;
import defpackage.kf5;
import defpackage.kju0;
import defpackage.kq90;
import defpackage.leu;
import defpackage.n7h;
import defpackage.n8j0;
import defpackage.nfh;
import defpackage.ng90;
import defpackage.o430;
import defpackage.oy2;
import defpackage.p7j0;
import defpackage.pwo;
import defpackage.qc20;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.r610;
import defpackage.rjr;
import defpackage.s610;
import defpackage.s7s0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tjr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.uza;
import defpackage.v5e0;
import defpackage.xfz;
import defpackage.yvi0;
import defpackage.zcx;
import defpackage.zjr;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class b implements jp50 {
    public final yvi0 a;
    public final cot b;
    public final d9i0 c;
    public final oy2 d;
    public final nfh e;
    public final o430 f;
    public final sls g;
    public final qc20 h;
    public final zcx i;
    public final zjr j = new zjr(xfz.b(b.class.getSimpleName()));

    public b(yvi0 yvi0Var, cot cotVar, d9i0 d9i0Var, oy2 oy2Var, nfh nfhVar, o430 o430Var, sls slsVar, qc20 qc20Var, zcx zcxVar) {
        this.a = yvi0Var;
        this.b = cotVar;
        this.c = d9i0Var;
        this.d = oy2Var;
        this.e = nfhVar;
        this.f = o430Var;
        this.g = slsVar;
        this.h = qc20Var;
        this.i = zcxVar;
    }

    public final void a(String str) {
        this.c.e(str);
        this.b.k(str, null);
        b(str);
    }

    public final void b(String str) {
        StackTraceElement stackTraceElement;
        String str2;
        qc20 qc20Var = this.h;
        List t = qc20Var.t(str);
        if (t != null) {
            Iterator it = t.iterator();
            while (it.hasNext()) {
                String str3 = ((fe7) it.next()).a;
                String w = qc20.w(str3);
                d9i0 d9i0Var = this.c;
                d9i0Var.e(str3);
                d9i0Var.e(w);
            }
        }
        ((am2) qc20Var.a).n(new fe7(str), null);
        i3y a = xfz.a(new Pair("key", str));
        zjr zjrVar = this.j;
        s7s0 s7s0Var = zjrVar.c.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        tjr tjrVar = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str2 = valueOf.toString()) == null) {
                str2 = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str2);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Successfully deleted parts from cache", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final pwo c(p7j0 p7j0Var, tls tlsVar) {
        tjr tjrVar;
        String str;
        tjr tjrVar2;
        String str2;
        tjr tjrVar3;
        String str3;
        tjr tjrVar4;
        String str4;
        tjr tjrVar5;
        String str5;
        tjr tjrVar6;
        String str6;
        tjr tjrVar7;
        String str7;
        i3y a = xfz.a(new Pair("patchParams", p7j0Var.c));
        s610 s610Var = (s610) ((am2) this.a.a).i(evu0.Q("/", p7j0Var.a));
        if (s610Var == null) {
            zjr zjrVar = this.j;
            EmptyList emptyList = EmptyList.a;
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue()) {
                StackTraceElement stackTraceElement = (StackTraceElement) unr0.j(0);
                if (stackTraceElement != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str7 = valueOf.toString()) == null) {
                        str7 = "No line info";
                    }
                    tjrVar7 = new tjr(fileName, methodName, str7);
                } else {
                    tjrVar7 = tjr.d;
                }
            } else {
                tjrVar7 = tjr.d;
            }
            zjrVar.d(FlexLogLevel.DEBUG, "MatchFields is not found in repository", a, emptyList, tjrVar7.a, tjrVar7.b, tjrVar7.c);
            return null;
        }
        String x = bvf0.x(p7j0Var, s610Var, this.d);
        i3y c = xfz.c(a, xfz.a(new Pair("cacheKey", x)));
        this.f.getClass();
        zjr zjrVar2 = this.j;
        EmptyList<j820> emptyList2 = EmptyList.a;
        s7s0 s7s0Var2 = zjrVar2.c.a;
        if (Boolean.FALSE.booleanValue()) {
            StackTraceElement stackTraceElement2 = (StackTraceElement) unr0.j(0);
            if (stackTraceElement2 != null) {
                String fileName2 = stackTraceElement2.getFileName();
                if (fileName2 == null) {
                    fileName2 = "No file info";
                }
                String methodName2 = stackTraceElement2.getMethodName();
                int lineNumber2 = stackTraceElement2.getLineNumber();
                Integer valueOf2 = Integer.valueOf(lineNumber2);
                if (lineNumber2 <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 == null || (str = valueOf2.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName2, methodName2, str);
            } else {
                tjrVar = tjr.d;
            }
        } else {
            tjrVar = tjr.d;
        }
        zjrVar2.d(FlexLogLevel.DEBUG, "Cache key restored", c, emptyList2, tjrVar.a, tjrVar.b, tjrVar.c);
        j820 g = this.b.g(x);
        if (g == null) {
            g = null;
        } else {
            List t = this.h.t(x);
            if (t != null) {
                am2 am2Var = (am2) this.b.b;
                synchronized (am2Var) {
                    Map p = am2Var.p();
                    if (p != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = t.iterator();
                        while (it.hasNext()) {
                            Object obj = p.get(it.next());
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        }
                        emptyList2 = arrayList;
                    }
                }
                for (j820 j820Var : emptyList2) {
                    g = new j820((Long) kotlin.collections.a.h0(j73.A(new Long[]{g.a, j820Var.a})), (Long) kotlin.collections.a.h0(j73.A(new Long[]{g.b, j820Var.b})), g.c, g.d, g.e, g.f, null);
                }
            }
        }
        if (g == null) {
            this.f.getClass();
            zjr zjrVar3 = this.j;
            EmptyList emptyList3 = EmptyList.a;
            s7s0 s7s0Var3 = zjrVar3.c.a;
            if (Boolean.FALSE.booleanValue()) {
                StackTraceElement stackTraceElement3 = (StackTraceElement) unr0.j(0);
                if (stackTraceElement3 != null) {
                    String fileName3 = stackTraceElement3.getFileName();
                    if (fileName3 == null) {
                        fileName3 = "No file info";
                    }
                    String methodName3 = stackTraceElement3.getMethodName();
                    int lineNumber3 = stackTraceElement3.getLineNumber();
                    Integer valueOf3 = Integer.valueOf(lineNumber3);
                    if (lineNumber3 <= 0) {
                        valueOf3 = null;
                    }
                    if (valueOf3 == null || (str6 = valueOf3.toString()) == null) {
                        str6 = "No line info";
                    }
                    tjrVar6 = new tjr(fileName3, methodName3, str6);
                } else {
                    tjrVar6 = tjr.d;
                }
            } else {
                tjrVar6 = tjr.d;
            }
            zjrVar3.d(FlexLogLevel.DEBUG, "Metadata is not found while cache loading", c, emptyList3, tjrVar6.a, tjrVar6.b, tjrVar6.c);
            a(x);
            return null;
        }
        i3y c2 = xfz.c(c, xfz.a(new Pair(kju0.j, g)));
        Long l = g.b;
        Long l2 = g.a;
        if (l != null && l2 != null) {
            if (l2.longValue() + l.longValue() + g.c <= ((Number) this.g.invoke()).longValue()) {
                o430 o430Var = this.f;
                g.toString();
                o430Var.getClass();
                zjr zjrVar4 = this.j;
                EmptyList emptyList4 = EmptyList.a;
                s7s0 s7s0Var4 = zjrVar4.c.a;
                if (Boolean.FALSE.booleanValue()) {
                    StackTraceElement stackTraceElement4 = (StackTraceElement) unr0.j(0);
                    if (stackTraceElement4 != null) {
                        String fileName4 = stackTraceElement4.getFileName();
                        if (fileName4 == null) {
                            fileName4 = "No file info";
                        }
                        String methodName4 = stackTraceElement4.getMethodName();
                        int lineNumber4 = stackTraceElement4.getLineNumber();
                        Integer valueOf4 = Integer.valueOf(lineNumber4);
                        if (lineNumber4 <= 0) {
                            valueOf4 = null;
                        }
                        if (valueOf4 == null || (str5 = valueOf4.toString()) == null) {
                            str5 = "No line info";
                        }
                        tjrVar5 = new tjr(fileName4, methodName4, str5);
                    } else {
                        tjrVar5 = tjr.d;
                    }
                } else {
                    tjrVar5 = tjr.d;
                }
                zjrVar4.d(FlexLogLevel.DEBUG, "Failed to validate meta data", c2, emptyList4, tjrVar5.a, tjrVar5.b, tjrVar5.c);
                a(x);
                return null;
            }
        }
        Object i = this.c.i(tlsVar, x);
        if (i == null) {
            this.f.getClass();
            zjr zjrVar5 = this.j;
            String type = ErrorTypes.CACHE_DEFAULT_GETTING_FAILED.getType();
            EmptyList emptyList5 = EmptyList.a;
            s7s0 s7s0Var5 = zjrVar5.c.a;
            if (Boolean.FALSE.booleanValue()) {
                StackTraceElement stackTraceElement5 = (StackTraceElement) unr0.j(0);
                if (stackTraceElement5 != null) {
                    String fileName5 = stackTraceElement5.getFileName();
                    if (fileName5 == null) {
                        fileName5 = "No file info";
                    }
                    String methodName5 = stackTraceElement5.getMethodName();
                    int lineNumber5 = stackTraceElement5.getLineNumber();
                    Integer valueOf5 = Integer.valueOf(lineNumber5);
                    if (lineNumber5 <= 0) {
                        valueOf5 = null;
                    }
                    if (valueOf5 == null || (str4 = valueOf5.toString()) == null) {
                        str4 = "No line info";
                    }
                    tjrVar4 = new tjr(fileName5, methodName5, str4);
                } else {
                    tjrVar4 = tjr.d;
                }
            } else {
                tjrVar4 = tjr.d;
            }
            zjrVar5.d(FlexLogLevel.ERROR, "Decoded resource retrieved from cache is null", xfz.c(c2, xfz.a(new Pair("errorType", type))), emptyList5, tjrVar4.a, tjrVar4.b, tjrVar4.c);
            a(x);
            return null;
        }
        if (g.e) {
            zjr zjrVar6 = this.j;
            EmptyList emptyList6 = EmptyList.a;
            s7s0 s7s0Var6 = zjrVar6.c.a;
            if (Boolean.FALSE.booleanValue()) {
                StackTraceElement stackTraceElement6 = (StackTraceElement) unr0.j(0);
                if (stackTraceElement6 != null) {
                    String fileName6 = stackTraceElement6.getFileName();
                    if (fileName6 == null) {
                        fileName6 = "No file info";
                    }
                    String methodName6 = stackTraceElement6.getMethodName();
                    int lineNumber6 = stackTraceElement6.getLineNumber();
                    Integer valueOf6 = Integer.valueOf(lineNumber6);
                    if (lineNumber6 <= 0) {
                        valueOf6 = null;
                    }
                    if (valueOf6 == null || (str3 = valueOf6.toString()) == null) {
                        str3 = "No line info";
                    }
                    tjrVar3 = new tjr(fileName6, methodName6, str3);
                } else {
                    tjrVar3 = tjr.d;
                }
            } else {
                tjrVar3 = tjr.d;
            }
            zjrVar6.d(FlexLogLevel.DEBUG, "Cache is cleared after usage", c2, emptyList6, tjrVar3.a, tjrVar3.b, tjrVar3.c);
            a(x);
        }
        d9i0 d9i0Var = this.c;
        List t2 = this.h.t(x);
        if (t2 == null) {
            t2 = EmptyList.a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = t2.iterator();
        while (it2.hasNext()) {
            String str8 = ((fe7) it2.next()).a;
            String w = qc20.w(str8);
            Object i2 = d9i0Var.i(tlsVar, str8);
            kq90 kq90Var = (kq90) d9i0Var.i(new d8(14, this), w);
            if (i2 != null && kq90Var != null) {
                arrayList2.add(new ng90(i2, kq90Var, str8));
            }
        }
        Long l3 = g.a;
        kc7 kc7Var = new kc7(i, new jc7(l3 != null ? Long.valueOf(l3.longValue() + g.c) : null), g.d, arrayList2);
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ng90) it3.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            String str9 = (String) it4.next();
            j820 g2 = this.b.g(str9);
            if (g2 != null) {
                linkedHashMap.put(str9, g2);
            }
        }
        this.f.getClass();
        i3y c3 = xfz.c(c2, xfz.a(new Pair("freshUntil", kc7Var.b.a), new Pair("partsMetadata", linkedHashMap)));
        zjr zjrVar7 = this.j;
        EmptyList emptyList7 = EmptyList.a;
        s7s0 s7s0Var7 = zjrVar7.c.a;
        if (Boolean.FALSE.booleanValue()) {
            StackTraceElement stackTraceElement7 = (StackTraceElement) unr0.j(0);
            if (stackTraceElement7 != null) {
                String fileName7 = stackTraceElement7.getFileName();
                if (fileName7 == null) {
                    fileName7 = "No file info";
                }
                String methodName7 = stackTraceElement7.getMethodName();
                int lineNumber7 = stackTraceElement7.getLineNumber();
                Integer valueOf7 = lineNumber7 > 0 ? Integer.valueOf(lineNumber7) : null;
                if (valueOf7 == null || (str2 = valueOf7.toString()) == null) {
                    str2 = "No line info";
                }
                tjrVar2 = new tjr(fileName7, methodName7, str2);
            } else {
                tjrVar2 = tjr.d;
            }
        } else {
            tjrVar2 = tjr.d;
        }
        zjrVar7.d(FlexLogLevel.DEBUG, "Successfully extracted cache result", c3, emptyList7, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        return new pwo(kc7Var, g, s610Var, linkedHashMap);
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        s610 s610Var = (s610) ((am2) this.a.a).i(evu0.Q("/", p7j0Var.a));
        if (s610Var == null) {
            return;
        }
        a(bvf0.x(p7j0Var, s610Var, this.d));
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar = tjr.d;
        this.c.clear();
        am2 am2Var = (am2) this.a.a;
        synchronized (am2Var) {
            am2Var.q(null);
        }
        am2 am2Var2 = (am2) this.b.b;
        synchronized (am2Var2) {
            am2Var2.q(null);
        }
        am2 am2Var3 = (am2) this.h.a;
        synchronized (am2Var3) {
            am2Var3.q(null);
        }
        zjr zjrVar = this.j;
        i3y a = kotlin.a.a(n7h.a);
        EmptyList emptyList = EmptyList.a;
        s7s0 s7s0Var = zjrVar.c.a;
        if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Successfully invalidated all cache data", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        StackTraceElement stackTraceElement2;
        String num;
        i3y a = xfz.a(new Pair(StateEntry.COLUMN_PATH, p7j0Var.a), new Pair("patchParams", p7j0Var.c));
        zjr zjrVar = this.j;
        s7s0 s7s0Var = zjrVar.c.a;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = bool.booleanValue();
        String str2 = "No line info";
        tjr tjrVar2 = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        } else {
            tjrVar = tjrVar2;
        }
        FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
        String str3 = tjrVar.a;
        String str4 = tjrVar.c;
        String str5 = tjrVar.b;
        EmptyList emptyList = EmptyList.a;
        zjrVar.d(flexLogLevel, "Loading from cache started", a, emptyList, str3, str5, str4);
        pwo c = c(p7j0Var, tlsVar);
        if (c == null) {
            return null;
        }
        kc7 kc7Var = c.a;
        i3y a2 = xfz.a(new Pair("cacheResult", kc7.class.getSimpleName()), new Pair("freshUntil", kc7Var.b.a));
        s7s0 s7s0Var2 = zjrVar.c.a;
        if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
            String fileName2 = stackTraceElement2.getFileName();
            String str6 = fileName2 != null ? fileName2 : "No file info";
            String methodName2 = stackTraceElement2.getMethodName();
            int lineNumber2 = stackTraceElement2.getLineNumber();
            Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
            if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                str2 = num;
            }
            tjrVar2 = new tjr(str6, methodName2, str2);
        }
        zjrVar.d(flexLogLevel, "Loaded from cache", a2, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
        return kc7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d7  */
    @Override // defpackage.jp50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        StackTraceElement stackTraceElement;
        String str;
        i3y i3yVar;
        String str2;
        String str3;
        tjr tjrVar;
        StackTraceElement stackTraceElement2;
        String num;
        StackTraceElement stackTraceElement3;
        String str4;
        StackTraceElement stackTraceElement4;
        String num2;
        StackTraceElement stackTraceElement5;
        String num3;
        leu leuVar = n8j0Var.c;
        String str5 = n8j0Var.a;
        Pair pair = new Pair("headers", leuVar);
        kq90 kq90Var = n8j0Var.d;
        i3y a = xfz.a(pair, new Pair("patchParams", kq90Var));
        j820 y = this.e.y(n8j0Var, z);
        EmptyList emptyList = EmptyList.a;
        String str6 = "No line info";
        zjr zjrVar = this.j;
        tjr tjrVar2 = tjr.d;
        if (y == null) {
            dyg dygVar = (dyg) tlsVar.invoke(inputStream);
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement5 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement5.getFileName();
                String str7 = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement5.getMethodName();
                int lineNumber = stackTraceElement5.getLineNumber();
                Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf != null && (num3 = valueOf.toString()) != null) {
                    str6 = num3;
                }
                tjrVar2 = new tjr(str7, methodName, str6);
            }
            tjr tjrVar3 = tjrVar2;
            zjrVar.d(FlexLogLevel.DEBUG, "Could not perform save to cache because network metadata is null", a, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
            return dygVar;
        }
        r610 r610Var = s610.Companion;
        leu leuVar2 = n8j0Var.c;
        r610Var.getClass();
        s610 s610Var = new s610(r610.a(leuVar2, "document-cache-query-params-vary"), r610.a(leuVar2, "document-cache-app-state-vary"));
        String x = bvf0.x(new p7j0(str5, n8j0Var.b, kq90Var), s610Var, this.d);
        this.f.getClass();
        i3y c = xfz.c(a, xfz.a(new Pair("cacheKey", x), new Pair(kju0.j, y)));
        rjr rjrVar = zjrVar.c;
        rjr rjrVar2 = zjrVar.c;
        s7s0 s7s0Var2 = rjrVar.a;
        Boolean bool = Boolean.FALSE;
        if (bool.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName2 = stackTraceElement.getFileName();
            str = "No line info";
            String str8 = fileName2 == null ? "No file info" : fileName2;
            i3yVar = c;
            String methodName2 = stackTraceElement.getMethodName();
            int lineNumber2 = stackTraceElement.getLineNumber();
            Integer valueOf2 = Integer.valueOf(lineNumber2);
            if (lineNumber2 <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 == null || (str2 = valueOf2.toString()) == null) {
                str2 = str;
            }
            str3 = "No file info";
            tjrVar = new tjr(str8, methodName2, str2);
        } else {
            str = "No line info";
            i3yVar = c;
            str3 = "No file info";
            tjrVar = tjrVar2;
        }
        FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
        i3y i3yVar2 = i3yVar;
        zjrVar.d(flexLogLevel, "Successfully retrieved cache key while cache extraction", i3yVar2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
        d9i0 d9i0Var = this.c;
        cot cotVar = this.b;
        if (kq90Var != null) {
            if (cotVar.g(x) == null) {
                return (dyg) tlsVar.invoke(inputStream);
            }
            String str9 = y.g;
            qc20 qc20Var = this.h;
            String v = qc20Var.v(x, str9);
            String w = qc20.w(v);
            zcx zcxVar = this.i;
            kf5 kf5Var = zcxVar.b;
            g0c a2 = qoi0.a(kq90.class);
            KSerializer b = kf5Var.b(a2, emptyList);
            if (b == null) {
                b = new v5e0(a2);
            }
            d9i0Var.a(w, new ByteArrayInputStream(zcxVar.c(kq90Var, qke.n(b)).getBytes(uza.a)), new DefaultCachingImpl$savePartRequest$1(this));
            dyg a3 = d9i0Var.a(v, inputStream, tlsVar);
            cotVar.k(v, y);
            qc20Var.E(x, v);
            s7s0 s7s0Var3 = rjrVar2.a;
            if (bool.booleanValue() && (stackTraceElement4 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName3 = stackTraceElement4.getFileName();
                String str10 = fileName3 == null ? str3 : fileName3;
                String methodName3 = stackTraceElement4.getMethodName();
                int lineNumber3 = stackTraceElement4.getLineNumber();
                Integer valueOf3 = lineNumber3 > 0 ? Integer.valueOf(lineNumber3) : null;
                tjrVar2 = new tjr(str10, methodName3, (valueOf3 == null || (num2 = valueOf3.toString()) == null) ? str : num2);
            }
            tjr tjrVar4 = tjrVar2;
            zjrVar.d(flexLogLevel, "Successfully saved parts to cache", i3yVar2, emptyList, tjrVar4.a, tjrVar4.b, tjrVar4.c);
            return a3;
        }
        b(x);
        dyg a4 = d9i0Var.a(x, inputStream, tlsVar);
        if (a4 instanceof cyg) {
            s7s0 s7s0Var4 = rjrVar2.a;
            if (bool.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName4 = stackTraceElement3.getFileName();
                String str11 = fileName4 == null ? str3 : fileName4;
                String methodName4 = stackTraceElement3.getMethodName();
                int lineNumber4 = stackTraceElement3.getLineNumber();
                Integer valueOf4 = Integer.valueOf(lineNumber4);
                if (lineNumber4 <= 0) {
                    valueOf4 = null;
                }
                if (valueOf4 == null || (str4 = valueOf4.toString()) == null) {
                    str4 = str;
                }
                tjrVar2 = new tjr(str11, methodName4, str4);
            }
            tjr tjrVar5 = tjrVar2;
            zjrVar.d(flexLogLevel, "Successfully saved instance to cache", i3yVar2, emptyList, tjrVar5.a, tjrVar5.b, tjrVar5.c);
            ((am2) this.a.a).n(evu0.Q("/", str5), s610Var);
            cotVar.k(x, y);
            return a4;
        }
        if (a4 instanceof byg) {
            byg bygVar = (byg) a4;
            if (bygVar.a() instanceof Throwable) {
                i3y c2 = xfz.c(i3yVar2, xfz.a(new Pair("cause", bygVar.a())));
                i3yVar2 = c2;
                String type = ErrorTypes.CACHE_DISK_SAVE_FAILED.getType();
                s7s0 s7s0Var5 = rjrVar2.a;
                if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName5 = stackTraceElement2.getFileName();
                    String str12 = fileName5 != null ? str3 : fileName5;
                    String methodName5 = stackTraceElement2.getMethodName();
                    int lineNumber5 = stackTraceElement2.getLineNumber();
                    Integer valueOf5 = lineNumber5 <= 0 ? Integer.valueOf(lineNumber5) : null;
                    tjrVar2 = new tjr(str12, methodName5, (valueOf5 != null || (num = valueOf5.toString()) == null) ? str : num);
                }
                tjr tjrVar6 = tjrVar2;
                zjrVar.d(FlexLogLevel.ERROR, "Failed to save cache to disk", xfz.c(i3yVar2, xfz.a(new Pair("errorType", type))), emptyList, tjrVar6.a, tjrVar6.b, tjrVar6.c);
                return a4;
            }
        }
        new Throwable("Failure is not defined");
        String type2 = ErrorTypes.CACHE_DISK_SAVE_FAILED.getType();
        s7s0 s7s0Var52 = rjrVar2.a;
        if (bool.booleanValue()) {
            String fileName52 = stackTraceElement2.getFileName();
            if (fileName52 != null) {
            }
            String methodName52 = stackTraceElement2.getMethodName();
            int lineNumber52 = stackTraceElement2.getLineNumber();
            if (lineNumber52 <= 0) {
            }
            tjrVar2 = new tjr(str12, methodName52, (valueOf5 != null || (num = valueOf5.toString()) == null) ? str : num);
        }
        tjr tjrVar62 = tjrVar2;
        zjrVar.d(FlexLogLevel.ERROR, "Failed to save cache to disk", xfz.c(i3yVar2, xfz.a(new Pair("errorType", type2))), emptyList, tjrVar62.a, tjrVar62.b, tjrVar62.c);
        return a4;
    }
}
