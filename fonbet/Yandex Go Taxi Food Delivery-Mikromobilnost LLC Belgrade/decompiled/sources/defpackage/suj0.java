package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class suj0 implements rv00 {
    @Override // defpackage.rv00
    public final Object a(Object obj, qg70 qg70Var) {
        String authority;
        Uri uri = (Uri) obj;
        if (jl40.l(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !evu0.J(authority) && uri.getPathSegments().size() == 2) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                authority2 = "";
            }
            Resources resourcesForApplication = qg70Var.c().getPackageManager().getResourcesForApplication(authority2);
            List<String> pathSegments = uri.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            if (identifier != 0) {
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            }
            xfo.g(unr0.n(uri, "Invalid android.resource URI: "));
        }
        return null;
    }
}
