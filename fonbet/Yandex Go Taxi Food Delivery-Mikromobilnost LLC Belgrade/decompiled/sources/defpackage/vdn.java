package defpackage;

import com.yandex.go.superapp.api.loading_tracker.ServiceLoadingEvent;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;
import ru.yandex.taxi.eatskit.internal.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class vdn implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ vdn(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fho m;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                ccn ccnVar = (ccn) obj;
                ccnVar.d.invoke(cVar.u, ccnVar.b);
                if (ccnVar instanceof ru.yandex.taxi.eatskit.internal.c) {
                    rsi0 rsi0Var = cVar.p.b;
                    rsi0Var.getClass();
                }
                if ((ccnVar instanceof a) && (m = cVar.o.m()) != null && ((Boolean) ((a) ccnVar).b).booleanValue()) {
                    m.b.a(ServiceLoadingEvent.WILL_OPEN);
                    break;
                }
                break;
            case 1:
                cVar.u.g("onPaymentMethodUpdated", (y7a0) obj);
                break;
            case 2:
                cVar.u.g("setGeoPoint", new l0t((f0t) obj, GeoPointSource.GEO_REQUEST));
                break;
            default:
                cVar.u.g("onUpgradePhonishFail", (String) obj);
                break;
        }
        return zy11Var;
    }
}
