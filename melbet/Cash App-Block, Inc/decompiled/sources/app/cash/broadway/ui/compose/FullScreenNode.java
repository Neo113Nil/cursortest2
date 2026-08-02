package app.cash.broadway.ui.compose;

import androidx.compose.animation.EnterExitState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class FullScreenNode {
    public Function0 enabledChangedCallback;
    public EnterExitState targetVisibilityState;

    public final EnterExitState getTargetVisibilityState() {
        return this.targetVisibilityState;
    }
}
