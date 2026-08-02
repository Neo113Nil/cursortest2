package com.squareup.cash.overlays;

import android.net.Uri;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.PathOperation;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.lifecycle.Lifecycle;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.api.BadgingState;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.BiometricsStore$read$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.PaymentAssetType;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.asset.AssetSendSelectStablecoinNetwork;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.mosaic.personalization.api.v2.GetEntityActivityItemRequest;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationService;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.offers.db.OffersSearchQueries$forId$2;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.offers.presenters.RealOffersPopupMessageDismisser;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFullscreenCollectionViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.overlays.OverlayLayer;
import com.squareup.cash.p2pblocking.presenters.P2PListController;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$models$6$1;
import com.squareup.cash.payments.backend.real.RealActivityPaymentManager;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.presenters.NearbyPermissionsPromptSheetPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState$awaitDismissal$2$1$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.performance.JankStatsAggregator;
import com.squareup.cash.performance.ScrollPerformanceNode;
import com.squareup.cash.performance.ScrollPerformanceNode$startObservingLifecycle$1$1;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewEvent;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingPresenter;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.recipients.analytics.PaymentType;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.PoolLifecycleCategory;
import com.squareup.protos.cash.pools.PoolLifecycleFilter;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.selects.SelectImplementation;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OverlayKt$Overlay$1$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public Object $session;
    public final /* synthetic */ Object $visibilityState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayKt$Overlay$1$1$1$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$session = obj;
        this.$visibilityState = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$visibilityState;
        switch (i) {
            case 0:
                return new OverlayKt$Overlay$1$1$1$1$1((OverlayLayer.Session) this.$session, (MutableTransitionState) obj2, continuation, 0);
            case 1:
                return new OverlayKt$Overlay$1$1$1$1$1((ClientRoute.ViewOffersSheetV2) this.$session, (OffersDetailsPresenter) obj2, continuation, 1);
            case 2:
                OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1((TaxReturnsPresenter) obj2, continuation, 2);
                overlayKt$Overlay$1$1$1$1$1.$session = obj;
                return overlayKt$Overlay$1$1$1$1$1;
            case 3:
                return new OverlayKt$Overlay$1$1$1$1$1((OffersFullscreenCollectionViewEvent) this.$session, (LocalCashBalancePresenter) obj2, continuation, 3);
            case 4:
                return new OverlayKt$Overlay$1$1$1$1$1((RealOffersPopupMessageDismisser) this.$session, (String) obj2, continuation, 4);
            case 5:
                return new OverlayKt$Overlay$1$1$1$1$1((TabToolbarPresenter) this.$session, (MutableState) obj2, continuation, 5);
            case 6:
                return new OverlayKt$Overlay$1$1$1$1$1((CardLockPresenter) this.$session, (MutableState) obj2, continuation, 6);
            case 7:
                return new OverlayKt$Overlay$1$1$1$1$1((DismissState) this.$session, (AccountViewModel) obj2, continuation, 7);
            case 8:
                OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$12 = new OverlayKt$Overlay$1$1$1$1$1((LocalCashBalancePresenter) obj2, continuation, 8);
                overlayKt$Overlay$1$1$1$1$12.$session = obj;
                return overlayKt$Overlay$1$1$1$1$12;
            case 9:
                return new OverlayKt$Overlay$1$1$1$1$1((SelectCustomerPresenter) this.$session, (MutableState) obj2, continuation, 9);
            case 10:
                return new OverlayKt$Overlay$1$1$1$1$1((PdfPreviewPresenter) this.$session, (MutableState) obj2, continuation, 10);
            case 11:
                return new OverlayKt$Overlay$1$1$1$1$1((HomeViewPresenter) this.$session, (MutableState) obj2, continuation, 11);
            case 12:
                return new OverlayKt$Overlay$1$1$1$1$1((HomeViewPresenter) this.$session, (String) obj2, continuation, 12);
            case 13:
                return new OverlayKt$Overlay$1$1$1$1$1((MutableState) this.$session, (MainPaymentPadPresenter) obj2, continuation, 13);
            case 14:
                return new OverlayKt$Overlay$1$1$1$1$1((RealActivityPaymentManager) this.$session, (String) obj2, continuation, 14);
            case 15:
                return new OverlayKt$Overlay$1$1$1$1$1((RealPersonalizationRepository) this.$session, (String) obj2, continuation, 15);
            case 16:
                return new OverlayKt$Overlay$1$1$1$1$1((CardLockPresenter) this.$session, (NearbyPermissionState) obj2, continuation, 16);
            case 17:
                return new OverlayKt$Overlay$1$1$1$1$1((NearbyPermissionsPromptSheetPresenter) this.$session, (NearbyPermissionState) obj2, continuation, 17);
            case 18:
                return new OverlayKt$Overlay$1$1$1$1$1((PaymentConfigurationViewEvent) this.$session, (PaymentConfigurationPresenter) obj2, continuation, 18);
            case 19:
                return new OverlayKt$Overlay$1$1$1$1$1((PaymentConfigurationPresenter) this.$session, (SolanaAddress) obj2, continuation, 19);
            case 20:
                return new OverlayKt$Overlay$1$1$1$1$1((PaymentLoadingPresenter) obj2, continuation, 20);
            case 21:
                return new OverlayKt$Overlay$1$1$1$1$1((PersonalizePaymentPresenter) this.$session, (MutableState) obj2, continuation, 21);
            case 22:
                return new OverlayKt$Overlay$1$1$1$1$1((PaymentConfigurationViewModel) this.$session, (CoreFlowRealSheetState) obj2, continuation, 22);
            case 23:
                OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$13 = new OverlayKt$Overlay$1$1$1$1$1((CoreFlowRealSheetState) obj2, continuation, 23);
                overlayKt$Overlay$1$1$1$1$13.$session = obj;
                return overlayKt$Overlay$1$1$1$1$13;
            case 24:
                return new OverlayKt$Overlay$1$1$1$1$1((PdfPreviewPresenter) this.$session, (MutableState) obj2, continuation, 24);
            case 25:
                OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$14 = new OverlayKt$Overlay$1$1$1$1$1((JankStatsAggregator) obj2, continuation, 25);
                overlayKt$Overlay$1$1$1$1$14.$session = obj;
                return overlayKt$Overlay$1$1$1$1$14;
            case 26:
                return new OverlayKt$Overlay$1$1$1$1$1((Lifecycle) this.$session, (ScrollPerformanceNode) obj2, continuation, 26);
            case 27:
                return new OverlayKt$Overlay$1$1$1$1$1((WorkHomePresenter) this.$session, (PhonePlansEsimCheckViewEvent) obj2, continuation, 27);
            case 28:
                return new OverlayKt$Overlay$1$1$1$1$1((PhonePlansNewLineLoadingPresenter) this.$session, (MutableState) obj2, continuation, 28);
            default:
                return new OverlayKt$Overlay$1$1$1$1$1((RealPoolsRepository) this.$session, (PoolLifecycleCategory) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 26:
                ((OverlayKt$Overlay$1$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((OverlayKt$Overlay$1$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0494, code lost:
    
        if (r1.activityItemUpdatesFlow.emit((java.lang.String) r5, r17) == r2) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0487, code lost:
    
        if (r4.emit(r8, r17) == r2) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0636, code lost:
    
        if (r5.updateData(r6) == r2) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0645, code lost:
    
        if (r5.fetchData(r1, r4, r17) == r2) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0136, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r9, r17) == r2) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016e, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r6, r9, r17) == r2) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0159 -> B:69:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x016e -> B:69:0x0120). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        Object firstOrNull;
        String str;
        Object first2;
        Object contactStatus;
        BetterNavigator.ScreenNavigator screenNavigator;
        Object access$initiatePayment;
        Object withContext;
        long j;
        Object listPools;
        int i = this.$r8$classId;
        int i2 = 5;
        char c = 0;
        Object obj2 = this.$visibilityState;
        int i3 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                OverlayLayer.Session session = (OverlayLayer.Session) this.$session;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new ConvertFromJavaKt$$Lambda$4((MutableTransitionState) obj2, i2));
                        SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(2, null, 19);
                        this.label = 1;
                        first = FlowKt.first(snapshotFlow, sessionWorkerKt$runSession$5, this);
                        if (first == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                    ((Boolean) first).getClass();
                    session.dismiss();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    session.dismiss();
                    throw th;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(((ClientRoute.ViewOffersSheetV2) this.$session).offerSheetKey);
                    if (decodeBase64 == null) {
                        return null;
                    }
                    OffersDetailsPresenter offersDetailsPresenter = (OffersDetailsPresenter) obj2;
                    OfferSheetKey offerSheetKey = (OfferSheetKey) OfferSheetKey.ADAPTER.decode(decodeBase64);
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) offersDetailsPresenter.offersSheetRepository;
                    Screen screen = ((OffersScreen$OffersDetailsScreen) offersDetailsPresenter.args).parentScreen;
                    SafeFlow offerSheet = realOffersSheetRepository.offerSheet(OfferSheetKey.copy$default(offerSheetKey, screen != null ? PathOperation.toPresentingContext(screen) : null, null, 55), null);
                    this.label = 1;
                    if (FlowKt.collect(offerSheet, this) == coroutineSingletons2) {
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
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$session;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) taxReturnsPresenter.args;
                    GpsConfigQueries gpsConfigQueries = realOffersTabRepository.cashDatabase.offersSearchQueries;
                    gpsConfigQueries.getClass();
                    OffersSearchQueries$forId$2 offersSearchQueries$forId$2 = OffersSearchQueries$forId$2.INSTANCE;
                    int i7 = 5;
                    SafeFlow flow = DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(gpsConfigQueries, 1L, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, c), i7));
                    CoroutineContext coroutineContext = realOffersTabRepository.ioDispatcher;
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(flow, coroutineContext);
                    gpsConfigQueries.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull2 = DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(gpsConfigQueries, 2L, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries, c), i7)), coroutineContext);
                    CardModelView.AnonymousClass1.AnonymousClass4 anonymousClass4 = new CardModelView.AnonymousClass1.AnonymousClass4();
                    OffersFilterGroupSheetPresenter$models$sheet$2$1$1 offersFilterGroupSheetPresenter$models$sheet$2$1$1 = new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(c, produceStateScope, taxReturnsPresenter);
                    this.$session = null;
                    this.label = 1;
                    Object combineInternal = CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(anonymousClass4, continuation, c), new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(offersFilterGroupSheetPresenter$models$sheet$2$1$1, 27), new Flow[]{mapToOneOrNull, mapToOneOrNull2});
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        combineInternal = Unit.INSTANCE;
                    }
                    if (combineInternal == obj3) {
                        return obj3;
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
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) obj2;
                OffersFullscreenCollectionViewEvent offersFullscreenCollectionViewEvent = (OffersFullscreenCollectionViewEvent) this.$session;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersItemToken offersItemToken = ((OfferItemClicked) offersFullscreenCollectionViewEvent).itemToken;
                    if (offersItemToken != null) {
                        RealOffersTabRefresher realOffersTabRefresher = (RealOffersTabRefresher) localCashBalancePresenter.store;
                        this.label = 1;
                        if (realOffersTabRefresher.refreshSearchNullState(offersItemToken, OffersTabRepository$SearchSource.ALWAYS_REMOTE, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                String str2 = ((OfferItemClicked) offersFullscreenCollectionViewEvent).actionUrl;
                RealRouter realRouter = (RealRouter) localCashBalancePresenter.screen;
                OffersScreen$OffersFullscreenCollectionScreen offersScreen$OffersFullscreenCollectionScreen = (OffersScreen$OffersFullscreenCollectionScreen) localCashBalancePresenter.syncer;
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) localCashBalancePresenter.sessionManager;
                String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
                if (referrerFlowToken == null) {
                    referrerFlowToken = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                }
                realRouter.route(new RoutingParams(offersScreen$OffersFullscreenCollectionScreen, null, null, null, new AnalyticsParams.OffersTabAnalyticsParams(referrerFlowToken, false), null, 478), str2);
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj2;
                RealOffersPopupMessageDismisser realOffersPopupMessageDismisser = (RealOffersPopupMessageDismisser) this.$session;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOffersPopupMessageDismisser.popupMessageQueries.deleteByMessageToken(str3);
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(realOffersPopupMessageDismisser, str3, continuation, 15);
                    this.label = 1;
                    if (PlatformKt.retryWhenRetryable$default(null, anonymousClass1, this, 3) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) this.$session;
                        this.label = 1;
                        if (TabToolbarPresenter.access$skipAccountSelection(tabToolbarPresenter, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState2 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        CardLockPresenter cardLockPresenter = (CardLockPresenter) this.$session;
                        this.label = 1;
                        if (CardLockPresenter.access$launchAccountRecovery(cardLockPresenter, this) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState2.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                DismissState dismissState = (DismissState) this.$session;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object value = dismissState.currentValue$delegate.getValue();
                    DismissValue dismissValue = DismissValue.Default;
                    if (value != dismissValue && !((AccountViewModel) obj2).isInSwipeToRemoveMode) {
                        this.label = 1;
                        Object animateTo$default = DismissState.animateTo$default(dismissState, dismissValue, this);
                        if (animateTo$default != obj4) {
                            animateTo$default = Unit.INSTANCE;
                        }
                        if (animateTo$default == obj4) {
                            return obj4;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope = (CoroutineScope) this.$session;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalCashBalancePresenter localCashBalancePresenter2 = (LocalCashBalancePresenter) obj2;
                    P2PListScreen p2PListScreen = (P2PListScreen) localCashBalancePresenter2.service;
                    P2PListData p2PListData = p2PListScreen.prefilledData;
                    P2PListController p2PListController = (P2PListController) localCashBalancePresenter2.timestampFormatter;
                    if (p2PListData != null) {
                        this.$session = coroutineScope;
                        this.label = 1;
                        break;
                    } else {
                        String str4 = p2PListScreen.forCustomerToken;
                        BlockingContext blockingContext = p2PListScreen.context;
                        this.$session = null;
                        this.label = 2;
                        break;
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                SelectCustomerPresenter selectCustomerPresenter = (SelectCustomerPresenter) this.$session;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    P2PListController p2PListController2 = (P2PListController) selectCustomerPresenter.controller;
                    String obj5 = ((InputFieldText) ((MutableState) obj2).getValue()).getValue().toString();
                    SelectCustomerScreen selectCustomerScreen = (SelectCustomerScreen) selectCustomerPresenter.args;
                    String str5 = selectCustomerScreen.forCustomerToken;
                    BlockingContext blockingContext2 = selectCustomerScreen.context;
                    this.label = 1;
                    if (p2PListController2.searchCustomers(obj5, str5, blockingContext2, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) this.$session;
                    this.label = 1;
                    if (PdfPreviewPresenter.access$handleRegistration(pdfPreviewPresenter, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((MutableState) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                MutableState mutableState3 = (MutableState) obj2;
                HomeViewPresenter homeViewPresenter = (HomeViewPresenter) this.$session;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = homeViewPresenter.badgingState;
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(flow2, this);
                    if (firstOrNull == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                BadgingState badgingState = (BadgingState) firstOrNull;
                Analytics analytics = homeViewPresenter.analytics;
                AppNavigateOpenSpace.Space space = AppNavigateOpenSpace.Space.MAIN_PAYMENT_PAD;
                if (badgingState != null) {
                    long j2 = badgingState.identityVerification;
                    Long valueOf = Long.valueOf(j2);
                    if (j2 <= 0) {
                        valueOf = null;
                    }
                    str = valueOf != null ? "identity_hub" : null;
                } else {
                    str = null;
                }
                analytics.track(new AppNavigateOpenSpace(((Boolean) mutableState3.getValue()).booleanValue() ? AppNavigateOpenSpace.Source.SWIPE : null, null, space, str, 87), null);
                mutableState3.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                String str6 = (String) obj2;
                HomeViewPresenter homeViewPresenter2 = (HomeViewPresenter) this.$session;
                EglCore eglCore = homeViewPresenter2.paymentPadOutboundNavigator;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter permissionState = homeViewPresenter2.nearbyPermissionStateProvider.permissionState();
                    this.label = 1;
                    first2 = FlowKt.first(permissionState, this);
                    if (first2 == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first2 = obj;
                }
                NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) first2;
                if (nearbyPermissionState.bluetoothPermission.granted && nearbyPermissionState.locationPermission.granted) {
                    ((BetterNavigator.ScreenNavigator) eglCore.eglConfig).goTo(new PaymentScreens.NearbyPayRequest(str6));
                } else {
                    eglCore.getClass();
                    str6.getClass();
                    ((BetterNavigator.ScreenNavigator) eglCore.eglConfig).goTo(new PaymentScreens.NearbyPermissionsPromptSheet(str6));
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) ((MutableState) this.$session).getValue()).booleanValue()) {
                        NonCancellable nonCancellable = NonCancellable.INSTANCE;
                        MainPaymentPadPresenter$models$6$1 mainPaymentPadPresenter$models$6$1 = new MainPaymentPadPresenter$models$6$1((MainPaymentPadPresenter) obj2, continuation, i3);
                        this.label = 1;
                        if (JobKt.withContext(nonCancellable, mainPaymentPadPresenter$models$6$1, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                RealActivityPaymentManager realActivityPaymentManager = (RealActivityPaymentManager) this.$session;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = realActivityPaymentManager.activityFeedUpdatesFlow;
                    Integer num = new Integer(realActivityPaymentManager.activityFeedUpdatesCounter.incrementAndGet());
                    this.label = 1;
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.label = 2;
                break;
            case 15:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                PersonalizationService personalizationService = ((RealPersonalizationRepository) this.$session).personalizationService;
                GetEntityActivityItemRequest getEntityActivityItemRequest = new GetEntityActivityItemRequest(new Entity((String) obj2, Entity.Type.TYPE_PAYMENT), ByteString.EMPTY);
                this.label = 1;
                Object entityActivityItem = personalizationService.getEntityActivityItem(getEntityActivityItemRequest, this);
                return entityActivityItem == coroutineSingletons14 ? coroutineSingletons14 : entityActivityItem;
            case 16:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealNearbyManager) ((CardLockPresenter) this.$session).args).requestNextPermission((NearbyPermissionState) obj2, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((NearbyPermissionsPromptSheetPresenter) this.$session).nearbyManager.requestNextPermission((NearbyPermissionState) obj2, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                PaymentConfigurationViewEvent paymentConfigurationViewEvent = (PaymentConfigurationViewEvent) this.$session;
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj2;
                UUID uuid = paymentConfigurationPresenter.paymentToken;
                String str7 = paymentConfigurationPresenter.flowToken;
                Analytics analytics2 = paymentConfigurationPresenter.analytics;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationViewEvent.SelectRecipientAndContinue selectRecipientAndContinue = (PaymentConfigurationViewEvent.SelectRecipientAndContinue) paymentConfigurationViewEvent;
                    StablecoinWithdrawalOption stablecoinOptionOrNull = zzahh.stablecoinOptionOrNull(selectRecipientAndContinue.recipient);
                    if (stablecoinOptionOrNull != null) {
                        StablecoinNetwork stablecoinNetwork = stablecoinOptionOrNull.network;
                        PaymentAssetType paymentAssetTypeOrNull = zzahh.toPaymentAssetTypeOrNull(stablecoinOptionOrNull);
                        if (paymentAssetTypeOrNull != null) {
                            String str8 = stablecoinNetwork.chain;
                            str8.getClass();
                            analytics2.track(new AssetSendSelectStablecoinNetwork(str8, paymentAssetTypeOrNull, str7), null);
                        }
                        String uuid2 = uuid.toString();
                        uuid2.getClass();
                        AnalyticsHelperKt.trackPaymentAddStablecoinRecipient(analytics2, uuid2, stablecoinNetwork.chain, str7, paymentConfigurationPresenter.analyticsOrigin);
                        return Unit.INSTANCE;
                    }
                    Recipient recipient = selectRecipientAndContinue.recipient.recipient;
                    String str9 = recipient.customerId;
                    if (str9 == null && (str9 = recipient.lookupKey) == null) {
                        str9 = "";
                    }
                    RealRecipientRepository realRecipientRepository = paymentConfigurationPresenter.recipientRepository;
                    this.label = 1;
                    contactStatus = realRecipientRepository.getContactStatus(str9, this);
                    if (contactStatus == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    contactStatus = obj;
                }
                ContactsStatus contactsStatus = (ContactsStatus) contactStatus;
                Orientation orientation = paymentConfigurationPresenter.args.orientation;
                String uuid3 = uuid.toString();
                uuid3.getClass();
                ContactStatus analyticsContactStatus = contactsStatus != null ? RecipientAnalyticsKt.toAnalyticsContactStatus(contactsStatus) : ContactStatus.IN_CONTACTS;
                Recipient.Analytics analytics3 = ((PaymentConfigurationViewEvent.SelectRecipientAndContinue) paymentConfigurationViewEvent).recipient.recipient.analytics;
                String str10 = paymentConfigurationPresenter.flowToken;
                String str11 = paymentConfigurationPresenter.searchFlowToken;
                orientation.getClass();
                RecipientAnalyticsKt.logRecipientSelected(analytics2, uuid3, str11, analytics3, orientation == Orientation.BILL ? PaymentType.REQUEST : PaymentType.SEND, analyticsContactStatus, ExperienceType.BOTTOM_SHEET, str10);
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationPresenter paymentConfigurationPresenter2 = (PaymentConfigurationPresenter) this.$session;
                    CryptoFlowStarter cryptoFlowStarter = paymentConfigurationPresenter2.cryptoFlowStarter;
                    PaymentScreens.PaymentConfiguration paymentConfiguration = paymentConfigurationPresenter2.args;
                    Money money = paymentConfiguration.amount;
                    String str12 = paymentConfigurationPresenter2.flowToken;
                    Screen screen2 = paymentConfiguration.exitScreen;
                    if (screen2 == null) {
                        screen2 = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    BetterNavigator.ScreenNavigator screenNavigator2 = paymentConfigurationPresenter2.navigator;
                    SolanaAddress solanaAddress = (SolanaAddress) obj2;
                    this.label = 1;
                    if (((RealCryptoFlowStarter) cryptoFlowStarter).initiateStablecoinPayment(solanaAddress, money, null, str12, screen2, screenNavigator2) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) obj2;
                    screenNavigator = paymentLoadingPresenter.navigator;
                    this.$session = screenNavigator;
                    this.label = 1;
                    access$initiatePayment = PaymentLoadingPresenter.access$initiatePayment(paymentLoadingPresenter, this);
                    if (access$initiatePayment == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) this.$session;
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator = screenNavigator3;
                    access$initiatePayment = obj;
                }
                screenNavigator.goTo((Screen) access$initiatePayment);
                return Unit.INSTANCE;
            case 21:
                MutableState mutableState4 = (MutableState) obj2;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectedTrack selectedTrack = (SelectedTrack) mutableState4.getValue();
                    RealMusicPlayer realMusicPlayer = ((PersonalizePaymentPresenter) this.$session).musicPlayer;
                    if (selectedTrack != null) {
                        SelectedTrack selectedTrack2 = (SelectedTrack) mutableState4.getValue();
                        selectedTrack2.getClass();
                        String str13 = selectedTrack2.musicId;
                        this.label = 1;
                        if (realMusicPlayer.play(str13, this) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        realMusicPlayer.stop();
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) this.$session;
                    if ((paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.ReviewPayment) || (paymentConfigurationViewModel instanceof PaymentConfigurationViewModel.InputAmount)) {
                        this.label = 1;
                        if (((CoreFlowRealSheetState) obj2).expand(this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.$session;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj2;
                    SelectImplementation selectImplementation = new SelectImplementation(getContext());
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    selectImplementation.invoke(JobKt.launch$default(coroutineScope2, null, coroutineStart, new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, c), 1).getOnJoin(), new BiometricsStore$read$1(1, null, 4));
                    selectImplementation.invoke(JobKt.launch$default(coroutineScope2, null, coroutineStart, new CoreFlowRealSheetState$awaitDismissal$2$1$1(coreFlowRealSheetState, continuation, 4), 1).getOnJoin(), new BiometricsStore$read$1(1, null, 5));
                    this.$session = coroutineScope2;
                    this.label = 1;
                    if (selectImplementation.doSelect(this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.cancelChildren$default(coroutineScope2.getCoroutineContext());
                return Unit.INSTANCE;
            case 24:
                PdfPreviewPresenter pdfPreviewPresenter2 = (PdfPreviewPresenter) this.$session;
                PdfScreen pdfScreen = (PdfScreen) pdfPreviewPresenter2.args;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str14 = pdfScreen.displayTitle;
                    if (str14 == null) {
                        str14 = pdfScreen.fileUri.getLastPathSegment();
                        if (str14 == null) {
                            str14 = "document.pdf";
                        }
                    } else if (!StringsKt__StringsJVMKt.endsWith(str14, ".pdf", false)) {
                        str14 = str14.concat(".pdf");
                    }
                    String str15 = str14;
                    AndroidFileSaver androidFileSaver = (AndroidFileSaver) pdfPreviewPresenter2.fileSaver;
                    Uri uri = pdfScreen.fileUri;
                    this.label = 1;
                    withContext = JobKt.withContext(androidFileSaver.ioContext, new AndroidFileSaver$save$2(androidFileSaver, str15, uri, null, 0), this);
                    if (withContext == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                ((MutableState) obj2).setValue(((AndroidStringManager) pdfPreviewPresenter2.stringManager).get(((Boolean) withContext).booleanValue() ? R.string.download_complete_toast : R.string.download_failed_toast));
                return Unit.INSTANCE;
            case 25:
                JankStatsAggregator jankStatsAggregator = (JankStatsAggregator) obj2;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.$session;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        JankStatsAggregator.FrameMetricsBuffer frameMetricsBuffer = jankStatsAggregator.frameMetricsBuffer;
                        long nanoTime = (System.nanoTime() / 1000000) - 1000;
                        int i31 = frameMetricsBuffer.size;
                        int i32 = 0;
                        for (int i33 = 0; i33 < i31; i33++) {
                            if (frameMetricsBuffer.timestamps[i33] > nanoTime) {
                                i32++;
                            }
                        }
                        if (i32 > 0) {
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                            InviteErrorPresenter$models$1$1 inviteErrorPresenter$models$1$1 = new InviteErrorPresenter$models$1$1(jankStatsAggregator, continuation, 26);
                            this.$session = coroutineScope3;
                            this.label = 2;
                            break;
                        }
                        if (JobKt.isActive(coroutineScope3)) {
                            return Unit.INSTANCE;
                        }
                        Duration.Companion companion2 = Duration.Companion;
                        long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                        this.$session = coroutineScope3;
                        this.label = 1;
                        break;
                    } else if (i30 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                if (JobKt.isActive(coroutineScope3)) {
                }
            case 26:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow currentStateFlow = ((Lifecycle) this.$session).getCurrentStateFlow();
                    ScrollPerformanceNode$startObservingLifecycle$1$1 scrollPerformanceNode$startObservingLifecycle$1$1 = new ScrollPerformanceNode$startObservingLifecycle$1$1((ScrollPerformanceNode) obj2);
                    this.label = 1;
                    if (currentStateFlow.$$delegate_0.collect(scrollPerformanceNode$startObservingLifecycle$1$1, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 27:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WorkHomePresenter workHomePresenter = (WorkHomePresenter) this.$session;
                    String str16 = ((PhonePlansEsimCheckViewEvent.CtaClicked) ((PhonePlansEsimCheckViewEvent) obj2)).action;
                    this.label = 1;
                    if (WorkHomePresenter.access$selectOption(workHomePresenter, str16, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Integer num2 = ((PhonePlansNewLineLoadingPresenter) this.$session).args.blocker.description_delay_seconds;
                    if (num2 != null) {
                        Duration.Companion companion3 = Duration.Companion;
                        j = DurationKt.toDuration(num2.intValue(), DurationUnit.SECONDS);
                    } else {
                        j = PhonePlansNewLineLoadingPresenter.DELAY_DEFAULT;
                    }
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(j, this) == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                int i37 = PhonePlansNewLineLoadingPresenter.$r8$clinit;
                ((MutableState) obj2).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolsService poolsService = ((RealPoolsRepository) this.$session).poolsService;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf((PoolLifecycleCategory) obj2);
                    ByteString byteString = ByteString.EMPTY;
                    ListPoolsRequest listPoolsRequest = new ListPoolsRequest(new PoolLifecycleFilter(listOf, byteString), byteString);
                    this.label = 1;
                    listPools = poolsService.listPools(listPoolsRequest, this);
                    if (listPools == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    listPools = obj;
                }
                ApiResult apiResult = (ApiResult) listPools;
                if ((apiResult instanceof ApiResult.Failure.HttpFailure) || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    return null;
                }
                if (apiResult instanceof ApiResult.Success) {
                    return ((ListPoolsResponse) ((ApiResult.Success) apiResult).response).pools;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverlayKt$Overlay$1$1$1$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$visibilityState = obj;
    }
}
