package com.squareup.cash.data.blockers;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzakk;
import com.google.android.gms.maps.zzai;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator;
import com.squareup.cash.blockers.actions.util.RealBlockerActionUriDecoder;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CustomizationDetails;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.DisclosureViewEvent;
import com.squareup.cash.card.onboarding.DisclosureViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.StampResult;
import com.squareup.cash.card.onboarding.StampSheetViewEvent;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.StyledCardViewModelKt;
import com.squareup.cash.card.onboarding.TagOrderConfirmationPresenter;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewEvent;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.screens.DisclosureExitConfirmationScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.cashapppay.viewmodels.GrantViewEvent;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeSelectDesignAsset;
import com.squareup.cash.cdf.cashcard.CashCardOrderClose;
import com.squareup.cash.cdf.cashcard.CashCardOrderConfirmDisclosure;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountTapStartGuidedSetup;
import com.squareup.cash.cdf.directdepositaccount.DirectDepositAccountViewCopy;
import com.squareup.cash.cdf.earnings.EarningsTapEarnerTool;
import com.squareup.cash.cdf.formblocker.FormBlockerInteractTap;
import com.squareup.cash.cdf.instrument.InstrumentAuthorizeOpenInTransactionTopUpEducationPage;
import com.squareup.cash.cdf.minttag.ConfirmationType;
import com.squareup.cash.cdf.minttag.MintTagOrderDismissed;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositViewHelp;
import com.squareup.cash.cdf.papermoney.PaperMoneyMapFilterApply;
import com.squareup.cash.cdf.papermoney.PaperMoneyMapFilterOpen;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.readers.AndroidSyncEntitySpecs$Payment$1;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader;
import com.squareup.cash.clientsync.readers.RealSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeInfo;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodeExpiredPresenter;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodePresenter$models$1$1;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.deposits.physical.screens.AddressSearchQuestion;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositBarcodeScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositMapScreen;
import com.squareup.cash.deposits.physical.screens.PaperMoneyDepositOnboardingScreen;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredEvent;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeExpiredViewModel;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapEvent;
import com.squareup.cash.deposits.physical.viewmodels.map.PaperMoneyDepositMapViewModel;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositMissingAccountDetailsError;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSetupEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewEvent;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositUpdateManualFormDetailsViewEvent;
import com.squareup.cash.earnings.backend.real.EarningsChartDataSource;
import com.squareup.cash.earnings.backend.real.EarningsHomeUiChartState;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$chartData$$inlined$map$1$2$1;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewEvent;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.streamdetail.EarningsStreamDetailViewEvent;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter;
import com.squareup.cash.family.familyhub.presenters.FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1;
import com.squareup.cash.family.requestsponsorship.presenters.RequestSponsorshipParsingErrorFactory;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter$models$1$1;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter$models$1$3$1;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormDateInputPresenter;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.formview.viewevents.real.RealFormAnalytics;
import com.squareup.cash.formview.viewmodels.FormCashtagViewEvent$InputChange;
import com.squareup.cash.formview.viewmodels.FormDateInputViewEvent$TextChanged;
import com.squareup.cash.formview.viewmodels.FormDateInputViewModel;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$DirectDepositTarget;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$cancelPaidInBitcoin$1;
import com.squareup.cash.growtools.presenters.manager.state.GrowToolsManagerState;
import com.squareup.cash.growtools.presenters.manager.state.OriginSpecificData;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.api.SponsorSelectionDetailsBlocker;
import com.squareup.protos.franklin.api.TagConfirmationBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.protos.franklin.ui.UiCustomer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.earnings.EarningsChartData;
import squareup.cash.earnings.EarningsHomeUIState;
import squareup.cash.earnings.EarningsTimeFrame;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealBlockersHelper$collectBlockersActions$2 implements FlowCollector {
    public final /* synthetic */ Object $handleError;
    public final /* synthetic */ Object $onLoadingStateChanged;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public RealBlockersHelper$collectBlockersActions$2(CoroutineScope coroutineScope, PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter, State state, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 16;
        this.this$0 = paperMoneyDepositMapPresenter;
        this.$handleError = state;
        this.$onLoadingStateChanged = mutableState2;
    }

    private final Object emit$com$squareup$cash$earnings$presenters$home$EarningsHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        EarningsTapEarnerTool.EarnerTool earnerTool;
        MutableState mutableState = (MutableState) this.$onLoadingStateChanged;
        EarningsHomePresenter earningsHomePresenter = (EarningsHomePresenter) this.$handleError;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        EarningsHomeViewEvent earningsHomeViewEvent = (EarningsHomeViewEvent) obj;
        if (Intrinsics.areEqual(earningsHomeViewEvent, EarningsHomeViewEvent.Back.INSTANCE)) {
            earningsHomePresenter.navigator.goTo(Back.INSTANCE);
        } else if (earningsHomeViewEvent instanceof EarningsHomeViewEvent.CallToAction) {
            earningsHomePresenter.router.route(new RoutingParams(earningsHomePresenter.args, null, null, null, null, null, 510), ((EarningsHomeViewEvent.CallToAction) earningsHomeViewEvent).clientRoute);
        } else if (earningsHomeViewEvent instanceof EarningsHomeViewEvent.DisclosureUrlClicked) {
            earningsHomePresenter.router.route(new RoutingParams(earningsHomePresenter.args, null, null, null, null, null, 510), ((EarningsHomeViewEvent.DisclosureUrlClicked) earningsHomeViewEvent).url);
        } else {
            Continuation continuation2 = null;
            if (earningsHomeViewEvent instanceof EarningsHomeViewEvent.EarnerToolTapped) {
                EarningsHomeAnalytics earningsHomeAnalytics = earningsHomePresenter.earningsHomeAnalytics;
                EarningsHomeViewEvent.EarnerToolTapped earnerToolTapped = (EarningsHomeViewEvent.EarnerToolTapped) earningsHomeViewEvent;
                EarningsHomeViewModel.EarningToolType earningToolType = earnerToolTapped.f1127type;
                Analytics analytics = earningsHomeAnalytics.analytics;
                int ordinal = earningToolType.ordinal();
                if (ordinal == 0) {
                    earnerTool = EarningsTapEarnerTool.EarnerTool.EARNER_MODE;
                } else if (ordinal == 1) {
                    earnerTool = EarningsTapEarnerTool.EarnerTool.ONBOARDING;
                } else if (ordinal == 2) {
                    earnerTool = EarningsTapEarnerTool.EarnerTool.MANAGE_CUSTOMERS;
                } else if (ordinal == 3) {
                    earnerTool = EarningsTapEarnerTool.EarnerTool.ADD_PAYCHECK;
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    earnerTool = EarningsTapEarnerTool.EarnerTool.PAYCHECK_DISTRIBUTION;
                }
                analytics.track(new EarningsTapEarnerTool(earnerTool), null);
                earningsHomePresenter.router.route(new RoutingParams(earningsHomePresenter.args, null, null, null, null, null, 510), earnerToolTapped.clientRoute);
            } else {
                if (!(earningsHomeViewEvent instanceof EarningsHomeViewEvent.SubmitEarnerMode)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                EarningsHomeViewModel.EarnerModeSheet.SubmitState submitState = (EarningsHomeViewModel.EarnerModeSheet.SubmitState) mutableState.getValue();
                EarningsHomeViewModel.EarnerModeSheet.SubmitState submitState2 = EarningsHomeViewModel.EarnerModeSheet.SubmitState.SUBMITTING;
                if (submitState == submitState2) {
                    Timber.Forest.d("Ignoring duplicate Earner Mode submit while a request is in-flight", new Object[0]);
                } else {
                    mutableState.setValue(submitState2);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsHomePresenter$models$3$1(earningsHomePresenter, earningsHomeViewEvent, mutableState, continuation2, 0), 3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$family$familyhub$presenters$FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2(Object obj, Continuation continuation) {
        FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1 familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1) {
            familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1 = (FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1) continuation;
            int i2 = familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.this$0;
                    FamilyHomePresenter.DependentDetails dependentDetails = new FamilyHomePresenter.DependentDetails((String) this.$handleError, (SponsorshipTier) this.$onLoadingStateChanged, (Recipient) obj);
                    familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(dependentDetails, familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1 = new FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyHomePresenter$models$lambda$14$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$family$requestsponsorship$presenters$SponsorSelectionDetailsPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        String str;
        SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction confirmSelectedSponsorAction;
        UiCustomer uiCustomer;
        SponsorSelectionDetailsPresenter.SmsParams smsParams;
        UiCustomer uiCustomer2;
        Object obj2 = this.$onLoadingStateChanged;
        MutableState mutableState = (MutableState) obj2;
        SponsorSelectionDetailsPresenter sponsorSelectionDetailsPresenter = (SponsorSelectionDetailsPresenter) this.$handleError;
        SampleStrategy sampleStrategy = sponsorSelectionDetailsPresenter.oneErrorPerAppSessionStrategy;
        ErrorReporter errorReporter = sponsorSelectionDetailsPresenter.errorReporter;
        SponsorSelectionDetailsScreen sponsorSelectionDetailsScreen = sponsorSelectionDetailsPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        FormViewEvent formViewEvent = (FormViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(formViewEvent, FormViewEvent.PrimaryActionSelected.INSTANCE);
        RequestSponsorshipParsingErrorFactory requestSponsorshipParsingErrorFactory = RequestSponsorshipParsingErrorFactory.INSTANCE;
        Continuation continuation2 = null;
        if (areEqual) {
            SponsorSelectionDetailsBlocker.PrimaryButtonAction primaryButtonAction = sponsorSelectionDetailsScreen.blocker.primary_button_action;
            if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) {
                SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction value = ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.ConfirmAction) primaryButtonAction).getValue();
                try {
                    UiCustomer uiCustomer3 = value.selected_sponsor;
                    if (uiCustomer3 != null) {
                        uiCustomer2 = uiCustomer3;
                    } else {
                        try {
                            throw new IllegalArgumentException("selected_sponsor");
                        } catch (Exception e) {
                            errorReporter.report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction.class), requestSponsorshipParsingErrorFactory, null), sampleStrategy);
                            uiCustomer2 = null;
                        }
                    }
                    if (uiCustomer2 != null) {
                        JobKt.launch$default(coroutineScope, null, null, new SponsorSelectionDetailsPresenter$models$1$1(value, sponsorSelectionDetailsPresenter, uiCustomer2, (MutableState) obj2, null), 3);
                    }
                } catch (Exception e2) {
                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(value.getClass()), requestSponsorshipParsingErrorFactory, null);
                }
            } else if (primaryButtonAction instanceof SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) {
                SponsorSelectionDetailsBlocker.SendSelectedSponsorSmsAction value2 = ((SponsorSelectionDetailsBlocker.PrimaryButtonAction.SendSmsAction) primaryButtonAction).getValue();
                try {
                    ProtoValidationScope protoValidationScope = new ProtoValidationScope(value2, requestSponsorshipParsingErrorFactory, sponsorSelectionDetailsPresenter);
                    String str2 = (String) protoValidationScope.reportIfNullAndContinue("message", (String) null, value2.message);
                    if (str2 != null && (str = (String) protoValidationScope.reportIfNullAndContinue("selected_sponsor_sms_number", (String) null, value2.selected_sponsor_sms_number)) != null && (confirmSelectedSponsorAction = (SponsorSelectionDetailsBlocker.ConfirmSelectedSponsorAction) protoValidationScope.reportIfNullAndContinue("action_after_sending_sms", (String) null, value2.action_after_sending_sms)) != null && (uiCustomer = (UiCustomer) protoValidationScope.reportIfNullAndContinue("action_after_sending_sms.selected_sponsor", (String) null, confirmSelectedSponsorAction.selected_sponsor)) != null) {
                        smsParams = new SponsorSelectionDetailsPresenter.SmsParams(str2, str, uiCustomer, confirmSelectedSponsorAction.invite_code);
                        if (smsParams != null) {
                            sponsorSelectionDetailsPresenter.launcher.sendSms(smsParams.message, smsParams.recipient);
                            JobKt.launch$default(coroutineScope, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1(sponsorSelectionDetailsPresenter, smsParams, mutableState, continuation2, 6), 3);
                        }
                    }
                    smsParams = null;
                    if (smsParams != null) {
                    }
                } catch (Exception e3) {
                    throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(value2.getClass()), requestSponsorshipParsingErrorFactory, null);
                }
            } else if (primaryButtonAction != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else if (Intrinsics.areEqual(formViewEvent, FormViewEvent.SecondaryActionSelected.INSTANCE)) {
            SponsorSelectionDetailsBlocker sponsorSelectionDetailsBlocker = sponsorSelectionDetailsScreen.blocker;
            try {
                SponsorSelectionDetailsBlocker.CancelSponsorSelectionAction cancelSponsorSelectionAction = sponsorSelectionDetailsBlocker.cancel_action;
                if (cancelSponsorSelectionAction == null) {
                    try {
                        throw new IllegalArgumentException("cancel_action");
                    } catch (Exception e4) {
                        errorReporter.report(RotateKt.toProtoParsingExceptionFor(e4, Reflection.factory.getOrCreateKotlinClass(SponsorSelectionDetailsBlocker.class), requestSponsorshipParsingErrorFactory, null), sampleStrategy);
                        cancelSponsorSelectionAction = null;
                    }
                }
                if (cancelSponsorSelectionAction != null) {
                    JobKt.launch$default(coroutineScope, null, null, new SponsorSelectionDetailsPresenter$models$1$3$1(sponsorSelectionDetailsPresenter, cancelSponsorSelectionAction, mutableState, null), 3);
                }
            } catch (Exception e5) {
                throw RotateKt.toProtoParsingExceptionFor(e5, Reflection.factory.getOrCreateKotlinClass(sponsorSelectionDetailsBlocker.getClass()), requestSponsorshipParsingErrorFactory, null);
            }
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$formview$presenters$FormCashtagPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        FormCashtagViewEvent$InputChange formCashtagViewEvent$InputChange = (FormCashtagViewEvent$InputChange) obj;
        if (formCashtagViewEvent$InputChange == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        JobKt.launch$default(coroutineScope, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1((FormCashtagPresenter) this.$handleError, formCashtagViewEvent$InputChange, (MutableState) this.$onLoadingStateChanged, null, 17), 3);
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$formview$presenters$FormDateInputPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        FormDateInputViewModel.Status status;
        MutableState mutableState = (MutableState) this.$onLoadingStateChanged;
        FormDateInputPresenter formDateInputPresenter = (FormDateInputPresenter) this.this$0;
        MutableState mutableState2 = (MutableState) this.$handleError;
        FormDateInputViewEvent$TextChanged formDateInputViewEvent$TextChanged = (FormDateInputViewEvent$TextChanged) obj;
        if (formDateInputViewEvent$TextChanged == null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str = formDateInputViewEvent$TextChanged.input;
        if (str.length() == 10) {
            DateTimeFormatter dateTimeFormatter = FormDateInputPresenter.ALL_OFFSET_FORMATTER;
            mutableState2.setValue(formDateInputPresenter.parse(str));
            mutableState.setValue(((SubmitFormRequest.ElementResult.DateInputResult) mutableState2.getValue()) == null ? FormDateInputViewModel.Status.OUT_OF_RANGE : FormDateInputViewModel.Status.VALID);
        } else {
            SubmitFormRequest.ElementResult.DateInputResult dateInputResult = new SubmitFormRequest.ElementResult.DateInputResult((Integer) null, (Integer) null, (Integer) null, 15);
            DateTimeFormatter dateTimeFormatter2 = FormDateInputPresenter.ALL_OFFSET_FORMATTER;
            mutableState2.setValue(dateInputResult);
            if (str.length() == 0) {
                Boolean bool = formDateInputPresenter.element.is_optional;
                status = bool != null ? bool.booleanValue() : false ? FormDateInputViewModel.Status.VALID : FormDateInputViewModel.Status.WAITING_FOR_INPUT;
            } else {
                status = FormDateInputViewModel.Status.WAITING_FOR_INPUT;
            }
            mutableState.setValue(status);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$formview$presenters$FormPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        FormPresenter formPresenter = (FormPresenter) this.$onLoadingStateChanged;
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        FormViewEvent formViewEvent = (FormViewEvent) obj;
        String str = (String) this.$handleError;
        Continuation continuation2 = null;
        if (str != null) {
            RealFormAnalytics realFormAnalytics = formPresenter.formAnalytics;
            formViewEvent.getClass();
            FormBlockerInteractTap formBlockerInteractTap = ((formViewEvent instanceof FormViewEvent.PrimaryActionSelected) || formViewEvent.equals(FormViewEvent.SecondaryActionSelected.INSTANCE) || formViewEvent.equals(FormViewEvent.HelpActionSelected.INSTANCE)) ? new FormBlockerInteractTap(str) : null;
            if (formBlockerInteractTap != null) {
                realFormAnalytics.analytics.track(formBlockerInteractTap, null);
            }
        }
        BlockerAction blockerAction = formPresenter.toBlockerAction(formPresenter.mapNavigationEventToAction(formViewEvent));
        if (blockerAction != null) {
            JobKt.launch$default(coroutineScope, null, null, new FormCashtag.AnonymousClass8.AnonymousClass2(formPresenter, blockerAction, continuation2, 21), 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x0636, code lost:
    
        if (r4.emit((java.util.List) r12, r2) == r1) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x069b, code lost:
    
        if (r3.emit(r0, r2) != r1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x068d, code lost:
    
        if (r0 == r1) goto L304;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:264:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARN: Type inference failed for: r1v100, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v76, types: [com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel$Ready] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:272:0x0611 -> B:260:0x0616). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TouchData touchData;
        ShadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
        int i;
        ShadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1;
        int i2;
        RealSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1 realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1;
        int i3;
        RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1 realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1;
        int i4;
        FlowCollector flowCollector;
        RealDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1 realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1;
        int i5;
        Iterator it;
        FlowCollector flowCollector2;
        List list;
        Collection collection;
        int i6;
        int i7;
        int i8;
        GetPaperCashDepositBarcodeResponse.Success success;
        BenefitExplainerScreen benefitExplainerScreen;
        String str;
        String str2;
        RealEarningsChartRepository$chartData$$inlined$map$1$2$1 realEarningsChartRepository$chartData$$inlined$map$1$2$1;
        int i9;
        Object ready;
        int i10 = this.$r8$classId;
        StampSheetViewEvent.Cancel cancel = StampSheetViewEvent.Cancel.INSTANCE;
        int i11 = 0;
        int i12 = 0;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        Object obj3 = this.$handleError;
        Object obj4 = this.$onLoadingStateChanged;
        r4 = null;
        BenefitExplainerScreen benefitExplainerScreen2 = null;
        switch (i10) {
            case 0:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                    ((RealBlockersHelper) obj2).navigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                    return Unit.INSTANCE;
                }
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                    Object invoke = ((Function2) obj3).invoke(blockersAction, continuation);
                    return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.INSTANCE;
                }
                if (blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner) {
                    Object invoke2 = ((Function2) obj4).invoke(Boolean.valueOf(((BlockersHelper.BlockersAction.ToggleSpinner) blockersAction).show), continuation);
                    return invoke2 == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke2 : Unit.INSTANCE;
                }
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) blockersAction, "Unexpected action: ");
                return null;
            case 1:
                MutableState mutableState = (MutableState) obj4;
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj3;
                Analytics analytics = (Analytics) disclosurePresenter.analytics;
                DisclosureScreen disclosureScreen = (DisclosureScreen) disclosurePresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                DisclosureViewEvent disclosureViewEvent = (DisclosureViewEvent) obj;
                if (disclosureViewEvent instanceof DisclosureViewEvent.SubmitViewClick) {
                    mutableState.setValue(disclosurePresenter.buildDisclosureViewModel(true, ((DisclosureViewModel) mutableState.getValue()).hasFullyScrolled));
                    JobKt.launch$default(coroutineScope, null, null, new PlaidLinkView.AnonymousClass2(disclosurePresenter, mutableState, (Continuation) null, 19), 3);
                } else if (disclosureViewEvent instanceof DisclosureViewEvent.OnScrollChange) {
                    mutableState.setValue(disclosurePresenter.buildDisclosureViewModel(((DisclosureViewModel) mutableState.getValue()).isLoading, true));
                } else if (disclosureViewEvent instanceof DisclosureViewEvent.Exit) {
                    screenNavigator.goTo(disclosureScreen.blockersData.exitScreen);
                } else if (Intrinsics.areEqual(disclosureViewEvent, DisclosureViewEvent.OnBack.INSTANCE)) {
                    screenNavigator.goTo(new DisclosureExitConfirmationScreen(disclosureScreen.blockersData, disclosureScreen.cancelDialogText, disclosureScreen.cancelDialogConfirmText, disclosureScreen.cancelDialogCancelText));
                } else if (disclosureViewEvent instanceof DisclosureViewEvent.OpenUrl) {
                    ((IntentLauncher) disclosurePresenter.launcher).launchUrlInInternalBrowser(((DisclosureViewEvent.OpenUrl) disclosureViewEvent).url);
                } else if (disclosureViewEvent instanceof DisclosureViewEvent.OnDialogPositive) {
                    analytics.track(new CashCardOrderClose(), null);
                } else {
                    if (!(disclosureViewEvent instanceof DisclosureViewEvent.OnCloseDialog) && !Intrinsics.areEqual(disclosureViewEvent, DisclosureViewEvent.OnDialogNegative.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    analytics.track(new CashCardOrderConfirmDisclosure(), null);
                }
                return Unit.INSTANCE;
            case 2:
                CardStudio cardStudio = (CardStudio) obj;
                ((MutableState) obj3).setValue((cardStudio == null || (touchData = cardStudio.touch_data) == null) ? new CustomizationDetails() : StyledCardViewModelKt.toCustomizationDetails(touchData, (Map) obj2));
                ((MutableState) obj4).setValue(Boolean.valueOf(cardStudio != null ? cardStudio.cashtag_enabled : true));
                return Unit.INSTANCE;
            case 3:
                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) obj;
                Function1 function1 = (Function1) obj2;
                MutableState mutableState2 = (MutableState) obj3;
                String str3 = paymentDeviceItemViewModel != null ? paymentDeviceItemViewModel.id : null;
                int i13 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                if (!Intrinsics.areEqual(str3, (String) mutableState2.getValue())) {
                    if (((String) mutableState2.getValue()) != null) {
                        function1.invoke(PaymentDeviceCustomizationViewEvent.CloseProductDetailsPage.INSTANCE);
                    }
                    if (str3 != null) {
                        function1.invoke(new PaymentDeviceCustomizationViewEvent.DeviceOptionSelected(str3));
                    }
                    mutableState2.setValue(str3);
                }
                ((MutableState) obj4).setValue(paymentDeviceItemViewModel != null ? paymentDeviceItemViewModel.productDetailsPage : null);
                return Unit.INSTANCE;
            case 4:
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) ((MusicPresenter) obj2).navigator;
                MutableState mutableState3 = (MutableState) obj3;
                StampSheetViewEvent stampSheetViewEvent = (StampSheetViewEvent) obj;
                if (Intrinsics.areEqual(stampSheetViewEvent, cancel)) {
                    screenNavigator2.goTo(new Finish(new StampResult(null)));
                } else if (stampSheetViewEvent instanceof StampSheetViewEvent.SelectStamp) {
                    List list2 = (List) mutableState3.getValue();
                    Stamp stamp = ((StampSheetViewEvent.SelectStamp) stampSheetViewEvent).stamp;
                    mutableState3.setValue(list2.contains(stamp) ? CollectionsKt.minus((List) mutableState3.getValue(), stamp) : ((List) mutableState3.getValue()).size() < 5 ? CollectionsKt.plus((Collection) mutableState3.getValue(), (Object) stamp) : (List) mutableState3.getValue());
                    MutableState mutableState4 = (MutableState) obj4;
                    mutableState4.setValue(StampSheetViewModel.copy$default((StampSheetViewModel) mutableState4.getValue(), (List) mutableState3.getValue(), ((List) mutableState3.getValue()).size() == 5));
                } else {
                    if (!(stampSheetViewEvent instanceof StampSheetViewEvent.Done)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list3 = ((StampSheetViewEvent.Done) stampSheetViewEvent).stamp;
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        new CashCardCustomizeSelectDesignAsset(((Stamp) it2.next()).name);
                    }
                    screenNavigator2.goTo(new Finish(new StampResult(list3)));
                }
                return Unit.INSTANCE;
            case 5:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                PatternSignatureStampsV2 patternSignatureStampsV2 = (PatternSignatureStampsV2) musicPresenter.musicPlayer;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                MutableState mutableState5 = (MutableState) obj3;
                StampSheetViewEvent stampSheetViewEvent2 = (StampSheetViewEvent) obj;
                if (Intrinsics.areEqual(stampSheetViewEvent2, cancel)) {
                    screenNavigator3.giveAnswer(patternSignatureStampsV2.question, new StampResult(null));
                } else if (stampSheetViewEvent2 instanceof StampSheetViewEvent.SelectStamp) {
                    List list4 = (List) mutableState5.getValue();
                    Stamp stamp2 = ((StampSheetViewEvent.SelectStamp) stampSheetViewEvent2).stamp;
                    mutableState5.setValue(list4.contains(stamp2) ? CollectionsKt.minus((List) mutableState5.getValue(), stamp2) : ((List) mutableState5.getValue()).size() < 5 ? CollectionsKt.plus((Collection) mutableState5.getValue(), (Object) stamp2) : (List) mutableState5.getValue());
                    MutableState mutableState6 = (MutableState) obj4;
                    mutableState6.setValue(StampSheetViewModel.copy$default((StampSheetViewModel) mutableState6.getValue(), (List) mutableState5.getValue(), ((List) mutableState5.getValue()).size() == 5));
                } else {
                    if (!(stampSheetViewEvent2 instanceof StampSheetViewEvent.Done)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list5 = ((StampSheetViewEvent.Done) stampSheetViewEvent2).stamp;
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        new CashCardCustomizeSelectDesignAsset(((Stamp) it3.next()).name);
                    }
                    screenNavigator3.giveAnswer(patternSignatureStampsV2.question, new StampResult(list5));
                }
                return Unit.INSTANCE;
            case 6:
                TagOrderConfirmationPresenter tagOrderConfirmationPresenter = (TagOrderConfirmationPresenter) obj3;
                MutableState mutableState7 = (MutableState) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj2;
                TagOrderConfirmationViewEvent tagOrderConfirmationViewEvent = (TagOrderConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(tagOrderConfirmationViewEvent, TagOrderConfirmationViewEvent.Close.INSTANCE)) {
                    Analytics analytics2 = tagOrderConfirmationPresenter.analytics;
                    TagOrderConfirmationScreen tagOrderConfirmationScreen = tagOrderConfirmationPresenter.args;
                    TagConfirmationBlocker tagConfirmationBlocker = tagOrderConfirmationScreen.blocker;
                    BlockersData blockersData = tagOrderConfirmationScreen.blockersData;
                    String str4 = tagConfirmationBlocker.tag_theme_token;
                    if (str4 == null) {
                        str4 = "";
                    }
                    TagConfirmationBlocker.TagConfirmationBlockerStyle tagConfirmationBlockerStyle = tagConfirmationBlocker.style;
                    analytics2.track(new MintTagOrderDismissed(str4, (tagConfirmationBlockerStyle == null ? -1 : TagOrderConfirmationPresenter.WhenMappings.$EnumSwitchMapping$0[tagConfirmationBlockerStyle.ordinal()]) == 1 ? ConfirmationType.FAILURE : ConfirmationType.SUCCESS, blockersData.flowToken), null);
                    tagOrderConfirmationPresenter.navigator.goTo(blockersData.exitScreen);
                } else {
                    if (!Intrinsics.areEqual(tagOrderConfirmationViewEvent, TagOrderConfirmationViewEvent.Continue.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!((Boolean) mutableState7.getValue()).booleanValue()) {
                        mutableState7.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope2, null, null, new PlaidLinkView.AnonymousClass2(tagOrderConfirmationPresenter, mutableState7, (Continuation) null, 23), 3);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState8 = (MutableState) obj4;
                GrantPresenter grantPresenter = (GrantPresenter) obj3;
                BlockersScreens.CashAppPayGrant cashAppPayGrant = grantPresenter.args;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj2;
                GrantViewEvent grantViewEvent = (GrantViewEvent) obj;
                if (grantViewEvent instanceof GrantViewEvent.BlockerActionEvent) {
                    JobKt.launch$default(coroutineScope3, null, null, new VerifyCheckDepositPresenter$models$3$1(grantPresenter, ((GrantViewEvent.BlockerActionEvent) grantViewEvent).blockerAction, mutableState8, (Continuation) null), 3);
                } else if (Intrinsics.areEqual(grantViewEvent, GrantViewEvent.Dismiss.INSTANCE)) {
                    if (!(((GrantViewModel) mutableState8.getValue()) instanceof GrantViewModel.SubmissionInFlight)) {
                        BlockerAction dismissAction = cashAppPayGrant.getDismissAction();
                        if (dismissAction != null) {
                            JobKt.launch$default(coroutineScope3, null, null, new VerifyCheckDepositPresenter$models$3$1(grantPresenter, dismissAction, mutableState8, (Continuation) null), 3);
                        } else {
                            grantPresenter.blockerFlowAnalytics.onFlowCancelled(cashAppPayGrant.getBlockersData());
                            grantPresenter.navigator.goTo(cashAppPayGrant.getBlockersData().exitScreen);
                        }
                    }
                } else if (Intrinsics.areEqual(grantViewEvent, GrantViewEvent.InTransactionTopUpInfoClicked.INSTANCE)) {
                    grantPresenter.analytics.track(new InstrumentAuthorizeOpenInTransactionTopUpEducationPage(), null);
                    mutableState8.setValue(GrantViewModel.InTransactionTopUpInfo.INSTANCE);
                } else if (Intrinsics.areEqual(grantViewEvent, GrantViewEvent.InTransactionTopUpInfoClosed.INSTANCE) || Intrinsics.areEqual(grantViewEvent, GrantViewEvent.OnDisplayInterstitialComplete.INSTANCE)) {
                    mutableState8.setValue(grantPresenter.initialMainViewModel);
                } else {
                    if (!(grantViewEvent instanceof GrantViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockerAction decode = ((RealBlockerActionUriDecoder) grantPresenter.blockerActionUriDecoder).decode(((GrantViewEvent.UrlClicked) grantViewEvent).url);
                    if (decode != null) {
                        JobKt.launch$default(coroutineScope3, null, null, new VerifyCheckDepositPresenter$models$3$1(grantPresenter, decode, mutableState8, (Continuation) null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof ShadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) {
                    shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = (ShadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) continuation;
                    int i14 = shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                    if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                        shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = i14 - PKIFailureInfo.systemUnavail;
                        Object obj5 = shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            List allEntitiesOfType = ((ShadowedSyncEntityStore) obj3).getAllEntitiesOfType((SyncEntityType) obj4);
                            shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj2).emit(allEntitiesOfType, shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = new ShadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                Object obj52 = shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shadowedSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 9:
                if (continuation instanceof ShadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) {
                    shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 = (ShadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) continuation;
                    int i15 = shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label = i15 - PKIFailureInfo.systemUnavail;
                        Object obj6 = shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            List allValuesOfType = ((ShadowedSyncEntityStore) obj3).getAllValuesOfType((SyncValueType) obj4);
                            shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj2).emit(allValuesOfType, shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj6);
                        }
                        return Unit.INSTANCE;
                    }
                }
                shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 = new ShadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                Object obj62 = shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = shadowedSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 10:
                if (continuation instanceof RealSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1) {
                    realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1 = (RealSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1) continuation;
                    int i16 = realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.label;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            FlowCollector flowCollector3 = (FlowCollector) obj2;
                            List list6 = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                            Iterator it4 = list6.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(((AndroidSyncEntitySpecs$Payment$1) obj3).getPayload(((RealSyncEntityReader) obj4).entityDecryptor.decryptEntity((SyncEntity) it4.next()).entityProto));
                            }
                            realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(arrayList, realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj7);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1 = new RealSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realSyncEntityReader$getAllEntitiesFlow$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 11:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj3;
                MutableState mutableState9 = (MutableState) obj4;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj2;
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                if ((amountPickerViewEvent instanceof AmountPickerViewEvent$Full$Close) || (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$SystemBack)) {
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(back);
                } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted) {
                    mutableState9.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope4, null, null, new RealProfileManager$setPhoto$2(localPosCheckInPresenter, amountPickerViewEvent, mutableState9, null, 14), 3);
                }
                return Unit.INSTANCE;
            case 12:
                if (continuation instanceof RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1) {
                    realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1 = (RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1) continuation;
                    int i17 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label;
                    if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                        realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            flowCollector = (FlowCollector) obj2;
                            realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector;
                            realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                            realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label = 1;
                            obj8 = RealDocumentEntitiesMapper.access$toProfileDocumentModel((RealDocumentEntitiesMapper) obj3, (Document) obj4, (Recipient) obj, realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1);
                            break;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    SafeTrace.throwOnFailure(obj8);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i12 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.I$0;
                            flowCollector = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj8);
                        }
                        realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.L$4 = null;
                        realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.I$0 = i12;
                        realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1 = new RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj82 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.L$4 = null;
                realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.I$0 = i12;
                realDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1.label = 2;
            case 13:
                if (continuation instanceof RealDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1) {
                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1 = (RealDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1) continuation;
                    int i18 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label;
                    if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                        realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            FlowCollector flowCollector4 = (FlowCollector) obj2;
                            List list7 = (List) obj3;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                            it = list7.iterator();
                            flowCollector2 = flowCollector4;
                            list = (List) obj;
                            collection = arrayList2;
                            i6 = 0;
                            i7 = 0;
                            i8 = 0;
                            if (it.hasNext()) {
                            }
                            return coroutineSingletons6;
                        }
                        if (i5 != 1) {
                            if (i5 == 2) {
                                SafeTrace.throwOnFailure(obj9);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i19 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$3;
                        int i20 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$2;
                        int i21 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$1;
                        int i22 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$0;
                        collection = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$13;
                        it = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$10;
                        Collection collection2 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$9;
                        list = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$6;
                        flowCollector2 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$4;
                        SafeTrace.throwOnFailure(obj9);
                        int i23 = i19;
                        i7 = i20;
                        i11 = i22;
                        collection.add((ProfileDocumentModel) obj9);
                        i6 = i21;
                        collection = collection2;
                        i8 = i23;
                        if (it.hasNext()) {
                            Document document = (Document) it.next();
                            List list8 = list;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                            Iterator it5 = list8.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(((Recipient) it5.next()).customerId);
                            }
                            int indexOf = arrayList3.indexOf(document.owner_token);
                            Recipient recipient = indexOf != -1 ? (Recipient) list.get(indexOf) : null;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$4 = flowCollector2;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$6 = list;
                            Collection collection3 = collection;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$9 = collection3;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$10 = it;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$13 = collection3;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$0 = i11;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$1 = i6;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$2 = i7;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$3 = i8;
                            realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label = 1;
                            Object access$toProfileDocumentModel = RealDocumentEntitiesMapper.access$toProfileDocumentModel((RealDocumentEntitiesMapper) obj4, document, recipient, realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1);
                            if (access$toProfileDocumentModel != coroutineSingletons6) {
                                int i24 = i8;
                                i21 = i6;
                                obj9 = access$toProfileDocumentModel;
                                i23 = i24;
                                collection2 = collection;
                                collection.add((ProfileDocumentModel) obj9);
                                i6 = i21;
                                collection = collection2;
                                i8 = i23;
                                if (it.hasNext()) {
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$4 = null;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$6 = null;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$9 = null;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$10 = null;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.L$13 = null;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.I$0 = i11;
                                    realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label = 2;
                                    break;
                                }
                            }
                        }
                        return coroutineSingletons6;
                    }
                }
                realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1 = new RealDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realDocumentEntitiesMapper$documentsForCategory$lambda$0$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 14:
                PaperMoneyDepositBarcodeExpiredPresenter paperMoneyDepositBarcodeExpiredPresenter = (PaperMoneyDepositBarcodeExpiredPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator4 = paperMoneyDepositBarcodeExpiredPresenter.navigator;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj2;
                PaperMoneyDepositBarcodeExpiredEvent paperMoneyDepositBarcodeExpiredEvent = (PaperMoneyDepositBarcodeExpiredEvent) obj;
                if (Intrinsics.areEqual(paperMoneyDepositBarcodeExpiredEvent, PaperMoneyDepositBarcodeExpiredEvent.ButtonClicked.INSTANCE)) {
                    if (paperMoneyDepositBarcodeExpiredPresenter.args.reload) {
                        ((MutableState) obj4).setValue(PaperMoneyDepositBarcodeExpiredViewModel.Loading.INSTANCE);
                        JobKt.launch$default(coroutineScope5, null, null, new GooglePayPresenter$models$1$1(paperMoneyDepositBarcodeExpiredPresenter, r4, 8), 3);
                    } else {
                        screenNavigator4.goTo(back);
                    }
                } else {
                    if (!Intrinsics.areEqual(paperMoneyDepositBarcodeExpiredEvent, PaperMoneyDepositBarcodeExpiredEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator4.goTo(back);
                }
                return Unit.INSTANCE;
            case 15:
                MutableState mutableState10 = (MutableState) obj4;
                SelectCustomerPresenter selectCustomerPresenter = (SelectCustomerPresenter) obj3;
                PaperMoneyDepositBarcodeScreen paperMoneyDepositBarcodeScreen = (PaperMoneyDepositBarcodeScreen) selectCustomerPresenter.profileManager;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) selectCustomerPresenter.navigator;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj2;
                PaperMoneyDepositBarcodeEvent paperMoneyDepositBarcodeEvent = (PaperMoneyDepositBarcodeEvent) obj;
                if (paperMoneyDepositBarcodeEvent instanceof PaperMoneyDepositBarcodeEvent.BarcodeParams) {
                    JobKt.launch$default(coroutineScope6, null, null, new PaperMoneyDepositBarcodePresenter$models$1$1(selectCustomerPresenter, paperMoneyDepositBarcodeEvent, mutableState10, null), 3);
                } else if (paperMoneyDepositBarcodeEvent instanceof PaperMoneyDepositBarcodeEvent.OpenUrl) {
                    ((IntentLauncher) selectCustomerPresenter.sponsorshipStateProvider).launchUrlInInternalBrowser(((PaperMoneyDepositBarcodeEvent.OpenUrl) paperMoneyDepositBarcodeEvent).url);
                } else if (paperMoneyDepositBarcodeEvent instanceof PaperMoneyDepositBarcodeEvent.HelpClick) {
                    String str5 = ((PaperMoneyDepositBarcodeEvent.HelpClick) paperMoneyDepositBarcodeEvent).url;
                    if (str5 != null) {
                        Analytics analytics3 = (Analytics) selectCustomerPresenter.currentCustomerToken;
                        PaperMoneyDepositViewHelp.AppLocation appLocation = PaperMoneyDepositViewHelp.AppLocation.BARCODE;
                        analytics3.track(new PaperMoneyDepositViewHelp(), null);
                        ((RealRouter) selectCustomerPresenter.controller).route(new RoutingParams(null, null, null, null, null, null, 511), str5);
                    } else {
                        screenNavigator5.goTo(new PaperMoneyDepositOnboardingScreen(paperMoneyDepositBarcodeScreen.paperCashDepositBlocker, paperMoneyDepositBarcodeScreen.blockersData));
                    }
                } else if (paperMoneyDepositBarcodeEvent instanceof PaperMoneyDepositBarcodeEvent.Exit) {
                    screenNavigator5.goTo(back);
                } else {
                    if (!(paperMoneyDepositBarcodeEvent instanceof PaperMoneyDepositBarcodeEvent.FeeInformationClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) mutableState10.getValue();
                    r4 = paperMoneyDepositBarcodeViewModel instanceof PaperMoneyDepositBarcodeViewModel.Ready ? (PaperMoneyDepositBarcodeViewModel.Ready) paperMoneyDepositBarcodeViewModel : 0;
                    if (r4 != 0 && (success = r4.success) != null && (benefitExplainerScreen = success.explainer_screen) != null) {
                        screenNavigator5.goTo(new AtmPmdExplainerScreen(AtmPmdExplainerScreen.AtmPmdExplainerOrigin.PMD, benefitExplainerScreen.elements, benefitExplainerScreen.footer_elements, paperMoneyDepositBarcodeScreen.blockersData));
                    }
                }
                return Unit.INSTANCE;
            case 16:
                PaperMoneyDepositMapPresenter paperMoneyDepositMapPresenter = (PaperMoneyDepositMapPresenter) obj2;
                Analytics analytics4 = paperMoneyDepositMapPresenter.analytics;
                PaperMoneyDepositMapScreen paperMoneyDepositMapScreen = paperMoneyDepositMapPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator6 = paperMoneyDepositMapPresenter.navigator;
                PaperMoneyDepositMapEvent paperMoneyDepositMapEvent = (PaperMoneyDepositMapEvent) obj;
                if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.BackClick.INSTANCE)) {
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.ExitClick.INSTANCE)) {
                    screenNavigator6.goTo(back);
                } else if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.HelpClick.INSTANCE)) {
                    BarcodeInfo barcodeInfo = (BarcodeInfo) ((State) obj3).getValue();
                    if (barcodeInfo != null) {
                        BarcodeInfo.Success success2 = barcodeInfo instanceof BarcodeInfo.Success ? (BarcodeInfo.Success) barcodeInfo : null;
                        GetPaperCashDepositBarcodeResponse.Success success3 = success2 != null ? success2.response : null;
                        if (success3 != null) {
                            benefitExplainerScreen2 = success3.explainer_screen;
                        }
                    }
                    if (benefitExplainerScreen2 != null) {
                        screenNavigator6.goTo(new AtmPmdExplainerScreen(AtmPmdExplainerScreen.AtmPmdExplainerOrigin.PMD, benefitExplainerScreen2.elements, benefitExplainerScreen2.footer_elements, paperMoneyDepositMapScreen.blockersData));
                    } else {
                        screenNavigator6.goTo(new PaperMoneyDepositOnboardingScreen(paperMoneyDepositMapScreen.paperCashDepositBlocker, paperMoneyDepositMapScreen.blockersData));
                    }
                } else if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.SearchClick.INSTANCE)) {
                    PaperCashDepositBlocker.SearchScreen searchScreen = paperMoneyDepositMapScreen.paperCashDepositBlocker.search_screen;
                    searchScreen.getClass();
                    String str6 = searchScreen.search_bar_placeholder;
                    str6.getClass();
                    String str7 = searchScreen.explanation_title_text;
                    str7.getClass();
                    screenNavigator6.askQuestion(new AddressSearchQuestion(), new ProfileQueries$$ExternalSyntheticLambda13(14, new PhysicalCashDepositAddressEntryScreen.SearchScreen(str6, str7, searchScreen.explanation_detail_text, searchScreen.recent_section_header_text, searchScreen.results_section_header_text), paperMoneyDepositMapPresenter));
                } else if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.ShowBarcodeClick.INSTANCE)) {
                    screenNavigator6.goTo(new PaperMoneyDepositBarcodeScreen(paperMoneyDepositMapScreen.paperCashDepositBlocker, PaperMoneyDepositBarcodeScreen.Origin.MAP, paperMoneyDepositMapScreen.blockersData));
                } else if (Intrinsics.areEqual(paperMoneyDepositMapEvent, PaperMoneyDepositMapEvent.ViewFilters.INSTANCE)) {
                    analytics4.track(new PaperMoneyMapFilterOpen(), null);
                } else {
                    if (!(paperMoneyDepositMapEvent instanceof PaperMoneyDepositMapEvent.UpdateFilters)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list9 = ((PaperMoneyDepositMapEvent.UpdateFilters) paperMoneyDepositMapEvent).filters;
                    analytics4.track(new PaperMoneyMapFilterApply(Boolean.valueOf(list9.contains(PaperMoneyDepositMapViewModel.DepositMethodFilter.BarcodeScan)), Boolean.valueOf(list9.contains(PaperMoneyDepositMapViewModel.DepositMethodFilter.CardSwipe))), null);
                    ((MutableState) obj4).setValue(list9);
                }
                return Unit.INSTANCE;
            case 17:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                MutableState mutableState11 = (MutableState) obj3;
                DirectDepositSingleInputViewEvent directDepositSingleInputViewEvent = (DirectDepositSingleInputViewEvent) obj;
                if (Intrinsics.areEqual(directDepositSingleInputViewEvent, DirectDepositSingleInputViewEvent.ButtonClick.INSTANCE)) {
                    screenNavigator7.giveAnswer((AskedQuestion) cardStudioPresenter.cardStudioQueries, new PaycheckDepositAllocation.CurrencyAmount(Moneys.parseMoneyFromString$default(((InputFieldText) mutableState11.getValue()).getValue().toString(), (CurrencyCode) ((MutableState) obj4).getValue()), ((InputFieldText) mutableState11.getValue()).getValue().toString()));
                } else if (directDepositSingleInputViewEvent instanceof DirectDepositSingleInputViewEvent.InputChanged) {
                    mutableState11.setValue(((DirectDepositSingleInputViewEvent.InputChanged) directDepositSingleInputViewEvent).inputFieldText);
                } else {
                    if (!Intrinsics.areEqual(directDepositSingleInputViewEvent, DirectDepositSingleInputViewEvent.NavigationIconClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator7.goTo(back);
                }
                return Unit.INSTANCE;
            case 18:
                State state = (State) obj4;
                DirectDepositSetupPresenter directDepositSetupPresenter = (DirectDepositSetupPresenter) obj3;
                RealRouter realRouter = directDepositSetupPresenter.router;
                ErrorReporter errorReporter = directDepositSetupPresenter.errorReporter;
                boolean z = directDepositSetupPresenter.reportNullAccountDetails;
                RealClipboardManager realClipboardManager = directDepositSetupPresenter.clipboardManager;
                Analytics analytics5 = directDepositSetupPresenter.analytics;
                CoroutineScope coroutineScope7 = (CoroutineScope) obj2;
                DirectDepositSetupEvent directDepositSetupEvent = (DirectDepositSetupEvent) obj;
                boolean areEqual = Intrinsics.areEqual(directDepositSetupEvent, DirectDepositSetupEvent.AccountNumberClick.INSTANCE);
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (areEqual) {
                    DirectDepositAccount directDepositAccount = (DirectDepositAccount) state.getValue();
                    if (directDepositAccount != null && (str2 = directDepositAccount.account_number) != null) {
                        analytics5.track(new DirectDepositAccountViewCopy(DirectDepositAccountViewCopy.CopiedValue.ACCOUNT_NUMBER), null);
                        realClipboardManager.copy("Account number", str2);
                    } else if (z) {
                        errorReporter.report(DirectDepositMissingAccountDetailsError.INSTANCE, defaultSamplingStrategy);
                    }
                } else if (Intrinsics.areEqual(directDepositSetupEvent, DirectDepositSetupEvent.RoutingNumberClick.INSTANCE)) {
                    DirectDepositAccount directDepositAccount2 = (DirectDepositAccount) state.getValue();
                    if (directDepositAccount2 != null && (str = directDepositAccount2.routing_number) != null) {
                        analytics5.track(new DirectDepositAccountViewCopy(DirectDepositAccountViewCopy.CopiedValue.ROUTING_NUMBER), null);
                        realClipboardManager.copy("Routing number", str);
                    } else if (z) {
                        errorReporter.report(DirectDepositMissingAccountDetailsError.INSTANCE, defaultSamplingStrategy);
                    }
                } else if (Intrinsics.areEqual(directDepositSetupEvent, DirectDepositSetupEvent.GuidedSetupClick.INSTANCE)) {
                    analytics5.track(new DirectDepositAccountTapStartGuidedSetup(), null);
                    DirectDepositSetupPresenter.access$completeScenario(directDepositSetupPresenter, ClientScenario.DIRECT_DEPOSIT_SWITCH_VIA_PAYROLL);
                } else if (Intrinsics.areEqual(directDepositSetupEvent, DirectDepositSetupEvent.ManualSetupClick.INSTANCE)) {
                    JobKt.launch$default(coroutineScope7, null, null, new GooglePayPresenter$models$1$1(directDepositSetupPresenter, r4, 12), 3);
                } else if (Intrinsics.areEqual(directDepositSetupEvent, DirectDepositSetupEvent.Close.INSTANCE)) {
                    BetterNavigator.ScreenNavigator screenNavigator8 = directDepositSetupPresenter.navigator;
                    ?? r1 = directDepositSetupPresenter.args.exitScreen;
                    if (r1 != 0) {
                        back = r1;
                    }
                    screenNavigator8.goTo(back);
                } else if (directDepositSetupEvent instanceof DirectDepositSetupEvent.DisclosureUrlClicked) {
                    realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((DirectDepositSetupEvent.DisclosureUrlClicked) directDepositSetupEvent).url);
                } else {
                    if (!(directDepositSetupEvent instanceof DirectDepositSetupEvent.HelpClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    RealRouter.route$default(realRouter, new ClientRoute.ViewSupportNode("SH_SUB_DIRECT_DEPOSIT"));
                }
                return Unit.INSTANCE;
            case 19:
                DirectDepositUpdateManualFormDetailsViewEvent directDepositUpdateManualFormDetailsViewEvent = (DirectDepositUpdateManualFormDetailsViewEvent) obj;
                if (!(directDepositUpdateManualFormDetailsViewEvent instanceof DirectDepositUpdateManualFormDetailsViewEvent.CheckAddSignature) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.CreateForm.INSTANCE) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditCompanyName.INSTANCE) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditName.INSTANCE) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.EditPaycheckAmount.INSTANCE) && !Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.ViewExistingForm.INSTANCE)) {
                    if (Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.Exit.INSTANCE)) {
                        ((BetterNavigator.ScreenNavigator) ((LocalEditorialPresenter) obj2).navigator).goTo(back);
                    } else {
                        if (!Intrinsics.areEqual(directDepositUpdateManualFormDetailsViewEvent, DirectDepositUpdateManualFormDetailsViewEvent.RetryLoadingForm.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((MutableState) obj3).setValue(null);
                        MutableState mutableState12 = (MutableState) obj4;
                        mutableState12.setValue(VersionedKt.update((Versioned) mutableState12.getValue(), Unit.INSTANCE));
                    }
                }
                return Unit.INSTANCE;
            case 20:
                if (continuation instanceof RealEarningsChartRepository$chartData$$inlined$map$1$2$1) {
                    realEarningsChartRepository$chartData$$inlined$map$1$2$1 = (RealEarningsChartRepository$chartData$$inlined$map$1$2$1) continuation;
                    int i25 = realEarningsChartRepository$chartData$$inlined$map$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        realEarningsChartRepository$chartData$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realEarningsChartRepository$chartData$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realEarningsChartRepository$chartData$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            FlowCollector flowCollector5 = (FlowCollector) obj2;
                            EarningsHomeUiChartState earningsHomeUiChartState = (EarningsHomeUiChartState) obj;
                            DateFilter dateFilter = (DateFilter) obj3;
                            EarningsTimeFrame earningsTimeFrame = (EarningsTimeFrame) obj4;
                            EarningsHomeUIState earningsHomeUIState = earningsHomeUiChartState.homeUiState;
                            if (!earningsHomeUiChartState.shouldShowChart) {
                                ready = new EarningsChartDataSource.Ready(earningsHomeUIState != null ? zzakk.access$currentMonthChartMatching(earningsHomeUIState, dateFilter) : null);
                            } else if (!(dateFilter instanceof DateFilter.Monthly)) {
                                ready = new EarningsChartDataSource.Fetch(earningsTimeFrame);
                            } else if (earningsHomeUIState == null) {
                                ready = EarningsChartDataSource.Loading.INSTANCE;
                            } else {
                                EarningsChartData access$currentMonthChartMatching = zzakk.access$currentMonthChartMatching(earningsHomeUIState, dateFilter);
                                ready = access$currentMonthChartMatching != null ? new EarningsChartDataSource.Ready(access$currentMonthChartMatching) : new EarningsChartDataSource.Fetch(earningsTimeFrame);
                            }
                            realEarningsChartRepository$chartData$$inlined$map$1$2$1.label = 1;
                            if (flowCollector5.emit(ready, realEarningsChartRepository$chartData$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj10);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realEarningsChartRepository$chartData$$inlined$map$1$2$1 = new RealEarningsChartRepository$chartData$$inlined$map$1$2$1(this, continuation);
                Object obj102 = realEarningsChartRepository$chartData$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realEarningsChartRepository$chartData$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
                return Unit.INSTANCE;
            case 21:
                return emit$com$squareup$cash$earnings$presenters$home$EarningsHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 22:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                EarningsStreamDetailViewEvent earningsStreamDetailViewEvent = (EarningsStreamDetailViewEvent) obj;
                if (Intrinsics.areEqual(earningsStreamDetailViewEvent, EarningsStreamDetailViewEvent.Back.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((TransfersPresenter) obj2).navigator).goTo(back);
                } else if (earningsStreamDetailViewEvent instanceof EarningsStreamDetailViewEvent.DateFilterChanged) {
                    ((MutableState) obj3).setValue(((EarningsStreamDetailViewEvent.DateFilterChanged) earningsStreamDetailViewEvent).filter);
                } else {
                    if (!(earningsStreamDetailViewEvent instanceof EarningsStreamDetailViewEvent.RetryLoad)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int intValue = parcelableSnapshotMutableIntState.getIntValue();
                    parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                    Okio.boxInt(intValue);
                }
                return Unit.INSTANCE;
            case 23:
                return emit$com$squareup$cash$family$familyhub$presenters$FamilyHomePresenter$models$lambda$14$0$$inlined$map$1$2(obj, continuation);
            case 24:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                CoroutineScope coroutineScope8 = (CoroutineScope) obj2;
                SelectContactMethodViewEvent selectContactMethodViewEvent = (SelectContactMethodViewEvent) obj;
                if (selectContactMethodViewEvent instanceof SelectContactMethodViewEvent.Select) {
                    JobKt.launch$default(coroutineScope8, null, null, new AnimationsKt$takeUntil$1$1.AnonymousClass1(localEditorialPresenter, selectContactMethodViewEvent, (MutableState) obj4, null, 3), 3);
                } else {
                    if (!(selectContactMethodViewEvent instanceof SelectContactMethodViewEvent.Close)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 25:
                return emit$com$squareup$cash$family$requestsponsorship$presenters$SponsorSelectionDetailsPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$formview$presenters$FormCashtagPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 27:
                return emit$com$squareup$cash$formview$presenters$FormDateInputPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$formview$presenters$FormPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                MutableState mutableState13 = (MutableState) obj4;
                GrowToolsManagerState growToolsManagerState = (GrowToolsManagerState) obj3;
                zzai zzaiVar = (zzai) obj2;
                RealPaidInBitcoinNavigator realPaidInBitcoinNavigator = (RealPaidInBitcoinNavigator) zzaiVar.zze;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) zzaiVar.zzc;
                GrowToolsManagerScreen.ManageDirectDepositScreen manageDirectDepositScreen = (GrowToolsManagerScreen.ManageDirectDepositScreen) zzaiVar.zzb;
                GrowToolsManagerViewEvent growToolsManagerViewEvent = (GrowToolsManagerViewEvent) obj;
                if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE)) {
                    screenNavigator9.goTo(new GrowToolsCompleteActivityScreen(manageDirectDepositScreen));
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.Back.INSTANCE)) {
                    screenNavigator9.goTo(back);
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE)) {
                    realPaidInBitcoinNavigator.navigateToLandingScreen(((GrowToolsDirectDepositManager$DirectDepositTarget) ((OriginSpecificData) mutableState13.getValue()).targetData).allocationBps, manageDirectDepositScreen);
                } else if (Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.DialogConfirmTapped.INSTANCE)) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(false);
                    JobKt.launch$default((CoroutineScope) zzaiVar.zza, null, null, new GrowToolsDirectDepositManager$cancelPaidInBitcoin$1(zzaiVar, growToolsManagerState, null), 3);
                } else if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DialogDismissTapped) {
                    growToolsManagerState.setShowDialog(null);
                    growToolsManagerState.setInteractive(true);
                } else if (!Intrinsics.areEqual(growToolsManagerViewEvent, GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE)) {
                    if (growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.ToggleTapped) {
                        if (((OriginSpecificData) mutableState13.getValue()).enabled) {
                            growToolsManagerState.setShowDialog(new GrowToolsManagerState.ShowDialog(GrowToolsManagerState.ShowDialog.DialogType.TOGGLE_OFF_CONFIRMATION));
                        } else {
                            growToolsManagerState.setInteractive(false);
                            realPaidInBitcoinNavigator.navigateToLandingScreen(((GrowToolsDirectDepositManager$DirectDepositTarget) ((OriginSpecificData) mutableState13.getValue()).targetData).allocationBps, manageDirectDepositScreen);
                        }
                    } else if (!(growToolsManagerViewEvent instanceof GrowToolsManagerViewEvent.DetailRowTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealBlockersHelper$collectBlockersActions$2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$handleError = obj2;
        this.$onLoadingStateChanged = obj3;
        this.this$0 = obj;
    }

    public /* synthetic */ RealBlockersHelper$collectBlockersActions$2(CoroutineScope coroutineScope, Object obj, Object obj2, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$handleError = obj2;
        this.$onLoadingStateChanged = mutableState;
    }
}
