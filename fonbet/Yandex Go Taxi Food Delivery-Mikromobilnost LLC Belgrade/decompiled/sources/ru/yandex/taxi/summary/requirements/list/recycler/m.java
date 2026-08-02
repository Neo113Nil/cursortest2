package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.apj0;
import defpackage.cjw0;
import defpackage.gij0;
import defpackage.hij0;
import defpackage.i3y;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.lys;
import defpackage.m7x0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.pav;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.v891;
import defpackage.xng0;
import defpackage.xw31;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.m;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class m extends lys {
    public static final /* synthetic */ int Z = 0;
    public final pav S;
    public final k7x0 T;
    public final i3y U;
    public final i3y V;
    public hij0 W;

    public m(ListItemWithBadgeComponent listItemWithBadgeComponent, pav pavVar, k7x0 k7x0Var) {
        super(listItemWithBadgeComponent);
        this.S = pavVar;
        this.T = k7x0Var;
        final int i = 0;
        this.U = kotlin.a.a(new sls(this) { // from class: elz0
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                m mVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, mVar.a));
                    default:
                        return Integer.valueOf(c.h(8, mVar.a));
                }
            }
        });
        final int i2 = 1;
        this.V = kotlin.a.a(new sls(this) { // from class: elz0
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                m mVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, mVar.a));
                    default:
                        return Integer.valueOf(c.h(8, mVar.a));
                }
            }
        });
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        hij0 hij0Var = this.W;
        if (hij0Var != null) {
            c0(hij0Var);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        hij0 hij0Var = (hij0) obj;
        this.W = hij0Var;
        Object obj2 = this.R;
        View view = (View) obj2;
        ListItemWithBadgeComponent listItemWithBadgeComponent = (ListItemWithBadgeComponent) view;
        apj0 apj0Var = hij0Var.a;
        boolean z = hij0Var.e;
        listItemWithBadgeComponent.setTitle(apj0Var.b);
        apj0 apj0Var2 = hij0Var.a;
        listItemWithBadgeComponent.setSubtitle(apj0Var2.c);
        String str = apj0Var2.d;
        if (str != null) {
            nac nacVar = (nac) this.S.a(listItemWithBadgeComponent.getLeadImageView());
            nacVar.i = new ToggleV2RequirementViewHolder$bind$imageLoadTask$1(0, (View) obj2, ListItemWithBadgeComponent.class, "clearLeadView", "clearLeadView()V", 0);
            a0(nacVar.c(((m7x0) this.T).a(str)));
        } else {
            listItemWithBadgeComponent.clearLeadView();
        }
        d0(hij0Var);
        listItemWithBadgeComponent.initToggle();
        e0(hij0Var, false);
        listItemWithBadgeComponent.setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        c0(hij0Var);
        boolean z2 = hij0Var.d;
        i3y i3yVar = this.V;
        xw31.E(view, null, Integer.valueOf(z2 ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(z ? ((Number) i3yVar.getValue()).intValue() : 0));
    }

    public final void c0(hij0 hij0Var) {
        View view = (View) this.R;
        boolean z = hij0Var.d;
        i3y i3yVar = this.U;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = hij0Var.e ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }

    public final void d0(hij0 hij0Var) {
        cjw0 cjw0Var = hij0Var.b;
        cjw0 cjw0Var2 = hij0Var.b;
        View view = (View) this.R;
        if (cjw0Var == null) {
            if (((ListItemWithBadgeComponent) view).hasTitleBadge()) {
                ((ListItemWithBadgeComponent) view).getTitleBadge().setVisibility(8);
                return;
            }
            return;
        }
        BadgeView titleBadge = ((ListItemWithBadgeComponent) view).getTitleBadge();
        titleBadge.setVisibility(0);
        titleBadge.setText((String) cjw0Var2.a);
        kdc kdcVar = (kdc) cjw0Var2.b;
        kdc kdcVar2 = (kdc) cjw0Var2.c;
        if (kdcVar2 == null || kdcVar == null) {
            return;
        }
        titleBadge.setTextColor(s8o.m(kdcVar, titleBadge.getContext()));
        titleBadge.setTintColor(s8o.m(kdcVar2, titleBadge.getContext()));
        ((ListItemWithBadgeComponent) view).setTitleBadgeWithBottomShadow(s8o.m(kdcVar2, titleBadge.getContext()), tje.r(mrg0.go_design_m_space, titleBadge.getContext()), tje.u(4, titleBadge.getContext()));
    }

    public final void e0(hij0 hij0Var, boolean z) {
        View view = (View) this.R;
        gij0 gij0Var = hij0Var.c;
        apj0 apj0Var = hij0Var.a;
        if (gij0Var != null) {
            ((ListItemWithBadgeComponent) view).setTrackColors(gij0Var.b, gij0Var.a);
        }
        if (z) {
            ((ListItemWithBadgeComponent) view).setCheckedWithAnimation(apj0Var.e);
        } else {
            ((ListItemWithBadgeComponent) view).setChecked(apj0Var.e);
        }
    }
}
