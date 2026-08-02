package app.cash.local.primitives;

import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.primitives.Location;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BrandCollectionDataKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfileCashtag.deepLinkSpecs;
    }

    public static final BrandCollectionData toBrandCollectionData(BrandCollection brandCollection) {
        brandCollection.getClass();
        List list = brandCollection.locations;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrandCollectionData.Location brandCollectionLocationData = toBrandCollectionLocationData((BrandCollection.Location) it.next());
            if (brandCollectionLocationData != null) {
                arrayList.add(brandCollectionLocationData);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new BrandCollectionData(brandCollection.title, brandCollection.subtitle, brandCollection.caption, arrayList, brandCollection.masthead_image, brandCollection.primary_cta_button_label, brandCollection.primary_cta_client_route);
    }

    public static final BrandCollectionData.Location toBrandCollectionLocationData(BrandCollection.Location location) {
        BrandSpot brandSpot;
        String str;
        LocalColor localColor;
        LocalColor localColor2;
        String str2;
        Double d;
        location.getClass();
        LocalAddress localAddress = location.address;
        String str3 = location.brand_token;
        if (str3 != null) {
            String str4 = location.location_token;
            if (str4 == null) {
                str4 = null;
            }
            brandSpot = new BrandSpot(str3, str4);
        } else {
            brandSpot = null;
        }
        if (brandSpot != null && (str = location.name) != null && (localColor = location.background_color) != null && (localColor2 = location.foreground_color) != null && (str2 = location.client_route) != null && localAddress != null && (d = localAddress.latitude) != null) {
            double doubleValue = d.doubleValue();
            Double d2 = localAddress.longitude;
            if (d2 != null) {
                double doubleValue2 = d2.doubleValue();
                String str5 = location.artwork_image_url;
                Location.OpenState openStateModel = LocationKt.openStateModel(location.open_status, location.open_hours);
                String str6 = location.category;
                String str7 = localAddress.address_single_line;
                if (str7 == null) {
                    str7 = localAddress.locality;
                }
                return new BrandCollectionData.Location(brandSpot, str, localColor, localColor2, str5, openStateModel, str6, str7, str2, location.banner, new GpsCoordinates(doubleValue, doubleValue2), location.hero_image, location.promo_tag, location.promo_description);
            }
        }
        return null;
    }
}
