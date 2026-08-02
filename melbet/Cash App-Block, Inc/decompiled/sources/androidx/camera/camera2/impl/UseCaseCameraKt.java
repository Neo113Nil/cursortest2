package androidx.camera.camera2.impl;

import androidx.camera.core.impl.Config;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;

/* loaded from: classes3.dex */
public abstract class UseCaseCameraKt {
    public static final AtomicInt useCaseCameraIds = AtomicFU.atomic(0);
    public static final Config.OptionPriority defaultOptionPriority = Config.OptionPriority.OPTIONAL;
}
