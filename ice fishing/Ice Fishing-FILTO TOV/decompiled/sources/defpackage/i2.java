package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i2 extends d71 implements lv {
    public Object E7jCp8Ls;
    public int JFJ3QoxA;
    public Object XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul;
    public Object rQPn8YBR;
    public final /* synthetic */ Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, Object obj4, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = obj;
        this.E7jCp8Ls = obj2;
        this.XnEVoBF0td1l = obj3;
        this.uFEq9NpZ = obj4;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 2:
                return ((i2) uFEq9NpZ((vg) obj2, (j21) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 4:
                ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
                return qh.OOA6hdeuvCS;
            case 5:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            case 8:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((i2) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02f0, code lost:
    
        if (defpackage.rj0.lv06NcmrQ(r0, r1, r26) == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017e, code lost:
    
        if (defpackage.fb1.mE4lRynR(r2, r26) == r7) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v44, types: [bh0] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x0277 -> B:107:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0297 -> B:107:0x0245). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e7 -> B:33:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        Object GWasM1elztuh;
        ph phVar;
        ot0 ot0Var;
        Object obj2;
        bh0 bh0Var;
        lv lvVar;
        ph phVar2;
        ea1 ea1Var;
        Object obj3;
        ph phVar3;
        wy0 wy0Var;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        bh0 bh0Var2 = "call to 'resume' before 'invoke' with coroutine";
        qh qhVar = qh.OOA6hdeuvCS;
        Object obj4 = this.uFEq9NpZ;
        int i2 = 2;
        f51 f51Var = null;
        switch (i) {
            case 0:
                Object obj5 = this.rQPn8YBR;
                g2 g2Var = (g2) this.E7jCp8Ls;
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    if (o30.rQPn8YBR(obj5, g2Var.OOA6hdeuvCS.getValue())) {
                        return kc1Var;
                    }
                    mg0 mg0Var = (mg0) this.XnEVoBF0td1l;
                    c51 c51Var = k2.GWasM1elztuh;
                    l3 l3Var = (l3) mg0Var.getValue();
                    this.JFJ3QoxA = 1;
                    if (g2.X1lG3V04pd(g2Var, obj5, l3Var, this) == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i3 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                c51 c51Var2 = k2.GWasM1elztuh;
                hv hvVar = (hv) ((mg0) obj4).getValue();
                if (hvVar == null) {
                    return kc1Var;
                }
                hvVar.mOu10nynGul(g2Var.xqGvceK5x());
                return kc1Var;
            case 1:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ie ieVar = (ie) this.rQPn8YBR;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.E7jCp8Ls;
                    Rect rect = (Rect) this.XnEVoBF0td1l;
                    y20 y20Var = new y20(rect.left, rect.top, rect.right, rect.bottom);
                    this.JFJ3QoxA = 1;
                    GWasM1elztuh = ie.GWasM1elztuh(ieVar, scrollCaptureSession, y20Var, this);
                    if (GWasM1elztuh == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i4 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                    GWasM1elztuh = obj;
                }
                ((Consumer) obj4).accept(l60.pog2g9KITJA((y20) GWasM1elztuh));
                return kc1Var;
            case 2:
                p51 p51Var = (p51) this.XnEVoBF0td1l;
                int i5 = this.JFJ3QoxA;
                if (i5 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    int ordinal = ((j21) this.rQPn8YBR).ordinal();
                    if (ordinal == 0) {
                        ls lsVar = (ls) this.E7jCp8Ls;
                        this.JFJ3QoxA = 1;
                        return lsVar.GWasM1elztuh(p51Var, this) == qhVar ? qhVar : kc1Var;
                    }
                    if (ordinal == 1) {
                        return kc1Var;
                    }
                    if (ordinal == 2) {
                        Float f = (Float) obj4;
                        if (f == rj0.JFJ3QoxA) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        p51Var.JFJ3QoxA(null, f);
                        return kc1Var;
                    }
                    o4.xqGvceK5x();
                } else {
                    if (i5 == 1) {
                        o50.A1EKNP6CxJ(obj);
                        return kc1Var;
                    }
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                ls lsVar2 = (ls) this.E7jCp8Ls;
                p51 p51Var2 = (p51) this.XnEVoBF0td1l;
                int i6 = this.JFJ3QoxA;
                int i7 = 3;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            o50.A1EKNP6CxJ(obj);
                        } else if (i6 != 3 && i6 != 4) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    o50.A1EKNP6CxJ(obj);
                    return kc1Var;
                }
                o50.A1EKNP6CxJ(obj);
                k51 k51Var = (k51) this.rQPn8YBR;
                if (k51Var == k21.GWasM1elztuh) {
                    this.JFJ3QoxA = 1;
                    if (lsVar2.GWasM1elztuh(p51Var2, this) != qhVar) {
                        return kc1Var;
                    }
                } else {
                    vg vgVar = null;
                    if (k51Var == k21.Yi7zF1RB1) {
                        s61 AvO7iQsrTN = p51Var2.AvO7iQsrTN();
                        ct ctVar = new ct(2, null);
                        this.JFJ3QoxA = 2;
                        break;
                    } else {
                        s61 AvO7iQsrTN2 = p51Var2.AvO7iQsrTN();
                        j51 j51Var = new j51(k51Var, null);
                        int i8 = ys.GWasM1elztuh;
                        vp vpVar = vp.OOA6hdeuvCS;
                        l8 l8Var = l8.OOA6hdeuvCS;
                        ls jivtDDk9H = rj0.jivtDDk9H(rj0.jivtDDk9H(new jj(new ha(j51Var, AvO7iQsrTN2, vpVar, -2, l8Var), new ni(i2, vgVar, i7), i2)));
                        i2 i2Var = new i2(lsVar2, p51Var2, (Float) obj4, vgVar, 2);
                        this.JFJ3QoxA = 4;
                        Object GWasM1elztuh2 = rj0.iwATDS1i01k(new ha(new xs(i2Var, null), jivtDDk9H, vpVar, -2, l8Var), 0).GWasM1elztuh(lk0.OOA6hdeuvCS, this);
                        if (GWasM1elztuh2 != qhVar) {
                            GWasM1elztuh2 = kc1Var;
                        }
                        if (GWasM1elztuh2 != qhVar) {
                            GWasM1elztuh2 = kc1Var;
                        }
                        if (GWasM1elztuh2 != qhVar) {
                            return kc1Var;
                        }
                    }
                }
                return qhVar;
                this.JFJ3QoxA = 3;
                if (lsVar2.GWasM1elztuh(p51Var2, this) != qhVar) {
                    return kc1Var;
                }
                return qhVar;
            case 4:
                int i9 = this.JFJ3QoxA;
                if (i9 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    phVar = (ph) this.rQPn8YBR;
                    ot0Var = new ot0();
                    ot0Var.OOA6hdeuvCS = 1.0f;
                } else if (i9 == 1) {
                    ot0 ot0Var2 = (ot0) this.E7jCp8Ls;
                    ph phVar4 = (ph) this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                    ot0Var = ot0Var2;
                    phVar = phVar4;
                    if (ot0Var.OOA6hdeuvCS == 0.0f) {
                        si siVar = new si(2, new ei(new o1(i2, phVar), null));
                        l10 l10Var = new l10(2, null);
                        this.rQPn8YBR = phVar;
                        this.E7jCp8Ls = ot0Var;
                        this.JFJ3QoxA = 2;
                        if (rj0.lv06NcmrQ(siVar, l10Var, this) == qhVar) {
                            return qhVar;
                        }
                    }
                } else {
                    if (i9 != 2) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ot0 ot0Var3 = (ot0) this.E7jCp8Ls;
                    ph phVar5 = (ph) this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                    ot0Var = ot0Var3;
                    phVar = phVar5;
                }
                dk dkVar = new dk((mg0) this.XnEVoBF0td1l, (m10) obj4, ot0Var, phVar);
                this.rQPn8YBR = phVar;
                this.E7jCp8Ls = ot0Var;
                this.JFJ3QoxA = 1;
                if (OOA6hdeuvCS().E7jCp8Ls(b9xEq24R1.dqB83aoLBB) != null) {
                    o4.YmKjaVtbfp5Z();
                    return null;
                }
                if (o50.jivtDDk9H(OOA6hdeuvCS()).X1lG3V04pd(dkVar, this) == qhVar) {
                    return qhVar;
                }
                if (ot0Var.OOA6hdeuvCS == 0.0f) {
                }
                dk dkVar2 = new dk((mg0) this.XnEVoBF0td1l, (m10) obj4, ot0Var, phVar);
                this.rQPn8YBR = phVar;
                this.E7jCp8Ls = ot0Var;
                this.JFJ3QoxA = 1;
                if (OOA6hdeuvCS().E7jCp8Ls(b9xEq24R1.dqB83aoLBB) != null) {
                }
            case 5:
                fh0 fh0Var = (fh0) this.XnEVoBF0td1l;
                vz0 vz0Var = (vz0) this.E7jCp8Ls;
                int i10 = this.JFJ3QoxA;
                if (i10 != 0) {
                    if (i10 == 1 || i10 == 2) {
                        o50.A1EKNP6CxJ(obj);
                        return kc1Var;
                    }
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o50.A1EKNP6CxJ(obj);
                ph phVar6 = (ph) this.rQPn8YBR;
                fo0 fo0Var = vz0Var.X1lG3V04pd;
                bo0 bo0Var = vz0Var.mOu10nynGul;
                if (o30.rQPn8YBR(fo0Var.getValue(), fh0Var)) {
                    long longValue = ((Number) ((qa1) obj4).E7jCp8Ls.getValue()).longValue() / 1000000;
                    float AvO7iQsrTN3 = bo0Var.AvO7iQsrTN();
                    db1 JFXS9W1rB5s4 = fb1.JFXS9W1rB5s4((int) (bo0Var.AvO7iQsrTN() * longValue), 6, null);
                    xw xwVar = new xw(phVar6, vz0Var, fh0Var, i2);
                    this.JFJ3QoxA = 2;
                    if (q70.AvO7iQsrTN(AvO7iQsrTN3, 0.0f, JFXS9W1rB5s4, xwVar, this, 4) != qhVar) {
                        return kc1Var;
                    }
                } else {
                    this.JFJ3QoxA = 1;
                    qa1 qa1Var = vz0Var.OOA6hdeuvCS;
                    if (qa1Var == null || (obj2 = zg0.GWasM1elztuh(vz0Var.E7jCp8Ls, new pz0(qa1Var, vz0Var, fh0Var, (vg) null), this)) != qhVar) {
                        obj2 = kc1Var;
                    }
                    if (obj2 != qhVar) {
                        return kc1Var;
                    }
                }
                return qhVar;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                int i11 = this.JFJ3QoxA;
                try {
                    if (i11 == 0) {
                        o50.A1EKNP6CxJ(obj);
                        bh0 bh0Var3 = (bh0) this.XnEVoBF0td1l;
                        lv lvVar2 = (lv) obj4;
                        this.rQPn8YBR = bh0Var3;
                        this.E7jCp8Ls = (d71) lvVar2;
                        this.JFJ3QoxA = 1;
                        if (bh0Var3.xqGvceK5x(this) != qhVar) {
                            bh0Var = bh0Var3;
                            lvVar = lvVar2;
                        }
                        return qhVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bh0 bh0Var4 = (bh0) this.rQPn8YBR;
                        o50.A1EKNP6CxJ(obj);
                        bh0Var2 = bh0Var4;
                        return kc1Var;
                    }
                    lvVar = (lv) ((d71) this.E7jCp8Ls);
                    bh0 bh0Var5 = (bh0) this.rQPn8YBR;
                    o50.A1EKNP6CxJ(obj);
                    bh0Var = bh0Var5;
                    ar0 ar0Var = new ar0(lvVar, f51Var, i2);
                    this.rQPn8YBR = bh0Var;
                    this.E7jCp8Ls = null;
                    this.JFJ3QoxA = 2;
                    bh0Var2 = bh0Var;
                    break;
                } finally {
                    bh0Var2.AvO7iQsrTN(null);
                }
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                int i12 = this.JFJ3QoxA;
                if (i12 != 0) {
                    if (i12 == 1) {
                        o50.A1EKNP6CxJ(obj);
                        return kc1Var;
                    }
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o50.A1EKNP6CxJ(obj);
                ph phVar7 = (ph) this.rQPn8YBR;
                pk pkVar = mm.GWasM1elztuh;
                dz dzVar = cc0.GWasM1elztuh.JFJ3QoxA;
                j2 j2Var = new j2((w90) this.E7jCp8Ls, (m90) this.XnEVoBF0td1l, phVar7, (lv) obj4, null, 2);
                this.JFJ3QoxA = 1;
                return fb1.ES6ysExf(dzVar, j2Var, this) == qhVar ? qhVar : kc1Var;
            case 8:
                ea1 ea1Var2 = (ea1) obj4;
                int i13 = this.JFJ3QoxA;
                try {
                    if (i13 == 0) {
                        o50.A1EKNP6CxJ(obj);
                        phVar2 = (ph) this.rQPn8YBR;
                    } else {
                        if (i13 == 1) {
                            wy0Var = (wy0) this.XnEVoBF0td1l;
                            ea1 ea1Var3 = (ea1) this.E7jCp8Ls;
                            ph phVar8 = (ph) this.rQPn8YBR;
                            o50.A1EKNP6CxJ(obj);
                            ea1Var = ea1Var3;
                            phVar3 = phVar8;
                            obj3 = obj;
                            this.rQPn8YBR = phVar3;
                            this.E7jCp8Ls = null;
                            this.XnEVoBF0td1l = null;
                            this.JFJ3QoxA = 2;
                            if (ea1.X1lG3V04pd(ea1Var, wy0Var, (ca1) obj3, this) != qhVar) {
                                phVar2 = phVar3;
                            }
                            return qhVar;
                        }
                        if (i13 != 2) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        phVar2 = (ph) this.rQPn8YBR;
                        o50.A1EKNP6CxJ(obj);
                    }
                    if (!ki1.eUH21U3apd(phVar2.EljAMC1QTz())) {
                        return kc1Var;
                    }
                    wy0 wy0Var2 = ea1Var2.GWasM1elztuh;
                    n8 n8Var = ea1Var2.EljAMC1QTz;
                    this.rQPn8YBR = phVar2;
                    this.E7jCp8Ls = ea1Var2;
                    this.XnEVoBF0td1l = wy0Var2;
                    this.JFJ3QoxA = 1;
                    n8Var.getClass();
                    obj3 = n8.EXrPz3p7hFb(n8Var, this);
                    if (obj3 == qhVar) {
                        return qhVar;
                    }
                    phVar3 = phVar2;
                    wy0Var = wy0Var2;
                    ea1Var = ea1Var2;
                    this.rQPn8YBR = phVar3;
                    this.E7jCp8Ls = null;
                    this.XnEVoBF0td1l = null;
                    this.JFJ3QoxA = 2;
                    if (ea1.X1lG3V04pd(ea1Var, wy0Var, (ca1) obj3, this) != qhVar) {
                    }
                    return qhVar;
                } finally {
                    ea1Var2.AvO7iQsrTN = null;
                }
            default:
                ph1 ph1Var = (ph1) obj4;
                t90 t90Var = (t90) this.XnEVoBF0td1l;
                gt0 gt0Var = (gt0) this.E7jCp8Ls;
                int i14 = this.JFJ3QoxA;
                try {
                    if (i14 == 0) {
                        o50.A1EKNP6CxJ(obj);
                        qe0 qe0Var = (qe0) ((rt0) this.rQPn8YBR).OOA6hdeuvCS;
                        if (qe0Var != null) {
                            qe0Var.EljAMC1QTz = fb1.X1lG3V04pd(gt0Var.WdrkLMV3xh);
                        }
                        this.JFJ3QoxA = 1;
                        ft0 ft0Var = new ft0(gt0Var, null);
                        gh ghVar = this.EljAMC1QTz;
                        ghVar.getClass();
                        Object ES6ysExf = fb1.ES6ysExf(gt0Var.GWasM1elztuh, new ei(gt0Var, ft0Var, o50.jivtDDk9H(ghVar), null, 3), this);
                        if (ES6ysExf != qhVar) {
                            ES6ysExf = kc1Var;
                        }
                        if (ES6ysExf != qhVar) {
                            ES6ysExf = kc1Var;
                        }
                        if (ES6ysExf == qhVar) {
                            return qhVar;
                        }
                    } else {
                        if (i14 != 1) {
                            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o50.A1EKNP6CxJ(obj);
                    }
                    return kc1Var;
                } finally {
                    t90Var.AvO7iQsrTN().EljAMC1QTz(ph1Var);
                }
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.uFEq9NpZ;
        switch (i) {
            case 0:
                return new i2(this.rQPn8YBR, (g2) this.E7jCp8Ls, (mg0) this.XnEVoBF0td1l, (mg0) obj2, vgVar, 0);
            case 1:
                return new i2((ie) this.rQPn8YBR, (ScrollCaptureSession) this.E7jCp8Ls, (Rect) this.XnEVoBF0td1l, (Consumer) obj2, vgVar, 1);
            case 2:
                i2 i2Var = new i2((ls) this.E7jCp8Ls, (p51) this.XnEVoBF0td1l, (Float) obj2, vgVar, 2);
                i2Var.rQPn8YBR = obj;
                return i2Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new i2((k51) this.rQPn8YBR, (ls) this.E7jCp8Ls, (p51) this.XnEVoBF0td1l, (Float) obj2, vgVar, 3);
            case 4:
                i2 i2Var2 = new i2((mg0) this.XnEVoBF0td1l, (m10) obj2, vgVar, 4);
                i2Var2.rQPn8YBR = obj;
                return i2Var2;
            case 5:
                i2 i2Var3 = new i2((vz0) this.E7jCp8Ls, (fh0) this.XnEVoBF0td1l, (qa1) obj2, vgVar, 5);
                i2Var3.rQPn8YBR = obj;
                return i2Var3;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new i2((bh0) this.XnEVoBF0td1l, (lv) obj2, vgVar, 6);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                i2 i2Var4 = new i2((w90) this.E7jCp8Ls, (m90) this.XnEVoBF0td1l, (lv) obj2, vgVar, 7);
                i2Var4.rQPn8YBR = obj;
                return i2Var4;
            case 8:
                i2 i2Var5 = new i2((ea1) obj2, vgVar);
                i2Var5.rQPn8YBR = obj;
                return i2Var5;
            default:
                return new i2((rt0) this.rQPn8YBR, (gt0) this.E7jCp8Ls, (t90) this.XnEVoBF0td1l, (ph1) obj2, vgVar, 9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(Object obj, Object obj2, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.XnEVoBF0td1l = obj;
        this.uFEq9NpZ = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(Object obj, Object obj2, Object obj3, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.E7jCp8Ls = obj;
        this.XnEVoBF0td1l = obj2;
        this.uFEq9NpZ = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(ea1 ea1Var, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 8;
        this.uFEq9NpZ = ea1Var;
    }
}
