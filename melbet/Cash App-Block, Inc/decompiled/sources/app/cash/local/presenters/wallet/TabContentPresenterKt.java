package app.cash.local.presenters.wallet;

import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.primitives.BrandCollectionData;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;

/* loaded from: classes3.dex */
public abstract class TabContentPresenterKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GetNeighborhoodsTabContentResponse.AppletType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Origin.Companion companion = GetNeighborhoodsTabContentResponse.AppletType.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Origin.Companion companion2 = GetNeighborhoodsTabContentResponse.AppletType.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Origin.Companion companion3 = GetNeighborhoodsTabContentResponse.AppletType.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Origin.Companion companion4 = GetNeighborhoodsTabContentResponse.AppletType.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Origin.Companion companion5 = GetNeighborhoodsTabContentResponse.AppletType.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[LocalFulfillmentType.values().length];
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final BrandCollectionModel.Location toModel(BrandCollectionData.Location location, AndroidClock androidClock, AndroidStringManager androidStringManager, BrandFollowViewModel brandFollowViewModel) {
        location.getClass();
        String str = location.category;
        return new BrandCollectionModel.Location(location.brandSpot, location.name, location.backgroundColor, location.foregroundColor, location.artworkUrl, LocationsKt.currentlyOpen(androidClock, location.openState) ? new LocationStatus.Open(androidStringManager.get(R.string.local_presenters_status_open), str, 4) : new LocationStatus.Closed(androidStringManager.get(R.string.local_presenters_status_closed), str), location.address, location.clientRoute, brandFollowViewModel, location.heroImage, location.promoTag, location.promoDescription, null);
    }
}
