package androidx.camera.camera2.pipe.compat;

import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.MutexToken;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class VirtualCameraState {
    public CameraState _lastState;
    public final SharedFlowImpl _stateFlow;
    public final Flow _states;
    public final String cameraId;
    public boolean closed;
    public VirtualAndroidCameraDevice currentVirtualAndroidCamera;
    public final int debugId;
    public final GraphProcessorImpl graphListener;
    public StandaloneCoroutine job;
    public final Object lock;
    public final CoroutineScope scope;
    public MutexToken wakelockToken;

    public VirtualCameraState(String str, GraphProcessorImpl graphProcessorImpl, CoroutineScope coroutineScope) {
        str.getClass();
        coroutineScope.getClass();
        this.cameraId = str;
        this.graphListener = graphProcessorImpl;
        this.scope = coroutineScope;
        AtomicInt atomicInt = VirtualCameraKt.virtualCameraDebugIds;
        atomicInt.getClass();
        this.debugId = AtomicInt.FU.incrementAndGet(atomicInt);
        this.lock = new Object();
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 3, null, 4);
        this._stateFlow = MutableSharedFlow$default;
        this._states = FlowKt.distinctUntilChanged(MutableSharedFlow$default);
        CameraStateUnopened cameraStateUnopened = CameraStateUnopened.INSTANCE;
        this._lastState = cameraStateUnopened;
        if (MutableSharedFlow$default.tryEmit(cameraStateUnopened)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        throw null;
    }

    /* renamed from: disconnect-TPqeGZw, reason: not valid java name */
    public final void m80disconnectTPqeGZw(CameraError cameraError) {
        CameraState cameraState;
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                Log.i("CXCP", "Disconnecting " + this);
                VirtualAndroidCameraDevice virtualAndroidCameraDevice = this.currentVirtualAndroidCamera;
                if (virtualAndroidCameraDevice != null) {
                    synchronized (virtualAndroidCameraDevice.lock) {
                        virtualAndroidCameraDevice.disconnected = true;
                    }
                }
                StandaloneCoroutine standaloneCoroutine = this.job;
                if (standaloneCoroutine != null) {
                    standaloneCoroutine.cancel(null);
                }
                MutexToken mutexToken = this.wakelockToken;
                if (mutexToken != null) {
                    mutexToken.release();
                }
                synchronized (this.lock) {
                    cameraState = this._lastState;
                }
                if (!(cameraState instanceof CameraStateClosed)) {
                    if (!(cameraState instanceof CameraStateClosing)) {
                        emitState(new CameraStateClosing(null));
                    }
                    emitState(new CameraStateClosed(this.cameraId, ClosedReason.APP_DISCONNECTED, null, null, null, null, null, null, cameraError));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void emitState(CameraState cameraState) {
        this._lastState = cameraState;
        if (this._stateFlow.tryEmit(cameraState)) {
            return;
        }
        Handlers$$ExternalSyntheticBUOutline0.m("Failed to emit ", cameraState, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.debugId;
    }
}
