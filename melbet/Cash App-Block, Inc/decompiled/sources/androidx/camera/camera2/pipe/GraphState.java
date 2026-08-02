package androidx.camera.camera2.pipe;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public abstract class GraphState {
    public final String name;

    public final class GraphStateError extends GraphState {
        public final int cameraError;
        public final boolean willAttemptRetry;

        public GraphStateError(int i, boolean z) {
            super("GRAPH_ERROR");
            this.cameraError = i;
            this.willAttemptRetry = z;
        }

        @Override // androidx.camera.camera2.pipe.GraphState
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            sb.append("(cameraError=");
            sb.append((Object) CameraError.m43toStringimpl(this.cameraError));
            sb.append(", willAttemptRetry=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.willAttemptRetry, ')');
        }
    }

    public final class GraphStateStarted extends GraphState {
        public static final GraphStateStarted INSTANCE = new GraphStateStarted("GRAPH_STARTED");
        public static final GraphStateStarted INSTANCE$1 = new GraphStateStarted("GRAPH_STARTING");
    }

    public final class GraphStateStopped extends GraphState {
        public static final GraphStateStopped INSTANCE = new GraphStateStopped("GRAPH_STOPPED");
    }

    public final class GraphStateStopping extends GraphState {
        public static final GraphStateStopping INSTANCE = new GraphStateStopping("GRAPH_STOPPING");
    }

    public GraphState(String str) {
        this.name = str;
    }

    public String toString() {
        return this.name;
    }
}
