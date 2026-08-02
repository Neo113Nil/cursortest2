package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class x2r implements rv00 {
    @Override // defpackage.rv00
    public final Object a(Object obj, qg70 qg70Var) {
        Uri uri = (Uri) obj;
        if (m.d(uri)) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (!evu0.a0(path, '/') || ((String) a.R(uri.getPathSegments())) == null) {
            return null;
        }
        if (!jl40.l(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path2 = uri.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
