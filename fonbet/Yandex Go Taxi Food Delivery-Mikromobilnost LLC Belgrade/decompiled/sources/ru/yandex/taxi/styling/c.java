package ru.yandex.taxi.styling;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.bvf0;
import defpackage.e430;
import defpackage.f430;
import defpackage.h430;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.pex0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes10.dex */
public final class c {
    public final j a;
    public final f430 b;
    public final tt2 c;
    public final r0 d = bvf0.c(e430.d);

    public c(j jVar, f430 f430Var, tt2 tt2Var) {
        this.a = jVar;
        this.b = f430Var;
        this.c = tt2Var;
    }

    public static tpr b(c cVar) {
        return cVar.a(cVar.a.a(null));
    }

    public final tpr a(kotlinx.coroutines.flow.internal.g gVar) {
        n nVar = new n(new jqr(new b(kotlinx.coroutines.flow.e.t(gVar), this), new ModeStylesRepositoryImpl$observeModeStyle$2(this, null), 3), new ModeStylesRepositoryImpl$observeModeStyle$3(this, null));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(nVar, uyj.a);
    }

    public final e430 c(pex0 pex0Var, String str, Zone zone) {
        int i = h430.a[pex0Var.u0.ordinal()];
        return this.b.c(this.a.e(zone, i != 1 ? i != 2 ? pex0Var.b : TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY : TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, str));
    }

    public final e430 d(Zone zone, String str) {
        j jVar = this.a;
        return this.b.c(jVar.e(zone, str, ((k) jVar.c).h()));
    }

    public final rol0 e(o2y0 o2y0Var) {
        return new rol0(new ModeStylesRepositoryImpl$styleForOrderHolder$1(this, o2y0Var, null));
    }
}
