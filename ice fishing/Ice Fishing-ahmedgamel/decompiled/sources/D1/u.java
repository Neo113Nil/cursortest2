package D1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import u1.InterfaceC5066e;
import x1.InterfaceC5183a;

/* loaded from: classes.dex */
public final class u extends AbstractC0300e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f573b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC5066e.f41005a);

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f573b);
    }

    @Override // D1.AbstractC0300e
    public final Bitmap c(InterfaceC5183a interfaceC5183a, Bitmap bitmap, int i, int i4) {
        return B.b(interfaceC5183a, bitmap, i, i4);
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return 1572326941;
    }
}
