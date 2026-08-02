package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.div.json.expressions.Expression;

/* loaded from: classes.dex */
public final class y4k {
    public final g3y a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public y4k(g3y g3yVar, boolean z, boolean z2, boolean z3) {
        this.a = g3yVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static boolean a(String str) {
        return jl40.l(str, "http") || jl40.l(str, Constants.SCHEME);
    }

    public final void b(v3k v3kVar, rvo rvoVar) {
        Uri uri;
        Expression expression = v3kVar.d;
        if (expression == null || (uri = (Uri) expression.a(rvoVar)) == null) {
            return;
        }
        if (!a(uri.getScheme())) {
            int i = wfx.a;
        } else {
            if (!this.b || this.a.get() == null) {
                return;
            }
            ny61.u();
        }
    }

    public final void c(f9l f9lVar, rvo rvoVar) {
        Uri uri;
        Expression url = f9lVar.getUrl();
        if (url == null || (uri = (Uri) url.a(rvoVar)) == null) {
            return;
        }
        if (!a(uri.getScheme())) {
            int i = wfx.a;
        } else {
            if (!this.c || this.a.get() == null) {
                return;
            }
            ny61.u();
        }
    }
}
