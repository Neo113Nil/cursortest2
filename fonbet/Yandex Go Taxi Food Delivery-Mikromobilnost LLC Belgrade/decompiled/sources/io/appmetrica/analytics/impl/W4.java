package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class W4 {
    public final X7 a;
    public C0390hd b;
    public C0419id c;
    public Pd d;

    public W4(File file) {
        this.a = new X7(file);
    }

    public final synchronized InterfaceC0418ic a(Context context) {
        C0419id c0419id;
        c0419id = this.c;
        if (c0419id == null) {
            c0419id = new C0419id(c(context));
            this.c = c0419id;
        }
        return c0419id;
    }

    public final synchronized InterfaceC0418ic b(Context context) {
        return c(context);
    }

    public final InterfaceC0418ic c(Context context) {
        Pd pd;
        C0390hd c0390hd = this.b;
        if (c0390hd != null) {
            return c0390hd;
        }
        synchronized (this) {
            pd = this.d;
            if (pd == null) {
                X7 x7 = this.a;
                String a = new W7(x7.a, x7.b, true).a(context, new H4());
                J7 j7 = AbstractC0671r6.c;
                j7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0585o6.a);
                Cq cq = j7.c;
                T7 t7 = j7.a;
                P7 p7 = t7.c;
                Q7 q7 = t7.d;
                Ob ob = new Ob(false);
                ob.a(112, new I4());
                Fq fq = new Fq("service database", hashMap);
                cq.getClass();
                pd = new Pd(context, a, new C0619pb(a), new Dq(p7, q7, ob, fq));
                this.d = pd;
            }
        }
        C0390hd c0390hd2 = new C0390hd("preferences", pd, V4.l().c.b());
        this.b = c0390hd2;
        return c0390hd2;
    }
}
