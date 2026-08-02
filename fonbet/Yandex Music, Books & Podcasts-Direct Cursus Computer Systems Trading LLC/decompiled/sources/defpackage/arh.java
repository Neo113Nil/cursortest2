package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class arh {
    public final Context a;
    public final qec b;
    public final tt1 c = new tt1(11, this);
    public n7b d;
    public fqh e;
    public boolean f;
    public bz2 g;
    public boolean h;

    public arh(Context context, qec qecVar) {
        if (context == null) {
            xq0.x("context must not be null");
            throw null;
        }
        this.a = context;
        if (qecVar != null) {
            this.b = qecVar;
        } else {
            this.b = new qec(14, new ComponentName(context, getClass()));
        }
    }

    public yqh c(String str) {
        if (str != null) {
            return null;
        }
        xq0.x("initialMemberRouteId cannot be null.");
        return null;
    }

    public abstract zqh d(String str);

    public zqh e(String str, String str2) {
        if (str == null) {
            xq0.x("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return d(str);
        }
        xq0.x("routeGroupId cannot be null");
        return null;
    }

    public abstract void f(fqh fqhVar);

    public final void g(bz2 bz2Var) {
        krh.b();
        if (this.g != bz2Var) {
            this.g = bz2Var;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void h(fqh fqhVar) {
        krh.b();
        if (Objects.equals(this.e, fqhVar)) {
            return;
        }
        this.e = fqhVar;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }
}
