package defpackage;

import com.yandex.plus.bdui.o;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class ldi implements tqg {
    public final qq5 a;
    public final o b;
    public final g3a c;
    public final h3a d;
    public final s2 e;
    public final g06 f = new g06(fsg.b(ldi.class.getSimpleName()));

    public ldi(qq5 qq5Var, o oVar, g3a g3aVar, h3a h3aVar, s2 s2Var) {
        this.a = qq5Var;
        this.b = oVar;
        this.c = g3aVar;
        this.d = h3aVar;
        this.e = s2Var;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.f;
    }

    public final void b(md mdVar, z2a z2aVar, Map map) {
        StackTraceElement stackTraceElement;
        String str;
        if (!map.containsKey("dispatchStartTime")) {
            map = uah.i(map, tah.b(new Pair("dispatchStartTime", this.e.invoke())));
        }
        Map map2 = map;
        qq5 qq5Var = this.a;
        g3a g3aVar = this.c;
        df a = qq5Var.a(mdVar, g3aVar);
        o oVar = this.b;
        if (a != null) {
            try {
                q2a q2aVar = (q2a) this.d.invoke();
                df dfVar = (df) ywf.L(this, a);
                dn9 dn9Var = new dn9(q2aVar, z2aVar, this, g3aVar, map2);
                mdVar.getClass();
                dfVar.b(mdVar, dn9Var);
                return;
            } catch (Throwable th) {
                oVar.a(mdVar, th);
                return;
            }
        }
        oVar.a(mdVar, new IllegalArgumentException("Unsupported action"));
        xgb xgbVar = xgb.ACTION_SERVICE_REQUEST_ERROR;
        jyr a2 = fsg.a(new Pair("locator", "ModularActionDispatcher.dispatch"), new Pair("actionType", mdVar.getClass().getSimpleName()));
        c5b c5bVar = c5b.a;
        g06 g06Var = this.f;
        htb htbVar = ((thc) g06Var.c).a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        vhc vhcVar = vhc.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
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
            vhcVar = new vhc(fileName, methodName, str);
        }
        g06Var.N(yhc.ERROR, "Failed to dispatch action: action handler not found", fsg.c(a2, fsg.a(new Pair("errorType", "ActionDispatcher.Action.Execution.Failed"))), c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
    }
}
