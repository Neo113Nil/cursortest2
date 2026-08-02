package defpackage;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class zrl extends y6k {
    public final jb7 a;
    public final tls b;

    public zrl(jb7 jb7Var, tls tlsVar) {
        this.a = jb7Var;
        this.b = tlsVar;
    }

    public static String a(Uri uri) {
        if (uri != null && jl40.l(uri.getScheme(), "flex-action") && jl40.l(uri.getAuthority(), "dispatch")) {
            String path = uri.getPath();
            String Q = path != null ? evu0.Q("/", path) : null;
            if (Q != null) {
                return Q;
            }
            w511.f(unr0.n(uri, "Expected action id after flex-action://dispatch/ but actual url is "));
        }
        return null;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        tls tlsVar;
        if (super.handleAction(v3kVar, fplVar, rvoVar)) {
            return true;
        }
        Expression expression = v3kVar.k;
        kr krVar = null;
        Uri uri = expression != null ? (Uri) expression.a(rvoVar) : null;
        if (uri != null && (tlsVar = this.b) != null) {
            krVar = (kr) tlsVar.invoke(uri);
        }
        jb7 jb7Var = this.a;
        if (krVar != null) {
            ((wu) jb7Var.w).b(krVar, (pxl) jb7Var.c, b.f());
            return true;
        }
        String a = a(uri);
        if (a == null) {
            a = (String) v3kVar.c.a(rvoVar);
        }
        return jb7Var.m(a);
    }

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        if (super.handleAction(f9lVar, fplVar, rvoVar)) {
            return true;
        }
        Expression url = f9lVar.getUrl();
        String a = a(url != null ? (Uri) url.a(rvoVar) : null);
        if (a == null) {
            a = (String) f9lVar.b().a(rvoVar);
        }
        return this.a.m(a);
    }
}
