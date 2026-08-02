package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.models.FavoriteAddressDatumType;
import defpackage.cgp;
import defpackage.hgp;
import defpackage.sls;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = this.a;
        ((cgp) dVar.Dg()).setShimmerLoading(true);
        ((cgp) dVar.Dg()).renderInputs(hgp.g);
        dVar.Lg();
        dVar.M.f(FavoriteAddressDatumType.GEO_POINT);
        dVar.M.e();
        tje.N(dVar.Jg(), null, null, new FavoriteEditPresenter$saveAsGeoPoint$1(dVar, null), 3);
        return zy11.a;
    }
}
