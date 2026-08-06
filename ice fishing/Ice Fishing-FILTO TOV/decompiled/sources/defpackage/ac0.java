package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ac0 extends up0 implements wc0, NsRGN7gRqWF, ve0 {
    public boolean AEn1Rrio;
    public final k60 JFJ3QoxA;
    public Object M3K9sHhK;
    public eg Mjvvu5DE;
    public boolean WIEu4Ya2g8;
    public boolean WRKkgoJXwDn;
    public boolean YmKjaVtbfp5Z;
    public boolean iwATDS1i01k;
    public hv jivtDDk9H;
    public boolean rQPn8YBR;
    public int E7jCp8Ls = Integer.MAX_VALUE;
    public int XnEVoBF0td1l = Integer.MAX_VALUE;
    public e60 uFEq9NpZ = e60.AvO7iQsrTN;
    public long mE4lRynR = 0;
    public yb0 Y6hRI1cF8 = yb0.AvO7iQsrTN;
    public final h60 cilMamHF = new h60(this, 1);
    public final rg0 lv06NcmrQ = new rg0(new ac0[16]);
    public boolean WdrkLMV3xh = true;
    public final zb0 arNh8D4Z5gB = new zb0(this, 0);
    public boolean pog2g9KITJA = true;
    public long k8h8IjolWQ = fg.Yi7zF1RB1(0, 0, 15);
    public final zb0 EXrPz3p7hFb = new zb0(this, 2);
    public final zb0 ozMwhSAI = new zb0(this, 1);

    public ac0(k60 k60Var) {
        this.JFJ3QoxA = k60Var;
        this.M3K9sHhK = k60Var.WIEu4Ya2g8.cilMamHF;
    }

    @Override // defpackage.ve0
    public final void E7jCp8Ls(boolean z) {
        wb0 P4U4zqyW7wx;
        k60 k60Var = this.JFJ3QoxA;
        wb0 P4U4zqyW7wx2 = k60Var.GWasM1elztuh().P4U4zqyW7wx();
        if (Boolean.valueOf(z).equals(P4U4zqyW7wx2 != null ? Boolean.valueOf(P4U4zqyW7wx2.XnEVoBF0td1l) : null) || (P4U4zqyW7wx = k60Var.GWasM1elztuh().P4U4zqyW7wx()) == null) {
            return;
        }
        P4U4zqyW7wx.XnEVoBF0td1l = z;
    }

    @Override // defpackage.up0
    public final void EDwNPVYuViP0(long j, float f, hv hvVar) {
        cTIXpaxc(j, hvVar);
    }

    @Override // defpackage.wc0
    public final int EljAMC1QTz(int i) {
        WkXHDbKiD();
        wb0 P4U4zqyW7wx = this.JFJ3QoxA.GWasM1elztuh().P4U4zqyW7wx();
        P4U4zqyW7wx.getClass();
        return P4U4zqyW7wx.EljAMC1QTz(i);
    }

    @Override // defpackage.NsRGN7gRqWF
    public final h60 GWasM1elztuh() {
        return this.cilMamHF;
    }

    @Override // defpackage.wc0
    public final int J3Xc8BaqpN8(int i) {
        WkXHDbKiD();
        wb0 P4U4zqyW7wx = this.JFJ3QoxA.GWasM1elztuh().P4U4zqyW7wx();
        P4U4zqyW7wx.getClass();
        return P4U4zqyW7wx.J3Xc8BaqpN8(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r1 != null ? r1.MZhzXH72.xqGvceK5x : null) == defpackage.c60.encWxUiV2) goto L14;
     */
    @Override // defpackage.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final up0 OOA6hdeuvCS(long j) {
        e60 e60Var;
        k60 k60Var = this.JFJ3QoxA;
        g60 g60Var = k60Var.GWasM1elztuh;
        g60 g60Var2 = k60Var.GWasM1elztuh;
        g60 cilMamHF = g60Var.cilMamHF();
        if ((cilMamHF != null ? cilMamHF.MZhzXH72.xqGvceK5x : null) != c60.EljAMC1QTz) {
            g60 cilMamHF2 = g60Var2.cilMamHF();
        }
        k60Var.Yi7zF1RB1 = false;
        g60 cilMamHF3 = g60Var2.cilMamHF();
        e60 e60Var2 = e60.AvO7iQsrTN;
        if (cilMamHF3 != null) {
            k60 k60Var2 = cilMamHF3.MZhzXH72;
            if (this.uFEq9NpZ != e60Var2 && !g60Var2.eUH21U3apd) {
                t10.Yi7zF1RB1("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = k60Var2.xqGvceK5x.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                e60Var = e60.OOA6hdeuvCS;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    o4.XnEVoBF0td1l(k60Var2.xqGvceK5x, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                e60Var = e60.EljAMC1QTz;
            }
            this.uFEq9NpZ = e60Var;
        } else {
            this.uFEq9NpZ = e60Var2;
        }
        if (g60Var2.AEn1Rrio == e60Var2) {
            g60Var2.OOA6hdeuvCS();
        }
        bCsSzSHkbaQ(j);
        return this;
    }

    public final void UjhVk5crk() {
        k60 k60Var = this.JFJ3QoxA;
        if (k60Var.iwATDS1i01k > 0) {
            rg0 arNh8D4Z5gB = k60Var.GWasM1elztuh.arNh8D4Z5gB();
            Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
            int i = arNh8D4Z5gB.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                g60 g60Var = (g60) objArr[i2];
                k60 k60Var2 = g60Var.MZhzXH72;
                if ((k60Var2.XnEVoBF0td1l || k60Var2.uFEq9NpZ) && !k60Var2.EljAMC1QTz) {
                    g60Var.CMh55RymNfS(false);
                }
                ac0 ac0Var = k60Var2.YmKjaVtbfp5Z;
                if (ac0Var != null) {
                    ac0Var.UjhVk5crk();
                }
            }
        }
    }

    @Override // defpackage.wc0
    public final int Uxq83abb04(int i) {
        WkXHDbKiD();
        wb0 P4U4zqyW7wx = this.JFJ3QoxA.GWasM1elztuh().P4U4zqyW7wx();
        P4U4zqyW7wx.getClass();
        return P4U4zqyW7wx.Uxq83abb04(i);
    }

    @Override // defpackage.NsRGN7gRqWF
    public final int VeqTn1PQw7() {
        return this.XnEVoBF0td1l;
    }

    @Override // defpackage.NsRGN7gRqWF
    public final void WRKkgoJXwDn() {
        this.WRKkgoJXwDn = true;
        h60 h60Var = this.cilMamHF;
        h60Var.encWxUiV2();
        k60 k60Var = this.JFJ3QoxA;
        boolean z = k60Var.EljAMC1QTz;
        g60 g60Var = k60Var.GWasM1elztuh;
        if (z) {
            rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
            Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
            int i = arNh8D4Z5gB.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                g60 g60Var2 = (g60) objArr[i2];
                k60 k60Var2 = g60Var2.MZhzXH72;
                if (k60Var2.OOA6hdeuvCS && g60Var2.mE4lRynR() == e60.OOA6hdeuvCS) {
                    ac0 ac0Var = k60Var2.YmKjaVtbfp5Z;
                    ac0Var.getClass();
                    ac0 ac0Var2 = k60Var2.YmKjaVtbfp5Z;
                    eg egVar = ac0Var2 != null ? ac0Var2.Mjvvu5DE : null;
                    egVar.getClass();
                    if (ac0Var.bCsSzSHkbaQ(egVar.GWasM1elztuh)) {
                        g60.qugwajBSa59j(g60Var, false, 7);
                    }
                }
            }
        }
        y10 y10Var = iwATDS1i01k().MItybXapHX;
        y10Var.getClass();
        if (k60Var.AvO7iQsrTN || (!this.iwATDS1i01k && !y10Var.iwATDS1i01k && k60Var.EljAMC1QTz)) {
            k60Var.EljAMC1QTz = false;
            c60 c60Var = k60Var.xqGvceK5x;
            k60Var.xqGvceK5x = c60.encWxUiV2;
            k60Var.mOu10nynGul(false);
            in0 snapshotObserver = ((c) j60.GWasM1elztuh(g60Var)).getSnapshotObserver();
            snapshotObserver.GWasM1elztuh.X1lG3V04pd(g60Var, snapshotObserver.encWxUiV2, this.arNh8D4Z5gB);
            k60Var.xqGvceK5x = c60Var;
            if (k60Var.XnEVoBF0td1l && y10Var.iwATDS1i01k) {
                requestLayout();
            }
            k60Var.AvO7iQsrTN = false;
        }
        if (h60Var.xqGvceK5x) {
            h60Var.OOA6hdeuvCS = true;
        }
        if (h60Var.Yi7zF1RB1 && h60Var.OOA6hdeuvCS()) {
            h60Var.AvO7iQsrTN();
        }
        this.WRKkgoJXwDn = false;
    }

    public final void WkXHDbKiD() {
        k60 k60Var = this.JFJ3QoxA;
        g60.qugwajBSa59j(k60Var.GWasM1elztuh, false, 7);
        g60 g60Var = k60Var.GWasM1elztuh;
        g60 cilMamHF = g60Var.cilMamHF();
        if (cilMamHF == null || g60Var.AEn1Rrio != e60.AvO7iQsrTN) {
            return;
        }
        int ordinal = cilMamHF.MZhzXH72.xqGvceK5x.ordinal();
        g60Var.AEn1Rrio = ordinal != 0 ? ordinal != 2 ? cilMamHF.AEn1Rrio : e60.EljAMC1QTz : e60.OOA6hdeuvCS;
    }

    @Override // defpackage.NsRGN7gRqWF
    public final void YXi2hvwn7WL() {
        g60.qugwajBSa59j(this.JFJ3QoxA.GWasM1elztuh, false, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:37:0x0094, B:39:0x00b1, B:43:0x008f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bCsSzSHkbaQ(long j) {
        boolean z;
        int i;
        int i2;
        wb0 P4U4zqyW7wx;
        k60 k60Var = this.JFJ3QoxA;
        g60 g60Var = k60Var.GWasM1elztuh;
        g60 g60Var2 = k60Var.GWasM1elztuh;
        try {
            if (g60Var.YXi2hvwn7WL) {
                t10.GWasM1elztuh("measure is called on a deactivated node");
            }
            g60 cilMamHF = g60Var2.cilMamHF();
            if (!g60Var2.eUH21U3apd && (cilMamHF == null || !cilMamHF.eUH21U3apd)) {
                z = false;
                g60Var2.eUH21U3apd = z;
                if (!g60Var2.MZhzXH72.OOA6hdeuvCS) {
                    eg egVar = this.Mjvvu5DE;
                    if (egVar == null ? false : eg.Yi7zF1RB1(egVar.GWasM1elztuh, j)) {
                        gn0 gn0Var = g60Var2.Mjvvu5DE;
                        if (gn0Var != null) {
                            ((c) gn0Var).E7jCp8Ls(g60Var2, true);
                        }
                        g60Var2.Uxq83abb04();
                        return false;
                    }
                }
                this.Mjvvu5DE = new eg(j);
                Qd9Q8OZgvOo4(j);
                this.cilMamHF.EljAMC1QTz = false;
                rg0 arNh8D4Z5gB = g60Var2.arNh8D4Z5gB();
                Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
                i = arNh8D4Z5gB.AvO7iQsrTN;
                for (i2 = 0; i2 < i; i2++) {
                    ac0 ac0Var = ((g60) objArr[i2]).MZhzXH72.YmKjaVtbfp5Z;
                    ac0Var.getClass();
                    ac0Var.cilMamHF.X1lG3V04pd = false;
                }
                long j2 = !this.YmKjaVtbfp5Z ? this.AvO7iQsrTN : -9223372034707292160L;
                this.YmKjaVtbfp5Z = true;
                P4U4zqyW7wx = k60Var.GWasM1elztuh().P4U4zqyW7wx();
                if (P4U4zqyW7wx != null) {
                    t10.Yi7zF1RB1("Lookahead result from lookaheadRemeasure cannot be null");
                }
                k60Var.X1lG3V04pd(j);
                dcDmLGVhzWm((P4U4zqyW7wx.OOA6hdeuvCS << 32) | (P4U4zqyW7wx.EljAMC1QTz & 4294967295L));
                return ((int) (j2 >> 32)) == P4U4zqyW7wx.OOA6hdeuvCS || ((int) (j2 & 4294967295L)) != P4U4zqyW7wx.EljAMC1QTz;
            }
            z = true;
            g60Var2.eUH21U3apd = z;
            if (!g60Var2.MZhzXH72.OOA6hdeuvCS) {
            }
            this.Mjvvu5DE = new eg(j);
            Qd9Q8OZgvOo4(j);
            this.cilMamHF.EljAMC1QTz = false;
            rg0 arNh8D4Z5gB2 = g60Var2.arNh8D4Z5gB();
            Object[] objArr2 = arNh8D4Z5gB2.OOA6hdeuvCS;
            i = arNh8D4Z5gB2.AvO7iQsrTN;
            while (i2 < i) {
            }
            if (!this.YmKjaVtbfp5Z) {
            }
            this.YmKjaVtbfp5Z = true;
            P4U4zqyW7wx = k60Var.GWasM1elztuh().P4U4zqyW7wx();
            if (P4U4zqyW7wx != null) {
            }
            k60Var.X1lG3V04pd(j);
            dcDmLGVhzWm((P4U4zqyW7wx.OOA6hdeuvCS << 32) | (P4U4zqyW7wx.EljAMC1QTz & 4294967295L));
            if (((int) (j2 >> 32)) == P4U4zqyW7wx.OOA6hdeuvCS) {
            }
        } catch (Throwable th) {
            g60Var.Fm8W7vP7q(th);
            throw null;
        }
    }

    public final void cTIXpaxc(long j, hv hvVar) {
        k60 k60Var = this.JFJ3QoxA;
        g60 g60Var = k60Var.GWasM1elztuh;
        g60 g60Var2 = k60Var.GWasM1elztuh;
        try {
            g60 cilMamHF = g60Var.cilMamHF();
            c60 c60Var = cilMamHF != null ? cilMamHF.MZhzXH72.xqGvceK5x : null;
            c60 c60Var2 = c60.encWxUiV2;
            if (c60Var == c60Var2) {
                k60Var.X1lG3V04pd = false;
            }
            if (g60Var2.YXi2hvwn7WL) {
                t10.GWasM1elztuh("place is called on a deactivated node");
            }
            k60Var.xqGvceK5x = c60Var2;
            boolean z = true;
            this.WIEu4Ya2g8 = true;
            this.AEn1Rrio = false;
            if (!u20.GWasM1elztuh(j, this.mE4lRynR)) {
                if (k60Var.uFEq9NpZ || k60Var.XnEVoBF0td1l) {
                    k60Var.EljAMC1QTz = true;
                }
                UjhVk5crk();
            }
            gn0 GWasM1elztuh = j60.GWasM1elztuh(g60Var2);
            this.mE4lRynR = j;
            if (!k60Var.EljAMC1QTz) {
                if (this.Y6hRI1cF8 == yb0.AvO7iQsrTN) {
                    z = false;
                }
                if (z) {
                    wb0 P4U4zqyW7wx = k60Var.GWasM1elztuh().P4U4zqyW7wx();
                    P4U4zqyW7wx.getClass();
                    P4U4zqyW7wx.Hc2GqxcqBiX(u20.X1lG3V04pd(j, P4U4zqyW7wx.mOu10nynGul));
                    vaTCmWUgXF();
                    this.jivtDDk9H = hvVar;
                    k60Var.xqGvceK5x = c60.mOu10nynGul;
                }
            }
            k60Var.encWxUiV2(false);
            this.cilMamHF.AvO7iQsrTN = false;
            in0 snapshotObserver = ((c) GWasM1elztuh).getSnapshotObserver();
            snapshotObserver.GWasM1elztuh.X1lG3V04pd(g60Var2, snapshotObserver.AvO7iQsrTN, this.ozMwhSAI);
            this.jivtDDk9H = hvVar;
            k60Var.xqGvceK5x = c60.mOu10nynGul;
        } catch (Throwable th) {
            g60Var.Fm8W7vP7q(th);
            throw null;
        }
    }

    @Override // defpackage.wc0
    public final int dqB83aoLBB(int i) {
        WkXHDbKiD();
        wb0 P4U4zqyW7wx = this.JFJ3QoxA.GWasM1elztuh().P4U4zqyW7wx();
        P4U4zqyW7wx.getClass();
        return P4U4zqyW7wx.dqB83aoLBB(i);
    }

    @Override // defpackage.up0, defpackage.wc0
    public final Object encWxUiV2() {
        return this.M3K9sHhK;
    }

    public final void iriv6doqetn(boolean z) {
        if (z && nXl1EmE5()) {
            return;
        }
        if (z || nXl1EmE5()) {
            this.Y6hRI1cF8 = yb0.AvO7iQsrTN;
            rg0 arNh8D4Z5gB = this.JFJ3QoxA.GWasM1elztuh.arNh8D4Z5gB();
            Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
            int i = arNh8D4Z5gB.AvO7iQsrTN;
            for (int i2 = 0; i2 < i; i2++) {
                ac0 ac0Var = ((g60) objArr[i2]).MZhzXH72.YmKjaVtbfp5Z;
                ac0Var.getClass();
                ac0Var.iriv6doqetn(true);
            }
        }
    }

    @Override // defpackage.NsRGN7gRqWF
    public final z10 iwATDS1i01k() {
        return this.JFJ3QoxA.GWasM1elztuh.A1EKNP6CxJ.X1lG3V04pd;
    }

    @Override // defpackage.NsRGN7gRqWF
    public final NsRGN7gRqWF lv06NcmrQ() {
        k60 k60Var;
        g60 cilMamHF = this.JFJ3QoxA.GWasM1elztuh.cilMamHF();
        if (cilMamHF == null || (k60Var = cilMamHF.MZhzXH72) == null) {
            return null;
        }
        return k60Var.YmKjaVtbfp5Z;
    }

    @Override // defpackage.up0
    public final int mqNvfisv7(iK7aQfvhG ik7aqfvhg) {
        k60 k60Var = this.JFJ3QoxA;
        g60 cilMamHF = k60Var.GWasM1elztuh.cilMamHF();
        c60 c60Var = cilMamHF != null ? cilMamHF.MZhzXH72.xqGvceK5x : null;
        c60 c60Var2 = c60.EljAMC1QTz;
        h60 h60Var = this.cilMamHF;
        if (c60Var == c60Var2) {
            h60Var.X1lG3V04pd = true;
        } else {
            g60 cilMamHF2 = k60Var.GWasM1elztuh.cilMamHF();
            if ((cilMamHF2 != null ? cilMamHF2.MZhzXH72.xqGvceK5x : null) == c60.encWxUiV2) {
                h60Var.xqGvceK5x = true;
            }
        }
        this.iwATDS1i01k = true;
        wb0 P4U4zqyW7wx = k60Var.GWasM1elztuh().P4U4zqyW7wx();
        P4U4zqyW7wx.getClass();
        int mqNvfisv7 = P4U4zqyW7wx.mqNvfisv7(ik7aqfvhg);
        this.iwATDS1i01k = false;
        return mqNvfisv7;
    }

    public final boolean nXl1EmE5() {
        k60 k60Var = this.JFJ3QoxA;
        return l60.Mjvvu5DE(k60Var.GWasM1elztuh) || k60Var.X1lG3V04pd;
    }

    public final void oFzb77RX3H8t() {
        yb0 yb0Var = this.Y6hRI1cF8;
        k60 k60Var = this.JFJ3QoxA;
        boolean z = k60Var.X1lG3V04pd;
        g60 g60Var = k60Var.GWasM1elztuh;
        yb0 yb0Var2 = yb0.OOA6hdeuvCS;
        if (z) {
            this.Y6hRI1cF8 = yb0.EljAMC1QTz;
        } else {
            this.Y6hRI1cF8 = yb0Var2;
        }
        if (yb0Var != yb0Var2 && k60Var.OOA6hdeuvCS) {
            g60.qugwajBSa59j(g60Var, true, 6);
        }
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var2 = (g60) objArr[i2];
            ac0 ac0Var = g60Var2.MZhzXH72.YmKjaVtbfp5Z;
            if (ac0Var == null) {
                o4.mE4lRynR("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (ac0Var.XnEVoBF0td1l != Integer.MAX_VALUE) {
                ac0Var.oFzb77RX3H8t();
                g60.MjxSquD6Av(g60Var2);
            }
        }
    }

    @Override // defpackage.NsRGN7gRqWF
    public final void rQPn8YBR(NWXxPwoOUSX9 nWXxPwoOUSX9) {
        rg0 arNh8D4Z5gB = this.JFJ3QoxA.GWasM1elztuh.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            ac0 ac0Var = ((g60) objArr[i2]).MZhzXH72.YmKjaVtbfp5Z;
            ac0Var.getClass();
            nWXxPwoOUSX9.mOu10nynGul(ac0Var);
        }
    }

    @Override // defpackage.NsRGN7gRqWF
    public final void requestLayout() {
        this.JFJ3QoxA.GWasM1elztuh.CMh55RymNfS(false);
    }

    public final void vaTCmWUgXF() {
        c60 c60Var;
        this.AEn1Rrio = true;
        k60 k60Var = this.JFJ3QoxA;
        g60 cilMamHF = k60Var.GWasM1elztuh.cilMamHF();
        yb0 yb0Var = this.Y6hRI1cF8;
        if ((yb0Var != yb0.OOA6hdeuvCS && !k60Var.X1lG3V04pd) || (yb0Var != yb0.EljAMC1QTz && k60Var.X1lG3V04pd)) {
            oFzb77RX3H8t();
            if (this.rQPn8YBR && cilMamHF != null) {
                cilMamHF.CMh55RymNfS(false);
            }
        }
        if (cilMamHF != null) {
            k60 k60Var2 = cilMamHF.MZhzXH72;
            if (!this.rQPn8YBR && ((c60Var = k60Var2.xqGvceK5x) == c60.AvO7iQsrTN || c60Var == c60.encWxUiV2)) {
                if (this.XnEVoBF0td1l != Integer.MAX_VALUE) {
                    t10.Yi7zF1RB1("Place was called on a node which was placed already");
                }
                int i = k60Var2.encWxUiV2;
                this.XnEVoBF0td1l = i;
                k60Var2.encWxUiV2 = i + 1;
            }
        } else {
            this.XnEVoBF0td1l = 0;
        }
        WRKkgoJXwDn();
    }
}
