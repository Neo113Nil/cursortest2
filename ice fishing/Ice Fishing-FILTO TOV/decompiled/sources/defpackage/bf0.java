package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf0 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Serializable EljAMC1QTz;
    public final /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    public /* synthetic */ bf0(nt0 nt0Var, ArrayList arrayList, pt0 pt0Var, ph0 ph0Var, Bundle bundle) {
        this.OOA6hdeuvCS = 1;
        this.EljAMC1QTz = nt0Var;
        this.AvO7iQsrTN = arrayList;
        this.encWxUiV2 = pt0Var;
        this.mOu10nynGul = ph0Var;
        this.JFJ3QoxA = bundle;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        List list;
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Serializable serializable = this.EljAMC1QTz;
        Object obj2 = this.JFJ3QoxA;
        Object obj3 = this.mOu10nynGul;
        Object obj4 = this.encWxUiV2;
        Object obj5 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                ef0 ef0Var = (ef0) obj5;
                rt0 rt0Var = (rt0) obj4;
                ot0 ot0Var = (ot0) obj3;
                wy0 wy0Var = (wy0) obj2;
                nt0 nt0Var = (nt0) serializable;
                float floatValue = ((Float) obj).floatValue();
                ze0 AvO7iQsrTN = ef0.AvO7iQsrTN(ef0Var.AvO7iQsrTN);
                if (AvO7iQsrTN != null) {
                    d dVar = ef0Var.OOA6hdeuvCS;
                    long j = AvO7iQsrTN.Yi7zF1RB1;
                    long j2 = AvO7iQsrTN.GWasM1elztuh;
                    ((ae1) dVar.EljAMC1QTz).GWasM1elztuh(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((ae1) dVar.AvO7iQsrTN).GWasM1elztuh(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    ze0 GWasM1elztuh = ((ze0) rt0Var.OOA6hdeuvCS).GWasM1elztuh(AvO7iQsrTN);
                    rt0Var.OOA6hdeuvCS = GWasM1elztuh;
                    ot0Var.OOA6hdeuvCS = wy0Var.mOu10nynGul(wy0Var.OOA6hdeuvCS(GWasM1elztuh.GWasM1elztuh));
                    nt0Var.OOA6hdeuvCS = !n4.EljAMC1QTz(r13 - floatValue);
                }
                return Boolean.valueOf(AvO7iQsrTN != null);
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                pt0 pt0Var = (pt0) obj4;
                ph0 ph0Var = (ph0) obj3;
                Bundle bundle = (Bundle) obj2;
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                ((nt0) serializable).OOA6hdeuvCS = true;
                int indexOf = arrayList.indexOf(fh0Var);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(pt0Var.OOA6hdeuvCS, i2);
                    pt0Var.OOA6hdeuvCS = i2;
                } else {
                    list = xp.OOA6hdeuvCS;
                }
                ph0Var.GWasM1elztuh(fh0Var.EljAMC1QTz, bundle, fh0Var, list);
                return kc1Var;
            default:
                hv hvVar = (hv) obj5;
                wu wuVar = (wu) obj4;
                p31 p31Var = (p31) obj3;
                ph phVar = (ph) obj2;
                String str = (String) serializable;
                cz0 cz0Var = (cz0) obj;
                cz0Var.getClass();
                if (cz0Var instanceof az0) {
                    hvVar.mOu10nynGul(Integer.valueOf(((az0) cz0Var).GWasM1elztuh));
                    return kc1Var;
                }
                if (cz0Var.equals(zy0.GWasM1elztuh)) {
                    wuVar.GWasM1elztuh();
                    return kc1Var;
                }
                if (!cz0Var.equals(bz0.GWasM1elztuh)) {
                    o4.xqGvceK5x();
                    return null;
                }
                m31 m31Var = (m31) p31Var.Yi7zF1RB1.getValue();
                if (m31Var != null) {
                    m31Var.GWasM1elztuh();
                }
                fb1.MZhzXH72(phVar, null, new ax(p31Var, str, null, 1), 3);
                return kc1Var;
        }
    }

    public /* synthetic */ bf0(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, int i) {
        this.OOA6hdeuvCS = i;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
        this.mOu10nynGul = obj3;
        this.JFJ3QoxA = obj4;
        this.EljAMC1QTz = serializable;
    }
}
