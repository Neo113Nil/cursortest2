package ru.yandex.taxi.cashback.sdk;

import android.location.Location;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.home.api.location.GeoPoint;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.acz;
import defpackage.bvf0;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.ikd0;
import defpackage.ike;
import defpackage.jzs;
import defpackage.n20;
import defpackage.pwy0;
import defpackage.q2u0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.wzs;
import defpackage.xsr0;
import defpackage.zzs;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class t {
    public final com.yandex.go.navigation.screen.c a;
    public final n20 b;
    public final com.yandex.go.zone.repository.o c;
    public final e2t d;
    public final gci0 e;
    public final gci0 f;

    public t(tse tseVar, com.yandex.go.navigation.screen.c cVar, n20 n20Var, com.yandex.go.zone.repository.o oVar, e2t e2tVar, pwy0 pwy0Var, acz aczVar) {
        PlusTheme plusTheme;
        zzs zzsVar;
        this.a = cVar;
        this.b = n20Var;
        this.c = oVar;
        this.d = e2tVar;
        ike M = bvf0.M(tseVar, gtq0.i());
        s sVar = new s(pwy0Var.a(), this);
        xsr0.a.getClass();
        q2u0 q2u0Var = wsr0.b;
        int i = ikd0.a[pwy0Var.getThemeType().ordinal()];
        if (i == 1) {
            plusTheme = PlusTheme.LIGHT;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            plusTheme = PlusTheme.DARK;
        }
        this.e = kotlinx.coroutines.flow.e.R(sVar, M, q2u0Var, plusTheme);
        tpr t = kotlinx.coroutines.flow.e.t(new m0(aczVar.b, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m(cVar.c(), this)), new PlusSdkDataRepository$pinAddressFlow$$inlined$flatMapLatest$1(null, this)), new PlusSdkDataRepository$geoLocationStateFlow$1(null, this)));
        wzs wzsVar = GeoPoint.Companion;
        Location a = aczVar.a();
        wzsVar.getClass();
        GeoPoint geoPoint = a == null ? null : new GeoPoint(a.getLatitude(), a.getLongitude(), (int) a.getAccuracy());
        g2t a2 = ((f2t) e2tVar).a();
        GeoPoint geoPoint2 = (a2 == null || (zzsVar = a2.b.a) == null) ? null : new GeoPoint(zzsVar.a, zzsVar.b, zzsVar.c);
        Zone b = oVar.b();
        this.f = kotlinx.coroutines.flow.e.R(t, M, q2u0Var, new jzs(geoPoint, geoPoint2, b != null ? b.a : null));
    }

    public final m0 a() {
        return new m0(new o(this.c.c()), new q(((f2t) this.d).h), new PlusSdkDataRepository$preorderAddressFlow$3(3, null));
    }
}
