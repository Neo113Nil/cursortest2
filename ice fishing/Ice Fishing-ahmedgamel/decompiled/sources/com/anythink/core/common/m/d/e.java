package com.anythink.core.common.m.d;

import com.anythink.core.common.m.d.d;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f14602b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14603c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f14604a = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f14605d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f14606e;

    private e() {
    }

    public static e a() {
        if (f14602b == null) {
            synchronized (e.class) {
                try {
                    if (f14602b == null) {
                        f14602b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14602b;
    }

    public final void a(d dVar, d.a aVar) {
        com.anythink.core.common.m.d.a.c cVar;
        int c9 = dVar.c();
        synchronized (f14603c) {
            try {
                if (c9 == 6) {
                    if (this.f14606e == null) {
                        this.f14606e = new com.anythink.core.common.m.d.a.b();
                    }
                    cVar = this.f14606e;
                } else {
                    if (this.f14605d == null) {
                        this.f14605d = new com.anythink.core.common.m.d.a.a();
                    }
                    cVar = this.f14605d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.b(dVar, aVar);
        } else if (aVar != null) {
            aVar.a((Throwable) new Exception("socketUploadData is null."));
        }
    }
}
