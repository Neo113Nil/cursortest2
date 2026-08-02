package ru.yandex.taxi.summary.requirements.list.recycler;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.apj0;
import defpackage.i3y;
import defpackage.jij0;
import defpackage.k7x0;
import defpackage.lys;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.pav;
import defpackage.sls;
import defpackage.v891;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xoj0;
import defpackage.xw31;
import defpackage.yoj0;
import defpackage.zoj0;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.p;
import ru.yandex.taxi.summary.requirements.list.ui.RequirementCounterView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class p extends lys {
    public static final /* synthetic */ int b0 = 0;
    public final pav S;
    public final k7x0 T;
    public final i3y U;
    public final i3y V;
    public final i3y W;
    public jij0 Z;
    public final i3y a0;

    public p(ListItemComponent listItemComponent, pav pavVar, k7x0 k7x0Var) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = k7x0Var;
        final int i = 0;
        this.U = kotlin.a.a(new sls(this) { // from class: wv21
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                p pVar = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, pVar.a));
                    case 1:
                        return Integer.valueOf(c.h(8, pVar.a));
                    case 2:
                        return new RequirementCounterView(pVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(pVar.a.getContext());
                        linearLayout.setOrientation(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        int r = tje.r(mrg0.go_design_m_space, linearLayout.getContext());
                        marginLayoutParams.setMarginStart(r);
                        marginLayoutParams.setMarginEnd(r);
                        linearLayout.setGravity(17);
                        linearLayout.setLayoutParams(marginLayoutParams);
                        ImageView imageView = new ImageView(linearLayout.getContext());
                        imageView.setImageDrawable(vng.t(ListItemComponent.DEFAULT_NAVIGATION_ICON, imageView.getContext()));
                        xw31.J(imageView, Integer.valueOf(tje.r(mrg0.go_design_m_space, imageView.getContext())), null, null, null);
                        linearLayout.addView((RequirementCounterView) pVar.W.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
        final int i2 = 1;
        this.V = kotlin.a.a(new sls(this) { // from class: wv21
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                p pVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, pVar.a));
                    case 1:
                        return Integer.valueOf(c.h(8, pVar.a));
                    case 2:
                        return new RequirementCounterView(pVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(pVar.a.getContext());
                        linearLayout.setOrientation(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        int r = tje.r(mrg0.go_design_m_space, linearLayout.getContext());
                        marginLayoutParams.setMarginStart(r);
                        marginLayoutParams.setMarginEnd(r);
                        linearLayout.setGravity(17);
                        linearLayout.setLayoutParams(marginLayoutParams);
                        ImageView imageView = new ImageView(linearLayout.getContext());
                        imageView.setImageDrawable(vng.t(ListItemComponent.DEFAULT_NAVIGATION_ICON, imageView.getContext()));
                        xw31.J(imageView, Integer.valueOf(tje.r(mrg0.go_design_m_space, imageView.getContext())), null, null, null);
                        linearLayout.addView((RequirementCounterView) pVar.W.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
        final int i3 = 2;
        this.W = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: wv21
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                p pVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, pVar.a));
                    case 1:
                        return Integer.valueOf(c.h(8, pVar.a));
                    case 2:
                        return new RequirementCounterView(pVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(pVar.a.getContext());
                        linearLayout.setOrientation(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        int r = tje.r(mrg0.go_design_m_space, linearLayout.getContext());
                        marginLayoutParams.setMarginStart(r);
                        marginLayoutParams.setMarginEnd(r);
                        linearLayout.setGravity(17);
                        linearLayout.setLayoutParams(marginLayoutParams);
                        ImageView imageView = new ImageView(linearLayout.getContext());
                        imageView.setImageDrawable(vng.t(ListItemComponent.DEFAULT_NAVIGATION_ICON, imageView.getContext()));
                        xw31.J(imageView, Integer.valueOf(tje.r(mrg0.go_design_m_space, imageView.getContext())), null, null, null);
                        linearLayout.addView((RequirementCounterView) pVar.W.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
        final int i4 = 3;
        this.a0 = kotlin.a.a(new sls(this) { // from class: wv21
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                p pVar = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, pVar.a));
                    case 1:
                        return Integer.valueOf(c.h(8, pVar.a));
                    case 2:
                        return new RequirementCounterView(pVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(pVar.a.getContext());
                        linearLayout.setOrientation(0);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        int r = tje.r(mrg0.go_design_m_space, linearLayout.getContext());
                        marginLayoutParams.setMarginStart(r);
                        marginLayoutParams.setMarginEnd(r);
                        linearLayout.setGravity(17);
                        linearLayout.setLayoutParams(marginLayoutParams);
                        ImageView imageView = new ImageView(linearLayout.getContext());
                        imageView.setImageDrawable(vng.t(ListItemComponent.DEFAULT_NAVIGATION_ICON, imageView.getContext()));
                        xw31.J(imageView, Integer.valueOf(tje.r(mrg0.go_design_m_space, imageView.getContext())), null, null, null);
                        linearLayout.addView((RequirementCounterView) pVar.W.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        jij0 jij0Var = this.Z;
        if (jij0Var != null) {
            d0(jij0Var);
            c0(jij0Var);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        jij0 jij0Var = (jij0) obj;
        this.Z = jij0Var;
        View view = (View) this.R;
        ListItemComponent listItemComponent = (ListItemComponent) view;
        apj0 apj0Var = jij0Var.a;
        boolean z = jij0Var.c;
        listItemComponent.setTitle(apj0Var.b);
        apj0 apj0Var2 = jij0Var.a;
        listItemComponent.setSubtitle(apj0Var2.c);
        d0(jij0Var);
        zoj0 zoj0Var = apj0Var2.i;
        boolean z2 = zoj0Var instanceof yoj0;
        pav pavVar = this.S;
        if (z2) {
            listItemComponent.setTrailCompanionMode(1);
            ((nac) pavVar.a(listItemComponent.getTrailCompanionImageView())).c(((yoj0) zoj0Var).a);
        } else if (zoj0Var instanceof xoj0) {
            ((RequirementCounterView) this.W.getValue()).render(((xoj0) zoj0Var).a);
            listItemComponent.setTrailCompanionImage((Drawable) null);
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.setTrailView((LinearLayout) this.a0.getValue());
            v891.g(listItemComponent, apj0Var2);
        } else {
            if (!zoj0Var.equals(vvb1.N)) {
                w511.b();
                return;
            }
            listItemComponent.setTrailMode(2);
            pavVar.c(listItemComponent.getTrailCompanionImageView());
            listItemComponent.setContentDescription(apj0Var2.b + " " + apj0Var2.c);
        }
        listItemComponent.setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        c0(jij0Var);
        boolean z3 = jij0Var.b;
        i3y i3yVar = this.V;
        xw31.E(view, null, Integer.valueOf(z3 ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(z ? ((Number) i3yVar.getValue()).intValue() : 0));
    }

    public final void c0(jij0 jij0Var) {
        View view = (View) this.R;
        boolean z = jij0Var.b;
        i3y i3yVar = this.U;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = jij0Var.c ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, ru.yandex.taxi.design.utils.c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }

    public final void d0(jij0 jij0Var) {
        Object obj = this.R;
        View view = (View) obj;
        if (jij0Var.a.d == null) {
            ((ListItemComponent) view).clearLeadView();
            return;
        }
        nac nacVar = (nac) this.S.a(((ListItemComponent) view).getLeadImageView());
        nacVar.i = new UsualV2RequirementViewHolder$bindLead$imageLoadTask$1(0, (View) obj, ListItemComponent.class, "clearLeadView", "clearLeadView()V", 0);
        a0(nacVar.c(((m7x0) this.T).a(jij0Var.a.d)));
    }
}
