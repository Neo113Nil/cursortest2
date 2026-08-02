package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lvip;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface vip extends l050 {
    void addFavoriteAddress(g28 g28Var);

    void addSuggestedAddress(PlaceType placeType);

    void editFavoriteAddress(FavoriteAddress favoriteAddress);

    void pickFavoriteAddress(FavoriteAddress favoriteAddress);

    void render(rjp rjpVar);

    void showRideSettingsModal(String str, z9r0 z9r0Var);

    void showTooltipTitle();
}
