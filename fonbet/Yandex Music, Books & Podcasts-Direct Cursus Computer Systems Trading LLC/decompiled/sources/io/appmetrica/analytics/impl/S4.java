package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class S4 {
    public final T7 a;
    public Rc b;
    public Sc c;
    public C0834zd d;

    public S4(File file) {
        this.a = new T7(file);
    }

    public final synchronized Tb a(Context context) {
        Sc sc;
        sc = this.c;
        if (sc == null) {
            sc = new Sc(c(context));
            this.c = sc;
        }
        return sc;
    }

    public final synchronized Tb b(Context context) {
        return c(context);
    }

    public final Tb c(Context context) {
        C0834zd c0834zd;
        Rc rc = this.b;
        if (rc != null) {
            return rc;
        }
        synchronized (this) {
            c0834zd = this.d;
            if (c0834zd == null) {
                T7 t7 = this.a;
                String a = new S7(t7.a, t7.b, true).a(context, new D4());
                F7 f7 = AbstractC0511o6.c;
                f7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0424l6.a);
                C0444lq c0444lq = f7.c;
                P7 p7 = f7.a;
                L7 l7 = p7.c;
                M7 m7 = p7.d;
                C0804yb c0804yb = new C0804yb(false);
                c0804yb.a(112, new E4());
                C0531oq c0531oq = new C0531oq("service database", hashMap);
                c0444lq.getClass();
                c0834zd = new C0834zd(context, a, new C0285gb(a), new C0473mq(l7, m7, c0804yb, c0531oq));
                this.d = c0834zd;
            }
        }
        Rc rc2 = new Rc(c0834zd);
        this.b = rc2;
        return rc2;
    }
}
