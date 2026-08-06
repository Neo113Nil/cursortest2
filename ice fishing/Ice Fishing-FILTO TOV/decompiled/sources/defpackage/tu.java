package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tu extends ru0 implements lv {
    public final /* synthetic */ int AvO7iQsrTN = 0;
    public /* synthetic */ Object JFJ3QoxA;
    public Object encWxUiV2;
    public int mOu10nynGul;
    public final /* synthetic */ tv rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(gh ghVar, lv lvVar, vg vgVar) {
        super(vgVar);
        this.JFJ3QoxA = ghVar;
        this.rQPn8YBR = lvVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.AvO7iQsrTN;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((tu) uFEq9NpZ((vg) obj2, (g71) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((tu) uFEq9NpZ((vg) obj2, (w01) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r13 == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [g71, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009a -> B:23:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00af -> B:23:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        g71 g71Var;
        g71 g71Var2;
        w01 w01Var;
        Object GWasM1elztuh;
        int i = this.AvO7iQsrTN;
        kc1 kc1Var = kc1.GWasM1elztuh;
        tv tvVar = this.rQPn8YBR;
        g71 g71Var3 = "call to 'resume' before 'invoke' with coroutine";
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                gh ghVar = (gh) this.JFJ3QoxA;
                int i2 = this.mOu10nynGul;
                hq0 hq0Var = hq0.AvO7iQsrTN;
                try {
                } catch (CancellationException e) {
                    e = e;
                    if (!ki1.eUH21U3apd(ghVar)) {
                        this.encWxUiV2 = g71Var3;
                        this.mOu10nynGul = 3;
                        Object iwATDS1i01k = vc0.iwATDS1i01k(g71Var3, hq0Var, this);
                        g71Var2 = g71Var3;
                        break;
                    } else {
                        throw e;
                    }
                }
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    g71Var = (g71) this.encWxUiV2;
                    if (ki1.eUH21U3apd(ghVar)) {
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            g71 g71Var4 = (g71) this.encWxUiV2;
                            o50.A1EKNP6CxJ(obj);
                            g71Var2 = g71Var4;
                        } else {
                            if (i2 != 3) {
                                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g71 g71Var5 = (g71) this.encWxUiV2;
                            o50.A1EKNP6CxJ(obj);
                            g71Var2 = g71Var5;
                        }
                        g71Var = g71Var2;
                        if (ki1.eUH21U3apd(ghVar)) {
                            return kc1Var;
                        }
                        try {
                        } catch (CancellationException e2) {
                            g71Var3 = g71Var;
                            e = e2;
                            if (!ki1.eUH21U3apd(ghVar)) {
                            }
                        }
                        this.encWxUiV2 = g71Var;
                        this.mOu10nynGul = 1;
                        if (((lv) tvVar).EljAMC1QTz(g71Var, this) != qhVar) {
                            g71Var3 = g71Var;
                            this.encWxUiV2 = g71Var3;
                            this.mOu10nynGul = 2;
                            Object iwATDS1i01k2 = vc0.iwATDS1i01k(g71Var3, hq0Var, this);
                            g71Var2 = g71Var3;
                            break;
                        }
                        return qhVar;
                    }
                    g71 g71Var6 = (g71) this.encWxUiV2;
                    o50.A1EKNP6CxJ(obj);
                    g71Var3 = g71Var6;
                    this.encWxUiV2 = g71Var3;
                    this.mOu10nynGul = 2;
                    Object iwATDS1i01k22 = vc0.iwATDS1i01k(g71Var3, hq0Var, this);
                    g71Var2 = g71Var3;
                }
            default:
                int i3 = this.mOu10nynGul;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    w01Var = (w01) this.JFJ3QoxA;
                    GWasM1elztuh = ((wu) tvVar).GWasM1elztuh();
                    if (GWasM1elztuh != null) {
                    }
                } else {
                    if (i3 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.encWxUiV2;
                    w01Var = (w01) this.JFJ3QoxA;
                    o50.A1EKNP6CxJ(obj);
                    if (obj2 == null) {
                        return kc1Var;
                    }
                    GWasM1elztuh = ((wu) tvVar).GWasM1elztuh();
                    if (GWasM1elztuh != null) {
                        this.JFJ3QoxA = w01Var;
                        this.encWxUiV2 = GWasM1elztuh;
                        this.mOu10nynGul = 1;
                        w01Var.Yi7zF1RB1(this, GWasM1elztuh);
                        return qhVar;
                    }
                    obj2 = null;
                    if (obj2 == null) {
                    }
                    GWasM1elztuh = ((wu) tvVar).GWasM1elztuh();
                    if (GWasM1elztuh != null) {
                    }
                }
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.AvO7iQsrTN;
        tv tvVar = this.rQPn8YBR;
        switch (i) {
            case 0:
                tu tuVar = new tu((gh) this.JFJ3QoxA, (lv) tvVar, vgVar);
                tuVar.encWxUiV2 = obj;
                return tuVar;
            default:
                tu tuVar2 = new tu((wu) tvVar, vgVar);
                tuVar2.JFJ3QoxA = obj;
                return tuVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(wu wuVar, vg vgVar) {
        super(vgVar);
        this.rQPn8YBR = wuVar;
    }
}
