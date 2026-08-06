package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m8 implements if1 {
    public final /* synthetic */ n8 AvO7iQsrTN;
    public n9 EljAMC1QTz;
    public Object OOA6hdeuvCS = p8.WIEu4Ya2g8;

    public m8(n8 n8Var) {
        this.AvO7iQsrTN = n8Var;
    }

    @Override // defpackage.if1
    public final void GWasM1elztuh(wz0 wz0Var, int i) {
        n9 n9Var = this.EljAMC1QTz;
        if (n9Var != null) {
            n9Var.GWasM1elztuh(wz0Var, i);
        }
    }

    public final Object X1lG3V04pd() {
        Object obj = this.OOA6hdeuvCS;
        pp ppVar = p8.WIEu4Ya2g8;
        if (obj == ppVar) {
            o4.jivtDDk9H("`hasNext()` has not been invoked");
            return null;
        }
        this.OOA6hdeuvCS = ppVar;
        if (obj != p8.E7jCp8Ls) {
            return obj;
        }
        Throwable WIEu4Ya2g8 = this.AvO7iQsrTN.WIEu4Ya2g8();
        int i = e51.GWasM1elztuh;
        throw WIEu4Ya2g8;
    }

    public final Object Yi7zF1RB1(wg wgVar) {
        ka kaVar;
        Object obj = this.OOA6hdeuvCS;
        boolean z = true;
        if (obj == p8.WIEu4Ya2g8 || obj == p8.E7jCp8Ls) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n8.rQPn8YBR;
            n8 n8Var = this.AvO7iQsrTN;
            ka kaVar2 = (ka) atomicReferenceFieldUpdater.get(n8Var);
            while (true) {
                n8Var.getClass();
                if (n8Var.WdrkLMV3xh(n8.EljAMC1QTz.get(n8Var), true)) {
                    this.OOA6hdeuvCS = p8.E7jCp8Ls;
                    Throwable iwATDS1i01k = n8Var.iwATDS1i01k();
                    if (iwATDS1i01k != null) {
                        int i = e51.GWasM1elztuh;
                        throw iwATDS1i01k;
                    }
                    z = false;
                } else {
                    long andIncrement = n8.AvO7iQsrTN.getAndIncrement(n8Var);
                    long j = p8.Yi7zF1RB1;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (kaVar2.OOA6hdeuvCS != j2) {
                        kaVar = n8Var.E7jCp8Ls(j2, kaVar2);
                        if (kaVar == null) {
                            continue;
                        }
                    } else {
                        kaVar = kaVar2;
                    }
                    Object MZhzXH72 = n8Var.MZhzXH72(kaVar, i2, andIncrement, null);
                    pp ppVar = p8.XnEVoBF0td1l;
                    if (MZhzXH72 == ppVar) {
                        o4.jivtDDk9H("unreachable");
                        return null;
                    }
                    pp ppVar2 = p8.iwATDS1i01k;
                    if (MZhzXH72 == ppVar2) {
                        if (andIncrement < n8Var.jivtDDk9H()) {
                            kaVar.GWasM1elztuh();
                        }
                        kaVar2 = kaVar;
                    } else {
                        if (MZhzXH72 == p8.uFEq9NpZ) {
                            n8 n8Var2 = this.AvO7iQsrTN;
                            n9 ozMwhSAI = n30.ozMwhSAI(rj0.M3K9sHhK(wgVar));
                            try {
                                this.EljAMC1QTz = ozMwhSAI;
                                Object MZhzXH722 = n8Var2.MZhzXH72(kaVar, i2, andIncrement, this);
                                if (MZhzXH722 == ppVar) {
                                    GWasM1elztuh(kaVar, i2);
                                } else {
                                    if (MZhzXH722 == ppVar2) {
                                        if (andIncrement < n8Var2.jivtDDk9H()) {
                                            kaVar.GWasM1elztuh();
                                        }
                                        ka kaVar3 = (ka) n8.rQPn8YBR.get(n8Var2);
                                        while (true) {
                                            if (n8Var2.WdrkLMV3xh(n8.EljAMC1QTz.get(n8Var2), true)) {
                                                n9 n9Var = this.EljAMC1QTz;
                                                n9Var.getClass();
                                                this.EljAMC1QTz = null;
                                                this.OOA6hdeuvCS = p8.E7jCp8Ls;
                                                Throwable iwATDS1i01k2 = n8Var.iwATDS1i01k();
                                                if (iwATDS1i01k2 == null) {
                                                    n9Var.AvO7iQsrTN(Boolean.FALSE);
                                                } else {
                                                    n9Var.AvO7iQsrTN(new su0(iwATDS1i01k2));
                                                }
                                            } else {
                                                long andIncrement2 = n8.AvO7iQsrTN.getAndIncrement(n8Var2);
                                                long j3 = p8.Yi7zF1RB1;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (kaVar3.OOA6hdeuvCS != j4) {
                                                    ka E7jCp8Ls = n8Var2.E7jCp8Ls(j4, kaVar3);
                                                    if (E7jCp8Ls != null) {
                                                        kaVar3 = E7jCp8Ls;
                                                    }
                                                }
                                                Object MZhzXH723 = n8Var2.MZhzXH72(kaVar3, i3, andIncrement2, this);
                                                if (MZhzXH723 == p8.XnEVoBF0td1l) {
                                                    GWasM1elztuh(kaVar3, i3);
                                                    break;
                                                }
                                                if (MZhzXH723 == p8.iwATDS1i01k) {
                                                    if (andIncrement2 < n8Var2.jivtDDk9H()) {
                                                        kaVar3.GWasM1elztuh();
                                                    }
                                                } else {
                                                    if (MZhzXH723 == p8.uFEq9NpZ) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kaVar3.GWasM1elztuh();
                                                    this.OOA6hdeuvCS = MZhzXH723;
                                                    this.EljAMC1QTz = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kaVar.GWasM1elztuh();
                                        this.OOA6hdeuvCS = MZhzXH722;
                                        this.EljAMC1QTz = null;
                                    }
                                    ozMwhSAI.AEn1Rrio(Boolean.TRUE, null);
                                }
                                return ozMwhSAI.jivtDDk9H();
                            } catch (Throwable th) {
                                ozMwhSAI.EXrPz3p7hFb();
                                throw th;
                            }
                        }
                        kaVar.GWasM1elztuh();
                        this.OOA6hdeuvCS = MZhzXH72;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
