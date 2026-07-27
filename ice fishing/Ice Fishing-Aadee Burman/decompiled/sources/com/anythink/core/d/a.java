package com.anythink.core.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f17143a;

    public a(b bVar) {
        this.f17143a = bVar != null ? bVar.aU() : 2;
    }

    public final void a(com.anythink.core.common.m.q qVar) {
        int i = this.f17143a;
        if (i == 1) {
            new com.anythink.core.common.m.k().a(0, qVar);
        } else {
            if (i == 2) {
                new com.anythink.core.common.m.d.b().a(qVar);
                return;
            }
            com.anythink.core.common.m.n nVar = new com.anythink.core.common.m.n(qVar);
            new com.anythink.core.common.m.k().a(0, (com.anythink.core.common.m.q) nVar);
            new com.anythink.core.common.m.d.b().a(nVar);
        }
    }

    public final int a() {
        return this.f17143a;
    }
}
