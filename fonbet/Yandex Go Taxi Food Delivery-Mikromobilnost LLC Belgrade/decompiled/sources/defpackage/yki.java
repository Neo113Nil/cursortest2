package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.delivery.router.primary.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class yki implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ yki(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                b1 b1Var = (b1) aVar.U.a;
                b1Var.a.a("Delivery.FastFlow.DetailsCard.Shown", new HashMap(), 1, new HashMap());
                break;
            default:
                if (!aVar.t() && !aVar.V) {
                    aVar.r(new wth(26));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
