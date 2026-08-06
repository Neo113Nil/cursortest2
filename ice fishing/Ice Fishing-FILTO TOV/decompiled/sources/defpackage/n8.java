package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class n8 implements z9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E7jCp8Ls;
    public static final /* synthetic */ long Mjvvu5DE;
    public static final /* synthetic */ long WIEu4Ya2g8;
    public static final /* synthetic */ AtomicReferenceFieldUpdater XnEVoBF0td1l;
    public static final /* synthetic */ long YmKjaVtbfp5Z;
    public static final /* synthetic */ long iwATDS1i01k;
    public static final /* synthetic */ long mE4lRynR;
    public static final /* synthetic */ AtomicReferenceFieldUpdater rQPn8YBR;
    public static final /* synthetic */ AtomicReferenceFieldUpdater uFEq9NpZ;
    public final int OOA6hdeuvCS;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater EljAMC1QTz = AtomicLongFieldUpdater.newUpdater(n8.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater AvO7iQsrTN = AtomicLongFieldUpdater.newUpdater(n8.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater encWxUiV2 = AtomicLongFieldUpdater.newUpdater(n8.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater mOu10nynGul = AtomicLongFieldUpdater.newUpdater(n8.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater JFJ3QoxA = AtomicReferenceFieldUpdater.newUpdater(n8.class, Object.class, "sendSegment$volatile");

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        mE4lRynR = unsafe.objectFieldOffset(n8.class.getDeclaredField("sendSegment$volatile"));
        rQPn8YBR = AtomicReferenceFieldUpdater.newUpdater(n8.class, Object.class, "receiveSegment$volatile");
        Mjvvu5DE = unsafe.objectFieldOffset(n8.class.getDeclaredField("receiveSegment$volatile"));
        E7jCp8Ls = AtomicReferenceFieldUpdater.newUpdater(n8.class, Object.class, "bufferEndSegment$volatile");
        WIEu4Ya2g8 = unsafe.objectFieldOffset(n8.class.getDeclaredField("bufferEndSegment$volatile"));
        XnEVoBF0td1l = AtomicReferenceFieldUpdater.newUpdater(n8.class, Object.class, "_closeCause$volatile");
        iwATDS1i01k = unsafe.objectFieldOffset(n8.class.getDeclaredField("_closeCause$volatile"));
        uFEq9NpZ = AtomicReferenceFieldUpdater.newUpdater(n8.class, Object.class, "closeHandler$volatile");
        YmKjaVtbfp5Z = unsafe.objectFieldOffset(n8.class.getDeclaredField("closeHandler$volatile"));
    }

    public n8(int i) {
        this.OOA6hdeuvCS = i;
        if (i < 0) {
            o4.OOA6hdeuvCS(mr0.encWxUiV2("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        ka kaVar = p8.GWasM1elztuh;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = encWxUiV2.get(this);
        ka kaVar2 = new ka(0L, null, this, 3);
        this.sendSegment$volatile = kaVar2;
        this.receiveSegment$volatile = kaVar2;
        if (pog2g9KITJA()) {
            kaVar2 = p8.GWasM1elztuh;
            kaVar2.getClass();
        }
        this.bufferEndSegment$volatile = kaVar2;
        this._closeCause$volatile = p8.mE4lRynR;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object AEn1Rrio(n8 n8Var, Object obj, vg vgVar) {
        kc1 kc1Var;
        qh qhVar;
        Object jivtDDk9H;
        qh qhVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JFJ3QoxA;
        atomicReferenceFieldUpdater.getClass();
        ka kaVar = (ka) o9.GWasM1elztuh.getObjectVolatile(n8Var, mE4lRynR);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(n8Var);
            long j = andIncrement & 1152921504606846975L;
            boolean WdrkLMV3xh = n8Var.WdrkLMV3xh(andIncrement, false);
            int i = p8.Yi7zF1RB1;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = kaVar.OOA6hdeuvCS;
            qh qhVar3 = qh.OOA6hdeuvCS;
            kc1Var = kc1.GWasM1elztuh;
            if (j4 != j3) {
                ka uFEq9NpZ2 = n8Var.uFEq9NpZ(j3, kaVar);
                if (uFEq9NpZ2 != null) {
                    kaVar = uFEq9NpZ2;
                } else if (WdrkLMV3xh) {
                    Object k8h8IjolWQ = n8Var.k8h8IjolWQ(vgVar, obj);
                    if (k8h8IjolWQ == qhVar3) {
                        return k8h8IjolWQ;
                    }
                }
            }
            int xqGvceK5x = xqGvceK5x(n8Var, kaVar, i2, obj, j, null, WdrkLMV3xh);
            if (xqGvceK5x == 0) {
                kaVar.GWasM1elztuh();
                return kc1Var;
            }
            if (xqGvceK5x == 1) {
                break;
            }
            if (xqGvceK5x != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = AvO7iQsrTN;
                if (xqGvceK5x == 3) {
                    n9 ozMwhSAI = n30.ozMwhSAI(rj0.M3K9sHhK(vgVar));
                    try {
                        int xqGvceK5x2 = xqGvceK5x(n8Var, kaVar, i2, obj, j, ozMwhSAI, false);
                        if (xqGvceK5x2 != 0) {
                            if (xqGvceK5x2 == 1) {
                                qhVar = qhVar3;
                                ozMwhSAI.AvO7iQsrTN(kc1Var);
                            } else if (xqGvceK5x2 != 2) {
                                if (xqGvceK5x2 == 4) {
                                    qhVar = qhVar3;
                                    if (j < atomicLongFieldUpdater2.get(n8Var)) {
                                        kaVar.GWasM1elztuh();
                                    }
                                } else {
                                    if (xqGvceK5x2 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    kaVar.GWasM1elztuh();
                                    ka kaVar2 = (ka) atomicReferenceFieldUpdater.get(n8Var);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(n8Var);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean WdrkLMV3xh2 = n8Var.WdrkLMV3xh(andIncrement2, false);
                                        int i3 = p8.Yi7zF1RB1;
                                        long j6 = i3;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        qhVar = qhVar3;
                                        if (kaVar2.OOA6hdeuvCS != j7) {
                                            ka uFEq9NpZ3 = n8Var.uFEq9NpZ(j7, kaVar2);
                                            if (uFEq9NpZ3 != null) {
                                                kaVar2 = uFEq9NpZ3;
                                            } else {
                                                if (WdrkLMV3xh2) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                qhVar3 = qhVar;
                                            }
                                        }
                                        int xqGvceK5x3 = xqGvceK5x(n8Var, kaVar2, i4, obj, j5, ozMwhSAI, WdrkLMV3xh2);
                                        if (xqGvceK5x3 == 0) {
                                            kaVar2.GWasM1elztuh();
                                            break;
                                        }
                                        if (xqGvceK5x3 == 1) {
                                            break;
                                        }
                                        if (xqGvceK5x3 != 2) {
                                            if (xqGvceK5x3 == 3) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            if (xqGvceK5x3 != 4) {
                                                if (xqGvceK5x3 == 5) {
                                                    kaVar2.GWasM1elztuh();
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                qhVar3 = qhVar;
                                            } else if (j5 < atomicLongFieldUpdater2.get(n8Var)) {
                                                kaVar2.GWasM1elztuh();
                                            }
                                        } else if (WdrkLMV3xh2) {
                                            kaVar2.XnEVoBF0td1l();
                                        } else {
                                            ozMwhSAI.GWasM1elztuh(kaVar2, i4 + i3);
                                        }
                                    }
                                }
                                Yi7zF1RB1(n8Var, obj, ozMwhSAI);
                            } else {
                                qhVar = qhVar3;
                                ozMwhSAI.GWasM1elztuh(kaVar, i2 + i);
                            }
                            jivtDDk9H = ozMwhSAI.jivtDDk9H();
                            qhVar2 = qhVar;
                            if (jivtDDk9H != qhVar2) {
                                jivtDDk9H = kc1Var;
                            }
                            if (jivtDDk9H != qhVar2) {
                                return jivtDDk9H;
                            }
                        } else {
                            qhVar = qhVar3;
                            kaVar.GWasM1elztuh();
                        }
                        ozMwhSAI.AvO7iQsrTN(kc1Var);
                        jivtDDk9H = ozMwhSAI.jivtDDk9H();
                        qhVar2 = qhVar;
                        if (jivtDDk9H != qhVar2) {
                        }
                        if (jivtDDk9H != qhVar2) {
                            break;
                        }
                    } catch (Throwable th) {
                        ozMwhSAI.EXrPz3p7hFb();
                        throw th;
                    }
                } else if (xqGvceK5x == 4) {
                    if (j < atomicLongFieldUpdater2.get(n8Var)) {
                        kaVar.GWasM1elztuh();
                    }
                    Object k8h8IjolWQ2 = n8Var.k8h8IjolWQ(vgVar, obj);
                    if (k8h8IjolWQ2 == qhVar3) {
                        return k8h8IjolWQ2;
                    }
                } else if (xqGvceK5x == 5) {
                    kaVar.GWasM1elztuh();
                }
            } else if (WdrkLMV3xh) {
                kaVar.XnEVoBF0td1l();
                Object k8h8IjolWQ3 = n8Var.k8h8IjolWQ(vgVar, obj);
                if (k8h8IjolWQ3 == qhVar3) {
                    return k8h8IjolWQ3;
                }
            }
        }
        return kc1Var;
    }

    public static Object EXrPz3p7hFb(n8 n8Var, d71 d71Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = rQPn8YBR;
        atomicReferenceFieldUpdater.getClass();
        if (n8Var == null) {
            o4.YmKjaVtbfp5Z();
            return null;
        }
        ka kaVar = (ka) o9.GWasM1elztuh.getObjectVolatile(n8Var, Mjvvu5DE);
        while (true) {
            n8Var.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
            boolean z = true;
            if (n8Var.WdrkLMV3xh(atomicLongFieldUpdater.get(n8Var), true)) {
                Throwable WIEu4Ya2g82 = n8Var.WIEu4Ya2g8();
                int i = e51.GWasM1elztuh;
                throw WIEu4Ya2g82;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = AvO7iQsrTN;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(n8Var);
            long j = p8.Yi7zF1RB1;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (kaVar.OOA6hdeuvCS != j2) {
                ka E7jCp8Ls2 = n8Var.E7jCp8Ls(j2, kaVar);
                if (E7jCp8Ls2 == null) {
                    continue;
                } else {
                    kaVar = E7jCp8Ls2;
                }
            }
            Object MZhzXH72 = n8Var.MZhzXH72(kaVar, i2, andIncrement, null);
            Object obj = p8.XnEVoBF0td1l;
            if (MZhzXH72 == obj) {
                o4.jivtDDk9H("unexpected");
                return null;
            }
            Object obj2 = p8.iwATDS1i01k;
            if (MZhzXH72 != obj2) {
                if (MZhzXH72 != p8.uFEq9NpZ) {
                    kaVar.GWasM1elztuh();
                    return MZhzXH72;
                }
                n9 ozMwhSAI = n30.ozMwhSAI(rj0.M3K9sHhK(d71Var));
                try {
                    Object MZhzXH722 = n8Var.MZhzXH72(kaVar, i2, andIncrement, ozMwhSAI);
                    if (MZhzXH722 == obj) {
                        ozMwhSAI.GWasM1elztuh(kaVar, i2);
                    } else if (MZhzXH722 == obj2) {
                        if (andIncrement < n8Var.jivtDDk9H()) {
                            kaVar.GWasM1elztuh();
                        }
                        ka kaVar2 = (ka) atomicReferenceFieldUpdater.get(n8Var);
                        while (true) {
                            if (n8Var.WdrkLMV3xh(atomicLongFieldUpdater.get(n8Var), z)) {
                                ozMwhSAI.AvO7iQsrTN(new su0(n8Var.WIEu4Ya2g8()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(n8Var);
                            long j3 = p8.Yi7zF1RB1;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (kaVar2.OOA6hdeuvCS != j4) {
                                ka E7jCp8Ls3 = n8Var.E7jCp8Ls(j4, kaVar2);
                                if (E7jCp8Ls3 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    kaVar2 = E7jCp8Ls3;
                                }
                            }
                            Object MZhzXH723 = n8Var.MZhzXH72(kaVar2, i3, andIncrement2, ozMwhSAI);
                            if (MZhzXH723 == p8.XnEVoBF0td1l) {
                                ozMwhSAI.GWasM1elztuh(kaVar2, i3);
                                break;
                            }
                            if (MZhzXH723 == p8.iwATDS1i01k) {
                                if (andIncrement2 < n8Var.jivtDDk9H()) {
                                    kaVar2.GWasM1elztuh();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (MZhzXH723 == p8.uFEq9NpZ) {
                                    throw new IllegalStateException("unexpected");
                                }
                                kaVar2.GWasM1elztuh();
                                ozMwhSAI.AEn1Rrio(MZhzXH723, null);
                            }
                        }
                    } else {
                        kaVar.GWasM1elztuh();
                        ozMwhSAI.AEn1Rrio(MZhzXH722, null);
                    }
                    return ozMwhSAI.jivtDDk9H();
                } catch (Throwable th) {
                    ozMwhSAI.EXrPz3p7hFb();
                    throw th;
                }
            }
            if (andIncrement < n8Var.jivtDDk9H()) {
                kaVar.GWasM1elztuh();
            }
        }
    }

    public static final void Yi7zF1RB1(n8 n8Var, Object obj, n9 n9Var) {
        n9Var.AvO7iQsrTN(new su0(n8Var.Mjvvu5DE()));
    }

    public static void cilMamHF(n8 n8Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = mOu10nynGul;
        if ((atomicLongFieldUpdater.addAndGet(n8Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(n8Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean eUH21U3apd(Object obj) {
        if (!(obj instanceof l9)) {
            o4.EljAMC1QTz(obj, "Unexpected waiter: ");
            return false;
        }
        l9 l9Var = (l9) obj;
        ka kaVar = p8.GWasM1elztuh;
        pp JFJ3QoxA2 = l9Var.JFJ3QoxA(kc1.GWasM1elztuh, null);
        if (JFJ3QoxA2 == null) {
            return false;
        }
        l9Var.WRKkgoJXwDn(JFJ3QoxA2);
        return true;
    }

    public static final int xqGvceK5x(n8 n8Var, ka kaVar, int i, Object obj, long j, Object obj2, boolean z) {
        kaVar.Mjvvu5DE(i, obj);
        if (z) {
            return n8Var.DmJncFq5(kaVar, i, obj, j, obj2, z);
        }
        Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
        if (WIEu4Ya2g82 == null) {
            if (n8Var.OOA6hdeuvCS(j)) {
                if (kaVar.iwATDS1i01k(i, null, p8.xqGvceK5x)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kaVar.iwATDS1i01k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (WIEu4Ya2g82 instanceof if1) {
            kaVar.Mjvvu5DE(i, null);
            if (n8Var.YZjbz8VdP5(WIEu4Ya2g82, obj)) {
                kaVar.mE4lRynR(i, p8.mOu10nynGul);
                return 0;
            }
            pp ppVar = p8.rQPn8YBR;
            if (kaVar.encWxUiV2.getAndSet((i * 2) + 1, ppVar) == ppVar) {
                return 5;
            }
            kaVar.YmKjaVtbfp5Z(i, true);
            return 5;
        }
        return n8Var.DmJncFq5(kaVar, i, obj, j, obj2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A1EKNP6CxJ(Object obj) {
        ka kaVar;
        int i;
        n8 n8Var;
        op opVar = p8.xqGvceK5x;
        JFJ3QoxA.getClass();
        ka kaVar2 = (ka) o9.GWasM1elztuh.getObjectVolatile(this, mE4lRynR);
        while (true) {
            long andIncrement = EljAMC1QTz.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean WdrkLMV3xh = this.WdrkLMV3xh(andIncrement, false);
            int i2 = p8.Yi7zF1RB1;
            long j2 = i2;
            long j3 = j / j2;
            int i3 = (int) (j % j2);
            if (kaVar2.OOA6hdeuvCS != j3) {
                kaVar = this.uFEq9NpZ(j3, kaVar2);
                if (kaVar != null) {
                    n8Var = this;
                    i = i3;
                } else if (WdrkLMV3xh) {
                    return new ia(this.Mjvvu5DE());
                }
            } else {
                kaVar = kaVar2;
                i = i3;
                n8Var = this;
            }
            Object obj2 = obj;
            int xqGvceK5x = xqGvceK5x(n8Var, kaVar, i, obj2, j, opVar, WdrkLMV3xh);
            n8 n8Var2 = n8Var;
            kaVar2 = kaVar;
            kc1 kc1Var = kc1.GWasM1elztuh;
            if (xqGvceK5x == 0) {
                kaVar2.GWasM1elztuh();
                return kc1Var;
            }
            if (xqGvceK5x == 1) {
                break;
            }
            if (xqGvceK5x != 2) {
                if (xqGvceK5x == 3) {
                    o4.jivtDDk9H("unexpected");
                    return null;
                }
                if (xqGvceK5x == 4) {
                    if (j < AvO7iQsrTN.get(n8Var2)) {
                        kaVar2.GWasM1elztuh();
                    }
                    return new ia(n8Var2.Mjvvu5DE());
                }
                if (xqGvceK5x == 5) {
                    kaVar2.GWasM1elztuh();
                }
                this = n8Var2;
                obj = obj2;
            } else {
                if (WdrkLMV3xh) {
                    kaVar2.XnEVoBF0td1l();
                    return new ia(n8Var2.Mjvvu5DE());
                }
                if1 if1Var = opVar instanceof if1 ? (if1) opVar : null;
                if (if1Var != null) {
                    if1Var.GWasM1elztuh(kaVar2, i + i2);
                }
                n8Var2.mOu10nynGul((kaVar2.OOA6hdeuvCS * j2) + i);
            }
        }
    }

    public final boolean AvO7iQsrTN(Throwable th, boolean z) {
        n8 n8Var;
        boolean z2;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                ka kaVar = p8.GWasM1elztuh;
                n8Var = this;
                if (atomicLongFieldUpdater.compareAndSet(n8Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = n8Var;
            }
        }
        n8Var = this;
        pp ppVar = p8.mE4lRynR;
        while (true) {
            XnEVoBF0td1l.getClass();
            n8 n8Var2 = n8Var;
            Unsafe unsafe = o9.GWasM1elztuh;
            long j5 = iwATDS1i01k;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(n8Var2, j5, ppVar, th2);
            n8Var = n8Var2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(n8Var, j5) != ppVar) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(n8Var);
            } while (!atomicLongFieldUpdater.compareAndSet(n8Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(n8Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(n8Var, j, j2));
        }
        n8Var.WRKkgoJXwDn();
        if (z2) {
            n8Var.lv06NcmrQ();
        }
        return z2;
    }

    public final int DmJncFq5(ka kaVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
            if (WIEu4Ya2g82 == null) {
                if (!OOA6hdeuvCS(j) || z) {
                    if (z) {
                        if (kaVar.iwATDS1i01k(i, null, p8.JFJ3QoxA)) {
                            kaVar.XnEVoBF0td1l();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kaVar.iwATDS1i01k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kaVar.iwATDS1i01k(i, null, p8.xqGvceK5x)) {
                    break;
                }
            } else {
                if (WIEu4Ya2g82 != p8.OOA6hdeuvCS) {
                    pp ppVar = p8.rQPn8YBR;
                    if (WIEu4Ya2g82 == ppVar) {
                        kaVar.Mjvvu5DE(i, null);
                        return 5;
                    }
                    if (WIEu4Ya2g82 == p8.encWxUiV2) {
                        kaVar.Mjvvu5DE(i, null);
                        return 5;
                    }
                    if (WIEu4Ya2g82 == p8.E7jCp8Ls) {
                        kaVar.Mjvvu5DE(i, null);
                        WRKkgoJXwDn();
                        return 4;
                    }
                    kaVar.Mjvvu5DE(i, null);
                    if (WIEu4Ya2g82 instanceof jf1) {
                        WIEu4Ya2g82 = ((jf1) WIEu4Ya2g82).GWasM1elztuh;
                    }
                    if (YZjbz8VdP5(WIEu4Ya2g82, obj)) {
                        kaVar.mE4lRynR(i, p8.mOu10nynGul);
                        return 0;
                    }
                    if (kaVar.encWxUiV2.getAndSet((i * 2) + 1, ppVar) != ppVar) {
                        kaVar.YmKjaVtbfp5Z(i, true);
                    }
                    return 5;
                }
                if (kaVar.iwATDS1i01k(i, WIEu4Ya2g82, p8.xqGvceK5x)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.JFJ3QoxA() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.encWxUiV2();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ka E7jCp8Ls(long j, ka kaVar) {
        Object Y6hRI1cF8;
        ka kaVar2;
        long j2;
        Unsafe unsafe;
        ka kaVar3 = p8.GWasM1elztuh;
        o8 o8Var = o8.E7jCp8Ls;
        loop0: while (true) {
            Y6hRI1cF8 = rj0.Y6hRI1cF8(kaVar, j, o8Var);
            if (!o50.pog2g9KITJA(Y6hRI1cF8)) {
                wz0 lv06NcmrQ = o50.lv06NcmrQ(Y6hRI1cF8);
                while (true) {
                    rQPn8YBR.getClass();
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    long j3 = Mjvvu5DE;
                    wz0 wz0Var = (wz0) unsafe2.getObjectVolatile(this, j3);
                    if (wz0Var.OOA6hdeuvCS >= lv06NcmrQ.OOA6hdeuvCS) {
                        break loop0;
                    }
                    if (!lv06NcmrQ.uFEq9NpZ()) {
                        break;
                    }
                    do {
                        unsafe = o9.GWasM1elztuh;
                        if (unsafe.compareAndSwapObject(this, Mjvvu5DE, wz0Var, lv06NcmrQ)) {
                            if (wz0Var.JFJ3QoxA()) {
                                wz0Var.encWxUiV2();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == wz0Var);
                    if (lv06NcmrQ.JFJ3QoxA()) {
                        lv06NcmrQ.encWxUiV2();
                    }
                }
            } else {
                break;
            }
        }
        if (o50.pog2g9KITJA(Y6hRI1cF8)) {
            WRKkgoJXwDn();
            if (kaVar.OOA6hdeuvCS * p8.Yi7zF1RB1 < jivtDDk9H()) {
                kaVar.GWasM1elztuh();
                return null;
            }
        } else {
            ka kaVar4 = (ka) o50.lv06NcmrQ(Y6hRI1cF8);
            long j4 = kaVar4.OOA6hdeuvCS;
            if (!pog2g9KITJA() && j <= encWxUiV2.get(this) / p8.Yi7zF1RB1) {
                while (true) {
                    E7jCp8Ls.getClass();
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    long j5 = WIEu4Ya2g8;
                    wz0 wz0Var2 = (wz0) unsafe3.getObjectVolatile(this, j5);
                    if (wz0Var2.OOA6hdeuvCS >= j4 || !kaVar4.uFEq9NpZ()) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = o9.GWasM1elztuh;
                        kaVar2 = kaVar4;
                        if (unsafe4.compareAndSwapObject(this, WIEu4Ya2g8, wz0Var2, kaVar4)) {
                            if (wz0Var2.JFJ3QoxA()) {
                                wz0Var2.encWxUiV2();
                            }
                        } else {
                            if (unsafe4.getObjectVolatile(this, j5) != wz0Var2) {
                                break;
                            }
                            kaVar4 = kaVar2;
                        }
                    }
                    kaVar4 = kaVar2;
                }
                if (j4 > j) {
                    return kaVar2;
                }
                long j6 = j4 * p8.Yi7zF1RB1;
                do {
                    j2 = AvO7iQsrTN.get(this);
                    if (j2 >= j6) {
                        break;
                    }
                } while (!AvO7iQsrTN.compareAndSet(this, j2, j6));
                if (j4 * p8.Yi7zF1RB1 < jivtDDk9H()) {
                    kaVar2.GWasM1elztuh();
                }
            }
            kaVar2 = kaVar4;
            if (j4 > j) {
            }
        }
        return null;
    }

    public final ka EljAMC1QTz() {
        E7jCp8Ls.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        Object objectVolatile = unsafe.getObjectVolatile(this, WIEu4Ya2g8);
        JFJ3QoxA.getClass();
        ka kaVar = (ka) unsafe.getObjectVolatile(this, mE4lRynR);
        if (kaVar.OOA6hdeuvCS > ((ka) objectVolatile).OOA6hdeuvCS) {
            objectVolatile = kaVar;
        }
        rQPn8YBR.getClass();
        ka kaVar2 = (ka) unsafe.getObjectVolatile(this, Mjvvu5DE);
        if (kaVar2.OOA6hdeuvCS > ((ka) objectVolatile).OOA6hdeuvCS) {
            objectVolatile = kaVar2;
        }
        pf pfVar = (pf) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pf.GWasM1elztuh;
            Object xqGvceK5x = pfVar.xqGvceK5x();
            if (xqGvceK5x == rj0.OOA6hdeuvCS) {
                break;
            }
            pf pfVar2 = (pf) xqGvceK5x;
            if (pfVar2 != null) {
                pfVar = pfVar2;
            } else if (pfVar.AvO7iQsrTN()) {
                break;
            }
        }
        return (ka) pfVar;
    }

    @Override // defpackage.z9
    public final void GWasM1elztuh(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        AvO7iQsrTN(cancellationException, true);
    }

    public final void HFYAaqMd6(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        n8 n8Var = this;
        if (n8Var.pog2g9KITJA()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = encWxUiV2;
            if (atomicLongFieldUpdater.get(n8Var) > j) {
                break;
            } else {
                n8Var = this;
            }
        }
        int i = p8.X1lG3V04pd;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = mOu10nynGul;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(n8Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(n8Var)) && j2 == atomicLongFieldUpdater.get(n8Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(n8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(n8Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        n8Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(n8Var);
                    long j5 = atomicLongFieldUpdater2.get(n8Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(n8Var)) {
                        break;
                    }
                    if (z) {
                        n8Var = this;
                    } else {
                        n8Var = this;
                        atomicLongFieldUpdater2.compareAndSet(n8Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(n8Var);
                    if (atomicLongFieldUpdater2.compareAndSet(n8Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        n8Var = this;
                    }
                }
            }
        }
    }

    public final void JFJ3QoxA() {
        n8 n8Var;
        if (pog2g9KITJA()) {
            return;
        }
        E7jCp8Ls.getClass();
        ka kaVar = (ka) o9.GWasM1elztuh.getObjectVolatile(this, WIEu4Ya2g8);
        loop0: while (true) {
            long andIncrement = encWxUiV2.getAndIncrement(this);
            long j = p8.Yi7zF1RB1;
            long j2 = andIncrement / j;
            if (this.jivtDDk9H() <= andIncrement) {
                if (kaVar.OOA6hdeuvCS < j2 && kaVar.X1lG3V04pd() != null) {
                    this.M3K9sHhK(j2, kaVar);
                }
                cilMamHF(this);
                return;
            }
            n8Var = this;
            if (kaVar.OOA6hdeuvCS != j2) {
                ka rQPn8YBR2 = n8Var.rQPn8YBR(j2, kaVar, andIncrement);
                if (rQPn8YBR2 == null) {
                    continue;
                    this = n8Var;
                } else {
                    kaVar = rQPn8YBR2;
                }
            }
            int i = (int) (andIncrement % j);
            Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
            boolean z = WIEu4Ya2g82 instanceof if1;
            AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
            if (!z || andIncrement < atomicLongFieldUpdater.get(n8Var) || !kaVar.iwATDS1i01k(i, WIEu4Ya2g82, p8.AvO7iQsrTN)) {
                while (true) {
                    Object WIEu4Ya2g83 = kaVar.WIEu4Ya2g8(i);
                    if (!(WIEu4Ya2g83 instanceof if1)) {
                        if (WIEu4Ya2g83 != p8.JFJ3QoxA) {
                            if (WIEu4Ya2g83 != null) {
                                if (WIEu4Ya2g83 == p8.xqGvceK5x || WIEu4Ya2g83 == p8.encWxUiV2 || WIEu4Ya2g83 == p8.mOu10nynGul || WIEu4Ya2g83 == p8.rQPn8YBR || WIEu4Ya2g83 == p8.E7jCp8Ls) {
                                    break loop0;
                                } else if (WIEu4Ya2g83 != p8.EljAMC1QTz) {
                                    o4.EljAMC1QTz(WIEu4Ya2g83, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, p8.OOA6hdeuvCS)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(n8Var)) {
                        if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, new jf1((if1) WIEu4Ya2g83))) {
                            break loop0;
                        }
                    } else if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, p8.AvO7iQsrTN)) {
                        if (eUH21U3apd(WIEu4Ya2g83)) {
                            kaVar.mE4lRynR(i, p8.xqGvceK5x);
                            break;
                        } else {
                            kaVar.mE4lRynR(i, p8.JFJ3QoxA);
                            kaVar.XnEVoBF0td1l();
                        }
                    }
                }
                cilMamHF(n8Var);
            } else if (eUH21U3apd(WIEu4Ya2g82)) {
                kaVar.mE4lRynR(i, p8.xqGvceK5x);
                break;
            } else {
                kaVar.mE4lRynR(i, p8.JFJ3QoxA);
                kaVar.XnEVoBF0td1l();
                cilMamHF(n8Var);
            }
            this = n8Var;
        }
        cilMamHF(n8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.JFJ3QoxA() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.encWxUiV2();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M3K9sHhK(long j, ka kaVar) {
        n8 n8Var;
        ka kaVar2;
        ka kaVar3;
        while (kaVar.OOA6hdeuvCS < j && (kaVar3 = (ka) kaVar.X1lG3V04pd()) != null) {
            kaVar = kaVar3;
        }
        while (true) {
            ka kaVar4 = kaVar;
            while (kaVar4.EljAMC1QTz() && (kaVar2 = (ka) kaVar4.X1lG3V04pd()) != null) {
                kaVar4 = kaVar2;
            }
            while (true) {
                E7jCp8Ls.getClass();
                Unsafe unsafe = o9.GWasM1elztuh;
                long j2 = WIEu4Ya2g8;
                wz0 wz0Var = (wz0) unsafe.getObjectVolatile(this, j2);
                if (wz0Var.OOA6hdeuvCS >= kaVar4.OOA6hdeuvCS) {
                    return;
                }
                if (!kaVar4.uFEq9NpZ()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    n8Var = this;
                    if (unsafe2.compareAndSwapObject(n8Var, WIEu4Ya2g8, wz0Var, kaVar4)) {
                        if (wz0Var.JFJ3QoxA()) {
                            wz0Var.encWxUiV2();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(n8Var, j2) != wz0Var) {
                        break;
                    } else {
                        this = n8Var;
                    }
                }
                this = n8Var;
            }
            kaVar = kaVar4;
        }
    }

    public final Object MZhzXH72(ka kaVar, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kaVar.encWxUiV2;
        Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
        if (WIEu4Ya2g82 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return p8.uFEq9NpZ;
                }
                if (kaVar.iwATDS1i01k(i, WIEu4Ya2g82, obj)) {
                    JFJ3QoxA();
                    return p8.XnEVoBF0td1l;
                }
            }
        } else if (WIEu4Ya2g82 == p8.xqGvceK5x && kaVar.iwATDS1i01k(i, WIEu4Ya2g82, p8.mOu10nynGul)) {
            JFJ3QoxA();
            Object obj2 = atomicReferenceArray.get(i * 2);
            kaVar.Mjvvu5DE(i, null);
            return obj2;
        }
        while (true) {
            Object WIEu4Ya2g83 = kaVar.WIEu4Ya2g8(i);
            if (WIEu4Ya2g83 == null || WIEu4Ya2g83 == p8.OOA6hdeuvCS) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, p8.encWxUiV2)) {
                        JFJ3QoxA();
                        return p8.iwATDS1i01k;
                    }
                } else {
                    if (obj == null) {
                        return p8.uFEq9NpZ;
                    }
                    if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, obj)) {
                        JFJ3QoxA();
                        return p8.XnEVoBF0td1l;
                    }
                }
            } else if (WIEu4Ya2g83 != p8.xqGvceK5x) {
                pp ppVar = p8.JFJ3QoxA;
                if (WIEu4Ya2g83 == ppVar) {
                    return p8.iwATDS1i01k;
                }
                if (WIEu4Ya2g83 == p8.encWxUiV2) {
                    return p8.iwATDS1i01k;
                }
                if (WIEu4Ya2g83 == p8.E7jCp8Ls) {
                    JFJ3QoxA();
                    return p8.iwATDS1i01k;
                }
                if (WIEu4Ya2g83 != p8.AvO7iQsrTN && kaVar.iwATDS1i01k(i, WIEu4Ya2g83, p8.EljAMC1QTz)) {
                    boolean z = WIEu4Ya2g83 instanceof jf1;
                    if (z) {
                        WIEu4Ya2g83 = ((jf1) WIEu4Ya2g83).GWasM1elztuh;
                    }
                    if (eUH21U3apd(WIEu4Ya2g83)) {
                        kaVar.mE4lRynR(i, p8.mOu10nynGul);
                        JFJ3QoxA();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        kaVar.Mjvvu5DE(i, null);
                        return obj3;
                    }
                    kaVar.mE4lRynR(i, ppVar);
                    kaVar.XnEVoBF0td1l();
                    if (z) {
                        JFJ3QoxA();
                    }
                    return p8.iwATDS1i01k;
                }
            } else if (kaVar.iwATDS1i01k(i, WIEu4Ya2g83, p8.mOu10nynGul)) {
                JFJ3QoxA();
                Object obj4 = atomicReferenceArray.get(i * 2);
                kaVar.Mjvvu5DE(i, null);
                return obj4;
            }
        }
    }

    public final Throwable Mjvvu5DE() {
        Throwable iwATDS1i01k2 = iwATDS1i01k();
        return iwATDS1i01k2 == null ? new jb("Channel was closed") : iwATDS1i01k2;
    }

    public final boolean OOA6hdeuvCS(long j) {
        return j < encWxUiV2.get(this) || j < AvO7iQsrTN.get(this) + ((long) this.OOA6hdeuvCS);
    }

    public final Throwable WIEu4Ya2g8() {
        Throwable iwATDS1i01k2 = iwATDS1i01k();
        return iwATDS1i01k2 == null ? new ib("Channel was closed") : iwATDS1i01k2;
    }

    public final boolean WRKkgoJXwDn() {
        return WdrkLMV3xh(EljAMC1QTz.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.ka) r10.OOA6hdeuvCS();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WdrkLMV3xh(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            if (i == 2) {
                encWxUiV2(j & 1152921504606846975L);
                if (!z || !Y6hRI1cF8()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(mr0.AvO7iQsrTN("unexpected close status: ", i).toString());
                }
                ka encWxUiV22 = encWxUiV2(j & 1152921504606846975L);
                Object obj = null;
                loop0: do {
                    int i2 = p8.Yi7zF1RB1 - 1;
                    while (true) {
                        if (-1 >= i2) {
                            break;
                        }
                        long j2 = (encWxUiV22.OOA6hdeuvCS * p8.Yi7zF1RB1) + i2;
                        while (true) {
                            Object WIEu4Ya2g82 = encWxUiV22.WIEu4Ya2g8(i2);
                            if (WIEu4Ya2g82 == p8.mOu10nynGul) {
                                break loop0;
                            }
                            pp ppVar = p8.xqGvceK5x;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
                            if (WIEu4Ya2g82 == ppVar) {
                                if (j2 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (encWxUiV22.iwATDS1i01k(i2, WIEu4Ya2g82, p8.E7jCp8Ls)) {
                                    encWxUiV22.Mjvvu5DE(i2, null);
                                    encWxUiV22.XnEVoBF0td1l();
                                    break;
                                }
                            } else if (WIEu4Ya2g82 != p8.OOA6hdeuvCS && WIEu4Ya2g82 != null) {
                                if (!(WIEu4Ya2g82 instanceof if1) && !(WIEu4Ya2g82 instanceof jf1)) {
                                    pp ppVar2 = p8.AvO7iQsrTN;
                                    if (WIEu4Ya2g82 == ppVar2 || WIEu4Ya2g82 == p8.EljAMC1QTz) {
                                        break loop0;
                                    }
                                    if (WIEu4Ya2g82 != ppVar2) {
                                        break;
                                    }
                                } else {
                                    if (j2 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if1 if1Var = WIEu4Ya2g82 instanceof jf1 ? ((jf1) WIEu4Ya2g82).GWasM1elztuh : (if1) WIEu4Ya2g82;
                                    if (encWxUiV22.iwATDS1i01k(i2, WIEu4Ya2g82, p8.E7jCp8Ls)) {
                                        obj = p.Mjvvu5DE(obj, if1Var);
                                        encWxUiV22.Mjvvu5DE(i2, null);
                                        encWxUiV22.XnEVoBF0td1l();
                                        break;
                                    }
                                }
                            } else if (encWxUiV22.iwATDS1i01k(i2, WIEu4Ya2g82, p8.E7jCp8Ls)) {
                                encWxUiV22.XnEVoBF0td1l();
                                break;
                            }
                        }
                        i2--;
                    }
                } while (encWxUiV22 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            ozMwhSAI((if1) arrayList.get(size), false);
                        }
                    } else {
                        ozMwhSAI((if1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.t01
    public Object X1lG3V04pd(vg vgVar, Object obj) {
        return AEn1Rrio(this, obj, vgVar);
    }

    @Override // defpackage.z9
    public final Object XnEVoBF0td1l(d71 d71Var) {
        return EXrPz3p7hFb(this, d71Var);
    }

    public final boolean Y6hRI1cF8() {
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = Mjvvu5DE;
            ka kaVar = (ka) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
            long j2 = atomicLongFieldUpdater.get(this);
            if (jivtDDk9H() <= j2) {
                return false;
            }
            long j3 = p8.Yi7zF1RB1;
            long j4 = j2 / j3;
            if (kaVar.OOA6hdeuvCS == j4 || (kaVar = E7jCp8Ls(j4, kaVar)) != null) {
                kaVar.GWasM1elztuh();
                int i = (int) (j2 % j3);
                while (true) {
                    Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
                    if (WIEu4Ya2g82 == null || WIEu4Ya2g82 == p8.OOA6hdeuvCS) {
                        if (kaVar.iwATDS1i01k(i, WIEu4Ya2g82, p8.encWxUiV2)) {
                            JFJ3QoxA();
                            break;
                        }
                    } else {
                        if (WIEu4Ya2g82 == p8.xqGvceK5x) {
                            return true;
                        }
                        if (WIEu4Ya2g82 != p8.JFJ3QoxA && WIEu4Ya2g82 != p8.E7jCp8Ls && WIEu4Ya2g82 != p8.mOu10nynGul && WIEu4Ya2g82 != p8.encWxUiV2) {
                            if (WIEu4Ya2g82 == p8.AvO7iQsrTN) {
                                return true;
                            }
                            if (WIEu4Ya2g82 != p8.EljAMC1QTz && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                AvO7iQsrTN.compareAndSet(this, j2, j2 + 1);
            } else if (((ka) unsafe.getObjectVolatile(this, j)).OOA6hdeuvCS < j4) {
                return false;
            }
        }
    }

    public final boolean YZjbz8VdP5(Object obj, Object obj2) {
        if (!(obj instanceof m8)) {
            if (!(obj instanceof l9)) {
                o4.EljAMC1QTz(obj, "Unexpected receiver type: ");
                return false;
            }
            l9 l9Var = (l9) obj;
            ka kaVar = p8.GWasM1elztuh;
            pp JFJ3QoxA2 = l9Var.JFJ3QoxA(obj2, null);
            if (JFJ3QoxA2 == null) {
                return false;
            }
            l9Var.WRKkgoJXwDn(JFJ3QoxA2);
            return true;
        }
        m8 m8Var = (m8) obj;
        n9 n9Var = m8Var.EljAMC1QTz;
        n9Var.getClass();
        m8Var.EljAMC1QTz = null;
        m8Var.OOA6hdeuvCS = obj2;
        Boolean bool = Boolean.TRUE;
        m8Var.AvO7iQsrTN.getClass();
        ka kaVar2 = p8.GWasM1elztuh;
        pp JFJ3QoxA3 = n9Var.JFJ3QoxA(bool, null);
        if (JFJ3QoxA3 == null) {
            return false;
        }
        n9Var.WRKkgoJXwDn(JFJ3QoxA3);
        return true;
    }

    @Override // defpackage.z9
    public final Object YmKjaVtbfp5Z() {
        ka kaVar;
        ja jaVar = vc0.Yi7zF1RB1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = EljAMC1QTz;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (WdrkLMV3xh(j2, true)) {
            return new ia(iwATDS1i01k());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return jaVar;
        }
        Object obj = p8.rQPn8YBR;
        rQPn8YBR.getClass();
        ka kaVar2 = (ka) o9.GWasM1elztuh.getObjectVolatile(this, Mjvvu5DE);
        while (!this.WdrkLMV3xh(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = p8.Yi7zF1RB1;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (kaVar2.OOA6hdeuvCS != j4) {
                ka E7jCp8Ls2 = this.E7jCp8Ls(j4, kaVar2);
                if (E7jCp8Ls2 == null) {
                    continue;
                } else {
                    kaVar = E7jCp8Ls2;
                }
            } else {
                kaVar = kaVar2;
            }
            n8 n8Var = this;
            Object MZhzXH72 = n8Var.MZhzXH72(kaVar, i, andIncrement, obj);
            kaVar2 = kaVar;
            if (MZhzXH72 == p8.XnEVoBF0td1l) {
                if1 if1Var = obj instanceof if1 ? (if1) obj : null;
                if (if1Var != null) {
                    if1Var.GWasM1elztuh(kaVar2, i);
                }
                n8Var.HFYAaqMd6(andIncrement);
                kaVar2.XnEVoBF0td1l();
                return jaVar;
            }
            if (MZhzXH72 != p8.iwATDS1i01k) {
                if (MZhzXH72 != p8.uFEq9NpZ) {
                    kaVar2.GWasM1elztuh();
                    return MZhzXH72;
                }
                o4.jivtDDk9H("unexpected");
                return null;
            }
            if (andIncrement < n8Var.jivtDDk9H()) {
                kaVar2.GWasM1elztuh();
            }
            this = n8Var;
        }
        return new ia(this.iwATDS1i01k());
    }

    public boolean arNh8D4Z5gB() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.ka) r1.OOA6hdeuvCS();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ka encWxUiV2(long j) {
        long j2;
        ka EljAMC1QTz2 = EljAMC1QTz();
        if (arNh8D4Z5gB()) {
            ka kaVar = EljAMC1QTz2;
            loop0: do {
                int i = p8.Yi7zF1RB1 - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (kaVar.OOA6hdeuvCS * p8.Yi7zF1RB1) + i;
                    if (j2 < AvO7iQsrTN.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i);
                        if (WIEu4Ya2g82 != null && WIEu4Ya2g82 != p8.OOA6hdeuvCS) {
                            if (WIEu4Ya2g82 == p8.xqGvceK5x) {
                                break loop0;
                            }
                        } else {
                            if (kaVar.iwATDS1i01k(i, WIEu4Ya2g82, p8.E7jCp8Ls)) {
                                kaVar.XnEVoBF0td1l();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (kaVar != null);
            j2 = -1;
            if (j2 != -1) {
                mOu10nynGul(j2);
            }
        }
        Object obj = null;
        loop3: for (ka kaVar2 = EljAMC1QTz2; kaVar2 != null; kaVar2 = (ka) kaVar2.OOA6hdeuvCS()) {
            for (int i2 = p8.Yi7zF1RB1 - 1; -1 < i2; i2--) {
                if ((kaVar2.OOA6hdeuvCS * p8.Yi7zF1RB1) + i2 < j) {
                    break loop3;
                }
                while (true) {
                    Object WIEu4Ya2g83 = kaVar2.WIEu4Ya2g8(i2);
                    if (WIEu4Ya2g83 != null && WIEu4Ya2g83 != p8.OOA6hdeuvCS) {
                        if (!(WIEu4Ya2g83 instanceof jf1)) {
                            if (!(WIEu4Ya2g83 instanceof if1)) {
                                break;
                            }
                            if (kaVar2.iwATDS1i01k(i2, WIEu4Ya2g83, p8.E7jCp8Ls)) {
                                obj = p.Mjvvu5DE(obj, WIEu4Ya2g83);
                                kaVar2.YmKjaVtbfp5Z(i2, true);
                                break;
                            }
                        } else {
                            if (kaVar2.iwATDS1i01k(i2, WIEu4Ya2g83, p8.E7jCp8Ls)) {
                                obj = p.Mjvvu5DE(obj, ((jf1) WIEu4Ya2g83).GWasM1elztuh);
                                kaVar2.YmKjaVtbfp5Z(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (kaVar2.iwATDS1i01k(i2, WIEu4Ya2g83, p8.E7jCp8Ls)) {
                            kaVar2.XnEVoBF0td1l();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ozMwhSAI((if1) obj, true);
                return EljAMC1QTz2;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ozMwhSAI((if1) arrayList.get(size), true);
            }
        }
        return EljAMC1QTz2;
    }

    @Override // defpackage.z9
    public final m8 iterator() {
        return new m8(this);
    }

    public final Throwable iwATDS1i01k() {
        XnEVoBF0td1l.getClass();
        return (Throwable) o9.GWasM1elztuh.getObjectVolatile(this, iwATDS1i01k);
    }

    public final long jivtDDk9H() {
        return EljAMC1QTz.get(this) & 1152921504606846975L;
    }

    public final Object k8h8IjolWQ(vg vgVar, Object obj) {
        n9 n9Var = new n9(1, rj0.M3K9sHhK(vgVar));
        n9Var.cilMamHF();
        n9Var.AvO7iQsrTN(new su0(Mjvvu5DE()));
        Object jivtDDk9H = n9Var.jivtDDk9H();
        return jivtDDk9H == qh.OOA6hdeuvCS ? jivtDDk9H : kc1.GWasM1elztuh;
    }

    public final void lv06NcmrQ() {
        Object objectVolatile;
        n8 n8Var;
        loop0: while (true) {
            uFEq9NpZ.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = YmKjaVtbfp5Z;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            pp ppVar = objectVolatile == null ? p8.YmKjaVtbfp5Z : p8.Mjvvu5DE;
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                n8Var = this;
                if (unsafe2.compareAndSwapObject(n8Var, YmKjaVtbfp5Z, objectVolatile, ppVar)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(n8Var, j) != objectVolatile) {
                    break;
                } else {
                    this = n8Var;
                }
            }
            this = n8Var;
        }
        if (objectVolatile == null) {
            return;
        }
        fb1.XnEVoBF0td1l(1, objectVolatile);
        ((hv) objectVolatile).mOu10nynGul(n8Var.iwATDS1i01k());
    }

    @Override // defpackage.t01
    public Object mE4lRynR(Object obj) {
        ja jaVar = vc0.Yi7zF1RB1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = EljAMC1QTz;
        boolean z = false;
        long j = 1152921504606846975L;
        if (WdrkLMV3xh(atomicLongFieldUpdater.get(this), false) ? false : !OOA6hdeuvCS(r1 & 1152921504606846975L)) {
            return jaVar;
        }
        op opVar = p8.JFJ3QoxA;
        JFJ3QoxA.getClass();
        ka kaVar = (ka) o9.GWasM1elztuh.getObjectVolatile(this, mE4lRynR);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean WdrkLMV3xh = WdrkLMV3xh(andIncrement, z);
            int i = p8.Yi7zF1RB1;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (kaVar.OOA6hdeuvCS != j4) {
                ka uFEq9NpZ2 = uFEq9NpZ(j4, kaVar);
                if (uFEq9NpZ2 != null) {
                    kaVar = uFEq9NpZ2;
                } else {
                    if (WdrkLMV3xh) {
                        return new ia(Mjvvu5DE());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int xqGvceK5x = xqGvceK5x(this, kaVar, i2, obj, j2, opVar, WdrkLMV3xh);
            kc1 kc1Var = kc1.GWasM1elztuh;
            if (xqGvceK5x == 0) {
                kaVar.GWasM1elztuh();
                return kc1Var;
            }
            if (xqGvceK5x == 1) {
                return kc1Var;
            }
            if (xqGvceK5x == 2) {
                if (WdrkLMV3xh) {
                    kaVar.XnEVoBF0td1l();
                    return new ia(Mjvvu5DE());
                }
                if1 if1Var = opVar instanceof if1 ? (if1) opVar : null;
                if (if1Var != null) {
                    if1Var.GWasM1elztuh(kaVar, i2 + i);
                }
                kaVar.XnEVoBF0td1l();
                return jaVar;
            }
            if (xqGvceK5x == 3) {
                o4.jivtDDk9H("unexpected");
                return null;
            }
            if (xqGvceK5x == 4) {
                if (j2 < AvO7iQsrTN.get(this)) {
                    kaVar.GWasM1elztuh();
                }
                return new ia(Mjvvu5DE());
            }
            if (xqGvceK5x == 5) {
                kaVar.GWasM1elztuh();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public final void mOu10nynGul(long j) {
        rQPn8YBR.getClass();
        ka kaVar = (ka) o9.GWasM1elztuh.getObjectVolatile(this, Mjvvu5DE);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.OOA6hdeuvCS + j2, encWxUiV2.get(this))) {
                return;
            }
            n8 n8Var = this;
            if (atomicLongFieldUpdater.compareAndSet(n8Var, j2, 1 + j2)) {
                long j3 = p8.Yi7zF1RB1;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (kaVar.OOA6hdeuvCS != j4) {
                    ka E7jCp8Ls2 = n8Var.E7jCp8Ls(j4, kaVar);
                    if (E7jCp8Ls2 != null) {
                        kaVar = E7jCp8Ls2;
                    }
                }
                ka kaVar2 = kaVar;
                if (n8Var.MZhzXH72(kaVar2, i, j2, null) != p8.iwATDS1i01k) {
                    kaVar2.GWasM1elztuh();
                } else if (j2 < n8Var.jivtDDk9H()) {
                    kaVar2.GWasM1elztuh();
                }
                this = n8Var;
                kaVar = kaVar2;
            }
            this = n8Var;
        }
    }

    public final void ozMwhSAI(if1 if1Var, boolean z) {
        if (if1Var instanceof l9) {
            ((vg) if1Var).AvO7iQsrTN(new su0(z ? WIEu4Ya2g8() : Mjvvu5DE()));
            return;
        }
        if (!(if1Var instanceof m8)) {
            o4.EljAMC1QTz(if1Var, "Unexpected waiter: ");
            return;
        }
        m8 m8Var = (m8) if1Var;
        n9 n9Var = m8Var.EljAMC1QTz;
        n9Var.getClass();
        m8Var.EljAMC1QTz = null;
        m8Var.OOA6hdeuvCS = p8.E7jCp8Ls;
        Throwable iwATDS1i01k2 = m8Var.AvO7iQsrTN.iwATDS1i01k();
        if (iwATDS1i01k2 == null) {
            n9Var.AvO7iQsrTN(Boolean.FALSE);
        } else {
            n9Var.AvO7iQsrTN(new su0(iwATDS1i01k2));
        }
    }

    public final boolean pog2g9KITJA() {
        long j = encWxUiV2.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final ka rQPn8YBR(long j, ka kaVar, long j2) {
        Object Y6hRI1cF8;
        Unsafe unsafe;
        ka kaVar2 = p8.GWasM1elztuh;
        o8 o8Var = o8.E7jCp8Ls;
        loop0: while (true) {
            Y6hRI1cF8 = rj0.Y6hRI1cF8(kaVar, j, o8Var);
            if (!o50.pog2g9KITJA(Y6hRI1cF8)) {
                wz0 lv06NcmrQ = o50.lv06NcmrQ(Y6hRI1cF8);
                while (true) {
                    E7jCp8Ls.getClass();
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    long j3 = WIEu4Ya2g8;
                    wz0 wz0Var = (wz0) unsafe2.getObjectVolatile(this, j3);
                    if (wz0Var.OOA6hdeuvCS >= lv06NcmrQ.OOA6hdeuvCS) {
                        break loop0;
                    }
                    if (!lv06NcmrQ.uFEq9NpZ()) {
                        break;
                    }
                    do {
                        unsafe = o9.GWasM1elztuh;
                        if (unsafe.compareAndSwapObject(this, WIEu4Ya2g8, wz0Var, lv06NcmrQ)) {
                            if (wz0Var.JFJ3QoxA()) {
                                wz0Var.encWxUiV2();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == wz0Var);
                    if (lv06NcmrQ.JFJ3QoxA()) {
                        lv06NcmrQ.encWxUiV2();
                    }
                }
            } else {
                break;
            }
        }
        if (o50.pog2g9KITJA(Y6hRI1cF8)) {
            WRKkgoJXwDn();
            M3K9sHhK(j, kaVar);
            cilMamHF(this);
            return null;
        }
        ka kaVar3 = (ka) o50.lv06NcmrQ(Y6hRI1cF8);
        long j4 = kaVar3.OOA6hdeuvCS;
        if (j4 <= j) {
            return kaVar3;
        }
        long j5 = j4 * p8.Yi7zF1RB1;
        if (!encWxUiV2.compareAndSet(this, j2 + 1, j5)) {
            cilMamHF(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = mOu10nynGul;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
    
        r15 = r8;
        r16 = null;
        r3 = (defpackage.ka) r3.X1lG3V04pd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (EljAMC1QTz.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.OOA6hdeuvCS + ',');
        sb.append("data=[");
        rQPn8YBR.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        int i3 = 0;
        JFJ3QoxA.getClass();
        Object objectVolatile = unsafe.getObjectVolatile(this, mE4lRynR);
        int i4 = 1;
        E7jCp8Ls.getClass();
        List rezfBrjOrqK = fb1.rezfBrjOrqK(unsafe.getObjectVolatile(this, Mjvvu5DE), objectVolatile, unsafe.getObjectVolatile(this, WIEu4Ya2g8));
        ArrayList arrayList = new ArrayList();
        for (Object obj : rezfBrjOrqK) {
            if (((ka) obj) != p8.GWasM1elztuh) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ka) next).OOA6hdeuvCS;
            do {
                Object next2 = it.next();
                long j2 = ((ka) next2).OOA6hdeuvCS;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ka kaVar = (ka) next;
        long j3 = AvO7iQsrTN.get(this);
        long jivtDDk9H = jivtDDk9H();
        loop2: while (true) {
            int i5 = p8.Yi7zF1RB1;
            int i6 = i3;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                i = i4;
                long j4 = (kaVar.OOA6hdeuvCS * p8.Yi7zF1RB1) + i6;
                if (j4 >= jivtDDk9H && j4 >= j3) {
                    str = null;
                    break loop2;
                }
                Object WIEu4Ya2g82 = kaVar.WIEu4Ya2g8(i6);
                Object obj2 = kaVar.encWxUiV2.get(i6 * 2);
                if (WIEu4Ya2g82 instanceof l9) {
                    str2 = (j4 >= j3 || j4 < jivtDDk9H) ? (j4 >= jivtDDk9H || j4 < j3) ? "cont" : "send" : "receive";
                } else if (WIEu4Ya2g82 instanceof jf1) {
                    str2 = "EB(" + WIEu4Ya2g82 + ')';
                } else if (o30.rQPn8YBR(WIEu4Ya2g82, p8.EljAMC1QTz) || o30.rQPn8YBR(WIEu4Ya2g82, p8.AvO7iQsrTN)) {
                    str2 = "resuming_sender";
                } else {
                    if (WIEu4Ya2g82 != null && !WIEu4Ya2g82.equals(p8.OOA6hdeuvCS) && !WIEu4Ya2g82.equals(p8.mOu10nynGul) && !WIEu4Ya2g82.equals(p8.encWxUiV2) && !WIEu4Ya2g82.equals(p8.rQPn8YBR) && !WIEu4Ya2g82.equals(p8.JFJ3QoxA) && !WIEu4Ya2g82.equals(p8.E7jCp8Ls)) {
                        str2 = WIEu4Ya2g82.toString();
                    }
                    i6++;
                    i4 = i;
                }
                if (obj2 != null) {
                    sb.append("(" + str2 + ',' + obj2 + "),");
                } else {
                    sb.append(str2 + ',');
                }
                i6++;
                i4 = i;
            }
            i4 = i;
            i3 = 0;
        }
        if (sb.length() == 0) {
            o4.AvO7iQsrTN("Char sequence is empty.");
            return str;
        }
        if (sb.charAt(sb.length() - i) == ',') {
            sb.deleteCharAt(sb.length() - i).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final ka uFEq9NpZ(long j, ka kaVar) {
        Object Y6hRI1cF8;
        long j2;
        long j3;
        Unsafe unsafe;
        ka kaVar2 = p8.GWasM1elztuh;
        o8 o8Var = o8.E7jCp8Ls;
        loop0: while (true) {
            Y6hRI1cF8 = rj0.Y6hRI1cF8(kaVar, j, o8Var);
            if (!o50.pog2g9KITJA(Y6hRI1cF8)) {
                wz0 lv06NcmrQ = o50.lv06NcmrQ(Y6hRI1cF8);
                while (true) {
                    JFJ3QoxA.getClass();
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    long j4 = mE4lRynR;
                    wz0 wz0Var = (wz0) unsafe2.getObjectVolatile(this, j4);
                    if (wz0Var.OOA6hdeuvCS >= lv06NcmrQ.OOA6hdeuvCS) {
                        break loop0;
                    }
                    if (!lv06NcmrQ.uFEq9NpZ()) {
                        break;
                    }
                    do {
                        unsafe = o9.GWasM1elztuh;
                        if (unsafe.compareAndSwapObject(this, mE4lRynR, wz0Var, lv06NcmrQ)) {
                            if (wz0Var.JFJ3QoxA()) {
                                wz0Var.encWxUiV2();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == wz0Var);
                    if (lv06NcmrQ.JFJ3QoxA()) {
                        lv06NcmrQ.encWxUiV2();
                    }
                }
            } else {
                break;
            }
        }
        boolean pog2g9KITJA = o50.pog2g9KITJA(Y6hRI1cF8);
        AtomicLongFieldUpdater atomicLongFieldUpdater = AvO7iQsrTN;
        if (pog2g9KITJA) {
            WRKkgoJXwDn();
            if (kaVar.OOA6hdeuvCS * p8.Yi7zF1RB1 < atomicLongFieldUpdater.get(this)) {
                kaVar.GWasM1elztuh();
                return null;
            }
        } else {
            ka kaVar3 = (ka) o50.lv06NcmrQ(Y6hRI1cF8);
            long j5 = kaVar3.OOA6hdeuvCS;
            if (j5 <= j) {
                return kaVar3;
            }
            long j6 = j5 * p8.Yi7zF1RB1;
            do {
                j2 = EljAMC1QTz.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!EljAMC1QTz.compareAndSet(this, j2, j3 + (((int) (j2 >> 60)) << 60)));
            if (j5 * p8.Yi7zF1RB1 < atomicLongFieldUpdater.get(this)) {
                kaVar3.GWasM1elztuh();
            }
        }
        return null;
    }
}
