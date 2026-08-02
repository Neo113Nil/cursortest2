package androidx.camera.camera2.pipe;

import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public final class CameraGraphId {
    public static final AtomicInt cameraGraphIds = AtomicFU.atomic(0);
    public final String name;

    public CameraGraphId(String str) {
        this.name = str;
    }

    public final String toString() {
        return this.name;
    }
}
