package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class w06 implements q7v {
    public final Bitmap a;

    public w06(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.q7v
    public final boolean a() {
        return true;
    }

    @Override // defpackage.q7v
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w06) && jl40.l(this.a, ((w06) obj).a);
    }

    @Override // defpackage.q7v
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.q7v
    public final long getSize() {
        int i;
        Bitmap bitmap = this.a;
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

    @Override // defpackage.q7v
    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
