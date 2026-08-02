package ru.yandex.taxi.share_favorites.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ad5;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.ljr0;
import defpackage.o2x;
import defpackage.pkr0;
import defpackage.sjr0;
import defpackage.tje;
import defpackage.u2x;
import defpackage.ujr0;
import defpackage.vng;
import defpackage.w0h0;
import defpackage.w2x;
import defpackage.ykn0;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Locale;
import ru.yandex.taxi.analytics.Events$ShareScreen$Screen;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public final ykn0 A;
    public final pkr0 B;
    public final zuj0 C;
    public final ru.yandex.taxi.favorites.data.repo.a D;
    public final ljr0 x;
    public final zzs y;
    public final Events$ShareScreen$Screen z;

    public a(ljr0 ljr0Var, zzs zzsVar, Events$ShareScreen$Screen events$ShareScreen$Screen, ykn0 ykn0Var, pkr0 pkr0Var, zuj0 zuj0Var, ru.yandex.taxi.favorites.data.repo.a aVar) {
        super(sjr0.class);
        this.x = ljr0Var;
        this.y = zzsVar;
        this.z = events$ShareScreen$Screen;
        this.A = ykn0Var;
        this.B = pkr0Var;
        this.C = zuj0Var;
        this.D = aVar;
    }

    public static final w2x Kg(a aVar, FavoriteAddress favoriteAddress) {
        aVar.getClass();
        PlaceType placeType = favoriteAddress.getPlaceType();
        int i = placeType == null ? -1 : ujr0.a[placeType.ordinal()];
        if (i == 1 || i == 2) {
            return new u2x(favoriteAddress);
        }
        return new o2x(new UiStateDrawableWrapper(null, vng.t(w0h0.ic_favorite_address_fallback, ((avj0) aVar.C).a)), null, favoriteAddress, false, true, null);
    }

    public static String Lg(double d) {
        return evu0.n0(evu0.n0(String.format(Locale.US, "%.5f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), MoneyInputEditView.DEFAULT_VALUE), '.');
    }

    public final void Mg() {
        if (this.x.c) {
            tje.N(Jg(), null, null, new ShareFavoritesPresenter$loadAddresses$1(this, null), 3);
        }
    }
}
