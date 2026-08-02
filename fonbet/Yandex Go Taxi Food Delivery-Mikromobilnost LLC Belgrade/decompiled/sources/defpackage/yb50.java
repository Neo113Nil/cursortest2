package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.search.model.DecideLaterConfig;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class yb50 {
    public final i6r a;
    public final c b;
    public final y9y0 c;

    public yb50(i6r i6rVar, c cVar, y9y0 y9y0Var) {
        this.a = i6rVar;
        this.b = cVar;
        this.c = y9y0Var;
    }

    public final i4g a() {
        h0j h0jVar = new h0j(kzi.a, this.b.b() == Screen.MAIN_V4 ? "superapp_main" : "pickup_location", true);
        ddf ddfVar = new ddf(RoutePointType.SERVICE_NAVIGATOR_B);
        r51 r51Var = new r51(SourcePicker.NONE, DecideLaterConfig.a, null);
        m3o m3oVar = m3o.b;
        i6r i6rVar = this.a;
        i6rVar.getClass();
        m3oVar.getClass();
        y9y0 y9y0Var = this.c;
        y9y0Var.getClass();
        return new i4g(h0jVar, ddfVar, r51Var, m3oVar, i6rVar, y9y0Var);
    }
}
