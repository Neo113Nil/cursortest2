package com.squareup.cash.gcl;

import androidx.compose.runtime.Recomposer$join$2;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker;
import com.squareup.cash.bitcoin.graph.real.BitcoinGraphPrefetch;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.featureflags.AmplitudeExperiments$LocalizationLanguageSpanish;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.gcl.GlobalConfigManager$RefreshResult;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.localization.RealRegionProvider$1$1$1;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.observability.types.MetadataSection$SessionInfoSection;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int I$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(BugsnagClientSandboxSetupTeardown bugsnagClientSandboxSetupTeardown, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 4;
        this.this$0 = bugsnagClientSandboxSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 = new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, (RealGlobalConfigManager) obj2, 0);
                realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1.L$0 = obj;
                return realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1;
            case 1:
                RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$12 = new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, (RealDeepLinkAttributionWorker) obj2, 1);
                realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$12.L$0 = obj;
                return realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$12;
            case 2:
                RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$13 = new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, (BitcoinGraphPrefetch) obj2, 2);
                realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$13.L$0 = obj;
                return realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$13;
            case 3:
                RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1 realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$14 = new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(continuation, (CdpConfigUpdateSetupTeardown) obj2, 3);
                realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$14.L$0 = obj;
                return realGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$14;
            default:
                return new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1((BugsnagClientSandboxSetupTeardown) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r11.invoke(r10) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r11.collect(r0, r10) == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if (r11 == r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r11, r10) == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        if (r11 == r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r11, r1, r10) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r11, r1, r10) == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:
    
        if (r11 == r0) goto L89;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        Object obj2 = this.this$0;
        int i3 = 0;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                RealGlobalConfigManager realGlobalConfigManager = (RealGlobalConfigManager) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow sessionState = realGlobalConfigManager.sessionManager.getSessionState();
                    Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(2, null, 4);
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    if (FlowKt.first(sessionState, recomposer$join$2, this) != coroutineSingletons) {
                        i = 0;
                    }
                    return coroutineSingletons;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    GlobalConfigManager$RefreshResult globalConfigManager$RefreshResult = (GlobalConfigManager$RefreshResult) obj;
                    if (globalConfigManager$RefreshResult instanceof GlobalConfigManager$RefreshResult.Failure) {
                        Timber.Forest forest = Timber.Forest;
                        RefreshTimeoutException refreshTimeoutException = ((GlobalConfigManager$RefreshResult.Failure) globalConfigManager$RefreshResult).exception;
                        forest.e(String.valueOf(refreshTimeoutException.getMessage()), new Object[0], refreshTimeoutException);
                    }
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.I$0 = i;
                this.label = 2;
                obj = JobKt.withContext(realGlobalConfigManager.ioDispatcher, new RealGlobalConfigManager$tryRefreshCache$2(realGlobalConfigManager, continuation, i3), this);
                break;
            case 1:
                RealDeepLinkAttributionWorker realDeepLinkAttributionWorker = (RealDeepLinkAttributionWorker) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow onboardedAccountStatus = realDeepLinkAttributionWorker.sessionManager.getOnboardedAccountStatus();
                    Recomposer$join$2 recomposer$join$22 = new Recomposer$join$2(2, null, 1);
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Flow flow = realDeepLinkAttributionWorker.activityEvents;
                MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$1 = new MLKitTitleGenerator$prepareModel$1(realDeepLinkAttributionWorker, null, 17);
                this.L$0 = null;
                this.I$0 = i3;
                this.label = 2;
                break;
            case 2:
                BitcoinGraphPrefetch bitcoinGraphPrefetch = (BitcoinGraphPrefetch) obj2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow hasBitcoinActivity = ((RealBitcoinActivityProvider) bitcoinGraphPrefetch.bitcoinActivityProvider).hasBitcoinActivity();
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = FlowKt.first(hasBitcoinActivity, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 bitcoinGraphModel = ((RealBitcoinGraphModelProvider) bitcoinGraphPrefetch.graphModelProvider).bitcoinGraphModel(HistoricalRange.DAY);
                    this.L$0 = null;
                    this.I$0 = i3;
                    this.label = 2;
                    break;
                }
                return Unit.INSTANCE;
            case 3:
                CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = (CdpConfigUpdateSetupTeardown) obj2;
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) cdpConfigUpdateSetupTeardown.featureFlagManager;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    Object join = ((RealFeatureFlagManager) featureFlagManager).featureFlagsQueried.join(this);
                    if (join != coroutineSingletons4) {
                        join = Unit.INSTANCE;
                        break;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                RealFeatureFlagManager$values$$inlined$map$1 values = ((RealFeatureFlagManager) featureFlagManager).values(AmplitudeExperiments$LocalizationLanguageSpanish.INSTANCE);
                RealRegionProvider$1$1$1 realRegionProvider$1$1$1 = new RealRegionProvider$1$1$1(cdpConfigUpdateSetupTeardown, 27);
                this.L$0 = null;
                this.I$0 = i3;
                this.label = 2;
                break;
            default:
                BugsnagClientSandboxSetupTeardown bugsnagClientSandboxSetupTeardown = (BugsnagClientSandboxSetupTeardown) obj2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.I$0;
                try {
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Scene.AnonymousClass1 anonymousClass1 = new Scene.AnonymousClass1(bugsnagClientSandboxSetupTeardown, (Continuation) null, 27);
                        this.L$0 = bugsnagClientSandboxSetupTeardown;
                        this.label = 0;
                        this.I$0 = 1;
                        break;
                    } else {
                        if (i8 != 1) {
                            if (i8 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        i3 = this.label;
                        bugsnagClientSandboxSetupTeardown = (BugsnagClientSandboxSetupTeardown) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.L$0 = bugsnagClientSandboxSetupTeardown;
                    this.label = i3;
                    this.I$0 = 2;
                    JobKt.awaitCancellation(this);
                    return coroutineSingletons5;
                } catch (Throwable th) {
                    bugsnagClientSandboxSetupTeardown.bugsnagClient.clearMetadata(MetadataSection$SessionInfoSection.INSTANCE, MetadataSection$SessionInfoSection.RegionKey.INSTANCE);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
