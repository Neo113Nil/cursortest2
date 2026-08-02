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
import defpackage.xoj0;
import defpackage.yoj0;
import defpackage.zoj0;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.summary.requirements.list.recycler.o;
import ru.yandex.taxi.summary.requirements.list.ui.RequirementCounterView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class o extends lys {
    public static final /* synthetic */ int Z = 0;
    public final pav S;
    public final k7x0 T;
    public final i3y U;
    public jij0 V;
    public final i3y W;

    public o(ListItemComponent listItemComponent, pav pavVar, k7x0 k7x0Var) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = k7x0Var;
        final int i = 0;
        this.U = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: tv21
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                o oVar = this.b;
                switch (i2) {
                    case 0:
                        return new RequirementCounterView(oVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(oVar.a.getContext());
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
                        linearLayout.addView((RequirementCounterView) oVar.U.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
        final int i2 = 1;
        this.W = kotlin.a.a(new sls(this) { // from class: tv21
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                o oVar = this.b;
                switch (i22) {
                    case 0:
                        return new RequirementCounterView(oVar.a.getContext(), null, 0, 6, null);
                    default:
                        LinearLayout linearLayout = new LinearLayout(oVar.a.getContext());
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
                        linearLayout.addView((RequirementCounterView) oVar.U.getValue(), -2, -2);
                        linearLayout.addView(imageView);
                        return linearLayout;
                }
            }
        });
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        jij0 jij0Var = this.V;
        if (jij0Var != null) {
            c0(jij0Var);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        jij0 jij0Var = (jij0) obj;
        this.V = jij0Var;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        listItemComponent.setTitle(jij0Var.a.b);
        apj0 apj0Var = jij0Var.a;
        listItemComponent.setSubtitle(apj0Var.c);
        c0(jij0Var);
        zoj0 zoj0Var = apj0Var.i;
        boolean z = zoj0Var instanceof yoj0;
        pav pavVar = this.S;
        if (z) {
            listItemComponent.setTrailCompanionMode(1);
            ((nac) pavVar.a(listItemComponent.getTrailCompanionImageView())).c(((yoj0) zoj0Var).a);
        } else if (zoj0Var instanceof xoj0) {
            ((RequirementCounterView) this.U.getValue()).render(((xoj0) zoj0Var).a);
            listItemComponent.setTrailCompanionImage((Drawable) null);
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.setTrailView((LinearLayout) this.W.getValue());
            v891.g(listItemComponent, apj0Var);
        } else {
            if (!zoj0Var.equals(vvb1.N)) {
                w511.b();
                return;
            }
            listItemComponent.setTrailMode(2);
            pavVar.c(listItemComponent.getTrailCompanionImageView());
            listItemComponent.setContentDescription(apj0Var.b + " " + apj0Var.c);
        }
        listItemComponent.setDividers(jij0Var.c ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.MARGIN);
    }

    public final void c0(jij0 jij0Var) {
        Object obj = this.R;
        View view = (View) obj;
        if (jij0Var.a.d == null) {
            ((ListItemComponent) view).clearLeadView();
            return;
        }
        nac nacVar = (nac) this.S.a(((ListItemComponent) view).getLeadImageView());
        nacVar.i = new UsualRequirementViewHolder$bindLead$imageLoadTask$1(0, (View) obj, ListItemComponent.class, "clearLeadView", "clearLeadView()V", 0);
        a0(nacVar.c(((m7x0) this.T).a(jij0Var.a.d)));
    }
}
