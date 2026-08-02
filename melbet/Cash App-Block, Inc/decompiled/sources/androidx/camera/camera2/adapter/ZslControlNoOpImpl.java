package androidx.camera.camera2.adapter;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;

/* loaded from: classes3.dex */
public final class ZslControlNoOpImpl implements ZslControl {
    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void addZslConfig(SessionConfig.Builder builder) {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void clearZslConfig() {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByFlashMode() {
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByUserCaseConfig() {
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslSurface(DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        sessionConfig.getClass();
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByFlashMode(boolean z) {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByUserCaseConfig(boolean z) {
    }
}
