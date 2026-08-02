package com.mikepenz.markdown.compose;

import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.viewmodels.PhoneRowModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.local.viewmodels.sheet.MenuPickerSheetModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderState;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.map.BrandSheetViewKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import coil3.RealImageLoader;
import coil3.svg.internal.ParseSvg_androidKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.State;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.account.components.AccountSettingsKt;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.AccountFooterViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsViewModel;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.compact.CompactActivityScopesKt;
import com.squareup.cash.activity.views.compact.CompactCellActivityKt;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryScope;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class MarkdownKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ MarkdownKt$$ExternalSyntheticLambda2(String str, PaymentHistoryData.AmountTreatment amountTreatment, TextStyle textStyle, int i, int i2) {
        this.$r8$classId = 29;
        this.f$0 = str;
        this.f$1 = amountTreatment;
        this.f$2 = textStyle;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                InterruptibleKt.MarkdownSuccess((State.Success) obj5, (DefaultMarkdownComponents) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                CartBannerViewKt.LocalBrandLocationOpenTabView((Modifier) obj3, (LocalBrandLocationOpenTabViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                LocalAddBrandsViewKt.CardManagementSheet((PaddingValues) obj5, (CardManagementSheetModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                LocalAddBrandsViewKt.LocalAddBrandsView((Modifier) obj3, (LocalAddBrandsViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                LocalAddBrandsViewKt.LocalEditorialView((Modifier) obj3, (LocalEditorialViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                FulfillmentRadioCellKt.SchedulingDayTimePickerView((Modifier) obj3, (SchedulingDayTimePickerViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((TableQrCodeCameraViewFinderManager) obj5).HandleState((TableQrCodeCameraViewFinderState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalBrandBanner((Modifier) obj3, (LocalBrandBannerModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalPhoneRow((Modifier) obj3, (PhoneRowModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                LocalDropdownItemKt.LocalDropdownItem((ColumnScope) obj5, (LocalDropdownItemModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BrandSheetViewKt.BrandSheetView((Modifier) obj3, (BrandCollectionModel.Location) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                MarketingMessageKt.ProfileHeader((Modifier) obj3, (MarketingMessagesViewModel.MessageTile) obj5, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.LocalShortlinkSheet((EducationalSheetModelList) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.LoyaltySheet((Modifier) obj3, (LoyaltySheetModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.MenuPickerSheet((Modifier) obj3, (MenuPickerSheetModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.LocalBrandCollectionLocation((PaddingValuesImpl) obj5, (BrandCollectionModel.Location) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ChannelsKt__ChannelsKt.MarkdownBlockQuote((String) obj5, (ASTNodeImpl) obj4, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                FlowKt__CollectionKt.MarkdownCode((String) obj5, (String) obj4, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AddressTypeaheadKt.Expanded((AddressModel.Expanded) obj5, (AddressTypeaheadState) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                AccountToDoKt.AccountFooter((Modifier) obj3, (AccountFooterViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AccountSettingsKt.AccountSettings((Modifier) obj3, (AccountSettingsViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AccountSettingsKt.AccountSectionRow((AccountSettingsRow) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ParseSvg_androidKt.BusinessInfoConfirmationSheet((Modifier) obj3, (BusinessInfoViewModel.ConfirmationSheetViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                LocaleOverlayHelper.BusinessAccountInfo((Modifier) obj3, (BusinessInfoViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                AvatarsKt.LoadingError((ActivityEmbeddedViewModel.LoadingError) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ActivityItemViewKt.PortraitImageFallbackButton((ItemAccessory.PortraitImage) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                AvatarsKt.BalanceFeed((RealImageLoader) obj5, (BalanceFeedViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                CompactActivityScopesKt.CompactBadgeAvatar((AvatarBadgeViewModel) obj5, (String) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                CompactCellActivityKt.PortraitImageAccessory((RealCompactActivityAccessoryScope) obj5, (ItemAccessory.PortraitImage) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ReceiptUiKt.AmountText((String) obj5, (PaymentHistoryData.AmountTreatment) obj4, (TextStyle) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkdownKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ MarkdownKt$$ExternalSyntheticLambda2(int i, int i2, Modifier modifier, Object obj, Function function) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = function;
        this.f$3 = i;
    }
}
