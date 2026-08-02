package com.anythink.expressad.mbbanner.a.c;

import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20664a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f20665b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.f.c f20666c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20667d = false;

    public e(c cVar, com.anythink.expressad.f.c cVar2) {
        this.f20666c = cVar2;
        this.f20665b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.f.c cVar = this.f20666c;
                    boolean z6 = false;
                    if (!list.get(0).B() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z6 = true;
                        }
                    }
                    this.f20667d = z6;
                }
            } catch (Exception unused) {
            }
        }
        c cVar2 = this.f20665b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        c cVar = this.f20665b;
        if (cVar == null || this.f20667d) {
            return;
        }
        cVar.a(dVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z6) {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.a(dVar, this.f20667d);
        }
    }

    private static boolean a(com.anythink.expressad.f.c cVar, boolean z6) {
        if (z6 || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z6) {
        c cVar = this.f20665b;
        if (cVar != null) {
            cVar.a(z6);
        }
    }
}
