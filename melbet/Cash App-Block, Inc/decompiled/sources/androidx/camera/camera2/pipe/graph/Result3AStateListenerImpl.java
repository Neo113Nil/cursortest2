package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestNumber;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes3.dex */
public final class Result3AStateListenerImpl implements GraphLoop.Listener {
    public final CompletableDeferredImpl _result;
    public final Function1 exitCondition;
    public final Integer frameLimit;
    public volatile FrameNumber frameNumberOfFirstUpdate;
    public RequestNumber initialRequestNumber;
    public final Long timeLimitNs;
    public volatile Long timestampOfFirstUpdateNs;

    public Result3AStateListenerImpl(Function1 function1, Integer num, Long l) {
        function1.getClass();
        this.exitCondition = function1;
        this.frameLimit = num;
        this.timeLimitNs = l;
        this._result = new CompletableDeferredImpl();
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphShutdown() {
        this._result.makeCompleting$kotlinx_coroutines_core(new Result3A(3, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onGraphStopped() {
        this._result.makeCompleting$kotlinx_coroutines_core(new Result3A(3, null));
    }

    @Override // androidx.camera.camera2.pipe.graph.GraphLoop.Listener
    public final void onStopRepeating() {
        this._result.makeCompleting$kotlinx_coroutines_core(new Result3A(3, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Result3AStateListenerImpl(Map map) {
        this(new ObjectList$$ExternalSyntheticLambda0(map, 8), null, null);
        map.getClass();
    }
}
