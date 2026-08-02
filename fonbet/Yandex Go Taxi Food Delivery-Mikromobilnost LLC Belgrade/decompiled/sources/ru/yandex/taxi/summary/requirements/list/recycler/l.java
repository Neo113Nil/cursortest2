package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.apj0;
import defpackage.cjw0;
import defpackage.gij0;
import defpackage.hij0;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.lys;
import defpackage.m7x0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.pav;
import defpackage.s8o;
import defpackage.tje;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemWithBadgeComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes6.dex */
public final class l extends lys {
    public static final /* synthetic */ int U = 0;
    public final pav S;
    public final k7x0 T;

    public l(ListItemWithBadgeComponent listItemWithBadgeComponent, pav pavVar, k7x0 k7x0Var) {
        super(listItemWithBadgeComponent);
        this.S = pavVar;
        this.T = k7x0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        hij0 hij0Var = (hij0) obj;
        Object obj2 = this.R;
        ListItemWithBadgeComponent listItemWithBadgeComponent = (ListItemWithBadgeComponent) ((View) obj2);
        listItemWithBadgeComponent.setTitle(hij0Var.a.b);
        apj0 apj0Var = hij0Var.a;
        listItemWithBadgeComponent.setSubtitle(apj0Var.c);
        String str = apj0Var.d;
        if (str != null) {
            nac nacVar = (nac) this.S.a(listItemWithBadgeComponent.getLeadImageView());
            nacVar.i = new ToggleRequirementViewHolder$bind$imageLoadTask$1(0, (View) obj2, ListItemWithBadgeComponent.class, "clearLeadView", "clearLeadView()V", 0);
            a0(nacVar.c(((m7x0) this.T).a(str)));
        } else {
            listItemWithBadgeComponent.clearLeadView();
        }
        c0(hij0Var);
        listItemWithBadgeComponent.initToggle();
        d0(hij0Var, false);
        listItemWithBadgeComponent.setDividers(hij0Var.e ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
    }

    public final void c0(hij0 hij0Var) {
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
        ((ListItemWithBadgeComponent) view).setTitleBadgeWithBottomShadow(s8o.m(kdcVar2, titleBadge.getContext()), tje.r(mrg0.go_design_m_space, titleBadge.getContext()), ru.yandex.taxi.design.utils.c.h(4, this.a));
    }

    public final void d0(hij0 hij0Var, boolean z) {
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
