package com.yandex.passport.internal.ui.sloth.menu;

import defpackage.rzm;

/* loaded from: classes4.dex */
public final class h implements rzm {
    public final /* synthetic */ int a;
    public final f b;
    public final rzm c;

    public /* synthetic */ h(f fVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = fVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.ui.sloth.g gVar = (com.yandex.passport.internal.ui.sloth.g) this.c.get();
                this.b.getClass();
                gVar.getClass();
                return gVar;
            default:
                j jVar = (j) this.c.get();
                f fVar = this.b;
                fVar.getClass();
                jVar.getClass();
                return new l(fVar.a, jVar);
        }
    }
}
