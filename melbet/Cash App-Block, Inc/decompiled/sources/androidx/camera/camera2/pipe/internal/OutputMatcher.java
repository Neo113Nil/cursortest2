package androidx.camera.camera2.pipe.internal;

import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class OutputMatcher {
    public static final OutputMatcher EXACT = new OutputMatcher();
    public final AtomicRef currentOffset = AtomicFU.atomic((Object) 0L);

    public final boolean fuzzyEqual(long j, long j2) {
        return (j - j2) + ((Number) this.currentOffset.value).longValue() == 0;
    }
}
