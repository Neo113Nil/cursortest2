package app.cash.local.navigation.api;

import app.cash.broadway.navigation.Navigator;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalTabScreen;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;

/* loaded from: classes3.dex */
public final class RealCashLocalNavigator {
    public final Navigator navigator;

    public RealCashLocalNavigator(Navigator navigator, int i) {
        navigator.getClass();
        switch (i) {
            case 2:
                this.navigator = navigator;
                break;
            default:
                this.navigator = navigator;
                break;
        }
    }

    public void goToBrand(String str, String str2, String str3, String str4, String str5) {
        this.navigator.goTo(new LocalBrandProfileScreen(new BrandSpot(str, str2), new AttributionKey(str3), (MarketingMessageOfferDetails) null, (String) null, str4, (BrandSpotSyncTokens) null, str5, EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE));
    }

    public void goToLocal() {
        this.navigator.goTo(LocalTabScreen.INSTANCE);
    }

    public void showDeviceList() {
        this.navigator.goTo(new DeviceManagerListScreen());
    }

    public RealCashLocalNavigator(RealUuidGenerator realUuidGenerator, Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }
}
