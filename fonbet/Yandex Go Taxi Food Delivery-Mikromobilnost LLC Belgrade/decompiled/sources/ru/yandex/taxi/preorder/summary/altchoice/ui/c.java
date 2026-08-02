package ru.yandex.taxi.preorder.summary.altchoice.ui;

import android.view.ViewGroup;
import defpackage.caj0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.qoi0;
import defpackage.rqc;
import defpackage.saj0;
import defpackage.scc;
import defpackage.sqc;
import defpackage.taj0;
import defpackage.tje;
import defpackage.uaj0;
import defpackage.uxk0;
import defpackage.vxk0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;

/* loaded from: classes6.dex */
public final class c {
    public final ViewGroup a;
    public final rqc b;
    public final caj0 c;
    public final taj0 d;
    public final ArrayList e = new ArrayList();
    public final hbp0 f;

    public c(ViewGroup viewGroup, rqc rqcVar, caj0 caj0Var, taj0 taj0Var) {
        this.a = viewGroup;
        this.b = rqcVar;
        this.c = caj0Var;
        this.d = taj0Var;
        String d = qoi0.a(c.class).d();
        this.f = new hbp0(new czo0(14), d == null ? "" : d, null);
        b(EmptyList.a);
    }

    public final void a(com.yandex.go.taxi.summary.shared.expanded.repository.c cVar) {
        hbp0 hbp0Var = this.f;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new RequiredAltChoiceViewBinder$attach$1(this, cVar, null), 3);
    }

    public final void b(List list) {
        ViewGroup viewGroup = this.a;
        viewGroup.removeAllViews();
        int size = list.size();
        ArrayList arrayList = this.e;
        int size2 = size - arrayList.size();
        for (int i = 0; i < size2; i++) {
            arrayList.add(this.d.get());
        }
        int size3 = arrayList.size() - list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            arrayList.remove(scc.f(arrayList));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            viewGroup.addView(((uaj0) it.next()).a);
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            saj0 saj0Var = (saj0) obj;
            arrayList2.add(new uxk0(16, saj0Var.a != null, Collections.singletonList(((uaj0) arrayList.get(i3)).a)));
            ((uaj0) arrayList.get(i3)).a.update(saj0Var);
            i3 = i4;
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new uxk0(28, false, EmptyList.a));
        }
        rqc rqcVar = this.b;
        switch (rqcVar.a) {
            case 0:
                vxk0 vxk0Var = ((sqc) rqcVar.b).L0;
                vxk0Var.a(arrayList2);
                vxk0Var.b();
                return;
            default:
                vxk0 vxk0Var2 = ((f) rqcVar.b).R0;
                vxk0Var2.a(arrayList2);
                vxk0Var2.b();
                return;
        }
    }
}
