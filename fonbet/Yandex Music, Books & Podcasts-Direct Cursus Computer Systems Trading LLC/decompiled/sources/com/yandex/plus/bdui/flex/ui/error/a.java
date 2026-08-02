package com.yandex.plus.bdui.flex.ui.error;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.yandex.plus.bdui.content.d;
import com.yandex.plus.bdui.flex.ui.content.c;
import com.yandex.plus.bdui.flex.utils.b;
import com.yandex.plus.bdui.plus.content.j;
import defpackage.p9;
import defpackage.ps;
import defpackage.w3a;
import defpackage.x97;
import kotlin.coroutines.g;

/* loaded from: classes4.dex */
public final class a extends p9 {
    public final ps b;
    public final com.yandex.plus.bdui.ui.a c;
    public final c d;

    public a(b bVar, ps psVar, com.yandex.plus.bdui.ui.a aVar, c cVar) {
        aVar.getClass();
        this.b = psVar;
        this.c = aVar;
        this.d = cVar;
    }

    @Override // defpackage.p9
    public final void A(View view) {
        view.getClass();
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return;
        }
        this.c.a(view);
    }

    @Override // defpackage.p9
    public final void B(Object obj) {
        throw null;
    }

    public final void G(w3a w3aVar) {
        if (((Boolean) this.b.invoke()).booleanValue()) {
            return;
        }
        d dVar = new d(null, (j) this.d.invoke(new com.yandex.plus.bdui.failure.b(w3aVar.a, w3aVar.b)), com.yandex.plus.bdui.shared.b.a, false);
        com.yandex.plus.bdui.ui.a aVar = this.c;
        aVar.getClass();
        x97.D(g.a, new com.yandex.plus.bdui.ui.b(aVar, dVar, null, 0));
    }

    @Override // defpackage.p9
    public final View z(ViewGroup viewGroup) {
        viewGroup.getClass();
        return ((Boolean) this.b.invoke()).booleanValue() ? new Space(viewGroup.getContext()) : this.c.b(viewGroup);
    }
}
