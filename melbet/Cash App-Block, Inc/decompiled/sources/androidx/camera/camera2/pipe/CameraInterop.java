package androidx.camera.camera2.pipe;

import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public abstract class CameraInterop {
    public static final AtomicInt captureSessionIds = AtomicFU.atomic(0);
}
