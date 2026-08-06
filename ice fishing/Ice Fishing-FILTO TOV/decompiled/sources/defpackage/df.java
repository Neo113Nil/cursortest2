package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class df implements xe {
    public final ig0 E7jCp8Ls;
    public final ac1 EljAMC1QTz;
    public final z21 JFJ3QoxA;
    public hg0 Mjvvu5DE;
    public final ye OOA6hdeuvCS;
    public final x9 WIEu4Ya2g8;
    public final au0 WRKkgoJXwDn;
    public final j6IIN2O8eOU WdrkLMV3xh;
    public final ig0 XnEVoBF0td1l;
    public xo0 Y6hRI1cF8;
    public final hg0 YmKjaVtbfp5Z;
    public final qx arNh8D4Z5gB;
    public df cilMamHF;
    public final x9 iwATDS1i01k;
    public l21 jivtDDk9H;
    public int lv06NcmrQ;
    public boolean mE4lRynR;
    public final kg0 mOu10nynGul;
    public int pog2g9KITJA;
    public final hg0 rQPn8YBR;
    public final hg0 uFEq9NpZ;
    public final AtomicReference AvO7iQsrTN = new AtomicReference(null);
    public final Object encWxUiV2 = new Object();

    public df(ye yeVar, ac1 ac1Var) {
        this.OOA6hdeuvCS = yeVar;
        this.EljAMC1QTz = ac1Var;
        kg0 kg0Var = new kg0(new ig0());
        this.mOu10nynGul = kg0Var;
        z21 z21Var = new z21();
        if (yeVar.xqGvceK5x()) {
            z21Var.iwATDS1i01k = new rf0();
        }
        if (yeVar.EljAMC1QTz()) {
            z21Var.Yi7zF1RB1();
        }
        this.JFJ3QoxA = z21Var;
        this.rQPn8YBR = b70.WIEu4Ya2g8();
        this.E7jCp8Ls = new ig0();
        this.XnEVoBF0td1l = new ig0();
        this.uFEq9NpZ = b70.WIEu4Ya2g8();
        x9 x9Var = new x9();
        this.iwATDS1i01k = x9Var;
        x9 x9Var2 = new x9();
        this.WIEu4Ya2g8 = x9Var2;
        this.YmKjaVtbfp5Z = b70.WIEu4Ya2g8();
        this.Mjvvu5DE = b70.WIEu4Ya2g8();
        j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(7, yeVar);
        this.WdrkLMV3xh = j6iin2o8eou;
        this.WRKkgoJXwDn = new au0();
        qx qxVar = new qx(ac1Var, yeVar, b31.xqGvceK5x(z21Var), kg0Var, x9Var, x9Var2, j6iin2o8eou, this);
        yeVar.WIEu4Ya2g8(qxVar);
        this.arNh8D4Z5gB = qxVar;
    }

    public final void AvO7iQsrTN() {
        au0 au0Var;
        synchronized (this.encWxUiV2) {
            try {
                this.arNh8D4Z5gB.cilMamHF = null;
                if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                    au0Var = this.WRKkgoJXwDn;
                    try {
                        au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                        au0Var.Yi7zF1RB1();
                        au0Var.GWasM1elztuh();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                        au0Var = this.WRKkgoJXwDn;
                        try {
                            au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                            au0Var.Yi7zF1RB1();
                            au0Var.GWasM1elztuh();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    GWasM1elztuh();
                    throw th2;
                }
            }
        }
    }

    public final void E7jCp8Ls() {
        au0 au0Var;
        synchronized (this.encWxUiV2) {
            try {
                if (this.Y6hRI1cF8 != null) {
                    tq0.Yi7zF1RB1("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.JFJ3QoxA.EljAMC1QTz == 0;
                try {
                    try {
                        if (z) {
                            if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                            }
                            this.rQPn8YBR.GWasM1elztuh();
                            this.uFEq9NpZ.GWasM1elztuh();
                            this.Mjvvu5DE.GWasM1elztuh();
                            this.iwATDS1i01k.Mjvvu5DE.DmJncFq5();
                            this.WIEu4Ya2g8.Mjvvu5DE.DmJncFq5();
                            qx qxVar = this.arNh8D4Z5gB;
                            qxVar.ozMwhSAI.clear();
                            qxVar.mE4lRynR.clear();
                            qxVar.OOA6hdeuvCS.Mjvvu5DE.DmJncFq5();
                            qxVar.cilMamHF = null;
                            this.pog2g9KITJA = 1;
                        }
                        au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                        if (!z) {
                            z21 z21Var = this.JFJ3QoxA;
                            au0 au0Var2 = this.WRKkgoJXwDn;
                            c31 OOA6hdeuvCS = z21Var.OOA6hdeuvCS();
                            try {
                                OOA6hdeuvCS.uFEq9NpZ(OOA6hdeuvCS.jivtDDk9H, new t7(7, au0Var2, OOA6hdeuvCS));
                                OOA6hdeuvCS.OOA6hdeuvCS(true);
                                this.EljAMC1QTz.AvO7iQsrTN();
                                au0Var.X1lG3V04pd();
                            } catch (Throwable th) {
                                OOA6hdeuvCS.OOA6hdeuvCS(false);
                                throw th;
                            }
                        }
                        au0Var.Yi7zF1RB1();
                        au0Var.GWasM1elztuh();
                        this.rQPn8YBR.GWasM1elztuh();
                        this.uFEq9NpZ.GWasM1elztuh();
                        this.Mjvvu5DE.GWasM1elztuh();
                        this.iwATDS1i01k.Mjvvu5DE.DmJncFq5();
                        this.WIEu4Ya2g8.Mjvvu5DE.DmJncFq5();
                        qx qxVar2 = this.arNh8D4Z5gB;
                        qxVar2.ozMwhSAI.clear();
                        qxVar2.mE4lRynR.clear();
                        qxVar2.OOA6hdeuvCS.Mjvvu5DE.DmJncFq5();
                        qxVar2.cilMamHF = null;
                        this.pog2g9KITJA = 1;
                    } catch (Throwable th2) {
                        au0Var.GWasM1elztuh();
                        throw th2;
                    }
                    au0Var = this.WRKkgoJXwDn;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void EljAMC1QTz() {
        synchronized (this.encWxUiV2) {
            try {
                x9 x9Var = this.WIEu4Ya2g8;
                x9Var.getClass();
                if (!x9Var.Mjvvu5DE.rezfBrjOrqK()) {
                    OOA6hdeuvCS(this.WIEu4Ya2g8);
                }
            } catch (Throwable th) {
                try {
                    if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                        au0 au0Var = this.WRKkgoJXwDn;
                        try {
                            au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                            au0Var.Yi7zF1RB1();
                            au0Var.GWasM1elztuh();
                        } catch (Throwable th2) {
                            au0Var.GWasM1elztuh();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void GWasM1elztuh() {
        this.AvO7iQsrTN.set(null);
        this.iwATDS1i01k.Mjvvu5DE.DmJncFq5();
        this.WIEu4Ya2g8.Mjvvu5DE.DmJncFq5();
        kg0 kg0Var = this.mOu10nynGul;
        if (kg0Var.OOA6hdeuvCS.AvO7iQsrTN()) {
            return;
        }
        au0 au0Var = this.WRKkgoJXwDn;
        try {
            au0Var.AvO7iQsrTN(kg0Var, this.arNh8D4Z5gB.arNh8D4Z5gB());
            au0Var.Yi7zF1RB1();
        } finally {
            au0Var.GWasM1elztuh();
        }
    }

    public final void JFJ3QoxA(lv lvVar) {
        try {
            synchronized (this.encWxUiV2) {
                uFEq9NpZ();
                hg0 hg0Var = this.Mjvvu5DE;
                this.Mjvvu5DE = b70.WIEu4Ya2g8();
                try {
                    qx qxVar = this.arNh8D4Z5gB;
                    l21 l21Var = this.jivtDDk9H;
                    if (!qxVar.OOA6hdeuvCS.Mjvvu5DE.rezfBrjOrqK()) {
                        we.GWasM1elztuh("Expected applyChanges() to have been called");
                    }
                    qxVar.VeqTn1PQw7 = l21Var;
                    try {
                        qxVar.uFEq9NpZ(hg0Var, lvVar);
                    } finally {
                        qxVar.VeqTn1PQw7 = null;
                    }
                } catch (Throwable th) {
                    this.Mjvvu5DE = hg0Var;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                    au0 au0Var = this.WRKkgoJXwDn;
                    try {
                        au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                        au0Var.Yi7zF1RB1();
                        au0Var.GWasM1elztuh();
                    } catch (Throwable th3) {
                        au0Var.GWasM1elztuh();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                GWasM1elztuh();
                throw th4;
            }
        }
    }

    public final void Mjvvu5DE(ArrayList arrayList) {
        kg0 kg0Var = this.mOu10nynGul;
        qx qxVar = this.arNh8D4Z5gB;
        if (arrayList.size() > 0) {
            ((gf0) ((rn0) arrayList.get(0)).OOA6hdeuvCS).getClass();
            we.GWasM1elztuh("Check failed");
        }
        try {
            qxVar.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    qxVar.M3K9sHhK(arrayList);
                    qxVar.mOu10nynGul();
                } catch (Throwable th) {
                    qxVar.GWasM1elztuh();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!kg0Var.OOA6hdeuvCS.AvO7iQsrTN()) {
                    au0 au0Var = this.WRKkgoJXwDn;
                    try {
                        au0Var.AvO7iQsrTN(kg0Var, qxVar.arNh8D4Z5gB());
                        au0Var.Yi7zF1RB1();
                        au0Var.GWasM1elztuh();
                    } catch (Throwable th3) {
                        au0Var.GWasM1elztuh();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                GWasM1elztuh();
                throw th4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #7 {all -> 0x003e, blocks: (B:3:0x0013, B:5:0x0035, B:7:0x0039, B:11:0x0047, B:12:0x004b, B:16:0x0056, B:29:0x0081, B:31:0x008e, B:148:0x0043), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OOA6hdeuvCS(x9 x9Var) {
        m4 m4Var;
        au0 au0Var;
        c31 OOA6hdeuvCS;
        au0 au0Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        au0 au0Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        x9 x9Var2 = this.WIEu4Ya2g8;
        qx qxVar = this.arNh8D4Z5gB;
        bf arNh8D4Z5gB = qxVar.arNh8D4Z5gB();
        au0 au0Var4 = this.WRKkgoJXwDn;
        au0Var4.AvO7iQsrTN(this.mOu10nynGul, arNh8D4Z5gB);
        try {
            if (x9Var.Mjvvu5DE.rezfBrjOrqK()) {
                try {
                    if (x9Var2.Mjvvu5DE.rezfBrjOrqK() && this.Y6hRI1cF8 == null) {
                        au0Var4.Yi7zF1RB1();
                    }
                    return;
                } finally {
                }
            }
            xo0 xo0Var = this.Y6hRI1cF8;
            if (xo0Var == null || (m4Var = xo0Var.E7jCp8Ls) == null) {
                m4Var = this.EljAMC1QTz;
            }
            try {
                Trace.beginSection(m4Var.equals(xo0Var != null ? xo0Var.E7jCp8Ls : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    xo0 xo0Var2 = this.Y6hRI1cF8;
                    try {
                        try {
                            if (xo0Var2 != null) {
                                au0Var = xo0Var2.rQPn8YBR;
                                if (au0Var == null) {
                                }
                                z21 z21Var = this.JFJ3QoxA;
                                bf arNh8D4Z5gB2 = qxVar.arNh8D4Z5gB();
                                OOA6hdeuvCS = b31.xqGvceK5x(z21Var).OOA6hdeuvCS();
                                int i3 = 0;
                                x9Var.MjxSquD6Av(m4Var, OOA6hdeuvCS, au0Var, arNh8D4Z5gB2);
                                OOA6hdeuvCS.OOA6hdeuvCS(true);
                                m4Var.AvO7iQsrTN();
                                Trace.endSection();
                                au0Var4.X1lG3V04pd();
                                au0Var4.xqGvceK5x();
                                if (this.mE4lRynR) {
                                    au0Var2 = au0Var4;
                                } else {
                                    Trace.beginSection("Compose:unobserve");
                                    try {
                                        this.mE4lRynR = false;
                                        hg0 hg0Var = this.rQPn8YBR;
                                        long[] jArr3 = hg0Var.GWasM1elztuh;
                                        int length = jArr3.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j4 = jArr3[i4];
                                                char c2 = 7;
                                                long j5 = -9187201950435737472L;
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8;
                                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                    int i7 = i3;
                                                    while (i7 < i6) {
                                                        if ((j4 & 255) < 128) {
                                                            c = c2;
                                                            int i8 = (i4 << 3) + i7;
                                                            j2 = j5;
                                                            Object obj = hg0Var.Yi7zF1RB1[i8];
                                                            Object obj2 = hg0Var.X1lG3V04pd[i8];
                                                            if (obj2 instanceof ig0) {
                                                                ig0 ig0Var = (ig0) obj2;
                                                                Object[] objArr = ig0Var.Yi7zF1RB1;
                                                                long[] jArr4 = ig0Var.GWasM1elztuh;
                                                                int i9 = i5;
                                                                int length2 = jArr4.length - 2;
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                au0Var3 = au0Var4;
                                                                if (length2 >= 0) {
                                                                    int i10 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            long j6 = jArr4[i10];
                                                                            j = j4;
                                                                            long[] jArr5 = jArr4;
                                                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                                for (int i12 = 0; i12 < i11; i12++) {
                                                                                    if ((j6 & 255) < 128) {
                                                                                        j3 = j6;
                                                                                        int i13 = (i10 << 3) + i12;
                                                                                        if (!((at0) objArr[i13]).GWasM1elztuh()) {
                                                                                            ig0Var.XnEVoBF0td1l(i13);
                                                                                        }
                                                                                    } else {
                                                                                        j3 = j6;
                                                                                    }
                                                                                    j6 = j3 >> i9;
                                                                                }
                                                                                if (i11 != i9) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i10 == length2) {
                                                                                break;
                                                                            }
                                                                            i10++;
                                                                            jArr4 = jArr5;
                                                                            j4 = j;
                                                                            i9 = 8;
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            Trace.endSection();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } else {
                                                                    j = j4;
                                                                }
                                                                z = ig0Var.AvO7iQsrTN();
                                                            } else {
                                                                i = i7;
                                                                jArr2 = jArr3;
                                                                au0Var3 = au0Var4;
                                                                j = j4;
                                                                obj2.getClass();
                                                                z = !((at0) obj2).GWasM1elztuh();
                                                            }
                                                            if (z) {
                                                                hg0Var.E7jCp8Ls(i8);
                                                            }
                                                            i2 = 8;
                                                        } else {
                                                            i = i7;
                                                            jArr2 = jArr3;
                                                            au0Var3 = au0Var4;
                                                            j = j4;
                                                            c = c2;
                                                            j2 = j5;
                                                            i2 = i5;
                                                        }
                                                        j4 = j >> i2;
                                                        i7 = i + 1;
                                                        i5 = i2;
                                                        c2 = c;
                                                        j5 = j2;
                                                        au0Var4 = au0Var3;
                                                        jArr3 = jArr2;
                                                    }
                                                    jArr = jArr3;
                                                    au0Var2 = au0Var4;
                                                    if (i6 != i5) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr3;
                                                    au0Var2 = au0Var4;
                                                }
                                                if (i4 == length) {
                                                    break;
                                                }
                                                i4++;
                                                au0Var4 = au0Var2;
                                                jArr3 = jArr;
                                                i3 = 0;
                                            }
                                        } else {
                                            au0Var2 = au0Var4;
                                        }
                                        encWxUiV2();
                                        Trace.endSection();
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (x9Var2.Mjvvu5DE.rezfBrjOrqK() && this.Y6hRI1cF8 == null) {
                                    au0Var2.Yi7zF1RB1();
                                }
                                return;
                            }
                            if (x9Var2.Mjvvu5DE.rezfBrjOrqK()) {
                                au0Var2.Yi7zF1RB1();
                            }
                            return;
                        } finally {
                            au0Var2.GWasM1elztuh();
                        }
                        x9Var.MjxSquD6Av(m4Var, OOA6hdeuvCS, au0Var, arNh8D4Z5gB2);
                        OOA6hdeuvCS.OOA6hdeuvCS(true);
                        m4Var.AvO7iQsrTN();
                        Trace.endSection();
                        au0Var4.X1lG3V04pd();
                        au0Var4.xqGvceK5x();
                        if (this.mE4lRynR) {
                        }
                    } catch (Throwable th3) {
                        try {
                            OOA6hdeuvCS.OOA6hdeuvCS(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                    au0Var = au0Var4;
                    z21 z21Var2 = this.JFJ3QoxA;
                    bf arNh8D4Z5gB22 = qxVar.arNh8D4Z5gB();
                    OOA6hdeuvCS = b31.xqGvceK5x(z21Var2).OOA6hdeuvCS();
                    int i32 = 0;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (x9Var2.Mjvvu5DE.rezfBrjOrqK() && this.Y6hRI1cF8 == null) {
                        au0Var4.Yi7zF1RB1();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void WIEu4Ya2g8() {
        bq bqVar = bq.OOA6hdeuvCS;
        AtomicReference atomicReference = this.AvO7iQsrTN;
        Object andSet = atomicReference.getAndSet(bqVar);
        if (o30.rQPn8YBR(andSet, vc0.X1lG3V04pd) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            X1lG3V04pd((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            we.Yi7zF1RB1("corrupt pendingModifications drain: " + atomicReference);
            throw new vc();
        }
        for (Set set : (Set[]) andSet) {
            X1lG3V04pd(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WRKkgoJXwDn(Object obj) {
        at0 WdrkLMV3xh;
        int i;
        boolean z;
        int i2;
        qx qxVar = this.arNh8D4Z5gB;
        if (qxVar.pog2g9KITJA > 0 || (WdrkLMV3xh = qxVar.WdrkLMV3xh()) == null) {
            return;
        }
        int i3 = WdrkLMV3xh.Yi7zF1RB1 | 1;
        WdrkLMV3xh.Yi7zF1RB1 = i3;
        if ((i3 & 32) == 0) {
            zf0 zf0Var = WdrkLMV3xh.EljAMC1QTz;
            if (zf0Var == null) {
                zf0Var = new zf0();
                WdrkLMV3xh.EljAMC1QTz = zf0Var;
            }
            int i4 = WdrkLMV3xh.OOA6hdeuvCS;
            int X1lG3V04pd = zf0Var.X1lG3V04pd(obj);
            if (X1lG3V04pd < 0) {
                X1lG3V04pd = ~X1lG3V04pd;
                i = -1;
            } else {
                i = zf0Var.X1lG3V04pd[X1lG3V04pd];
            }
            zf0Var.Yi7zF1RB1[X1lG3V04pd] = obj;
            zf0Var.X1lG3V04pd[X1lG3V04pd] = i4;
            if (i == WdrkLMV3xh.OOA6hdeuvCS) {
                z = true;
                this.WdrkLMV3xh.X1lG3V04pd();
                if (z) {
                    if (obj instanceof t51) {
                        ((t51) obj).EljAMC1QTz(1);
                    }
                    b70.E7jCp8Ls(this.rQPn8YBR, obj, WdrkLMV3xh);
                    if (obj instanceof ml) {
                        ml mlVar = (ml) obj;
                        ll encWxUiV2 = mlVar.encWxUiV2();
                        hg0 hg0Var = this.uFEq9NpZ;
                        b70.AEn1Rrio(hg0Var, obj);
                        zf0 zf0Var2 = encWxUiV2.OOA6hdeuvCS;
                        Object[] objArr = zf0Var2.Yi7zF1RB1;
                        long[] jArr = zf0Var2.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8;
                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j & 255) < 128) {
                                            s51 s51Var = (s51) objArr[(i5 << 3) + i8];
                                            i2 = i6;
                                            if (s51Var instanceof t51) {
                                                ((t51) s51Var).EljAMC1QTz(1);
                                            }
                                            b70.E7jCp8Ls(hg0Var, s51Var, obj);
                                        } else {
                                            i2 = i6;
                                        }
                                        j >>= i2;
                                        i8++;
                                        i6 = i2;
                                    }
                                    if (i7 != i6) {
                                        break;
                                    }
                                }
                                if (i5 == length) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        Object obj2 = encWxUiV2.EljAMC1QTz;
                        hg0 hg0Var2 = WdrkLMV3xh.AvO7iQsrTN;
                        if (hg0Var2 == null) {
                            hg0Var2 = new hg0();
                            WdrkLMV3xh.AvO7iQsrTN = hg0Var2;
                        }
                        hg0Var2.XnEVoBF0td1l(mlVar, obj2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        this.WdrkLMV3xh.X1lG3V04pd();
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void WdrkLMV3xh(mx0 mx0Var) {
        mx0 mx0Var2;
        while (true) {
            Object obj = this.AvO7iQsrTN.get();
            if (obj == null || obj.equals(vc0.X1lG3V04pd)) {
                mx0Var2 = mx0Var;
            } else if (obj instanceof Set) {
                mx0Var2 = new Set[]{obj, mx0Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.AvO7iQsrTN).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = mx0Var;
                mx0Var2 = copyOf;
            }
            AtomicReference atomicReference = this.AvO7iQsrTN;
            while (!atomicReference.compareAndSet(obj, mx0Var2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.encWxUiV2) {
                    iwATDS1i01k();
                }
                return;
            }
            return;
        }
    }

    public final void X1lG3V04pd(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean X1lG3V04pd;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof mx0;
        hg0 hg0Var = this.uFEq9NpZ;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            ig0 ig0Var = ((mx0) set).OOA6hdeuvCS;
            Object[] objArr = ig0Var.Yi7zF1RB1;
            long[] jArr10 = ig0Var.GWasM1elztuh;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof at0) {
                                    ((at0) obj2).Yi7zF1RB1(obj);
                                } else {
                                    Yi7zF1RB1(obj2, z);
                                    Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(obj2);
                                    if (AvO7iQsrTN != null) {
                                        if (AvO7iQsrTN instanceof ig0) {
                                            ig0 ig0Var2 = (ig0) AvO7iQsrTN;
                                            Object[] objArr2 = ig0Var2.Yi7zF1RB1;
                                            long[] jArr11 = ig0Var2.GWasM1elztuh;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                Yi7zF1RB1((ml) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            Yi7zF1RB1((ml) AvO7iQsrTN, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof at0) {
                    ((at0) obj3).Yi7zF1RB1(null);
                } else {
                    Yi7zF1RB1(obj3, z);
                    Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(obj3);
                    if (AvO7iQsrTN2 != null) {
                        if (AvO7iQsrTN2 instanceof ig0) {
                            ig0 ig0Var3 = (ig0) AvO7iQsrTN2;
                            Object[] objArr3 = ig0Var3.Yi7zF1RB1;
                            long[] jArr13 = ig0Var3.GWasM1elztuh;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                Yi7zF1RB1((ml) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            Yi7zF1RB1((ml) AvO7iQsrTN2, z);
                        }
                    }
                }
            }
        }
        hg0 hg0Var2 = this.rQPn8YBR;
        ig0 ig0Var4 = this.E7jCp8Ls;
        if (z) {
            ig0 ig0Var5 = this.XnEVoBF0td1l;
            if (ig0Var5.encWxUiV2()) {
                long[] jArr14 = hg0Var2.GWasM1elztuh;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = hg0Var2.Yi7zF1RB1[i18];
                                    Object obj5 = hg0Var2.X1lG3V04pd[i18];
                                    if (obj5 instanceof ig0) {
                                        ig0 ig0Var6 = (ig0) obj5;
                                        Object[] objArr4 = ig0Var6.Yi7zF1RB1;
                                        long[] jArr15 = ig0Var6.GWasM1elztuh;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            at0 at0Var = (at0) objArr5[i22];
                                                            if (ig0Var5.X1lG3V04pd(at0Var) || ig0Var4.X1lG3V04pd(at0Var)) {
                                                                ig0Var6.XnEVoBF0td1l(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = ig0Var6.AvO7iQsrTN();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        at0 at0Var2 = (at0) obj5;
                                        z2 = ig0Var5.X1lG3V04pd(at0Var2) || ig0Var4.X1lG3V04pd(at0Var2);
                                    }
                                    if (z2) {
                                        hg0Var2.E7jCp8Ls(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                ig0Var5.Yi7zF1RB1();
                encWxUiV2();
                return;
            }
        }
        if (ig0Var4.encWxUiV2()) {
            long[] jArr17 = hg0Var2.GWasM1elztuh;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = hg0Var2.Yi7zF1RB1[i26];
                                Object obj7 = hg0Var2.X1lG3V04pd[i26];
                                if (obj7 instanceof ig0) {
                                    ig0 ig0Var7 = (ig0) obj7;
                                    Object[] objArr6 = ig0Var7.Yi7zF1RB1;
                                    long[] jArr18 = ig0Var7.GWasM1elztuh;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (ig0Var4.X1lG3V04pd((at0) objArr7[i30])) {
                                                            ig0Var7.XnEVoBF0td1l(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    X1lG3V04pd = ig0Var7.AvO7iQsrTN();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    X1lG3V04pd = ig0Var4.X1lG3V04pd((at0) obj7);
                                }
                                if (X1lG3V04pd) {
                                    hg0Var2.E7jCp8Ls(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            encWxUiV2();
            ig0Var4.Yi7zF1RB1();
        }
    }

    public final void XnEVoBF0td1l() {
        synchronized (this.encWxUiV2) {
            try {
                if (this.arNh8D4Z5gB.AEn1Rrio) {
                    tq0.Yi7zF1RB1("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.pog2g9KITJA != 3) {
                    this.pog2g9KITJA = 3;
                    x9 x9Var = this.arNh8D4Z5gB.HFYAaqMd6;
                    if (x9Var != null) {
                        OOA6hdeuvCS(x9Var);
                    }
                    int i = 1;
                    boolean z = this.JFJ3QoxA.EljAMC1QTz == 0;
                    if (!z || !this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                        au0 au0Var = this.WRKkgoJXwDn;
                        try {
                            au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                            if (!z) {
                                z21 z21Var = this.JFJ3QoxA;
                                au0 au0Var2 = this.WRKkgoJXwDn;
                                c31 OOA6hdeuvCS = z21Var.OOA6hdeuvCS();
                                try {
                                    OOA6hdeuvCS.uFEq9NpZ(OOA6hdeuvCS.jivtDDk9H, new k4(i, au0Var2));
                                    OOA6hdeuvCS.eUH21U3apd();
                                    OOA6hdeuvCS.OOA6hdeuvCS(true);
                                    this.EljAMC1QTz.GWasM1elztuh();
                                    this.EljAMC1QTz.AvO7iQsrTN();
                                    au0Var.X1lG3V04pd();
                                } catch (Throwable th) {
                                    OOA6hdeuvCS.OOA6hdeuvCS(false);
                                    throw th;
                                }
                            }
                            au0Var.Yi7zF1RB1();
                            au0Var.GWasM1elztuh();
                        } catch (Throwable th2) {
                            au0Var.GWasM1elztuh();
                            throw th2;
                        }
                    }
                    qx qxVar = this.arNh8D4Z5gB;
                    qxVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        qxVar.Yi7zF1RB1.Y6hRI1cF8(qxVar);
                        qxVar.ozMwhSAI.clear();
                        qxVar.mE4lRynR.clear();
                        qxVar.OOA6hdeuvCS.Mjvvu5DE.DmJncFq5();
                        qxVar.cilMamHF = null;
                        qxVar.GWasM1elztuh.GWasM1elztuh();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.OOA6hdeuvCS.cilMamHF(this);
    }

    public final void Y6hRI1cF8(Object obj) {
        Object AvO7iQsrTN = this.rQPn8YBR.AvO7iQsrTN(obj);
        if (AvO7iQsrTN == null) {
            return;
        }
        boolean z = AvO7iQsrTN instanceof ig0;
        z30 z30Var = z30.encWxUiV2;
        hg0 hg0Var = this.YmKjaVtbfp5Z;
        if (!z) {
            at0 at0Var = (at0) AvO7iQsrTN;
            if (at0Var.Yi7zF1RB1(obj) == z30Var) {
                b70.E7jCp8Ls(hg0Var, obj, at0Var);
                return;
            }
            return;
        }
        ig0 ig0Var = (ig0) AvO7iQsrTN;
        Object[] objArr = ig0Var.Yi7zF1RB1;
        long[] jArr = ig0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        at0 at0Var2 = (at0) objArr[(i << 3) + i3];
                        if (at0Var2.Yi7zF1RB1(obj) == z30Var) {
                            b70.E7jCp8Ls(hg0Var, obj, at0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void Yi7zF1RB1(Object obj, boolean z) {
        Object AvO7iQsrTN = this.rQPn8YBR.AvO7iQsrTN(obj);
        if (AvO7iQsrTN == null) {
            return;
        }
        boolean z2 = AvO7iQsrTN instanceof ig0;
        z30 z30Var = z30.OOA6hdeuvCS;
        ig0 ig0Var = this.E7jCp8Ls;
        ig0 ig0Var2 = this.XnEVoBF0td1l;
        hg0 hg0Var = this.YmKjaVtbfp5Z;
        if (!z2) {
            at0 at0Var = (at0) AvO7iQsrTN;
            if (b70.ozMwhSAI(hg0Var, obj, at0Var) || at0Var.Yi7zF1RB1(obj) == z30Var) {
                return;
            }
            if (at0Var.AvO7iQsrTN == null || z) {
                ig0Var.GWasM1elztuh(at0Var);
                return;
            } else {
                ig0Var2.GWasM1elztuh(at0Var);
                return;
            }
        }
        ig0 ig0Var3 = (ig0) AvO7iQsrTN;
        Object[] objArr = ig0Var3.Yi7zF1RB1;
        long[] jArr = ig0Var3.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        at0 at0Var2 = (at0) objArr[(i << 3) + i3];
                        if (!b70.ozMwhSAI(hg0Var, obj, at0Var2) && at0Var2.Yi7zF1RB1(obj) != z30Var) {
                            if (at0Var2.AvO7iQsrTN == null || z) {
                                ig0Var.GWasM1elztuh(at0Var2);
                            } else {
                                ig0Var2.GWasM1elztuh(at0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void YmKjaVtbfp5Z() {
        int i = this.pog2g9KITJA;
        if (i != 0) {
            tq0.Yi7zF1RB1(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.Y6hRI1cF8 == null) {
            return;
        }
        tq0.Yi7zF1RB1("A pausable composition is in progress");
    }

    public final void arNh8D4Z5gB(Object obj) {
        synchronized (this.encWxUiV2) {
            try {
                Y6hRI1cF8(obj);
                Object AvO7iQsrTN = this.uFEq9NpZ.AvO7iQsrTN(obj);
                if (AvO7iQsrTN != null) {
                    if (AvO7iQsrTN instanceof ig0) {
                        ig0 ig0Var = (ig0) AvO7iQsrTN;
                        Object[] objArr = ig0Var.Yi7zF1RB1;
                        long[] jArr = ig0Var.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Y6hRI1cF8((ml) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        Y6hRI1cF8((ml) AvO7iQsrTN);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cilMamHF(Set set) {
        boolean z = set instanceof mx0;
        hg0 hg0Var = this.uFEq9NpZ;
        hg0 hg0Var2 = this.rQPn8YBR;
        if (z) {
            ig0 ig0Var = ((mx0) set).OOA6hdeuvCS;
            Object[] objArr = ig0Var.Yi7zF1RB1;
            long[] jArr = ig0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (hg0Var2.X1lG3V04pd(obj) || hg0Var.X1lG3V04pd(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            for (Object obj2 : set) {
                if (hg0Var2.X1lG3V04pd(obj2) || hg0Var.X1lG3V04pd(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void encWxUiV2() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        hg0 hg0Var = this.uFEq9NpZ;
        long[] jArr3 = hg0Var.GWasM1elztuh;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = hg0Var.Yi7zF1RB1[i10];
                            Object obj2 = hg0Var.X1lG3V04pd[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof ig0;
                            j5 = j8;
                            hg0 hg0Var2 = this.rQPn8YBR;
                            if (z2) {
                                ig0 ig0Var = (ig0) obj2;
                                Object[] objArr = ig0Var.Yi7zF1RB1;
                                long[] jArr4 = ig0Var.GWasM1elztuh;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!hg0Var2.X1lG3V04pd((ml) objArr[i15])) {
                                                        ig0Var.XnEVoBF0td1l(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = ig0Var.AvO7iQsrTN();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !hg0Var2.X1lG3V04pd((ml) obj2);
                            }
                            if (z) {
                                hg0Var.E7jCp8Ls(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        ig0 ig0Var2 = this.XnEVoBF0td1l;
        if (!ig0Var2.encWxUiV2()) {
            return;
        }
        Object[] objArr2 = ig0Var2.Yi7zF1RB1;
        long[] jArr5 = ig0Var2.GWasM1elztuh;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((at0) objArr2[i20]).AvO7iQsrTN == null) {
                            ig0Var2.XnEVoBF0td1l(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final void iwATDS1i01k() {
        AtomicReference atomicReference = this.AvO7iQsrTN;
        Object andSet = atomicReference.getAndSet(null);
        if (o30.rQPn8YBR(andSet, vc0.X1lG3V04pd)) {
            return;
        }
        if (andSet instanceof Set) {
            X1lG3V04pd((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                X1lG3V04pd(set, false);
            }
            return;
        }
        if (andSet != null) {
            we.Yi7zF1RB1("corrupt pendingModifications drain: " + atomicReference);
            throw new vc();
        }
        if (this.Y6hRI1cF8 == null) {
            we.GWasM1elztuh("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final z30 jivtDDk9H(at0 at0Var, lx lxVar, Object obj) {
        df dfVar;
        synchronized (this.encWxUiV2) {
            try {
                df dfVar2 = this.cilMamHF;
                if (dfVar2 != null) {
                    z21 z21Var = this.JFJ3QoxA;
                    int i = this.lv06NcmrQ;
                    if (z21Var.rQPn8YBR) {
                        we.GWasM1elztuh("Writer is active");
                    }
                    if (i < 0 || i >= z21Var.EljAMC1QTz) {
                        we.GWasM1elztuh("Invalid group index");
                    }
                    lx E7jCp8Ls = rj0.E7jCp8Ls(lxVar);
                    if (z21Var.EljAMC1QTz(E7jCp8Ls)) {
                        int i2 = z21Var.OOA6hdeuvCS[(i * 5) + 3] + i;
                        int i3 = E7jCp8Ls.GWasM1elztuh;
                        dfVar = (i <= i3 && i3 < i2) ? dfVar2 : null;
                    }
                    dfVar2 = null;
                }
                if (dfVar == null) {
                    qx qxVar = this.arNh8D4Z5gB;
                    if (qxVar.AEn1Rrio && qxVar.ZCWXqiC0(at0Var, obj)) {
                        return z30.encWxUiV2;
                    }
                    if (obj == null) {
                        this.Mjvvu5DE.XnEVoBF0td1l(at0Var, b9xEq24R1.Fm8W7vP7q);
                    } else {
                        boolean z = obj instanceof ml;
                        hg0 hg0Var = this.Mjvvu5DE;
                        if (z) {
                            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(at0Var);
                            if (AvO7iQsrTN != null) {
                                if (AvO7iQsrTN instanceof ig0) {
                                    ig0 ig0Var = (ig0) AvO7iQsrTN;
                                    Object[] objArr = ig0Var.Yi7zF1RB1;
                                    long[] jArr = ig0Var.GWasM1elztuh;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == b9xEq24R1.Fm8W7vP7q) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (AvO7iQsrTN == b9xEq24R1.Fm8W7vP7q) {
                                }
                            }
                            b70.E7jCp8Ls(this.Mjvvu5DE, at0Var, obj);
                        } else {
                            hg0Var.XnEVoBF0td1l(at0Var, b9xEq24R1.Fm8W7vP7q);
                        }
                    }
                }
                if (dfVar != null) {
                    return dfVar.jivtDDk9H(at0Var, lxVar, obj);
                }
                this.OOA6hdeuvCS.E7jCp8Ls(this);
                return this.arNh8D4Z5gB.AEn1Rrio ? z30.AvO7iQsrTN : z30.EljAMC1QTz;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean lv06NcmrQ() {
        synchronized (this.encWxUiV2) {
            xo0 xo0Var = this.Y6hRI1cF8;
            boolean z = false;
            if (xo0Var != null && (xo0Var.encWxUiV2.get() != zo0.mOu10nynGul || xo0Var.mOu10nynGul != z50.XnEVoBF0td1l())) {
                AtomicReference atomicReference = xo0Var.encWxUiV2;
                zo0 zo0Var = zo0.JFJ3QoxA;
                zo0 zo0Var2 = zo0.encWxUiV2;
                while (!atomicReference.compareAndSet(zo0Var, zo0Var2) && atomicReference.get() == zo0Var) {
                }
                xo0Var.E7jCp8Ls.OOA6hdeuvCS.GWasM1elztuh(9);
                return false;
            }
            uFEq9NpZ();
            try {
                hg0 hg0Var = this.Mjvvu5DE;
                this.Mjvvu5DE = b70.WIEu4Ya2g8();
                try {
                    qx qxVar = this.arNh8D4Z5gB;
                    l21 l21Var = this.jivtDDk9H;
                    vm0 vm0Var = qxVar.OOA6hdeuvCS.Mjvvu5DE;
                    if (!vm0Var.rezfBrjOrqK()) {
                        we.GWasM1elztuh("Expected applyChanges() to have been called");
                    }
                    if (hg0Var.OOA6hdeuvCS > 0 || !qxVar.mE4lRynR.isEmpty()) {
                        qxVar.VeqTn1PQw7 = l21Var;
                        try {
                            qxVar.uFEq9NpZ(hg0Var, null);
                            qxVar.VeqTn1PQw7 = null;
                            z = !vm0Var.rezfBrjOrqK();
                        } catch (Throwable th) {
                            qxVar.VeqTn1PQw7 = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        iwATDS1i01k();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.Mjvvu5DE = hg0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                        au0 au0Var = this.WRKkgoJXwDn;
                        try {
                            au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                            au0Var.Yi7zF1RB1();
                            au0Var.GWasM1elztuh();
                        } catch (Throwable th4) {
                            au0Var.GWasM1elztuh();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    GWasM1elztuh();
                    throw th5;
                }
            }
        }
    }

    public final z30 mE4lRynR(at0 at0Var, Object obj) {
        df dfVar;
        int i = at0Var.Yi7zF1RB1;
        if ((i & 2) != 0) {
            at0Var.Yi7zF1RB1 = i | 4;
        }
        lx lxVar = at0Var.X1lG3V04pd;
        if (lxVar == null || !lxVar.GWasM1elztuh()) {
            return z30.OOA6hdeuvCS;
        }
        z21 z21Var = this.JFJ3QoxA;
        z21Var.getClass();
        lx lxVar2 = at0Var.X1lG3V04pd;
        if (lxVar2 != null && z21Var.EljAMC1QTz(rj0.E7jCp8Ls(lxVar2))) {
            if (at0Var.xqGvceK5x == null) {
                return z30.OOA6hdeuvCS;
            }
            z30 jivtDDk9H = jivtDDk9H(at0Var, lxVar, obj);
            if (jivtDDk9H != z30.OOA6hdeuvCS) {
                this.WdrkLMV3xh.X1lG3V04pd();
            }
            return jivtDDk9H;
        }
        synchronized (this.encWxUiV2) {
            dfVar = this.cilMamHF;
        }
        if (dfVar != null) {
            qx qxVar = dfVar.arNh8D4Z5gB;
            if (qxVar.AEn1Rrio && qxVar.ZCWXqiC0(at0Var, obj)) {
                return z30.encWxUiV2;
            }
        }
        return z30.OOA6hdeuvCS;
    }

    public final boolean mOu10nynGul() {
        boolean z;
        synchronized (this.encWxUiV2) {
            z = true;
            if (this.pog2g9KITJA != 1) {
                z = false;
            }
            if (z) {
                this.pog2g9KITJA = 0;
            }
        }
        return z;
    }

    public final void pog2g9KITJA(lv lvVar) {
        boolean mOu10nynGul = mOu10nynGul();
        YmKjaVtbfp5Z();
        ye yeVar = this.OOA6hdeuvCS;
        if (!mOu10nynGul) {
            yeVar.GWasM1elztuh(this, lvVar);
            return;
        }
        qx qxVar = this.arNh8D4Z5gB;
        qxVar.arNh8D4Z5gB = 0;
        qxVar.WRKkgoJXwDn = true;
        yeVar.GWasM1elztuh(this, lvVar);
        qxVar.mE4lRynR();
    }

    public final xo0 rQPn8YBR(boolean z, lv lvVar) {
        if (this.Y6hRI1cF8 != null) {
            tq0.Yi7zF1RB1("A pausable composition is in progress");
        }
        xo0 xo0Var = new xo0(this, this.OOA6hdeuvCS, this.arNh8D4Z5gB, this.mOu10nynGul, lvVar, z, this.EljAMC1QTz, this.encWxUiV2);
        this.Y6hRI1cF8 = xo0Var;
        return xo0Var;
    }

    public final void uFEq9NpZ() {
        Object obj = vc0.X1lG3V04pd;
        AtomicReference atomicReference = this.AvO7iQsrTN;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                we.Yi7zF1RB1("pending composition has not been applied");
                throw new vc();
            }
            if (andSet instanceof Set) {
                X1lG3V04pd((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                we.Yi7zF1RB1("corrupt pendingModifications drain: " + atomicReference);
                throw new vc();
            }
            for (Set set : (Set[]) andSet) {
                X1lG3V04pd(set, true);
            }
        }
    }

    public final void xqGvceK5x() {
        synchronized (this.encWxUiV2) {
            try {
                OOA6hdeuvCS(this.iwATDS1i01k);
                iwATDS1i01k();
            } catch (Throwable th) {
                try {
                    if (!this.mOu10nynGul.OOA6hdeuvCS.AvO7iQsrTN()) {
                        au0 au0Var = this.WRKkgoJXwDn;
                        try {
                            au0Var.AvO7iQsrTN(this.mOu10nynGul, this.arNh8D4Z5gB.arNh8D4Z5gB());
                            au0Var.Yi7zF1RB1();
                            au0Var.GWasM1elztuh();
                        } catch (Throwable th2) {
                            au0Var.GWasM1elztuh();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    GWasM1elztuh();
                    throw th3;
                }
            }
        }
    }
}
