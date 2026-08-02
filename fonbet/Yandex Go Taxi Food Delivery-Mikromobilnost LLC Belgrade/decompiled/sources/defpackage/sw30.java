package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class sw30 extends h55 {
    public final ajd D;
    public final wu30 E;
    public final h3y F;

    public sw30(ajd ajdVar, wu30 wu30Var, h3y h3yVar) {
        super(null);
        this.D = ajdVar;
        this.E = wu30Var;
        this.F = h3yVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ajd ajdVar = this.D;
        sid sidVar = ajdVar.a;
        w030 w030Var = ajdVar.b;
        c cVar = ajdVar.c;
        c8v0 c8v0Var = ajdVar.d;
        u91 u91Var = ajdVar.e;
        wu30 wu30Var = this.E;
        zid zidVar = new zid(sidVar, wu30Var, w030Var, cVar, c8v0Var, u91Var);
        PointType pointType = PointType.DESTINATION;
        SourcePicker sourcePicker = SourcePicker.FROM_TRANSPORT_DISCOVERY;
        o501 o501Var = new o501(kyh0.address_search_modal_view_from, kyh0.address_search_modal_view_to, 14);
        A(zidVar, new jsd(pointType, sourcePicker, false, new q501(o501Var, o501Var), wu30Var.k(), "discovery_masstransit", null, HProv.ALG_TYPE_BLOCK), new k0i(this, 2));
    }
}
