package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.dr0;
import defpackage.f0t;
import defpackage.h1p;
import defpackage.hgn;
import defpackage.hst;
import defpackage.i0t;
import defpackage.jst;
import defpackage.ken;
import defpackage.l0t;
import defpackage.rvf0;
import defpackage.sk7;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.a;
import ru.yandex.taxi.eatskit.dto.GeoPointSource;
import ru.yandex.taxi.superapp.address.UnknownGeoPositionException;
import ru.yandex.taxi.superapp.address.f;
import ru.yandex.taxi.superapp.e;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class EatsNativeApi$confirmGeoPoint$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        l0t l0tVar = (l0t) obj;
        a aVar = (a) ((ken) this.receiver);
        aVar.getClass();
        Double d = l0tVar.c;
        Double d2 = l0tVar.b;
        f0t f0tVar = (d2 == null || d == null || l0tVar.d == null) ? null : new f0t(d2.doubleValue(), d.doubleValue(), l0tVar.d, l0tVar.e, l0tVar.f, l0tVar.g, l0tVar.h, l0tVar.i, l0tVar.j, l0tVar.k, l0tVar.l, l0tVar.m, l0tVar.n);
        if (f0tVar != null) {
            double d3 = f0tVar.a;
            dr0 dr0Var = (dr0) aVar.c.o.w.get(dr0.class);
            if (dr0Var != null) {
                GeoPointSource geoPointSource = l0tVar.a;
                sk7 sk7Var = dr0Var.a;
                f fVar = (f) sk7Var.b;
                fVar.getClass();
                hst hstVar = jst.e;
                h1p h1pVar = fVar.d;
                unr0.C(new Object[]{h1pVar.getValue()}, 1, "SuperApp: %s update address", hstVar);
                rvf0 rvf0Var = fVar.b;
                boolean z = fVar.c;
                i0t i0tVar = (i0t) rvf0Var.a.get(h1pVar);
                if (z) {
                    i0tVar = new i0t(f0tVar);
                } else if (i0tVar == null) {
                    hstVar.j(new UnknownGeoPositionException("Missing provided geo position"));
                    i0tVar = new i0t(f0tVar);
                } else {
                    f0t f0tVar2 = i0tVar.a;
                    double d4 = f0tVar2.a;
                    double d5 = f0tVar2.b;
                    double d6 = f0tVar.b;
                    if (d4 != d3 || d5 != d6) {
                        hstVar.j(new UnknownGeoPositionException("Provided geo position differs from confirmed geo point"));
                        String.format("Provided was [%s, %s], and confirmed was [%s, %s]", Arrays.copyOf(new Object[]{Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d3), Double.valueOf(d6)}, 4));
                        i0tVar = new i0t(f0tVar);
                    }
                }
                if (geoPointSource == GeoPointSource.MODAL_REQUEST || geoPointSource == GeoPointSource.FROM_MODAL) {
                    fVar.e = f0tVar;
                }
                e eVar = fVar.a;
                eVar.k.put(h1pVar, i0tVar);
                eVar.j.put(h1pVar, i0tVar);
                eVar.b(h1pVar).g(i0tVar);
                ((hgn) sk7Var.c).a.put((h1p) sk7Var.w, i0tVar);
            }
        }
        return zy11.a;
    }
}
