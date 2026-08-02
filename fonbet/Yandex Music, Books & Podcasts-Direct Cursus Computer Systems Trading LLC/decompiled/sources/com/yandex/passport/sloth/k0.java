package com.yandex.passport.sloth;

import defpackage.rzm;
import defpackage.toe;

/* loaded from: classes4.dex */
public final class k0 implements rzm {
    public final /* synthetic */ int a;
    public final toe b;
    public final rzm c;
    public final rzm d;
    public final rzm e;
    public final rzm f;
    public final rzm g;

    public /* synthetic */ k0(toe toeVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, int i) {
        this.a = i;
        this.b = toeVar;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new j0((com.yandex.passport.sloth.data.m) this.b.a, (com.yandex.passport.internal.sloth.i) this.c.get(), (f) this.d.get(), (a1) this.e.get(), (v) this.f.get(), (i) this.g.get());
            default:
                return new com.yandex.passport.sloth.url.b0((com.yandex.passport.sloth.data.m) this.b.a, (com.yandex.passport.internal.sloth.j) this.c.get(), (com.yandex.passport.sloth.url.a0) this.d.get(), (j0) this.e.get(), (l) this.f.get(), (a1) this.g.get());
        }
    }
}
