package defpackage;

import android.graphics.Bitmap;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class w2r implements pkx {
    @Override // defpackage.pkx
    public final String a(Object obj, lg70 lg70Var) {
        String c;
        cg21 cg21Var = (cg21) obj;
        String str = cg21Var.c;
        if ((str == null || str.equals("file")) && cg21Var.e != null) {
            Bitmap.Config[] configArr = zx21.a;
            if ((!jl40.l(cg21Var.c, "file") || !jl40.l(a.R(yri0.e(cg21Var)), "android_asset")) && ((Boolean) s8o.p(lg70Var, kev.c)).booleanValue() && (c = yri0.c(cg21Var)) != null) {
                r1r r1rVar = lg70Var.e;
                String str2 = oq90.b;
                return cg21Var + "-" + r1rVar.v(sms.f(c)).f;
            }
        }
        return null;
    }
}
