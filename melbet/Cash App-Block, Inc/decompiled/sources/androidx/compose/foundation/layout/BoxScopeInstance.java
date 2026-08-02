package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier align(Modifier modifier, Alignment alignment) {
        return modifier.then(new BoxChildDataElement(alignment, false));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier matchParentSize() {
        return new BoxChildDataElement(Alignment.Companion.Center, true);
    }
}
