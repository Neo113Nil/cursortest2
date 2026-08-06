package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g60 implements be, hn0, oe {
    public final xj0 A1EKNP6CxJ;
    public e60 AEn1Rrio;
    public boolean AvO7iQsrTN;
    public v60 DmJncFq5;
    public g60 E7jCp8Ls;
    public qe1 EXrPz3p7hFb;
    public int EljAMC1QTz;
    public bk0 HFYAaqMd6;
    public boolean JFJ3QoxA;
    public el M3K9sHhK;
    public final k60 MZhzXH72;
    public gn0 Mjvvu5DE;
    public final boolean OOA6hdeuvCS;
    public ie0 TpUsjqg3bxO;
    public boolean VeqTn1PQw7;
    public boolean WIEu4Ya2g8;
    public boolean WRKkgoJXwDn;
    public final rg0 WdrkLMV3xh;
    public int XnEVoBF0td1l;
    public boolean Y6hRI1cF8;
    public boolean YXi2hvwn7WL;
    public e60 YZjbz8VdP5;
    public g60 YmKjaVtbfp5Z;
    public bd0 arNh8D4Z5gB;
    public zz0 cilMamHF;
    public ie0 dqB83aoLBB;
    public boolean eUH21U3apd;
    public long encWxUiV2;
    public rg0 iwATDS1i01k;
    public boolean jivtDDk9H;
    public p50 k8h8IjolWQ;
    public boolean lv06NcmrQ;
    public int mE4lRynR;
    public boolean mOu10nynGul;
    public gf ozMwhSAI;
    public d pog2g9KITJA;
    public boolean rQPn8YBR;
    public boolean rezfBrjOrqK;
    public final d uFEq9NpZ;
    public int z19UFEN2I;
    public static final rv0 CMh55RymNfS = new rv0("Undefined intrinsics block and it is required", 1);
    public static final b60 qugwajBSa59j = new b60();
    public static final l1 J3Xc8BaqpN8 = new l1(4);

    public g60(int i, boolean z) {
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = i;
        this.encWxUiV2 = 9223372034707292159L;
        this.mOu10nynGul = true;
        this.JFJ3QoxA = true;
        this.uFEq9NpZ = new d(10, new rg0(new g60[16]), new d3(4, this));
        this.WdrkLMV3xh = new rg0(new g60[16]);
        this.WRKkgoJXwDn = true;
        this.arNh8D4Z5gB = CMh55RymNfS;
        this.M3K9sHhK = j60.GWasM1elztuh;
        this.k8h8IjolWQ = p50.OOA6hdeuvCS;
        this.EXrPz3p7hFb = qugwajBSa59j;
        gf.xqGvceK5x.getClass();
        this.ozMwhSAI = ff.Yi7zF1RB1;
        e60 e60Var = e60.AvO7iQsrTN;
        this.AEn1Rrio = e60Var;
        this.YZjbz8VdP5 = e60Var;
        this.A1EKNP6CxJ = new xj0(this);
        this.MZhzXH72 = new k60(this);
        this.rezfBrjOrqK = true;
        this.TpUsjqg3bxO = fe0.GWasM1elztuh;
    }

    private final String JFJ3QoxA(g60 g60Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(g60Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(AvO7iQsrTN(0));
        sb.append(" Other tree: ");
        g60 g60Var2 = g60Var.YmKjaVtbfp5Z;
        sb.append(g60Var2 != null ? g60Var2.AvO7iQsrTN(0) : null);
        return sb.toString();
    }

    public static void MItybXapHX(g60 g60Var, boolean z, int i) {
        gn0 gn0Var;
        g60 cilMamHF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (g60Var.jivtDDk9H || g60Var.OOA6hdeuvCS || (gn0Var = g60Var.Mjvvu5DE) == null) {
            return;
        }
        ((c) gn0Var).WRKkgoJXwDn(g60Var, false, z, z2);
        if (z3) {
            k60 k60Var = g60Var.MZhzXH72.WIEu4Ya2g8.JFJ3QoxA;
            g60 cilMamHF2 = k60Var.GWasM1elztuh.cilMamHF();
            e60 e60Var = k60Var.GWasM1elztuh.AEn1Rrio;
            if (cilMamHF2 == null || e60Var == e60.AvO7iQsrTN) {
                return;
            }
            while (cilMamHF2.AEn1Rrio == e60Var && (cilMamHF = cilMamHF2.cilMamHF()) != null) {
                cilMamHF2 = cilMamHF;
            }
            int ordinal = e60Var.ordinal();
            if (ordinal == 0) {
                MItybXapHX(cilMamHF2, z, 6);
            } else if (ordinal == 1) {
                cilMamHF2.J3Xc8BaqpN8(z);
            } else {
                o4.jivtDDk9H("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void MjxSquD6Av(g60 g60Var) {
        int i = f60.GWasM1elztuh[g60Var.MZhzXH72.xqGvceK5x.ordinal()];
        k60 k60Var = g60Var.MZhzXH72;
        if (i != 1) {
            o4.XnEVoBF0td1l(k60Var.xqGvceK5x, "Unexpected state ");
            return;
        }
        if (k60Var.OOA6hdeuvCS) {
            qugwajBSa59j(g60Var, true, 6);
            return;
        }
        if (k60Var.EljAMC1QTz) {
            g60Var.CMh55RymNfS(true);
        }
        if (g60Var.YmKjaVtbfp5Z()) {
            MItybXapHX(g60Var, true, 6);
        } else if (g60Var.WIEu4Ya2g8()) {
            g60Var.J3Xc8BaqpN8(true);
        }
    }

    public static void qugwajBSa59j(g60 g60Var, boolean z, int i) {
        g60 cilMamHF;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (g60Var.E7jCp8Ls == null) {
            t10.Yi7zF1RB1("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        gn0 gn0Var = g60Var.Mjvvu5DE;
        if (gn0Var == null || g60Var.jivtDDk9H || g60Var.OOA6hdeuvCS) {
            return;
        }
        ((c) gn0Var).WRKkgoJXwDn(g60Var, true, z, z2);
        if (z3) {
            ac0 ac0Var = g60Var.MZhzXH72.YmKjaVtbfp5Z;
            ac0Var.getClass();
            k60 k60Var = ac0Var.JFJ3QoxA;
            g60 cilMamHF2 = k60Var.GWasM1elztuh.cilMamHF();
            e60 e60Var = k60Var.GWasM1elztuh.AEn1Rrio;
            if (cilMamHF2 == null || e60Var == e60.AvO7iQsrTN) {
                return;
            }
            while (cilMamHF2.AEn1Rrio == e60Var && (cilMamHF = cilMamHF2.cilMamHF()) != null) {
                cilMamHF2 = cilMamHF;
            }
            int ordinal = e60Var.ordinal();
            if (ordinal == 0) {
                if (cilMamHF2.E7jCp8Ls != null) {
                    qugwajBSa59j(cilMamHF2, z, 6);
                    return;
                } else {
                    MItybXapHX(cilMamHF2, z, 6);
                    return;
                }
            }
            if (ordinal != 1) {
                o4.jivtDDk9H("Intrinsics isn't used by the parent");
            } else if (cilMamHF2.E7jCp8Ls != null) {
                cilMamHF2.CMh55RymNfS(z);
            } else {
                cilMamHF2.J3Xc8BaqpN8(z);
            }
        }
    }

    public final boolean A1EKNP6CxJ() {
        return this.MZhzXH72.WIEu4Ya2g8.lv06NcmrQ;
    }

    public final void AEn1Rrio() {
        if (this.lv06NcmrQ) {
            return;
        }
        if (this.A1EKNP6CxJ.Yi7zF1RB1.JFJ3QoxA != null || this.dqB83aoLBB != null) {
            this.Y6hRI1cF8 = true;
            return;
        }
        zz0 zz0Var = this.cilMamHF;
        this.lv06NcmrQ = true;
        rt0 rt0Var = new rt0();
        rt0Var.OOA6hdeuvCS = new zz0();
        in0 snapshotObserver = ((c) j60.GWasM1elztuh(this)).getSnapshotObserver();
        psOJLYhIz psojlyhiz = new psOJLYhIz(6, this, rt0Var);
        snapshotObserver.GWasM1elztuh.X1lG3V04pd(this, snapshotObserver.xqGvceK5x, psojlyhiz);
        this.lv06NcmrQ = false;
        this.cilMamHF = (zz0) rt0Var.OOA6hdeuvCS;
        this.Y6hRI1cF8 = false;
        c cVar = (c) j60.GWasM1elztuh(this);
        cVar.getSemanticsOwner().Yi7zF1RB1(this, zz0Var);
        cVar.pog2g9KITJA();
    }

    public final String AvO7iQsrTN(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        rg0 arNh8D4Z5gB = arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i3 = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((g60) objArr[i4]).AvO7iQsrTN(i + 1));
        }
        String sb2 = sb.toString();
        return i == 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    public final void CMh55RymNfS(boolean z) {
        gn0 gn0Var;
        if (this.OOA6hdeuvCS || (gn0Var = this.Mjvvu5DE) == null) {
            return;
        }
        ((c) gn0Var).arNh8D4Z5gB(this, true, z);
    }

    public final void DmJncFq5() {
        g60 cilMamHF;
        if (this.AEn1Rrio == e60.AvO7iQsrTN) {
            EljAMC1QTz();
        }
        ac0 ac0Var = this.MZhzXH72.YmKjaVtbfp5Z;
        ac0Var.getClass();
        boolean z = true;
        try {
            ac0Var.rQPn8YBR = true;
            if (!ac0Var.WIEu4Ya2g8) {
                t10.Yi7zF1RB1("replace() called on item that was not placed");
            }
            ac0Var.AEn1Rrio = false;
            if (ac0Var.Y6hRI1cF8 == yb0.AvO7iQsrTN) {
                z = false;
            }
            ac0Var.cTIXpaxc(ac0Var.mE4lRynR, ac0Var.jivtDDk9H);
            if (z && !ac0Var.AEn1Rrio && (cilMamHF = ac0Var.JFJ3QoxA.GWasM1elztuh.cilMamHF()) != null) {
                cilMamHF.CMh55RymNfS(false);
            }
            ac0Var.rQPn8YBR = false;
        } catch (Throwable th) {
            ac0Var.rQPn8YBR = false;
            throw th;
        }
    }

    public final List E7jCp8Ls() {
        ac0 ac0Var = this.MZhzXH72.YmKjaVtbfp5Z;
        ac0Var.getClass();
        rg0 rg0Var = ac0Var.lv06NcmrQ;
        k60 k60Var = ac0Var.JFJ3QoxA;
        k60Var.GWasM1elztuh.uFEq9NpZ();
        if (!ac0Var.WdrkLMV3xh) {
            return rg0Var.EljAMC1QTz();
        }
        g60 g60Var = k60Var.GWasM1elztuh;
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var2 = (g60) objArr[i2];
            if (rg0Var.AvO7iQsrTN <= i2) {
                ac0 ac0Var2 = g60Var2.MZhzXH72.YmKjaVtbfp5Z;
                ac0Var2.getClass();
                rg0Var.Yi7zF1RB1(ac0Var2);
            } else {
                ac0 ac0Var3 = g60Var2.MZhzXH72.YmKjaVtbfp5Z;
                ac0Var3.getClass();
                Object[] objArr2 = rg0Var.OOA6hdeuvCS;
                Object obj = objArr2[i2];
                objArr2[i2] = ac0Var3;
            }
        }
        rg0Var.E7jCp8Ls(((og0) g60Var.uFEq9NpZ()).OOA6hdeuvCS.AvO7iQsrTN, rg0Var.AvO7iQsrTN);
        ac0Var.WdrkLMV3xh = false;
        return rg0Var.EljAMC1QTz();
    }

    public final void EDwNPVYuViP0() {
        if (this.XnEVoBF0td1l <= 0 || !this.WIEu4Ya2g8) {
            return;
        }
        this.WIEu4Ya2g8 = false;
        rg0 rg0Var = this.iwATDS1i01k;
        if (rg0Var == null) {
            rg0Var = new rg0(new g60[16]);
            this.iwATDS1i01k = rg0Var;
        }
        rg0Var.AvO7iQsrTN();
        rg0 rg0Var2 = (rg0) this.uFEq9NpZ.EljAMC1QTz;
        Object[] objArr = rg0Var2.OOA6hdeuvCS;
        int i = rg0Var2.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var = (g60) objArr[i2];
            if (g60Var.OOA6hdeuvCS) {
                rg0Var.X1lG3V04pd(rg0Var.AvO7iQsrTN, g60Var.arNh8D4Z5gB());
            } else {
                rg0Var.Yi7zF1RB1(g60Var);
            }
        }
        k60 k60Var = this.MZhzXH72;
        k60Var.WIEu4Ya2g8.EXrPz3p7hFb = true;
        ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
        if (ac0Var != null) {
            ac0Var.WdrkLMV3xh = true;
        }
    }

    public final void ES6ysExf(ie0 ie0Var) {
        if (this.OOA6hdeuvCS && this.TpUsjqg3bxO != fe0.GWasM1elztuh) {
            t10.GWasM1elztuh("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.YXi2hvwn7WL) {
            t10.GWasM1elztuh("modifier is updated when deactivated");
        }
        if (!eUH21U3apd()) {
            this.dqB83aoLBB = ie0Var;
            return;
        }
        X1lG3V04pd(ie0Var);
        if (this.Y6hRI1cF8) {
            AEn1Rrio();
        }
    }

    public final void EXrPz3p7hFb() {
        xj0 xj0Var = this.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.xqGvceK5x;
        z10 z10Var = xj0Var.X1lG3V04pd;
        while (bk0Var != z10Var) {
            bk0Var.getClass();
            y50 y50Var = (y50) bk0Var;
            fn0 fn0Var = y50Var.VeqTn1PQw7;
            if (fn0Var != null) {
                ((ry) fn0Var).X1lG3V04pd();
            }
            bk0Var = y50Var.jivtDDk9H;
        }
        fn0 fn0Var2 = xj0Var.X1lG3V04pd.VeqTn1PQw7;
        if (fn0Var2 != null) {
            ((ry) fn0Var2).X1lG3V04pd();
        }
    }

    public final void EljAMC1QTz() {
        this.YZjbz8VdP5 = this.AEn1Rrio;
        this.AEn1Rrio = e60.AvO7iQsrTN;
        rg0 arNh8D4Z5gB = arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var = (g60) objArr[i2];
            if (g60Var.AEn1Rrio == e60.EljAMC1QTz) {
                g60Var.EljAMC1QTz();
            }
        }
    }

    public final void Fm8W7vP7q(Throwable th) {
        gf gfVar = this.ozMwhSAI;
        v51 v51Var = cf.GWasM1elztuh;
        cp0 cp0Var = (cp0) gfVar;
        cp0Var.getClass();
        bf bfVar = (bf) rj0.AEn1Rrio(cp0Var, v51Var);
        if (bfVar == null) {
            throw th;
        }
        p.arNh8D4Z5gB(th, new h2(2, bfVar, this));
        throw th;
    }

    @Override // defpackage.be
    public final void GWasM1elztuh() {
        v60 v60Var = this.DmJncFq5;
        if (v60Var != null) {
            v60Var.GWasM1elztuh();
        }
        xj0 xj0Var = this.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.X1lG3V04pd.jivtDDk9H;
        for (bk0 bk0Var2 = xj0Var.xqGvceK5x; !o30.rQPn8YBR(bk0Var2, bk0Var) && bk0Var2 != null; bk0Var2 = bk0Var2.jivtDDk9H) {
            bk0Var2.Jz7YUlEP53();
        }
    }

    public final void HFYAaqMd6(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            d dVar = this.uFEq9NpZ;
            rg0 rg0Var = (rg0) dVar.EljAMC1QTz;
            d3 d3Var = (d3) dVar.AvO7iQsrTN;
            Object rQPn8YBR = rg0Var.rQPn8YBR(i5);
            d3Var.GWasM1elztuh();
            ((rg0) dVar.EljAMC1QTz).GWasM1elztuh(i6, (g60) rQPn8YBR);
            d3Var.GWasM1elztuh();
        }
        dqB83aoLBB();
        YZjbz8VdP5();
        ozMwhSAI();
    }

    public final void J3Xc8BaqpN8(boolean z) {
        gn0 gn0Var;
        if (this.OOA6hdeuvCS || (gn0Var = this.Mjvvu5DE) == null) {
            return;
        }
        ((c) gn0Var).arNh8D4Z5gB(this, false, z);
    }

    public final void JFXS9W1rB5s4(bd0 bd0Var) {
        if (o30.rQPn8YBR(this.arNh8D4Z5gB, bd0Var)) {
            return;
        }
        this.arNh8D4Z5gB = bd0Var;
        d dVar = this.pog2g9KITJA;
        if (dVar != null) {
            ((fo0) dVar.AvO7iQsrTN).setValue(bd0Var);
        }
        ozMwhSAI();
    }

    public final void M3K9sHhK(int i, g60 g60Var) {
        if (g60Var.YmKjaVtbfp5Z != null && g60Var.Mjvvu5DE != null) {
            t10.Yi7zF1RB1(JFJ3QoxA(g60Var));
        }
        g60Var.YmKjaVtbfp5Z = this;
        d dVar = this.uFEq9NpZ;
        ((rg0) dVar.EljAMC1QTz).GWasM1elztuh(i, g60Var);
        ((d3) dVar.AvO7iQsrTN).GWasM1elztuh();
        dqB83aoLBB();
        if (g60Var.OOA6hdeuvCS) {
            this.XnEVoBF0td1l++;
        }
        YZjbz8VdP5();
        gn0 gn0Var = this.Mjvvu5DE;
        if (gn0Var != null) {
            g60Var.xqGvceK5x(gn0Var);
        }
        if (g60Var.MZhzXH72.E7jCp8Ls > 0) {
            k60 k60Var = this.MZhzXH72;
            k60Var.xqGvceK5x(k60Var.E7jCp8Ls + 1);
        }
        if (g60Var.z19UFEN2I > 0) {
            mqNvfisv7(this.z19UFEN2I + 1);
        }
    }

    public final Boolean MZhzXH72() {
        ac0 ac0Var = this.MZhzXH72.YmKjaVtbfp5Z;
        if (ac0Var != null) {
            return Boolean.valueOf(ac0Var.Y6hRI1cF8 != yb0.AvO7iQsrTN);
        }
        return null;
    }

    public final e60 Mjvvu5DE() {
        return this.MZhzXH72.WIEu4Ya2g8.WIEu4Ya2g8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void NyNgffpi(qe1 qe1Var) {
        if (o30.rQPn8YBR(this.EXrPz3p7hFb, qe1Var)) {
            return;
        }
        this.EXrPz3p7hFb = qe1Var;
        he0 he0Var = this.A1EKNP6CxJ.EljAMC1QTz;
        if ((he0Var.encWxUiV2 & 16) != 0) {
            while (he0Var != null) {
                if ((he0Var.AvO7iQsrTN & 16) != 0) {
                    yk ykVar = he0Var;
                    ?? r2 = 0;
                    while (ykVar != 0) {
                        if (ykVar instanceof nq0) {
                            ((nq0) ykVar).J3Xc8BaqpN8();
                        } else if ((ykVar.AvO7iQsrTN & 16) != 0 && (ykVar instanceof yk)) {
                            he0 he0Var2 = ykVar.jivtDDk9H;
                            int i = 0;
                            ykVar = ykVar;
                            r2 = r2;
                            while (he0Var2 != null) {
                                if ((he0Var2.AvO7iQsrTN & 16) != 0) {
                                    i++;
                                    r2 = r2;
                                    if (i == 1) {
                                        ykVar = he0Var2;
                                    } else {
                                        if (r2 == 0) {
                                            r2 = new rg0(new he0[16]);
                                        }
                                        if (ykVar != 0) {
                                            r2.Yi7zF1RB1(ykVar);
                                            ykVar = 0;
                                        }
                                        r2.Yi7zF1RB1(he0Var2);
                                    }
                                }
                                he0Var2 = he0Var2.JFJ3QoxA;
                                ykVar = ykVar;
                                r2 = r2;
                            }
                            if (i == 1) {
                            }
                        }
                        ykVar = vc0.E7jCp8Ls(r2);
                    }
                }
                if ((he0Var.encWxUiV2 & 16) == 0) {
                    return;
                } else {
                    he0Var = he0Var.JFJ3QoxA;
                }
            }
        }
    }

    public final void OOA6hdeuvCS() {
        this.YZjbz8VdP5 = this.AEn1Rrio;
        e60 e60Var = e60.AvO7iQsrTN;
        this.AEn1Rrio = e60Var;
        rg0 arNh8D4Z5gB = arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var = (g60) objArr[i2];
            if (g60Var.AEn1Rrio != e60Var) {
                g60Var.OOA6hdeuvCS();
            }
        }
    }

    public final void TpUsjqg3bxO(bk0 bk0Var) {
        gn0 gn0Var = this.Mjvvu5DE;
        mt0 rectManager = gn0Var != null ? ((c) gn0Var).getRectManager() : null;
        k60 k60Var = this.MZhzXH72;
        int i = 0;
        boolean z = k60Var.xqGvceK5x != c60.mOu10nynGul || YmKjaVtbfp5Z() || WIEu4Ya2g8();
        if (this.rQPn8YBR && rectManager != null) {
            if (bk0Var == this.A1EKNP6CxJ.xqGvceK5x) {
                this.JFJ3QoxA = true;
                if (!z) {
                    rectManager.EljAMC1QTz(this);
                }
            } else {
                this.mOu10nynGul = true;
                rg0 arNh8D4Z5gB = arNh8D4Z5gB();
                Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
                int i2 = arNh8D4Z5gB.AvO7iQsrTN;
                for (int i3 = 0; i3 < i2; i3++) {
                    g60 g60Var = (g60) objArr[i3];
                    g60Var.JFJ3QoxA = true;
                    if (!z) {
                        rectManager.EljAMC1QTz(g60Var);
                    }
                }
                if (this.rQPn8YBR) {
                    rectManager.OOA6hdeuvCS = true;
                    x0 x0Var = rectManager.Yi7zF1RB1;
                    int i4 = this.EljAMC1QTz & 33554431;
                    long[] jArr = (long[]) x0Var.Yi7zF1RB1;
                    int i5 = x0Var.GWasM1elztuh;
                    while (true) {
                        if (i >= jArr.length - 2 || i >= i5) {
                            break;
                        }
                        int i6 = i + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i4) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                        i += 3;
                    }
                }
                rectManager.mOu10nynGul();
            }
        }
        k60Var.WIEu4Ya2g8.bCsSzSHkbaQ();
    }

    public final void Uxq83abb04() {
        rg0 arNh8D4Z5gB = arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var = (g60) objArr[i2];
            e60 e60Var = g60Var.YZjbz8VdP5;
            g60Var.AEn1Rrio = e60Var;
            if (e60Var != e60.AvO7iQsrTN) {
                g60Var.Uxq83abb04();
            }
        }
    }

    public final void VeqTn1PQw7() {
        d dVar = this.uFEq9NpZ;
        int i = ((rg0) dVar.EljAMC1QTz).AvO7iQsrTN;
        while (true) {
            i--;
            rg0 rg0Var = (rg0) dVar.EljAMC1QTz;
            if (-1 >= i) {
                rg0Var.AvO7iQsrTN();
                ((d3) dVar.AvO7iQsrTN).GWasM1elztuh();
                return;
            }
            rezfBrjOrqK((g60) rg0Var.OOA6hdeuvCS[i]);
        }
    }

    public final boolean WIEu4Ya2g8() {
        return this.MZhzXH72.WIEu4Ya2g8.arNh8D4Z5gB;
    }

    public final rg0 WRKkgoJXwDn() {
        boolean z = this.WRKkgoJXwDn;
        rg0 rg0Var = this.WdrkLMV3xh;
        if (z) {
            rg0Var.AvO7iQsrTN();
            rg0Var.X1lG3V04pd(rg0Var.AvO7iQsrTN, arNh8D4Z5gB());
            Arrays.sort(rg0Var.OOA6hdeuvCS, 0, rg0Var.AvO7iQsrTN, J3Xc8BaqpN8);
            this.WRKkgoJXwDn = false;
        }
        return rg0Var;
    }

    public final zz0 WdrkLMV3xh() {
        if (eUH21U3apd() && !this.YXi2hvwn7WL && this.A1EKNP6CxJ.xqGvceK5x(8)) {
            return this.cilMamHF;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [bk0, he0] */
    public final void X1lG3V04pd(ie0 ie0Var) {
        ?? r7;
        xj0 xj0Var;
        wj0 wj0Var;
        rg0 rg0Var;
        boolean z;
        boolean z2;
        boolean z3;
        rg0 rg0Var2;
        boolean z4;
        NWXxPwoOUSX9 nWXxPwoOUSX9;
        xj0 xj0Var2 = this.A1EKNP6CxJ;
        boolean xqGvceK5x = xj0Var2.xqGvceK5x(16);
        he0 he0Var = xj0Var2.OOA6hdeuvCS;
        boolean xqGvceK5x2 = xj0Var2.xqGvceK5x(1024);
        this.TpUsjqg3bxO = ie0Var;
        z10 z10Var = xj0Var2.X1lG3V04pd;
        g60 g60Var = xj0Var2.GWasM1elztuh;
        he0 he0Var2 = xj0Var2.EljAMC1QTz;
        wj0 wj0Var2 = xj0Var2.Yi7zF1RB1;
        if (he0Var2 == wj0Var2) {
            t10.Yi7zF1RB1("padChain called on already padded chain");
        }
        he0 he0Var3 = xj0Var2.EljAMC1QTz;
        he0Var3.mOu10nynGul = wj0Var2;
        wj0Var2.JFJ3QoxA = he0Var3;
        rg0 rg0Var3 = xj0Var2.AvO7iQsrTN;
        int i = rg0Var3 != null ? rg0Var3.AvO7iQsrTN : 0;
        rg0 rg0Var4 = xj0Var2.encWxUiV2;
        if (rg0Var4 == null) {
            rg0Var4 = new rg0(new ge0[16]);
        }
        rg0 rg0Var5 = xj0Var2.mOu10nynGul;
        rg0Var5.Yi7zF1RB1(ie0Var);
        NWXxPwoOUSX9 nWXxPwoOUSX92 = null;
        while (true) {
            int i2 = rg0Var5.AvO7iQsrTN;
            if (i2 == 0) {
                break;
            }
            ie0 ie0Var2 = (ie0) rg0Var5.rQPn8YBR(i2 - 1);
            if (ie0Var2 instanceof pc) {
                pc pcVar = (pc) ie0Var2;
                rg0Var5.Yi7zF1RB1(pcVar.Yi7zF1RB1);
                rg0Var5.Yi7zF1RB1(pcVar.GWasM1elztuh);
            } else if (ie0Var2 instanceof ge0) {
                rg0Var4.Yi7zF1RB1(ie0Var2);
            } else {
                if (nWXxPwoOUSX92 == null) {
                    nWXxPwoOUSX9 = new NWXxPwoOUSX9(15, rg0Var4);
                    nWXxPwoOUSX92 = nWXxPwoOUSX9;
                } else {
                    nWXxPwoOUSX9 = nWXxPwoOUSX92;
                }
                ie0Var2.Yi7zF1RB1(nWXxPwoOUSX9);
            }
        }
        int i3 = rg0Var4.AvO7iQsrTN;
        if (i3 == i) {
            he0 he0Var4 = wj0Var2.JFJ3QoxA;
            int i4 = 0;
            while (he0Var4 != null && i4 < i) {
                if (rg0Var3 == null) {
                    throw mr0.EljAMC1QTz("expected prior modifier list to be non-empty");
                }
                ge0 ge0Var = (ge0) rg0Var3.OOA6hdeuvCS[i4];
                ge0 ge0Var2 = (ge0) rg0Var4.OOA6hdeuvCS[i4];
                if (o30.rQPn8YBR(ge0Var, ge0Var2)) {
                    rg0Var2 = rg0Var3;
                    z4 = 2;
                } else {
                    rg0Var2 = rg0Var3;
                    z4 = ge0Var.getClass() == ge0Var2.getClass();
                }
                if (!z4) {
                    he0Var4 = he0Var4.mOu10nynGul;
                    break;
                }
                if (z4) {
                    xj0.encWxUiV2(ge0Var, ge0Var2, he0Var4);
                }
                he0Var4 = he0Var4.JFJ3QoxA;
                i4++;
                rg0Var3 = rg0Var2;
            }
            rg0Var2 = rg0Var3;
            if (i4 >= i) {
                xj0Var2 = xj0Var2;
                rg0Var3 = rg0Var2;
                z2 = false;
                xj0Var = xj0Var2;
                wj0Var = wj0Var2;
                rg0Var = rg0Var4;
                z = false;
                r7 = z2;
            } else {
                if (rg0Var2 == null) {
                    throw mr0.EljAMC1QTz("expected prior modifier list to be non-empty");
                }
                if (he0Var4 == null) {
                    throw mr0.EljAMC1QTz("structuralUpdate requires a non-null tail");
                }
                boolean z5 = g60Var.dqB83aoLBB != null;
                he0 he0Var5 = he0Var4;
                xj0Var = xj0Var2;
                rg0Var = rg0Var4;
                rg0Var3 = rg0Var2;
                z3 = false;
                xj0Var.EljAMC1QTz(i4, rg0Var3, rg0Var, he0Var5, !z5);
                wj0Var = wj0Var2;
                z = true;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            ie0 ie0Var3 = g60Var.dqB83aoLBB;
            if (ie0Var3 != null && i == 0) {
                he0 he0Var6 = wj0Var2;
                for (int i5 = 0; i5 < rg0Var4.AvO7iQsrTN; i5++) {
                    he0Var6 = xj0.Yi7zF1RB1((ge0) rg0Var4.OOA6hdeuvCS[i5], he0Var6);
                }
                int i6 = 0;
                for (he0 he0Var7 = he0Var.mOu10nynGul; he0Var7 != null && he0Var7 != wj0Var2; he0Var7 = he0Var7.mOu10nynGul) {
                    i6 |= he0Var7.AvO7iQsrTN;
                    he0Var7.encWxUiV2 = i6;
                }
                xj0Var = xj0Var2;
                wj0Var = wj0Var2;
                rg0Var = rg0Var4;
                z = true;
                r7 = z3;
            } else if (i3 != 0) {
                if (rg0Var3 == null) {
                    rg0Var3 = new rg0(new ge0[16]);
                }
                xj0Var = xj0Var2;
                wj0Var = wj0Var2;
                rg0Var = rg0Var4;
                xj0Var.EljAMC1QTz(0, rg0Var3, rg0Var, wj0Var, !(ie0Var3 != null));
                z = true;
            } else {
                if (rg0Var3 == null) {
                    throw mr0.EljAMC1QTz("expected prior modifier list to be non-empty");
                }
                he0 he0Var8 = wj0Var2.JFJ3QoxA;
                for (int i7 = 0; he0Var8 != null && i7 < rg0Var3.AvO7iQsrTN; i7++) {
                    he0Var8 = xj0.X1lG3V04pd(he0Var8).JFJ3QoxA;
                }
                g60 cilMamHF = g60Var.cilMamHF();
                z10Var.Y6hRI1cF8 = cilMamHF != null ? cilMamHF.A1EKNP6CxJ.X1lG3V04pd : null;
                xj0Var2.xqGvceK5x = z10Var;
                xj0Var = xj0Var2;
                wj0Var = wj0Var2;
                rg0Var = rg0Var4;
                z = false;
                r7 = z2;
            }
        }
        xj0Var.AvO7iQsrTN = rg0Var;
        if (rg0Var3 != null) {
            rg0Var3.AvO7iQsrTN();
        } else {
            rg0Var3 = r7;
        }
        xj0Var.encWxUiV2 = rg0Var3;
        he0 he0Var9 = wj0Var.JFJ3QoxA;
        if (he0Var9 != null) {
            he0Var = he0Var9;
        }
        he0Var.mOu10nynGul = r7;
        wj0Var.JFJ3QoxA = r7;
        wj0Var.encWxUiV2 = -1;
        wj0Var.E7jCp8Ls = r7;
        if (he0Var == wj0Var) {
            t10.Yi7zF1RB1("trimChain did not update the head");
        }
        xj0Var.EljAMC1QTz = he0Var;
        if (z) {
            xj0Var.AvO7iQsrTN();
        }
        boolean xqGvceK5x3 = xj0Var.xqGvceK5x(16);
        boolean xqGvceK5x4 = xj0Var.xqGvceK5x(1024);
        this.MZhzXH72.JFJ3QoxA();
        if (this.E7jCp8Ls == null && xj0Var.xqGvceK5x(512)) {
            ZCWXqiC0(this);
        }
        if (xqGvceK5x == xqGvceK5x3 && xqGvceK5x2 == xqGvceK5x4) {
            return;
        }
        mt0 rectManager = ((c) j60.GWasM1elztuh(this)).getRectManager();
        rectManager.getClass();
        if (eUH21U3apd()) {
            x0 x0Var = rectManager.Yi7zF1RB1;
            int i8 = this.EljAMC1QTz & 33554431;
            long[] jArr = (long[]) x0Var.Yi7zF1RB1;
            int i9 = x0Var.GWasM1elztuh;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 33554431) == i8) {
                    jArr[i11] = ((-6917529027641081857L) & j) | ((xqGvceK5x4 ? 1L : 0L) * 2305843009213693952L) | ((xqGvceK5x3 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final List XnEVoBF0td1l() {
        return this.MZhzXH72.WIEu4Ya2g8.nXl1EmE5();
    }

    @Override // defpackage.hn0
    public final boolean Y6hRI1cF8() {
        return eUH21U3apd();
    }

    public final void YXi2hvwn7WL() {
        g60 cilMamHF;
        if (this.AEn1Rrio == e60.AvO7iQsrTN) {
            EljAMC1QTz();
        }
        ad0 ad0Var = this.MZhzXH72.WIEu4Ya2g8;
        k60 k60Var = ad0Var.JFJ3QoxA;
        try {
            ad0Var.rQPn8YBR = true;
            if (!ad0Var.iwATDS1i01k) {
                t10.Yi7zF1RB1("replace called on unplaced item");
            }
            boolean z = ad0Var.lv06NcmrQ;
            ad0Var.vaTCmWUgXF(ad0Var.Mjvvu5DE, ad0Var.jivtDDk9H, ad0Var.mE4lRynR);
            if (z && !ad0Var.MZhzXH72 && (cilMamHF = k60Var.GWasM1elztuh.cilMamHF()) != null) {
                cilMamHF.J3Xc8BaqpN8(false);
            }
        } finally {
        }
    }

    public final void YZjbz8VdP5() {
        g60 g60Var;
        if (this.XnEVoBF0td1l > 0) {
            this.WIEu4Ya2g8 = true;
        }
        if (!this.OOA6hdeuvCS || (g60Var = this.YmKjaVtbfp5Z) == null) {
            return;
        }
        g60Var.YZjbz8VdP5();
    }

    @Override // defpackage.be
    public final void Yi7zF1RB1() {
        VJUcwvGgb9W vJUcwvGgb9W;
        v60 v60Var = this.DmJncFq5;
        if (v60Var != null) {
            v60Var.mOu10nynGul(true);
        }
        this.YXi2hvwn7WL = true;
        he0 he0Var = this.A1EKNP6CxJ.OOA6hdeuvCS;
        for (he0 he0Var2 = he0Var; he0Var2 != null; he0Var2 = he0Var2.mOu10nynGul) {
            if (he0Var2.Mjvvu5DE) {
                he0Var2.hOpoc9RpANL();
            }
        }
        for (he0 he0Var3 = he0Var; he0Var3 != null; he0Var3 = he0Var3.mOu10nynGul) {
            if (he0Var3.Mjvvu5DE) {
                he0Var3.FhVkB11j();
            }
        }
        while (he0Var != null) {
            if (he0Var.Mjvvu5DE) {
                he0Var.vaTCmWUgXF();
            }
            he0Var = he0Var.mOu10nynGul;
        }
        if (eUH21U3apd()) {
            this.cilMamHF = null;
            this.Y6hRI1cF8 = false;
        }
        gn0 gn0Var = this.Mjvvu5DE;
        if (gn0Var != null) {
            c cVar = (c) gn0Var;
            if (c.encWxUiV2() && (vJUcwvGgb9W = cVar.z19UFEN2I) != null && vJUcwvGgb9W.rQPn8YBR.OOA6hdeuvCS(this.EljAMC1QTz)) {
                vJUcwvGgb9W.OOA6hdeuvCS.uFEq9NpZ(vJUcwvGgb9W.AvO7iQsrTN, this.EljAMC1QTz, false);
            }
        }
    }

    public final boolean YmKjaVtbfp5Z() {
        return this.MZhzXH72.WIEu4Ya2g8.WRKkgoJXwDn;
    }

    public final void ZCWXqiC0(g60 g60Var) {
        if (o30.rQPn8YBR(g60Var, this.E7jCp8Ls)) {
            return;
        }
        this.E7jCp8Ls = g60Var;
        k60 k60Var = this.MZhzXH72;
        if (g60Var != null) {
            if (k60Var.YmKjaVtbfp5Z == null) {
                k60Var.YmKjaVtbfp5Z = new ac0(k60Var);
            }
            xj0 xj0Var = this.A1EKNP6CxJ;
            bk0 bk0Var = xj0Var.X1lG3V04pd.jivtDDk9H;
            for (bk0 bk0Var2 = xj0Var.xqGvceK5x; !o30.rQPn8YBR(bk0Var2, bk0Var) && bk0Var2 != null; bk0Var2 = bk0Var2.jivtDDk9H) {
                bk0Var2.d5idzIhj55b();
            }
        } else {
            k60Var.YmKjaVtbfp5Z = null;
            k60Var.EljAMC1QTz = false;
            k60Var.OOA6hdeuvCS = false;
        }
        ozMwhSAI();
    }

    public final rg0 arNh8D4Z5gB() {
        EDwNPVYuViP0();
        if (this.XnEVoBF0td1l == 0) {
            return (rg0) this.uFEq9NpZ.EljAMC1QTz;
        }
        rg0 rg0Var = this.iwATDS1i01k;
        rg0Var.getClass();
        return rg0Var;
    }

    public final void c4eaifQP(el elVar) {
        if (o30.rQPn8YBR(this.M3K9sHhK, elVar)) {
            return;
        }
        this.M3K9sHhK = elVar;
        ozMwhSAI();
        g60 cilMamHF = cilMamHF();
        if (cilMamHF != null) {
            cilMamHF.k8h8IjolWQ();
        } else {
            gn0 gn0Var = this.Mjvvu5DE;
            if (gn0Var != null) {
                ((c) gn0Var).invalidate();
            }
        }
        EXrPz3p7hFb();
        for (he0 he0Var = this.A1EKNP6CxJ.EljAMC1QTz; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.GWasM1elztuh();
        }
    }

    public final g60 cilMamHF() {
        g60 g60Var = this.YmKjaVtbfp5Z;
        while (g60Var != null && g60Var.OOA6hdeuvCS) {
            g60Var = g60Var.YmKjaVtbfp5Z;
        }
        return g60Var;
    }

    public final void dqB83aoLBB() {
        if (!this.OOA6hdeuvCS) {
            this.WRKkgoJXwDn = true;
            return;
        }
        g60 cilMamHF = cilMamHF();
        if (cilMamHF != null) {
            cilMamHF.dqB83aoLBB();
        }
    }

    public final boolean eUH21U3apd() {
        return this.Mjvvu5DE != null;
    }

    public final void encWxUiV2() {
        VJUcwvGgb9W vJUcwvGgb9W;
        h60 h60Var;
        gn0 gn0Var = this.Mjvvu5DE;
        if (gn0Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            g60 cilMamHF = cilMamHF();
            sb.append(cilMamHF != null ? cilMamHF.AvO7iQsrTN(0) : null);
            t10.X1lG3V04pd(sb.toString());
            throw new vc();
        }
        g60 cilMamHF2 = cilMamHF();
        k60 k60Var = this.MZhzXH72;
        if (cilMamHF2 != null) {
            cilMamHF2.k8h8IjolWQ();
            cilMamHF2.ozMwhSAI();
            ad0 ad0Var = k60Var.WIEu4Ya2g8;
            e60 e60Var = e60.AvO7iQsrTN;
            ad0Var.WIEu4Ya2g8 = e60Var;
            ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
            if (ac0Var != null) {
                ac0Var.uFEq9NpZ = e60Var;
            }
        }
        h60 h60Var2 = k60Var.WIEu4Ya2g8.M3K9sHhK;
        h60Var2.Yi7zF1RB1 = true;
        h60Var2.X1lG3V04pd = false;
        h60Var2.OOA6hdeuvCS = false;
        h60Var2.xqGvceK5x = false;
        h60Var2.EljAMC1QTz = false;
        h60Var2.AvO7iQsrTN = false;
        h60Var2.encWxUiV2 = null;
        ac0 ac0Var2 = k60Var.YmKjaVtbfp5Z;
        if (ac0Var2 != null && (h60Var = ac0Var2.cilMamHF) != null) {
            h60Var.Yi7zF1RB1 = true;
            h60Var.X1lG3V04pd = false;
            h60Var.OOA6hdeuvCS = false;
            h60Var.xqGvceK5x = false;
            h60Var.EljAMC1QTz = false;
            h60Var.AvO7iQsrTN = false;
            h60Var.encWxUiV2 = null;
        }
        xj0 xj0Var = this.A1EKNP6CxJ;
        he0 he0Var = xj0Var.OOA6hdeuvCS;
        bk0 bk0Var = xj0Var.X1lG3V04pd.jivtDDk9H;
        for (bk0 bk0Var2 = xj0Var.xqGvceK5x; !o30.rQPn8YBR(bk0Var2, bk0Var) && bk0Var2 != null; bk0Var2 = bk0Var2.jivtDDk9H) {
            bk0Var2.UpJpMKXj();
            if (bk0Var2.mE4lRynR.A1EKNP6CxJ()) {
                bk0Var2.ddkiCTz5mZ();
            }
        }
        for (he0 he0Var2 = he0Var; he0Var2 != null; he0Var2 = he0Var2.mOu10nynGul) {
            if (he0Var2.Mjvvu5DE) {
                he0Var2.FhVkB11j();
            }
        }
        this.jivtDDk9H = true;
        rg0 rg0Var = (rg0) this.uFEq9NpZ.EljAMC1QTz;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ((g60) objArr[i2]).encWxUiV2();
        }
        this.jivtDDk9H = false;
        while (he0Var != null) {
            if (he0Var.Mjvvu5DE) {
                he0Var.vaTCmWUgXF();
            }
            he0Var = he0Var.mOu10nynGul;
        }
        c cVar = (c) gn0Var;
        cVar.m9getLayoutNodes().AvO7iQsrTN(this.EljAMC1QTz);
        yc0 yc0Var = cVar.c4eaifQP;
        f4 f4Var = yc0Var.Yi7zF1RB1;
        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).YmKjaVtbfp5Z(this);
        ((j6IIN2O8eOU) f4Var.X1lG3V04pd).YmKjaVtbfp5Z(this);
        ((j6IIN2O8eOU) f4Var.xqGvceK5x).YmKjaVtbfp5Z(this);
        ((rg0) yc0Var.OOA6hdeuvCS.EljAMC1QTz).JFJ3QoxA(this);
        cVar.YXi2hvwn7WL = true;
        if (c.encWxUiV2() && (vJUcwvGgb9W = cVar.z19UFEN2I) != null && vJUcwvGgb9W.rQPn8YBR.OOA6hdeuvCS(this.EljAMC1QTz)) {
            vJUcwvGgb9W.OOA6hdeuvCS.uFEq9NpZ(vJUcwvGgb9W.AvO7iQsrTN, this.EljAMC1QTz, false);
        }
        cVar.getRectManager().AvO7iQsrTN(this);
        this.Mjvvu5DE = null;
        ZCWXqiC0(null);
        this.mE4lRynR = 0;
        ad0 ad0Var2 = k60Var.WIEu4Ya2g8;
        ad0Var2.XnEVoBF0td1l = Integer.MAX_VALUE;
        ad0Var2.E7jCp8Ls = Integer.MAX_VALUE;
        ad0Var2.lv06NcmrQ = false;
        ac0 ac0Var3 = k60Var.YmKjaVtbfp5Z;
        if (ac0Var3 != null) {
            ac0Var3.XnEVoBF0td1l = Integer.MAX_VALUE;
            ac0Var3.E7jCp8Ls = Integer.MAX_VALUE;
            ac0Var3.Y6hRI1cF8 = yb0.AvO7iQsrTN;
        }
        if (xj0Var.xqGvceK5x(8)) {
            zz0 zz0Var = this.cilMamHF;
            this.cilMamHF = null;
            this.Y6hRI1cF8 = false;
            cVar.getSemanticsOwner().Yi7zF1RB1(this, zz0Var);
            cVar.pog2g9KITJA();
        }
    }

    public final List iwATDS1i01k() {
        return ((rg0) this.uFEq9NpZ.EljAMC1QTz).EljAMC1QTz();
    }

    public final d jivtDDk9H() {
        d dVar = this.pog2g9KITJA;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this, this.arNh8D4Z5gB);
        this.pog2g9KITJA = dVar2;
        return dVar2;
    }

    public final void k8h8IjolWQ() {
        if (this.rezfBrjOrqK) {
            xj0 xj0Var = this.A1EKNP6CxJ;
            bk0 bk0Var = xj0Var.X1lG3V04pd;
            bk0 bk0Var2 = xj0Var.xqGvceK5x.Y6hRI1cF8;
            this.HFYAaqMd6 = null;
            while (true) {
                if (o30.rQPn8YBR(bk0Var, bk0Var2)) {
                    break;
                }
                if ((bk0Var != null ? bk0Var.VeqTn1PQw7 : null) != null) {
                    this.HFYAaqMd6 = bk0Var;
                    break;
                }
                bk0Var = bk0Var != null ? bk0Var.Y6hRI1cF8 : null;
            }
            this.rezfBrjOrqK = false;
        }
        bk0 bk0Var3 = this.HFYAaqMd6;
        if (bk0Var3 != null && bk0Var3.VeqTn1PQw7 == null) {
            throw mr0.EljAMC1QTz("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (bk0Var3 != null) {
            bk0Var3.r8u5JxottJCl();
            return;
        }
        g60 cilMamHF = cilMamHF();
        if (cilMamHF != null) {
            cilMamHF.k8h8IjolWQ();
            return;
        }
        gn0 gn0Var = this.Mjvvu5DE;
        if (gn0Var != null) {
            ((c) gn0Var).invalidate();
        }
    }

    public final int lv06NcmrQ() {
        return this.MZhzXH72.WIEu4Ya2g8.XnEVoBF0td1l;
    }

    public final e60 mE4lRynR() {
        e60 e60Var;
        ac0 ac0Var = this.MZhzXH72.YmKjaVtbfp5Z;
        return (ac0Var == null || (e60Var = ac0Var.uFEq9NpZ) == null) ? e60.AvO7iQsrTN : e60Var;
    }

    public final void mOu10nynGul(s9 s9Var, oy oyVar) {
        try {
            this.A1EKNP6CxJ.xqGvceK5x.bfDgRvRIg(s9Var, oyVar);
        } catch (Throwable th) {
            Fm8W7vP7q(th);
            throw null;
        }
    }

    public final void mqNvfisv7(int i) {
        g60 cilMamHF;
        g60 cilMamHF2;
        int i2 = this.z19UFEN2I;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (cilMamHF2 = cilMamHF()) != null) {
                cilMamHF2.mqNvfisv7(cilMamHF2.z19UFEN2I + 1);
            }
            if (i == 0 && this.z19UFEN2I > 0 && (cilMamHF = cilMamHF()) != null) {
                cilMamHF.mqNvfisv7(cilMamHF.z19UFEN2I - 1);
            }
            this.z19UFEN2I = i;
        }
    }

    public final void ozMwhSAI() {
        if (this.OOA6hdeuvCS) {
            g60 cilMamHF = cilMamHF();
            if (cilMamHF != null) {
                cilMamHF.ozMwhSAI();
                return;
            }
            return;
        }
        if (this.E7jCp8Ls != null) {
            qugwajBSa59j(this, false, 7);
        } else {
            MItybXapHX(this, false, 7);
        }
    }

    public final void pog2g9KITJA(long j, nz nzVar, int i, boolean z) {
        xj0 xj0Var = this.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.xqGvceK5x;
        yu0 yu0Var = bk0.z19UFEN2I;
        xj0Var.xqGvceK5x.NsRGN7gRqWF(bk0.CMh55RymNfS, bk0Var.R46bVSe7ra(j), nzVar, i, z);
    }

    public final void rQPn8YBR() {
        if (this.E7jCp8Ls != null) {
            qugwajBSa59j(this, false, 5);
        } else {
            MItybXapHX(this, false, 5);
        }
        ad0 ad0Var = this.MZhzXH72.WIEu4Ya2g8;
        eg egVar = ad0Var.uFEq9NpZ ? new eg(ad0Var.encWxUiV2) : null;
        gn0 gn0Var = this.Mjvvu5DE;
        if (egVar != null) {
            if (gn0Var != null) {
                ((c) gn0Var).cilMamHF(this, egVar.GWasM1elztuh);
            }
        } else if (gn0Var != null) {
            ((c) gn0Var).Y6hRI1cF8(true);
        }
    }

    public final void rezfBrjOrqK(g60 g60Var) {
        if (g60Var.MZhzXH72.E7jCp8Ls > 0) {
            this.MZhzXH72.xqGvceK5x(r0.E7jCp8Ls - 1);
        }
        if (this.Mjvvu5DE != null) {
            g60Var.encWxUiV2();
        }
        g60Var.YmKjaVtbfp5Z = null;
        if (g60Var.z19UFEN2I > 0) {
            mqNvfisv7(this.z19UFEN2I - 1);
        }
        g60Var.A1EKNP6CxJ.xqGvceK5x.Y6hRI1cF8 = null;
        if (g60Var.OOA6hdeuvCS) {
            this.XnEVoBF0td1l--;
            rg0 rg0Var = (rg0) g60Var.uFEq9NpZ.EljAMC1QTz;
            Object[] objArr = rg0Var.OOA6hdeuvCS;
            int i = rg0Var.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                ((g60) objArr[i2]).A1EKNP6CxJ.xqGvceK5x.Y6hRI1cF8 = null;
            }
        }
        YZjbz8VdP5();
        dqB83aoLBB();
    }

    public final String toString() {
        return p.WdrkLMV3xh(this) + " children: " + ((og0) uFEq9NpZ()).OOA6hdeuvCS.AvO7iQsrTN + " measurePolicy: " + this.arNh8D4Z5gB + " deactivated: " + this.YXi2hvwn7WL;
    }

    public final List uFEq9NpZ() {
        return arNh8D4Z5gB().EljAMC1QTz();
    }

    public final void xqGvceK5x(gn0 gn0Var) {
        g60 g60Var;
        VJUcwvGgb9W vJUcwvGgb9W;
        zz0 WdrkLMV3xh;
        if (this.Mjvvu5DE != null) {
            t10.Yi7zF1RB1("Cannot attach " + this + " as it already is attached.  Tree: " + AvO7iQsrTN(0));
        }
        g60 g60Var2 = this.YmKjaVtbfp5Z;
        if (g60Var2 != null && !o30.rQPn8YBR(g60Var2.Mjvvu5DE, gn0Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(gn0Var);
            sb.append(") than the parent's owner(");
            g60 cilMamHF = cilMamHF();
            sb.append(cilMamHF != null ? cilMamHF.Mjvvu5DE : null);
            sb.append("). This tree: ");
            sb.append(AvO7iQsrTN(0));
            sb.append(" Parent tree: ");
            g60 g60Var3 = this.YmKjaVtbfp5Z;
            sb.append(g60Var3 != null ? g60Var3.AvO7iQsrTN(0) : null);
            t10.Yi7zF1RB1(sb.toString());
        }
        g60 cilMamHF2 = cilMamHF();
        k60 k60Var = this.MZhzXH72;
        if (cilMamHF2 == null) {
            k60Var.WIEu4Ya2g8.lv06NcmrQ = true;
            ((c) gn0Var).getRectManager().EljAMC1QTz(this);
            ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
            if (ac0Var != null) {
                ac0Var.Y6hRI1cF8 = yb0.OOA6hdeuvCS;
            }
        }
        xj0 xj0Var = this.A1EKNP6CxJ;
        xj0Var.xqGvceK5x.Y6hRI1cF8 = cilMamHF2 != null ? cilMamHF2.A1EKNP6CxJ.X1lG3V04pd : null;
        this.Mjvvu5DE = gn0Var;
        this.mE4lRynR = (cilMamHF2 != null ? cilMamHF2.mE4lRynR : -1) + 1;
        ie0 ie0Var = this.dqB83aoLBB;
        if (ie0Var != null) {
            X1lG3V04pd(ie0Var);
        }
        this.dqB83aoLBB = null;
        ((c) gn0Var).m9getLayoutNodes().encWxUiV2(this.EljAMC1QTz, this);
        g60 g60Var4 = this.YmKjaVtbfp5Z;
        if (g60Var4 == null || (g60Var = g60Var4.E7jCp8Ls) == null) {
            g60Var = this.E7jCp8Ls;
        }
        ZCWXqiC0(g60Var);
        if (this.E7jCp8Ls == null && xj0Var.xqGvceK5x(512)) {
            ZCWXqiC0(this);
        }
        if (!this.YXi2hvwn7WL) {
            for (he0 he0Var = xj0Var.EljAMC1QTz; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
                he0Var.WkXHDbKiD();
            }
        }
        rg0 rg0Var = (rg0) this.uFEq9NpZ.EljAMC1QTz;
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ((g60) objArr[i2]).xqGvceK5x(gn0Var);
        }
        if (!this.YXi2hvwn7WL) {
            xj0Var.OOA6hdeuvCS();
        }
        ozMwhSAI();
        if (cilMamHF2 != null) {
            cilMamHF2.ozMwhSAI();
        }
        k60Var.JFJ3QoxA();
        if (!this.YXi2hvwn7WL && xj0Var.xqGvceK5x(8)) {
            AEn1Rrio();
        }
        c cVar = (c) gn0Var;
        if (!c.encWxUiV2() || (vJUcwvGgb9W = cVar.z19UFEN2I) == null || (WdrkLMV3xh = WdrkLMV3xh()) == null || !WdrkLMV3xh.OOA6hdeuvCS.Yi7zF1RB1(h01.Mjvvu5DE)) {
            return;
        }
        vJUcwvGgb9W.rQPn8YBR.GWasM1elztuh(this.EljAMC1QTz);
        vJUcwvGgb9W.OOA6hdeuvCS.uFEq9NpZ(vJUcwvGgb9W.AvO7iQsrTN, this.EljAMC1QTz, true);
    }

    public final void z19UFEN2I(int i, int i2) {
        if (i2 < 0) {
            t10.GWasM1elztuh("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            d dVar = this.uFEq9NpZ;
            rezfBrjOrqK((g60) ((rg0) dVar.EljAMC1QTz).OOA6hdeuvCS[i3]);
            Object rQPn8YBR = ((rg0) dVar.EljAMC1QTz).rQPn8YBR(i3);
            ((d3) dVar.AvO7iQsrTN).GWasM1elztuh();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public g60(int i) {
        this(a01.GWasM1elztuh.addAndGet(1), (i & 1) == 0);
    }
}
