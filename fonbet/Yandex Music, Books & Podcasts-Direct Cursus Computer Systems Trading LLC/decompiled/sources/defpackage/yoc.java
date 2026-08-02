package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class yoc {
    public static final yoc b = new yoc();
    public static final yoc c = new yoc();
    public static final yoc d = new yoc();
    public final eqi a = new eqi(new zoc[16]);

    public static void b(yoc yocVar) {
        yocVar.getClass();
        yocVar.a(new u8b(1, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x003e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Function1 function1) {
        if (this == b) {
            xq0.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == c) {
            xq0.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        eqi eqiVar = this.a;
        int i = eqiVar.c;
        if (i == 0) {
            xq0.q("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = eqiVar.a;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            xci xciVar = (xci) ((zoc) objArr[i2]);
            if (!xciVar.a.n) {
                sme.b("visitChildren called on an unattached node");
            }
            eqi eqiVar2 = new eqi(new xci[16]);
            xci xciVar2 = xciVar.a;
            xci xciVar3 = xciVar2.f;
            if (xciVar3 == null) {
                bcx.o(eqiVar2, xciVar2);
            } else {
                eqiVar2.d(xciVar3);
            }
            while (true) {
                int i3 = eqiVar2.c;
                if (i3 != 0) {
                    xci xciVar4 = (xci) eqiVar2.m(i3 - 1);
                    if ((xciVar4.d & 1024) == 0) {
                        bcx.o(eqiVar2, xciVar4);
                    } else {
                        while (true) {
                            if (xciVar4 == null) {
                                break;
                            }
                            if ((xciVar4.c & 1024) != 0) {
                                eqi eqiVar3 = null;
                                while (xciVar4 != null) {
                                    if (xciVar4 instanceof dpc) {
                                        dpc dpcVar = (dpc) xciVar4;
                                        if (dpcVar.T0().a ? ((Boolean) function1.invoke(dpcVar)).booleanValue() : c9g.y(dpcVar, 7, function1)) {
                                            z = true;
                                            break;
                                        }
                                    } else if (((xciVar4.c & 1024) != 0) && (xciVar4 instanceof cw7)) {
                                        int i4 = 0;
                                        for (xci xciVar5 = ((cw7) xciVar4).p; xciVar5 != null; xciVar5 = xciVar5.f) {
                                            if ((xciVar5.c & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    xciVar4 = xciVar5;
                                                } else {
                                                    if (eqiVar3 == null) {
                                                        eqiVar3 = new eqi(new xci[16]);
                                                    }
                                                    if (xciVar4 != null) {
                                                        eqiVar3.d(xciVar4);
                                                        xciVar4 = null;
                                                    }
                                                    eqiVar3.d(xciVar5);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    xciVar4 = bcx.p(eqiVar3);
                                }
                            } else {
                                xciVar4 = xciVar4.f;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
