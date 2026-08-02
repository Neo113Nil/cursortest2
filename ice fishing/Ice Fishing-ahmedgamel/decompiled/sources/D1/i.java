package D1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import u1.InterfaceC5066e;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class i extends AbstractC0300e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f546b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC5066e.f41005a);

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f546b);
    }

    @Override // D1.AbstractC0300e
    public final Bitmap c(InterfaceC5183a interfaceC5183a, Bitmap bitmap, int i, int i4) {
        Paint paint = B.f517a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i4) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return B.b(interfaceC5183a, bitmap, i, i4);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return -670243078;
    }
}
