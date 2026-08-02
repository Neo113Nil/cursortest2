package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0225bl {
    public final HashMap a = new HashMap();
    public final F0 b;

    public C0225bl(F0 f0) {
        this.b = f0;
    }

    public final Tk a(Context context, String str) {
        Tk tk;
        Tk tk2 = (Tk) this.a.get(str);
        if (tk2 != null) {
            return tk2;
        }
        synchronized (this.a) {
            try {
                tk = (Tk) this.a.get(str);
                if (tk == null) {
                    IHandlerExecutor a = V4.l().c.a();
                    this.b.getClass();
                    if (E0.e == null) {
                        ((Pa) a).b.post(new Zk(this, context));
                    }
                    tk = new Tk(context.getApplicationContext(), str, new F0());
                    this.a.put(str, tk);
                    tk.c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tk;
    }

    public static C0225bl a() {
        return AbstractC0196al.a;
    }
}
