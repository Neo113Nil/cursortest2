package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class n9 extends km implements l9, rh, if1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E7jCp8Ls;
    public static final /* synthetic */ long XnEVoBF0td1l;
    public static final /* synthetic */ long uFEq9NpZ;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final vg encWxUiV2;
    public final gh mOu10nynGul;
    public static final /* synthetic */ AtomicIntegerFieldUpdater JFJ3QoxA = AtomicIntegerFieldUpdater.newUpdater(n9.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater rQPn8YBR = AtomicReferenceFieldUpdater.newUpdater(n9.class, Object.class, "_state$volatile");

    static {
        Unsafe unsafe = o9.GWasM1elztuh;
        uFEq9NpZ = unsafe.objectFieldOffset(n9.class.getDeclaredField("_state$volatile"));
        E7jCp8Ls = AtomicReferenceFieldUpdater.newUpdater(n9.class, Object.class, "_parentHandle$volatile");
        XnEVoBF0td1l = unsafe.objectFieldOffset(n9.class.getDeclaredField("_parentHandle$volatile"));
    }

    public n9(int i, vg vgVar) {
        super(i);
        this.encWxUiV2 = vgVar;
        this.mOu10nynGul = vgVar.OOA6hdeuvCS();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = cTIXpaxc.GWasM1elztuh;
    }

    public static Object A1EKNP6CxJ(mk0 mk0Var, Object obj, int i, mv mvVar) {
        if (obj instanceof uc) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (mvVar != null || (mk0Var instanceof j9)) {
            return new sc(obj, mk0Var instanceof j9 ? (j9) mk0Var : null, mvVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void M3K9sHhK(mk0 mk0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + mk0Var + ", already has " + obj).toString());
    }

    public final void AEn1Rrio(Object obj, mv mvVar) {
        YZjbz8VdP5(obj, this.AvO7iQsrTN, mvVar);
    }

    @Override // defpackage.vg
    public final void AvO7iQsrTN(Object obj) {
        Throwable GWasM1elztuh = tu0.GWasM1elztuh(obj);
        if (GWasM1elztuh != null) {
            obj = new uc(GWasM1elztuh, false);
        }
        YZjbz8VdP5(obj, this.AvO7iQsrTN, null);
    }

    @Override // defpackage.km
    public final Object E7jCp8Ls() {
        return Y6hRI1cF8();
    }

    public final void EXrPz3p7hFb() {
        Throwable Mjvvu5DE;
        vg vgVar = this.encWxUiV2;
        im imVar = vgVar instanceof im ? (im) vgVar : null;
        if (imVar == null || (Mjvvu5DE = imVar.Mjvvu5DE(this)) == null) {
            return;
        }
        WIEu4Ya2g8();
        rQPn8YBR(Mjvvu5DE);
    }

    @Override // defpackage.km
    public final Throwable EljAMC1QTz(Object obj) {
        Throwable EljAMC1QTz = super.EljAMC1QTz(obj);
        if (EljAMC1QTz != null) {
            return EljAMC1QTz;
        }
        return null;
    }

    @Override // defpackage.if1
    public final void GWasM1elztuh(wz0 wz0Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = JFJ3QoxA;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                o4.jivtDDk9H("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        arNh8D4Z5gB(wz0Var);
    }

    @Override // defpackage.l9
    public final pp JFJ3QoxA(Object obj, mv mvVar) {
        return MZhzXH72(obj, mvVar);
    }

    public final pp MZhzXH72(Object obj, mv mvVar) {
        n9 n9Var;
        pp ppVar = o30.GWasM1elztuh;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = uFEq9NpZ;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mk0)) {
                return null;
            }
            Object A1EKNP6CxJ = A1EKNP6CxJ((mk0) objectVolatile, obj, this.AvO7iQsrTN, mvVar);
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                n9Var = this;
                if (unsafe2.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, A1EKNP6CxJ)) {
                    if (!n9Var.pog2g9KITJA()) {
                        n9Var.WIEu4Ya2g8();
                    }
                    return ppVar;
                }
                if (unsafe2.getObjectVolatile(n9Var, j) != objectVolatile) {
                    break;
                }
                this = n9Var;
            }
            this = n9Var;
        }
    }

    public Throwable Mjvvu5DE(m40 m40Var) {
        return m40Var.iwATDS1i01k();
    }

    @Override // defpackage.vg
    public final gh OOA6hdeuvCS() {
        return this.mOu10nynGul;
    }

    public final void WIEu4Ya2g8() {
        um mE4lRynR = mE4lRynR();
        if (mE4lRynR == null) {
            return;
        }
        mE4lRynR.GWasM1elztuh();
        E7jCp8Ls.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, XnEVoBF0td1l, ik0.OOA6hdeuvCS);
    }

    @Override // defpackage.l9
    public final void WRKkgoJXwDn(Object obj) {
        YmKjaVtbfp5Z(this.AvO7iQsrTN);
    }

    public final void WdrkLMV3xh(hv hvVar) {
        arNh8D4Z5gB(new j9(0, hvVar));
    }

    @Override // defpackage.km
    public final vg X1lG3V04pd() {
        return this.encWxUiV2;
    }

    public final void XnEVoBF0td1l(j9 j9Var, Throwable th) {
        try {
            switch (j9Var.GWasM1elztuh) {
                case 0:
                    ((hv) j9Var.Yi7zF1RB1).mOu10nynGul(th);
                    break;
                default:
                    ((um) j9Var.Yi7zF1RB1).GWasM1elztuh();
                    break;
            }
        } catch (Throwable th2) {
            rj0.pog2g9KITJA(this.mOu10nynGul, new vc("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final Object Y6hRI1cF8() {
        rQPn8YBR.getClass();
        return o9.GWasM1elztuh.getObjectVolatile(this, uFEq9NpZ);
    }

    public final void YZjbz8VdP5(Object obj, int i, mv mvVar) {
        n9 n9Var;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = uFEq9NpZ;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mk0)) {
                n9 n9Var2 = this;
                if (objectVolatile instanceof q9) {
                    q9 q9Var = (q9) objectVolatile;
                    if (q9.X1lG3V04pd.compareAndSet(q9Var, 0, 1)) {
                        if (mvVar != null) {
                            n9Var2.uFEq9NpZ(mvVar, q9Var.GWasM1elztuh, obj);
                            return;
                        }
                        return;
                    }
                }
                o4.EljAMC1QTz(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object A1EKNP6CxJ = A1EKNP6CxJ((mk0) objectVolatile, obj, i, mvVar);
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                n9Var = this;
                if (unsafe2.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, A1EKNP6CxJ)) {
                    if (!n9Var.pog2g9KITJA()) {
                        n9Var.WIEu4Ya2g8();
                    }
                    n9Var.YmKjaVtbfp5Z(i);
                    return;
                } else if (unsafe2.getObjectVolatile(n9Var, j) != objectVolatile) {
                    break;
                } else {
                    this = n9Var;
                }
            }
            this = n9Var;
        }
    }

    @Override // defpackage.km
    public final void Yi7zF1RB1(CancellationException cancellationException) {
        CancellationException cancellationException2;
        n9 n9Var;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = uFEq9NpZ;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof mk0) {
                o4.jivtDDk9H("Not completed");
                return;
            }
            if (objectVolatile instanceof uc) {
                return;
            }
            if (objectVolatile instanceof sc) {
                sc scVar = (sc) objectVolatile;
                if (scVar.OOA6hdeuvCS != null) {
                    o4.jivtDDk9H("Must be called at most once");
                    return;
                }
                sc GWasM1elztuh = sc.GWasM1elztuh(scVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = o9.GWasM1elztuh;
                    n9 n9Var2 = this;
                    if (unsafe2.compareAndSwapObject(n9Var2, uFEq9NpZ, objectVolatile, GWasM1elztuh)) {
                        j9 j9Var = scVar.Yi7zF1RB1;
                        if (j9Var != null) {
                            n9Var2.XnEVoBF0td1l(j9Var, cancellationException);
                        }
                        mv mvVar = scVar.X1lG3V04pd;
                        if (mvVar != null) {
                            n9Var2.uFEq9NpZ(mvVar, cancellationException, scVar.GWasM1elztuh);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(n9Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        n9Var = n9Var2;
                        break;
                    }
                    this = n9Var2;
                }
            } else {
                n9 n9Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                sc scVar2 = new sc(objectVolatile, (j9) null, (mv) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    sc scVar3 = scVar2;
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    n9Var = n9Var3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, scVar3);
                    scVar2 = scVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(n9Var, j) != objectVolatile) {
                        break;
                    } else {
                        n9Var3 = n9Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = n9Var;
        }
    }

    public final void YmKjaVtbfp5Z(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = JFJ3QoxA;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    o4.jivtDDk9H("Already resumed");
                    return;
                }
                boolean z = i == 4;
                vg vgVar = this.encWxUiV2;
                if (!z && (vgVar instanceof im)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.AvO7iQsrTN;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        im imVar = (im) vgVar;
                        ih ihVar = imVar.encWxUiV2;
                        gh OOA6hdeuvCS = imVar.mOu10nynGul.OOA6hdeuvCS();
                        if (ihVar.EljAMC1QTz(OOA6hdeuvCS)) {
                            ihVar.OOA6hdeuvCS(OOA6hdeuvCS, this);
                            return;
                        }
                        qq GWasM1elztuh = d91.GWasM1elztuh();
                        if (GWasM1elztuh.AvO7iQsrTN >= 4294967296L) {
                            GWasM1elztuh.rQPn8YBR(this);
                            return;
                        }
                        GWasM1elztuh.XnEVoBF0td1l(true);
                        try {
                            p.Y6hRI1cF8(this, vgVar, true);
                            do {
                            } while (GWasM1elztuh.mE4lRynR());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                p.Y6hRI1cF8(this, vgVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        M3K9sHhK(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c8, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void arNh8D4Z5gB(mk0 mk0Var) {
        n9 n9Var;
        Unsafe unsafe;
        n9 n9Var2;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe2 = o9.GWasM1elztuh;
            long j = uFEq9NpZ;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof cTIXpaxc) {
                while (true) {
                    Unsafe unsafe3 = o9.GWasM1elztuh;
                    n9Var = this;
                    if (unsafe3.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, mk0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(n9Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = n9Var;
                    }
                }
            } else {
                n9Var = this;
                if ((objectVolatile instanceof j9) || (objectVolatile instanceof wz0)) {
                    break;
                }
                if (objectVolatile instanceof uc) {
                    uc ucVar = (uc) objectVolatile;
                    if (!uc.Yi7zF1RB1.compareAndSet(ucVar, 0, 1)) {
                        M3K9sHhK(mk0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof q9) {
                        Throwable th = ucVar.GWasM1elztuh;
                        if (mk0Var instanceof j9) {
                            n9Var.XnEVoBF0td1l((j9) mk0Var, th);
                            return;
                        } else {
                            n9Var.iwATDS1i01k((wz0) mk0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof sc) {
                    sc scVar = (sc) objectVolatile;
                    if (scVar.Yi7zF1RB1 != null) {
                        M3K9sHhK(mk0Var, objectVolatile);
                        throw null;
                    }
                    if (mk0Var instanceof wz0) {
                        return;
                    }
                    j9 j9Var = (j9) mk0Var;
                    Throwable th2 = scVar.OOA6hdeuvCS;
                    if (th2 != null) {
                        n9Var.XnEVoBF0td1l(j9Var, th2);
                        return;
                    }
                    sc GWasM1elztuh = sc.GWasM1elztuh(scVar, j9Var, null, 29);
                    do {
                        unsafe = o9.GWasM1elztuh;
                        n9Var2 = n9Var;
                        if (unsafe.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, GWasM1elztuh)) {
                            return;
                        } else {
                            n9Var = n9Var2;
                        }
                    } while (unsafe.getObjectVolatile(n9Var2, j) == objectVolatile);
                } else {
                    n9 n9Var3 = n9Var;
                    if (mk0Var instanceof wz0) {
                        return;
                    }
                    sc scVar2 = new sc(objectVolatile, (j9) mk0Var, (mv) null, (Throwable) null, 28);
                    while (true) {
                        sc scVar3 = scVar2;
                        Unsafe unsafe4 = o9.GWasM1elztuh;
                        n9Var = n9Var3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, scVar3);
                        scVar2 = scVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(n9Var, j) != objectVolatile) {
                            break;
                        } else {
                            n9Var3 = n9Var;
                        }
                    }
                }
            }
            this = n9Var;
        }
    }

    public final void cilMamHF() {
        um lv06NcmrQ = lv06NcmrQ();
        if (lv06NcmrQ == null || (Y6hRI1cF8() instanceof mk0)) {
            return;
        }
        lv06NcmrQ.GWasM1elztuh();
        E7jCp8Ls.getClass();
        o9.GWasM1elztuh.putObjectVolatile(this, XnEVoBF0td1l, ik0.OOA6hdeuvCS);
    }

    public final void eUH21U3apd(ih ihVar) {
        vg vgVar = this.encWxUiV2;
        im imVar = vgVar instanceof im ? (im) vgVar : null;
        YZjbz8VdP5(kc1.GWasM1elztuh, (imVar != null ? imVar.encWxUiV2 : null) == ihVar ? 4 : this.AvO7iQsrTN, null);
    }

    @Override // defpackage.km
    public final Object encWxUiV2(Object obj) {
        return obj instanceof sc ? ((sc) obj).GWasM1elztuh : obj;
    }

    public final void iwATDS1i01k(wz0 wz0Var, Throwable th) {
        gh ghVar = this.mOu10nynGul;
        int i = JFJ3QoxA.get(this) & 536870911;
        if (i == 536870911) {
            o4.jivtDDk9H("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            wz0Var.E7jCp8Ls(i, ghVar);
        } catch (Throwable th2) {
            rj0.pog2g9KITJA(ghVar, new vc("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final Object jivtDDk9H() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        f40 f40Var;
        boolean pog2g9KITJA = pog2g9KITJA();
        do {
            atomicIntegerFieldUpdater = JFJ3QoxA;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    o4.jivtDDk9H("Already suspended");
                    return null;
                }
                if (pog2g9KITJA) {
                    EXrPz3p7hFb();
                }
                Object Y6hRI1cF8 = Y6hRI1cF8();
                if (Y6hRI1cF8 instanceof uc) {
                    throw ((uc) Y6hRI1cF8).GWasM1elztuh;
                }
                int i3 = this.AvO7iQsrTN;
                if ((i3 != 1 && i3 != 2) || (f40Var = (f40) this.mOu10nynGul.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7)) == null || f40Var.Yi7zF1RB1()) {
                    return encWxUiV2(Y6hRI1cF8);
                }
                CancellationException iwATDS1i01k = f40Var.iwATDS1i01k();
                Yi7zF1RB1(iwATDS1i01k);
                throw iwATDS1i01k;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (mE4lRynR() == null) {
            lv06NcmrQ();
        }
        if (pog2g9KITJA) {
            EXrPz3p7hFb();
        }
        return qh.OOA6hdeuvCS;
    }

    public String k8h8IjolWQ() {
        return "CancellableContinuation";
    }

    public final um lv06NcmrQ() {
        f40 f40Var = (f40) this.mOu10nynGul.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
        if (f40Var == null) {
            return null;
        }
        um YZjbz8VdP5 = ki1.YZjbz8VdP5(f40Var, true, new oa(this));
        while (true) {
            E7jCp8Ls.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = XnEVoBF0td1l;
            n9 n9Var = this;
            if (!unsafe.compareAndSwapObject(n9Var, j, (Object) null, YZjbz8VdP5) && unsafe.getObjectVolatile(n9Var, j) == null) {
                this = n9Var;
            }
        }
        return YZjbz8VdP5;
    }

    public final um mE4lRynR() {
        E7jCp8Ls.getClass();
        return (um) o9.GWasM1elztuh.getObjectVolatile(this, XnEVoBF0td1l);
    }

    public final boolean ozMwhSAI() {
        rQPn8YBR.getClass();
        Unsafe unsafe = o9.GWasM1elztuh;
        long j = uFEq9NpZ;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof sc) && ((sc) objectVolatile).xqGvceK5x != null) {
            WIEu4Ya2g8();
            return false;
        }
        JFJ3QoxA.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, cTIXpaxc.GWasM1elztuh);
        return true;
    }

    public final boolean pog2g9KITJA() {
        return this.AvO7iQsrTN == 2 && ((im) this.encWxUiV2).WIEu4Ya2g8();
    }

    @Override // defpackage.l9
    public final boolean rQPn8YBR(Throwable th) {
        n9 n9Var;
        while (true) {
            rQPn8YBR.getClass();
            Unsafe unsafe = o9.GWasM1elztuh;
            long j = uFEq9NpZ;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof mk0)) {
                return false;
            }
            q9 q9Var = new q9(this, th, (objectVolatile instanceof j9) || (objectVolatile instanceof wz0));
            while (true) {
                Unsafe unsafe2 = o9.GWasM1elztuh;
                n9Var = this;
                if (unsafe2.compareAndSwapObject(n9Var, uFEq9NpZ, objectVolatile, q9Var)) {
                    mk0 mk0Var = (mk0) objectVolatile;
                    if (mk0Var instanceof j9) {
                        n9Var.XnEVoBF0td1l((j9) objectVolatile, th);
                    } else if (mk0Var instanceof wz0) {
                        n9Var.iwATDS1i01k((wz0) objectVolatile, th);
                    }
                    if (!n9Var.pog2g9KITJA()) {
                        n9Var.WIEu4Ya2g8();
                    }
                    n9Var.YmKjaVtbfp5Z(n9Var.AvO7iQsrTN);
                    return true;
                }
                if (unsafe2.getObjectVolatile(n9Var, j) != objectVolatile) {
                    break;
                }
                this = n9Var;
            }
            this = n9Var;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k8h8IjolWQ());
        sb.append('(');
        sb.append(qj.z19UFEN2I(this.encWxUiV2));
        sb.append("){");
        Object Y6hRI1cF8 = Y6hRI1cF8();
        sb.append(Y6hRI1cF8 instanceof mk0 ? "Active" : Y6hRI1cF8 instanceof q9 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(qj.WdrkLMV3xh(this));
        return sb.toString();
    }

    public final void uFEq9NpZ(mv mvVar, Throwable th, Object obj) {
        gh ghVar = this.mOu10nynGul;
        try {
            mvVar.X1lG3V04pd(th, obj, ghVar);
        } catch (Throwable th2) {
            rj0.pog2g9KITJA(ghVar, new vc("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.rh
    public final rh xqGvceK5x() {
        vg vgVar = this.encWxUiV2;
        if (vgVar instanceof rh) {
            return (rh) vgVar;
        }
        return null;
    }
}
