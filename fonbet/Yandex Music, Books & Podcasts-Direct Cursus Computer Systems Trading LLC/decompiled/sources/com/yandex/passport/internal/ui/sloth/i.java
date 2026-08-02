package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.internal.report.reporters.h1;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class i implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final com.yandex.passport.common.coroutine.d c;
    public final rzm d;
    public final com.yandex.passport.internal.ui.bouncer.sloth.i e;
    public final h1 f;
    public final rzm g;
    public final com.yandex.passport.internal.ui.bouncer.sloth.i h;
    public final rzm i;

    public /* synthetic */ i(rzm rzmVar, com.yandex.passport.common.coroutine.d dVar, rzm rzmVar2, com.yandex.passport.internal.ui.bouncer.sloth.i iVar, h1 h1Var, rzm rzmVar3, com.yandex.passport.internal.ui.bouncer.sloth.i iVar2, rzm rzmVar4, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = dVar;
        this.d = rzmVar2;
        this.e = iVar;
        this.f = h1Var;
        this.g = rzmVar3;
        this.h = iVar2;
        this.i = rzmVar4;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h((Activity) this.b.get(), (g) this.c.get(), (com.yandex.passport.common.coroutine.e) this.d.get(), (d) this.e.get(), (com.yandex.passport.internal.sloth.n) this.f.get(), (com.yandex.passport.internal.common.d) this.g.get(), (e) this.h.get(), (com.yandex.passport.internal.sloth.w) this.i.get());
            default:
                return new com.yandex.passport.internal.ui.sloth.menu.m((Activity) this.b.get(), (g) this.c.get(), (com.yandex.passport.common.coroutine.e) this.d.get(), (d) this.e.get(), (com.yandex.passport.internal.sloth.n) this.f.get(), (com.yandex.passport.internal.common.d) this.g.get(), (e) this.h.get(), (com.yandex.passport.internal.sloth.w) this.i.get());
        }
    }
}
