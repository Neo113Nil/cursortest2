package com.squareup.cash.music.presenters;

import android.content.IntentFilter;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.security.keystore.KeyGenParameterSpec;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda24;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.instore.TableQrCodeScannerCameraState;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.internal.zabs;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager$activities$2$1$2;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.arcade.components.RadioKt$Radio$2$1$1;
import com.squareup.cash.bitcoin.graph.api.model.BitcoinGraphModel;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphPresenter$State;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenterKt$WhenMappings;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.BitcoinAmountBlockerPresenter$State;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$State;
import com.squareup.cash.blockers.presenters.FileBlockerPresenter;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubLoadingStatus;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderHubViewModel;
import com.squareup.cash.card.onboarding.CardPreviewViewModel;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.earningstracker.backend.api.EarningsTrackerDataResult;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.investing.db.Investment_entity;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$NewsKindDetails;
import com.squareup.cash.invitations.InvitationSuccessToastViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealKeyStoreProvider$generateECKey$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$getKey$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.localization.ClientSyncLocaleChangeIoSetupTeardown;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfig;
import com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfigMappersKt;
import com.squareup.cash.merchant.backend.api.MerchantProtoParsingExceptionFactory;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotOverflowMenuPresenter$loadNextPage$1$1;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewEvent;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewEvent;
import com.squareup.cash.mri.android.ComputationalIntegrityConfig;
import com.squareup.cash.mri.android.MobileRuntimeIntegrityWorker;
import com.squareup.cash.mri.android.RealComputationalIntegrityChecker;
import com.squareup.cash.mri.android.RealComputationalIntegrityChecker$measure$2;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.channels.MiscNotificationChannelContributor;
import com.squareup.cash.notifications.channels.NewNotificationChannel;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersRepositoryService;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.portfolio.graphs.RealInvestingCryptoGraphHeaderPresenter;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.preferences.values.RecentMoneybotSession;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigResponse;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.MerchantBlockingClientService;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetPreload;
import com.squareup.protos.cash.kgoose.api.v3.GetMessagesResponse;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.InviteContactsRequest;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.PrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import okio.internal.DefaultSocket;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class MusicPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $state$delegate;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$2$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$state$delegate = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$state$delegate;
        switch (i) {
            case 0:
                return new MusicPresenter$models$2$1((MusicPresenter) this.this$0, (MutableState) obj2, continuation, 0);
            case 1:
                return new MusicPresenter$models$2$1((InvestingSearchPresenter) this.this$0, (InvestingSearchViewEvent) obj2, continuation, 1);
            case 2:
                MusicPresenter$models$2$1 musicPresenter$models$2$1 = new MusicPresenter$models$2$1((MoneybotHomePresenter) obj2, continuation, 2);
                musicPresenter$models$2$1.this$0 = obj;
                return musicPresenter$models$2$1;
            case 3:
                return new MusicPresenter$models$2$1((InviteContactsPresenter) obj2, continuation, 3);
            case 4:
                return new MusicPresenter$models$2$1((MutableSharedFlow) this.this$0, (InviteContactsViewEvent) obj2, continuation, 4);
            case 5:
                return new MusicPresenter$models$2$1((EglCore) this.this$0, (List) obj2, continuation, 5);
            case 6:
                return new MusicPresenter$models$2$1((RealAttestedKeyService) this.this$0, (RealAttestedKeyService.GenerationAttempt) obj2, continuation, 6);
            case 7:
                return new MusicPresenter$models$2$1((ClientSyncLocaleChangeIoSetupTeardown) this.this$0, (Locale) obj2, continuation, 7);
            case 8:
                return new MusicPresenter$models$2$1((LocalCashBalancePresenter) this.this$0, (State) obj2, continuation, 8);
            case 9:
                MusicPresenter$models$2$1 musicPresenter$models$2$12 = new MusicPresenter$models$2$1((LocalCashBalancePresenter) obj2, continuation, 9);
                musicPresenter$models$2$12.this$0 = obj;
                return musicPresenter$models$2$12;
            case 10:
                return new MusicPresenter$models$2$1((LocalCashBalancePresenter) this.this$0, (MutableState) obj2, continuation, 10);
            case 11:
                return new MusicPresenter$models$2$1((MoneyTabPresenter) this.this$0, (MoneyTabEvent) obj2, continuation, 11);
            case 12:
                return new MusicPresenter$models$2$1((MoneyTabPresenter) this.this$0, (Set) obj2, continuation, 12);
            case 13:
                return new MusicPresenter$models$2$1((RealChatSessionManager) this.this$0, (ProducerScope) obj2, continuation, 13);
            case 14:
                MusicPresenter$models$2$1 musicPresenter$models$2$13 = new MusicPresenter$models$2$1((RealChatSessionManager) obj2, continuation, 14);
                musicPresenter$models$2$13.this$0 = obj;
                return musicPresenter$models$2$13;
            case 15:
                return new MusicPresenter$models$2$1((LocalEditorialPresenter) this.this$0, (String) obj2, continuation, 15);
            case 16:
                return new MusicPresenter$models$2$1((MoneybotChatPresenter) obj2, continuation, 16);
            case 17:
                MusicPresenter$models$2$1 musicPresenter$models$2$14 = new MusicPresenter$models$2$1((CardLockPresenter) obj2, continuation, 17);
                musicPresenter$models$2$14.this$0 = obj;
                return musicPresenter$models$2$14;
            case 18:
                return new MusicPresenter$models$2$1((MusicPresenter) this.this$0, (MoneybotPreambleEditorViewEvent) obj2, continuation, 18);
            case 19:
                MusicPresenter$models$2$1 musicPresenter$models$2$15 = new MusicPresenter$models$2$1((WorkHomePresenter) obj2, continuation, 19);
                musicPresenter$models$2$15.this$0 = obj;
                return musicPresenter$models$2$15;
            case 20:
                return new MusicPresenter$models$2$1((EarningsHeaderPresenter) this.this$0, (SuggestionListViewEvent.SuggestionTapped) obj2, continuation, 20);
            case 21:
                return new MusicPresenter$models$2$1((LazyListState) this.this$0, (Function0) obj2, continuation, 21);
            case 22:
                return new MusicPresenter$models$2$1((MobileRuntimeIntegrityWorker) this.this$0, (ComputationalIntegrityConfig) obj2, continuation, 22);
            case 23:
                MusicPresenter$models$2$1 musicPresenter$models$2$16 = new MusicPresenter$models$2$1((StuckPlayerDetector) obj2, continuation, 23);
                musicPresenter$models$2$16.this$0 = obj;
                return musicPresenter$models$2$16;
            case 24:
                MusicPresenter$models$2$1 musicPresenter$models$2$17 = new MusicPresenter$models$2$1((RealBleManager) obj2, continuation, 24);
                musicPresenter$models$2$17.this$0 = obj;
                return musicPresenter$models$2$17;
            case 25:
                return new MusicPresenter$models$2$1((MiscNotificationChannelContributor) this.this$0, (DefaultSocket) obj2, continuation, 25);
            case 26:
                return new MusicPresenter$models$2$1((RealObservabilityManager) obj2, continuation, 26);
            case 27:
                return new MusicPresenter$models$2$1((RealOffersRepositoryService) this.this$0, (ByteString) obj2, continuation, 27);
            case 28:
                return new MusicPresenter$models$2$1((RealOffersTabRefresher) this.this$0, (OffersTabRepository$SearchSource) obj2, continuation, 28);
            default:
                return new MusicPresenter$models$2$1((OffersDetailsPresenter) this.this$0, (String) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((MusicPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
            case 13:
                ((MusicPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((MusicPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x05c2, code lost:
    
        if (r2.setRecentSession(null, r24) == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05ab, code lost:
    
        if (r0 == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05a0, code lost:
    
        if (r0.removeSession(r9) == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x05dc, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r4, r24) == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x058d, code lost:
    
        if (r10 == r8) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08d0, code lost:
    
        if (r2 == r3) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0892, code lost:
    
        if (r2.generateRSAKey(r5, r24) == r3) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x08be, code lost:
    
        if (r4 == r3) goto L383;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Type inference failed for: r4v25, types: [com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfig] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f3 -> B:41:0x00f7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ColorModel.Accented accented;
        InvestingCryptoNewsPresenter$NewsKindDetails investingCryptoNewsPresenter$NewsKindDetails;
        InvitationSuccessToastViewModel invitationSuccessToastViewModel;
        Object withContext;
        Object access$getBlockedBusinessesConfig;
        CardBlockedBusinessesUIConfig cardBlockedBusinessesUIConfig;
        ResponseContext responseContext;
        Object deleteChat;
        Object obj2;
        Object withContext2;
        MoneybotChatPresenter moneybotChatPresenter;
        Object fetchNextPage;
        Object messages;
        Object error;
        Object withContext3;
        Unit unit;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        Object hasNext;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        int i2 = 10;
        int i3 = 5;
        int i4 = 2;
        int i5 = 0;
        Object obj3 = this.$state$delegate;
        int i6 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow readonlyStateFlow = ((RealMusicPlayer) ((MusicPresenter) this.this$0).musicPlayer).playbackProgress;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(i5, (MutableState) obj3);
                    this.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (InvestingSearchPresenter.access$handleCategoryClicked((InvestingSearchPresenter) this.this$0, (InvestingSearchViewEvent.CategoryClicked) ((InvestingSearchViewEvent) obj3), this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                MoneybotHomePresenter moneybotHomePresenter = (MoneybotHomePresenter) obj3;
                AndroidStringManager androidStringManager = (AndroidStringManager) moneybotHomePresenter.widgetManager;
                FlowCollector flowCollector = (FlowCollector) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    NewsKind newsKind = (NewsKind) moneybotHomePresenter.failedToLoadHome$delegate;
                    if (newsKind instanceof NewsKind.StocksPortfolio) {
                        investingCryptoNewsPresenter$NewsKindDetails = new InvestingCryptoNewsPresenter$NewsKindDetails(androidStringManager.get(R.string.investing_crypto_news_stocks_portfolio_title), ColorModel.Investing.INSTANCE);
                    } else if (newsKind instanceof NewsKind.BitcoinPortfolio) {
                        investingCryptoNewsPresenter$NewsKindDetails = new InvestingCryptoNewsPresenter$NewsKindDetails(androidStringManager.get(R.string.investing_crypto_news_bitcoin_title), ColorModel.Bitcoin.INSTANCE);
                    } else {
                        if (!(newsKind instanceof NewsKind.Stock)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Investment_entity investment_entity = (Investment_entity) ((CashAccountDatabaseImpl) moneybotHomePresenter.analyticsService).investmentEntityQueries.forToken(((NewsKind.Stock) newsKind).token.value).executeAsOne();
                        String str = investment_entity.display_name;
                        str.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.investing_crypto_news_stock_title)).format(new Object[]{str});
                        format2.getClass();
                        Color color = investment_entity.entity_color;
                        if (color != null) {
                            accented = new ColorModel.Accented(color);
                        } else {
                            String str2 = investment_entity.color;
                            str2.getClass();
                            accented = new ColorModel.Accented(ColorsKt.toColor(str2));
                        }
                        investingCryptoNewsPresenter$NewsKindDetails = new InvestingCryptoNewsPresenter$NewsKindDetails(format2, accented);
                    }
                    this.this$0 = null;
                    this.label = 1;
                    if (flowCollector.emit(investingCryptoNewsPresenter$NewsKindDetails, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                StateFlowImpl stateFlowImpl = ((InviteContactsPresenter) obj3).invitationSuccessToastViewModelState;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj4 = ((Versioned) stateFlowImpl.getValue()).value;
                    obj4.getClass();
                    InvitationSuccessToastViewModel invitationSuccessToastViewModel2 = (InvitationSuccessToastViewModel) obj4;
                    if (invitationSuccessToastViewModel2.delayPresentation) {
                        return Unit.INSTANCE;
                    }
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                    this.this$0 = invitationSuccessToastViewModel2;
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    invitationSuccessToastViewModel = invitationSuccessToastViewModel2;
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    invitationSuccessToastViewModel = (InvitationSuccessToastViewModel) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (invitationSuccessToastViewModel.dismiss) {
                    return Unit.INSTANCE;
                }
                Versioned update = VersionedKt.update((Versioned) stateFlowImpl.getValue(), InvitationSuccessToastViewModel.copy$default(invitationSuccessToastViewModel, 11));
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, update);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((MutableSharedFlow) this.this$0).emit((InviteContactsViewEvent) obj3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                AppService appService = (AppService) ((EglCore) this.this$0).eglDisplay;
                InviteContactsRequest inviteContactsRequest = new InviteContactsRequest(null, (List) obj3, ByteString.EMPTY);
                this.label = 1;
                Object inviteContacts = appService.inviteContacts(inviteContactsRequest, this);
                return inviteContacts == coroutineSingletons6 ? coroutineSingletons6 : inviteContacts;
            case 6:
                RealAttestedKeyService.GenerationAttempt generationAttempt = (RealAttestedKeyService.GenerationAttempt) obj3;
                RealAttestedKeyService.KeyAlgorithm keyAlgorithm = generationAttempt.f1168type;
                RealAttestedKeyService realAttestedKeyService = (RealAttestedKeyService) this.this$0;
                RealKeyStoreProvider realKeyStoreProvider = realAttestedKeyService.keyStore;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyGenParameterSpec.Builder access$getKeyParameterSpecBuilder = RealAttestedKeyService.access$getKeyParameterSpecBuilder(realAttestedKeyService, generationAttempt.withStrongBox, generationAttempt.withDeviceProperties, keyAlgorithm != RealAttestedKeyService.KeyAlgorithm.P256 ? new Integer(generationAttempt.keySize) : null);
                    int ordinal = keyAlgorithm.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        KeyGenParameterSpec build = access$getKeyParameterSpecBuilder.setSignaturePaddings("PKCS1").build();
                        build.getClass();
                        this.label = 2;
                        break;
                    } else {
                        KeyGenParameterSpec build2 = access$getKeyParameterSpecBuilder.setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).build();
                        build2.getClass();
                        this.label = 1;
                        Object withContext4 = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$generateECKey$2(realKeyStoreProvider, build2, r12, i5), this);
                        if (withContext4 != coroutineSingletons7) {
                            withContext4 = Unit.INSTANCE;
                            break;
                        }
                    }
                    if (withContext == null) {
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                        if (withContext == null) {
                            return realAttestedKeyService.initSign(keyAlgorithm, (PrivateKey) withContext);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                String str3 = realAttestedKeyService.keyAlias;
                this.label = 3;
                withContext = JobKt.withContext(realKeyStoreProvider.ioContext, new RealKeyStoreProvider$getKey$2(realKeyStoreProvider, str3, r12, i5), this);
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((ClientSyncLocaleChangeIoSetupTeardown) this.this$0).clientSyncLocale.set((Locale) obj3, this) == coroutineSingletons8) {
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
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) obj3, i6));
                    SessionWorkerKt$runSession$5 sessionWorkerKt$runSession$5 = new SessionWorkerKt$runSession$5(i4, r12, 18);
                    this.label = 1;
                    if (FlowKt.first(snapshotFlow, sessionWorkerKt$runSession$5, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) ((LocalCashBalancePresenter) this.this$0).navigator).goTo(back);
                return Unit.INSTANCE;
            case 9:
                LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (languageDisclosure == null) {
                        AppConfigManager appConfigManager = (AppConfigManager) ((LocalCashBalancePresenter) obj3).launcher;
                        this.this$0 = null;
                        this.label = 1;
                        if (((RealAppConfigManager) appConfigManager).update(true, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 10:
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantBlockingClientService merchantBlockingClientService = (MerchantBlockingClientService) localCashBalancePresenter.syncer;
                    TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2 = new TooltipBoxKt$$ExternalSyntheticLambda2(localCashBalancePresenter, 25);
                    this.label = 1;
                    access$getBlockedBusinessesConfig = LocalCashBalancePresenter.access$getBlockedBusinessesConfig(localCashBalancePresenter, merchantBlockingClientService, tooltipBoxKt$$ExternalSyntheticLambda2, this);
                    if (access$getBlockedBusinessesConfig == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$getBlockedBusinessesConfig = obj;
                }
                GetCardBlockedBusinessesUIConfigResponse getCardBlockedBusinessesUIConfigResponse = (GetCardBlockedBusinessesUIConfigResponse) access$getBlockedBusinessesConfig;
                ScenarioPlan scenarioPlan = (getCardBlockedBusinessesUIConfigResponse == null || (responseContext = getCardBlockedBusinessesUIConfigResponse.response_context) == null) ? null : responseContext.scenario_plan;
                if (!((MerchantScreen$MerchantBlockingScreen) localCashBalancePresenter.service).isNuxVisible || scenarioPlan == null) {
                    MutableState mutableState = (MutableState) obj3;
                    if (getCardBlockedBusinessesUIConfigResponse != null && (cardBlockedBusinessesUIConfig = getCardBlockedBusinessesUIConfigResponse.card_blocked_businesses_ui_config) != null) {
                        MerchantProtoParsingExceptionFactory merchantProtoParsingExceptionFactory = MerchantProtoParsingExceptionFactory.INSTANCE;
                        try {
                            ProtoValidationScope protoValidationScope = new ProtoValidationScope(cardBlockedBusinessesUIConfig, merchantProtoParsingExceptionFactory, localCashBalancePresenter);
                            String str4 = cardBlockedBusinessesUIConfig.customer_token;
                            ProtoValidationScope.required(str4, "customer_token");
                            List list = cardBlockedBusinessesUIConfig.sections;
                            ProtoValidationScope.required(list, "sections");
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(BlockedBusinessesUiConfigMappersKt.toSection(protoValidationScope, (CardBlockedBusinessesUIConfig.SectionConfig) it.next()));
                            }
                            CardBlockedBusinessesUIConfig.NavigationHelpItem navigationHelpItem = cardBlockedBusinessesUIConfig.navigation_item;
                            ProtoValidationScope.required(navigationHelpItem, "navigation_item");
                            BlockedBusinessesUiConfig.HelpButton navigationItem = BlockedBusinessesUiConfigMappersKt.toNavigationItem(protoValidationScope, navigationHelpItem);
                            CardBlockedBusinessesUIConfig.ErrorMessageDialog errorMessageDialog = cardBlockedBusinessesUIConfig.error_message;
                            r12 = new BlockedBusinessesUiConfig(str4, arrayList, navigationItem, errorMessageDialog != null ? BlockedBusinessesUiConfigMappersKt.toErrorMessage(protoValidationScope, errorMessageDialog) : null);
                        } catch (Exception e) {
                            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardBlockedBusinessesUIConfig.class), merchantProtoParsingExceptionFactory, null);
                        }
                    }
                    mutableState.setValue(r12);
                } else {
                    ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(((BlockersDataNavigator) localCashBalancePresenter.store).getNext(null, FlowStarter.startFlow$default((FlowStarter) localCashBalancePresenter.launcher, BlockersData.Flow.CLIENT_SCENARIO, new MerchantScreen$MerchantBlockingScreen(false), scenarioPlan, ClientScenario.PLASMA, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION)));
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((MoneyTabPresenter) this.this$0).toolbarEvents;
                    TabToolbarInternalViewEvent tabToolbarInternalViewEvent = ((MoneyTabEvent.TabToolbarEvent) ((MoneyTabEvent) obj3)).event;
                    this.label = 1;
                    if (sharedFlowImpl.emit(tabToolbarInternalViewEvent, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    ((MoneyTabPresenter) this.this$0).missingSectionProviderIds.setValue((Set) obj3);
                    if (Unit.INSTANCE == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 != 0) {
                    if (i20 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                SharedFlowImpl sharedFlowImpl2 = ((RealChatSessionManager) this.this$0).chatSession;
                RealActivitiesManager$activities$2$1$2 realActivitiesManager$activities$2$1$2 = new RealActivitiesManager$activities$2$1$2((ProducerScope) obj3, i3);
                this.label = 1;
                sharedFlowImpl2.collect(realActivitiesManager$activities$2$1$2, this);
                return coroutineSingletons14;
            case 14:
                RealChatSessionManager realChatSessionManager = (RealChatSessionManager) obj3;
                ProducerScope producerScope = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (realChatSessionManager.isSubscribed.compareAndSet(false, true)) {
                        JobKt.launch$default(producerScope, null, null, new RealKeyStoreProvider$load$2(realChatSessionManager, r12, 28), 3);
                        JobKt.launch$default(producerScope, null, null, new MusicPresenter$models$2$1(realChatSessionManager, producerScope, r12, 13), 3);
                        MoneyTabUIKt$$ExternalSyntheticLambda5 moneyTabUIKt$$ExternalSyntheticLambda5 = new MoneyTabUIKt$$ExternalSyntheticLambda5(realChatSessionManager, i3);
                        this.this$0 = null;
                        this.label = 1;
                        if (TuplesKt.awaitClose(producerScope, moneyTabUIKt$$ExternalSyntheticLambda5, this) == coroutineSingletons15) {
                            return coroutineSingletons15;
                        }
                    } else {
                        ((ProducerCoroutine) producerScope).close(null);
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                String str5 = (String) obj3;
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) localEditorialPresenter.responseContextHandler;
                RealMoneybotChatMessagesCache realMoneybotChatMessagesCache = (RealMoneybotChatMessagesCache) localEditorialPresenter.clock;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatManager chatManager = (ChatManager) localEditorialPresenter.launcher;
                    this.label = 1;
                    deleteChat = ((RealChatManager) chatManager).deleteChat(str5, this);
                    break;
                } else if (i22 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    deleteChat = obj;
                } else {
                    if (i22 != 2) {
                        if (i22 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            obj2 = obj;
                            RecentMoneybotSession recentMoneybotSession = (RecentMoneybotSession) obj2;
                            if (Intrinsics.areEqual(recentMoneybotSession != null ? recentMoneybotSession.sessionId : null, str5)) {
                                this.label = 4;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        if (i22 == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i22 != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        parcelableSnapshotMutableState.setValue(null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    this.label = 3;
                    obj2 = realMoneybotChatMessagesCache.recentMoneybotSessionPref.get(this);
                    break;
                }
                ApiResult apiResult = (ApiResult) deleteChat;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    parcelableSnapshotMutableState.setValue(MoneybotChatHistoryViewModel.Content.Error.Delete.INSTANCE);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.label = 5;
                    break;
                } else {
                    RealUserSessionPager realUserSessionPager = (RealUserSessionPager) localEditorialPresenter.service;
                    this.label = 2;
                    break;
                }
                return coroutineSingletons16;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MoneybotChatPresenter moneybotChatPresenter2 = (MoneybotChatPresenter) obj3;
                    CoroutineContext coroutineContext = moneybotChatPresenter2.ioContext;
                    MoneybotChatPresenter$models$2$1 moneybotChatPresenter$models$2$1 = new MoneybotChatPresenter$models$2$1(moneybotChatPresenter2, r12, i4);
                    this.this$0 = moneybotChatPresenter2;
                    this.label = 1;
                    withContext2 = JobKt.withContext(coroutineContext, moneybotChatPresenter$models$2$1, this);
                    if (withContext2 == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                    moneybotChatPresenter = moneybotChatPresenter2;
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    moneybotChatPresenter = (MoneybotChatPresenter) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                moneybotChatPresenter.cameraCapturePath$delegate.setValue((String) withContext2);
                return Unit.INSTANCE;
            case 17:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealUserSessionPager realUserSessionPager2 = (RealUserSessionPager) cardLockPresenter.analytics;
                    this.this$0 = coroutineScope;
                    this.label = 1;
                    fetchNextPage = realUserSessionPager2.fetchNextPage(this);
                    if (fetchNextPage == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    fetchNextPage = obj;
                }
                ((ParcelableSnapshotMutableState) cardLockPresenter.flowNavigationHelper).setValue(Boolean.FALSE);
                if (((ApiResult) fetchNextPage) instanceof ApiResult.Failure) {
                    StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) cardLockPresenter.ioDispatcher;
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    ((ParcelableSnapshotMutableState) cardLockPresenter.stringManager).setValue(RecentChatHistoryViewModel$Loaded.Error.LoadingNextPage.INSTANCE);
                    cardLockPresenter.ioDispatcher = JobKt.launch$default(coroutineScope, null, null, new MoneybotOverflowMenuPresenter$loadNextPage$1$1(cardLockPresenter, r12, i5), 3);
                }
                return Unit.INSTANCE;
            case 18:
                MusicPresenter musicPresenter = (MusicPresenter) this.this$0;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) musicPresenter.args;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ?? obj5 = StringsKt.trim(((MoneybotPreambleEditorViewEvent.Save) ((MoneybotPreambleEditorViewEvent) obj3)).preamble).toString();
                    parcelableSnapshotMutableState2.setValue(obj5.length() != 0 ? obj5 : null);
                    RealMoneybotPreambleManager realMoneybotPreambleManager = (RealMoneybotPreambleManager) musicPresenter.musicPlayer;
                    String str6 = (String) parcelableSnapshotMutableState2.getValue();
                    this.label = 1;
                    Object obj6 = realMoneybotPreambleManager.moneybotPreambleOverride.set(str6, this);
                    if (obj6 != coroutineSingletons19) {
                        obj6 = Unit.INSTANCE;
                    }
                    if (obj6 == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                return Unit.INSTANCE;
            case 19:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj3;
                RawMessagesScreen rawMessagesScreen = (RawMessagesScreen) workHomePresenter.shiftSection2Presenter;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                try {
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChatManager chatManager2 = (ChatManager) workHomePresenter.shiftsAnalytics;
                        String str7 = rawMessagesScreen.sessionId;
                        this.this$0 = produceStateScope;
                        this.label = 1;
                        messages = ((RealChatManager) chatManager2).getMessages(str7, this);
                        if (messages == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        messages = obj;
                    }
                    ApiResult apiResult2 = (ApiResult) messages;
                    if (apiResult2 instanceof ApiResult.Success) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Message message : ((GetMessagesResponse) ((ApiResult.Success) apiResult2).response).messages) {
                            Object value = ((Lazy) workHomePresenter.youPresenter).getValue();
                            value.getClass();
                            String json = ((JsonAdapter) value).toJson(message);
                            json.getClass();
                            arrayList2.add(json);
                        }
                        error = new RawMessagesViewModel.Loaded(rawMessagesScreen.sessionId, CollectionsKt.toList(arrayList2));
                    } else {
                        if (!(apiResult2 instanceof ApiResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        error = new RawMessagesViewModel.Error(rawMessagesScreen.sessionId);
                    }
                    produceStateScope.setValue(error);
                } catch (Exception unused) {
                    produceStateScope.setValue(new RawMessagesViewModel.Error(rawMessagesScreen.sessionId));
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatManager chatManager3 = (ChatManager) ((EarningsHeaderPresenter) this.this$0).earningsChartRepository;
                    String str8 = ((SuggestionListViewEvent.SuggestionTapped) obj3).clientSuggestionId;
                    this.label = 1;
                    if (((RealChatManager) chatManager3).updateSuggestion(str8, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new DatePickerKt$$ExternalSyntheticLambda24((LazyListState) this.this$0, i2));
                    RadioKt$Radio$2$1$1 radioKt$Radio$2$1$1 = new RadioKt$Radio$2$1$1(3, (Function0) obj3);
                    this.label = 1;
                    if (snapshotFlow2.collect(radioKt$Radio$2$1$1, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i28 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealComputationalIntegrityChecker realComputationalIntegrityChecker = ((MobileRuntimeIntegrityWorker) this.this$0).computationalIntegrityChecker;
                    this.label = 1;
                    withContext3 = JobKt.withContext(realComputationalIntegrityChecker.computationContext, new RealComputationalIntegrityChecker$measure$2(realComputationalIntegrityChecker, (ComputationalIntegrityConfig) obj3, null), this);
                    if (withContext3 == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext3 = obj;
                }
                return new MobileRuntimeIntegrityWorker.ResultWrapper(withContext3);
            case 23:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 != 0 && i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                while (JobKt.isActive(coroutineScope2)) {
                    StuckPlayerDetector stuckPlayerDetector = (StuckPlayerDetector) obj3;
                    StateFlowImpl stateFlowImpl2 = (StateFlowImpl) stuckPlayerDetector.clock;
                    long duration3 = ((ExoPlayerImpl) ((ExoPlayer) stuckPlayerDetector.player)).getDuration();
                    if (duration3 == -9223372036854775807L || duration3 <= 0) {
                        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(null, valueOf);
                    } else {
                        Float valueOf2 = Float.valueOf(RangesKt___RangesKt.coerceIn(r2.getCurrentPosition() / duration3, RecyclerView.DECELERATION_RATE, 1.0f));
                        stateFlowImpl2.getClass();
                        stateFlowImpl2.updateState(null, valueOf2);
                    }
                    this.this$0 = coroutineScope2;
                    this.label = 1;
                    if (JobKt.delay(100L, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                }
                return Unit.INSTANCE;
            case 24:
                RealBleManager realBleManager = (RealBleManager) obj3;
                ProducerScope producerScope2 = (ProducerScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProducerCoroutine producerCoroutine = (ProducerCoroutine) producerScope2;
                    producerCoroutine.mo1159trySendJP2dKIU(realBleManager.btAdapter.isEnabled() ? BleDeviceState.ENABLED : BleDeviceState.DISABLED);
                    zabs zabsVar = new zabs(producerCoroutine, realBleManager);
                    realBleManager.activity.registerReceiver(zabsVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    Timber.Forest.i("NEARBY - Started observing Bluetooth device state", new Object[0]);
                    UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0 = new UtilsKt$$ExternalSyntheticLambda0(19, realBleManager, zabsVar);
                    this.this$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerCoroutine, utilsKt$$ExternalSyntheticLambda0, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MiscNotificationChannelContributor miscNotificationChannelContributor = (MiscNotificationChannelContributor) this.this$0;
                    AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) ((DefaultSocket) obj3).socket;
                    this.label = 1;
                    switch (miscNotificationChannelContributor.$r8$classId) {
                        case 0:
                            NotificationChannelId notificationChannelId = NotificationChannelId.AccountSecurity;
                            AndroidStringManager androidStringManager2 = miscNotificationChannelContributor.stringManager;
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(notificationChannelId, androidStringManager2.get(R.string.notificationchannel_security), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.Notices, androidStringManager2.get(R.string.notificationchannel_notices), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.AccountChanges, androidStringManager2.get(R.string.notificationchannel_account_changes), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.Transactions, androidStringManager2.get(R.string.notificationchannel_transactions), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.BitcoinPriceAlerts, androidStringManager2.get(R.string.notificationchannel_bitcoin_price_alerts), 4));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.Families, androidStringManager2.get(R.string.notificationchannel_families), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.TaxesMarketing, androidStringManager2.get(R.string.notificationchannel_news_exclusives_taxes_marketing), 20));
                            unit = Unit.INSTANCE;
                            break;
                        case 1:
                            NotificationChannelId notificationChannelId2 = NotificationChannelId.StocksFollowedPriceAlerts;
                            AndroidStringManager androidStringManager3 = miscNotificationChannelContributor.stringManager;
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(notificationChannelId2, androidStringManager3.get(R.string.notificationchannel_stocks_i_follow_price_alerts), 4));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.StocksFollowedEarningsIpo, androidStringManager3.get(R.string.notificationchannel_stocks_i_follow_earnings_ipo), 4));
                            unit = Unit.INSTANCE;
                            break;
                        case 2:
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.GeneralAndPromotions, miscNotificationChannelContributor.stringManager.get(R.string.notificationchannel_general_and_promotions), 20));
                            unit = Unit.INSTANCE;
                            break;
                        case 3:
                            NotificationChannelId notificationChannelId3 = NotificationChannelId.Offers;
                            AndroidStringManager androidStringManager4 = miscNotificationChannelContributor.stringManager;
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(notificationChannelId3, androidStringManager4.get(R.string.notificationchannel_news_exclusives_offers), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.CashAppNews, androidStringManager4.get(R.string.notificationchannel_news_exclusives_cash_app_news), 20));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.Exclusives, androidStringManager4.get(R.string.notificationchannel_news_exclusives_exclusives), 20));
                            unit = Unit.INSTANCE;
                            break;
                        default:
                            NotificationChannelId notificationChannelId4 = NotificationChannelId.StocksOwnedPriceAlerts;
                            AndroidStringManager androidStringManager5 = miscNotificationChannelContributor.stringManager;
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(notificationChannelId4, androidStringManager5.get(R.string.notificationchannel_stocks_i_own_price_alerts), 4));
                            androidNotificationManager.createOrUpdateChannel(new NewNotificationChannel(NotificationChannelId.StocksOwnedEarningReport, androidStringManager5.get(R.string.notificationchannel_stocks_i_own_earning_report), 4));
                            unit = Unit.INSTANCE;
                            break;
                    }
                    if (unit == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) obj3;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("DATADOG");
                    forest.d("Processing pre-initialization queue.", new Object[0]);
                    BufferedChannel bufferedChannel = realObservabilityManager.preInitializationQueue;
                    bufferedChannel.getClass();
                    bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                    this.this$0 = bufferedChannelIterator;
                    this.label = 1;
                    hasNext = bufferedChannelIterator.hasNext(this);
                    if (hasNext == coroutineSingletons27) {
                    }
                    if (((Boolean) hasNext).booleanValue()) {
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bufferedChannelIterator = (BufferedChannel.BufferedChannelIterator) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    hasNext = obj;
                    if (((Boolean) hasNext).booleanValue()) {
                        realObservabilityManager.process((RealObservabilityManager.EnqueuedItem) bufferedChannelIterator.next());
                        this.this$0 = bufferedChannelIterator;
                        this.label = 1;
                        hasNext = bufferedChannelIterator.hasNext(this);
                        if (hasNext == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                        if (((Boolean) hasNext).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRepository realOffersTabRepository = ((RealOffersRepositoryService) this.this$0).offersTabRepository;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(OfferSheetPreload.ADAPTER.decode((ByteString) obj3));
                    this.label = 1;
                    if (realOffersTabRepository.saveSheetPreload(listOf, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealOffersTabRefresher) this.this$0).offersTabRepository.search("", "", (OffersTabRepository$SearchSource) obj3, null, null, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersDetailsPresenter offersDetailsPresenter = (OffersDetailsPresenter) this.this$0;
                    this.label = 1;
                    ClientRoute tryParse = ClientRouteParserKt.tryParse((RealClientRouteParser) offersDetailsPresenter.clientRouteParser, (String) obj3);
                    if ((tryParse instanceof ClientRoute.ViewOffersSheetV2 ? JobKt.withContext((CoroutineContext) offersDetailsPresenter.computationDispatcher, new OverlayKt$Overlay$1$1$1$1$1((ClientRoute.ViewOffersSheetV2) tryParse, offersDetailsPresenter, r12, i6), this) : Unit.INSTANCE) == obj7) {
                        return obj7;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.music.presenters.MusicPresenter$models$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ MutableState $state$delegate;

        public /* synthetic */ AnonymousClass1(int i, MutableState mutableState) {
            this.$r8$classId = i;
            this.$state$delegate = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            FileBlockerPresenter.UploadState uploadState;
            AfterPayOrderHubViewModel.LoadingViewModel copy$default;
            RealInvestingCryptoGraphHeaderPresenter.State copy$default2;
            int i = this.$r8$classId;
            MutableState mutableState = this.$state$delegate;
            switch (i) {
                case 0:
                    float floatValue = ((Number) obj).floatValue();
                    if (((MusicViewModel) mutableState.getValue()) instanceof MusicViewModel.Loaded) {
                        MusicViewModel musicViewModel = (MusicViewModel) mutableState.getValue();
                        musicViewModel.getClass();
                        mutableState.setValue(MusicViewModel.Loaded.copy$default((MusicViewModel.Loaded) musicViewModel, null, false, floatValue, null, 11));
                    }
                    break;
                case 1:
                    mutableState.setValue((FulfillmentConfigurations) obj);
                    break;
                case 2:
                    mutableState.setValue(TableQrCodeScannerCameraState.copy$default((TableQrCodeScannerCameraState) mutableState.getValue(), ((Boolean) obj).booleanValue(), null, 2));
                    break;
                case 3:
                    mutableState.setValue(TableQrCodeScannerCameraState.copy$default((TableQrCodeScannerCameraState) mutableState.getValue(), false, null, 2));
                    break;
                case 4:
                    Calendar calendar = AccountDocumentsPresenter.cal;
                    mutableState.setValue((AccountDocumentsViewModel) obj);
                    break;
                case 5:
                    mutableState.setValue(RealBitcoinGraphPresenter$State.copy$default((RealBitcoinGraphPresenter$State) mutableState.getValue(), null, (BitcoinGraphModel) obj, false, 9));
                    break;
                case 6:
                    mutableState.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState.getValue(), false, (CryptoBalance$BitcoinBalance) obj, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE));
                    break;
                case 7:
                    mutableState.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE));
                    break;
                case 8:
                    mutableState.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState.getValue(), false, null, null, false, BitcoinQrCodeScannerPresenterKt$WhenMappings.$EnumSwitchMapping$0[((ActivityEvent) obj).ordinal()] == 1 ? CameraState.PAUSED : CameraState.RESUMED, 127));
                    break;
                case 9:
                    mutableState.setValue((Money) obj);
                    break;
                case 10:
                    BitcoinAmountBlockerPresenter$State bitcoinAmountBlockerPresenter$State = (BitcoinAmountBlockerPresenter$State) mutableState.getValue();
                    BitcoinAmountViewModel copy$default3 = BitcoinAmountViewModel.copy$default((BitcoinAmountViewModel) obj, false, null, false, null, null, 383);
                    SetAmountRequest setAmountRequest = bitcoinAmountBlockerPresenter$State.setAmountRequest;
                    bitcoinAmountBlockerPresenter$State.getClass();
                    mutableState.setValue(new BitcoinAmountBlockerPresenter$State(copy$default3, setAmountRequest));
                    break;
                case 11:
                    BlockerImageUploader$State blockerImageUploader$State = (BlockerImageUploader$State) obj;
                    if (!(blockerImageUploader$State instanceof BlockerImageUploader$State.Success)) {
                        if (!(blockerImageUploader$State instanceof BlockerImageUploader$State.Failure)) {
                            if (!(blockerImageUploader$State instanceof BlockerImageUploader$State.InProgress)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                uploadState = FileBlockerPresenter.UploadState.IN_PROGRESS;
                            }
                        } else {
                            uploadState = FileBlockerPresenter.UploadState.FAILED;
                        }
                    } else {
                        uploadState = FileBlockerPresenter.UploadState.IDLE;
                    }
                    mutableState.setValue(uploadState);
                    break;
                case 12:
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 13:
                    AfterPayOrderHubLoadingStatus afterPayOrderHubLoadingStatus = (AfterPayOrderHubLoadingStatus) obj;
                    if (!(afterPayOrderHubLoadingStatus instanceof AfterPayOrderHubLoadingStatus.InitialLoadStatus)) {
                        if (!(afterPayOrderHubLoadingStatus instanceof AfterPayOrderHubLoadingStatus.PaginatedLoadStatus)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            copy$default = AfterPayOrderHubViewModel.LoadingViewModel.copy$default((AfterPayOrderHubViewModel.LoadingViewModel) mutableState.getValue(), null, (AfterPayOrderHubLoadingStatus.PaginatedLoadStatus) afterPayOrderHubLoadingStatus, 1);
                        }
                    } else {
                        copy$default = AfterPayOrderHubViewModel.LoadingViewModel.copy$default((AfterPayOrderHubViewModel.LoadingViewModel) mutableState.getValue(), (AfterPayOrderHubLoadingStatus.InitialLoadStatus) afterPayOrderHubLoadingStatus, null, 2);
                    }
                    mutableState.setValue(copy$default);
                    break;
                case 14:
                    mutableState.setValue((PagingData) obj);
                    break;
                case 15:
                    mutableState.setValue((CardPreviewViewModel) obj);
                    break;
                case 16:
                    mutableState.setValue((CardPreviewViewModel) obj);
                    break;
                case 17:
                    ((Boolean) obj).booleanValue();
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 18:
                    ((UiCallbackModel) mutableState.getValue()).onEvent.invoke(ActivityEmbeddedViewEvent.Refresh.INSTANCE);
                    break;
                case 19:
                    mutableState.setValue(Boolean.TRUE);
                    break;
                case 20:
                    mutableState.setValue((EarningsTrackerDataResult) obj);
                    break;
                case 21:
                    FormCashtagPresenter.LookupResult lookupResult = (FormCashtagPresenter.LookupResult) obj;
                    if (!lookupResult.updatePreviewText) {
                        String str = ((FormCashtagPresenter.LookupResult) mutableState.getValue()).previewText;
                    }
                    mutableState.setValue(lookupResult);
                    boolean z = ((FormCashtagPresenter.LookupResult) mutableState.getValue()).isSubmittable;
                    break;
                case 22:
                    if (((Boolean) obj).booleanValue()) {
                        List list = OffersSearchListingKt.logosViewModels;
                        ((Function0) mutableState.getValue()).invoke();
                    }
                    break;
                case 23:
                    mutableState.setValue((InstrumentSelectionRowViewModel) obj);
                    break;
                case 24:
                    mutableState.setValue(PaymentRouterData.copy$default((PaymentRouterData) mutableState.getValue(), null, null, null, false, false, false, (InstrumentSelectionRowViewModel) obj, null, false, null, false, false, null, null, null, null, null, null, false, 16776959));
                    break;
                case 25:
                    mutableState.setValue((PersonalizedPaymentLoadingState) obj);
                    break;
                case 26:
                    mutableState.setValue(((PoolInvitePeopleListViewEvent.SearchTermChanged) obj).searchTerm);
                    break;
                case 27:
                    InvestingGraphViewEvent investingGraphViewEvent = (InvestingGraphViewEvent) obj;
                    if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.SelectRange)) {
                        if (!(investingGraphViewEvent instanceof InvestingGraphViewEvent.ScrubPoint)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            copy$default2 = RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState.getValue(), null, ((InvestingGraphViewEvent.ScrubPoint) investingGraphViewEvent).point, null, null, null, false, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                        }
                    } else {
                        copy$default2 = RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState.getValue(), ((InvestingGraphViewEvent.SelectRange) investingGraphViewEvent).range, null, null, null, null, false, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    }
                    mutableState.setValue(copy$default2);
                    break;
                case 28:
                    mutableState.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState.getValue(), null, null, null, null, null, false, null, (InvestingGraphContentModel) obj, 127));
                    break;
                default:
                    mutableState.setValue(RealInvestingCryptoGraphHeaderPresenter.State.copy$default((RealInvestingCryptoGraphHeaderPresenter.State) mutableState.getValue(), null, null, null, null, (Money) obj, false, null, null, 239));
                    break;
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass1(CoroutineScope coroutineScope, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.$state$delegate = mutableState;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicPresenter$models$2$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = obj;
    }
}
