package coil3.network;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.biometric.DeviceUtils;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.datastore.preferences.core.Preferences;
import androidx.emoji2.text.MetadataRepo;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.screen.Screen;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.t7$$ExternalSyntheticLambda4;
import coil3.RealImageLoader$execute$result$1;
import coil3.decode.DataSource;
import coil3.decode.ImageSource;
import coil3.fetch.SourceFetchResult;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzdb;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmc;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmz;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzw;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.libraries.places.api.net.zzj;
import com.google.android.libraries.places.api.net.zzk;
import com.google.android.libraries.places.internal.zzns;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.clustering.ComposeUiClusterRenderer;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.mikepenz.markdown.model.MarkdownStateImpl;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.controller.a.e;
import com.miteksystems.misnap.controller.a.j;
import com.miteksystems.misnap.core.Frame;
import com.squareup.address.typeahead.backend.api.AddressSearcher$AddressTypeFilter;
import com.squareup.address.typeahead.backend.api.AddressSearcher$SearchResult;
import com.squareup.address.typeahead.backend.api.LocationType;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.presenters.AccountPresenter;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$documentCategoryViewModel$3;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$legalDocumentViewModel$1;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$takePhoto$1;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.account.types.SignedInState;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.activity.backend.ActivityFormattingError;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$models$availableBalance$2$1$WhenMappings;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda4;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdStore;
import com.squareup.cash.advertising.presenters.FullscreenAdPresenter;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.OnDemandMessageAnalyticsData;
import com.squareup.cash.bitcoin.capability.BitcoinCapability;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.cdf.personalprofile.PersonalProfileSignOutConfirm;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.core.navigationcontainer.api.scrim.ScrimScreen;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.CropResultManager$CropResult;
import com.squareup.cash.data.profile.RealCropResultManager;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.data.profile.documents.AccountStatementsManager$AccountStatementsInfo;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$NameQuery;
import com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$selectForParentId$2;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.db2.profile.documents.DocumentQueries$SelectForTokenQuery;
import com.squareup.cash.db2.profile.documents.DocumentQueries$selectForCategoryId$2;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$AfterpayStatementDocuments;
import com.squareup.cash.featureflags.AmplitudeExperiments$FpBitcoinTaxesTofWidget;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowSlices;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CardFeeStatements;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$WorkApplet;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutResult;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuSheetResult;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.treehouse.ActivityTreehouseCompatibility$Method;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.FormattingResult;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.cash.wallet.views.WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.views.ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$2;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.ui.modal.ModalContainer$update$2$1$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.slf4j.Logger;
import papa.SafeTrace;
import retrofit2.KotlinExtensions$await$4$2;

