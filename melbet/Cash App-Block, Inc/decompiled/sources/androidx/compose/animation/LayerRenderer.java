package androidx.compose.animation;

import androidx.compose.ui.node.LayoutNodeDrawScope;

/* loaded from: classes3.dex */
public interface LayerRenderer {
    void drawInOverlay(LayoutNodeDrawScope layoutNodeDrawScope);

    float getZIndex();
}
