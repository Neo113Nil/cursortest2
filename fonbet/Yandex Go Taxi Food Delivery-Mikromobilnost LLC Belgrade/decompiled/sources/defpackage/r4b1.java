package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public abstract class r4b1 {
    public static i3a1 a(uv4 uv4Var) {
        yw91 yw91Var = (yw91) qk20.c().a(yw91.class);
        return new i3a1(uv4Var, (yra1) yw91Var.a.b(uv4Var), (Executor) yw91Var.b.a.get(), uvb1.l(e891.b()));
    }

    public static boolean b(Uri uri, String str) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null) {
            return pathSegments.contains(str);
        }
        return false;
    }

    public static String c(Throwable th) {
        StringBuilder sb = new StringBuilder(th.toString());
        Throwable cause = th.getCause();
        if (cause != null) {
            sb.append("\n Cause: ".concat(c(cause)));
        }
        return sb.toString();
    }
}
