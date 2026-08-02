package app.cash.local.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.sharedui.LocalComposeUiKt;
import app.cash.local.viewmodels.CurbsidePickupCarViewModel;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashAllActivityViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.local.viewmodels.sheet.LocalShortlinkViewModel;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.local.viewmodels.sheet.MenuPickerSheetModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.brand.checkout.CurbsidePickupCarSheetKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import app.cash.local.views.brand.profile.LocalBrandProfileViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda13;
import app.cash.local.views.cart.LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.composeuiview.LocalEditorialViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoClusterItem;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.LocalMapPinKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.$r8$classId;
        int i3 = 5;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i4 = 6;
        final int i5 = 1;
        int i6 = 3;
        switch (i2) {
            case 0:
                LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                localBrandProfileViewModel.getClass();
                function1.getClass();
                LocalComposeUiKt.LocalComposeUi(localBrandProfileViewModel, false, false, LocalViewsKt.isWorkingAsync(localBrandProfileViewModel), Expect_jvmKt.rememberComposableLambda(2024605332, new LocalBrandProfileViewKt$$ExternalSyntheticLambda1(localBrandProfileViewModel, function1, i5), composer), composer, (intValue & 14) | 25008, 0);
                return Unit.INSTANCE;
            case 1:
                LocalCashAllActivityViewModel localCashAllActivityViewModel = (LocalCashAllActivityViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                localCashAllActivityViewModel.getClass();
                function12.getClass();
                int i7 = intValue2 << 3;
                LocalAddBrandsViewKt.LocalCashAllActivityView(localCashAllActivityViewModel, function12, (Composer) obj3, (i7 & 896) | (i7 & 112) | 6);
                return Unit.INSTANCE;
            case 2:
                LocalEditorialViewModel localEditorialViewModel = (LocalEditorialViewModel) obj;
                Function1 function13 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                localEditorialViewModel.getClass();
                function13.getClass();
                LocalComposeUiKt.LocalComposeUi(localEditorialViewModel, false, false, LocalViewsKt.isWorkingAsync(localEditorialViewModel), Expect_jvmKt.rememberComposableLambda(1165241158, new LocalEditorialViewKt$$ExternalSyntheticLambda1(localEditorialViewModel, function13, i5), composer2), composer2, (intValue3 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 3:
                LocalAddBrandsViewModel localAddBrandsViewModel = (LocalAddBrandsViewModel) obj;
                Function1 function14 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                localAddBrandsViewModel.getClass();
                function14.getClass();
                LocalComposeUiKt.LocalComposeUi(localAddBrandsViewModel, false, false, LocalViewsKt.isWorkingAsync(localAddBrandsViewModel), Expect_jvmKt.rememberComposableLambda(411100587, new PagerDefaults$$ExternalSyntheticLambda0(i6, localAddBrandsViewModel, function14), composer3), composer3, (intValue4 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 4:
                SchedulingDayTimePickerViewModel schedulingDayTimePickerViewModel = (SchedulingDayTimePickerViewModel) obj;
                Function1 function15 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                schedulingDayTimePickerViewModel.getClass();
                function15.getClass();
                LocalComposeUiKt.LocalComposeUi(schedulingDayTimePickerViewModel, false, false, LocalViewsKt.isWorkingAsync(schedulingDayTimePickerViewModel), Expect_jvmKt.rememberComposableLambda(-1461817289, new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda41(schedulingDayTimePickerViewModel, function15), composer4), composer4, (intValue5 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Integer) obj4).getClass();
                throw null;
            case 6:
                MarketingMessageViewModel marketingMessageViewModel = (MarketingMessageViewModel) obj;
                Function1 function16 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                marketingMessageViewModel.getClass();
                function16.getClass();
                LocalComposeUiKt.LocalComposeUi(marketingMessageViewModel, true, true, LocalViewsKt.isWorkingAsync(marketingMessageViewModel), Expect_jvmKt.rememberComposableLambda(-54451345, new PagerDefaults$$ExternalSyntheticLambda0(10, marketingMessageViewModel, function16), composer5), composer5, (intValue6 & 14) | 25008, 0);
                return Unit.INSTANCE;
            case 7:
                MarketingMessagesViewModel marketingMessagesViewModel = (MarketingMessagesViewModel) obj;
                Function1 function17 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                marketingMessagesViewModel.getClass();
                function17.getClass();
                LocalComposeUiKt.LocalComposeUi(marketingMessagesViewModel, true, false, LocalViewsKt.isWorkingAsync(marketingMessagesViewModel), Expect_jvmKt.rememberComposableLambda(-109078773, new PagerDefaults$$ExternalSyntheticLambda0(i3, marketingMessagesViewModel, function17), composer6), composer6, (intValue7 & 14) | 25008, 0);
                return Unit.INSTANCE;
            case 8:
                MenuPickerSheetModel menuPickerSheetModel = (MenuPickerSheetModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                menuPickerSheetModel.getClass();
                function18.getClass();
                LoyaltySheetKt.MenuPickerSheet(null, menuPickerSheetModel, function18, (Composer) obj3, (intValue8 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 9:
                CurbsidePickupCarViewModel curbsidePickupCarViewModel = (CurbsidePickupCarViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue9 = ((Integer) obj4).intValue();
                curbsidePickupCarViewModel.getClass();
                function19.getClass();
                CurbsidePickupCarSheetKt.CurbsidePickupCarSheet(null, curbsidePickupCarViewModel, function19, (Composer) obj3, (intValue9 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 10:
                LocalBrandLocationCartViewModel localBrandLocationCartViewModel = (LocalBrandLocationCartViewModel) obj;
                Function1 function110 = (Function1) obj2;
                Composer composer7 = (Composer) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                localBrandLocationCartViewModel.getClass();
                function110.getClass();
                LocalComposeUiKt.LocalComposeUi(localBrandLocationCartViewModel, false, false, LocalViewsKt.isWorkingAsync(localBrandLocationCartViewModel), Expect_jvmKt.rememberComposableLambda(-698775972, new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda13(localBrandLocationCartViewModel, function110, i5), composer7), composer7, (intValue10 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 11:
                TableQrCodeScannerViewModel tableQrCodeScannerViewModel = (TableQrCodeScannerViewModel) obj;
                Function1 function111 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                tableQrCodeScannerViewModel.getClass();
                function111.getClass();
                LocalComposeUiKt.LocalComposeUi(tableQrCodeScannerViewModel, true, true, false, Expect_jvmKt.rememberComposableLambda(737844073, new PagerDefaults$$ExternalSyntheticLambda0(11, tableQrCodeScannerViewModel, function111), composer8), composer8, (intValue11 & 14) | 25008, 8);
                return Unit.INSTANCE;
            case 12:
                LocalBrandLocationOpenTabViewModel localBrandLocationOpenTabViewModel = (LocalBrandLocationOpenTabViewModel) obj;
                Function1 function112 = (Function1) obj2;
                Composer composer9 = (Composer) obj3;
                int intValue12 = ((Integer) obj4).intValue();
                localBrandLocationOpenTabViewModel.getClass();
                function112.getClass();
                LocalComposeUiKt.LocalComposeUi(localBrandLocationOpenTabViewModel, false, false, LocalViewsKt.isWorkingAsync(localBrandLocationOpenTabViewModel), Expect_jvmKt.rememberComposableLambda(-2022678182, new LocalBrandLocationOpenTabViewKt$$ExternalSyntheticLambda2(localBrandLocationOpenTabViewModel, function112), composer9), composer9, (intValue12 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 13:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj;
                Function1 function113 = (Function1) obj2;
                Composer composer10 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                localBrandLocationCheckoutViewModel.getClass();
                function113.getClass();
                LocalComposeUiKt.LocalComposeUi(localBrandLocationCheckoutViewModel, false, false, LocalViewsKt.isWorkingAsync(localBrandLocationCheckoutViewModel), Expect_jvmKt.rememberComposableLambda(1465111940, new PagerDefaults$$ExternalSyntheticLambda0(8, localBrandLocationCheckoutViewModel, function113), composer10), composer10, (intValue13 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 14:
                LocalOpenTabCheckoutViewModel localOpenTabCheckoutViewModel = (LocalOpenTabCheckoutViewModel) obj;
                Function1 function114 = (Function1) obj2;
                Composer composer11 = (Composer) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                localOpenTabCheckoutViewModel.getClass();
                function114.getClass();
                LocalComposeUiKt.LocalComposeUi(localOpenTabCheckoutViewModel, false, false, localOpenTabCheckoutViewModel.isPlaceOrderLoading, Expect_jvmKt.rememberComposableLambda(-1767471212, new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda28(localOpenTabCheckoutViewModel, function114, objArr == true ? 1 : 0), composer11), composer11, (intValue14 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 15:
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj;
                Function1 function115 = (Function1) obj2;
                Composer composer12 = (Composer) obj3;
                int intValue15 = ((Integer) obj4).intValue();
                localBrandLocationMenuViewModel.getClass();
                function115.getClass();
                LocalComposeUiKt.LocalComposeUi(localBrandLocationMenuViewModel, false, false, false, Expect_jvmKt.rememberComposableLambda(-1881950561, new PagerDefaults$$ExternalSyntheticLambda0(9, localBrandLocationMenuViewModel, function115), composer12), composer12, (intValue15 & 14) | 27648, 6);
                return Unit.INSTANCE;
            case 16:
                LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = (LocalMenuItemDetailsViewModel) obj;
                Function1 function116 = (Function1) obj2;
                Composer composer13 = (Composer) obj3;
                int intValue16 = ((Integer) obj4).intValue();
                localMenuItemDetailsViewModel.getClass();
                function116.getClass();
                LocalComposeUiKt.LocalComposeUi(localMenuItemDetailsViewModel, false, false, false, Expect_jvmKt.rememberComposableLambda(-2028355435, new PagerDefaults$$ExternalSyntheticLambda0(7, localMenuItemDetailsViewModel, function116), composer13), composer13, (intValue16 & 14) | 27648, 6);
                return Unit.INSTANCE;
            case 17:
                LocalMenuComboDetailsViewModel localMenuComboDetailsViewModel = (LocalMenuComboDetailsViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                localMenuComboDetailsViewModel.getClass();
                function117.getClass();
                int i8 = intValue17 << 3;
                LocalCaloriesTextKt.LocalMenuComboDetailsView(localMenuComboDetailsViewModel, function117, (Composer) obj3, (i8 & 896) | (i8 & 112) | 6);
                return Unit.INSTANCE;
            case 18:
                LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel = (LocalPosBrandOnboardingViewModel) obj;
                Function1 function118 = (Function1) obj2;
                Composer composer14 = (Composer) obj3;
                int intValue18 = ((Integer) obj4).intValue();
                localPosBrandOnboardingViewModel.getClass();
                function118.getClass();
                LocalComposeUiKt.LocalComposeUi(localPosBrandOnboardingViewModel, true, true, false, Expect_jvmKt.rememberComposableLambda(-320280001, new PagerDefaults$$ExternalSyntheticLambda0(i4, localPosBrandOnboardingViewModel, function118), composer14), composer14, (intValue18 & 14) | 25008, 8);
                return Unit.INSTANCE;
            case 19:
                LocalPosCheckInViewModel localPosCheckInViewModel = (LocalPosCheckInViewModel) obj;
                Function1 function119 = (Function1) obj2;
                Composer composer15 = (Composer) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                localPosCheckInViewModel.getClass();
                function119.getClass();
                LocalComposeUiKt.LocalComposeUi(localPosCheckInViewModel, true, true, false, Expect_jvmKt.rememberComposableLambda(-1889541932, new PagerDefaults$$ExternalSyntheticLambda0(r2, localPosCheckInViewModel, function119), composer15), composer15, (intValue19 & 14) | 25008, 8);
                return Unit.INSTANCE;
            case 20:
                LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel = (LocalPosLocalCashRedemptionViewModel) obj;
                Function1 function120 = (Function1) obj2;
                Composer composer16 = (Composer) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                localPosLocalCashRedemptionViewModel.getClass();
                function120.getClass();
                LocalComposeUiKt.LocalComposeUi(localPosLocalCashRedemptionViewModel, true, true, false, Expect_jvmKt.rememberComposableLambda(980065113, new PagerDefaults$$ExternalSyntheticLambda0(12, localPosLocalCashRedemptionViewModel, function120), composer16), composer16, (intValue20 & 14) | 25008, 8);
                return Unit.INSTANCE;
            case 21:
                final LocalOrderStatusViewModel localOrderStatusViewModel = (LocalOrderStatusViewModel) obj;
                final Function1 function121 = (Function1) obj2;
                Composer composer17 = (Composer) obj3;
                int intValue21 = ((Integer) obj4).intValue();
                localOrderStatusViewModel.getClass();
                function121.getClass();
                LocalComposeUiKt.LocalComposeUi(localOrderStatusViewModel, false, false, LocalViewsKt.isWorkingAsync(localOrderStatusViewModel), Expect_jvmKt.rememberComposableLambda(-2062006823, new Function3() { // from class: app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i9 = i5;
                        Function1 function122 = function121;
                        LocalOrderStatusViewModel localOrderStatusViewModel2 = localOrderStatusViewModel;
                        Modifier modifier = (Modifier) obj5;
                        Composer composer18 = (Composer) obj6;
                        int intValue22 = ((Integer) obj7).intValue();
                        switch (i9) {
                            case 0:
                                modifier.getClass();
                                if ((intValue22 & 6) == 0) {
                                    intValue22 |= ((GapComposer) composer18).changed(modifier) ? 4 : 2;
                                }
                                GapComposer gapComposer = (GapComposer) composer18;
                                if (gapComposer.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                    LocalOrderStatusViewKt.LocalOrderStatusView(modifier, localOrderStatusViewModel2, function122, gapComposer, intValue22 & 14);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                modifier.getClass();
                                if ((intValue22 & 6) == 0) {
                                    intValue22 |= ((GapComposer) composer18).changed(modifier) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer18;
                                if (gapComposer2.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                                    LocalOrderStatusViewKt.LocalOrderStatusView(modifier, localOrderStatusViewModel2, function122, gapComposer2, intValue22 & 14);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer17), composer17, (intValue21 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 22:
                final LocalOrderStatusViewModel localOrderStatusViewModel2 = (LocalOrderStatusViewModel) obj;
                final Function1 function122 = (Function1) obj2;
                Composer composer18 = (Composer) obj3;
                int intValue22 = ((Integer) obj4).intValue();
                localOrderStatusViewModel2.getClass();
                function122.getClass();
                boolean isWorkingAsync = LocalViewsKt.isWorkingAsync(localOrderStatusViewModel2);
                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                LocalComposeUiKt.LocalComposeUi(localOrderStatusViewModel2, false, false, isWorkingAsync, Expect_jvmKt.rememberComposableLambda(784953626, new Function3() { // from class: app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i9 = objArr3;
                        Function1 function1222 = function122;
                        LocalOrderStatusViewModel localOrderStatusViewModel22 = localOrderStatusViewModel2;
                        Modifier modifier = (Modifier) obj5;
                        Composer composer182 = (Composer) obj6;
                        int intValue222 = ((Integer) obj7).intValue();
                        switch (i9) {
                            case 0:
                                modifier.getClass();
                                if ((intValue222 & 6) == 0) {
                                    intValue222 |= ((GapComposer) composer182).changed(modifier) ? 4 : 2;
                                }
                                GapComposer gapComposer = (GapComposer) composer182;
                                if (gapComposer.shouldExecute(intValue222 & 1, (intValue222 & 19) != 18)) {
                                    LocalOrderStatusViewKt.LocalOrderStatusView(modifier, localOrderStatusViewModel22, function1222, gapComposer, intValue222 & 14);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                modifier.getClass();
                                if ((intValue222 & 6) == 0) {
                                    intValue222 |= ((GapComposer) composer182).changed(modifier) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer182;
                                if (gapComposer2.shouldExecute(intValue222 & 1, (intValue222 & 19) != 18)) {
                                    LocalOrderStatusViewKt.LocalOrderStatusView(modifier, localOrderStatusViewModel22, function1222, gapComposer2, intValue222 & 14);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer18), composer18, (intValue22 & 14) | 24576, 6);
                return Unit.INSTANCE;
            case 23:
                LocalShortlinkViewModel localShortlinkViewModel = (LocalShortlinkViewModel) obj;
                Function1 function123 = (Function1) obj2;
                int intValue23 = ((Integer) obj4).intValue();
                localShortlinkViewModel.getClass();
                function123.getClass();
                LoyaltySheetKt.LocalShortlinkSheet(localShortlinkViewModel.educationalSheetModelList, function123, null, (Composer) obj3, intValue23 & 112);
                return Unit.INSTANCE;
            case 24:
                LocalShortlinkViewModel localShortlinkViewModel2 = (LocalShortlinkViewModel) obj;
                Function1 function124 = (Function1) obj2;
                int intValue24 = ((Integer) obj4).intValue();
                localShortlinkViewModel2.getClass();
                function124.getClass();
                LoyaltySheetKt.LocalShortlinkSheet(localShortlinkViewModel2.educationalSheetModelList, function124, null, (Composer) obj3, intValue24 & 112);
                return Unit.INSTANCE;
            case 25:
                LoyaltySheetModel loyaltySheetModel = (LoyaltySheetModel) obj;
                Function1 function125 = (Function1) obj2;
                int intValue25 = ((Integer) obj4).intValue();
                loyaltySheetModel.getClass();
                function125.getClass();
                LoyaltySheetKt.LoyaltySheet(null, loyaltySheetModel, function125, (Composer) obj3, (intValue25 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                return Unit.INSTANCE;
            case 26:
                LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) obj;
                Function1 function126 = (Function1) obj2;
                int intValue26 = ((Integer) obj4).intValue();
                localCashBalanceViewModel.getClass();
                function126.getClass();
                int i9 = intValue26 << 3;
                LocalAddBrandsViewKt.LocalCashBalanceComposeUi(localCashBalanceViewModel, function126, (Composer) obj3, (i9 & 896) | (i9 & 112) | 6);
                return Unit.INSTANCE;
            case 27:
                BoxScope boxScope = (BoxScope) obj;
                Function0 function0 = (Function0) obj2;
                Composer composer19 = (Composer) obj3;
                int intValue27 = ((Integer) obj4).intValue();
                boxScope.getClass();
                function0.getClass();
                if ((intValue27 & 6) == 0) {
                    i = (((GapComposer) composer19).changed(boxScope) ? 4 : 2) | intValue27;
                } else {
                    i = intValue27;
                }
                if ((intValue27 & 48) == 0) {
                    i |= ((GapComposer) composer19).changedInstance(function0) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer19;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    Modifier align = boxScope.align(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 32.0f), RoundedCornerShapeKt.CircleShape), Alignment.Companion.CenterEnd);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(align, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, null, function0, 28);
                    Painter painter = Icons.NavigationMore.painter(gapComposer);
                    String stringResource = Room.stringResource(gapComposer, R.string.local_views_more_options);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.icon.prominent;
                    ImageKt.Image(painter, stringResource, m182clickableO2vRcR0$default, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24576, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Function0 function02 = (Function0) obj2;
                Composer composer20 = (Composer) obj3;
                int intValue28 = ((Integer) obj4).intValue();
                ((BoxScope) obj).getClass();
                function02.getClass();
                if ((intValue28 & 48) == 0) {
                    intValue28 |= ((GapComposer) composer20).changedInstance(function02) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer20;
                if (gapComposer2.shouldExecute(intValue28 & 1, (intValue28 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    Trace.m1191Iconww6aTOc(Icons.NavigationMore, (String) null, ImageKt.m183clickableoSLSa3U$default(SizeKt.m285size3ABfNKs(companion, 24.0f), false, null, null, function02, 15), 0L, gapComposer2, 54, 8);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LocalHomeGeoClusterItem localHomeGeoClusterItem = (LocalHomeGeoClusterItem) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Composer composer21 = (Composer) obj3;
                int intValue29 = ((Integer) obj4).intValue();
                localHomeGeoClusterItem.getClass();
                LocalHomeGeoViewModel.Location location = localHomeGeoClusterItem.viewModel;
                String str = location.title;
                BrandCollectionModel.Location location2 = location.sheetModel;
                String str2 = location2.artwork;
                LocalColor localColor = location.markerColor;
                if (localColor == null) {
                    localColor = location2.backgroundColor;
                }
                LocalMapPinKt.LocalBrandLocationMarker(str, booleanValue, str2, localColor, null, composer21, intValue29 & 112, 16);
                return Unit.INSTANCE;
        }
    }
}
