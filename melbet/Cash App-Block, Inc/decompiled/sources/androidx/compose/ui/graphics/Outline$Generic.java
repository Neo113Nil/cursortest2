package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class Outline$Generic extends ColorKt {
    public final AndroidPath path;

    public Outline$Generic(AndroidPath androidPath) {
        this.path = androidPath;
    }

    @Override // androidx.compose.ui.graphics.ColorKt
    public final Rect getBounds() {
        return this.path.getBounds();
    }
}
