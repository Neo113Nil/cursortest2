package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class spa implements d7t {
    public final d7t b;
    public final boolean c;

    public spa(d7t d7tVar, boolean z) {
        this.b = d7tVar;
        this.c = z;
    }

    @Override // defpackage.d7t
    public final k2o a(Context context, k2o k2oVar, int i, int i2) {
        r33 r33Var = a.a(context).a;
        Drawable drawable = (Drawable) k2oVar.get();
        s33 L = vwb.L(r33Var, drawable, i, i2);
        if (L == null) {
            if (!this.c) {
                return k2oVar;
            }
            wvs.g(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        k2o a = this.b.a(context, L, i, i2);
        if (!a.equals(L)) {
            return new s33(context.getResources(), a);
        }
        a.g();
        return k2oVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof spa) {
            return this.b.equals(((spa) obj).b);
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return this.b.hashCode();
    }
}
