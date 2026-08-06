package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;

    public /* synthetic */ d2(og ogVar, bd1 bd1Var, f40 f40Var, uy0 uy0Var) {
        this.OOA6hdeuvCS = 1;
        this.EljAMC1QTz = ogVar;
        this.AvO7iQsrTN = f40Var;
        this.encWxUiV2 = uy0Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        final int i2 = 0;
        final int i3 = 1;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.encWxUiV2;
        Object obj3 = this.AvO7iQsrTN;
        Object obj4 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                g2 g2Var = (g2) obj4;
                m3 m3Var = (m3) obj3;
                nt0 nt0Var = (nt0) obj2;
                k3 k3Var = (k3) obj;
                q70.M3K9sHhK(k3Var, g2Var.X1lG3V04pd);
                fo0 fo0Var = k3Var.OOA6hdeuvCS;
                Object GWasM1elztuh = g2.GWasM1elztuh(g2Var, fo0Var.getValue());
                if (!o30.rQPn8YBR(GWasM1elztuh, fo0Var.getValue())) {
                    g2Var.X1lG3V04pd.EljAMC1QTz.setValue(GWasM1elztuh);
                    m3Var.EljAMC1QTz.setValue(GWasM1elztuh);
                    k3Var.mOu10nynGul.setValue(Boolean.FALSE);
                    k3Var.xqGvceK5x.GWasM1elztuh();
                    nt0Var.OOA6hdeuvCS = true;
                }
                return kc1Var;
            case 1:
                og ogVar = (og) obj4;
                f40 f40Var = (f40) obj3;
                uy0 uy0Var = (uy0) obj2;
                float floatValue = ((Float) obj).floatValue();
                float f = ogVar.Y6hRI1cF8 ? 1.0f : -1.0f;
                wy0 wy0Var = ogVar.jivtDDk9H;
                long OOA6hdeuvCS = wy0Var.OOA6hdeuvCS(wy0Var.encWxUiV2(f * floatValue));
                wy0 wy0Var2 = uy0Var.GWasM1elztuh;
                float AvO7iQsrTN = wy0Var.AvO7iQsrTN(wy0Var.OOA6hdeuvCS(wy0Var2.X1lG3V04pd(wy0Var2.rQPn8YBR, OOA6hdeuvCS, 1))) * f;
                if (Math.abs(AvO7iQsrTN) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + AvO7iQsrTN + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    f40Var.GWasM1elztuh(cancellationException);
                }
                return kc1Var;
            case 2:
                p41 p41Var = (p41) obj4;
                fh0 fh0Var = (fh0) obj3;
                p41Var.add(fh0Var);
                return new m2((am) obj2, fh0Var, p41Var);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                mg0 mg0Var = (mg0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                tp0 tp0Var = (tp0) obj;
                tp0Var.OOA6hdeuvCS = true;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((q80) arrayList.get(i4)).Yi7zF1RB1(tp0Var);
                }
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((q80) list.get(i5)).Yi7zF1RB1(tp0Var);
                }
                tp0Var.OOA6hdeuvCS = false;
                mg0Var.getValue();
                return kc1Var;
            case 4:
                t90 t90Var = (t90) obj4;
                final x90 x90Var = (x90) obj3;
                final hv hvVar = (hv) obj2;
                final rt0 rt0Var = new rt0();
                r90 r90Var = new r90() { // from class: p90
                    @Override // defpackage.r90
                    public final void OOA6hdeuvCS(t90 t90Var2, l90 l90Var) {
                        int i6 = i2;
                        hv hvVar2 = hvVar;
                        rt0 rt0Var2 = rt0Var;
                        t90 t90Var3 = x90Var;
                        switch (i6) {
                            case 0:
                                x90 x90Var2 = (x90) t90Var3;
                                int i7 = q90.GWasM1elztuh[l90Var.ordinal()];
                                if (i7 == 3) {
                                    rt0Var2.OOA6hdeuvCS = hvVar2.mOu10nynGul(x90Var2);
                                    break;
                                } else if (i7 == 4) {
                                    bx bxVar = (bx) rt0Var2.OOA6hdeuvCS;
                                    if (bxVar != null) {
                                        kx kxVar = bxVar.GWasM1elztuh;
                                        kxVar.EljAMC1QTz.mE4lRynR(pw.GWasM1elztuh);
                                    }
                                    rt0Var2.OOA6hdeuvCS = null;
                                    break;
                                }
                                break;
                            default:
                                ba0 ba0Var = (ba0) t90Var3;
                                int i8 = q90.GWasM1elztuh[l90Var.ordinal()];
                                if (i8 == 1) {
                                    rt0Var2.OOA6hdeuvCS = hvVar2.mOu10nynGul(ba0Var);
                                    break;
                                } else if (i8 == 2) {
                                    zq0 zq0Var = (zq0) rt0Var2.OOA6hdeuvCS;
                                    if (zq0Var != null) {
                                        zq0Var.GWasM1elztuh();
                                    }
                                    rt0Var2.OOA6hdeuvCS = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                t90Var.AvO7iQsrTN().GWasM1elztuh(r90Var);
                return new m2(t90Var, r90Var, rt0Var, 2);
            case 5:
                t90 t90Var2 = (t90) obj4;
                final ba0 ba0Var = (ba0) obj3;
                final hv hvVar2 = (hv) obj2;
                final rt0 rt0Var2 = new rt0();
                r90 r90Var2 = new r90() { // from class: p90
                    @Override // defpackage.r90
                    public final void OOA6hdeuvCS(t90 t90Var22, l90 l90Var) {
                        int i6 = i3;
                        hv hvVar22 = hvVar2;
                        rt0 rt0Var22 = rt0Var2;
                        t90 t90Var3 = ba0Var;
                        switch (i6) {
                            case 0:
                                x90 x90Var2 = (x90) t90Var3;
                                int i7 = q90.GWasM1elztuh[l90Var.ordinal()];
                                if (i7 == 3) {
                                    rt0Var22.OOA6hdeuvCS = hvVar22.mOu10nynGul(x90Var2);
                                    break;
                                } else if (i7 == 4) {
                                    bx bxVar = (bx) rt0Var22.OOA6hdeuvCS;
                                    if (bxVar != null) {
                                        kx kxVar = bxVar.GWasM1elztuh;
                                        kxVar.EljAMC1QTz.mE4lRynR(pw.GWasM1elztuh);
                                    }
                                    rt0Var22.OOA6hdeuvCS = null;
                                    break;
                                }
                                break;
                            default:
                                ba0 ba0Var2 = (ba0) t90Var3;
                                int i8 = q90.GWasM1elztuh[l90Var.ordinal()];
                                if (i8 == 1) {
                                    rt0Var22.OOA6hdeuvCS = hvVar22.mOu10nynGul(ba0Var2);
                                    break;
                                } else if (i8 == 2) {
                                    zq0 zq0Var = (zq0) rt0Var22.OOA6hdeuvCS;
                                    if (zq0Var != null) {
                                        zq0Var.GWasM1elztuh();
                                    }
                                    rt0Var22.OOA6hdeuvCS = null;
                                    break;
                                }
                                break;
                        }
                    }
                };
                t90Var2.AvO7iQsrTN().GWasM1elztuh(r90Var2);
                return new m2(t90Var2, r90Var2, rt0Var2, 3);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                jw0 jw0Var = (jw0) obj4;
                ow0 ow0Var = (ow0) obj2;
                hg0 hg0Var = jw0Var.EljAMC1QTz;
                if (hg0Var.Yi7zF1RB1(obj3)) {
                    o4.iwATDS1i01k("Key ", obj3, " was used multiple times ");
                    return null;
                }
                jw0Var.OOA6hdeuvCS.remove(obj3);
                hg0Var.XnEVoBF0td1l(obj3, ow0Var);
                return new m2(jw0Var, obj3, ow0Var, 4);
            default:
                pd pdVar = (pd) obj2;
                Throwable th = (Throwable) obj;
                ((E7jCp8Ls) obj4).mOu10nynGul(th);
                n8 n8Var = (n8) ((rx0) obj3).AvO7iQsrTN;
                n8Var.AvO7iQsrTN(th, false);
                while (true) {
                    Object YmKjaVtbfp5Z = n8Var.YmKjaVtbfp5Z();
                    if (YmKjaVtbfp5Z instanceof ja) {
                        YmKjaVtbfp5Z = null;
                    }
                    if (YmKjaVtbfp5Z == null) {
                        return kc1Var;
                    }
                    pdVar.EljAMC1QTz(YmKjaVtbfp5Z, th);
                }
        }
    }

    public /* synthetic */ d2(mg0 mg0Var, ArrayList arrayList, List list, boolean z) {
        this.OOA6hdeuvCS = 3;
        this.EljAMC1QTz = mg0Var;
        this.AvO7iQsrTN = arrayList;
        this.encWxUiV2 = list;
    }

    public /* synthetic */ d2(Object obj, Object obj2, Object obj3, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
        this.encWxUiV2 = obj3;
    }
}
