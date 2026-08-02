package com.yandex.passport.internal.ui.bouncer;

import defpackage.rzm;

/* loaded from: classes4.dex */
public final class f implements rzm {
    public final /* synthetic */ int a;
    public final d b;
    public final rzm c;

    public /* synthetic */ f(d dVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = dVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) this.c.get();
                this.b.getClass();
                lVar.getClass();
                return com.yandex.plus.pay.ui.core.b.G(lVar.e);
            case 1:
                m mVar = (m) this.c.get();
                this.b.getClass();
                mVar.getClass();
                return mVar;
            default:
                com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) this.c.get();
                this.b.getClass();
                lVar2.getClass();
                return new com.yandex.passport.internal.ui.sloth.j(lVar2.x);
        }
    }
}
