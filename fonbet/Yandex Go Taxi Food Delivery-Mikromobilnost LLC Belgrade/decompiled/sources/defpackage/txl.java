package defpackage;

import android.os.Bundle;
import flex.engine.a;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final /* synthetic */ class txl implements klc {
    public final /* synthetic */ a a;

    public /* synthetic */ txl(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(elc elcVar) {
        boolean z;
        xzl xzlVar;
        ywl ywlVar;
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        StackTraceElement stackTraceElement2;
        String str2;
        tjr tjrVar2;
        gfe gfeVar;
        StackTraceElement stackTraceElement3;
        Integer valueOf;
        String num;
        a aVar = this.a;
        zjr zjrVar = aVar.N;
        oju0 oju0Var = aVar.Z;
        boolean z2 = elcVar instanceof nxl;
        String str3 = "No line info";
        EmptyList emptyList = EmptyList.a;
        tjr tjrVar3 = tjr.d;
        if (z2 || (elcVar instanceof k1o)) {
            if (elcVar instanceof h1o) {
                xxl xxlVar = a.s0;
                elf0 a = ((h1o) elcVar).a();
                a aVar2 = (a) xxlVar.c.remove(a);
                if (aVar2 != null) {
                    xxlVar.a.put(new a2o(aVar2), new a2o(aVar));
                } else {
                    xxlVar.b.put(a, aVar);
                }
            } else if (elcVar instanceof i1o) {
                wyl wylVar = aVar.E;
                if (wylVar == null) {
                    String type = ErrorTypes.DOCUMENT_ENGINE_RESTORE_STATE_FAILED.getType();
                    i3y a2 = kotlin.a.a(gyl.a);
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement2.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement2.getMethodName();
                        int lineNumber = stackTraceElement2.getLineNumber();
                        Integer valueOf2 = Integer.valueOf(lineNumber);
                        if (lineNumber <= 0) {
                            valueOf2 = null;
                        }
                        if (valueOf2 == null || (str2 = valueOf2.toString()) == null) {
                            str2 = "No line info";
                        }
                        tjrVar2 = new tjr(fileName, methodName, str2);
                    } else {
                        tjrVar2 = tjrVar3;
                    }
                    zjrVar.d(FlexLogLevel.WARNING, "ViewModel is missing while restoring state of DocumentEngine!", xfz.c(a2, xfz.a(new Pair("errorType", type))), emptyList, tjrVar2.a, tjrVar2.b, tjrVar2.c);
                } else {
                    e3m d = ik91.d(wylVar);
                    if (d != null) {
                        oju0Var.b(new g3m(d));
                    }
                }
            } else if (elcVar instanceof j1o) {
                wyl wylVar2 = aVar.E;
                if (wylVar2 == null) {
                    i3y a3 = kotlin.a.a(hyl.a);
                    s7s0 s7s0Var2 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName2 = stackTraceElement.getFileName();
                        if (fileName2 == null) {
                            fileName2 = "No file info";
                        }
                        String methodName2 = stackTraceElement.getMethodName();
                        int lineNumber2 = stackTraceElement.getLineNumber();
                        Integer valueOf3 = Integer.valueOf(lineNumber2);
                        if (lineNumber2 <= 0) {
                            valueOf3 = null;
                        }
                        if (valueOf3 == null || (str = valueOf3.toString()) == null) {
                            str = "No line info";
                        }
                        tjrVar = new tjr(fileName2, methodName2, str);
                    } else {
                        tjrVar = tjrVar3;
                    }
                    zjrVar.d(FlexLogLevel.INFO, "ViewModel is missing while saving state of DocumentEngine!", a3, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                } else {
                    ik91.f((e3m) oju0Var.a, wylVar2);
                    gfe gfeVar2 = aVar.f0;
                    if (gfeVar2 != null) {
                        Bundle bundle = new Bundle();
                        gfeVar2.onSaveState(bundle);
                        if (!bundle.isEmpty()) {
                            wylVar2.m(bundle, "content_controller_state");
                        }
                    }
                    pjm0 pjm0Var = aVar.e0;
                    if (pjm0Var != null) {
                        Bundle bundle2 = new Bundle();
                        pjm0Var.onSaveState(bundle2);
                        if (!bundle2.isEmpty()) {
                            wylVar2.m(bundle2, "scaffold_controller_state");
                        }
                    }
                }
            } else if (elcVar instanceof hxl) {
                hxl hxlVar = (hxl) elcVar;
                a.q(aVar, hxlVar.b(), hxlVar.a(), false, 4);
            } else if (elcVar instanceof ixl) {
                d3m d3mVar = aVar.m0;
                q370 q370Var = (d3mVar == null || (xzlVar = d3mVar.b) == null || (ywlVar = xzlVar.a) == null) ? null : ywlVar.e;
                u1m u1mVar = d3mVar != null ? d3mVar.c : null;
                if (u1mVar != null) {
                    ixl ixlVar = (ixl) elcVar;
                    d3q0 d3q0Var = ixlVar.a;
                    wbe0 wbe0Var = ixlVar.b;
                    s8o.S(aVar, oju0Var);
                    oju0Var.b(new i0m(d3q0Var, u1mVar, wbe0Var, q370Var));
                }
            } else if (elcVar instanceof mxl) {
                mxl mxlVar = (mxl) elcVar;
                aVar.D(mxlVar.a(), mxlVar.b());
            } else if (elcVar instanceof lxl) {
                see a4 = ((lxl) elcVar).a();
                s8o.S(aVar, oju0Var);
                oju0Var.b(new oxl(a4));
            } else if (elcVar instanceof jxl) {
                aVar.w(((jxl) elcVar).a());
            } else if (elcVar instanceof kxl) {
                aVar.B(((kxl) elcVar).a(), null);
            } else {
                if (!(elcVar instanceof gxl)) {
                    z = false;
                    gfeVar = aVar.f0;
                    if ((gfeVar == null && gfeVar.b(elcVar)) || z) {
                        return;
                    }
                    String type2 = ErrorTypes.COMMAND_NOT_HANDLED.getType();
                    i3y a5 = xfz.a(new Pair("commandType", elcVar.getClass().getSimpleName()));
                    s7s0 s7s0Var3 = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName3 = stackTraceElement3.getFileName();
                        String str4 = fileName3 != null ? fileName3 : "No file info";
                        String methodName3 = stackTraceElement3.getMethodName();
                        int lineNumber3 = stackTraceElement3.getLineNumber();
                        valueOf = lineNumber3 > 0 ? Integer.valueOf(lineNumber3) : null;
                        if (valueOf != null && (num = valueOf.toString()) != null) {
                            str3 = num;
                        }
                        tjrVar3 = new tjr(str4, methodName3, str3);
                    }
                    zjrVar.d(FlexLogLevel.ERROR, "Failed to publish command: command not handled", xfz.c(a5, xfz.a(new Pair("errorType", type2))), emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                }
                aVar.k(((gxl) elcVar).a);
            }
        }
        z = true;
        gfeVar = aVar.f0;
        if (gfeVar == null) {
        }
        String type22 = ErrorTypes.COMMAND_NOT_HANDLED.getType();
        i3y a52 = xfz.a(new Pair("commandType", elcVar.getClass().getSimpleName()));
        s7s0 s7s0Var32 = zjrVar.c.a;
        if (Boolean.FALSE.booleanValue()) {
            String fileName32 = stackTraceElement3.getFileName();
            if (fileName32 != null) {
            }
            String methodName32 = stackTraceElement3.getMethodName();
            int lineNumber32 = stackTraceElement3.getLineNumber();
            if (lineNumber32 > 0) {
            }
            if (valueOf != null) {
                str3 = num;
            }
            tjrVar3 = new tjr(str4, methodName32, str3);
        }
        zjrVar.d(FlexLogLevel.ERROR, "Failed to publish command: command not handled", xfz.c(a52, xfz.a(new Pair("errorType", type22))), emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
    }
}
