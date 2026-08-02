package androidx.paging;

import androidx.emoji2.text.MetadataRepo;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.paging.HintHandler;
import androidx.paging.LoadState;
import androidx.paging.PageFetcherSnapshotState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.data.real.RealGetClockInEssentialsUseCase;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.protos.timecards.GetClockinEssentialsRequest;
import com.squareup.protos.timecards.GetClockinEssentialsResponse;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Object $loadType$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public int I$0;
    public FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, continuation);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$loadType$inlined;
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, (PageFetcherSnapshot) this.this$0, (LoadType) obj4);
                pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = flowCollector;
                pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = obj2;
                return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(Unit.INSTANCE);
            default:
                PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$12 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, (RealGetClockInEssentialsUseCase) obj4);
                pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$12.this$0 = flowCollector;
                pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$12.L$1 = obj2;
                return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0118, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r2, r1, r21) == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r1 == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        if (r1 == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        if (r1 == r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d5, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r12, r2, r21) == r9) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        if (r10.lock(r21) == r9) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        int intValue;
        PageFetcherSnapshotState.Holder holder;
        MutexImpl mutexImpl;
        SharedFlowImpl sharedFlowImpl;
        Flow pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1;
        Object performRequest;
        FlowCollector flowCollector2;
        MerchantIdentifier merchantIdentifier;
        Object obj2;
        Object access$getClockedInEssentials;
        Object access$getOnBreakEssentials;
        Object access$getClockedOutEssentials;
        Flow flow;
        ?? r14;
        int i = this.$r8$classId;
        Object obj3 = this.$loadType$inlined;
        int i2 = 0;
        switch (i) {
            case 0:
                PageFetcherSnapshot pageFetcherSnapshot = (PageFetcherSnapshot) this.this$0;
                LoadType loadType = (LoadType) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = this.L$0;
                        intValue = ((Number) this.L$1).intValue();
                        holder = pageFetcherSnapshot.stateHolder;
                        mutexImpl = holder.lock;
                        this.L$0 = flowCollector;
                        this.L$1 = holder;
                        this.L$2 = mutexImpl;
                        this.I$0 = intValue;
                        this.label = 1;
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        intValue = this.I$0;
                        mutexImpl = (MutexImpl) this.L$2;
                        holder = (PageFetcherSnapshotState.Holder) this.L$1;
                        flowCollector = this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    SingleRunner$Holder singleRunner$Holder = holder.state.sourceLoadStates;
                    if (singleRunner$Holder.get(loadType).equals(LoadState.NotLoading.Complete)) {
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1 = new StartedLazily$command$$inlined$unsafeFlow$1(new GenerationalViewportHint[0], 4);
                    } else {
                        if (!(singleRunner$Holder.get(loadType) instanceof LoadState.Error)) {
                            singleRunner$Holder.set(loadType, LoadState.NotLoading.Incomplete);
                        }
                        mutexImpl.unlock(null);
                        MetadataRepo metadataRepo = (MetadataRepo) pageFetcherSnapshot.hintHandler.state;
                        int ordinal = loadType.ordinal();
                        if (ordinal == 1) {
                            sharedFlowImpl = ((HintHandler.HintFlow) metadataRepo.mMetadataList)._flow;
                        } else if (ordinal == 2) {
                            sharedFlowImpl = ((HintHandler.HintFlow) metadataRepo.mEmojiCharArray)._flow;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("invalid load type for hints");
                            sharedFlowImpl = null;
                        }
                        pageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$0$$inlined$map$1(FlowKt.drop(sharedFlowImpl, intValue == 0 ? 0 : 1), intValue, 0);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    break;
                } finally {
                    mutexImpl.unlock(null);
                }
            default:
                RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase = (RealGetClockInEssentialsUseCase) obj3;
                FlowCollector flowCollector3 = (FlowCollector) this.this$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                Continuation continuation = null;
                Continuation continuation2 = null;
                Continuation continuation3 = null;
                Continuation continuation4 = null;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantIdentifier merchantIdentifier2 = (MerchantIdentifier) obj4;
                    RealClockInRepository realClockInRepository = realGetClockInEssentialsUseCase.clockInRepository;
                    String str = merchantIdentifier2.token;
                    this.this$0 = null;
                    this.L$1 = null;
                    this.L$0 = flowCollector3;
                    this.L$2 = merchantIdentifier2;
                    this.I$0 = 0;
                    this.label = 1;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(realClockInRepository, new GetClockinEssentialsRequest(new EasingCurve.EaseIn.Builder(8).buildUnknownFields()), str, continuation, 25);
                    continuation = null;
                    performRequest = realClockInRepository.performRequest(sessionWorker$doWork$2$2, this);
                    if (performRequest != coroutineSingletons2) {
                        flowCollector2 = flowCollector3;
                        merchantIdentifier = merchantIdentifier2;
                    }
                    return coroutineSingletons2;
                }
                if (i4 == 1) {
                    i2 = this.I$0;
                    merchantIdentifier = (MerchantIdentifier) this.L$2;
                    flowCollector2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    performRequest = obj;
                } else if (i4 == 2) {
                    FlowCollector flowCollector4 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = flowCollector4;
                    access$getClockedOutEssentials = obj;
                    flow = (Flow) access$getClockedOutEssentials;
                    r14 = continuation4;
                    this.this$0 = r14;
                    this.L$1 = r14;
                    this.L$0 = r14;
                    this.L$2 = r14;
                    this.label = 5;
                } else if (i4 == 3) {
                    FlowCollector flowCollector5 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = flowCollector5;
                    access$getOnBreakEssentials = obj;
                    flow = (Flow) access$getOnBreakEssentials;
                    r14 = continuation3;
                    this.this$0 = r14;
                    this.L$1 = r14;
                    this.L$0 = r14;
                    this.L$2 = r14;
                    this.label = 5;
                } else if (i4 == 4) {
                    FlowCollector flowCollector6 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flowCollector2 = flowCollector6;
                    access$getClockedInEssentials = obj;
                    flow = (Flow) access$getClockedInEssentials;
                    r14 = continuation2;
                    this.this$0 = r14;
                    this.L$1 = r14;
                    this.L$0 = r14;
                    this.L$2 = r14;
                    this.label = 5;
                    break;
                } else {
                    if (i4 == 5) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) performRequest;
                Shift shift = getClockinEssentialsResponse.clocked_in_shift;
                if (shift != null) {
                    Iterator it = shift.timecard_breaks.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((TimecardBreak) obj2).stop_timestamp_seconds == null) {
                            }
                        } else {
                            obj2 = continuation;
                        }
                    }
                    if (((TimecardBreak) obj2) == null) {
                        this.this$0 = continuation;
                        this.L$1 = continuation;
                        this.L$0 = flowCollector2;
                        this.L$2 = continuation;
                        this.I$0 = i2;
                        this.label = 4;
                        access$getClockedInEssentials = RealGetClockInEssentialsUseCase.access$getClockedInEssentials(realGetClockInEssentialsUseCase, getClockinEssentialsResponse, merchantIdentifier, this);
                        continuation2 = continuation;
                        break;
                    } else {
                        this.this$0 = continuation;
                        this.L$1 = continuation;
                        this.L$0 = flowCollector2;
                        this.L$2 = continuation;
                        this.I$0 = i2;
                        this.label = 3;
                        access$getOnBreakEssentials = RealGetClockInEssentialsUseCase.access$getOnBreakEssentials(realGetClockInEssentialsUseCase, getClockinEssentialsResponse, merchantIdentifier, this);
                        continuation3 = continuation;
                        break;
                    }
                } else {
                    this.this$0 = continuation;
                    this.L$1 = continuation;
                    this.L$0 = flowCollector2;
                    this.L$2 = continuation;
                    this.I$0 = i2;
                    this.label = 2;
                    access$getClockedOutEssentials = RealGetClockInEssentialsUseCase.access$getClockedOutEssentials(realGetClockInEssentialsUseCase, getClockinEssentialsResponse, merchantIdentifier, this);
                    continuation4 = continuation;
                    break;
                }
                return coroutineSingletons2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, RealGetClockInEssentialsUseCase realGetClockInEssentialsUseCase) {
        super(3, continuation);
        this.$loadType$inlined = realGetClockInEssentialsUseCase;
    }
}
