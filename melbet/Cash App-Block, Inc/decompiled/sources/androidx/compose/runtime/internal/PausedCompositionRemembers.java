package androidx.compose.runtime.internal;

import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PausedCompositionRemembers implements RememberObserver {
    public final Set abandoning;
    public final MutableVector pausedRemembers = new MutableVector(0, new RememberObserverHolder[16]);

    public PausedCompositionRemembers(Set set) {
        this.abandoning = set;
    }

    public final MutableVector getPausedRemembers() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        MutableVector mutableVector = this.pausedRemembers;
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            RememberObserver rememberObserver = ((GapRememberObserverHolder) ((RememberObserverHolder) objArr[i2])).wrapped;
            this.abandoning.remove(rememberObserver);
            rememberObserver.onRemembered();
        }
    }
}
