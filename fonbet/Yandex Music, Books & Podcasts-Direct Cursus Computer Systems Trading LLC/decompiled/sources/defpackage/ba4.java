package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class ba4 extends u33 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(daf.a);

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.u33
    public final Bitmap c(r33 r33Var, Bitmap bitmap, int i, int i2) {
        Paint paint = i7t.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return i7t.b(r33Var, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        return obj instanceof ba4;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return -670243078;
    }
}
