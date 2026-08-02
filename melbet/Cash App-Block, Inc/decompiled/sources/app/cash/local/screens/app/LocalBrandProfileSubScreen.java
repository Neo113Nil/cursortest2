package app.cash.local.screens.app;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;

/* loaded from: classes.dex */
public interface LocalBrandProfileSubScreen extends LocalScreen, HasAttributionKeyScreenScreen {
    BrandSpot getBrandSpot();

    BrandSpotSyncTokens getSyncTokens();

    boolean isProfileSheetInline();
}
