package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.xmx0;
import kotlin.a;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.summary.requirements.list.recycler.k;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class xmx0 extends lys {
    public static final /* synthetic */ int b0 = 0;
    public final pav S;
    public final qmx0 T;
    public final tls U;
    public final i3y V;
    public final i3y W;
    public final k Z;
    public dij0 a0;

    public xmx0(ListItemComponent listItemComponent, pav pavVar, qmx0 qmx0Var, tls tlsVar) {
        super(listItemComponent);
        this.S = pavVar;
        this.T = qmx0Var;
        this.U = tlsVar;
        final int i = 0;
        this.V = a.a(new sls(this) { // from class: vmx0
            public final /* synthetic */ xmx0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                xmx0 xmx0Var = this.b;
                switch (i2) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, xmx0Var.a));
                    default:
                        return Integer.valueOf(c.h(8, xmx0Var.a));
                }
            }
        });
        final int i2 = 1;
        this.W = a.a(new sls(this) { // from class: vmx0
            public final /* synthetic */ xmx0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                xmx0 xmx0Var = this.b;
                switch (i22) {
                    case 0:
                        return Float.valueOf(c.d(usg0.toggle_buttons_corner_radius, xmx0Var.a));
                    default:
                        return Integer.valueOf(c.h(8, xmx0Var.a));
                }
            }
        });
        this.Z = new k(this, i);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        ((ListItemComponent) ((View) this.R)).getViewTreeObserver().removeOnDrawListener(this.Z);
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        dij0 dij0Var = this.a0;
        if (dij0Var != null) {
            d0(dij0Var);
            e0(dij0Var);
            c0(dij0Var);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        dij0 dij0Var = (dij0) obj;
        this.a0 = dij0Var;
        View view = (View) this.R;
        ListItemComponent listItemComponent = (ListItemComponent) view;
        listItemComponent.setTitle(dij0Var.a.a);
        listItemComponent.setSubtitle(dij0Var.a.b);
        d0(dij0Var);
        e0(dij0Var);
        ViewTreeObserver viewTreeObserver = listItemComponent.getViewTreeObserver();
        k kVar = this.Z;
        viewTreeObserver.removeOnDrawListener(kVar);
        boolean z = dij0Var.c;
        if (z) {
            listItemComponent.getViewTreeObserver().addOnDrawListener(kVar);
        }
        listItemComponent.setDividers(z ? DividerPosition.NONE : DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
        c0(dij0Var);
        boolean z2 = dij0Var.b;
        i3y i3yVar = this.W;
        xw31.E(view, null, Integer.valueOf(z2 ? ((Number) i3yVar.getValue()).intValue() : 0), null, Integer.valueOf(z ? ((Number) i3yVar.getValue()).intValue() : 0));
    }

    public final void c0(dij0 dij0Var) {
        View view = (View) this.R;
        boolean z = dij0Var.b;
        i3y i3yVar = this.V;
        float floatValue = z ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        float floatValue2 = dij0Var.c ? ((Number) i3yVar.getValue()).floatValue() : 0.0f;
        v891.h((ListItemComponent) view, c.c(xng0.bgMinor, view), floatValue, floatValue, floatValue2, floatValue2);
    }

    public final void d0(dij0 dij0Var) {
        View view = (View) this.R;
        String str = dij0Var.a.c;
        if (str == null || str.length() == 0) {
            ((ListItemComponent) view).getLeadImageView().setImageDrawable(null);
        } else {
            a0(((nac) this.S.a(((ListItemComponent) view).getLeadImageView())).c(str));
        }
    }

    public final void e0(dij0 dij0Var) {
        final zmx0 zmx0Var = dij0Var.a.e;
        boolean z = zmx0Var instanceof zmx0;
        View view = (View) this.R;
        if (z) {
            ListItemComponent listItemComponent = (ListItemComponent) view;
            listItemComponent.setTrailMode(2);
            listItemComponent.setOnClickListener(new View.OnClickListener() { // from class: ru.yandex.taxi.summary.requirements.list.recycler.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ((RequirementItemsExternalDelegate$createItemTypes$3) xmx0.this.U).invoke(zmx0Var.a);
                }
            });
        } else {
            ListItemComponent listItemComponent2 = (ListItemComponent) view;
            listItemComponent2.setTrailMode(0);
            listItemComponent2.setOnClickListener(null);
        }
    }
}
