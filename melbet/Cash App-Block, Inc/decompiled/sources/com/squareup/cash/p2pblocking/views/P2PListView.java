package com.squareup.cash.p2pblocking.views;

import android.content.Context;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda7;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.EditProfileUiView$$ExternalSyntheticLambda1;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletActivityListEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchView$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.views.retro.AfterpayAppletRetroOrderSelectionView$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsInfoViewModel;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.views.BirthdayView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.CashtagViewKt$Cashtag$1$1;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubView$$ExternalSyntheticLambda0;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.card.spendinginsights.views.SpendingInsightDetailView$$ExternalSyntheticLambda0;
import com.squareup.cash.card.spendinginsights.views.SpendingInsightsHomeView$$ExternalSyntheticLambda0;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.requestsponsorship.views.SelectContactMethodView$$ExternalSyntheticLambda0;
import com.squareup.cash.family.requestsponsorship.views.SelectSponsorView$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.genericelements.views.GenericTreeElementsUiView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.growtools.views.manager.GrowToolsCompleteActivityView$$ExternalSyntheticLambda0;
import com.squareup.cash.growtools.views.manager.GrowToolsManagerView$$ExternalSyntheticLambda1;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.components.InvestingStockSelectionView$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.search.InvestingSearchView$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.limits.views.arcade.FlatLimitsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.offers.viewmodels.OffersFullscreenCollectionViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.offers.views.collection.OffersFullscreenCollectionView$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.views.home.OffersHomeView$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.ArcadePaychecksHomeView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.viewmodels.CategoryListViewModel;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.SecurityLockView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.notifications.CategoryListView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.notifications.ChannelListView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.notifications.ProfileNotificationsView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.personal.PersonalInfoView$$ExternalSyntheticLambda2;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda4;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class P2PListView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PListView(Context context, RealImageLoader realImageLoader, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 1:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 2:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 3:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 4:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 5:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 6:
            case 7:
            case 12:
            case 17:
            default:
                this.imageLoader = realImageLoader;
                break;
            case 8:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 9:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 10:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 11:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 13:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 14:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 15:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 16:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 18:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 19:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 20:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 21:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 22:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 23:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 24:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 25:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 26:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 27:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 28:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 29:
                super(context);
                this.imageLoader = realImageLoader;
                break;
        }
    }

    public void Content(InvestingSearchViewModel investingSearchViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(595571590);
        int i2 = i | (gapComposer.changed(investingSearchViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            Object[] objArr = new Object[0];
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealGooglePayer$$ExternalSyntheticLambda0(investingSearchViewModel, 21);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0);
            String str = (String) mutableState.getValue();
            int i3 = i2 & 112;
            boolean changed = (i3 == 32) | gapComposer.changed(mutableState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function1, mutableState, null, 3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue3);
            boolean z2 = i3 == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(15, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue4, gapComposer, 0);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(view);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new BrandsSearchView$$ExternalSyntheticLambda4(view, 2);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue5, gapComposer);
            if (investingSearchViewModel == null) {
                gapComposer.startReplaceGroup(164395480);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(164395481);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1924345247, new InvestingSearchView$$ExternalSyntheticLambda3(investingSearchViewModel, this, function1, mutableState, view, focusRequester, 0), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, investingSearchViewModel, function1, i, 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PListView(RealImageLoader realImageLoader, Context context, int i) {
        super(context);
        this.$r8$classId = i;
        context.getClass();
        switch (i) {
            case 7:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 12:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            case 17:
                super(context);
                this.imageLoader = realImageLoader;
                break;
            default:
                this.imageLoader = realImageLoader;
                break;
        }
    }

    public void Content(GenericTreeElementsViewModel genericTreeElementsViewModel, Function1 function1, Composer composer, int i) {
        P2PListView p2PListView;
        GenericTreeElementsViewModel genericTreeElementsViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(348354604);
        int i3 = (gapComposer.changedInstance(genericTreeElementsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            p2PListView = this;
            genericTreeElementsViewModel2 = genericTreeElementsViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (genericTreeElementsViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new GenericTreeElementsUiView$$ExternalSyntheticLambda0(this, genericTreeElementsViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            p2PListView = this;
            genericTreeElementsViewModel2 = genericTreeElementsViewModel;
            function12 = function1;
            i2 = i;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(1408178897, new GenericTreeElementsUiView$$ExternalSyntheticLambda0(function12, genericTreeElementsViewModel2, p2PListView), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            int i4 = i2;
            endRestartGroup2.block = new GenericTreeElementsUiView$$ExternalSyntheticLambda0(p2PListView, genericTreeElementsViewModel2, function12, i4, 2);
        }
    }

    public void Content(GrowToolsActivityViewModel growToolsActivityViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(741539792);
        int i2 = (gapComposer.changedInstance(growToolsActivityViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (growToolsActivityViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-292088688, new GrowToolsCompleteActivityView$$ExternalSyntheticLambda0(growToolsActivityViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) this, (Object) growToolsActivityViewModel, (Function) function1, i, 2);
        }
    }

    public void Content(OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1619250051);
        int i2 = (gapComposer.changedInstance(offersFullscreenCollectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (offersFullscreenCollectionViewModel != null) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-831750382, new OffersFullscreenCollectionView$$ExternalSyntheticLambda1(this, function1, offersFullscreenCollectionViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersFullscreenCollectionView$$ExternalSyntheticLambda1(this, offersFullscreenCollectionViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        switch (this.$r8$classId) {
            case 0:
                Content((P2PListViewModel) obj, function1, gapComposer, 0);
                break;
            case 1:
                Content((EditProfileViewModel$EditCustomerProfileViewModel) obj, function1, gapComposer, 0);
                break;
            case 2:
                Content((AfterpayAppletActivityListEmbeddedViewModel) obj, function1, gapComposer, 0);
                break;
            case 3:
                Content((AfterpayAppletPurchasesEmbeddedViewModel) obj, function1, gapComposer, 0);
                break;
            case 4:
                Content((AfterpaySearchViewModel) obj, function1, gapComposer, 0);
                break;
            case 5:
                Content((AfterpayAppletRetroOrderSelectionViewModel) obj, function1, gapComposer, 0);
                break;
            case 6:
                Content((BitcoinStackingToolsInfoViewModel) obj, function1, gapComposer, 0);
                break;
            case 7:
                Content((StatusResultViewModel) obj, function1, gapComposer, 0);
                break;
            case 8:
                Content((AfterPayOrderHubViewModel) obj, function1, gapComposer, 0);
                break;
            case 9:
                Content((SpendingInsightDetailViewModel) obj, function1, gapComposer, 0);
                break;
            case 10:
                Content((SpendingInsightsHomeViewModel) obj, function1, gapComposer, 0);
                break;
            case 11:
                Content((SelectContactMethodViewModel) obj, function1, gapComposer, 0);
                break;
            case 12:
                Content((SelectSponsorViewModel) obj, function1, gapComposer, 0);
                break;
            case 13:
                Content((GenericTreeElementsViewModel) obj, function1, gapComposer, 0);
                break;
            case 14:
                Content((GrowToolsActivityViewModel) obj, function1, gapComposer, 0);
                break;
            case 15:
                Content((GrowToolsManagerViewModel) obj, function1, gapComposer, 0);
                break;
            case 16:
                Content((InvestingStockSelectionViewModel) obj, function1, gapComposer, 0);
                break;
            case 17:
                Content((InvestingSearchViewModel) obj, function1, gapComposer, 0);
                break;
            case 18:
                Content((LimitsViewModel) obj, function1, gapComposer, 0);
                break;
            case 19:
                Content((OffersFullscreenCollectionViewModel) obj, function1, gapComposer, 0);
                break;
            case 20:
                Content((OffersHomeViewModel) obj, function1, gapComposer, 0);
                break;
            case 21:
                Content((SelectCustomerViewModel) obj, function1, gapComposer, 0);
                break;
            case 22:
                Content((PaychecksHomeViewModel) obj, function1, gapComposer, 0);
                break;
            case 23:
                Content((EditDistributionViewModel) obj, function1, gapComposer, 0);
                break;
            case 24:
                Content((CategoryListViewModel) obj, function1, gapComposer, 0);
                break;
            case 25:
                Content((ChannelListViewModel) obj, function1, gapComposer, 0);
                break;
            case 26:
                Content(0, gapComposer, (ProfileNotificationsViewModel) obj, function1);
                break;
            case 27:
                Content((PersonalScreenViewModel) obj, function1, gapComposer, 0);
                break;
            case 28:
                Content((SavingsScreenViewModel) obj, function1, gapComposer, 0);
                break;
            default:
                Content((BrandsSearchViewModel) obj, function1, gapComposer, 0);
                break;
        }
    }

    public void Content(BrandsSearchViewModel brandsSearchViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2099689858);
        int i2 = i | (gapComposer.changedInstance(brandsSearchViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (brandsSearchViewModel != null) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer.changedInstance(brandsSearchViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BottomSheet$$ExternalSyntheticLambda2(brandsSearchViewModel, 20);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0);
            Object value = mutableState.getValue();
            boolean changed = gapComposer.changed(mutableState) | ((i2 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashtagViewKt$Cashtag$1$1(function1, mutableState, null, 7);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, value, (Function2) rememberedValue3);
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-878825433, new SwipeToDismissKt$$ExternalSyntheticLambda3(mutableState, focusRequester, view, function1, brandsSearchViewModel, this, 22), gapComposer), gapComposer, 6);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, brandsSearchViewModel, function1, i, 20);
        }
    }

    public void Content(AfterpayAppletActivityListEmbeddedViewModel afterpayAppletActivityListEmbeddedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(88430523);
        int i3 = (gapComposer.changedInstance(afterpayAppletActivityListEmbeddedViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletActivityListEmbeddedViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0(this, afterpayAppletActivityListEmbeddedViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2145588154, new AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0(this, afterpayAppletActivityListEmbeddedViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterpayAppletActivityListEmbeddedView$$ExternalSyntheticLambda0(this, afterpayAppletActivityListEmbeddedViewModel, function1, i2, 2);
        }
    }

    public void Content(SelectContactMethodViewModel selectContactMethodViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-926790392);
        int i3 = (gapComposer.changedInstance(selectContactMethodViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (selectContactMethodViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectContactMethodView$$ExternalSyntheticLambda0(this, selectContactMethodViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1965257811, new SelectContactMethodView$$ExternalSyntheticLambda0(this, selectContactMethodViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectContactMethodView$$ExternalSyntheticLambda0(this, selectContactMethodViewModel, function1, i2, 2);
        }
    }

    public void Content(AfterPayOrderHubViewModel afterPayOrderHubViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(10847287);
        int i3 = (gapComposer.changedInstance(afterPayOrderHubViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterPayOrderHubViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterPayOrderHubView$$ExternalSyntheticLambda0(this, afterPayOrderHubViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            Context context = getContext();
            context.getClass();
            ArcadeThemeKt.ArcadeTheme(ThemeHelpersKt.findThemeInfo(context).arcadeColors, null, null, Expect_jvmKt.rememberComposableLambda(2084372226, new AfterPayOrderHubView$$ExternalSyntheticLambda0(afterPayOrderHubViewModel, function1, this), gapComposer), gapComposer, 3072, 6);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterPayOrderHubView$$ExternalSyntheticLambda0(this, afterPayOrderHubViewModel, function1, i2, 2);
        }
    }

    public void Content(P2PListViewModel p2PListViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(744332641);
        int i2 = (gapComposer.changedInstance(p2PListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-348357268, new P2PListView$$ExternalSyntheticLambda0(this, p2PListViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new P2PListView$$ExternalSyntheticLambda0(this, p2PListViewModel, function1, i);
        }
    }

    public void Content(int i, Composer composer, ProfileNotificationsViewModel profileNotificationsViewModel, Function1 function1) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1504425056);
        int i2 = (gapComposer.changedInstance(profileNotificationsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (profileNotificationsViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1965322507, new ProfileNotificationsView$$ExternalSyntheticLambda0(this, function1, profileNotificationsViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProfileNotificationsView$$ExternalSyntheticLambda0(this, profileNotificationsViewModel, function1, i);
        }
    }

    public void Content(SelectCustomerViewModel selectCustomerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1655656677);
        int i2 = (gapComposer.changedInstance(selectCustomerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(94074298, new SelectCustomerView$$ExternalSyntheticLambda0(this, selectCustomerViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectCustomerView$$ExternalSyntheticLambda0(this, selectCustomerViewModel, function1, i);
        }
    }

    public void Content(AfterpayAppletRetroOrderSelectionViewModel afterpayAppletRetroOrderSelectionViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1603573142);
        int i3 = (gapComposer.changed(afterpayAppletRetroOrderSelectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletRetroOrderSelectionViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AfterpayAppletRetroOrderSelectionView$$ExternalSyntheticLambda0(this, afterpayAppletRetroOrderSelectionViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-440760833, new AfterpayAppletRetroOrderSelectionView$$ExternalSyntheticLambda0(this, afterpayAppletRetroOrderSelectionViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AfterpayAppletRetroOrderSelectionView$$ExternalSyntheticLambda0(this, afterpayAppletRetroOrderSelectionViewModel, function1, i2, 2);
        }
    }

    public void Content(SpendingInsightsHomeViewModel spendingInsightsHomeViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1271262855);
        int i2 = (gapComposer.changedInstance(spendingInsightsHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (spendingInsightsHomeViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-433581625, new SpendingInsightsHomeView$$ExternalSyntheticLambda0(spendingInsightsHomeViewModel, function1, 0), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(this, spendingInsightsHomeViewModel, function1, i, 17);
        }
    }

    public void Content(LimitsViewModel limitsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1760579876);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(limitsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (limitsViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(1151001700, new FlatLimitsViewKt$$ExternalSyntheticLambda0(function1, limitsViewModel, i2), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, limitsViewModel, function1, i, 20);
        }
    }

    public void Content(EditDistributionViewModel editDistributionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1809240447);
        int i2 = (gapComposer.changedInstance(editDistributionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (editDistributionViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(858853825, new PaycheckCirclesKt$$ExternalSyntheticLambda3(12, editDistributionViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, editDistributionViewModel, function1, i, 19);
        }
    }

    public void Content(final BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel, final Function1 function1, Composer composer, final int i) {
        P2PListView p2PListView;
        BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2054730352);
        int i3 = (gapComposer.changed(bitcoinStackingToolsInfoViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            p2PListView = this;
            bitcoinStackingToolsInfoViewModel2 = bitcoinStackingToolsInfoViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bitcoinStackingToolsInfoViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, bitcoinStackingToolsInfoViewModel, function1, i, i5) { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ P2PListView f$0;
                        public final /* synthetic */ BitcoinStackingToolsInfoViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel3 = this.f$1;
                            P2PListView p2PListView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    p2PListView2.Content(bitcoinStackingToolsInfoViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    p2PListView2.Content(bitcoinStackingToolsInfoViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            p2PListView = this;
            bitcoinStackingToolsInfoViewModel2 = bitcoinStackingToolsInfoViewModel;
            function12 = function1;
            i2 = i;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1181006032, new BitcoinStackingToolsInfoView$$ExternalSyntheticLambda1(bitcoinStackingToolsInfoViewModel2, function12, i4), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel3 = bitcoinStackingToolsInfoViewModel2;
            final P2PListView p2PListView2 = p2PListView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(p2PListView2, bitcoinStackingToolsInfoViewModel3, function12, i2, i6) { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsInfoView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ P2PListView f$0;
                public final /* synthetic */ BitcoinStackingToolsInfoViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = p2PListView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    BitcoinStackingToolsInfoViewModel bitcoinStackingToolsInfoViewModel32 = this.f$1;
                    P2PListView p2PListView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            p2PListView22.Content(bitcoinStackingToolsInfoViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            p2PListView22.Content(bitcoinStackingToolsInfoViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1960165096);
        int i2 = (gapComposer.changedInstance(editProfileViewModel$EditCustomerProfileViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (editProfileViewModel$EditCustomerProfileViewModel != null) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(8, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-694885848, new EditProfileUiView$$ExternalSyntheticLambda1(editProfileViewModel$EditCustomerProfileViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Yoga$$ExternalSyntheticLambda7((Object) this, (Object) editProfileViewModel$EditCustomerProfileViewModel, function1, i, 24);
        }
    }

    public void Content(StatusResultViewModel statusResultViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(853785526);
        int i2 = (gapComposer.changedInstance(statusResultViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (statusResultViewModel != null) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-863268746, new SetPinViewKt$$ExternalSyntheticLambda2(22, (Object) statusResultViewModel, (Object) function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, statusResultViewModel, function1, i, 29);
        }
    }

    public void Content(CategoryListViewModel categoryListViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1910413789);
        int i2 = (gapComposer.changedInstance(categoryListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (categoryListViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-501933960, new CategoryListView$$ExternalSyntheticLambda0(this, categoryListViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CategoryListView$$ExternalSyntheticLambda0(this, categoryListViewModel, function1, i);
        }
    }

    public void Content(SpendingInsightDetailViewModel spendingInsightDetailViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1464379852);
        int i2 = (gapComposer.changedInstance(spendingInsightDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (spendingInsightDetailViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1049897281, new SpendingInsightDetailView$$ExternalSyntheticLambda0(this, function1, spendingInsightDetailViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpendingInsightDetailView$$ExternalSyntheticLambda0(this, spendingInsightDetailViewModel, function1, i);
        }
    }

    public void Content(final AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel, final Function1 function1, Composer composer, final int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1488962854);
        int i3 = (gapComposer.changedInstance(afterpayAppletPurchasesEmbeddedViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpayAppletPurchasesEmbeddedViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this) { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletPurchasesEmbeddedView$$ExternalSyntheticLambda0
                        public final /* synthetic */ P2PListView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i;
                            Function1 function12 = function1;
                            AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel2 = afterpayAppletPurchasesEmbeddedViewModel;
                            P2PListView p2PListView = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    p2PListView.Content(afterpayAppletPurchasesEmbeddedViewModel2, function12, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    p2PListView.Content(afterpayAppletPurchasesEmbeddedViewModel2, function12, composer2, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i2 = i;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1605087761, new InlineAppMessageKt$$ExternalSyntheticLambda8(this, afterpayAppletPurchasesEmbeddedViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i6 = 1;
            final int i7 = i2;
            endRestartGroup2.block = new Function2(this) { // from class: com.squareup.cash.afterpayapplet.views.AfterpayAppletPurchasesEmbeddedView$$ExternalSyntheticLambda0
                public final /* synthetic */ P2PListView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    int i72 = i7;
                    Function1 function12 = function1;
                    AfterpayAppletPurchasesEmbeddedViewModel afterpayAppletPurchasesEmbeddedViewModel2 = afterpayAppletPurchasesEmbeddedViewModel;
                    P2PListView p2PListView = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            p2PListView.Content(afterpayAppletPurchasesEmbeddedViewModel2, function12, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            p2PListView.Content(afterpayAppletPurchasesEmbeddedViewModel2, function12, composer2, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(ChannelListViewModel channelListViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(95780214);
        int i2 = (gapComposer.changedInstance(channelListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (channelListViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(170549814, new ChannelListView$$ExternalSyntheticLambda0(channelListViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, channelListViewModel, function1, i, 12);
        }
    }

    public void Content(PersonalScreenViewModel personalScreenViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-719982547);
        int i2 = (gapComposer.changedInstance(personalScreenViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (personalScreenViewModel != null) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new PersonalInfoView$$ExternalSyntheticLambda0(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(24, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-645212947, new PersonalInfoView$$ExternalSyntheticLambda2(personalScreenViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SecurityLockView$$ExternalSyntheticLambda1(this, personalScreenViewModel, function1, i, 20);
        }
    }

    public void Content(SelectSponsorViewModel selectSponsorViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(574074849);
        int i2 = (gapComposer.changedInstance(selectSponsorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (selectSponsorViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectSponsorView$$ExternalSyntheticLambda0(this, selectSponsorViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(366715884, new SelectSponsorView$$ExternalSyntheticLambda0(this, selectSponsorViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectSponsorView$$ExternalSyntheticLambda0(this, selectSponsorViewModel, function1, i, 2);
        }
    }

    public void Content(OffersHomeViewModel offersHomeViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1571877814);
        int i2 = (gapComposer.changed(offersHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (offersHomeViewModel != null) {
            if (!offersHomeViewModel.isPresenterInitialized) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new OffersHomeView$$ExternalSyntheticLambda0(this, offersHomeViewModel, function1, i, 0);
                    return;
                }
                return;
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(2, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(985001995, new OffersHomeView$$ExternalSyntheticLambda0(this, offersHomeViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new OffersHomeView$$ExternalSyntheticLambda0(this, offersHomeViewModel, function1, i, 2);
        }
    }

    public void Content(SavingsScreenViewModel savingsScreenViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1800642064);
        int i2 = (gapComposer.changedInstance(savingsScreenViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SavingsScreenViewKt.SavingsScreenView(savingsScreenViewModel, function1, this.imageLoader, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(this, savingsScreenViewModel, function1, i, 28);
        }
    }

    public void Content(final GrowToolsManagerViewModel growToolsManagerViewModel, final Function1 function1, Composer composer, final int i) {
        P2PListView p2PListView;
        GrowToolsManagerViewModel growToolsManagerViewModel2;
        final Function1 function12;
        final int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1380617238);
        int i3 = (gapComposer.changed(growToolsManagerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i4 = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            p2PListView = this;
            growToolsManagerViewModel2 = growToolsManagerViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (growToolsManagerViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2(this, growToolsManagerViewModel, function1, i, i5) { // from class: com.squareup.cash.growtools.views.manager.GrowToolsManagerView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ P2PListView f$0;
                        public final /* synthetic */ GrowToolsManagerViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i5;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            GrowToolsManagerViewModel growToolsManagerViewModel3 = this.f$1;
                            P2PListView p2PListView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    p2PListView2.Content(growToolsManagerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    p2PListView2.Content(growToolsManagerViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            p2PListView = this;
            growToolsManagerViewModel2 = growToolsManagerViewModel;
            function12 = function1;
            i2 = i;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1176817834, new GrowToolsManagerView$$ExternalSyntheticLambda1(growToolsManagerViewModel2, function12, i4), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final GrowToolsManagerViewModel growToolsManagerViewModel3 = growToolsManagerViewModel2;
            final P2PListView p2PListView2 = p2PListView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(p2PListView2, growToolsManagerViewModel3, function12, i2, i6) { // from class: com.squareup.cash.growtools.views.manager.GrowToolsManagerView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ P2PListView f$0;
                public final /* synthetic */ GrowToolsManagerViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = p2PListView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.$r8$classId;
                    Function1 function13 = this.f$2;
                    GrowToolsManagerViewModel growToolsManagerViewModel32 = this.f$1;
                    P2PListView p2PListView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            p2PListView22.Content(growToolsManagerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            p2PListView22.Content(growToolsManagerViewModel32, function13, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public void Content(PaychecksHomeViewModel paychecksHomeViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1279208535);
        int i2 = (gapComposer.changedInstance(paychecksHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (paychecksHomeViewModel != null) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-484081385, new ArcadePaychecksHomeView$$ExternalSyntheticLambda0(paychecksHomeViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, paychecksHomeViewModel, function1, i, 15);
        }
    }

    public void Content(InvestingStockSelectionViewModel investingStockSelectionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1703116132);
        int i2 = (gapComposer.changed(investingStockSelectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (investingStockSelectionViewModel != null) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1162297209, new InvestingStockSelectionView$$ExternalSyntheticLambda0(investingStockSelectionViewModel, function1, this), gapComposer), gapComposer, 3072, 7);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(view);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BrandsSearchView$$ExternalSyntheticLambda4(view, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue, gapComposer);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AppUpgradeViewKt$$ExternalSyntheticLambda7(25, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue2, gapComposer, 0, 1);
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingStockSelectionView$$ExternalSyntheticLambda0(this, investingStockSelectionViewModel, function1, i);
        }
    }

    public void Content(final AfterpaySearchViewModel afterpaySearchViewModel, final Function1 function1, Composer composer, final int i) {
        P2PListView p2PListView;
        AfterpaySearchViewModel afterpaySearchViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-232082300);
        int i3 = (gapComposer.changedInstance(afterpaySearchViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            p2PListView = this;
            afterpaySearchViewModel2 = afterpaySearchViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (afterpaySearchViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, afterpaySearchViewModel, function1, i, i4) { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ P2PListView f$0;
                        public final /* synthetic */ AfterpaySearchViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            AfterpaySearchViewModel afterpaySearchViewModel3 = this.f$1;
                            P2PListView p2PListView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    p2PListView2.Content(afterpaySearchViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    p2PListView2.Content(afterpaySearchViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            p2PListView = this;
            afterpaySearchViewModel2 = afterpaySearchViewModel;
            function12 = function1;
            i2 = i;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(p2PListView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1392940732, new AfterpaySearchView$$ExternalSyntheticLambda1(afterpaySearchViewModel2, function12), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final AfterpaySearchViewModel afterpaySearchViewModel3 = afterpaySearchViewModel2;
            final P2PListView p2PListView2 = p2PListView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(p2PListView2, afterpaySearchViewModel3, function13, i5, i6) { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ P2PListView f$0;
                public final /* synthetic */ AfterpaySearchViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = p2PListView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    AfterpaySearchViewModel afterpaySearchViewModel32 = this.f$1;
                    P2PListView p2PListView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            p2PListView22.Content(afterpaySearchViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            p2PListView22.Content(afterpaySearchViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
