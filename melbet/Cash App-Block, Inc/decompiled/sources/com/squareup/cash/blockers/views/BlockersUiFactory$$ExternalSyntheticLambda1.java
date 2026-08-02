package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.screen.Screen;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.common.zzj;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final /* synthetic */ class BlockersUiFactory$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BlockersUiFactory$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.$r8$classId;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                BlockersUiFactory blockersUiFactory = (BlockersUiFactory) obj6;
                BlockersScreens.AmountScreen amountScreen = (BlockersScreens.AmountScreen) obj5;
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                function1.getClass();
                if (amountPickerViewModel != null) {
                    AmountBlockerViewKt.AmountBlocker(amountPickerViewModel, function1, blockersUiFactory.vibrator, AmountBlockerViewKt.toAmountConfig(amountScreen.config), composer, (intValue & 112) | 4096);
                    break;
                } else {
                    break;
                }
            case 1:
                BlockersUiFactory blockersUiFactory2 = (BlockersUiFactory) obj6;
                BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs = (BlockersScreens.EarnerEnrollmentBlockerScreenArgs) obj5;
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel = (EarnerEnrollmentBlockerViewModel) obj;
                Function1 function12 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function12.getClass();
                if (earnerEnrollmentBlockerViewModel != null) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory2.imageLoader), Expect_jvmKt.rememberComposableLambda(593507148, new BirthdayView$$ExternalSyntheticLambda0(earnerEnrollmentBlockerViewModel, function12, earnerEnrollmentBlockerScreenArgs, 10), composer2), composer2, 56);
                    break;
                } else {
                    break;
                }
            case 2:
                BlockersUiFactory blockersUiFactory3 = (BlockersUiFactory) obj6;
                BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs earnerEnrollmentSuccessBlockerScreenArgs = (BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs) obj5;
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel2 = (EarnerEnrollmentBlockerViewModel) obj;
                Function1 function13 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function13.getClass();
                if (earnerEnrollmentBlockerViewModel2 != null) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory3.imageLoader), Expect_jvmKt.rememberComposableLambda(1878569677, new BirthdayView$$ExternalSyntheticLambda0(earnerEnrollmentBlockerViewModel2, function13, earnerEnrollmentSuccessBlockerScreenArgs, 11), composer3), composer3, 56);
                    break;
                } else {
                    break;
                }
            case 3:
                BlockersUiFactory blockersUiFactory4 = (BlockersUiFactory) obj6;
                BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs = (BlockersScreens.EarnerUpsellBlockerScreenArgs) obj5;
                EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = (EarnerUpsellBlockerViewModel) obj;
                Function1 function14 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                function14.getClass();
                if (earnerUpsellBlockerViewModel != null) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory4.imageLoader), Expect_jvmKt.rememberComposableLambda(914332613, new BirthdayView$$ExternalSyntheticLambda0(earnerUpsellBlockerViewModel, function14, earnerUpsellBlockerScreenArgs, 12), composer4), composer4, 56);
                    break;
                } else {
                    break;
                }
            case 4:
                PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) obj;
                Function1 function15 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                promotionDetailsViewModel.getClass();
                function15.getClass();
                RealImageLoader realImageLoader = (RealImageLoader) ((PaymentsViewFactory) obj6).imageLoader;
                int i3 = intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                int i4 = CashTreehouseLayout.$r8$clinit;
                zzj.PromotionDetailsUi(promotionDetailsViewModel, function15, realImageLoader, (CashTreehouseLayout) obj5, (Composer) obj3, i3 | 4096);
                break;
            case 5:
                TransferOptionPickerViewModel transferOptionPickerViewModel = (TransferOptionPickerViewModel) obj;
                Function1 function16 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                transferOptionPickerViewModel.getClass();
                function16.getClass();
                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(((ScoreUiFactory) obj6).imageLoader), Expect_jvmKt.rememberComposableLambda(126289350, new QuickAccessBarKt$$ExternalSyntheticLambda1(7, (Screen) obj5, transferOptionPickerViewModel, function16), composer5), composer5, 56);
                break;
            case 6:
                BorrowUiFactory borrowUiFactory = (BorrowUiFactory) obj6;
                InvestingScreens.CustomOrderScreen customOrderScreen = (InvestingScreens.CustomOrderScreen) obj5;
                InvestingCustomOrderContentModel investingCustomOrderContentModel = (InvestingCustomOrderContentModel) obj;
                Function1 function17 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                investingCustomOrderContentModel.getClass();
                function17.getClass();
                if ((intValue3 & 6) == 0) {
                    i = ((intValue3 & 8) == 0 ? ((GapComposer) composer6).changed(investingCustomOrderContentModel) : ((GapComposer) composer6).changedInstance(investingCustomOrderContentModel) ? 4 : 2) | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i |= ((GapComposer) composer6).changedInstance(function17) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer6;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1988126769, new QuickAccessBarKt$$ExternalSyntheticLambda1(investingCustomOrderContentModel, function17, customOrderScreen), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                MerchantProfileViewModel merchantProfileViewModel = (MerchantProfileViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue4 = ((Integer) obj4).intValue();
                merchantProfileViewModel.getClass();
                function18.getClass();
                MerchantProfileViewKt.MerchantProfileView((MerchantScreen$MerchantProfileScreen) ((Screen) obj6), ((ScoreUiFactory) obj5).imageLoader, merchantProfileViewModel, function18, (Composer) obj3, (intValue4 << 6) & 8064);
                break;
        }
        return Unit.INSTANCE;
    }
}
