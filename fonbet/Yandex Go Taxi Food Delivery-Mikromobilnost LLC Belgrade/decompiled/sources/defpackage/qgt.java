package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class qgt implements nw01 {
    public final nw01 b;

    public qgt(nw01 nw01Var) {
        z2a1.e(nw01Var, "Argument must not be null");
        this.b = nw01Var;
    }

    @Override // defpackage.khx
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.nw01
    public final otj0 b(Context context, otj0 otj0Var, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) otj0Var.get();
        h16 h16Var = new h16(Glide.get(context).getBitmapPool(), gifDrawable.getFirstFrame());
        nw01 nw01Var = this.b;
        otj0 b = nw01Var.b(context, h16Var, i, i2);
        if (h16Var != b) {
            h16Var.a();
        }
        gifDrawable.setFrameTransformation(nw01Var, (Bitmap) b.get());
        return otj0Var;
    }

    @Override // defpackage.khx
    public final boolean equals(Object obj) {
        if (obj instanceof qgt) {
            return this.b.equals(((qgt) obj).b);
        }
        return false;
    }

    @Override // defpackage.khx
    public final int hashCode() {
        return this.b.hashCode();
    }
}
