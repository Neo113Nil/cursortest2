package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class DisableAnimationMotionDurationScale implements MotionDurationScale {
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final float getScaleFactor() {
        return RecyclerView.DECELERATION_RATE;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
