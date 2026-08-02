package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BitmapImage implements Image {
    public final Bitmap bitmap;

    public BitmapImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitmapImage) && Intrinsics.areEqual(this.bitmap, ((BitmapImage) obj).bitmap);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // coil3.Image
    public final int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // coil3.Image
    public final boolean getShareable() {
        return true;
    }

    @Override // coil3.Image
    public final long getSize() {
        int i;
        Bitmap bitmap = this.bitmap;
        if (!bitmap.isRecycled()) {
            try {
                i = bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                i = (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4) * height;
            }
            return i;
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    @Override // coil3.Image
    public final int getWidth() {
        return this.bitmap.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.bitmap.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.bitmap + ", shareable=true)";
    }
}
