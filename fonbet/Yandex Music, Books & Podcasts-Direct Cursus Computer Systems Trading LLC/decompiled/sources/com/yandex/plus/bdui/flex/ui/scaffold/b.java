package com.yandex.plus.bdui.flex.ui.scaffold;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.plus.scaffold.controller.e;
import defpackage.btf;
import defpackage.jso;
import defpackage.jyr;
import defpackage.os7;
import defpackage.tro;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class b extends tro {
    public final e b;
    public final jyr c;

    public b(com.yandex.plus.bdui.flex.utils.b bVar, e eVar, os7 os7Var) {
        eVar.getClass();
        this.b = eVar;
        this.c = btf.b(new p(2, os7Var, this, bVar));
    }

    @Override // defpackage.p9
    public final void A(View view) {
        view.getClass();
        com.yandex.plus.bdui.flex.ui.b bVar = (com.yandex.plus.bdui.flex.ui.b) this.c.getValue();
        bVar.getClass();
        com.yandex.plus.log.api.b bVar2 = bVar.o;
        String str = bVar.p;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar2.b(aVar)) {
            bVar2.c(aVar, str, "onDestroyView()");
        }
        bVar.c();
    }

    @Override // defpackage.p9
    public final void B(Object obj) {
        ((com.yandex.plus.bdui.flex.ui.b) this.c.getValue()).b((jso) obj);
    }

    @Override // defpackage.tro
    public final ViewGroup G(View view) {
        j jVar = ((com.yandex.plus.bdui.flex.ui.b) this.c.getValue()).r;
        if (jVar == null) {
            xq0.x("Failed requirement.");
            return null;
        }
        if (!view.equals((com.yandex.plus.bdui.flex.utils.c) jVar.a)) {
            xq0.x("Failed requirement.");
            return null;
        }
        View view2 = (View) jVar.b;
        e eVar = this.b;
        eVar.getClass();
        view2.getClass();
        com.yandex.plus.bdui.plus.scaffold.controller.b bVar = eVar.f;
        if (bVar == null) {
            xq0.x("Failed requirement.");
            return null;
        }
        if (view2.equals(bVar.a)) {
            return bVar.b;
        }
        xq0.x("Failed requirement.");
        return null;
    }

    @Override // defpackage.p9
    public final View z(ViewGroup viewGroup) {
        viewGroup.getClass();
        return ((com.yandex.plus.bdui.flex.ui.b) this.c.getValue()).a(viewGroup);
    }
}
