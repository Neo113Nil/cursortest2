package com.anythink.expressad.mbbanner.a.c;

import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20035a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f20036b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.f.c f20037c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20038d = false;

    public e(c cVar, com.anythink.expressad.f.c cVar2) {
        this.f20037c = cVar2;
        this.f20036b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.f.c cVar = this.f20037c;
                    boolean z8 = false;
                    if (!list.get(0).B() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z8 = true;
                        }
                    }
                    this.f20038d = z8;
                }
            } catch (Exception unused) {
            }
        }
        c cVar2 = this.f20036b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        c cVar = this.f20036b;
        if (cVar == null || this.f20038d) {
            return;
        }
        cVar.a(dVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z8) {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.a(dVar, this.f20038d);
        }
    }

    private static boolean a(com.anythink.expressad.f.c cVar, boolean z8) {
        if (z8 || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z8) {
        c cVar = this.f20036b;
        if (cVar != null) {
            cVar.a(z8);
        }
    }
}
