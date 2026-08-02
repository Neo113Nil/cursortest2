package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ruj0 implements owq {
    @Override // defpackage.owq
    public final rwq a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (jl40.l(uri.getScheme(), "android.resource")) {
            return new q93(uri, qg70Var, 2);
        }
        return null;
    }
}
