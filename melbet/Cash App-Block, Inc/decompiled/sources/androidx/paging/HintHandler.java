package androidx.paging;

import androidx.compose.material3.SliderState$drag$2;
import androidx.emoji2.text.MetadataRepo;
import androidx.paging.ViewportHint;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class HintHandler implements HintReceiver {
    public final Object state;

    public final class HintFlow {
        public final SharedFlowImpl _flow = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
        public ViewportHint value;

        public final void setValue(ViewportHint viewportHint) {
            this.value = viewportHint;
            if (viewportHint != null) {
                this._flow.tryEmit(viewportHint);
            }
        }
    }

    public HintHandler(int i) {
        switch (i) {
            case 1:
                SingleRunner$Holder singleRunner$Holder = new SingleRunner$Holder();
                singleRunner$Holder.singleRunner = this;
                singleRunner$Holder.mutex = new MutexImpl();
                this.state = singleRunner$Holder;
                break;
            default:
                MetadataRepo metadataRepo = new MetadataRepo();
                metadataRepo.mMetadataList = new HintFlow();
                metadataRepo.mEmojiCharArray = new HintFlow();
                metadataRepo.mTypeface = new Transition.AnonymousClass1();
                this.state = metadataRepo;
                break;
        }
    }

    public void forceSetHint(LoadType loadType, ViewportHint viewportHint) {
        loadType.getClass();
        viewportHint.getClass();
        if (loadType != LoadType.PREPEND && loadType != LoadType.APPEND) {
            Path$$ExternalSyntheticBUOutline0.m$3(loadType, "invalid load type for reset: ");
            return;
        }
        MetadataRepo metadataRepo = (MetadataRepo) this.state;
        synchronized (((Transition.AnonymousClass1) metadataRepo.mTypeface)) {
            try {
                HintFlow hintFlow = (HintFlow) metadataRepo.mMetadataList;
                HintFlow hintFlow2 = (HintFlow) metadataRepo.mEmojiCharArray;
                hintFlow.getClass();
                hintFlow2.getClass();
                if (loadType == LoadType.PREPEND) {
                    hintFlow.setValue(viewportHint);
                } else {
                    hintFlow2.setValue(viewportHint);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.paging.HintReceiver
    public void processHint(ViewportHint viewportHint) {
        HintHandler hintHandler = ((PageFetcherSnapshot) this.state).hintHandler;
        hintHandler.getClass();
        MetadataRepo metadataRepo = (MetadataRepo) hintHandler.state;
        ViewportHint.Access access = viewportHint instanceof ViewportHint.Access ? (ViewportHint.Access) viewportHint : null;
        HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(viewportHint, 0);
        synchronized (((Transition.AnonymousClass1) metadataRepo.mTypeface)) {
            if (access != null) {
                try {
                    metadataRepo.mRootNode = access;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hintHandler$$ExternalSyntheticLambda0.invoke((HintFlow) metadataRepo.mMetadataList, (HintFlow) metadataRepo.mEmojiCharArray);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if (r6.runner != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        throw r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.paging.HintHandler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object runInIsolation(PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2, ContinuationImpl continuationImpl) {
        SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        int i;
        if (continuationImpl instanceof SingleRunner$runInIsolation$1) {
            singleRunner$runInIsolation$1 = (SingleRunner$runInIsolation$1) continuationImpl;
            int i2 = singleRunner$runInIsolation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                singleRunner$runInIsolation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = singleRunner$runInIsolation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = singleRunner$runInIsolation$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SliderState$drag$2 sliderState$drag$2 = new SliderState$drag$2((Object) this, pagingDataPresenter$collectFrom$2, continuation, 13);
                    singleRunner$runInIsolation$1.label = 1;
                    Object coroutineScope = JobKt.coroutineScope(sliderState$drag$2, singleRunner$runInIsolation$1);
                    this = coroutineScope;
                    if (coroutineScope == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    this = this;
                }
                return Unit.INSTANCE;
            }
        }
        singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, continuationImpl);
        Object obj2 = singleRunner$runInIsolation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleRunner$runInIsolation$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public HintHandler(PageFetcherSnapshot pageFetcherSnapshot) {
        this.state = pageFetcherSnapshot;
    }
}
