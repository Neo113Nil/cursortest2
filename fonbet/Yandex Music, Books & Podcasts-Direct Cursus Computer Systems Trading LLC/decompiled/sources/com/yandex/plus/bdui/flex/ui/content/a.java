package com.yandex.plus.bdui.flex.ui.content;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.ui.bouncer.o;
import com.yandex.plus.bdui.plus.content.j;
import defpackage.ee6;
import defpackage.kb6;
import defpackage.pe7;
import defpackage.r7b;
import defpackage.t5a;
import defpackage.ub6;
import defpackage.x97;

/* loaded from: classes4.dex */
public final class a extends ub6 {
    public final r7b b;
    public final com.yandex.plus.bdui.flex.utils.b c;
    public final o d;
    public final c e;
    public com.yandex.plus.bdui.ui.a f;

    public a(r7b r7bVar, com.yandex.plus.bdui.flex.utils.b bVar, o oVar, c cVar) {
        r7bVar.getClass();
        this.b = r7bVar;
        this.c = bVar;
        this.d = oVar;
        this.e = cVar;
    }

    @Override // defpackage.p9
    public final void A(View view) {
        view.getClass();
        com.yandex.plus.bdui.ui.a aVar = this.f;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f = null;
    }

    @Override // defpackage.p9
    public final void B(Object obj) {
        ee6 ee6Var = (ee6) obj;
        kb6 kb6Var = ee6Var.c;
        kb6Var.getClass();
        pe7 pe7Var = (pe7) kb6Var;
        IllegalStateException illegalStateException = new IllegalStateException("Can not parse content with error: " + pe7Var.a + "\n\nDetails: " + pe7Var.b);
        t5a t5aVar = ee6Var.b;
        com.yandex.plus.bdui.content.d dVar = new com.yandex.plus.bdui.content.d(t5aVar != null ? com.yandex.plus.bdui.flex.utils.b.i(t5aVar) : null, (j) this.e.invoke(new com.yandex.plus.bdui.failure.c(illegalStateException)), this.c.j(ee6Var.d), ee6Var.e);
        com.yandex.plus.bdui.ui.a aVar = this.f;
        if (aVar != null) {
            x97.D(kotlin.coroutines.g.a, new com.yandex.plus.bdui.ui.b(aVar, dVar, null, 0));
        }
    }

    @Override // defpackage.p9
    public final View z(ViewGroup viewGroup) {
        viewGroup.getClass();
        com.yandex.plus.bdui.ui.a aVar = (com.yandex.plus.bdui.ui.a) this.d.invoke(this.c.e(this.b));
        aVar.getClass();
        this.f = aVar;
        return aVar.b(viewGroup);
    }
}
