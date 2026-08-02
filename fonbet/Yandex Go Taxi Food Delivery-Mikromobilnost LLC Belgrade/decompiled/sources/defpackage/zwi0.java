package defpackage;

import flex.engine.a;
import flex.logger.FlexLogLevel;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public final class zwi0 implements dw {
    public final ryl a;

    public zwi0(int i) {
        i3y i3yVar = ryl.c;
        this.a = ck91.b();
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        StackTraceElement stackTraceElement;
        String str;
        ywi0 ywi0Var = (ywi0) krVar;
        u1m u1mVar = ywi0Var.a;
        ryl rylVar = this.a;
        if (u1mVar != null) {
            rylVar.c(u1mVar);
        }
        String str2 = ywi0Var.b;
        if (str2 != null) {
            rylVar.a();
            Iterator it = rylVar.b.entrySet().iterator();
            while (it.hasNext()) {
                uyl uylVar = (uyl) ((Map.Entry) it.next()).getValue();
                boolean l = jl40.l(uylVar.d, str2);
                if (l) {
                    a aVar = uylVar.c;
                    if (!aVar.j0) {
                        aVar.i();
                    }
                }
                if (l) {
                    it.remove();
                }
            }
            zjr zjrVar = rylVar.a;
            i3y b = ryl.b(rylVar, null, str2, 1);
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
            zjrVar.d(FlexLogLevel.DEBUG, "Engines were removed from storage", b, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        }
    }

    public zwi0() {
        this(0);
    }
}
