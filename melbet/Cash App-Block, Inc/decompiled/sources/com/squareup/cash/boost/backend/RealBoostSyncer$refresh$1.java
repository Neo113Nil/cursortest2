package com.squareup.cash.boost.backend;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValueKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.cdf.notificationsoptin.NotificationPromptEntryPoint;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.profile.RealReferralManager$refresh$2$1;
import com.squareup.cash.featureflags.AmplitudeExperiments$QrCodeWidgetTile;
import com.squareup.cash.featureflags.AmplitudeExperiments$RequestPushNotificationsInOnboardingExperiment;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.primitives.NewsKind;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.screens.CashQrShortcutsOnboardingSheet;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import com.squareup.cash.wallet.presenters.WalletHomePresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.marketdata.GetCustomerNewsRequest;
import com.squareup.protos.cash.marketdata.GetCustomerNewsResponse;
import com.squareup.protos.cash.marketdata.MarketDataService;
import com.squareup.protos.cash.marketdata.model.PortfolioNews;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetRewardStatusRequest;
import com.squareup.protos.franklin.app.SetCashtagUrlEnabledRequest;
import com.squareup.util.coroutines.Signal;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ControllerRequest$CancelRequest;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class RealBoostSyncer$refresh$1 extends SuspendLambda implements Function2 {
    public boolean $force;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSyncer$refresh$1(Object obj, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new RealBoostSyncer$refresh$1((RealBoostSyncer) obj2, this.$force, continuation, 0);
            case 1:
                return new RealBoostSyncer$refresh$1((TextFieldSelectionManager) obj2, this.$force, continuation, 1);
            case 2:
                return new RealBoostSyncer$refresh$1((ActivityTabPresenter) obj2, continuation, 2);
            case 3:
                return new RealBoostSyncer$refresh$1(this.$force, (Function0) obj2, continuation, 3);
            case 4:
                return new RealBoostSyncer$refresh$1((RealProfileManager) obj2, this.$force, continuation, 4);
            case 5:
                return new RealBoostSyncer$refresh$1((RealReferralManager) obj2, this.$force, continuation, 5);
            case 6:
                return new RealBoostSyncer$refresh$1(this.$force, (RealInvestingSyncer) obj2, continuation, 6);
            case 7:
                return new RealBoostSyncer$refresh$1(this.$force, (HomeViewPresenter) obj2, continuation, 7);
            case 8:
                RealBoostSyncer$refresh$1 realBoostSyncer$refresh$1 = new RealBoostSyncer$refresh$1((WalletHomePresenter) obj2, continuation, 8);
                realBoostSyncer$refresh$1.$force = ((Boolean) obj).booleanValue();
                return realBoostSyncer$refresh$1;
            default:
                return new RealBoostSyncer$refresh$1((InquiryViewModel) obj2, this.$force, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((RealBoostSyncer$refresh$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealBoostSyncer$refresh$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ef, code lost:
    
        if (com.squareup.util.coroutines.StateFlowKt.until(r2, r4, r12) == r0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01db, code lost:
    
        if (r13 == r0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02d4, code lost:
    
        if (r0.set(r1, r12) != r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0385, code lost:
    
        if (r3.processNewBoostsDataInternal(null, r12) == r0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03d2, code lost:
    
        if (com.squareup.util.coroutines.StateFlowKt.until(r13, r1, r12) == r0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0372, code lost:
    
        if (r13 == r0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if (r7.set(r13, r12) == r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        if (r0.context.getSystemService(android.app.StatusBarManager.class) != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(700, r12) == r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
    
        if (r13 == r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009e, code lost:
    
        if (r13 == r8) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean disabled;
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        AnnotatedString annotatedString = 0;
        switch (i) {
            case 0:
                RealBoostSyncer realBoostSyncer = (RealBoostSyncer) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 shouldProcessRewardsData = realBoostSyncer.shouldProcessRewardsData();
                    this.label = 1;
                    obj = FlowKt.firstOrNull(shouldProcessRewardsData, this);
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    break;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (!Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    this.label = 2;
                    break;
                } else {
                    if (!this.$force) {
                        long millis = realBoostSyncer.clock.millis() - realBoostSyncer.lastUpdated;
                        BoostSyncer.Companion.getClass();
                        if (millis < Duration.m4167getInWholeMillisecondsimpl(BoostSyncer.Companion.TTL)) {
                            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m(realBoostSyncer.lastUpdated, "Not updating rewards. Last update was at "), new Object[0]);
                            break;
                        }
                    }
                    Timber.Forest.d("Updating rewards...", new Object[0]);
                    Signal signal = realBoostSyncer.signOutSignal;
                    Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(realBoostSyncer, (Continuation) annotatedString, 13);
                    this.label = 3;
                    break;
                }
                break;
            case 1:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z3 = this.$force;
                    if (!TextRange.m987getCollapsedimpl(textFieldSelectionManager.getValue$foundation().selection)) {
                        AnnotatedString selectedText = TextFieldValueKt.getSelectedText(textFieldSelectionManager.getValue$foundation());
                        annotatedString = selectedText;
                        if (z3) {
                            int m989getMaximpl = TextRange.m989getMaximpl(textFieldSelectionManager.getValue$foundation().selection);
                            textFieldSelectionManager.onValueChange.invoke(TextFieldSelectionManager.m455createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().annotatedString, SizeKt.TextRange(m989getMaximpl, m989getMaximpl)));
                            textFieldSelectionManager.setHandleState(HandleState.None);
                            annotatedString = selectedText;
                        }
                    }
                    if (annotatedString != 0) {
                        AndroidClipboard androidClipboard = textFieldSelectionManager.clipboard;
                        if (androidClipboard != null) {
                            ClipEntry clipEntry = ClipboardUtils_androidKt.toClipEntry(annotatedString);
                            this.label = 1;
                            if (androidClipboard.setClipEntry(clipEntry) == coroutineSingletons2) {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                ActivityTabPresenter activityTabPresenter = (ActivityTabPresenter) obj2;
                KeyValue keyValue = activityTabPresenter.activityViewed;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    disabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) activityTabPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$RequestPushNotificationsInOnboardingExperiment.INSTANCE)).disabled();
                    if (activityTabPresenter.canRequestNotificationPermission) {
                        this.$force = disabled;
                        this.label = 1;
                        Object obj3 = keyValue.get(this);
                        if (obj3 != coroutineSingletons3) {
                            z = disabled;
                            obj = obj3;
                        }
                        break;
                    }
                    Boolean bool = Boolean.TRUE;
                    this.$force = disabled;
                    this.label = 3;
                } else if (i4 == 1) {
                    z = this.$force;
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 == 2) {
                    z2 = this.$force;
                    SafeTrace.throwOnFailure(obj);
                    disabled = z2;
                    Boolean bool2 = Boolean.TRUE;
                    this.$force = disabled;
                    this.label = 3;
                    break;
                } else if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (!((Boolean) obj).booleanValue() && z) {
                    AndroidPermissionManager$create$1 create = activityTabPresenter.permissionManager.create("android.permission.POST_NOTIFICATIONS");
                    if (!create.$readonly.check()) {
                        Analytics analytics = activityTabPresenter.analytics;
                        NotificationPromptEntryPoint notificationPromptEntryPoint = NotificationPromptEntryPoint.ACTIVITY_TAB;
                        this.$force = z;
                        this.label = 2;
                        if (Utils_androidKt.requestNotificationPermissionWithAnalytics(create, analytics, notificationPromptEntryPoint, this) != coroutineSingletons3) {
                            z2 = z;
                            disabled = z2;
                            Boolean bool22 = Boolean.TRUE;
                            this.$force = disabled;
                            this.label = 3;
                        }
                    }
                }
                disabled = z;
                Boolean bool222 = Boolean.TRUE;
                this.$force = disabled;
                this.label = 3;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$force) {
                        this.label = 1;
                        if (JobKt.delay(2000L, this) == coroutineSingletons4) {
                            break;
                        }
                    }
                    break;
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((Function0) obj2).invoke();
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = ((RealProfileManager) obj2).appService;
                    ClientScenario clientScenario = ClientScenario.PROFILE;
                    SetCashtagUrlEnabledRequest setCashtagUrlEnabledRequest = new SetCashtagUrlEnabledRequest(null, Boolean.valueOf(this.$force), ByteString.EMPTY);
                    this.label = 1;
                    Object cashtagUrlEnabled = appService.setCashtagUrlEnabled(clientScenario, null, setCashtagUrlEnabledRequest, this);
                    if (cashtagUrlEnabled == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                break;
            case 5:
                RealReferralManager realReferralManager = (RealReferralManager) obj2;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!realReferralManager.shouldCallGetRewardStatus.get()) {
                        break;
                    } else {
                        AppService appService2 = realReferralManager.appService;
                        GetRewardStatusRequest getRewardStatusRequest = new GetRewardStatusRequest(ByteString.EMPTY);
                        this.label = 1;
                        obj = appService2.getRewardStatus(getRewardStatusRequest, this);
                        break;
                    }
                } else if (i7 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i7 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Signal signal2 = realReferralManager.signOutSignal;
                RealReferralManager$refresh$2$1 realReferralManager$refresh$2$1 = new RealReferralManager$refresh$2$1((ApiResult) obj, realReferralManager, this.$force, (Continuation) null);
                this.label = 2;
                break;
            case 6:
                RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) obj2;
                Map map = realInvestingSyncer.newsCacheExpiryTimes;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                NewsKind.StocksPortfolio stocksPortfolio = NewsKind.StocksPortfolio.INSTANCE;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$force) {
                        map.remove(stocksPortfolio);
                    }
                    Instant instant = (Instant) map.get(stocksPortfolio);
                    if (instant != null && instant.isAfter(DimensionKt.now(realInvestingSyncer.clock))) {
                        break;
                    } else {
                        MarketDataService marketDataService = realInvestingSyncer.marketDataService;
                        GetCustomerNewsRequest getCustomerNewsRequest = new GetCustomerNewsRequest(ByteString.EMPTY);
                        this.label = 1;
                        obj = marketDataService.getCustomerNews(getCustomerNewsRequest, this);
                        if (obj == coroutineSingletons7) {
                            break;
                        }
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) ((ApiResult.Success) apiResult).response;
                    Long l = getCustomerNewsResponse.next_cache_refresh_after;
                    Integer num = getCustomerNewsResponse.number_of_news_in_carousel;
                    if (l == null) {
                        map.remove(stocksPortfolio);
                    } else {
                        map.put(stocksPortfolio, Instant.ofEpochMilli(l.longValue()));
                    }
                    PortfolioNews portfolioNews = getCustomerNewsResponse.equity;
                    List list = portfolioNews != null ? portfolioNews.news : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    RealInvestingSyncer.access$saveNews(realInvestingSyncer, stocksPortfolio, list, num != null ? num.intValue() : 3);
                    PortfolioNews portfolioNews2 = getCustomerNewsResponse.bitcoin;
                    List list2 = portfolioNews2 != null ? portfolioNews2.news : null;
                    if (list2 == null) {
                        list2 = EmptyList.INSTANCE;
                    }
                    RealInvestingSyncer.access$saveNews(realInvestingSyncer, NewsKind.BitcoinPortfolio.INSTANCE, list2, num != null ? num.intValue() : 3);
                }
                break;
            case 7:
                HomeViewPresenter homeViewPresenter = (HomeViewPresenter) obj2;
                QrShortcutInstaller qrShortcutInstaller = homeViewPresenter.qrShortcutInstaller;
                KeyValue keyValue2 = homeViewPresenter.hasSeenQrShortcutsOnboarding;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.$force) {
                        this.label = 1;
                        obj = keyValue2.get(this);
                        break;
                    }
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i9 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Number) obj).intValue() >= 5) {
                        if (!((RealQrShortcutInstaller) qrShortcutInstaller).isWidgetPinSupported()) {
                            RealQrShortcutInstaller realQrShortcutInstaller = (RealQrShortcutInstaller) qrShortcutInstaller;
                            if (Build.VERSION.SDK_INT >= 33) {
                                break;
                            }
                        }
                        if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) homeViewPresenter.featureFlagManager).currentValue(AmplitudeExperiments$QrCodeWidgetTile.INSTANCE)).enabled()) {
                            this.label = 3;
                            break;
                        }
                    }
                } else if (i9 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool3 = Boolean.TRUE;
                    this.label = 4;
                    break;
                } else if (i9 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    homeViewPresenter.navigator.goTo(CashQrShortcutsOnboardingSheet.INSTANCE);
                    break;
                }
                if (!((Boolean) obj).booleanValue()) {
                    KeyValue keyValue3 = homeViewPresenter.qrShortcutsOnboardingAppStarts;
                    this.label = 2;
                    obj = keyValue3.get(this);
                    break;
                }
            case 8:
                boolean z4 = this.$force;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((WalletHomePresenter) obj2).cardSchemeEvents;
                    PresenterEvents.ExecutingScenario executingScenario = new PresenterEvents.ExecutingScenario(z4);
                    this.$force = z4;
                    this.label = 1;
                    if (sharedFlowImpl.emit(executingScenario, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl2 = ((InquiryViewModel) obj2).controllerRequestFlow;
                    ControllerRequest$CancelRequest controllerRequest$CancelRequest = new ControllerRequest$CancelRequest(this.$force);
                    this.label = 1;
                    if (sharedFlowImpl2.emit(controllerRequest$CancelRequest, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSyncer$refresh$1(MoleculePresenter moleculePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealBoostSyncer$refresh$1(boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$force = z;
        this.this$0 = obj;
    }
}
