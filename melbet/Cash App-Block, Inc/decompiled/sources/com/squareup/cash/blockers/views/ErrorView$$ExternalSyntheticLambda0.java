package com.squareup.cash.blockers.views;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.room.util.DBUtil;
import app.cash.arcade.values.BooleanState;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.ui.Ui;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import coil3.size.SizeKt;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.AppMessageErrorViewEvent$Close;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.db.CardMessageQueries$cardMessagesByPriority$2;
import com.squareup.cash.appmessages.db.InlineMessageV2Queries$$ExternalSyntheticLambda0;
import com.squareup.cash.appmessages.db.InlineMessageV2Queries$inlineMessagesByPriority$2;
import com.squareup.cash.appmessages.holders.PendingPopupMessageHolder$CardTabPlacementHolder;
import com.squareup.cash.appmessages.views.AppMessageErrorDialog;
import com.squareup.cash.appmessages.views.PopupAppMessageView;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.treehouse.RadioBinding;
import com.squareup.cash.arcade.treehouse.RoundedRectBinding;
import com.squareup.cash.arcade.treehouse.SearchFieldBinding;
import com.squareup.cash.arcade.treehouse.TextFieldBinding;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.applets.views.BalanceAppletTile;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.viewmodels.TransfersViewModel$Companion$TransfersTab;
import com.squareup.cash.benefits.presenters.BenefitsHomePresenter;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewModel;
import com.squareup.cash.bitcoin.views.exchange.MaxCentsCappedKeypadListener;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionFileDownloadEvent$Cancel;
import com.squareup.cash.blockers.actions.views.BlockerActionFileDownloadDialog;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagErrorViewEvent$NegativeClick;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.ErrorViewEvent$Close;
import com.squareup.cash.blockers.viewmodels.HelpItemMessageViewEvent$Cancel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionDetailsViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.InvalidInputViewEvent$Confirm;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.cdf.bankingbenefitshome.BankingBenefitsHomeTapViewAllActivity;
import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.backend.real.RealDependentControlStatusManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientAndroidSimplifiedIntegrityChecks;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.scannerview.StepResult$BitmapResult$Computed;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes5.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        CashAccountDatabaseImpl cashAccountDatabaseImpl;
        CoroutineContext coroutineContext;
        CoroutineScope coroutineScope;
        String str2;
        int i = this.$r8$classId;
        char c = 0;
        str = "";
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Ui.EventReceiver eventReceiver = ((ErrorView) obj).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(ErrorViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 1:
                WorkReviewTermsBanner$configFlow$$inlined$map$1 workReviewTermsBanner$configFlow$$inlined$map$1 = (WorkReviewTermsBanner$configFlow$$inlined$map$1) obj;
                LocalTabContentQueries localTabContentQueries = ((CashAccountDatabaseImpl) workReviewTermsBanner$configFlow$$inlined$map$1.$navigator$inlined).cardMessageQueries;
                localTabContentQueries.getClass();
                CardMessageQueries$cardMessagesByPriority$2 cardMessageQueries$cardMessagesByPriority$2 = CardMessageQueries$cardMessagesByPriority$2.INSTANCE;
                SqlDriver sqlDriver = localTabContentQueries.driver;
                ContextKt$$ExternalSyntheticLambda1 contextKt$$ExternalSyntheticLambda1 = new ContextKt$$ExternalSyntheticLambda1(localTabContentQueries, c);
                sqlDriver.getClass();
                return FlowKt.shareIn(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-127505741, new String[]{"cardMessage"}, sqlDriver, "CardMessage.sq", "cardMessagesByPriority", "SELECT cardMessage.messageToken, cardMessage.campaignToken, cardMessage.isBadged, cardMessage.placement, cardMessage.image, cardMessage.title, cardMessage.subtitle, cardMessage.primaryNavigationAction, cardMessage.animation, cardMessage.priority, cardMessage.expiresAtUtc\nFROM cardMessage\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", contextKt$$ExternalSyntheticLambda1)), (CoroutineContext) workReviewTermsBanner$configFlow$$inlined$map$1.$flowStarter$inlined)), workReviewTermsBanner$configFlow$$inlined$map$1, 17), (CoroutineScope) workReviewTermsBanner$configFlow$$inlined$map$1.$exitScreen$inlined, new StartedWhileSubscribed(0L, 0L), 1);
            case 2:
                WorkReviewTermsBanner$configFlow$$inlined$map$1 workReviewTermsBanner$configFlow$$inlined$map$12 = (WorkReviewTermsBanner$configFlow$$inlined$map$1) obj;
                LocalTabContentQueries localTabContentQueries2 = ((CashAccountDatabaseImpl) workReviewTermsBanner$configFlow$$inlined$map$12.$navigator$inlined).inlineMessageV2Queries;
                localTabContentQueries2.getClass();
                InlineMessageV2Queries$inlineMessagesByPriority$2 inlineMessageV2Queries$inlineMessagesByPriority$2 = InlineMessageV2Queries$inlineMessagesByPriority$2.INSTANCE;
                SqlDriver sqlDriver2 = localTabContentQueries2.driver;
                InlineMessageV2Queries$$ExternalSyntheticLambda0 inlineMessageV2Queries$$ExternalSyntheticLambda0 = new InlineMessageV2Queries$$ExternalSyntheticLambda0(localTabContentQueries2, c);
                sqlDriver2.getClass();
                return FlowKt.shareIn(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-1763190673, new String[]{"inlineMessageV2"}, sqlDriver2, "InlineMessageV2.sq", "inlineMessagesByPriority", "SELECT inlineMessageV2.messageToken, inlineMessageV2.campaignToken, inlineMessageV2.isBadged, inlineMessageV2.placement, inlineMessageV2.avatar, inlineMessageV2.title, inlineMessageV2.subtitle, inlineMessageV2.url, inlineMessageV2.priority, inlineMessageV2.expiresAtUtc\nFROM inlineMessageV2\nWHERE expiresAtUtc IS NULL OR expiresAtUtc > strftime('%s', 'now')\nORDER BY priority DESC", inlineMessageV2Queries$$ExternalSyntheticLambda0)), (CoroutineContext) workReviewTermsBanner$configFlow$$inlined$map$12.$flowStarter$inlined)), workReviewTermsBanner$configFlow$$inlined$map$12, 19), (CoroutineScope) workReviewTermsBanner$configFlow$$inlined$map$12.$exitScreen$inlined, new StartedWhileSubscribed(0L, 0L), 1);
            case 3:
                PendingPopupMessageHolder$CardTabPlacementHolder pendingPopupMessageHolder$CardTabPlacementHolder = (PendingPopupMessageHolder$CardTabPlacementHolder) obj;
                switch (pendingPopupMessageHolder$CardTabPlacementHolder.$r8$classId) {
                    case 0:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                    case 1:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                    case 2:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                    case 3:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                    case 4:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                    default:
                        cashAccountDatabaseImpl = pendingPopupMessageHolder$CardTabPlacementHolder.cashDatabase;
                        break;
                }
                SafeFlow flow = DBUtil.toFlow(cashAccountDatabaseImpl.popupMessageQueries.popupMessagesByPriority());
                switch (pendingPopupMessageHolder$CardTabPlacementHolder.$r8$classId) {
                    case 0:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                    case 1:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                    case 2:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                    case 3:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                    case 4:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                    default:
                        coroutineContext = pendingPopupMessageHolder$CardTabPlacementHolder.ioDispatcher;
                        break;
                }
                RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(DBUtil.mapToList(flow, coroutineContext)), pendingPopupMessageHolder$CardTabPlacementHolder, 20);
                switch (pendingPopupMessageHolder$CardTabPlacementHolder.$r8$classId) {
                    case 0:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                    case 1:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                    case 2:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                    case 3:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                    case 4:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                    default:
                        coroutineScope = pendingPopupMessageHolder$CardTabPlacementHolder.scope;
                        break;
                }
                return FlowKt.shareIn(realBadger2$scheduleBadgeClearingWork$$inlined$map$1, coroutineScope, new StartedWhileSubscribed(0L, 0L), 1);
            case 4:
                Ui.EventReceiver eventReceiver2 = ((AppMessageErrorDialog) obj).eventReceiver;
                if (eventReceiver2 != null) {
                    eventReceiver2.sendEvent(AppMessageErrorViewEvent$Close.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 5:
                PopupAppMessageView popupAppMessageView = (PopupAppMessageView) obj;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = popupAppMessageView.backPressEvent;
                if (appMessageActionTaken != null) {
                    Ui.EventReceiver eventReceiver3 = popupAppMessageView.eventReceiver;
                    if (eventReceiver3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    eventReceiver3.sendEvent(appMessageActionTaken);
                }
                return Unit.INSTANCE;
            case 6:
                return new TimelineState((ImmutableList) obj);
            case 7:
                RadioBinding radioBinding = (RadioBinding) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = radioBinding.state$delegate;
                BooleanState booleanState = new BooleanState(true, ((BooleanState) parcelableSnapshotMutableState.getValue()).userEditCount + 1);
                parcelableSnapshotMutableState.setValue(booleanState);
                Function1 function1 = (Function1) radioBinding.onChange$delegate.getValue();
                if (function1 != null) {
                    function1.invoke(booleanState);
                }
                return Unit.INSTANCE;
            case 8:
                Function0 function0 = (Function0) ((RoundedRectBinding) obj).onClick$delegate.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                InputConnection onCreateInputConnection = ((SearchFieldBinding) obj).value.editText.onCreateInputConnection(new EditorInfo());
                onCreateInputConnection.getClass();
                return onCreateInputConnection;
            case 10:
                InputConnection onCreateInputConnection2 = ((TextFieldBinding) obj).value.onCreateInputConnection(new EditorInfo());
                onCreateInputConnection2.getClass();
                return onCreateInputConnection2;
            case 11:
                ((BalanceAppletTile) obj).onEvent.invoke(BalanceAppletTileViewEvent.BalanceAppletOnClickUninstalledRow.INSTANCE);
                return Unit.INSTANCE;
            case 12:
                ((BalanceHomePresenter) obj).navigator.goTo(new BalanceFeedScreen(BalanceFeedScreen.BalanceType.CashBalance));
                return Unit.INSTANCE;
            case 13:
                return Updater.mutableStateOf$default((TransfersViewModel$Companion$TransfersTab) ((TransfersPresenter) obj).initialTab);
            case 14:
                BenefitsHomePresenter benefitsHomePresenter = (BenefitsHomePresenter) obj;
                benefitsHomePresenter.analytics.track(new BankingBenefitsHomeTapViewAllActivity(), null);
                if (benefitsHomePresenter.isEvergreenEligibleTransactionExperienceEnabled()) {
                    benefitsHomePresenter.navigator.goTo(GreenEligibleTransactionsScreen.INSTANCE);
                } else {
                    zzb zzbVar = benefitsHomePresenter.benefitsOutboundNavigator;
                    String str3 = benefitsHomePresenter.stringManager.get(R.string.benefits_home_activity_section_title);
                    zzbVar.getClass();
                    str3.getClass();
                    JCAContext jCAContext = (JCAContext) zzbVar.zza;
                    jCAContext.getClass();
                    ((BetterNavigator.ScreenNavigator) jCAContext.provider).goTo(new CardActivityListScreen(str3));
                }
                return Unit.INSTANCE;
            case 15:
                ((BenefitsHomeViewModel.Content.ActivitySection) obj).embedded.onEvent.invoke(ActivityEmbeddedViewEvent.ShowMoreClicked.INSTANCE);
                return Unit.INSTANCE;
            case 16:
                return Updater.mutableStateOf$default(new BitcoinAmountPickerResult(((BitcoinDepositsScreen) ((TapToPayPresenter) obj).tapToPayErrorReporter).bitcoinAmount, null, null));
            case 17:
                BitcoinHomePresenter bitcoinHomePresenter = (BitcoinHomePresenter) obj;
                RealDependentControlStatusManager.Factory factory = bitcoinHomePresenter.dependentControlStatusManagerFactory;
                ControlType controlType = ControlType.BITCOIN;
                String str4 = bitcoinHomePresenter.args.dependentCustomerToken;
                str4.getClass();
                return factory.create(controlType, str4);
            case 18:
                BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel = (BitcoinDepositNoteViewModel) obj;
                if (bitcoinDepositNoteViewModel != null && (str2 = bitcoinDepositNoteViewModel.note) != null) {
                    str = str2;
                }
                return Updater.mutableStateOf$default(str);
            case 19:
                ((MaxCentsCappedKeypadListener) obj).onLongBackspace();
                return Unit.INSTANCE;
            case 20:
                Ui.EventReceiver eventReceiver4 = ((BlockerActionFileDownloadDialog) obj).eventReceiver;
                if (eventReceiver4 != null) {
                    eventReceiver4.sendEvent(BlockerActionFileDownloadEvent$Cancel.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 21:
                return Boolean.valueOf(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((WelcomePresenter) obj).featureFlagManager).currentValue(AmplitudeExperiments$ClientAndroidSimplifiedIntegrityChecks.INSTANCE)).enabled());
            case 22:
                String str5 = ((BankAccountLinkingViewModel) obj).prefill;
                str = str5 != null ? str5 : "";
                int length = str.length();
                return Updater.mutableStateOf$default(new TextFieldValue(str, SizeKt.TextRange(length, length), 4));
            case 23:
                String str6 = ((BirthdayViewModel) obj).prefill;
                return Updater.mutableStateOf$default(new TextFieldValue(str6 != null ? str6 : "", 0L, 6));
            case 24:
                Ui.EventReceiver eventReceiver5 = ((CashtagErrorView) obj).eventReceiver;
                if (eventReceiver5 != null) {
                    eventReceiver5.sendEvent(CashtagErrorViewEvent$NegativeClick.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 25:
                String str7 = ((CashtagViewModel) obj).cashtagPrefill;
                str = str7 != null ? str7 : "";
                int length2 = str.length();
                return Updater.mutableStateOf$default(new TextFieldValue(str, SizeKt.TextRange(length2, length2), 4));
            case 26:
                return ((StepResult$BitmapResult$Computed) ((UtilsKt) obj)).bitmap;
            case 27:
                Ui.EventReceiver eventReceiver6 = ((HelpItemMessageView) obj).eventReceiver;
                if (eventReceiver6 != null) {
                    eventReceiver6.sendEvent(HelpItemMessageViewEvent$Cancel.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 28:
                Ui.EventReceiver eventReceiver7 = ((InstrumentSelectionDetailsDialog) obj).eventReceiver;
                if (eventReceiver7 != null) {
                    eventReceiver7.sendEvent(InstrumentSelectionDetailsViewEvent$Confirm.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            default:
                Ui.EventReceiver eventReceiver8 = ((InvalidInputDialog) obj).eventReceiver;
                if (eventReceiver8 != null) {
                    eventReceiver8.sendEvent(InvalidInputViewEvent$Confirm.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }
}
