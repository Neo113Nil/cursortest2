package defpackage;

import com.connectsdk.service.NetcastTVService;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class dno extends gzf {
    public final g06 k;

    public dno(dzf dzfVar) {
        super(dzfVar);
        this.k = new g06(fsg.b("SafeEngineLifecycleRegistry"));
    }

    @Override // defpackage.gzf
    public final void g(kyf kyfVar) {
        StackTraceElement stackTraceElement;
        String str;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        lyf lyfVar = this.d;
        lyf lyfVar2 = lyf.b;
        String str2 = "No line info";
        g06 g06Var = this.k;
        vhc vhcVar = vhc.d;
        if (lyfVar == lyfVar2 && kyfVar.compareTo(kyf.ON_STOP) >= 0) {
            jyr a = fsg.a(new Pair("state", this.d), new Pair(NetcastTVService.UDAP_API_EVENT, kyfVar));
            c5b c5bVar = c5b.a;
            htb htbVar = ((thc) g06Var.c).a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) hrg.k(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                str = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement2.getMethodName();
                int lineNumber = stackTraceElement2.getLineNumber();
                valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str2 = num2;
                }
                vhcVar = new vhc(str, methodName, str2);
            }
            g06Var.N(yhc.DEBUG, "Incorrect lifecycle event handled: tried to destroy engine before correct initialization. This may happen when called `detachFromContainer()` right after `attachToContainer()`.", a, c5bVar, vhcVar.a, vhcVar.b, vhcVar.c);
            return;
        }
        lyf lyfVar3 = this.d;
        if (lyfVar3 != lyf.a) {
            super.g(kyfVar);
            return;
        }
        jyr a2 = fsg.a(new Pair("state", lyfVar3), new Pair(NetcastTVService.UDAP_API_EVENT, kyfVar));
        c5b c5bVar2 = c5b.a;
        htb htbVar2 = ((thc) g06Var.c).a;
        if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) hrg.k(0)) != null) {
            String fileName2 = stackTraceElement.getFileName();
            str = fileName2 != null ? fileName2 : "No file info";
            String methodName2 = stackTraceElement.getMethodName();
            int lineNumber2 = stackTraceElement.getLineNumber();
            valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
            if (valueOf != null && (num = valueOf.toString()) != null) {
                str2 = num;
            }
            vhcVar = new vhc(str, methodName2, str2);
        }
        g06Var.N(yhc.DEBUG, "Incorrect lifecycle event handled: tried to modify state after engine destruction. This could happen when engine obtains commands despite its destruction or was not detached from container.", a2, c5bVar2, vhcVar.a, vhcVar.b, vhcVar.c);
    }
}
