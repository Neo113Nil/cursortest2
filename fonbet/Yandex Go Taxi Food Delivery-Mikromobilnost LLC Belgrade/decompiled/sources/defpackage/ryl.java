package defpackage;

import flex.logger.FlexLogLevel;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public final class ryl {
    public static final i3y c = a.a(new acj(22));
    public final zjr a = new zjr(Collections.singletonList(new xjr("DocumentEngineStorage")));
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public static i3y b(ryl rylVar, u1m u1mVar, String str, int i) {
        if ((i & 1) != 0) {
            u1mVar = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return xfz.a(new Pair("query", u1mVar), new Pair("engineStorageSize", Integer.valueOf(rylVar.b.size())), new Pair("tag", str));
    }

    public final void a() {
        StackTraceElement stackTraceElement;
        String str;
        ycc.v(this.b.entrySet(), new hcb(this, System.currentTimeMillis()), true);
        i3y b = b(this, null, null, 3);
        zjr zjrVar = this.a;
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
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        zjrVar.d(FlexLogLevel.DEBUG, "Outdated engines cleaned", b, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
    }

    public final void c(u1m u1mVar) {
        StackTraceElement stackTraceElement;
        String str;
        a();
        uyl uylVar = (uyl) this.b.remove(u1mVar);
        if (uylVar != null) {
            flex.engine.a aVar = uylVar.c;
            if (!aVar.j0) {
                aVar.i();
            }
            i3y b = b(this, u1mVar, null, 2);
            zjr zjrVar = this.a;
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
                if (valueOf == null || (str = valueOf.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Engine removed", b, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        }
    }
}
