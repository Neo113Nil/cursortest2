package com.squareup.cash.permissions;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.spatial.ThrottledCallbacksKt;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.core.net.UriKt;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalizedAdsSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$Header$Style$Active;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome$Header$Style$Inactive;
import com.squareup.cash.cdf.account.AccountViewedSearchPrivacySetting;
import com.squareup.cash.cdf.cashappscore.CashAppScoreFAQView;
import com.squareup.cash.cdf.cashappscore.CashAppScoreRecommendationActionButtonTap;
import com.squareup.cash.cdf.cashappscore.CashAppScoreRecommendationTap;
import com.squareup.cash.cdf.cashappscore.CashAppScoreRecommendationView;
import com.squareup.cash.cdf.cashappscore.CashAppScoreScoreDetailsView;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.cdf.personalprofile.PersonalProfileShareSource;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewShare;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clipboard.ClipboardItem;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.cash.db2.profile.SelectRegion;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.featureflags.AmplitudeExperiments$DefaultQrCodeTab;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersInflightStateManager;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1;
import com.squareup.cash.offers.db.OffersCollectionDetail;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreenV2;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.offers.viewmodels.viewevents.OfferDetailsSheetClosed;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEventV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFullscreenCollectionViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewEvent;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewEvent;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.presenters.NearbyPermissionsPromptSheetPresenter;
import com.squareup.cash.payments.presenters.PaymentClaimPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.RealBitcoinPaymentManager;
import com.squareup.cash.payments.presenters.RealBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.RealStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewEvent;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.pdf.view.PdfPreviewEvent;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansHomeScreen;
import com.squareup.cash.phoneplans.PhonePlansHomeViewEvent;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewEvent;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AdjustableThresholdViewEvent$DoneClicked;
import com.squareup.cash.profile.viewmodels.AppMessagesOptionsViewEvent;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.QrCodeProfilePresenter;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewEvent;
import com.squareup.cash.recipients.backend.api.RecipientVendor$Section;
import com.squareup.cash.recipients.backend.api.SuggestedRecipients;
import com.squareup.cash.recipients.backend.real.RealRecipientVendor$sections$lambda$1$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.retro.presenters.PaymentPlanDataBlockerPresenter;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewEvent;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.score.viewmodels.ScoreHomeSheet;
import com.squareup.cash.score.viewmodels.ScoreHomeViewEvent;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.security.presenters.BasePasswordPresenter$models$1$1;
import com.squareup.cash.security.presenters.BasePasswordPresenter$models$2$1;
import com.squareup.cash.security.presenters.PasswordEntryArgumentsAdapter;
import com.squareup.cash.security.presenters.PasswordEntryState;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$TargetPreparationState;
import com.squareup.cash.sharesheet.RealShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1;
import com.squareup.cash.sharesheet.ShareSheetScreen;
import com.squareup.cash.sharesheet.ShareTarget;
import com.squareup.cash.sharesheet.ShareableAssetsManager$DownloadedImage;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.common.RecipientGroup;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.util.android.Intents;
import com.squareup.util.cash.Cashtags;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class AndroidPermissionChecker$granted$$inlined$map$2$2 implements FlowCollector {
    public final /* synthetic */ Object $permissions$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_unsafeFlow;
    public final /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return AndroidPermissionChecker$granted$$inlined$map$2$2.this.emit((Object) null, this);
        }
    }

    public AndroidPermissionChecker$granted$$inlined$map$2$2(CoroutineScope coroutineScope, TransfersPresenter transfersPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.$r8$classId = 18;
        this.$this_unsafeFlow = transfersPresenter;
        this.$permissions$inlined = mutableState;
        this.this$0 = mutableState2;
    }

    private final Object emit$com$squareup$cash$score$presenters$ScoreHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        CashCreditScoreHomeData.ScoreSummary scoreSummary;
        CashCreditScoreHomeData.ScoreSummary scoreSummary2;
        ScoreHomeViewEvent scoreHomeViewEvent = (ScoreHomeViewEvent) obj;
        LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.$this_unsafeFlow;
        CashCreditScoreHomeData cashCreditScoreHomeData = (CashCreditScoreHomeData) ((State) this.$permissions$inlined).getValue();
        MutableState mutableState = (MutableState) this.this$0;
        ScoreHomeSheet scoreHomeSheet = (ScoreHomeSheet) mutableState.getValue();
        Analytics analytics = (Analytics) localEditorialPresenter.screen;
        if (scoreHomeViewEvent instanceof ScoreHomeViewEvent.GoBack) {
            if (scoreHomeSheet == null) {
                ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(Back.INSTANCE);
            } else {
                mutableState.setValue(null);
            }
        } else if (scoreHomeViewEvent instanceof ScoreHomeViewEvent.DismissSheet) {
            mutableState.setValue(null);
        } else if (scoreHomeViewEvent instanceof ScoreHomeViewEvent.Action) {
            ScoreHomeViewEvent.Action action = (ScoreHomeViewEvent.Action) scoreHomeViewEvent;
            ScoreHomeViewEvent.Action.Source source = action.source;
            if (source instanceof ScoreHomeViewEvent.Action.Source.Callout) {
                ScoreHomeViewEvent.Action.Source.Callout callout = (ScoreHomeViewEvent.Action.Source.Callout) source;
                Integer valueOf = Integer.valueOf(callout.index);
                LocalizedString localizedString = callout.proto.title;
                analytics.track(new CashAppScoreRecommendationTap(valueOf, localizedString != null ? localizedString.translated_value : null), null);
            } else if (source instanceof ScoreHomeViewEvent.Action.Source.RecommendationOverlay) {
                CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = ((ScoreHomeViewEvent.Action.Source.RecommendationOverlay) source).proto;
                LocalizedString localizedString2 = recommendationOverlayData.title;
                String str = localizedString2 != null ? localizedString2.translated_value : null;
                LocalizedString localizedString3 = recommendationOverlayData.primary_button_text;
                analytics.track(new CashAppScoreRecommendationActionButtonTap(str, localizedString3 != null ? localizedString3.translated_value : null), null);
            } else if (source != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            CashCreditScoreHomeData.Action action2 = action.proto;
            CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData2 = action2.recommendation_overlay;
            if (recommendationOverlayData2 != null) {
                mutableState.setValue(new ScoreHomeSheet.RecommendationSheet(recommendationOverlayData2));
            } else {
                CashCreditScoreHomeData.ScoreSummaryOverlayData scoreSummaryOverlayData = action2.score_summary_overlay;
                if (scoreSummaryOverlayData != null) {
                    analytics.track(new CashAppScoreScoreDetailsView((cashCreditScoreHomeData == null || (scoreSummary2 = cashCreditScoreHomeData.score_summary) == null) ? null : scoreSummary2.score, cashCreditScoreHomeData != null ? LocalEditorialPresenter.getScoreChange(cashCreditScoreHomeData) : null, Boolean.valueOf(Intrinsics.areEqual(scoreSummaryOverlayData.describes_feature_impact, Boolean.TRUE))), null);
                    mutableState.setValue(new ScoreHomeSheet.ScoreSummarySheet(scoreSummaryOverlayData));
                } else {
                    String str2 = action2.uri;
                    if (str2 != null) {
                        mutableState.setValue(null);
                        RealRouter realRouter = (RealRouter) localEditorialPresenter.responseContextHandler;
                        ScoreHomeScreen scoreHomeScreen = (ScoreHomeScreen) localEditorialPresenter.launcher;
                        realRouter.route(new RoutingParams(scoreHomeScreen, null, scoreHomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str2);
                    }
                }
            }
        } else if (scoreHomeViewEvent instanceof ScoreHomeViewEvent.CalloutVisible) {
            ScoreHomeViewEvent.CalloutVisible calloutVisible = (ScoreHomeViewEvent.CalloutVisible) scoreHomeViewEvent;
            Integer valueOf2 = Integer.valueOf(calloutVisible.index);
            LocalizedString localizedString4 = calloutVisible.proto.title;
            analytics.track(new CashAppScoreRecommendationView(valueOf2, localizedString4 != null ? localizedString4.translated_value : null), null);
        } else {
            if (!(scoreHomeViewEvent instanceof ScoreHomeViewEvent.FaqSectionVisible)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            analytics.track(new CashAppScoreFAQView((cashCreditScoreHomeData == null || (scoreSummary = cashCreditScoreHomeData.score_summary) == null) ? null : scoreSummary.score, cashCreditScoreHomeData != null ? LocalEditorialPresenter.getScoreChange(cashCreditScoreHomeData) : null), null);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$security$presenters$BasePasswordPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        BlockerAction.MenuAction value;
        MutableState mutableState = (MutableState) this.this$0;
        BasePasswordPresenter basePasswordPresenter = (BasePasswordPresenter) this.$permissions$inlined;
        BetterNavigator.ScreenNavigator screenNavigator = basePasswordPresenter.navigator;
        PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = basePasswordPresenter.args;
        CoroutineScope coroutineScope = (CoroutineScope) this.$this_unsafeFlow;
        PasswordEntryViewEvent passwordEntryViewEvent = (PasswordEntryViewEvent) obj;
        if (Intrinsics.areEqual(passwordEntryViewEvent, PasswordEntryViewEvent.CloseScreen.INSTANCE)) {
            BlockersDataNavigator blockersDataNavigator = basePasswordPresenter.blockersDataNavigator;
            BlockersScreens blockersScreens = passwordEntryArgumentsAdapter.screen;
            Screen back = blockersDataNavigator.getBack(blockersScreens, blockersScreens.getBlockersData());
            if (back == null) {
                back = passwordEntryArgumentsAdapter.screen.getBlockersData().exitScreen;
            }
            screenNavigator.goTo(back);
        } else {
            boolean z = false;
            boolean z2 = false;
            if (passwordEntryViewEvent instanceof PasswordEntryViewEvent.ActionButtonClick) {
                JobKt.launch$default(coroutineScope, null, null, new BasePasswordPresenter$models$2$1(passwordEntryViewEvent, basePasswordPresenter, mutableState, z2 ? 1 : 0, 0), 3);
            } else if (Intrinsics.areEqual(passwordEntryViewEvent, PasswordEntryViewEvent.UseBiometrics.INSTANCE)) {
                JobKt.launch$default(coroutineScope, null, null, new BasePasswordPresenter$models$1$1(basePasswordPresenter, mutableState, null, 1), 3);
            } else if (passwordEntryViewEvent instanceof PasswordEntryViewEvent.BiometricsCheckboxToggle) {
                JobKt.launch$default(coroutineScope, null, null, new AndroidFileSaver$save$2(basePasswordPresenter, passwordEntryViewEvent, mutableState, null, 26), 3);
            } else if (Intrinsics.areEqual(passwordEntryViewEvent, PasswordEntryViewEvent.HelpMenuClick.INSTANCE)) {
                BlockerAction blockerAction = passwordEntryArgumentsAdapter.passwordScreenData.helpAction;
                Object obj2 = blockerAction != null ? blockerAction.action : null;
                BlockerAction.Action.MenuAction menuAction = obj2 instanceof BlockerAction.Action.MenuAction ? (BlockerAction.Action.MenuAction) obj2 : null;
                if (menuAction != null && (value = menuAction.getValue()) != null) {
                    screenNavigator.goTo(new BlockersScreens.FormMenuActionSheet(passwordEntryArgumentsAdapter.screen.getBlockersData(), value));
                }
            } else if (passwordEntryViewEvent instanceof PasswordEntryViewEvent.HelpMenuItemClick) {
                JobKt.launch$default(coroutineScope, null, null, new BasePasswordPresenter$models$2$1(passwordEntryViewEvent, basePasswordPresenter, mutableState, z ? 1 : 0, 1), 3);
            } else if (passwordEntryViewEvent instanceof PasswordEntryViewEvent.DialogClickEvent) {
                int ordinal = ((PasswordEntryViewEvent.DialogClickEvent) passwordEntryViewEvent).button.action.ordinal();
                if (ordinal == 0) {
                    Intents.maybeStartActivity(r8, new Intent(Build.VERSION.SDK_INT >= 30 ? "android.settings.BIOMETRIC_ENROLL" : "android.settings.FINGERPRINT_ENROLL"), new CameraX$$ExternalSyntheticLambda0(basePasswordPresenter.launcher.activity, 12));
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, null, 6));
            } else if (!(passwordEntryViewEvent instanceof PasswordEntryViewEvent.PasswordTextVisibilityClick)) {
                if (!(passwordEntryViewEvent instanceof PasswordEntryViewEvent.ForgotPasswordClick)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                JobKt.launch$default(coroutineScope, null, null, new BasePasswordPresenter$models$1$1(basePasswordPresenter, mutableState, null, 2), 3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0684, code lost:
    
        if (r4.emit(r0, r2) == r1) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0673, code lost:
    
        if (r0 == r1) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06f0, code lost:
    
        if (r4.emit(r0, r2) == r1) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x06df, code lost:
    
        if (r0 == r1) goto L348;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Type inference failed for: r0v201, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v11, types: [com.squareup.protos.franklin.api.Region] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r1v31, types: [app.cash.broadway.screen.Screen] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        String str;
        Screen profileFor;
        PaymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1 paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        RealBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1;
        int i3;
        FlowCollector flowCollector;
        CryptoPaymentManager.SelectedRecipient selectedRecipient;
        RealStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1;
        int i4;
        FlowCollector flowCollector2;
        CryptoPaymentManager.SelectedRecipient selectedRecipient2;
        String str2;
        String str3;
        MobilePlanHome.InactiveHeader inactiveHeader;
        MobilePlanHome.ActiveHeader activeHeader;
        String str4;
        Screen confirmRemoveAliasScreen;
        RealRecipientVendor$sections$lambda$1$$inlined$map$1$2$1 realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1;
        int i5;
        RealRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1 realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1;
        int i6;
        boolean route;
        RealShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1 realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1;
        int i7;
        Object access$assetFailedToLoad;
        int i8 = this.$r8$classId;
        r6 = 0;
        int i9 = 0;
        r6 = 0;
        int i10 = 0;
        final int i11 = 1;
        Back back = Back.INSTANCE;
        int i12 = 3;
        Object obj2 = this.this$0;
        Object obj3 = this.$this_unsafeFlow;
        Object obj4 = this.$permissions$inlined;
        r13 = null;
        String str5 = null;
        r13 = null;
        r13 = null;
        MobilePlanHome.InfoCard infoCard = null;
        switch (i8) {
            case 0:
                String[] strArr = (String[]) obj4;
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i13 = anonymousClass1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj5 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            FlowCollector flowCollector3 = (FlowCollector) obj3;
                            ArrayList arrayList = new ArrayList();
                            for (String str6 : strArr) {
                                if (((AndroidPermissionChecker) obj2).checkPermission(str6)) {
                                    arrayList.add(str6);
                                }
                            }
                            Boolean valueOf = Boolean.valueOf(arrayList.size() == strArr.length);
                            anonymousClass1.label = 1;
                            if (flowCollector3.emit(valueOf, anonymousClass1) == coroutineSingletons) {
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
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj52 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 1:
                return emit((Pair) obj, continuation);
            case 2:
                final CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                RealRouter realRouter = (RealRouter) cardLockPresenter.deviceLockAnimationBus;
                RealBoostRepository realBoostRepository = (RealBoostRepository) cardLockPresenter.args;
                RealOffersAnalyticsV2 realOffersAnalyticsV2 = (RealOffersAnalyticsV2) cardLockPresenter.issuedCardManager;
                BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
                OffersScreen$OffersDetailsScreenV2 offersScreen$OffersDetailsScreenV2 = (OffersScreen$OffersDetailsScreenV2) cardLockPresenter.flowNavigationHelper;
                final OffersDetailsSheetViewEventV2 offersDetailsSheetViewEventV2 = (OffersDetailsSheetViewEventV2) obj;
                if (offersDetailsSheetViewEventV2 instanceof OffersDetailsSheetViewEventV2.AddOffers) {
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    String str7 = ((OffersDetailsSheetViewEventV2.AddOffers) offersDetailsSheetViewEventV2).boostToken;
                    realOffersAnalyticsV2.trackOffersDetailsOpenUpdateOffer(str7, generateToken, OfferUpdateType.ADD);
                    final int i14 = r6 ? 1 : 0;
                    realBoostRepository.addBoostMultiSelect(str7, generateToken, new Function1() { // from class: com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i15 = i14;
                            OffersDetailsSheetViewEventV2 offersDetailsSheetViewEventV22 = offersDetailsSheetViewEventV2;
                            CardLockPresenter cardLockPresenter2 = cardLockPresenter;
                            switch (i15) {
                                case 0:
                                    ((RealOffersInflightStateManager) cardLockPresenter2.franklinAppService).updateInflightState(((OffersDetailsSheetViewEventV2.AddOffers) offersDetailsSheetViewEventV22).boostToken, ((Boolean) obj6).booleanValue());
                                    break;
                                default:
                                    ((RealOffersInflightStateManager) cardLockPresenter2.franklinAppService).updateInflightState(((OffersDetailsSheetViewEventV2.RemoveOffers) offersDetailsSheetViewEventV22).boostToken, ((Boolean) obj6).booleanValue());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, offersScreen$OffersDetailsScreenV2.moneybotContext);
                } else if (offersDetailsSheetViewEventV2 instanceof OffersDetailsSheetViewEventV2.RemoveOffers) {
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken2 = BlockersData.Flow.Companion.generateToken();
                    String str8 = ((OffersDetailsSheetViewEventV2.RemoveOffers) offersDetailsSheetViewEventV2).boostToken;
                    realOffersAnalyticsV2.trackOffersDetailsOpenUpdateOffer(str8, generateToken2, OfferUpdateType.REMOVE);
                    realBoostRepository.removeBoost(str8, generateToken2, new Function1() { // from class: com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i15 = i11;
                            OffersDetailsSheetViewEventV2 offersDetailsSheetViewEventV22 = offersDetailsSheetViewEventV2;
                            CardLockPresenter cardLockPresenter2 = cardLockPresenter;
                            switch (i15) {
                                case 0:
                                    ((RealOffersInflightStateManager) cardLockPresenter2.franklinAppService).updateInflightState(((OffersDetailsSheetViewEventV2.AddOffers) offersDetailsSheetViewEventV22).boostToken, ((Boolean) obj6).booleanValue());
                                    break;
                                default:
                                    ((RealOffersInflightStateManager) cardLockPresenter2.franklinAppService).updateInflightState(((OffersDetailsSheetViewEventV2.RemoveOffers) offersDetailsSheetViewEventV22).boostToken, ((Boolean) obj6).booleanValue());
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else if (Intrinsics.areEqual(offersDetailsSheetViewEventV2, OffersDetailsSheetViewEventV2.SheetDismissed.INSTANCE)) {
                    screenNavigator.goTo(back);
                    ((MutableState) obj4).setValue(Boolean.FALSE);
                } else if (offersDetailsSheetViewEventV2 instanceof OffersDetailsSheetViewEventV2.UrlClicked) {
                    realRouter.route(new RoutingParams((OffersScreen$OffersDetailsScreenV2) cardLockPresenter.flowNavigationHelper, null, null, null, null, null, 510), ((OffersDetailsSheetViewEventV2.UrlClicked) offersDetailsSheetViewEventV2).url);
                } else if (Intrinsics.areEqual(offersDetailsSheetViewEventV2, OffersDetailsSheetViewEventV2.OpenOffersTimeline.INSTANCE)) {
                    RewardWithSelection rewardWithSelection = (RewardWithSelection) ((MutableState) obj2).getValue();
                    if (rewardWithSelection != null && (str = rewardWithSelection.title) != null) {
                        screenNavigator.goTo(new OffersScreen$OffersTimelineScreenV2(offersScreen$OffersDetailsScreenV2, str));
                    }
                } else if (Intrinsics.areEqual(offersDetailsSheetViewEventV2, OffersDetailsSheetViewEventV2.OpenBenefitsScreen.INSTANCE)) {
                    ClientRoute.ViewBenefitsHome viewBenefitsHome = new ClientRoute.ViewBenefitsHome();
                    RoutingParams routingParams = new RoutingParams((OffersScreen$OffersDetailsScreenV2) cardLockPresenter.flowNavigationHelper, null, null, null, null, null, 510);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(viewBenefitsHome, routingParams);
                } else if (Intrinsics.areEqual(offersDetailsSheetViewEventV2, OffersDetailsSheetViewEventV2.OpenGreenStatusUpsell.INSTANCE)) {
                    screenNavigator.goTo(new OffersScreen$OffersGreenStatusScreen(offersScreen$OffersDetailsScreenV2.token));
                } else {
                    if (!(offersDetailsSheetViewEventV2 instanceof OffersDetailsSheetViewEventV2.AppLinkClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    OffersDetailsSheetViewEventV2.AppLinkClicked appLinkClicked = (OffersDetailsSheetViewEventV2.AppLinkClicked) offersDetailsSheetViewEventV2;
                    ((IntentLauncher) cardLockPresenter.flowStarter).launchAppLink(appLinkClicked.url, appLinkClicked.packageName);
                }
                return Unit.INSTANCE;
            case 3:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj4;
                RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) localCashBalancePresenter.timestampFormatter;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                OffersFullscreenCollectionViewEvent offersFullscreenCollectionViewEvent = (OffersFullscreenCollectionViewEvent) obj;
                if (offersFullscreenCollectionViewEvent instanceof ItemViewed) {
                    RealOffersAnalytics.trackImpressionAnalyticsEvents$default(realOffersAnalytics, ((ItemViewed) offersFullscreenCollectionViewEvent).analyticsEventSpecs);
                } else if (Intrinsics.areEqual(offersFullscreenCollectionViewEvent, OffersFullscreenCollectionViewEvent.GoBack.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(back);
                } else if (offersFullscreenCollectionViewEvent instanceof OfferItemClicked) {
                    JobKt.launch$default(coroutineScope, null, null, new OverlayKt$Overlay$1$1$1$1$1(offersFullscreenCollectionViewEvent, localCashBalancePresenter, r13, i12), 3);
                } else {
                    if (!(offersFullscreenCollectionViewEvent instanceof OfferDetailsSheetClosed)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealOffersAnalyticsHelper) localCashBalancePresenter.sessionManager).refreshFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                }
                if (offersFullscreenCollectionViewEvent instanceof OffersAnalyticsViewEvent) {
                    RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, ((OffersAnalyticsViewEvent) offersFullscreenCollectionViewEvent).getAnalyticsActionEventSpecs());
                }
                return Unit.INSTANCE;
            case 4:
                AliasPickerViewEvent aliasPickerViewEvent = (AliasPickerViewEvent) obj;
                if (Intrinsics.areEqual(aliasPickerViewEvent, AliasPickerViewEvent.VerifyAnotherWay.INSTANCE)) {
                    ((MutableState) obj4).setValue(Boolean.TRUE);
                } else if (Intrinsics.areEqual(aliasPickerViewEvent, AliasPickerViewEvent.GoBack.INSTANCE)) {
                    ((CardLockPresenter) obj3).navigator.goTo(back);
                } else {
                    if (!(aliasPickerViewEvent instanceof AliasPickerViewEvent.AliasSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) obj2).setValue(((AliasPickerViewEvent.AliasSelected) aliasPickerViewEvent).aliasId);
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState = (MutableState) obj2;
                SelectCustomerPresenter selectCustomerPresenter = (SelectCustomerPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) selectCustomerPresenter.navigator;
                SelectCustomerViewEvent selectCustomerViewEvent = (SelectCustomerViewEvent) obj;
                if (!(selectCustomerViewEvent instanceof SelectCustomerViewEvent.ChangeSearchText)) {
                    if (Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.TapClose.INSTANCE)) {
                        ?? r1 = ((SelectCustomerScreen) selectCustomerPresenter.args).destinationScreen;
                        if (r1 != 0) {
                            back = r1;
                        }
                        screenNavigator2.goTo(back);
                    } else {
                        Continuation continuation2 = null;
                        if (selectCustomerViewEvent instanceof SelectCustomerViewEvent.TapCustomerButton) {
                            JobKt.launch$default((CoroutineScope) obj4, null, null, new RealMRIFactory$sign$2(selectCustomerPresenter, selectCustomerViewEvent, mutableState, continuation2, 26), 3);
                        } else if (Intrinsics.areEqual(selectCustomerViewEvent, SelectCustomerViewEvent.DismissDialog.INSTANCE)) {
                            mutableState.setValue(null);
                        } else if (selectCustomerViewEvent instanceof SelectCustomerViewEvent.TapCustomerAvatar) {
                            LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                            profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(((SelectCustomerViewEvent.TapCustomerAvatar) selectCustomerViewEvent).tapAvatarEvent.customerToken, false), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.NONE, null), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.ACTIVITY_OTHER, CustomerProfileViewOpen.EntryPoint.CELL_AVATAR, (SelectCustomerScreen) selectCustomerPresenter.args, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                            screenNavigator2.goTo(profileFor);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj4;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                PasskeyUpsellViewEvent passkeyUpsellViewEvent = (PasskeyUpsellViewEvent) obj;
                if (Intrinsics.areEqual(passkeyUpsellViewEvent, PasskeyUpsellViewEvent.RegisterTapped.INSTANCE)) {
                    MutableState mutableState2 = (MutableState) obj2;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                        JobKt.launch$default(coroutineScope2, null, null, new OverlayKt$Overlay$1$1$1$1$1(pdfPreviewPresenter, mutableState2, r13, 10), 3);
                    }
                } else {
                    if (!Intrinsics.areEqual(passkeyUpsellViewEvent, PasskeyUpsellViewEvent.SkipTapped.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BetterNavigator.ScreenNavigator screenNavigator3 = pdfPreviewPresenter.navigator;
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) pdfPreviewPresenter.fileSaver;
                    PasskeyUpsellScreen passkeyUpsellScreen = (PasskeyUpsellScreen) pdfPreviewPresenter.pdfFile$delegate;
                    screenNavigator3.goTo(blockersDataNavigator.getSkip(passkeyUpsellScreen, passkeyUpsellScreen.blockersData));
                }
                return Unit.INSTANCE;
            case 7:
                NearbyPermissionsPromptSheetPresenter nearbyPermissionsPromptSheetPresenter = (NearbyPermissionsPromptSheetPresenter) obj4;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj3;
                NearbyPermissionsPromptSheetViewEvent nearbyPermissionsPromptSheetViewEvent = (NearbyPermissionsPromptSheetViewEvent) obj;
                if (Intrinsics.areEqual(nearbyPermissionsPromptSheetViewEvent, NearbyPermissionsPromptSheetViewEvent.OnCloseClicked.INSTANCE)) {
                    nearbyPermissionsPromptSheetPresenter.navigator.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(nearbyPermissionsPromptSheetViewEvent, NearbyPermissionsPromptSheetViewEvent.OnPermissionsAction.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Image image = NearbyPermissionsPromptSheetPresenter.HERO_IMAGE;
                    NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) ((State) obj2).getValue();
                    if (nearbyPermissionState != null) {
                        JobKt.launch$default(coroutineScope3, null, null, new OverlayKt$Overlay$1$1$1$1$1(nearbyPermissionsPromptSheetPresenter, nearbyPermissionState, r13, 17), 3);
                    }
                }
                return Unit.INSTANCE;
            case 8:
                PaymentClaimPresenter paymentClaimPresenter = (PaymentClaimPresenter) obj4;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj3;
                PaymentClaimViewEvent paymentClaimViewEvent = (PaymentClaimViewEvent) obj;
                if (paymentClaimViewEvent instanceof PaymentClaimViewEvent.CancelClick) {
                    paymentClaimPresenter.navigator.goTo(back);
                } else {
                    if (!(paymentClaimViewEvent instanceof PaymentClaimViewEvent.DepositClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope4, null, null, new MainPaymentPresenter$models$4$4(paymentClaimPresenter, (MutableState) obj2, (Continuation) r13, 23), 3);
                }
                return Unit.INSTANCE;
            case 9:
                if (continuation instanceof PaymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1) {
                    paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1 = (PaymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i15 = paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.label = i15 - PKIFailureInfo.systemUnavail;
                        Object obj6 = paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            FlowCollector flowCollector4 = (FlowCollector) obj3;
                            List list = ((RecipientRepository$Result) obj).sections;
                            EmptyList emptyList = EmptyList.INSTANCE;
                            SelectRegion selectRegion = (SelectRegion) ((State) obj2).getValue();
                            ArrayList mapSectionsToViewModels$default = UriKt.mapSectionsToViewModels$default(list, emptyList, selectRegion != null ? selectRegion.region : 0, ((PaymentConfigurationPresenter) obj4).stringManager);
                            paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector4.emit(mapSectionsToViewModels$default, paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1 = new PaymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj62 = paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = paymentConfigurationPresenter$models$14$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 10:
                if (continuation instanceof RealBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1) {
                    realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 = (RealBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1) continuation;
                    int i16 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            flowCollector = (FlowCollector) obj3;
                            ClipboardItem clipboardItem = (ClipboardItem) CollectionsKt.firstOrNull((List) obj);
                            if (clipboardItem != null) {
                                String str9 = clipboardItem.text;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = flowCollector;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = 0;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 1;
                                obj7 = ((RealBitcoinPaymentManager) obj4).parseInvoice((CryptoPaymentOrigin) obj2, str9, realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1);
                                break;
                            } else {
                                selectedRecipient = null;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i10;
                                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
                                break;
                            }
                        } else {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    SafeTrace.throwOnFailure(obj7);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i10 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0;
                            flowCollector = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj7);
                        }
                        selectedRecipient = (CryptoPaymentManager.SelectedRecipient) obj7;
                        realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                        realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i10;
                        realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
                    }
                }
                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 = new RealBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                selectedRecipient = (CryptoPaymentManager.SelectedRecipient) obj72;
                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i10;
                realBitcoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
            case 11:
                if (continuation instanceof RealStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1) {
                    realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 = (RealStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1) continuation;
                    int i17 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                    if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                        realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            flowCollector2 = (FlowCollector) obj3;
                            ClipboardItem clipboardItem2 = (ClipboardItem) CollectionsKt.firstOrNull((List) obj);
                            if (clipboardItem2 != null) {
                                String str10 = clipboardItem2.text;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = flowCollector2;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = 0;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 1;
                                obj8 = ((AssetPublicSuffixList) obj4).parseInvoice((CryptoPaymentOrigin) obj2, str10, realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1);
                                break;
                            } else {
                                selectedRecipient2 = null;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i9;
                                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
                                break;
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    SafeTrace.throwOnFailure(obj8);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i9 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0;
                            flowCollector2 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj8);
                        }
                        selectedRecipient2 = (CryptoPaymentManager.SelectedRecipient) obj8;
                        realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                        realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i9;
                        realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
                    }
                }
                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1 = new RealStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1(this, continuation);
                Object obj82 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                selectedRecipient2 = (CryptoPaymentManager.SelectedRecipient) obj82;
                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.L$4 = null;
                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.I$0 = i9;
                realStablecoinPaymentManager$getClipboardRecipient$$inlined$map$1$2$1.label = 2;
            case 12:
                MutableState mutableState3 = (MutableState) obj2;
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) obj4;
                CoroutineScope coroutineScope5 = (CoroutineScope) obj3;
                PdfPreviewEvent pdfPreviewEvent = (PdfPreviewEvent) obj;
                if (Intrinsics.areEqual(pdfPreviewEvent, PdfPreviewEvent.Close.INSTANCE)) {
                    pdfPreviewPresenter2.navigator.goTo(back);
                } else if (Intrinsics.areEqual(pdfPreviewEvent, PdfPreviewEvent.DismissToast.INSTANCE)) {
                    mutableState3.setValue(null);
                } else if (Intrinsics.areEqual(pdfPreviewEvent, PdfPreviewEvent.Download.INSTANCE)) {
                    JobKt.launch$default(coroutineScope5, null, null, new OverlayKt$Overlay$1$1$1$1$1(pdfPreviewPresenter2, mutableState3, r13, 24), 3);
                } else {
                    if (!Intrinsics.areEqual(pdfPreviewEvent, PdfPreviewEvent.Share.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Uri contentUriForFileUri = ((AndroidFileProvider) pdfPreviewPresenter2.fileProvider).contentUriForFileUri(((PdfScreen) pdfPreviewPresenter2.args).fileUri);
                    IntentLauncher intentLauncher = (IntentLauncher) pdfPreviewPresenter2.launcher;
                    String uri = contentUriForFileUri.toString();
                    uri.getClass();
                    intentLauncher.viewData(uri, false);
                }
                return Unit.INSTANCE;
            case 13:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                MutableState mutableState4 = (MutableState) obj4;
                InviteErrorPresenter inviteErrorPresenter = (InviteErrorPresenter) obj3;
                Lazy lazy = (Lazy) inviteErrorPresenter.args;
                PhonePlansHomeViewEvent phonePlansHomeViewEvent = (PhonePlansHomeViewEvent) obj;
                if (phonePlansHomeViewEvent instanceof PhonePlansHomeViewEvent.Close) {
                    ((BetterNavigator.ScreenNavigator) inviteErrorPresenter.navigator).goTo(back);
                } else {
                    boolean z = phonePlansHomeViewEvent instanceof PhonePlansHomeViewEvent.HeaderCtaClicked;
                    PhonePlansHomeScreen phonePlansHomeScreen = PhonePlansHomeScreen.INSTANCE;
                    if (z) {
                        MobilePlanHome mobilePlanHome = (MobilePlanHome) mutableState4.getValue();
                        if (mobilePlanHome != null) {
                            MobilePlanHome.Header header = mobilePlanHome.header;
                            InputState_androidKt inputState_androidKt = header != null ? header.style : null;
                            MobilePlanHome$Header$Style$Active mobilePlanHome$Header$Style$Active = inputState_androidKt instanceof MobilePlanHome$Header$Style$Active ? (MobilePlanHome$Header$Style$Active) inputState_androidKt : null;
                            if (mobilePlanHome$Header$Style$Active == null || (activeHeader = mobilePlanHome$Header$Style$Active.value) == null || (str4 = activeHeader.cta_destination) == null) {
                                MobilePlanHome$Header$Style$Inactive mobilePlanHome$Header$Style$Inactive = inputState_androidKt instanceof MobilePlanHome$Header$Style$Inactive ? (MobilePlanHome$Header$Style$Inactive) inputState_androidKt : null;
                                if (mobilePlanHome$Header$Style$Inactive != null && (inactiveHeader = mobilePlanHome$Header$Style$Inactive.value) != null) {
                                    str5 = inactiveHeader.cta_destination;
                                }
                            } else {
                                str5 = str4;
                            }
                            if (str5 != null) {
                                ((RealRouter) lazy.getValue()).route(new RoutingParams(phonePlansHomeScreen, null, null, null, null, null, 510), str5);
                            }
                        }
                    } else if (phonePlansHomeViewEvent instanceof PhonePlansHomeViewEvent.InfoCardClicked) {
                        MobilePlanHome mobilePlanHome2 = (MobilePlanHome) mutableState4.getValue();
                        if (mobilePlanHome2 != null) {
                            MobilePlanHome.InfoCards infoCards = mobilePlanHome2.info_cards;
                            int i18 = ((PhonePlansHomeViewEvent.InfoCardClicked) phonePlansHomeViewEvent).index;
                            if (i18 != 0) {
                                if (i18 == 1 && infoCards != null) {
                                    infoCard = infoCards.second;
                                }
                            } else if (infoCards != null) {
                                infoCard = infoCards.first;
                            }
                            if (infoCard != null && (str3 = infoCard.destination) != null) {
                                ((RealRouter) lazy.getValue()).route(new RoutingParams(phonePlansHomeScreen, null, null, null, null, null, 510), str3);
                            }
                        }
                    } else if (phonePlansHomeViewEvent instanceof PhonePlansHomeViewEvent.LinkClicked) {
                        MobilePlanHome mobilePlanHome3 = (MobilePlanHome) mutableState4.getValue();
                        if (mobilePlanHome3 != null && (str2 = ((MobilePlanHome.Link) mobilePlanHome3.links.get(((PhonePlansHomeViewEvent.LinkClicked) phonePlansHomeViewEvent).index)).destination) != null) {
                            ((RealRouter) lazy.getValue()).route(new RoutingParams(phonePlansHomeScreen, null, null, null, null, null, 510), str2);
                        }
                    } else {
                        if (!(phonePlansHomeViewEvent instanceof PhonePlansHomeViewEvent.RetryClicked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        int intValue = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                        Okio.boxInt(intValue);
                    }
                }
                return Unit.INSTANCE;
            case 14:
                PdfPreviewPresenter pdfPreviewPresenter3 = (PdfPreviewPresenter) obj4;
                CoroutineScope coroutineScope6 = (CoroutineScope) obj3;
                DeviceManagerRemovedSuccessViewEvent deviceManagerRemovedSuccessViewEvent = (DeviceManagerRemovedSuccessViewEvent) obj;
                if (Intrinsics.areEqual(deviceManagerRemovedSuccessViewEvent, DeviceManagerRemovedSuccessViewEvent.Done.INSTANCE) || Intrinsics.areEqual(deviceManagerRemovedSuccessViewEvent, DeviceManagerRemovedSuccessViewEvent.GoBack.INSTANCE)) {
                    pdfPreviewPresenter3.navigator.goTo(back);
                } else {
                    if (!Intrinsics.areEqual(deviceManagerRemovedSuccessViewEvent, DeviceManagerRemovedSuccessViewEvent.EnableSecurityOption.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope6, null, null, new RingtoneView.AnonymousClass1(pdfPreviewPresenter3, (State) obj2, r13, 11), 3);
                }
                return Unit.INSTANCE;
            case 15:
                InviteErrorPresenter inviteErrorPresenter2 = (InviteErrorPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) inviteErrorPresenter2.navigator;
                AppMessagesOptionsViewEvent appMessagesOptionsViewEvent = (AppMessagesOptionsViewEvent) obj;
                if (appMessagesOptionsViewEvent instanceof AppMessagesOptionsViewEvent.LightPreferenceChanged) {
                    BooleanPreference booleanPreference = (BooleanPreference) inviteErrorPresenter2.args;
                    boolean z2 = ((AppMessagesOptionsViewEvent.LightPreferenceChanged) appMessagesOptionsViewEvent).checked;
                    booleanPreference.set(z2);
                    ((MutableState) obj4).setValue(Boolean.valueOf(z2));
                } else if (Intrinsics.areEqual(appMessagesOptionsViewEvent, AppMessagesOptionsViewEvent.NavigationClicked.INSTANCE)) {
                    screenNavigator4.goTo(back);
                } else if (appMessagesOptionsViewEvent instanceof AppMessagesOptionsViewEvent.VibratePreferenceChanged) {
                    BooleanPreference booleanPreference2 = (BooleanPreference) inviteErrorPresenter2.analytics;
                    boolean z3 = ((AppMessagesOptionsViewEvent.VibratePreferenceChanged) appMessagesOptionsViewEvent).checked;
                    booleanPreference2.set(z3);
                    ((MutableState) obj2).setValue(Boolean.valueOf(z3));
                } else {
                    if (!(appMessagesOptionsViewEvent instanceof AppMessagesOptionsViewEvent.PickRingtone)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AppMessagesOptionsViewEvent.PickRingtone pickRingtone = (AppMessagesOptionsViewEvent.PickRingtone) appMessagesOptionsViewEvent;
                    screenNavigator4.goTo(new ProfileScreens.RingtoneScreen(pickRingtone.currentRingtone, pickRingtone.additionalItems, true, true));
                }
                return Unit.INSTANCE;
            case 16:
                InviteErrorPresenter inviteErrorPresenter3 = (InviteErrorPresenter) obj4;
                CoroutineScope coroutineScope7 = (CoroutineScope) obj3;
                IncomingRequestsViewEvent incomingRequestsViewEvent = (IncomingRequestsViewEvent) obj;
                if (incomingRequestsViewEvent instanceof IncomingRequestsViewEvent.NewPolicy) {
                    JobKt.launch$default(coroutineScope7, null, null, new PhonePlansHomePresenter$models$1$1(24, (MutableState) obj2, incomingRequestsViewEvent, inviteErrorPresenter3, (Continuation) null), 3);
                } else {
                    if (!Intrinsics.areEqual(incomingRequestsViewEvent, IncomingRequestsViewEvent.GoBack.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) inviteErrorPresenter3.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope8 = (CoroutineScope) obj3;
                if (obj != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj4;
                JobKt.launch$default(coroutineScope8, profilePrivacyPresenter.ioDispatcher, null, new ProfileCropView.AnonymousClass3(profilePrivacyPresenter, (MutableState) obj2, null, 1), 2);
                return Unit.INSTANCE;
            case 18:
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) transfersPresenter.navigator;
                ProfilePasscodeSectionViewEvent profilePasscodeSectionViewEvent = (ProfilePasscodeSectionViewEvent) obj;
                if (profilePasscodeSectionViewEvent instanceof ProfilePasscodeSectionViewEvent.TogglePasscode) {
                    ((MutableState) obj4).setValue(Boolean.valueOf(((ProfilePasscodeSectionViewEvent.TogglePasscode) profilePasscodeSectionViewEvent).isEnabled));
                } else if (profilePasscodeSectionViewEvent instanceof ProfilePasscodeSectionViewEvent.ToggleAppLock) {
                    ((MutableState) obj2).setValue(Boolean.valueOf(((ProfilePasscodeSectionViewEvent.ToggleAppLock) profilePasscodeSectionViewEvent).isEnabled));
                } else if (profilePasscodeSectionViewEvent instanceof ProfilePasscodeSectionViewEvent.ChangePasscodeClick) {
                    screenNavigator5.goTo(((RealFlowStarter) ((FlowStarter) transfersPresenter.args)).startPasscodeFlow(Flow$Type.SET_OR_UPDATE_PASSCODE, new ProfileScreens.SecurityScreen(ProfileScreens.SecurityScreen.Section.SECURITY)));
                } else if (!(profilePasscodeSectionViewEvent instanceof ProfilePasscodeSectionViewEvent.ToggleUseBiometricsForPasscode)) {
                    if (!(profilePasscodeSectionViewEvent instanceof ProfilePasscodeSectionViewEvent.GoBack)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator5.goTo(back);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope9 = (CoroutineScope) obj3;
                AdjustableThresholdViewEvent$DoneClicked adjustableThresholdViewEvent$DoneClicked = (AdjustableThresholdViewEvent$DoneClicked) obj;
                if (adjustableThresholdViewEvent$DoneClicked != null) {
                    JobKt.launch$default(coroutineScope9, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(7, (MutableState) obj2, (TaxReturnsPresenter) obj4, adjustableThresholdViewEvent$DoneClicked, (Continuation) null), 3);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 20:
                PdfPreviewPresenter pdfPreviewPresenter4 = (PdfPreviewPresenter) obj4;
                ProfileScreens.AccountInfoScreen accountInfoScreen = (ProfileScreens.AccountInfoScreen) pdfPreviewPresenter4.pdfFile$delegate;
                FlowStarter flowStarter = (FlowStarter) pdfPreviewPresenter4.launcher;
                CoroutineScope coroutineScope10 = (CoroutineScope) obj3;
                AliasesSectionEvent aliasesSectionEvent = (AliasesSectionEvent) obj;
                if (aliasesSectionEvent instanceof AliasesSectionEvent.NavigationAction) {
                    BetterNavigator.ScreenNavigator screenNavigator6 = pdfPreviewPresenter4.navigator;
                    AliasesSectionEvent.NavigationAction navigationAction = (AliasesSectionEvent.NavigationAction) aliasesSectionEvent;
                    if (navigationAction.equals(AliasesSectionEvent.NavigationAction.AddEmail.INSTANCE)) {
                        confirmRemoveAliasScreen = FlowStarter.startRegisterEmailFlow$default(flowStarter, accountInfoScreen, null, 14);
                    } else if (navigationAction.equals(AliasesSectionEvent.NavigationAction.AddMobile.INSTANCE)) {
                        confirmRemoveAliasScreen = FlowStarter.startRegisterSmsFlow$default(flowStarter, accountInfoScreen, null, 14);
                    } else if (navigationAction.equals(AliasesSectionEvent.NavigationAction.ShowMenu.INSTANCE)) {
                        confirmRemoveAliasScreen = ProfileScreens.AddAliasScreen.INSTANCE;
                    } else {
                        if (!(navigationAction instanceof AliasesSectionEvent.NavigationAction.RemoveAlias)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ProfileAlias profileAlias = ((AliasesSectionEvent.NavigationAction.RemoveAlias) aliasesSectionEvent).alias;
                        confirmRemoveAliasScreen = new ProfileScreens.ConfirmRemoveAliasScreen(profileAlias.f1121type, new RedactedString(profileAlias.canonical_text), profileAlias.verified);
                    }
                    screenNavigator6.goTo(confirmRemoveAliasScreen);
                } else {
                    if (!(aliasesSectionEvent instanceof AliasesSectionEvent.UnregisterAlias)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope10, null, null, new RealQrCodesPresenter$models$1$1(aliasesSectionEvent, pdfPreviewPresenter4, (MutableState) obj2, null), 3);
                }
                return Unit.INSTANCE;
            case 21:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj4;
                CoroutineScope coroutineScope11 = (CoroutineScope) obj3;
                PersonalizedAdsSectionViewEvent personalizedAdsSectionViewEvent = (PersonalizedAdsSectionViewEvent) obj;
                if (personalizedAdsSectionViewEvent instanceof PersonalizedAdsSectionViewEvent.ToggleSetting) {
                    JobKt.launch$default(coroutineScope11, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(16, (MutableState) obj2, localHomePresenter, personalizedAdsSectionViewEvent, (Continuation) null), 3);
                } else {
                    if (!(personalizedAdsSectionViewEvent instanceof PersonalizedAdsSectionViewEvent.OpenUrl)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealRouter) localHomePresenter.embeddedMapEnabled$delegate).route(new RoutingParams(null, null, null, null, null, null, 511), ((PersonalizedAdsSectionViewEvent.OpenUrl) personalizedAdsSectionViewEvent).url);
                }
                return Unit.INSTANCE;
            case 22:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj4;
                CoroutineScope coroutineScope12 = (CoroutineScope) obj3;
                SearchPrivacySectionViewEvent searchPrivacySectionViewEvent = (SearchPrivacySectionViewEvent) obj;
                Continuation continuation3 = null;
                if (searchPrivacySectionViewEvent instanceof SearchPrivacySectionViewEvent.SettingToggled) {
                    JobKt.launch$default(coroutineScope12, null, null, new SelectPaymentPlanBlockerPresenter$models$1$2(17, (MutableState) obj2, localEditorialPresenter, searchPrivacySectionViewEvent, continuation3), 3);
                } else if (Intrinsics.areEqual(searchPrivacySectionViewEvent, SearchPrivacySectionViewEvent.SettingsViewed.INSTANCE)) {
                    ((Analytics) localEditorialPresenter.clock).track(new AccountViewedSearchPrivacySetting(PlatformKt.activeAccountToken((SessionManager) localEditorialPresenter.screen)), null);
                } else {
                    if (!(searchPrivacySectionViewEvent instanceof SearchPrivacySectionViewEvent.GoBack)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                }
                return Unit.INSTANCE;
            case 23:
                QrCodeProfilePresenter qrCodeProfilePresenter = (QrCodeProfilePresenter) obj3;
                Screen screen = qrCodeProfilePresenter.exitScreen;
                BetterNavigator.ScreenNavigator screenNavigator7 = qrCodeProfilePresenter.navigator;
                QrCodeProfileViewEvent qrCodeProfileViewEvent = (QrCodeProfileViewEvent) obj;
                if (qrCodeProfileViewEvent instanceof QrCodeProfileViewEvent.Loaded) {
                    Integer qrLogoColor = (qrCodeProfilePresenter.isTeenMode || (qrCodeProfilePresenter.familyProfileManager.familyProfile.$$delegate_0.getValue() instanceof FamilyProfile.ManagedAccount)) ? ((QrCodeProfileViewEvent.Loaded) qrCodeProfileViewEvent).logoColor : ThrottledCallbacksKt.qrLogoColor((PaymentPadTheme) ((State) obj4).getValue(), ((QrCodeProfileViewEvent.Loaded) qrCodeProfileViewEvent).logoColor);
                    QrCodeProfileViewEvent.Loaded loaded = (QrCodeProfileViewEvent.Loaded) qrCodeProfileViewEvent;
                    ((MutableState) obj2).setValue(new QrCodeArgs(loaded.backgroundColor, qrLogoColor, loaded.size, (Integer) null, (CurrencyCode) null, 0, 120));
                } else if (qrCodeProfileViewEvent instanceof QrCodeProfileViewEvent.Scan) {
                    if (screen != null) {
                        screenNavigator7.goTo(new CashQrCodeScanner(screen, false, 2));
                    }
                } else if (qrCodeProfileViewEvent instanceof QrCodeProfileViewEvent.Share) {
                    TeenQrCodeScreen teenQrCodeScreen = qrCodeProfilePresenter.teenQrCodeScreen;
                    if (teenQrCodeScreen == null) {
                        EglCore eglCore = qrCodeProfilePresenter.outboundNavigator;
                        ((Analytics) eglCore.eglDisplay).track(new PersonalProfileViewShare(((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) eglCore.eglContext)).peekCurrentValue(AmplitudeExperiments$DefaultQrCodeTab.INSTANCE)).enabled() ? PersonalProfileViewShare.PersonalProfileShareOrigin.BUTTON : PersonalProfileViewShare.PersonalProfileShareOrigin.TOP_BAR, PersonalProfileShareSource.QR_CODE), null);
                        ((BetterNavigator.ScreenNavigator) eglCore.eglConfig).goTo(ShareSheetScreen.INSTANCE);
                    } else {
                        String str11 = teenQrCodeScreen.dependentCashtag;
                        String symbol = Moneys.symbol(Cashtags.guessCashtagCurrency(teenQrCodeScreen.region));
                        str11.getClass();
                        screenNavigator7.goTo(new DependentTeenQrCodeShareSheetScreen(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("https://cash.me/", str11, "?from_sponsor=true"), "https://cash.me/qr/".concat(str11), teenQrCodeScreen.dependentToken, symbol));
                    }
                } else {
                    if (!(qrCodeProfileViewEvent instanceof QrCodeProfileViewEvent.Back)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (screen != null) {
                        screenNavigator7.goTo(screen);
                    }
                }
                return Unit.INSTANCE;
            case 24:
                if (continuation instanceof RealRecipientVendor$sections$lambda$1$$inlined$map$1$2$1) {
                    realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1 = (RealRecipientVendor$sections$lambda$1$$inlined$map$1$2$1) continuation;
                    int i19 = realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            SuggestedRecipients suggestedRecipients = (SuggestedRecipients) obj;
                            suggestedRecipients.getClass();
                            UiControl.Type.Companion companion = RecipientGroup.Companion;
                            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new RecipientVendor$Section[]{new RecipientVendor$Section.Recents(suggestedRecipients.recipients), (RecipientVendor$Section) obj4, (RecipientVendor$Section) obj2});
                            realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(listOf, realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj9);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1 = new RealRecipientVendor$sections$lambda$1$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realRecipientVendor$sections$lambda$1$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                return Unit.INSTANCE;
            case 25:
                if (continuation instanceof RealRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1) {
                    realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1 = (RealRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1) continuation;
                    int i20 = realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.label;
                    if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            Triple triple = new Triple((Map) obj4, (List) obj2, (Set) obj);
                            realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj3).emit(triple, realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj10);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1 = new RealRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1(this, continuation);
                Object obj102 = realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realRecipientRepository$search$lambda$0$0$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
                return Unit.INSTANCE;
            case 26:
                MutableState mutableState5 = (MutableState) obj2;
                PaymentPlanDataBlockerPresenter paymentPlanDataBlockerPresenter = (PaymentPlanDataBlockerPresenter) obj4;
                CoroutineScope coroutineScope13 = (CoroutineScope) obj3;
                PaymentPlanSummaryViewEvent paymentPlanSummaryViewEvent = (PaymentPlanSummaryViewEvent) obj;
                if (paymentPlanSummaryViewEvent instanceof PaymentPlanSummaryViewEvent.Close) {
                    BlockersDataNavigator blockersDataNavigator2 = paymentPlanDataBlockerPresenter.blockersDataNavigator;
                    BlockersScreens.PaymentPlanDataBlockerScreen paymentPlanDataBlockerScreen = paymentPlanDataBlockerPresenter.args;
                    ?? back2 = blockersDataNavigator2.getBack(paymentPlanDataBlockerScreen, paymentPlanDataBlockerScreen.blockersData);
                    if (back2 != 0) {
                        back = back2;
                    }
                    paymentPlanDataBlockerPresenter.navigator.goTo(back);
                } else if (paymentPlanSummaryViewEvent instanceof PaymentPlanSummaryViewEvent.ViewSourceInfo) {
                    mutableState5.setValue(Boolean.TRUE);
                } else if (paymentPlanSummaryViewEvent instanceof PaymentPlanSummaryViewEvent.DismissBottomSheet) {
                    mutableState5.setValue(Boolean.FALSE);
                } else if (paymentPlanSummaryViewEvent instanceof PaymentPlanSummaryViewEvent.OpenUri) {
                    route = paymentPlanDataBlockerPresenter.router.route(new RoutingParams(null, null, null, null, null, null, 511), ((PaymentPlanSummaryViewEvent.OpenUri) paymentPlanSummaryViewEvent).uri);
                    if (!route) {
                        paymentPlanDataBlockerPresenter.showError(null);
                    }
                } else {
                    if (!(paymentPlanSummaryViewEvent instanceof PaymentPlanSummaryViewEvent.Submit)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope13, null, null, new RingtoneView.AnonymousClass1(paymentPlanDataBlockerPresenter, paymentPlanSummaryViewEvent, r13, 26), 3);
                }
                return Unit.INSTANCE;
            case 27:
                return emit$com$squareup$cash$score$presenters$ScoreHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$security$presenters$BasePasswordPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                ShareTarget.Instagram instagram = (ShareTarget.Instagram) obj4;
                if (continuation instanceof RealShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1) {
                    realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1 = (RealShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1) continuation;
                    int i21 = realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.label;
                    if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                        realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                        Object obj11 = realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            FlowCollector flowCollector5 = (FlowCollector) obj3;
                            ShareableAssetsManager$DownloadedImage shareableAssetsManager$DownloadedImage = (ShareableAssetsManager$DownloadedImage) obj;
                            if (shareableAssetsManager$DownloadedImage instanceof ShareableAssetsManager$DownloadedImage.Success) {
                                ShareTarget.Instagram.Content content = new ShareTarget.Instagram.Content(((ShareableAssetsManager$DownloadedImage.Success) shareableAssetsManager$DownloadedImage).url);
                                String str12 = instagram.title;
                                str12.getClass();
                                access$assetFailedToLoad = new RealShareTargetsManager$TargetPreparationState.Ready(new ShareTarget.Instagram(str12, content));
                            } else {
                                if (!(shareableAssetsManager$DownloadedImage instanceof ShareableAssetsManager$DownloadedImage.Failure)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                access$assetFailedToLoad = StuckPlayerDetector.access$assetFailedToLoad((StuckPlayerDetector) obj2, instagram, (ShareableAssetsManager$DownloadedImage.Failure) shareableAssetsManager$DownloadedImage);
                            }
                            realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.label = 1;
                            if (flowCollector5.emit(access$assetFailedToLoad, realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1) == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj11);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1 = new RealShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1(this, continuation);
                Object obj112 = realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realShareTargetsManager$addInstagramTarget$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AndroidPermissionChecker$granted$$inlined$map$2$2(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, Object obj, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = moleculePresenter;
        this.$permissions$inlined = obj;
        this.this$0 = mutableState;
    }

    public /* synthetic */ AndroidPermissionChecker$granted$$inlined$map$2$2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = obj;
        this.$permissions$inlined = obj2;
        this.this$0 = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0126, code lost:
    
        if (com.squareup.cash.offers.backend.real.RealOffersTabRepository.access$fetchCollectionResponseFromNetwork(r5, r1, r3, r7) != r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (com.squareup.cash.offers.backend.real.RealOffersTabRepository.access$fetchCollectionResponseFromNetwork(r5, r1, r3, r7) != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (r4.emit(r0, r7) == r2) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(Pair pair, Continuation continuation) {
        RealOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1 realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1;
        int i;
        String str;
        String str2;
        Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = (Overlay$$ExternalSyntheticLambda0) this.this$0;
        FlowCollector flowCollector = (FlowCollector) this.$this_unsafeFlow;
        RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.$permissions$inlined;
        AndroidClock androidClock = realOffersTabRepository.clock;
        if (continuation instanceof RealOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1) {
            realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1 = (RealOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1) continuation;
            int i2 = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str3 = (String) pair.first;
                    OffersCollectionDetail offersCollectionDetail = (OffersCollectionDetail) pair.second;
                    if (offersCollectionDetail == null) {
                        Timber.Forest.d("Offers Collection: cache empty, result null", new Object[0]);
                        realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str3;
                        realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 1;
                        if (flowCollector.emit(null, realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1) != coroutineSingletons) {
                            str2 = str3;
                            realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str2;
                            realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 2;
                        }
                    } else {
                        OffersTabCollectionResponse offersTabCollectionResponse = offersCollectionDetail.offers_collection_response;
                        Long l = offersCollectionDetail.ttl_in_millis;
                        if ((l != null ? l.longValue() : 0L) >= androidClock.millis()) {
                            Timber.Forest.d("Offers Collection: Response returned from cache: " + offersTabCollectionResponse, new Object[0]);
                            ApiResult.Success success = new ApiResult.Success(offersTabCollectionResponse);
                            realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = null;
                            realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 3;
                        } else {
                            if ((l != null ? l.longValue() : 0L) < androidClock.millis()) {
                                Timber.Forest.d("Offers Collection: Stale Response returned from cache: " + offersTabCollectionResponse, new Object[0]);
                                ApiResult.Success success2 = new ApiResult.Success(offersTabCollectionResponse);
                                realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str3;
                                realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 4;
                                if (flowCollector.emit(success2, realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1) != coroutineSingletons) {
                                    str = str3;
                                    realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str;
                                    realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 5;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str2 = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str2;
                    realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 2;
                } else if (i == 2) {
                    str2 = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Offers Collection: making network request: ", str2), new Object[0]);
                } else {
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        str = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0 = str;
                        realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label = 5;
                    } else {
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Offers Collection: making network request: ", str), new Object[0]);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1 = new RealOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1(this, continuation);
        Object obj2 = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOffersTabRepository$emitCachedResponseOrFetchIfExpired$1$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
