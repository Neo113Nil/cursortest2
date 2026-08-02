package coil3;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.collection.LruCache;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextFieldDelegateKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.DismissState;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SwipeableState$animateTo$2;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.ComposeNavigator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.backend.real.RealLocalOrderRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.brand.orders.LocalOrderStatusPresenter;
import app.cash.local.presenters.fulfillment.FulfillmentPickerPresenter;
import app.cash.local.presenters.sheet.EducationalSheetPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.LocalSchedulingDayTimePickerScreen;
import app.cash.local.screens.app.LocalScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ImageRequest;
import coil3.size.Size;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzla;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmc;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmd;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmz;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import com.squareup.cash.RealBugReportSender;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewEvent;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.ActivitiesCacheManagerKt$putForSingle$1;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.SingleActivity;
import com.squareup.cash.activity.backend.loader.SingleActivityCache$InMemory;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$avatarClicked$2;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.primitives.ActivityItemKey;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bugreporting.viewmodels.BugReport;
import com.squareup.cash.bugreporting.viewmodels.DiagnosticContext;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.profile.documents.AvailableAccountStatementQueries$selectAll$2;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NativeEnrichedReceipts;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.investing.presenters.TransferStockPresenter$models$3$1$2;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CreateBugReportResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse$Response$Quote;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import net.oneformapp.ProfileStore_;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealImageLoader$execute$result$1 extends SuspendLambda implements Function2 {
    public Object $cachedPlaceholder;
    public final /* synthetic */ Object $eventListener;
    public final /* synthetic */ int $r8$classId;
    public Object $request;
    public Object $size;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$result$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$request = obj;
        this.this$0 = obj2;
        this.$size = obj3;
        this.$eventListener = obj4;
        this.$cachedPlaceholder = obj5;
    }

    private final Object invokeSuspend$com$squareup$cash$account$presenters$ThemeSwitcherPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$request;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope, (LocalEditorialPresenter) this.$size, (MutableState) this.$eventListener, (ParcelableSnapshotMutableIntState) this.$cachedPlaceholder, 9);
            this.$request = null;
            this.label = 1;
            if (flow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$account$presenters$accountswitcher$AccountSwitcherPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.$request;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(coroutineScope, (PaymentLoadingPresenter) this.$size, (String) this.$eventListener, (State) this.$cachedPlaceholder, 7);
            this.$request = null;
            this.label = 1;
            if (flow.collect(swipeableState$animateTo$2, this) == coroutineSingletons) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        if (r0 == r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1.syncAvailableAccountStatements(r10, r4, r19) == r8) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$account$presenters$documents$AccountDocumentsPresenter$statementsViewModel$1(Object obj) {
        String str;
        StatementType statementType = (StatementType) this.$cachedPlaceholder;
        AccountDocumentsPresenter accountDocumentsPresenter = (AccountDocumentsPresenter) this.$size;
        MarkwonConfiguration markwonConfiguration = accountDocumentsPresenter.accountStatementManager;
        FlowCollector flowCollector = (FlowCollector) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String title = accountDocumentsPresenter.title(accountDocumentsPresenter.args);
            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(title, EmptyList.INSTANCE, (com.squareup.protos.franklin.investing.resources.StatementType) null, (String) null, 24);
            this.this$0 = flowCollector;
            this.$request = title;
            this.label = 1;
            if (flowCollector.emit(accountDocumentsViewModel, this) != coroutineSingletons) {
                str = title;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            str = (String) this.$request;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.$request;
            SafeTrace.throwOnFailure(obj);
            InstrumentQueries instrumentQueries = (InstrumentQueries) markwonConfiguration.imageDestinationProcessor;
            instrumentQueries.getClass();
            AvailableAccountStatementQueries$selectAll$2 availableAccountStatementQueries$selectAll$2 = AvailableAccountStatementQueries$selectAll$2.INSTANCE;
            SqlDriver sqlDriver = instrumentQueries.driver;
            OfflineQueries$$ExternalSyntheticLambda0 offlineQueries$$ExternalSyntheticLambda0 = new OfflineQueries$$ExternalSyntheticLambda0(instrumentQueries, (byte) 0, (char) (0 == true ? 1 : 0));
            sqlDriver.getClass();
            FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-466806593, new String[]{"availableAccountStatement"}, sqlDriver, "AvailableAccountStatement.sq", "selectAll", "SELECT availableAccountStatement.statement_token, availableAccountStatement.display_name, availableAccountStatement.statement_url, availableAccountStatement.statementCoverage FROM availableAccountStatement", offlineQueries$$ExternalSyntheticLambda0)), (CoroutineContext) markwonConfiguration.syntaxHighlight);
            String str2 = str;
            RealLocalInstalledStore$showGeoTab$$inlined$map$1$2 realLocalInstalledStore$showGeoTab$$inlined$map$1$2 = new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 13);
            this.this$0 = null;
            this.$request = null;
            this.label = 3;
            Object collect = mapToList.collect(new AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2(realLocalInstalledStore$showGeoTab$$inlined$map$1$2, statementType, accountDocumentsPresenter, str2, 1), this);
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
        }
        String str3 = (String) this.$eventListener;
        this.this$0 = flowCollector;
        this.$request = str;
        this.label = 2;
    }

    private final Object invokeSuspend$com$squareup$cash$activity$presenters$ActivityTabPresenter$models$12$1$1(Object obj) {
        String str = (String) this.$request;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            InputFieldText.Simple simple = new InputFieldText.Simple(str);
            ((MutableState) this.this$0).setValue(simple);
            ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) this.$size;
            MutableState mutableState = (MutableState) this.$eventListener;
            MutableState mutableState2 = (MutableState) this.$cachedPlaceholder;
            this.$request = null;
            this.label = 1;
            if (ActivityTabPresenter.access$models$applySearchQuery(activityTabPresenter, mutableState, mutableState2, simple, this) == coroutineSingletons) {
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

    private final Object invokeSuspend$com$squareup$cash$activity$presenters$ActivityTabPresenter$models$13$1(Object obj) {
        MutableState mutableState = (MutableState) this.$size;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Continuation continuation = null;
            AppLockMonitor$special$$inlined$map$2 debounceDuration = FlowKt.debounceDuration(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1((Flow) this.$request, 3), new TabContentPresenter$models$4$1$1$1((MutableState) this.this$0, continuation, 5), 3), new DateInputKt$$ExternalSyntheticLambda5(29, mutableState));
            zzmo zzmoVar = new zzmo((ActivityTabPresenter) this.$eventListener, mutableState, (MutableState) this.$cachedPlaceholder, continuation, 23);
            this.label = 1;
            if (FlowKt.collectLatest(debounceDuration, zzmoVar, this) == coroutineSingletons) {
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$itemClicked(r2, r0, (com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem) r3, r6, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0127, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$avatarClicked(r2, r0, (com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem) r3, r6, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$buttonClicked(r2, r3, r4, r10, r6, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$buttonClicked(r2, (com.squareup.cash.activity.viewmodels.ActivityItemViewModel) r9.$cachedPlaceholder, (com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem) r3, r10, r6, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$reactionSelected(r2, ((com.squareup.cash.activity.viewmodels.ActivityItemViewEvent.ReactionSelected) r1).reaction, (com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem) r3, r6, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r6)._channel.send(r9, r9) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r9 == r8) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$activity$presenters$DefaultActivityItemEventHandler$handleEvent$1(Object obj) {
        Object send;
        ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) this.$cachedPlaceholder;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler = (DefaultActivityItemEventHandler) this.$eventListener;
        ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) this.$size;
        ActivityItem activityItem = (ActivityItem) this.this$0;
        ProducerScope producerScope = (ProducerScope) this.$request;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                if (!(activityItem instanceof FormattedPaymentHistoryActivityItem)) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultActivityItemEventHandler only supports `FormattedPaymentHistoryActivityItem`s. Given item was ", Reflection.factory.getOrCreateKotlinClass(activityItem.getClass()).getSimpleName(), "."));
                    return null;
                }
                if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                    this.$request = null;
                    this.label = 1;
                    break;
                } else if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.AvatarClicked.INSTANCE)) {
                    this.$request = null;
                    this.label = 2;
                    break;
                } else if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.InlineButtonClicked.INSTANCE)) {
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) activityItem;
                    PaymentHistoryButton paymentHistoryButton = formattedPaymentHistoryActivityItem.getPaymentHistoryData().inline_button;
                    if (paymentHistoryButton != null) {
                        ActivityItemViewModel activityItemViewModel2 = (ActivityItemViewModel) this.$cachedPlaceholder;
                        this.$request = null;
                        this.label = 3;
                        break;
                    } else {
                        return Unit.INSTANCE;
                    }
                } else if (activityItemViewEvent instanceof ActivityItemViewEvent.PaymentHistoryButtonClicked) {
                    PaymentHistoryButton paymentHistoryButton2 = ((ActivityItemViewEvent.PaymentHistoryButtonClicked) activityItemViewEvent).button;
                    this.$request = null;
                    this.label = 4;
                    break;
                } else if (activityItemViewEvent instanceof ActivityItemViewEvent.ReactionSelected) {
                    this.$request = null;
                    this.label = 5;
                    break;
                } else if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ReactionSelectorDismissed.INSTANCE)) {
                    ActivityItemCallbackEvent.ShowReactionPicker showReactionPicker = new ActivityItemCallbackEvent.ShowReactionPicker(false);
                    this.$request = null;
                    this.label = 6;
                    break;
                } else {
                    if (!(activityItemViewEvent instanceof ActivityItemViewEvent.VisibilityChanged)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2 = (FormattedPaymentHistoryActivityItem) activityItem;
                    this.$request = null;
                    this.label = 7;
                    Set set = DefaultActivityItemEventHandler.InvestingItemTypes;
                    if (((ActivityItemViewEvent.VisibilityChanged) activityItemViewEvent).visibility == ActivityItemViewEvent.VisibilityChanged.Visibility.FullyVisible) {
                        if (formattedPaymentHistoryActivityItem2.isBadged()) {
                            StandaloneCoroutine launch$default = JobKt.launch$default(defaultActivityItemEventHandler.scope, null, null, new DefaultActivityItemEventHandler$avatarClicked$2(defaultActivityItemEventHandler, formattedPaymentHistoryActivityItem2, (Continuation) null), 3);
                            Job job = defaultActivityItemEventHandler.badgeClearingJob;
                            if (job != null) {
                                job.cancel(null);
                            }
                            defaultActivityItemEventHandler.badgeClearingJob = launch$default;
                        }
                        send = ((ProducerCoroutine) producerScope)._channel.send(ActivityItemCallbackEvent.AnalyticsEvent.ItemViewed, this);
                        if (send != coroutineSingletons) {
                            send = Unit.INSTANCE;
                            break;
                        }
                    } else {
                        Job job2 = defaultActivityItemEventHandler.badgeClearingJob;
                        if (job2 != null) {
                            job2.cancel(null);
                        }
                        defaultActivityItemEventHandler.badgeClearingJob = null;
                        send = Unit.INSTANCE;
                        break;
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r1)._channel.send(r14, r13) != r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler.access$setCachedActivityItem(r3, r2, r13) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (((com.squareup.cash.activity.backend.RealActivityAnalyticsService) r14).setTreehouseAnalyticsTokens(r13) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$activity$presenters$DefaultActivityItemEventHandler$itemClicked$2(Object obj) {
        HistoryScreens.PaymentReceipt paymentReceipt;
        SingleActivityCache$InMemory singleActivityCache$InMemory;
        ActivityItemViewModel activityItemViewModel = (ActivityItemViewModel) this.$cachedPlaceholder;
        ProducerScope producerScope = (ProducerScope) this.$eventListener;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) this.$size;
        DefaultActivityItemEventHandler defaultActivityItemEventHandler = (DefaultActivityItemEventHandler) this.this$0;
        Navigator navigator = defaultActivityItemEventHandler.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (IllegalArgumentException e) {
            Timber.Forest.w("Failed to set cached Activity item data", new Object[0], e);
        }
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) defaultActivityItemEventHandler.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$NativeEnrichedReceipts.INSTANCE);
            featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
            if (featureFlag$EnabledDisabledFeatureFlag$Options == FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled) {
                ActivityAnalyticsService activityAnalyticsService = defaultActivityItemEventHandler.activityAnalyticsService;
                this.label = 1;
            } else {
                ActivityItemGlobalId activityItemGlobalId = formattedPaymentHistoryActivityItem.getActivityItemGlobalId();
                ActivityItemPresentationContext activityItemPresentationContext = activityItemViewModel.presentationContext;
                HistoryScreens.PaymentReceipt paymentReceipt2 = new HistoryScreens.PaymentReceipt(new ActivityItemKey(activityItemGlobalId, activityItemPresentationContext.activityToken, activityItemPresentationContext.activityScope), (String) null, 6);
                ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent = ActivityItemCallbackEvent.AnalyticsEvent.ReceiptOpened;
                this.$request = paymentReceipt2;
                this.label = 4;
                if (((ProducerCoroutine) producerScope)._channel.send(analyticsEvent, this) != coroutineSingletons) {
                    paymentReceipt = paymentReceipt2;
                    RealActivitiesCacheManager realActivitiesCacheManager = defaultActivityItemEventHandler.activitiesCacheManager;
                    ActivityItemKey activityItemKey = paymentReceipt.activityItemKey;
                    ActivitiesCacheManagerKt$putForSingle$1 activitiesCacheManagerKt$putForSingle$1 = ActivitiesCacheManagerKt$putForSingle$1.INSTANCE;
                    activityItemKey.getClass();
                    LruCache lruCache = realActivitiesCacheManager.lruCacheSingle;
                    singleActivityCache$InMemory = (SingleActivityCache$InMemory) lruCache.get(activityItemKey);
                    if (singleActivityCache$InMemory == null) {
                    }
                    singleActivityCache$InMemory.activityItem = new SingleActivity(formattedPaymentHistoryActivityItem, LoadingState.LOADED);
                    navigator.goTo(paymentReceipt);
                    return Unit.INSTANCE;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            SafeTrace.throwOnFailure(obj);
            this.label = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityItemGlobalId activityItemGlobalId2 = formattedPaymentHistoryActivityItem.getActivityItemGlobalId();
                    ActivityItemPresentationContext activityItemPresentationContext2 = activityItemViewModel.presentationContext;
                    navigator.goTo(new HistoryScreens.PaymentReceipt(new ActivityItemKey(activityItemGlobalId2, activityItemPresentationContext2.activityToken, activityItemPresentationContext2.activityScope), (String) null, 6));
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                paymentReceipt = (HistoryScreens.PaymentReceipt) this.$request;
                SafeTrace.throwOnFailure(obj);
                RealActivitiesCacheManager realActivitiesCacheManager2 = defaultActivityItemEventHandler.activitiesCacheManager;
                ActivityItemKey activityItemKey2 = paymentReceipt.activityItemKey;
                ActivitiesCacheManagerKt$putForSingle$1 activitiesCacheManagerKt$putForSingle$12 = ActivitiesCacheManagerKt$putForSingle$1.INSTANCE;
                activityItemKey2.getClass();
                LruCache lruCache2 = realActivitiesCacheManager2.lruCacheSingle;
                singleActivityCache$InMemory = (SingleActivityCache$InMemory) lruCache2.get(activityItemKey2);
                if (singleActivityCache$InMemory == null) {
                    singleActivityCache$InMemory = (SingleActivityCache$InMemory) activitiesCacheManagerKt$putForSingle$12.invoke();
                    lruCache2.put(activityItemKey2, singleActivityCache$InMemory);
                }
                singleActivityCache$InMemory.activityItem = new SingleActivity(formattedPaymentHistoryActivityItem, LoadingState.LOADED);
                navigator.goTo(paymentReceipt);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent2 = ActivityItemCallbackEvent.AnalyticsEvent.ReceiptOpened;
            this.label = 3;
        }
        Timber.Forest.w("Failed to set cached Activity item data", new Object[0], e);
        ActivityItemCallbackEvent.AnalyticsEvent analyticsEvent22 = ActivityItemCallbackEvent.AnalyticsEvent.ReceiptOpened;
        this.label = 3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$eventListener;
        switch (i) {
            case 0:
                return new RealImageLoader$execute$result$1((ImageRequest) this.$request, (RealImageLoader) this.this$0, (Size) this.$size, (EventListener) obj2, (Image) this.$cachedPlaceholder, continuation, 0);
            case 1:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$1 = new RealImageLoader$execute$result$1((PointerInputScope) this.this$0, (Function3) this.$size, (Function1) obj2, (PressGestureScopeImpl) this.$cachedPlaceholder, continuation, 1);
                realImageLoader$execute$result$1.$request = obj;
                return realImageLoader$execute$result$1;
            case 2:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$12 = new RealImageLoader$execute$result$1((PointerInputScope) this.this$0, (Function1) this.$size, (Function3) obj2, (Function1) this.$cachedPlaceholder, continuation, 2);
                realImageLoader$execute$result$12.$request = obj;
                return realImageLoader$execute$result$12;
            case 3:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$13 = new RealImageLoader$execute$result$1((TrackpadScrollingLogic) this.$size, (ScrollingLogic) obj2, (Ref$ObjectRef) this.$cachedPlaceholder, continuation, 3);
                realImageLoader$execute$result$13.this$0 = obj;
                return realImageLoader$execute$result$13;
            case 4:
                return new RealImageLoader$execute$result$1((LegacyTextFieldState) this.$request, (MutableState) this.this$0, (TextInputService) this.$size, (TextFieldSelectionManager) obj2, (ImeOptions) this.$cachedPlaceholder, continuation, 4);
            case 5:
                return new RealImageLoader$execute$result$1((BringIntoViewRequesterImpl) this.$request, (TextFieldValue) this.this$0, (LegacyTextFieldState) this.$size, (TextLayoutResultProxy) obj2, (OffsetMapping) this.$cachedPlaceholder, continuation, 5);
            case 6:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$14 = new RealImageLoader$execute$result$1((AndroidPlatformTextInputSession) this.this$0, (Function1) this.$size, (AndroidLegacyPlatformTextInputServiceAdapter) obj2, (LegacyAdaptingPlatformTextInputModifierNode) this.$cachedPlaceholder, continuation, 6);
                realImageLoader$execute$result$14.$request = obj;
                return realImageLoader$execute$result$14;
            case 7:
                return new RealImageLoader$execute$result$1((DismissState) this.$request, (LinkedHashMap) this.this$0, (ResistanceConfig) this.$size, (Density) obj2, (Function2) this.$cachedPlaceholder, continuation, 7);
            case 8:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$15 = new RealImageLoader$execute$result$1((Function2) this.this$0, (DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.$size, (CoroutineScope) obj2, (AtomicReference) this.$cachedPlaceholder, continuation, 8);
                realImageLoader$execute$result$15.$request = obj;
                return realImageLoader$execute$result$15;
            case 9:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$16 = new RealImageLoader$execute$result$1((ComposeNavigator) this.this$0, (MutableState) this.$size, (MutableFloatState) obj2, (MutableState) this.$cachedPlaceholder, continuation, 9);
                realImageLoader$execute$result$16.$request = obj;
                return realImageLoader$execute$result$16;
            case 10:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$17 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (LocalEditorialPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 10);
                realImageLoader$execute$result$17.$request = obj;
                return realImageLoader$execute$result$17;
            case 11:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$18 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (RealBrandFollowPresenter) this.$size, (State) obj2, (MutableState) this.$cachedPlaceholder, 11);
                realImageLoader$execute$result$18.$request = obj;
                return realImageLoader$execute$result$18;
            case 12:
                return new RealImageLoader$execute$result$1((LocalOrderStatusPresenter) this.this$0, (LocalOrderStatusScreen.Type) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, continuation, 12);
            case 13:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$19 = new RealImageLoader$execute$result$1((FulfillmentConfiguration) this.this$0, continuation, (FulfillmentPickerPresenter) this.$size, (MutableState) obj2);
                realImageLoader$execute$result$19.$request = obj;
                return realImageLoader$execute$result$19;
            case 14:
                return new RealImageLoader$execute$result$1((CardStudioPresenter) obj2, (MutableState) this.$cachedPlaceholder, continuation, 14);
            case 15:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$110 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (MarketingMessageOfferDetails) this.$size, (CardStudioPresenter) obj2, (MarketingMessageViewModel.OfferPreview) this.$cachedPlaceholder, 15);
                realImageLoader$execute$result$110.$request = obj;
                return realImageLoader$execute$result$110;
            case 16:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$111 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (EndAppLockPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 16);
                realImageLoader$execute$result$111.$request = obj;
                return realImageLoader$execute$result$111;
            case 17:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$112 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (EducationalSheetModelList) this.$size, (EducationalSheetPresenter) obj2, (MutableState) this.$cachedPlaceholder, 17);
                realImageLoader$execute$result$112.$request = obj;
                return realImageLoader$execute$result$112;
            case 18:
                return new RealImageLoader$execute$result$1((LocalMenuItemDetailsViewModel.ItemModifier) this.$request, (SnapshotStateMap) this.this$0, (MutableState) this.$size, (ScrollState) obj2, (Function1) this.$cachedPlaceholder, continuation, 18);
            case 19:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$113 = new RealImageLoader$execute$result$1((zzmc) obj2, (GenerateContentRequest) this.$cachedPlaceholder, continuation, 19);
                realImageLoader$execute$result$113.$size = obj;
                return realImageLoader$execute$result$113;
            case 20:
                return new RealImageLoader$execute$result$1((RealBugReportSender) this.$request, (ApiResult.Success) this.this$0, (BugReport) this.$size, (DiagnosticContext) obj2, (List) this.$cachedPlaceholder, continuation, 20);
            case 21:
                return new RealImageLoader$execute$result$1((ThemeSwitcherViewModel.Loaded) this.$request, (Animatable) this.this$0, (Animatable) this.$size, (Animatable) obj2, (Function1) this.$cachedPlaceholder, continuation, 21);
            case 22:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$114 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (LocalEditorialPresenter) this.$size, (MutableState) obj2, (ParcelableSnapshotMutableIntState) this.$cachedPlaceholder, 22);
                realImageLoader$execute$result$114.$request = obj;
                return realImageLoader$execute$result$114;
            case 23:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$115 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (PaymentLoadingPresenter) this.$size, (String) obj2, (State) this.$cachedPlaceholder, 23);
                realImageLoader$execute$result$115.$request = obj;
                return realImageLoader$execute$result$115;
            case 24:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$116 = new RealImageLoader$execute$result$1((AccountDocumentsPresenter) this.$size, (String) obj2, (StatementType) this.$cachedPlaceholder, continuation, 24);
                realImageLoader$execute$result$116.this$0 = obj;
                return realImageLoader$execute$result$116;
            case 25:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$117 = new RealImageLoader$execute$result$1((MutableState) this.this$0, (ActivityTabPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, continuation, 25);
                realImageLoader$execute$result$117.$request = obj;
                return realImageLoader$execute$result$117;
            case 26:
                return new RealImageLoader$execute$result$1((Flow) this.$request, (MutableState) this.this$0, (MutableState) this.$size, (ActivityTabPresenter) obj2, (MutableState) this.$cachedPlaceholder, continuation, 26);
            case 27:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$118 = new RealImageLoader$execute$result$1((ActivityItem) this.this$0, (ActivityItemViewEvent) this.$size, (DefaultActivityItemEventHandler) obj2, (ActivityItemViewModel) this.$cachedPlaceholder, continuation, 27);
                realImageLoader$execute$result$118.$request = obj;
                return realImageLoader$execute$result$118;
            case 28:
                return new RealImageLoader$execute$result$1((DefaultActivityItemEventHandler) this.this$0, (FormattedPaymentHistoryActivityItem) this.$size, (ProducerScope) obj2, (ActivityItemViewModel) this.$cachedPlaceholder, continuation, 28);
            default:
                RealImageLoader$execute$result$1 realImageLoader$execute$result$119 = new RealImageLoader$execute$result$1((Flow) this.this$0, continuation, (ReceiptPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 29);
                realImageLoader$execute$result$119.$request = obj;
                return realImageLoader$execute$result$119;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 6:
                ((RealImageLoader$execute$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((RealImageLoader$execute$result$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
    
        if (r0 == r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        if (r0 == r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
    
        if (r0 == r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023e, code lost:
    
        if (r4 == r1) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225 A[Catch: all -> 0x017e, TryCatch #7 {all -> 0x017e, blocks: (B:78:0x0177, B:80:0x0221, B:82:0x0225, B:88:0x023c, B:89:0x0242, B:90:0x0245, B:93:0x0186, B:112:0x020e), top: B:71:0x0165 }] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v69, types: [int] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:403:0x094c -> B:393:0x094e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1;
        long computeSizeForDefaultText;
        Rect rect;
        NavBackStackEntry navBackStackEntry;
        Object m1206getOrderh2CDXeg;
        MutableState mutableState;
        FulfillmentConfiguration fulfillmentConfiguration;
        SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays;
        Object fulfillmentSchedulingQuote;
        SchedulingDay schedulingDay;
        SchedulingDayTimePickerViewModel.ModelState.LoadedDays copy$default;
        List<SchedulingDay> list;
        Iterator it;
        SchedulingDay schedulingDay2;
        List list2;
        zzla zzlaVar;
        GenAiException genAiException;
        zzla zzlaVar2;
        String str;
        GenerateContentResponse generateContentResponse;
        Object await;
        String str2;
        Object zzp;
        zzla zzlaVar3;
        GenAiException e;
        zzmd zzmdVar;
        Object animateTo$default;
        Object animateTo$default2;
        Object animateTo$default3;
        int i = this.$r8$classId;
        long j = BodyPartID.bodyIdMax;
        int i2 = 2;
        Object obj2 = this.$eventListener;
        int i3 = 1;
        Continuation continuation = null;
        SchedulingDay schedulingDay3 = null;
        NavBackStackEntry navBackStackEntry2 = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                ImageRequest imageRequest = (ImageRequest) this.$request;
                ProfileStore_ profileStore_ = new ProfileStore_(imageRequest, ((RealImageLoader) this.this$0).components.interceptors, 0, imageRequest, (Size) this.$size, (EventListener) obj2, ((Image) this.$cachedPlaceholder) != null);
                this.label = 1;
                Object proceed = profileStore_.proceed(this);
                return proceed == coroutineSingletons ? coroutineSingletons : proceed;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.$request;
                    PointerInputScope pointerInputScope = (PointerInputScope) this.this$0;
                    TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1(coroutineScope, (Function3) this.$size, (Function1) obj2, (PressGestureScopeImpl) this.$cachedPlaceholder, (Continuation) null, 0);
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, tapGestureDetectorKt$detectTapAndPress$2$1, this) == coroutineSingletons2) {
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
                PointerInputScope pointerInputScope2 = (PointerInputScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$12 = new TapGestureDetectorKt$detectTapAndPress$2$1((CoroutineScope) this.$request, new PressGestureScopeImpl(pointerInputScope2), (Function1) this.$size, (Function3) obj2, (Function1) this.$cachedPlaceholder, (Continuation) null);
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope2, tapGestureDetectorKt$detectTapAndPress$2$12, this) == coroutineSingletons3) {
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
                ScrollingLogic scrollingLogic = (ScrollingLogic) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.$cachedPlaceholder;
                TrackpadScrollingLogic trackpadScrollingLogic = (TrackpadScrollingLogic) this.$size;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$12 = (ScrollingLogic$nestedScrollScope$1) this.this$0;
                    float m249toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).value));
                    ScrollingLogic scrollingLogic2 = trackpadScrollingLogic.scrollingLogic;
                    scrollingLogic2.m247toFloatk4lQ0M(scrollingLogic2.m246reverseIfNeededMKHz9U(scrollingLogic$nestedScrollScope$12.m250scrollByWithOverscrollOzD1aCk(1, scrollingLogic2.m248toOffsettuRUvjQ(scrollingLogic2.reverseIfNeeded(m249toSingleAxisDeltaFromAnglek4lQ0M)))));
                    scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$12;
                    if (!((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).isEnd) {
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.$request;
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$13 = (ScrollingLogic$nestedScrollScope$1) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$14 = scrollingLogic$nestedScrollScope$13;
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef2;
                    Object coroutineScope2 = obj;
                    ref$ObjectRef3.element = coroutineScope2;
                    TrackpadScrollingLogic.TrackpadScrollDelta trackpadScrollDelta = (TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element;
                    Recorder.AnonymousClass4 anonymousClass4 = trackpadScrollingLogic.velocityTracker;
                    long j2 = trackpadScrollDelta.timeMillis;
                    long j3 = j;
                    long j4 = trackpadScrollDelta.value;
                    ((VelocityTracker1D) anonymousClass4.val$audioErrorConsumer).addDataPoint(j2, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((VelocityTracker1D) anonymousClass4.this$0).addDataPoint(j2, Float.intBitsToFloat((int) (j4 & j3)));
                    TrackpadScrollingLogic.TrackpadScrollDelta sumOrNull = TrackpadScrollingLogic.sumOrNull(trackpadScrollingLogic.channel);
                    if (sumOrNull != null) {
                        Recorder.AnonymousClass4 anonymousClass42 = trackpadScrollingLogic.velocityTracker;
                        long j5 = sumOrNull.timeMillis;
                        long j6 = sumOrNull.value;
                        ((VelocityTracker1D) anonymousClass42.val$audioErrorConsumer).addDataPoint(j5, Float.intBitsToFloat((int) (j6 >> 32)));
                        ((VelocityTracker1D) anonymousClass42.this$0).addDataPoint(j5, Float.intBitsToFloat((int) (j6 & j3)));
                        ref$ObjectRef.element = ((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).plus(sumOrNull);
                    }
                    float m249toSingleAxisDeltaFromAnglek4lQ0M2 = scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).value));
                    ScrollingLogic scrollingLogic3 = trackpadScrollingLogic.scrollingLogic;
                    scrollingLogic3.m247toFloatk4lQ0M(scrollingLogic3.m246reverseIfNeededMKHz9U(scrollingLogic$nestedScrollScope$14.m250scrollByWithOverscrollOzD1aCk(1, scrollingLogic3.m248toOffsettuRUvjQ(scrollingLogic3.reverseIfNeeded(m249toSingleAxisDeltaFromAnglek4lQ0M2)))));
                    scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$14;
                    j = j3;
                    i3 = 1;
                    continuation = null;
                    if (!((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).isEnd) {
                        BufferedChannel bufferedChannel = trackpadScrollingLogic.channel;
                        this.this$0 = scrollingLogic$nestedScrollScope$1;
                        this.$request = ref$ObjectRef;
                        this.label = i3;
                        coroutineScope2 = JobKt.coroutineScope(new TransferStockPresenter$models$3$1$2(bufferedChannel, continuation, i3), this);
                        if (coroutineScope2 == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        scrollingLogic$nestedScrollScope$14 = scrollingLogic$nestedScrollScope$1;
                        ref$ObjectRef3 = ref$ObjectRef;
                        ref$ObjectRef3.element = coroutineScope2;
                        TrackpadScrollingLogic.TrackpadScrollDelta trackpadScrollDelta2 = (TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element;
                        Recorder.AnonymousClass4 anonymousClass43 = trackpadScrollingLogic.velocityTracker;
                        long j22 = trackpadScrollDelta2.timeMillis;
                        long j32 = j;
                        long j42 = trackpadScrollDelta2.value;
                        ((VelocityTracker1D) anonymousClass43.val$audioErrorConsumer).addDataPoint(j22, Float.intBitsToFloat((int) (j42 >> 32)));
                        ((VelocityTracker1D) anonymousClass43.this$0).addDataPoint(j22, Float.intBitsToFloat((int) (j42 & j32)));
                        TrackpadScrollingLogic.TrackpadScrollDelta sumOrNull2 = TrackpadScrollingLogic.sumOrNull(trackpadScrollingLogic.channel);
                        if (sumOrNull2 != null) {
                        }
                        float m249toSingleAxisDeltaFromAnglek4lQ0M22 = scrollingLogic.m249toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m246reverseIfNeededMKHz9U(((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).value));
                        ScrollingLogic scrollingLogic32 = trackpadScrollingLogic.scrollingLogic;
                        scrollingLogic32.m247toFloatk4lQ0M(scrollingLogic32.m246reverseIfNeededMKHz9U(scrollingLogic$nestedScrollScope$14.m250scrollByWithOverscrollOzD1aCk(1, scrollingLogic32.m248toOffsettuRUvjQ(scrollingLogic32.reverseIfNeeded(m249toSingleAxisDeltaFromAnglek4lQ0M22)))));
                        scrollingLogic$nestedScrollScope$1 = scrollingLogic$nestedScrollScope$14;
                        j = j32;
                        i3 = 1;
                        continuation = null;
                        if (!((TrackpadScrollingLogic.TrackpadScrollDelta) ref$ObjectRef.element).isEnd) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            case 4:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) this.$request;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                try {
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new TooltipKt$$ExternalSyntheticLambda1(7, (MutableState) this.this$0));
                        DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$3 = new DatePickerKt$updateDisplayedMonth$3(legacyTextFieldState, (TextInputService) this.$size, (TextFieldSelectionManager) obj2, (ImeOptions) this.$cachedPlaceholder, 2);
                        this.label = 1;
                        if (snapshotFlow.collect(datePickerKt$updateDisplayedMonth$3, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    KeyMappingKt.endInputSession(legacyTextFieldState);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    KeyMappingKt.endInputSession(legacyTextFieldState);
                    throw th;
                }
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) this.$request;
                    TextFieldValue textFieldValue = (TextFieldValue) this.this$0;
                    TextDelegate textDelegate = ((LegacyTextFieldState) this.$size).textDelegate;
                    TextLayoutResult textLayoutResult = ((TextLayoutResultProxy) obj2).value;
                    OffsetMapping offsetMapping = (OffsetMapping) this.$cachedPlaceholder;
                    this.label = 1;
                    int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m989getMaximpl(textFieldValue.selection));
                    if (originalToTransformed < textLayoutResult.layoutInput.text.text.length()) {
                        rect = textLayoutResult.getBoundingBox(originalToTransformed);
                    } else if (originalToTransformed != 0) {
                        rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
                    } else {
                        computeSizeForDefaultText = TextFieldDelegateKt.computeSizeForDefaultText(textDelegate.style, textDelegate.density, textDelegate.fontFamilyResolver, TextFieldDelegateKt.EmptyTextReplacement, 1);
                        rect = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, (int) (BodyPartID.bodyIdMax & computeSizeForDefaultText));
                    }
                    Object bringIntoView = bringIntoViewRequesterImpl.bringIntoView(rect, this);
                    if (bringIntoView != coroutineSingletons6) {
                        bringIntoView = Unit.INSTANCE;
                    }
                    if (bringIntoView == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter = (AndroidLegacyPlatformTextInputServiceAdapter) obj2;
                AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                try {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    SafeTrace.throwOnFailure(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.$request;
                    LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 legacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 = LegacyPlatformTextInputServiceAdapter_androidKt.inputMethodManagerFactory;
                    View view = androidPlatformTextInputSession.view;
                    legacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.getClass();
                    Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(view);
                    LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(androidPlatformTextInputSession.view, new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1((LegacyAdaptingPlatformTextInputModifierNode) this.$cachedPlaceholder), anonymousClass1);
                    if (StylusHandwriting_androidKt.isStylusHandwritingSupported) {
                        JobKt.launch$default(coroutineScope3, null, null, new VirtualCameraState$connect$2$1(androidLegacyPlatformTextInputServiceAdapter, anonymousClass1, continuation, 27), 3);
                    }
                    Function1 function1 = (Function1) this.$size;
                    if (function1 != null) {
                        function1.invoke(legacyTextInputMethodRequest);
                    }
                    androidLegacyPlatformTextInputServiceAdapter.currentRequest = legacyTextInputMethodRequest;
                    this.label = 1;
                    androidPlatformTextInputSession.startInputMethod(legacyTextInputMethodRequest, this);
                    return coroutineSingletons7;
                } catch (Throwable th2) {
                    androidLegacyPlatformTextInputServiceAdapter.currentRequest = null;
                    throw th2;
                }
            case 7:
                Density density = (Density) obj2;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.this$0;
                DismissState dismissState = (DismissState) this.$request;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Map map = (Map) dismissState.anchors$delegate.getValue();
                    dismissState.anchors$delegate.setValue(linkedHashMap);
                    dismissState.resistance$delegate.setValue((ResistanceConfig) this.$size);
                    dismissState.thresholds$delegate.setValue(new MenuKt$$ExternalSyntheticLambda1(6, linkedHashMap, (Function2) this.$cachedPlaceholder, density));
                    dismissState.velocityThreshold$delegate.setFloatValue(density.mo236toPx0680j_4(125.0f));
                    this.label = 1;
                    if (dismissState.processNewAnchors$material(map, linkedHashMap, this) == coroutineSingletons8) {
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
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = new TimerScopeKt$withTimer$2$1$blockScope$1((CoroutineScope) this.$request, (DifferentialMotionFlingController$$ExternalSyntheticLambda0) this.$size, (CoroutineScope) obj2, (Function2) this.this$0, (AtomicReference) this.$cachedPlaceholder);
                Function2 function2 = (Function2) this.this$0;
                this.label = 1;
                Object invoke = function2.invoke(timerScopeKt$withTimer$2$1$blockScope$1, this);
                return invoke == coroutineSingletons9 ? coroutineSingletons9 : invoke;
            case 9:
                MutableFloatState mutableFloatState = (MutableFloatState) obj2;
                MutableState mutableState2 = (MutableState) this.$cachedPlaceholder;
                ComposeNavigator composeNavigator = (ComposeNavigator) this.this$0;
                MutableState mutableState3 = (MutableState) this.$size;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = (Flow) this.$request;
                        if (((List) mutableState3.getValue()).size() > 1) {
                            ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(RecyclerView.DECELERATION_RATE);
                            navBackStackEntry2 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) mutableState3.getValue());
                            navBackStackEntry2.getClass();
                            composeNavigator.getState().prepareForTransition(navBackStackEntry2);
                            composeNavigator.getState().prepareForTransition((NavBackStackEntry) ((List) mutableState3.getValue()).get(((List) mutableState3.getValue()).size() - 2));
                        }
                        SwipeableState$animateTo$2 swipeableState$animateTo$2 = new SwipeableState$animateTo$2(i2, mutableState3, mutableState2, mutableFloatState);
                        this.$request = navBackStackEntry2;
                        this.label = 1;
                        if (flow.collect(swipeableState$animateTo$2, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                        navBackStackEntry = navBackStackEntry2;
                    } else {
                        if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        navBackStackEntry = (NavBackStackEntry) this.$request;
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (((List) mutableState3.getValue()).size() > 1) {
                        mutableState2.setValue(Boolean.FALSE);
                        navBackStackEntry.getClass();
                        composeNavigator.popBackStack(navBackStackEntry, false);
                    }
                } catch (CancellationException unused) {
                    if (((List) mutableState3.getValue()).size() > 1) {
                        mutableState2.setValue(Boolean.FALSE);
                    }
                }
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$32 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope4, (LocalEditorialPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 3);
                    this.$request = null;
                    this.label = 1;
                    if (flow2.collect(datePickerKt$updateDisplayedMonth$32, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.this$0;
                    DatePickerKt$updateDisplayedMonth$3 datePickerKt$updateDisplayedMonth$33 = new DatePickerKt$updateDisplayedMonth$3(coroutineScope5, (RealBrandFollowPresenter) this.$size, (State) obj2, (MutableState) this.$cachedPlaceholder, 4);
                    this.$request = null;
                    this.label = 1;
                    if (flow3.collect(datePickerKt$updateDisplayedMonth$33, this) == coroutineSingletons12) {
                        return coroutineSingletons12;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) obj2;
                    RealLocalOrderRepository realLocalOrderRepository = ((LocalOrderStatusPresenter) this.this$0).localOrderRepository;
                    String str3 = ((LocalOrderStatusScreen.Type.Standalone) ((LocalOrderStatusScreen.Type) this.$size)).orderToken;
                    this.$request = mutableState4;
                    this.label = 1;
                    m1206getOrderh2CDXeg = realLocalOrderRepository.m1206getOrderh2CDXeg(str3, this);
                    if (m1206getOrderh2CDXeg == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                    mutableState = mutableState4;
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.$request;
                    SafeTrace.throwOnFailure(obj);
                    m1206getOrderh2CDXeg = obj;
                }
                mutableState.setValue((LocalOrder) m1206getOrderh2CDXeg);
                ((MutableState) this.$cachedPlaceholder).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                FulfillmentPickerPresenter fulfillmentPickerPresenter = (FulfillmentPickerPresenter) this.$size;
                LocalFulfillmentPickerScreen localFulfillmentPickerScreen = fulfillmentPickerPresenter.screen;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) this.this$0;
                    JobKt.launch$default(coroutineScope6, null, null, new EventBridge$sendEvent$1(fulfillmentPickerPresenter, (MutableState) obj2, continuation, i2), 3);
                    LocalInstalledStore localInstalledStore = fulfillmentPickerPresenter.store;
                    String str4 = localFulfillmentPickerScreen.brandToken;
                    FulfillmentConfigurations fulfillmentConfigurations = new FulfillmentConfigurations(fulfillmentConfiguration2, 1);
                    this.$request = null;
                    this.$cachedPlaceholder = fulfillmentConfiguration2;
                    this.label = 1;
                    if (((RealLocalInstalledStore) localInstalledStore).m1290updateFulfillmentConfigurationsNoPDS7c(str4, fulfillmentConfigurations, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                    fulfillmentConfiguration = fulfillmentConfiguration2;
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fulfillmentConfiguration = (FulfillmentConfiguration) this.$cachedPlaceholder;
                    SafeTrace.throwOnFailure(obj);
                }
                LocalScreen localScreen = localFulfillmentPickerScreen.exitScreen;
                boolean z = localScreen instanceof LocalBrandLocationMenuScreen;
                LocalScreen localScreen2 = localScreen;
                if (z) {
                    BrandSpot brandSpot = new BrandSpot(localFulfillmentPickerScreen.brandToken, fulfillmentConfiguration.mo1238getLocationTokenVSCKlZI());
                    LocalBrandLocationMenuScreen localBrandLocationMenuScreen = (LocalBrandLocationMenuScreen) localScreen;
                    boolean areEqual = Intrinsics.areEqual(localBrandLocationMenuScreen.brandSpot, brandSpot);
                    localScreen2 = localBrandLocationMenuScreen;
                    if (!areEqual) {
                        boolean z2 = localBrandLocationMenuScreen.isProfileSheetInline;
                        AttributionKey attributionKey = localBrandLocationMenuScreen.attributionKey;
                        boolean z3 = localBrandLocationMenuScreen.navigateBackToProfile;
                        BrandSpotSyncTokens brandSpotSyncTokens = localBrandLocationMenuScreen.syncTokens;
                        attributionKey.getClass();
                        brandSpotSyncTokens.getClass();
                        localScreen2 = new LocalBrandLocationMenuScreen(brandSpot, null, null, z2, attributionKey, z3, brandSpotSyncTokens);
                    }
                }
                fulfillmentPickerPresenter.navigator.goTo(localScreen2);
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState5 = (MutableState) this.$cachedPlaceholder;
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SchedulingDayTimePickerViewModel.ModelState modelState = (SchedulingDayTimePickerViewModel.ModelState) mutableState5.getValue();
                    modelState.getClass();
                    loadedDays = (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) modelState;
                    SchedulingDay schedulingDay4 = loadedDays.selectedDay;
                    LocalService localService = (LocalService) cardStudioPresenter.ioContext;
                    String str5 = ((BrandSpot) cardStudioPresenter.cardStudioQueries).brandToken;
                    LocalSchedulingDayTimePickerScreen localSchedulingDayTimePickerScreen = (LocalSchedulingDayTimePickerScreen) cardStudioPresenter.appConfig;
                    GetFulfillmentSchedulingQuoteRequest getFulfillmentSchedulingQuoteRequest = new GetFulfillmentSchedulingQuoteRequest(str5, localSchedulingDayTimePickerScreen.locationToken, schedulingDay4.scheduling_day_token, new GetFulfillmentSchedulingQuoteRequest$FulfillmentFilter$CartFulfillment(FulfillmentConfigurationKt.toProtoFulfillment(localSchedulingDayTimePickerScreen.fulfillmentConfiguration)), (ArrayList) null, 48);
                    this.$request = loadedDays;
                    this.this$0 = schedulingDay4;
                    this.$size = mutableState5;
                    this.label = 1;
                    fulfillmentSchedulingQuote = localService.getFulfillmentSchedulingQuote(getFulfillmentSchedulingQuoteRequest, this);
                    if (fulfillmentSchedulingQuote == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                    schedulingDay = schedulingDay4;
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState5 = (MutableState) this.$size;
                    schedulingDay = (SchedulingDay) this.this$0;
                    loadedDays = (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) this.$request;
                    SafeTrace.throwOnFailure(obj);
                    fulfillmentSchedulingQuote = obj;
                }
                ApiResult apiResult = (ApiResult) fulfillmentSchedulingQuote;
                boolean z4 = apiResult instanceof ApiResult.Success;
                SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.FailedToLoadTimes failedToLoadTimes = SchedulingDayTimePickerViewModel.ModelState.LoadedDays.TimesState.FailedToLoadTimes.INSTANCE;
                if (z4) {
                    GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) ((ApiResult.Success) apiResult).response;
                    RumTagsUtilsKt rumTagsUtilsKt = getFulfillmentSchedulingQuoteResponse.response;
                    if (rumTagsUtilsKt != null) {
                        GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse = rumTagsUtilsKt instanceof GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse ? (GetFulfillmentSchedulingQuoteResponse$Response$ErrorResponse) rumTagsUtilsKt : null;
                        LocalErrorResponse localErrorResponse = getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse != null ? getFulfillmentSchedulingQuoteResponse$Response$ErrorResponse.value : null;
                        if (localErrorResponse != null && (list2 = localErrorResponse.errors) != null && (!list2.isEmpty())) {
                            copy$default = SchedulingDayTimePickerViewModel.ModelState.LoadedDays.copy$default(loadedDays, null, failedToLoadTimes, 3);
                        }
                    }
                    List list3 = loadedDays.schedulingDays;
                    RumTagsUtilsKt rumTagsUtilsKt2 = getFulfillmentSchedulingQuoteResponse.response;
                    if (rumTagsUtilsKt2 != null) {
                        GetFulfillmentSchedulingQuoteResponse$Response$Quote getFulfillmentSchedulingQuoteResponse$Response$Quote = rumTagsUtilsKt2 instanceof GetFulfillmentSchedulingQuoteResponse$Response$Quote ? (GetFulfillmentSchedulingQuoteResponse$Response$Quote) rumTagsUtilsKt2 : null;
                        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote2 = getFulfillmentSchedulingQuoteResponse$Response$Quote != null ? getFulfillmentSchedulingQuoteResponse$Response$Quote.value : null;
                        if (fulfillmentSchedulingQuote2 != null) {
                            list = fulfillmentSchedulingQuote2.scheduling_days;
                            if (list == null) {
                                list = EmptyList.INSTANCE;
                            }
                            ArrayList arrayList = new ArrayList(list3);
                            for (SchedulingDay schedulingDay5 : list) {
                                Iterator it2 = list3.iterator();
                                int i19 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        i19 = -1;
                                    } else if (!Intrinsics.areEqual(((SchedulingDay) it2.next()).scheduling_day_token, schedulingDay5.scheduling_day_token)) {
                                        i19++;
                                    }
                                }
                                if (i19 >= 0) {
                                    SchedulingDay schedulingDay6 = (SchedulingDay) arrayList.get(i19);
                                    ArrayList plus = CollectionsKt.plus((Iterable) schedulingDay5.day_times, (Collection) schedulingDay6.day_times);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = plus.iterator();
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        if (hashSet.add(((SchedulingTime) next).scheduling_day_time_token)) {
                                            arrayList2.add(next);
                                        }
                                    }
                                    arrayList.set(i19, SchedulingDay.copy$default(schedulingDay6, arrayList2, null, 47));
                                } else {
                                    arrayList.add(schedulingDay5);
                                }
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    ?? next2 = it.next();
                                    if (Intrinsics.areEqual(((SchedulingDay) next2).scheduling_day_token, schedulingDay.scheduling_day_token)) {
                                        schedulingDay3 = next2;
                                    }
                                }
                            }
                            schedulingDay2 = schedulingDay3;
                            if (schedulingDay2 == null) {
                                schedulingDay2 = (SchedulingDay) CollectionsKt.first((List) arrayList);
                            }
                            copy$default = new SchedulingDayTimePickerViewModel.ModelState.LoadedDays(arrayList, schedulingDay2, CardStudioPresenter.access$asInitialTimesState(cardStudioPresenter, schedulingDay2));
                        }
                    }
                    list = null;
                    if (list == null) {
                    }
                    ArrayList arrayList3 = new ArrayList(list3);
                    while (r3.hasNext()) {
                    }
                    it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    schedulingDay2 = schedulingDay3;
                    if (schedulingDay2 == null) {
                    }
                    copy$default = new SchedulingDayTimePickerViewModel.ModelState.LoadedDays(arrayList3, schedulingDay2, CardStudioPresenter.access$asInitialTimesState(cardStudioPresenter, schedulingDay2));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    copy$default = SchedulingDayTimePickerViewModel.ModelState.LoadedDays.copy$default(loadedDays, null, failedToLoadTimes, 3);
                }
                mutableState5.setValue(copy$default);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    SwipeableState$animateTo$2 swipeableState$animateTo$22 = new SwipeableState$animateTo$2(coroutineScope7, (MarketingMessageOfferDetails) this.$size, (CardStudioPresenter) obj2, (MarketingMessageViewModel.OfferPreview) this.$cachedPlaceholder, 3);
                    this.$request = null;
                    this.label = 1;
                    if (flow4.collect(swipeableState$animateTo$22, this) == coroutineSingletons16) {
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
            case 16:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    SwipeableState$animateTo$2 swipeableState$animateTo$23 = new SwipeableState$animateTo$2(coroutineScope8, (EndAppLockPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 5);
                    this.$request = null;
                    this.label = 1;
                    if (flow5.collect(swipeableState$animateTo$23, this) == coroutineSingletons17) {
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
            case 17:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    SwipeableState$animateTo$2 swipeableState$animateTo$24 = new SwipeableState$animateTo$2(coroutineScope9, (EducationalSheetModelList) this.$size, (EducationalSheetPresenter) obj2, (MutableState) this.$cachedPlaceholder, 6);
                    this.$request = null;
                    this.label = 1;
                    if (flow6.collect(swipeableState$animateTo$24, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
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
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalMenuItemDetailsViewModel.ItemModifier itemModifier = (LocalMenuItemDetailsViewModel.ItemModifier) this.$request;
                    if (itemModifier == null) {
                        return Unit.INSTANCE;
                    }
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new StatusRunnable$$ExternalSyntheticLambda1(25, (SnapshotStateMap) this.this$0, itemModifier.mo1295getTokenQpp493U()));
                    MutableState mutableState6 = (MutableState) this.$size;
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1(snapshotFlow2, mutableState6, 0), 24);
                    LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3((ScrollState) obj2, (Function1) this.$cachedPlaceholder, mutableState6, null, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$3, this) == coroutineSingletons19) {
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
            case 19:
                zzmc zzmcVar = (zzmc) obj2;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ?? r2 = this.label;
                if (r2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((GenerateContentRequest) this.$cachedPlaceholder).getClass();
                    a$$ExternalSyntheticBUOutline0.m$3("Prompt prefix is null");
                    return null;
                }
                try {
                    if (r2 == 1) {
                        Deferred deferred = (Deferred) this.this$0;
                        zzlaVar = (zzla) this.$request;
                        String str6 = (String) this.$size;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            generateContentResponse = (GenerateContentResponse) obj;
                            this.$size = str6;
                            this.$request = zzlaVar;
                            this.this$0 = generateContentResponse;
                            this.label = 2;
                            await = deferred.await(this);
                            if (await != coroutineSingletons20) {
                                str2 = str6;
                            }
                        } catch (GenAiException e2) {
                            genAiException = e2;
                            zzlaVar2 = zzlaVar;
                            str = str6;
                            zzmz zzmzVar = zzmcVar.zzb;
                            Context context = zzmcVar.zza;
                            this.$size = str;
                            this.$request = zzlaVar2;
                            this.this$0 = genAiException;
                            this.label = 3;
                            zzp = zzmz.zzp(zzmzVar, context, str, this);
                            r2 = str;
                            if (zzp == coroutineSingletons20) {
                            }
                            zzmdVar = (zzmd) zzp;
                            if (zzmdVar != null) {
                            }
                            zzlaVar2.zzm(genAiException);
                            throw genAiException;
                        } catch (Throwable th3) {
                            th = th3;
                            r2 = str6;
                            if (((zzla) zzmcVar.zzc.remove(r2)) == null) {
                            }
                            throw th;
                        }
                        return coroutineSingletons20;
                    }
                    Object obj3 = this.this$0;
                    if (r2 != 2) {
                        genAiException = (GenAiException) obj3;
                        zzlaVar2 = (zzla) this.$request;
                        if (r2 != 3) {
                            r2 = (String) this.$size;
                            SafeTrace.throwOnFailure(obj);
                            zzlaVar2.zzm(genAiException);
                            throw genAiException;
                        }
                        String str7 = (String) this.$size;
                        SafeTrace.throwOnFailure(obj);
                        zzp = obj;
                        r2 = str7;
                        zzmdVar = (zzmd) zzp;
                        if (zzmdVar != null) {
                            zzmz zzmzVar2 = zzmcVar.zzb;
                            Context context2 = zzmcVar.zza;
                            this.$size = r2;
                            this.$request = zzlaVar2;
                            this.this$0 = genAiException;
                            this.label = 4;
                            Object zzu = zzmzVar2.zzu(context2, zzmdVar.zza, this);
                            if (zzu == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                break;
                            } else {
                                zzu = Unit.INSTANCE;
                                break;
                            }
                        }
                        zzlaVar2.zzm(genAiException);
                        throw genAiException;
                    }
                    GenerateContentResponse generateContentResponse2 = (GenerateContentResponse) obj3;
                    zzlaVar3 = (zzla) this.$request;
                    str2 = (String) this.$size;
                    try {
                        try {
                            SafeTrace.throwOnFailure(obj);
                            generateContentResponse = generateContentResponse2;
                            zzlaVar = zzlaVar3;
                            await = obj;
                        } catch (GenAiException e3) {
                            e = e3;
                            genAiException = e;
                            zzlaVar2 = zzlaVar3;
                            str = str2;
                            zzmz zzmzVar3 = zzmcVar.zzb;
                            Context context3 = zzmcVar.zza;
                            this.$size = str;
                            this.$request = zzlaVar2;
                            this.this$0 = genAiException;
                            this.label = 3;
                            zzp = zzmz.zzp(zzmzVar3, context3, str, this);
                            r2 = str;
                            if (zzp == coroutineSingletons20) {
                            }
                            zzmdVar = (zzmd) zzp;
                            if (zzmdVar != null) {
                            }
                            zzlaVar2.zzm(genAiException);
                            throw genAiException;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r2 = str2;
                        if (((zzla) zzmcVar.zzc.remove(r2)) == null) {
                            Log.w("CacheCreationProcessor", "Future not found in map for prefix: ".concat(String.valueOf((Object) r2)));
                        }
                        throw th;
                    }
                    try {
                        await.getClass();
                        if (((Boolean) await).booleanValue()) {
                            if (((zzla) zzmcVar.zzc.remove(str2)) == null) {
                                Log.w("CacheCreationProcessor", "Future not found in map for prefix: ".concat(String.valueOf(str2)));
                            }
                            return generateContentResponse;
                        }
                        throw new GenAiException(-103, "Cache creation failed for prefix: " + str2, null);
                    } catch (GenAiException e4) {
                        e = e4;
                        zzlaVar3 = zzlaVar;
                        genAiException = e;
                        zzlaVar2 = zzlaVar3;
                        str = str2;
                        zzmz zzmzVar32 = zzmcVar.zzb;
                        Context context32 = zzmcVar.zza;
                        this.$size = str;
                        this.$request = zzlaVar2;
                        this.this$0 = genAiException;
                        this.label = 3;
                        zzp = zzmz.zzp(zzmzVar32, context32, str, this);
                        r2 = str;
                        if (zzp == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                        zzmdVar = (zzmd) zzp;
                        if (zzmdVar != null) {
                        }
                        zzlaVar2.zzm(genAiException);
                        throw genAiException;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list4 = (List) this.$cachedPlaceholder;
                    this.label = 1;
                    if (RealBugReportSender.access$uploadDiagnosticAttachments((RealBugReportSender) this.$request, (CreateBugReportResponse) ((ApiResult.Success) this.this$0).response, (BugReport) this.$size, (DiagnosticContext) obj2, list4, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
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
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int ordinal = ((ThemeSwitcherViewModel.Loaded) this.$request).selectedTheme.ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            Float f = new Float(1.5f);
                            TweenSpec tween$default = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingFunctionsKt.EaseOutCirc, 2);
                            this.label = 3;
                            animateTo$default3 = Animatable.animateTo$default((Animatable) obj2, f, tween$default, null, null, this, 12);
                            break;
                        } else {
                            Animatable animatable = (Animatable) this.$size;
                            Float f2 = new Float(-3.0f);
                            TweenSpec tween$default2 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingFunctionsKt.EaseOut, 2);
                            this.label = 2;
                            animateTo$default2 = Animatable.animateTo$default(animatable, f2, tween$default2, null, null, this, 12);
                            break;
                        }
                    } else {
                        Animatable animatable2 = (Animatable) this.this$0;
                        Float f3 = new Float(-3.0f);
                        TweenSpec tween$default3 = AnimatableKt.tween$default(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 0, EasingFunctionsKt.EaseOut, 2);
                        this.label = 1;
                        animateTo$default = Animatable.animateTo$default(animatable2, f3, tween$default3, null, null, this, 12);
                        break;
                    }
                    return coroutineSingletons22;
                }
                if (i25 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    animateTo$default = obj;
                } else if (i25 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    animateTo$default2 = obj;
                } else {
                    if (i25 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    animateTo$default3 = obj;
                }
                ((Function1) this.$cachedPlaceholder).invoke(ThemeSwitcherViewEvent.AnimationComplete.INSTANCE);
                return Unit.INSTANCE;
            case 22:
                return invokeSuspend$com$squareup$cash$account$presenters$ThemeSwitcherPresenter$models$$inlined$CollectEffect$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$account$presenters$accountswitcher$AccountSwitcherPresenter$models$$inlined$CollectEffect$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$account$presenters$documents$AccountDocumentsPresenter$statementsViewModel$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$activity$presenters$ActivityTabPresenter$models$12$1$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$activity$presenters$ActivityTabPresenter$models$13$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$activity$presenters$DefaultActivityItemEventHandler$handleEvent$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$activity$presenters$DefaultActivityItemEventHandler$itemClicked$2(obj);
            default:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.$request;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    SwipeableState$animateTo$2 swipeableState$animateTo$25 = new SwipeableState$animateTo$2(coroutineScope10, (ReceiptPresenter) this.$size, (MutableState) obj2, (MutableState) this.$cachedPlaceholder, 10);
                    this.$request = null;
                    this.label = 1;
                    if (flow7.collect(swipeableState$animateTo$25, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$result$1(Object obj, Object obj2, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$size = obj;
        this.$eventListener = obj2;
        this.$cachedPlaceholder = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$result$1(FulfillmentConfiguration fulfillmentConfiguration, Continuation continuation, FulfillmentPickerPresenter fulfillmentPickerPresenter, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.this$0 = fulfillmentConfiguration;
        this.$size = fulfillmentPickerPresenter;
        this.$eventListener = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$result$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$size = obj2;
        this.$eventListener = obj3;
        this.$cachedPlaceholder = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$result$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$eventListener = obj;
        this.$cachedPlaceholder = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$result$1(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$size = obj;
        this.$eventListener = obj2;
        this.$cachedPlaceholder = obj3;
    }
}
