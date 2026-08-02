package ru.yandex.taxi.preorder.summary.tariffpage.data.sourcedestination;

import android.view.ViewGroup;
import defpackage.c1x0;
import defpackage.hbp0;
import defpackage.n0l0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.xev0;
import defpackage.zev0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.design.SourceDestinationComponent;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ d a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ tpr w;

    public a(d dVar, ViewGroup viewGroup, ViewGroup viewGroup2, tpr tprVar) {
        this.a = dVar;
        this.b = viewGroup;
        this.c = viewGroup2;
        this.w = tprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        d dVar = this.a;
        dVar.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.c;
        viewGroup2.removeAllViews();
        viewGroup2.setVisibility(8);
        boolean z = ((zev0) obj) instanceof xev0;
        n0l0 n0l0Var = dVar.b;
        if (z) {
            hbp0 hbp0Var = n0l0Var.g;
            if (!n0l0Var.h) {
                n0l0Var.h = true;
                hbp0Var.a();
                tje.N(hbp0Var.c(), null, null, new RouteBlockDelegate$attach$1(n0l0Var, this.w, viewGroup, null), 3);
                tje.N(hbp0Var.c(), null, null, new RouteBlockDelegate$attach$2(n0l0Var, null), 3);
            }
            c1x0 c1x0Var = dVar.c;
            if (c1x0Var != null) {
                ((ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e) c1x0Var.a).e0.setVisibility(0);
            }
        } else {
            if (n0l0Var.h) {
                n0l0Var.h = false;
                SourceDestinationComponent sourceDestinationComponent = n0l0Var.j;
                if (sourceDestinationComponent != null) {
                    sourceDestinationComponent.setSourceTrailClickListener(null);
                    sourceDestinationComponent.setDestinationTrailClickListener(null);
                    sourceDestinationComponent.setSourceDestinationListener(null);
                }
                n0l0Var.g.b();
            }
            c1x0 c1x0Var2 = dVar.c;
            if (c1x0Var2 != null) {
                ((ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e) c1x0Var2.a).e0.setVisibility(8);
            }
        }
        return zy11.a;
    }
}
