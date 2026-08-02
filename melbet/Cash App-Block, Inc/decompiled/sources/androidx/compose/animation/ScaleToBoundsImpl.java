package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.layout.ContentScale;

/* loaded from: classes3.dex */
public final class ScaleToBoundsImpl implements SharedTransitionScope.ResizeMode {
    public final ContentScale contentScale;

    public ScaleToBoundsImpl(ContentScale contentScale) {
        this.contentScale = contentScale;
    }
}