/* loaded from: classes3.dex */
public final class NetworkFetcher$doFetch$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008c, code lost:
    
        if (r10 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$activity$backend$ZiplineActivityItemFormatter$format$4(Object obj) {
        List list;
        ArrayList arrayList = (ArrayList) this.this$0;
        ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                boolean canUse = ziplineActivityItemFormatter.activityTreehouseCompatibility.canUse(ActivityTreehouseCompatibility$Method.LocaleAwareFormatting);
                ActivityDataBridge activityDataBridge = ziplineActivityItemFormatter.activityDataBridge;
                if (canUse) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ZiplineActivityItemFormatter.serializable((PaymentHistoryActivityItem) it.next()));
                    }
                    this.label = 1;
                    obj = activityDataBridge.format((String) null, arrayList2, this);
                    if (obj == coroutineSingletons) {
                    }
                    list = (List) obj;
                } else {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(ZiplineActivityItemFormatter.serializable((PaymentHistoryActivityItem) it2.next()));
                    }
                    this.label = 2;
                    obj = activityDataBridge.format(arrayList3, this);
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                list = (List) obj;
            } else {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                list = (List) obj;
            }
            List list2 = list;
            int i2 = 0;
            int i3 = 0;
            for (Object obj2 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                FormattingResult formattingResult = (FormattingResult) obj2;
                if (formattingResult instanceof FormattingResult.Failure) {
                    ziplineActivityItemFormatter.reportAsError((FormattingResult.Failure) formattingResult, (PaymentHistoryActivityItem) arrayList.get(i3));
                }
                i3 = i4;
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Object obj3 : list2) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                arrayList4.add(ziplineActivityItemFormatter.mapResult((PaymentHistoryActivityItem) arrayList.get(i2), (FormattingResult) obj3));
                i2 = i5;
            }
            return arrayList4;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ziplineActivityItemFormatter.errorReporter.report(new ActivityFormattingError(e2, null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList5.add(DeviceUtils.FormattingFailedActivityItem((PaymentHistoryActivityItem) it3.next()));
            }
            return arrayList5;
        }
    }

    private final Object invokeSuspend$com$squareup$cash$activity$views$receipts$ReceiptScaffoldKt$ReceiptScaffold$showFooter$2$1(Object obj) {
        ScrollState scrollState = (ScrollState) this.this$0;
        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            int i2 = 2;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new SafeFlow(new WorkerWorkflow$render$1(Updater.snapshotFlow(new WalletHomeViewKt$WalletHome$2$2$1$$ExternalSyntheticLambda0(scrollState, i2)), new ReceiptUiKt$$ExternalSyntheticLambda4(i2), continuation, 16)));
            ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(6, produceStateScope, scrollState);
            this.L$0 = null;
            this.label = 1;
            if (distinctUntilChanged.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$advertising$presenters$FullscreenAdPresenter$getAudioStatus$1$6(Object obj) {
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Boolean valueOf = Boolean.valueOf(((FullscreenAdPresenter) this.this$0).audioManager.audioManager.getStreamVolume(3) == 0);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$advertising$presenters$FullscreenAdPresenter$handleAppMessageAction$2(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealFullscreenAdStore realFullscreenAdStore = ((FullscreenAdPresenter) this.L$0).fullscreenAdStore;
            String str = (String) this.this$0;
            this.label = 1;
            realFullscreenAdStore.fullScreenMessageQueries.deleteByMessageToken(str);
            if (Unit.INSTANCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2((NetworkFetcher) obj2, continuation, 0);
                networkFetcher$doFetch$2.L$0 = obj;
                return networkFetcher$doFetch$2;
            case 1:
                return new NetworkFetcher$doFetch$2((zzmc) this.L$0, (GenerateContentRequest) obj2, continuation, 1);
            case 2:
                return new NetworkFetcher$doFetch$2((zzmz) this.L$0, (Context) obj2, continuation, 2);
            case 3:
                return new NetworkFetcher$doFetch$2((JavaDataStorage) this.L$0, (Preferences.Key) obj2, continuation, 3);
            case 4:
                return new NetworkFetcher$doFetch$2((CameraPositionState) this.L$0, (ClusterManager) obj2, continuation, 4);
            case 5:
                return new NetworkFetcher$doFetch$2((MutableState) this.L$0, (ClusterManager) obj2, continuation, 5);
            case 6:
                return new NetworkFetcher$doFetch$2((ProducerScope) this.L$0, (Ref$BooleanRef) obj2, continuation, 6);
            case 7:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$22 = new NetworkFetcher$doFetch$2((ComposeUiClusterRenderer.InvalidatingComposeView) obj2, continuation, 7);
                networkFetcher$doFetch$22.L$0 = obj;
                return networkFetcher$doFetch$22;
            case 8:
                return new NetworkFetcher$doFetch$2((MutableState) this.L$0, (MarkdownStateImpl) obj2, continuation, 8);
            case 9:
                return new NetworkFetcher$doFetch$2((e) this.L$0, (Frame) obj2, continuation, 9);
            case 10:
                return new NetworkFetcher$doFetch$2((AddressTypeaheadState) this.L$0, (String) obj2, continuation, 10);
            case 11:
                return new NetworkFetcher$doFetch$2((NavigationSideEffects) this.L$0, (String) obj2, continuation, 11);
            case 12:
                return new NetworkFetcher$doFetch$2((AccountPresenter) this.L$0, (AccountViewEvent) obj2, continuation, 12);
            case 13:
                return new NetworkFetcher$doFetch$2((TapToPayPresenter) this.L$0, (EditProfileViewEvent) obj2, continuation, 13);
            case 14:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$23 = new NetworkFetcher$doFetch$2((ScrimScreen) obj2, continuation, 14);
                networkFetcher$doFetch$23.L$0 = obj;
                return networkFetcher$doFetch$23;
            case 15:
                return new NetworkFetcher$doFetch$2((AccountDocumentsPresenter) this.L$0, (MutableState) obj2, continuation, 15);
            case 16:
                return new NetworkFetcher$doFetch$2((ZiplineActivityItemFormatter) this.L$0, (ArrayList) obj2, continuation, 16);
            case 17:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$24 = new NetworkFetcher$doFetch$2((RealActivitiesManager) obj2, continuation, 17);
                networkFetcher$doFetch$24.L$0 = obj;
                return networkFetcher$doFetch$24;
            case 18:
                return new NetworkFetcher$doFetch$2((RealActivitiesManager) this.L$0, (ActivitiesManager.ActivityPage.PageOffset) obj2, continuation, 18);
            case 19:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$25 = new NetworkFetcher$doFetch$2((RealSingleActivityManager) obj2, continuation, 19);
                networkFetcher$doFetch$25.L$0 = obj;
                return networkFetcher$doFetch$25;
            case 20:
                return new NetworkFetcher$doFetch$2((ActivityTabPresenter) this.L$0, (OnDemandMessageAnalyticsData) obj2, continuation, 20);
            case 21:
                return new NetworkFetcher$doFetch$2((ActivityTabPresenter) this.L$0, (Set) obj2, continuation, 21);
            case 22:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$26 = new NetworkFetcher$doFetch$2((CardStudioPresenter) obj2, continuation, 22);
                networkFetcher$doFetch$26.L$0 = obj;
                return networkFetcher$doFetch$26;
            case 23:
                return new NetworkFetcher$doFetch$2((RealActivityEmbeddedPresenter) this.L$0, (ActivityEmbeddedViewEvent) obj2, continuation, 23);
            case 24:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$27 = new NetworkFetcher$doFetch$2((RealActivityEmbeddedPresenter) obj2, continuation, 24);
                networkFetcher$doFetch$27.L$0 = obj;
                return networkFetcher$doFetch$27;
            case 25:
                return new NetworkFetcher$doFetch$2((ActivityTabViewModel) this.L$0, (LazyListState) obj2, continuation, 25);
            case 26:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$28 = new NetworkFetcher$doFetch$2((ScrollState) obj2, continuation, 26);
                networkFetcher$doFetch$28.L$0 = obj;
                return networkFetcher$doFetch$28;
            case 27:
                NetworkFetcher$doFetch$2 networkFetcher$doFetch$29 = new NetworkFetcher$doFetch$2((FullscreenAdPresenter) obj2, continuation, 27);
                networkFetcher$doFetch$29.L$0 = obj;
                return networkFetcher$doFetch$29;
            case 28:
                return new NetworkFetcher$doFetch$2((FullscreenAdPresenter) this.L$0, (String) obj2, continuation, 28);
            default:
                return new NetworkFetcher$doFetch$2((AfterpayAppletTilePresenter) this.L$0, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((NetworkFetcher$doFetch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x078d, code lost:
    
        if (r0 == r1) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0834, code lost:
    
        if (r0 == r1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r12.animateScrollToItem(0, 0, r45) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x09f2, code lost:
    
        if (r0 == r2) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0935, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(500, r45) == r2) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        if (r12.scrollToItem(0, 0, r45) == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08cc  */
    /* JADX WARN: Type inference failed for: r2v145, types: [kotlinx.coroutines.flow.Flow] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkResponse networkResponse;
        Object access$toImageSource;
        Object firstOrNull;
        Object obj2;
        Object obj3;
        Object a;
        String str;
        Object result;
        List list;
        Object clear;
        Object clear2;
        Flow realActivityInvitePresenter;
        Flow multiStatementAccountViewModel;
        SafeFlow safeFlow;
        Continuation continuation;
        Flow appLockMonitor$special$$inlined$map$2;
        EglCore eglCore;
        FeatureFlagManager featureFlagManager;
        RealWagesTaxDocumentManager realWagesTaxDocumentManager;
        int i;
        Flow appLockMonitor$special$$inlined$map$22;
        Flow appLockMonitor$special$$inlined$map$23;
        Flow appLockMonitor$special$$inlined$map$24;
        AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$25;
        Flow appLockMonitor$special$$inlined$map$26;
        int i2;
        Flow mapToOneOrDefault;
        Flow appLockMonitor$special$$inlined$map$27;
        Flow appLockMonitor$special$$inlined$map$28;
        int i3 = this.$r8$classId;
        int i4 = 12;
        int i5 = 3;
        int i6 = 10;
        Object obj4 = this.this$0;
        int i7 = 1;
        Continuation continuation2 = null;
        switch (i3) {
            case 0:
                NetworkFetcher networkFetcher = (NetworkFetcher) obj4;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    NetworkResponse networkResponse2 = (NetworkResponse) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    networkResponse = networkResponse2;
                    access$toImageSource = obj;
                    return new SourceFetchResult((ImageSource) access$toImageSource, NetworkFetcher.getMimeType(networkFetcher.url, networkResponse.headers.get()), DataSource.NETWORK);
                }
                SafeTrace.throwOnFailure(obj);
                networkResponse = (NetworkResponse) this.L$0;
                SourceResponseBody sourceResponseBody = networkResponse.body;
                if (sourceResponseBody == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("body == null");
                    return null;
                }
                this.L$0 = networkResponse;
                this.label = 1;
                access$toImageSource = NetworkFetcher.access$toImageSource(networkFetcher, sourceResponseBody, this);
                if (access$toImageSource == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return new SourceFetchResult((ImageSource) access$toImageSource, NetworkFetcher.getMimeType(networkFetcher.url, networkResponse.headers.get()), DataSource.NETWORK);
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                SafeTrace.throwOnFailure(obj);
                if (i9 != 0) {
                    return obj;
                }
                this.label = 1;
                zzdb zzf = zzmc.zzf((zzmc) this.L$0, (GenerateContentRequest) obj4, this);
                return zzf == coroutineSingletons2 ? coroutineSingletons2 : zzf;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                SafeTrace.throwOnFailure(obj);
                if (i10 == 0) {
                    this.label = 1;
                    if (zzmz.zzg((zzmz) this.L$0, (Context) obj4, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow data = ((JavaDataStorage) this.L$0).dataStore.getData();
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(data, this);
                    if (firstOrNull == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                }
                Preferences preferences = (Preferences) firstOrNull;
                if (preferences == null || (obj2 = preferences.get((Preferences.Key) obj4)) == null) {
                    return -1L;
                }
                return obj2;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new GoogleMapEngine$Map$2$1$$ExternalSyntheticLambda0((CameraPositionState) this.L$0, i7));
                    final ClusterManager clusterManager = (ClusterManager) obj4;
                    final int i13 = 0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.google.maps.android.compose.clustering.ClusteringKt$Clustering$25$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj5, Continuation continuation3) {
                            int i14 = i13;
                            ClusterManager clusterManager2 = clusterManager;
                            switch (i14) {
                                case 0:
                                    if (!((Boolean) obj5).booleanValue()) {
                                        clusterManager2.onCameraIdle();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    List list2 = (List) obj5;
                                    ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = clusterManager2.mAlgorithm;
                                    ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
                                    try {
                                        screenBasedAlgorithmAdapter.clearItems();
                                        screenBasedAlgorithmAdapter.unlock();
                                        List list3 = list2;
                                        ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
                                        try {
                                            screenBasedAlgorithmAdapter.mAlgorithm.addItems(list3);
                                            screenBasedAlgorithmAdapter.unlock();
                                            clusterManager2.cluster();
                                            return Unit.INSTANCE;
                                        } finally {
                                        }
                                    } finally {
                                    }
                            }
                        }
                    };
                    this.label = 1;
                    if (snapshotFlow.collect(flowCollector, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new TabContentViewKt$$ExternalSyntheticLambda1(i4, (MutableState) this.L$0));
                    final ClusterManager clusterManager2 = (ClusterManager) obj4;
                    final int i15 = 1;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.google.maps.android.compose.clustering.ClusteringKt$Clustering$25$1$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj5, Continuation continuation3) {
                            int i142 = i15;
                            ClusterManager clusterManager22 = clusterManager2;
                            switch (i142) {
                                case 0:
                                    if (!((Boolean) obj5).booleanValue()) {
                                        clusterManager22.onCameraIdle();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    List list2 = (List) obj5;
                                    ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = clusterManager22.mAlgorithm;
                                    ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
                                    try {
                                        screenBasedAlgorithmAdapter.clearItems();
                                        screenBasedAlgorithmAdapter.unlock();
                                        List list3 = list2;
                                        ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
                                        try {
                                            screenBasedAlgorithmAdapter.mAlgorithm.addItems(list3);
                                            screenBasedAlgorithmAdapter.unlock();
                                            clusterManager22.cluster();
                                            return Unit.INSTANCE;
                                        } finally {
                                        }
                                    } finally {
                                    }
                            }
                        }
                    };
                    this.label = 1;
                    if (snapshotFlow2.collect(flowCollector2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (HandlerDispatcherKt.awaitFrame(this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ProducerScope producerScope = (ProducerScope) this.L$0;
                Unit unit = Unit.INSTANCE;
                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(unit);
                ((Ref$BooleanRef) obj4).element = false;
                return unit;
            case 7:
                ComposeUiClusterRenderer.InvalidatingComposeView invalidatingComposeView = (ComposeUiClusterRenderer.InvalidatingComposeView) obj4;
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    invalidatingComposeView.setOnInvalidate(new t7$$ExternalSyntheticLambda4(26, new Ref$BooleanRef(), producerScope2));
                    if (!invalidatingComposeView.isAttachedToWindow()) {
                        obj3 = null;
                        invalidatingComposeView.addOnAttachStateChangeListener(new ModalContainer$update$2$1$2(2, invalidatingComposeView, invalidatingComposeView, producerScope2));
                    } else if (invalidatingComposeView.isAttachedToWindow()) {
                        obj3 = null;
                        invalidatingComposeView.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(2, invalidatingComposeView, producerScope2));
                    } else {
                        obj3 = null;
                        ((ProducerCoroutine) producerScope2).close(null);
                    }
                    this.L$0 = obj3;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope2, new HazeStyleKt$$ExternalSyntheticLambda0(7), this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow buffer$default = FlowKt.buffer$default(Updater.snapshotFlow(new TabContentViewKt$$ExternalSyntheticLambda1(13, (MutableState) this.L$0)), -1, 2);
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2((MarkdownStateImpl) obj4, 14);
                    this.label = 1;
                    if (buffer$default.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    a = ((e) this.L$0).b.a((Frame) obj4, this);
                    if (a == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    a = obj;
                }
                a.getClass();
                return (j) a;
            case 10:
                AddressTypeaheadState addressTypeaheadState = (AddressTypeaheadState) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        result = obj;
                        AddressSearcher$SearchResult addressSearcher$SearchResult = (AddressSearcher$SearchResult) result;
                        addressTypeaheadState.searching$delegate.setValue(Boolean.FALSE);
                        if (addressSearcher$SearchResult instanceof AddressSearcher$SearchResult.Success) {
                            list = CollectionsKt.take(((AddressSearcher$SearchResult.Success) addressSearcher$SearchResult).searchResults, 5);
                        } else {
                            if (!(addressSearcher$SearchResult instanceof AddressSearcher$SearchResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            list = null;
                        }
                        addressTypeaheadState.setSearchResults(list);
                        addressTypeaheadState.lastSearchFailed$delegate.setValue(Boolean.valueOf(addressSearcher$SearchResult instanceof AddressSearcher$SearchResult.Failure));
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                AddressTypeaheadState.SearcherState searcherState = (AddressTypeaheadState.SearcherState) addressTypeaheadState.searcherState$delegate.getValue();
                searcherState.getClass();
                PlacesAddressSearcher placesAddressSearcher = ((AddressTypeaheadState.SearcherState.Available) searcherState).searcher;
                String str2 = (String) obj4;
                Country country = addressTypeaheadState.countryCode;
                AddressSearcher$AddressTypeFilter addressSearcher$AddressTypeFilter = AddressTypeaheadState.WhenMappings.$EnumSwitchMapping$0[country.ordinal()] == 3 ? AddressSearcher$AddressTypeFilter.GEOCODE : addressTypeaheadState.locationType == LocationType.City ? AddressSearcher$AddressTypeFilter.CITIES : AddressSearcher$AddressTypeFilter.ADDRESS;
                this.label = 2;
                placesAddressSearcher.getClass();
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                cancellableContinuationImpl.initCancellability();
                if (placesAddressSearcher.sessionToken == null) {
                    placesAddressSearcher.sessionToken = zzdi.newInstance();
                }
                zzj builder = zzk.builder();
                builder.setCountries(CollectionsKt__CollectionsJVMKt.listOf(country.toString()));
                int ordinal = addressSearcher$AddressTypeFilter.ordinal();
                if (ordinal == 0) {
                    str = "street_address";
                } else if (ordinal == 1) {
                    str = "(cities)";
                } else if (ordinal == 2) {
                    str = "establishment";
                } else if (ordinal == 3) {
                    str = "geocode";
                } else {
                    if (ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str = "(regions)";
                }
                builder.setTypesFilter(CollectionsKt__CollectionsJVMKt.listOf(str));
                builder.zza = str2;
                builder.zzf = placesAddressSearcher.sessionToken;
                zzk build = builder.build();
                e0 e0Var = placesAddressSearcher.apiClient;
                if (e0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("apiClient");
                    throw null;
                }
                zzw zzwVar = (zzw) e0Var.zza(build, zzns.zza);
                zzwVar.addOnSuccessListener(TaskExecutors.MAIN_THREAD, new SizeMap(new AbstractTypeChecker$$Lambda$0(cancellableContinuationImpl, placesAddressSearcher, country, addressSearcher$AddressTypeFilter, 3), i4));
                zzwVar.addOnFailureListener(new KotlinExtensions$await$4$2(cancellableContinuationImpl));
                result = cancellableContinuationImpl.getResult();
                break;
            case 11:
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMultiBlockerFacilitator realMultiBlockerFacilitator = ((NavigationSideEffects) this.L$0).multiBlockerFacilitator;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realMultiBlockerFacilitator.ioDispatcher, new InteractiveCardView$flingTo$1.AnonymousClass2(realMultiBlockerFacilitator, (String) obj4, (Continuation) null, 4), this);
                    if (withContext != obj5) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj5) {
                        return obj5;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 != 0) {
                    if (i22 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AccountPresenter accountPresenter = (AccountPresenter) this.L$0;
                AccountViewEvent.OnDialogResult onDialogResult = (AccountViewEvent.OnDialogResult) ((AccountViewEvent) obj4);
                Screen screen = onDialogResult.screen;
                Object obj6 = onDialogResult.result;
                this.label = 1;
                RealProfilePhotoManager realProfilePhotoManager = accountPresenter.profilePhotoManager;
                if (screen instanceof ProfileScreens.CropScreen) {
                    RealCropResultManager realCropResultManager = realProfilePhotoManager.cropResultManager;
                    CropResultManager$CropResult cropResultManager$CropResult = realCropResultManager.value;
                    realCropResultManager.value = null;
                    if (cropResultManager$CropResult != null) {
                        accountPresenter.photoUrl.setValue(cropResultManager$CropResult.uncroppedUri.toString());
                        clear = realProfilePhotoManager.save(cropResultManager$CropResult.croppedBitmap, this);
                        break;
                    }
                    clear = Unit.INSTANCE;
                    if (clear == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (screen instanceof ProfileScreens.HeaderMenuScreen) {
                        obj6.getClass();
                        int ordinal2 = ((ProfileHeaderMenuSheetResult) obj6).ordinal();
                        if (ordinal2 == 0) {
                            Continuation continuation3 = null;
                            StandaloneCoroutine standaloneCoroutine = realProfilePhotoManager.photoJob;
                            if (standaloneCoroutine != null) {
                                standaloneCoroutine.cancel(null);
                            }
                            realProfilePhotoManager.photoJob = JobKt.launch$default(realProfilePhotoManager.scope, realProfilePhotoManager.ioDispatcher, null, new RealProfilePhotoManager$takePhoto$1(realProfilePhotoManager, continuation3, 0), 2);
                        } else if (ordinal2 == 1) {
                            StandaloneCoroutine standaloneCoroutine2 = realProfilePhotoManager.photoJob;
                            Continuation continuation4 = null;
                            if (standaloneCoroutine2 != null) {
                                standaloneCoroutine2.cancel(null);
                            }
                            realProfilePhotoManager.photoJob = JobKt.launch$default(realProfilePhotoManager.scope, realProfilePhotoManager.ioDispatcher, null, new MLKitTitleGenerator$1(realProfilePhotoManager, continuation4, 2), 2);
                        } else {
                            if (ordinal2 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            clear = realProfilePhotoManager.clear(this);
                            if (clear != coroutineSingletons12) {
                                clear = Unit.INSTANCE;
                            }
                        }
                        clear = Unit.INSTANCE;
                    } else {
                        ProfileConfirmSignOutResult profileConfirmSignOutResult = obj6 instanceof ProfileConfirmSignOutResult ? (ProfileConfirmSignOutResult) obj6 : null;
                        if (Intrinsics.areEqual(profileConfirmSignOutResult, ProfileConfirmSignOutResult.Positive.INSTANCE)) {
                            RealAccountOutboundNavigator realAccountOutboundNavigator = accountPresenter.accountOutboundNavigator;
                            realAccountOutboundNavigator.analytics.track(new PersonalProfileSignOutConfirm(), null);
                            ((SignedInStateManager) realAccountOutboundNavigator.signedInStateManager).update(SignedInState.SIGNED_OUT);
                        } else if (!Intrinsics.areEqual(profileConfirmSignOutResult, ProfileConfirmSignOutResult.Negative.INSTANCE) && profileConfirmSignOutResult != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        clear = Unit.INSTANCE;
                    }
                    if (clear == coroutineSingletons12) {
                    }
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.L$0;
                EditProfileViewEvent.OnDialogResult onDialogResult2 = (EditProfileViewEvent.OnDialogResult) ((EditProfileViewEvent) obj4);
                Screen screen2 = onDialogResult2.screen;
                Object obj7 = onDialogResult2.result;
                this.label = 1;
                RealProfilePhotoManager realProfilePhotoManager2 = (RealProfilePhotoManager) tapToPayPresenter.screen;
                if (screen2 instanceof ProfileScreens.CropScreen) {
                    RealCropResultManager realCropResultManager2 = realProfilePhotoManager2.cropResultManager;
                    CropResultManager$CropResult cropResultManager$CropResult2 = realCropResultManager2.value;
                    realCropResultManager2.value = null;
                    if (cropResultManager$CropResult2 != null) {
                        ((ParcelableSnapshotMutableState) tapToPayPresenter.ttpSessionManager).setValue(cropResultManager$CropResult2.uncroppedUri.toString());
                        clear2 = realProfilePhotoManager2.save(cropResultManager$CropResult2.croppedBitmap, this);
                        break;
                    }
                    clear2 = Unit.INSTANCE;
                    if (clear2 == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (screen2 instanceof ProfileScreens.HeaderMenuScreen) {
                        obj7.getClass();
                        int ordinal3 = ((ProfileHeaderMenuSheetResult) obj7).ordinal();
                        if (ordinal3 == 0) {
                            Continuation continuation5 = null;
                            StandaloneCoroutine standaloneCoroutine3 = realProfilePhotoManager2.photoJob;
                            if (standaloneCoroutine3 != null) {
                                standaloneCoroutine3.cancel(null);
                            }
                            realProfilePhotoManager2.photoJob = JobKt.launch$default(realProfilePhotoManager2.scope, realProfilePhotoManager2.ioDispatcher, null, new RealProfilePhotoManager$takePhoto$1(realProfilePhotoManager2, continuation5, 0), 2);
                        } else if (ordinal3 == 1) {
                            StandaloneCoroutine standaloneCoroutine4 = realProfilePhotoManager2.photoJob;
                            Continuation continuation6 = null;
                            if (standaloneCoroutine4 != null) {
                                standaloneCoroutine4.cancel(null);
                            }
                            realProfilePhotoManager2.photoJob = JobKt.launch$default(realProfilePhotoManager2.scope, realProfilePhotoManager2.ioDispatcher, null, new MLKitTitleGenerator$1(realProfilePhotoManager2, continuation6, 2), 2);
                        } else {
                            if (ordinal3 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            clear2 = realProfilePhotoManager2.clear(this);
                            if (clear2 != coroutineSingletons13) {
                                clear2 = Unit.INSTANCE;
                            }
                            if (clear2 == coroutineSingletons13) {
                            }
                        }
                    }
                    clear2 = Unit.INSTANCE;
                    if (clear2 == coroutineSingletons13) {
                    }
                }
                return Unit.INSTANCE;
            case 14:
                AcceptableScrim acceptableScrim = (AcceptableScrim) this.L$0;
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrimScreen scrimScreen = (ScrimScreen) obj4;
                    this.L$0 = null;
                    this.label = 1;
                    acceptableScrim.activeScrim.setValue(scrimScreen);
                    Object first = FlowKt.first(acceptableScrim.settledScrimState, new RealAppConfigManager$update$2$2(scrimScreen, null, 10), this);
                    if (first != obj8) {
                        first = Unit.INSTANCE;
                    }
                    if (first == obj8) {
                        return obj8;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AccountDocumentsPresenter accountDocumentsPresenter = (AccountDocumentsPresenter) this.L$0;
                    DocumentsScreen documentsScreen = accountDocumentsPresenter.args;
                    RealDocumentEntitiesMapper realDocumentEntitiesMapper = accountDocumentsPresenter.documentEntitiesMapper;
                    AndroidStringManager androidStringManager = accountDocumentsPresenter.stringManager;
                    RealWagesTaxDocumentManager realWagesTaxDocumentManager2 = accountDocumentsPresenter.wagesTaxDocumentManager;
                    EglCore eglCore2 = accountDocumentsPresenter.savingsTaxDocumentManager;
                    FeatureFlagManager featureFlagManager2 = accountDocumentsPresenter.featureFlagManager;
                    String title = accountDocumentsPresenter.title(documentsScreen);
                    if (documentsScreen instanceof DocumentsScreen.DocumentsScreenCategory) {
                        String str3 = ((DocumentsScreen.DocumentsScreenCategory) documentsScreen).categoryId;
                        RealDocumentsManager realDocumentsManager = accountDocumentsPresenter.documentsManager;
                        CoroutineContext coroutineContext = realDocumentsManager.ioDispatcher;
                        final InstrumentQueries instrumentQueries = realDocumentsManager.categoryQueries;
                        RealFeatureEligibilityRepository realFeatureEligibilityRepository = accountDocumentsPresenter.featureEligibilityRepository;
                        MarkwonConfiguration markwonConfiguration = accountDocumentsPresenter.accountStatementManager;
                        AccountStatementsManager$AccountStatementsInfo.NoAccounts noAccounts = AccountStatementsManager$AccountStatementsInfo.NoAccounts.INSTANCE;
                        if (str3 == null) {
                            eglCore = eglCore2;
                            featureFlagManager = featureFlagManager2;
                            realWagesTaxDocumentManager = realWagesTaxDocumentManager2;
                            i = 10;
                            appLockMonitor$special$$inlined$map$22 = new RealContactRepository$contacts$$inlined$map$1(markwonConfiguration.customerStatementTypeDetails(StatementType.ACCOUNT_GENERAL_STATEMENT), i);
                        } else {
                            eglCore = eglCore2;
                            featureFlagManager = featureFlagManager2;
                            realWagesTaxDocumentManager = realWagesTaxDocumentManager2;
                            i = 10;
                            appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(noAccounts, 19);
                        }
                        Flow flow = appLockMonitor$special$$inlined$map$22;
                        Flow realContactRepository$contacts$$inlined$map$1 = str3 == null ? new RealContactRepository$contacts$$inlined$map$1(markwonConfiguration.customerStatementTypeDetails(StatementType.SAVINGS_STATEMENT), i) : new AppLockMonitor$special$$inlined$map$2(noAccounts, 19);
                        Flow realContactRepository$contacts$$inlined$map$12 = str3 == null ? new RealContactRepository$contacts$$inlined$map$1(eglCore.getTaxDocuments(), 1) : new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                        Flow realContactRepository$contacts$$inlined$map$13 = str3 == null ? new RealContactRepository$contacts$$inlined$map$1(markwonConfiguration.customerStatementTypeDetails(StatementType.PAY_OVER_TIME_STATEMENT), 10) : new AppLockMonitor$special$$inlined$map$2(noAccounts, 19);
                        if (str3 == null) {
                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$CardFeeStatements.INSTANCE)).enabled()) {
                                appLockMonitor$special$$inlined$map$23 = new RealContactRepository$contacts$$inlined$map$1(markwonConfiguration.customerStatementTypeDetails(StatementType.CARD_FEES_SUMMARY_STATEMENT), 10);
                                Flow flow2 = appLockMonitor$special$$inlined$map$23;
                                if (str3 == null) {
                                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$AfterpayStatementDocuments.INSTANCE)).enabled()) {
                                        appLockMonitor$special$$inlined$map$24 = new SafeFlow(new RealProfileManager$setPhoto$2(accountDocumentsPresenter.afterpayStatementManager, null));
                                        if (str3 == null) {
                                            MetadataRepo metadataRepo = accountDocumentsPresenter.legalDocumentManager;
                                            SqlDriver sqlDriver = ((SessionQueries) metadataRepo.mTypeface).driver;
                                            ProfileQueries$$ExternalSyntheticLambda4 profileQueries$$ExternalSyntheticLambda4 = new ProfileQueries$$ExternalSyntheticLambda4(28);
                                            sqlDriver.getClass();
                                            appLockMonitor$special$$inlined$map$25 = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-693905651, new String[]{"LegalDocument"}, sqlDriver, "LegalDocument.sq", "hasDocuments", "SELECT count(*) > 0\nFROM LegalDocument", profileQueries$$ExternalSyntheticLambda4)), (CoroutineContext) metadataRepo.mRootNode));
                                        } else {
                                            appLockMonitor$special$$inlined$map$25 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                        }
                                        if (str3 == null) {
                                            appLockMonitor$special$$inlined$map$26 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_TAXES}), accountDocumentsPresenter, 5);
                                            i2 = 19;
                                        } else {
                                            i2 = 19;
                                            appLockMonitor$special$$inlined$map$26 = new AppLockMonitor$special$$inlined$map$2(null, 19);
                                        }
                                        Flow flow3 = appLockMonitor$special$$inlined$map$26;
                                        if (str3 == null) {
                                            mapToOneOrDefault = new AppLockMonitor$special$$inlined$map$2(title, i2);
                                        } else {
                                            title.getClass();
                                            instrumentQueries.getClass();
                                            mapToOneOrDefault = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str3, new ProfileQueries$$ExternalSyntheticLambda4(23))), title, coroutineContext);
                                        }
                                        Flow flow4 = mapToOneOrDefault;
                                        if (str3 == null) {
                                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AllowSlices.INSTANCE)).enabled()) {
                                                appLockMonitor$special$$inlined$map$27 = new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_STOCK});
                                                Flow flow5 = appLockMonitor$special$$inlined$map$27;
                                                Flow appLockMonitor$special$$inlined$map$29 = (str3 == null || !accountDocumentsPresenter.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN)) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_BTC});
                                                if (str3 == null) {
                                                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$WorkApplet.INSTANCE)).enabled()) {
                                                        appLockMonitor$special$$inlined$map$28 = new AssignedJobProviderKt$jobs$$inlined$map$1(realWagesTaxDocumentManager.getWagesDocumentsByEmployer(), 4);
                                                        Flow flow6 = appLockMonitor$special$$inlined$map$28;
                                                        String str4 = str3 == null ? Logger.ROOT_LOGGER_NAME : str3;
                                                        instrumentQueries.getClass();
                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                        final int i26 = 0;
                                                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str4, new Function1(instrumentQueries, i26) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                                            public final /* synthetic */ int $r8$classId;
                                                            public final /* synthetic */ InstrumentQueries f$1;

                                                            {
                                                                this.$r8$classId = i26;
                                                                switch (i26) {
                                                                    case 1:
                                                                        break;
                                                                    default:
                                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                        break;
                                                                }
                                                            }

                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj9) {
                                                                Integer num;
                                                                int i27 = this.$r8$classId;
                                                                InstrumentQueries instrumentQueries2 = this.f$1;
                                                                switch (i27) {
                                                                    case 0:
                                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                                        String string2 = androidCursor.getString(1);
                                                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                                        String string3 = androidCursor.getString(3);
                                                                        string3.getClass();
                                                                        Long l = androidCursor.getLong(4);
                                                                        if (l != null) {
                                                                            long longValue = l.longValue();
                                                                            ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).getClass();
                                                                            num = Integer.valueOf((int) longValue);
                                                                        } else {
                                                                            num = null;
                                                                        }
                                                                        Long l2 = androidCursor.getLong(5);
                                                                        String string4 = androidCursor.getString(6);
                                                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                                        ?? bytes = androidCursor.getBytes(7);
                                                                        return documentCategoryQueries$selectForParentId$22.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                                    default:
                                                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                                        androidCursor2.getClass();
                                                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter);
                                                                }
                                                            }
                                                        }, 2)), coroutineContext), realDocumentsManager, 27);
                                                        String str5 = androidStringManager.get(R.string.documents_documents_header);
                                                        str5.getClass();
                                                        String str6 = str3 == null ? Logger.ROOT_LOGGER_NAME : str3;
                                                        instrumentQueries.getClass();
                                                        final int i27 = 1;
                                                        FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault2 = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str6, new Function1(instrumentQueries, i27) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                                            public final /* synthetic */ int $r8$classId;
                                                            public final /* synthetic */ InstrumentQueries f$1;

                                                            {
                                                                this.$r8$classId = i27;
                                                                switch (i27) {
                                                                    case 1:
                                                                        break;
                                                                    default:
                                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                        break;
                                                                }
                                                            }

                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj9) {
                                                                Integer num;
                                                                int i272 = this.$r8$classId;
                                                                InstrumentQueries instrumentQueries2 = this.f$1;
                                                                switch (i272) {
                                                                    case 0:
                                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                                        String string2 = androidCursor.getString(1);
                                                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                                        String string3 = androidCursor.getString(3);
                                                                        string3.getClass();
                                                                        Long l = androidCursor.getLong(4);
                                                                        if (l != null) {
                                                                            long longValue = l.longValue();
                                                                            ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).getClass();
                                                                            num = Integer.valueOf((int) longValue);
                                                                        } else {
                                                                            num = null;
                                                                        }
                                                                        Long l2 = androidCursor.getLong(5);
                                                                        String string4 = androidCursor.getString(6);
                                                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                                        ?? bytes = androidCursor.getBytes(7);
                                                                        return documentCategoryQueries$selectForParentId$22.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                                    default:
                                                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                                        androidCursor2.getClass();
                                                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries2.instrumentAdapter).client_scenarioAdapter);
                                                                }
                                                            }
                                                        }, i27)), DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST, coroutineContext);
                                                        InstrumentQueries instrumentQueries2 = realDocumentsManager.documentQueries;
                                                        if (str3 == null) {
                                                            str3 = Logger.ROOT_LOGGER_NAME;
                                                        }
                                                        instrumentQueries2.getClass();
                                                        DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$2 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                                                        multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(StateFlowKt.combine(flow, realContactRepository$contacts$$inlined$map$1, realContactRepository$contacts$$inlined$map$12, realContactRepository$contacts$$inlined$map$13, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$25, realTransferManager$addCash$$inlined$map$1, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrDefault2, DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries2, str3, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries2, 1))), coroutineContext), new FlowExtensionsKt$doOnFirst$2(str5, realDocumentsManager, null, 4), 0), flow4, flow3, flow5, appLockMonitor$special$$inlined$map$29, flow2, flow6, AccountDocumentsPresenter$documentCategoryViewModel$3.INSTANCE)), accountDocumentsPresenter, 6);
                                                    }
                                                }
                                                appLockMonitor$special$$inlined$map$28 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                                Flow flow62 = appLockMonitor$special$$inlined$map$28;
                                                if (str3 == null) {
                                                }
                                                instrumentQueries.getClass();
                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                final int i262 = 0;
                                                RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$12 = new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str4, new Function1(instrumentQueries, i262) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                                    public final /* synthetic */ int $r8$classId;
                                                    public final /* synthetic */ InstrumentQueries f$1;

                                                    {
                                                        this.$r8$classId = i262;
                                                        switch (i262) {
                                                            case 1:
                                                                break;
                                                            default:
                                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                break;
                                                        }
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj9) {
                                                        Integer num;
                                                        int i272 = this.$r8$classId;
                                                        InstrumentQueries instrumentQueries22 = this.f$1;
                                                        switch (i272) {
                                                            case 0:
                                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                                String string2 = androidCursor.getString(1);
                                                                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                                String string3 = androidCursor.getString(3);
                                                                string3.getClass();
                                                                Long l = androidCursor.getLong(4);
                                                                if (l != null) {
                                                                    long longValue = l.longValue();
                                                                    ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).getClass();
                                                                    num = Integer.valueOf((int) longValue);
                                                                } else {
                                                                    num = null;
                                                                }
                                                                Long l2 = androidCursor.getLong(5);
                                                                String string4 = androidCursor.getString(6);
                                                                DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                                ?? bytes = androidCursor.getBytes(7);
                                                                return documentCategoryQueries$selectForParentId$222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                            default:
                                                                AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                                androidCursor2.getClass();
                                                                return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter);
                                                        }
                                                    }
                                                }, 2)), coroutineContext), realDocumentsManager, 27);
                                                String str52 = androidStringManager.get(R.string.documents_documents_header);
                                                str52.getClass();
                                                if (str3 == null) {
                                                }
                                                instrumentQueries.getClass();
                                                final int i272 = 1;
                                                FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault22 = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str6, new Function1(instrumentQueries, i272) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                                    public final /* synthetic */ int $r8$classId;
                                                    public final /* synthetic */ InstrumentQueries f$1;

                                                    {
                                                        this.$r8$classId = i272;
                                                        switch (i272) {
                                                            case 1:
                                                                break;
                                                            default:
                                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                break;
                                                        }
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj9) {
                                                        Integer num;
                                                        int i2722 = this.$r8$classId;
                                                        InstrumentQueries instrumentQueries22 = this.f$1;
                                                        switch (i2722) {
                                                            case 0:
                                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                                AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                                String string2 = androidCursor.getString(1);
                                                                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                                String string3 = androidCursor.getString(3);
                                                                string3.getClass();
                                                                Long l = androidCursor.getLong(4);
                                                                if (l != null) {
                                                                    long longValue = l.longValue();
                                                                    ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).getClass();
                                                                    num = Integer.valueOf((int) longValue);
                                                                } else {
                                                                    num = null;
                                                                }
                                                                Long l2 = androidCursor.getLong(5);
                                                                String string4 = androidCursor.getString(6);
                                                                DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                                ?? bytes = androidCursor.getBytes(7);
                                                                return documentCategoryQueries$selectForParentId$222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                            default:
                                                                AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                                androidCursor2.getClass();
                                                                return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries22.instrumentAdapter).client_scenarioAdapter);
                                                        }
                                                    }
                                                }, i272)), DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST, coroutineContext);
                                                InstrumentQueries instrumentQueries22 = realDocumentsManager.documentQueries;
                                                if (str3 == null) {
                                                }
                                                instrumentQueries22.getClass();
                                                DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$22 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                                                multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(StateFlowKt.combine(flow, realContactRepository$contacts$$inlined$map$1, realContactRepository$contacts$$inlined$map$12, realContactRepository$contacts$$inlined$map$13, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$25, realTransferManager$addCash$$inlined$map$12, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrDefault22, DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries22, str3, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries22, 1))), coroutineContext), new FlowExtensionsKt$doOnFirst$2(str52, realDocumentsManager, null, 4), 0), flow4, flow3, flow5, appLockMonitor$special$$inlined$map$29, flow2, flow62, AccountDocumentsPresenter$documentCategoryViewModel$3.INSTANCE)), accountDocumentsPresenter, 6);
                                            }
                                        }
                                        appLockMonitor$special$$inlined$map$27 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                        Flow flow52 = appLockMonitor$special$$inlined$map$27;
                                        Flow appLockMonitor$special$$inlined$map$292 = (str3 == null || !accountDocumentsPresenter.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN)) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_BTC});
                                        if (str3 == null) {
                                        }
                                        appLockMonitor$special$$inlined$map$28 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                        Flow flow622 = appLockMonitor$special$$inlined$map$28;
                                        if (str3 == null) {
                                        }
                                        instrumentQueries.getClass();
                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                        final int i2622 = 0;
                                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$122 = new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str4, new Function1(instrumentQueries, i2622) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                            public final /* synthetic */ int $r8$classId;
                                            public final /* synthetic */ InstrumentQueries f$1;

                                            {
                                                this.$r8$classId = i2622;
                                                switch (i2622) {
                                                    case 1:
                                                        break;
                                                    default:
                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                        break;
                                                }
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj9) {
                                                Integer num;
                                                int i2722 = this.$r8$classId;
                                                InstrumentQueries instrumentQueries222 = this.f$1;
                                                switch (i2722) {
                                                    case 0:
                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                        String string2 = androidCursor.getString(1);
                                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                        String string3 = androidCursor.getString(3);
                                                        string3.getClass();
                                                        Long l = androidCursor.getLong(4);
                                                        if (l != null) {
                                                            long longValue = l.longValue();
                                                            ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).getClass();
                                                            num = Integer.valueOf((int) longValue);
                                                        } else {
                                                            num = null;
                                                        }
                                                        Long l2 = androidCursor.getLong(5);
                                                        String string4 = androidCursor.getString(6);
                                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                        ?? bytes = androidCursor.getBytes(7);
                                                        return documentCategoryQueries$selectForParentId$2222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                    default:
                                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                        androidCursor2.getClass();
                                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).client_scenarioAdapter);
                                                }
                                            }
                                        }, 2)), coroutineContext), realDocumentsManager, 27);
                                        String str522 = androidStringManager.get(R.string.documents_documents_header);
                                        str522.getClass();
                                        if (str3 == null) {
                                        }
                                        instrumentQueries.getClass();
                                        final int i2722 = 1;
                                        FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault222 = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str6, new Function1(instrumentQueries, i2722) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                            public final /* synthetic */ int $r8$classId;
                                            public final /* synthetic */ InstrumentQueries f$1;

                                            {
                                                this.$r8$classId = i2722;
                                                switch (i2722) {
                                                    case 1:
                                                        break;
                                                    default:
                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                        break;
                                                }
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj9) {
                                                Integer num;
                                                int i27222 = this.$r8$classId;
                                                InstrumentQueries instrumentQueries222 = this.f$1;
                                                switch (i27222) {
                                                    case 0:
                                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                        String string2 = androidCursor.getString(1);
                                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                        String string3 = androidCursor.getString(3);
                                                        string3.getClass();
                                                        Long l = androidCursor.getLong(4);
                                                        if (l != null) {
                                                            long longValue = l.longValue();
                                                            ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).getClass();
                                                            num = Integer.valueOf((int) longValue);
                                                        } else {
                                                            num = null;
                                                        }
                                                        Long l2 = androidCursor.getLong(5);
                                                        String string4 = androidCursor.getString(6);
                                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                        ?? bytes = androidCursor.getBytes(7);
                                                        return documentCategoryQueries$selectForParentId$2222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                                    default:
                                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                        androidCursor2.getClass();
                                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries222.instrumentAdapter).client_scenarioAdapter);
                                                }
                                            }
                                        }, i2722)), DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST, coroutineContext);
                                        InstrumentQueries instrumentQueries222 = realDocumentsManager.documentQueries;
                                        if (str3 == null) {
                                        }
                                        instrumentQueries222.getClass();
                                        DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$222 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                                        multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(StateFlowKt.combine(flow, realContactRepository$contacts$$inlined$map$1, realContactRepository$contacts$$inlined$map$12, realContactRepository$contacts$$inlined$map$13, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$25, realTransferManager$addCash$$inlined$map$122, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrDefault222, DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries222, str3, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries222, 1))), coroutineContext), new FlowExtensionsKt$doOnFirst$2(str522, realDocumentsManager, null, 4), 0), flow4, flow3, flow52, appLockMonitor$special$$inlined$map$292, flow2, flow622, AccountDocumentsPresenter$documentCategoryViewModel$3.INSTANCE)), accountDocumentsPresenter, 6);
                                    }
                                }
                                appLockMonitor$special$$inlined$map$24 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                if (str3 == null) {
                                }
                                if (str3 == null) {
                                }
                                Flow flow32 = appLockMonitor$special$$inlined$map$26;
                                if (str3 == null) {
                                }
                                Flow flow42 = mapToOneOrDefault;
                                if (str3 == null) {
                                }
                                appLockMonitor$special$$inlined$map$27 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                Flow flow522 = appLockMonitor$special$$inlined$map$27;
                                Flow appLockMonitor$special$$inlined$map$2922 = (str3 == null || !accountDocumentsPresenter.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN)) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_BTC});
                                if (str3 == null) {
                                }
                                appLockMonitor$special$$inlined$map$28 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                                Flow flow6222 = appLockMonitor$special$$inlined$map$28;
                                if (str3 == null) {
                                }
                                instrumentQueries.getClass();
                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$2222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                final int i26222 = 0;
                                RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1222 = new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str4, new Function1(instrumentQueries, i26222) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                    public final /* synthetic */ int $r8$classId;
                                    public final /* synthetic */ InstrumentQueries f$1;

                                    {
                                        this.$r8$classId = i26222;
                                        switch (i26222) {
                                            case 1:
                                                break;
                                            default:
                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                break;
                                        }
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        Integer num;
                                        int i27222 = this.$r8$classId;
                                        InstrumentQueries instrumentQueries2222 = this.f$1;
                                        switch (i27222) {
                                            case 0:
                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                String string2 = androidCursor.getString(1);
                                                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                String string3 = androidCursor.getString(3);
                                                string3.getClass();
                                                Long l = androidCursor.getLong(4);
                                                if (l != null) {
                                                    long longValue = l.longValue();
                                                    ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).getClass();
                                                    num = Integer.valueOf((int) longValue);
                                                } else {
                                                    num = null;
                                                }
                                                Long l2 = androidCursor.getLong(5);
                                                String string4 = androidCursor.getString(6);
                                                DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                ?? bytes = androidCursor.getBytes(7);
                                                return documentCategoryQueries$selectForParentId$22222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                            default:
                                                AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                androidCursor2.getClass();
                                                return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).client_scenarioAdapter);
                                        }
                                    }
                                }, 2)), coroutineContext), realDocumentsManager, 27);
                                String str5222 = androidStringManager.get(R.string.documents_documents_header);
                                str5222.getClass();
                                if (str3 == null) {
                                }
                                instrumentQueries.getClass();
                                final int i27222 = 1;
                                FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault2222 = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str6, new Function1(instrumentQueries, i27222) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                                    public final /* synthetic */ int $r8$classId;
                                    public final /* synthetic */ InstrumentQueries f$1;

                                    {
                                        this.$r8$classId = i27222;
                                        switch (i27222) {
                                            case 1:
                                                break;
                                            default:
                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                break;
                                        }
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        Integer num;
                                        int i272222 = this.$r8$classId;
                                        InstrumentQueries instrumentQueries2222 = this.f$1;
                                        switch (i272222) {
                                            case 0:
                                                DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                                AndroidCursor androidCursor = (AndroidCursor) obj9;
                                                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                                String string2 = androidCursor.getString(1);
                                                String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                                String string3 = androidCursor.getString(3);
                                                string3.getClass();
                                                Long l = androidCursor.getLong(4);
                                                if (l != null) {
                                                    long longValue = l.longValue();
                                                    ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).getClass();
                                                    num = Integer.valueOf((int) longValue);
                                                } else {
                                                    num = null;
                                                }
                                                Long l2 = androidCursor.getLong(5);
                                                String string4 = androidCursor.getString(6);
                                                DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                                ?? bytes = androidCursor.getBytes(7);
                                                return documentCategoryQueries$selectForParentId$22222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                            default:
                                                AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                                androidCursor2.getClass();
                                                return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries2222.instrumentAdapter).client_scenarioAdapter);
                                        }
                                    }
                                }, i27222)), DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST, coroutineContext);
                                InstrumentQueries instrumentQueries2222 = realDocumentsManager.documentQueries;
                                if (str3 == null) {
                                }
                                instrumentQueries2222.getClass();
                                DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$2222 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                                multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(StateFlowKt.combine(flow, realContactRepository$contacts$$inlined$map$1, realContactRepository$contacts$$inlined$map$12, realContactRepository$contacts$$inlined$map$13, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$25, realTransferManager$addCash$$inlined$map$1222, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrDefault2222, DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries2222, str3, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries2222, 1))), coroutineContext), new FlowExtensionsKt$doOnFirst$2(str5222, realDocumentsManager, null, 4), 0), flow42, flow32, flow522, appLockMonitor$special$$inlined$map$2922, flow2, flow6222, AccountDocumentsPresenter$documentCategoryViewModel$3.INSTANCE)), accountDocumentsPresenter, 6);
                            }
                        }
                        appLockMonitor$special$$inlined$map$23 = new AppLockMonitor$special$$inlined$map$2(noAccounts, 19);
                        Flow flow22 = appLockMonitor$special$$inlined$map$23;
                        if (str3 == null) {
                        }
                        appLockMonitor$special$$inlined$map$24 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                        if (str3 == null) {
                        }
                        if (str3 == null) {
                        }
                        Flow flow322 = appLockMonitor$special$$inlined$map$26;
                        if (str3 == null) {
                        }
                        Flow flow422 = mapToOneOrDefault;
                        if (str3 == null) {
                        }
                        appLockMonitor$special$$inlined$map$27 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                        Flow flow5222 = appLockMonitor$special$$inlined$map$27;
                        Flow appLockMonitor$special$$inlined$map$29222 = (str3 == null || !accountDocumentsPresenter.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN)) ? new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19) : new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DOCUMENTS_BTC});
                        if (str3 == null) {
                        }
                        appLockMonitor$special$$inlined$map$28 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                        Flow flow62222 = appLockMonitor$special$$inlined$map$28;
                        if (str3 == null) {
                        }
                        instrumentQueries.getClass();
                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$22222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                        final int i262222 = 0;
                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$12222 = new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str4, new Function1(instrumentQueries, i262222) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ InstrumentQueries f$1;

                            {
                                this.$r8$classId = i262222;
                                switch (i262222) {
                                    case 1:
                                        break;
                                    default:
                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                        break;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                Integer num;
                                int i272222 = this.$r8$classId;
                                InstrumentQueries instrumentQueries22222 = this.f$1;
                                switch (i272222) {
                                    case 0:
                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                        String string2 = androidCursor.getString(1);
                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                        String string3 = androidCursor.getString(3);
                                        string3.getClass();
                                        Long l = androidCursor.getLong(4);
                                        if (l != null) {
                                            long longValue = l.longValue();
                                            ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).getClass();
                                            num = Integer.valueOf((int) longValue);
                                        } else {
                                            num = null;
                                        }
                                        Long l2 = androidCursor.getLong(5);
                                        String string4 = androidCursor.getString(6);
                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                        ?? bytes = androidCursor.getBytes(7);
                                        return documentCategoryQueries$selectForParentId$222222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                    default:
                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                        androidCursor2.getClass();
                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).client_scenarioAdapter);
                                }
                            }
                        }, 2)), coroutineContext), realDocumentsManager, 27);
                        String str52222 = androidStringManager.get(R.string.documents_documents_header);
                        str52222.getClass();
                        if (str3 == null) {
                        }
                        instrumentQueries.getClass();
                        final int i272222 = 1;
                        FlowUtil$createFlow$$inlined$map$1 mapToOneOrDefault22222 = DBUtil.mapToOneOrDefault(DBUtil.toFlow(new DocumentCategoryQueries$NameQuery(instrumentQueries, str6, new Function1(instrumentQueries, i272222) { // from class: com.squareup.cash.db2.profile.documents.DocumentCategoryQueries$$ExternalSyntheticLambda5
                            public final /* synthetic */ int $r8$classId;
                            public final /* synthetic */ InstrumentQueries f$1;

                            {
                                this.$r8$classId = i272222;
                                switch (i272222) {
                                    case 1:
                                        break;
                                    default:
                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                        break;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r12v2, types: [byte[], java.io.Serializable] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                Integer num;
                                int i2722222 = this.$r8$classId;
                                InstrumentQueries instrumentQueries22222 = this.f$1;
                                switch (i2722222) {
                                    case 0:
                                        DocumentCategoryQueries$selectForParentId$2 documentCategoryQueries$selectForParentId$222222 = DocumentCategoryQueries$selectForParentId$2.INSTANCE;
                                        AndroidCursor androidCursor = (AndroidCursor) obj9;
                                        String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0);
                                        String string2 = androidCursor.getString(1);
                                        String m = Matcher$$ExternalSyntheticOutline0.m(string2, androidCursor, 2);
                                        String string3 = androidCursor.getString(3);
                                        string3.getClass();
                                        Long l = androidCursor.getLong(4);
                                        if (l != null) {
                                            long longValue = l.longValue();
                                            ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).getClass();
                                            num = Integer.valueOf((int) longValue);
                                        } else {
                                            num = null;
                                        }
                                        Long l2 = androidCursor.getLong(5);
                                        String string4 = androidCursor.getString(6);
                                        DocumentCategoryEntity.RenderStyle renderStyle = string4 != null ? (DocumentCategoryEntity.RenderStyle) ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).client_scenarioAdapter.decode(string4) : null;
                                        ?? bytes = androidCursor.getBytes(7);
                                        return documentCategoryQueries$selectForParentId$222222.invoke(m1431m, string2, m, string3, num, l2, renderStyle, bytes != 0 ? (VersionData) ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).scenario_planAdapter.decode(bytes) : null);
                                    default:
                                        AndroidCursor androidCursor2 = (AndroidCursor) obj9;
                                        androidCursor2.getClass();
                                        return (DocumentCategoryEntity.RenderStyle) NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 0, ((ScenarioPlan.Adapter) instrumentQueries22222.instrumentAdapter).client_scenarioAdapter);
                                }
                            }
                        }, i272222)), DocumentCategoryEntity.RenderStyle.REVERSE_CHRONO_LIST, coroutineContext);
                        InstrumentQueries instrumentQueries22222 = realDocumentsManager.documentQueries;
                        if (str3 == null) {
                        }
                        instrumentQueries22222.getClass();
                        DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$22222 = DocumentQueries$selectForCategoryId$2.INSTANCE;
                        multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChanged(StateFlowKt.combine(flow, realContactRepository$contacts$$inlined$map$1, realContactRepository$contacts$$inlined$map$12, realContactRepository$contacts$$inlined$map$13, appLockMonitor$special$$inlined$map$24, appLockMonitor$special$$inlined$map$25, realTransferManager$addCash$$inlined$map$12222, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToOneOrDefault22222, DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries22222, str3, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries22222, 1))), coroutineContext), new FlowExtensionsKt$doOnFirst$2(str52222, realDocumentsManager, null, 4), 0), flow422, flow322, flow5222, appLockMonitor$special$$inlined$map$29222, flow22, flow62222, AccountDocumentsPresenter$documentCategoryViewModel$3.INSTANCE)), accountDocumentsPresenter, 6);
                    } else if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE)) {
                        boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
                        String str7 = LegalUrl.InvestingDisclosures;
                        ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str7, "url", str7);
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.documents_type_stock_disclosure)).format(m);
                        format2.getClass();
                        ToolbarTuckTargets toolbarTuckTargets = accountDocumentsPresenter.documentsDisclosureTextProvider;
                        multiStatementAccountViewModel = new InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1(new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(((CashAccountDatabaseImpl) toolbarTuckTargets.startCornerCenterX$delegate).investingSettingsQueries.select$2()), (CoroutineContext) toolbarTuckTargets.endCornerCenterX$delegate), 15), enabled, format2, accountDocumentsPresenter, title);
                    } else if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE)) {
                        com.squareup.protos.franklin.investing.resources.StatementType statementType = AccountDocumentsPresenter.toStatementType(documentsScreen);
                        multiStatementAccountViewModel = new RealActivityInvitePresenter(2, new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realDocumentEntitiesMapper.documentsForCategory(statementType), 26), accountDocumentsPresenter, 10), title, statementType);
                    } else {
                        if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE)) {
                            com.squareup.protos.franklin.investing.resources.StatementType statementType2 = AccountDocumentsPresenter.toStatementType(documentsScreen);
                            RealActivityInvitePresenter realActivityInvitePresenter2 = new RealActivityInvitePresenter(2, new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realDocumentEntitiesMapper.documentsForCategory(statementType2), 26), accountDocumentsPresenter, 10), title, statementType2);
                            ToolbarTuckTargets toolbarTuckTargets2 = accountDocumentsPresenter.bitcoinTaxesEntryPointDataProvider;
                            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) toolbarTuckTargets2.endCornerCenterX$delegate)).currentValue(AmplitudeExperiments$FpBitcoinTaxesTofWidget.INSTANCE)).enabled()) {
                                continuation = null;
                                appLockMonitor$special$$inlined$map$2 = new SafeFlow(new TaxWebAppBridge.AnonymousClass4(toolbarTuckTargets2, null));
                            } else {
                                continuation = null;
                                appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, 19);
                            }
                            int i28 = 0;
                            realActivityInvitePresenter = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realActivityInvitePresenter2, appLockMonitor$special$$inlined$map$2, new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1(accountDocumentsPresenter, continuation, i28), i28);
                        } else {
                            Continuation continuation7 = null;
                            if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE)) {
                                realActivityInvitePresenter = new RealActivityInvitePresenter(1, eglCore2.getTaxDocuments(), title, accountDocumentsPresenter);
                            } else if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE)) {
                                realActivityInvitePresenter = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realDocumentEntitiesMapper.documentsForCategory(AccountDocumentsPresenter.toStatementType(documentsScreen)), 25), accountDocumentsPresenter, 8), title, 9);
                            } else if (documentsScreen instanceof DocumentsScreen.DocumentsScreenStockMonthlyForMonth) {
                                int i29 = ((DocumentsScreen.DocumentsScreenStockMonthlyForMonth) documentsScreen).targetYear;
                                multiStatementAccountViewModel = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new ScheduleCalendarKt$ScheduleCalendar$2$3$1$invokeSuspend$$inlined$map$1(new PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realDocumentEntitiesMapper.documentsForCategory(AccountDocumentsPresenter.toStatementType(documentsScreen)), 24), i29, 1), i29, accountDocumentsPresenter), title, 7);
                            } else if (documentsScreen instanceof DocumentsScreen.DocumentsScreenStatements) {
                                DocumentsScreen.DocumentsScreenStatements documentsScreenStatements = (DocumentsScreen.DocumentsScreenStatements) documentsScreen;
                                multiStatementAccountViewModel = new SafeFlow(new RealImageLoader$execute$result$1(accountDocumentsPresenter, documentsScreenStatements.customerToken, documentsScreenStatements.statementType, continuation7, 24));
                            } else if (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiStatementAccount) {
                                multiStatementAccountViewModel = accountDocumentsPresenter.multiStatementAccountViewModel(StatementType.ACCOUNT_GENERAL_STATEMENT);
                            } else if (documentsScreen instanceof DocumentsScreen.DocumentsScreenMultiSavingsAccount) {
                                multiStatementAccountViewModel = accountDocumentsPresenter.multiStatementAccountViewModel(StatementType.SAVINGS_STATEMENT);
                            } else {
                                if (documentsScreen instanceof DocumentsScreen.DocumentsScreenLegalDocument) {
                                    safeFlow = new SafeFlow(new AccountDocumentsPresenter$legalDocumentViewModel$1(accountDocumentsPresenter, title, continuation7, 0));
                                } else if (documentsScreen instanceof DocumentsScreen.DocumentScreenPayOverTimeDocuments) {
                                    multiStatementAccountViewModel = accountDocumentsPresenter.multiStatementAccountViewModel(StatementType.PAY_OVER_TIME_STATEMENT);
                                } else if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE)) {
                                    safeFlow = new SafeFlow(new AccountDocumentsPresenter$legalDocumentViewModel$1(accountDocumentsPresenter, title, continuation7, 1));
                                } else if (Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenCardFeesDocuments.INSTANCE)) {
                                    multiStatementAccountViewModel = accountDocumentsPresenter.multiStatementAccountViewModel(StatementType.CARD_FEES_SUMMARY_STATEMENT);
                                } else {
                                    if (!Intrinsics.areEqual(documentsScreen, DocumentsScreen.DocumentsScreenWages.INSTANCE)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    realActivityInvitePresenter = new RealActivityInvitePresenter(3, realWagesTaxDocumentManager2.getWagesDocumentsByEmployer(), title, accountDocumentsPresenter);
                                }
                                multiStatementAccountViewModel = safeFlow;
                            }
                        }
                        multiStatementAccountViewModel = realActivityInvitePresenter;
                    }
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(4, (MutableState) obj4);
                    this.label = 1;
                    if (multiStatementAccountViewModel.collect(anonymousClass1, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                return invokeSuspend$com$squareup$cash$activity$backend$ZiplineActivityItemFormatter$format$4(obj);
            case 17:
                ProducerScope producerScope3 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EditProfilePresenter$models$2$1 editProfilePresenter$models$2$1 = new EditProfilePresenter$models$2$1((RealActivitiesManager) obj4, producerScope3, continuation2, i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(editProfilePresenter$models$2$1, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                RealActivitiesManager realActivitiesManager = (RealActivitiesManager) this.L$0;
                GrpcMethod grpcMethod = realActivitiesManager.requestHandler;
                this.label = 1;
                grpcMethod.getClass();
                Object requestPage$suspendImpl = GrpcMethod.requestPage$suspendImpl(grpcMethod, realActivitiesManager.activityContext, (ActivitiesManager.ActivityPage.PageOffset) obj4, this);
                return requestPage$suspendImpl == coroutineSingletons16 ? coroutineSingletons16 : requestPage$suspendImpl;
            case 19:
                ProducerScope producerScope4 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EditProfilePresenter$models$2$1 editProfilePresenter$models$2$12 = new EditProfilePresenter$models$2$1((RealSingleActivityManager) obj4, producerScope4, continuation2, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(editProfilePresenter$models$2$12, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    n nVar = ((ActivityTabPresenter) this.L$0).promoterActivityMessageProvider;
                    this.label = 1;
                    Object withContext2 = JobKt.withContext((CoroutineContext) nVar.c, new MLKitTitleGenerator$prepareModel$1(nVar, (OnDemandMessageAnalyticsData) obj4, continuation2, i4), this);
                    if (withContext2 != obj9) {
                        withContext2 = Unit.INSTANCE;
                    }
                    if (withContext2 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i33 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow firstServerPages = activityTabPresenter.activitiesManager.firstServerPages();
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(i7, (Set) obj4, activityTabPresenter);
                    this.label = 1;
                    if (firstServerPages.collect(activityTabViewKt$ActivityTab$5$1$3, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj4;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (BalanceFeedPresenter$models$availableBalance$2$1$WhenMappings.$EnumSwitchMapping$0[((BalanceFeedScreen) cardStudioPresenter.args).balanceType.ordinal()] != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ChannelFlowTransformLatest select = ((RealBalanceSnapshotManager) cardStudioPresenter.analytics).select();
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$32 = new ActivityTabViewKt$ActivityTab$5$1$3(i5, produceStateScope, cardStudioPresenter);
                    this.L$0 = null;
                    this.label = 1;
                    if (select.collect(activityTabViewKt$ActivityTab$5$1$32, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (((RealActivityEmbeddedPresenter) this.L$0).refreshTrigger.emit((ActivityEmbeddedViewEvent) obj4, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) obj4;
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow activities = realActivityEmbeddedPresenter.activitiesManager.activities();
                    RealContactSync$syncRequest$2.AnonymousClass1 anonymousClass12 = new RealContactSync$syncRequest$2.AnonymousClass1(produceStateScope2, realActivityEmbeddedPresenter, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(activities, anonymousClass12, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityTabViewModel.ScrollToTop scrollToTop = ((ActivityTabViewModel) this.L$0).scrollToTopCounter;
                    if (scrollToTop.id > 0) {
                        LazyListState lazyListState = (LazyListState) obj4;
                        if (!scrollToTop.animate) {
                            this.label = 2;
                            WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                            break;
                        } else {
                            this.label = 1;
                            WorkLauncherImpl workLauncherImpl2 = LazyListState.Saver;
                            break;
                        }
                    }
                } else {
                    if (i38 != 1 && i38 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                return invokeSuspend$com$squareup$cash$activity$views$receipts$ReceiptScaffoldKt$ReceiptScaffold$showFooter$2$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$advertising$presenters$FullscreenAdPresenter$getAudioStatus$1$6(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$advertising$presenters$FullscreenAdPresenter$handleAppMessageAction$2(obj);
            default:
                AfterpayAppletTilePresenter afterpayAppletTilePresenter = (AfterpayAppletTilePresenter) this.L$0;
                MutableState mutableState = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((AfterpayAppletTileViewModel) mutableState.getValue()) instanceof AfterpayAppletTileViewModel.Installed) {
                        KeyValue keyValue = afterpayAppletTilePresenter.seenInstalledAfterpayAppletTile;
                        Boolean bool = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue.set(bool, this) == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((AfterpayAppletTileViewModel) mutableState.getValue()) instanceof AfterpayAppletTileViewModel.Installed.InstalledFailure) {
                    afterpayAppletTilePresenter.afterpayAppletAnalytics.trackErrorAnalyticEvent(AfterpayAppletScreen.ENTRYPOINT);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
