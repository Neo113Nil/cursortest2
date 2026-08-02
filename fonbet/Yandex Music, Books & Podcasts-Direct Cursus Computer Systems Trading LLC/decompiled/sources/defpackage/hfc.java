package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class hfc extends u33 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(daf.a);

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.u33
    public final Bitmap c(r33 r33Var, Bitmap bitmap, int i, int i2) {
        return i7t.b(r33Var, bitmap, i, i2);
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        return obj instanceof hfc;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return 1572326941;
    }
}
