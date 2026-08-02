package app.cash.local.views.instore;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes3.dex */
public final class TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 implements LifecycleOwner {
    public final LifecycleRegistry lifecycle;

    public TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        this.lifecycle = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
