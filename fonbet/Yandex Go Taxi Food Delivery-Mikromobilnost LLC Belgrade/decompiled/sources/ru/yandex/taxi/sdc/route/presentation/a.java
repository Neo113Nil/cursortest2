package ru.yandex.taxi.sdc.route.presentation;

import com.yandex.go.zone.dto.objects.CustomEndpoint;
import defpackage.bmp0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.o2y0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.o;

/* loaded from: classes6.dex */
public final class a {
    public final o2y0 a;
    public final bmp0 b;
    public final ru.yandex.taxi.sdc.route.repository.a c;
    public final tt2 d;
    public final hbp0 e = new hbp0(new czo0(14), a.class.getSimpleName(), null);
    public kotlinx.coroutines.c f = kotlinx.coroutines.a.a();

    public a(o2y0 o2y0Var, bmp0 bmp0Var, ru.yandex.taxi.sdc.route.repository.a aVar, tt2 tt2Var) {
        this.a = o2y0Var;
        this.b = bmp0Var;
        this.c = aVar;
        this.d = tt2Var;
    }

    public final boolean a() {
        Object obj;
        Iterator it = this.a.b().V().f0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CustomEndpoint customEndpoint = (CustomEndpoint) obj;
            this.c.b = customEndpoint.b;
            if (customEndpoint.a == CustomEndpoint.Type.ROUTE) {
                break;
            }
        }
        return obj != null;
    }

    public final void b(List list) {
        if (a()) {
            this.f.a(null);
            rol0 rol0Var = new rol0(new SdcOrderRouteControllerImpl$setRawRoute$1(this, list, null));
            this.d.getClass();
            sjh sjhVar = uyj.a;
            this.f = kotlinx.coroutines.flow.e.H(this.e.c(), new jqr(new o(kotlinx.coroutines.flow.e.F(rol0Var, mdh.b), new SdcOrderRouteControllerImpl$setRawRoute$2(this, list, null)), new SdcOrderRouteControllerImpl$setRawRoute$3(this, null), 3));
        }
    }
}
