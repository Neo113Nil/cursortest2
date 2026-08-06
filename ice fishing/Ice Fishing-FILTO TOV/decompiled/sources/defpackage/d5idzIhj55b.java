package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class d5idzIhj55b implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 0;
    public final /* synthetic */ Object encWxUiV2;
    public final /* synthetic */ Object mOu10nynGul;

    public /* synthetic */ d5idzIhj55b(ml mlVar, z20 z20Var, zf0 zf0Var, int i) {
        this.AvO7iQsrTN = mlVar;
        this.encWxUiV2 = z20Var;
        this.mOu10nynGul = zf0Var;
        this.EljAMC1QTz = i;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        p50 p50Var = p50.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.mOu10nynGul;
        int i2 = this.EljAMC1QTz;
        Object obj3 = this.encWxUiV2;
        Object obj4 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                dd0 dd0Var = (dd0) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                tp0 tp0Var = (tp0) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    List list = (List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((up0) list.get(i4)).OOA6hdeuvCS + (i4 < list.size() + (-1) ? dd0Var.rezfBrjOrqK(8.0f) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    if (dd0Var.getLayoutDirection() == p50Var) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = i2 - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size2) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size2 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        tp0.AvO7iQsrTN(tp0Var, (up0) list.get(i14), iArr2[i14], ((Number) arrayList2.get(i3)).intValue());
                    }
                }
                return kc1Var;
            case 1:
                z20 z20Var = (z20) obj3;
                zf0 zf0Var = (zf0) obj2;
                if (obj == ((ml) obj4)) {
                    o4.jivtDDk9H("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof s51) {
                    int i15 = z20Var.GWasM1elztuh - i2;
                    int xqGvceK5x = zf0Var.xqGvceK5x(obj);
                    zf0Var.AvO7iQsrTN(Math.min(i15, xqGvceK5x >= 0 ? zf0Var.X1lG3V04pd[xqGvceK5x] : Integer.MAX_VALUE), obj);
                }
                return kc1Var;
            default:
                up0[] up0VarArr = (up0[]) obj4;
                zv0 zv0Var = (zv0) obj3;
                int[] iArr3 = (int[]) obj2;
                tp0 tp0Var2 = (tp0) obj;
                int length = up0VarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    up0 up0Var = up0VarArr[i16];
                    int i18 = i17 + 1;
                    up0Var.getClass();
                    Object encWxUiV2 = up0Var.encWxUiV2();
                    xv0 xv0Var = encWxUiV2 instanceof xv0 ? (xv0) encWxUiV2 : null;
                    yh yhVar = xv0Var != null ? xv0Var.X1lG3V04pd : null;
                    tp0.AvO7iQsrTN(tp0Var2, up0Var, iArr3[i17], yhVar != null ? yhVar.GWasM1elztuh.GWasM1elztuh(up0Var.EljAMC1QTz, i2, p50Var) : Math.round((1.0f + zv0Var.Yi7zF1RB1.GWasM1elztuh) * ((i2 - up0Var.EljAMC1QTz) / 2.0f)));
                    i16++;
                    i17 = i18;
                }
                return kc1Var;
        }
    }

    public /* synthetic */ d5idzIhj55b(ArrayList arrayList, dd0 dd0Var, int i, ArrayList arrayList2) {
        this.AvO7iQsrTN = arrayList;
        this.mOu10nynGul = dd0Var;
        this.EljAMC1QTz = i;
        this.encWxUiV2 = arrayList2;
    }

    public /* synthetic */ d5idzIhj55b(up0[] up0VarArr, zv0 zv0Var, int i, int[] iArr) {
        this.AvO7iQsrTN = up0VarArr;
        this.encWxUiV2 = zv0Var;
        this.EljAMC1QTz = i;
        this.mOu10nynGul = iArr;
    }
}
