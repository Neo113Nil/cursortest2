package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.camera.video.Recorder;
import androidx.compose.ui.unit.Constraints;
import com.android.volley.Response;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LazyLayoutPrefetchState {
    public int lastNumberOfNestedPrefetchItems;
    public final Function1 onNestedPrefetch;
    public Response prefetchHandleProvider;
    public final Recorder.AnonymousClass3 prefetchMetrics = new Recorder.AnonymousClass3(15);
    public int realizedNestedPrefetchCount = -1;
    public int idealNestedPrefetchCount = -1;

    public final class NestedPrefetchScopeImpl {
        public final ArrayList _requests = new ArrayList();
        public final int nestedPrefetchItemCount;

        public NestedPrefetchScopeImpl(int i) {
            this.nestedPrefetchItemCount = i;
        }

        public final void schedulePrecomposition(int i) {
            LazyLayoutPrefetchState lazyLayoutPrefetchState = LazyLayoutPrefetchState.this;
            Response response = lazyLayoutPrefetchState.prefetchHandleProvider;
            if (response == null) {
                return;
            }
            this._requests.add(new PrefetchHandleProvider$HandleAndRequestImpl(response, i, lazyLayoutPrefetchState.prefetchMetrics, null));
        }
    }

    public interface PrefetchHandle {
        void cancel();

        void markAsUrgent();
    }

    public LazyLayoutPrefetchState(Function1 function1) {
        this.onNestedPrefetch = function1;
    }

    /* renamed from: schedulePrecompositionAndPremeasure-_EkL_-Y$foundation, reason: not valid java name */
    public final PrefetchHandle m325schedulePrecompositionAndPremeasure_EkL_Y$foundation(int i, long j, boolean z, Function1 function1) {
        Response response = this.prefetchHandleProvider;
        if (response == null) {
            return DummyHandle.INSTANCE;
        }
        PrefetchScheduler prefetchScheduler = (PrefetchScheduler) response.error;
        boolean z2 = prefetchScheduler instanceof AndroidPrefetchScheduler;
        PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = new PrefetchHandleProvider$HandleAndRequestImpl(response, i, this.prefetchMetrics, function1);
        prefetchHandleProvider$HandleAndRequestImpl.premeasureConstraints = new Constraints(j);
        if (!z2) {
            prefetchScheduler.schedulePrefetch(prefetchHandleProvider$HandleAndRequestImpl);
        } else if (z) {
            AndroidPrefetchScheduler androidPrefetchScheduler = (AndroidPrefetchScheduler) prefetchScheduler;
            androidPrefetchScheduler.prefetchRequests.add(new PriorityTask(1, prefetchHandleProvider$HandleAndRequestImpl));
            if (!androidPrefetchScheduler.prefetchScheduled) {
                androidPrefetchScheduler.prefetchScheduled = true;
                androidPrefetchScheduler.view.post(androidPrefetchScheduler);
            }
        } else {
            AndroidPrefetchScheduler androidPrefetchScheduler2 = (AndroidPrefetchScheduler) prefetchScheduler;
            androidPrefetchScheduler2.prefetchRequests.add(new PriorityTask(0, prefetchHandleProvider$HandleAndRequestImpl));
            if (!androidPrefetchScheduler2.prefetchScheduled) {
                androidPrefetchScheduler2.prefetchScheduled = true;
                androidPrefetchScheduler2.view.post(androidPrefetchScheduler2);
            }
        }
        Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
        return prefetchHandleProvider$HandleAndRequestImpl;
    }
}
