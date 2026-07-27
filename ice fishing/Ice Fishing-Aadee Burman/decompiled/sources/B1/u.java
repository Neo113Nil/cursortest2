package B1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import s1.InterfaceC4970e;
import v1.InterfaceC5104a;

/* loaded from: classes.dex */
public final class u extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f159b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC4970e.f40448a);

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f159b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5104a interfaceC5104a, Bitmap bitmap, int i, int i6) {
        return C.b(interfaceC5104a, bitmap, i, i6);
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return 1572326941;
    }
}
