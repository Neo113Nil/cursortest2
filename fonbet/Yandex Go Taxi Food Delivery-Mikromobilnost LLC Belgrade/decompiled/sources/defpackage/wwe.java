package defpackage;

import android.content.Context;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.base.CostCenterBaseModalView;
import ru.yandex.taxi.costcenters.input.CostCenterInputModalView;
import ru.yandex.taxi.costcenters.selection.CostCenterSelectionModalView;
import ru.yandex.taxi.costcenters.selection.b;

/* loaded from: classes5.dex */
public final class wwe {
    public static CostCenterBaseModalView a(Context context, zxf zxfVar) {
        hwe hweVar = zxfVar.d;
        Integer num = zxfVar.c;
        j4n j4nVar = zxfVar.a;
        CostCenterField costCenterField = zxfVar.b;
        CostCenterField.InputFormat inputFormat = costCenterField.e;
        q5z.i(inputFormat);
        int i = vwe.a[inputFormat.ordinal()];
        if (i == 1) {
            j5z j5zVar = ((gwe) j4nVar.a).d;
            q5z.h(j5zVar);
            zwe zweVar = (zwe) j4nVar.c;
            q5z.h(zweVar);
            uwe uweVar = new uwe(j5zVar, zweVar, costCenterField);
            pho phoVar = ((gwe) j4nVar.a).c;
            q5z.h(phoVar);
            return new CostCenterInputModalView(context, new swe(uweVar, new xe6(new b1(phoVar), costCenterField, num.intValue()), hweVar));
        }
        if (i != 2 && i != 3) {
            ny61.g("Unsupported cost center input mode detected");
            return null;
        }
        j5z j5zVar2 = ((gwe) j4nVar.a).d;
        q5z.h(j5zVar2);
        zwe zweVar2 = (zwe) j4nVar.c;
        q5z.h(zweVar2);
        uwe uweVar2 = new uwe(j5zVar2, zweVar2, costCenterField);
        tt2 tt2Var = ((gwe) j4nVar.a).a;
        q5z.h(tt2Var);
        pho phoVar2 = ((gwe) j4nVar.a).c;
        q5z.h(phoVar2);
        return new CostCenterSelectionModalView(context, new b(uweVar2, tt2Var, new lxe(new b1(phoVar2), costCenterField, num.intValue()), hweVar));
    }
}
