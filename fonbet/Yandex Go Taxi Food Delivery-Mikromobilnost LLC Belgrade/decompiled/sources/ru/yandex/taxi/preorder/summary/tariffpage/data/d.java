package ru.yandex.taxi.preorder.summary.tariffpage.data;

import android.widget.LinearLayout;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.dkx0;
import defpackage.hbp0;
import defpackage.lb6;
import defpackage.p370;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.tt2;
import defpackage.wl4;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class d {
    public final LinearLayout a;
    public final pav b;
    public final ru.yandex.taxi.widget.c c;
    public final dkx0 d;
    public final com.yandex.go.taxi.summary.shared.expanded.repository.c e;
    public final List f;
    public final tt2 g;
    public final p370 h;
    public final pwy0 i;
    public final hbp0 j = new hbp0(new czo0(14), "", null);
    public final r0 k = bvf0.c(0);

    public d(LinearLayout linearLayout, pav pavVar, ru.yandex.taxi.widget.c cVar, dkx0 dkx0Var, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar2, List list, tt2 tt2Var, p370 p370Var, pwy0 pwy0Var) {
        this.a = linearLayout;
        this.b = pavVar;
        this.c = cVar;
        this.d = dkx0Var;
        this.e = cVar2;
        this.f = list;
        this.g = tt2Var;
        this.h = p370Var;
        this.i = pwy0Var;
    }

    public final void a(lb6 lb6Var) {
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new BadgesViewHolderDelegate$attach$1(this, lb6Var, null), 3);
        hbp0.e(hbp0Var, null, null, new BadgesViewHolderDelegate$attach$2(this, null), 3);
    }

    public final void b(LinearLayout linearLayout, List list) {
        if (list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        while (list.size() < linearLayout.getChildCount()) {
            b bVar = (b) linearLayout.getChildAt(linearLayout.getChildCount() - 1).getTag();
            bVar.g.cancel();
            bVar.h.b();
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((b) linearLayout.getChildAt(i).getTag()).a((wl4) list.get(i));
        }
        int size = list.size();
        for (int childCount2 = linearLayout.getChildCount(); childCount2 < size; childCount2++) {
            b bVar2 = new b(linearLayout, this.b, this.c, this.h);
            linearLayout.addView(bVar2.d);
            bVar2.a((wl4) list.get(childCount2));
        }
    }
}
