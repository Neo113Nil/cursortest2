package app.cash.badging.backend;

import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.tracing.Trace;
import androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1;
import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.passcode.backend.AppLockMonitor;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.attribution.InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.featureflags.AmplitudeExperiments$NuxActivation;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.limits.backend.real.RealLimitsPageletStore;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager;
import com.squareup.cash.observability.backend.real.bugsnag.ErrorReportingWorker;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.DerivedStateFlow;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FinishSetupTileBadgeCounter implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final Object featureFlagManager;
    public final Object syncValueReader;

    public /* synthetic */ FinishSetupTileBadgeCounter(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.syncValueReader = obj;
        this.featureFlagManager = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (((kotlin.jvm.functions.Function3) r15).invoke(r1, r0, r3) == r2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
    
        if (r0 == r2) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ee -> B:26:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010b -> B:29:0x0104). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1;
        int i;
        Throwable th;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
        int i2;
        int i3;
        FlowCollector flowCollector2;
        int i4;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12;
        int i5;
        long j;
        Throwable th2;
        Serializable catchImpl;
        FlowCollector flowCollector3 = flowCollector;
        int i6 = this.$r8$classId;
        int i7 = 17;
        int i8 = 21;
        long j2 = 0;
        FlowKt__ZipKt$nullArrayFactory$1 flowKt__ZipKt$nullArrayFactory$1 = FlowKt__ZipKt$nullArrayFactory$1.INSTANCE;
        int i9 = 2;
        int i10 = 1;
        int i11 = 0;
        Continuation continuation2 = null;
        Object obj = this.featureFlagManager;
        Object obj2 = this.syncValueReader;
        switch (i6) {
            case 0:
                Object combineInternal = CombineKt.combineInternal(continuation, flowKt__ZipKt$nullArrayFactory$1, new FlowKt__ZipKt$combine$1$1(new FinishSetupTileBadgeCounter$collect$2(3, null), continuation2, i11), flowCollector3, new Flow[]{Trace.valuesState((FeatureFlagManager) obj, AmplitudeExperiments$NuxActivation.INSTANCE), ((SyncValueReader) obj2).getSingleValueOrDefault(AndroidSyncValueSpecs.FinishSetupTile, new Long(0L), new TransactorKt$$ExternalSyntheticLambda0(this))});
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    combineInternal = Unit.INSTANCE;
                }
                return combineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? combineInternal : Unit.INSTANCE;
            case 1:
                Flow[] flowArr = (Flow[]) obj2;
                Object combineInternal2 = CombineKt.combineInternal(continuation, new Badger$collect$$inlined$combine$2$2(flowArr), new Badger$collect$$inlined$combine$2$3(continuation2, (Badger) obj, i11), flowCollector3, flowArr);
                return combineInternal2 == CoroutineSingletons.COROUTINE_SUSPENDED ? combineInternal2 : Unit.INSTANCE;
            case 2:
                Object collect = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(6, flowCollector3, (SessionManager) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
            case 3:
                Object collect2 = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(8, flowCollector3, (AppLockMonitor) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : Unit.INSTANCE;
            case 4:
                Object collect3 = ((SafeFlow) obj2).collect(new FlowQuery$mapToOne$$inlined$map$1$2(flowCollector3, (CoroutineContext) obj, i11), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : Unit.INSTANCE;
            case 5:
                Object collect4 = ((ChannelFlowBuilder) obj2).collect(new CashCdpConfigProvider$1$2(9, flowCollector3, (AppMessageSyncer) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : Unit.INSTANCE;
            case 6:
                Object collect5 = ((FlowQuery$mapToList$$inlined$map$1) obj2).collect(new CashCdpConfigProvider$1$2(11, flowCollector3, (RealInAppNotificationPresenter) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : Unit.INSTANCE;
            case 7:
                Object collect6 = ((Flow) obj2).collect(new InstallAttributer$setup$1$1$invokeSuspend$$inlined$map$1$2(flowCollector3, (InstallAttributer) obj, i11), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : Unit.INSTANCE;
            case 8:
                Object collect7 = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(14, flowCollector3, (RealSyncValueReader) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : Unit.INSTANCE;
            case 9:
                Object collect8 = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(15, flowCollector3, (RealFeatureEligibilityRepository) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : Unit.INSTANCE;
            case 10:
                Object collect9 = ((FinishSetupTileBadgeCounter) obj2).collect(new CashCdpConfigProvider$1$2(16, flowCollector3, (EligibleFeature[]) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : Unit.INSTANCE;
            case 11:
                Object collect10 = ((Flow) obj2).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector3, (RealFeatureFlagManager) obj, 12), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : Unit.INSTANCE;
            case 12:
                ((DerivedStateFlow) obj2).collect(new CashCdpConfigProvider$1$2(i7, flowCollector3, (RealFilamentSupportProvider) obj), continuation);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 13:
                Object collect11 = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(20, flowCollector3, (RealIdentityVerificationBadger) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : Unit.INSTANCE;
            case 14:
                Object collect12 = ((Flow) obj2).collect(new CashCdpConfigProvider$1$2(i8, flowCollector3, (RealIdentityVerificationRepo) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : Unit.INSTANCE;
            case 15:
                RealLimitsPageletStore realLimitsPageletStore = (RealLimitsPageletStore) obj2;
                Object collect13 = FlowKt.flowOn(new SafeFlow(new CoroutinesKt$until$2(realLimitsPageletStore, continuation2, i9)), realLimitsPageletStore.ioDispatcher).collect(new CashCdpConfigProvider$1$2(22, flowCollector3, this), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (collect13 != coroutineSingletons) {
                    collect13 = Unit.INSTANCE;
                }
                return collect13 == coroutineSingletons ? collect13 : Unit.INSTANCE;
            case 16:
                Object collect14 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj2).collect(new CashCdpConfigProvider$1$2(23, flowCollector3, (RealLocaleManager) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : Unit.INSTANCE;
            case 17:
                Object collect15 = ((Flow) obj2).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector3, (RealMarketCapabilitiesDataManager) obj, i7), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : Unit.INSTANCE;
            case 18:
                Object collect16 = ((Flow) obj2).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector3, (ErrorReportingWorker) obj, i8), continuation);
                return collect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect16 : Unit.INSTANCE;
            case 19:
                Object collect17 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj2).collect(new CashCdpConfigProvider$1$2(25, flowCollector3, (MainContainerDelegate) obj), continuation);
                return collect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect17 : Unit.INSTANCE;
            case 20:
                Object collect18 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj2).collect(new CashCdpConfigProvider$1$2(27, flowCollector3, (RealCardAppletTileRepository) obj), continuation);
                return collect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect18 : Unit.INSTANCE;
            case 21:
                if (continuation instanceof FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) {
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1) continuation;
                    int i12 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
                    if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = i12 - PKIFailureInfo.systemUnavail;
                        Object obj3 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.result;
                        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2 = flowCollector3;
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0 = 0;
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = 1;
                            obj3 = FlowKt.catchImpl((Flow) obj2, flowCollector3, flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1);
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj3);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i11 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0;
                            flowCollector3 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2;
                            SafeTrace.throwOnFailure(obj3);
                        }
                        th = (Throwable) obj3;
                        if (th != null) {
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.L$2 = null;
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.I$0 = i11;
                            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj32 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.result;
                Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1.label;
                if (i != 0) {
                }
                th = (Throwable) obj32;
                if (th != null) {
                }
                return Unit.INSTANCE;
            case 22:
                if (continuation instanceof FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) {
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1) continuation;
                    int i13 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
                    if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = i13 - PKIFailureInfo.systemUnavail;
                        Object obj5 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            i3 = 0;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2 = flowCollector3;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3 = null;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0 = i3;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0 = j2;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1 = 0;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = 1;
                            catchImpl = FlowKt.catchImpl((FlowUtil$createFlow$$inlined$map$1) obj2, flowCollector3, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1);
                            if (catchImpl != coroutineSingletons2) {
                            }
                            return coroutineSingletons2;
                        }
                        if (i2 == 1) {
                            int i14 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1;
                            long j3 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0;
                            int i15 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0;
                            flowCollector2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2;
                            SafeTrace.throwOnFailure(obj5);
                            FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$13 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                            i5 = i14;
                            i4 = i15;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$13;
                            j = j3;
                            th2 = (Throwable) obj5;
                            if (th2 == null) {
                            }
                        } else {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0;
                            int i16 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0;
                            Throwable th3 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3;
                            flowCollector2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2;
                            SafeTrace.throwOnFailure(obj5);
                            if (!((Boolean) obj5).booleanValue()) {
                                j++;
                                i3 = i16;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                                i5 = 1;
                                long j4 = j;
                                flowCollector3 = flowCollector2;
                                j2 = j4;
                                if (i5 != 0) {
                                    return Unit.INSTANCE;
                                }
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$2 = flowCollector3;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.L$3 = null;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$0 = i3;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.J$0 = j2;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.I$1 = 0;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label = 1;
                                catchImpl = FlowKt.catchImpl((FlowUtil$createFlow$$inlined$map$1) obj2, flowCollector3, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1);
                                if (catchImpl != coroutineSingletons2) {
                                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1;
                                    i5 = 0;
                                    long j5 = j2;
                                    i4 = i3;
                                    flowCollector2 = flowCollector3;
                                    obj5 = catchImpl;
                                    j = j5;
                                    th2 = (Throwable) obj5;
                                    if (th2 == null) {
                                        Long l = new Long(j);
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.L$2 = flowCollector2;
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.L$3 = th2;
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.I$0 = i4;
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.J$0 = j;
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.I$1 = i5;
                                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12.label = 2;
                                        Object invoke = ((UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1) obj).invoke(flowCollector2, th2, l, flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12);
                                        if (invoke != coroutineSingletons2) {
                                            int i17 = i4;
                                            th3 = th2;
                                            obj5 = invoke;
                                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$12;
                                            i16 = i17;
                                            if (!((Boolean) obj5).booleanValue()) {
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        i3 = i4;
                                        long j42 = j;
                                        flowCollector3 = flowCollector2;
                                        j2 = j42;
                                        if (i5 != 0) {
                                        }
                                    }
                                }
                                return coroutineSingletons2;
                            }
                        }
                    }
                }
                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 = new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1(this, continuation);
                Object obj52 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.result;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1.label;
                if (i2 != 0) {
                }
            case 23:
                Object collect19 = ((Flow) obj2).collect(new FlowKt__TransformKt$withIndex$1$1(flowCollector3, (KClass) obj, i10), continuation);
                return collect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect19 : Unit.INSTANCE;
            case 24:
                Object combineInternal3 = CombineKt.combineInternal(continuation, flowKt__ZipKt$nullArrayFactory$1, new FlowKt__ZipKt$combine$1$1(continuation2, (Function4) obj, 4), flowCollector3, (Flow[]) obj2);
                return combineInternal3 == CoroutineSingletons.COROUTINE_SUSPENDED ? combineInternal3 : Unit.INSTANCE;
            default:
                Object combineInternal4 = CombineKt.combineInternal(continuation, flowKt__ZipKt$nullArrayFactory$1, new FlowKt__ZipKt$combine$1$1(continuation2, (Function6) obj, 5), flowCollector3, (Flow[]) obj2);
                return combineInternal4 == CoroutineSingletons.COROUTINE_SUSPENDED ? combineInternal4 : Unit.INSTANCE;
        }
    }
}
