package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class r6x0 extends h7 {
    public r6x0() {
        super("load_by_tag");
    }

    @Override // defpackage.h7
    public final hgv b(Uri uri) {
        String queryParameter = uri.getQueryParameter("tag");
        if (queryParameter != null && !evu0.J(queryParameter)) {
            return new fgv(new obv(queryParameter, null, 6, 0));
        }
        hst hstVar = jst.e;
        uri.toString();
        hstVar.getClass();
        return ngd0.A;
    }
}
