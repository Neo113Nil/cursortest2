package com.squareup.cash.profile.views;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.navigation.compose.NavHostKt$NavHost$32;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.DirectoryViewEvent;
import app.cash.redwood.treehouse.ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.zipline.ZiplineApiMismatchException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.android.gms.common.zzz;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewEvent$IdentityVerificationClick;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.cdf.identity.IdentityConfirmTap;
import com.squareup.cash.cdf.identity.Source;
import com.squareup.cash.cdf.identity.VerificationType;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.UiContainer$$ExternalSyntheticLambda33;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextThemeInfo;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolSection;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.screens.Back;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.viewmodels.ShopHubResultsListItem;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda2;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory;
import com.squareup.cash.treehouse.android.configuration.EndpointType;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.flows.BlockerScreenSpec;
import com.squareup.cash.treehouse.flows.FlowSpec;
import com.squareup.cash.treehouse.flows.RawFlowService;
import com.squareup.cash.treehouse.navigation.ClientRouteUrl;
import com.squareup.cash.treehouse.navigation.TreehouseRoutingParams;
import com.squareup.cash.treehouse.ui.PathRoutableAppService$Companion$Adapter$GeneratedOutboundService;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.kycrefresh.common.RefreshType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.ui.InputtedLegalName;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.challenge.confirmation.ConfirmationChallengeBridgeHandler;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeWebView;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.camera2.CameraDirection;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentUtilsKt;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.internal.PollingWorker;
import com.withpersona.sdk2.inquiry.internal.TransitionStatus;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.permissions.PermissionResult;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda38;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureMethod;
import com.withpersona.sdk2.inquiry.tracking.model.GovIdCaptureState;
import com.withpersona.sdk2.inquiry.tracking.model.GovernmentIdStateEventData;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okio.ByteString;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.InputEventTrigger;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(String str, String str2, Long l, GpsConfigQueries gpsConfigQueries) {
        this.$r8$classId = 9;
        EndpointType endpointType = EndpointType.FROM_SERVER;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = l;
        this.f$3 = gpsConfigQueries;
    }

    private final Object invoke$com$withpersona$sdk2$inquiry$internal$state$InquiryStateManager$$ExternalSyntheticLambda15(Object obj) {
        InquiryStateManager inquiryStateManager = (InquiryStateManager) this.f$1;
        TransitionStatus.CheckingForNextState checkingForNextState = (TransitionStatus.CheckingForNextState) this.f$2;
        InquiryState inquiryState = (InquiryState) this.f$3;
        String str = (String) this.f$0;
        PollingWorker.Response response = (PollingWorker.Response) obj;
        response.getClass();
        if (response instanceof PollingWorker.Response.Success) {
            InquiryState inquiryState2 = (InquiryState) ((SubtreeManager) inquiryStateManager.lastChild).getState();
            boolean z = checkingForNextState.canReuseWorkflow;
            WorkflowState workflowState = ((PollingWorker.Response.Success) response).nextState;
            if (z && (workflowState instanceof InquiryState.UiStepRunning) && (inquiryState2 instanceof InquiryState.UiStepRunning)) {
                InquiryState.UiStepRunning uiStepRunning = (InquiryState.UiStepRunning) workflowState;
                InquiryState.UiStepRunning uiStepRunning2 = (InquiryState.UiStepRunning) inquiryState2;
                if (Intrinsics.areEqual(uiStepRunning.stepName, uiStepRunning2.stepName)) {
                    workflowState = InquiryState.UiStepRunning.copy$default(uiStepRunning, null, null, uiStepRunning2.clientSideKey, null, null, false, 1032191);
                }
            }
            inquiryStateManager.updateState(workflowState);
        } else {
            if (!(response instanceof PollingWorker.Response.Error)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            InquiryStateManager.runTransitionWorkerIfNeeded$handleError(inquiryStateManager, inquiryState, str, ((PollingWorker.Response.Error) response).cause);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v23, types: [androidx.compose.runtime.MutableState, androidx.compose.runtime.State] */
    /* JADX WARN: Type inference failed for: r15v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r4v60, types: [com.withpersona.sdk2.inquiry.document.DocumentFile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v63, types: [com.withpersona.sdk2.inquiry.document.DocumentFile$Local] */
    /* JADX WARN: Type inference failed for: r5v46, types: [com.withpersona.sdk2.inquiry.document.DocumentFile, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [com.withpersona.sdk2.inquiry.document.DocumentFile$Remote] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Function1 function1;
        int i;
        int i2;
        int i3;
        final int i4;
        final int i5;
        DocumentWorkflow.State.UploadState readyToSubmit;
        DocumentWorkflow.State.UploadState readyToSubmit2;
        int i6 = this.$r8$classId;
        int i7 = 8;
        int i8 = 10;
        int i9 = 6;
        int i10 = 5;
        int i11 = 4;
        int i12 = 2;
        ?? r15 = 0;
        r15 = false;
        r15 = false;
        r15 = false;
        boolean z = false;
        final int i13 = 1;
        DirectoryListItem.ItemViewModel itemViewModel = null;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i6) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) obj6);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, (String) obj5, new OpenSourceKt$$ExternalSyntheticLambda10((Ref$ObjectRef) obj4, (MutableState) obj3, 1));
                return Unit.INSTANCE;
            case 1:
                Density density = (Density) obj6;
                Function2 function2 = (Function2) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) ((MutableState) obj3).getValue();
                if (layoutCoordinates2 != null) {
                    function2.invoke(Integer.valueOf((int) (((Float.intBitsToFloat((int) (layoutCoordinates.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)) + ((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax))) - density.mo236toPx0680j_4(16.0f)) - Float.intBitsToFloat((int) (layoutCoordinates2.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)))), Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue()));
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj6;
                PoolCategory poolCategory = (PoolCategory) obj5;
                Function1 function12 = (Function1) obj4;
                PoolListNuxAssets poolListNuxAssets = (PoolListNuxAssets) obj3;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                if (list.isEmpty()) {
                    obj2 = null;
                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new PoolListSectionKt$$ExternalSyntheticLambda2(poolCategory, r15 == true ? 1 : 0), true, -2112152416), 3);
                } else {
                    for (Object obj7 : list) {
                        int i14 = r15 + 1;
                        if (r15 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        PoolSection poolSection = (PoolSection) obj7;
                        LazyListScope.item$default(lazyListScope, null, null, PoolToastKt.f572lambda$1991026917, 3);
                        LazyListScope.stickyHeader$default(lazyListScope, null, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(poolSection, 19), true, -226926297), 3);
                        ArrayList arrayList = poolSection.poolsList;
                        lazyListScope.items(arrayList.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(17, arrayList), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(arrayList, function12, poolCategory, 13), true, 802480018));
                        r15 = i14;
                    }
                    obj2 = null;
                }
                if (poolCategory == PoolCategory.ACTIVE) {
                    LazyListScope.item$default(lazyListScope, obj2, obj2, new ComposableLambdaImpl(new ProfileKt$$ExternalSyntheticLambda1(21, list, poolListNuxAssets), true, -1102461303), 3);
                }
                return Unit.INSTANCE;
            case 3:
                EarningsHeaderPresenter earningsHeaderPresenter = (EarningsHeaderPresenter) obj6;
                FlowStarter flowStarter = (FlowStarter) earningsHeaderPresenter.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) earningsHeaderPresenter.nowAtEntry;
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj5;
                State state = (State) obj4;
                State state2 = (State) obj3;
                PersonalInfoSectionViewEvent personalInfoSectionViewEvent = (PersonalInfoSectionViewEvent) obj;
                personalInfoSectionViewEvent.getClass();
                if (personalInfoSectionViewEvent.equals(PersonalInfoSectionViewEvent.AddressClick.INSTANCE)) {
                    GlobalAddress globalAddress = (GlobalAddress) state.getValue();
                    if (globalAddress == null) {
                        screenNavigator.goTo(FlowStarter.startSetAddressFlow$default(flowStarter, 3));
                    } else {
                        screenNavigator.goTo(new ProfileScreens.ProfileAddressSheet(globalAddress));
                    }
                } else if (personalInfoSectionViewEvent.equals(PersonalInfoSectionViewEvent.ShowLegalNameHelperSection.INSTANCE)) {
                    InputtedLegalName inputtedLegalName = (InputtedLegalName) state2.getValue();
                    inputtedLegalName.getClass();
                    String str = inputtedLegalName.support_article_url_to_change;
                    RealRouter realRouter = (RealRouter) earningsHeaderPresenter.currentMonthFilter;
                    ProfileScreens.AccountInfoScreen accountInfoScreen = (ProfileScreens.AccountInfoScreen) earningsHeaderPresenter.nowAtEntryDate;
                    if (!realRouter.route(new RoutingParams(accountInfoScreen, null, accountInfoScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str)) {
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Unsupported or malformed URL: ", str), new Object[0]);
                    }
                } else if (personalInfoSectionViewEvent instanceof PersonalInfoSectionViewEvent.BannerCtaClick) {
                    Analytics analytics = (Analytics) earningsHeaderPresenter.moneyFormatter;
                    VerificationType verificationType = VerificationType.KYC;
                    Source source = Source.SECURITY_AND_PRIVACY;
                    analytics.track(new IdentityConfirmTap(), null);
                    RetailerType.Companion companion = RefreshType.Companion;
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).confirmPersonalInformationRefreshFlow());
                } else {
                    if (!personalInfoSectionViewEvent.equals(PersonalInfoSectionViewEvent.IdentityVerificationClick.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    StateFlowKt.emitOrThrow(mutableSharedFlow, IdentityVerificationSectionViewEvent$IdentityVerificationClick.INSTANCE);
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function13 = (Function1) obj6;
                Shaker shaker = (Shaker) obj5;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj4;
                View view = (View) obj3;
                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton transferButton = (SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton) obj;
                transferButton.getClass();
                SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior onPressBehavior = transferButton.onPressBehavior;
                if (onPressBehavior instanceof SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.SendEvent) {
                    function13.invoke(((SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.SendEvent) onPressBehavior).event);
                } else {
                    if (!(onPressBehavior instanceof SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.Shake)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    shaker.shake();
                    if (accessibilityManager.isEnabled() || ((SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.Shake) onPressBehavior).accessibilityAnnouncement != null) {
                        view.announceForAccessibility(((SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons.TransferButton.OnPressBehavior.Shake) onPressBehavior).accessibilityAnnouncement);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                Text text = (Text) obj6;
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = (SquareLoyaltyDetailsView) obj5;
                FigmaTextView figmaTextView = (FigmaTextView) obj;
                figmaTextView.getClass();
                String str2 = text.text;
                str2.getClass();
                Context context = squareLoyaltyDetailsView.getContext();
                context.getClass();
                figmaTextView.setText(InputEventTrigger.Companion.markdownToSpanned$default(str2, context, new ScoreHomeKt$$ExternalSyntheticLambda5(i8, (Function1) obj3), 14));
                Strings.applyStyle(figmaTextView, (TextThemeInfo) obj4);
                Color color = text.text_color;
                color.getClass();
                Integer forTheme = DimensionKt.forTheme(new ColorModel.Accented(color), ThemeHelpersKt.themeInfo(squareLoyaltyDetailsView));
                forTheme.getClass();
                int intValue = forTheme.intValue();
                figmaTextView.setTextColor(intValue);
                figmaTextView.setLinkTextColor(intValue);
                return Unit.INSTANCE;
            case 6:
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                Function1 function14 = (Function1) obj4;
                Function1 function15 = (Function1) obj3;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                for (ShopHubResultsListItem shopHubResultsListItem : (List) obj6) {
                    if (shopHubResultsListItem instanceof ShopHubResultsListItem.EmptyResult) {
                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, "EMPTY_RESULT", new ChatView$$ExternalSyntheticLambda2(3), new ComposableLambdaImpl(new TaxReturnsViewKt$$ExternalSyntheticLambda5((ShopHubResultsListItem.EmptyResult) shopHubResultsListItem, i13), true, -1369088600), 4);
                    } else {
                        if (!(shopHubResultsListItem instanceof ShopHubResultsListItem.ProgressIndicator)) {
                            if (shopHubResultsListItem instanceof ShopHubResultsListItem.Results) {
                                for (DirectoryListItem directoryListItem : ((ShopHubResultsListItem.Results) shopHubResultsListItem).results) {
                                    if (directoryListItem instanceof DirectoryListItem.Header) {
                                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, itemViewModel, new ChatView$$ExternalSyntheticLambda2(i12), new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(15, (DirectoryListItem.Header) directoryListItem, function14, realImageLoader), true, -1620820479), i10);
                                        i2 = i9;
                                        i3 = i12;
                                        function1 = function15;
                                    } else {
                                        if (directoryListItem instanceof DirectoryListItem.RowSectionViewModel) {
                                            DirectoryListItem.RowSectionViewModel rowSectionViewModel = (DirectoryListItem.RowSectionViewModel) directoryListItem;
                                            ArrayList arrayList2 = rowSectionViewModel.items;
                                            VorbisUtil$Mode vorbisUtil$Mode = rowSectionViewModel.$$delegate_0;
                                            vorbisUtil$Mode.getClass();
                                            if (!vorbisUtil$Mode.blockFlag) {
                                                ShopMessageKt.ShopHubResultsList$trackEvent(function14, new DirectoryViewEvent.DirectoryItemViewEvent.SectionView(((DirectoryListItem.ItemViewModel) arrayList2.get(0)).analyticsData), itemViewModel);
                                                vorbisUtil$Mode.blockFlag = true;
                                            }
                                            ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda8 = new ScoreHomeKt$$ExternalSyntheticLambda8(function14, (boolean) r15, 21);
                                            realImageLoader.getClass();
                                            zzz.sectionItemsIndexed(lazyGridIntervalContent, arrayList2, rowSectionViewModel.layout, new ComposableLambdaImpl(new UiContainer$$ExternalSyntheticLambda33(i13, realImageLoader, scoreHomeKt$$ExternalSyntheticLambda8), true, 1938783240));
                                            i2 = i9;
                                            function1 = function15;
                                        } else if (directoryListItem instanceof DirectoryListItem.TextRowSectionViewModel) {
                                            DirectoryListItem.TextRowSectionViewModel textRowSectionViewModel = (DirectoryListItem.TextRowSectionViewModel) directoryListItem;
                                            ArrayList arrayList3 = textRowSectionViewModel.items;
                                            ShopHubResultsListKt$$ExternalSyntheticLambda14 shopHubResultsListKt$$ExternalSyntheticLambda14 = new ShopHubResultsListKt$$ExternalSyntheticLambda14(r15 == true ? 1 : 0);
                                            int size = arrayList3.size();
                                            ButtonKt$Button$2.AnonymousClass1 anonymousClass1 = new ButtonKt$Button$2.AnonymousClass1(17, shopHubResultsListKt$$ExternalSyntheticLambda14, arrayList3);
                                            BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2 borrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2 = new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(21, arrayList3);
                                            RealImageLoader realImageLoader2 = realImageLoader;
                                            NavHostKt$NavHost$32 navHostKt$NavHost$32 = new NavHostKt$NavHost$32(arrayList3, function14, function15, textRowSectionViewModel, realImageLoader2, 4);
                                            function1 = function15;
                                            lazyGridIntervalContent.items(size, null, anonymousClass1, borrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2, new ComposableLambdaImpl(navHostKt$NavHost$32, true, -1942245546));
                                            realImageLoader = realImageLoader2;
                                            i2 = 6;
                                        } else {
                                            final RealImageLoader realImageLoader3 = realImageLoader;
                                            function1 = function15;
                                            if (directoryListItem instanceof DirectoryListItem.AvatarSectionViewModel) {
                                                final DirectoryListItem.AvatarSectionViewModel avatarSectionViewModel = (DirectoryListItem.AvatarSectionViewModel) directoryListItem;
                                                ArrayList arrayList4 = avatarSectionViewModel.items;
                                                final ?? scoreHomeKt$$ExternalSyntheticLambda82 = new ScoreHomeKt$$ExternalSyntheticLambda8(function14, (boolean) r15, 22);
                                                realImageLoader3.getClass();
                                                Section.Layout layout = avatarSectionViewModel.layout;
                                                VorbisUtil$Mode vorbisUtil$Mode2 = avatarSectionViewModel.$$delegate_0;
                                                vorbisUtil$Mode2.getClass();
                                                if (!vorbisUtil$Mode2.blockFlag) {
                                                    DirectoryListItem.ItemViewModel itemViewModel2 = (DirectoryListItem.ItemViewModel) arrayList4.get(0);
                                                    scoreHomeKt$$ExternalSyntheticLambda82.invoke(new DirectoryViewEvent.DirectoryItemViewEvent.SectionView(itemViewModel2.analyticsData), itemViewModel2);
                                                    vorbisUtil$Mode2.blockFlag = true;
                                                }
                                                switch (layout) {
                                                    case ONE_ROW:
                                                    case TWO_ROWS:
                                                    case THREE_ROWS:
                                                    case FOUR_ROWS:
                                                        i5 = 0;
                                                        final int i15 = 1;
                                                        zzz.sectionItemsIndexed(lazyGridIntervalContent, arrayList4, layout, new ComposableLambdaImpl(new Function6() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda0
                                                            /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
                                                            /* JADX WARN: Removed duplicated region for block: B:80:0x0242 A[ADDED_TO_REGION] */
                                                            @Override // kotlin.jvm.functions.Function6
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                                                                boolean z2;
                                                                PaddingValuesImpl m297PaddingValuesa9UjIt4$default;
                                                                boolean changedInstance;
                                                                Object rememberedValue;
                                                                Function1 function16;
                                                                PaddingValuesImpl paddingValuesImpl;
                                                                boolean changedInstance2;
                                                                Object rememberedValue2;
                                                                int i16 = i15;
                                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                                Function2 function22 = scoreHomeKt$$ExternalSyntheticLambda82;
                                                                DirectoryListItem directoryListItem2 = avatarSectionViewModel;
                                                                final RealImageLoader realImageLoader4 = realImageLoader3;
                                                                final int i17 = i5;
                                                                final int i18 = 1;
                                                                switch (i16) {
                                                                    case 0:
                                                                        DirectoryListItem.CardSectionViewModel cardSectionViewModel = (DirectoryListItem.CardSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda83 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue2 = ((Integer) obj9).intValue();
                                                                        int intValue3 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel3 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue4 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel3.getClass();
                                                                        GapComposer gapComposer = (GapComposer) ((Composer) obj12);
                                                                        boolean changed = gapComposer.changed(i17) | gapComposer.changedInstance(realImageLoader4);
                                                                        Object rememberedValue3 = gapComposer.rememberedValue();
                                                                        if (changed || rememberedValue3 == neverEqualPolicy) {
                                                                            final int i19 = 0;
                                                                            rememberedValue3 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i20 = i19;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i21 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i20) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i21);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i21);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer.updateRememberedValue(rememberedValue3);
                                                                        }
                                                                        Function1 function17 = (Function1) rememberedValue3;
                                                                        int size2 = cardSectionViewModel.items.size();
                                                                        int i20 = intValue4 & 112;
                                                                        Density density2 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 != 0) {
                                                                            if (i17 != 1) {
                                                                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                                break;
                                                                            } else if (intValue3 == 1) {
                                                                                m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(20.0f, intValue2 == 0 ? 12.0f : RecyclerView.DECELERATION_RATE, 20.0f, 12.0f);
                                                                                z2 = true;
                                                                                Modifier padding = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if (((i20 ^ 48) > 32 || !gapComposer.changed(intValue2)) && (intValue4 & 48) != 32) {
                                                                                    z2 = false;
                                                                                }
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                                                                    rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                                    gapComposer.updateRememberedValue(rememberedValue);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function17, padding, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                int mo230roundToPx0680j_4 = density2.mo230roundToPx0680j_4(16.0f);
                                                                                int i21 = intValue2 % intValue3;
                                                                                z2 = true;
                                                                                m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(density2.mo233toDpu2uoSUM(mo230roundToPx0680j_4 - ((i21 * mo230roundToPx0680j_4) / intValue3)), RecyclerView.DECELERATION_RATE, density2.mo233toDpu2uoSUM(((i21 + 1) * mo230roundToPx0680j_4) / intValue3), 32.0f, 2);
                                                                                Modifier padding2 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if ((i20 ^ 48) > 32) {
                                                                                }
                                                                                z2 = false;
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance) {
                                                                                }
                                                                                rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                                gapComposer.updateRememberedValue(rememberedValue);
                                                                                AndroidView_androidKt.AndroidView(function17, padding2, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                            }
                                                                        } else if (intValue3 == 1) {
                                                                            m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(intValue2 == 0 ? 20.0f : 8.0f, 12.0f, intValue2 != size2 + (-1) ? 8.0f : 20.0f, 12.0f);
                                                                            z2 = true;
                                                                            Modifier padding22 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding22, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        } else {
                                                                            z2 = true;
                                                                            m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(intValue2 / intValue3 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, intValue2 % intValue3 == intValue3 - 1 ? 16.0f : 32.0f, 2);
                                                                            Modifier padding222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        }
                                                                    default:
                                                                        DirectoryListItem.AvatarSectionViewModel avatarSectionViewModel2 = (DirectoryListItem.AvatarSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda84 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue5 = ((Integer) obj9).intValue();
                                                                        int intValue6 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel4 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue7 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel4.getClass();
                                                                        GapComposer gapComposer2 = (GapComposer) ((Composer) obj12);
                                                                        boolean changed2 = gapComposer2.changed(i17) | gapComposer2.changedInstance(realImageLoader4);
                                                                        Object rememberedValue4 = gapComposer2.rememberedValue();
                                                                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                                                            rememberedValue4 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i18;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer2.updateRememberedValue(rememberedValue4);
                                                                        }
                                                                        Function1 function18 = (Function1) rememberedValue4;
                                                                        int size3 = avatarSectionViewModel2.items.size();
                                                                        int i22 = intValue7 & 112;
                                                                        Density density3 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 == 0) {
                                                                            if (intValue6 != 1) {
                                                                                function16 = function18;
                                                                                int ceil = (int) Math.ceil(size3 / intValue6);
                                                                                int i23 = intValue5 % intValue6;
                                                                                int i24 = intValue5 / intValue6;
                                                                                paddingValuesImpl = new PaddingValuesImpl(i24 == 0 ? 20.0f : 16.0f, i23 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, i24 != ceil ? RecyclerView.DECELERATION_RATE : 20.0f, 16.0f);
                                                                                Modifier padding3 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                                changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                                rememberedValue2 = gapComposer2.rememberedValue();
                                                                                if (!changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                                                                    rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function16, padding3, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                paddingValuesImpl = new PaddingValuesImpl(intValue5 == 0 ? 20.0f : 16.0f, 16.0f, intValue5 == size3 - 1 ? 20.0f : RecyclerView.DECELERATION_RATE, 16.0f);
                                                                            }
                                                                        } else if (i17 != 1) {
                                                                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                            break;
                                                                        } else if (intValue6 == 1) {
                                                                            paddingValuesImpl = new PaddingValuesImpl(20.0f, intValue5 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, 20.0f, 16.0f);
                                                                        } else {
                                                                            int mo230roundToPx0680j_42 = density3.mo230roundToPx0680j_4(24.0f);
                                                                            int i25 = intValue5 % intValue6;
                                                                            paddingValuesImpl = new PaddingValuesImpl(density3.mo233toDpu2uoSUM(mo230roundToPx0680j_42 - ((i25 * mo230roundToPx0680j_42) / intValue6)), intValue5 >= intValue6 ? RecyclerView.DECELERATION_RATE : 16.0f, density3.mo233toDpu2uoSUM(((i25 + 1) * mo230roundToPx0680j_42) / intValue6), 36.0f);
                                                                        }
                                                                        function16 = function18;
                                                                        Modifier padding32 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                        changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                        rememberedValue2 = gapComposer2.rememberedValue();
                                                                        if (!changedInstance2) {
                                                                        }
                                                                        rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                                                        AndroidView_androidKt.AndroidView(function16, padding32, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, true, 1365018067));
                                                        realImageLoader = realImageLoader3;
                                                        i2 = 6;
                                                        i10 = 5;
                                                        break;
                                                    case ONE_COLUMN:
                                                    case TWO_COLUMNS:
                                                    case THREE_COLUMNS:
                                                    case FOUR_COLUMNS:
                                                        i5 = 1;
                                                        final int i152 = 1;
                                                        zzz.sectionItemsIndexed(lazyGridIntervalContent, arrayList4, layout, new ComposableLambdaImpl(new Function6() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda0
                                                            /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
                                                            /* JADX WARN: Removed duplicated region for block: B:80:0x0242 A[ADDED_TO_REGION] */
                                                            @Override // kotlin.jvm.functions.Function6
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                                                                boolean z2;
                                                                PaddingValuesImpl m297PaddingValuesa9UjIt4$default;
                                                                boolean changedInstance;
                                                                Object rememberedValue;
                                                                Function1 function16;
                                                                PaddingValuesImpl paddingValuesImpl;
                                                                boolean changedInstance2;
                                                                Object rememberedValue2;
                                                                int i16 = i152;
                                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                                Function2 function22 = scoreHomeKt$$ExternalSyntheticLambda82;
                                                                DirectoryListItem directoryListItem2 = avatarSectionViewModel;
                                                                final RealImageLoader realImageLoader4 = realImageLoader3;
                                                                final int i17 = i5;
                                                                final int i18 = 1;
                                                                switch (i16) {
                                                                    case 0:
                                                                        DirectoryListItem.CardSectionViewModel cardSectionViewModel = (DirectoryListItem.CardSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda83 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue2 = ((Integer) obj9).intValue();
                                                                        int intValue3 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel3 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue4 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel3.getClass();
                                                                        GapComposer gapComposer = (GapComposer) ((Composer) obj12);
                                                                        boolean changed = gapComposer.changed(i17) | gapComposer.changedInstance(realImageLoader4);
                                                                        Object rememberedValue3 = gapComposer.rememberedValue();
                                                                        if (changed || rememberedValue3 == neverEqualPolicy) {
                                                                            final int i19 = 0;
                                                                            rememberedValue3 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i19;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer.updateRememberedValue(rememberedValue3);
                                                                        }
                                                                        Function1 function17 = (Function1) rememberedValue3;
                                                                        int size2 = cardSectionViewModel.items.size();
                                                                        int i20 = intValue4 & 112;
                                                                        Density density2 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 != 0) {
                                                                            if (i17 != 1) {
                                                                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                                break;
                                                                            } else if (intValue3 == 1) {
                                                                                m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(20.0f, intValue2 == 0 ? 12.0f : RecyclerView.DECELERATION_RATE, 20.0f, 12.0f);
                                                                                z2 = true;
                                                                                Modifier padding222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if (((i20 ^ 48) > 32 || !gapComposer.changed(intValue2)) && (intValue4 & 48) != 32) {
                                                                                    z2 = false;
                                                                                }
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                                                                    rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                                    gapComposer.updateRememberedValue(rememberedValue);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function17, padding222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                int mo230roundToPx0680j_4 = density2.mo230roundToPx0680j_4(16.0f);
                                                                                int i21 = intValue2 % intValue3;
                                                                                z2 = true;
                                                                                m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(density2.mo233toDpu2uoSUM(mo230roundToPx0680j_4 - ((i21 * mo230roundToPx0680j_4) / intValue3)), RecyclerView.DECELERATION_RATE, density2.mo233toDpu2uoSUM(((i21 + 1) * mo230roundToPx0680j_4) / intValue3), 32.0f, 2);
                                                                                Modifier padding2222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if ((i20 ^ 48) > 32) {
                                                                                }
                                                                                z2 = false;
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance) {
                                                                                }
                                                                                rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                                gapComposer.updateRememberedValue(rememberedValue);
                                                                                AndroidView_androidKt.AndroidView(function17, padding2222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                            }
                                                                        } else if (intValue3 == 1) {
                                                                            m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(intValue2 == 0 ? 20.0f : 8.0f, 12.0f, intValue2 != size2 + (-1) ? 8.0f : 20.0f, 12.0f);
                                                                            z2 = true;
                                                                            Modifier padding22222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding22222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        } else {
                                                                            z2 = true;
                                                                            m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(intValue2 / intValue3 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, intValue2 % intValue3 == intValue3 - 1 ? 16.0f : 32.0f, 2);
                                                                            Modifier padding222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel3) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda83);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel3, scoreHomeKt$$ExternalSyntheticLambda83, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        }
                                                                    default:
                                                                        DirectoryListItem.AvatarSectionViewModel avatarSectionViewModel2 = (DirectoryListItem.AvatarSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda84 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue5 = ((Integer) obj9).intValue();
                                                                        int intValue6 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel4 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue7 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel4.getClass();
                                                                        GapComposer gapComposer2 = (GapComposer) ((Composer) obj12);
                                                                        boolean changed2 = gapComposer2.changed(i17) | gapComposer2.changedInstance(realImageLoader4);
                                                                        Object rememberedValue4 = gapComposer2.rememberedValue();
                                                                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                                                            rememberedValue4 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i18;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer2.updateRememberedValue(rememberedValue4);
                                                                        }
                                                                        Function1 function18 = (Function1) rememberedValue4;
                                                                        int size3 = avatarSectionViewModel2.items.size();
                                                                        int i22 = intValue7 & 112;
                                                                        Density density3 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 == 0) {
                                                                            if (intValue6 != 1) {
                                                                                function16 = function18;
                                                                                int ceil = (int) Math.ceil(size3 / intValue6);
                                                                                int i23 = intValue5 % intValue6;
                                                                                int i24 = intValue5 / intValue6;
                                                                                paddingValuesImpl = new PaddingValuesImpl(i24 == 0 ? 20.0f : 16.0f, i23 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, i24 != ceil ? RecyclerView.DECELERATION_RATE : 20.0f, 16.0f);
                                                                                Modifier padding32 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                                changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                                rememberedValue2 = gapComposer2.rememberedValue();
                                                                                if (!changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                                                                    rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function16, padding32, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                paddingValuesImpl = new PaddingValuesImpl(intValue5 == 0 ? 20.0f : 16.0f, 16.0f, intValue5 == size3 - 1 ? 20.0f : RecyclerView.DECELERATION_RATE, 16.0f);
                                                                            }
                                                                        } else if (i17 != 1) {
                                                                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                            break;
                                                                        } else if (intValue6 == 1) {
                                                                            paddingValuesImpl = new PaddingValuesImpl(20.0f, intValue5 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, 20.0f, 16.0f);
                                                                        } else {
                                                                            int mo230roundToPx0680j_42 = density3.mo230roundToPx0680j_4(24.0f);
                                                                            int i25 = intValue5 % intValue6;
                                                                            paddingValuesImpl = new PaddingValuesImpl(density3.mo233toDpu2uoSUM(mo230roundToPx0680j_42 - ((i25 * mo230roundToPx0680j_42) / intValue6)), intValue5 >= intValue6 ? RecyclerView.DECELERATION_RATE : 16.0f, density3.mo233toDpu2uoSUM(((i25 + 1) * mo230roundToPx0680j_42) / intValue6), 36.0f);
                                                                        }
                                                                        function16 = function18;
                                                                        Modifier padding322 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                        changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                        rememberedValue2 = gapComposer2.rememberedValue();
                                                                        if (!changedInstance2) {
                                                                        }
                                                                        rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                                                        AndroidView_androidKt.AndroidView(function16, padding322, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, true, 1365018067));
                                                        realImageLoader = realImageLoader3;
                                                        i2 = 6;
                                                        i10 = 5;
                                                        break;
                                                    default:
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                }
                                            } else if (directoryListItem instanceof DirectoryListItem.CardSectionViewModel) {
                                                final DirectoryListItem.CardSectionViewModel cardSectionViewModel = (DirectoryListItem.CardSectionViewModel) directoryListItem;
                                                ArrayList arrayList5 = cardSectionViewModel.items;
                                                final ?? scoreHomeKt$$ExternalSyntheticLambda83 = new ScoreHomeKt$$ExternalSyntheticLambda8(function14, (boolean) r15, 23);
                                                realImageLoader3.getClass();
                                                Section.Layout layout2 = cardSectionViewModel.layout;
                                                VorbisUtil$Mode vorbisUtil$Mode3 = cardSectionViewModel.$$delegate_0;
                                                if (!vorbisUtil$Mode3.blockFlag) {
                                                    DirectoryListItem.ItemViewModel itemViewModel3 = (DirectoryListItem.ItemViewModel) arrayList5.get(0);
                                                    scoreHomeKt$$ExternalSyntheticLambda83.invoke(new DirectoryViewEvent.DirectoryItemViewEvent.SectionView(itemViewModel3.analyticsData), itemViewModel3);
                                                    vorbisUtil$Mode3.blockFlag = true;
                                                }
                                                switch (layout2) {
                                                    case ONE_ROW:
                                                    case TWO_ROWS:
                                                    case THREE_ROWS:
                                                    case FOUR_ROWS:
                                                        i4 = 0;
                                                        final int i16 = 0;
                                                        realImageLoader = realImageLoader3;
                                                        zzz.sectionItemsIndexed(lazyGridIntervalContent, arrayList5, layout2, new ComposableLambdaImpl(new Function6() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda0
                                                            /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
                                                            /* JADX WARN: Removed duplicated region for block: B:80:0x0242 A[ADDED_TO_REGION] */
                                                            @Override // kotlin.jvm.functions.Function6
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                                                                boolean z2;
                                                                PaddingValuesImpl m297PaddingValuesa9UjIt4$default;
                                                                boolean changedInstance;
                                                                Object rememberedValue;
                                                                Function1 function16;
                                                                PaddingValuesImpl paddingValuesImpl;
                                                                boolean changedInstance2;
                                                                Object rememberedValue2;
                                                                int i162 = i16;
                                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                                Function2 function22 = scoreHomeKt$$ExternalSyntheticLambda83;
                                                                DirectoryListItem directoryListItem2 = cardSectionViewModel;
                                                                final RealImageLoader realImageLoader4 = realImageLoader3;
                                                                final int i17 = i4;
                                                                final int i18 = 1;
                                                                switch (i162) {
                                                                    case 0:
                                                                        DirectoryListItem.CardSectionViewModel cardSectionViewModel2 = (DirectoryListItem.CardSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda832 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue2 = ((Integer) obj9).intValue();
                                                                        int intValue3 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel32 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue4 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel32.getClass();
                                                                        GapComposer gapComposer = (GapComposer) ((Composer) obj12);
                                                                        boolean changed = gapComposer.changed(i17) | gapComposer.changedInstance(realImageLoader4);
                                                                        Object rememberedValue3 = gapComposer.rememberedValue();
                                                                        if (changed || rememberedValue3 == neverEqualPolicy) {
                                                                            final int i19 = 0;
                                                                            rememberedValue3 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i19;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer.updateRememberedValue(rememberedValue3);
                                                                        }
                                                                        Function1 function17 = (Function1) rememberedValue3;
                                                                        int size2 = cardSectionViewModel2.items.size();
                                                                        int i20 = intValue4 & 112;
                                                                        Density density2 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 != 0) {
                                                                            if (i17 != 1) {
                                                                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                                break;
                                                                            } else if (intValue3 == 1) {
                                                                                m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(20.0f, intValue2 == 0 ? 12.0f : RecyclerView.DECELERATION_RATE, 20.0f, 12.0f);
                                                                                z2 = true;
                                                                                Modifier padding222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if (((i20 ^ 48) > 32 || !gapComposer.changed(intValue2)) && (intValue4 & 48) != 32) {
                                                                                    z2 = false;
                                                                                }
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                                                                    rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                                    gapComposer.updateRememberedValue(rememberedValue);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function17, padding222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                int mo230roundToPx0680j_4 = density2.mo230roundToPx0680j_4(16.0f);
                                                                                int i21 = intValue2 % intValue3;
                                                                                z2 = true;
                                                                                m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(density2.mo233toDpu2uoSUM(mo230roundToPx0680j_4 - ((i21 * mo230roundToPx0680j_4) / intValue3)), RecyclerView.DECELERATION_RATE, density2.mo233toDpu2uoSUM(((i21 + 1) * mo230roundToPx0680j_4) / intValue3), 32.0f, 2);
                                                                                Modifier padding2222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if ((i20 ^ 48) > 32) {
                                                                                }
                                                                                z2 = false;
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance) {
                                                                                }
                                                                                rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                                gapComposer.updateRememberedValue(rememberedValue);
                                                                                AndroidView_androidKt.AndroidView(function17, padding2222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                            }
                                                                        } else if (intValue3 == 1) {
                                                                            m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(intValue2 == 0 ? 20.0f : 8.0f, 12.0f, intValue2 != size2 + (-1) ? 8.0f : 20.0f, 12.0f);
                                                                            z2 = true;
                                                                            Modifier padding22222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding22222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        } else {
                                                                            z2 = true;
                                                                            m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(intValue2 / intValue3 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, intValue2 % intValue3 == intValue3 - 1 ? 16.0f : 32.0f, 2);
                                                                            Modifier padding222222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding222222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        }
                                                                    default:
                                                                        DirectoryListItem.AvatarSectionViewModel avatarSectionViewModel2 = (DirectoryListItem.AvatarSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda84 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue5 = ((Integer) obj9).intValue();
                                                                        int intValue6 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel4 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue7 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel4.getClass();
                                                                        GapComposer gapComposer2 = (GapComposer) ((Composer) obj12);
                                                                        boolean changed2 = gapComposer2.changed(i17) | gapComposer2.changedInstance(realImageLoader4);
                                                                        Object rememberedValue4 = gapComposer2.rememberedValue();
                                                                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                                                            rememberedValue4 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i18;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer2.updateRememberedValue(rememberedValue4);
                                                                        }
                                                                        Function1 function18 = (Function1) rememberedValue4;
                                                                        int size3 = avatarSectionViewModel2.items.size();
                                                                        int i22 = intValue7 & 112;
                                                                        Density density3 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 == 0) {
                                                                            if (intValue6 != 1) {
                                                                                function16 = function18;
                                                                                int ceil = (int) Math.ceil(size3 / intValue6);
                                                                                int i23 = intValue5 % intValue6;
                                                                                int i24 = intValue5 / intValue6;
                                                                                paddingValuesImpl = new PaddingValuesImpl(i24 == 0 ? 20.0f : 16.0f, i23 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, i24 != ceil ? RecyclerView.DECELERATION_RATE : 20.0f, 16.0f);
                                                                                Modifier padding322 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                                changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                                rememberedValue2 = gapComposer2.rememberedValue();
                                                                                if (!changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                                                                    rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function16, padding322, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                paddingValuesImpl = new PaddingValuesImpl(intValue5 == 0 ? 20.0f : 16.0f, 16.0f, intValue5 == size3 - 1 ? 20.0f : RecyclerView.DECELERATION_RATE, 16.0f);
                                                                            }
                                                                        } else if (i17 != 1) {
                                                                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                            break;
                                                                        } else if (intValue6 == 1) {
                                                                            paddingValuesImpl = new PaddingValuesImpl(20.0f, intValue5 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, 20.0f, 16.0f);
                                                                        } else {
                                                                            int mo230roundToPx0680j_42 = density3.mo230roundToPx0680j_4(24.0f);
                                                                            int i25 = intValue5 % intValue6;
                                                                            paddingValuesImpl = new PaddingValuesImpl(density3.mo233toDpu2uoSUM(mo230roundToPx0680j_42 - ((i25 * mo230roundToPx0680j_42) / intValue6)), intValue5 >= intValue6 ? RecyclerView.DECELERATION_RATE : 16.0f, density3.mo233toDpu2uoSUM(((i25 + 1) * mo230roundToPx0680j_42) / intValue6), 36.0f);
                                                                        }
                                                                        function16 = function18;
                                                                        Modifier padding3222 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                        changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                        rememberedValue2 = gapComposer2.rememberedValue();
                                                                        if (!changedInstance2) {
                                                                        }
                                                                        rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                                                        AndroidView_androidKt.AndroidView(function16, padding3222, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, true, 2123279942));
                                                        i2 = 6;
                                                        i10 = 5;
                                                        break;
                                                    case ONE_COLUMN:
                                                    case TWO_COLUMNS:
                                                    case THREE_COLUMNS:
                                                    case FOUR_COLUMNS:
                                                        i4 = 1;
                                                        final int i162 = 0;
                                                        realImageLoader = realImageLoader3;
                                                        zzz.sectionItemsIndexed(lazyGridIntervalContent, arrayList5, layout2, new ComposableLambdaImpl(new Function6() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda0
                                                            /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
                                                            /* JADX WARN: Removed duplicated region for block: B:80:0x0242 A[ADDED_TO_REGION] */
                                                            @Override // kotlin.jvm.functions.Function6
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
                                                                boolean z2;
                                                                PaddingValuesImpl m297PaddingValuesa9UjIt4$default;
                                                                boolean changedInstance;
                                                                Object rememberedValue;
                                                                Function1 function16;
                                                                PaddingValuesImpl paddingValuesImpl;
                                                                boolean changedInstance2;
                                                                Object rememberedValue2;
                                                                int i1622 = i162;
                                                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                                Function2 function22 = scoreHomeKt$$ExternalSyntheticLambda83;
                                                                DirectoryListItem directoryListItem2 = cardSectionViewModel;
                                                                final RealImageLoader realImageLoader4 = realImageLoader3;
                                                                final int i17 = i4;
                                                                final int i18 = 1;
                                                                switch (i1622) {
                                                                    case 0:
                                                                        DirectoryListItem.CardSectionViewModel cardSectionViewModel2 = (DirectoryListItem.CardSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda832 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue2 = ((Integer) obj9).intValue();
                                                                        int intValue3 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel32 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue4 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel32.getClass();
                                                                        GapComposer gapComposer = (GapComposer) ((Composer) obj12);
                                                                        boolean changed = gapComposer.changed(i17) | gapComposer.changedInstance(realImageLoader4);
                                                                        Object rememberedValue3 = gapComposer.rememberedValue();
                                                                        if (changed || rememberedValue3 == neverEqualPolicy) {
                                                                            final int i19 = 0;
                                                                            rememberedValue3 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i19;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer.updateRememberedValue(rememberedValue3);
                                                                        }
                                                                        Function1 function17 = (Function1) rememberedValue3;
                                                                        int size2 = cardSectionViewModel2.items.size();
                                                                        int i20 = intValue4 & 112;
                                                                        Density density2 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 != 0) {
                                                                            if (i17 != 1) {
                                                                                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                                break;
                                                                            } else if (intValue3 == 1) {
                                                                                m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(20.0f, intValue2 == 0 ? 12.0f : RecyclerView.DECELERATION_RATE, 20.0f, 12.0f);
                                                                                z2 = true;
                                                                                Modifier padding222222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if (((i20 ^ 48) > 32 || !gapComposer.changed(intValue2)) && (intValue4 & 48) != 32) {
                                                                                    z2 = false;
                                                                                }
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance || rememberedValue == neverEqualPolicy) {
                                                                                    rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                                    gapComposer.updateRememberedValue(rememberedValue);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function17, padding222222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                int mo230roundToPx0680j_4 = density2.mo230roundToPx0680j_4(16.0f);
                                                                                int i21 = intValue2 % intValue3;
                                                                                z2 = true;
                                                                                m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(density2.mo233toDpu2uoSUM(mo230roundToPx0680j_4 - ((i21 * mo230roundToPx0680j_4) / intValue3)), RecyclerView.DECELERATION_RATE, density2.mo233toDpu2uoSUM(((i21 + 1) * mo230roundToPx0680j_4) / intValue3), 32.0f, 2);
                                                                                Modifier padding2222222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                                if ((i20 ^ 48) > 32) {
                                                                                }
                                                                                z2 = false;
                                                                                changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                                rememberedValue = gapComposer.rememberedValue();
                                                                                if (!changedInstance) {
                                                                                }
                                                                                rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                                gapComposer.updateRememberedValue(rememberedValue);
                                                                                AndroidView_androidKt.AndroidView(function17, padding2222222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                            }
                                                                        } else if (intValue3 == 1) {
                                                                            m297PaddingValuesa9UjIt4$default = new PaddingValuesImpl(intValue2 == 0 ? 20.0f : 8.0f, 12.0f, intValue2 != size2 + (-1) ? 8.0f : 20.0f, 12.0f);
                                                                            z2 = true;
                                                                            Modifier padding22222222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding22222222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        } else {
                                                                            z2 = true;
                                                                            m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(intValue2 / intValue3 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, intValue2 % intValue3 == intValue3 - 1 ? 16.0f : 32.0f, 2);
                                                                            Modifier padding222222222222 = SpacerKt.padding(companion2, m297PaddingValuesa9UjIt4$default);
                                                                            if ((i20 ^ 48) > 32) {
                                                                            }
                                                                            z2 = false;
                                                                            changedInstance = gapComposer.changedInstance(itemViewModel32) | z2 | gapComposer.changed(scoreHomeKt$$ExternalSyntheticLambda832);
                                                                            rememberedValue = gapComposer.rememberedValue();
                                                                            if (!changedInstance) {
                                                                            }
                                                                            rememberedValue = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue2, itemViewModel32, scoreHomeKt$$ExternalSyntheticLambda832, 13);
                                                                            gapComposer.updateRememberedValue(rememberedValue);
                                                                            AndroidView_androidKt.AndroidView(function17, padding222222222222, (Function1) rememberedValue, gapComposer, 0, 0);
                                                                        }
                                                                    default:
                                                                        DirectoryListItem.AvatarSectionViewModel avatarSectionViewModel2 = (DirectoryListItem.AvatarSectionViewModel) directoryListItem2;
                                                                        ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda84 = (ScoreHomeKt$$ExternalSyntheticLambda8) function22;
                                                                        int intValue5 = ((Integer) obj9).intValue();
                                                                        int intValue6 = ((Integer) obj10).intValue();
                                                                        DirectoryListItem.ItemViewModel itemViewModel4 = (DirectoryListItem.ItemViewModel) obj11;
                                                                        int intValue7 = ((Integer) obj13).intValue();
                                                                        ((LazyGridItemScopeImpl) obj8).getClass();
                                                                        itemViewModel4.getClass();
                                                                        GapComposer gapComposer2 = (GapComposer) ((Composer) obj12);
                                                                        boolean changed2 = gapComposer2.changed(i17) | gapComposer2.changedInstance(realImageLoader4);
                                                                        Object rememberedValue4 = gapComposer2.rememberedValue();
                                                                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                                                                            rememberedValue4 = new Function1() { // from class: com.squareup.cash.directory_ui.views.CardSectionViewKt$$ExternalSyntheticLambda1
                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public final Object invoke(Object obj14) {
                                                                                    int i202 = i18;
                                                                                    RealImageLoader realImageLoader5 = realImageLoader4;
                                                                                    int i212 = i17;
                                                                                    Context context2 = (Context) obj14;
                                                                                    switch (i202) {
                                                                                        case 0:
                                                                                            context2.getClass();
                                                                                            return new CardItemView(context2, realImageLoader5, i212);
                                                                                        default:
                                                                                            context2.getClass();
                                                                                            return new MooncakeAvatarView(context2, realImageLoader5, i212);
                                                                                    }
                                                                                }
                                                                            };
                                                                            gapComposer2.updateRememberedValue(rememberedValue4);
                                                                        }
                                                                        Function1 function18 = (Function1) rememberedValue4;
                                                                        int size3 = avatarSectionViewModel2.items.size();
                                                                        int i22 = intValue7 & 112;
                                                                        Density density3 = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                                                                        if (i17 == 0) {
                                                                            if (intValue6 != 1) {
                                                                                function16 = function18;
                                                                                int ceil = (int) Math.ceil(size3 / intValue6);
                                                                                int i23 = intValue5 % intValue6;
                                                                                int i24 = intValue5 / intValue6;
                                                                                paddingValuesImpl = new PaddingValuesImpl(i24 == 0 ? 20.0f : 16.0f, i23 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, i24 != ceil ? RecyclerView.DECELERATION_RATE : 20.0f, 16.0f);
                                                                                Modifier padding3222 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                                changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                                rememberedValue2 = gapComposer2.rememberedValue();
                                                                                if (!changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                                                                    rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                                                                }
                                                                                AndroidView_androidKt.AndroidView(function16, padding3222, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                                break;
                                                                            } else {
                                                                                paddingValuesImpl = new PaddingValuesImpl(intValue5 == 0 ? 20.0f : 16.0f, 16.0f, intValue5 == size3 - 1 ? 20.0f : RecyclerView.DECELERATION_RATE, 16.0f);
                                                                            }
                                                                        } else if (i17 != 1) {
                                                                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i17, "Unsupported orientation: "));
                                                                            break;
                                                                        } else if (intValue6 == 1) {
                                                                            paddingValuesImpl = new PaddingValuesImpl(20.0f, intValue5 == 0 ? 16.0f : RecyclerView.DECELERATION_RATE, 20.0f, 16.0f);
                                                                        } else {
                                                                            int mo230roundToPx0680j_42 = density3.mo230roundToPx0680j_4(24.0f);
                                                                            int i25 = intValue5 % intValue6;
                                                                            paddingValuesImpl = new PaddingValuesImpl(density3.mo233toDpu2uoSUM(mo230roundToPx0680j_42 - ((i25 * mo230roundToPx0680j_42) / intValue6)), intValue5 >= intValue6 ? RecyclerView.DECELERATION_RATE : 16.0f, density3.mo233toDpu2uoSUM(((i25 + 1) * mo230roundToPx0680j_42) / intValue6), 36.0f);
                                                                        }
                                                                        function16 = function18;
                                                                        Modifier padding32222 = SpacerKt.padding(companion2, paddingValuesImpl);
                                                                        changedInstance2 = gapComposer2.changedInstance(itemViewModel4) | (((i22 ^ 48) <= 32 && gapComposer2.changed(intValue5)) || (intValue7 & 48) == 32) | gapComposer2.changed(scoreHomeKt$$ExternalSyntheticLambda84);
                                                                        rememberedValue2 = gapComposer2.rememberedValue();
                                                                        if (!changedInstance2) {
                                                                        }
                                                                        rememberedValue2 = new PoolGoalMetKt$$ExternalSyntheticLambda6(intValue5, itemViewModel4, scoreHomeKt$$ExternalSyntheticLambda84, 14);
                                                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                                                        AndroidView_androidKt.AndroidView(function16, padding32222, (Function1) rememberedValue2, gapComposer2, 0, 0);
                                                                }
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, true, 2123279942));
                                                        i2 = 6;
                                                        i10 = 5;
                                                        break;
                                                    default:
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        break;
                                                }
                                            } else {
                                                realImageLoader = realImageLoader3;
                                                if (directoryListItem instanceof DirectoryListItem.CardAvatarSectionViewModel) {
                                                    i = 5;
                                                    LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new ChatView$$ExternalSyntheticLambda2(i11), new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(16, (DirectoryListItem.CardAvatarSectionViewModel) directoryListItem, realImageLoader, function14), true, 945345724), 5);
                                                } else {
                                                    i = 5;
                                                    if (directoryListItem instanceof DirectoryListItem.MessageSectionViewModel) {
                                                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new ChatView$$ExternalSyntheticLambda2(i), new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda5(17, (DirectoryListItem.MessageSectionViewModel) directoryListItem, realImageLoader, function14), true, 1778276285), 5);
                                                    } else if (directoryListItem instanceof DirectoryListItem.Footer) {
                                                        i2 = 6;
                                                        i3 = 2;
                                                        i10 = 5;
                                                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new ChatView$$ExternalSyntheticLambda2(i2), new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda3(i3, (DirectoryListItem.Footer) directoryListItem, function14), true, -1683760450), 5);
                                                    } else if (directoryListItem instanceof DirectoryListItem.ItemViewModel) {
                                                        OptionalProvider$$ExternalSyntheticLambda0.m$1(directoryListItem, "Encountered unsupported model for shopping search view: ");
                                                    } else {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    }
                                                }
                                                i10 = i;
                                                i2 = 6;
                                            }
                                            i3 = 2;
                                        }
                                        i3 = 2;
                                    }
                                    function15 = function1;
                                    i9 = i2;
                                    i12 = i3;
                                    itemViewModel = null;
                                }
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            return null;
                        }
                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, "PROGRESS_INDICATOR", new ChatView$$ExternalSyntheticLambda2(i13), ShopMessageKt.lambda$713213791, 4);
                    }
                    function15 = function15;
                    i9 = i9;
                    i12 = i12;
                    itemViewModel = null;
                }
                return Unit.INSTANCE;
            case 7:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                return new RecurringReloadConfigurationScreen(askedQuestion, new RecurringReloadConfigurationScreen.Mode.Scheduled((RecurringSchedule.Frequency) obj6, (Integer) obj5, (Money) obj4, (RecurringReloadConfigurationScreen.ScheduledStartAt) obj3));
            case 8:
                MutableState mutableState = (MutableState) obj3;
                KeypadAmount keypadAmount = (KeypadAmount) obj6;
                ?? r14 = (MutableState) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                textFieldValue.getClass();
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                if (Intrinsics.areEqual(annotatedString.text, (String) r14.getValue())) {
                    return Unit.INSTANCE;
                }
                String str3 = annotatedString.text;
                r14.setValue(str3);
                str3.getClass();
                Character valueOf = str3.length() != 0 ? Character.valueOf(str3.charAt(str3.length() - 1)) : null;
                if (((TextFieldValue) mutableState2.getValue()).annotatedString.text.length() > str3.length()) {
                    mutableState.setValue(Boolean.FALSE);
                    if (keypadAmount != null) {
                        keypadAmount.onBackspace();
                    }
                } else {
                    CharRange charRange = new CharRange('0', '9');
                    if (valueOf != null && charRange.contains(valueOf.charValue())) {
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            if (keypadAmount != null) {
                                keypadAmount.onLongBackspace();
                            }
                            mutableState.setValue(Boolean.FALSE);
                        }
                        if (keypadAmount != null) {
                            keypadAmount.onDigit(Integer.parseInt(String.valueOf(valueOf)));
                        }
                    } else if (valueOf != null && valueOf.charValue() == '.' && keypadAmount != null) {
                        keypadAmount.onDecimal();
                    }
                }
                if (keypadAmount != null && !keypadAmount.amountText.equals(((TextFieldValue) mutableState2.getValue()).annotatedString.text)) {
                    TextFieldValue textFieldValue2 = (TextFieldValue) mutableState2.getValue();
                    String str4 = keypadAmount.amountText;
                    int length = str4.length();
                    mutableState2.setValue(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue2, str4, SizeKt.TextRange(length, length), 4));
                    r14.setValue(keypadAmount.amountText);
                }
                return Unit.INSTANCE;
            case 9:
                EndpointType endpointType = EndpointType.QR_CODE;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) obj6);
                androidStatement.bindString(1, (String) ((Alias$Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).sync_stateAdapter.encode(endpointType));
                androidStatement.bindString(2, (String) obj5);
                androidStatement.bindLong(3, (Long) obj4);
                return Unit.INSTANCE;
            case 10:
                BlockerScreenSpec blockerScreenSpec = (BlockerScreenSpec) obj6;
                CashTreehouseLayout cashTreehouseLayout = (CashTreehouseLayout) obj5;
                final Navigator navigator = (Navigator) obj4;
                RawFlowService rawFlowService = (RawFlowService) obj3;
                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) obj;
                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.getClass();
                final RealTreehouseNavigatorFactory realTreehouseNavigatorFactory = cashTreehouseLayout.treehouseNavigatorFactory;
                realTreehouseNavigatorFactory.getClass();
                navigator.getClass();
                final RealRouter create$1 = realTreehouseNavigatorFactory.routerFactory.create$1(navigator);
                com.squareup.cash.treehouse.navigation.Navigator navigator2 = new com.squareup.cash.treehouse.navigation.Navigator() { // from class: com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory$create$1
                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final void navigateBack() {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        MainDispatcherLoader.dispatcher.dispatch(EmptyCoroutineContext.INSTANCE, new Task$$ExternalSyntheticLambda0(Navigator.this, 3));
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object navigateBackSuspending(Continuation continuation) {
                        Navigator.this.goTo(Back.INSTANCE);
                        return Unit.INSTANCE;
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object navigateToUrl(String str5, TreehouseRoutingParams treehouseRoutingParams, Continuation continuation) {
                        if (StringsKt__StringsJVMKt.startsWith(str5, "/", false)) {
                            str5 = "https://internal.cash.app".concat(str5);
                        }
                        String str6 = str5;
                        RealTreehouseNavigatorFactory realTreehouseNavigatorFactory2 = realTreehouseNavigatorFactory;
                        return JobKt.withContext(realTreehouseNavigatorFactory2.uiDispatcher, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(create$1, str6, realTreehouseNavigatorFactory2, treehouseRoutingParams, (Continuation) null, 7), continuation);
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object startFlow(FlowSpec flowSpec, Continuation continuation) {
                        Screen screen;
                        RealTreehouseNavigatorFactory realTreehouseNavigatorFactory2 = realTreehouseNavigatorFactory;
                        FlowStarter flowStarter2 = realTreehouseNavigatorFactory2.flowStarter;
                        BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                        ClientRouteUrl clientRouteUrl = flowSpec.exitScreen;
                        if (clientRouteUrl == null || (screen = realTreehouseNavigatorFactory2.toScreen(clientRouteUrl)) == null) {
                            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                        }
                        ScenarioPlan scenarioPlan = (ScenarioPlan) ScenarioPlan.ADAPTER.decode(flowSpec.scenarioPlan);
                        Integer num = flowSpec.clientScenarioInt;
                        ClientScenario fromValue = num != null ? ClientScenario.INSTANCE.fromValue(num.intValue()) : null;
                        String str5 = flowSpec.flowToken;
                        BlockersData.AnalyticsData.Source.Companion companion2 = BlockersData.AnalyticsData.Source.INSTANCE;
                        String str6 = flowSpec.sourceAnalyticsName;
                        companion2.getClass();
                        BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str6);
                        fromString.getClass();
                        Navigator.this.goTo(realTreehouseNavigatorFactory2.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(flowStarter2, flow, screen, scenarioPlan, fromValue, str5, null, new BlockersData.AnalyticsData(fromString, (String) null, 6), null, new TaxWebAppBridge$$ExternalSyntheticLambda1(26), 320)));
                        return Unit.INSTANCE;
                    }
                };
                CashTreehouseLayout.TreehouseHostViewService treehouseHostViewService = cashTreehouseLayout.hostViewService;
                blockerScreenSpec.getClass();
                treehouseHostViewService.getClass();
                rawFlowService.getClass();
                Object call = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService, 3, blockerScreenSpec, navigator2, treehouseHostViewService, rawFlowService);
                call.getClass();
                return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call;
            case 11:
                CashTreehouseLayout cashTreehouseLayout2 = (CashTreehouseLayout) obj5;
                final Navigator navigator3 = (Navigator) obj4;
                String str5 = (String) obj6;
                ByteString byteString = (ByteString) obj3;
                PathRoutableAppService$Companion$Adapter$GeneratedOutboundService pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2 = (PathRoutableAppService$Companion$Adapter$GeneratedOutboundService) obj;
                pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.getClass();
                final RealTreehouseNavigatorFactory realTreehouseNavigatorFactory2 = cashTreehouseLayout2.treehouseNavigatorFactory;
                realTreehouseNavigatorFactory2.getClass();
                navigator3.getClass();
                final RealRouter create$12 = realTreehouseNavigatorFactory2.routerFactory.create$1(navigator3);
                com.squareup.cash.treehouse.navigation.Navigator navigator4 = new com.squareup.cash.treehouse.navigation.Navigator() { // from class: com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory$create$1
                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final void navigateBack() {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        MainDispatcherLoader.dispatcher.dispatch(EmptyCoroutineContext.INSTANCE, new Task$$ExternalSyntheticLambda0(Navigator.this, 3));
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object navigateBackSuspending(Continuation continuation) {
                        Navigator.this.goTo(Back.INSTANCE);
                        return Unit.INSTANCE;
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object navigateToUrl(String str52, TreehouseRoutingParams treehouseRoutingParams, Continuation continuation) {
                        if (StringsKt__StringsJVMKt.startsWith(str52, "/", false)) {
                            str52 = "https://internal.cash.app".concat(str52);
                        }
                        String str6 = str52;
                        RealTreehouseNavigatorFactory realTreehouseNavigatorFactory22 = realTreehouseNavigatorFactory2;
                        return JobKt.withContext(realTreehouseNavigatorFactory22.uiDispatcher, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(create$12, str6, realTreehouseNavigatorFactory22, treehouseRoutingParams, (Continuation) null, 7), continuation);
                    }

                    @Override // com.squareup.cash.treehouse.navigation.Navigator
                    public final Object startFlow(FlowSpec flowSpec, Continuation continuation) {
                        Screen screen;
                        RealTreehouseNavigatorFactory realTreehouseNavigatorFactory22 = realTreehouseNavigatorFactory2;
                        FlowStarter flowStarter2 = realTreehouseNavigatorFactory22.flowStarter;
                        BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                        ClientRouteUrl clientRouteUrl = flowSpec.exitScreen;
                        if (clientRouteUrl == null || (screen = realTreehouseNavigatorFactory22.toScreen(clientRouteUrl)) == null) {
                            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                        }
                        ScenarioPlan scenarioPlan = (ScenarioPlan) ScenarioPlan.ADAPTER.decode(flowSpec.scenarioPlan);
                        Integer num = flowSpec.clientScenarioInt;
                        ClientScenario fromValue = num != null ? ClientScenario.INSTANCE.fromValue(num.intValue()) : null;
                        String str52 = flowSpec.flowToken;
                        BlockersData.AnalyticsData.Source.Companion companion2 = BlockersData.AnalyticsData.Source.INSTANCE;
                        String str6 = flowSpec.sourceAnalyticsName;
                        companion2.getClass();
                        BlockersData.AnalyticsData.Source fromString = BlockersData.AnalyticsData.Source.Companion.fromString(str6);
                        fromString.getClass();
                        Navigator.this.goTo(realTreehouseNavigatorFactory22.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(flowStarter2, flow, screen, scenarioPlan, fromValue, str52, null, new BlockersData.AnalyticsData(fromString, (String) null, 6), null, new TaxWebAppBridge$$ExternalSyntheticLambda1(26), 320)));
                        return Unit.INSTANCE;
                    }
                };
                try {
                    try {
                        CashTreehouseLayout.TreehouseHostViewService treehouseHostViewService2 = cashTreehouseLayout2.hostViewService;
                        str5.getClass();
                        Object call2 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 0, str5, byteString, navigator4, treehouseHostViewService2);
                        call2.getClass();
                        return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call2;
                    } catch (ZiplineApiMismatchException unused) {
                        str5.getClass();
                        Object call3 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 1, str5, byteString, navigator4);
                        call3.getClass();
                        return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call3;
                    }
                } catch (ZiplineApiMismatchException unused2) {
                    str5.getClass();
                    Object call4 = pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2.callHandler.call(pathRoutableAppService$Companion$Adapter$GeneratedOutboundService2, 2, str5, navigator4);
                    call4.getClass();
                    return (ZiplineTreehouseUi$Companion$Adapter$GeneratedOutboundService) call4;
                }
            case 12:
                JobKt.launch$default((CoroutineScope) obj6, null, null, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(obj, obj5, (MutableState) obj3, (MutableState) obj4, (Continuation) null, 12), 3);
                return Unit.INSTANCE;
            case 13:
                EntityType entityType = (EntityType) obj4;
                String str6 = (String) obj6;
                EntityType entityType2 = (EntityType) obj3;
                String str7 = (String) obj5;
                Membership membership = (Membership) obj;
                membership.getClass();
                EntityReference entityReference = membership.fromReference;
                if (entityReference.entityType == entityType && Intrinsics.areEqual(entityReference.id, str6)) {
                    EntityReference entityReference2 = membership.toReference;
                    if (entityReference2.entityType == entityType2 && Intrinsics.areEqual(entityReference2.id, str7)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                ConfirmationChallengeBridgeHandler confirmationChallengeBridgeHandler = (ConfirmationChallengeBridgeHandler) obj3;
                String str8 = (String) obj6;
                Context context2 = (Context) obj;
                context2.getClass();
                IntentConfirmationChallengeWebView intentConfirmationChallengeWebView = (IntentConfirmationChallengeWebView) ((Function1) obj5).invoke(context2);
                intentConfirmationChallengeWebView.setWebViewClient((WebViewClient) ((Function0) obj4).invoke());
                confirmationChallengeBridgeHandler.getClass();
                intentConfirmationChallengeWebView.addJavascriptInterface(confirmationChallengeBridgeHandler, "Android");
                str8.getClass();
                WebSettings settings = intentConfirmationChallengeWebView.getSettings();
                String userAgentString = intentConfirmationChallengeWebView.getSettings().getUserAgentString();
                if (userAgentString == null) {
                    userAgentString = "";
                }
                settings.setUserAgentString(userAgentString + " [" + str8 + "]");
                intentConfirmationChallengeWebView.loadUrl("https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1");
                return intentConfirmationChallengeWebView;
            case 15:
                Function1 function16 = (Function1) obj4;
                List list2 = (List) obj3;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1((ConsentState.Payload) obj6, 17), true, 1612536507), 3);
                LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new WorkTitleBarViewKt$$ExternalSyntheticLambda4(16, obj5, function16), true, -1566980558), 3);
                lazyListScope2.items(list2.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list2, 18), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(21, function16, list2), true, 802480018));
                return Unit.INSTANCE;
            case 16:
                Async async = (Async) obj5;
                Function1 function17 = (Function1) obj4;
                Function0 function0 = (Function0) obj3;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) ((Async) obj6).invoke();
                if (payload != null) {
                    LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(payload, 20), true, -122728680), 3);
                    List list3 = payload.accounts;
                    lazyListScope3.items(list3.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list3, 22), new ComposableLambdaImpl(new InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(list3, payload, async, function17, 5), true, 802480018));
                    LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new BufferedChannel$$ExternalSyntheticLambda4(i7, payload, async, function0), true, -2117045745), 3);
                } else {
                    LazyListScope.item$default(lazyListScope3, null, null, LinkAccountPickerScreenKt.lambda$1590876224, 3);
                    LazyListScope.items$default(lazyListScope3, 3, null, LinkAccountPickerScreenKt.f806lambda$775726903, 6);
                }
                return Unit.INSTANCE;
            case 17:
                Async async2 = (Async) obj6;
                NetworkingLinkVerificationState.Payload payload2 = (NetworkingLinkVerificationState.Payload) obj5;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(payload2, 21), true, 1679613299), 3);
                LazyListScope.item$default(lazyListScope4, null, null, new ComposableLambdaImpl(new BasicShieetScope$$ExternalSyntheticLambda0((FocusRequester) obj4, payload2, async2, (MutableState) obj3, 14), true, 1180786524), 3);
                if (async2 instanceof Async.Loading) {
                    LazyListScope.item$default(lazyListScope4, null, null, NetworkingLinkVerificationScreenKt.lambda$1193599160, 3);
                }
                return Unit.INSTANCE;
            case 18:
                Async async3 = (Async) obj6;
                NetworkingSaveToLinkVerificationState.Payload payload3 = (NetworkingSaveToLinkVerificationState.Payload) obj5;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new CardAppletTile$$ExternalSyntheticLambda1(payload3, 22), true, -1279854810), 3);
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new BasicShieetScope$$ExternalSyntheticLambda0((FocusRequester) obj4, payload3, async3, (MutableState) obj3, 15), true, 601289103), 3);
                if (async3 instanceof Async.Loading) {
                    LazyListScope.item$default(lazyListScope5, null, null, NetworkingSaveToLinkVerificationScreenKt.lambda$1291129067, 3);
                }
                return Unit.INSTANCE;
            case 19:
                DocumentWorkflow documentWorkflow = (DocumentWorkflow) obj6;
                DocumentWorkflow.State.UploadState.UploadFiles uploadFiles = (DocumentWorkflow.State.UploadState.UploadFiles) obj5;
                DocumentFile.Local local = (DocumentFile.Local) obj4;
                DocumentWorkflow.Input input = (DocumentWorkflow.Input) obj3;
                DocumentFileUploadWorker.Response response = (DocumentFileUploadWorker.Response) obj;
                response.getClass();
                if (response instanceof DocumentFileUploadWorker.Response.Success) {
                    return Workflows.action$default(documentWorkflow, new HCaptcha$$ExternalSyntheticLambda1(7, uploadFiles, response));
                }
                if (response instanceof DocumentFileUploadWorker.Response.ProgressUpdate) {
                    return Workflows.action$default(documentWorkflow, new HCaptcha$$ExternalSyntheticLambda1(i7, local, response));
                }
                if (response instanceof DocumentFileUploadWorker.Response.DocumentUploadError) {
                    return Workflows.action$default(documentWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda78(local, uploadFiles, response, documentWorkflow, input, 3));
                }
                if (response instanceof DocumentFileUploadWorker.Response.NetworkError) {
                    return Workflows.action$default(documentWorkflow, new HCaptcha$$ExternalSyntheticLambda2(response, 11));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 20:
                DocumentStepStateManager documentStepStateManager = (DocumentStepStateManager) obj6;
                DocumentWorkflow.State.UploadState.UploadFiles uploadFiles2 = (DocumentWorkflow.State.UploadState.UploadFiles) obj5;
                String str9 = uploadFiles2.documentId;
                DocumentFile.Local local2 = (DocumentFile.Local) obj4;
                DocumentWorkflow.Input input2 = (DocumentWorkflow.Input) obj3;
                SubtreeManager subtreeManager = (SubtreeManager) documentStepStateManager.lastChild;
                DocumentWorkflow.State state3 = (DocumentWorkflow.State) subtreeManager.getState();
                if (state3 == null) {
                    return Unit.INSTANCE;
                }
                if (obj instanceof DocumentFileUploadWorker.Response.Success) {
                    List<??> documents = state3.getDocuments();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(documents, 10));
                    for (?? r5 : documents) {
                        DocumentFileUploadWorker.Response.Success success = (DocumentFileUploadWorker.Response.Success) obj;
                        if (Intrinsics.areEqual((Object) r5, success.oldLocalDocument)) {
                            r5 = success.newRemoteDocument;
                        }
                        arrayList6.add(r5);
                    }
                    if (!arrayList6.isEmpty()) {
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            if (((DocumentFile) it.next()) instanceof DocumentFile.Local) {
                                readyToSubmit2 = new DocumentWorkflow.State.UploadState.UploadFiles(str9);
                                subtreeManager.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state3, readyToSubmit2, null, arrayList6, null, 10));
                            }
                        }
                    }
                    readyToSubmit2 = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str9);
                    subtreeManager.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state3, readyToSubmit2, null, arrayList6, null, 10));
                } else if (obj instanceof DocumentFileUploadWorker.Response.ProgressUpdate) {
                    List<??> documents2 = state3.getDocuments();
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(documents2, 10));
                    for (?? r4 : documents2) {
                        if ((r4 instanceof DocumentFile.Local) && r4.equals(local2)) {
                            r4 = DocumentFile.Local.copy$default((DocumentFile.Local) r4, ((DocumentFileUploadWorker.Response.ProgressUpdate) obj).progressPercentage);
                        }
                        arrayList7.add(r4);
                    }
                    subtreeManager.updateState(DocumentWorkflow.State.copyWithUploadState$document_release$default(state3, state3.getUploadState(), null, arrayList7, null, 10));
                } else if (obj instanceof DocumentFileUploadWorker.Response.DocumentUploadError) {
                    ArrayList minus = CollectionsKt.minus(state3.getDocuments(), local2);
                    if (!minus.isEmpty()) {
                        Iterator it2 = minus.iterator();
                        while (it2.hasNext()) {
                            if (((DocumentFile) it2.next()) instanceof DocumentFile.Local) {
                                readyToSubmit = new DocumentWorkflow.State.UploadState.UploadFiles(str9);
                                DocumentWorkflow.State.UploadState uploadState = readyToSubmit;
                                GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse = ((DocumentFileUploadWorker.Response.DocumentUploadError) obj).cause;
                                String str10 = uploadFiles2.documentId;
                                DocumentWorkflow.State.CaptureState captureState = DocumentWorkflow.State.CaptureState.None;
                                subtreeManager.updateState(new DocumentWorkflow.State.ReviewCaptures(minus, str10, uploadState, documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, DocumentUtilsKt.toMessage(documentErrorResponse, documentStepStateManager.applicationContext, input2), 80));
                            }
                        }
                    }
                    readyToSubmit = new DocumentWorkflow.State.UploadState.ReadyToSubmit(str9);
                    DocumentWorkflow.State.UploadState uploadState2 = readyToSubmit;
                    GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse2 = ((DocumentFileUploadWorker.Response.DocumentUploadError) obj).cause;
                    String str102 = uploadFiles2.documentId;
                    DocumentWorkflow.State.CaptureState captureState2 = DocumentWorkflow.State.CaptureState.None;
                    subtreeManager.updateState(new DocumentWorkflow.State.ReviewCaptures(minus, str102, uploadState2, documentErrorResponse2 instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError, DocumentUtilsKt.toMessage(documentErrorResponse2, documentStepStateManager.applicationContext, input2), 80));
                } else if (obj instanceof DocumentFileUploadWorker.Response.NetworkError) {
                    documentStepStateManager.setOutput(new DocumentWorkflow.Output.Errored(((DocumentFileUploadWorker.Response.NetworkError) obj).cause));
                }
                return Unit.INSTANCE;
            case 21:
                GovernmentIdState governmentIdState = (GovernmentIdState) obj6;
                GovernmentIdWorkflow.Input input3 = (GovernmentIdWorkflow.Input) obj5;
                StatefulWorkflow.RenderContext renderContext = (StatefulWorkflow.RenderContext) obj4;
                GovernmentIdWorkflow governmentIdWorkflow = (GovernmentIdWorkflow) obj3;
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj8 = updater.state;
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod = obj8 instanceof GovernmentIdState.ChooseCaptureMethod ? (GovernmentIdState.ChooseCaptureMethod) obj8 : null;
                if (chooseCaptureMethod == null) {
                    return Unit.INSTANCE;
                }
                GovernmentIdState.ChooseCaptureMethod chooseCaptureMethod2 = (GovernmentIdState.ChooseCaptureMethod) governmentIdState;
                IdPart$SideIdPart idPart$SideIdPart = chooseCaptureMethod2.currentPart;
                updater.state = new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart, chooseCaptureMethod2.uploadingIds, chooseCaptureMethod2.captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input3, idPart$SideIdPart.side), chooseCaptureMethod.parts, chooseCaptureMethod.partIndex, GovernmentIdWorkflowUtilsKt.createBackState(updater, true), WebRtcState.Disconnected, input3.videoCaptureConfig.webRtcJwt, null, false, false, chooseCaptureMethod2.countryCode, null, new GovernmentIdWorkflow$$ExternalSyntheticLambda0(renderContext, governmentIdWorkflow, r15 == true ? 1 : 0), 11776);
                return Unit.INSTANCE;
            case 22:
                StatefulWorkflow.RenderContext renderContext2 = (StatefulWorkflow.RenderContext) obj6;
                POPMatchingFactory pOPMatchingFactory = (POPMatchingFactory) obj5;
                final GovernmentIdWorkflow.Input input4 = (GovernmentIdWorkflow.Input) obj4;
                final GovernmentIdState.ReviewImageState reviewImageState = (GovernmentIdState.ReviewImageState) obj3;
                AutoClassifyWorker.Response response2 = (AutoClassifyWorker.Response) obj;
                response2.getClass();
                if (response2 instanceof AutoClassifyWorker.Response.Error) {
                    return Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda38(response2, renderContext2, pOPMatchingFactory, false, 12));
                }
                if (!(response2 instanceof AutoClassifyWorker.Response.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                final AutoClassifyWorker.AutoClassificationResult autoClassificationResult = ((AutoClassifyWorker.Response.Success) response2).autoClassificationResult;
                if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess) {
                    return Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda78(renderContext2, input4, reviewImageState, autoClassificationResult, pOPMatchingFactory));
                }
                if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) {
                    final int i17 = r15 == true ? 1 : 0;
                    return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            GovernmentIdState.ReviewImageState reviewImageState2;
                            Object autoClassificationError;
                            Object autoClassificationError2;
                            int i18 = i17;
                            AutoClassifyWorker.AutoClassificationResult autoClassificationResult2 = autoClassificationResult;
                            GovernmentIdState.ReviewImageState reviewImageState3 = reviewImageState;
                            GovernmentIdWorkflow.Input input5 = input4;
                            switch (i18) {
                                case 0:
                                    WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj9;
                                    updater2.getClass();
                                    Object obj10 = updater2.state;
                                    reviewImageState2 = obj10 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj10 : null;
                                    if (reviewImageState2 != null) {
                                        if (input5.designVersion == DesignVersion.K0000) {
                                            autoClassificationError = ReviewScreenUtilsKt.autoClassificationManualSelectState(reviewImageState2, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult2).idClassesPerCountry, GovernmentIdWorkflowUtilsKt.createBackState(updater2, false));
                                        } else {
                                            GovernmentIdState.ReviewImageState reviewImageState4 = reviewImageState2;
                                            autoClassificationError = new GovernmentIdState.AutoClassificationError(reviewImageState4.getCurrentPart$government_id_release$1(), reviewImageState4.getUploadingIds$government_id_release(), reviewImageState4.getParts$government_id_release(), reviewImageState4.getPartIndex$government_id_release(), GovernmentIdWorkflowUtilsKt.createBackState(updater2, false), reviewImageState4.getCountryCode$government_id_release(), reviewImageState3.getIdForReview().getFrames(), reviewImageState3.getCameraProperties(), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.IdTypeRejected);
                                        }
                                        updater2.state = autoClassificationError;
                                        break;
                                    } else {
                                        break;
                                    }
                                default:
                                    WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj9;
                                    updater3.getClass();
                                    Object obj11 = updater3.state;
                                    reviewImageState2 = obj11 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj11 : null;
                                    if (reviewImageState2 != null) {
                                        if (input5.designVersion == DesignVersion.K0000) {
                                            autoClassificationError2 = ReviewScreenUtilsKt.autoClassificationManualSelectState(reviewImageState2, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult2).idClassesPerCountry, GovernmentIdWorkflowUtilsKt.createBackState(updater3, false));
                                        } else {
                                            GovernmentIdState.ReviewImageState reviewImageState5 = reviewImageState2;
                                            autoClassificationError2 = new GovernmentIdState.AutoClassificationError(reviewImageState5.getCurrentPart$government_id_release$1(), reviewImageState5.getUploadingIds$government_id_release(), reviewImageState5.getParts$government_id_release(), reviewImageState5.getPartIndex$government_id_release(), GovernmentIdWorkflowUtilsKt.createBackState(updater3, false), reviewImageState5.getCountryCode$government_id_release(), reviewImageState3.getIdForReview().getFrames(), reviewImageState3.getCameraProperties(), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.UnableToClassify);
                                        }
                                        updater3.state = autoClassificationError2;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.UnableToClassify) {
                    return Workflows.action$default(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            GovernmentIdState.ReviewImageState reviewImageState2;
                            Object autoClassificationError;
                            Object autoClassificationError2;
                            int i18 = i13;
                            AutoClassifyWorker.AutoClassificationResult autoClassificationResult2 = autoClassificationResult;
                            GovernmentIdState.ReviewImageState reviewImageState3 = reviewImageState;
                            GovernmentIdWorkflow.Input input5 = input4;
                            switch (i18) {
                                case 0:
                                    WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj9;
                                    updater2.getClass();
                                    Object obj10 = updater2.state;
                                    reviewImageState2 = obj10 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj10 : null;
                                    if (reviewImageState2 != null) {
                                        if (input5.designVersion == DesignVersion.K0000) {
                                            autoClassificationError = ReviewScreenUtilsKt.autoClassificationManualSelectState(reviewImageState2, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult2).idClassesPerCountry, GovernmentIdWorkflowUtilsKt.createBackState(updater2, false));
                                        } else {
                                            GovernmentIdState.ReviewImageState reviewImageState4 = reviewImageState2;
                                            autoClassificationError = new GovernmentIdState.AutoClassificationError(reviewImageState4.getCurrentPart$government_id_release$1(), reviewImageState4.getUploadingIds$government_id_release(), reviewImageState4.getParts$government_id_release(), reviewImageState4.getPartIndex$government_id_release(), GovernmentIdWorkflowUtilsKt.createBackState(updater2, false), reviewImageState4.getCountryCode$government_id_release(), reviewImageState3.getIdForReview().getFrames(), reviewImageState3.getCameraProperties(), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.IdTypeRejected);
                                        }
                                        updater2.state = autoClassificationError;
                                        break;
                                    } else {
                                        break;
                                    }
                                default:
                                    WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj9;
                                    updater3.getClass();
                                    Object obj11 = updater3.state;
                                    reviewImageState2 = obj11 instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) obj11 : null;
                                    if (reviewImageState2 != null) {
                                        if (input5.designVersion == DesignVersion.K0000) {
                                            autoClassificationError2 = ReviewScreenUtilsKt.autoClassificationManualSelectState(reviewImageState2, reviewImageState3.getIdForReview().getFrames(), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult2).idClassesPerCountry, GovernmentIdWorkflowUtilsKt.createBackState(updater3, false));
                                        } else {
                                            GovernmentIdState.ReviewImageState reviewImageState5 = reviewImageState2;
                                            autoClassificationError2 = new GovernmentIdState.AutoClassificationError(reviewImageState5.getCurrentPart$government_id_release$1(), reviewImageState5.getUploadingIds$government_id_release(), reviewImageState5.getParts$government_id_release(), reviewImageState5.getPartIndex$government_id_release(), GovernmentIdWorkflowUtilsKt.createBackState(updater3, false), reviewImageState5.getCountryCode$government_id_release(), reviewImageState3.getIdForReview().getFrames(), reviewImageState3.getCameraProperties(), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult2).idClassesPerCountry, AutoClassificationErrorType.UnableToClassify);
                                        }
                                        updater3.state = autoClassificationError2;
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 23:
                CaptureRenderer captureRenderer = (CaptureRenderer) obj6;
                GovernmentIdState.WaitForAutocapture waitForAutocapture = (GovernmentIdState.WaitForAutocapture) obj5;
                GovernmentIdWorkflow.Input input5 = (GovernmentIdWorkflow.Input) obj4;
                StatefulWorkflow.RenderContext renderContext3 = (StatefulWorkflow.RenderContext) obj3;
                WebRtcWorker.Response response3 = (WebRtcWorker.Response) obj;
                response3.getClass();
                CameraChoices bestCameraChoices = Camera2UtilsKt.getBestCameraChoices(captureRenderer.applicationContext, CameraDirection.FRONT);
                if (response3 instanceof WebRtcWorker.Response.Success) {
                    return Workflows.action$default(new HCaptcha$$ExternalSyntheticLambda2(captureRenderer, bestCameraChoices, response3, waitForAutocapture, input5, renderContext3));
                }
                if (response3 instanceof WebRtcWorker.Response.Error) {
                    return Workflows.action$default(new SelfieV1UtilsKt$$ExternalSyntheticLambda4(renderContext3, 6));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 24:
                StatefulWorkflow.RenderContext renderContext4 = (StatefulWorkflow.RenderContext) obj6;
                Throwable th = (Throwable) obj;
                th.getClass();
                renderContext4.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda78((GovernmentIdState) obj5, (GovernmentIdWorkflow.Input) obj4, (Object) th, renderContext4, obj3, 6)));
                return Unit.INSTANCE;
            case 25:
                GovernmentIdState.WaitForAutocapture waitForAutocapture2 = (GovernmentIdState.WaitForAutocapture) obj5;
                CaptureConfig captureConfig = (CaptureConfig) obj4;
                GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) obj3;
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                TrackingEventsLogger.DefaultImpls.logGovernmentIdStateEvent$default(((CaptureRenderer) obj6).trackingEventsLogger, new GovernmentIdStateEventData(GovIdCaptureState.TAKING_PHOTO, GovIdCaptureMethod.AUTO, null, 4, null), false, 2, null);
                Object obj9 = updater2.state;
                GovernmentIdState.WaitForAutocapture waitForAutocapture3 = obj9 instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) obj9 : null;
                if (waitForAutocapture3 == null) {
                    return Unit.INSTANCE;
                }
                updater2.state = new GovernmentIdState.CountdownToCapture(waitForAutocapture2.currentPart, ((GovernmentIdState) obj9).getUploadingIds$government_id_release(), captureConfig, governmentIdImage, waitForAutocapture3.parts, waitForAutocapture3.partIndex, GovernmentIdWorkflowUtilsKt.createBackState(updater2, false), waitForAutocapture3.countryCode, waitForAutocapture3.hint);
                return Unit.INSTANCE;
            case 26:
                SubtreeManager subtreeManager2 = (SubtreeManager) obj6;
                GovernmentIdState.CountdownToCapture countdownToCapture = (GovernmentIdState.CountdownToCapture) obj5;
                GovernmentIdWorkflow.Input input6 = (GovernmentIdWorkflow.Input) obj4;
                POPMatchingFactory pOPMatchingFactory2 = (POPMatchingFactory) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                WorkflowState state4 = subtreeManager2.getState();
                GovernmentIdState.CountdownToCapture countdownToCapture2 = state4 instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) state4 : null;
                if (countdownToCapture2 == null) {
                    return Unit.INSTANCE;
                }
                IdPart$SideIdPart idPart$SideIdPart2 = countdownToCapture.currentPart;
                subtreeManager2.updateState(new GovernmentIdState.WaitForAutocapture(idPart$SideIdPart2, countdownToCapture.uploadingIds, countdownToCapture.captureConfig, GovernmentIdWorkflowUtilsKt.getManualCaptureDefaultState(input6, idPart$SideIdPart2.side), countdownToCapture2.parts, countdownToCapture2.partIndex, GovernmentIdStateManagerUtilsKt.createBackState(subtreeManager2, false), WebRtcState.Disconnected, input6.videoCaptureConfig.webRtcJwt, th2, false, false, countdownToCapture2.countryCode, null, new GovernmentIdStateManagerUtilsKt$$ExternalSyntheticLambda2(subtreeManager2, pOPMatchingFactory2, i12), 11264));
                return Unit.INSTANCE;
            case 27:
                return invoke$com$withpersona$sdk2$inquiry$internal$state$InquiryStateManager$$ExternalSyntheticLambda15(obj);
            case 28:
                BaseRenderContext baseRenderContext = ((StatefulWorkflow.RenderContext) obj5).$$delegate_0;
                PermissionRequestWorkflow permissionRequestWorkflow = (PermissionRequestWorkflow) obj4;
                PermissionRequestWorkflow.Props props = (PermissionRequestWorkflow.Props) obj3;
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                int ordinal = ((DeviceFeatureRequestWorkflow.Output) obj6).deviceFeatureState.result.ordinal();
                if (ordinal == 0) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 4)));
                } else if (ordinal == 1) {
                    permissionRequestWorkflow.complete(updater3, new PermissionState(props.permission, PermissionResult.PermissionRejected));
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 5)));
                }
                return Unit.INSTANCE;
            default:
                SelfieWorkflow selfieWorkflow = (SelfieWorkflow) obj6;
                SelfieAnalyzeWorker.Output output = (SelfieAnalyzeWorker.Output) obj;
                output.getClass();
                return Workflows.action$default(selfieWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda78(output, (SelfieState.StartCapture) obj5, (SelfieWorkflow.Input) obj4, selfieWorkflow, (StatefulWorkflow.RenderContext) obj3, 0));
        }
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(MutableState mutableState, Object obj, Object obj2, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$3 = mutableState;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = mutableState2;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(CashTreehouseLayout cashTreehouseLayout, Navigator navigator, String str, ByteString byteString) {
        this.$r8$classId = 11;
        this.f$1 = cashTreehouseLayout;
        this.f$2 = navigator;
        this.f$0 = str;
        this.f$3 = byteString;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(EntityType entityType, String str, EntityType entityType2, String str2) {
        this.$r8$classId = 13;
        this.f$2 = entityType;
        this.f$0 = str;
        this.f$3 = entityType2;
        this.f$1 = str2;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(int i, Object obj, Object obj2, Object obj3, String str) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$0 = str;
    }

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda9(CoroutineScope coroutineScope, PointerInputScope pointerInputScope, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 12;
        this.f$0 = coroutineScope;
        this.f$1 = pointerInputScope;
        this.f$3 = mutableState;
        this.f$2 = mutableState2;
    }
}
