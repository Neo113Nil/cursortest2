package androidx.camera.camera2.pipe.graph;

import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraph$Flags;
import androidx.camera.camera2.pipe.CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraPipeKeys;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import androidx.camera.camera2.pipe.graph.GraphLoop;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.google.android.gms.dynamite.zzo;
import com.nimbusds.jose.JWECryptoParts;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class GraphProcessorImpl {
    public final StateFlowImpl _graphState;
    public final CameraGraph$Config cameraGraphConfig;
    public final CameraGraphId cameraGraphId;
    public final List externalStateGraphListeners;
    public final GraphLoop graphLoop;

    public GraphProcessorImpl(Threads threads, CameraGraphId cameraGraphId, CameraGraph$Config cameraGraph$Config, Listener3A listener3A, List list, Camera2Quirks camera2Quirks) {
        threads.getClass();
        cameraGraph$Config.getClass();
        listener3A.getClass();
        list.getClass();
        camera2Quirks.getClass();
        this.cameraGraphId = cameraGraphId;
        this.cameraGraphConfig = cameraGraph$Config;
        this.externalStateGraphListeners = cameraGraph$Config.graphStateListeners;
        Map map = cameraGraph$Config.defaultParameters;
        Map map2 = cameraGraph$Config.requiredParameters;
        Metadata.Key key = CameraPipeKeys.ignore3ARequiredParameters;
        Object obj = map.get(key);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(obj, bool) || Intrinsics.areEqual(map2.get(key), bool)) {
            Log.i("CXCP", key + " is set to true, ignoring GraphState3A parameters.");
        }
        CameraGraph$Flags cameraGraph$Flags = cameraGraph$Config.flags;
        cameraGraph$Flags.getClass();
        camera2Quirks.strictMode.getClass();
        zzo zzoVar = cameraGraph$Flags.awaitRepeatingRequestBeforeCapture;
        Set set = (Set) Camera2Quirks.SHOULD_WAIT_FOR_REPEATING_DEVICE_MAP.get(Build.MANUFACTURER);
        int max = (set == null || !set.contains(Build.DEVICE) || Build.VERSION.SDK_INT >= 34) ? 0 : Math.max(0, 10);
        zzoVar.getClass();
        CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior cameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior = CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior.AT_LEAST;
        int max2 = Math.max(max, zzoVar.zza);
        CaptureLimiter captureLimiter = max2 != 0 ? new CaptureLimiter(max2) : null;
        GraphLoop graphLoop = new GraphLoop(cameraGraphId, map, map2, CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOfNotNull(captureLimiter), (Collection) list), ArraysKt___ArraysKt.filterNotNull(new Object[]{listener3A, captureLimiter}), threads.cameraPipeScope, threads.lightweightDispatcher);
        this.graphLoop = graphLoop;
        if (captureLimiter != null) {
            if (captureLimiter._graphLoop != null) {
                a$$ExternalSyntheticBUOutline0.m$1("GraphLoop has already been set!");
                throw null;
            }
            captureLimiter._graphLoop = graphLoop;
            graphLoop.setCaptureProcessingEnabled(false);
            Log.w("CXCP", "Capture processing has been disabled for " + graphLoop + " until " + captureLimiter.requestsUntilActive + " frames have been completed.");
        }
        this._graphState = FlowKt.MutableStateFlow(GraphState.GraphStateStopped.INSTANCE);
    }

    public final void onGraphError(GraphState.GraphStateError graphStateError) {
        StateFlowImpl stateFlowImpl;
        Object value;
        GraphState graphState;
        Log.d("CXCP", this + " onGraphError(" + graphStateError + ')');
        do {
            stateFlowImpl = this._graphState;
            value = stateFlowImpl.getValue();
            graphState = (GraphState) value;
        } while (!stateFlowImpl.compareAndSet(value, ((graphState instanceof GraphState.GraphStateStopping) || (graphState instanceof GraphState.GraphStateStopped)) ? GraphState.GraphStateStopped.INSTANCE : graphStateError));
        for (GraphStateToCameraStateAdapter graphStateToCameraStateAdapter : this.externalStateGraphListeners) {
            graphStateToCameraStateAdapter.getClass();
            graphStateToCameraStateAdapter.cameraStateAdapter.onGraphStateUpdated(graphStateToCameraStateAdapter.getCameraGraph(), graphStateError);
        }
    }

    public final void onGraphStarted(TraceParser traceParser) {
        Log.d("CXCP", this + " onGraphStarted");
        GraphState.GraphStateStarted graphStateStarted = GraphState.GraphStateStarted.INSTANCE;
        this._graphState.setValue(graphStateStarted);
        this.graphLoop.setRequestProcessor(traceParser);
        for (GraphStateToCameraStateAdapter graphStateToCameraStateAdapter : this.externalStateGraphListeners) {
            graphStateToCameraStateAdapter.cameraStateAdapter.onGraphStateUpdated(graphStateToCameraStateAdapter.getCameraGraph(), graphStateStarted);
        }
    }

    public final void onGraphStopped() {
        Log.d("CXCP", this + " onGraphStopped");
        StateFlowImpl stateFlowImpl = this._graphState;
        GraphState.GraphStateStopped graphStateStopped = GraphState.GraphStateStopped.INSTANCE;
        stateFlowImpl.setValue(graphStateStopped);
        this.graphLoop.setRequestProcessor(null);
        for (GraphStateToCameraStateAdapter graphStateToCameraStateAdapter : this.externalStateGraphListeners) {
            graphStateToCameraStateAdapter.cameraStateAdapter.onGraphStateUpdated(graphStateToCameraStateAdapter.getCameraGraph(), graphStateStopped);
        }
    }

    public final void setRepeatingRequest(Request request) {
        GraphLoop graphLoop = this.graphLoop;
        synchronized (graphLoop.lock) {
            try {
                Request request2 = graphLoop._repeatingRequest;
                graphLoop._repeatingRequest = request;
                if (request2 != null || request != null) {
                    JWECryptoParts jWECryptoParts = graphLoop.processingQueue;
                    if (request != null) {
                        jWECryptoParts.tryEmit(new GraphCommand.Repeat(request));
                    } else {
                        jWECryptoParts.tryEmit(GraphCommand.Stop.INSTANCE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (request == null) {
            int size = graphLoop.listeners.size();
            for (int i = 0; i < size; i++) {
                ((GraphLoop.Listener) graphLoop.listeners.get(i)).onStopRepeating();
            }
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.cameraGraphId + ')';
    }

    public final boolean trigger(Map map) {
        map.getClass();
        GraphLoop graphLoop = this.graphLoop;
        graphLoop.getClass();
        if (graphLoop.getRepeatingRequest() != null) {
            return graphLoop.processingQueue.tryEmit(new GraphCommand.Trigger(map));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot submit parameters without an active repeating request!");
        return false;
    }

    public final void update3AParameters(LinkedHashMap linkedHashMap) {
        GraphLoop graphLoop = this.graphLoop;
        graphLoop.getClass();
        synchronized (graphLoop.lock) {
            graphLoop.processingQueue.tryEmit(new GraphCommand.Parameters(graphLoop._graphParameters, linkedHashMap));
        }
    }
}
