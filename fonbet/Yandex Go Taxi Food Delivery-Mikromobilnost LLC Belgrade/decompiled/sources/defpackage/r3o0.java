package defpackage;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.offers.v2.domain.lifecycle.ScootersOfferMapSetupInteractor$watchForVehicleTypeChange$$inlined$collectIn$1;
import com.yandex.go.scooters.offers.v2.domain.lifecycle.d;
import java.util.Collections;
import kotlinx.coroutines.flow.e;
import kotlinx.serialization.json.b;

/* loaded from: classes13.dex */
public final class r3o0 implements cwn0 {
    public final tt2 a;
    public final cyx b;
    public final z2o0 c;
    public final hbp0 d = new hbp0(new ehn0(12, this), null, null, 6);

    public r3o0(tt2 tt2Var, cyx cyxVar, z2o0 z2o0Var) {
        this.a = tt2Var;
        this.b = cyxVar;
        this.c = z2o0Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        cyx cyxVar = this.b;
        Mode mode = cyxVar.b.a().b.a;
        Mode mode2 = Mode.SCOOTERS;
        if (mode != mode2) {
            cyxVar.b(new byx(Screen.DISCOVERY, new c430(mode2, (b) null, (un0) null), byx.d));
        }
        tje.N(hbp0Var, null, null, new ScootersOfferMapSetupInteractor$watchForVehicleTypeChange$$inlined$collectIn$1(e.t(new d(new com.yandex.go.scooters.offers.v2.domain.lifecycle.b(e.d(this.c.a)))), null, this), 3);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        this.d.b();
        this.b.b(new byx(Screen.DISCOVERY, new c430(Mode.SCOOTERS, (b) null, (un0) null), Collections.singletonList(LayersCondition$Endpoint.POLYGONS)));
    }
}
