package androidx.navigation.compose;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState;
import androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.AskedQuestion;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewModel;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.cdf.offline.OfflineTransactionRescheduled;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.core.navigationcontainer.models.MainScreensViewModel$Tab;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.LoyaltyAccountQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.db2.payment.PendingTransferQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.PendingTransferQueries$pendingTransfer$2;
import com.squareup.cash.education.stories.views.EducationStoryWebViewClient;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.views.plugins.TokenRange;
import com.squareup.cash.moneybot.views.plugins.TokenizedText;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.util.android.Views;
import com.squareup.util.android.Views$SCALE$1;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.strings.ResolvableString;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$Output$Complete;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow$State$Starting;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class DialogHostKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda2(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity;
        InstrumentLinkingOption replace;
        InstrumentLinkingOptionsScreen.Option.Icon localIcon;
        String str;
        ?? r2;
        UiState.Displaying displaying;
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 16;
        int i4 = 2;
        boolean z = false;
        boolean z2 = true;
        Object obj2 = this.f$2;
        final boolean z3 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                final NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj3;
                final List list = (List) obj2;
                LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        boolean z4 = z3;
                        List list2 = list;
                        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                        if (z4 && !list2.contains(navBackStackEntry2)) {
                            list2.add(navBackStackEntry2);
                        }
                        if (event == Lifecycle.Event.ON_START && !list2.contains(navBackStackEntry2)) {
                            list2.add(navBackStackEntry2);
                        }
                        if (event == Lifecycle.Event.ON_STOP) {
                            list2.remove(navBackStackEntry2);
                        }
                    }
                };
                navBackStackEntry.impl.lifecycle.addObserver(lifecycleEventObserver);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(8, navBackStackEntry, lifecycleEventObserver);
            case 1:
                ViewfinderExternalSurfaceState viewfinderExternalSurfaceState = (ViewfinderExternalSurfaceState) obj3;
                Function1 function1 = (Function1) obj2;
                ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 = (ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj;
                if (viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.attachedState != viewfinderExternalSurfaceState) {
                    viewfinderExternalSurfaceState.surfaceView = viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1;
                    viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setAttachedState(viewfinderExternalSurfaceState);
                    function1.invoke(viewfinderExternalSurfaceState);
                }
                if (IntSize.m1055equalsimpl0(0L, 0L)) {
                    viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setSizeFromLayout();
                } else {
                    viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setFixedSize(0, 0);
                }
                viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.getHolder().setFormat(z3 ? -1 : -3);
                viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setSecure(false);
                return Unit.INSTANCE;
            case 2:
                PagerState pagerState = (PagerState) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (z3) {
                    PagerKt$$ExternalSyntheticLambda2 pagerKt$$ExternalSyntheticLambda2 = new PagerKt$$ExternalSyntheticLambda2(pagerState, coroutineScope, 0);
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                    semanticsPropertyReceiver.set(SemanticsActions.PageUp, new AccessibilityAction(null, pagerKt$$ExternalSyntheticLambda2));
                    semanticsPropertyReceiver.set(SemanticsActions.PageDown, new AccessibilityAction(null, new PagerKt$$ExternalSyntheticLambda2(pagerState, coroutineScope, 1)));
                } else {
                    PagerKt$$ExternalSyntheticLambda2 pagerKt$$ExternalSyntheticLambda22 = new PagerKt$$ExternalSyntheticLambda2(pagerState, coroutineScope, i4);
                    KProperty[] kPropertyArr2 = SemanticsPropertiesKt.$$delegatedProperties;
                    semanticsPropertyReceiver.set(SemanticsActions.PageLeft, new AccessibilityAction(null, pagerKt$$ExternalSyntheticLambda22));
                    semanticsPropertyReceiver.set(SemanticsActions.PageRight, new AccessibilityAction(null, new PagerKt$$ExternalSyntheticLambda2(pagerState, coroutineScope, i2)));
                }
                return Unit.INSTANCE;
            case 3:
                PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj3;
                ThemeSwitcherViewModel.Loaded loaded = (ThemeSwitcherViewModel.Loaded) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                StringBuilder sb = new StringBuilder();
                if (loaded.selectedTheme == paymentPadTheme) {
                    sb.append("Selected");
                }
                if (z3) {
                    sb.append(loaded.selectedTheme == paymentPadTheme ? ", Locked" : "Locked");
                }
                String sb2 = sb.toString();
                String lowerCase = (paymentPadTheme == PaymentPadTheme.GREEN ? "Default" : paymentPadTheme.name()).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.length() > 0) {
                    lowerCase = Character.toTitleCase(lowerCase.charAt(0)) + lowerCase.substring(1);
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, lowerCase.concat(" Theme"));
                if (sb2.length() > 0) {
                    SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver2, sb2);
                }
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver3, z3);
                if (((MainScreensViewModel$Tab.Icon) obj3) instanceof MainScreensViewModel$Tab.Icon.Text) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str2);
                }
                return Unit.INSTANCE;
            case 5:
                TransferFundsRequest transferFundsRequest = (TransferFundsRequest) obj2;
                RealTransferManager.InternalTransferFundsResult.Failure failure = (RealTransferManager.InternalTransferFundsResult.Failure) obj;
                String reasonDesc = OfflineManagerKt.reasonDesc(failure.failure, true);
                ApiResult.Failure failure2 = failure.failure;
                boolean isRetryable = BundleKt.isRetryable(failure2);
                OfflineManager offlineManager = ((RealTransferManager) obj3).offlineManager;
                if (isRetryable) {
                    RealOfflineManager realOfflineManager = (RealOfflineManager) offlineManager;
                    InstrumentQueries instrumentQueries = realOfflineManager.transferQueries;
                    Timber.Forest forest = Timber.Forest;
                    forest.d(Recorder$$ExternalSyntheticOutline2.m("Updating pending transfer: ", transferFundsRequest.external_id), new Object[0]);
                    RequestContext requestContext = transferFundsRequest.request_context;
                    requestContext.getClass();
                    RetryContext retryContext = requestContext.retry_context;
                    if (retryContext == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Retried transfer must have had a RetryContext");
                        return null;
                    }
                    RetryContext.ErrorContext errorContext = retryContext.error_context;
                    if (errorContext == null) {
                        Long l = retryContext.created_at;
                        l.getClass();
                        errorContext = RealOfflineManager.asErrorContext(failure2, l.longValue());
                    }
                    if (z3) {
                        Long l2 = retryContext.retry_attempt;
                        l2.getClass();
                        long longValue = l2.longValue();
                        forest.d("Re-enqueueing transfer after attempt #" + longValue + ": " + transferFundsRequest.external_id, new Object[0]);
                        long delay = realOfflineManager.getDelay(longValue) + realOfflineManager.clock.millis();
                        String str3 = transferFundsRequest.external_id;
                        str3.getClass();
                        instrumentQueries.getClass();
                        PendingTransferQueries$pendingTransfer$2 pendingTransferQueries$pendingTransfer$2 = PendingTransferQueries$pendingTransfer$2.INSTANCE;
                        PendingTransfer pendingTransfer = (PendingTransfer) new RewardQueries.ForIdsQuery(instrumentQueries, str3, new PendingTransferQueries$$ExternalSyntheticLambda2(instrumentQueries, 1)).executeAsOneOrNull();
                        if (pendingTransfer != null) {
                            Analytics analytics = realOfflineManager.analytics;
                            TransferType transferType = pendingTransfer.f1125type;
                            analytics.track(new OfflineTransactionRescheduled(transferType != null ? RealOfflineManager.toTransactionType(transferType) : null, transferFundsRequest.external_id, Long.valueOf(pendingTransfer.retry_at), Long.valueOf(delay), BundleKt.httpStatusCode(failure2), RealOfflineManager.errorDescription(failure2), realOfflineManager.commonNetworkError(failure2)), null);
                        }
                        Long l3 = errorContext != null ? errorContext.first_request_created_at : null;
                        Long l4 = errorContext != null ? errorContext.first_response_created_at : null;
                        String str4 = errorContext != null ? errorContext.first_error_response : null;
                        String str5 = transferFundsRequest.external_id;
                        str5.getClass();
                        instrumentQueries.driver.execute(-1057711783, "UPDATE pendingTransfer\nSET retry_at = ?,\n    retry_count = ?,\n    first_error_request_created_at = ?,\n    first_error_response_created_at = ?,\n    first_error_response_reason = ?\nWHERE external_id = ?", new LoyaltyAccountQueries$$ExternalSyntheticLambda3(delay, longValue, l3, l4, str4, str5));
                        instrumentQueries.notifyQueries(-1057711783, new OfflineQueries$$ExternalSyntheticLambda1(16));
                    } else {
                        Long l5 = errorContext != null ? errorContext.first_request_created_at : null;
                        Long l6 = errorContext != null ? errorContext.first_response_created_at : null;
                        String str6 = errorContext != null ? errorContext.first_error_response : null;
                        String str7 = transferFundsRequest.external_id;
                        str7.getClass();
                        instrumentQueries.getClass();
                        instrumentQueries.driver.execute(1759787055, "UPDATE pendingTransfer\nSET first_error_request_created_at = ?,\n    first_error_response_created_at = ?,\n    first_error_response_reason = ?\nWHERE external_id = ?", new BankingConfigQueries$$ExternalSyntheticLambda0(l5, l6, str6, str7));
                        instrumentQueries.notifyQueries(1759787055, new OfflineQueries$$ExternalSyntheticLambda1(15));
                    }
                } else {
                    String str8 = transferFundsRequest.external_id;
                    str8.getClass();
                    ((RealOfflineManager) offlineManager).removePendingTransfer(str8, OfflineManager.RemovalReason.NonRetriableError, reasonDesc);
                }
                String str9 = transferFundsRequest.external_id;
                str9.getClass();
                return new TransferManager.TransferFundsResult.Error(str9, new TransferManager.TransferFundsResult.Error.ErrorResult((StatusResult) null, 3));
            case 6:
                Context context = (Context) obj3;
                Function1 function12 = (Function1) obj2;
                ((DisposableEffectScope) obj).getClass();
                if (z3) {
                    activity = null;
                } else {
                    Views$SCALE$1 views$SCALE$1 = Views.SCALE;
                    context.getClass();
                    while (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1(context, "Could not find base activity. Hit ");
                            return null;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        context.getClass();
                    }
                    activity = (Activity) context;
                }
                if (activity != null) {
                    function12.invoke(new FidesmoProvisioningViewEvent.ActivityReady(activity));
                    Window window = activity.getWindow();
                    if (window != null) {
                        window.addFlags(128);
                    }
                }
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(activity, 19);
            case 7:
                InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet showSheet = (InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) obj3;
                boolean z4 = ((InstrumentSelectionBlockerPresenter) obj2).useInstrumentCardArt;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                String str10 = showSheet.title;
                String str11 = showSheet.description;
                ArrayList<InstrumentSelectionBlockerScreen.InstrumentOption> arrayList = showSheet.options;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (InstrumentSelectionBlockerScreen.InstrumentOption instrumentOption : arrayList) {
                    boolean z5 = (z4 && (instrumentOption.action instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace) && instrumentOption.instrumentType != CashInstrumentType.BANK_ACCOUNT) ? z2 : z;
                    String str12 = instrumentOption.title;
                    String str13 = instrumentOption.subtitle;
                    if (str13 == null) {
                        str13 = "";
                    }
                    InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction = instrumentOption.action;
                    if (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Link) {
                        replace = new InstrumentLinkingOption.Link(((InstrumentSelectionBlockerScreen.InstrumentAction.Link) instrumentAction).instrumentType);
                    } else if (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace) {
                        InstrumentSelectionBlockerScreen.InstrumentAction.Replace replace2 = (InstrumentSelectionBlockerScreen.InstrumentAction.Replace) instrumentAction;
                        replace = new InstrumentLinkingOption.ReplaceInstrument(replace2.instrumentType, replace2.instrumentToken);
                    } else {
                        if (!(instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet)) {
                            if ((instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Select) || (instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.None)) {
                                a$$ExternalSyntheticBUOutline0.m$3("Select action is not supported as a sheet option action!");
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            return null;
                        }
                        InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction2 = ((InstrumentSelectionBlockerScreen.InstrumentOption) CollectionsKt.first((List) ((InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) instrumentAction).options)).action;
                        instrumentAction2.getClass();
                        replace = new InstrumentLinkingOption.Replace(((InstrumentSelectionBlockerScreen.InstrumentAction.Replace) instrumentAction2).instrumentType);
                    }
                    InstrumentSelectionBlockerScreen.IconData iconData = instrumentOption.iconData;
                    if (!z5 || (str = iconData.cardImageUrl) == null) {
                        String str14 = iconData.iconUrl;
                        if (str14 != null) {
                            localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon(str14);
                        } else {
                            InstrumentSelectionBlockerScreen.IconData.ArcadeIcon arcadeIcon = iconData.arcadeIcon;
                            if (arcadeIcon == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("IconData must have at least one icon source");
                                return null;
                            }
                            localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon(arcadeIcon.arcadeId);
                        }
                    } else {
                        localIcon = new InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon(str);
                    }
                    arrayList2.add(new InstrumentLinkingOptionsScreen.Option(str12, str13, replace, localIcon));
                    z = false;
                    z2 = true;
                }
                return new InstrumentLinkingOptionsScreen(str10, str11, arrayList2, new InstrumentLinkingOptionsScreen.Mode.Question(askedQuestion), z4 && z3);
            case 8:
                TokenizedText tokenizedText = (TokenizedText) obj3;
                Function1 function13 = (Function1) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                if (z3) {
                    ArrayList<TokenRange> arrayList3 = tokenizedText.tokens;
                    r2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                    for (TokenRange tokenRange : arrayList3) {
                        r2.add(new CustomAccessibilityAction(tokenRange.text, new UtilsKt$$ExternalSyntheticLambda0(i3, function13, tokenRange)));
                    }
                } else {
                    r2 = EmptyList.INSTANCE;
                }
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver4, r2);
                return Unit.INSTANCE;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver5, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver5, (String) obj3, new ToViewKt$$ExternalSyntheticLambda2(1, (Function0) obj2));
                if (!z3) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver5);
                }
                return Unit.INSTANCE;
            case 10:
                WebViewProvider webViewProvider = (WebViewProvider) obj3;
                Function1 function14 = (Function1) obj2;
                Context context2 = (Context) obj;
                context2.getClass();
                if (!z3) {
                    context2 = new ContextThemeWrapper(context2, R.style.Theme.DeviceDefault.DayNight);
                }
                WebView webView = webViewProvider.getWebView(WebViewUseCase.SUPPORT_ARTICLES, context2);
                if (webView == null) {
                    function14.invoke(ArticleViewEvent.NoWebViewProvided.INSTANCE);
                    return new View(context2);
                }
                webView.setWebViewClient(new EducationStoryWebViewClient(1, function14));
                webView.setBackgroundColor(ColorKt.m694toArgb8_81llA(Color.Transparent));
                webView.setScrollContainer(false);
                webView.setVerticalScrollBarEnabled(false);
                return webView;
            case 11:
                SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) obj3;
                MutableState mutableState = (MutableState) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                Function0 function0 = sharedToolbarSwipeScope.transitionProgress;
                PoolDescriptionKt$$ExternalSyntheticLambda3 poolDescriptionKt$$ExternalSyntheticLambda3 = sharedToolbarSwipeScope.isSourceToolbar;
                float floatValue = ((Number) function0.invoke()).floatValue();
                float f = RecyclerView.DECELERATION_RATE;
                float coerceIn = RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f);
                ToolbarTuckTargets toolbarTuckTargets = sharedToolbarSwipeScope.tuckTargets;
                Float f2 = z3 ? (Float) ((ParcelableSnapshotMutableState) toolbarTuckTargets.startCornerCenterX$delegate).getValue() : (Float) ((ParcelableSnapshotMutableState) toolbarTuckTargets.endCornerCenterX$delegate).getValue();
                if (f2 != null && !Float.isNaN(((Number) mutableState.getValue()).floatValue())) {
                    f = f2.floatValue() - ((Number) mutableState.getValue()).floatValue();
                }
                if (((Boolean) poolDescriptionKt$$ExternalSyntheticLambda3.invoke()).booleanValue()) {
                    float ramp = TabToolbarsKt.ramp(coerceIn, 0.85f, 0.925f);
                    reusableGraphicsLayerScope.setTranslationX(f * ramp);
                    float f3 = 1.0f - (ramp * 0.9f);
                    reusableGraphicsLayerScope.setScaleX(f3);
                    reusableGraphicsLayerScope.setScaleY(f3);
                } else {
                    float ramp2 = TabToolbarsKt.ramp(coerceIn, 0.925f, 1.0f);
                    reusableGraphicsLayerScope.setTranslationX((1.0f - ramp2) * f);
                    float f4 = (ramp2 * 0.9f) + 0.1f;
                    reusableGraphicsLayerScope.setScaleX(f4);
                    reusableGraphicsLayerScope.setScaleY(f4);
                }
                reusableGraphicsLayerScope.setAlpha(TabToolbarsKt.swipeToolbarControlAlpha(coerceIn, ((Boolean) poolDescriptionKt$$ExternalSyntheticLambda3.invoke()).booleanValue()));
                return Unit.INSTANCE;
            case 12:
                MutableState mutableState2 = (MutableState) obj2;
                ((Long) obj).longValue();
                ((Function0) obj3).invoke();
                if (z3) {
                    mutableState2.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver6, ((ResolvableString) ((State) obj2).getValue()).resolve((Context) obj3));
                if (!z3) {
                    AnnotatedString annotatedString = new AnnotatedString("");
                    SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.EditableText;
                    KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[19];
                    semanticsPropertyReceiver6.set(semanticsPropertyKey, annotatedString);
                }
                return Unit.INSTANCE;
            case 14:
                IntegrationStepStateManager integrationStepStateManager = (IntegrationStepStateManager) obj3;
                SubtreeManager subtreeManager = (SubtreeManager) integrationStepStateManager.lastChild;
                IntegrationWorkflow.Input input = (IntegrationWorkflow.Input) obj2;
                IntegrationBrowserWorker$Output$Complete integrationBrowserWorker$Output$Complete = (IntegrationBrowserWorker$Output$Complete) obj;
                integrationBrowserWorker$Output$Complete.getClass();
                if (!(integrationBrowserWorker$Output$Complete instanceof IntegrationBrowserWorker$Output$Complete)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                WorkflowState state = subtreeManager.getState();
                if ((state instanceof IntegrationWorkflow$State$Starting ? (IntegrationWorkflow$State$Starting) state : null) == null) {
                    return Unit.INSTANCE;
                }
                TrackingEventsLogger.DefaultImpls.logIntegrationEvent$default(integrationStepStateManager.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, input.flowUrl, Boolean.valueOf(z3), null, 8, null), false, 2, null);
                subtreeManager.updateState(new IntegrationWorkflow$State$Starting(null));
                integrationStepStateManager.setOutput(IntegrationWorkflow.Output.Finished.INSTANCE);
                return Unit.INSTANCE;
            default:
                UiStepStateManager uiStepStateManager = (UiStepStateManager) obj3;
                SubtreeManager subtreeManager2 = (SubtreeManager) uiStepStateManager.lastChild;
                UiState uiState = (UiState) obj2;
                PermissionRequestWorker.Output output = (PermissionRequestWorker.Output) obj;
                output.getClass();
                int ordinal = output.permissionState.result.ordinal();
                if (ordinal == 0) {
                    WorkflowState state2 = subtreeManager2.getState();
                    displaying = state2 instanceof UiState.Displaying ? (UiState.Displaying) state2 : null;
                    if (displaying == null) {
                        return Unit.INSTANCE;
                    }
                    uiStepStateManager.outputSubmit(displaying);
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    uiStepStateManager.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65023));
                } else if (z3) {
                    WorkflowState state3 = subtreeManager2.getState();
                    displaying = state3 instanceof UiState.Displaying ? (UiState.Displaying) state3 : null;
                    if (displaying == null) {
                        return Unit.INSTANCE;
                    }
                    uiStepStateManager.outputSubmit(displaying);
                } else {
                    uiStepStateManager.updateState(UiState.Displaying.copy$default((UiState.Displaying) uiState, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65023));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda2(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }

    public /* synthetic */ DialogHostKt$$ExternalSyntheticLambda2(boolean z, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = obj2;
    }
}
