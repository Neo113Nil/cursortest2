package defpackage;

import com.yandex.div.state.db.StateEntry;
import flex.logger.FlexLogLevel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class yic implements jp50 {
    public final glv a;
    public final gxj b;

    public yic(glv glvVar, gxj gxjVar) {
        this.a = glvVar;
        this.b = gxjVar;
    }

    @Override // defpackage.jp50
    public final void delete(p7j0 p7j0Var) {
        this.a.delete(p7j0Var);
        this.b.a.delete(p7j0Var);
    }

    @Override // defpackage.jp50
    public final void invalidate() {
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // defpackage.jp50
    public final kc7 load(p7j0 p7j0Var, tls tlsVar) {
        kc7 load = this.a.h.load(p7j0Var, tlsVar);
        if (load != null) {
            return load;
        }
        pwo c = this.b.a.c(p7j0Var, tlsVar);
        if (c == null) {
            return null;
        }
        if (c.b.f) {
            glv glvVar = this.a;
            String x = bvf0.x(p7j0Var, c.c, glvVar.a);
            glvVar.a(x, c.a.a, p7j0Var, c.c, c.b);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ng90 ng90Var : c.a.d) {
                String a = ng90Var.a();
                arrayList.add(new fe7(a));
                glvVar.e.getClass();
                String w = qc20.w(a);
                glvVar.c.b(ng90Var.c(), a);
                glvVar.c.b(ng90Var.b(), w);
                arrayList2.add(new Pair(new fe7(a), c.d.get(ng90Var.a())));
            }
            am2 am2Var = (am2) glvVar.d.b;
            synchronized (am2Var) {
                try {
                    Map p = am2Var.p();
                    if (p == null) {
                        p = new LinkedHashMap();
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        if (pair.f() != null) {
                            p.put(pair.c(), pair.f());
                        } else {
                            p.remove(pair.c());
                        }
                    }
                    am2Var.q(p);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((am2) glvVar.e.a).n(new fe7(x), arrayList);
        }
        return c.a;
    }

    @Override // defpackage.jp50
    public final dyg save(n8j0 n8j0Var, boolean z, InputStream inputStream, tls tlsVar) {
        StackTraceElement stackTraceElement;
        String str;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        dyg save = this.b.a.save(n8j0Var, false, inputStream, tlsVar);
        kq90 kq90Var = n8j0Var.d;
        leu leuVar = n8j0Var.c;
        if (save instanceof cyg) {
            Object obj = ((cyg) save).a;
            glv glvVar = this.a;
            zjr zjrVar = glvVar.g;
            s610.Companion.getClass();
            s610 s610Var = new s610(r610.a(leuVar, "document-cache-query-params-vary"), r610.a(leuVar, "document-cache-app-state-vary"));
            j820 y = glvVar.f.y(n8j0Var, z);
            String str2 = n8j0Var.a;
            String str3 = "No line info";
            EmptyList emptyList = EmptyList.a;
            tjr tjrVar = tjr.d;
            if (y == null) {
                i3y a = xfz.a(new Pair(StateEntry.COLUMN_PATH, str2), new Pair("headers", leuVar), new Pair("patchParams", kq90Var));
                s7s0 s7s0Var = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement2.getFileName();
                    str = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement2.getMethodName();
                    int lineNumber = stackTraceElement2.getLineNumber();
                    Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num2 = valueOf.toString()) != null) {
                        str3 = num2;
                    }
                    tjrVar = new tjr(str, methodName, str3);
                }
                tjr tjrVar2 = tjrVar;
                zjrVar.d(FlexLogLevel.DEBUG, "Could not perform save to in-memory because network metadata is null", a, emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                return save;
            }
            p7j0 p7j0Var = new p7j0(str2, n8j0Var.b, kq90Var);
            String x = bvf0.x(p7j0Var, s610Var, glvVar.a);
            if (kq90Var == null) {
                glvVar.h.b(x);
                glvVar.a(x, obj, p7j0Var, s610Var, y);
                return save;
            }
            hlv hlvVar = glvVar.c;
            qc20 qc20Var = glvVar.e;
            cot cotVar = glvVar.d;
            if (cotVar.g(x) != null) {
                String v = qc20Var.v(x, y.g);
                String w = qc20.w(v);
                hlvVar.b(obj, v);
                hlvVar.b(kq90Var, w);
                cotVar.k(v, y);
                qc20Var.E(x, v);
                i3y a2 = xfz.a(new Pair(StateEntry.COLUMN_PATH, str2), new Pair("patchParams", kq90Var), new Pair(kju0.j, y), new Pair("headKey", x), new Pair("partKey", v), new Pair("partPatchKey", w));
                s7s0 s7s0Var2 = zjrVar.c.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName2 = stackTraceElement.getFileName();
                    str = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement.getMethodName();
                    int lineNumber2 = stackTraceElement.getLineNumber();
                    Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                    if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                        str3 = num;
                    }
                    tjrVar = new tjr(str, methodName2, str3);
                }
                tjr tjrVar3 = tjrVar;
                zjrVar.d(FlexLogLevel.DEBUG, "Successfully saved part-request to in-memory cache", a2, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                return save;
            }
        }
        return save;
    }
}
