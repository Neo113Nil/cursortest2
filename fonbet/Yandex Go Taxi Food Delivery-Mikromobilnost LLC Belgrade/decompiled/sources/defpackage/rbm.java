package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class rbm implements nw01 {
    public final nw01 b;
    public final boolean c;

    public rbm(nw01 nw01Var, boolean z) {
        this.b = nw01Var;
        this.c = z;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.nw01
    public final otj0 b(Context context, otj0 otj0Var, int i, int i2) {
        b16 bitmapPool = Glide.get(context).getBitmapPool();
        Drawable drawable = (Drawable) otj0Var.get();
        h16 a = qbm.a(bitmapPool, drawable, i, i2);
        if (a == null) {
            if (!this.c) {
                return otj0Var;
            }
            w511.t("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        otj0 b = this.b.b(context, a, i, i2);
        if (!b.equals(a)) {
            return new h16(context.getResources(), b);
        }
        b.a();
        return otj0Var;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof rbm) {
            return this.b.equals(((rbm) obj).b);
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return this.b.hashCode();
    }
}
