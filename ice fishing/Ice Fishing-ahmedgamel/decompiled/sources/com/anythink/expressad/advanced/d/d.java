package com.anythink.expressad.advanced.d;

import com.anythink.expressad.out.p;
import java.util.Random;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.advanced.b.b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f17864a = "NativeAdvancedShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    protected p f17865b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.foundation.d.d f17866c;

    /* renamed from: d, reason: collision with root package name */
    protected c f17867d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17868e;

    public d(c cVar, p pVar, double d2, com.anythink.expressad.foundation.d.d dVar) {
        this.f17867d = cVar;
        this.f17865b = pVar;
        this.f17866c = dVar;
        this.f17868e = a(d2, dVar);
    }

    private void g() {
        if (this.f17865b != null) {
            this.f17865b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a() {
        c cVar = this.f17867d;
        if (cVar != null) {
            cVar.f17839d = true;
        }
        cVar.d();
        p pVar = this.f17865b;
        if (pVar == null || this.f17868e) {
            return;
        }
        pVar.b();
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void b() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void c() {
        p pVar = this.f17865b;
        if (pVar != null) {
            pVar.f();
            c cVar = this.f17867d;
            if (cVar != null) {
                cVar.f17839d = false;
            }
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void d() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void e() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void f() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        p pVar = this.f17865b;
        if (pVar == null || this.f17868e) {
            return;
        }
        pVar.a(dVar);
    }

    private static boolean a(double d2, com.anythink.expressad.foundation.d.d dVar) {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.a c9 = com.anythink.expressad.f.b.c();
            long l9 = c9.l() * 1000;
            long w6 = c9.w() * 1000;
            if (dVar != null) {
                if (dVar.a(w6, l9)) {
                    dVar.g(1);
                    return true;
                }
                dVar.g(0);
            }
        } catch (Exception unused) {
        }
        return (dVar == null || dVar.B() || d2 == 1.0d || new Random().nextDouble() <= d2) ? false : true;
    }
}
