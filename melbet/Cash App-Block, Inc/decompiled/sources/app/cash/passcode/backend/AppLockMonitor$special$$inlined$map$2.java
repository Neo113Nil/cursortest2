package app.cash.passcode.backend;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.time.DurationKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.FlowCoroutine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppLockMonitor$special$$inlined$map$2 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_unsafeTransform$inlined;

    public /* synthetic */ AppLockMonitor$special$$inlined$map$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r10.emit(r9, r0) != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r9 == r11) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1;
        int i;
        int i2 = this.$r8$classId;
        int i3 = 18;
        int i4 = 14;
        int i5 = 0;
        int i6 = 16;
        int i7 = 4;
        int i8 = 1;
        Continuation continuation2 = null;
        Object obj = this.$this_unsafeTransform$inlined;
        switch (i2) {
            case 0:
                Object collect = ((StateFlow) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, i7), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((PreferenceFlow) obj).collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 21), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((CryptoBalanceRepoKt$asMoney$$inlined$map$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 22), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((SessionManagerKt$special$$inlined$filterIsInstance$1) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 25), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((FinishSetupTileBadgeCounter) obj).collect(new Badger$collect$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((ChannelFlowTransformLatest) obj).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 3), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((FlowQuery$mapToList$$inlined$map$1) obj).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, i7), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((AppLockMonitor$special$$inlined$map$2) obj).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) obj).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = ((FlowQuery$mapToList$$inlined$map$1) obj).collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((FinishSetupTileBadgeCounter) obj).collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, i5), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = ((FlowUtil$createFlow$$inlined$map$1) obj).collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector, i8), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj).collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector, i7), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = ((ReadonlyStateFlow) obj).$$delegate_0.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector, i4), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                if (continuation instanceof FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1) {
                    flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 = (FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1) continuation;
                    int i9 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj2 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = flowCollector;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = 0;
                            flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 1;
                            obj2 = ((Function1) obj).invoke(flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1);
                            break;
                        } else if (i == 1) {
                            i5 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0;
                            flowCollector = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3;
                            SafeTrace.throwOnFailure(obj2);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                            break;
                        }
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = null;
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = i5;
                        flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 2;
                        break;
                    }
                }
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 = new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1(this, continuation);
                Object obj22 = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label;
                if (i != 0) {
                }
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.L$3 = null;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.I$0 = i5;
                flowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1.label = 2;
            case 19:
                Object emit = flowCollector.emit(obj, continuation);
                if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                CoroutinesKt$until$2 coroutinesKt$until$2 = new CoroutinesKt$until$2((Function3) obj, flowCollector, continuation2, i6);
                FlowCoroutine flowCoroutine = new FlowCoroutine(continuation, continuation.getContext());
                Object startUndispatched = DurationKt.startUndispatched(flowCoroutine, true, flowCoroutine, coroutinesKt$until$2);
                if (startUndispatched != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
