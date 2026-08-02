package com.squareup.cash.observability.backend.real;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.cdp.backend.android.AndroidSessionIdProvider;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockRecentScreenshotsDisabler$special$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.datadog.android.Datadog;
import com.datadog.android.Datadog$initialize$1$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.Rum;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.tracking.JetpackViewAttributesProvider;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.trace.Trace;
import com.google.android.gms.dynamite.zzh;
import com.google.android.gms.tasks.zzb;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$1;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileObservabilityConfig;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableMobileObservabilityVitalTracking;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import io.opentelemetry.api.GlobalOpenTelemetry;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown implements IoSetupTeardown {
    public final BugsnagClient bugsnagClient;
    public final AndroidDeviceInfo deviceInfo;
    public final FeatureFlagManager featureFlagManager;
    public final RealFeatureFlagManager$values$$inlined$map$1 mobileObservabilityConfigFlow;
    public final AppLockRecentScreenshotsDisabler$special$$inlined$map$1 mobileObservabilityEnabledFlow;
    public final AppLockRecentScreenshotsDisabler$special$$inlined$map$1 mobileVitalEnabledFlow;
    public final RealObservabilityManager observabilityManager;
    public final Flow sessionAppToken;
    public final Flow sessionCustomerToken;
    public final ReadonlyStateFlow sessionId;
    public final SessionManager sessionManager;

    public ObservabilitySetupTeardown(FeatureFlagManager featureFlagManager, RealObservabilityManager realObservabilityManager, SessionManager sessionManager, AndroidSessionIdProvider androidSessionIdProvider, BugsnagClient bugsnagClient, AndroidDeviceInfo androidDeviceInfo) {
        this.featureFlagManager = featureFlagManager;
        this.observabilityManager = realObservabilityManager;
        this.sessionManager = sessionManager;
        this.bugsnagClient = bugsnagClient;
        this.deviceInfo = androidDeviceInfo;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        final int i = 1;
        this.mobileObservabilityEnabledFlow = new AppLockRecentScreenshotsDisabler$special$$inlined$map$1(realFeatureFlagManager.peekValues(LaunchDarklyFeatureFlags$EnableMobileObservabilityAndroid.INSTANCE), i);
        this.mobileObservabilityConfigFlow = realFeatureFlagManager.peekValues(JsonFeatureFlags$MobileObservabilityConfig.INSTANCE);
        this.mobileVitalEnabledFlow = new AppLockRecentScreenshotsDisabler$special$$inlined$map$1(realFeatureFlagManager.peekValues(LaunchDarklyFeatureFlags$EnableMobileObservabilityVitalTracking.INSTANCE), 2);
        final StateFlow sessionState = sessionManager.getSessionState();
        final int i2 = 0;
        this.sessionAppToken = FlowKt.distinctUntilChanged(new Flow() { // from class: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3

            /* renamed from: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ FlowCollector $this_unsafeFlow;
                public final /* synthetic */ ObservabilitySetupTeardown this$0;

                /* renamed from: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= PKIFailureInfo.systemUnavail;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, ObservabilitySetupTeardown observabilitySetupTeardown, int i) {
                    this.$r8$classId = i;
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = observabilitySetupTeardown;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ObservabilitySetupTeardown$special$$inlined$map$4$2$1 observabilitySetupTeardown$special$$inlined$map$4$2$1;
                    int i2;
                    int i3 = this.$r8$classId;
                    ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
                    FlowCollector flowCollector = this.$this_unsafeFlow;
                    switch (i3) {
                        case 0:
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i4 = anonymousClass1.label;
                                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                                    anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                                    Object obj2 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        SafeTrace.throwOnFailure(obj2);
                                        String appTokenOrNull = PlatformKt.appTokenOrNull(observabilitySetupTeardown.sessionManager);
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(appTokenOrNull, anonymousClass1) == coroutineSingletons) {
                                            break;
                                        }
                                    } else if (i != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj2);
                                    }
                                    break;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                        default:
                            if (continuation instanceof ObservabilitySetupTeardown$special$$inlined$map$4$2$1) {
                                observabilitySetupTeardown$special$$inlined$map$4$2$1 = (ObservabilitySetupTeardown$special$$inlined$map$4$2$1) continuation;
                                int i5 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                    observabilitySetupTeardown$special$$inlined$map$4$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                                    Object obj3 = observabilitySetupTeardown$special$$inlined$map$4$2$1.result;
                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i2 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                                    if (i2 != 0) {
                                        SafeTrace.throwOnFailure(obj3);
                                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(observabilitySetupTeardown.sessionManager);
                                        observabilitySetupTeardown$special$$inlined$map$4$2$1.label = 1;
                                        if (flowCollector.emit(activeAccountTokenOrNull, observabilitySetupTeardown$special$$inlined$map$4$2$1) == coroutineSingletons3) {
                                            break;
                                        }
                                    } else if (i2 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj3);
                                    }
                                    break;
                                }
                            }
                            observabilitySetupTeardown$special$$inlined$map$4$2$1 = new ObservabilitySetupTeardown$special$$inlined$map$4$2$1(this, continuation);
                            Object obj32 = observabilitySetupTeardown$special$$inlined$map$4$2$1.result;
                            CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                            if (i2 != 0) {
                            }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                int i3 = i2;
                ObservabilitySetupTeardown observabilitySetupTeardown = this;
                Flow flow = sessionState;
                switch (i3) {
                    case 0:
                        Object collect = flow.collect(new AnonymousClass2(flowCollector, observabilitySetupTeardown, 0), continuation);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect2 = flow.collect(new AnonymousClass2(flowCollector, observabilitySetupTeardown, 1), continuation);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final StateFlow sessionState2 = sessionManager.getSessionState();
        this.sessionCustomerToken = FlowKt.distinctUntilChanged(new Flow() { // from class: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3

            /* renamed from: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3$2, reason: invalid class name */
            public final class AnonymousClass2 implements FlowCollector {
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ FlowCollector $this_unsafeFlow;
                public final /* synthetic */ ObservabilitySetupTeardown this$0;

                /* renamed from: com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= PKIFailureInfo.systemUnavail;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, ObservabilitySetupTeardown observabilitySetupTeardown, int i) {
                    this.$r8$classId = i;
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = observabilitySetupTeardown;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ObservabilitySetupTeardown$special$$inlined$map$4$2$1 observabilitySetupTeardown$special$$inlined$map$4$2$1;
                    int i2;
                    int i3 = this.$r8$classId;
                    ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
                    FlowCollector flowCollector = this.$this_unsafeFlow;
                    switch (i3) {
                        case 0:
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i4 = anonymousClass1.label;
                                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                                    anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                                    Object obj22 = anonymousClass1.result;
                                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        SafeTrace.throwOnFailure(obj22);
                                        String appTokenOrNull = PlatformKt.appTokenOrNull(observabilitySetupTeardown.sessionManager);
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(appTokenOrNull, anonymousClass1) == coroutineSingletons2) {
                                            break;
                                        }
                                    } else if (i != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj22);
                                    }
                                    break;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj222 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                        default:
                            if (continuation instanceof ObservabilitySetupTeardown$special$$inlined$map$4$2$1) {
                                observabilitySetupTeardown$special$$inlined$map$4$2$1 = (ObservabilitySetupTeardown$special$$inlined$map$4$2$1) continuation;
                                int i5 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                    observabilitySetupTeardown$special$$inlined$map$4$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                                    Object obj32 = observabilitySetupTeardown$special$$inlined$map$4$2$1.result;
                                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    i2 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                                    if (i2 != 0) {
                                        SafeTrace.throwOnFailure(obj32);
                                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(observabilitySetupTeardown.sessionManager);
                                        observabilitySetupTeardown$special$$inlined$map$4$2$1.label = 1;
                                        if (flowCollector.emit(activeAccountTokenOrNull, observabilitySetupTeardown$special$$inlined$map$4$2$1) == coroutineSingletons32) {
                                            break;
                                        }
                                    } else if (i2 != 1) {
                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    } else {
                                        SafeTrace.throwOnFailure(obj32);
                                    }
                                    break;
                                }
                            }
                            observabilitySetupTeardown$special$$inlined$map$4$2$1 = new ObservabilitySetupTeardown$special$$inlined$map$4$2$1(this, continuation);
                            Object obj322 = observabilitySetupTeardown$special$$inlined$map$4$2$1.result;
                            CoroutineSingletons coroutineSingletons322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = observabilitySetupTeardown$special$$inlined$map$4$2$1.label;
                            if (i2 != 0) {
                            }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                int i3 = i;
                ObservabilitySetupTeardown observabilitySetupTeardown = this;
                Flow flow = sessionState2;
                switch (i3) {
                    case 0:
                        Object collect = flow.collect(new AnonymousClass2(flowCollector, observabilitySetupTeardown, 0), continuation);
                        if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                    default:
                        Object collect2 = flow.collect(new AnonymousClass2(flowCollector, observabilitySetupTeardown, 1), continuation);
                        if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            break;
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.sessionId = FlowKt.asStateFlow(androidSessionIdProvider.sessionId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$populateInteractivitySessionId(ObservabilitySetupTeardown observabilitySetupTeardown, ContinuationImpl continuationImpl) {
        ObservabilitySetupTeardown$populateInteractivitySessionId$1 observabilitySetupTeardown$populateInteractivitySessionId$1;
        int i;
        if (continuationImpl instanceof ObservabilitySetupTeardown$populateInteractivitySessionId$1) {
            observabilitySetupTeardown$populateInteractivitySessionId$1 = (ObservabilitySetupTeardown$populateInteractivitySessionId$1) continuationImpl;
            int i2 = observabilitySetupTeardown$populateInteractivitySessionId$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                observabilitySetupTeardown$populateInteractivitySessionId$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = observabilitySetupTeardown$populateInteractivitySessionId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observabilitySetupTeardown$populateInteractivitySessionId$1.label;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ReadonlyStateFlow readonlyStateFlow = observabilitySetupTeardown.sessionId;
                    ObservabilitySetupTeardown$manageDatadogLifecycle$5 observabilitySetupTeardown$manageDatadogLifecycle$5 = new ObservabilitySetupTeardown$manageDatadogLifecycle$5(observabilitySetupTeardown, i3);
                    observabilitySetupTeardown$populateInteractivitySessionId$1.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(observabilitySetupTeardown$manageDatadogLifecycle$5, observabilitySetupTeardown$populateInteractivitySessionId$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        observabilitySetupTeardown$populateInteractivitySessionId$1 = new ObservabilitySetupTeardown$populateInteractivitySessionId$1(observabilitySetupTeardown, continuationImpl);
        Object obj2 = observabilitySetupTeardown$populateInteractivitySessionId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observabilitySetupTeardown$populateInteractivitySessionId$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$startDatadog(ObservabilitySetupTeardown observabilitySetupTeardown, boolean z, FeatureFlag$JsonFeatureFlag.Options options, boolean z2, ContinuationImpl continuationImpl) {
        ObservabilitySetupTeardown$startDatadog$1 observabilitySetupTeardown$startDatadog$1;
        int i;
        Object obj;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        RealObservabilityManager realObservabilityManager = observabilitySetupTeardown.observabilityManager;
        if (continuationImpl instanceof ObservabilitySetupTeardown$startDatadog$1) {
            observabilitySetupTeardown$startDatadog$1 = (ObservabilitySetupTeardown$startDatadog$1) continuationImpl;
            int i2 = observabilitySetupTeardown$startDatadog$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                observabilitySetupTeardown$startDatadog$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = observabilitySetupTeardown$startDatadog$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = observabilitySetupTeardown$startDatadog$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    observabilitySetupTeardown$startDatadog$1.label = 1;
                    if (Datadog.isInitialized()) {
                        obj = Unit.INSTANCE;
                    } else {
                        RealDatadogClient realDatadogClient = realObservabilityManager.datadogClient;
                        options.getClass();
                        if (z) {
                            String lowerCase = realDatadogClient.environment.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            Camera2Controller camera2Controller = new Camera2Controller(realDatadogClient.clientToken, new Regex("[^a-zA-Z0-9_:./-]").replace(lowerCase, "_"), realDatadogClient.flavor);
                            camera2Controller.setFirstPartyHosts(realDatadogClient.firstPartyHosts);
                            camera2Controller.setCrashReportsEnabled();
                            Configuration build = camera2Controller.build();
                            Context context = realDatadogClient.context;
                            WorkLauncherImpl workLauncherImpl = Datadog.registry;
                            synchronized (workLauncherImpl) {
                                if (((InternalSdkCore) ((LinkedHashMap) workLauncherImpl.workTaskExecutor).get("_dd.sdk_core.default")) != null) {
                                    DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 4, InternalLogger.Target.USER, Datadog$initialize$1$1.INSTANCE, null, false, 56);
                                } else {
                                    zzh zzhVar = Datadog.hashGenerator;
                                    String str = "null/" + build.getCoreConfig$dd_sdk_android_core_release().getSite().getSiteName$dd_sdk_android_core_release();
                                    zzhVar.getClass();
                                    String generate = zzh.generate(str);
                                    if (generate == null) {
                                        DBUtil.log$default(RuntimeUtilsKt.unboundInternalLogger, 5, InternalLogger.Target.USER, Datadog$initialize$1$1.INSTANCE$1, null, false, 56);
                                    } else {
                                        String str2 = "_dd.sdk_core.default";
                                        DatadogCore datadogCore = new DatadogCore(context, generate, "_dd.sdk_core.default");
                                        datadogCore.initialize$dd_sdk_android_core_release(build);
                                        datadogCore.getCoreFeature$dd_sdk_android_core_release().getTrackingConsentProvider$dd_sdk_android_core_release().setConsent();
                                        LinkedHashMap linkedHashMap = (LinkedHashMap) workLauncherImpl.workTaskExecutor;
                                        if (linkedHashMap.containsKey("_dd.sdk_core.default")) {
                                            DBUtil.log$default((InternalLogger) workLauncherImpl.processor, 4, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str2, 4), null, false, 56);
                                        } else {
                                            linkedHashMap.put("_dd.sdk_core.default", datadogCore);
                                        }
                                    }
                                }
                            }
                            JsonFeatureFlags$MobileObservabilityConfig.Config config = (JsonFeatureFlags$MobileObservabilityConfig.Config) options.value;
                            int i3 = config.datadogRumSampleRateAndroid;
                            int i4 = config.datadogTelemetrySampleRateAndroid;
                            AndroidSvg androidSvg = new AndroidSvg(realDatadogClient.applicationId, 27);
                            if (!z2) {
                                androidSvg.setVitalsUpdateFrequency();
                            }
                            androidSvg.useViewTrackingStrategy();
                            androidSvg.renderOptions = RumFeature.Configuration.copy$default((RumFeature.Configuration) androidSvg.renderOptions, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ArraysKt___ArraysKt.toList(new JetpackViewAttributesProvider[0]), new NoOpInteractionPredicate(), null, -97);
                            androidSvg.trackLongTasks();
                            androidSvg.trackFrustrations();
                            androidSvg.trackBackgroundEvents();
                            androidSvg.setTelemetrySampleRate(i4);
                            androidSvg.setSessionSampleRate(i3);
                            Rum.enable$default(androidSvg.build());
                            realDatadogClient.populateGlobalAttributes(new WorkApplet$applet$1(realDatadogClient.rumMonitor.invoke()));
                            double d = ((JsonFeatureFlags$MobileObservabilityConfig.Config) options.value).datadogTracerSampleRateAndroid;
                            Trace.enable$default(new zzb(9).build());
                            try {
                                GlobalOpenTelemetry.set(new GlobalOpenTelemetry.ObfuscatedOpenTelemetry(d, realDatadogClient));
                            } catch (IllegalStateException unused) {
                            }
                        }
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("DATADOG");
                        forest.i("Datadog initialized: " + Datadog.isInitialized(), new Object[0]);
                        realObservabilityManager.preInitializationQueue.close(null);
                        obj = JobKt.withContext(realObservabilityManager.ioContext, new MusicPresenter$models$2$1(realObservabilityManager, continuation, 26), observabilitySetupTeardown$startDatadog$1);
                        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj != obj4) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != obj4) {
                            obj = Unit.INSTANCE;
                        }
                    }
                    if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj = Unit.INSTANCE;
                    }
                    if (obj == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                concurrentLinkedQueue = ((RealFeatureFlagManager) observabilitySetupTeardown.featureFlagManager).interceptors;
                if (!concurrentLinkedQueue.contains(realObservabilityManager)) {
                    concurrentLinkedQueue.add(realObservabilityManager);
                }
                return Unit.INSTANCE;
            }
        }
        observabilitySetupTeardown$startDatadog$1 = new ObservabilitySetupTeardown$startDatadog$1(observabilitySetupTeardown, continuationImpl);
        Object obj22 = observabilitySetupTeardown$startDatadog$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = observabilitySetupTeardown$startDatadog$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        concurrentLinkedQueue = ((RealFeatureFlagManager) observabilitySetupTeardown.featureFlagManager).interceptors;
        if (!concurrentLinkedQueue.contains(realObservabilityManager)) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new ObservabilitySetupTeardown$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new ObservabilitySetupTeardown$setup$1$1(this, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$1(this, continuation, 5), 3);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 25));
    }
}
