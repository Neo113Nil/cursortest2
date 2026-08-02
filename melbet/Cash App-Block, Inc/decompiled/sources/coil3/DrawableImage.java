package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.Utils_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DrawableImage implements Image {
    public final Drawable drawable;

    public DrawableImage(Drawable drawable) {
        this.drawable = drawable;
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        this.drawable.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawableImage) && Intrinsics.areEqual(this.drawable, ((DrawableImage) obj).drawable);
    }

    @Override // coil3.Image
    public final int getHeight() {
        return Utils_androidKt.getHeight(this.drawable);
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return false;
    }

    @Override // coil3.Image
    public final long getSize() {
        Drawable drawable = this.drawable;
        long width = Utils_androidKt.getWidth(drawable) * 4 * Utils_androidKt.getHeight(drawable);
        if (width < 0) {
            return 0L;
        }
        return width;
    }

    @Override // coil3.Image
    public final int getWidth() {
        return Utils_androidKt.getWidth(this.drawable);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.drawable.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.drawable + ", shareable=false)";
    }
}
