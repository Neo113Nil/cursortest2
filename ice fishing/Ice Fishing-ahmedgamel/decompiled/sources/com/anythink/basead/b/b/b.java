package com.anythink.basead.b.b;

import com.anythink.basead.b.c;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.d.t;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    c.a f6541a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6542b = false;

    /* renamed from: c, reason: collision with root package name */
    boolean f6543c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f6544d = false;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f6545e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6546f;

    public b() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f6545e = atomicBoolean;
        this.f6546f = false;
        atomicBoolean.set(false);
        this.f6546f = false;
        g();
    }

    private void g() {
        this.f6542b = false;
        this.f6543c = false;
        this.f6544d = false;
    }

    public final void a(c.a aVar) {
        this.f6541a = aVar;
    }

    @Override // com.anythink.basead.b.c.a
    public final void b() {
        if (this.f6546f || this.f6543c) {
            return;
        }
        this.f6543c = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f6541a;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }

    @Override // com.anythink.basead.b.c.a
    public final void c() {
        this.f6545e.set(false);
        if (this.f6546f || this.f6544d) {
            return;
        }
        this.f6544d = true;
        t.b().b(new Runnable() { // from class: com.anythink.basead.b.b.b.2
            @Override // java.lang.Runnable
            public final void run() {
                c.a aVar = b.this.f6541a;
                if (aVar != null) {
                    aVar.c();
                }
            }
        });
    }

    public final void d() {
        this.f6545e.set(true);
        g();
    }

    public final boolean e() {
        return this.f6545e.get();
    }

    public final void f() {
        this.f6541a = null;
        this.f6545e.set(false);
        this.f6546f = true;
    }

    @Override // com.anythink.basead.b.c.a
    public final void a() {
        if (this.f6546f || this.f6542b) {
            return;
        }
        this.f6542b = true;
        c.a aVar = this.f6541a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.anythink.basead.b.c.a
    public final void a(boolean z6) {
        c.a aVar;
        if (this.f6546f || (aVar = this.f6541a) == null) {
            return;
        }
        aVar.a(z6);
    }

    @Override // com.anythink.basead.b.c.a
    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        c.a aVar = this.f6541a;
        if (aVar != null) {
            return aVar.a(str, iOfferClickHandler);
        }
        return false;
    }
}
