package defpackage;

import android.view.View;
import androidx.core.view.b;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class u421 extends lys {
    public static final /* synthetic */ int W = 0;
    public final tls S;
    public r421 T;
    public boolean U;
    public boolean V;

    public u421(ListItemComponent listItemComponent, tls tlsVar) {
        super(listItemComponent);
        this.S = tlsVar;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) this.R);
        nzs.s(listItemComponent2, -1, -2);
        listItemComponent2.setLeadImage(f1h0.ic_warning_octagon_24);
        ((ListItemComponent) ((View) this.R)).setTrailImage(c.k(dzg0.ic_cross_close, listItemComponent));
        listItemComponent2.setVerticalPadding(0);
        listItemComponent2.setAutoMinHeight();
        c0();
        listItemComponent2.setUseAutoAccessibilityDelegate(false);
        b.p(listItemComponent2, new ifq0(16, this));
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((ListItemComponent) ((View) this.R)).setTrailImage(c.k(dzg0.ic_cross_close, this.a));
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        r421 r421Var = (r421) obj;
        this.T = r421Var;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        listItemComponent.setTitle(r421Var.a);
        listItemComponent.setDividers(r421Var.c ? DividerPosition.TOP : DividerPosition.NONE, DividerType.ICON_MARGIN);
        c0();
    }

    public final void c0() {
        boolean L = tje.L(this.a.getContext());
        if (this.U && L == this.V) {
            return;
        }
        this.V = L;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) this.R);
        final int i = 1;
        if (L) {
            listItemComponent.setTrailContainerClickListener(null);
            final int i2 = 0;
            listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: t421
                public final /* synthetic */ u421 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    u421 u421Var = this.b;
                    switch (i3) {
                        case 0:
                            r421 r421Var = u421Var.T;
                            if (r421Var != null) {
                                u421Var.S.invoke(r421Var.b);
                                break;
                            }
                            break;
                        default:
                            r421 r421Var2 = u421Var.T;
                            if (r421Var2 != null) {
                                u421Var.S.invoke(r421Var2.b);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            listItemComponent.setDebounceClickListener(null);
            listItemComponent.setTrailContainerClickListener(new Runnable(this) { // from class: t421
                public final /* synthetic */ u421 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    u421 u421Var = this.b;
                    switch (i3) {
                        case 0:
                            r421 r421Var = u421Var.T;
                            if (r421Var != null) {
                                u421Var.S.invoke(r421Var.b);
                                break;
                            }
                            break;
                        default:
                            r421 r421Var2 = u421Var.T;
                            if (r421Var2 != null) {
                                u421Var.S.invoke(r421Var2.b);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        this.U = true;
    }
}
