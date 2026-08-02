package defpackage;

import com.ybsdk.di.modules.features.f;
import com.ybsdk.di.modules.features.g;
import com.ybsdk.feature.dashboard.internal.domain.interactor.a;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Params;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.d;

/* loaded from: classes3.dex */
public final class umg implements smg {
    public final pzf a;

    public umg(pzf pzfVar) {
        this.a = pzfVar;
    }

    public final d a(DashboardV3Params dashboardV3Params, zlg zlgVar) {
        pzf pzfVar = this.a;
        a aVar = (a) ((f2b) pzfVar.e).get();
        j3h j3hVar = (j3h) ((ayf) pzfVar.f).get();
        rkg rkgVar = (rkg) ((oxf) pzfVar.g).get();
        g gVar = (g) ((ayf) pzfVar.h).get();
        com.ybsdk.feature.banners.impl.domain.interactors.a aVar2 = (com.ybsdk.feature.banners.impl.domain.interactors.a) ((srb) pzfVar.a).get();
        f fVar = (f) ((ayf) pzfVar.c).get();
        dlg dlgVar = (dlg) ((ayf) pzfVar.d).get();
        ((kk) pzfVar.i).get();
        return new d(dashboardV3Params, zlgVar, aVar, j3hVar, rkgVar, gVar, aVar2, fVar, dlgVar, (mkg) ((oxf) pzfVar.j).get(), (psp0) ((ayf) pzfVar.k).get(), (clg) ((ayf) pzfVar.l).get(), (tpr) ((ayf) pzfVar.m).get(), (xmg) ((ncb) pzfVar.b).get());
    }
}
