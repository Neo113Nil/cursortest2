package defpackage;

import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class tol {
    public final WeakHashMap a = new WeakHashMap();
    public final WeakHashMap b = new WeakHashMap();
    public final WeakHashMap c = new WeakHashMap();
    public final zjr d = new zjr(xfz.b("DivViewBindingControllerImpl"));

    public final void a(bpl bplVar) {
        WeakHashMap weakHashMap = this.c;
        if (((Integer) weakHashMap.getOrDefault(bplVar, 0)).intValue() > 0) {
            weakHashMap.put(bplVar, Integer.valueOf(r0.intValue() - 1));
            return;
        }
        WeakHashMap weakHashMap2 = this.b;
        weakHashMap2.remove(bplVar);
        if (weakHashMap2.isEmpty()) {
            b();
        }
    }

    public final void b() {
        StackTraceElement stackTraceElement;
        String str;
        if (this.b.isEmpty()) {
            WeakHashMap weakHashMap = this.a;
            ArrayList arrayList = new ArrayList(weakHashMap.keySet());
            weakHashMap.clear();
            this.c.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bpl) it.next()).toContentMode();
            }
            return;
        }
        String type = ErrorTypes.DIVKIT_BINDING_COORDINATION_ERROR.getType();
        i3y a = a.a(sol.a);
        zjr zjrVar = this.d;
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
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        }
        i3y a2 = xfz.a(new Pair("errorType", type));
        tjr tjrVar2 = tjrVar;
        zjrVar.d(FlexLogLevel.ERROR, "Unable to release containers while there are pending bindings.", xfz.c(a, a2), EmptyList.a, tjrVar2.a, tjrVar2.b, tjrVar2.c);
    }
}
