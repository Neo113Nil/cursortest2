package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class m40 implements f40 {
    public static final /* synthetic */ long AvO7iQsrTN;
    public static final /* synthetic */ AtomicReferenceFieldUpdater EljAMC1QTz;
    public static final /* synthetic */ AtomicReferenceFieldUpdater OOA6hdeuvCS = AtomicReferenceFieldUpdater.newUpdater(m40.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long encWxUiV2;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        encWxUiV2 = unsafe.objectFieldOffset(m40.class.getDeclaredField("_state$volatile"));
        EljAMC1QTz = AtomicReferenceFieldUpdater.newUpdater(m40.class, Object.class, "_parentHandle$volatile");
        AvO7iQsrTN = unsafe.objectFieldOffset(m40.class.getDeclaredField("_parentHandle$volatile"));
    }

    public m40(boolean z) {
        this._state$volatile = z ? p.rQPn8YBR : p.JFJ3QoxA;
    }

    public static String EDwNPVYuViP0(Object obj) {
        if (!(obj instanceof l40)) {
            return obj instanceof p00 ? ((p00) obj).Yi7zF1RB1() ? "Active" : "New" : obj instanceof uc ? "Cancelled" : "Completed";
        }
        l40 l40Var = (l40) obj;
        return l40Var.EljAMC1QTz() ? "Cancelling" : l40.EljAMC1QTz.get(l40Var) != 0 ? "Completing" : "Active";
    }

    public static qa MjxSquD6Av(kb0 kb0Var) {
        while (kb0Var.uFEq9NpZ()) {
            kb0Var = kb0Var.XnEVoBF0td1l();
        }
        while (true) {
            kb0Var = kb0Var.E7jCp8Ls();
            if (!kb0Var.uFEq9NpZ()) {
                if (kb0Var instanceof qa) {
                    return (qa) kb0Var;
                }
                if (kb0Var instanceof dk0) {
                    return null;
                }
            }
        }
    }

    public final Throwable A1EKNP6CxJ(l40 l40Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l40Var.EljAMC1QTz()) {
                return new g40(EXrPz3p7hFb(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof q91) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof q91)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final void AEn1Rrio(p00 p00Var, Object obj) {
        pa rezfBrjOrqK = rezfBrjOrqK();
        if (rezfBrjOrqK != null) {
            rezfBrjOrqK.GWasM1elztuh();
            ES6ysExf(ik0.OOA6hdeuvCS);
        }
        vc vcVar = null;
        uc ucVar = obj instanceof uc ? (uc) obj : null;
        Throwable th = ucVar != null ? ucVar.GWasM1elztuh : null;
        if (p00Var instanceof i40) {
            try {
                ((i40) p00Var).mE4lRynR(th);
                return;
            } catch (Throwable th2) {
                VeqTn1PQw7(new vc("Exception in completion handler " + p00Var + " for " + this, th2));
                return;
            }
        }
        dk0 xqGvceK5x = p00Var.xqGvceK5x();
        if (xqGvceK5x != null) {
            xqGvceK5x.OOA6hdeuvCS(new ua0(1), 1);
            Object rQPn8YBR = xqGvceK5x.rQPn8YBR();
            rQPn8YBR.getClass();
            for (kb0 kb0Var = (kb0) rQPn8YBR; !kb0Var.equals(xqGvceK5x); kb0Var = kb0Var.E7jCp8Ls()) {
                if (kb0Var instanceof i40) {
                    try {
                        ((i40) kb0Var).mE4lRynR(th);
                    } catch (Throwable th3) {
                        if (vcVar != null) {
                            p.xqGvceK5x(vcVar, th3);
                        } else {
                            vcVar = new vc("Exception in completion handler " + kb0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (vcVar != null) {
                VeqTn1PQw7(vcVar);
            }
        }
    }

    public boolean CMh55RymNfS() {
        return this instanceof v6;
    }

    public boolean DmJncFq5() {
        return this instanceof rc;
    }

    @Override // defpackage.gh
    public final eh E7jCp8Ls(fh fhVar) {
        return n30.arNh8D4Z5gB(this, fhVar);
    }

    public final void ES6ysExf(pa paVar) {
        EljAMC1QTz.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, AvO7iQsrTN, paVar);
    }

    public String EXrPz3p7hFb() {
        return "Job was cancelled";
    }

    @Override // defpackage.f40, defpackage.z9
    public void GWasM1elztuh(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g40(EXrPz3p7hFb(), null, this);
        }
        M3K9sHhK(cancellationException);
    }

    public final dk0 HFYAaqMd6(p00 p00Var) {
        dk0 xqGvceK5x = p00Var.xqGvceK5x();
        if (xqGvceK5x != null) {
            return xqGvceK5x;
        }
        if (p00Var instanceof sp) {
            return new dk0();
        }
        if (p00Var instanceof i40) {
            ZCWXqiC0((i40) p00Var);
            return null;
        }
        o4.EljAMC1QTz(p00Var, "State should have list: ");
        return null;
    }

    public final Object J3Xc8BaqpN8(Object obj) {
        Object nXl1EmE5;
        do {
            nXl1EmE5 = nXl1EmE5(TpUsjqg3bxO(), obj);
            if (nXl1EmE5 == p.OOA6hdeuvCS) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                uc ucVar = obj instanceof uc ? (uc) obj : null;
                throw new IllegalStateException(str, ucVar != null ? ucVar.GWasM1elztuh : null);
            }
        } while (nXl1EmE5 == p.AvO7iQsrTN);
        return nXl1EmE5;
    }

    public final void JFXS9W1rB5s4(i40 i40Var) {
        m40 m40Var;
        while (true) {
            Object TpUsjqg3bxO = this.TpUsjqg3bxO();
            if (!(TpUsjqg3bxO instanceof i40)) {
                if (!(TpUsjqg3bxO instanceof p00) || ((p00) TpUsjqg3bxO).xqGvceK5x() == null) {
                    return;
                }
                i40Var.iwATDS1i01k();
                return;
            }
            if (TpUsjqg3bxO != i40Var) {
                return;
            }
            sp spVar = p.rQPn8YBR;
            while (true) {
                OOA6hdeuvCS.getClass();
                Unsafe unsafe = o9.GWasM1elztuh;
                long j = encWxUiV2;
                m40Var = this;
                if (unsafe.compareAndSwapObject(m40Var, j, TpUsjqg3bxO, spVar)) {
                    return;
                }
                if (unsafe.getObjectVolatile(m40Var, j) != TpUsjqg3bxO) {
                    break;
                } else {
                    this = m40Var;
                }
            }
            this = m40Var;
        }
    }

    public final boolean K0ReC6MK(l40 l40Var, qa qaVar, Object obj) {
        while (ki1.YZjbz8VdP5(qaVar.E7jCp8Ls, false, new k40(this, l40Var, qaVar, obj)) == ik0.OOA6hdeuvCS) {
            qaVar = MjxSquD6Av(qaVar);
            if (qaVar == null) {
                return false;
            }
        }
        return true;
    }

    public void M3K9sHhK(CancellationException cancellationException) {
        pog2g9KITJA(cancellationException);
    }

    public String MItybXapHX() {
        return getClass().getSimpleName();
    }

    public boolean MZhzXH72() {
        return true;
    }

    @Override // defpackage.f40
    public final um Mjvvu5DE(hv hvVar) {
        return YXi2hvwn7WL(true, new b40(hvVar));
    }

    public final int NyNgffpi(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof sp;
        long j = encWxUiV2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OOA6hdeuvCS;
        if (z) {
            if (((sp) obj).OOA6hdeuvCS) {
                return 0;
            }
            sp spVar = p.rQPn8YBR;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = o9.GWasM1elztuh;
                if (unsafe2.compareAndSwapObject(this, encWxUiV2, obj, spVar)) {
                    c4eaifQP();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof o00)) {
            return 0;
        }
        dk0 dk0Var = ((o00) obj).OOA6hdeuvCS;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = o9.GWasM1elztuh;
            if (unsafe.compareAndSwapObject(this, encWxUiV2, obj, dk0Var)) {
                c4eaifQP();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final boolean Qd9Q8OZgvOo4(p00 p00Var, Throwable th) {
        dk0 HFYAaqMd6 = HFYAaqMd6(p00Var);
        if (HFYAaqMd6 == null) {
            return false;
        }
        l40 l40Var = new l40(HFYAaqMd6, th);
        while (true) {
            OOA6hdeuvCS.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = encWxUiV2;
            m40 m40Var = this;
            p00 p00Var2 = p00Var;
            if (unsafe.compareAndSwapObject(m40Var, j, p00Var2, l40Var)) {
                m40Var.Uxq83abb04(HFYAaqMd6, th);
                return true;
            }
            if (unsafe.getObjectVolatile(m40Var, j) != p00Var2) {
                return false;
            }
            this = m40Var;
            p00Var = p00Var2;
        }
    }

    public final Object TpUsjqg3bxO() {
        OOA6hdeuvCS.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, encWxUiV2);
    }

    public final void Uxq83abb04(dk0 dk0Var, Throwable th) {
        dk0Var.OOA6hdeuvCS(new ua0(4), 4);
        Object rQPn8YBR = dk0Var.rQPn8YBR();
        rQPn8YBR.getClass();
        vc vcVar = null;
        for (kb0 kb0Var = (kb0) rQPn8YBR; !kb0Var.equals(dk0Var); kb0Var = kb0Var.E7jCp8Ls()) {
            if ((kb0Var instanceof i40) && ((i40) kb0Var).Mjvvu5DE()) {
                try {
                    ((i40) kb0Var).mE4lRynR(th);
                } catch (Throwable th2) {
                    if (vcVar != null) {
                        p.xqGvceK5x(vcVar, th2);
                    } else {
                        vcVar = new vc("Exception in completion handler " + kb0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (vcVar != null) {
            VeqTn1PQw7(vcVar);
        }
        k8h8IjolWQ(th);
    }

    @Override // defpackage.gh
    public final Object WIEu4Ya2g8(lv lvVar, Object obj) {
        return lvVar.EljAMC1QTz(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final um YXi2hvwn7WL(boolean z, i40 i40Var) {
        m40 m40Var;
        i40 i40Var2;
        ik0 ik0Var;
        boolean OOA6hdeuvCS2;
        i40Var.rQPn8YBR = this;
        loop0: while (true) {
            Object TpUsjqg3bxO = this.TpUsjqg3bxO();
            if (TpUsjqg3bxO instanceof sp) {
                sp spVar = (sp) TpUsjqg3bxO;
                if (spVar.OOA6hdeuvCS) {
                    while (true) {
                        OOA6hdeuvCS.getClass();
                        Unsafe unsafe = o9.GWasM1elztuh;
                        long j = encWxUiV2;
                        m40Var = this;
                        i40Var2 = i40Var;
                        if (unsafe.compareAndSwapObject(m40Var, j, TpUsjqg3bxO, i40Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(m40Var, j) != TpUsjqg3bxO) {
                            break;
                        }
                        this = m40Var;
                        i40Var = i40Var2;
                    }
                } else {
                    m40Var = this;
                    i40Var2 = i40Var;
                    m40Var.mqNvfisv7(spVar);
                }
                this = m40Var;
                i40Var = i40Var2;
            } else {
                m40Var = this;
                i40Var2 = i40Var;
                boolean z2 = TpUsjqg3bxO instanceof p00;
                ik0Var = ik0.OOA6hdeuvCS;
                if (z2) {
                    p00 p00Var = (p00) TpUsjqg3bxO;
                    dk0 xqGvceK5x = p00Var.xqGvceK5x();
                    if (xqGvceK5x == null) {
                        m40Var.ZCWXqiC0((i40) TpUsjqg3bxO);
                    } else {
                        if (i40Var2.Mjvvu5DE()) {
                            l40 l40Var = p00Var instanceof l40 ? (l40) p00Var : null;
                            Throwable OOA6hdeuvCS3 = l40Var != null ? l40Var.OOA6hdeuvCS() : null;
                            if (OOA6hdeuvCS3 == null) {
                                OOA6hdeuvCS2 = xqGvceK5x.OOA6hdeuvCS(i40Var2, 5);
                            } else if (z) {
                                i40Var2.mE4lRynR(OOA6hdeuvCS3);
                                return ik0Var;
                            }
                        } else {
                            OOA6hdeuvCS2 = xqGvceK5x.OOA6hdeuvCS(i40Var2, 1);
                        }
                        if (OOA6hdeuvCS2) {
                            break;
                        }
                    }
                    this = m40Var;
                    i40Var = i40Var2;
                } else if (z) {
                    Object TpUsjqg3bxO2 = m40Var.TpUsjqg3bxO();
                    uc ucVar = TpUsjqg3bxO2 instanceof uc ? (uc) TpUsjqg3bxO2 : null;
                    i40Var2.mE4lRynR(ucVar != null ? ucVar.GWasM1elztuh : null);
                }
            }
        }
        return ik0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable YZjbz8VdP5(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        m40 m40Var = (m40) obj;
        Object TpUsjqg3bxO = m40Var.TpUsjqg3bxO();
        if (TpUsjqg3bxO instanceof l40) {
            cancellationException = ((l40) TpUsjqg3bxO).OOA6hdeuvCS();
        } else if (TpUsjqg3bxO instanceof uc) {
            cancellationException = ((uc) TpUsjqg3bxO).GWasM1elztuh;
        } else {
            if (TpUsjqg3bxO instanceof p00) {
                o4.EljAMC1QTz(TpUsjqg3bxO, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new g40("Parent job is ".concat(EDwNPVYuViP0(TpUsjqg3bxO)), cancellationException, m40Var) : cancellationException2;
    }

    @Override // defpackage.f40
    public boolean Yi7zF1RB1() {
        Object TpUsjqg3bxO = TpUsjqg3bxO();
        return (TpUsjqg3bxO instanceof p00) && ((p00) TpUsjqg3bxO).Yi7zF1RB1();
    }

    public final void ZCWXqiC0(i40 i40Var) {
        i40Var.AvO7iQsrTN(new dk0());
        kb0 E7jCp8Ls = i40Var.E7jCp8Ls();
        while (true) {
            OOA6hdeuvCS.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = encWxUiV2;
            m40 m40Var = this;
            i40 i40Var2 = i40Var;
            if (unsafe.compareAndSwapObject(m40Var, j, i40Var2, E7jCp8Ls) || unsafe.getObjectVolatile(m40Var, j) != i40Var2) {
                return;
            }
            this = m40Var;
            i40Var = i40Var2;
        }
    }

    public void arNh8D4Z5gB(Object obj) {
        WdrkLMV3xh(obj);
    }

    @Override // defpackage.f40
    public final Object cilMamHF(wg wgVar) {
        Object TpUsjqg3bxO;
        kc1 kc1Var;
        do {
            TpUsjqg3bxO = TpUsjqg3bxO();
            boolean z = TpUsjqg3bxO instanceof p00;
            kc1Var = kc1.GWasM1elztuh;
            if (!z) {
                ki1.pog2g9KITJA(wgVar.OOA6hdeuvCS());
                return kc1Var;
            }
        } while (NyNgffpi(TpUsjqg3bxO) < 0);
        n9 n9Var = new n9(1, rj0.M3K9sHhK(wgVar));
        n9Var.cilMamHF();
        n9Var.arNh8D4Z5gB(new j9(1, ki1.YZjbz8VdP5(this, true, new vu0(n9Var))));
        Object jivtDDk9H = n9Var.jivtDDk9H();
        qh qhVar = qh.OOA6hdeuvCS;
        if (jivtDDk9H != qhVar) {
            jivtDDk9H = kc1Var;
        }
        return jivtDDk9H == qhVar ? jivtDDk9H : kc1Var;
    }

    public final boolean dcDmLGVhzWm(p00 p00Var, Object obj) {
        Object q00Var = obj instanceof p00 ? new q00((p00) obj) : obj;
        while (true) {
            OOA6hdeuvCS.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = encWxUiV2;
            m40 m40Var = this;
            p00 p00Var2 = p00Var;
            if (unsafe.compareAndSwapObject(m40Var, j, p00Var2, q00Var)) {
                m40Var.Fm8W7vP7q(obj);
                m40Var.AEn1Rrio(p00Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(m40Var, j) != p00Var2) {
                return false;
            }
            this = m40Var;
            p00Var = p00Var2;
        }
    }

    public boolean dqB83aoLBB(Throwable th) {
        return false;
    }

    public final Object eUH21U3apd(l40 l40Var, Object obj) {
        l40 l40Var2;
        Throwable th;
        Throwable A1EKNP6CxJ;
        m40 m40Var;
        l40 l40Var3;
        uc ucVar = obj instanceof uc ? (uc) obj : null;
        Throwable th2 = ucVar != null ? ucVar.GWasM1elztuh : null;
        synchronized (l40Var) {
            try {
                l40Var.EljAMC1QTz();
                ArrayList AvO7iQsrTN2 = l40Var.AvO7iQsrTN(th2);
                A1EKNP6CxJ = A1EKNP6CxJ(l40Var, AvO7iQsrTN2);
                if (A1EKNP6CxJ != null) {
                    try {
                        if (AvO7iQsrTN2.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(AvO7iQsrTN2.size()));
                            int size = AvO7iQsrTN2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = AvO7iQsrTN2.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != A1EKNP6CxJ && th3 != A1EKNP6CxJ && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    p.xqGvceK5x(A1EKNP6CxJ, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        l40Var2 = l40Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                l40Var2 = l40Var;
                th = th5;
            }
        }
        if (A1EKNP6CxJ != null && A1EKNP6CxJ != th2) {
            obj = new uc(A1EKNP6CxJ, false);
        }
        if (A1EKNP6CxJ != null && (k8h8IjolWQ(A1EKNP6CxJ) || dqB83aoLBB(A1EKNP6CxJ))) {
            obj.getClass();
            uc.Yi7zF1RB1.compareAndSet((uc) obj, 0, 1);
        }
        Fm8W7vP7q(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OOA6hdeuvCS;
        Object q00Var = obj instanceof p00 ? new q00((p00) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = encWxUiV2;
            m40Var = this;
            l40Var3 = l40Var;
            if (!unsafe.compareAndSwapObject(m40Var, j, l40Var3, q00Var) && unsafe.getObjectVolatile(m40Var, j) == l40Var3) {
                this = m40Var;
                l40Var = l40Var3;
            }
        }
        m40Var.AEn1Rrio(l40Var3, obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.f40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pa encWxUiV2(m40 m40Var) {
        m40 m40Var2;
        qa qaVar = new qa(m40Var);
        qaVar.rQPn8YBR = this;
        loop0: while (true) {
            Object TpUsjqg3bxO = this.TpUsjqg3bxO();
            if (TpUsjqg3bxO instanceof sp) {
                sp spVar = (sp) TpUsjqg3bxO;
                if (spVar.OOA6hdeuvCS) {
                    while (true) {
                        OOA6hdeuvCS.getClass();
                        Unsafe unsafe = o9.GWasM1elztuh;
                        long j = encWxUiV2;
                        m40Var2 = this;
                        if (unsafe.compareAndSwapObject(m40Var2, j, TpUsjqg3bxO, qaVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(m40Var2, j) != TpUsjqg3bxO) {
                            break;
                        }
                        this = m40Var2;
                    }
                } else {
                    m40Var2 = this;
                    m40Var2.mqNvfisv7(spVar);
                }
                this = m40Var2;
            } else {
                m40Var2 = this;
                boolean z = TpUsjqg3bxO instanceof p00;
                ik0 ik0Var = ik0.OOA6hdeuvCS;
                if (!z) {
                    Object TpUsjqg3bxO2 = m40Var2.TpUsjqg3bxO();
                    uc ucVar = TpUsjqg3bxO2 instanceof uc ? (uc) TpUsjqg3bxO2 : null;
                    qaVar.mE4lRynR(ucVar != null ? ucVar.GWasM1elztuh : null);
                    return ik0Var;
                }
                dk0 xqGvceK5x = ((p00) TpUsjqg3bxO).xqGvceK5x();
                if (xqGvceK5x == null) {
                    m40Var2.ZCWXqiC0((i40) TpUsjqg3bxO);
                    this = m40Var2;
                } else if (!xqGvceK5x.OOA6hdeuvCS(qaVar, 7)) {
                    boolean OOA6hdeuvCS2 = xqGvceK5x.OOA6hdeuvCS(qaVar, 3);
                    Object TpUsjqg3bxO3 = m40Var2.TpUsjqg3bxO();
                    if (TpUsjqg3bxO3 instanceof l40) {
                        r0 = ((l40) TpUsjqg3bxO3).OOA6hdeuvCS();
                    } else {
                        uc ucVar2 = TpUsjqg3bxO3 instanceof uc ? (uc) TpUsjqg3bxO3 : null;
                        if (ucVar2 != null) {
                            r0 = ucVar2.GWasM1elztuh;
                        }
                    }
                    qaVar.mE4lRynR(r0);
                    if (OOA6hdeuvCS2) {
                        break loop0;
                    }
                    return ik0Var;
                }
            }
        }
    }

    @Override // defpackage.eh
    public final fh getKey() {
        return b9xEq24R1.VeqTn1PQw7;
    }

    @Override // defpackage.f40
    public final CancellationException iwATDS1i01k() {
        CancellationException cancellationException;
        Object TpUsjqg3bxO = TpUsjqg3bxO();
        if (TpUsjqg3bxO instanceof l40) {
            Throwable OOA6hdeuvCS2 = ((l40) TpUsjqg3bxO).OOA6hdeuvCS();
            if (OOA6hdeuvCS2 == null) {
                o4.EljAMC1QTz(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = OOA6hdeuvCS2 instanceof CancellationException ? (CancellationException) OOA6hdeuvCS2 : null;
            return cancellationException == null ? new g40(concat, OOA6hdeuvCS2, this) : cancellationException;
        }
        if (TpUsjqg3bxO instanceof p00) {
            o4.EljAMC1QTz(this, "Job is still new or active: ");
            return null;
        }
        if (!(TpUsjqg3bxO instanceof uc)) {
            return new g40(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((uc) TpUsjqg3bxO).GWasM1elztuh;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new g40(EXrPz3p7hFb(), th, this) : cancellationException;
    }

    @Override // defpackage.gh
    public final gh jivtDDk9H(fh fhVar) {
        return n30.DmJncFq5(this, fhVar);
    }

    public final boolean k8h8IjolWQ(Throwable th) {
        if (CMh55RymNfS()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        pa rezfBrjOrqK = rezfBrjOrqK();
        return (rezfBrjOrqK == null || rezfBrjOrqK == ik0.OOA6hdeuvCS) ? z : rezfBrjOrqK.X1lG3V04pd(th) || z;
    }

    @Override // defpackage.f40
    public final um lv06NcmrQ(boolean z, boolean z2, OOA6hdeuvCS oOA6hdeuvCS) {
        return YXi2hvwn7WL(z2, z ? new a40(oOA6hdeuvCS) : new b40(oOA6hdeuvCS));
    }

    @Override // defpackage.gh
    public final gh mOu10nynGul(gh ghVar) {
        return n30.HFYAaqMd6(this, ghVar);
    }

    public final void mqNvfisv7(sp spVar) {
        dk0 dk0Var = new dk0();
        p00 o00Var = spVar.OOA6hdeuvCS ? dk0Var : new o00(dk0Var);
        while (true) {
            OOA6hdeuvCS.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = encWxUiV2;
            m40 m40Var = this;
            sp spVar2 = spVar;
            if (unsafe.compareAndSwapObject(m40Var, j, spVar2, o00Var) || unsafe.getObjectVolatile(m40Var, j) != spVar2) {
                return;
            }
            this = m40Var;
            spVar = spVar2;
        }
    }

    public final Object nXl1EmE5(Object obj, Object obj2) {
        if (!(obj instanceof p00)) {
            return p.OOA6hdeuvCS;
        }
        if (((obj instanceof sp) || (obj instanceof i40)) && !(obj instanceof qa) && !(obj2 instanceof uc)) {
            return dcDmLGVhzWm((p00) obj, obj2) ? obj2 : p.AvO7iQsrTN;
        }
        p00 p00Var = (p00) obj;
        dk0 HFYAaqMd6 = HFYAaqMd6(p00Var);
        if (HFYAaqMd6 == null) {
            return p.AvO7iQsrTN;
        }
        l40 l40Var = p00Var instanceof l40 ? (l40) p00Var : null;
        if (l40Var == null) {
            l40Var = new l40(HFYAaqMd6, null);
        }
        synchronized (l40Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l40.EljAMC1QTz;
            if (atomicIntegerFieldUpdater.get(l40Var) != 0) {
                return p.OOA6hdeuvCS;
            }
            atomicIntegerFieldUpdater.set(l40Var, 1);
            if (l40Var != p00Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OOA6hdeuvCS;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, p00Var, l40Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != p00Var) {
                        return p.AvO7iQsrTN;
                    }
                }
            }
            boolean EljAMC1QTz2 = l40Var.EljAMC1QTz();
            uc ucVar = obj2 instanceof uc ? (uc) obj2 : null;
            if (ucVar != null) {
                l40Var.GWasM1elztuh(ucVar.GWasM1elztuh);
            }
            Throwable OOA6hdeuvCS2 = EljAMC1QTz2 ? null : l40Var.OOA6hdeuvCS();
            if (OOA6hdeuvCS2 != null) {
                Uxq83abb04(HFYAaqMd6, OOA6hdeuvCS2);
            }
            qa MjxSquD6Av = MjxSquD6Av(HFYAaqMd6);
            if (MjxSquD6Av != null && K0ReC6MK(l40Var, MjxSquD6Av, obj2)) {
                return p.EljAMC1QTz;
            }
            HFYAaqMd6.OOA6hdeuvCS(new ua0(2), 2);
            qa MjxSquD6Av2 = MjxSquD6Av(HFYAaqMd6);
            return (MjxSquD6Av2 == null || !K0ReC6MK(l40Var, MjxSquD6Av2, obj2)) ? eUH21U3apd(l40Var, obj2) : p.EljAMC1QTz;
        }
    }

    public boolean ozMwhSAI(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return pog2g9KITJA(th) && MZhzXH72();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.p.EljAMC1QTz) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean pog2g9KITJA(Object obj) {
        pp ppVar;
        Object obj2 = p.OOA6hdeuvCS;
        if (DmJncFq5()) {
            do {
                Object TpUsjqg3bxO = TpUsjqg3bxO();
                if (TpUsjqg3bxO instanceof p00) {
                    if (TpUsjqg3bxO instanceof l40) {
                        if (l40.EljAMC1QTz.get((l40) TpUsjqg3bxO) != 0) {
                        }
                    }
                    obj2 = nXl1EmE5(TpUsjqg3bxO, new uc(YZjbz8VdP5(obj), false));
                }
                obj2 = p.OOA6hdeuvCS;
                break;
            } while (obj2 == p.AvO7iQsrTN);
        }
        if (obj2 == p.OOA6hdeuvCS) {
            Throwable th = null;
            while (true) {
                Object TpUsjqg3bxO2 = TpUsjqg3bxO();
                if (!(TpUsjqg3bxO2 instanceof l40)) {
                    if (!(TpUsjqg3bxO2 instanceof p00)) {
                        ppVar = p.encWxUiV2;
                        break;
                    }
                    if (th == null) {
                        th = YZjbz8VdP5(obj);
                    }
                    p00 p00Var = (p00) TpUsjqg3bxO2;
                    if (!p00Var.Yi7zF1RB1()) {
                        Object nXl1EmE5 = nXl1EmE5(TpUsjqg3bxO2, new uc(th, false));
                        if (nXl1EmE5 == p.OOA6hdeuvCS) {
                            o4.EljAMC1QTz(TpUsjqg3bxO2, "Cannot happen in ");
                            return false;
                        }
                        if (nXl1EmE5 != p.AvO7iQsrTN) {
                            obj2 = nXl1EmE5;
                            break;
                        }
                    } else if (Qd9Q8OZgvOo4(p00Var, th)) {
                        ppVar = p.OOA6hdeuvCS;
                        break;
                    }
                } else {
                    synchronized (TpUsjqg3bxO2) {
                        if (((l40) TpUsjqg3bxO2).X1lG3V04pd() == p.mOu10nynGul) {
                            ppVar = p.encWxUiV2;
                        } else {
                            boolean EljAMC1QTz2 = ((l40) TpUsjqg3bxO2).EljAMC1QTz();
                            if (th == null) {
                                th = YZjbz8VdP5(obj);
                            }
                            ((l40) TpUsjqg3bxO2).GWasM1elztuh(th);
                            Throwable OOA6hdeuvCS2 = EljAMC1QTz2 ? null : ((l40) TpUsjqg3bxO2).OOA6hdeuvCS();
                            if (OOA6hdeuvCS2 != null) {
                                Uxq83abb04(((l40) TpUsjqg3bxO2).OOA6hdeuvCS, OOA6hdeuvCS2);
                            }
                            ppVar = p.OOA6hdeuvCS;
                        }
                    }
                }
            }
        }
        if (obj2 != p.OOA6hdeuvCS && obj2 != p.EljAMC1QTz) {
            if (obj2 == p.encWxUiV2) {
                return false;
            }
            WdrkLMV3xh(obj2);
            return true;
        }
        return true;
    }

    public final boolean qugwajBSa59j(Object obj) {
        Object nXl1EmE5;
        do {
            nXl1EmE5 = nXl1EmE5(TpUsjqg3bxO(), obj);
            if (nXl1EmE5 == p.OOA6hdeuvCS) {
                return false;
            }
            if (nXl1EmE5 == p.EljAMC1QTz) {
                return true;
            }
        } while (nXl1EmE5 == p.AvO7iQsrTN);
        WdrkLMV3xh(nXl1EmE5);
        return true;
    }

    public final pa rezfBrjOrqK() {
        EljAMC1QTz.getClass();
        return (pa) o9.GWasM1elztuh.getObjectVolatile(this, AvO7iQsrTN);
    }

    @Override // defpackage.f40
    public final boolean start() {
        int NyNgffpi;
        do {
            NyNgffpi = NyNgffpi(TpUsjqg3bxO());
            if (NyNgffpi == 0) {
                return false;
            }
        } while (NyNgffpi != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MItybXapHX() + '{' + EDwNPVYuViP0(TpUsjqg3bxO()) + '}');
        sb.append('@');
        sb.append(qj.WdrkLMV3xh(this));
        return sb.toString();
    }

    public final void z19UFEN2I(f40 f40Var) {
        ik0 ik0Var = ik0.OOA6hdeuvCS;
        if (f40Var == null) {
            ES6ysExf(ik0Var);
            return;
        }
        f40Var.start();
        pa encWxUiV22 = f40Var.encWxUiV2(this);
        ES6ysExf(encWxUiV22);
        if (TpUsjqg3bxO() instanceof p00) {
            return;
        }
        encWxUiV22.GWasM1elztuh();
        ES6ysExf(ik0Var);
    }

    public void c4eaifQP() {
    }

    public void Fm8W7vP7q(Object obj) {
    }

    public void VeqTn1PQw7(vc vcVar) {
        throw vcVar;
    }

    public void WdrkLMV3xh(Object obj) {
    }
}
