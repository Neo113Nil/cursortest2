package androidx.compose.runtime;

import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public interface CancellationHandle {

    /* loaded from: classes3.dex */
    public final class Companion {
        public static final DifferentialMotionFlingController$$ExternalSyntheticLambda0 Empty = new DifferentialMotionFlingController$$ExternalSyntheticLambda0(1);
    }

    void cancel();
}
