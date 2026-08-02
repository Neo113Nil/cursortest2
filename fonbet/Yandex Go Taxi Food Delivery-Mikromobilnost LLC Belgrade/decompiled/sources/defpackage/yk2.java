package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address.search.common.domain.interactor.a;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.search.c;

/* loaded from: classes12.dex */
public final class yk2 extends a390 {
    public final o y0;

    public yk2(o oVar, b bVar, i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, y9y0 y9y0Var, msi msiVar, c cVar, nbv0 nbv0Var, h51 h51Var, prj0 prj0Var, qoi qoiVar, hwf hwfVar, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, rh9 rh9Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mav0Var, mbv0Var, aVar, oxgVar, fhfVar, rwp0Var, s3oVar, f3oVar, y9y0Var, msiVar, cVar, nbv0Var, h51Var, prj0Var, qoiVar, hwfVar, oep0Var, d6v0Var, h4v0Var, dkv0Var, sourcePicker, mxbVar, rh9Var, pav0Var, cVar2);
        this.y0 = oVar;
        Kh(null);
    }

    @Override // com.yandex.go.address.search.common.presenter.b
    public final void onSourceAddressChanged(pv0 pv0Var) {
        Address address = pv0Var.a;
        Zone g = this.y0.g();
        String zoneName = pv0Var.a.getZoneName();
        if (g == null || zoneName == null || !zoneName.equals(g.a)) {
            g = null;
        }
        this.m0.i(new ZoneAddress(address, g));
    }
}
