package com.squareup.cash.badging.db;

import android.content.Context;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.api.ApiResult;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.SegmentedToggleValue;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.cell.RealCellSearchResultAccessoryScope;
import com.squareup.cash.arcade.treehouse.InputFieldBinding;
import com.squareup.cash.arcade.treehouse.NavBarBinding;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.billssubscriptions.viewmodels.model.MerchantLinkingStatus;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorScreen;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonDisplayType;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositNoteScreenView;
import com.squareup.cash.bitcoin.views.exchange.MaxCentsCappedKeypadListener;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewModel;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView;
import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.cash.blockers.viewmodels.CalendarBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.views.BlockerLayout;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.investing.components.autoinvest.InvestingAutoInvestKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.registeralias.presenters.api.RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.contour.YInt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.app.SetAddressResponse;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$EndFlowRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SetDateRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$SubmitFormRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.util.Strings;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.Views;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final /* synthetic */ class BadgeQueries$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda5(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 0;
        BadgeQueries$badgesToClear$2 badgeQueries$badgesToClear$2 = BadgeQueries$badgesToClear$2.INSTANCE;
        this.f$1 = localTabContentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.$r8$classId;
        PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = PromotedAppletTileViewEvent$Click.INSTANCE;
        int i2 = 1;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                BadgeQueries$badgesToClear$2 badgeQueries$badgesToClear$2 = BadgeQueries$badgesToClear$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 1, (EnumColumnAdapter) ((GrpcMethod) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).path);
                Long l = androidCursor.getLong(2);
                l.getClass();
                return badgeQueries$badgesToClear$2.invoke(m1431m, m, l);
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                if (((Boolean) ((InputFieldBinding) obj2).isPassword$delegate.getValue()).booleanValue()) {
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                    semanticsPropertyReceiver.set(SemanticsProperties.Password, Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                return new YInt(((NavBarBinding) obj2).toolbarSize);
            case 3:
                Navigator navigator = (Navigator) obj;
                navigator.getClass();
                return ((TabToolbarPresenter$Factory$Impl) ((Profile.Adapter) obj2).default_currencyAdapter).create(navigator, null);
            case 4:
                ((GraphLoop$processingQueue$1) obj2).invoke(((Boolean) obj).booleanValue() ? SegmentedToggleValue.Left : SegmentedToggleValue.Right);
                return Unit.INSTANCE;
            case 5:
                ToggleBinding toggleBinding = (ToggleBinding) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = toggleBinding.state$delegate;
                BooleanState booleanState = new BooleanState(booleanValue, ((BooleanState) parcelableSnapshotMutableState.getValue()).userEditCount + 1);
                parcelableSnapshotMutableState.setValue(booleanState);
                Function1 function1 = (Function1) ((ParcelableSnapshotMutableState) toggleBinding.onChange$delegate).getValue();
                if (function1 != null) {
                    function1.invoke(booleanState);
                }
                return Unit.INSTANCE;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver2, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((BalanceAppletTileViewModel.BalanceObfuscationButton) obj2).contentDescription);
                return Unit.INSTANCE;
            case 7:
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click2 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click2.getClass();
                if (promotedAppletTileViewEvent$Click2.equals(promotedAppletTileViewEvent$Click)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) familyAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 8:
                CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
                cardSpendingInsightsConfig.getClass();
                return zzahh.toSpendingInsightsConfig((BenefitsHomePresenter) obj2, cardSpendingInsightsConfig);
            case 9:
                RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope = (RealCellSearchResultAccessoryScope) obj;
                realCellSearchResultAccessoryScope.getClass();
                if (((Merchant) obj2).status == MerchantLinkingStatus.LINKED) {
                    realCellSearchResultAccessoryScope.setContent(BillsSubscriptionsMerchantListViewKt.lambda$1912940576);
                } else {
                    realCellSearchResultAccessoryScope.setContent(BillsSubscriptionsMerchantListViewKt.lambda$1669881079);
                }
                return Unit.INSTANCE;
            case 10:
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click3 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click3.getClass();
                if (promotedAppletTileViewEvent$Click3.equals(promotedAppletTileViewEvent$Click)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 11:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                AndroidStringManager androidStringManager = ((BitcoinMapPresenter) obj2).stringManager;
                return new BitcoinMapErrorScreen(androidStringManager.get(R.string.bitcoin_map_error_loading_address_title), androidStringManager.get(R.string.bitcoin_map_error_loading_address_description), androidStringManager.get(R.string.bitcoin_map_error_retry), androidStringManager.get(R.string.bitcoin_map_error_cancel), askedQuestion);
            case 12:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                realCellActivityAccessoryScope.amount(new ComposableLambdaImpl(new InvestingAutoInvestKt$$ExternalSyntheticLambda0((InvestingCryptoRecurringPurchaseTileViewModel.Item) obj2, i2), true, 1280827016));
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                String str2 = ((BitcoinTradeButtonDisplayType.Drawable) ((BitcoinTradeButtonDisplayType) obj2)).contentDescription;
                if (str2 == null) {
                    str2 = "";
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str2);
                return Unit.INSTANCE;
            case 14:
                ((Context) obj).getClass();
                return ((BitcoinDepositNoteScreenView) obj2).formView;
            case 15:
                MaxCentsCappedKeypadListener maxCentsCappedKeypadListener = (MaxCentsCappedKeypadListener) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    maxCentsCappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    maxCentsCappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    maxCentsCappedKeypadListener.onDecimal();
                }
                return Unit.INSTANCE;
            case 16:
                SubmitBlockerRequest.Request.Builder builder = (SubmitBlockerRequest.Request.Builder) obj;
                builder.getClass();
                builder.request = new SubmitBlockerRequest$Request$Request$SubmitFormRequest((SubmitFormRequest) obj2);
                return builder;
            case 17:
                SubmitBlockerRequest.Request.Builder builder2 = (SubmitBlockerRequest.Request.Builder) obj;
                builder2.getClass();
                builder2.request = new SubmitBlockerRequest$Request$Request$EndFlowRequest((EndFlowRequest) obj2);
                return builder2;
            case 18:
                SubmitBlockerRequest.Request.Builder builder3 = (SubmitBlockerRequest.Request.Builder) obj;
                builder3.getClass();
                builder3.request = new SubmitBlockerRequest$Request$Request$SetDateRequest((SetDateRequest) obj2);
                return builder3;
            case 19:
                SubmitBlockerRequest.Request.Builder builder4 = (SubmitBlockerRequest.Request.Builder) obj;
                builder4.getClass();
                builder4.request = new SubmitBlockerRequest$Request$Request$ResolvePersonaDidvBlockerRequest((ResolvePersonaDidvBlockerRequest) obj2);
                return builder4;
            case 20:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                return (SubmitBlockerRequest.Request) BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((BlockersConfig.Adapter) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).target_balance_amountAdapter);
            case 21:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 22:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                registerAliasViewModel.getClass();
                return RegisterAliasViewModel.copy$default(registerAliasViewModel, ((RegisterAliasResultHandler$RegisterAliasHandlingOutcome$ErrorMessaging) obj2).message, null, null, false, false, true, null, false, false, 1047293);
            case 23:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                ApiResult.Success success = (ApiResult.Success) obj;
                success.getClass();
                SetAddressResponse setAddressResponse = (SetAddressResponse) success.response;
                SetAddressResponse.Status status = setAddressResponse.status;
                if (status == null) {
                    status = ProtoDefaults.SET_ADDRESS_STATUS;
                }
                int ordinal = status.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return null;
                    }
                    if (ordinal != 2 && ordinal != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                String name = status.name();
                ResponseContext responseContext = setAddressResponse.response_context;
                if (responseContext == null || (str = responseContext.failure_message) == null) {
                    String str3 = responseContext != null ? responseContext.dialog_message : null;
                    str = str3 == null ? ((AndroidStringManager) cardLockPresenter.stringManager).get(R.string.profile_street_address_error) : str3;
                }
                return new BlockerResponse.Error(name, str, 4);
            case 24:
                ((VerifyAliasPresenter.State) obj).getClass();
                return ((VerifyAliasPresenter) obj2).initialState;
            case 25:
                ((Context) obj).getClass();
                return ((ScenarioPlanErrorView) obj2).formView;
            case 26:
                FormView formView = (FormView) obj;
                formView.getClass();
                formView.renderViewModel(((ScenarioPlanErrorViewModel) obj2).formViewModel);
                return Unit.INSTANCE;
            case 27:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return ((FilesetUploadViewModel) obj2).submittingState == FilesetUploadViewModel.SubmittingState.BACKWARD ? Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl) : Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl);
            case 28:
                BlockerLayout blockerLayout = (BlockerLayout) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue2) {
                    int i3 = BlockerLayout.$r8$clinit;
                    Keyboards.hideKeyboard(blockerLayout);
                }
                Views.recurseViewTree(blockerLayout.footerLayout, new MoneyTabUIKt$$ExternalSyntheticLambda24(booleanValue2, 5));
                return Unit.INSTANCE;
            default:
                CalendarBlockerViewModel calendarBlockerViewModel = (CalendarBlockerViewModel) obj2;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                CalendarBlockerViewModel.Loading loading = calendarBlockerViewModel instanceof CalendarBlockerViewModel.Loading ? (CalendarBlockerViewModel.Loading) calendarBlockerViewModel : null;
                AnimationDirection animationDirection = loading != null ? loading.animationDirection : null;
                int i4 = animationDirection == null ? -1 : CalendarDatePickerKt.WhenMappings.$EnumSwitchMapping$0[animationDirection.ordinal()];
                return i4 != 1 ? i4 != 2 ? Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl2) : Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl2) : Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl2);
        }
    }

    public /* synthetic */ BadgeQueries$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
