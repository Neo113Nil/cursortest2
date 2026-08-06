package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class v60 implements be {
    public r61 AvO7iQsrTN;
    public final p60 E7jCp8Ls;
    public ye EljAMC1QTz;
    public final hg0 JFJ3QoxA;
    public int Mjvvu5DE;
    public final g60 OOA6hdeuvCS;
    public final hg0 WIEu4Ya2g8;
    public final m60 XnEVoBF0td1l;
    public final rg0 YmKjaVtbfp5Z;
    public int encWxUiV2;
    public final q61 iwATDS1i01k;
    public final String jivtDDk9H;
    public int mE4lRynR;
    public int mOu10nynGul;
    public final hg0 rQPn8YBR;
    public final hg0 uFEq9NpZ;

    public v60(g60 g60Var, r61 r61Var) {
        this.OOA6hdeuvCS = g60Var;
        this.AvO7iQsrTN = r61Var;
        long[] jArr = kx0.GWasM1elztuh;
        this.JFJ3QoxA = new hg0();
        this.rQPn8YBR = new hg0();
        this.E7jCp8Ls = new p60(this);
        this.XnEVoBF0td1l = new m60(this);
        this.uFEq9NpZ = new hg0();
        this.iwATDS1i01k = new q61();
        this.WIEu4Ya2g8 = new hg0();
        this.YmKjaVtbfp5Z = new rg0(new Object[16]);
        this.jivtDDk9H = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void OOA6hdeuvCS(n60 n60Var) {
        ig0 ig0Var;
        xo0 xo0Var = n60Var.EljAMC1QTz;
        if (xo0Var != null) {
            xo0Var.encWxUiV2.set(zo0.EljAMC1QTz);
            au0 au0Var = xo0Var.rQPn8YBR;
            if (au0Var.xqGvceK5x.encWxUiV2()) {
                ig0Var = au0Var.xqGvceK5x;
                ig0 ig0Var2 = lx0.GWasM1elztuh;
                au0Var.xqGvceK5x = new ig0();
                au0Var.X1lG3V04pd.AvO7iQsrTN();
            } else {
                ig0Var = null;
            }
            au0Var.Yi7zF1RB1();
            df dfVar = xo0Var.GWasM1elztuh;
            dfVar.Y6hRI1cF8 = null;
            if (ig0Var != null) {
                dfVar.WRKkgoJXwDn.rQPn8YBR = ig0Var;
                dfVar.pog2g9KITJA = 2;
            }
            n60Var.EljAMC1QTz = null;
            df dfVar2 = n60Var.X1lG3V04pd;
            if (dfVar2 != null) {
                dfVar2.XnEVoBF0td1l();
            }
            n60Var.X1lG3V04pd = null;
        }
    }

    public static final void X1lG3V04pd(v60 v60Var, Object obj) {
        g60 g60Var = v60Var.OOA6hdeuvCS;
        v60Var.encWxUiV2();
        g60 g60Var2 = (g60) v60Var.uFEq9NpZ.rQPn8YBR(obj);
        if (g60Var2 != null) {
            if (v60Var.mE4lRynR <= 0) {
                t10.Yi7zF1RB1("No pre-composed items to dispose");
            }
            int mOu10nynGul = ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.mOu10nynGul(g60Var2);
            if (mOu10nynGul < ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN - v60Var.mE4lRynR) {
                t10.Yi7zF1RB1("Item is not in pre-composed item range");
            }
            v60Var.Mjvvu5DE++;
            v60Var.mE4lRynR--;
            n60 n60Var = (n60) v60Var.JFJ3QoxA.AvO7iQsrTN(g60Var2);
            if (n60Var != null) {
                OOA6hdeuvCS(n60Var);
            }
            int i = (((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN - v60Var.mE4lRynR) - v60Var.Mjvvu5DE;
            v60Var.JFJ3QoxA(mOu10nynGul, i);
            v60Var.AvO7iQsrTN(i);
        }
        if (v60Var.YmKjaVtbfp5Z.encWxUiV2(obj)) {
            g60.MItybXapHX(g60Var, true, 6);
        }
    }

    public final void AvO7iQsrTN(int i) {
        boolean z;
        boolean z2 = false;
        this.Mjvvu5DE = 0;
        List iwATDS1i01k = this.OOA6hdeuvCS.iwATDS1i01k();
        og0 og0Var = (og0) iwATDS1i01k;
        int i2 = (og0Var.OOA6hdeuvCS.AvO7iQsrTN - this.mE4lRynR) - 1;
        if (i <= i2) {
            this.iwATDS1i01k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object AvO7iQsrTN = this.JFJ3QoxA.AvO7iQsrTN((g60) og0Var.get(i3));
                    AvO7iQsrTN.getClass();
                    ((bg0) this.iwATDS1i01k.EljAMC1QTz).GWasM1elztuh(((n60) AvO7iQsrTN).GWasM1elztuh);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.AvO7iQsrTN.OOA6hdeuvCS(this.iwATDS1i01k);
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            z = false;
            while (i2 >= i) {
                try {
                    g60 g60Var = (g60) ((og0) iwATDS1i01k).get(i2);
                    Object AvO7iQsrTN2 = this.JFJ3QoxA.AvO7iQsrTN(g60Var);
                    AvO7iQsrTN2.getClass();
                    n60 n60Var = (n60) AvO7iQsrTN2;
                    Object obj = n60Var.GWasM1elztuh;
                    if (((bg0) this.iwATDS1i01k.EljAMC1QTz).X1lG3V04pd(obj)) {
                        this.Mjvvu5DE++;
                        if (((Boolean) n60Var.AvO7iQsrTN.getValue()).booleanValue()) {
                            k60 k60Var = g60Var.MZhzXH72;
                            ad0 ad0Var = k60Var.WIEu4Ya2g8;
                            e60 e60Var = e60.AvO7iQsrTN;
                            ad0Var.WIEu4Ya2g8 = e60Var;
                            ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
                            if (ac0Var != null) {
                                ac0Var.uFEq9NpZ = e60Var;
                            }
                            E7jCp8Ls(n60Var, false);
                            if (n60Var.encWxUiV2) {
                                z = true;
                            }
                        }
                    } else {
                        g60 g60Var2 = this.OOA6hdeuvCS;
                        g60Var2.jivtDDk9H = true;
                        this.JFJ3QoxA.rQPn8YBR(g60Var);
                        df dfVar = n60Var.X1lG3V04pd;
                        if (dfVar != null) {
                            dfVar.XnEVoBF0td1l();
                        }
                        this.OOA6hdeuvCS.z19UFEN2I(i2, 1);
                        g60Var2.jivtDDk9H = false;
                    }
                    this.rQPn8YBR.rQPn8YBR(obj);
                    i2--;
                } catch (Throwable th) {
                    d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                    throw th;
                }
            }
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
        } else {
            z = false;
        }
        if (z) {
            synchronized (e41.X1lG3V04pd) {
                ig0 ig0Var = e41.JFJ3QoxA.encWxUiV2;
                if (ig0Var != null) {
                    if (ig0Var.encWxUiV2()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                e41.GWasM1elztuh();
            }
        }
        encWxUiV2();
    }

    public final void E7jCp8Ls(n60 n60Var, boolean z) {
        df dfVar;
        if (z || !n60Var.encWxUiV2) {
            n60Var.AvO7iQsrTN = z50.WRKkgoJXwDn(Boolean.FALSE);
        } else {
            n60Var.AvO7iQsrTN.setValue(Boolean.FALSE);
        }
        if (n60Var.EljAMC1QTz != null) {
            OOA6hdeuvCS(n60Var);
            return;
        }
        if (z) {
            df dfVar2 = n60Var.X1lG3V04pd;
            if (dfVar2 != null) {
                dfVar2.E7jCp8Ls();
                return;
            }
            return;
        }
        ym0 m10getOutOfFrameExecutor = ((c) j60.GWasM1elztuh(this.OOA6hdeuvCS)).m10getOutOfFrameExecutor();
        if (m10getOutOfFrameExecutor == null) {
            if (n60Var.encWxUiV2 || (dfVar = n60Var.X1lG3V04pd) == null) {
                return;
            }
            dfVar.E7jCp8Ls();
            return;
        }
        d3 d3Var = new d3(5, n60Var);
        c cVar = (c) m10getOutOfFrameExecutor;
        v4 v4Var = cVar.XnEVoBF0td1l;
        boolean isEmpty = v4Var.isEmpty();
        v4Var.addLast(d3Var);
        if (isEmpty) {
            Handler handler = cVar.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(cVar.uFEq9NpZ);
            } else {
                o4.mE4lRynR("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final m61 EljAMC1QTz(Object obj) {
        return !this.OOA6hdeuvCS.eUH21U3apd() ? new s60() : new t60(this, obj);
    }

    @Override // defpackage.be
    public final void GWasM1elztuh() {
        df dfVar;
        g60 g60Var = this.OOA6hdeuvCS;
        g60Var.jivtDDk9H = true;
        hg0 hg0Var = this.JFJ3QoxA;
        Object[] objArr = hg0Var.X1lG3V04pd;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (dfVar = ((n60) objArr[(i << 3) + i3]).X1lG3V04pd) != null) {
                            dfVar.XnEVoBF0td1l();
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
        g60Var.VeqTn1PQw7();
        g60Var.jivtDDk9H = false;
        hg0Var.GWasM1elztuh();
        this.rQPn8YBR.GWasM1elztuh();
        this.mE4lRynR = 0;
        this.Mjvvu5DE = 0;
        this.uFEq9NpZ.GWasM1elztuh();
        encWxUiV2();
    }

    public final void JFJ3QoxA(int i, int i2) {
        g60 g60Var = this.OOA6hdeuvCS;
        g60Var.jivtDDk9H = true;
        g60Var.HFYAaqMd6(i, i2, 1);
        g60Var.jivtDDk9H = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void XnEVoBF0td1l(g60 g60Var, Object obj, boolean z, lv lvVar) {
        boolean z2;
        df dfVar;
        hg0 hg0Var = this.JFJ3QoxA;
        Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(g60Var);
        Object obj2 = AvO7iQsrTN;
        if (AvO7iQsrTN == null) {
            jd jdVar = sd.GWasM1elztuh;
            n60 n60Var = new n60();
            n60Var.GWasM1elztuh = obj;
            n60Var.Yi7zF1RB1 = jdVar;
            n60Var.X1lG3V04pd = null;
            n60Var.AvO7iQsrTN = z50.WRKkgoJXwDn(Boolean.TRUE);
            hg0Var.XnEVoBF0td1l(g60Var, n60Var);
            obj2 = n60Var;
        }
        n60 n60Var2 = (n60) obj2;
        int i = 1;
        boolean z3 = n60Var2.Yi7zF1RB1 != lvVar;
        if (n60Var2.EljAMC1QTz != null) {
            if (z3) {
                OOA6hdeuvCS(n60Var2);
            } else if (z) {
                return;
            } else {
                xqGvceK5x(n60Var2, true);
            }
        }
        df dfVar2 = n60Var2.X1lG3V04pd;
        if (dfVar2 != null) {
            synchronized (dfVar2.encWxUiV2) {
                z2 = dfVar2.Mjvvu5DE.OOA6hdeuvCS > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || n60Var2.xqGvceK5x) {
            n60Var2.Yi7zF1RB1 = lvVar;
            if (n60Var2.EljAMC1QTz != null) {
                t10.GWasM1elztuh("new subcompose call while paused composition is still active");
            }
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            try {
                g60 g60Var2 = this.OOA6hdeuvCS;
                g60Var2.jivtDDk9H = true;
                df dfVar3 = n60Var2.X1lG3V04pd;
                ye yeVar = this.EljAMC1QTz;
                if (yeVar == null) {
                    t10.X1lG3V04pd("parent composition reference not set");
                    throw new vc();
                }
                if (dfVar3 != null) {
                    if (dfVar3.pog2g9KITJA == 3) {
                    }
                    n60Var2.X1lG3V04pd = dfVar3;
                    lv lvVar2 = n60Var2.Yi7zF1RB1;
                    if (((c) j60.GWasM1elztuh(this.OOA6hdeuvCS)).m10getOutOfFrameExecutor() == null) {
                        n60Var2.encWxUiV2 = false;
                    } else {
                        n60Var2.encWxUiV2 = true;
                        lvVar2 = new jd(1524156494, true, new v(i, n60Var2, lvVar2));
                    }
                    if (z) {
                        if (n60Var2.OOA6hdeuvCS) {
                            dfVar3.mOu10nynGul();
                            dfVar3.YmKjaVtbfp5Z();
                            qx qxVar = dfVar3.arNh8D4Z5gB;
                            qxVar.arNh8D4Z5gB = 0;
                            qxVar.WRKkgoJXwDn = true;
                            dfVar3.OOA6hdeuvCS.GWasM1elztuh(dfVar3, lvVar2);
                            qxVar.mE4lRynR();
                        } else {
                            dfVar3.pog2g9KITJA(lvVar2);
                        }
                    } else if (n60Var2.OOA6hdeuvCS) {
                        dfVar3.mOu10nynGul();
                        dfVar3.YmKjaVtbfp5Z();
                        n60Var2.EljAMC1QTz = dfVar3.rQPn8YBR(true, lvVar2);
                    } else {
                        n60Var2.EljAMC1QTz = dfVar3.rQPn8YBR(dfVar3.mOu10nynGul(), lvVar2);
                    }
                    n60Var2.OOA6hdeuvCS = false;
                    g60Var2.jivtDDk9H = false;
                    d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                    n60Var2.xqGvceK5x = false;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = hi1.GWasM1elztuh;
                    dfVar = new df(yeVar, new ac1(g60Var));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = hi1.GWasM1elztuh;
                    dfVar = new df(yeVar, new ac1(g60Var));
                }
                dfVar3 = dfVar;
                n60Var2.X1lG3V04pd = dfVar3;
                lv lvVar22 = n60Var2.Yi7zF1RB1;
                if (((c) j60.GWasM1elztuh(this.OOA6hdeuvCS)).m10getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                n60Var2.OOA6hdeuvCS = false;
                g60Var2.jivtDDk9H = false;
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                n60Var2.xqGvceK5x = false;
            } catch (Throwable th) {
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                throw th;
            }
        }
    }

    @Override // defpackage.be
    public final void Yi7zF1RB1() {
        mOu10nynGul(true);
    }

    public final void encWxUiV2() {
        int i = ((og0) this.OOA6hdeuvCS.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN;
        hg0 hg0Var = this.JFJ3QoxA;
        if (hg0Var.OOA6hdeuvCS != i) {
            t10.GWasM1elztuh("Inconsistency between the count of nodes tracked by the state (" + hg0Var.OOA6hdeuvCS + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.Mjvvu5DE) - this.mE4lRynR < 0) {
            StringBuilder rQPn8YBR = mr0.rQPn8YBR("Incorrect state. Total children ", i, ". Reusable children ");
            rQPn8YBR.append(this.Mjvvu5DE);
            rQPn8YBR.append(". Precomposed children ");
            rQPn8YBR.append(this.mE4lRynR);
            t10.GWasM1elztuh(rQPn8YBR.toString());
        }
        hg0 hg0Var2 = this.uFEq9NpZ;
        if (hg0Var2.OOA6hdeuvCS == this.mE4lRynR) {
            return;
        }
        t10.GWasM1elztuh("Incorrect state. Precomposed children " + this.mE4lRynR + ". Map size " + hg0Var2.OOA6hdeuvCS);
    }

    public final void mOu10nynGul(boolean z) {
        this.mE4lRynR = 0;
        this.uFEq9NpZ.GWasM1elztuh();
        List iwATDS1i01k = this.OOA6hdeuvCS.iwATDS1i01k();
        int i = ((og0) iwATDS1i01k).OOA6hdeuvCS.AvO7iQsrTN;
        if (this.Mjvvu5DE != i) {
            this.Mjvvu5DE = i;
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    g60 g60Var = (g60) ((og0) iwATDS1i01k).get(i2);
                    n60 n60Var = (n60) this.JFJ3QoxA.AvO7iQsrTN(g60Var);
                    if (n60Var != null && ((Boolean) n60Var.AvO7iQsrTN.getValue()).booleanValue()) {
                        k60 k60Var = g60Var.MZhzXH72;
                        ad0 ad0Var = k60Var.WIEu4Ya2g8;
                        e60 e60Var = e60.AvO7iQsrTN;
                        ad0Var.WIEu4Ya2g8 = e60Var;
                        ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
                        if (ac0Var != null) {
                            ac0Var.uFEq9NpZ = e60Var;
                        }
                        E7jCp8Ls(n60Var, z);
                        n60Var.GWasM1elztuh = rj0.rQPn8YBR;
                    }
                } catch (Throwable th) {
                    d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
                    throw th;
                }
            }
            d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
            this.rQPn8YBR.GWasM1elztuh();
        }
        encWxUiV2();
    }

    public final void rQPn8YBR(Object obj, lv lvVar, boolean z) {
        g60 g60Var = this.OOA6hdeuvCS;
        if (g60Var.eUH21U3apd()) {
            encWxUiV2();
            if (this.rQPn8YBR.X1lG3V04pd(obj)) {
                return;
            }
            this.WIEu4Ya2g8.rQPn8YBR(obj);
            hg0 hg0Var = this.uFEq9NpZ;
            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(obj);
            if (AvO7iQsrTN == null) {
                AvO7iQsrTN = uFEq9NpZ(obj);
                if (AvO7iQsrTN != null) {
                    JFJ3QoxA(((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.mOu10nynGul(AvO7iQsrTN), ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN);
                    this.mE4lRynR++;
                } else {
                    int i = ((og0) g60Var.iwATDS1i01k()).OOA6hdeuvCS.AvO7iQsrTN;
                    g60 g60Var2 = new g60(2);
                    g60Var.jivtDDk9H = true;
                    g60Var.M3K9sHhK(i, g60Var2);
                    g60Var.jivtDDk9H = false;
                    this.mE4lRynR++;
                    AvO7iQsrTN = g60Var2;
                }
                hg0Var.XnEVoBF0td1l(obj, AvO7iQsrTN);
            }
            XnEVoBF0td1l((g60) AvO7iQsrTN, obj, z, lvVar);
        }
    }

    public final g60 uFEq9NpZ(Object obj) {
        hg0 hg0Var;
        int i;
        if (this.Mjvvu5DE == 0) {
            return null;
        }
        og0 og0Var = (og0) this.OOA6hdeuvCS.iwATDS1i01k();
        int i2 = og0Var.OOA6hdeuvCS.AvO7iQsrTN - this.mE4lRynR;
        int i3 = i2 - this.Mjvvu5DE;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            hg0Var = this.JFJ3QoxA;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN((g60) og0Var.get(i5));
            AvO7iQsrTN.getClass();
            if (((n60) AvO7iQsrTN).GWasM1elztuh.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN((g60) og0Var.get(i4));
                AvO7iQsrTN2.getClass();
                n60 n60Var = (n60) AvO7iQsrTN2;
                Object obj2 = n60Var.GWasM1elztuh;
                if (obj2 == rj0.rQPn8YBR || this.AvO7iQsrTN.encWxUiV2(obj, obj2)) {
                    n60Var.GWasM1elztuh = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            JFJ3QoxA(i5, i3);
        }
        this.Mjvvu5DE--;
        g60 g60Var = (g60) og0Var.get(i3);
        Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(g60Var);
        AvO7iQsrTN3.getClass();
        n60 n60Var2 = (n60) AvO7iQsrTN3;
        n60Var2.AvO7iQsrTN = z50.WRKkgoJXwDn(Boolean.TRUE);
        n60Var2.OOA6hdeuvCS = true;
        n60Var2.xqGvceK5x = true;
        return g60Var;
    }

    public final void xqGvceK5x(n60 n60Var, boolean z) {
        xo0 xo0Var = n60Var.EljAMC1QTz;
        if (xo0Var != null) {
            y31 Mjvvu5DE = d70.Mjvvu5DE();
            hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
            y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
            try {
                g60 g60Var = this.OOA6hdeuvCS;
                g60Var.jivtDDk9H = true;
                if (z) {
                    while (!xo0Var.X1lG3V04pd()) {
                        try {
                            xo0Var.OOA6hdeuvCS(new o4(14));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                xo0Var.GWasM1elztuh();
                n60Var.EljAMC1QTz = null;
                g60Var.jivtDDk9H = false;
            } finally {
                d70.A1EKNP6CxJ(Mjvvu5DE, M3K9sHhK, OOA6hdeuvCS);
            }
        }
    }
}
