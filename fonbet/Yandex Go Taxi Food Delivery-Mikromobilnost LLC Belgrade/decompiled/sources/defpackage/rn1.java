package defpackage;

import java.util.List;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class rn1 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ on1 b;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        on1 on1Var = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    CharSequence charSequence = on1Var.a;
                    List list = on1Var.b;
                    if (list != null && !list.isEmpty()) {
                        btsVar.e0(-1840827389);
                        a.c(list, btsVar, 0);
                        btsVar.t(false);
                        break;
                    } else if (charSequence == null) {
                        btsVar.e0(-1840688261);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(-1840747843);
                        a.b(charSequence, true, btsVar, 48);
                        btsVar.t(false);
                        break;
                    }
                }
                break;
            default:
                num.getClass();
                a.a(on1Var, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
