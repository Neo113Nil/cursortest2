package app.cash.local.navigation.api;

import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalBrandProfileSubScreen;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalScreen;
import app.cash.local.screens.app.LocalTabScreen;
import com.plaid.internal.EnumC0170g;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class RealCashLocalNavigatorHelper {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCashLocalNavigatorHelper();
        }
    }

    public static boolean isLocalScreen(Screen screen) {
        screen.getClass();
        return screen instanceof LocalScreen;
    }

    public static boolean popLastScreen(Screen screen, Screen screen2) {
        screen.getClass();
        if (screen instanceof LocalBrandProfileScreen) {
            return (screen2 instanceof LocalBrandLocationMenuScreen) || (screen2 instanceof LocalOrderStatusScreen);
        }
        return false;
    }

    public static Screen screenToPush(Screen screen, ArrayList arrayList, boolean z) {
        screen.getClass();
        if (screen instanceof LocalTabScreen) {
            return null;
        }
        if (screen instanceof LocalBrandProfileSubScreen) {
            LocalBrandProfileSubScreen localBrandProfileSubScreen = (LocalBrandProfileSubScreen) screen;
            if (!localBrandProfileSubScreen.isProfileSheetInline()) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Screen) it.next()) instanceof LocalBrandProfileScreen) {
                        }
                    }
                }
                return new LocalBrandProfileScreen(localBrandProfileSubScreen.getBrandSpot(), localBrandProfileSubScreen.getAttributionKey(), (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandProfileSubScreen.getSyncTokens(), (String) null, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            }
        }
        if (z && ((screen instanceof LocalBrandProfileScreen) || (screen instanceof LocalEditorialScreen))) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Screen) it2.next()) instanceof LocalTabScreen) {
                    }
                }
            }
            return LocalTabScreen.INSTANCE;
        }
        return null;
    }
}
