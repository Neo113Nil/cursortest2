package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import ru.yandex.taxi.favorites.edit.arguments.NewFavorite;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes5.dex */
public final class wkn {
    public static NewFavorite a(Address address, PlaceType placeType) {
        return new NewFavorite(z81.h(address, placeType), address.getGeoPointAcquisitionType() == GeoPointAcquisitionType.USER_LOCATION);
    }
}
