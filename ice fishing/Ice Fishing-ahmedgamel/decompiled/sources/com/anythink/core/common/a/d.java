package com.anythink.core.common.a;

import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f12930b;

    /* renamed from: a, reason: collision with root package name */
    final String f12931a = d.class.getName();

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.common.e.i f12932c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.e.h f12933d;

    private d() {
        if (t.b().g() != null) {
            this.f12932c = com.anythink.core.common.e.i.a(com.anythink.core.common.e.e.a(t.b().g()));
            this.f12933d = com.anythink.core.common.e.h.a(com.anythink.core.common.e.e.a(t.b().g()));
        }
    }

    public final void c(final r rVar) {
        if (rVar.aG() != 1) {
            rVar.aG();
        } else if (rVar.K() != 1 && rVar.K() != 4) {
            rVar.K();
        } else {
            t.b();
            t.c(new Runnable() { // from class: com.anythink.core.common.a.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    rVar.aE();
                    k kVar = new k();
                    kVar.f12974a = rVar.aD();
                    kVar.f12975b = rVar.aE();
                    kVar.f12976c = rVar.I();
                    d.this.f12933d.a(kVar);
                }
            });
        }
    }

    public static d a() {
        if (f12930b == null) {
            synchronized (d.class) {
                try {
                    if (f12930b == null) {
                        f12930b = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12930b;
    }

    public final void b(final r rVar) {
        rVar.aE();
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.2
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = new l();
                lVar.f12974a = rVar.aD();
                lVar.f12975b = rVar.aE();
                lVar.f12977c = rVar.aF();
                lVar.f12978d = 1;
                d.this.f12932c.b(lVar);
            }
        });
    }

    public final void b() {
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.3
            @Override // java.lang.Runnable
            public final void run() {
                d.this.f12932c.a();
            }
        });
    }

    public final List<j> b(int i) {
        return this.f12933d.a(i);
    }

    public final void a(final r rVar) {
        rVar.aE();
        t.b();
        t.c(new Runnable() { // from class: com.anythink.core.common.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = new l();
                lVar.f12974a = rVar.aD();
                lVar.f12975b = rVar.aE();
                lVar.f12977c = rVar.aF();
                lVar.f12978d = 0;
                d.this.f12932c.a(lVar);
            }
        });
    }

    public final List<j> a(int i) {
        return this.f12932c.a(i);
    }
}
