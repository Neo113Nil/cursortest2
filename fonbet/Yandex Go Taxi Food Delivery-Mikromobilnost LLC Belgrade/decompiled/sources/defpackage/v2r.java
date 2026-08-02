package defpackage;

import android.graphics.Bitmap;
import coil3.c;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class v2r implements nwq {
    @Override // defpackage.nwq
    public final pwq a(Object obj, lg70 lg70Var, c cVar) {
        cg21 cg21Var = (cg21) obj;
        String str = cg21Var.c;
        if ((str != null && !str.equals("file")) || cg21Var.e == null) {
            return null;
        }
        Bitmap.Config[] configArr = zx21.a;
        if (jl40.l(cg21Var.c, "file") && jl40.l(a.R(yri0.e(cg21Var)), "android_asset")) {
            return null;
        }
        return new p93(cg21Var, lg70Var, 3);
    }
}
