package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wn extends d71 implements lv {
    public int E7jCp8Ls;
    public rt0 JFJ3QoxA;
    public /* synthetic */ Object XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul = 1;
    public rt0 rQPn8YBR;
    public final /* synthetic */ oy0 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(rt0 rt0Var, oy0 oy0Var, vg vgVar) {
        super(2, vgVar);
        this.rQPn8YBR = rt0Var;
        this.uFEq9NpZ = oy0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((wn) uFEq9NpZ((vg) obj2, (hv) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((wn) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:22|23|(1:25)|(0)|27|28|29|(2:35|(2:37|(0)))(2:31|(1:33))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:29:0x00c1, B:31:0x00c7, B:35:0x00d9, B:37:0x00dd), top: B:28:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:29:0x00c1, B:31:0x00c7, B:35:0x00d9, B:37:0x00dd), top: B:28:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e8 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:9:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0142 -> B:62:0x0143). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0146 -> B:63:0x0148). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        hv hvVar;
        Object obj2;
        ph phVar;
        rt0 rt0Var;
        rt0 rt0Var2;
        rt0 rt0Var3;
        ph phVar2;
        ph phVar3;
        Object obj3;
        Object EljAMC1QTz;
        qn qnVar;
        Object obj4;
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        oy0 oy0Var = this.uFEq9NpZ;
        kc1 kc1Var = kc1.GWasM1elztuh;
        vg vgVar = null;
        switch (i) {
            case 0:
                rt0 rt0Var4 = this.rQPn8YBR;
                int i2 = this.E7jCp8Ls;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    hvVar = (hv) this.XnEVoBF0td1l;
                    obj2 = rt0Var4.OOA6hdeuvCS;
                    if (obj2 instanceof pn) {
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    rt0 rt0Var5 = this.JFJ3QoxA;
                    hvVar = (hv) this.XnEVoBF0td1l;
                    o50.A1EKNP6CxJ(obj);
                    qn qnVar2 = (qn) obj;
                    rt0Var5.OOA6hdeuvCS = qnVar2;
                    obj2 = rt0Var4.OOA6hdeuvCS;
                    if (!(obj2 instanceof pn) || (obj2 instanceof mn)) {
                        break;
                    } else {
                        nn nnVar = obj2 instanceof nn ? (nn) obj2 : null;
                        if (nnVar != null) {
                            hvVar.mOu10nynGul(nnVar);
                        }
                        n8 n8Var = oy0Var.arNh8D4Z5gB;
                        if (n8Var != null) {
                            this.XnEVoBF0td1l = hvVar;
                            this.JFJ3QoxA = rt0Var4;
                            this.E7jCp8Ls = 1;
                            obj = n8.EXrPz3p7hFb(n8Var, this);
                            if (obj != qhVar) {
                                rt0Var5 = rt0Var4;
                                qn qnVar22 = (qn) obj;
                                rt0Var5.OOA6hdeuvCS = qnVar22;
                                obj2 = rt0Var4.OOA6hdeuvCS;
                                if (obj2 instanceof pn) {
                                }
                            }
                        } else {
                            rt0Var5 = rt0Var4;
                            qnVar22 = null;
                            rt0Var5.OOA6hdeuvCS = qnVar22;
                            obj2 = rt0Var4.OOA6hdeuvCS;
                            if (obj2 instanceof pn) {
                            }
                        }
                    }
                }
                break;
            default:
                switch (this.E7jCp8Ls) {
                    case 0:
                        o50.A1EKNP6CxJ(obj);
                        phVar = (ph) this.XnEVoBF0td1l;
                        if (!fb1.YZjbz8VdP5(phVar)) {
                            rt0Var = new rt0();
                            n8 n8Var2 = oy0Var.arNh8D4Z5gB;
                            if (n8Var2 != null) {
                                this.XnEVoBF0td1l = phVar;
                                this.JFJ3QoxA = rt0Var;
                                this.rQPn8YBR = rt0Var;
                                this.E7jCp8Ls = 1;
                                obj = n8.EXrPz3p7hFb(n8Var2, this);
                                if (obj != qhVar) {
                                    rt0Var2 = rt0Var;
                                    qnVar = (qn) obj;
                                    rt0Var.OOA6hdeuvCS = qnVar;
                                    obj4 = rt0Var2.OOA6hdeuvCS;
                                    if (obj4 instanceof on) {
                                        this.XnEVoBF0td1l = phVar;
                                        this.JFJ3QoxA = rt0Var2;
                                        this.rQPn8YBR = null;
                                        this.E7jCp8Ls = 2;
                                        if (oy0.OGdJP42E(oy0Var, (on) obj4, this) != qhVar) {
                                            rt0Var3 = rt0Var2;
                                            phVar2 = phVar;
                                            wn wnVar = new wn(rt0Var3, oy0Var, null);
                                            this.XnEVoBF0td1l = phVar2;
                                            this.JFJ3QoxA = rt0Var3;
                                            this.E7jCp8Ls = 3;
                                            wy0 wy0Var = oy0Var.YXi2hvwn7WL;
                                            EljAMC1QTz = wy0Var.EljAMC1QTz(tg0.EljAMC1QTz, new EljAMC1QTz(wnVar, wy0Var, vgVar, 14), this);
                                            if (EljAMC1QTz != qhVar) {
                                                EljAMC1QTz = kc1Var;
                                            }
                                            if (EljAMC1QTz == qhVar) {
                                            }
                                            phVar = phVar2;
                                            obj3 = rt0Var3.OOA6hdeuvCS;
                                            if (obj3 instanceof pn) {
                                                this.XnEVoBF0td1l = phVar;
                                                this.JFJ3QoxA = null;
                                                this.E7jCp8Ls = 4;
                                                if (oy0.bfDgRvRIg(oy0Var, (pn) obj3, this) == qhVar) {
                                                    break;
                                                }
                                            } else if (obj3 instanceof mn) {
                                                this.XnEVoBF0td1l = phVar;
                                                this.JFJ3QoxA = null;
                                                this.E7jCp8Ls = 5;
                                                if (oy0.Hc2GqxcqBiX(oy0Var, this) == qhVar) {
                                                }
                                            }
                                        }
                                    }
                                    if (!fb1.YZjbz8VdP5(phVar)) {
                                        break;
                                    }
                                }
                            } else {
                                rt0Var2 = rt0Var;
                                qnVar = null;
                                rt0Var.OOA6hdeuvCS = qnVar;
                                obj4 = rt0Var2.OOA6hdeuvCS;
                                if (obj4 instanceof on) {
                                }
                                if (!fb1.YZjbz8VdP5(phVar)) {
                                }
                            }
                        }
                        break;
                    case 1:
                        rt0Var = this.rQPn8YBR;
                        rt0Var2 = this.JFJ3QoxA;
                        phVar = (ph) this.XnEVoBF0td1l;
                        o50.A1EKNP6CxJ(obj);
                        qnVar = (qn) obj;
                        rt0Var.OOA6hdeuvCS = qnVar;
                        obj4 = rt0Var2.OOA6hdeuvCS;
                        if (obj4 instanceof on) {
                        }
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    case 2:
                        rt0Var3 = this.JFJ3QoxA;
                        phVar2 = (ph) this.XnEVoBF0td1l;
                        o50.A1EKNP6CxJ(obj);
                        wn wnVar2 = new wn(rt0Var3, oy0Var, null);
                        this.XnEVoBF0td1l = phVar2;
                        this.JFJ3QoxA = rt0Var3;
                        this.E7jCp8Ls = 3;
                        wy0 wy0Var2 = oy0Var.YXi2hvwn7WL;
                        EljAMC1QTz = wy0Var2.EljAMC1QTz(tg0.EljAMC1QTz, new EljAMC1QTz(wnVar2, wy0Var2, vgVar, 14), this);
                        if (EljAMC1QTz != qhVar) {
                        }
                        if (EljAMC1QTz == qhVar) {
                        }
                        phVar = phVar2;
                        obj3 = rt0Var3.OOA6hdeuvCS;
                        if (obj3 instanceof pn) {
                        }
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        rt0Var3 = this.JFJ3QoxA;
                        phVar2 = (ph) this.XnEVoBF0td1l;
                        try {
                            o50.A1EKNP6CxJ(obj);
                        } catch (CancellationException unused) {
                            phVar3 = phVar2;
                            this.XnEVoBF0td1l = phVar3;
                            this.JFJ3QoxA = null;
                            this.E7jCp8Ls = 6;
                            if (oy0.Hc2GqxcqBiX(oy0Var, this) == qhVar) {
                            }
                            phVar = phVar3;
                            if (!fb1.YZjbz8VdP5(phVar)) {
                            }
                        }
                        phVar = phVar2;
                        obj3 = rt0Var3.OOA6hdeuvCS;
                        if (obj3 instanceof pn) {
                        }
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    case 4:
                        phVar3 = (ph) this.XnEVoBF0td1l;
                        try {
                            o50.A1EKNP6CxJ(obj);
                        } catch (CancellationException unused2) {
                            this.XnEVoBF0td1l = phVar3;
                            this.JFJ3QoxA = null;
                            this.E7jCp8Ls = 6;
                            if (oy0.Hc2GqxcqBiX(oy0Var, this) == qhVar) {
                                return qhVar;
                            }
                            phVar = phVar3;
                            if (!fb1.YZjbz8VdP5(phVar)) {
                            }
                        }
                        phVar = phVar3;
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    case 5:
                        phVar3 = (ph) this.XnEVoBF0td1l;
                        o50.A1EKNP6CxJ(obj);
                        phVar = phVar3;
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        phVar3 = (ph) this.XnEVoBF0td1l;
                        o50.A1EKNP6CxJ(obj);
                        phVar = phVar3;
                        if (!fb1.YZjbz8VdP5(phVar)) {
                        }
                        break;
                    default:
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        oy0 oy0Var = this.uFEq9NpZ;
        switch (i) {
            case 0:
                wn wnVar = new wn(this.rQPn8YBR, oy0Var, vgVar);
                wnVar.XnEVoBF0td1l = obj;
                return wnVar;
            default:
                wn wnVar2 = new wn(oy0Var, vgVar);
                wnVar2.XnEVoBF0td1l = obj;
                return wnVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(oy0 oy0Var, vg vgVar) {
        super(2, vgVar);
        this.uFEq9NpZ = oy0Var;
    }
}
