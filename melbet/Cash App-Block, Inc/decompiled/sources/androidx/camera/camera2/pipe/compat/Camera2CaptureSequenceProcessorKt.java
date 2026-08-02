package androidx.camera.camera2.pipe.compat;

import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.atomicfu.AtomicLong;

/* loaded from: classes3.dex */
public abstract class Camera2CaptureSequenceProcessorKt {
    public static final AtomicLong captureSequenceDebugIds;
    public static final AtomicInt captureSequenceProcessorDebugIds = AtomicFU.atomic(0);
    public static final AtomicLong requestTags;

    static {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.value = 0L;
        captureSequenceDebugIds = atomicLong;
        AtomicLong atomicLong2 = new AtomicLong();
        atomicLong2.value = 0L;
        requestTags = atomicLong2;
    }
}
