package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x81 extends he0 implements w50, go, b01 {
    public v81 M3K9sHhK;
    public int WRKkgoJXwDn;
    public int WdrkLMV3xh;
    public yt Y6hRI1cF8;
    public HashMap arNh8D4Z5gB;
    public int cilMamHF;
    public y81 jivtDDk9H;
    public w81 k8h8IjolWQ;
    public boolean lv06NcmrQ;
    public String mE4lRynR;
    public xn0 pog2g9KITJA;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r1 != null) goto L15;
     */
    @Override // defpackage.go
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DmJncFq5(i60 i60Var) {
        xn0 gqMuANyCes;
        if (this.Mjvvu5DE) {
            w81 w81Var = this.k8h8IjolWQ;
            if (w81Var != null) {
                if (!w81Var.X1lG3V04pd) {
                    w81Var = null;
                }
                if (w81Var != null) {
                    gqMuANyCes = w81Var.xqGvceK5x;
                }
            }
            gqMuANyCes = gqMuANyCes();
            c1 c1Var = gqMuANyCes.JFJ3QoxA;
            if (c1Var == null) {
                w10.Yi7zF1RB1("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.pog2g9KITJA + ", textSubstitution=" + this.k8h8IjolWQ + ')');
                throw new vc();
            }
            s9 EljAMC1QTz = i60Var.OOA6hdeuvCS.EljAMC1QTz.EljAMC1QTz();
            boolean z = gqMuANyCes.rQPn8YBR;
            if (z) {
                long j = gqMuANyCes.E7jCp8Ls;
                EljAMC1QTz.E7jCp8Ls();
                EljAMC1QTz.EljAMC1QTz(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                y81 y81Var = this.jivtDDk9H;
                w41 w41Var = y81Var.GWasM1elztuh;
                a81 a81Var = w41Var.XnEVoBF0td1l;
                if (a81Var == null) {
                    a81Var = a81.Yi7zF1RB1;
                }
                x11 x11Var = w41Var.uFEq9NpZ;
                if (x11Var == null) {
                    x11Var = x11.xqGvceK5x;
                }
                qj qjVar = w41Var.iwATDS1i01k;
                if (qjVar == null) {
                    qjVar = sr.Mjvvu5DE;
                }
                qj AvO7iQsrTN = w41Var.GWasM1elztuh.AvO7iQsrTN();
                if (AvO7iQsrTN != null) {
                    float Yi7zF1RB1 = y81Var.GWasM1elztuh.GWasM1elztuh.Yi7zF1RB1();
                    r1 r1Var = c1Var.GWasM1elztuh.AvO7iQsrTN;
                    int i = r1Var.X1lG3V04pd;
                    r1Var.X1lG3V04pd(AvO7iQsrTN, (Float.floatToRawIntBits(c1Var.X1lG3V04pd()) << 32) | (Float.floatToRawIntBits(c1Var.Yi7zF1RB1()) & 4294967295L), Yi7zF1RB1);
                    r1Var.EljAMC1QTz(x11Var);
                    r1Var.AvO7iQsrTN(a81Var);
                    r1Var.OOA6hdeuvCS(qjVar);
                    r1Var.Yi7zF1RB1(3);
                    c1Var.xqGvceK5x(EljAMC1QTz);
                    r1Var.Yi7zF1RB1(i);
                } else {
                    long j2 = yb.AvO7iQsrTN;
                    if (j2 == 16) {
                        j2 = y81Var.Yi7zF1RB1() != 16 ? y81Var.Yi7zF1RB1() : yb.Yi7zF1RB1;
                    }
                    r1 r1Var2 = c1Var.GWasM1elztuh.AvO7iQsrTN;
                    int i2 = r1Var2.X1lG3V04pd;
                    r1Var2.xqGvceK5x(j2);
                    r1Var2.EljAMC1QTz(x11Var);
                    r1Var2.AvO7iQsrTN(a81Var);
                    r1Var2.OOA6hdeuvCS(qjVar);
                    r1Var2.Yi7zF1RB1(3);
                    c1Var.xqGvceK5x(EljAMC1QTz);
                    r1Var2.Yi7zF1RB1(i2);
                }
                if (z) {
                    EljAMC1QTz.JFJ3QoxA();
                }
            } catch (Throwable th) {
                if (z) {
                    EljAMC1QTz.JFJ3QoxA();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // defpackage.w50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        xn0 gqMuANyCes;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            w81 w81Var = this.k8h8IjolWQ;
            if (w81Var != null) {
                if (!w81Var.X1lG3V04pd) {
                    w81Var = null;
                }
                if (w81Var != null) {
                    gqMuANyCes = w81Var.xqGvceK5x;
                }
            }
            gqMuANyCes = gqMuANyCes();
            gqMuANyCes.xqGvceK5x(dd0Var);
            boolean Yi7zF1RB1 = gqMuANyCes.Yi7zF1RB1(j, dd0Var.getLayoutDirection());
            wn0 wn0Var = gqMuANyCes.uFEq9NpZ;
            if (wn0Var != null) {
                wn0Var.Yi7zF1RB1();
            }
            c1 c1Var = gqMuANyCes.JFJ3QoxA;
            c1Var.getClass();
            k81 k81Var = c1Var.xqGvceK5x;
            long j2 = gqMuANyCes.E7jCp8Ls;
            if (Yi7zF1RB1) {
                vc0.AEn1Rrio(this, 2).r8u5JxottJCl();
                HashMap hashMap = this.arNh8D4Z5gB;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.arNh8D4Z5gB = hashMap;
                }
                hashMap.put(d6sfifL1.GWasM1elztuh, Integer.valueOf(Math.round(k81Var.X1lG3V04pd(0))));
                hashMap.put(d6sfifL1.Yi7zF1RB1, Integer.valueOf(Math.round(k81Var.X1lG3V04pd(k81Var.EljAMC1QTz - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fb1.WRKkgoJXwDn(i, i, i2, i2));
            HashMap hashMap2 = this.arNh8D4Z5gB;
            hashMap2.getClass();
            return dd0Var.MjxSquD6Av(i, i2, hashMap2, new f5(OOA6hdeuvCS, 4));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.w50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EljAMC1QTz(ub0 ub0Var, wc0 wc0Var, int i) {
        xn0 gqMuANyCes;
        w81 w81Var = this.k8h8IjolWQ;
        if (w81Var != null) {
            if (!w81Var.X1lG3V04pd) {
                w81Var = null;
            }
            if (w81Var != null) {
                gqMuANyCes = w81Var.xqGvceK5x;
            }
        }
        gqMuANyCes = gqMuANyCes();
        gqMuANyCes.xqGvceK5x(ub0Var);
        return l60.mOu10nynGul(gqMuANyCes.OOA6hdeuvCS(ub0Var.getLayoutDirection()).X1lG3V04pd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.w50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int JFJ3QoxA(ub0 ub0Var, wc0 wc0Var, int i) {
        xn0 gqMuANyCes;
        w81 w81Var = this.k8h8IjolWQ;
        if (w81Var != null) {
            if (!w81Var.X1lG3V04pd) {
                w81Var = null;
            }
            if (w81Var != null) {
                gqMuANyCes = w81Var.xqGvceK5x;
            }
        }
        gqMuANyCes = gqMuANyCes();
        gqMuANyCes.xqGvceK5x(ub0Var);
        return gqMuANyCes.GWasM1elztuh(i, ub0Var.getLayoutDirection());
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [v81] */
    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
        v81 v81Var = this.M3K9sHhK;
        v81 v81Var2 = v81Var;
        if (v81Var == null) {
            final int i = 0;
            ?? r0 = new hv(this) { // from class: v81
                public final /* synthetic */ x81 EljAMC1QTz;

                {
                    this.EljAMC1QTz = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0289  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x028b  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0286  */
                @Override // defpackage.hv
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mOu10nynGul(Object obj) {
                    el elVar;
                    m81 m81Var;
                    xn0 xn0Var;
                    int i2;
                    m81 m81Var2;
                    int i3;
                    int i4;
                    kt0 kt0Var;
                    int AvO7iQsrTN;
                    m81 m81Var3;
                    boolean z;
                    int i5 = i;
                    x81 x81Var = this.EljAMC1QTz;
                    switch (i5) {
                        case 0:
                            List list = (List) obj;
                            xn0 gqMuANyCes = x81Var.gqMuANyCes();
                            y81 xqGvceK5x = y81.xqGvceK5x(x81Var.jivtDDk9H, yb.AvO7iQsrTN, 0L, 0L, 0, 0L, 16777214);
                            p50 p50Var = gqMuANyCes.iwATDS1i01k;
                            if (p50Var != null && (elVar = gqMuANyCes.mOu10nynGul) != null) {
                                u3 u3Var = new u3(gqMuANyCes.GWasM1elztuh);
                                if (gqMuANyCes.JFJ3QoxA != null && gqMuANyCes.uFEq9NpZ != null) {
                                    long j = gqMuANyCes.WIEu4Ya2g8 & (-8589934589L);
                                    int i6 = gqMuANyCes.EljAMC1QTz;
                                    boolean z2 = gqMuANyCes.OOA6hdeuvCS;
                                    int i7 = gqMuANyCes.xqGvceK5x;
                                    yt ytVar = gqMuANyCes.X1lG3V04pd;
                                    xp xpVar = xp.OOA6hdeuvCS;
                                    l81 l81Var = new l81(u3Var, xqGvceK5x, xpVar, i6, z2, i7, elVar, p50Var, ytVar, j);
                                    v5 v5Var = new v5(u3Var, xqGvceK5x, xpVar, elVar, ytVar);
                                    int i8 = gqMuANyCes.EljAMC1QTz;
                                    int i9 = gqMuANyCes.xqGvceK5x;
                                    hf0 hf0Var = new hf0();
                                    hf0Var.X1lG3V04pd = v5Var;
                                    hf0Var.GWasM1elztuh = i8;
                                    if (eg.JFJ3QoxA(j) != 0 || eg.mOu10nynGul(j) != 0) {
                                        u10.GWasM1elztuh("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) v5Var.OOA6hdeuvCS;
                                    int size = arrayList2.size();
                                    float f = 0.0f;
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        if (i10 < size) {
                                            vn0 vn0Var = (vn0) arrayList2.get(i10);
                                            int i12 = i10;
                                            f1 f1Var = vn0Var.GWasM1elztuh;
                                            int encWxUiV2 = eg.encWxUiV2(j);
                                            if (eg.X1lG3V04pd(j)) {
                                                xn0Var = gqMuANyCes;
                                                AvO7iQsrTN = eg.AvO7iQsrTN(j) - ((int) Math.ceil(f));
                                                if (AvO7iQsrTN < 0) {
                                                    AvO7iQsrTN = 0;
                                                }
                                            } else {
                                                xn0Var = gqMuANyCes;
                                                AvO7iQsrTN = eg.AvO7iQsrTN(j);
                                            }
                                            long Yi7zF1RB1 = fg.Yi7zF1RB1(encWxUiV2, AvO7iQsrTN, 5);
                                            float f2 = f;
                                            int i13 = size;
                                            c1 c1Var = new c1(f1Var, hf0Var.GWasM1elztuh - i11, i9, Yi7zF1RB1);
                                            float Yi7zF1RB12 = c1Var.Yi7zF1RB1() + f2;
                                            k81 k81Var = c1Var.xqGvceK5x;
                                            int i14 = i11 + k81Var.EljAMC1QTz;
                                            i2 = i14;
                                            arrayList.add(new un0(c1Var, vn0Var.Yi7zF1RB1, vn0Var.X1lG3V04pd, i11, i14, f2, Yi7zF1RB12));
                                            if (!k81Var.xqGvceK5x && (i2 != hf0Var.GWasM1elztuh || i12 == fb1.EXrPz3p7hFb((ArrayList) ((v5) hf0Var.X1lG3V04pd).OOA6hdeuvCS))) {
                                                i10 = i12 + 1;
                                                size = i13;
                                                i11 = i2;
                                                f = Yi7zF1RB12;
                                                gqMuANyCes = xn0Var;
                                            }
                                        } else {
                                            xn0Var = gqMuANyCes;
                                            i2 = i11;
                                        }
                                    }
                                    hf0Var.Yi7zF1RB1 = i2;
                                    hf0Var.OOA6hdeuvCS = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i15 = 0;
                                    while (i15 < size2) {
                                        List list2 = ((un0) arrayList.get(i15)).GWasM1elztuh.EljAMC1QTz;
                                        ArrayList arrayList4 = new ArrayList(list2.size());
                                        int size3 = list2.size();
                                        int i16 = 0;
                                        while (i16 < size3) {
                                            kt0 kt0Var2 = (kt0) list2.get(i16);
                                            if (kt0Var2 != null) {
                                                i3 = size2;
                                                i4 = i15;
                                                kt0Var = kt0Var2.OOA6hdeuvCS((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r7.EljAMC1QTz) & 4294967295L));
                                            } else {
                                                i3 = size2;
                                                i4 = i15;
                                                kt0Var = null;
                                            }
                                            arrayList4.add(kt0Var);
                                            i16++;
                                            size2 = i3;
                                            i15 = i4;
                                        }
                                        wb.nXl1EmE5(arrayList3, arrayList4);
                                        i15++;
                                    }
                                    if (arrayList3.size() < ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size()) {
                                        int size4 = ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        int i17 = 0;
                                        while (true) {
                                            m81Var2 = null;
                                            if (i17 < size4) {
                                                arrayList5.add(null);
                                                i17++;
                                            } else {
                                                arrayList3 = rb.hOpoc9RpANL(arrayList3, arrayList5);
                                            }
                                        }
                                    } else {
                                        m81Var2 = null;
                                    }
                                    hf0Var.xqGvceK5x = arrayList3;
                                    m81Var = new m81(l81Var, hf0Var, xn0Var.E7jCp8Ls);
                                    if (m81Var == null) {
                                        list.add(m81Var);
                                        m81Var3 = m81Var;
                                    } else {
                                        m81Var3 = m81Var2;
                                    }
                                    return Boolean.valueOf(m81Var3 == null);
                                }
                            }
                            m81Var2 = null;
                            m81Var = null;
                            if (m81Var == null) {
                            }
                            return Boolean.valueOf(m81Var3 == null);
                        case 1:
                            String str = ((u3) obj).EljAMC1QTz;
                            w81 w81Var = x81Var.k8h8IjolWQ;
                            if (w81Var == null) {
                                w81 w81Var2 = new w81(x81Var.mE4lRynR, str);
                                xn0 xn0Var2 = new xn0(str, x81Var.jivtDDk9H, x81Var.Y6hRI1cF8, x81Var.cilMamHF, x81Var.lv06NcmrQ, x81Var.WdrkLMV3xh, x81Var.WRKkgoJXwDn);
                                xn0Var2.xqGvceK5x(x81Var.gqMuANyCes().mOu10nynGul);
                                w81Var2.xqGvceK5x = xn0Var2;
                                x81Var.k8h8IjolWQ = w81Var2;
                            } else if (!o30.rQPn8YBR(str, w81Var.Yi7zF1RB1)) {
                                w81Var.Yi7zF1RB1 = str;
                                xn0 xn0Var3 = w81Var.xqGvceK5x;
                                if (xn0Var3 != null) {
                                    y81 y81Var = x81Var.jivtDDk9H;
                                    yt ytVar2 = x81Var.Y6hRI1cF8;
                                    int i18 = x81Var.cilMamHF;
                                    boolean z3 = x81Var.lv06NcmrQ;
                                    int i19 = x81Var.WdrkLMV3xh;
                                    int i20 = x81Var.WRKkgoJXwDn;
                                    xn0Var3.GWasM1elztuh = str;
                                    xn0Var3.Yi7zF1RB1 = y81Var;
                                    xn0Var3.X1lG3V04pd = ytVar2;
                                    xn0Var3.xqGvceK5x = i18;
                                    xn0Var3.OOA6hdeuvCS = z3;
                                    xn0Var3.EljAMC1QTz = i19;
                                    xn0Var3.AvO7iQsrTN = i20;
                                    xn0Var3.mE4lRynR = (xn0Var3.mE4lRynR << 2) | 2;
                                    xn0Var3.X1lG3V04pd();
                                }
                            }
                            l60.WIEu4Ya2g8(x81Var);
                            n4.XnEVoBF0td1l(x81Var);
                            p.uFEq9NpZ(x81Var);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            w81 w81Var3 = x81Var.k8h8IjolWQ;
                            if (w81Var3 == null) {
                                z = false;
                            } else {
                                w81Var3.X1lG3V04pd = booleanValue;
                                l60.WIEu4Ya2g8(x81Var);
                                n4.XnEVoBF0td1l(x81Var);
                                p.uFEq9NpZ(x81Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.M3K9sHhK = r0;
            v81Var2 = r0;
        }
        u3 u3Var = new u3(this.mE4lRynR);
        u40[] u40VarArr = j01.GWasM1elztuh;
        l01Var.GWasM1elztuh(h01.M3K9sHhK, fb1.HFYAaqMd6(u3Var));
        w81 w81Var = this.k8h8IjolWQ;
        if (w81Var != null) {
            boolean z = w81Var.X1lG3V04pd;
            k01 k01Var = h01.EXrPz3p7hFb;
            u40[] u40VarArr2 = j01.GWasM1elztuh;
            u40 u40Var = u40VarArr2[17];
            l01Var.GWasM1elztuh(k01Var, Boolean.valueOf(z));
            u3 u3Var2 = new u3(w81Var.Yi7zF1RB1);
            k01 k01Var2 = h01.k8h8IjolWQ;
            u40 u40Var2 = u40VarArr2[16];
            l01Var.GWasM1elztuh(k01Var2, u3Var2);
        }
        final int i2 = 1;
        l01Var.GWasM1elztuh(yz0.E7jCp8Ls, new VeqTn1PQw7(null, new hv(this) { // from class: v81
            public final /* synthetic */ x81 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0281  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0286  */
            @Override // defpackage.hv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mOu10nynGul(Object obj) {
                el elVar;
                m81 m81Var;
                xn0 xn0Var;
                int i22;
                m81 m81Var2;
                int i3;
                int i4;
                kt0 kt0Var;
                int AvO7iQsrTN;
                m81 m81Var3;
                boolean z2;
                int i5 = i2;
                x81 x81Var = this.EljAMC1QTz;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        xn0 gqMuANyCes = x81Var.gqMuANyCes();
                        y81 xqGvceK5x = y81.xqGvceK5x(x81Var.jivtDDk9H, yb.AvO7iQsrTN, 0L, 0L, 0, 0L, 16777214);
                        p50 p50Var = gqMuANyCes.iwATDS1i01k;
                        if (p50Var != null && (elVar = gqMuANyCes.mOu10nynGul) != null) {
                            u3 u3Var3 = new u3(gqMuANyCes.GWasM1elztuh);
                            if (gqMuANyCes.JFJ3QoxA != null && gqMuANyCes.uFEq9NpZ != null) {
                                long j = gqMuANyCes.WIEu4Ya2g8 & (-8589934589L);
                                int i6 = gqMuANyCes.EljAMC1QTz;
                                boolean z22 = gqMuANyCes.OOA6hdeuvCS;
                                int i7 = gqMuANyCes.xqGvceK5x;
                                yt ytVar = gqMuANyCes.X1lG3V04pd;
                                xp xpVar = xp.OOA6hdeuvCS;
                                l81 l81Var = new l81(u3Var3, xqGvceK5x, xpVar, i6, z22, i7, elVar, p50Var, ytVar, j);
                                v5 v5Var = new v5(u3Var3, xqGvceK5x, xpVar, elVar, ytVar);
                                int i8 = gqMuANyCes.EljAMC1QTz;
                                int i9 = gqMuANyCes.xqGvceK5x;
                                hf0 hf0Var = new hf0();
                                hf0Var.X1lG3V04pd = v5Var;
                                hf0Var.GWasM1elztuh = i8;
                                if (eg.JFJ3QoxA(j) != 0 || eg.mOu10nynGul(j) != 0) {
                                    u10.GWasM1elztuh("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) v5Var.OOA6hdeuvCS;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        vn0 vn0Var = (vn0) arrayList2.get(i10);
                                        int i12 = i10;
                                        f1 f1Var = vn0Var.GWasM1elztuh;
                                        int encWxUiV2 = eg.encWxUiV2(j);
                                        if (eg.X1lG3V04pd(j)) {
                                            xn0Var = gqMuANyCes;
                                            AvO7iQsrTN = eg.AvO7iQsrTN(j) - ((int) Math.ceil(f));
                                            if (AvO7iQsrTN < 0) {
                                                AvO7iQsrTN = 0;
                                            }
                                        } else {
                                            xn0Var = gqMuANyCes;
                                            AvO7iQsrTN = eg.AvO7iQsrTN(j);
                                        }
                                        long Yi7zF1RB1 = fg.Yi7zF1RB1(encWxUiV2, AvO7iQsrTN, 5);
                                        float f2 = f;
                                        int i13 = size;
                                        c1 c1Var = new c1(f1Var, hf0Var.GWasM1elztuh - i11, i9, Yi7zF1RB1);
                                        float Yi7zF1RB12 = c1Var.Yi7zF1RB1() + f2;
                                        k81 k81Var = c1Var.xqGvceK5x;
                                        int i14 = i11 + k81Var.EljAMC1QTz;
                                        i22 = i14;
                                        arrayList.add(new un0(c1Var, vn0Var.Yi7zF1RB1, vn0Var.X1lG3V04pd, i11, i14, f2, Yi7zF1RB12));
                                        if (!k81Var.xqGvceK5x && (i22 != hf0Var.GWasM1elztuh || i12 == fb1.EXrPz3p7hFb((ArrayList) ((v5) hf0Var.X1lG3V04pd).OOA6hdeuvCS))) {
                                            i10 = i12 + 1;
                                            size = i13;
                                            i11 = i22;
                                            f = Yi7zF1RB12;
                                            gqMuANyCes = xn0Var;
                                        }
                                    } else {
                                        xn0Var = gqMuANyCes;
                                        i22 = i11;
                                    }
                                }
                                hf0Var.Yi7zF1RB1 = i22;
                                hf0Var.OOA6hdeuvCS = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    List list2 = ((un0) arrayList.get(i15)).GWasM1elztuh.EljAMC1QTz;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        kt0 kt0Var2 = (kt0) list2.get(i16);
                                        if (kt0Var2 != null) {
                                            i3 = size2;
                                            i4 = i15;
                                            kt0Var = kt0Var2.OOA6hdeuvCS((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r7.EljAMC1QTz) & 4294967295L));
                                        } else {
                                            i3 = size2;
                                            i4 = i15;
                                            kt0Var = null;
                                        }
                                        arrayList4.add(kt0Var);
                                        i16++;
                                        size2 = i3;
                                        i15 = i4;
                                    }
                                    wb.nXl1EmE5(arrayList3, arrayList4);
                                    i15++;
                                }
                                if (arrayList3.size() < ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size()) {
                                    int size4 = ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i17 = 0;
                                    while (true) {
                                        m81Var2 = null;
                                        if (i17 < size4) {
                                            arrayList5.add(null);
                                            i17++;
                                        } else {
                                            arrayList3 = rb.hOpoc9RpANL(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    m81Var2 = null;
                                }
                                hf0Var.xqGvceK5x = arrayList3;
                                m81Var = new m81(l81Var, hf0Var, xn0Var.E7jCp8Ls);
                                if (m81Var == null) {
                                    list.add(m81Var);
                                    m81Var3 = m81Var;
                                } else {
                                    m81Var3 = m81Var2;
                                }
                                return Boolean.valueOf(m81Var3 == null);
                            }
                        }
                        m81Var2 = null;
                        m81Var = null;
                        if (m81Var == null) {
                        }
                        return Boolean.valueOf(m81Var3 == null);
                    case 1:
                        String str = ((u3) obj).EljAMC1QTz;
                        w81 w81Var2 = x81Var.k8h8IjolWQ;
                        if (w81Var2 == null) {
                            w81 w81Var22 = new w81(x81Var.mE4lRynR, str);
                            xn0 xn0Var2 = new xn0(str, x81Var.jivtDDk9H, x81Var.Y6hRI1cF8, x81Var.cilMamHF, x81Var.lv06NcmrQ, x81Var.WdrkLMV3xh, x81Var.WRKkgoJXwDn);
                            xn0Var2.xqGvceK5x(x81Var.gqMuANyCes().mOu10nynGul);
                            w81Var22.xqGvceK5x = xn0Var2;
                            x81Var.k8h8IjolWQ = w81Var22;
                        } else if (!o30.rQPn8YBR(str, w81Var2.Yi7zF1RB1)) {
                            w81Var2.Yi7zF1RB1 = str;
                            xn0 xn0Var3 = w81Var2.xqGvceK5x;
                            if (xn0Var3 != null) {
                                y81 y81Var = x81Var.jivtDDk9H;
                                yt ytVar2 = x81Var.Y6hRI1cF8;
                                int i18 = x81Var.cilMamHF;
                                boolean z3 = x81Var.lv06NcmrQ;
                                int i19 = x81Var.WdrkLMV3xh;
                                int i20 = x81Var.WRKkgoJXwDn;
                                xn0Var3.GWasM1elztuh = str;
                                xn0Var3.Yi7zF1RB1 = y81Var;
                                xn0Var3.X1lG3V04pd = ytVar2;
                                xn0Var3.xqGvceK5x = i18;
                                xn0Var3.OOA6hdeuvCS = z3;
                                xn0Var3.EljAMC1QTz = i19;
                                xn0Var3.AvO7iQsrTN = i20;
                                xn0Var3.mE4lRynR = (xn0Var3.mE4lRynR << 2) | 2;
                                xn0Var3.X1lG3V04pd();
                            }
                        }
                        l60.WIEu4Ya2g8(x81Var);
                        n4.XnEVoBF0td1l(x81Var);
                        p.uFEq9NpZ(x81Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        w81 w81Var3 = x81Var.k8h8IjolWQ;
                        if (w81Var3 == null) {
                            z2 = false;
                        } else {
                            w81Var3.X1lG3V04pd = booleanValue;
                            l60.WIEu4Ya2g8(x81Var);
                            n4.XnEVoBF0td1l(x81Var);
                            p.uFEq9NpZ(x81Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        l01Var.GWasM1elztuh(yz0.XnEVoBF0td1l, new VeqTn1PQw7(null, new hv(this) { // from class: v81
            public final /* synthetic */ x81 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0281  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0289  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x028b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0286  */
            @Override // defpackage.hv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mOu10nynGul(Object obj) {
                el elVar;
                m81 m81Var;
                xn0 xn0Var;
                int i22;
                m81 m81Var2;
                int i32;
                int i4;
                kt0 kt0Var;
                int AvO7iQsrTN;
                m81 m81Var3;
                boolean z2;
                int i5 = i3;
                x81 x81Var = this.EljAMC1QTz;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        xn0 gqMuANyCes = x81Var.gqMuANyCes();
                        y81 xqGvceK5x = y81.xqGvceK5x(x81Var.jivtDDk9H, yb.AvO7iQsrTN, 0L, 0L, 0, 0L, 16777214);
                        p50 p50Var = gqMuANyCes.iwATDS1i01k;
                        if (p50Var != null && (elVar = gqMuANyCes.mOu10nynGul) != null) {
                            u3 u3Var3 = new u3(gqMuANyCes.GWasM1elztuh);
                            if (gqMuANyCes.JFJ3QoxA != null && gqMuANyCes.uFEq9NpZ != null) {
                                long j = gqMuANyCes.WIEu4Ya2g8 & (-8589934589L);
                                int i6 = gqMuANyCes.EljAMC1QTz;
                                boolean z22 = gqMuANyCes.OOA6hdeuvCS;
                                int i7 = gqMuANyCes.xqGvceK5x;
                                yt ytVar = gqMuANyCes.X1lG3V04pd;
                                xp xpVar = xp.OOA6hdeuvCS;
                                l81 l81Var = new l81(u3Var3, xqGvceK5x, xpVar, i6, z22, i7, elVar, p50Var, ytVar, j);
                                v5 v5Var = new v5(u3Var3, xqGvceK5x, xpVar, elVar, ytVar);
                                int i8 = gqMuANyCes.EljAMC1QTz;
                                int i9 = gqMuANyCes.xqGvceK5x;
                                hf0 hf0Var = new hf0();
                                hf0Var.X1lG3V04pd = v5Var;
                                hf0Var.GWasM1elztuh = i8;
                                if (eg.JFJ3QoxA(j) != 0 || eg.mOu10nynGul(j) != 0) {
                                    u10.GWasM1elztuh("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) v5Var.OOA6hdeuvCS;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        vn0 vn0Var = (vn0) arrayList2.get(i10);
                                        int i12 = i10;
                                        f1 f1Var = vn0Var.GWasM1elztuh;
                                        int encWxUiV2 = eg.encWxUiV2(j);
                                        if (eg.X1lG3V04pd(j)) {
                                            xn0Var = gqMuANyCes;
                                            AvO7iQsrTN = eg.AvO7iQsrTN(j) - ((int) Math.ceil(f));
                                            if (AvO7iQsrTN < 0) {
                                                AvO7iQsrTN = 0;
                                            }
                                        } else {
                                            xn0Var = gqMuANyCes;
                                            AvO7iQsrTN = eg.AvO7iQsrTN(j);
                                        }
                                        long Yi7zF1RB1 = fg.Yi7zF1RB1(encWxUiV2, AvO7iQsrTN, 5);
                                        float f2 = f;
                                        int i13 = size;
                                        c1 c1Var = new c1(f1Var, hf0Var.GWasM1elztuh - i11, i9, Yi7zF1RB1);
                                        float Yi7zF1RB12 = c1Var.Yi7zF1RB1() + f2;
                                        k81 k81Var = c1Var.xqGvceK5x;
                                        int i14 = i11 + k81Var.EljAMC1QTz;
                                        i22 = i14;
                                        arrayList.add(new un0(c1Var, vn0Var.Yi7zF1RB1, vn0Var.X1lG3V04pd, i11, i14, f2, Yi7zF1RB12));
                                        if (!k81Var.xqGvceK5x && (i22 != hf0Var.GWasM1elztuh || i12 == fb1.EXrPz3p7hFb((ArrayList) ((v5) hf0Var.X1lG3V04pd).OOA6hdeuvCS))) {
                                            i10 = i12 + 1;
                                            size = i13;
                                            i11 = i22;
                                            f = Yi7zF1RB12;
                                            gqMuANyCes = xn0Var;
                                        }
                                    } else {
                                        xn0Var = gqMuANyCes;
                                        i22 = i11;
                                    }
                                }
                                hf0Var.Yi7zF1RB1 = i22;
                                hf0Var.OOA6hdeuvCS = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    List list2 = ((un0) arrayList.get(i15)).GWasM1elztuh.EljAMC1QTz;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        kt0 kt0Var2 = (kt0) list2.get(i16);
                                        if (kt0Var2 != null) {
                                            i32 = size2;
                                            i4 = i15;
                                            kt0Var = kt0Var2.OOA6hdeuvCS((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r7.EljAMC1QTz) & 4294967295L));
                                        } else {
                                            i32 = size2;
                                            i4 = i15;
                                            kt0Var = null;
                                        }
                                        arrayList4.add(kt0Var);
                                        i16++;
                                        size2 = i32;
                                        i15 = i4;
                                    }
                                    wb.nXl1EmE5(arrayList3, arrayList4);
                                    i15++;
                                }
                                if (arrayList3.size() < ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size()) {
                                    int size4 = ((List) ((v5) hf0Var.X1lG3V04pd).Yi7zF1RB1).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i17 = 0;
                                    while (true) {
                                        m81Var2 = null;
                                        if (i17 < size4) {
                                            arrayList5.add(null);
                                            i17++;
                                        } else {
                                            arrayList3 = rb.hOpoc9RpANL(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    m81Var2 = null;
                                }
                                hf0Var.xqGvceK5x = arrayList3;
                                m81Var = new m81(l81Var, hf0Var, xn0Var.E7jCp8Ls);
                                if (m81Var == null) {
                                    list.add(m81Var);
                                    m81Var3 = m81Var;
                                } else {
                                    m81Var3 = m81Var2;
                                }
                                return Boolean.valueOf(m81Var3 == null);
                            }
                        }
                        m81Var2 = null;
                        m81Var = null;
                        if (m81Var == null) {
                        }
                        return Boolean.valueOf(m81Var3 == null);
                    case 1:
                        String str = ((u3) obj).EljAMC1QTz;
                        w81 w81Var2 = x81Var.k8h8IjolWQ;
                        if (w81Var2 == null) {
                            w81 w81Var22 = new w81(x81Var.mE4lRynR, str);
                            xn0 xn0Var2 = new xn0(str, x81Var.jivtDDk9H, x81Var.Y6hRI1cF8, x81Var.cilMamHF, x81Var.lv06NcmrQ, x81Var.WdrkLMV3xh, x81Var.WRKkgoJXwDn);
                            xn0Var2.xqGvceK5x(x81Var.gqMuANyCes().mOu10nynGul);
                            w81Var22.xqGvceK5x = xn0Var2;
                            x81Var.k8h8IjolWQ = w81Var22;
                        } else if (!o30.rQPn8YBR(str, w81Var2.Yi7zF1RB1)) {
                            w81Var2.Yi7zF1RB1 = str;
                            xn0 xn0Var3 = w81Var2.xqGvceK5x;
                            if (xn0Var3 != null) {
                                y81 y81Var = x81Var.jivtDDk9H;
                                yt ytVar2 = x81Var.Y6hRI1cF8;
                                int i18 = x81Var.cilMamHF;
                                boolean z3 = x81Var.lv06NcmrQ;
                                int i19 = x81Var.WdrkLMV3xh;
                                int i20 = x81Var.WRKkgoJXwDn;
                                xn0Var3.GWasM1elztuh = str;
                                xn0Var3.Yi7zF1RB1 = y81Var;
                                xn0Var3.X1lG3V04pd = ytVar2;
                                xn0Var3.xqGvceK5x = i18;
                                xn0Var3.OOA6hdeuvCS = z3;
                                xn0Var3.EljAMC1QTz = i19;
                                xn0Var3.AvO7iQsrTN = i20;
                                xn0Var3.mE4lRynR = (xn0Var3.mE4lRynR << 2) | 2;
                                xn0Var3.X1lG3V04pd();
                            }
                        }
                        l60.WIEu4Ya2g8(x81Var);
                        n4.XnEVoBF0td1l(x81Var);
                        p.uFEq9NpZ(x81Var);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        w81 w81Var3 = x81Var.k8h8IjolWQ;
                        if (w81Var3 == null) {
                            z2 = false;
                        } else {
                            w81Var3.X1lG3V04pd = booleanValue;
                            l60.WIEu4Ya2g8(x81Var);
                            n4.XnEVoBF0td1l(x81Var);
                            p.uFEq9NpZ(x81Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        l01Var.GWasM1elztuh(yz0.uFEq9NpZ, new VeqTn1PQw7(null, new o1(21, this)));
        l01Var.GWasM1elztuh(yz0.GWasM1elztuh, new VeqTn1PQw7(null, v81Var2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.w50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int WRKkgoJXwDn(ub0 ub0Var, wc0 wc0Var, int i) {
        xn0 gqMuANyCes;
        w81 w81Var = this.k8h8IjolWQ;
        if (w81Var != null) {
            if (!w81Var.X1lG3V04pd) {
                w81Var = null;
            }
            if (w81Var != null) {
                gqMuANyCes = w81Var.xqGvceK5x;
            }
        }
        gqMuANyCes = gqMuANyCes();
        gqMuANyCes.xqGvceK5x(ub0Var);
        return gqMuANyCes.GWasM1elztuh(i, ub0Var.getLayoutDirection());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.w50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int dqB83aoLBB(ub0 ub0Var, wc0 wc0Var, int i) {
        xn0 gqMuANyCes;
        w81 w81Var = this.k8h8IjolWQ;
        if (w81Var != null) {
            if (!w81Var.X1lG3V04pd) {
                w81Var = null;
            }
            if (w81Var != null) {
                gqMuANyCes = w81Var.xqGvceK5x;
            }
        }
        gqMuANyCes = gqMuANyCes();
        gqMuANyCes.xqGvceK5x(ub0Var);
        return l60.mOu10nynGul(gqMuANyCes.OOA6hdeuvCS(ub0Var.getLayoutDirection()).GWasM1elztuh());
    }

    public final xn0 gqMuANyCes() {
        y81 y81Var = this.jivtDDk9H;
        if (this.pog2g9KITJA == null) {
            this.pog2g9KITJA = new xn0(this.mE4lRynR, y81Var, this.Y6hRI1cF8, this.cilMamHF, this.lv06NcmrQ, this.WdrkLMV3xh, this.WRKkgoJXwDn);
        }
        xn0 xn0Var = this.pog2g9KITJA;
        xn0Var.getClass();
        return xn0Var;
    }
}
