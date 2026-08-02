package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class zb2 implements pkx {
    @Override // defpackage.pkx
    public final String a(Object obj, lg70 lg70Var) {
        cg21 cg21Var = (cg21) obj;
        if (!jl40.l(cg21Var.c, "android.resource")) {
            return null;
        }
        Configuration configuration = lg70Var.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = zx21.a;
        return cg21Var + ":" + (configuration.uiMode & 48);
    }
}
