package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.Response;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PageFetcher {
    public final PagingConfig config;
    public final Pager$pageFetcher$2 pagingSourceFactory;
    public final AndroidSvg loadRequests = new AndroidSvg(8);
    public final AndroidSvg retryEvents = new AndroidSvg(8);
    public final Flow flow = FlowExtKt.simpleChannelFlow(new PageFetcher$flow$1(this, (Continuation) null, 0));

    public final class GenerationInfo {
        public final PagingState cachedInitialState;
        public final JobImpl job;
        public final PageFetcherSnapshot snapshot;

        public GenerationInfo(PageFetcherSnapshot pageFetcherSnapshot, PagingState pagingState, JobImpl jobImpl) {
            this.snapshot = pageFetcherSnapshot;
            this.cachedInitialState = pagingState;
            this.job = jobImpl;
        }
    }

    public PageFetcher(Pager$pageFetcher$2 pager$pageFetcher$2, PagingConfig pagingConfig) {
        this.pagingSourceFactory = pager$pageFetcher$2;
        this.config = pagingConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$generateNewPagingSource(PageFetcher pageFetcher, PagingSource pagingSource, ContinuationImpl continuationImpl) {
        PageFetcher$generateNewPagingSource$1 pageFetcher$generateNewPagingSource$1;
        int i;
        PagingSource pagingSource2;
        Object obj;
        PagingSource pagingSource3;
        if (continuationImpl instanceof PageFetcher$generateNewPagingSource$1) {
            pageFetcher$generateNewPagingSource$1 = (PageFetcher$generateNewPagingSource$1) continuationImpl;
            int i2 = pageFetcher$generateNewPagingSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pageFetcher$generateNewPagingSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = pageFetcher$generateNewPagingSource$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pageFetcher$generateNewPagingSource$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Pager$pageFetcher$2 pager$pageFetcher$2 = pageFetcher.pagingSourceFactory;
                    pageFetcher$generateNewPagingSource$1.L$0 = pagingSource;
                    pageFetcher$generateNewPagingSource$1.label = 1;
                    Object invoke = pager$pageFetcher$2.invoke(pageFetcher$generateNewPagingSource$1);
                    if (invoke == obj3) {
                        return obj3;
                    }
                    pagingSource2 = pagingSource;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PagingSource pagingSource4 = pageFetcher$generateNewPagingSource$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    pagingSource2 = pagingSource4;
                    obj = obj2;
                }
                pagingSource3 = (PagingSource) obj;
                if (pagingSource3 != pagingSource2) {
                    a$$ExternalSyntheticBUOutline0.m$1("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
                    return null;
                }
                pagingSource3.registerInvalidatedCallback(new PageFetcher$generateNewPagingSource$3(0, pageFetcher, PageFetcher.class, "invalidate", "invalidate()V", 0, 0));
                if (pagingSource2 != null) {
                    PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = new PageFetcher$generateNewPagingSource$3(0, pageFetcher, PageFetcher.class, "invalidate", "invalidate()V", 0, 2);
                    Response response = pagingSource2.invalidateCallbackTracker;
                    synchronized (((Transition.AnonymousClass1) response.cacheEntry)) {
                        ((ArrayList) response.error).remove(pageFetcher$generateNewPagingSource$3);
                    }
                }
                if (pagingSource2 != null) {
                    pagingSource2.invalidate();
                }
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Generated new PagingSource " + pagingSource3, null);
                }
                return pagingSource3;
            }
        }
        pageFetcher$generateNewPagingSource$1 = new PageFetcher$generateNewPagingSource$1(pageFetcher, continuationImpl);
        Object obj22 = pageFetcher$generateNewPagingSource$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pageFetcher$generateNewPagingSource$1.label;
        if (i != 0) {
        }
        pagingSource3 = (PagingSource) obj;
        if (pagingSource3 != pagingSource2) {
        }
    }
}
