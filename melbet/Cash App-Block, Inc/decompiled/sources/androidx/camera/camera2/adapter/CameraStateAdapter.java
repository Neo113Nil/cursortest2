package androidx.camera.camera2.adapter;

import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.core.AutoValue_CameraState;
import androidx.camera.core.AutoValue_CameraState_StateError;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LiveDataObservable$Result;
import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import radiography.internal.ComposeLayoutInfoKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraStateAdapter {
    public final LinkedHashMap cameraStateListeners;
    public CameraInternal.State currentCameraInternalState;
    public AutoValue_CameraState_StateError currentCameraStateError;
    public CameraGraphImpl currentGraph;
    public boolean isRemoved;
    public final Object lock = new Object();
    public final Recorder.AnonymousClass3 cameraInternalState = new Recorder.AnonymousClass3(6);
    public final MutableLiveData cameraState = new MutableLiveData();

    public CameraStateAdapter() {
        CameraInternal.State state = CameraInternal.State.CLOSED;
        this.currentCameraInternalState = state;
        this.cameraStateListeners = new LinkedHashMap();
        postCameraState(state, null);
    }

    public final void handleStateTransition(CameraGraphImpl cameraGraphImpl, GraphState graphState) {
        GraphState.GraphStateStarted graphStateStarted = GraphState.GraphStateStarted.INSTANCE$1;
        GraphState.GraphStateStarted graphStateStarted2 = GraphState.GraphStateStarted.INSTANCE;
        if (cameraGraphImpl != this.currentGraph) {
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + graphState + " for " + cameraGraphImpl);
                return;
            }
            return;
        }
        CameraInternal.State state = this.currentCameraInternalState;
        state.getClass();
        graphState.getClass();
        int ordinal = state.ordinal();
        CameraInternal.State state2 = CameraInternal.State.OPEN;
        CameraInternal.State state3 = CameraInternal.State.OPENING;
        CombinedCameraState combinedCameraState = null;
        if (ordinal != 2) {
            CameraInternal.State state4 = CameraInternal.State.PENDING_OPEN;
            CameraInternal.State state5 = CameraInternal.State.CLOSED;
            if (ordinal != 3) {
                GraphState.GraphStateStopped graphStateStopped = GraphState.GraphStateStopped.INSTANCE;
                CameraInternal.State state6 = CameraInternal.State.CLOSING;
                if (ordinal != 4) {
                    GraphState.GraphStateStopping graphStateStopping = GraphState.GraphStateStopping.INSTANCE;
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            if (graphState.equals(graphStateStopping)) {
                                combinedCameraState = new CombinedCameraState(state6);
                            } else if (graphState.equals(graphStateStopped)) {
                                combinedCameraState = new CombinedCameraState(state5);
                            } else if (graphState instanceof GraphState.GraphStateError) {
                                int i = ((GraphState.GraphStateError) graphState).cameraError;
                                combinedCameraState = ComposeLayoutInfoKt.m4375isRecoverableError90vkdD0$camera_camera2(i) ? new CombinedCameraState(state4, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i)) : new CombinedCameraState(state5, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i));
                            }
                        }
                    } else if (graphState.equals(graphStateStarted2)) {
                        combinedCameraState = new CombinedCameraState(state2);
                    } else if (graphState instanceof GraphState.GraphStateError) {
                        GraphState.GraphStateError graphStateError = (GraphState.GraphStateError) graphState;
                        int i2 = graphStateError.cameraError;
                        combinedCameraState = graphStateError.willAttemptRetry ? new CombinedCameraState(state3, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i2)) : ComposeLayoutInfoKt.m4375isRecoverableError90vkdD0$camera_camera2(i2) ? new CombinedCameraState(state4, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i2)) : new CombinedCameraState(state6, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i2));
                    } else if (graphState.equals(graphStateStopping)) {
                        combinedCameraState = new CombinedCameraState(state6);
                    } else if (graphState.equals(graphStateStopped)) {
                        combinedCameraState = new CombinedCameraState(state5);
                    }
                } else if (graphState.equals(graphStateStopped)) {
                    combinedCameraState = new CombinedCameraState(state5);
                } else if (graphState.equals(graphStateStarted)) {
                    combinedCameraState = new CombinedCameraState(state3);
                } else if (graphState instanceof GraphState.GraphStateError) {
                    combinedCameraState = new CombinedCameraState(state6, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(((GraphState.GraphStateError) graphState).cameraError));
                }
            } else if (graphState.equals(graphStateStarted)) {
                combinedCameraState = new CombinedCameraState(state3);
            } else if (graphState.equals(graphStateStarted2)) {
                combinedCameraState = new CombinedCameraState(state2);
            } else if (graphState instanceof GraphState.GraphStateError) {
                int i3 = ((GraphState.GraphStateError) graphState).cameraError;
                combinedCameraState = ComposeLayoutInfoKt.m4375isRecoverableError90vkdD0$camera_camera2(i3) ? new CombinedCameraState(state4, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i3)) : new CombinedCameraState(state5, ComposeLayoutInfoKt.m4376toCameraStateError90vkdD0$camera_camera2(i3));
            }
        } else if (graphState.equals(graphStateStarted)) {
            combinedCameraState = new CombinedCameraState(state3);
        } else if (graphState.equals(graphStateStarted2)) {
            combinedCameraState = new CombinedCameraState(state2);
        }
        if (combinedCameraState == null) {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.currentCameraInternalState + ", received graph state: " + graphState);
                return;
            }
            return;
        }
        this.currentCameraInternalState = combinedCameraState.state;
        this.currentCameraStateError = combinedCameraState.error;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + combinedCameraState);
        }
        postCameraState(this.currentCameraInternalState, this.currentCameraStateError);
    }

    public final void onGraphStateUpdated(CameraGraphImpl cameraGraphImpl, GraphState graphState) {
        graphState.getClass();
        synchronized (this.lock) {
            if (this.isRemoved) {
                if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    Log.w("CXCP", "Ignoring graph state update " + graphState + " on removed camera.");
                }
                return;
            }
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", cameraGraphImpl + " state updated to " + graphState);
            }
            handleStateTransition(cameraGraphImpl, graphState);
        }
    }

    public final void postCameraState(CameraInternal.State state, AutoValue_CameraState_StateError autoValue_CameraState_StateError) {
        List<Map.Entry> list;
        ((MutableLiveData) this.cameraInternalState.val$completer).postValue(new LiveDataObservable$Result(state));
        state.getClass();
        int ordinal = state.ordinal();
        int i = 1;
        int i2 = 5;
        if (ordinal != 2) {
            if (ordinal == 3) {
                i2 = 1;
            } else if (ordinal == 4) {
                i2 = 4;
            } else if (ordinal == 5) {
                i2 = 2;
            } else {
                if (ordinal != 6) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) state, "Unexpected CameraInternal state: ");
                    return;
                }
                i2 = 3;
            }
        }
        AutoValue_CameraState autoValue_CameraState = new AutoValue_CameraState(i2, autoValue_CameraState_StateError);
        MutableLiveData mutableLiveData = this.cameraState;
        mutableLiveData.getClass();
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mutableLiveData.setValue(autoValue_CameraState);
        } else {
            mutableLiveData.postValue(autoValue_CameraState);
        }
        synchronized (this.lock) {
            list = CollectionsKt.toList(this.cameraStateListeners.entrySet());
        }
        for (Map.Entry entry : list) {
            ((Executor) entry.getValue()).execute(new CameraX$$ExternalSyntheticLambda2(i, (Consumer) entry.getKey(), autoValue_CameraState));
        }
    }

    public final class CombinedCameraState {
        public final AutoValue_CameraState_StateError error;
        public final CameraInternal.State state;

        public CombinedCameraState(CameraInternal.State state) {
            this.state = state;
            this.error = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CombinedCameraState)) {
                return false;
            }
            CombinedCameraState combinedCameraState = (CombinedCameraState) obj;
            return this.state == combinedCameraState.state && Intrinsics.areEqual(this.error, combinedCameraState.error);
        }

        public final int hashCode() {
            int hashCode = this.state.hashCode() * 31;
            AutoValue_CameraState_StateError autoValue_CameraState_StateError = this.error;
            return hashCode + (autoValue_CameraState_StateError == null ? 0 : autoValue_CameraState_StateError.hashCode());
        }

        public final String toString() {
            return "CombinedCameraState(state=" + this.state + ", error=" + this.error + ')';
        }

        public CombinedCameraState(CameraInternal.State state, AutoValue_CameraState_StateError autoValue_CameraState_StateError) {
            this.state = state;
            this.error = autoValue_CameraState_StateError;
        }
    }
}
