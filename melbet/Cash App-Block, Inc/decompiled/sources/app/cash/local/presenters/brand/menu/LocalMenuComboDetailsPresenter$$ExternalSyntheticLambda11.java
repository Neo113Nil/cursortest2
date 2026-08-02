package app.cash.local.presenters.brand.menu;

import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import com.plaid.internal.EnumC0170g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMenuComboDetailsPresenter$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ LocalMenuComboDetailsPresenter f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ ComboSlot f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ LocalMenuItemDetailsScreen.Mode f$5;

    public /* synthetic */ LocalMenuComboDetailsPresenter$$ExternalSyntheticLambda11(LocalMenuComboDetailsPresenter localMenuComboDetailsPresenter, String str, String str2, ComboSlot comboSlot, int i, LocalMenuItemDetailsScreen.Mode mode) {
        this.f$0 = localMenuComboDetailsPresenter;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = comboSlot;
        this.f$4 = i;
        this.f$5 = mode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AskedQuestion askedQuestion = (AskedQuestion) obj;
        askedQuestion.getClass();
        LocalMenuComboDetailsScreen localMenuComboDetailsScreen = this.f$0.screen;
        BrandSpot brandSpot = localMenuComboDetailsScreen.brandSpot;
        boolean z = localMenuComboDetailsScreen.isProfileSheetInline;
        ComboSlot comboSlot = this.f$3;
        LocalMenuItemDetailsScreen.ComboData comboData = new LocalMenuItemDetailsScreen.ComboData(this.f$2, comboSlot.priceAdjustments);
        BrandSpot brandSpot2 = localMenuComboDetailsScreen.brandSpot;
        return new LocalMenuItemDetailsScreen(brandSpot, this.f$1, z, comboData, null, new LocalClientCartMenuItemAddedContext(brandSpot2.brandToken, brandSpot2.locationToken, new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboSlotItemContextData(localMenuComboDetailsScreen.itemToken, comboSlot.token, this.f$4), null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE), this.f$5, askedQuestion, localMenuComboDetailsScreen.syncTokens, 16);
    }
}
