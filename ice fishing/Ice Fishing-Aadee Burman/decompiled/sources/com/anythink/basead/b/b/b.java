package com.anythink.basead.b.b;

import com.anythink.basead.b.c;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.d.t;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    c.a f5755a;

    /* renamed from: b, reason: collision with root package name */
    boolean f5756b = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f5757c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f5758d = false;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f5759e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5760f;

    public b() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f5759e = atomicBoolean;
        this.f5760f = false;
        atomicBoolean.set(false);
        this.f5760f = false;
        g();
    }

    private void g() {
        this.f5756b = false;
        this.f5757c = false;
        this.f5758d = false;
    }

    public final void a(c.a aVar) {
        this.f5755a = aVar;
    }

    @Override // com.anythink.basead.b.c.a
    public final void b() {
        if (this.f5760f || this.f5757c) {
            return;
        }
        this.f5757c = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f5755a;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    @Override // com.anythink.basead.b.c.a
    public final void c() {
        this.f5759e.set(false);
        if (this.f5760f || this.f5758d) {
            return;
        }
        this.f5758d = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f5755a;
                if (aVar != null) {
                    aVar.c();
                }
            }
        });
    }

    public final void d() {
        this.f5759e.set(true);
        g();
    }

    public final boolean e() {
        return this.f5759e.get();
    }

    public final void f() {
        this.f5755a = null;
        this.f5759e.set(false);
        this.f5760f = true;
    }

    @Override // com.anythink.basead.b.c.a
    public final void a() {
        if (this.f5760f || this.f5756b) {
            return;
        }
        this.f5756b = true;
        c.a aVar = this.f5755a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.basead.b.c.a
    public final void a(boolean z3) {
        c.a aVar;
        if (this.f5760f || (aVar = this.f5755a) == null) {
            return;
        }
        aVar.a(z3);
    }

    @Override // com.anythink.basead.b.c.a
    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        c.a aVar = this.f5755a;
        if (aVar != null) {
            return aVar.a(str, iOfferClickHandler);
        }
        return false;
    }
}
