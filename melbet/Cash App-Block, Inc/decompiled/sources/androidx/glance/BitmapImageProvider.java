package androidx.glance;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class BitmapImageProvider implements ImageProvider {
    public final Bitmap bitmap;

    public BitmapImageProvider(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.bitmap;
        sb.append(bitmap.getWidth());
        sb.append("px x ");
        sb.append(bitmap.getHeight());
        sb.append("px))");
        return sb.toString();
    }
}
