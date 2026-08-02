package com.squareup.cash.score.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.TextStyle;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.glance.appwidget.WidgetLayoutKt;
import coil3.RealImageLoader;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.views.PoolGoalMetKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.pools.views.animation.PoolDetailsAnimationStateHolder;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.cash.retro.views.PaymentPlanSummaryViewKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.viewmodels.ProfileAvatarViewModel;
import com.squareup.cash.score.viewmodels.ScoreHomeViewModel;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.util.compose.StableHolder;
import java.io.Serializable;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes7.dex */
public final /* synthetic */ class CalloutKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(String str, Badge badge, Modifier modifier, int i, TextStyle textStyle, int i2) {
        this.$r8$classId = 9;
        this.f$0 = str;
        this.f$1 = badge;
        this.f$2 = modifier;
        this.f$4 = i;
        this.f$3 = textStyle;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$1;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        Object obj6 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CalloutKt.Callout((CashCreditScoreHomeData.InfoSection.Callout) obj5, (StyledCardViewModel) obj3, (Modifier) obj6, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                QuickPayViewKt.ConfirmRecipient((ConfirmRecipientDialogViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayRequestView((Function1) obj4, (NearbyPayRequestViewModel) obj5, (RealImageLoader) obj3, (RealCashVibrator) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                AlphaKt.ActionButton((Modifier) obj6, (Function0) obj5, this.f$4, (ColorFilter) obj3, (String) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 4:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolDetailsView((Function1) obj4, (PoolDetailsViewModel) obj5, (RealImageLoader) obj3, (RealCashVibrator) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                PoolToastKt.HorizontalInviteAvatarMenu((Function0) obj5, (Modifier) obj6, (ImmutableList) obj3, (PoolDetailsAnimationStateHolder) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PoolGoalMetKt.PoolGoalMet((String) obj5, (List) obj3, (GoalMetTimeline) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolInvitePeopleListView((Function1) obj4, (Modifier) obj6, (PoolInvitePeopleListViewModel) obj5, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                WebSectionKt.PersonalizedAdsSectionEligible((ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.Eligible) obj5, (Function1) obj4, (Function1) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                CameraXPreviewKt.m3729BadgeNameDpqVIHw((String) obj5, (Badge) obj3, (Modifier) obj6, this.f$4, (TextStyle) obj4, (Composer) obj, updateChangedFlags2);
                break;
            case 10:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryKt.SourceInfoSection((StackedAvatarViewModel.Single) obj5, (String) obj3, (Function0) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                PaymentPlanSummaryViewKt.SourceInfoSection((StackedAvatarViewModel) obj5, (String) obj3, (Function0) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SavingsScreenViewKt.SavingsScreen((SavingsScreenViewModel.Content) obj5, (Function1) obj4, (Function1) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ViewPropertyAnimatorListenerAdapter.ScoreAppletTile((ScoreAppletTileViewModel) obj5, (ScoreAppletViewsModule$$ExternalSyntheticLambda1) obj3, (AppletTile.AppletTileAppearance) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                CalloutKt.CalloutColumn((List) obj5, (StyledCardViewModel) obj3, (Function1) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                CalloutKt.InfoSection((CashCreditScoreHomeData.InfoSection) obj5, (StyledCardViewModel) obj3, (Function1) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                CalloutKt.ScoreHome((ScoreHomeViewModel) obj5, (Function1) obj4, (Modifier) obj6, (ScrollState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                CalloutKt.ScoreHomeContent((ScoreHomeViewModel.Loaded) obj5, (Function1) obj4, (Modifier) obj6, (ScrollState) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                CalloutKt.m3742ScoreVisualizationTN_CM5M((CashCreditScoreHomeData.Visualization) obj5, (ProfileAvatarViewModel) obj3, (Modifier) obj6, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).InfoSheetFooter((Text) obj3, (Function1) obj4, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).BulletedSheetLogoImage((Modifier) obj6, (StableHolder) obj3, (Integer) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                WidgetLayoutKt.NullStateCarousel((NullStateViewModel$SwipeViewModel$Content) obj5, (Function1) obj4, (Modifier) obj6, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ScreenshotList((ScreenshotReviewViewModel) obj5, (Function1) obj4, (Function1) obj3, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ScreenshotRow((LazyItemScopeImpl) obj5, (ScreenshotReviewViewModel.Screenshot) obj3, (Function1) obj4, (CellDefaultAccessory) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                ArticleViewKt.ArticleActivityItemRow((String) obj5, (SupportActivityItemLoader) obj3, (RealImageLoader) obj6, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                ArticleViewKt.ArticleContent((ArticleViewModel.Loaded) obj5, (Function1) obj4, (WebViewProvider) obj3, (Function0) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ArticleViewKt.WebView((String) obj5, (Function1) obj4, (Modifier) obj6, (WebViewProvider) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                TapToPayKt.TapToPayPayment((TapToPayPaymentViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.AddMoneyAtmPicker((Modifier) obj6, (AddMoneyViewModel.AtmPicker) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ManagedAccountInstrumentPickerContent((Modifier) obj6, (AddMoneyViewModel.ManagedAccountInstrumentPicker) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = modifier;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Modifier modifier, Function0 function0, int i, ColorFilter colorFilter, String str, int i2) {
        this.$r8$classId = 3;
        this.f$2 = modifier;
        this.f$0 = function0;
        this.f$4 = i;
        this.f$1 = colorFilter;
        this.f$3 = str;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Serializable serializable, Object obj, Object obj2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = serializable;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = function;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = obj4;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Object obj, Function1 function1, Modifier modifier, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$1 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Object obj, Function1 function1, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = function1;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Modifier modifier, AddMoneyViewModel addMoneyViewModel, Function1 function1, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = addMoneyViewModel;
        this.f$3 = function1;
        this.f$1 = function0;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Function1 function1, Modifier modifier, PoolInvitePeopleListViewModel poolInvitePeopleListViewModel, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = 7;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$0 = poolInvitePeopleListViewModel;
        this.f$1 = realImageLoader;
        this.f$4 = i;
    }

    public /* synthetic */ CalloutKt$$ExternalSyntheticLambda4(Function1 function1, Object obj, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = function1;
        this.f$0 = obj;
        this.f$1 = realImageLoader;
        this.f$2 = realCashVibrator;
        this.f$4 = i;
    }
}
