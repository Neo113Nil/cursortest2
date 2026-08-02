package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.Coordinates;
import com.squareup.protos.common.location.GlobalAddress;

/* loaded from: classes3.dex */
public abstract class GlobalAddressWrapperKt {
    public static final GlobalAddressWrapper toGlobalAddressWrapper(LocalAddress localAddress) {
        Country country;
        Double d;
        localAddress.getClass();
        String str = localAddress.address_line_1;
        String str2 = localAddress.address_line_2;
        String str3 = localAddress.locality;
        String str4 = localAddress.state;
        String str5 = localAddress.postal_code;
        String str6 = localAddress.iso_alpha2_country_code;
        if (str6 == null || (country = Country.valueOf(str6)) == null) {
            country = Country.US;
        }
        Country country2 = country;
        Double d2 = localAddress.latitude;
        Coordinates coordinates = null;
        if (d2 != null && (d = localAddress.longitude) != null) {
            coordinates = new Coordinates(d2, d);
        }
        GlobalAddress globalAddress = new GlobalAddress(str, str2, str3, str4, str5, country2, coordinates, null, 3669780);
        String str7 = localAddress.google_place_id;
        str7.getClass();
        return new GlobalAddressWrapper(globalAddress, str7);
    }
}
