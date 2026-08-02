package com.yandex.passport.sloth.dependencies;

import android.content.Context;
import com.yandex.passport.internal.sloth.j;
import com.yandex.passport.internal.sloth.p;
import com.yandex.passport.internal.sloth.z;
import defpackage.a4g;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class c implements rzm {
    public final /* synthetic */ int a;
    public final b b;

    public /* synthetic */ c(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = this.b.a;
                a4g.t(context);
                return context;
            case 1:
                com.yandex.passport.internal.sloth.g gVar = this.b.k;
                a4g.t(gVar);
                return gVar;
            case 2:
                com.yandex.passport.internal.sloth.i iVar = this.b.c;
                a4g.t(iVar);
                return iVar;
            case 3:
                j jVar = this.b.e;
                a4g.t(jVar);
                return jVar;
            case 4:
                com.yandex.passport.internal.sloth.e eVar = this.b.l;
                a4g.t(eVar);
                return eVar;
            case 5:
                com.yandex.passport.common.coroutine.a aVar = this.b.b;
                a4g.t(aVar);
                return aVar;
            case 6:
                return this.b.g;
            case 7:
                h hVar = this.b.h;
                a4g.t(hVar);
                return hVar;
            case 8:
                com.yandex.passport.common.ui.lang.b bVar = this.b.i;
                a4g.t(bVar);
                return bVar;
            case 9:
                p pVar = this.b.f;
                a4g.t(pVar);
                return pVar;
            case 10:
                i iVar2 = this.b.d;
                a4g.t(iVar2);
                return iVar2;
            default:
                z zVar = this.b.j;
                a4g.t(zVar);
                return zVar;
        }
    }
}
