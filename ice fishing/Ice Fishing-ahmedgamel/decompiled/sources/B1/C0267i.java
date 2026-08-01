package B1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import s1.InterfaceC4970e;
import v1.InterfaceC5104a;

/* renamed from: B1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267i extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f132b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC4970e.f40451a);

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f132b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5104a interfaceC5104a, Bitmap bitmap, int i, int i6) {
        Paint paint = C.f103a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C.b(interfaceC5104a, bitmap, i, i6);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        return obj instanceof C0267i;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return -670243078;
    }
}
