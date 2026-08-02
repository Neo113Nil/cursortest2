package defpackage;

import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.OrganizationCardPageView;

/* loaded from: classes13.dex */
public final class xg80 extends xwy0 {
    public final OrganizationCardPageView O;
    public final rg80 P;

    static {
        int i = OrganizationCardPageView.$stable;
    }

    public xg80(OrganizationCardPageView organizationCardPageView, rg80 rg80Var) {
        super(organizationCardPageView);
        this.O = organizationCardPageView;
        this.P = rg80Var;
        organizationCardPageView.attachFlexContent(rg80Var.b.a);
    }
}
