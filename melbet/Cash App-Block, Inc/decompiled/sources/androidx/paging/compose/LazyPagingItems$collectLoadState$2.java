package androidx.paging.compose;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.camera.camera2.pipe.compat.AndroidCameraDevice;
import androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor;
import androidx.camera.camera2.pipe.compat.CameraState;
import androidx.camera.camera2.pipe.compat.CameraStateOpen;
import androidx.camera.camera2.pipe.compat.VirtualAndroidCameraDevice;
import androidx.camera.camera2.pipe.compat.VirtualCameraState;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor$CameraStatus;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.input.internal.Api34StartStylusHandwriting;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.draw.RotateKt;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.Final;
import androidx.paging.CombinedLoadStates;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.local.screens.app.LocalTabScreen;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalCashAllActivityViewEvent;
import app.cash.local.viewmodels.LocalExplanatoryDialogViewEvent;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewEvent;
import app.cash.local.viewmodels.sheet.MenuPickerSheetEvent;
import app.cash.local.views.internal.menus.LocalMenuCardKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.passcode.presenters.EndAppLockPresenter;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.redwood.treehouse.RealTreehouseApp$codeHost$1;
import app.cash.redwood.treehouse.TreehouseAppContentKt;
import app.cash.redwood.treehouse.ZiplineCodeSession;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.android.volley.Response;
import com.datadog.android.okhttp.TraceContext;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.mikepenz.markdown.model.Input;
import com.mikepenz.markdown.model.MarkdownStateImpl;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$StandardPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$CategoryPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$SavingsTaxDocumentsPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$YearPayload;
import com.squareup.cash.account.settings.viewmodels.documents.ProfileDocumentsDownloaderViewEvent$Cancel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountsLoadingFailedViewEvent$CloseClicked;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewEvent$Click;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapper;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapperKt;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$models$1$1$1$emit$1;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.presenters.CalendarProviderInput;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Error;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletInfoSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletNotificationViewEvent$Dismissed;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.SelectAfterpayPromptViewEvent;
import com.squareup.cash.agents.applets.screens.AgentsHomeScreen;
import com.squareup.cash.agents.applets.viewmodels.AgentsHomeViewEvent;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.appmessages.ActivityTabPopupAppMessage;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.QABItemOrigin;
import com.squareup.cash.cdf.QABItemType;
import com.squareup.cash.cdf.activityhistory.ActivityHistorySelectQABItem;
import com.squareup.cash.cdf.offers.AfterpayFeature;
import com.squareup.cash.cdf.offers.OffersSelectAfterpayContinue;
import com.squareup.cash.cdf.offers.OffersViewSelectAfterpaySheet;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenAccountStatements;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenStatementFile;
import com.squareup.cash.cdf.taxeshub.TaxesHubViewTap;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsDownloadOptionsScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletActivityResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection$Content$PaymentCalendar;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.investing.resources.StatementType;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.RequestFactory;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LazyPagingItems$collectLoadState$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ LazyPagingItems$collectLoadState$2(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object access$readDataAndUpdateCache;
        Screen documentsScreenMultiStatementAccount;
        boolean route;
        StatementType statementType;
        zzle zzleVar;
        List analyticsAppletTappedEvent;
        Icon icon;
        LocalizedString localizedString;
        String str = 0;
        r3 = null;
        String str2 = null;
        str = 0;
        str = 0;
        switch (this.$r8$classId) {
            case 0:
                ((LazyPagingItems) this.this$0).loadState$delegate.setValue((CombinedLoadStates) obj);
                return Unit.INSTANCE;
            case 1:
                CameraStatusMonitor$CameraStatus cameraStatusMonitor$CameraStatus = (CameraStatusMonitor$CameraStatus) obj;
                Camera2CameraStatusMonitor camera2CameraStatusMonitor = (Camera2CameraStatusMonitor) this.this$0;
                StateFlowImpl stateFlowImpl = camera2CameraStatusMonitor._cameraAvailability;
                if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraAvailable) {
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, cameraStatusMonitor$CameraStatus);
                    Unit unit = Unit.INSTANCE;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return unit;
                }
                if (cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraUnavailable) {
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, cameraStatusMonitor$CameraStatus);
                    Unit unit2 = Unit.INSTANCE;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return unit2;
                }
                if (!(cameraStatusMonitor$CameraStatus instanceof CameraStatusMonitor$CameraStatus.CameraPrioritiesChanged)) {
                    return Unit.INSTANCE;
                }
                SharedFlowImpl sharedFlowImpl = camera2CameraStatusMonitor._cameraPriorities;
                Unit unit3 = Unit.INSTANCE;
                Object emit = sharedFlowImpl.emit(unit3, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : unit3;
            case 2:
                CameraState cameraState = (CameraState) obj;
                VirtualCameraState virtualCameraState = (VirtualCameraState) this.this$0;
                synchronized (virtualCameraState.lock) {
                    try {
                        if (cameraState instanceof CameraStateOpen) {
                            VirtualAndroidCameraDevice virtualAndroidCameraDevice = new VirtualAndroidCameraDevice((AndroidCameraDevice) ((CameraStateOpen) cameraState).cameraDevice);
                            virtualCameraState.currentVirtualAndroidCamera = virtualAndroidCameraDevice;
                            virtualCameraState.emitState(new CameraStateOpen(virtualAndroidCameraDevice));
                        } else {
                            virtualCameraState.emitState(cameraState);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 3:
                Recorder.AnonymousClass1 anonymousClass1 = (Recorder.AnonymousClass1) this.this$0;
                if (Build.VERSION.SDK_INT >= 34) {
                    Api34StartStylusHandwriting.startStylusHandwriting(anonymousClass1.getImm(), (View) anonymousClass1.val$videoEncoderSession);
                }
                return Unit.INSTANCE;
            case 4:
                WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) ((RequestFactory) this.this$0).baseUrl;
                workLauncherImpl.requireImm().updateCursorAnchorInfo((View) workLauncherImpl.processor, (CursorAnchorInfo) obj);
                return Unit.INSTANCE;
            case 5:
                ((TextFieldDecoratorModifierNode) this.this$0).autofillHighlightOn$delegate.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 6:
                DataStoreImpl dataStoreImpl = (DataStoreImpl) this.this$0;
                return ((dataStoreImpl.inMemoryCache.getCurrentState() instanceof Final) || (access$readDataAndUpdateCache = DataStoreImpl.access$readDataAndUpdateCache(dataStoreImpl, true, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.INSTANCE : access$readDataAndUpdateCache;
            case 7:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
                LocalCashAllActivityViewEvent localCashAllActivityViewEvent = (LocalCashAllActivityViewEvent) obj;
                if (localCashAllActivityViewEvent instanceof LocalCashAllActivityViewEvent.BackClicked) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else {
                    if (!(localCashAllActivityViewEvent instanceof LocalCashAllActivityViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealLocalLauncher) localEditorialPresenter.launcher).openWeb(screenNavigator, ((LocalCashAllActivityViewEvent.UrlClicked) localCashAllActivityViewEvent).url);
                }
                return Unit.INSTANCE;
            case 8:
                if (Intrinsics.areEqual((LocalBrandProfileViewEvent) obj, LocalBrandProfileViewEvent.BackClicked.INSTANCE)) {
                    ((LocalBrandProfilePresenter) this.this$0).navigator.goTo(Back.INSTANCE);
                }
                return Unit.INSTANCE;
            case 9:
                Back back = Back.INSTANCE;
                MusicPresenter musicPresenter = (MusicPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                LocalExplanatoryDialogViewEvent localExplanatoryDialogViewEvent = (LocalExplanatoryDialogViewEvent) obj;
                if (Intrinsics.areEqual(localExplanatoryDialogViewEvent, LocalExplanatoryDialogViewEvent.PositiveClicked.INSTANCE)) {
                    LocalExplanatoryDialog.PositiveAction positiveAction = ((LocalExplanatoryDialog) musicPresenter.args).positiveAction;
                    if (positiveAction instanceof LocalExplanatoryDialog.PositiveAction.Ok) {
                        screenNavigator2.goTo(back);
                    } else {
                        if (!(positiveAction instanceof LocalExplanatoryDialog.PositiveAction.OpenSettings)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        ((IntentLauncher) musicPresenter.musicPlayer).launchSettings();
                        screenNavigator2.goTo(LocalTabScreen.INSTANCE);
                    }
                } else {
                    if (!Intrinsics.areEqual(localExplanatoryDialogViewEvent, LocalExplanatoryDialogViewEvent.NegativeClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator2.goTo(back);
                }
                return Unit.INSTANCE;
            case 10:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                LocalPosCheckInViewEvent localPosCheckInViewEvent = (LocalPosCheckInViewEvent) obj;
                if (localPosCheckInViewEvent instanceof LocalPosCheckInViewEvent.NavigationClicked) {
                    screenNavigator3.goTo(Back.INSTANCE);
                } else {
                    if (!(localPosCheckInViewEvent instanceof LocalPosCheckInViewEvent.QrCodeDetected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealLocalLauncher) localPosCheckInPresenter.launcher).openWeb(screenNavigator3, ((LocalPosCheckInViewEvent.QrCodeDetected) localPosCheckInViewEvent).url);
                }
                return Unit.INSTANCE;
            case 11:
                ErrorPresenter errorPresenter = (ErrorPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) errorPresenter.navigator;
                MenuPickerSheetEvent menuPickerSheetEvent = (MenuPickerSheetEvent) obj;
                if (menuPickerSheetEvent instanceof MenuPickerSheetEvent.SheetDismissed) {
                    screenNavigator4.goTo(Back.INSTANCE);
                } else {
                    if (!(menuPickerSheetEvent instanceof MenuPickerSheetEvent.MenuSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator4.giveAnswer(((LocalMenuPickerScreen) errorPresenter.args).question, ((MenuPickerSheetEvent.MenuSelected) menuPickerSheetEvent).menu);
                }
                return Unit.INSTANCE;
            case 12:
                ZiplineCodeSession ziplineCodeSession = (ZiplineCodeSession) obj;
                RealTreehouseApp$codeHost$1 realTreehouseApp$codeHost$1 = (RealTreehouseApp$codeHost$1) this.this$0;
                realTreehouseApp$codeHost$1.dispatchers.checkZipline();
                ContextScope contextScope = ziplineCodeSession.scope;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default(contextScope, MainDispatcherLoader.dispatcher, null, new EventBridge$sendEvent$1(realTreehouseApp$codeHost$1, ziplineCodeSession, str, 19), 2);
                return Unit.INSTANCE;
            case 13:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Response response = (Response) this.this$0;
                response.intermediate = booleanValue;
                n$$ExternalSyntheticLambda0 n__externalsyntheticlambda0 = (n$$ExternalSyntheticLambda0) response.result;
                if (n__externalsyntheticlambda0 != null) {
                    n__externalsyntheticlambda0.invoke();
                }
                return Unit.INSTANCE;
            case 14:
                Input input = (Input) obj;
                MarkdownStateImpl markdownStateImpl = (MarkdownStateImpl) this.this$0;
                markdownStateImpl.getClass();
                input.getClass();
                if (!Intrinsics.areEqual(markdownStateImpl.input, input)) {
                    markdownStateImpl.input = input;
                }
                Object withContext = JobKt.withContext(Dispatchers.Default, new DiskLruCache$launchCleanup$1(markdownStateImpl, (Continuation) str, 26), continuation);
                return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
            case 15:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                RealAccountOutboundNavigator realAccountOutboundNavigator = (RealAccountOutboundNavigator) this.this$0;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen) {
                    realAccountOutboundNavigator.navigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                } else if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                    realAccountOutboundNavigator.navigator.goTo(new ProfileScreens.ErrorScreen(((BlockersHelper.BlockersAction.ShowError) blockersAction).message, null, 14));
                } else if (!(blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner) && !(blockersAction instanceof BlockersHelper.BlockersAction.EnableControl) && !(blockersAction instanceof BlockersHelper.BlockersAction.DisableControl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 16:
                if (((AccountsLoadingFailedViewEvent$CloseClicked) obj) != null) {
                    ((AddAliasPresenter) this.this$0).navigator.goTo(Back.INSTANCE);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 17:
                if (Intrinsics.areEqual((ProfileDocumentsDownloaderViewEvent$Cancel) obj, ProfileDocumentsDownloaderViewEvent$Cancel.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((DisclosurePresenter) this.this$0).navigator).goTo(Back.INSTANCE);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 18:
                AccountDocumentsPresenter accountDocumentsPresenter = (AccountDocumentsPresenter) this.this$0;
                RealRouter realRouter = accountDocumentsPresenter.router;
                Analytics analytics = accountDocumentsPresenter.analytics;
                BetterNavigator.ScreenNavigator screenNavigator5 = accountDocumentsPresenter.navigator;
                AccountDocumentsViewEvent accountDocumentsViewEvent = (AccountDocumentsViewEvent) obj;
                if (accountDocumentsViewEvent instanceof AccountDocumentsViewEvent.RecordClick) {
                    AppCompatHintHelper appCompatHintHelper = ((AccountDocumentsViewEvent.RecordClick) accountDocumentsViewEvent).payload;
                    AndroidStringManager androidStringManager = accountDocumentsPresenter.stringManager;
                    if (appCompatHintHelper instanceof AccountDocumentsViewEvent$RecordPayload$StandardPayload) {
                        AccountDocumentsViewEvent$RecordPayload$StandardPayload accountDocumentsViewEvent$RecordPayload$StandardPayload = (AccountDocumentsViewEvent$RecordPayload$StandardPayload) appCompatHintHelper;
                        String str3 = accountDocumentsViewEvent$RecordPayload$StandardPayload.url;
                        if (!accountDocumentsViewEvent$RecordPayload$StandardPayload.emailForwardable || (statementType = accountDocumentsViewEvent$RecordPayload$StandardPayload.statementType) == null) {
                            route = realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), str3);
                            if (!route) {
                                Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Unsupported or malformed URL: ", str3), new Object[0]);
                            }
                        } else {
                            screenNavigator5.goTo(new DocumentsDownloadOptionsScreen(accountDocumentsViewEvent$RecordPayload$StandardPayload.key, statementType, accountDocumentsPresenter.args));
                        }
                    } else if (appCompatHintHelper instanceof AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload) {
                        AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload = (AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload) appCompatHintHelper;
                        String str4 = accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.statementToken;
                        String str5 = accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.fileTitle;
                        analytics.track(new PersonalProfileViewOpenStatementFile(str5), null);
                        screenNavigator5.goTo(new DocumentDownloaderScreen.AccountStatementDownloaderScreen(new DocumentDownloaderScreen.DocumentData(str5, Recorder$$ExternalSyntheticOutline2.m(androidStringManager.get(R.string.profile_documents_downloader_statements_file_name), "_", str4), accountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload.url), androidStringManager.get(R.string.profile_documents_downloader_statements_title), str4, 4));
                    } else {
                        if (!(appCompatHintHelper instanceof AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        String str6 = androidStringManager.get(R.string.profile_documents_downloader_documents_title);
                        AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload accountDocumentsViewEvent$RecordPayload$ViewPdfPayload = (AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload) appCompatHintHelper;
                        String str7 = accountDocumentsViewEvent$RecordPayload$ViewPdfPayload.fileTitle;
                        screenNavigator5.goTo(new DocumentDownloaderScreen.DefaultDownloaderScreen(new DocumentDownloaderScreen.DocumentData(str7, str7, accountDocumentsViewEvent$RecordPayload$ViewPdfPayload.url), str6, null));
                    }
                } else if (accountDocumentsViewEvent instanceof AccountDocumentsViewEvent.SectionClick) {
                    TraceContext traceContext = ((AccountDocumentsViewEvent.SectionClick) accountDocumentsViewEvent).payload;
                    if (traceContext instanceof AccountDocumentsViewEvent$SectionPayload$CategoryPayload) {
                        switch (((AccountDocumentsViewEvent$SectionPayload$CategoryPayload) traceContext).category.ordinal()) {
                            case 0:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE);
                                break;
                            case 1:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE);
                                break;
                            case 2:
                                screenNavigator5.goTo(TaxReturnsScreen.INSTANCE);
                                break;
                            case 3:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenMultiSavingsAccount.INSTANCE);
                                break;
                            case 4:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenLegalDocument.INSTANCE);
                                break;
                            case 5:
                                screenNavigator5.goTo(DocumentsScreen.DocumentScreenPayOverTimeDocuments.INSTANCE);
                                break;
                            case 6:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE);
                                break;
                            case 7:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenCardFeesDocuments.INSTANCE);
                                break;
                            case 8:
                                screenNavigator5.goTo(DocumentsScreen.DocumentsScreenWages.INSTANCE);
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                    } else if (traceContext instanceof AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload) {
                        screenNavigator5.goTo(new DocumentsScreen.DocumentsScreenCategory(((AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload) traceContext).categoryId));
                    } else if (traceContext instanceof AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload) {
                        StatementType statementType2 = ((AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload) traceContext).f1043type;
                        int ordinal = statementType2.ordinal();
                        if (ordinal == 1) {
                            screenNavigator5.goTo(DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE);
                        } else {
                            if (ordinal != 2) {
                                OptionalProvider$$ExternalSyntheticLambda0.m$1(statementType2, "Unexpected type: ");
                                return null;
                            }
                            screenNavigator5.goTo(DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE);
                        }
                    } else if (traceContext instanceof AccountDocumentsViewEvent$SectionPayload$YearPayload) {
                        screenNavigator5.goTo(new DocumentsScreen.DocumentsScreenStockMonthlyForMonth(((AccountDocumentsViewEvent$SectionPayload$YearPayload) traceContext).year));
                    } else if (traceContext instanceof AccountDocumentsViewEvent.AccountStatementPayload) {
                        AccountDocumentsViewEvent.AccountStatementPayload accountStatementPayload = (AccountDocumentsViewEvent.AccountStatementPayload) traceContext;
                        analytics.track(new PersonalProfileViewOpenAccountStatements(), null);
                        if (accountStatementPayload instanceof AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload) {
                            AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload accountDocumentsViewEvent$SectionPayload$StatementAccountPayload = (AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload) accountStatementPayload;
                            documentsScreenMultiStatementAccount = new DocumentsScreen.DocumentsScreenStatements(accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.customerToken, accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.statementType, new RedactedString(accountDocumentsViewEvent$SectionPayload$StatementAccountPayload.displayName));
                        } else {
                            if (!(accountStatementPayload instanceof AccountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            documentsScreenMultiStatementAccount = new DocumentsScreen.DocumentsScreenMultiStatementAccount(false);
                        }
                        screenNavigator5.goTo(documentsScreenMultiStatementAccount);
                    } else if (traceContext instanceof AccountDocumentsViewEvent$SectionPayload$SavingsTaxDocumentsPayload) {
                        screenNavigator5.goTo(DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE);
                    }
                } else if (accountDocumentsViewEvent instanceof AccountDocumentsViewEvent.FooterClick) {
                    accountDocumentsPresenter.intentLauncher.launchUrlInInternalBrowser(((AccountDocumentsViewEvent.FooterClick) accountDocumentsViewEvent).url);
                } else if (Intrinsics.areEqual(accountDocumentsViewEvent, AccountDocumentsViewEvent.NavigationClick.INSTANCE)) {
                    screenNavigator5.goTo(Back.INSTANCE);
                } else {
                    if (!(accountDocumentsViewEvent instanceof AccountDocumentsViewEvent.BannerClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    StatementType statementType3 = ((AccountDocumentsViewEvent.BannerClick) accountDocumentsViewEvent).statementType;
                    switch (statementType3 == null ? -1 : AccountDocumentsPresenter.WhenMappings.$EnumSwitchMapping$0[statementType3.ordinal()]) {
                        case -1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 0:
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        case 1:
                            analytics.track(new TaxesHubViewTap(), null);
                            ClientRoute.ViewTaxesHub viewTaxesHub = new ClientRoute.ViewTaxesHub();
                            RoutingParams routingParams = new RoutingParams(null, null, accountDocumentsPresenter.args, null, null, null, 503);
                            realRouter.getClass();
                            realRouter.clientRouteRouter.route(viewTaxesHub, routingParams);
                            break;
                    }
                }
                return Unit.INSTANCE;
            case 19:
                ActivityInviteItemPresenter activityInviteItemPresenter = (ActivityInviteItemPresenter) this.this$0;
                if (((ActivityInviteItemViewEvent$Click) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                activityInviteItemPresenter.analytics.track(new ActivityHistorySelectQABItem(QABItemType.INVITE_FRIENDS, activityInviteItemPresenter.screen instanceof GlobalSearchScreen ? QABItemOrigin.GLOBAL_SEARCH : null, null, null, null), null);
                activityInviteItemPresenter.navigator.goTo(((RealFlowStarter) activityInviteItemPresenter.flowStarter).startInviteFlow(new Finish(null), BlockersScreens.StartFlowEntryPointScreen.Origin.ACTIVITY));
                return Unit.INSTANCE;
            case 20:
                ((ActivityTabPresenter) this.this$0).navigator.goTo(ActivityTabPopupAppMessage.INSTANCE);
                return Unit.INSTANCE;
            case 21:
                Object emit2 = ((PaymentHistoryActivityItemPresenter) this.this$0).eventHandlerCallbacks.emit((ActivityItemCallbackEvent) obj, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : Unit.INSTANCE;
            case 22:
                Object emit3 = ((ReceiptPresenter) this.this$0).eventHandlerCallbacks.emit((ActivityItemCallbackEvent) obj, continuation);
                return emit3 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit3 : Unit.INSTANCE;
            case 23:
                return emit((HomeResult) obj, continuation);
            case 24:
                LocalPosCheckInPresenter localPosCheckInPresenter2 = (LocalPosCheckInPresenter) this.this$0;
                AfterpayAppletScreen$AfterpayAppletInfoSheet afterpayAppletScreen$AfterpayAppletInfoSheet = (AfterpayAppletScreen$AfterpayAppletInfoSheet) localPosCheckInPresenter2.stringManager;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) localPosCheckInPresenter2.launcher;
                AfterpayAppletInfoSheetViewEvent afterpayAppletInfoSheetViewEvent = (AfterpayAppletInfoSheetViewEvent) obj;
                if (afterpayAppletInfoSheetViewEvent instanceof AfterpayAppletInfoSheetViewEvent.UrlTapped) {
                    LocalPosCheckInPresenter.access$routeAction(localPosCheckInPresenter2, ((AfterpayAppletInfoSheetViewEvent.UrlTapped) afterpayAppletInfoSheetViewEvent).actionUrl);
                } else if (afterpayAppletInfoSheetViewEvent instanceof AfterpayAppletInfoSheetViewEvent.ButtonTapped) {
                    TapAction tapAction = ((AfterpayAppletInfoSheetViewEvent.ButtonTapped) afterpayAppletInfoSheetViewEvent).button.tap_action;
                    if (tapAction != null && (zzleVar = tapAction.action) != null) {
                        TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                        UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
                        if (urlTapAction != null) {
                            str = urlTapAction.action_url;
                        }
                    }
                    str.getClass();
                    LocalPosCheckInPresenter.access$routeAction(localPosCheckInPresenter2, str);
                } else if (afterpayAppletInfoSheetViewEvent instanceof ItemViewed) {
                    realAfterpayAppletAnalytics.trackImpressionAnalyticsEvents(((ItemViewed) afterpayAppletInfoSheetViewEvent).analyticsEventSpecs, MapsKt__MapsJVMKt.mapOf(new Pair(AnalyticsEvent.ParamType.AFTERPAY_APPLET_FLOW_TOKEN, afterpayAppletScreen$AfterpayAppletInfoSheet.referrerFlowToken)));
                } else {
                    if (!(afterpayAppletInfoSheetViewEvent instanceof AfterpayAppletInfoSheetViewEvent.DismissSheet)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list = ((AfterpayAppletInfoSheetViewEvent.DismissSheet) afterpayAppletInfoSheetViewEvent).analyticsAppletTappedEvent;
                    if (list != null) {
                        realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(list, MapsKt__MapsJVMKt.mapOf(new Pair(AnalyticsEvent.ParamType.AFTERPAY_APPLET_FLOW_TOKEN, afterpayAppletScreen$AfterpayAppletInfoSheet.referrerFlowToken)));
                    }
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter2.navigator).goTo(Back.INSTANCE);
                }
                if ((afterpayAppletInfoSheetViewEvent instanceof AfterpayAnalyticsAppletTappedEvent) && !(afterpayAppletInfoSheetViewEvent instanceof AfterpayAppletInfoSheetViewEvent.DismissSheet) && (analyticsAppletTappedEvent = ((AfterpayAnalyticsAppletTappedEvent) afterpayAppletInfoSheetViewEvent).getAnalyticsAppletTappedEvent()) != null) {
                    realAfterpayAppletAnalytics.trackGenericAnalyticsEvents(analyticsAppletTappedEvent, MapsKt__MapsJVMKt.mapOf(new Pair(AnalyticsEvent.ParamType.AFTERPAY_APPLET_FLOW_TOKEN, afterpayAppletScreen$AfterpayAppletInfoSheet.referrerFlowToken)));
                }
                return Unit.INSTANCE;
            case 25:
                if (Intrinsics.areEqual((AfterpayAppletNotificationViewEvent$Dismissed) obj, AfterpayAppletNotificationViewEvent$Dismissed.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) this.this$0).navigator).goTo(Back.INSTANCE);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 26:
                AfterpayAppletActivityResponse afterpayAppletActivityResponse = (AfterpayAppletActivityResponse) obj;
                AfterpayAppletPurchasesEmbeddedPresenter afterpayAppletPurchasesEmbeddedPresenter = (AfterpayAppletPurchasesEmbeddedPresenter) this.this$0;
                afterpayAppletActivityResponse.getClass();
                Footer footer = afterpayAppletActivityResponse.footer;
                String translated = (footer == null || (localizedString = footer.footer_markdown_text) == null) ? null : StringsKt.translated(localizedString);
                if (footer != null && (icon = footer.arcade_icon) != null) {
                    str2 = icon.arcade_id;
                }
                afterpayAppletPurchasesEmbeddedPresenter.footerSection$delegate.setValue(new FooterSection(translated, str2));
                return Unit.INSTANCE;
            case 27:
                Back back2 = Back.INSTANCE;
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.appLockState;
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics2 = (RealAfterpayAppletAnalytics) endAppLockPresenter.accountOutboundNavigator;
                SelectAfterpayPromptViewEvent selectAfterpayPromptViewEvent = (SelectAfterpayPromptViewEvent) obj;
                if (Intrinsics.areEqual(selectAfterpayPromptViewEvent, SelectAfterpayPromptViewEvent.ConfirmClick.INSTANCE)) {
                    screenNavigator6.goTo(back2);
                    Analytics analytics2 = realAfterpayAppletAnalytics2.analytics;
                    String str8 = realAfterpayAppletAnalytics2.shopFlowToken;
                    String str9 = realAfterpayAppletAnalytics2.searchFlowToken;
                    String str10 = realAfterpayAppletAnalytics2.merchantToken;
                    String str11 = realAfterpayAppletAnalytics2.merchantName;
                    com.squareup.cash.cdf.offers.Screen screen = com.squareup.cash.cdf.offers.Screen.OFFERS_HOME_V2;
                    analytics2.track(new OffersSelectAfterpayContinue(str8, str9, str10, str11), null);
                    realAfterpayAppletAnalytics2.trackSelectAfterpaySheetDismissed();
                } else if (Intrinsics.areEqual(selectAfterpayPromptViewEvent, SelectAfterpayPromptViewEvent.Dismiss.INSTANCE)) {
                    screenNavigator6.goTo(back2);
                    realAfterpayAppletAnalytics2.trackSelectAfterpaySheetDismissed();
                } else {
                    if (!Intrinsics.areEqual(selectAfterpayPromptViewEvent, SelectAfterpayPromptViewEvent.SheetViewed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Analytics analytics3 = realAfterpayAppletAnalytics2.analytics;
                    String str12 = realAfterpayAppletAnalytics2.shopFlowToken;
                    String str13 = realAfterpayAppletAnalytics2.searchFlowToken;
                    String str14 = realAfterpayAppletAnalytics2.merchantToken;
                    String str15 = realAfterpayAppletAnalytics2.merchantName;
                    Origin origin = Origin.DISCO;
                    com.squareup.cash.cdf.offers.Screen screen2 = com.squareup.cash.cdf.offers.Screen.OFFERS_HOME_V2;
                    AfterpayFeature afterpayFeature = AfterpayFeature.IN_NETWORK;
                    analytics3.track(new OffersViewSelectAfterpaySheet(str12, str13, str14, str15), null);
                }
                return Unit.INSTANCE;
            case 28:
                LocalPosCheckInPresenter localPosCheckInPresenter3 = (LocalPosCheckInPresenter) this.this$0;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter3.navigator;
                AgentsHomeViewEvent agentsHomeViewEvent = (AgentsHomeViewEvent) obj;
                if (Intrinsics.areEqual(agentsHomeViewEvent, AgentsHomeViewEvent.TapBack.INSTANCE)) {
                    screenNavigator7.goTo(Back.INSTANCE);
                } else {
                    if (!Intrinsics.areEqual(agentsHomeViewEvent, AgentsHomeViewEvent.TapCreateAgent.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator7.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) localPosCheckInPresenter3.cameraPermissions, Flow$Type.AGENT_CREATION, new AgentsHomeScreen(true), null, null, 12));
                }
                return Unit.INSTANCE;
            default:
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                Ui.EventReceiver eventReceiver = ((AmountPickerCondensedView) this.this$0).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(amountPickerViewEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }

    public /* synthetic */ LazyPagingItems$collectLoadState$2(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0299, code lost:
    
        if (r0 != r2) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0123 A[Catch: Exception -> 0x00df, TryCatch #1 {Exception -> 0x00df, blocks: (B:124:0x00d1, B:126:0x00da, B:127:0x00e4, B:129:0x00ea, B:130:0x00f0, B:131:0x0104, B:133:0x010a, B:135:0x0112, B:137:0x0116, B:139:0x011d, B:141:0x0123, B:143:0x0127, B:145:0x012d, B:146:0x0131, B:147:0x0139, B:149:0x013d, B:150:0x014a), top: B:123:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[LOOP:0: B:30:0x01fb->B:77:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(HomeResult homeResult, Continuation continuation) {
        AfterpayAppletHomePresenter$models$1$1$1$emit$1 afterpayAppletHomePresenter$models$1$1$1$emit$1;
        int i;
        CoroutineSingletons coroutineSingletons;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        AfterpayAppletHomePresenter$models$1$1$1$emit$1 afterpayAppletHomePresenter$models$1$1$1$emit$12;
        Object obj;
        TappableIcon tappableIcon;
        AfterpayAppletHomeContentViewModel.DisplayMessage displayMessage;
        String str;
        UpsellSheet upsellSheet;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter2;
        boolean z;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter3;
        CalendarProviderInput calendarProviderInput;
        Object obj2;
        AfterpayAppletHomeSection afterpayAppletHomeSection;
        LocalMenuHoursViewKt localMenuHoursViewKt;
        TreehouseAppContentKt treehouseAppContentKt;
        List list;
        Object obj3;
        HeroBalanceSection heroBalanceSection;
        HomeResult homeResult2 = homeResult;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter4 = (AfterpayAppletHomePresenter) this.this$0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = afterpayAppletHomePresenter4.hasMarkedAppletAsViewedThisSession$delegate;
        SampleStrategy sampleStrategy = afterpayAppletHomePresenter4.oneErrorPerAppSessionStrategy;
        ErrorReporter errorReporter = afterpayAppletHomePresenter4.errorReporter;
        AndroidStringManager androidStringManager = afterpayAppletHomePresenter4.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = afterpayAppletHomePresenter4.navigator;
        if (continuation instanceof AfterpayAppletHomePresenter$models$1$1$1$emit$1) {
            afterpayAppletHomePresenter$models$1$1$1$emit$1 = (AfterpayAppletHomePresenter$models$1$1$1$emit$1) continuation;
            int i2 = afterpayAppletHomePresenter$models$1$1$1$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                afterpayAppletHomePresenter$models$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj4 = afterpayAppletHomePresenter$models$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = afterpayAppletHomePresenter$models$1$1$1$emit$1.label;
                AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj4);
                    if (homeResult2 instanceof HomeResult.Empty) {
                        screenNavigator.goTo(new MoneyTabScreen(null));
                    }
                    afterpayAppletHomePresenter$models$1$1$1$emit$1.L$0 = homeResult2;
                    afterpayAppletHomePresenter$models$1$1$1$emit$1.L$1 = afterpayAppletHomePresenter4;
                    afterpayAppletHomePresenter$models$1$1$1$emit$1.label = 1;
                    Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                    if (homeResult2 instanceof HomeResult.HomeLoading) {
                        obj4 = new Loading(androidStringManager.get(R.string.afterpay_applet_home_toolbar_title));
                        afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                        parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                        afterpayAppletHomePresenter$models$1$1$1$emit$12 = afterpayAppletHomePresenter$models$1$1$1$emit$1;
                    } else {
                        if (homeResult2 instanceof HomeResult.HomeData) {
                            AfterpayAppletHomeMapper afterpayAppletHomeMapper = afterpayAppletHomePresenter4.afterpayAppletHomeMapper;
                            HomeResult.HomeData homeData = (HomeResult.HomeData) homeResult2;
                            AfterpayAppletResponse afterpayAppletResponse = homeData.data;
                            List list2 = homeData.transactions;
                            AfterpayAppletHome.OnDisplayMessage onDisplayMessage = homeData.displayMessageToShow;
                            afterpayAppletResponse.getClass();
                            list2.getClass();
                            try {
                                ProtoValidationScope protoValidationScope = new ProtoValidationScope(afterpayAppletResponse, afterpayAppletParsingErrorFactory, afterpayAppletHomePresenter4);
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                                try {
                                    AfterpayAppletHome afterpayAppletHome = afterpayAppletResponse.home;
                                    afterpayAppletHomePresenter$models$1$1$1$emit$12 = afterpayAppletHomePresenter$models$1$1$1$emit$1;
                                    try {
                                        ProtoValidationScope.required(afterpayAppletHome, "home");
                                        afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                                        try {
                                            String required = ProtoValidationScope.required(afterpayAppletHome.title, "title");
                                            com.squareup.protos.cash.shop.rendering.api.TappableIcon tappableIcon2 = afterpayAppletHome.header_tappable_info;
                                            if (tappableIcon2 != null) {
                                                Icon icon = tappableIcon2.arcade_icon;
                                                String str2 = icon != null ? icon.arcade_id : null;
                                                coroutineSingletons = coroutineSingletons2;
                                                try {
                                                    ProtoValidationScope.required(str2, "arcade_id");
                                                    LocalizedString localizedString = tappableIcon2.accessibility_text;
                                                    String str3 = localizedString != null ? localizedString.translated_value : null;
                                                    TapAction tapAction = tappableIcon2.tap_action;
                                                    Tap tapViewModel = tapAction != null ? AfterpayAppletHomeMapperKt.toTapViewModel(protoValidationScope, tapAction) : null;
                                                    ProtoValidationScope.required(tapViewModel, "no tap action for header icon");
                                                    tappableIcon = new TappableIcon(str2, tapViewModel, String.valueOf(str3));
                                                } catch (Exception e) {
                                                    e = e;
                                                    try {
                                                        throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), afterpayAppletParsingErrorFactory, null);
                                                    } catch (ProtoParsingError e2) {
                                                        errorReporter.report(e2, sampleStrategy);
                                                        obj = null;
                                                    }
                                                }
                                            } else {
                                                coroutineSingletons = coroutineSingletons2;
                                                tappableIcon = null;
                                            }
                                            AbstractPersistentList homeSectionList = afterpayAppletHomeMapper.homeSectionList(protoValidationScope, afterpayAppletResponse, list2);
                                            if (onDisplayMessage != null) {
                                                String str4 = onDisplayMessage.message_id;
                                                LocalMenuCardKt localMenuCardKt = onDisplayMessage.treatment;
                                                if (localMenuCardKt != null) {
                                                    AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl afterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl = localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl ? (AfterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl) localMenuCardKt : null;
                                                    if (afterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl != null) {
                                                        str = afterpayAppletHome$OnDisplayMessage$Treatment$ClientRouteUrl.value;
                                                        if (localMenuCardKt != null) {
                                                            AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet afterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet = localMenuCardKt instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet ? (AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) localMenuCardKt : null;
                                                            if (afterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet != null) {
                                                                upsellSheet = afterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet.value;
                                                                displayMessage = new AfterpayAppletHomeContentViewModel.DisplayMessage(str4, str, upsellSheet);
                                                            }
                                                        }
                                                        upsellSheet = null;
                                                        displayMessage = new AfterpayAppletHomeContentViewModel.DisplayMessage(str4, str, upsellSheet);
                                                    }
                                                }
                                                str = null;
                                                if (localMenuCardKt != null) {
                                                }
                                                upsellSheet = null;
                                                displayMessage = new AfterpayAppletHomeContentViewModel.DisplayMessage(str4, str, upsellSheet);
                                            } else {
                                                displayMessage = null;
                                            }
                                            AnalyticsEvent analyticsEvent = afterpayAppletHome.analytic_view_event;
                                            obj = new AfterpayAppletHomeContentViewModel(required, tappableIcon, false, homeSectionList, displayMessage, null, analyticsEvent != null ? CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent)) : null);
                                            if (obj == null) {
                                                obj = afterpayAppletHomePresenter.toErrorState();
                                            }
                                            obj4 = obj;
                                            if (obj4 instanceof Error) {
                                                screenNavigator.goTo(Back.INSTANCE);
                                                screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletNotificationScreen(3000L, androidStringManager.get(R.string.afterpay_applet_notification_error_title), androidStringManager.get(R.string.afterpay_applet_notification_error_subtitle)));
                                            }
                                            homeResult2 = homeResult;
                                        } catch (Exception e3) {
                                            e = e3;
                                            coroutineSingletons = coroutineSingletons2;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        coroutineSingletons = coroutineSingletons2;
                                        afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    coroutineSingletons = coroutineSingletons2;
                                    afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                                    afterpayAppletHomePresenter$models$1$1$1$emit$12 = afterpayAppletHomePresenter$models$1$1$1$emit$1;
                                    throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), afterpayAppletParsingErrorFactory, null);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                coroutineSingletons = coroutineSingletons2;
                                afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                            }
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                            parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                            afterpayAppletHomePresenter$models$1$1$1$emit$12 = afterpayAppletHomePresenter$models$1$1$1$emit$1;
                            if (homeResult2 instanceof HomeResult.HomeError) {
                                obj4 = afterpayAppletHomePresenter.toErrorState();
                            } else {
                                if (!Intrinsics.areEqual(homeResult2, HomeResult.Empty.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                obj4 = afterpayAppletHomePresenter.toErrorState();
                            }
                        }
                        coroutineSingletons2 = coroutineSingletons;
                    }
                    if (obj4 != coroutineSingletons2) {
                        afterpayAppletHomePresenter2 = afterpayAppletHomePresenter;
                    }
                    return coroutineSingletons2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj4);
                    parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    return Unit.INSTANCE;
                }
                AfterpayAppletHomePresenter afterpayAppletHomePresenter5 = afterpayAppletHomePresenter$models$1$1$1$emit$1.L$1;
                HomeResult homeResult3 = afterpayAppletHomePresenter$models$1$1$1$emit$1.L$0;
                SafeTrace.throwOnFailure(obj4);
                afterpayAppletHomePresenter = afterpayAppletHomePresenter4;
                parcelableSnapshotMutableState = parcelableSnapshotMutableState2;
                afterpayAppletHomePresenter$models$1$1$1$emit$12 = afterpayAppletHomePresenter$models$1$1$1$emit$1;
                afterpayAppletHomePresenter2 = afterpayAppletHomePresenter5;
                homeResult2 = homeResult3;
                Map map2 = AfterpayAppletHomePresenter.refreshAttributeHome;
                afterpayAppletHomePresenter2.setHomeState((AfterpayAppletHomeViewModel) obj4);
                z = homeResult2 instanceof HomeResult.HomeData;
                if (z) {
                    afterpayAppletHomePresenter3 = afterpayAppletHomePresenter;
                } else {
                    AfterpayAppletResponse afterpayAppletResponse2 = ((HomeResult.HomeData) homeResult2).data;
                    afterpayAppletResponse2.getClass();
                    try {
                        afterpayAppletHomePresenter3 = afterpayAppletHomePresenter;
                    } catch (Exception e7) {
                        e = e7;
                        afterpayAppletHomePresenter3 = afterpayAppletHomePresenter;
                    }
                    try {
                        ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(afterpayAppletResponse2, afterpayAppletParsingErrorFactory, afterpayAppletHomePresenter3);
                        AfterpayAppletHome afterpayAppletHome2 = afterpayAppletResponse2.home;
                        if (afterpayAppletHome2 == null || (list = afterpayAppletHome2.sections) == null) {
                            afterpayAppletHomeSection = null;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                Object next = it.next();
                                LocalMenuHoursViewKt localMenuHoursViewKt2 = ((AfterpayAppletHomeSection) next).section;
                                if (localMenuHoursViewKt2 != null) {
                                    AfterpayAppletHomeSection$Section$HeroBalanceSection afterpayAppletHomeSection$Section$HeroBalanceSection = localMenuHoursViewKt2 instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection ? (AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt2 : null;
                                    if (afterpayAppletHomeSection$Section$HeroBalanceSection != null) {
                                        heroBalanceSection = afterpayAppletHomeSection$Section$HeroBalanceSection.value;
                                        if (heroBalanceSection == null) {
                                            obj3 = next;
                                            break;
                                        }
                                    }
                                }
                                heroBalanceSection = null;
                                if (heroBalanceSection == null) {
                                }
                            }
                            afterpayAppletHomeSection = (AfterpayAppletHomeSection) obj3;
                        }
                        if (afterpayAppletHomeSection != null && (localMenuHoursViewKt = afterpayAppletHomeSection.section) != null) {
                            AfterpayAppletHomeSection$Section$HeroBalanceSection afterpayAppletHomeSection$Section$HeroBalanceSection2 = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$HeroBalanceSection ? (AfterpayAppletHomeSection$Section$HeroBalanceSection) localMenuHoursViewKt : null;
                            HeroBalanceSection heroBalanceSection2 = afterpayAppletHomeSection$Section$HeroBalanceSection2 != null ? afterpayAppletHomeSection$Section$HeroBalanceSection2.value : null;
                            if (heroBalanceSection2 != null && (treehouseAppContentKt = heroBalanceSection2.content) != null) {
                                HeroBalanceSection$Content$PaymentCalendar heroBalanceSection$Content$PaymentCalendar = treehouseAppContentKt instanceof HeroBalanceSection$Content$PaymentCalendar ? (HeroBalanceSection$Content$PaymentCalendar) treehouseAppContentKt : null;
                                HeroBalanceSection.PaymentCalendar paymentCalendar = heroBalanceSection$Content$PaymentCalendar != null ? heroBalanceSection$Content$PaymentCalendar.value : null;
                                if (paymentCalendar != null) {
                                    calendarProviderInput = AfterpayAppletHomeMapper.toCalendarProviderInput$presenters(protoValidationScope2, paymentCalendar);
                                    afterpayAppletHomePresenter3.calendarProviderInput$delegate.setValue(calendarProviderInput);
                                    if (z && !((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                                        RealAfterpayAppletRepository realAfterpayAppletRepository = afterpayAppletHomePresenter3.afterpayAppletRepository;
                                        AfterpayAppletHomePresenter$models$1$1$1$emit$1 afterpayAppletHomePresenter$models$1$1$1$emit$13 = afterpayAppletHomePresenter$models$1$1$1$emit$12;
                                        afterpayAppletHomePresenter$models$1$1$1$emit$13.L$0 = null;
                                        afterpayAppletHomePresenter$models$1$1$1$emit$13.L$1 = null;
                                        afterpayAppletHomePresenter$models$1$1$1$emit$13.label = 2;
                                        obj2 = realAfterpayAppletRepository.hasViewedApplet.set(Boolean.TRUE, afterpayAppletHomePresenter$models$1$1$1$emit$13);
                                        if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            obj2 = Unit.INSTANCE;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } catch (Exception e8) {
                        e = e8;
                        try {
                            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AfterpayAppletResponse.class), afterpayAppletParsingErrorFactory, null);
                        } catch (ProtoParsingError e9) {
                            errorReporter.report(e9, sampleStrategy);
                        }
                    }
                }
                calendarProviderInput = null;
                afterpayAppletHomePresenter3.calendarProviderInput$delegate.setValue(calendarProviderInput);
                if (z) {
                    RealAfterpayAppletRepository realAfterpayAppletRepository2 = afterpayAppletHomePresenter3.afterpayAppletRepository;
                    AfterpayAppletHomePresenter$models$1$1$1$emit$1 afterpayAppletHomePresenter$models$1$1$1$emit$132 = afterpayAppletHomePresenter$models$1$1$1$emit$12;
                    afterpayAppletHomePresenter$models$1$1$1$emit$132.L$0 = null;
                    afterpayAppletHomePresenter$models$1$1$1$emit$132.L$1 = null;
                    afterpayAppletHomePresenter$models$1$1$1$emit$132.label = 2;
                    obj2 = realAfterpayAppletRepository2.hasViewedApplet.set(Boolean.TRUE, afterpayAppletHomePresenter$models$1$1$1$emit$132);
                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        afterpayAppletHomePresenter$models$1$1$1$emit$1 = new AfterpayAppletHomePresenter$models$1$1$1$emit$1(this, continuation);
        Object obj42 = afterpayAppletHomePresenter$models$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = afterpayAppletHomePresenter$models$1$1$1$emit$1.label;
        AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory2 = AfterpayAppletParsingErrorFactory.INSTANCE;
        if (i != 0) {
        }
        Map map22 = AfterpayAppletHomePresenter.refreshAttributeHome;
        afterpayAppletHomePresenter2.setHomeState((AfterpayAppletHomeViewModel) obj42);
        z = homeResult2 instanceof HomeResult.HomeData;
        if (z) {
        }
        calendarProviderInput = null;
        afterpayAppletHomePresenter3.calendarProviderInput$delegate.setValue(calendarProviderInput);
        if (z) {
        }
        return Unit.INSTANCE;
    }
}
