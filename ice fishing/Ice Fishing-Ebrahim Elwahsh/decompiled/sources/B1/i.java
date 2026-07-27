package B1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import s1.InterfaceC4992e;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class i extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f98b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC4992e.f40420a);

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f98b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5117a interfaceC5117a, Bitmap bitmap, int i, int i4) {
        Paint paint = B.f69a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i4) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return B.b(interfaceC5117a, bitmap, i, i4);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return -670243078;
    }
}
