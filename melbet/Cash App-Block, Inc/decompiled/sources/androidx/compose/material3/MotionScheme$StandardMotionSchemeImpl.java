package androidx.compose.material3;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;

/* loaded from: classes3.dex */
public final class MotionScheme$StandardMotionSchemeImpl {
    public static final MotionScheme$StandardMotionSchemeImpl INSTANCE = new MotionScheme$StandardMotionSchemeImpl();
    public static final SpringSpec defaultSpatialSpec = AnimatableKt.spring$default(0.9f, 700.0f, null, 4);
    public static final SpringSpec fastSpatialSpec = AnimatableKt.spring$default(0.9f, 1400.0f, null, 4);
    public static final SpringSpec slowSpatialSpec = AnimatableKt.spring$default(0.9f, 300.0f, null, 4);
    public static final SpringSpec defaultEffectsSpec = AnimatableKt.spring$default(1.0f, 1600.0f, null, 4);
    public static final SpringSpec fastEffectsSpec = AnimatableKt.spring$default(1.0f, 3800.0f, null, 4);
    public static final SpringSpec slowEffectsSpec = AnimatableKt.spring$default(1.0f, 800.0f, null, 4);
}
