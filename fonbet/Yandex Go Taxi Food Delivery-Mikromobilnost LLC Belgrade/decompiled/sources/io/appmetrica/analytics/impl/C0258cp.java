package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0258cp {
    public final Ob a = new Ob();
    public final HashMap b = new HashMap();
    public Bp c = null;
    public final C0200ap d = new C0200ap(this);

    public final Wp a(Context context, K5 k5, C0806vp c0806vp) {
        Wp wp = (Wp) this.b.get(k5.a);
        boolean z = true;
        if (wp == null) {
            synchronized (this.b) {
                try {
                    wp = (Wp) this.b.get(k5.a);
                    if (wp == null) {
                        wp = new Wp(new Xp(context, k5.a, c0806vp, this.d));
                        wp.f();
                        this.b.put(k5.a, wp);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            wp.a(c0806vp);
        }
        return wp;
    }

    public static final C0258cp a() {
        return AbstractC0229bp.a;
    }

    public final void a(K5 k5, InterfaceC0517lp interfaceC0517lp) {
        synchronized (this.b) {
            try {
                this.a.a(k5.a, interfaceC0517lp);
                Bp bp = this.c;
                if (bp != null) {
                    interfaceC0517lp.a(bp);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
