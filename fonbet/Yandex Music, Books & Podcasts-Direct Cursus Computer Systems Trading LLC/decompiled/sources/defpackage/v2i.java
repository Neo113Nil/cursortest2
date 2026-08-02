package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v2i {
    public final aqd a;
    public final es6 b;
    public final HashMap c;

    public v2i(Context context, es6 es6Var) {
        aqd aqdVar = new aqd(context);
        this.c = new HashMap();
        this.a = aqdVar;
        this.b = es6Var;
    }

    public final synchronized j9t a(String str) {
        if (this.c.containsKey(str)) {
            return (j9t) this.c.get(str);
        }
        CctBackendFactory g = this.a.g(str);
        if (g == null) {
            return null;
        }
        es6 es6Var = this.b;
        j9t create = g.create(new ad2((Context) es6Var.a, (up4) es6Var.b, (up4) es6Var.c, str));
        this.c.put(str, create);
        return create;
    }
}
