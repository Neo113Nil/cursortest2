package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import android.view.View;
import android.view.ViewGroup;
import defpackage.c1o0;
import defpackage.jfn0;
import defpackage.kfn0;
import defpackage.kqe0;
import defpackage.lbb0;
import defpackage.mfn0;
import defpackage.mgn0;
import defpackage.nfn0;
import defpackage.ofn0;
import defpackage.pav;
import defpackage.qen0;
import defpackage.ren0;
import defpackage.sen0;
import defpackage.ten0;
import defpackage.tje;
import defpackage.uro0;
import defpackage.w511;
import defpackage.wys;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zno0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.g;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class g extends wys {
    public final pav R;
    public final zno0 S;
    public final c1o0 T;
    public final c1o0 U;
    public final lbb0 V;
    public mgn0 W;

    public g(ListItemComponent listItemComponent, pav pavVar, zno0 zno0Var, c1o0 c1o0Var, c1o0 c1o0Var2, lbb0 lbb0Var) {
        super(listItemComponent);
        this.R = pavVar;
        this.S = zno0Var;
        this.T = c1o0Var;
        this.U = c1o0Var2;
        this.V = lbb0Var;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        mgn0 mgn0Var = this.W;
        if (mgn0Var != null) {
            c0(mgn0Var, false);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        mgn0 mgn0Var = (mgn0) obj;
        this.W = mgn0Var;
        c0(mgn0Var, true);
    }

    public final void c0(mgn0 mgn0Var, boolean z) {
        View view = this.a;
        ListItemComponent listItemComponent = view instanceof ListItemComponent ? (ListItemComponent) view : null;
        if (listItemComponent != null) {
            final kfn0 kfn0Var = mgn0Var.a;
            String str = kfn0Var.b;
            ten0 ten0Var = kfn0Var.e;
            listItemComponent.setTitle(str);
            listItemComponent.setSubtitle(kfn0Var.g);
            ofn0 ofn0Var = kfn0Var.a;
            final int i = 1;
            if (ofn0Var instanceof mfn0) {
                listItemComponent.setLeadImage(((mfn0) ofn0Var).a);
            } else if (ofn0Var instanceof nfn0) {
                Z(new ScootersRemainingActionsViewHolder$setLeadImage$1(this, ofn0Var, listItemComponent, null), "scooters_remaining_actions_view_holder", true);
            }
            if (ten0Var instanceof ren0) {
                listItemComponent.clearTrailView();
            } else {
                final int i2 = 0;
                if (ten0Var instanceof qen0) {
                    listItemComponent.setTrailMode(2);
                    listItemComponent.setTitleWithNavigationIcon(false);
                    listItemComponent.setDebounceClickListener(new Runnable() { // from class: tro0
                        @Override // java.lang.Runnable
                        public final void run() {
                            zno0 zno0Var;
                            zno0 zno0Var2;
                            int i3 = i2;
                            g gVar = this;
                            kfn0 kfn0Var2 = kfn0Var;
                            switch (i3) {
                                case 0:
                                    if ((kfn0Var2 instanceof jfn0) && (zno0Var = gVar.S) != null) {
                                        ((boo0) zno0Var).b(((jfn0) kfn0Var2).j);
                                    }
                                    c1o0 c1o0Var = gVar.U;
                                    if (c1o0Var != null) {
                                        c1o0Var.invoke(kfn0Var2);
                                        break;
                                    }
                                    break;
                                default:
                                    if ((kfn0Var2 instanceof jfn0) && (zno0Var2 = gVar.S) != null) {
                                        ((boo0) zno0Var2).b(((jfn0) kfn0Var2).j);
                                    }
                                    c1o0 c1o0Var2 = gVar.U;
                                    if (c1o0Var2 != null) {
                                        c1o0Var2.invoke(kfn0Var2);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    if (!(ten0Var instanceof sen0)) {
                        w511.b();
                        return;
                    }
                    listItemComponent.clearTrailView();
                    sen0 sen0Var = (sen0) ten0Var;
                    boolean z2 = sen0Var.b;
                    SwitchComponent switchComponent = new SwitchComponent(view.getContext(), null, 0, 6, null);
                    switchComponent.setEnabled(true);
                    switchComponent.setUncheckedColorAttr(xng0.controlMinor);
                    switchComponent.setTrackColorAttr(xng0.controlMain);
                    switchComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    switchComponent.setAutoToggle(false);
                    int i3 = uro0.a[sen0Var.a.ordinal()];
                    if (i3 == 1) {
                        switchComponent.setEnabled(false);
                        switchComponent.setChecked(true);
                    } else if (i3 == 2) {
                        switchComponent.setEnabled(true);
                        switchComponent.setChecked(true);
                    } else if (i3 == 3) {
                        switchComponent.setEnabled(false);
                        switchComponent.setChecked(false);
                    } else if (i3 != 4) {
                        w511.b();
                        return;
                    } else {
                        switchComponent.setEnabled(true);
                        switchComponent.setChecked(false);
                    }
                    ru.yandex.taxi.design.utils.c.z(new kqe0(28, this, kfn0Var, switchComponent), switchComponent);
                    xw31.F(switchComponent, null, null, Integer.valueOf(tje.u(16, switchComponent.getContext())), null);
                    listItemComponent.setTrailView(switchComponent);
                    listItemComponent.setTitleWithNavigationIcon(z2);
                    if (z2) {
                        listItemComponent.setDebounceClickListener(new Runnable() { // from class: tro0
                            @Override // java.lang.Runnable
                            public final void run() {
                                zno0 zno0Var;
                                zno0 zno0Var2;
                                int i32 = i;
                                g gVar = this;
                                kfn0 kfn0Var2 = kfn0Var;
                                switch (i32) {
                                    case 0:
                                        if ((kfn0Var2 instanceof jfn0) && (zno0Var = gVar.S) != null) {
                                            ((boo0) zno0Var).b(((jfn0) kfn0Var2).j);
                                        }
                                        c1o0 c1o0Var = gVar.U;
                                        if (c1o0Var != null) {
                                            c1o0Var.invoke(kfn0Var2);
                                            break;
                                        }
                                        break;
                                    default:
                                        if ((kfn0Var2 instanceof jfn0) && (zno0Var2 = gVar.S) != null) {
                                            ((boo0) zno0Var2).b(((jfn0) kfn0Var2).j);
                                        }
                                        c1o0 c1o0Var2 = gVar.U;
                                        if (c1o0Var2 != null) {
                                            c1o0Var2.invoke(kfn0Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            listItemComponent.invalidateComponent();
            if (z && (kfn0Var instanceof jfn0)) {
                this.T.invoke(kfn0Var);
            }
        }
    }
}
