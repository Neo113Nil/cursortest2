package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import java.util.HashMap;
import java.util.Locale;
import ru.yandex.taxi.share_favorites.presenter.a;
import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;

/* loaded from: classes6.dex */
public final class rjr0 implements n1c {
    public final /* synthetic */ ShareFavoritesModalView a;

    public rjr0(ShareFavoritesModalView shareFavoritesModalView) {
        this.a = shareFavoritesModalView;
    }

    @Override // defpackage.n1c
    public final void onPickedAddress(FavoriteAddress favoriteAddress) {
        String name;
        ShareFavoritesModalView shareFavoritesModalView = this.a;
        a presenter = shareFavoritesModalView.getPresenter();
        PlaceType placeType = favoriteAddress.getPlaceType();
        String lowerCase = (placeType == null || (name = placeType.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
        pkr0 pkr0Var = presenter.B;
        if (lowerCase == null) {
            lowerCase = "other";
        }
        o7r0 o7r0Var = pkr0Var.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("favoriteName", lowerCase);
        o7r0Var.a.a("ShareScreen.FavoriteTapped", hashMap, 1, new HashMap());
        shareFavoritesModalView.shareLinkAndCloseDialog(favoriteAddress.getPoint());
    }
}
