package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class iz {
    public final defpackage.ho0 ZpBGe2uQfcn8 = new defpackage.ho0(new defpackage.kz[16]);
    public static final defpackage.iz giKS3J6vZuNy = new defpackage.iz();
    public static final defpackage.iz fWTAfUmVKrZq = new defpackage.iz();
    public static final defpackage.iz JhCgjQRTAOCT = new defpackage.iz();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ZpBGe2uQfcn8(defpackage.iz izVar) {
        izVar.getClass();
        if (izVar == giKS3J6vZuNy) {
            defpackage.h7.P05cfTpS5W5L("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (izVar == fWTAfUmVKrZq) {
            defpackage.h7.P05cfTpS5W5L("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        defpackage.ho0 ho0Var = izVar.ZpBGe2uQfcn8;
        int i = ho0Var.QiMR8OkAhezm;
        if (i == 0) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.wo woVar = (defpackage.kz) objArr[i2];
            if (!((defpackage.ul0) woVar).WDYagTQQm9ns.s0TASMVLSWD5) {
                defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
            }
            defpackage.ho0 ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
            defpackage.ul0 ul0Var = ((defpackage.ul0) woVar).WDYagTQQm9ns;
            defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
            if (ul0Var2 == null) {
                defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var);
            } else {
                ho0Var2.giKS3J6vZuNy(ul0Var2);
            }
            while (true) {
                int i3 = ho0Var2.QiMR8OkAhezm;
                if (i3 != 0) {
                    defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var2.Ns0WNyEWdPsk(i3 - 1);
                    if ((ul0Var3.P05cfTpS5W5L & 1024) == 0) {
                        defpackage.la0.oh71FJcDz6S2(ho0Var2, ul0Var3);
                    } else {
                        while (true) {
                            if (ul0Var3 == null) {
                                break;
                            }
                            if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                                defpackage.ho0 ho0Var3 = null;
                                while (ul0Var3 != null) {
                                    if (ul0Var3 instanceof defpackage.nz) {
                                        if (((defpackage.nz) ul0Var3).JtSMNguZxnYf(7)) {
                                            break;
                                        }
                                    } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                        int i4 = 0;
                                        for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                            if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    ul0Var3 = ul0Var4;
                                                } else {
                                                    if (ho0Var3 == null) {
                                                        ho0Var3 = new defpackage.ho0(new defpackage.ul0[16]);
                                                    }
                                                    if (ul0Var3 != null) {
                                                        ho0Var3.giKS3J6vZuNy(ul0Var3);
                                                        ul0Var3 = null;
                                                    }
                                                    ho0Var3.giKS3J6vZuNy(ul0Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var3);
                                }
                            } else {
                                ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                            }
                        }
                    }
                }
            }
        }
    }
}
