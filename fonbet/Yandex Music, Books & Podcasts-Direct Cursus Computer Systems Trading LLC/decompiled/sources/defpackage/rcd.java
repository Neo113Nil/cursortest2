package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class rcd implements d7t {
    public final d7t b;

    public rcd(d7t d7tVar) {
        w1g.s(d7tVar, "Argument must not be null");
        this.b = d7tVar;
    }

    @Override // defpackage.d7t
    public final k2o a(Context context, k2o k2oVar, int i, int i2) {
        pcd pcdVar = (pcd) k2oVar.get();
        k2o s33Var = new s33(a.a(context).a, ((vcd) pcdVar.a.b).l);
        d7t d7tVar = this.b;
        k2o a = d7tVar.a(context, s33Var, i, i2);
        if (!s33Var.equals(a)) {
            s33Var.g();
        }
        ((vcd) pcdVar.a.b).c(d7tVar, (Bitmap) a.get());
        return k2oVar;
    }

    @Override // defpackage.daf
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.daf
    public final boolean equals(Object obj) {
        if (obj instanceof rcd) {
            return this.b.equals(((rcd) obj).b);
        }
        return false;
    }

    @Override // defpackage.daf
    public final int hashCode() {
        return this.b.hashCode();
    }
}
