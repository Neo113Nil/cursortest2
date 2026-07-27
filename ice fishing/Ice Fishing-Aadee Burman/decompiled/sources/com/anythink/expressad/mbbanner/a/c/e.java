package com.anythink.expressad.mbbanner.a.c;

import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19877a = "e";

    /* renamed from: b, reason: collision with root package name */
    private c f19878b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.f.c f19879c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19880d = false;

    public e(c cVar, com.anythink.expressad.f.c cVar2) {
        this.f19879c = cVar2;
        this.f19878b = cVar;
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    com.anythink.expressad.f.c cVar = this.f19879c;
                    boolean z3 = false;
                    if (!list.get(0).B() && cVar != null && cVar.a() != 1.0d) {
                        if (new Random().nextDouble() > cVar.a()) {
                            z3 = true;
                        }
                    }
                    this.f19880d = z3;
                }
            } catch (Exception unused) {
            }
        }
        c cVar2 = this.f19878b;
        if (cVar2 != null) {
            cVar2.a(list);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void b() {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void c() {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void d() {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(String str) {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.a(str);
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        c cVar = this.f19878b;
        if (cVar == null || this.f19880d) {
            return;
        }
        cVar.a(dVar);
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a() {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.a(dVar, this.f19880d);
        }
    }

    private static boolean a(com.anythink.expressad.f.c cVar, boolean z3) {
        if (z3 || cVar == null || cVar.a() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.a();
    }

    @Override // com.anythink.expressad.mbbanner.a.c.c
    public final void a(boolean z3) {
        c cVar = this.f19878b;
        if (cVar != null) {
            cVar.a(z3);
        }
    }
}
