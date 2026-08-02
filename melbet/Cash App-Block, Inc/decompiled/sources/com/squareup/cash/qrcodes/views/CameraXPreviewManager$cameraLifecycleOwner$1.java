package com.squareup.cash.qrcodes.views;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes7.dex */
public final class CameraXPreviewManager$cameraLifecycleOwner$1 implements LifecycleOwner {
    public final LifecycleRegistry lifecycle;

    public CameraXPreviewManager$cameraLifecycleOwner$1() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
        this.lifecycle = lifecycleRegistry;
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
