package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class DrawCache {
    public final CanvasDrawScope cacheScope;
    public AndroidCanvas cachedCanvas;
    public int config;
    public AndroidImageBitmap mCachedImage;
    public long size;

    public DrawCache() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        this.size = 0L;
        this.config = 0;
        this.cacheScope = new CanvasDrawScope();
    }
}
