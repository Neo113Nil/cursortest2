package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class adi {
    public final AndroidComposeView a;
    public final eqi b = new eqi(new jk2[16]);
    public final eqi c = new eqi(new pzm[16]);
    public final eqi d = new eqi(new mpf[16]);
    public final eqi e = new eqi(new pzm[16]);
    public boolean f;

    public adi(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(xci xciVar, pzm pzmVar, HashSet hashSet) {
        if (!xciVar.a.n) {
            sme.b("visitSubtreeIf called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar2 = xciVar.a;
        xci xciVar3 = xciVar2.f;
        if (xciVar3 == null) {
            bcx.o(eqiVar, xciVar2);
        } else {
            eqiVar.d(xciVar3);
        }
        while (true) {
            int i = eqiVar.c;
            if (i == 0) {
                return;
            }
            xci xciVar4 = (xci) eqiVar.m(i - 1);
            if ((xciVar4.d & 32) != 0) {
                for (xci xciVar5 = xciVar4; xciVar5 != null; xciVar5 = xciVar5.f) {
                    if ((xciVar5.c & 32) != 0) {
                        cw7 cw7Var = xciVar5;
                        ?? r5 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof bdi) {
                                bdi bdiVar = (bdi) cw7Var;
                                if (bdiVar instanceof jk2) {
                                    jk2 jk2Var = (jk2) bdiVar;
                                    if ((jk2Var.o instanceof zci) && jk2Var.q.contains(pzmVar)) {
                                        hashSet.add(bdiVar);
                                    }
                                }
                                if (bdiVar.D().o(pzmVar)) {
                                    break;
                                }
                            } else if ((cw7Var.c & 32) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar6 = cw7Var.p;
                                int i2 = 0;
                                cw7Var = cw7Var;
                                r5 = r5;
                                while (xciVar6 != null) {
                                    if ((xciVar6.c & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            cw7Var = xciVar6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r5.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r5.d(xciVar6);
                                        }
                                    }
                                    xciVar6 = xciVar6.f;
                                    cw7Var = cw7Var;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            cw7Var = bcx.p(r5);
                        }
                    }
                }
            }
            bcx.o(eqiVar, xciVar4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        ypb ypbVar = new ypb(17, this);
        gpi gpiVar = this.a.a1;
        if (gpiVar.f(ypbVar) >= 0) {
            return;
        }
        gpiVar.a(ypbVar);
    }
}
