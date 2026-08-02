package defpackage;

import android.text.Editable;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.costcenters.selection.CostCenterSelectionModalView;
import ru.yandex.taxi.costcenters.selection.b;

/* loaded from: classes5.dex */
public final class qxe implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ CostCenterSelectionModalView b;

    public /* synthetic */ qxe(CostCenterSelectionModalView costCenterSelectionModalView, int i) {
        this.a = i;
        this.b = costCenterSelectionModalView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        b bVar;
        b bVar2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        CostCenterSelectionModalView costCenterSelectionModalView = this.b;
        switch (i) {
            case 0:
                bVar = costCenterSelectionModalView.presenter;
                String obj2 = ((Editable) obj).toString();
                n0 n0Var = bVar.C;
                String obj3 = obj2 != null ? evu0.k0(obj2).toString() : null;
                if (obj3 == null) {
                    obj3 = "";
                }
                n0Var.g(obj3);
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bVar2 = costCenterSelectionModalView.presenter;
                bVar2.B.e = booleanValue;
                if (booleanValue) {
                    lxe lxeVar = bVar2.A;
                    b1 b1Var = lxeVar.a;
                    int i2 = lxeVar.b;
                    boolean z = lxeVar.e;
                    String str = lxeVar.c;
                    int i3 = lxeVar.f;
                    String str2 = lxeVar.d;
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(i2));
                    hashMap.put("is_required", Boolean.valueOf(z));
                    hashMap.put("title", str);
                    hashMap.put("total_elements", Integer.valueOf(i3));
                    b1Var.a.a("CostCenterCard.FieldList.SearchField.Tapped", hashMap, 1, tse0.r("type", hashMap, str2));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
