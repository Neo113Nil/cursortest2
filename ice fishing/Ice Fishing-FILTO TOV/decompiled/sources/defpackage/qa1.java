package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qa1 {
    public final ml E7jCp8Ls;
    public final le GWasM1elztuh;
    public final p41 JFJ3QoxA;
    public final fo0 OOA6hdeuvCS;
    public final String X1lG3V04pd;
    public final qa1 Yi7zF1RB1;
    public final fo0 encWxUiV2;
    public final p41 mOu10nynGul;
    public final fo0 rQPn8YBR;
    public final fo0 xqGvceK5x;
    public final do0 EljAMC1QTz = new do0(0);
    public final do0 AvO7iQsrTN = new do0(Long.MIN_VALUE);

    public qa1(le leVar, qa1 qa1Var, String str) {
        this.GWasM1elztuh = leVar;
        this.Yi7zF1RB1 = qa1Var;
        this.X1lG3V04pd = str;
        this.xqGvceK5x = z50.WRKkgoJXwDn(leVar.EljAMC1QTz());
        this.OOA6hdeuvCS = z50.WRKkgoJXwDn(new na1(leVar.EljAMC1QTz(), leVar.EljAMC1QTz()));
        Boolean bool = Boolean.FALSE;
        this.encWxUiV2 = z50.WRKkgoJXwDn(bool);
        this.mOu10nynGul = new p41();
        this.JFJ3QoxA = new p41();
        this.rQPn8YBR = z50.WRKkgoJXwDn(bool);
        this.E7jCp8Ls = z50.iwATDS1i01k(new ja1(this, 1));
        leVar.rQPn8YBR(this);
    }

    public final boolean AvO7iQsrTN() {
        return ((Boolean) this.rQPn8YBR.getValue()).booleanValue();
    }

    public final void E7jCp8Ls(long j) {
        do0 do0Var = this.AvO7iQsrTN;
        if (do0Var.AvO7iQsrTN() == Long.MIN_VALUE) {
            do0Var.encWxUiV2(j);
        }
        uFEq9NpZ(j);
        this.encWxUiV2.setValue(Boolean.FALSE);
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            ((oa1) p41Var.get(i)).X1lG3V04pd(j);
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qa1 qa1Var = (qa1) p41Var2.get(i2);
            if (!o30.rQPn8YBR(qa1Var.xqGvceK5x.getValue(), qa1Var.GWasM1elztuh.EljAMC1QTz())) {
                qa1Var.E7jCp8Ls(j);
            }
        }
    }

    public final ma1 EljAMC1QTz() {
        return (ma1) this.OOA6hdeuvCS.getValue();
    }

    public final void GWasM1elztuh(Object obj, qx qxVar, int i) {
        qxVar.Uxq83abb04(-1493585151);
        int i2 = 16;
        int i3 = (qxVar.EljAMC1QTz(obj) ? 4 : 2) | i | (qxVar.EljAMC1QTz(this) ? 32 : 16);
        int i4 = 0;
        if (!qxVar.dqB83aoLBB(i3 & 1, (i3 & 19) != 18)) {
            qxVar.YXi2hvwn7WL();
        } else if (AvO7iQsrTN()) {
            qxVar.MjxSquD6Av(467722849);
            qxVar.WIEu4Ya2g8(false);
        } else {
            qxVar.MjxSquD6Av(466062241);
            WIEu4Ya2g8(obj);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            k61 k61Var = ue.GWasM1elztuh;
            if (z || HFYAaqMd6 == k61Var) {
                HFYAaqMd6 = z50.iwATDS1i01k(new ja1(this, i4));
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            if (((Boolean) ((m51) HFYAaqMd6).getValue()).booleanValue()) {
                qxVar.MjxSquD6Av(466470356);
                Object HFYAaqMd62 = qxVar.HFYAaqMd6();
                if (HFYAaqMd62 == k61Var) {
                    HFYAaqMd62 = ki1.WdrkLMV3xh(qxVar);
                    qxVar.dcDmLGVhzWm(HFYAaqMd62);
                }
                ph phVar = (ph) HFYAaqMd62;
                boolean encWxUiV2 = qxVar.encWxUiV2(phVar) | (i5 == 32);
                Object HFYAaqMd63 = qxVar.HFYAaqMd6();
                if (encWxUiV2 || HFYAaqMd63 == k61Var) {
                    HFYAaqMd63 = new X1lG3V04pd(25, phVar, this);
                    qxVar.dcDmLGVhzWm(HFYAaqMd63);
                }
                ki1.AvO7iQsrTN(phVar, this, (hv) HFYAaqMd63, qxVar);
                qxVar.WIEu4Ya2g8(false);
            } else {
                qxVar.MjxSquD6Av(467712929);
                qxVar.WIEu4Ya2g8(false);
            }
            qxVar.WIEu4Ya2g8(false);
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new t7(i, i2, this, obj);
        }
    }

    public final void JFJ3QoxA(float f) {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            oa1 oa1Var = (oa1) p41Var.get(i);
            oa1Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                t71 t71Var = oa1Var.JFJ3QoxA;
                if (t71Var != null) {
                    oa1Var.GWasM1elztuh().encWxUiV2(t71Var.X1lG3V04pd);
                    oa1Var.mOu10nynGul = null;
                    oa1Var.JFJ3QoxA = null;
                }
                Object obj = f == -4.0f ? oa1Var.GWasM1elztuh().xqGvceK5x : oa1Var.GWasM1elztuh().X1lG3V04pd;
                oa1Var.GWasM1elztuh().encWxUiV2(obj);
                oa1Var.GWasM1elztuh().mOu10nynGul(obj);
                oa1Var.OOA6hdeuvCS(obj);
                oa1Var.WIEu4Ya2g8.encWxUiV2(oa1Var.GWasM1elztuh().X1lG3V04pd());
            } else {
                oa1Var.E7jCp8Ls.encWxUiV2(f);
            }
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qa1) p41Var2.get(i2)).JFJ3QoxA(f);
        }
    }

    public final long OOA6hdeuvCS() {
        qa1 qa1Var = this.Yi7zF1RB1;
        return qa1Var != null ? qa1Var.OOA6hdeuvCS() : this.EljAMC1QTz.AvO7iQsrTN();
    }

    public final void WIEu4Ya2g8(Object obj) {
        fo0 fo0Var = this.xqGvceK5x;
        if (o30.rQPn8YBR(fo0Var.getValue(), obj)) {
            return;
        }
        this.OOA6hdeuvCS.setValue(new na1(fo0Var.getValue(), obj));
        le leVar = this.GWasM1elztuh;
        if (!o30.rQPn8YBR(leVar.EljAMC1QTz(), fo0Var.getValue())) {
            leVar.JFJ3QoxA(fo0Var.getValue());
        }
        fo0Var.setValue(obj);
        if (this.AvO7iQsrTN.AvO7iQsrTN() == Long.MIN_VALUE) {
            this.encWxUiV2.setValue(Boolean.TRUE);
        }
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            ((oa1) p41Var.get(i)).E7jCp8Ls.encWxUiV2(-2.0f);
        }
    }

    public final void X1lG3V04pd() {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            oa1 oa1Var = (oa1) p41Var.get(i);
            oa1Var.JFJ3QoxA = null;
            oa1Var.mOu10nynGul = null;
            oa1Var.XnEVoBF0td1l = false;
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qa1) p41Var2.get(i2)).X1lG3V04pd();
        }
    }

    public final void XnEVoBF0td1l(oz0 oz0Var) {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            oa1 oa1Var = (oa1) p41Var.get(i);
            fo0 fo0Var = oa1Var.uFEq9NpZ;
            if (!o30.rQPn8YBR(oa1Var.GWasM1elztuh().X1lG3V04pd, oa1Var.GWasM1elztuh().xqGvceK5x)) {
                oa1Var.JFJ3QoxA = oa1Var.GWasM1elztuh();
                oa1Var.mOu10nynGul = oz0Var;
            }
            oa1Var.encWxUiV2.setValue(new t71(oa1Var.Mjvvu5DE, oa1Var.OOA6hdeuvCS, fo0Var.getValue(), fo0Var.getValue(), oa1Var.iwATDS1i01k.X1lG3V04pd()));
            oa1Var.WIEu4Ya2g8.encWxUiV2(oa1Var.GWasM1elztuh().X1lG3V04pd());
            oa1Var.XnEVoBF0td1l = true;
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qa1) p41Var2.get(i2)).XnEVoBF0td1l(oz0Var);
        }
    }

    public final long Yi7zF1RB1() {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((oa1) p41Var.get(i)).WIEu4Ya2g8.AvO7iQsrTN());
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((qa1) p41Var2.get(i2)).Yi7zF1RB1());
        }
        return j;
    }

    public final void encWxUiV2(long j, boolean z) {
        do0 do0Var = this.AvO7iQsrTN;
        long AvO7iQsrTN = do0Var.AvO7iQsrTN();
        le leVar = this.GWasM1elztuh;
        if (AvO7iQsrTN == Long.MIN_VALUE) {
            do0Var.encWxUiV2(j);
            ((fo0) leVar.GWasM1elztuh).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((fo0) leVar.GWasM1elztuh).getValue()).booleanValue()) {
            ((fo0) leVar.GWasM1elztuh).setValue(Boolean.TRUE);
        }
        this.encWxUiV2.setValue(Boolean.FALSE);
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            oa1 oa1Var = (oa1) p41Var.get(i);
            fo0 fo0Var = oa1Var.rQPn8YBR;
            fo0 fo0Var2 = oa1Var.rQPn8YBR;
            if (!((Boolean) fo0Var.getValue()).booleanValue()) {
                long X1lG3V04pd = z ? oa1Var.GWasM1elztuh().X1lG3V04pd() : j;
                oa1Var.OOA6hdeuvCS(oa1Var.GWasM1elztuh().Yi7zF1RB1(X1lG3V04pd));
                oa1Var.iwATDS1i01k = oa1Var.GWasM1elztuh().EljAMC1QTz(X1lG3V04pd);
                if (oa1Var.GWasM1elztuh().AvO7iQsrTN(X1lG3V04pd)) {
                    fo0Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) fo0Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qa1 qa1Var = (qa1) p41Var2.get(i2);
            fo0 fo0Var3 = qa1Var.xqGvceK5x;
            le leVar2 = qa1Var.GWasM1elztuh;
            if (!o30.rQPn8YBR(fo0Var3.getValue(), leVar2.EljAMC1QTz())) {
                qa1Var.encWxUiV2(j, z);
            }
            if (!o30.rQPn8YBR(qa1Var.xqGvceK5x.getValue(), leVar2.EljAMC1QTz())) {
                z2 = false;
            }
        }
        if (z2) {
            mOu10nynGul();
        }
    }

    public final void iwATDS1i01k() {
        t71 t71Var;
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            oa1 oa1Var = (oa1) p41Var.get(i);
            oz0 oz0Var = oa1Var.mOu10nynGul;
            if (oz0Var != null && (t71Var = oa1Var.JFJ3QoxA) != null) {
                long DmJncFq5 = vc0.DmJncFq5(oz0Var.AvO7iQsrTN * oz0Var.xqGvceK5x);
                Object Yi7zF1RB1 = t71Var.Yi7zF1RB1(DmJncFq5);
                if (oa1Var.XnEVoBF0td1l) {
                    oa1Var.GWasM1elztuh().mOu10nynGul(Yi7zF1RB1);
                }
                oa1Var.GWasM1elztuh().encWxUiV2(Yi7zF1RB1);
                oa1Var.WIEu4Ya2g8.encWxUiV2(oa1Var.GWasM1elztuh().X1lG3V04pd());
                if (oa1Var.E7jCp8Ls.AvO7iQsrTN() == -2.0f || oa1Var.XnEVoBF0td1l) {
                    oa1Var.OOA6hdeuvCS(Yi7zF1RB1);
                } else {
                    oa1Var.X1lG3V04pd(oa1Var.mE4lRynR.OOA6hdeuvCS());
                }
                if (DmJncFq5 >= oz0Var.AvO7iQsrTN) {
                    oa1Var.mOu10nynGul = null;
                    oa1Var.JFJ3QoxA = null;
                } else {
                    oz0Var.X1lG3V04pd = false;
                }
            }
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qa1) p41Var2.get(i2)).iwATDS1i01k();
        }
    }

    public final void mOu10nynGul() {
        this.AvO7iQsrTN.encWxUiV2(Long.MIN_VALUE);
        le leVar = this.GWasM1elztuh;
        if (leVar instanceof ng0) {
            ((ng0) leVar).JFJ3QoxA(this.xqGvceK5x.getValue());
        }
        uFEq9NpZ(0L);
        ((fo0) leVar.GWasM1elztuh).setValue(Boolean.FALSE);
        p41 p41Var = this.JFJ3QoxA;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            ((qa1) p41Var.get(i)).mOu10nynGul();
        }
    }

    public final void rQPn8YBR(Object obj, Object obj2) {
        this.AvO7iQsrTN.encWxUiV2(Long.MIN_VALUE);
        le leVar = this.GWasM1elztuh;
        ((fo0) leVar.GWasM1elztuh).setValue(Boolean.FALSE);
        boolean AvO7iQsrTN = AvO7iQsrTN();
        fo0 fo0Var = this.xqGvceK5x;
        if (!AvO7iQsrTN || !o30.rQPn8YBR(leVar.EljAMC1QTz(), obj) || !o30.rQPn8YBR(fo0Var.getValue(), obj2)) {
            if (!o30.rQPn8YBR(leVar.EljAMC1QTz(), obj) && (leVar instanceof ng0)) {
                ((ng0) leVar).JFJ3QoxA(obj);
            }
            fo0Var.setValue(obj2);
            this.rQPn8YBR.setValue(Boolean.TRUE);
            this.OOA6hdeuvCS.setValue(new na1(obj, obj2));
        }
        p41 p41Var = this.JFJ3QoxA;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            qa1 qa1Var = (qa1) p41Var.get(i);
            qa1Var.getClass();
            if (qa1Var.AvO7iQsrTN()) {
                qa1Var.rQPn8YBR(qa1Var.GWasM1elztuh.EljAMC1QTz(), qa1Var.xqGvceK5x.getValue());
            }
        }
        p41 p41Var2 = this.mOu10nynGul;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((oa1) p41Var2.get(i2)).X1lG3V04pd(0L);
        }
    }

    public final String toString() {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((oa1) p41Var.get(i)) + ", ";
        }
        return str;
    }

    public final void uFEq9NpZ(long j) {
        if (this.Yi7zF1RB1 == null) {
            this.EljAMC1QTz.encWxUiV2(j);
        }
    }

    public final boolean xqGvceK5x() {
        p41 p41Var = this.mOu10nynGul;
        int size = p41Var.size();
        for (int i = 0; i < size; i++) {
            if (((oa1) p41Var.get(i)).mOu10nynGul != null) {
                return true;
            }
        }
        p41 p41Var2 = this.JFJ3QoxA;
        int size2 = p41Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((qa1) p41Var2.get(i2)).xqGvceK5x()) {
                return true;
            }
        }
        return false;
    }
}
