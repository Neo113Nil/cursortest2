package com.yandex.passport.sloth.ui.dependencies;

import android.app.Activity;
import defpackage.a4g;
import defpackage.agv;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class n implements rzm {
    public final /* synthetic */ int a;
    public final m b;

    public /* synthetic */ n(m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) this.b.b;
                a4g.t(activity);
                return activity;
            case 1:
                com.yandex.passport.common.common.a aVar = (com.yandex.passport.common.common.a) this.b.h;
                a4g.t(aVar);
                return aVar;
            case 2:
                d dVar = (d) this.b.e;
                a4g.t(dVar);
                return dVar;
            case 3:
                com.yandex.passport.sloth.ui.l lVar = (com.yandex.passport.sloth.ui.l) this.b.f;
                a4g.t(lVar);
                return lVar;
            case 4:
                o oVar = (o) this.b.g;
                a4g.t(oVar);
                return oVar;
            case 5:
                com.yandex.passport.sloth.dependencies.i iVar = (com.yandex.passport.sloth.dependencies.i) this.b.k;
                a4g.t(iVar);
                return iVar;
            case 6:
                p pVar = (p) this.b.i;
                a4g.t(pVar);
                return pVar;
            case 7:
                com.yandex.passport.sloth.ui.string.b bVar = (com.yandex.passport.sloth.ui.string.b) this.b.c;
                a4g.t(bVar);
                return bVar;
            case 8:
                agv agvVar = (agv) this.b.j;
                a4g.t(agvVar);
                return agvVar;
            default:
                q qVar = (q) this.b.d;
                a4g.t(qVar);
                return qVar;
        }
    }
}
