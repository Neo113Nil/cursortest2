package com.squareup.cash.mri.android;

import android.app.Activity;
import android.os.CancellationSignal;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.core.os.LocaleListCompat;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManager$createCredential$2$callback$1;
import androidx.credentials.CredentialManager$getCredential$2$1;
import androidx.credentials.CredentialManagerImpl;
import androidx.credentials.CredentialProvider;
import androidx.credentials.CredentialProviderFactory;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.google.android.gms.internal.mlkit_vision_common.zzg;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.ActivityItemKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.SolidColorPBRMaterial;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.cdf.customersupport.CustomerSupportReviewComplete;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.network.GatewayRequest;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.api.SponseeCashAppTag;
import com.squareup.cash.family.familyhub.backend.real.RealTagLockService;
import com.squareup.cash.family.familyhub.presenters.CashCardControlPresenter;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.swampgl.EngineFrameScheduler$SceneGroup;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.graphics.swampgl.components.MeshGeometry;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.swampgl.components.SubMesh;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.invitations.backend.real.RealInvitationsRepository$registerInvitations$2;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.NearbyMetadata;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nfc.presenters.NfcNotAvailablePresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$models$1$1$1;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.presenters.OffersHomePresenterV2$models$2$1$1;
import com.squareup.cash.offers.presenters.RealOffersPopupMessageDismisser;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter$models$3$1$2$1;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.p2pblocking.presenters.P2PListController;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.security.presenters.BasePasswordPresenter;
import com.squareup.cash.security.presenters.PasswordEntryArgumentsAdapter;
import com.squareup.cash.security.presenters.SetPasswordPresenter;
import com.squareup.cash.security.presenters.VerifyPasswordPresenter;
import com.squareup.cash.security.service.SecurityService;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.support.chat.backend.api.ChatSurveyResponse;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.RealNextUpCandidateDismisser;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityRequest;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.customersurveyor.app.SubmitSupportSurveyRequest;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.ReportAppMessageActionRequest;
import com.squareup.protos.cash.security.SetPasswordRequest;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.cash.shop.rendering.api.CountdownCaption;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.weaver.api.DismissRecommendationCandidateRequest;
import com.squareup.protos.cash.weaver.api.WeaverApi;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetCashtagStatusRequest;
import com.squareup.protos.franklin.app.SelectActivityRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.InterceptedRenderContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.VerificationType;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.ParameterDestination;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import okio.ByteString;
import org.slf4j.Marker;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealMRIFactory$sign$2 extends SuspendLambda implements Function2 {
    public Object $attestedKeyService;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $serializedMRIContext;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMRIFactory$sign$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$attestedKeyService = obj;
        this.this$0 = obj2;
        this.$serializedMRIContext = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$serializedMRIContext;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                return new RealMRIFactory$sign$2((AttestedKeyService) this.$attestedKeyService, (RealMRIFactory) obj3, (byte[]) obj2, continuation, 0);
            case 1:
                RealMRIFactory$sign$2 realMRIFactory$sign$2 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 1);
                realMRIFactory$sign$2.$attestedKeyService = obj;
                return realMRIFactory$sign$2;
            case 2:
                RealMRIFactory$sign$2 realMRIFactory$sign$22 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (WorkHomePresenter) obj2, 2);
                realMRIFactory$sign$22.$attestedKeyService = obj;
                return realMRIFactory$sign$22;
            case 3:
                return new RealMRIFactory$sign$2((MoneybotChatViewModel.Content) this.$attestedKeyService, (LazyListState) obj3, (Function1) obj2, continuation, 3);
            case 4:
                return new RealMRIFactory$sign$2((LazyListState) this.$attestedKeyService, (RecentChatHistoryViewModel$Loaded) obj3, (MutableState) obj2, continuation, 4);
            case 5:
                RealMRIFactory$sign$2 realMRIFactory$sign$23 = new RealMRIFactory$sign$2((SnapshotStateMap) obj3, (RealNearbyManager) obj2, continuation, 5);
                realMRIFactory$sign$23.$attestedKeyService = obj;
                return realMRIFactory$sign$23;
            case 6:
                RealMRIFactory$sign$2 realMRIFactory$sign$24 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 6);
                realMRIFactory$sign$24.$attestedKeyService = obj;
                return realMRIFactory$sign$24;
            case 7:
                RealMRIFactory$sign$2 realMRIFactory$sign$25 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (NfcNotAvailablePresenter) obj2, 7);
                realMRIFactory$sign$25.$attestedKeyService = obj;
                return realMRIFactory$sign$25;
            case 8:
                RealMRIFactory$sign$2 realMRIFactory$sign$26 = new RealMRIFactory$sign$2((RealOffersTabRepository) obj3, (String) obj2, continuation, 8);
                realMRIFactory$sign$26.$attestedKeyService = obj;
                return realMRIFactory$sign$26;
            case 9:
                RealMRIFactory$sign$2 realMRIFactory$sign$27 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (DisclosurePresenter) obj2, 9);
                realMRIFactory$sign$27.$attestedKeyService = obj;
                return realMRIFactory$sign$27;
            case 10:
                RealMRIFactory$sign$2 realMRIFactory$sign$28 = new RealMRIFactory$sign$2((AndroidClock) obj3, (HeroSection) obj2, continuation, 10);
                realMRIFactory$sign$28.$attestedKeyService = obj;
                return realMRIFactory$sign$28;
            case 11:
                return new RealMRIFactory$sign$2((OffersHomePresenter) this.$attestedKeyService, (MutableState) obj3, (MutableState) obj2, continuation, 11);
            case 12:
                RealMRIFactory$sign$2 realMRIFactory$sign$29 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (LocalHomePresenter) obj2, 12);
                realMRIFactory$sign$29.$attestedKeyService = obj;
                return realMRIFactory$sign$29;
            case 13:
                RealMRIFactory$sign$2 realMRIFactory$sign$210 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 13);
                realMRIFactory$sign$210.$attestedKeyService = obj;
                return realMRIFactory$sign$210;
            case 14:
                RealMRIFactory$sign$2 realMRIFactory$sign$211 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 14);
                realMRIFactory$sign$211.$attestedKeyService = obj;
                return realMRIFactory$sign$211;
            case 15:
                RealMRIFactory$sign$2 realMRIFactory$sign$212 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (PoolsListPresenter) obj2, 15);
                realMRIFactory$sign$212.$attestedKeyService = obj;
                return realMRIFactory$sign$212;
            case 16:
                RealMRIFactory$sign$2 realMRIFactory$sign$213 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 16);
                realMRIFactory$sign$213.$attestedKeyService = obj;
                return realMRIFactory$sign$213;
            case 17:
                return new RealMRIFactory$sign$2((StateFlow) this.$attestedKeyService, (MutableState) obj3, (MutableState) obj2, continuation, 17);
            case 18:
                return new RealMRIFactory$sign$2((OffersSearchViewEvent) this.$attestedKeyService, (RealOffersSearchPresenter) obj3, (MutableState) obj2, continuation, 18);
            case 19:
                RealMRIFactory$sign$2 realMRIFactory$sign$214 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 19);
                realMRIFactory$sign$214.$attestedKeyService = obj;
                return realMRIFactory$sign$214;
            case 20:
                RealMRIFactory$sign$2 realMRIFactory$sign$215 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (CardStudioUndoDialogPresenter) obj2, 20);
                realMRIFactory$sign$215.$attestedKeyService = obj;
                return realMRIFactory$sign$215;
            case 21:
                return new RealMRIFactory$sign$2((TabToolbarPresenter) obj3, (MutableState) obj2, continuation, 21);
            case 22:
                RealMRIFactory$sign$2 realMRIFactory$sign$216 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (VerifyCheckDialogPresenter) obj2, 22);
                realMRIFactory$sign$216.$attestedKeyService = obj;
                return realMRIFactory$sign$216;
            case 23:
                RealMRIFactory$sign$2 realMRIFactory$sign$217 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (InviteErrorPresenter) obj2, 23);
                realMRIFactory$sign$217.$attestedKeyService = obj;
                return realMRIFactory$sign$217;
            case 24:
                RealMRIFactory$sign$2 realMRIFactory$sign$218 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (WorkHomePresenter) obj2, 24);
                realMRIFactory$sign$218.$attestedKeyService = obj;
                return realMRIFactory$sign$218;
            case 25:
                return new RealMRIFactory$sign$2((LocalCashBalancePresenter) this.$attestedKeyService, (P2PListViewEvent) obj3, (MutableState) obj2, continuation, 25);
            case 26:
                return new RealMRIFactory$sign$2((SelectCustomerPresenter) this.$attestedKeyService, (SelectCustomerViewEvent) obj3, (MutableState) obj2, continuation, 26);
            case 27:
                return new RealMRIFactory$sign$2((CredentialManagerImpl) this.$attestedKeyService, (Activity) obj3, (CreatePublicKeyCredentialRequest) obj2, continuation, 27);
            case 28:
                return new RealMRIFactory$sign$2((CredentialManagerImpl) this.$attestedKeyService, (Activity) obj3, (GetCredentialRequest) obj2, continuation, 28);
            default:
                RealMRIFactory$sign$2 realMRIFactory$sign$219 = new RealMRIFactory$sign$2((Flow) obj3, continuation, (TaxReturnsPresenter) obj2, 29);
                realMRIFactory$sign$219.$attestedKeyService = obj;
                return realMRIFactory$sign$219;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((RealMRIFactory$sign$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:255:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x066a A[LOOP:3: B:380:0x0664->B:382:0x066a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0674  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x050f -> B:212:0x0513). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:322:0x0617 -> B:310:0x061b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m3588prepareIoAF18A;
        Iterator it;
        Object next;
        Long l;
        Long l2;
        CountdownCaption countdownCaption;
        Object refreshHome;
        Object access$getUpdatedAccountListConfig;
        MutableState mutableState;
        int i = this.$r8$classId;
        int i2 = 6;
        boolean z = false;
        Object obj2 = this.$serializedMRIContext;
        Object obj3 = this.this$0;
        int i3 = 1;
        boolean z2 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                RealMRIFactory realMRIFactory = (RealMRIFactory) obj3;
                AttestedKeyService attestedKeyService = (AttestedKeyService) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 1;
                        m3588prepareIoAF18A = ((RealAttestedKeyService) attestedKeyService).m3588prepareIoAF18A(this);
                        if (m3588prepareIoAF18A == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        m3588prepareIoAF18A = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(m3588prepareIoAF18A);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(attestedKeyService, (byte[]) obj2, z3 ? 1 : 0, 0);
                    CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2((Object) realMRIFactory, (Continuation) (z2 ? 1 : 0), i2);
                    this.label = 2;
                    Object runWithRetries = StateFlowKt.runWithRetries(3, 500L, anonymousClass1, cachedPagingDataKt$cachedIn$2, this);
                    if (runWithRetries != coroutineSingletons) {
                        return runWithRetries;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    realMRIFactory.errorReporter.report(new RealMRIFactory.MRIFactoryError(th, "prepare", 0, false, null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    return null;
                }
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$1 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope, (VerifyCheckDialogPresenter) obj2, 21);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$12 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope2, (WorkHomePresenter) obj2, 22);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                LazyListState lazyListState = (LazyListState) obj3;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((MoneybotChatViewModel.Content.Chat) ((MoneybotChatViewModel.Content) this.$attestedKeyService)).sessionId == null) {
                        return Unit.INSTANCE;
                    }
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 9));
                    MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3 moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3 = new MoneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3((Function1) obj2, lazyListState, 0);
                    this.label = 1;
                    Object collect = snapshotFlow.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(moneybotLoadedContentKt$MoneybotLoadedContent$5$1$1$3, 19), this);
                    if (collect != coroutineSingletons4) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.$attestedKeyService, 12)));
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(17, (RecentChatHistoryViewModel$Loaded) obj3, (MutableState) obj2);
                    this.label = 1;
                    if (distinctUntilChanged.collect(offersFilterGroupSheetPresenter$models$sheet$2$1$1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj3;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (JobKt.isActive(coroutineScope3)) {
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    RealNearbyManager realNearbyManager = (RealNearbyManager) obj2;
                    Iterator it2 = snapshotStateMap.entries.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) entry.getKey();
                        long m3790nanoTimeeFsXEgE = realNearbyManager.clock.m3790nanoTimeeFsXEgE() - ((NearbyMetadata) entry.getValue()).timestampNanos;
                        Duration.Companion companion = Duration.Companion;
                        if (m3790nanoTimeeFsXEgE > Duration.m4168getInWholeNanosecondsimpl(DurationKt.toDuration(10000L, DurationUnit.MILLISECONDS))) {
                            linkedHashSet.add(nearbyAdvertisement);
                        }
                    }
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        snapshotStateMap.remove((NearbyAdvertisement) it3.next());
                    }
                    if (JobKt.isActive(coroutineScope3)) {
                        this.$attestedKeyService = coroutineScope3;
                        this.label = 1;
                        if (JobKt.delay(100L, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        RealNearbyManager realNearbyManager2 = (RealNearbyManager) obj2;
                        Iterator it22 = snapshotStateMap.entries.iterator();
                        while (it22.hasNext()) {
                        }
                        Iterator it32 = linkedHashSet2.iterator();
                        while (it32.hasNext()) {
                        }
                        if (JobKt.isActive(coroutineScope3)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$13 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope4, (VerifyCheckDialogPresenter) obj2, 23);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$13, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$14 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope5, (NfcNotAvailablePresenter) obj2, 24);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$14, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) this.$attestedKeyService;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) obj3;
                    this.$attestedKeyService = offersTabCollectionResponse;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realOffersTabRepository.ioDispatcher, new RealKeyStoreProvider$setEntry$2(17, offersTabCollectionResponse, realOffersTabRepository, (String) obj2, (Continuation) null), this);
                    Object obj5 = withContext;
                    if (withContext != obj4) {
                        obj5 = Unit.INSTANCE;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new ApiResult.Success(offersTabCollectionResponse);
            case 9:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$15 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope6, (DisclosurePresenter) obj2, 26);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$15, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                HeroSection heroSection = (HeroSection) obj2;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long millis = ((AndroidClock) obj3).millis();
                    HeroSection.HeroTile currentEffectiveHeroTile = AndroidTileMode_androidKt.currentEffectiveHeroTile(heroSection, millis);
                    produceStateScope.setValue(currentEffectiveHeroTile);
                    if (currentEffectiveHeroTile != null) {
                    }
                    List list = heroSection.hero_tiles;
                    ArrayList arrayList = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    it = arrayList.iterator();
                    if (it.hasNext()) {
                    }
                    HeroSection.HeroTile heroTile = (HeroSection.HeroTile) next;
                    l = (Long) CollectionsKt.minOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new Long[]{r12, heroTile != null ? heroTile.effective_at_ms : null}));
                    if (l != null) {
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    z = false;
                    long millis2 = ((AndroidClock) obj3).millis();
                    HeroSection.HeroTile currentEffectiveHeroTile2 = AndroidTileMode_androidKt.currentEffectiveHeroTile(heroSection, millis2);
                    produceStateScope.setValue(currentEffectiveHeroTile2);
                    Long l3 = (currentEffectiveHeroTile2 != null || (countdownCaption = currentEffectiveHeroTile2.countdown_caption) == null) ? null : countdownCaption.countdown_to_ms;
                    List list2 = heroSection.hero_tiles;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list2) {
                        HeroSection.HeroTile heroTile2 = (HeroSection.HeroTile) obj6;
                        Long l4 = heroTile2.effective_at_ms;
                        boolean z4 = (l4 == null || l4.longValue() <= millis2) ? z : true;
                        CountdownCaption countdownCaption2 = heroTile2.countdown_caption;
                        boolean z5 = (countdownCaption2 == null || (l2 = countdownCaption2.countdown_to_ms) == null || l2.longValue() > millis2) ? true : z;
                        if (z4 && z5) {
                            arrayList2.add(obj6);
                        }
                    }
                    it = arrayList2.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Long l5 = ((HeroSection.HeroTile) next).effective_at_ms;
                            l5.getClass();
                            long longValue = l5.longValue();
                            do {
                                Object next2 = it.next();
                                Long l6 = ((HeroSection.HeroTile) next2).effective_at_ms;
                                l6.getClass();
                                long longValue2 = l6.longValue();
                                if (longValue > longValue2) {
                                    next = next2;
                                    longValue = longValue2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    HeroSection.HeroTile heroTile3 = (HeroSection.HeroTile) next;
                    l = (Long) CollectionsKt.minOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new Long[]{l3, heroTile3 != null ? heroTile3.effective_at_ms : null}));
                    if (l != null) {
                        long longValue3 = l.longValue() - millis2;
                        this.$attestedKeyService = produceStateScope;
                        this.label = 1;
                        if (JobKt.delay(longValue3, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                        z = false;
                        long millis22 = ((AndroidClock) obj3).millis();
                        HeroSection.HeroTile currentEffectiveHeroTile22 = AndroidTileMode_androidKt.currentEffectiveHeroTile(heroSection, millis22);
                        produceStateScope.setValue(currentEffectiveHeroTile22);
                        if (currentEffectiveHeroTile22 != null) {
                        }
                        List list22 = heroSection.hero_tiles;
                        ArrayList arrayList22 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        it = arrayList22.iterator();
                        if (it.hasNext()) {
                        }
                        HeroSection.HeroTile heroTile32 = (HeroSection.HeroTile) next;
                        l = (Long) CollectionsKt.minOrNull((Iterable) ArraysKt___ArraysKt.filterNotNull(new Long[]{l3, heroTile32 != null ? heroTile32.effective_at_ms : null}));
                        if (l != null) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                break;
            case 11:
                OffersHomePresenter offersHomePresenter = (OffersHomePresenter) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository2 = offersHomePresenter.offersTabRepository;
                    this.label = 1;
                    refreshHome = realOffersTabRepository2.refreshHome(null, this);
                    if (refreshHome == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    refreshHome = obj;
                }
                ApiResult apiResult = (ApiResult) refreshHome;
                ((MutableState) obj3).setValue(Boolean.FALSE);
                if (apiResult instanceof ApiResult.Failure) {
                    ((MutableState) obj2).setValue(OffersHomePresenter.access$constructHomeErrorViewModel(offersHomePresenter, (ApiResult.Failure) apiResult));
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersHomePresenterV2$models$2$1$1 offersHomePresenterV2$models$2$1$1 = new OffersHomePresenterV2$models$2$1$1(coroutineScope7, (LocalHomePresenter) obj2);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersHomePresenterV2$models$2$1$1, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$16 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope8, (VerifyCheckDialogPresenter) obj2, 27);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$16, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$17 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope9, (TaxReturnsPresenter) obj2, 28);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$17, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenterV2$models$1$1$1 offersDetailsPresenterV2$models$1$1$18 = new OffersDetailsPresenterV2$models$1$1$1(coroutineScope10, (PoolsListPresenter) obj2, 29);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(offersDetailsPresenterV2$models$1$1$18, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$2 = new HomeViewPresenter$models$4$1$2(coroutineScope11, (InviteErrorPresenter) obj2, i3);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$2, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 drop = FlowKt.drop((StateFlow) this.$attestedKeyService, 1);
                    RealOffersSearchPresenter$models$3$1$2$1 realOffersSearchPresenter$models$3$1$2$1 = new RealOffersSearchPresenter$models$3$1$2$1((MutableState) obj3, (MutableState) obj2);
                    this.label = 1;
                    if (drop.collect(realOffersSearchPresenter$models$3$1$2$1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                RealOffersSearchPresenter realOffersSearchPresenter = (RealOffersSearchPresenter) obj3;
                OffersSearchViewEvent offersSearchViewEvent = (OffersSearchViewEvent) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersItemToken offersItemToken = ((OfferItemClicked) offersSearchViewEvent).itemToken;
                    if (offersItemToken != null) {
                        RealOffersTabRefresher realOffersTabRefresher = realOffersSearchPresenter.offersTabRefresher;
                        this.label = 1;
                        if (realOffersTabRefresher.refreshSearchNullState(offersItemToken, OffersTabRepository$SearchSource.ALWAYS_REMOTE, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realOffersSearchPresenter.router.route(new RoutingParams(realOffersSearchPresenter.args, null, null, null, ((Boolean) ((MutableState) obj2).getValue()).booleanValue() ? AnalyticsParams.OffersSearchMode.INSTANCE : null, null, 478), ((OfferItemClicked) offersSearchViewEvent).actionUrl);
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$22 = new HomeViewPresenter$models$4$1$2(coroutineScope12, (VerifyCheckDialogPresenter) obj2, 3);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$22, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$23 = new HomeViewPresenter$models$4$1$2(coroutineScope13, (CardStudioUndoDialogPresenter) obj2, 4);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$23, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState2 = (MutableState) obj2;
                    this.$attestedKeyService = mutableState2;
                    this.label = 1;
                    access$getUpdatedAccountListConfig = TabToolbarPresenter.access$getUpdatedAccountListConfig((TabToolbarPresenter) obj3, this);
                    if (access$getUpdatedAccountListConfig == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                    mutableState = mutableState2;
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.$attestedKeyService;
                    SafeTrace.throwOnFailure(obj);
                    access$getUpdatedAccountListConfig = obj;
                }
                mutableState.setValue((ValidatedAccountList) access$getUpdatedAccountListConfig);
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$24 = new HomeViewPresenter$models$4$1$2(coroutineScope14, (VerifyCheckDialogPresenter) obj2, 5);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$24, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$25 = new HomeViewPresenter$models$4$1$2(coroutineScope15, (InviteErrorPresenter) obj2, i2);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$25, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$26 = new HomeViewPresenter$models$4$1$2(coroutineScope16, (WorkHomePresenter) obj2, 7);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$26, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.$attestedKeyService;
                    this.label = 1;
                    if (((P2PListController) localCashBalancePresenter.timestampFormatter).handleRowTap(((P2PListScreen) localCashBalancePresenter.service).forCustomerToken, ((P2PListViewEvent.TapRowButton) ((P2PListViewEvent) obj3)).tapButtonEvent, (MutableState) obj2, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectCustomerPresenter selectCustomerPresenter = (SelectCustomerPresenter) this.$attestedKeyService;
                    this.label = 1;
                    if (((P2PListController) selectCustomerPresenter.controller).handleRowTap(((SelectCustomerScreen) selectCustomerPresenter.args).forCustomerToken, ((SelectCustomerViewEvent.TapCustomerButton) ((SelectCustomerViewEvent) obj3)).tapButtonEvent, (MutableState) obj2, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 != 0) {
                    if (i31 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CredentialManagerImpl credentialManagerImpl = (CredentialManagerImpl) this.$attestedKeyService;
                Activity activity = (Activity) obj3;
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) obj2;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                cancellableContinuationImpl.initCancellability();
                CancellationSignal cancellationSignal = new CancellationSignal();
                cancellableContinuationImpl.invokeOnCancellation(new CredentialManager$getCredential$2$1(cancellationSignal, 1));
                CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1 = new CredentialManager$createCredential$2$callback$1(cancellableContinuationImpl);
                ArchTaskExecutor$$ExternalSyntheticLambda0 archTaskExecutor$$ExternalSyntheticLambda0 = new ArchTaskExecutor$$ExternalSyntheticLambda0(1);
                CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(credentialManagerImpl.context, 0), createPublicKeyCredentialRequest);
                if (bestAvailableProvider$default == null) {
                    credentialManager$createCredential$2$callback$1.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                } else if (activity.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    credentialManager$createCredential$2$callback$1.onError(new CreateCredentialUnsupportedException("createCredential is not supported on this device"));
                } else {
                    bestAvailableProvider$default.onCreateCredential(activity, createPublicKeyCredentialRequest, cancellationSignal, archTaskExecutor$$ExternalSyntheticLambda0, credentialManager$createCredential$2$callback$1);
                }
                Object result = cancellableContinuationImpl.getResult();
                return result == coroutineSingletons27 ? coroutineSingletons27 : result;
            case 28:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object credential = CredentialManagerImpl.getCredential((Activity) obj3, (GetCredentialRequest) obj2, this);
                    return credential == coroutineSingletons28 ? coroutineSingletons28 : credential;
                }
                if (i32 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.$attestedKeyService;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HomeViewPresenter$models$4$1$2 homeViewPresenter$models$4$1$27 = new HomeViewPresenter$models$4$1$2(coroutineScope17, (TaxReturnsPresenter) obj2, 8);
                    this.$attestedKeyService = null;
                    this.label = 1;
                    if (((Flow) obj3).collect(homeViewPresenter$models$4$1$27, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.mri.android.RealMRIFactory$sign$2$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public Object $attestedKeyService;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $serializedMRIContext;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.$attestedKeyService = obj;
            this.$serializedMRIContext = obj2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            Object obj = this.$serializedMRIContext;
            switch (i) {
                case 0:
                    return new AnonymousClass1((AttestedKeyService) this.$attestedKeyService, (byte[]) obj, continuation, 0);
                case 1:
                    return new AnonymousClass1((ContouredTextRing) this.$attestedKeyService, (MeshGeometry) obj, continuation, 1);
                case 2:
                    return new AnonymousClass1((MeshGeometry) this.$attestedKeyService, (HeartScene) obj, continuation, 2);
                case 3:
                    return new AnonymousClass1((CardGridNuxScene) this.$attestedKeyService, (List) obj, continuation, 3);
                case 4:
                    return new AnonymousClass1((WireAdapter) this.$attestedKeyService, (GatewayRequest) obj, continuation, 4);
                case 5:
                    return new AnonymousClass1((RealFeatureEligibilityRepository) this.$attestedKeyService, (String) obj, continuation, 5);
                case 6:
                    return new AnonymousClass1((CashCardControlPresenter) this.$attestedKeyService, (SponseeCashAppTag) obj, continuation, 6);
                case 7:
                    return new AnonymousClass1((CashCardControlPresenter) this.$attestedKeyService, (String) obj, continuation, 7);
                case 8:
                    return new AnonymousClass1((FormCashtagPresenter) this.$attestedKeyService, (String) obj, continuation, 8);
                case 9:
                    return new AnonymousClass1((EngineFrameScheduler$SceneGroup) this.$attestedKeyService, (String) obj, continuation, 9);
                case 10:
                    return new AnonymousClass1((Entity) this.$attestedKeyService, (Scene) obj, continuation, 10);
                case 11:
                    return new AnonymousClass1((IblComponent) this.$attestedKeyService, (Scene) obj, continuation, 11);
                case 12:
                    return new AnonymousClass1((List) this.$attestedKeyService, (InviteContactsPresenter) obj, continuation, 12);
                case 13:
                    return new AnonymousClass1((InviteContactsPresenter) this.$attestedKeyService, (ArrayList) obj, continuation, 13);
                case 14:
                    return new AnonymousClass1((RealOffersSheetRepository) this.$attestedKeyService, (OfferSheetKey) obj, continuation, 14);
                case 15:
                    return new AnonymousClass1((RealOffersPopupMessageDismisser) this.$attestedKeyService, (String) obj, continuation, 15);
                case 16:
                    return new AnonymousClass1((PdfPreviewPresenter) this.$attestedKeyService, (BlockersData) obj, continuation, 16);
                case 17:
                    return new AnonymousClass1((BasePasswordPresenter) this.$attestedKeyService, (String) obj, continuation, 17);
                case 18:
                    return new AnonymousClass1((SetPasswordPresenter) this.$attestedKeyService, (PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData) obj, continuation, 18);
                case 19:
                    return new AnonymousClass1((VerifyPasswordPresenter) this.$attestedKeyService, (VerifyPasswordRequest) obj, continuation, 19);
                case 20:
                    return new AnonymousClass1((RealChatSurveyService) this.$attestedKeyService, (ChatSurveyResponse) obj, continuation, 20);
                case 21:
                    return new AnonymousClass1((UnifiedActivityPickerBlockerPresenter) this.$attestedKeyService, (ActivityItem) obj, continuation, 21);
                case 22:
                    return new AnonymousClass1((RealNextUpCandidateDismisser) this.$attestedKeyService, (String) obj, continuation, 22);
                case 23:
                    return new AnonymousClass1((Function2) this.$attestedKeyService, (InterceptedRenderContext) obj, continuation, 23);
                case 24:
                    return new AnonymousClass1((ToolbarTuckTargets) this.$attestedKeyService, (FinancialConnectionsAuthorizationSession) obj, continuation, 24);
                case 25:
                    return new AnonymousClass1((SaveAccountToLink) this.$attestedKeyService, (Set) obj, continuation, 25);
                case 26:
                    return new AnonymousClass1((ConsentViewModel) obj, continuation, 26);
                case 27:
                    return new AnonymousClass1((NetworkingLinkSignupState) this.$attestedKeyService, (NetworkingLinkSignupViewModel) obj, continuation, 27);
                case 28:
                    return new AnonymousClass1((NetworkingLinkSignupViewModel) this.$attestedKeyService, (String) obj, continuation, 28);
                default:
                    return new AnonymousClass1((NetworkingLinkVerificationViewModel) obj, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
                case 11:
                    ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            if (r0 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x036d, code lost:
        
            if (r2 == r1) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        
            if (r2 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:550:0x0a4e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r3, r4, r21) == r2) goto L480;
         */
        /* JADX WARN: Code restructure failed: missing block: B:552:?, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:554:0x0a30, code lost:
        
            if (r1.setUniqueCards(r3, r21) == r2) goto L480;
         */
        /* JADX WARN: Code restructure failed: missing block: B:599:0x0b55, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.first(r1, r3, r21) == r0) goto L526;
         */
        /* JADX WARN: Code restructure failed: missing block: B:601:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:603:0x0b40, code lost:
        
            if (r1.invoke(r21) == r0) goto L526;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00d8, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(r2, r21) == r9) goto L59;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object cashtagStatus;
            long j;
            long j2;
            long j3;
            Object submitSupportSurvey;
            CustomerSupportReviewComplete.Status status;
            Object markConsentAcquired;
            Object access$determineNavigationDestination;
            Object invoke$default;
            NetworkingLinkSignupState.Content content;
            PhoneNumberFormatter forCountry;
            PhoneNumberController phoneNumberController;
            String str;
            NetworkingLinkSignupState.Content content2;
            String str2;
            String str3;
            Object invoke$default2;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object startConsumerVerification;
            int i = 7;
            int i2 = 6;
            int i3 = 0;
            int i4 = 2;
            switch (this.$r8$classId) {
                case 0:
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        AttestedKeyService attestedKeyService = (AttestedKeyService) this.$attestedKeyService;
                        byte[] bArr = (byte[]) this.$serializedMRIContext;
                        this.label = 1;
                        Object m3589signgIAlus = ((RealAttestedKeyService) attestedKeyService).m3589signgIAlus(bArr);
                        if (m3589signgIAlus == obj3) {
                            return obj3;
                        }
                        obj2 = m3589signgIAlus;
                    } else {
                        if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        obj2 = ((Result) obj).value;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    return obj2;
                case 1:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Function1 function1 = ((ContouredTextRing) this.$attestedKeyService).awaitHostReady;
                        this.label = 1;
                        break;
                    } else {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            ContouredTextRing contouredTextRing = (ContouredTextRing) this.$attestedKeyService;
                            Entity entity = new Entity(contouredTextRing.entityId, (MeshGeometry) this.$serializedMRIContext, contouredTextRing.material, contouredTextRing.transform);
                            ContouredTextRing contouredTextRing2 = (ContouredTextRing) this.$attestedKeyService;
                            entity.setNeedsDoubleSidedRendering(true);
                            entity.depthWrite = false;
                            entity.setVisible(contouredTextRing2.visible);
                            ((ContouredTextRing) this.$attestedKeyService).entity = entity;
                            ((ContouredTextRing) this.$attestedKeyService).addEntity.invoke(entity);
                            ((ContouredTextRing) this.$attestedKeyService).markDirty.invoke();
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ReadonlyStateFlow readonlyStateFlow = ((MeshGeometry) this.$serializedMRIContext).ready;
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i4, null, i);
                    this.label = 2;
                    break;
                case 2:
                    MeshGeometry meshGeometry = (MeshGeometry) this.$attestedKeyService;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ReadonlyStateFlow readonlyStateFlow2 = meshGeometry.ready;
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$52 = new SessionWorkerKt$runSession$5(i4, null, 9);
                        this.label = 1;
                        if (FlowKt.first(readonlyStateFlow2, sessionWorkerKt$runSession$52, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    HeartScene heartScene = (HeartScene) this.$serializedMRIContext;
                    Quat quat = HeartScene.DEFAULT_ROTATION;
                    List list = meshGeometry.subMeshes;
                    List<SubMesh> list2 = !list.isEmpty() ? list : null;
                    if (list2 == null) {
                        list2 = CollectionsKt__CollectionsJVMKt.listOf(new SubMesh("FirstEdition_Mat", 0, meshGeometry.indexCount));
                    }
                    for (SubMesh subMesh : list2) {
                        ConcurrentHashMap concurrentHashMap = heartScene.materials;
                        String str4 = subMesh.name;
                        String str5 = subMesh.name;
                        Object obj4 = concurrentHashMap.get(str4);
                        if (obj4 == null) {
                            Quat quat2 = HeartScene.DEFAULT_ROTATION;
                            obj4 = zzb.materialFor(heartScene.engine, str5, false);
                            concurrentHashMap.put(str4, obj4);
                        }
                        heartScene.addEntity(new Entity("heart_first_edition_".concat(str5), meshGeometry.subMeshes.isEmpty() ? meshGeometry : new EglCore(meshGeometry, subMesh), (SolidColorPBRMaterial) obj4, heartScene.heartTransform));
                    }
                    heartScene.applyPendingOpacity();
                    heartScene.markDirty();
                    return Unit.INSTANCE;
                case 3:
                    CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) this.$attestedKeyService;
                    InstancedCardBatch instancedCardBatch = cardGridNuxScene.instancedBatch;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        List list3 = (List) this.$serializedMRIContext;
                        this.label = 1;
                        break;
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            if (!cardGridNuxScene.entityAdded) {
                                cardGridNuxScene.addEntity(instancedCardBatch.getEntity());
                                cardGridNuxScene.entityAdded = true;
                            }
                            StateFlowImpl stateFlowImpl = cardGridNuxScene._ready;
                            Boolean bool = Boolean.TRUE;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, bool);
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    CardGridNuxScene.access$updateCardTransforms(cardGridNuxScene);
                    StateFlow ready = instancedCardBatch.getEntity().geometry.getReady();
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$53 = new SessionWorkerKt$runSession$5(i4, null, 15);
                    this.label = 2;
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    WireAdapter wireAdapter = (WireAdapter) this.$attestedKeyService;
                    GatewayRequest gatewayRequest = (GatewayRequest) this.$serializedMRIContext;
                    this.label = 1;
                    Object syncEntities = wireAdapter.getSyncEntities(gatewayRequest, this);
                    return syncEntities == coroutineSingletons4 ? coroutineSingletons4 : syncEntities;
                case 5:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    C4BClientService c4BClientService = ((RealFeatureEligibilityRepository) this.$attestedKeyService).service;
                    GetC4bEligibilityRequest getC4bEligibilityRequest = new GetC4bEligibilityRequest((String) this.$serializedMRIContext, ByteString.EMPTY);
                    this.label = 1;
                    Object c4bEligibility = c4BClientService.getC4bEligibility(getC4bEligibilityRequest, this);
                    return c4bEligibility == coroutineSingletons5 ? coroutineSingletons5 : c4bEligibility;
                case 6:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealTagLockService realTagLockService = ((CashCardControlPresenter) this.$attestedKeyService).tagLockService;
                    String str6 = ((SponseeCashAppTag) this.$serializedMRIContext).deviceId;
                    this.label = 1;
                    Object lockTag = realTagLockService.lockTag(str6, this);
                    return lockTag == coroutineSingletons6 ? coroutineSingletons6 : lockTag;
                case 7:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealTagLockService realTagLockService2 = ((CashCardControlPresenter) this.$attestedKeyService).tagLockService;
                    String str7 = (String) this.$serializedMRIContext;
                    this.label = 1;
                    Object unlockTag = realTagLockService2.unlockTag(str7, this);
                    return unlockTag == coroutineSingletons7 ? coroutineSingletons7 : unlockTag;
                case 8:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FormCashtagPresenter formCashtagPresenter = (FormCashtagPresenter) this.$attestedKeyService;
                        String str8 = (String) this.$serializedMRIContext;
                        this.label = 1;
                        cashtagStatus = formCashtagPresenter.appService.getCashtagStatus(formCashtagPresenter.clientScenario, formCashtagPresenter.flowToken, new GetCashtagStatusRequest(str8, (GetCashtagStatusRequest.CashtagRestriction) null, i2), this);
                        if (cashtagStatus == coroutineSingletons8) {
                            return coroutineSingletons8;
                        }
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        cashtagStatus = obj;
                    }
                    ApiResult apiResult = (ApiResult) cashtagStatus;
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.e("Failed to get cashtag status.", new Object[0]);
                    }
                    if (apiResult instanceof ApiResult.Success) {
                        return ((ApiResult.Success) apiResult).response;
                    }
                    return null;
                case 9:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        long nanoTime = System.nanoTime();
                        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup = (EngineFrameScheduler$SceneGroup) this.$attestedKeyService;
                        synchronized (engineFrameScheduler$SceneGroup.lock) {
                            j = engineFrameScheduler$SceneGroup.lastRenderTimeNs;
                        }
                        long j4 = nanoTime - j;
                        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup2 = (EngineFrameScheduler$SceneGroup) this.$attestedKeyService;
                        synchronized (engineFrameScheduler$SceneGroup2.lock) {
                            j2 = engineFrameScheduler$SceneGroup2.targetFrameIntervalNs;
                        }
                        EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup3 = (EngineFrameScheduler$SceneGroup) this.$attestedKeyService;
                        synchronized (engineFrameScheduler$SceneGroup3.lock) {
                            j3 = engineFrameScheduler$SceneGroup3.lastRenderTimeNs;
                        }
                        if (j3 != 0 && j4 < j2) {
                            long j5 = (j2 - j4) / 1000000;
                            if (j5 > 0) {
                                this.label = 1;
                                if (JobKt.delay(j5, this) == coroutineSingletons9) {
                                    return coroutineSingletons9;
                                }
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    EngineFrameScheduler$SceneGroup engineFrameScheduler$SceneGroup4 = (EngineFrameScheduler$SceneGroup) this.$attestedKeyService;
                    synchronized (engineFrameScheduler$SceneGroup4.lock) {
                        engineFrameScheduler$SceneGroup4.lastRenderTimeNs = System.nanoTime();
                    }
                    EngineFrameScheduler$SceneGroup.access$renderAllTargets((EngineFrameScheduler$SceneGroup) this.$attestedKeyService, (String) this.$serializedMRIContext);
                    return Unit.INSTANCE;
                case 10:
                    Scene scene = (Scene) this.$serializedMRIContext;
                    Entity entity2 = (Entity) this.$attestedKeyService;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) entity2.material.getReady().getValue()).booleanValue() && ((Boolean) entity2.geometry.getReady().getValue()).booleanValue()) {
                            try {
                                scene.shaderManager.getOrCompileShader(entity2);
                            } catch (Exception e) {
                                Timber.Forest forest = Timber.Forest;
                                forest.tag("Scene");
                                forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Shader pre-compilation failed for entity '", entity2.id, "'"), new Object[0], e);
                            }
                        }
                        ChannelFlowBuilder channelFlowBuilder = entity2.dirty;
                        Scene.AnonymousClass1.C00591 c00591 = new Scene.AnonymousClass1.C00591(scene, 1);
                        this.label = 1;
                        if (channelFlowBuilder.collect(c00591, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(obj);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((IblComponent) this.$attestedKeyService).dirty;
                    Scene.AnonymousClass1.C00591 c005912 = new Scene.AnonymousClass1.C00591((Scene) this.$serializedMRIContext, i4);
                    this.label = 1;
                    sharedFlowImpl.collect(c005912, this);
                    return coroutineSingletons11;
                case 12:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 != 0) {
                        if (i17 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    String str9 = (String) CollectionsKt.first((List) this.$attestedKeyService);
                    EglCore eglCore = ((InviteContactsPresenter) this.$serializedMRIContext).invitationsRepository;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(str9);
                    this.label = 1;
                    Object withContext = JobKt.withContext((CoroutineContext) eglCore.eglContext, new MusicPresenter$models$2$1(eglCore, listOf, null, 5), this);
                    return withContext == coroutineSingletons12 ? coroutineSingletons12 : withContext;
                case 13:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore2 = ((InviteContactsPresenter) this.$attestedKeyService).invitationsRepository;
                    ArrayList arrayList = (ArrayList) this.$serializedMRIContext;
                    this.label = 1;
                    Object withContext2 = JobKt.withContext((CoroutineContext) eglCore2.eglContext, new RealInvitationsRepository$registerInvitations$2(eglCore2, arrayList, null), this);
                    return withContext2 == coroutineSingletons13 ? coroutineSingletons13 : withContext2;
                case 14:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) this.$attestedKeyService;
                    OfferSheetKey offerSheetKey = (OfferSheetKey) this.$serializedMRIContext;
                    this.label = 1;
                    Object access$getOffersSheetResponseFromNetwork = RealOffersSheetRepository.access$getOffersSheetResponseFromNetwork(realOffersSheetRepository, offerSheetKey, this);
                    return access$getOffersSheetResponseFromNetwork == coroutineSingletons14 ? coroutineSingletons14 : access$getOffersSheetResponseFromNetwork;
                case 15:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppMessageClientService appMessageClientService = ((RealOffersPopupMessageDismisser) this.$attestedKeyService).service;
                    ReportAppMessageActionRequest reportAppMessageActionRequest = new ReportAppMessageActionRequest((String) this.$serializedMRIContext, null);
                    this.label = 1;
                    Object reportAppMessageAction = appMessageClientService.reportAppMessageAction(reportAppMessageActionRequest, this);
                    return reportAppMessageAction == coroutineSingletons15 ? coroutineSingletons15 : reportAppMessageAction;
                case 16:
                    BlockersData blockersData = (BlockersData) this.$serializedMRIContext;
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 != 0) {
                        if (i21 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = (AppService) ((PdfPreviewPresenter) this.$attestedKeyService).fileProvider;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str10 = blockersData.flowToken;
                    EmptyList emptyList = EmptyList.INSTANCE;
                    RequestContext requestContext = blockersData.requestContext;
                    SubmitFormRequest submitFormRequest = new SubmitFormRequest(requestContext, requestContext.blocker_descriptor_id, emptyList, 8);
                    this.label = 1;
                    Object submitForm = appService.submitForm(clientScenario, str10, submitFormRequest, this);
                    return submitForm == coroutineSingletons16 ? coroutineSingletons16 : submitForm;
                case 17:
                    BasePasswordPresenter basePasswordPresenter = (BasePasswordPresenter) this.$attestedKeyService;
                    PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = basePasswordPresenter.args;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppService appService2 = basePasswordPresenter.appService;
                    SubmitFormRequest submitFormRequest2 = new SubmitFormRequest(passwordEntryArgumentsAdapter.screen.getBlockersData().requestContext, (String) this.$serializedMRIContext, EmptyList.INSTANCE, 8);
                    ClientScenario clientScenario2 = passwordEntryArgumentsAdapter.screen.getBlockersData().clientScenario;
                    clientScenario2.getClass();
                    String str11 = passwordEntryArgumentsAdapter.screen.getBlockersData().flowToken;
                    this.label = 1;
                    Object submitForm2 = appService2.submitForm(clientScenario2, str11, submitFormRequest2, this);
                    return submitForm2 == coroutineSingletons17 ? coroutineSingletons17 : submitForm2;
                case 18:
                    SetPasswordPresenter setPasswordPresenter = (SetPasswordPresenter) this.$attestedKeyService;
                    PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter2 = setPasswordPresenter.args;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i23 = this.label;
                    if (i23 != 0) {
                        if (i23 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    SecurityService securityService = setPasswordPresenter.securityService;
                    ClientScenario clientScenario3 = passwordEntryArgumentsAdapter2.screen.getBlockersData().clientScenario;
                    clientScenario3.getClass();
                    String str12 = passwordEntryArgumentsAdapter2.screen.getBlockersData().flowToken;
                    SetPasswordRequest setPasswordRequest = new SetPasswordRequest(passwordEntryArgumentsAdapter2.screen.getBlockersData().requestContext, ((PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData) this.$serializedMRIContext).password, ByteString.EMPTY);
                    this.label = 1;
                    Object password = securityService.setPassword(clientScenario3, str12, setPasswordRequest, this);
                    return password == coroutineSingletons18 ? coroutineSingletons18 : password;
                case 19:
                    VerifyPasswordPresenter verifyPasswordPresenter = (VerifyPasswordPresenter) this.$attestedKeyService;
                    PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter3 = verifyPasswordPresenter.args;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 != 0) {
                        if (i24 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    SecurityService securityService2 = verifyPasswordPresenter.securityService;
                    ClientScenario clientScenario4 = passwordEntryArgumentsAdapter3.screen.getBlockersData().clientScenario;
                    clientScenario4.getClass();
                    String str13 = passwordEntryArgumentsAdapter3.screen.getBlockersData().flowToken;
                    VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) this.$serializedMRIContext;
                    this.label = 1;
                    Object verifyPassword = securityService2.verifyPassword(clientScenario4, str13, verifyPasswordRequest, this);
                    return verifyPassword == coroutineSingletons19 ? coroutineSingletons19 : verifyPassword;
                case 20:
                    ChatSurveyResponse chatSurveyResponse = (ChatSurveyResponse) this.$serializedMRIContext;
                    RealChatSurveyService realChatSurveyService = (RealChatSurveyService) this.$attestedKeyService;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        com.squareup.protos.cash.customersurveyor.app.AppService appService3 = realChatSurveyService.service;
                        SubmitSupportSurveyRequest submitSupportSurveyRequest = new SubmitSupportSurveyRequest(chatSurveyResponse.surveyToken, chatSurveyResponse.resolved, new Integer(0), chatSurveyResponse.selectedReasons, null, new Integer(chatSurveyResponse.satisfaction), ByteString.EMPTY);
                        this.label = 1;
                        submitSupportSurvey = appService3.submitSupportSurvey(submitSupportSurveyRequest, this);
                        if (submitSupportSurvey == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        submitSupportSurvey = obj;
                    }
                    ApiResult apiResult2 = (ApiResult) submitSupportSurvey;
                    Analytics analytics = realChatSurveyService.analytics;
                    String str14 = chatSurveyResponse.surveyToken;
                    boolean z = apiResult2 instanceof ApiResult.Success;
                    if (z) {
                        status = CustomerSupportReviewComplete.Status.SUCCESS;
                    } else {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        status = CustomerSupportReviewComplete.Status.FAILURE;
                    }
                    analytics.track(new CustomerSupportReviewComplete(status, str14), null);
                    if (z) {
                        realChatSurveyService.notificationManager.cancelAll(7);
                    }
                    return Unit.INSTANCE;
                case 21:
                    UnifiedActivityPickerBlockerPresenter unifiedActivityPickerBlockerPresenter = (UnifiedActivityPickerBlockerPresenter) this.$attestedKeyService;
                    BlockersScreens.ActivityPickerScreen activityPickerScreen = unifiedActivityPickerBlockerPresenter.args;
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    AppService appService4 = unifiedActivityPickerBlockerPresenter.appService;
                    BlockersData blockersData2 = activityPickerScreen.blockersData;
                    ClientScenario clientScenario5 = blockersData2.clientScenario;
                    String str15 = blockersData2.flowToken;
                    SelectActivityRequest selectActivityRequest = new SelectActivityRequest(activityPickerScreen.blockersData.requestContext, ActivityItemKt.getItemId((ActivityItem) this.$serializedMRIContext), ByteString.EMPTY);
                    this.label = 1;
                    Object selectActivity = appService4.selectActivity(clientScenario5, str15, selectActivityRequest, this);
                    return selectActivity == coroutineSingletons21 ? coroutineSingletons21 : selectActivity;
                case 22:
                    RealNextUpCandidateDismisser realNextUpCandidateDismisser = (RealNextUpCandidateDismisser) this.$attestedKeyService;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.label;
                    if (i27 != 0) {
                        if (i27 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    WeaverApi weaverApi = realNextUpCandidateDismisser.weaverApi;
                    DismissRecommendationCandidateRequest dismissRecommendationCandidateRequest = new DismissRecommendationCandidateRequest(PlatformKt.activeAccountToken(realNextUpCandidateDismisser.sessionManager), RecommendationType.GENERIC_RECOMMENDATION, "CARD_HOME_NEXT_UP", (String) this.$serializedMRIContext, ByteString.EMPTY);
                    this.label = 1;
                    Object dismissRecommendationCandidate = weaverApi.dismissRecommendationCandidate(dismissRecommendationCandidateRequest, this);
                    return dismissRecommendationCandidate == coroutineSingletons22 ? coroutineSingletons22 : dismissRecommendationCandidate;
                case 23:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Function2 function2 = (Function2) this.$attestedKeyService;
                        ContextScope CoroutineScope = JobKt.CoroutineScope(getContext());
                        this.label = 1;
                        if (function2.invoke(CoroutineScope, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 24:
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 != 0) {
                        if (i29 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) this.$attestedKeyService;
                    FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = (FinancialConnectionsRepositoryImpl) toolbarTuckTargets.startCornerCenterX$delegate;
                    String str16 = ((FinancialConnectionsSheetConfiguration) toolbarTuckTargets.endCornerCenterX$delegate).financialConnectionsSessionClientSecret;
                    String str17 = ((FinancialConnectionsAuthorizationSession) this.$serializedMRIContext).id;
                    this.label = 1;
                    Object execute = financialConnectionsRepositoryImpl.requestExecutor.execute(ApiRequest.Factory.createPost$default(financialConnectionsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/connections/auth_sessions/oauth_results", financialConnectionsRepositoryImpl.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("id", str17), new Pair("client_secret", str16))), MixedOAuthParams.Companion.serializer(), this);
                    return execute == coroutineSingletons24 ? coroutineSingletons24 : execute;
                case 25:
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SaveAccountToLink saveAccountToLink = (SaveAccountToLink) this.$attestedKeyService;
                        FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = saveAccountToLink.accountsRepository;
                        String str18 = saveAccountToLink.configuration.financialConnectionsSessionClientSecret;
                        Set set = (Set) this.$serializedMRIContext;
                        this.label = 1;
                        financialConnectionsAccountsRepositoryImpl.getClass();
                        Set set2 = set;
                        int i31 = 10;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                        int i32 = 0;
                        for (Object obj5 : set2) {
                            int i33 = i32 + 1;
                            if (i32 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            arrayList2.add(new Pair(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i32, "linked_accounts[", "]"), (String) obj5));
                            i32 = i33;
                        }
                        Object executeInternal = financialConnectionsAccountsRepositoryImpl.requestExecutor.executeInternal(ApiRequest.Factory.createGet$default(financialConnectionsAccountsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/link_account_sessions/poll_account_numbers", financialConnectionsAccountsRepositoryImpl.provideApiRequestOptions.invoke(false), MapsKt__MapsKt.plus(MapsKt__MapsKt.toMap(arrayList2), new Pair("client_secret", str18))), new StripeApiRepository$$ExternalSyntheticLambda5(i31), this);
                        if (executeInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            executeInternal = Unit.INSTANCE;
                        }
                        if (executeInternal == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    ConsentViewModel consentViewModel = (ConsentViewModel) this.$serializedMRIContext;
                    Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        consentViewModel.eventTracker.track(FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE);
                        AcceptConsent acceptConsent = consentViewModel.acceptConsent;
                        this.label = 1;
                        markConsentAcquired = acceptConsent.repository.markConsentAcquired(acceptConsent.configuration.financialConnectionsSessionClientSecret, this);
                        break;
                    } else {
                        if (i34 != 1) {
                            if (i34 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj6 = (FinancialConnectionsSessionManifest) this.$attestedKeyService;
                            SafeTrace.throwOnFailure(obj);
                            access$determineNavigationDestination = obj;
                            NavigationManagerImpl.tryNavigateTo$default(consentViewModel.navigationManager, Destination.invoke$default((Destination) access$determineNavigationDestination, FinancialConnectionsSessionManifest.Pane.CONSENT), null, 6);
                            return obj6;
                        }
                        SafeTrace.throwOnFailure(obj);
                        markConsentAcquired = obj;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) markConsentAcquired;
                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.CONSENT_ACQUIRED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                    this.$attestedKeyService = financialConnectionsSessionManifest2;
                    this.label = 2;
                    access$determineNavigationDestination = ConsentViewModel.access$determineNavigationDestination(consentViewModel, financialConnectionsSessionManifest2, this);
                    if (access$determineNavigationDestination != obj6) {
                        obj6 = financialConnectionsSessionManifest2;
                        NavigationManagerImpl.tryNavigateTo$default(consentViewModel.navigationManager, Destination.invoke$default((Destination) access$determineNavigationDestination, FinancialConnectionsSessionManifest.Pane.CONSENT), null, 6);
                    }
                    return obj6;
                case 27:
                    NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) this.$attestedKeyService;
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel = (NetworkingLinkSignupViewModel) this.$serializedMRIContext;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i35 = this.label;
                    if (i35 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync.RefetchCondition refetchCondition = networkingLinkSignupState.isInstantDebits ? GetOrFetchSync.RefetchCondition.None.INSTANCE : GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                        GetOrFetchSync getOrFetchSync = networkingLinkSignupViewModel.getOrFetchSync;
                        this.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, refetchCondition, this, 2);
                        if (invoke$default == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i35 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default = obj;
                    }
                    SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) invoke$default;
                    TextUpdate textUpdate = synchronizeSessionResponse.text;
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = synchronizeSessionResponse.manifest;
                    if (textUpdate != null) {
                        LinkLoginPane linkLoginPane = textUpdate.linkLoginPane;
                        if (linkLoginPane != null) {
                            content2 = new NetworkingLinkSignupState.Content(linkLoginPane.title, linkLoginPane.body, EmptyList.INSTANCE, linkLoginPane.aboveCta, linkLoginPane.cta, null, null);
                        } else {
                            NetworkingLinkSignupPane networkingLinkSignupPane = textUpdate.networkingLinkSignupPane;
                            content2 = networkingLinkSignupPane != null ? new NetworkingLinkSignupState.Content(networkingLinkSignupPane.title, null, networkingLinkSignupPane.body.bullets, networkingLinkSignupPane.aboveCta, networkingLinkSignupPane.cta, networkingLinkSignupPane.skipCta, networkingLinkSignupPane.legalDetailsNotice) : null;
                        }
                        content = content2;
                    } else {
                        content = null;
                    }
                    networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(networkingLinkSignupViewModel.getPane(), 25));
                    ElementsSessionContext elementsSessionContext = networkingLinkSignupViewModel.elementsSessionContext;
                    ElementsSessionContext.PrefillDetails prefillDetails = elementsSessionContext != null ? elementsSessionContext.prefillDetails : null;
                    String str19 = financialConnectionsSessionManifest3.accountholderCustomerEmailAddress;
                    if (str19 == null) {
                        str19 = prefillDetails != null ? prefillDetails.email : null;
                    }
                    String str20 = (str19 == null || StringsKt.isBlank(str19)) ? null : str19;
                    if (content == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    String str21 = financialConnectionsSessionManifest3.businessName;
                    if (str21 == null) {
                        str21 = financialConnectionsSessionManifest3.connectPlatformName;
                    }
                    String str22 = str21;
                    String str23 = financialConnectionsSessionManifest3.id;
                    boolean z2 = financialConnectionsSessionManifest3.appVerificationEnabled;
                    SimpleTextFieldController simpleTextFieldController = new SimpleTextFieldController(new EmailConfig(OtelConventions.resolvableString$default(R.string.stripe_networking_signup_email_label, new Object[0])), str20);
                    String str24 = financialConnectionsSessionManifest3.accountholderPhoneNumber;
                    if (str24 == null) {
                        str24 = prefillDetails != null ? prefillDetails.phone : null;
                        if (str24 == null) {
                            str24 = "";
                        }
                    }
                    String str25 = prefillDetails != null ? prefillDetails.phoneCountryCode : null;
                    EmptySet emptySet = EmptySet.INSTANCE;
                    emptySet.getClass();
                    boolean startsWith = StringsKt__StringsJVMKt.startsWith(str24, Marker.ANY_NON_NULL_MARKER, false);
                    if (str25 == null && startsWith) {
                        CharRange charRange = PhoneNumberFormatter.VALID_INPUT_RANGE;
                        int i36 = 1;
                        for (int i37 = 1; i36 <= str24.length() - i37 && i36 < 4; i37 = 1) {
                            i36++;
                            String substring = str24.substring(i3, i36);
                            LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                            adjustedDefault.getClass();
                            Map map = PhoneNumberFormatter.allMetadata;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (Intrinsics.areEqual(((PhoneNumberFormatter.Metadata) entry.getValue()).prefix, substring)) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((PhoneNumberFormatter.Metadata) ((Map.Entry) it.next()).getValue()).regionCode);
                            }
                            if (arrayList3.isEmpty()) {
                                arrayList3 = null;
                            }
                            if (arrayList3 != null) {
                                int size = adjustedDefault.size();
                                int i38 = 0;
                                while (true) {
                                    if (i38 < size) {
                                        Locale locale = adjustedDefault.get(i38);
                                        locale.getClass();
                                        if (arrayList3.contains(locale.getCountry())) {
                                            str = locale.getCountry();
                                        } else {
                                            i38++;
                                        }
                                    } else {
                                        str = (String) CollectionsKt.first((List) arrayList3);
                                    }
                                }
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                forCountry = zzg.forCountry(str);
                            } else {
                                i3 = 0;
                            }
                        }
                        forCountry = null;
                    } else {
                        if (str25 != null) {
                            CharRange charRange2 = PhoneNumberFormatter.VALID_INPUT_RANGE;
                            forCountry = zzg.forCountry(str25);
                        }
                        forCountry = null;
                    }
                    if (forCountry != null) {
                        String prefix = forCountry.getPrefix();
                        phoneNumberController = new PhoneNumberController(StringsKt.removePrefix(prefix, forCountry.toE164Format(StringsKt.removePrefix(prefix, str24))), forCountry.getCountryCode(), emptySet);
                    } else {
                        phoneNumberController = new PhoneNumberController(str24, str25, emptySet);
                    }
                    return new NetworkingLinkSignupState.Payload(str22, simpleTextFieldController, z2, str20, phoneNumberController, networkingLinkSignupState.isInstantDebits, content, str23);
                case 28:
                    String str26 = (String) this.$serializedMRIContext;
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel2 = (NetworkingLinkSignupViewModel) this.$attestedKeyService;
                    Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = this.label;
                    if (i39 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        networkingLinkSignupViewModel2.getClass();
                        long j6 = StringsKt__StringsJVMKt.endsWith(str26, ".com", false) ? 300L : 1000L;
                        this.label = 1;
                        break;
                    } else {
                        if (i39 != 1) {
                            if (i39 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) ((NetworkingLinkSignupState) networkingLinkSignupViewModel2.stateFlow.$$delegate_0.getValue()).payload.invoke();
                    LookupAccount lookupAccount = networkingLinkSignupViewModel2.lookupAccount;
                    FinancialConnectionsSessionManifest.Pane pane = networkingLinkSignupViewModel2.getPane();
                    String str27 = (String) this.$serializedMRIContext;
                    if (payload != null) {
                        PhoneNumberController phoneNumberController2 = payload.phoneController;
                        str2 = StringsKt.removePrefix(((PhoneNumberFormatter) phoneNumberController2.phoneNumberFormatter.produceValue.invoke()).getPrefix(), (String) phoneNumberController2._fieldValue.getValue());
                    } else {
                        str2 = null;
                    }
                    String countryCode = payload != null ? payload.phoneController.getCountryCode() : null;
                    EmailSource emailSource = Intrinsics.areEqual(payload != null ? payload.prefilledEmail : null, str26) ? EmailSource.CUSTOMER_OBJECT : EmailSource.USER_ACTION;
                    if (payload == null || (str3 = payload.sessionId) == null) {
                        str3 = "";
                    }
                    if (payload != null && payload.appVerificationEnabled) {
                        i3 = 1;
                    }
                    this.label = 2;
                    Object invoke = lookupAccount.invoke(str27, str2, countryCode, emailSource, i3, str3, pane, this);
                    if (invoke != obj7) {
                        return invoke;
                    }
                    return obj7;
                default:
                    NetworkingLinkVerificationViewModel networkingLinkVerificationViewModel = (NetworkingLinkVerificationViewModel) this.$serializedMRIContext;
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i40 = this.label;
                    if (i40 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync2 = networkingLinkVerificationViewModel.getOrFetchSync;
                        this.label = 1;
                        invoke$default2 = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
                        break;
                    } else {
                        if (i40 != 1) {
                            if (i40 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest4 = (FinancialConnectionsSessionManifest) this.$attestedKeyService;
                            SafeTrace.throwOnFailure(obj);
                            financialConnectionsSessionManifest = financialConnectionsSessionManifest4;
                            startConsumerVerification = obj;
                            ConsumerSession consumerSession = (ConsumerSession) startConsumerVerification;
                            FinancialConnectionsInstitution financialConnectionsInstitution = financialConnectionsSessionManifest.initialInstitution;
                            FinancialConnectionsSessionManifest.Pane pane2 = NetworkingLinkVerificationViewModel.PANE;
                            String str28 = consumerSession.emailAddress;
                            String replace$default = StringsKt__StringsJVMKt.replace$default(consumerSession.redactedFormattedPhoneNumber, Marker.ANY_MARKER, "•");
                            String str29 = consumerSession.clientSecret;
                            IdentifierSpec.Companion.getClass();
                            return new NetworkingLinkVerificationState.Payload(str28, replace$default, new OTPElement(new IdentifierSpec("otp", (ParameterDestination) null, 6), new OTPController()), str29, financialConnectionsInstitution);
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default2 = obj;
                    }
                    financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default2).manifest;
                    CachedConsumerSession provideConsumerSession = networkingLinkVerificationViewModel.consumerSessionProvider.provideConsumerSession();
                    if (provideConsumerSession == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    StartVerification startVerification = networkingLinkVerificationViewModel.startVerification;
                    String str30 = provideConsumerSession.clientSecret;
                    this.$attestedKeyService = financialConnectionsSessionManifest;
                    this.label = 2;
                    startConsumerVerification = startVerification.consumerSessionRepository.startConsumerVerification(str30, VerificationType.SMS, this);
                    break;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(FinancialConnectionsViewModel financialConnectionsViewModel, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.$serializedMRIContext = financialConnectionsViewModel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMRIFactory$sign$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$serializedMRIContext = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealMRIFactory$sign$2(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$serializedMRIContext = moleculePresenter;
    }
}
