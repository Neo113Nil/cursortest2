package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class j2 extends d71 implements lv {
    public Object E7jCp8Ls;
    public Object JFJ3QoxA;
    public final /* synthetic */ Object WIEu4Ya2g8;
    public Object XnEVoBF0td1l;
    public final /* synthetic */ Object iwATDS1i01k;
    public final /* synthetic */ int mOu10nynGul;
    public int rQPn8YBR;
    public /* synthetic */ Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(Object obj, Object obj2, Object obj3, Object obj4, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.XnEVoBF0td1l = obj;
        this.uFEq9NpZ = obj2;
        this.iwATDS1i01k = obj3;
        this.WIEu4Ya2g8 = obj4;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((j2) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c A[Catch: all -> 0x00cd, TryCatch #3 {all -> 0x00cd, blocks: (B:33:0x004b, B:38:0x0087, B:43:0x009f, B:49:0x0094, B:51:0x0099, B:52:0x009c, B:53:0x007d, B:55:0x0081, B:56:0x0084), top: B:32:0x004b }] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bh0, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x0203 -> B:114:0x0207). Please report as a decompilation issue!!! */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        ph phVar;
        m8 it;
        Object Yi7zF1RB1;
        bh0 bh0Var;
        hv hvVar;
        wg0 wg0Var;
        wg0 wg0Var2;
        Object mOu10nynGul;
        bh0 bh0Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        rt0 rt0Var;
        rt0 rt0Var2;
        l90 l90Var;
        l90 l90Var2;
        int ordinal;
        l90 l90Var3;
        l90 l90Var4;
        f40 f40Var;
        r90 r90Var;
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.WIEu4Ya2g8;
        Object obj3 = this.iwATDS1i01k;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                z9 z9Var = (z9) this.XnEVoBF0td1l;
                int i2 = this.rQPn8YBR;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    phVar = (ph) this.JFJ3QoxA;
                    it = z9Var.iterator();
                    this.JFJ3QoxA = phVar;
                    this.E7jCp8Ls = it;
                    this.rQPn8YBR = 1;
                    Yi7zF1RB1 = it.Yi7zF1RB1(this);
                    if (Yi7zF1RB1 == qhVar) {
                    }
                    if (((Boolean) Yi7zF1RB1).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (m8) this.E7jCp8Ls;
                    phVar = (ph) this.JFJ3QoxA;
                    o50.A1EKNP6CxJ(obj);
                    Yi7zF1RB1 = obj;
                    if (((Boolean) Yi7zF1RB1).booleanValue()) {
                        Object X1lG3V04pd = it.X1lG3V04pd();
                        Object YmKjaVtbfp5Z = z9Var.YmKjaVtbfp5Z();
                        if (YmKjaVtbfp5Z instanceof ja) {
                            YmKjaVtbfp5Z = null;
                        }
                        fb1.MZhzXH72(phVar, null, new i2(YmKjaVtbfp5Z == null ? X1lG3V04pd : YmKjaVtbfp5Z, (g2) this.uFEq9NpZ, (mg0) obj3, (mg0) obj2, null, 0), 3);
                        this.JFJ3QoxA = phVar;
                        this.E7jCp8Ls = it;
                        this.rQPn8YBR = 1;
                        Yi7zF1RB1 = it.Yi7zF1RB1(this);
                        if (Yi7zF1RB1 == qhVar) {
                            return qhVar;
                        }
                        if (((Boolean) Yi7zF1RB1).booleanValue()) {
                            return kc1Var;
                        }
                    }
                }
            case 1:
                zg0 zg0Var = (zg0) obj3;
                ?? r2 = this.rQPn8YBR;
                try {
                    try {
                        if (r2 == 0) {
                            o50.A1EKNP6CxJ(obj);
                            eh E7jCp8Ls = ((ph) this.uFEq9NpZ).EljAMC1QTz().E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
                            E7jCp8Ls.getClass();
                            wg0 wg0Var3 = new wg0((f40) E7jCp8Ls);
                            AtomicReference atomicReference3 = zg0Var.GWasM1elztuh;
                            while (true) {
                                wg0 wg0Var4 = (wg0) atomicReference3.get();
                                if (wg0Var4 != null) {
                                    ug0 ug0Var = ug0.OOA6hdeuvCS;
                                    if (ug0Var.compareTo(ug0Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(wg0Var4, wg0Var3)) {
                                    if (atomicReference3.get() != wg0Var4) {
                                        break;
                                    }
                                }
                                if (wg0Var4 != null) {
                                    wg0Var4.GWasM1elztuh.GWasM1elztuh(new na("Mutation interrupted", 1));
                                }
                                bh0 bh0Var3 = zg0Var.Yi7zF1RB1;
                                hv hvVar2 = (hv) obj2;
                                this.uFEq9NpZ = wg0Var3;
                                this.E7jCp8Ls = bh0Var3;
                                this.JFJ3QoxA = hvVar2;
                                this.XnEVoBF0td1l = zg0Var;
                                this.rQPn8YBR = 1;
                                if (bh0Var3.xqGvceK5x(this) == qhVar) {
                                    return qhVar;
                                }
                                bh0Var = bh0Var3;
                                hvVar = hvVar2;
                                wg0Var = wg0Var3;
                            }
                        } else {
                            if (r2 != 1) {
                                if (r2 != 2) {
                                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                zg0Var = (zg0) this.JFJ3QoxA;
                                bh0Var2 = (bh0) this.E7jCp8Ls;
                                wg0Var2 = (wg0) this.uFEq9NpZ;
                                try {
                                    o50.A1EKNP6CxJ(obj);
                                    mOu10nynGul = obj;
                                    atomicReference2 = zg0Var.GWasM1elztuh;
                                    while (!atomicReference2.compareAndSet(wg0Var2, null) && atomicReference2.get() == wg0Var2) {
                                    }
                                    bh0Var2.AvO7iQsrTN(null);
                                    return mOu10nynGul;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = zg0Var.GWasM1elztuh;
                                    while (!atomicReference.compareAndSet(wg0Var2, null) && atomicReference.get() == wg0Var2) {
                                    }
                                    throw th;
                                }
                            }
                            zg0Var = (zg0) this.XnEVoBF0td1l;
                            hvVar = (hv) this.JFJ3QoxA;
                            bh0Var = (bh0) this.E7jCp8Ls;
                            wg0Var = (wg0) this.uFEq9NpZ;
                            o50.A1EKNP6CxJ(obj);
                        }
                        this.uFEq9NpZ = wg0Var;
                        this.E7jCp8Ls = bh0Var;
                        this.JFJ3QoxA = zg0Var;
                        this.XnEVoBF0td1l = null;
                        this.rQPn8YBR = 2;
                        mOu10nynGul = hvVar.mOu10nynGul(this);
                        if (mOu10nynGul == qhVar) {
                            return qhVar;
                        }
                        bh0Var2 = bh0Var;
                        wg0Var2 = wg0Var;
                        atomicReference2 = zg0Var.GWasM1elztuh;
                        while (!atomicReference2.compareAndSet(wg0Var2, null)) {
                        }
                        bh0Var2.AvO7iQsrTN(null);
                        return mOu10nynGul;
                    } catch (Throwable th2) {
                        th = th2;
                        wg0Var2 = wg0Var;
                        atomicReference = zg0Var.GWasM1elztuh;
                        while (!atomicReference.compareAndSet(wg0Var2, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r2.AvO7iQsrTN(null);
                    throw th3;
                }
            default:
                w90 w90Var = (w90) this.XnEVoBF0td1l;
                int i3 = this.rQPn8YBR;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    if (w90Var.encWxUiV2 == m90.OOA6hdeuvCS) {
                        return kc1Var;
                    }
                    rt0 rt0Var3 = new rt0();
                    rt0 rt0Var4 = new rt0();
                    try {
                        m90 m90Var = (m90) this.uFEq9NpZ;
                        ph phVar2 = (ph) obj3;
                        lv lvVar = (lv) obj2;
                        this.E7jCp8Ls = rt0Var3;
                        this.JFJ3QoxA = rt0Var4;
                        this.rQPn8YBR = 1;
                        n9 n9Var = new n9(1, rj0.M3K9sHhK(this));
                        n9Var.cilMamHF();
                        l90.Companion.getClass();
                        m90Var.getClass();
                        int ordinal2 = m90Var.ordinal();
                        if (ordinal2 == 2) {
                            l90Var = l90.ON_CREATE;
                        } else if (ordinal2 == 3) {
                            l90Var = l90.ON_START;
                        } else if (ordinal2 != 4) {
                            l90Var2 = null;
                            ordinal = m90Var.ordinal();
                            if (ordinal != 2) {
                                l90Var3 = l90.ON_DESTROY;
                            } else if (ordinal == 3) {
                                l90Var3 = l90.ON_STOP;
                            } else if (ordinal != 4) {
                                l90Var4 = null;
                                ju0 ju0Var = new ju0(l90Var2, rt0Var3, phVar2, l90Var4, n9Var, new bh0(), lvVar);
                                rt0Var4.OOA6hdeuvCS = ju0Var;
                                w90Var.GWasM1elztuh(ju0Var);
                                if (n9Var.jivtDDk9H() == qhVar) {
                                    return qhVar;
                                }
                                rt0Var = rt0Var4;
                                rt0Var2 = rt0Var3;
                            } else {
                                l90Var3 = l90.ON_PAUSE;
                            }
                            l90Var4 = l90Var3;
                            ju0 ju0Var2 = new ju0(l90Var2, rt0Var3, phVar2, l90Var4, n9Var, new bh0(), lvVar);
                            rt0Var4.OOA6hdeuvCS = ju0Var2;
                            w90Var.GWasM1elztuh(ju0Var2);
                            if (n9Var.jivtDDk9H() == qhVar) {
                            }
                        } else {
                            l90Var = l90.ON_RESUME;
                        }
                        l90Var2 = l90Var;
                        ordinal = m90Var.ordinal();
                        if (ordinal != 2) {
                        }
                        l90Var4 = l90Var3;
                        ju0 ju0Var22 = new ju0(l90Var2, rt0Var3, phVar2, l90Var4, n9Var, new bh0(), lvVar);
                        rt0Var4.OOA6hdeuvCS = ju0Var22;
                        w90Var.GWasM1elztuh(ju0Var22);
                        if (n9Var.jivtDDk9H() == qhVar) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        rt0Var = rt0Var4;
                        rt0Var2 = rt0Var3;
                        f40Var = (f40) rt0Var2.OOA6hdeuvCS;
                        if (f40Var != null) {
                            f40Var.GWasM1elztuh(null);
                        }
                        r90Var = (r90) rt0Var.OOA6hdeuvCS;
                        if (r90Var != null) {
                            w90Var.EljAMC1QTz(r90Var);
                        }
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rt0Var = (rt0) this.JFJ3QoxA;
                    rt0Var2 = (rt0) this.E7jCp8Ls;
                    try {
                        o50.A1EKNP6CxJ(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        f40Var = (f40) rt0Var2.OOA6hdeuvCS;
                        if (f40Var != null) {
                        }
                        r90Var = (r90) rt0Var.OOA6hdeuvCS;
                        if (r90Var != null) {
                        }
                        throw th;
                    }
                }
                f40 f40Var2 = (f40) rt0Var2.OOA6hdeuvCS;
                if (f40Var2 != null) {
                    f40Var2.GWasM1elztuh(null);
                }
                r90 r90Var2 = (r90) rt0Var.OOA6hdeuvCS;
                if (r90Var2 == null) {
                    return kc1Var;
                }
                w90Var.EljAMC1QTz(r90Var2);
                return kc1Var;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.WIEu4Ya2g8;
        Object obj3 = this.iwATDS1i01k;
        switch (i) {
            case 0:
                j2 j2Var = new j2((z9) this.XnEVoBF0td1l, (g2) this.uFEq9NpZ, (mg0) obj3, (mg0) obj2, vgVar, 0);
                j2Var.JFJ3QoxA = obj;
                return j2Var;
            case 1:
                j2 j2Var2 = new j2((zg0) obj3, (hv) obj2, vgVar);
                j2Var2.uFEq9NpZ = obj;
                return j2Var2;
            default:
                return new j2((w90) this.XnEVoBF0td1l, (m90) this.uFEq9NpZ, (ph) obj3, (lv) obj2, vgVar, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(zg0 zg0Var, hv hvVar, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = 1;
        this.iwATDS1i01k = zg0Var;
        this.WIEu4Ya2g8 = hvVar;
    }
}
