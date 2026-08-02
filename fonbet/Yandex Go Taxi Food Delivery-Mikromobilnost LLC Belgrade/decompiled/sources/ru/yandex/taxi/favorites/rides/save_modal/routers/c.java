package ru.yandex.taxi.favorites.rides.save_modal.routers;

import android.content.Context;
import defpackage.aip;
import defpackage.mdh;
import defpackage.mu5;
import defpackage.ohk0;
import defpackage.pgd;
import defpackage.rzl0;
import defpackage.s6k0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u500;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wip;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalCloseReason;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$SaveRideModalMode;

/* loaded from: classes5.dex */
public final class c extends pgd {
    public final tse F;
    public final tt2 G;
    public final Context H;
    public final u500 I;
    public final wip J;
    public final w030 K;
    public final ru.yandex.taxi.favorites.rides.save_modal.domain.b L;
    public final mu5 M;

    public c(tse tseVar, tt2 tt2Var, Context context, u500 u500Var, wip wipVar, w030 w030Var, ru.yandex.taxi.favorites.rides.save_modal.domain.b bVar) {
        super(0);
        this.F = tseVar;
        this.G = tt2Var;
        this.H = context;
        this.I = u500Var;
        this.J = wipVar;
        this.K = w030Var;
        this.L = bVar;
        this.M = new mu5(new ohk0(23, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        s6k0 g;
        rzl0 rzl0Var = (rzl0) obj;
        ru.yandex.taxi.favorites.rides.save_modal.domain.b bVar = this.L;
        bVar.b.d.l(null);
        s6k0 s6k0Var = bVar.e;
        FavoritesAnalytics$SaveRideModalCloseReason favoritesAnalytics$SaveRideModalCloseReason = (FavoritesAnalytics$SaveRideModalCloseReason) s6k0Var.c;
        if (favoritesAnalytics$SaveRideModalCloseReason == null || (g = s6k0Var.g(rzl0Var)) == null) {
            return;
        }
        aip aipVar = (aip) s6k0Var.b;
        String str = (String) g.a;
        FavoritesAnalytics$IdType favoritesAnalytics$IdType = (FavoritesAnalytics$IdType) g.b;
        FavoritesAnalytics$SaveRideModalMode favoritesAnalytics$SaveRideModalMode = (FavoritesAnalytics$SaveRideModalMode) g.c;
        aipVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("id_type", favoritesAnalytics$IdType.getEventValue());
        hashMap.put("mode", favoritesAnalytics$SaveRideModalMode.getEventValue());
        hashMap.put(CRLReasonCodeExtension.REASON, favoritesAnalytics$SaveRideModalCloseReason.getEventValue());
        aipVar.a.a("Favorites.SaveTripModal.Closed", hashMap, 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        rzl0 rzl0Var = (rzl0) obj;
        b bVar = new b(this);
        tse o = o();
        this.G.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(o, mdhVar, null, new SaveFavoriteRideRootRouterImpl$onLaunch$1(this, bVar, rzl0Var, null), 2);
        tje.N(o(), mdhVar, null, new SaveFavoriteRideRootRouterImpl$onLaunch$2(this, bVar, rzl0Var, null), 2);
        s6k0 s6k0Var = this.L.e;
        s6k0 g = s6k0Var.g(rzl0Var);
        if (g != null) {
            aip aipVar = (aip) s6k0Var.b;
            String str = (String) g.a;
            FavoritesAnalytics$IdType favoritesAnalytics$IdType = (FavoritesAnalytics$IdType) g.b;
            FavoritesAnalytics$SaveRideModalMode favoritesAnalytics$SaveRideModalMode = (FavoritesAnalytics$SaveRideModalMode) g.c;
            aipVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("id", str);
            hashMap.put("id_type", favoritesAnalytics$IdType.getEventValue());
            hashMap.put("mode", favoritesAnalytics$SaveRideModalMode.getEventValue());
            aipVar.a.a("Favorites.SaveTripModal.Shown", hashMap, 1, new HashMap());
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.H;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.K;
    }
}
