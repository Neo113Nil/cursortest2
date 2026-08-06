package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    public /* synthetic */ dk(mg0 mg0Var, m10 m10Var, ot0 ot0Var, ph phVar) {
        this.OOA6hdeuvCS = 1;
        this.AvO7iQsrTN = mg0Var;
        this.encWxUiV2 = m10Var;
        this.EljAMC1QTz = ot0Var;
        this.mOu10nynGul = phVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        int i2 = 3;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.mOu10nynGul;
        Object obj3 = this.encWxUiV2;
        Object obj4 = this.AvO7iQsrTN;
        Object obj5 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                ot0 ot0Var = (ot0) obj5;
                fk fkVar = (fk) obj2;
                k3 k3Var = (k3) obj;
                float floatValue = ((Number) k3Var.OOA6hdeuvCS.getValue()).floatValue() - ot0Var.OOA6hdeuvCS;
                float GWasM1elztuh = ((sy0) obj3).GWasM1elztuh(floatValue);
                ot0Var.OOA6hdeuvCS = ((Number) k3Var.OOA6hdeuvCS.getValue()).floatValue();
                ((ot0) obj4).OOA6hdeuvCS = ((Number) k3Var.GWasM1elztuh.Yi7zF1RB1.mOu10nynGul(k3Var.EljAMC1QTz)).floatValue();
                if (Math.abs(floatValue - GWasM1elztuh) > 0.5f) {
                    k3Var.mOu10nynGul.setValue(Boolean.FALSE);
                    k3Var.xqGvceK5x.GWasM1elztuh();
                }
                fkVar.getClass();
                return kc1Var;
            case 1:
                m10 m10Var = (m10) obj3;
                ot0 ot0Var2 = (ot0) obj5;
                ph phVar = (ph) obj2;
                long longValue = ((Long) obj).longValue();
                m51 m51Var = (m51) ((mg0) obj4).getValue();
                long longValue2 = m51Var != null ? ((Number) m51Var.getValue()).longValue() : longValue;
                long j = m10Var.X1lG3V04pd;
                rg0 rg0Var = m10Var.GWasM1elztuh;
                if (j == Long.MIN_VALUE || ot0Var2.OOA6hdeuvCS != q70.YmKjaVtbfp5Z(phVar.EljAMC1QTz())) {
                    m10Var.X1lG3V04pd = longValue;
                    Object[] objArr = rg0Var.OOA6hdeuvCS;
                    int i3 = rg0Var.AvO7iQsrTN;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((k10) objArr[i4]).JFJ3QoxA = true;
                    }
                    ot0Var2.OOA6hdeuvCS = q70.YmKjaVtbfp5Z(phVar.EljAMC1QTz());
                }
                float f = ot0Var2.OOA6hdeuvCS;
                if (f == 0.0f) {
                    Object[] objArr2 = rg0Var.OOA6hdeuvCS;
                    int i5 = rg0Var.AvO7iQsrTN;
                    for (int i6 = 0; i6 < i5; i6++) {
                        k10 k10Var = (k10) objArr2[i6];
                        k10Var.AvO7iQsrTN.setValue(k10Var.encWxUiV2.X1lG3V04pd);
                        k10Var.JFJ3QoxA = true;
                    }
                } else {
                    long j2 = (long) ((longValue2 - m10Var.X1lG3V04pd) / f);
                    Object[] objArr3 = rg0Var.OOA6hdeuvCS;
                    int i7 = rg0Var.AvO7iQsrTN;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        k10 k10Var2 = (k10) objArr3[i8];
                        if (!k10Var2.mOu10nynGul) {
                            k10Var2.E7jCp8Ls.Yi7zF1RB1.setValue(Boolean.FALSE);
                            if (k10Var2.JFJ3QoxA) {
                                k10Var2.JFJ3QoxA = false;
                                k10Var2.rQPn8YBR = j2;
                            }
                            long j3 = j2 - k10Var2.rQPn8YBR;
                            k10Var2.AvO7iQsrTN.setValue(k10Var2.encWxUiV2.Yi7zF1RB1(j3));
                            k10Var2.mOu10nynGul = k10Var2.encWxUiV2.AvO7iQsrTN(j3);
                        }
                        if (!k10Var2.mOu10nynGul) {
                            z = false;
                        }
                    }
                    m10Var.xqGvceK5x.setValue(Boolean.valueOf(!z));
                }
                return kc1Var;
            case 2:
                z70 z70Var = (z70) obj5;
                z70Var.X1lG3V04pd = new i50((o70) obj4, (o61) obj3, (rr0) obj2);
                return new z(i2, z70Var);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                hv hvVar = (hv) obj5;
                wu wuVar = (wu) obj4;
                wu wuVar2 = (wu) obj3;
                wu wuVar3 = (wu) obj2;
                jd0 jd0Var = (jd0) obj;
                jd0Var.getClass();
                if (jd0Var instanceof fd0) {
                    hvVar.mOu10nynGul(Integer.valueOf(((fd0) jd0Var).GWasM1elztuh));
                } else if (jd0Var.equals(hd0.GWasM1elztuh)) {
                    wuVar.GWasM1elztuh();
                } else if (jd0Var.equals(gd0.GWasM1elztuh)) {
                    wuVar2.GWasM1elztuh();
                } else {
                    if (!jd0Var.equals(id0.GWasM1elztuh)) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    wuVar3.GWasM1elztuh();
                }
                return kc1Var;
            case 4:
                ot0 ot0Var3 = (ot0) obj5;
                ef0 ef0Var = (ef0) obj4;
                uy0 uy0Var = (uy0) obj3;
                bf0 bf0Var = (bf0) obj2;
                k3 k3Var2 = (k3) obj;
                fo0 fo0Var = k3Var2.OOA6hdeuvCS;
                wu wuVar4 = k3Var2.xqGvceK5x;
                fo0 fo0Var2 = k3Var2.mOu10nynGul;
                float floatValue2 = ((Number) fo0Var.getValue()).floatValue() - ot0Var3.OOA6hdeuvCS;
                if (!n4.EljAMC1QTz(floatValue2)) {
                    if (!n4.EljAMC1QTz(floatValue2 - ef0Var.OOA6hdeuvCS(uy0Var, floatValue2))) {
                        fo0Var2.setValue(Boolean.FALSE);
                        wuVar4.GWasM1elztuh();
                        return kc1Var;
                    }
                    ot0Var3.OOA6hdeuvCS += floatValue2;
                }
                if (((Boolean) bf0Var.mOu10nynGul(Float.valueOf(ot0Var3.OOA6hdeuvCS))).booleanValue()) {
                    fo0Var2.setValue(Boolean.FALSE);
                    wuVar4.GWasM1elztuh();
                }
                return kc1Var;
            case 5:
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                ((nt0) obj5).OOA6hdeuvCS = true;
                ((ph0) obj4).GWasM1elztuh((xh0) obj3, (Bundle) obj2, fh0Var, xp.OOA6hdeuvCS);
                return kc1Var;
            default:
                wu wuVar5 = (wu) obj5;
                p31 p31Var = (p31) obj4;
                ph phVar2 = (ph) obj3;
                String str = (String) obj2;
                d11 d11Var = (d11) obj;
                d11Var.getClass();
                if (d11Var.equals(b11.GWasM1elztuh)) {
                    wuVar5.GWasM1elztuh();
                } else {
                    if (!d11Var.equals(c11.GWasM1elztuh)) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    m31 m31Var = (m31) p31Var.Yi7zF1RB1.getValue();
                    if (m31Var != null) {
                        m31Var.GWasM1elztuh();
                    }
                    fb1.MZhzXH72(phVar2, null, new ax(p31Var, str, null, 2), 3);
                }
                return kc1Var;
        }
    }

    public /* synthetic */ dk(ot0 ot0Var, sy0 sy0Var, ot0 ot0Var2, fk fkVar) {
        this.OOA6hdeuvCS = 0;
        this.EljAMC1QTz = ot0Var;
        this.encWxUiV2 = sy0Var;
        this.AvO7iQsrTN = ot0Var2;
        this.mOu10nynGul = fkVar;
    }

    public /* synthetic */ dk(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
        this.encWxUiV2 = obj3;
        this.mOu10nynGul = obj4;
    }
}
