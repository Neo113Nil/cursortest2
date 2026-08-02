package com.yandex.plus.divkit.impl;

import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.dv8;
import defpackage.f1d;
import defpackage.ff9;
import defpackage.gc8;
import defpackage.jf9;
import defpackage.ouj;
import defpackage.pm9;
import defpackage.x97;
import defpackage.xq0;
import defpackage.xzb;
import defpackage.yu8;
import java.util.Map;

/* loaded from: classes4.dex */
public final class e implements dv8 {
    public final Map b;
    public final com.yandex.plus.log.api.b c;

    public e(Map map, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.b = map;
        this.c = bVar;
    }

    @Override // defpackage.dv8
    public final jf9 a(yu8 yu8Var, ff9 ff9Var) {
        String str = yu8Var.j;
        ff9Var.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivCustomContainerViewAdapterImpl", ouj.k(')', "preload(", str));
        }
        if (((com.yandex.plus.divkit.api.d) this.b.get(str)) != null) {
            str.getClass();
            return new d();
        }
        xq0.x(f1d.g("preload() failed: unknown custom type: ", str));
        return null;
    }

    @Override // defpackage.dv8
    public final boolean b(String str) {
        str.getClass();
        return this.b.containsKey(str);
    }

    @Override // defpackage.dv8
    public final View c(yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        String str = yu8Var.j;
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivCustomContainerViewAdapterImpl", ouj.k(')', "createView(", str));
        }
        com.yandex.plus.divkit.api.d dVar = (com.yandex.plus.divkit.api.d) this.b.get(str);
        if (dVar == null) {
            xq0.x(f1d.g("createView() failed: unknown custom type: ", str));
            return null;
        }
        if (yu8Var.q != null) {
            gc8Var.getCustomContainerChildFactory$div_release();
        }
        return ((com.yandex.plus.bdui.plus.checkout.div.c) dVar).a(new com.yandex.plus.divkit.api.c(str, yu8Var.i), u.K(xzbVar, bVar, "DivCustomContainerViewAdapterImpl"), gc8Var);
    }

    @Override // defpackage.dv8
    public final void d(View view, yu8 yu8Var) {
        String str = yu8Var.j;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivCustomContainerViewAdapterImpl", ouj.k(')', "release(", str));
        }
        com.yandex.plus.divkit.api.d dVar = (com.yandex.plus.divkit.api.d) this.b.get(str);
        if (dVar == null) {
            return;
        }
        str.getClass();
        com.yandex.plus.bdui.plus.analytics.b.d(((com.yandex.plus.bdui.plus.checkout.div.c) dVar).f);
    }

    @Override // defpackage.dv8
    public final void e(View view, yu8 yu8Var, gc8 gc8Var, xzb xzbVar, pm9 pm9Var) {
        String str = yu8Var.j;
        view.getClass();
        xzbVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "DivCustomContainerViewAdapterImpl", ouj.k(')', "bindView(", str));
        }
        com.yandex.plus.divkit.api.d dVar = (com.yandex.plus.divkit.api.d) this.b.get(str);
        if (dVar == null) {
            xq0.x(f1d.g("bindView() failed: unknown custom type: ", str));
            return;
        }
        if (yu8Var.q != null) {
            gc8Var.getCustomContainerChildFactory$div_release();
        }
        com.yandex.plus.bdui.plus.checkout.div.c cVar = (com.yandex.plus.bdui.plus.checkout.div.c) dVar;
        x97.y(cVar.f, null, null, new com.yandex.plus.bdui.plus.checkout.div.b(view, cVar, new com.yandex.plus.divkit.api.c(str, yu8Var.i), u.K(xzbVar, bVar, "DivCustomContainerViewAdapterImpl"), null), 3);
    }
}
