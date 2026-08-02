package defpackage;

import android.net.Uri;
import java.util.Locale;

/* loaded from: classes.dex */
public final class tvn implements igv {
    @Override // defpackage.igv
    public final hgv a(Uri uri) {
        ngd0 ngd0Var = ngd0.A;
        String scheme = uri.getScheme();
        String lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : null;
        if (jl40.l(lowerCase, "empty")) {
            return ngd0Var;
        }
        if (lowerCase != null && !evu0.J(lowerCase)) {
            return null;
        }
        jst.e.getClass();
        return ngd0Var;
    }
}
