package defpackage;

import com.yandex.go.places.analytics.organization.card.a;
import com.yandex.go.places.organization.card.impl.domain.entities.card.OrganizationCardPageLoadingState;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.g;

/* loaded from: classes13.dex */
public final class vh80 implements r7c0 {
    public final /* synthetic */ g a;
    public final /* synthetic */ rg80 b;

    public vh80(g gVar, rg80 rg80Var) {
        this.a = gVar;
        this.b = rg80Var;
    }

    @Override // defpackage.r7c0
    public final void a() {
        ((nh80) this.a.Dg()).yd(this.b, OrganizationCardPageLoadingState.CONTENT_LOADED);
    }

    @Override // defpackage.r7c0
    public final void b() {
        g gVar = this.a;
        m9c0 m9c0Var = gVar.I;
        int i = m9c0Var.d + 1;
        m9c0Var.d = i;
        if (i == 3) {
            fva0.b(m9c0Var.a, "Places.FlexOrganizationCard.Shown", null, null, 6);
        }
        ((nh80) gVar.Dg()).Va();
    }

    @Override // defpackage.r7c0
    public final void c() {
        g gVar = this.a;
        a aVar = gVar.H;
        ne80 ne80Var = gVar.a0;
        aVar.n(ne80Var.a, ne80Var.b);
        ((nh80) gVar.Dg()).yd(this.b, OrganizationCardPageLoadingState.FAILED);
    }

    @Override // defpackage.r7c0
    public final void d() {
        ((nh80) this.a.Dg()).yd(this.b, OrganizationCardPageLoadingState.LOADING);
    }
}
