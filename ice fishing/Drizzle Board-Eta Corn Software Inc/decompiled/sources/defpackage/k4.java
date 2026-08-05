package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k4 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public Object Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ Object eVhOlqcC;
    public Object jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(Object obj, Object obj2, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.jb9XjC4I = obj;
        this.eVhOlqcC = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a4, code lost:
    
        if (r15 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0048, code lost:
    
        if (r7 == r6) goto L52;
     */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        l20 l20Var;
        Object qoPGr6Ce;
        md0 md0Var;
        Object MdtA4re8;
        nw nwVar;
        ReentrantLock reentrantLock;
        mw[] mwVarArr;
        mw mwVar;
        nw nwVar2;
        ReentrantLock reentrantLock2;
        boolean z = false;
        g9 g9Var = null;
        switch (this.P7K7Inc8) {
            case 0:
                xe0 xe0Var = xe0.qoPGr6Ce;
                u9 u9Var = u9.NCTxEWno;
                int i = this.b2ZJblxo;
                if (i == 0) {
                    fn.SgZGMMPL(obj);
                    t9 t9Var = (t9) this.Qr9iLBAD;
                    yg ygVar = (yg) this.jb9XjC4I;
                    m4 m4Var = (m4) this.eVhOlqcC;
                    l9 l9Var = m4Var.NCTxEWno;
                    int i2 = m4Var.MdtA4re8;
                    if (i2 == -3) {
                        i2 = -2;
                    }
                    v2 v2Var = m4Var.wxUZMvaN;
                    w9 w9Var = w9.wxUZMvaN;
                    dl l4Var = new l4(m4Var, g9Var, 0);
                    z2 MdtA4re82 = w30.MdtA4re8(i2, 4, v2Var);
                    l9 I5GHvsYW = w30.I5GHvsYW(t9Var.VgvYg0wo(), l9Var, true);
                    hb hbVar = ed.qoPGr6Ce;
                    if (I5GHvsYW != hbVar && I5GHvsYW.OnDfzHZD(re.MdtA4re8) == null) {
                        I5GHvsYW = I5GHvsYW.eVhOlqcC(hbVar);
                    }
                    i00 i00Var = new i00(I5GHvsYW, MdtA4re82);
                    i00Var.ESscZ9M1(w9Var, i00Var, l4Var);
                    this.b2ZJblxo = 1;
                    Object lDXGDhIF = ej0.lDXGDhIF(ygVar, i00Var, true, this);
                    if (lDXGDhIF != u9Var) {
                        lDXGDhIF = xe0Var;
                    }
                    if (lDXGDhIF == u9Var) {
                        return u9Var;
                    }
                } else {
                    if (i != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                return xe0Var;
            case 1:
                u9 u9Var2 = u9.NCTxEWno;
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    l20Var = (l20) this.jb9XjC4I;
                    qz qzVar = (qz) this.eVhOlqcC;
                    this.Qr9iLBAD = l20Var;
                    this.b2ZJblxo = 1;
                    qoPGr6Ce = qzVar.qoPGr6Ce(this);
                    if (qoPGr6Ce == u9Var2) {
                        return u9Var2;
                    }
                } else {
                    if (i3 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l20 l20Var2 = (l20) this.Qr9iLBAD;
                    fn.SgZGMMPL(obj);
                    l20Var = l20Var2;
                    qoPGr6Ce = obj;
                }
                l20Var.NCTxEWno = qoPGr6Ce;
                return xe0.qoPGr6Ce;
            case 2:
                u9 u9Var3 = u9.NCTxEWno;
                int i4 = this.b2ZJblxo;
                if (i4 == 0) {
                    fn.SgZGMMPL(obj);
                    t9 t9Var2 = (t9) this.Qr9iLBAD;
                    hb hbVar2 = ed.qoPGr6Ce;
                    em emVar = qq.qoPGr6Ce.P7K7Inc8;
                    u20 u20Var = new u20((xo) this.jb9XjC4I, t9Var2, (dl) this.eVhOlqcC, null);
                    this.b2ZJblxo = 1;
                    if (fn.fVMzMhyS(emVar, u20Var, this) == u9Var3) {
                        return u9Var3;
                    }
                } else {
                    if (i4 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                return xe0.qoPGr6Ce;
            default:
                xe0 xe0Var2 = xe0.qoPGr6Ce;
                u9 u9Var4 = u9.NCTxEWno;
                int i5 = this.b2ZJblxo;
                if (i5 == 0) {
                    fn.SgZGMMPL(obj);
                    md0Var = (md0) this.Qr9iLBAD;
                    this.Qr9iLBAD = md0Var;
                    this.b2ZJblxo = 1;
                    MdtA4re8 = md0Var.MdtA4re8(this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        reentrantLock2 = (ReentrantLock) this.jb9XjC4I;
                        nwVar2 = (nw) this.Qr9iLBAD;
                        try {
                            fn.SgZGMMPL(obj);
                            reentrantLock = reentrantLock2;
                            nwVar = nwVar2;
                            nwVar.P7K7Inc8 = false;
                            reentrantLock.unlock();
                            return xe0Var2;
                        } catch (Throwable th) {
                            th = th;
                            try {
                                nwVar2.P7K7Inc8 = z;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                reentrantLock = reentrantLock2;
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    md0Var = (md0) this.Qr9iLBAD;
                    fn.SgZGMMPL(obj);
                    MdtA4re8 = obj;
                }
                if (!((Boolean) MdtA4re8).booleanValue()) {
                    ie0 ie0Var = (ie0) this.eVhOlqcC;
                    nwVar = ie0Var.Qr9iLBAD;
                    reentrantLock = nwVar.VgvYg0wo;
                    reentrantLock.lock();
                    try {
                        nwVar.P7K7Inc8 = true;
                        ReentrantLock reentrantLock3 = nwVar.qoPGr6Ce;
                        reentrantLock3.lock();
                        try {
                            if (nwVar.wxUZMvaN) {
                                nwVar.wxUZMvaN = false;
                                int length = nwVar.NCTxEWno.length;
                                mwVarArr = new mw[length];
                                int i6 = 0;
                                boolean z2 = false;
                                while (i6 < length) {
                                    boolean z3 = nwVar.NCTxEWno[i6] > 0 ? true : z;
                                    boolean[] zArr = nwVar.MdtA4re8;
                                    if (z3 != zArr[i6]) {
                                        zArr[i6] = z3;
                                        mwVar = z3 ? mw.MdtA4re8 : mw.wxUZMvaN;
                                        z2 = true;
                                    } else {
                                        mwVar = mw.NCTxEWno;
                                    }
                                    mwVarArr[i6] = mwVar;
                                    i6++;
                                    z = false;
                                }
                                break;
                            }
                            mwVarArr = null;
                            if (mwVarArr != null) {
                                try {
                                    if (mwVarArr.length != 0) {
                                        ld0 ld0Var = ld0.MdtA4re8;
                                        he0 he0Var = new he0(mwVarArr, ie0Var, md0Var, null);
                                        this.Qr9iLBAD = nwVar;
                                        this.jb9XjC4I = reentrantLock;
                                        this.b2ZJblxo = 2;
                                        if (md0Var.qoPGr6Ce(ld0Var, he0Var, this) != u9Var4) {
                                            nwVar2 = nwVar;
                                            reentrantLock2 = reentrantLock;
                                            reentrantLock = reentrantLock2;
                                            nwVar = nwVar2;
                                        }
                                        return u9Var4;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    nwVar2 = nwVar;
                                    reentrantLock2 = reentrantLock;
                                    z = false;
                                    nwVar2.P7K7Inc8 = z;
                                    throw th;
                                }
                            }
                            nwVar.P7K7Inc8 = false;
                            reentrantLock.unlock();
                        } finally {
                            reentrantLock3.unlock();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return xe0Var2;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((k4) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 1:
                return ((k4) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            case 2:
                return ((k4) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0Var);
            default:
                return ((k4) lDXGDhIF((g9) obj2, (md0) obj)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        Object obj2 = this.eVhOlqcC;
        switch (i) {
            case 0:
                k4 k4Var = new k4((yg) this.jb9XjC4I, (m4) obj2, g9Var, 0);
                k4Var.Qr9iLBAD = obj;
                return k4Var;
            case 1:
                return new k4((l20) this.jb9XjC4I, (qz) obj2, g9Var, 1);
            case 2:
                k4 k4Var2 = new k4((xo) this.jb9XjC4I, (dl) obj2, g9Var, 2);
                k4Var2.Qr9iLBAD = obj;
                return k4Var2;
            default:
                k4 k4Var3 = new k4((ie0) obj2, g9Var);
                k4Var3.Qr9iLBAD = obj;
                return k4Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(ie0 ie0Var, g9 g9Var) {
        super(2, g9Var);
        this.P7K7Inc8 = 3;
        this.eVhOlqcC = ie0Var;
    }
}
