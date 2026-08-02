package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public final class Outline$Rectangle extends ColorKt {
    public final Rect rect;

    public Outline$Rectangle(Rect rect) {
        this.rect = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Outline$Rectangle) {
            return this.rect.equals(((Outline$Rectangle) obj).rect);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.ColorKt
    public final Rect getBounds() {
        return this.rect;
    }

    public final int hashCode() {
        return this.rect.hashCode();
    }
}
