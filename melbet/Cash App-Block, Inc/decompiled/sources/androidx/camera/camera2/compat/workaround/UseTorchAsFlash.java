package androidx.camera.camera2.compat.workaround;

import com.squareup.cash.graphics.swampgl.components.Scene;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public interface UseTorchAsFlash {
    boolean shouldDisableAePrecapture();

    Object shouldUseTorchAsFlash(Scene.AnonymousClass1 anonymousClass1, Continuation continuation);
}
