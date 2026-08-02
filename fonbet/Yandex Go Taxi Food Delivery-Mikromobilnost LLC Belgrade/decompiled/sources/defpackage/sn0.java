package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes5.dex */
public final class sn0 implements xsd0 {
    public final tt2 a;
    public final atd0 b;
    public final b c;

    public sn0(tt2 tt2Var, atd0 atd0Var, b bVar) {
        this.a = tt2Var;
        this.b = atd0Var;
        this.c = bVar;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        ymu ymuVar;
        zzs zzsVar;
        AdditionalRequestAction.AdditionalRequestParams additionalRequestParams = ((AdditionalRequestAction) wsd0Var.getAction()).a;
        AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType additionalRequestParamType = additionalRequestParams != null ? additionalRequestParams.a : null;
        if (additionalRequestParamType != null) {
            d0l0 c = this.c.c();
            int i = rn0.a[additionalRequestParamType.ordinal()];
            if (i == 1) {
                Address h = c.h();
                ymuVar = new ymu(5, h != null ? h.B() : null, RoutePointType.POINT_A);
            } else if (i == 2) {
                Address b = c.b();
                ymuVar = new ymu(5, b != null ? b.B() : null, RoutePointType.POINT_B);
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                ymuVar = new ymu(5, (Object) null, (Object) null);
            }
            RoutePointType routePointType = (RoutePointType) ymuVar.c;
            if (routePointType != null && (zzsVar = (zzs) ymuVar.b) != null) {
                tpr p = ((i) this.b).p(zzsVar, routePointType, "auto");
                this.a.getClass();
                sjh sjhVar = uyj.a;
                return e.j(e.F(p, mdh.b), continuation);
            }
        }
        return zy11.a;
    }
}
