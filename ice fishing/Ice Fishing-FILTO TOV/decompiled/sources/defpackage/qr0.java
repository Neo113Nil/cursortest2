package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qr0 implements y70 {
    public final hv AvO7iQsrTN;
    public boolean E7jCp8Ls;
    public final f4 EljAMC1QTz;
    public u60 JFJ3QoxA;
    public long Mjvvu5DE;
    public final int OOA6hdeuvCS;
    public pr0 WIEu4Ya2g8;
    public boolean XnEVoBF0td1l;
    public boolean Y6hRI1cF8;
    public boolean YmKjaVtbfp5Z;
    public final /* synthetic */ i50 cilMamHF;
    public eg encWxUiV2;
    public boolean iwATDS1i01k;
    public long jivtDDk9H = oe0.GWasM1elztuh();
    public long mE4lRynR;
    public m61 mOu10nynGul;
    public boolean rQPn8YBR;
    public Object uFEq9NpZ;

    public qr0(i50 i50Var, int i, f4 f4Var, bCsSzSHkbaQ bcsszshkbaq) {
        this.cilMamHF = i50Var;
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = f4Var;
        this.AvO7iQsrTN = bcsszshkbaq;
    }

    public final void AvO7iQsrTN(Object obj, Object obj2, final q5 q5Var) {
        u60 u60Var;
        u60 u60Var2 = this.JFJ3QoxA;
        int i = 0;
        if (u60Var2 == null) {
            i50 i50Var = this.cilMamHF;
            lv GWasM1elztuh = ((o70) i50Var.Yi7zF1RB1).GWasM1elztuh(this.OOA6hdeuvCS, obj, obj2);
            v60 GWasM1elztuh2 = ((o61) i50Var.X1lG3V04pd).GWasM1elztuh();
            if (GWasM1elztuh2.OOA6hdeuvCS.eUH21U3apd()) {
                GWasM1elztuh2.rQPn8YBR(obj, GWasM1elztuh, true);
                u60Var = new u60(GWasM1elztuh2, obj, 1);
            } else {
                u60Var = new u60(GWasM1elztuh2, obj, i);
            }
            u60Var2 = u60Var;
            this.JFJ3QoxA = u60Var2;
            this.uFEq9NpZ = obj;
        }
        this.Y6hRI1cF8 = false;
        while (!u60Var2.X1lG3V04pd() && !this.Y6hRI1cF8) {
            l21 l21Var = new l21() { // from class: or0
                @Override // defpackage.l21
                public final boolean GWasM1elztuh() {
                    qr0 qr0Var = qr0.this;
                    if (!qr0Var.Y6hRI1cF8) {
                        qr0Var.JFJ3QoxA();
                        long j = qr0Var.mE4lRynR;
                        q5 q5Var2 = q5Var;
                        q5Var2.GWasM1elztuh = q5.GWasM1elztuh(j, q5Var2.GWasM1elztuh);
                        qr0Var.Y6hRI1cF8 = !qr0Var.mOu10nynGul(qr0Var.Mjvvu5DE, r1 + q5Var2.Yi7zF1RB1);
                    }
                    return qr0Var.Y6hRI1cF8;
                }
            };
            switch (u60Var2.GWasM1elztuh) {
                case 0:
                    break;
                default:
                    n60 Yi7zF1RB1 = u60Var2.Yi7zF1RB1();
                    xo0 xo0Var = Yi7zF1RB1 != null ? Yi7zF1RB1.EljAMC1QTz : null;
                    if (xo0Var != null && !xo0Var.X1lG3V04pd()) {
                        y31 Mjvvu5DE = d70.Mjvvu5DE();
                        hv OOA6hdeuvCS = Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null;
                        y31 M3K9sHhK = d70.M3K9sHhK(Mjvvu5DE);
                        try {
                            xo0Var.OOA6hdeuvCS(l21Var);
                            break;
                        } finally {
                        }
                    }
                    break;
            }
        }
        JFJ3QoxA();
        boolean z = this.Y6hRI1cF8;
        long j = this.mE4lRynR;
        if (z) {
            q5Var.Yi7zF1RB1 = q5.GWasM1elztuh(j, q5Var.Yi7zF1RB1);
        } else {
            q5Var.GWasM1elztuh = q5.GWasM1elztuh(j, q5Var.GWasM1elztuh);
        }
    }

    public final void EljAMC1QTz(long j) {
        if (this.E7jCp8Ls) {
            w10.GWasM1elztuh("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.rQPn8YBR) {
            w10.GWasM1elztuh("Request was already measured!");
        }
        this.rQPn8YBR = true;
        m61 m61Var = this.mOu10nynGul;
        if (m61Var == null) {
            w10.Yi7zF1RB1("performComposition() must be called before performMeasure()");
            throw new vc();
        }
        int X1lG3V04pd = m61Var.X1lG3V04pd();
        for (int i = 0; i < X1lG3V04pd; i++) {
            m61Var.xqGvceK5x(i, j);
        }
    }

    @Override // defpackage.y70
    public final void GWasM1elztuh() {
        this.YmKjaVtbfp5Z = true;
    }

    public final void JFJ3QoxA() {
        long arNh8D4Z5gB;
        long GWasM1elztuh = oe0.GWasM1elztuh();
        long j = this.jivtDDk9H;
        long j2 = Long.MAX_VALUE;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            arNh8D4Z5gB = (1 | (GWasM1elztuh - 1)) == Long.MAX_VALUE ? b70.arNh8D4Z5gB(GWasM1elztuh) : b70.YZjbz8VdP5(GWasM1elztuh, j);
        } else if (GWasM1elztuh == j) {
            k61 k61Var = jo.OOA6hdeuvCS;
            arNh8D4Z5gB = 0;
        } else {
            arNh8D4Z5gB = jo.X1lG3V04pd(b70.arNh8D4Z5gB(j));
        }
        long j3 = arNh8D4Z5gB >> 1;
        k61 k61Var2 = jo.OOA6hdeuvCS;
        if ((((int) arNh8D4Z5gB) & 1) == 0) {
            j2 = j3;
        } else if (j3 <= 9223372036854L) {
            j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
        }
        this.mE4lRynR = j2;
        long j4 = this.Mjvvu5DE - j2;
        this.Mjvvu5DE = j4;
        this.jivtDDk9H = GWasM1elztuh;
        rj0.DmJncFq5("compose:lazy:prefetch:available_time_nanos", j4);
    }

    public final boolean OOA6hdeuvCS() {
        u60 u60Var;
        return this.XnEVoBF0td1l || ((u60Var = this.JFJ3QoxA) != null && u60Var.X1lG3V04pd());
    }

    public final boolean X1lG3V04pd(m1 m1Var) {
        boolean xqGvceK5x;
        if (!this.cilMamHF.GWasM1elztuh) {
            return false;
        }
        if (this.YmKjaVtbfp5Z) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                xqGvceK5x = xqGvceK5x(m1Var);
            } finally {
                Trace.endSection();
            }
        } else {
            xqGvceK5x = xqGvceK5x(m1Var);
        }
        rj0.DmJncFq5("compose:lazy:prefetch:execute:item", -1L);
        return xqGvceK5x;
    }

    public final void Yi7zF1RB1() {
        u60 u60Var = this.JFJ3QoxA;
        if (u60Var != null) {
            switch (u60Var.GWasM1elztuh) {
                case 0:
                    break;
                default:
                    n60 Yi7zF1RB1 = u60Var.Yi7zF1RB1();
                    if ((Yi7zF1RB1 != null ? Yi7zF1RB1.EljAMC1QTz : null) != null) {
                        v60.X1lG3V04pd(u60Var.Yi7zF1RB1, u60Var.X1lG3V04pd);
                        break;
                    }
                    break;
            }
        }
        this.JFJ3QoxA = null;
        m61 m61Var = this.mOu10nynGul;
        if (m61Var != null) {
            m61Var.GWasM1elztuh();
        }
        this.mOu10nynGul = null;
        this.WIEu4Ya2g8 = null;
    }

    @Override // defpackage.y70
    public final void cancel() {
        if (this.E7jCp8Ls) {
            return;
        }
        this.E7jCp8Ls = true;
        Yi7zF1RB1();
    }

    public final pr0 encWxUiV2() {
        m61 m61Var = this.mOu10nynGul;
        if (m61Var == null) {
            w10.Yi7zF1RB1("Should precompose before resolving nested prefetch states");
            throw new vc();
        }
        rt0 rt0Var = new rt0();
        m61Var.Yi7zF1RB1(new fi0(1, rt0Var));
        List list = (List) rt0Var.OOA6hdeuvCS;
        if (list != null) {
            return new pr0(this, list);
        }
        return null;
    }

    public final boolean mOu10nynGul(long j, long j2) {
        if (this.YmKjaVtbfp5Z) {
            j2 = 0;
        }
        return j > j2;
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.OOA6hdeuvCS + ", constraints = " + this.encWxUiV2 + ", isComposed = " + OOA6hdeuvCS() + ", isMeasured = " + this.rQPn8YBR + ", isCanceled = " + this.E7jCp8Ls + " }";
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0232 A[Catch: all -> 0x0253, LOOP:2: B:96:0x0206->B:106:0x0232, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0253, blocks: (B:84:0x016b, B:86:0x0173, B:88:0x0179, B:91:0x0187, B:93:0x0193, B:94:0x01f7, B:95:0x01ff, B:96:0x0206, B:98:0x020e, B:103:0x021f, B:104:0x0224, B:106:0x0232, B:113:0x0238, B:115:0x019d, B:117:0x01ac, B:119:0x01b7, B:124:0x01c5, B:128:0x01e4, B:129:0x01d3, B:132:0x01eb), top: B:83:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean xqGvceK5x(m1 m1Var) {
        long j;
        boolean z;
        List[] listArr;
        qr0 qr0Var;
        ?? r9;
        int i;
        List list;
        int i2;
        boolean z2;
        List[] listArr2;
        m61 EljAMC1QTz;
        int i3 = this.OOA6hdeuvCS;
        long j2 = i3;
        rj0.DmJncFq5("compose:lazy:prefetch:execute:item", j2);
        k80 k80Var = (k80) ((o70) this.cilMamHF.Yi7zF1RB1).Yi7zF1RB1.GWasM1elztuh();
        if (!this.E7jCp8Ls) {
            int X1lG3V04pd = k80Var.X1lG3V04pd();
            if (i3 >= 0 && i3 < X1lG3V04pd) {
                Object xqGvceK5x = k80Var.xqGvceK5x(i3);
                Object obj = this.uFEq9NpZ;
                if (obj != null && !xqGvceK5x.equals(obj)) {
                    Yi7zF1RB1();
                    return false;
                }
                k80Var.Yi7zF1RB1(i3);
                f4 f4Var = this.EljAMC1QTz;
                q5 q5Var = (q5) f4Var.xqGvceK5x;
                qr0 qr0Var2 = null;
                if (f4Var.X1lG3V04pd != null || q5Var == null) {
                    hg0 hg0Var = (hg0) f4Var.Yi7zF1RB1;
                    Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(null);
                    Object obj2 = AvO7iQsrTN;
                    if (AvO7iQsrTN == null) {
                        q5 q5Var2 = new q5();
                        q5Var2.OOA6hdeuvCS = -1;
                        hg0Var.XnEVoBF0td1l(null, q5Var2);
                        obj2 = q5Var2;
                    }
                    q5Var = (q5) obj2;
                    f4Var.X1lG3V04pd = null;
                    f4Var.xqGvceK5x = q5Var;
                }
                OOA6hdeuvCS();
                long GWasM1elztuh = m1Var.GWasM1elztuh();
                this.Mjvvu5DE = GWasM1elztuh;
                this.jivtDDk9H = oe0.GWasM1elztuh();
                this.mE4lRynR = 0L;
                rj0.DmJncFq5("compose:lazy:prefetch:available_time_nanos", GWasM1elztuh);
                if (OOA6hdeuvCS()) {
                    j = 0;
                } else {
                    j = 0;
                    if (mOu10nynGul(this.Mjvvu5DE, q5Var.GWasM1elztuh + q5Var.Yi7zF1RB1)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            AvO7iQsrTN(xqGvceK5x, null, q5Var);
                        } finally {
                        }
                    }
                    if (!OOA6hdeuvCS()) {
                        return true;
                    }
                }
                if (this.JFJ3QoxA != null) {
                    if (!mOu10nynGul(this.Mjvvu5DE, q5Var.X1lG3V04pd)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        u60 u60Var = this.JFJ3QoxA;
                        if (u60Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (u60Var.GWasM1elztuh) {
                            case 0:
                                EljAMC1QTz = u60Var.Yi7zF1RB1.EljAMC1QTz(u60Var.X1lG3V04pd);
                                break;
                            default:
                                v60 v60Var = u60Var.Yi7zF1RB1;
                                n60 Yi7zF1RB1 = u60Var.Yi7zF1RB1();
                                if (Yi7zF1RB1 != null) {
                                    v60Var.xqGvceK5x(Yi7zF1RB1, false);
                                }
                                EljAMC1QTz = v60Var.EljAMC1QTz(u60Var.X1lG3V04pd);
                                break;
                        }
                        this.mOu10nynGul = EljAMC1QTz;
                        this.JFJ3QoxA = null;
                        this.XnEVoBF0td1l = true;
                        Trace.endSection();
                        JFJ3QoxA();
                        q5Var.X1lG3V04pd = q5.GWasM1elztuh(this.mE4lRynR, q5Var.X1lG3V04pd);
                    } finally {
                    }
                }
                if (!this.iwATDS1i01k) {
                    if (this.Mjvvu5DE <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.WIEu4Ya2g8 = encWxUiV2();
                        this.iwATDS1i01k = true;
                    } finally {
                    }
                }
                pr0 pr0Var = this.WIEu4Ya2g8;
                if (pr0Var != null) {
                    int i4 = q5Var.OOA6hdeuvCS;
                    boolean z3 = this.YmKjaVtbfp5Z;
                    List[] listArr3 = pr0Var.Yi7zF1RB1;
                    int i5 = pr0Var.X1lG3V04pd;
                    List list2 = pr0Var.GWasM1elztuh;
                    if (i5 < list2.size()) {
                        if (pr0Var.EljAMC1QTz.E7jCp8Ls) {
                            w10.X1lG3V04pd("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                ((z70) list2.get(i6)).xqGvceK5x = i4;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (pr0Var.X1lG3V04pd < list2.size()) {
                                try {
                                    if (listArr3[pr0Var.X1lG3V04pd] != null) {
                                        z = z3;
                                        listArr = listArr3;
                                        qr0Var = qr0Var2;
                                    } else {
                                        if (m1Var.GWasM1elztuh() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i7 = pr0Var.X1lG3V04pd;
                                        z70 z70Var = (z70) list2.get(i7);
                                        r80 r80Var = z70Var.GWasM1elztuh;
                                        if (r80Var == null) {
                                            list = xp.OOA6hdeuvCS;
                                            i = i7;
                                            z = z3;
                                            listArr = listArr3;
                                            qr0Var = qr0Var2;
                                        } else {
                                            int i8 = z70Var.xqGvceK5x;
                                            ArrayList arrayList = new ArrayList();
                                            int i9 = r80Var.OOA6hdeuvCS;
                                            y31 Mjvvu5DE = d70.Mjvvu5DE();
                                            i = i7;
                                            d70.A1EKNP6CxJ(Mjvvu5DE, d70.M3K9sHhK(Mjvvu5DE), Mjvvu5DE != null ? Mjvvu5DE.OOA6hdeuvCS() : null);
                                            if (i8 == -1) {
                                                i8 = 2;
                                            }
                                            int i10 = 0;
                                            while (i10 < i8) {
                                                int i11 = i9 + i10;
                                                i50 i50Var = z70Var.X1lG3V04pd;
                                                if (i50Var == null) {
                                                    i2 = i10;
                                                    z2 = z3;
                                                    listArr2 = listArr3;
                                                } else {
                                                    i2 = i10;
                                                    z2 = z3;
                                                    listArr2 = listArr3;
                                                    arrayList.add(new qr0(i50Var, i11, z70Var.Yi7zF1RB1, null));
                                                }
                                                i10 = i2 + 1;
                                                z3 = z2;
                                                listArr3 = listArr2;
                                            }
                                            z = z3;
                                            listArr = listArr3;
                                            qr0Var = null;
                                            z70Var.EljAMC1QTz = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list3 = listArr[pr0Var.X1lG3V04pd];
                                    list3.getClass();
                                    while (pr0Var.xqGvceK5x < list3.size()) {
                                        qr0 qr0Var3 = (qr0) list3.get(pr0Var.xqGvceK5x);
                                        if (z) {
                                            qr0 qr0Var4 = qr0Var3 != null ? qr0Var3 : qr0Var;
                                            if (qr0Var4 != null) {
                                                r9 = 1;
                                                qr0Var4.YmKjaVtbfp5Z = true;
                                                pr0Var.OOA6hdeuvCS = r9;
                                                if (!qr0Var3.X1lG3V04pd(m1Var)) {
                                                    return r9;
                                                }
                                                pr0Var.xqGvceK5x += r9;
                                            }
                                        }
                                        r9 = 1;
                                        pr0Var.OOA6hdeuvCS = r9;
                                        if (!qr0Var3.X1lG3V04pd(m1Var)) {
                                        }
                                    }
                                    pr0Var.xqGvceK5x = 0;
                                    pr0Var.X1lG3V04pd++;
                                    qr0Var2 = qr0Var;
                                    z3 = z;
                                    listArr3 = listArr;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                pr0 pr0Var2 = this.WIEu4Ya2g8;
                if (pr0Var2 != null && pr0Var2.OOA6hdeuvCS) {
                    JFJ3QoxA();
                    rj0.DmJncFq5("compose:lazy:prefetch:execute:item", j2);
                    pr0 pr0Var3 = this.WIEu4Ya2g8;
                    if (pr0Var3 != null) {
                        pr0Var3.OOA6hdeuvCS = false;
                    }
                }
                eg egVar = this.encWxUiV2;
                if (!this.rQPn8YBR && egVar != null) {
                    if (!mOu10nynGul(this.Mjvvu5DE, q5Var.xqGvceK5x)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        EljAMC1QTz(egVar.GWasM1elztuh);
                        Trace.endSection();
                        JFJ3QoxA();
                        q5Var.xqGvceK5x = q5.GWasM1elztuh(this.mE4lRynR, q5Var.xqGvceK5x);
                        hv hvVar = this.AvO7iQsrTN;
                        if (hvVar != null) {
                            hvVar.mOu10nynGul(this);
                        }
                    } finally {
                    }
                }
                pr0 pr0Var4 = this.WIEu4Ya2g8;
                if (!this.rQPn8YBR || !this.iwATDS1i01k || pr0Var4 == null) {
                    return false;
                }
                List list4 = pr0Var4.GWasM1elztuh;
                int size2 = list4.size();
                int i12 = Integer.MAX_VALUE;
                for (int i13 = 0; i13 < size2; i13++) {
                    i12 = Math.min(i12, ((z70) list4.get(i13)).OOA6hdeuvCS);
                }
                if (i12 == Integer.MAX_VALUE) {
                    i12 = 0;
                }
                int i14 = q5Var.OOA6hdeuvCS;
                q5Var.OOA6hdeuvCS = i14 == -1 ? i12 : ((i14 * 3) + i12) / 4;
                int size3 = list4.size();
                int i15 = Integer.MAX_VALUE;
                for (int i16 = 0; i16 < size3; i16++) {
                    i15 = Math.min(i15, ((z70) list4.get(i16)).EljAMC1QTz);
                }
                if (i15 == Integer.MAX_VALUE) {
                    i15 = 0;
                }
                if (i15 >= i12) {
                    return false;
                }
                q5Var.xqGvceK5x = 0L;
                return false;
            }
        }
        Yi7zF1RB1();
        return false;
    }
}
