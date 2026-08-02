package com.anythink.expressad.advanced.d;

import com.anythink.expressad.out.p;
import java.util.Random;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.advanced.b.b {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f18651a = "NativeAdvancedShowListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    protected p f18652b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.foundation.d.d f18653c;

    /* renamed from: d, reason: collision with root package name */
    protected c f18654d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18655e;

    public d(c cVar, p pVar, double d9, com.anythink.expressad.foundation.d.d dVar) {
        this.f18654d = cVar;
        this.f18652b = pVar;
        this.f18653c = dVar;
        this.f18655e = a(d9, dVar);
    }

    private void g() {
        if (this.f18652b != null) {
            this.f18652b = null;
        }
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void a() {
        c cVar = this.f18654d;
        if (cVar != null) {
            cVar.f18626d = true;
        }
        cVar.d();
        p pVar = this.f18652b;
        if (pVar == null || this.f18655e) {
            return;
        }
        pVar.b();
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void b() {
    }

    @Override // com.anythink.expressad.advanced.b.b
    public final void c() {
        p pVar = this.f18652b;
        if (pVar != null) {
            pVar.f();
            c cVar = this.f18654d;
            if (cVar != null) {
                cVar.f18626d = false;
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
        p pVar = this.f18652b;
        if (pVar == null || this.f18655e) {
            return;
        }
        pVar.a(dVar);
    }

    private static boolean a(double d9, com.anythink.expressad.foundation.d.d dVar) {
        try {
            com.anythink.expressad.f.b.a();
            com.anythink.expressad.f.a c9 = com.anythink.expressad.f.b.c();
            long l9 = c9.l() * 1000;
            long w3 = c9.w() * 1000;
            if (dVar != null) {
                if (dVar.a(w3, l9)) {
                    dVar.g(1);
                    return true;
                }
                dVar.g(0);
            }
        } catch (Exception unused) {
        }
        return (dVar == null || dVar.B() || d9 == 1.0d || new Random().nextDouble() <= d9) ? false : true;
    }
}
