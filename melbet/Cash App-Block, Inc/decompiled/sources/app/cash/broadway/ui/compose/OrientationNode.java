package app.cash.broadway.ui.compose;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OrientationNode {
    public Function0 orientationChangedCallback;
    public EnterExitState targetVisibilityState;

    public final EnterExitState getTargetVisibilityState() {
        return this.targetVisibilityState;
    }
}
