package androidx.glance.session;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.Config;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.material.AnchoredDraggableState$$ExternalSyntheticLambda0;
import androidx.compose.material.CardKt;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ListenableWorker;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.presenters.CalendarBlockerPresenter;
import com.squareup.cash.blockers.presenters.PasscodePresenter;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter;
import com.squareup.cash.blockers.presenters.SetNamePresenter$createShippingAddressWithName$result$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.GridItemVisual;
import com.squareup.cash.card.onboarding.StyledCardViewModelExtKt;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.deviceintegrity.DeviceIntegrity$EntryPoint;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.GLThread;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.views.sup.OffersNotificationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.passkeys.backend.PasskeyRepository$LoginIdentifier;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.RealSessionRefresher;
import com.squareup.cash.session.backend.RealSessionRefresher$refreshSession$2$WhenMappings;
import com.squareup.cash.session.backend.Session;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.protos.cash.aegis.api.SelectDependentsRequest;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CheckDepositRequest;
import com.squareup.protos.franklin.app.CompleteDigitalWalletTokenProvisioningRequest;
import com.squareup.protos.franklin.app.GetLinkedAccountsRequest;
import com.squareup.protos.franklin.app.RefreshSessionRequest;
import com.squareup.protos.franklin.app.RefreshSessionResponse;
import com.squareup.protos.franklin.app.ResolveMergeRequest;
import com.squareup.protos.franklin.app.SelectSponsorsRequest;
import com.squareup.protos.franklin.app.SetAddressRequest;
import com.squareup.protos.franklin.app.SetDateRequest;
import com.squareup.protos.franklin.app.VerifyIdentityRequest;
import com.squareup.protos.franklin.common.DigitalWalletToken$Issuer;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.timecards.BatchGetTimecardBreakDefinitionRequest;
import com.squareup.protos.timecards.GetClockinEssentialsRequest;
import com.squareup.protos.timecards.StartTimecardBreakRequest;
import com.squareup.protos.timecards.StartTimecardRequest;
import com.squareup.protos.timecards.StopTimecardBreakRequest;
import com.squareup.protos.timecards.StopTimecardRequest;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class SessionWorker$doWork$2$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $$this$withTimerOrNull;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$2$2(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Map map, Config.OptionPriority optionPriority, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 1;
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        this.L$0 = useCaseCameraRequestControlImpl;
        this.this$0 = map;
        this.$$this$withTimerOrNull = optionPriority;
    }

    private final Object invokeSuspend$com$squareup$cash$work$presenters$shift$RealClockInRepository$stopBreak$2(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        TimecardsService timecardsService = ((RealClockInRepository) this.L$0).timecardsService;
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) this.this$0;
        SquareMerchantToken squareMerchantToken = new SquareMerchantToken((String) this.$$this$withTimerOrNull);
        this.label = 1;
        Object stopTimecardBreak = timecardsService.stopTimecardBreak(stopTimecardBreakRequest, squareMerchantToken, this);
        return stopTimecardBreak == coroutineSingletons ? coroutineSingletons : stopTimecardBreak;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$$this$withTimerOrNull;
        switch (i) {
            case 0:
                return new SessionWorker$doWork$2$2((SessionWorker) this.this$0, (TimerScopeKt$withTimer$2$1$blockScope$1) obj, continuation, 0);
            case 1:
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) this.L$0;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
                return new SessionWorker$doWork$2$2(useCaseCameraRequestControlImpl, (Map) this.this$0, (Config.OptionPriority) obj, continuation);
            case 2:
                return new SessionWorker$doWork$2$2((UseCaseCameraRequestControlImpl) this.L$0, (Camera2ImplConfig) this.this$0, (Map) obj, continuation, 2);
            case 3:
                return new SessionWorker$doWork$2$2((SeekableTransitionState) this.this$0, this.L$0, (Transition) obj, false, continuation, 3);
            case 4:
                return new SessionWorker$doWork$2$2((AnchoredDraggableState) this.this$0, this.L$0, (Function4) obj, false, continuation, 4);
            case 5:
                return new SessionWorker$doWork$2$2((androidx.compose.material.AnchoredDraggableState) this.this$0, this.L$0, (Function4) obj, false, continuation, 5);
            case 6:
                return new SessionWorker$doWork$2$2((TooltipStateImpl) this.L$0, (Scene.AnonymousClass1) this.this$0, (MutatePriority) obj, continuation, 6);
            case 7:
                return new SessionWorker$doWork$2$2((CalendarBlockerPresenter) this.L$0, (LocalDate) this.this$0, (Boolean) obj, continuation, 7);
            case 8:
                return new SessionWorker$doWork$2$2((PasscodePresenter) this.this$0, (CompletableDeferred) obj, continuation, 8);
            case 9:
                return new SessionWorker$doWork$2$2((DisclosurePresenter) this.L$0, (BlockersData) this.this$0, (VerifyIdentityRequest) obj, continuation, 9);
            case 10:
                return new SessionWorker$doWork$2$2((RegisterAliasPresenter) this.L$0, (PasskeyRepository$LoginIdentifier) this.this$0, (ClientScenario) obj, continuation, 10);
            case 11:
                return new SessionWorker$doWork$2$2((CardLockPresenter) this.L$0, (BlockersData) this.this$0, (SetAddressRequest) obj, continuation, 11);
            case 12:
                return new SessionWorker$doWork$2$2((CardLockPresenter) this.L$0, (String) this.this$0, (BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName) obj, continuation, 12);
            case 13:
                return new SessionWorker$doWork$2$2((List) this.this$0, (CardDesignLibraryScene) obj, continuation, 13);
            case 14:
                return new SessionWorker$doWork$2$2((VerifyCheckDepositPresenter) this.L$0, (MutableState) this.this$0, (MutableState) obj, continuation, 14);
            case 15:
                return new SessionWorker$doWork$2$2((RealBlockersHelper) this.L$0, (ClientScenario) this.this$0, (BlockersData) obj, continuation, 15);
            case 16:
                return new SessionWorker$doWork$2$2((AegisService) this.L$0, (BlockersScreens) this.this$0, (SelectDependentsRequest) obj, continuation, 16);
            case 17:
                return new SessionWorker$doWork$2$2((AppService) this.L$0, (BlockersScreens) this.this$0, (SelectSponsorsRequest) obj, continuation, 17);
            case 18:
                return new SessionWorker$doWork$2$2((n) this.L$0, (BlockersScreens.ProvisionGooglePayScreen) this.this$0, (DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) obj, continuation, 18);
            case 19:
                return new SessionWorker$doWork$2$2((Job) this.L$0, (Engine) this.this$0, (GLThread) obj, continuation, 19);
            case 20:
                return new SessionWorker$doWork$2$2((RealInitialScreenLoader) obj, continuation);
            case 21:
                return new SessionWorker$doWork$2$2((RealSessionRefresher) this.this$0, (String) obj, continuation, 21);
            case 22:
                return new SessionWorker$doWork$2$2((InstrumentDetailsPresenter) this.L$0, (Money) this.this$0, (Money) obj, continuation, 22);
            case 23:
                return new SessionWorker$doWork$2$2((CardLockPresenter) this.L$0, (String) this.this$0, (String) obj, continuation, 23);
            case 24:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (BatchGetTimecardBreakDefinitionRequest) this.this$0, (String) obj, continuation, 24);
            case 25:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (GetClockinEssentialsRequest) this.this$0, (String) obj, continuation, 25);
            case 26:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (StartTimecardBreakRequest) this.this$0, (String) obj, continuation, 26);
            case 27:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (StartTimecardRequest) this.this$0, (String) obj, continuation, 27);
            case 28:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (StopTimecardBreakRequest) this.this$0, (String) obj, continuation, 28);
            default:
                return new SessionWorker$doWork$2$2((RealClockInRepository) this.L$0, (StopTimecardRequest) this.this$0, (String) obj, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((SessionWorker$doWork$2$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0274, code lost:
    
        if (r0 == r2) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0261, code lost:
    
        if (r3 == r2) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fa, code lost:
    
        if (r3 == r2) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02c4, code lost:
    
        if (r0 == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x088a, code lost:
    
        if (com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene.access$initializeBatch(r0, r1, r4) != r2) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0cd8, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r0, r2, r4) != r7) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0c72, code lost:
    
        if (r0 == r7) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        if (r0.refresh(r4) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014b, code lost:
    
        if (r2.stopBreak(r3, r5, r4) == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:583:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object runWithLock;
        AppWidgetSession appWidgetSession;
        NonCancellable nonCancellable;
        PageFetcher$flow$1 pageFetcher$flow$1;
        PasscodePresenter passcodePresenter;
        Object await;
        ArrayList arrayList;
        int i;
        int i2;
        EGLConfig[] eGLConfigArr;
        int i3;
        int i4;
        int[] iArr;
        JanusService janusService;
        String appTokenOrNull;
        Object readBackupTag;
        Object refreshSession;
        RefreshSessionResponse refreshSessionResponse;
        String str;
        String str2;
        Object attestClassicRequest;
        SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = this;
        int i5 = 15;
        int i6 = 29;
        int i7 = 4;
        int i8 = 0;
        char c = 2;
        int i9 = 1;
        Continuation continuation = null;
        switch (sessionWorker$doWork$2$2.$r8$classId) {
            case 0:
                int i10 = 14;
                int i11 = 18;
                SessionWorker sessionWorker = (SessionWorker) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = sessionWorker$doWork$2$2.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManager sessionManager = sessionWorker.sessionManager;
                    RealBadger2$clear$2 realBadger2$clear$2 = new RealBadger2$clear$2(sessionWorker, null, i11);
                    sessionWorker$doWork$2$2.label = 1;
                    runWithLock = ((SessionManagerImpl) sessionManager).runWithLock(realBadger2$clear$2, sessionWorker$doWork$2$2);
                    break;
                } else if (i12 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    runWithLock = obj;
                } else {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return ListenableWorker.Result.success();
                        }
                        if (i12 != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) sessionWorker$doWork$2$2.L$0;
                        SafeTrace.throwOnFailure(obj);
                        throw th;
                    }
                    appWidgetSession = (AppWidgetSession) sessionWorker$doWork$2$2.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        NonCancellable nonCancellable2 = NonCancellable.INSTANCE;
                        PageFetcher$flow$1 pageFetcher$flow$12 = new PageFetcher$flow$1(sessionWorker, appWidgetSession, null, i10);
                        sessionWorker$doWork$2$2.L$0 = null;
                        sessionWorker$doWork$2$2.label = 3;
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        nonCancellable = NonCancellable.INSTANCE;
                        pageFetcher$flow$1 = new PageFetcher$flow$1(sessionWorker, appWidgetSession, null, 14);
                        sessionWorker$doWork$2$2.L$0 = th;
                        sessionWorker$doWork$2$2.label = 4;
                        if (JobKt.withContext(nonCancellable, pageFetcher$flow$1, sessionWorker$doWork$2$2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                }
                AppWidgetSession appWidgetSession2 = (AppWidgetSession) runWithLock;
                if (appWidgetSession2 == null) {
                    int i13 = sessionWorker.params.mRunAttemptCount;
                    String str3 = sessionWorker.key;
                    if (i13 == 0) {
                        Path$$ExternalSyntheticBUOutline0.m$1(str3, "No session available for key ");
                        return null;
                    }
                    Log.w("GlanceSessionWorker", "SessionWorker attempted restart but Session is not available for " + str3);
                    return ListenableWorker.Result.success();
                }
                try {
                    TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = (TimerScopeKt$withTimer$2$1$blockScope$1) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                    Context applicationContext = sessionWorker.getApplicationContext();
                    TimeoutOptions timeoutOptions = sessionWorker.timeouts;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(sessionWorker, 0);
                    sessionWorker$doWork$2$2.L$0 = appWidgetSession2;
                    sessionWorker$doWork$2$2.label = 2;
                    try {
                        Object access$runSession = SessionWorkerKt.access$runSession(timerScopeKt$withTimer$2$1$blockScope$1, applicationContext, appWidgetSession2, timeoutOptions, anonymousClass1, sessionWorker$doWork$2$2);
                        sessionWorker$doWork$2$2 = sessionWorker$doWork$2$2;
                        if (access$runSession != coroutineSingletons) {
                            appWidgetSession = appWidgetSession2;
                            NonCancellable nonCancellable22 = NonCancellable.INSTANCE;
                            PageFetcher$flow$1 pageFetcher$flow$122 = new PageFetcher$flow$1(sessionWorker, appWidgetSession, null, i10);
                            sessionWorker$doWork$2$2.L$0 = null;
                            sessionWorker$doWork$2$2.label = 3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sessionWorker$doWork$2$2 = sessionWorker$doWork$2$2;
                        appWidgetSession = appWidgetSession2;
                        nonCancellable = NonCancellable.INSTANCE;
                        pageFetcher$flow$1 = new PageFetcher$flow$1(sessionWorker, appWidgetSession, null, 14);
                        sessionWorker$doWork$2$2.L$0 = th;
                        sessionWorker$doWork$2$2.label = 4;
                        if (JobKt.withContext(nonCancellable, pageFetcher$flow$1, sessionWorker$doWork$2$2) != coroutineSingletons) {
                            throw th;
                        }
                        return coroutineSingletons;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = sessionWorker$doWork$2$2.label;
                if (i14 != 0) {
                    if (i14 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = (UseCaseCameraRequestControlImpl) sessionWorker$doWork$2$2.L$0;
                UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.DEFAULT;
                Map map = (Map) sessionWorker$doWork$2$2.this$0;
                Config.OptionPriority optionPriority = (Config.OptionPriority) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                sessionWorker$doWork$2$2.label = 1;
                Object access$setParametersInternal = UseCaseCameraRequestControlImpl.access$setParametersInternal(useCaseCameraRequestControlImpl, type2, map, optionPriority, sessionWorker$doWork$2$2);
                return access$setParametersInternal == coroutineSingletons2 ? coroutineSingletons2 : access$setParametersInternal;
            case 2:
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = (UseCaseCameraRequestControlImpl) sessionWorker$doWork$2$2.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = sessionWorker$doWork$2$2.label;
                if (i15 != 0) {
                    if (i15 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap = useCaseCameraRequestControlImpl2.infoBundleMap;
                UseCaseCameraRequestControl.Type type3 = UseCaseCameraRequestControl.Type.CAMERA2_CAMERA_CONTROL;
                CompletableDeferredImpl completableDeferredImpl = UseCaseCameraRequestControlImpl.submitFailedResult;
                Camera2ImplConfig camera2ImplConfig = (Camera2ImplConfig) sessionWorker$doWork$2$2.this$0;
                Toolbar.AnonymousClass1 anonymousClass12 = new Toolbar.AnonymousClass1(5);
                anonymousClass12.insertAllOptions(camera2ImplConfig);
                linkedHashMap.put(type3, new UseCaseCameraRequestControlImpl.InfoBundle(anonymousClass12, MapsKt__MapsKt.toMutableMap((Map) sessionWorker$doWork$2$2.$$this$withTimerOrNull), (RequestTemplate) null, 12));
                UseCaseCameraRequestControlImpl.InfoBundle merge = UseCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl2.infoBundleMap);
                sessionWorker$doWork$2$2.label = 1;
                Object updateCameraStateAsync = useCaseCameraRequestControlImpl2.updateCameraStateAsync(merge, null, sessionWorker$doWork$2$2);
                return updateCameraStateAsync == coroutineSingletons3 ? coroutineSingletons3 : updateCameraStateAsync;
            case 3:
                Transition transition = (Transition) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                Object obj2 = sessionWorker$doWork$2$2.L$0;
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = sessionWorker$doWork$2$2.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    seekableTransitionState.endAllAnimations();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = seekableTransitionState.targetState$delegate;
                    seekableTransitionState.lastFrameTimeNanos = Long.MIN_VALUE;
                    seekableTransitionState.setFraction(RecyclerView.DECELERATION_RATE);
                    float f = obj2.equals(seekableTransitionState.currentState$delegate.getValue()) ? -4.0f : obj2.equals(parcelableSnapshotMutableState.getValue()) ? -5.0f : -3.0f;
                    transition.updateTarget$animation_core(obj2);
                    transition.setPlayTimeNanos(0L);
                    parcelableSnapshotMutableState.setValue(obj2);
                    seekableTransitionState.setFraction(RecyclerView.DECELERATION_RATE);
                    seekableTransitionState.setCurrentState$animation_core(obj2);
                    transition.resetAnimationFraction$animation_core(f);
                    if (f == -3.0f) {
                        sessionWorker$doWork$2$2.label = 1;
                        if (SeekableTransitionState.access$waitForCompositionAfterTargetStateChange(seekableTransitionState, sessionWorker$doWork$2$2) == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                transition.onTransitionEnd$animation_core();
                return Unit.INSTANCE;
            case 4:
                Object obj3 = sessionWorker$doWork$2$2.L$0;
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = sessionWorker$doWork$2$2.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    anchoredDraggableState.dragTarget$delegate.setValue(obj3);
                    OffersNotificationKt$$ExternalSyntheticLambda3 offersNotificationKt$$ExternalSyntheticLambda3 = new OffersNotificationKt$$ExternalSyntheticLambda3(anchoredDraggableState, 4);
                    SliderDraggableState$drag$2 sliderDraggableState$drag$2 = new SliderDraggableState$drag$2((Function4) sessionWorker$doWork$2$2.$$this$withTimerOrNull, anchoredDraggableState, (Continuation) null, i5);
                    sessionWorker$doWork$2$2.label = 1;
                    if (Draggable2DKt.access$restartable(offersNotificationKt$$ExternalSyntheticLambda3, sliderDraggableState$drag$2, sessionWorker$doWork$2$2) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) anchoredDraggableState.confirmValueChange.invoke(obj3)).booleanValue()) {
                    anchoredDraggableState.anchoredDragScope.dragTo(anchoredDraggableState.getAnchors().positionOf(obj3), anchoredDraggableState.lastVelocity$delegate.getFloatValue());
                    anchoredDraggableState.settledValue$delegate.setValue(obj3);
                    anchoredDraggableState.setCurrentValue(obj3);
                }
                return Unit.INSTANCE;
            case 5:
                androidx.compose.material.AnchoredDraggableState anchoredDraggableState2 = (androidx.compose.material.AnchoredDraggableState) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = sessionWorker$doWork$2$2.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((ParcelableSnapshotMutableState) anchoredDraggableState2.dragTarget$delegate).setValue(sessionWorker$doWork$2$2.L$0);
                    AnchoredDraggableState$$ExternalSyntheticLambda0 anchoredDraggableState$$ExternalSyntheticLambda0 = new AnchoredDraggableState$$ExternalSyntheticLambda0(anchoredDraggableState2, i7);
                    SliderDraggableState$drag$2 sliderDraggableState$drag$22 = new SliderDraggableState$drag$2((Function4) sessionWorker$doWork$2$2.$$this$withTimerOrNull, anchoredDraggableState2, (Continuation) null, i6);
                    sessionWorker$doWork$2$2.label = 1;
                    if (CardKt.access$restartable(anchoredDraggableState$$ExternalSyntheticLambda0, sliderDraggableState$drag$22, sessionWorker$doWork$2$2) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                MutatePriority mutatePriority = (MutatePriority) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                Scene.AnonymousClass1 anonymousClass13 = (Scene.AnonymousClass1) sessionWorker$doWork$2$2.this$0;
                TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) sessionWorker$doWork$2$2.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = sessionWorker$doWork$2$2.label;
                try {
                    if (i19 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1(anonymousClass13, (Continuation) null, 25);
                        sessionWorker$doWork$2$2.label = 2;
                        if (JobKt.withTimeout(1500L, thumbNode$onAttach$1, sessionWorker$doWork$2$2) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i19 != 1 && i19 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (mutatePriority != MutatePriority.PreventUserInput) {
                        tooltipStateImpl.dismiss();
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (mutatePriority != MutatePriority.PreventUserInput) {
                        tooltipStateImpl.dismiss();
                    }
                }
            case 7:
                CalendarBlockerPresenter calendarBlockerPresenter = (CalendarBlockerPresenter) sessionWorker$doWork$2$2.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = sessionWorker$doWork$2$2.label;
                if (i20 != 0) {
                    if (i20 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                MultiBlockerFacilitator$Resolver multiBlockerFacilitator$Resolver = calendarBlockerPresenter.resolver;
                RequestContext requestContext = calendarBlockerPresenter.args.blockersData.requestContext;
                LocalDate localDate = (LocalDate) sessionWorker$doWork$2$2.this$0;
                SetDateRequest setDateRequest = new SetDateRequest(requestContext, (Boolean) sessionWorker$doWork$2$2.$$this$withTimerOrNull, localDate != null ? localDate.atTime(OffsetTime.of(12, 0, 0, 0, ZoneOffset.UTC)).format(DateTimeFormatter.ISO_DATE_TIME) : null, ByteString.EMPTY);
                sessionWorker$doWork$2$2.label = 1;
                Object resolve = multiBlockerFacilitator$Resolver.resolve(setDateRequest, sessionWorker$doWork$2$2);
                return resolve == coroutineSingletons8 ? coroutineSingletons8 : resolve;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = sessionWorker$doWork$2$2.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    passcodePresenter = (PasscodePresenter) sessionWorker$doWork$2$2.this$0;
                    CompletableDeferred completableDeferred = (CompletableDeferred) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                    sessionWorker$doWork$2$2.L$0 = passcodePresenter;
                    sessionWorker$doWork$2$2.label = 1;
                    await = completableDeferred.await(sessionWorker$doWork$2$2);
                    if (await == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    passcodePresenter = (PasscodePresenter) sessionWorker$doWork$2$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    await = obj;
                }
                sessionWorker$doWork$2$2.L$0 = null;
                sessionWorker$doWork$2$2.label = 2;
                Object access$fetchBiometricsToken = PasscodePresenter.access$fetchBiometricsToken(passcodePresenter, (Biometrics$Info) await, sessionWorker$doWork$2$2);
                return access$fetchBiometricsToken == coroutineSingletons9 ? coroutineSingletons9 : access$fetchBiometricsToken;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = sessionWorker$doWork$2$2.label;
                if (i22 != 0) {
                    if (i22 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService = (AppService) ((DisclosurePresenter) sessionWorker$doWork$2$2.L$0).appService;
                BlockersData blockersData = (BlockersData) sessionWorker$doWork$2$2.this$0;
                ClientScenario clientScenario = blockersData.clientScenario;
                String str4 = blockersData.flowToken;
                VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                sessionWorker$doWork$2$2.label = 1;
                Object verifyIdentity = appService.verifyIdentity(clientScenario, str4, verifyIdentityRequest, sessionWorker$doWork$2$2);
                return verifyIdentity == coroutineSingletons10 ? coroutineSingletons10 : verifyIdentity;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = sessionWorker$doWork$2$2.label;
                if (i23 != 0) {
                    if (i23 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RegisterAliasPresenter registerAliasPresenter = (RegisterAliasPresenter) sessionWorker$doWork$2$2.L$0;
                RealPasskeyRepository realPasskeyRepository = registerAliasPresenter.passkeyRepository;
                PasskeyRepository$LoginIdentifier passkeyRepository$LoginIdentifier = (PasskeyRepository$LoginIdentifier) sessionWorker$doWork$2$2.this$0;
                ClientScenario clientScenario2 = (ClientScenario) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                String str5 = registerAliasPresenter.flowToken;
                sessionWorker$doWork$2$2.label = 1;
                Object authenticateWithPasskey = realPasskeyRepository.authenticateWithPasskey(passkeyRepository$LoginIdentifier, clientScenario2, str5, sessionWorker$doWork$2$2);
                return authenticateWithPasskey == coroutineSingletons11 ? coroutineSingletons11 : authenticateWithPasskey;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = sessionWorker$doWork$2$2.label;
                if (i24 != 0) {
                    if (i24 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService2 = (AppService) ((CardLockPresenter) sessionWorker$doWork$2$2.L$0).franklinAppService;
                BlockersData blockersData2 = (BlockersData) sessionWorker$doWork$2$2.this$0;
                ClientScenario clientScenario3 = blockersData2.clientScenario;
                String str6 = blockersData2.flowToken;
                SetAddressRequest setAddressRequest = (SetAddressRequest) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                sessionWorker$doWork$2$2.label = 1;
                Object address = appService2.setAddress(clientScenario3, str6, setAddressRequest, sessionWorker$doWork$2$2);
                return address == coroutineSingletons12 ? coroutineSingletons12 : address;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = sessionWorker$doWork$2$2.label;
                if (i25 != 0) {
                    if (i25 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CardLockPresenter cardLockPresenter = (CardLockPresenter) sessionWorker$doWork$2$2.L$0;
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                BlockersData blockersData3 = ((BlockersScreens.SetNameScreen) cardLockPresenter.args).blockersData;
                AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                SetNamePresenter$createShippingAddressWithName$result$1$1 setNamePresenter$createShippingAddressWithName$result$1$1 = new SetNamePresenter$createShippingAddressWithName$result$1$1((String) sessionWorker$doWork$2$2.this$0, cardLockPresenter, (BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName) sessionWorker$doWork$2$2.$$this$withTimerOrNull, null);
                sessionWorker$doWork$2$2.label = 1;
                Object trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData3, analytics, androidStringManager, sessionWorker$doWork$2$2, null, setNamePresenter$createShippingAddressWithName$result$1$1);
                return trackBlockerSubmissionAnalytics$default == coroutineSingletons13 ? coroutineSingletons13 : trackBlockerSubmissionAnalytics$default;
            case 13:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                List list = (List) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = sessionWorker$doWork$2$2.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int size = list.size();
                    int[] iArr2 = new int[size];
                    for (int i27 = 0; i27 < size; i27++) {
                        iArr2[i27] = -1;
                    }
                    int i28 = 0;
                    for (Object obj4 : list) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        GridItemVisual gridItemVisual = (GridItemVisual) obj4;
                        if (gridItemVisual instanceof GridItemVisual.Card) {
                            iArr2[i28] = arrayList2.size();
                            arrayList2.add(StyledCardViewModelExtKt.toInteractiveCardViewModel(((GridItemVisual.Card) gridItemVisual).viewModel));
                        } else {
                            if (!(gridItemVisual instanceof GridItemVisual.Tag)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Integer num = new Integer(i28);
                            TagFormFactor tagFormFactor = ((GridItemVisual.Tag) gridItemVisual).viewModel.formFactor;
                            TagFormFactor tagFormFactor2 = TagFormFactor.HEART_FIRST_EDITION;
                            linkedHashMap2.put(num, tagFormFactor == tagFormFactor2 ? TagFormFactor.HEART : tagFormFactor);
                            if (tagFormFactor == tagFormFactor2) {
                                linkedHashSet.add(new Integer(i28));
                            }
                        }
                        i28 = i29;
                    }
                    cardDesignLibraryScene.items = list;
                    cardDesignLibraryScene.cards = arrayList2;
                    cardDesignLibraryScene.cardBatchIndex = iArr2;
                    cardDesignLibraryScene.tagSlotFormFactors = linkedHashMap2;
                    cardDesignLibraryScene.firstEditionHeartSlots = linkedHashSet;
                    sessionWorker$doWork$2$2.L$0 = arrayList2;
                    sessionWorker$doWork$2$2.label = 1;
                    if (CardDesignLibraryScene.access$initializeGeometryAndSpacing(cardDesignLibraryScene, sessionWorker$doWork$2$2) != coroutineSingletons14) {
                        arrayList = arrayList2;
                        sessionWorker$doWork$2$2.L$0 = null;
                        sessionWorker$doWork$2$2.label = 2;
                    }
                    return coroutineSingletons14;
                }
                if (i26 != 1) {
                    if (i26 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = (ArrayList) sessionWorker$doWork$2$2.L$0;
                SafeTrace.throwOnFailure(obj);
                sessionWorker$doWork$2$2.L$0 = null;
                sessionWorker$doWork$2$2.label = 2;
                break;
            case 14:
                VerifyCheckDepositPresenter verifyCheckDepositPresenter = (VerifyCheckDepositPresenter) sessionWorker$doWork$2$2.L$0;
                VerifyCheckDepositScreen verifyCheckDepositScreen = verifyCheckDepositPresenter.args;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = sessionWorker$doWork$2$2.label;
                if (i30 != 0) {
                    if (i30 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService3 = verifyCheckDepositPresenter.appService;
                ClientScenario clientScenario4 = verifyCheckDepositScreen.blockersData.clientScenario;
                clientScenario4.getClass();
                BlockersData blockersData4 = verifyCheckDepositScreen.blockersData;
                String str7 = blockersData4.flowToken;
                CheckDepositRequest checkDepositRequest = new CheckDepositRequest((ByteString) ((MutableState) sessionWorker$doWork$2$2.this$0).getValue(), (ByteString) ((MutableState) sessionWorker$doWork$2$2.$$this$withTimerOrNull).getValue(), verifyCheckDepositScreen.blockersData.amount, blockersData4.requestContext, null, ByteString.EMPTY);
                sessionWorker$doWork$2$2.label = 1;
                Object depositCheck = appService3.depositCheck(clientScenario4, str7, checkDepositRequest, sessionWorker$doWork$2$2);
                return depositCheck == coroutineSingletons15 ? coroutineSingletons15 : depositCheck;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = sessionWorker$doWork$2$2.label;
                if (i31 != 0) {
                    if (i31 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService4 = ((RealBlockersHelper) sessionWorker$doWork$2$2.L$0).appService;
                ClientScenario clientScenario5 = (ClientScenario) sessionWorker$doWork$2$2.this$0;
                String str8 = ((BlockersData) sessionWorker$doWork$2$2.$$this$withTimerOrNull).flowToken;
                ResolveMergeRequest resolveMergeRequest = new ResolveMergeRequest(null, Boolean.FALSE, ByteString.EMPTY);
                sessionWorker$doWork$2$2.label = 1;
                Object resolveMerge = appService4.resolveMerge(clientScenario5, str8, resolveMergeRequest, sessionWorker$doWork$2$2);
                return resolveMerge == coroutineSingletons16 ? coroutineSingletons16 : resolveMerge;
            case 16:
                BlockersScreens blockersScreens = (BlockersScreens) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = sessionWorker$doWork$2$2.label;
                if (i32 != 0) {
                    if (i32 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AegisService aegisService = (AegisService) sessionWorker$doWork$2$2.L$0;
                ClientScenario clientScenario6 = blockersScreens.getBlockersData().clientScenario;
                clientScenario6.getClass();
                String str9 = blockersScreens.getBlockersData().flowToken;
                SelectDependentsRequest selectDependentsRequest = (SelectDependentsRequest) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                sessionWorker$doWork$2$2.label = 1;
                Object selectDependents = aegisService.selectDependents(clientScenario6, str9, selectDependentsRequest, sessionWorker$doWork$2$2);
                return selectDependents == coroutineSingletons17 ? coroutineSingletons17 : selectDependents;
            case 17:
                BlockersScreens blockersScreens2 = (BlockersScreens) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = sessionWorker$doWork$2$2.label;
                if (i33 != 0) {
                    if (i33 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                AppService appService5 = (AppService) sessionWorker$doWork$2$2.L$0;
                ClientScenario clientScenario7 = blockersScreens2.getBlockersData().clientScenario;
                clientScenario7.getClass();
                String str10 = blockersScreens2.getBlockersData().flowToken;
                SelectSponsorsRequest selectSponsorsRequest = (SelectSponsorsRequest) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                sessionWorker$doWork$2$2.label = 1;
                Object selectSponsors = appService5.selectSponsors(clientScenario7, str10, selectSponsorsRequest, sessionWorker$doWork$2$2);
                return selectSponsors == coroutineSingletons18 ? coroutineSingletons18 : selectSponsors;
            case 18:
                BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen = (BlockersScreens.ProvisionGooglePayScreen) sessionWorker$doWork$2$2.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = sessionWorker$doWork$2$2.label;
                if (i34 != 0) {
                    if (i34 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                GooglePayService googlePayService = (GooglePayService) ((n) sessionWorker$doWork$2$2.L$0).b;
                ClientScenario clientScenario8 = ClientScenario.PROVISION_GOOGLE_PAY;
                String str11 = provisionGooglePayScreen.blockersData.flowToken;
                Trigger.Companion companion = DigitalWalletToken$Issuer.Companion;
                CompleteDigitalWalletTokenProvisioningRequest completeDigitalWalletTokenProvisioningRequest = new CompleteDigitalWalletTokenProvisioningRequest(provisionGooglePayScreen.blockersData.requestContext, new DigitalWalletTokenProvisioningCompletionData((DigitalWalletTokenProvisioningCompletionData.ProvisioningResult) sessionWorker$doWork$2$2.$$this$withTimerOrNull));
                sessionWorker$doWork$2$2.label = 1;
                Object completeDigitalWalletTokenProvisioning = googlePayService.completeDigitalWalletTokenProvisioning(clientScenario8, str11, completeDigitalWalletTokenProvisioningRequest, sessionWorker$doWork$2$2);
                return completeDigitalWalletTokenProvisioning == coroutineSingletons19 ? coroutineSingletons19 : completeDigitalWalletTokenProvisioning;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = sessionWorker$doWork$2$2.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = (Job) sessionWorker$doWork$2$2.L$0;
                    if (job != null) {
                        sessionWorker$doWork$2$2.label = 1;
                        if (job.join(sessionWorker$doWork$2$2) == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Engine engine = (Engine) sessionWorker$doWork$2$2.this$0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                eglGetDisplay.getClass();
                engine.eglDisplay = eglGetDisplay;
                if (eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1("eglGetDisplay failed");
                } else {
                    int[] iArr3 = new int[2];
                    if (EGL14.eglInitialize(engine.eglDisplay, iArr3, 0, iArr3, 1)) {
                        EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                        int[] iArr4 = new int[1];
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{24, 16});
                        List<Pair> listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(4, "4x MSAA"), new Pair(2, "2x MSAA"), new Pair(null, "No MSAA")});
                        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(5, "window+pbuffer"), new Pair(4, "window-only")}).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                char c2 = c;
                                int intValue = ((Number) pair.first).intValue();
                                String str12 = (String) pair.second;
                                Iterator it2 = listOf.iterator();
                                while (it2.hasNext()) {
                                    int intValue2 = ((Number) it2.next()).intValue();
                                    for (Pair pair2 : listOf2) {
                                        i2 = i9;
                                        Integer num2 = (Integer) pair2.first;
                                        String str13 = (String) pair2.second;
                                        if (num2 != null) {
                                            i = i8;
                                            iArr = new int[19];
                                            iArr[i] = 12352;
                                            iArr[i2] = 68;
                                            iArr[c2] = 12324;
                                            iArr[3] = 8;
                                            iArr[4] = 12323;
                                            iArr[5] = 8;
                                            iArr[6] = 12322;
                                            iArr[7] = 8;
                                            iArr[8] = 12321;
                                            iArr[9] = 8;
                                            iArr[10] = 12325;
                                            iArr[11] = intValue2;
                                            iArr[12] = 12339;
                                            iArr[13] = intValue;
                                            iArr[14] = 12338;
                                            iArr[15] = i2;
                                            iArr[16] = 12337;
                                            iArr[17] = num2.intValue();
                                            iArr[18] = 12344;
                                        } else {
                                            i = i8;
                                            iArr = new int[15];
                                            iArr[i] = 12352;
                                            iArr[i2] = 68;
                                            iArr[c2] = 12324;
                                            iArr[3] = 8;
                                            iArr[4] = 12323;
                                            iArr[5] = 8;
                                            iArr[6] = 12322;
                                            iArr[7] = 8;
                                            iArr[8] = 12321;
                                            iArr[9] = 8;
                                            iArr[10] = 12325;
                                            iArr[11] = intValue2;
                                            iArr[12] = 12339;
                                            iArr[13] = intValue;
                                            iArr[14] = 12344;
                                        }
                                        int[] iArr5 = iArr4;
                                        eGLConfigArr = eGLConfigArr2;
                                        if (!EGL14.eglChooseConfig(engine.eglDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr5, 0) || iArr5[i] <= 0) {
                                            if (num2 != null) {
                                                Timber.Forest forest = Timber.Forest;
                                                forest.tag("SwampGL");
                                                forest.w("%d-bit depth, %s, %s not supported, trying next option", Integer.valueOf(intValue2), str13, str12);
                                            }
                                            eGLConfigArr2 = eGLConfigArr;
                                            iArr4 = iArr5;
                                            i9 = i2;
                                            i8 = i;
                                        } else {
                                            Timber.Forest forest2 = Timber.Forest;
                                            forest2.tag("SwampGL");
                                            forest2.d("Selected EGL config: %d-bit depth, %s, %s", Integer.valueOf(intValue2), str13, str12);
                                        }
                                    }
                                }
                                c = c2;
                            } else {
                                i = i8;
                                i2 = i9;
                                eGLConfigArr = eGLConfigArr2;
                            }
                        }
                        EGLConfig eGLConfig = eGLConfigArr[i];
                        if (eGLConfig != null) {
                            engine.eglConfig = eGLConfig;
                            Engine engine2 = (Engine) sessionWorker$doWork$2$2.this$0;
                            EGLDisplay eGLDisplay = engine2.eglDisplay;
                            EGLConfig eGLConfig2 = engine2.eglConfig;
                            Iterator it3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{3, 2}).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    int intValue3 = ((Number) it3.next()).intValue();
                                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig2, EGL14.EGL_NO_CONTEXT, new int[]{12440, intValue3, 12344}, i);
                                    if (Intrinsics.areEqual(eglCreateContext, EGL14.EGL_NO_CONTEXT) || EGL14.eglGetError() != 12288) {
                                        i2 = 1;
                                        i = 0;
                                    } else {
                                        Timber.Forest forest3 = Timber.Forest;
                                        forest3.tag("SwampGL");
                                        forest3.d("Created EGL context (requested GLES" + intValue3 + ")", new Object[0]);
                                        engine2.glesVersion = intValue3;
                                        eglCreateContext.getClass();
                                        GLThread gLThread = (GLThread) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                                        Engine engine3 = (Engine) sessionWorker$doWork$2$2.this$0;
                                        EGLDisplay eGLDisplay2 = engine3.eglDisplay;
                                        EGLConfig eGLConfig3 = engine3.eglConfig;
                                        eGLDisplay2.getClass();
                                        if (gLThread.lifecycleJob != null) {
                                            gLThread.eglContext = eglCreateContext;
                                            gLThread.eglDisplay = eGLDisplay2;
                                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                            if (!EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eglCreateContext)) {
                                                int eglGetError = EGL14.eglGetError();
                                                if (eglGetError != 12297) {
                                                    forest3.tag("GLThread");
                                                    forest3.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to make context current on SwampGL-Engine (eglError=0x", Integer.toHexString(eglGetError), ")"), new Object[0]);
                                                } else if (eGLConfig3 == null) {
                                                    forest3.tag("GLThread");
                                                    forest3.e("Surfaceless unsupported and no config provided for pbuffer fallback on SwampGL-Engine", new Object[0]);
                                                } else {
                                                    int i36 = i2;
                                                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig3, new int[]{12375, i36, 12374, i36, 12344}, 0);
                                                    if (Intrinsics.areEqual(eglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                                                        forest3.tag("GLThread");
                                                        forest3.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Surfaceless unsupported and pbuffer fallback failed on SwampGL-Engine (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
                                                    } else {
                                                        eglCreatePbufferSurface.getClass();
                                                        gLThread.fallbackPbufferSurface = eglCreatePbufferSurface;
                                                        if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                                            i3 = 0;
                                                            forest3.tag("GLThread");
                                                            forest3.w("EGL context attached on SwampGL-Engine (1x1 pbuffer fallback — no surfaceless)", new Object[0]);
                                                            i4 = 1;
                                                        } else {
                                                            forest3.tag("GLThread");
                                                            forest3.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to make context current with pbuffer fallback on SwampGL-Engine (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
                                                            EGL14.eglDestroySurface(eGLDisplay2, eglCreatePbufferSurface);
                                                            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                                                            eGLSurface2.getClass();
                                                            gLThread.fallbackPbufferSurface = eGLSurface2;
                                                        }
                                                    }
                                                }
                                                forest3.tag("SwampGL");
                                                forest3.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SwampGL failed to make EGL context current on render thread (eglError=0x", Integer.toHexString(EGL14.eglGetError()), ")"), new Object[0]);
                                                return Unit.INSTANCE;
                                            }
                                            forest3.tag("GLThread");
                                            i3 = 0;
                                            forest3.d("EGL context attached on SwampGL-Engine (surfaceless)", new Object[0]);
                                            i4 = i2;
                                            int[] iArr6 = new int[i4];
                                            EGL14.eglQueryContext(((Engine) sessionWorker$doWork$2$2.this$0).eglDisplay, eglCreateContext, 12440, iArr6, i3);
                                            String glGetString = GLES20.glGetString(7938);
                                            forest3.tag("SwampGL");
                                            forest3.i("SwampGL EGLContext created (clientVersion=" + iArr6[i3] + "), GL_VERSION='" + glGetString + "'", new Object[i3]);
                                            return Unit.INSTANCE;
                                        }
                                        a$$ExternalSyntheticBUOutline0.m$1("GLThread not started");
                                    }
                                } else {
                                    OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(EGL14.eglGetError(), "eglCreateContext failed with error: "));
                                }
                            }
                        } else {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("eglChooseConfig failed - no suitable config found");
                        }
                    } else {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("eglInitialize failed");
                    }
                }
                return null;
            case 20:
                RealInitialScreenLoader realInitialScreenLoader = (RealInitialScreenLoader) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = sessionWorker$doWork$2$2.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    janusService = realInitialScreenLoader.appService;
                    appTokenOrNull = PlatformKt.appTokenOrNull(realInitialScreenLoader.sessionManager);
                    if (appTokenOrNull == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    RealBackupService realBackupService = realInitialScreenLoader.backupService;
                    sessionWorker$doWork$2$2.L$0 = janusService;
                    sessionWorker$doWork$2$2.this$0 = appTokenOrNull;
                    sessionWorker$doWork$2$2.label = 1;
                    readBackupTag = realBackupService.readBackupTag(sessionWorker$doWork$2$2);
                    break;
                } else {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str14 = (String) sessionWorker$doWork$2$2.this$0;
                    janusService = (JanusService) sessionWorker$doWork$2$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    appTokenOrNull = str14;
                    readBackupTag = obj;
                }
                GetLinkedAccountsRequest getLinkedAccountsRequest = new GetLinkedAccountsRequest(appTokenOrNull, (String) readBackupTag);
                sessionWorker$doWork$2$2.L$0 = null;
                sessionWorker$doWork$2$2.this$0 = null;
                sessionWorker$doWork$2$2.label = 2;
                Object linkedAccounts = janusService.getLinkedAccounts(getLinkedAccountsRequest, sessionWorker$doWork$2$2);
                if (linkedAccounts != coroutineSingletons21) {
                    return linkedAccounts;
                }
                return coroutineSingletons21;
            case 21:
                RealSessionRefresher realSessionRefresher = (RealSessionRefresher) sessionWorker$doWork$2$2.this$0;
                com.squareup.cash.session.backend.SessionManager sessionManager2 = realSessionRefresher.sessionManager;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = sessionWorker$doWork$2$2.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService6 = realSessionRefresher.appService;
                    RefreshSessionRequest refreshSessionRequest = new RefreshSessionRequest((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull, null, ByteString.EMPTY);
                    sessionWorker$doWork$2$2.label = 1;
                    refreshSession = appService6.refreshSession(refreshSessionRequest, sessionWorker$doWork$2$2);
                    break;
                } else {
                    if (i38 != 1) {
                        if (i38 == 2) {
                            refreshSessionResponse = (RefreshSessionResponse) sessionWorker$doWork$2$2.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Timber.Forest.d("Refreshed session token successfully.", new Object[0]);
                            str = refreshSessionResponse.backup_tag;
                            if (str != null) {
                                RealBackupService realBackupService2 = realSessionRefresher.backupService;
                                sessionWorker$doWork$2$2.L$0 = refreshSessionResponse;
                                sessionWorker$doWork$2$2.label = 3;
                                Object withContext = JobKt.withContext(realBackupService2.ioDispatcher, new RealGcmRegistrar$unregister$2(str, realBackupService2, continuation, i6), sessionWorker$doWork$2$2);
                                if (withContext != coroutineSingletons22) {
                                    withContext = Unit.INSTANCE;
                                    break;
                                }
                            }
                            str2 = refreshSessionResponse.play_integrity_nonce;
                            if (str2 != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i38 != 3) {
                            if (i38 != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            attestClassicRequest = obj;
                            return Unit.INSTANCE;
                        }
                        refreshSessionResponse = (RefreshSessionResponse) sessionWorker$doWork$2$2.L$0;
                        SafeTrace.throwOnFailure(obj);
                        str2 = refreshSessionResponse.play_integrity_nonce;
                        if (str2 != null) {
                            RealDeviceIntegrityAttester realDeviceIntegrityAttester = realSessionRefresher.deviceIntegrityAttester;
                            DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint = DeviceIntegrity$EntryPoint.REFRESH_SESSION;
                            sessionWorker$doWork$2$2.L$0 = null;
                            sessionWorker$doWork$2$2.label = 4;
                            attestClassicRequest = realDeviceIntegrityAttester.attestClassicRequest(str2, deviceIntegrity$EntryPoint, sessionWorker$doWork$2$2);
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    refreshSession = obj;
                }
                ApiResult apiResult = (ApiResult) refreshSession;
                if (apiResult instanceof ApiResult.Success) {
                    RefreshSessionResponse refreshSessionResponse2 = (RefreshSessionResponse) ((ApiResult.Success) apiResult).response;
                    RefreshSessionResponse.Status status = refreshSessionResponse2.status;
                    if (status == null) {
                        status = ProtoDefaults.REFRESH_SESSION_STATUS;
                    }
                    if (RealSessionRefresher$refreshSession$2$WhenMappings.$EnumSwitchMapping$0[status.ordinal()] != 1) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                        return null;
                    }
                    if (PlatformKt.getCurrentSessionState(sessionManager2) instanceof SessionState.Authenticated) {
                        String str15 = refreshSessionResponse2.session_token;
                        str15.getClass();
                        Session session = new Session(str15, SessionStatus.FULL);
                        sessionWorker$doWork$2$2.L$0 = refreshSessionResponse2;
                        sessionWorker$doWork$2$2.label = 2;
                        if (sessionManager2.updateSession(session, "RefreshSessionRequest", sessionWorker$doWork$2$2) != coroutineSingletons22) {
                            refreshSessionResponse = refreshSessionResponse2;
                            Timber.Forest.d("Refreshed session token successfully.", new Object[0]);
                            str = refreshSessionResponse.backup_tag;
                            if (str != null) {
                            }
                            str2 = refreshSessionResponse.play_integrity_nonce;
                            if (str2 != null) {
                            }
                        }
                        return coroutineSingletons22;
                    }
                    refreshSessionResponse = refreshSessionResponse2;
                    str = refreshSessionResponse.backup_tag;
                    if (str != null) {
                    }
                    str2 = refreshSessionResponse.play_integrity_nonce;
                    if (str2 != null) {
                    }
                }
                return Unit.INSTANCE;
            case 22:
                InstrumentDetailsPresenter instrumentDetailsPresenter = (InstrumentDetailsPresenter) sessionWorker$doWork$2$2.L$0;
                BalanceBasedAutoReloadConfirmationScreen balanceBasedAutoReloadConfirmationScreen = (BalanceBasedAutoReloadConfirmationScreen) instrumentDetailsPresenter.ioDispatcher;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = sessionWorker$doWork$2$2.label;
                if (i39 != 0) {
                    if (i39 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService appService7 = (com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService) instrumentDetailsPresenter.instrumentManager;
                String str16 = balanceBasedAutoReloadConfirmationScreen.blockersData.flowToken;
                Money money = (Money) sessionWorker$doWork$2$2.this$0;
                Money money2 = (Money) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                ByteString byteString = ByteString.EMPTY;
                SetBalanceBasedAddCashPreferenceRequest setBalanceBasedAddCashPreferenceRequest = new SetBalanceBasedAddCashPreferenceRequest(new SetBalanceBasedAddCashPreferenceRequest$Preference$Enabled(new SetBalanceBasedAddCashPreferenceRequest.Enabled(money, money2, byteString)), balanceBasedAutoReloadConfirmationScreen.blockersData.requestContext, byteString);
                sessionWorker$doWork$2$2.label = 1;
                Object balanceBasedAddCashPreference = appService7.setBalanceBasedAddCashPreference(str16, setBalanceBasedAddCashPreferenceRequest, sessionWorker$doWork$2$2);
                return balanceBasedAddCashPreference == coroutineSingletons23 ? coroutineSingletons23 : balanceBasedAddCashPreference;
            case 23:
                CardLockPresenter cardLockPresenter2 = (CardLockPresenter) sessionWorker$doWork$2$2.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = sessionWorker$doWork$2$2.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealClockInRepository realClockInRepository = (RealClockInRepository) cardLockPresenter2.franklinAppService;
                    String str17 = (String) sessionWorker$doWork$2$2.this$0;
                    String str18 = (String) sessionWorker$doWork$2$2.$$this$withTimerOrNull;
                    sessionWorker$doWork$2$2.label = 1;
                    break;
                } else {
                    if (i40 != 1) {
                        if (i40 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) cardLockPresenter2.cardLockFlowTypeProvider;
                sessionWorker$doWork$2$2.label = 2;
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = sessionWorker$doWork$2$2.label;
                if (i41 != 0) {
                    if (i41 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimecardsService timecardsService = ((RealClockInRepository) sessionWorker$doWork$2$2.L$0).timecardsService;
                BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) sessionWorker$doWork$2$2.this$0;
                SquareMerchantToken squareMerchantToken = new SquareMerchantToken((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull);
                sessionWorker$doWork$2$2.label = 1;
                Object timecardBreakDefinitions = timecardsService.getTimecardBreakDefinitions(batchGetTimecardBreakDefinitionRequest, squareMerchantToken, sessionWorker$doWork$2$2);
                return timecardBreakDefinitions == coroutineSingletons25 ? coroutineSingletons25 : timecardBreakDefinitions;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = sessionWorker$doWork$2$2.label;
                if (i42 != 0) {
                    if (i42 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimecardsService timecardsService2 = ((RealClockInRepository) sessionWorker$doWork$2$2.L$0).timecardsService;
                GetClockinEssentialsRequest getClockinEssentialsRequest = (GetClockinEssentialsRequest) sessionWorker$doWork$2$2.this$0;
                SquareMerchantToken squareMerchantToken2 = new SquareMerchantToken((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull);
                sessionWorker$doWork$2$2.label = 1;
                Object clockinEssentials = timecardsService2.getClockinEssentials(getClockinEssentialsRequest, squareMerchantToken2, sessionWorker$doWork$2$2);
                return clockinEssentials == coroutineSingletons26 ? coroutineSingletons26 : clockinEssentials;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = sessionWorker$doWork$2$2.label;
                if (i43 != 0) {
                    if (i43 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimecardsService timecardsService3 = ((RealClockInRepository) sessionWorker$doWork$2$2.L$0).timecardsService;
                StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) sessionWorker$doWork$2$2.this$0;
                SquareMerchantToken squareMerchantToken3 = new SquareMerchantToken((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull);
                sessionWorker$doWork$2$2.label = 1;
                Object startTimecardBreak = timecardsService3.startTimecardBreak(startTimecardBreakRequest, squareMerchantToken3, sessionWorker$doWork$2$2);
                return startTimecardBreak == coroutineSingletons27 ? coroutineSingletons27 : startTimecardBreak;
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i44 = sessionWorker$doWork$2$2.label;
                if (i44 != 0) {
                    if (i44 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimecardsService timecardsService4 = ((RealClockInRepository) sessionWorker$doWork$2$2.L$0).timecardsService;
                StartTimecardRequest startTimecardRequest = (StartTimecardRequest) sessionWorker$doWork$2$2.this$0;
                SquareMerchantToken squareMerchantToken4 = new SquareMerchantToken((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull);
                sessionWorker$doWork$2$2.label = 1;
                Object startTimecard = timecardsService4.startTimecard(startTimecardRequest, squareMerchantToken4, sessionWorker$doWork$2$2);
                return startTimecard == coroutineSingletons28 ? coroutineSingletons28 : startTimecard;
            case 28:
                return invokeSuspend$com$squareup$cash$work$presenters$shift$RealClockInRepository$stopBreak$2(obj);
            default:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i45 = sessionWorker$doWork$2$2.label;
                if (i45 != 0) {
                    if (i45 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TimecardsService timecardsService5 = ((RealClockInRepository) sessionWorker$doWork$2$2.L$0).timecardsService;
                StopTimecardRequest stopTimecardRequest = (StopTimecardRequest) sessionWorker$doWork$2$2.this$0;
                SquareMerchantToken squareMerchantToken5 = new SquareMerchantToken((String) sessionWorker$doWork$2$2.$$this$withTimerOrNull);
                sessionWorker$doWork$2$2.label = 1;
                Object stopTimecard = timecardsService5.stopTimecard(stopTimecardRequest, squareMerchantToken5, sessionWorker$doWork$2$2);
                return stopTimecard == coroutineSingletons29 ? coroutineSingletons29 : stopTimecard;
        }
    }

    /* renamed from: androidx.glance.session.SessionWorker$doWork$2$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i) {
            super(i);
            this.$r8$classId = 1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return JobKt.Job$default();
                case 1:
                    return "Problem retrieving system value for screen_brightness";
                default:
                    return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{"SpanEvent"}, 1));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            super(0);
            this.$r8$classId = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$2$2(RealInitialScreenLoader realInitialScreenLoader, Continuation continuation) {
        super(1, continuation);
        this.$r8$classId = 20;
        this.$$this$withTimerOrNull = realInitialScreenLoader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorker$doWork$2$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$$this$withTimerOrNull = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorker$doWork$2$2(Object obj, Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.L$0 = obj2;
        this.$$this$withTimerOrNull = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionWorker$doWork$2$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$$this$withTimerOrNull = obj2;
    }
}
