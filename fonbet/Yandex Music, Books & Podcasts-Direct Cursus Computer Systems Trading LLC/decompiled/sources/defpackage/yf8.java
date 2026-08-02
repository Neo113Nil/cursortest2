package defpackage;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class yf8 extends eg8 {
    public final bf a;

    public yf8(bf bfVar) {
        this.a = bfVar;
    }

    @Override // defpackage.eg8
    public final boolean a(bd8 bd8Var, w0a w0aVar, xzb xzbVar) {
        Uri uri;
        bd8Var.getClass();
        w0aVar.getClass();
        xzbVar.getClass();
        szb szbVar = bd8Var.k;
        if (szbVar != null && (uri = (Uri) szbVar.a(xzbVar)) != null) {
            this.a.a.a(uri);
        }
        return super.a(bd8Var, w0aVar, xzbVar);
    }
}
