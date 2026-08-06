package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gt0 extends ye {
    public static final p51 arNh8D4Z5gB = vc0.EljAMC1QTz(mp0.encWxUiV2);
    public static final AtomicReference pog2g9KITJA = new AtomicReference(Boolean.FALSE);
    public List AvO7iQsrTN;
    public final hg0 E7jCp8Ls;
    public final ArrayList EljAMC1QTz;
    public final y1 GWasM1elztuh;
    public final ArrayList JFJ3QoxA;
    public n9 Mjvvu5DE;
    public Throwable OOA6hdeuvCS;
    public ArrayList WIEu4Ya2g8;
    public final vt WRKkgoJXwDn;
    public final gh WdrkLMV3xh;
    public final Object X1lG3V04pd;
    public final d XnEVoBF0td1l;
    public final p51 Y6hRI1cF8;
    public final f4 Yi7zF1RB1;
    public ig0 YmKjaVtbfp5Z;
    public final f4 cilMamHF;
    public ig0 encWxUiV2;
    public final hg0 iwATDS1i01k;
    public boolean jivtDDk9H;
    public final h40 lv06NcmrQ;
    public final p51 mE4lRynR;
    public final rg0 mOu10nynGul;
    public final ArrayList rQPn8YBR;
    public final hg0 uFEq9NpZ;
    public f40 xqGvceK5x;

    public gt0(gh ghVar) {
        y1 y1Var = new y1(new bt0(this, 0));
        this.GWasM1elztuh = y1Var;
        this.Yi7zF1RB1 = new f4(new bt0(this, 1));
        this.X1lG3V04pd = new Object();
        this.EljAMC1QTz = new ArrayList();
        this.encWxUiV2 = new ig0();
        this.mOu10nynGul = new rg0(new df[16]);
        this.JFJ3QoxA = new ArrayList();
        this.rQPn8YBR = new ArrayList();
        this.E7jCp8Ls = new hg0();
        this.XnEVoBF0td1l = new d(11);
        this.uFEq9NpZ = new hg0();
        this.iwATDS1i01k = new hg0();
        this.mE4lRynR = vc0.EljAMC1QTz(null);
        this.Y6hRI1cF8 = vc0.EljAMC1QTz(dt0.AvO7iQsrTN);
        this.cilMamHF = new f4(15);
        h40 h40Var = new h40((f40) ghVar.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7));
        h40Var.Mjvvu5DE(new E7jCp8Ls(14, this));
        this.lv06NcmrQ = h40Var;
        this.WdrkLMV3xh = ghVar.mOu10nynGul(y1Var).mOu10nynGul(h40Var);
        this.WRKkgoJXwDn = new vt(24);
    }

    public static final void YZjbz8VdP5(ArrayList arrayList, gt0 gt0Var, df dfVar) {
        arrayList.clear();
        synchronized (gt0Var.X1lG3V04pd) {
            Iterator it = gt0Var.rQPn8YBR.iterator();
            if (it.hasNext()) {
                ((gf0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void lv06NcmrQ(lg0 lg0Var) {
        try {
            if (lg0Var.lv06NcmrQ() instanceof z31) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            lg0Var.X1lG3V04pd();
        }
    }

    public final df A1EKNP6CxJ(df dfVar, ig0 ig0Var) {
        lg0 k8h8IjolWQ;
        if (dfVar.arNh8D4Z5gB.AEn1Rrio || dfVar.pog2g9KITJA == 3) {
            return null;
        }
        ig0 ig0Var2 = this.YmKjaVtbfp5Z;
        if (ig0Var2 == null || !ig0Var2.X1lG3V04pd(dfVar)) {
            E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(13, dfVar);
            X1lG3V04pd x1lG3V04pd = new X1lG3V04pd(21, dfVar, ig0Var);
            y31 JFJ3QoxA = e41.JFJ3QoxA();
            lg0 lg0Var = JFJ3QoxA instanceof lg0 ? (lg0) JFJ3QoxA : null;
            if (lg0Var == null || (k8h8IjolWQ = lg0Var.k8h8IjolWQ(e7jCp8Ls, x1lG3V04pd)) == null) {
                o4.jivtDDk9H("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    y31 JFJ3QoxA2 = k8h8IjolWQ.JFJ3QoxA();
                    if (ig0Var != null) {
                        try {
                            if (ig0Var.encWxUiV2()) {
                                h2 h2Var = new h2(10, ig0Var, dfVar);
                                qx qxVar = dfVar.arNh8D4Z5gB;
                                if (qxVar.AEn1Rrio) {
                                    we.GWasM1elztuh("Preparing a composition while composing is not supported");
                                }
                                qxVar.AEn1Rrio = true;
                                try {
                                    h2Var.GWasM1elztuh();
                                    qxVar.AEn1Rrio = false;
                                } catch (Throwable th) {
                                    qxVar.AEn1Rrio = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                            throw th2;
                        }
                    }
                    boolean lv06NcmrQ = dfVar.lv06NcmrQ();
                    y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                    if (lv06NcmrQ) {
                        return dfVar;
                    }
                } finally {
                    lv06NcmrQ(k8h8IjolWQ);
                }
            }
        }
        return null;
    }

    public final void AEn1Rrio(df dfVar) {
        synchronized (this.X1lG3V04pd) {
            ArrayList arrayList = this.rQPn8YBR;
            if (arrayList.size() > 0) {
                ((gf0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.ye
    public final long AvO7iQsrTN() {
        return 1000L;
    }

    public final boolean DmJncFq5() {
        boolean pog2g9KITJA2;
        synchronized (this.X1lG3V04pd) {
            if (this.encWxUiV2.AvO7iQsrTN()) {
                return pog2g9KITJA();
            }
            List EXrPz3p7hFb = EXrPz3p7hFb();
            mx0 mx0Var = new mx0(this.encWxUiV2);
            this.encWxUiV2 = new ig0();
            try {
                int size = EXrPz3p7hFb.size();
                for (int i = 0; i < size; i++) {
                    ((df) EXrPz3p7hFb.get(i)).WdrkLMV3xh(mx0Var);
                    if (((dt0) this.Y6hRI1cF8.getValue()).compareTo(dt0.EljAMC1QTz) <= 0) {
                        break;
                    }
                }
                synchronized (this.X1lG3V04pd) {
                    if (WRKkgoJXwDn() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    pog2g9KITJA2 = pog2g9KITJA();
                }
                return pog2g9KITJA2;
            } catch (Throwable th) {
                synchronized (this.X1lG3V04pd) {
                    ig0 ig0Var = this.encWxUiV2;
                    ig0Var.getClass();
                    Iterator<E> it = mx0Var.iterator();
                    while (it.hasNext()) {
                        ig0Var.rQPn8YBR(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ye
    public final void E7jCp8Ls(df dfVar) {
        l9 l9Var;
        synchronized (this.X1lG3V04pd) {
            if (this.mOu10nynGul.encWxUiV2(dfVar)) {
                l9Var = null;
            } else {
                this.mOu10nynGul.Yi7zF1RB1(dfVar);
                l9Var = WRKkgoJXwDn();
            }
        }
        if (l9Var != null) {
            ((n9) l9Var).AvO7iQsrTN(kc1.GWasM1elztuh);
        }
    }

    public final List EXrPz3p7hFb() {
        List list = this.AvO7iQsrTN;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.EljAMC1QTz;
        List arrayList2 = arrayList.isEmpty() ? xp.OOA6hdeuvCS : new ArrayList(arrayList);
        this.AvO7iQsrTN = arrayList2;
        return arrayList2;
    }

    @Override // defpackage.ye
    public final boolean EljAMC1QTz() {
        return false;
    }

    @Override // defpackage.ye
    public final void GWasM1elztuh(df dfVar, lv lvVar) {
        dt0 dt0Var;
        boolean contains;
        lg0 k8h8IjolWQ;
        boolean z = dfVar.arNh8D4Z5gB.AEn1Rrio;
        synchronized (this.X1lG3V04pd) {
            dt0 dt0Var2 = (dt0) this.Y6hRI1cF8.getValue();
            dt0Var = dt0.EljAMC1QTz;
            contains = dt0Var2.compareTo(dt0Var) > 0 ? true ^ EXrPz3p7hFb().contains(dfVar) : true;
        }
        try {
            E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(13, dfVar);
            X1lG3V04pd x1lG3V04pd = new X1lG3V04pd(21, dfVar, (Object) null);
            y31 JFJ3QoxA = e41.JFJ3QoxA();
            lg0 lg0Var = JFJ3QoxA instanceof lg0 ? (lg0) JFJ3QoxA : null;
            if (lg0Var == null || (k8h8IjolWQ = lg0Var.k8h8IjolWQ(e7jCp8Ls, x1lG3V04pd)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                y31 JFJ3QoxA2 = k8h8IjolWQ.JFJ3QoxA();
                try {
                    dfVar.JFJ3QoxA(lvVar);
                    synchronized (this.X1lG3V04pd) {
                        if (((dt0) this.Y6hRI1cF8.getValue()).compareTo(dt0Var) > 0 && !EXrPz3p7hFb().contains(dfVar)) {
                            this.EljAMC1QTz.add(dfVar);
                            this.AvO7iQsrTN = null;
                        }
                    }
                    if (!z) {
                        e41.JFJ3QoxA().XnEVoBF0td1l();
                    }
                    try {
                        AEn1Rrio(dfVar);
                        try {
                            dfVar.xqGvceK5x();
                            dfVar.EljAMC1QTz();
                            if (z) {
                                return;
                            }
                            e41.JFJ3QoxA().XnEVoBF0td1l();
                        } catch (Throwable th) {
                            MZhzXH72(th, null);
                        }
                    } catch (Throwable th2) {
                        MZhzXH72(th2, dfVar);
                    }
                } finally {
                    y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                }
            } finally {
                lv06NcmrQ(k8h8IjolWQ);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.X1lG3V04pd) {
                }
            }
            MZhzXH72(th3, dfVar);
        }
    }

    public final void HFYAaqMd6(df dfVar) {
        ArrayList arrayList = this.WIEu4Ya2g8;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.WIEu4Ya2g8 = arrayList;
        }
        if (!arrayList.contains(dfVar)) {
            arrayList.add(dfVar);
        }
        if (this.EljAMC1QTz.remove(dfVar)) {
            this.AvO7iQsrTN = null;
        }
    }

    @Override // defpackage.ye
    public final gh JFJ3QoxA() {
        return this.WdrkLMV3xh;
    }

    public final boolean M3K9sHhK() {
        return !this.jivtDDk9H && (((i5) ((v5) this.Yi7zF1RB1.X1lG3V04pd).X1lG3V04pd).get() & 134217727) > 0;
    }

    public final void MZhzXH72(Throwable th, df dfVar) {
        if (!((Boolean) pog2g9KITJA.get()).booleanValue() || (th instanceof ge)) {
            synchronized (this.X1lG3V04pd) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                ct0 ct0Var = (ct0) this.mE4lRynR.getValue();
                if (ct0Var != null) {
                    throw ct0Var.GWasM1elztuh;
                }
                p51 p51Var = this.mE4lRynR;
                ct0 ct0Var2 = new ct0(th);
                p51Var.getClass();
                p51Var.JFJ3QoxA(null, ct0Var2);
            }
            throw th;
        }
        synchronized (this.X1lG3V04pd) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.JFJ3QoxA.clear();
                this.mOu10nynGul.AvO7iQsrTN();
                this.encWxUiV2 = new ig0();
                this.rQPn8YBR.clear();
                this.E7jCp8Ls.GWasM1elztuh();
                this.uFEq9NpZ.GWasM1elztuh();
                p51 p51Var2 = this.mE4lRynR;
                ct0 ct0Var3 = new ct0(th);
                p51Var2.getClass();
                p51Var2.JFJ3QoxA(null, ct0Var3);
                if (dfVar != null) {
                    HFYAaqMd6(dfVar);
                }
                if (WRKkgoJXwDn() != null) {
                    we.GWasM1elztuh("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.ye
    public final void Mjvvu5DE(df dfVar) {
        synchronized (this.X1lG3V04pd) {
            try {
                ig0 ig0Var = this.YmKjaVtbfp5Z;
                if (ig0Var == null) {
                    ig0 ig0Var2 = lx0.GWasM1elztuh;
                    ig0Var = new ig0();
                    this.YmKjaVtbfp5Z = ig0Var;
                }
                ig0Var.GWasM1elztuh(dfVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ye
    public final boolean OOA6hdeuvCS() {
        return false;
    }

    public final l9 WRKkgoJXwDn() {
        p51 p51Var = this.Y6hRI1cF8;
        int compareTo = ((dt0) p51Var.getValue()).compareTo(dt0.EljAMC1QTz);
        p51 p51Var2 = this.mE4lRynR;
        ArrayList arrayList = this.rQPn8YBR;
        ArrayList arrayList2 = this.JFJ3QoxA;
        rg0 rg0Var = this.mOu10nynGul;
        if (compareTo > 0) {
            Object value = p51Var2.getValue();
            dt0 dt0Var = dt0.JFJ3QoxA;
            dt0 dt0Var2 = dt0.AvO7iQsrTN;
            if (value == null) {
                if (this.xqGvceK5x == null) {
                    this.encWxUiV2 = new ig0();
                    rg0Var.AvO7iQsrTN();
                    if (arNh8D4Z5gB() || M3K9sHhK()) {
                        dt0Var2 = dt0.encWxUiV2;
                    }
                } else {
                    dt0Var2 = (rg0Var.AvO7iQsrTN != 0 || this.encWxUiV2.encWxUiV2() || !arrayList2.isEmpty() || !arrayList.isEmpty() || arNh8D4Z5gB() || M3K9sHhK() || this.E7jCp8Ls.JFJ3QoxA()) ? dt0Var : dt0.mOu10nynGul;
                }
            }
            p51Var.JFJ3QoxA(null, dt0Var2);
            if (dt0Var2 != dt0Var) {
                return null;
            }
            n9 n9Var = this.Mjvvu5DE;
            this.Mjvvu5DE = null;
            return n9Var;
        }
        List EXrPz3p7hFb = EXrPz3p7hFb();
        int size = EXrPz3p7hFb.size();
        for (int i = 0; i < size; i++) {
        }
        this.EljAMC1QTz.clear();
        this.AvO7iQsrTN = xp.OOA6hdeuvCS;
        this.encWxUiV2 = new ig0();
        rg0Var.AvO7iQsrTN();
        arrayList2.clear();
        arrayList.clear();
        this.WIEu4Ya2g8 = null;
        n9 n9Var2 = this.Mjvvu5DE;
        if (n9Var2 != null) {
            n9Var2.rQPn8YBR(null);
        }
        this.Mjvvu5DE = null;
        p51Var2.mOu10nynGul(null);
        return null;
    }

    public final void WdrkLMV3xh() {
        synchronized (this.X1lG3V04pd) {
            if (((dt0) this.Y6hRI1cF8.getValue()).compareTo(dt0.mOu10nynGul) >= 0) {
                p51 p51Var = this.Y6hRI1cF8;
                dt0 dt0Var = dt0.EljAMC1QTz;
                p51Var.getClass();
                p51Var.JFJ3QoxA(null, dt0Var);
            }
        }
        this.lv06NcmrQ.GWasM1elztuh(null);
    }

    @Override // defpackage.ye
    public final ff0 XnEVoBF0td1l(gf0 gf0Var) {
        ff0 ff0Var;
        synchronized (this.X1lG3V04pd) {
            ff0Var = (ff0) this.uFEq9NpZ.rQPn8YBR(gf0Var);
        }
        return ff0Var;
    }

    @Override // defpackage.ye
    public final ig0 Yi7zF1RB1(df dfVar, l21 l21Var, lv lvVar) {
        f4 f4Var = this.cilMamHF;
        try {
            l21 l21Var2 = dfVar.jivtDDk9H;
            dfVar.jivtDDk9H = l21Var;
            try {
                GWasM1elztuh(dfVar, lvVar);
                ig0 ig0Var = (ig0) f4Var.OOA6hdeuvCS();
                if (ig0Var == null) {
                    ig0Var = lx0.GWasM1elztuh;
                    ig0Var.getClass();
                }
                return ig0Var;
            } finally {
                dfVar.jivtDDk9H = l21Var2;
            }
        } finally {
            f4Var.WIEu4Ya2g8(null);
        }
    }

    @Override // defpackage.ye
    public final void YmKjaVtbfp5Z(at0 at0Var) {
        f4 f4Var = this.cilMamHF;
        ig0 ig0Var = (ig0) f4Var.OOA6hdeuvCS();
        if (ig0Var == null) {
            ig0 ig0Var2 = lx0.GWasM1elztuh;
            ig0Var = new ig0();
            f4Var.WIEu4Ya2g8(ig0Var);
        }
        ig0Var.GWasM1elztuh(at0Var);
    }

    public final boolean arNh8D4Z5gB() {
        return !this.jivtDDk9H && (((i5) ((v5) this.GWasM1elztuh.AvO7iQsrTN).X1lG3V04pd).get() & 134217727) > 0;
    }

    @Override // defpackage.ye
    public final void cilMamHF(df dfVar) {
        synchronized (this.X1lG3V04pd) {
            if (this.EljAMC1QTz.remove(dfVar)) {
                this.AvO7iQsrTN = null;
            }
            this.mOu10nynGul.JFJ3QoxA(dfVar);
            this.JFJ3QoxA.remove(dfVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (((defpackage.rn0) r11.get(r4)).EljAMC1QTz == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r12 = (defpackage.rn0) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r12.EljAMC1QTz != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r12 = (defpackage.gf0) r12.OOA6hdeuvCS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r4 = r18.X1lG3V04pd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        defpackage.wb.nXl1EmE5(r18.rQPn8YBR, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        if (((defpackage.rn0) r12).EljAMC1QTz == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List eUH21U3apd(List list, ig0 ig0Var) {
        lg0 k8h8IjolWQ;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((gf0) obj).getClass();
            Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(null, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            df dfVar = (df) entry.getKey();
            List list2 = (List) entry.getValue();
            if (dfVar.arNh8D4Z5gB.AEn1Rrio) {
                we.GWasM1elztuh("Check failed");
            }
            E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(13, dfVar);
            X1lG3V04pd x1lG3V04pd = new X1lG3V04pd(21, dfVar, ig0Var);
            y31 JFJ3QoxA = e41.JFJ3QoxA();
            lg0 lg0Var = JFJ3QoxA instanceof lg0 ? (lg0) JFJ3QoxA : null;
            if (lg0Var == null || (k8h8IjolWQ = lg0Var.k8h8IjolWQ(e7jCp8Ls, x1lG3V04pd)) == null) {
                o4.jivtDDk9H("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                y31 JFJ3QoxA2 = k8h8IjolWQ.JFJ3QoxA();
                try {
                    synchronized (this.X1lG3V04pd) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                gf0 gf0Var = (gf0) list2.get(i2);
                                hg0 hg0Var = this.E7jCp8Ls;
                                gf0Var.getClass();
                                Object GWasM1elztuh = nf0.GWasM1elztuh(hg0Var);
                                arrayList.add(new rn0(gf0Var, GWasM1elztuh));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                rn0 rn0Var = (rn0) arrayList.get(i3);
                                if (rn0Var.EljAMC1QTz == null) {
                                    d dVar = this.XnEVoBF0td1l;
                                    ((gf0) rn0Var.OOA6hdeuvCS).getClass();
                                    if (((hg0) dVar.EljAMC1QTz).Yi7zF1RB1(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            rn0 rn0Var2 = (rn0) arrayList.get(i4);
                                            if (rn0Var2.EljAMC1QTz == null) {
                                                d dVar2 = this.XnEVoBF0td1l;
                                                ((gf0) rn0Var2.OOA6hdeuvCS).getClass();
                                                hg0 hg0Var2 = (hg0) dVar2.EljAMC1QTz;
                                                if (hg0Var2.mOu10nynGul()) {
                                                    ((hg0) dVar2.AvO7iQsrTN).GWasM1elztuh();
                                                }
                                            }
                                            arrayList2.add(rn0Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((rn0) arrayList.get(i5)).EljAMC1QTz != null) {
                            break;
                        }
                        i5++;
                    }
                    dfVar.Mjvvu5DE(arrayList);
                    y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                } catch (Throwable th) {
                    y31.YmKjaVtbfp5Z(JFJ3QoxA2);
                    throw th;
                }
            } finally {
                lv06NcmrQ(k8h8IjolWQ);
            }
        }
        return rb.gqMuANyCes(hashMap.keySet());
    }

    @Override // defpackage.ye
    public final xe encWxUiV2() {
        return null;
    }

    public final boolean k8h8IjolWQ() {
        boolean z;
        synchronized (this.X1lG3V04pd) {
            if (!this.encWxUiV2.encWxUiV2() && this.mOu10nynGul.AvO7iQsrTN == 0 && !arNh8D4Z5gB()) {
                z = M3K9sHhK();
            }
        }
        return z;
    }

    @Override // defpackage.ye
    public final p9 mE4lRynR(d3 d3Var) {
        f4 f4Var = this.Yi7zF1RB1;
        v5 v5Var = (v5) f4Var.X1lG3V04pd;
        qj0 qj0Var = new qj0();
        qj0Var.GWasM1elztuh = d3Var;
        return v5Var.xqGvceK5x(qj0Var, (h2) f4Var.xqGvceK5x);
    }

    public final void ozMwhSAI() {
        l9 WRKkgoJXwDn;
        synchronized (this.X1lG3V04pd) {
            WRKkgoJXwDn = WRKkgoJXwDn();
            if (((dt0) this.Y6hRI1cF8.getValue()).compareTo(dt0.EljAMC1QTz) <= 0) {
                Throwable th = this.OOA6hdeuvCS;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (WRKkgoJXwDn != null) {
            ((n9) WRKkgoJXwDn).AvO7iQsrTN(kc1.GWasM1elztuh);
        }
    }

    public final boolean pog2g9KITJA() {
        return this.mOu10nynGul.AvO7iQsrTN != 0 || arNh8D4Z5gB() || M3K9sHhK() || this.E7jCp8Ls.JFJ3QoxA();
    }

    @Override // defpackage.ye
    public final boolean rQPn8YBR() {
        return false;
    }

    @Override // defpackage.ye
    public final ig0 uFEq9NpZ(df dfVar, l21 l21Var, ig0 ig0Var) {
        f4 f4Var = this.cilMamHF;
        try {
            DmJncFq5();
            dfVar.WdrkLMV3xh(new mx0(ig0Var));
            l21 l21Var2 = dfVar.jivtDDk9H;
            dfVar.jivtDDk9H = l21Var;
            try {
                df A1EKNP6CxJ = A1EKNP6CxJ(dfVar, null);
                if (A1EKNP6CxJ != null) {
                    AEn1Rrio(dfVar);
                    A1EKNP6CxJ.xqGvceK5x();
                    A1EKNP6CxJ.EljAMC1QTz();
                }
                ig0 ig0Var2 = (ig0) f4Var.OOA6hdeuvCS();
                if (ig0Var2 == null) {
                    ig0Var2 = lx0.GWasM1elztuh;
                    ig0Var2.getClass();
                }
                return ig0Var2;
            } finally {
                dfVar.jivtDDk9H = l21Var2;
            }
        } finally {
            f4Var.WIEu4Ya2g8(null);
        }
    }

    @Override // defpackage.ye
    public final boolean xqGvceK5x() {
        return ((Boolean) pog2g9KITJA.get()).booleanValue();
    }

    @Override // defpackage.ye
    public final void iwATDS1i01k(Set set) {
    }
}
