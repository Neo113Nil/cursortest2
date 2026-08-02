package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class thp0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ rvo w;

    public /* synthetic */ thp0(ArrayList arrayList, Div2View div2View, rvo rvoVar, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = div2View;
        this.w = rvoVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        rvo rvoVar = this.w;
        Div2View div2View = this.c;
        List<v3k> list = this.b;
        switch (i) {
            case 0:
                if (list != null) {
                    for (v3k v3kVar : list) {
                        y6k actionHandler = div2View.getActionHandler();
                        if (actionHandler != null) {
                            actionHandler.handleAction(v3kVar, div2View, rvoVar);
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (list != null) {
                    for (v3k v3kVar2 : list) {
                        y6k actionHandler2 = div2View.getActionHandler();
                        if (actionHandler2 != null) {
                            actionHandler2.handleAction(v3kVar2, div2View, rvoVar);
                        }
                    }
                    break;
                }
                break;
            case 2:
                if (list != null) {
                    for (v3k v3kVar3 : list) {
                        y6k actionHandler3 = div2View.getActionHandler();
                        if (actionHandler3 != null) {
                            actionHandler3.handleAction(v3kVar3, div2View, rvoVar);
                        }
                    }
                    break;
                }
                break;
            default:
                if (list != null) {
                    for (v3k v3kVar4 : list) {
                        y6k actionHandler4 = div2View.getActionHandler();
                        if (actionHandler4 != null) {
                            actionHandler4.handleAction(v3kVar4, div2View, rvoVar);
                        }
                    }
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
