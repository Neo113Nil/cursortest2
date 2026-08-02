package com.anythink.core.common.m.d;

import com.anythink.core.common.m.d.d;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static e f15388b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f15389c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final String f15390a = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f15391d;

    /* renamed from: e, reason: collision with root package name */
    private volatile com.anythink.core.common.m.d.a.c f15392e;

    private e() {
    }

    public static e a() {
        if (f15388b == null) {
            synchronized (e.class) {
                try {
                    if (f15388b == null) {
                        f15388b = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15388b;
    }

    public final void a(d dVar, d.a aVar) {
        com.anythink.core.common.m.d.a.c cVar;
        int c9 = dVar.c();
        synchronized (f15389c) {
            try {
                if (c9 == 6) {
                    if (this.f15392e == null) {
                        this.f15392e = new com.anythink.core.common.m.d.a.b();
                    }
                    cVar = this.f15392e;
                } else {
                    if (this.f15391d == null) {
                        this.f15391d = new com.anythink.core.common.m.d.a.a();
                    }
                    cVar = this.f15391d;
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
