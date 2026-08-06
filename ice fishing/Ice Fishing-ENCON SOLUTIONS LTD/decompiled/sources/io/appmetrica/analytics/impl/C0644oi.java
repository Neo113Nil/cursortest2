package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644oi {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6687a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C0911z0 f6688b;

    public C0644oi(C0911z0 c0911z0) {
        this.f6688b = c0911z0;
    }

    public static C0644oi a() {
        return AbstractC0618ni.f6628a;
    }

    public final C0437gi a(Context context, String str) {
        C0437gi c0437gi = (C0437gi) this.f6687a.get(str);
        if (c0437gi == null) {
            synchronized (this.f6687a) {
                try {
                    c0437gi = (C0437gi) this.f6687a.get(str);
                    if (c0437gi == null) {
                        IHandlerExecutor a2 = C0294b4.l().f5584c.a();
                        this.f6688b.getClass();
                        if (C0885y0.f7216e == null) {
                            ((C0920z9) a2).f7271b.post(new RunnableC0592mi(this, context));
                        }
                        c0437gi = new C0437gi(context.getApplicationContext(), str, new C0911z0());
                        this.f6687a.put(str, c0437gi);
                        c0437gi.c(str);
                    }
                } finally {
                }
            }
        }
        return c0437gi;
    }
}
