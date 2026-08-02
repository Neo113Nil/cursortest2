package defpackage;

import androidx.compose.ui.focus.d;

/* loaded from: classes10.dex */
public final class yur {
    public static final yur b = new yur();
    public static final yur c = new yur();
    public static final yur d = new yur();
    public final wz40 a = new wz40(new avr[16]);

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0050, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(yur yurVar) {
        yurVar.getClass();
        if (yurVar == b) {
            ny61.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (yurVar == c) {
            ny61.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        wz40 wz40Var = yurVar.a;
        int i = wz40Var.c;
        if (i == 0) {
            System.out.getClass();
            return;
        }
        Object[] objArr = wz40Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            avr avrVar = (avr) objArr[i2];
            if (!avrVar.getNode().isAttached()) {
                ixv.b("visitChildren called on an unattached node");
            }
            wz40 wz40Var2 = new wz40(new e530[16]);
            e530 child$ui = avrVar.getNode().getChild$ui();
            if (child$ui == null) {
                qje.b(wz40Var2, avrVar.getNode());
            } else {
                wz40Var2.b(child$ui);
            }
            while (true) {
                int i3 = wz40Var2.c;
                if (i3 != 0) {
                    e530 e530Var = (e530) wz40Var2.k(i3 - 1);
                    if ((e530Var.getAggregateChildKindSet$ui() & 1024) == 0) {
                        qje.b(wz40Var2, e530Var);
                    } else {
                        while (true) {
                            if (e530Var == null) {
                                break;
                            }
                            if ((e530Var.getKindSet$ui() & 1024) != 0) {
                                wz40 wz40Var3 = null;
                                while (e530Var != null) {
                                    if (e530Var instanceof d) {
                                        if (((d) e530Var).L0(7)) {
                                            break;
                                        }
                                    } else if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                        int i4 = 0;
                                        for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                            if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    e530Var = e530Var2;
                                                } else {
                                                    if (wz40Var3 == null) {
                                                        wz40Var3 = new wz40(new e530[16]);
                                                    }
                                                    if (e530Var != null) {
                                                        wz40Var3.b(e530Var);
                                                        e530Var = null;
                                                    }
                                                    wz40Var3.b(e530Var2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    e530Var = qje.c(wz40Var3);
                                }
                            } else {
                                e530Var = e530Var.getChild$ui();
                            }
                        }
                    }
                }
            }
        }
    }

    public final wz40 a() {
        return this.a;
    }
}
