package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class Ko {
    public final C0804yb a = new C0804yb();
    public final HashMap b = new HashMap();
    public C0385jp c = null;
    public final Io d = new Io(this);

    public final Ep a(Context context, H5 h5, C0212dp c0212dp) {
        Ep ep = (Ep) this.b.get(h5.a);
        boolean z = true;
        if (ep == null) {
            synchronized (this.b) {
                try {
                    ep = (Ep) this.b.get(h5.a);
                    if (ep == null) {
                        ep = new Ep(new Fp(context, h5.a, c0212dp, this.d));
                        ep.f();
                        this.b.put(h5.a, ep);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            ep.a(c0212dp);
        }
        return ep;
    }

    public static final Ko a() {
        return Jo.a;
    }

    public final void a(H5 h5, To to) {
        synchronized (this.b) {
            try {
                this.a.a(h5.a, to);
                C0385jp c0385jp = this.c;
                if (c0385jp != null) {
                    to.a(c0385jp);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
