package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w2 implements qh0 {
    public m3 MdtA4re8;
    public Object NCTxEWno = b3.sjUBp5pO;
    public final /* synthetic */ z2 wxUZMvaN;

    public w2(z2 z2Var) {
        this.wxUZMvaN = z2Var;
    }

    public final Object NCTxEWno(bh bhVar) {
        v4 v4Var;
        v4 v4Var2;
        Object obj = this.NCTxEWno;
        boolean z = true;
        if (obj == b3.sjUBp5pO || obj == b3.ow5vqvCr) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z2.b2ZJblxo;
            z2 z2Var = this.wxUZMvaN;
            v4 v4Var3 = (v4) atomicReferenceFieldUpdater.get(z2Var);
            while (true) {
                if (z2Var.Ey6iv0m0()) {
                    this.NCTxEWno = b3.ow5vqvCr;
                    Throwable OnDfzHZD = z2Var.OnDfzHZD();
                    if (OnDfzHZD != null) {
                        int i = k90.qoPGr6Ce;
                        throw OnDfzHZD;
                    }
                    z = false;
                } else {
                    long andIncrement = z2.wxUZMvaN.getAndIncrement(z2Var);
                    long j = b3.NCTxEWno;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (v4Var3.wxUZMvaN != j2) {
                        v4 jb9XjC4I = z2Var.jb9XjC4I(j2, v4Var3);
                        if (jb9XjC4I == null) {
                            continue;
                        } else {
                            v4Var = jb9XjC4I;
                        }
                    } else {
                        v4Var = v4Var3;
                    }
                    Object SgZGMMPL = z2Var.SgZGMMPL(v4Var, i2, andIncrement, null);
                    lf lfVar = b3.OnDfzHZD;
                    if (SgZGMMPL == lfVar) {
                        m1.Ey6iv0m0("unreachable");
                        return null;
                    }
                    lf lfVar2 = b3.lDXGDhIF;
                    if (SgZGMMPL == lfVar2) {
                        if (andIncrement < z2Var.sjUBp5pO()) {
                            v4Var.qoPGr6Ce();
                        }
                        v4Var3 = v4Var;
                    } else {
                        if (SgZGMMPL == b3.ygLcUYwZ) {
                            m3 amk52bBQ = le0.amk52bBQ(w30.SgZGMMPL(bhVar));
                            try {
                                this.MdtA4re8 = amk52bBQ;
                                Object SgZGMMPL2 = z2Var.SgZGMMPL(v4Var, i2, andIncrement, this);
                                if (SgZGMMPL2 == lfVar) {
                                    qoPGr6Ce(v4Var, i2);
                                } else {
                                    if (SgZGMMPL2 == lfVar2) {
                                        if (andIncrement < z2Var.sjUBp5pO()) {
                                            v4Var.qoPGr6Ce();
                                        }
                                        v4 v4Var4 = (v4) z2.b2ZJblxo.get(z2Var);
                                        while (true) {
                                            if (z2Var.Ey6iv0m0()) {
                                                m3 m3Var = this.MdtA4re8;
                                                m3Var.getClass();
                                                this.MdtA4re8 = null;
                                                this.NCTxEWno = b3.ow5vqvCr;
                                                Throwable OnDfzHZD2 = z2Var.OnDfzHZD();
                                                if (OnDfzHZD2 == null) {
                                                    m3Var.P7K7Inc8(Boolean.FALSE);
                                                } else {
                                                    m3Var.P7K7Inc8(new k30(OnDfzHZD2));
                                                }
                                            } else {
                                                long andIncrement2 = z2.wxUZMvaN.getAndIncrement(z2Var);
                                                long j3 = b3.NCTxEWno;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (v4Var4.wxUZMvaN != j4) {
                                                    v4 jb9XjC4I2 = z2Var.jb9XjC4I(j4, v4Var4);
                                                    if (jb9XjC4I2 != null) {
                                                        v4Var2 = jb9XjC4I2;
                                                    }
                                                } else {
                                                    v4Var2 = v4Var4;
                                                }
                                                Object SgZGMMPL3 = z2Var.SgZGMMPL(v4Var2, i3, andIncrement2, this);
                                                v4 v4Var5 = v4Var2;
                                                if (SgZGMMPL3 == b3.OnDfzHZD) {
                                                    qoPGr6Ce(v4Var5, i3);
                                                    break;
                                                }
                                                if (SgZGMMPL3 == b3.lDXGDhIF) {
                                                    if (andIncrement2 < z2Var.sjUBp5pO()) {
                                                        v4Var5.qoPGr6Ce();
                                                    }
                                                    v4Var4 = v4Var5;
                                                } else {
                                                    if (SgZGMMPL3 == b3.ygLcUYwZ) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    v4Var5.qoPGr6Ce();
                                                    this.NCTxEWno = SgZGMMPL3;
                                                    this.MdtA4re8 = null;
                                                }
                                            }
                                        }
                                    } else {
                                        v4Var.qoPGr6Ce();
                                        this.NCTxEWno = SgZGMMPL2;
                                        this.MdtA4re8 = null;
                                    }
                                    amk52bBQ.jb9XjC4I(Boolean.TRUE, null);
                                }
                                return amk52bBQ.Ey6iv0m0();
                            } catch (Throwable th) {
                                amk52bBQ.DK9slbsy();
                                throw th;
                            }
                        }
                        v4Var.qoPGr6Ce();
                        this.NCTxEWno = SgZGMMPL;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.qh0
    public final void qoPGr6Ce(b60 b60Var, int i) {
        m3 m3Var = this.MdtA4re8;
        if (m3Var != null) {
            m3Var.qoPGr6Ce(b60Var, i);
        }
    }
}
