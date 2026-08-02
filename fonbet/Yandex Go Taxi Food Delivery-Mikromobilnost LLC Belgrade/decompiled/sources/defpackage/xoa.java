package defpackage;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class xoa implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ m2a c;

    public /* synthetic */ xoa(e eVar, m2a m2aVar, int i) {
        this.a = i;
        this.b = eVar;
        this.c = m2aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m2a m2aVar = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.V(m2aVar);
                break;
            default:
                eVar.T(m2aVar, ChargersDiscountsListEntryPoint.DEEPLINK, null);
                break;
        }
        return zy11Var;
    }
}
