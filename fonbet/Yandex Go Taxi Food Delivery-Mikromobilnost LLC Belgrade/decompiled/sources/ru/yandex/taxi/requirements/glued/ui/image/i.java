package ru.yandex.taxi.requirements.glued.ui.image;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.hbp0;
import defpackage.jgv;
import defpackage.kjj0;
import defpackage.l58;
import defpackage.lb30;
import defpackage.pav;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.wx31;
import defpackage.ybf;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class i {
    public final pav a;
    public final tt2 b;
    public final jgv c;
    public final x d;
    public final wx31 e;
    public final ImageView f;
    public final hbp0 g;
    public final r0 h;
    public final kjj0 i;
    public final a j;
    public ViewState k;
    public String l;
    public int m;
    public int n;
    public boolean o;
    public sls p;
    public sls q;

    public i(pav pavVar, tt2 tt2Var, jgv jgvVar, x xVar, wx31 wx31Var, ImageView imageView, RecyclerView recyclerView) {
        this.a = pavVar;
        this.b = tt2Var;
        this.c = jgvVar;
        this.d = xVar;
        this.e = wx31Var;
        this.f = imageView;
        String d = qoi0.a(i.class).d();
        this.g = new hbp0(new czo0(14), d == null ? "" : d, null);
        this.h = bvf0.c(new l58("", EmptyList.a));
        kjj0 kjj0Var = new kjj0(new ybf(21, this));
        this.i = kjj0Var;
        this.j = new a(imageView);
        this.k = ViewState.CAR;
        this.l = "";
        this.m = -1;
        this.n = -1;
        this.o = true;
        int i = 12;
        this.p = new bgc(i);
        this.q = new bgc(i);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(kjj0Var);
        lb30 lb30Var = new lb30();
        lb30Var.g = false;
        recyclerView.setItemAnimator(lb30Var);
    }

    public final void a() {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        r0 r0Var = this.h;
        tje.N(hbp0Var.c(), null, null, new DefaultCarImageBinder$attach$1(new e(kotlinx.coroutines.flow.e.t(new c(r0Var)), this), new g(kotlinx.coroutines.flow.e.t(new m0(r0Var, this.d.b(), new DefaultCarImageBinder$attach$optionImagesFlow$1(this, null))), this), this, null), 3);
    }
}
