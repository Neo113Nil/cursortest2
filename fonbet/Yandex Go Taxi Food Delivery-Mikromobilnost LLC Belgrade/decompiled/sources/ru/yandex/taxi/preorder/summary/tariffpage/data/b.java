package ru.yandex.taxi.preorder.summary.tariffpage.data;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import defpackage.bdc;
import defpackage.czo0;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.fbx0;
import defpackage.g18;
import defpackage.gbx0;
import defpackage.hbp0;
import defpackage.hbx0;
import defpackage.hn4;
import defpackage.i3y;
import defpackage.ibx0;
import defpackage.jbx0;
import defpackage.jl40;
import defpackage.kbx0;
import defpackage.kdc;
import defpackage.lbx0;
import defpackage.m1a0;
import defpackage.mbx0;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.nbx0;
import defpackage.p370;
import defpackage.pav;
import defpackage.rgb1;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tls;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.wl4;
import defpackage.xng0;
import defpackage.xrh0;
import defpackage.xw31;
import defpackage.xyw0;
import defpackage.yfh0;
import defpackage.z0a0;
import java.util.WeakHashMap;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.plus.design.view.GradientGlyphValueView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.b;

/* loaded from: classes6.dex */
public final class b {
    public final pav a;
    public final ru.yandex.taxi.widget.c b;
    public final p370 c;
    public final View d;
    public final ListItemComponent e;
    public final LoadingComponent f;
    public g18 g = g18.u1;
    public final hbp0 h = new hbp0(new czo0(14), "", null);
    public final bdc i = new bdc(xng0.textMain);

    public b(LinearLayout linearLayout, pav pavVar, ru.yandex.taxi.widget.c cVar, p370 p370Var) {
        this.a = pavVar;
        this.b = cVar;
        this.c = p370Var;
        View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(xrh0.tariff_pager_badge, (ViewGroup) linearLayout, false);
        this.d = inflate;
        inflate.setTag(this);
        int i = yfh0.tariff_card_badge_item;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.e = (ListItemComponent) ((View) rp31.d(inflate, i));
        this.f = (LoadingComponent) ((View) rp31.d(inflate, yfh0.tariff_card_badge_loading));
    }

    public final void a(wl4 wl4Var) {
        this.g.cancel();
        hbp0 hbp0Var = this.h;
        hbp0Var.b();
        hbp0Var.a();
        boolean z = wl4Var.m;
        this.f.setVisibility(z ? 0 : 8);
        int i = z ? 8 : 0;
        ListItemComponent listItemComponent = this.e;
        listItemComponent.setVisibility(i);
        if (z) {
            return;
        }
        FormattedText formattedText = wl4Var.b;
        FormattedText formattedText2 = wl4Var.j;
        b(formattedText, new BadgeViewHolder$bindItemView$1(1, this.e, ListItemComponent.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 0));
        b(wl4Var.c, new BadgeViewHolder$bindItemView$2(1, this.e, ListItemComponent.class, "setSubtitle", "setSubtitle(Ljava/lang/CharSequence;)V", 0));
        listItemComponent.setTitleSubtitleMaxLinesPolicy(wl4Var.l);
        final int i2 = 1;
        listItemComponent.setUseAutoAccessibilityDelegate(true);
        kdc kdcVar = wl4Var.n;
        kdc kdcVar2 = this.i;
        if (kdcVar == null) {
            kdcVar = kdcVar2;
        }
        listItemComponent.setTitleTextColor(kdcVar);
        kdc kdcVar3 = wl4Var.o;
        if (kdcVar3 != null) {
            kdcVar2 = kdcVar3;
        }
        listItemComponent.setSubtitleTextColor(kdcVar2);
        Rect rect = wl4Var.g;
        listItemComponent.setLeadImagePadding(rect.left, rect.top, rect.right, rect.bottom);
        Drawable drawable = wl4Var.f;
        String str = wl4Var.e;
        if (drawable != null) {
            listItemComponent.setLeadImage(drawable);
        } else if (str == null || str.length() == 0) {
            int i3 = wl4Var.d;
            if (i3 != 0) {
                listItemComponent.setLeadImage(i3);
            } else {
                listItemComponent.clearLeadView();
            }
        } else {
            int u = tje.u(24, listItemComponent.getContext());
            nac nacVar = (nac) this.a.a(listItemComponent.getLeadImageView());
            nacVar.f(u, u);
            this.g = nacVar.c(str);
        }
        nbx0 nbx0Var = wl4Var.i;
        int i4 = wl4Var.h;
        kdc kdcVar4 = wl4Var.k;
        Runnable runnable = wl4Var.p;
        boolean z2 = nbx0Var instanceof hbx0;
        View view = this.d;
        if (z2) {
            hbx0 hbx0Var = (hbx0) nbx0Var;
            GradientGlyphValueView gradientGlyphValueView = new GradientGlyphValueView(view.getContext(), null, 0, 6, null);
            String str2 = hbx0Var.a;
            if (str2 != null && !evu0.J(str2)) {
                gradientGlyphValueView.addOnAttachStateChangeListener(new BadgeViewHolder$updateImageOnAttachStateChanged$1(this, gradientGlyphValueView, str2));
            }
            gradientGlyphValueView.setValue(hbx0Var.b);
            gradientGlyphValueView.setContentDescription(hbx0Var.c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(tje.r(mrg0.go_design_s_space, view.getContext()));
            gradientGlyphValueView.setLayoutParams(layoutParams);
            ListItemComponent listItemComponent2 = new ListItemComponent(view.getContext(), null, 0, 6, null);
            listItemComponent2.setLeadView(gradientGlyphValueView);
            listItemComponent2.setTrailMode(2);
            listItemComponent2.setFocusable(false);
            listItemComponent2.clearFocus();
            listItemComponent.setTrailView(listItemComponent2);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
        } else if (nbx0Var instanceof fbx0) {
            fbx0 fbx0Var = (fbx0) nbx0Var;
            GradientGlyphValueView gradientGlyphValueView2 = new GradientGlyphValueView(view.getContext(), null, 0, 6, null);
            String str3 = fbx0Var.a;
            if (str3 != null && !evu0.J(str3)) {
                gradientGlyphValueView2.addOnAttachStateChangeListener(new BadgeViewHolder$updateImageOnAttachStateChanged$1(this, gradientGlyphValueView2, str3));
                gradientGlyphValueView2.disableShaderToIcon();
            }
            gradientGlyphValueView2.setSolidColorToValue(s8o.m(fbx0Var.c, gradientGlyphValueView2.getContext()));
            gradientGlyphValueView2.setValue(fbx0Var.b);
            gradientGlyphValueView2.setContentDescription(fbx0Var.w);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginStart(tje.r(mrg0.go_design_s_space, view.getContext()));
            gradientGlyphValueView2.setLayoutParams(layoutParams2);
            ListItemComponent listItemComponent3 = new ListItemComponent(view.getContext(), null, 0, 6, null);
            listItemComponent3.setLeadView(gradientGlyphValueView2);
            listItemComponent3.setTrailMode(2);
            listItemComponent3.setFocusable(false);
            listItemComponent3.clearFocus();
            listItemComponent.setTrailView(listItemComponent3);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
        } else if (nbx0Var instanceof lbx0) {
            m1a0 m1a0Var = ((lbx0) nbx0Var).a;
            p370 p370Var = this.c;
            p370Var.getClass();
            Context context = (Context) p370Var.b;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView((Context) p370Var.b, null, 0, 6, null);
            CompositePaymentIconsView.update$default(compositePaymentIconsView, m1a0Var, (z0a0) p370Var.c, false, null, 8, null);
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setImageResource(dzg0.chevron_next);
            linearLayout.addView(compositePaymentIconsView);
            linearLayout.addView(appCompatImageView);
            xw31.F(appCompatImageView, null, null, Integer.valueOf(((Number) ((i3y) p370Var.w).getValue()).intValue()), null);
            linearLayout.setGravity(16);
            listItemComponent.setTrailView(linearLayout);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
        } else if (nbx0Var instanceof jbx0) {
            listItemComponent.setTrailImage(((jbx0) nbx0Var).a);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
        } else if (nbx0Var instanceof ibx0) {
            listItemComponent.getNavigationIconParams().b = kdcVar4;
            listItemComponent.setTrailMode(i4);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
            ibx0 ibx0Var = (ibx0) nbx0Var;
            rgb1.d(listItemComponent, ibx0Var.a, ibx0Var.b);
        } else if (nbx0Var instanceof mbx0) {
            final mbx0 mbx0Var = (mbx0) nbx0Var;
            SwitchComponent switchComponent = (SwitchComponent) listItemComponent.getTrailViewAs(SwitchComponent.class);
            if (switchComponent == null) {
                SwitchComponent switchComponent2 = new SwitchComponent(view.getContext(), null, 0, 6, null);
                switchComponent2.setLayoutParams(switchComponent2.generateDefaultFrameLayoutParams());
                listItemComponent.setTrailView(switchComponent2);
                switchComponent = switchComponent2;
            }
            switchComponent.setOnCheckedChangedListener(null);
            switchComponent.setChecked(mbx0Var.a);
            switchComponent.setEnabled(mbx0Var.w);
            listItemComponent.setTrailContainerClickListener(null);
            listItemComponent.setCenterClickListener(null);
            listItemComponent.setLeadContainerClickListener(null);
            final int i5 = r4 ? 1 : 0;
            listItemComponent.setDebounceClickListener(new Runnable(this) { // from class: gn4
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i5;
                    b bVar = this.b;
                    switch (i6) {
                        case 0:
                            qke.v(bVar.d.getContext());
                            SwitchComponent switchComponent3 = (SwitchComponent) bVar.e.getTrailViewAs(SwitchComponent.class);
                            if (switchComponent3 != null) {
                                switchComponent3.toggleWithAnimation();
                                break;
                            }
                            break;
                        default:
                            qke.v(bVar.d.getContext());
                            SwitchComponent switchComponent4 = (SwitchComponent) bVar.e.getTrailViewAs(SwitchComponent.class);
                            if (switchComponent4 != null) {
                                switchComponent4.toggleWithAnimation();
                                break;
                            }
                            break;
                    }
                }
            });
            switchComponent.setOnCheckedChangedListener(new xyw0() { // from class: ru.yandex.taxi.preorder.summary.tariffpage.data.a
                @Override // defpackage.xyw0
                public final void a(boolean z3) {
                    Pair pair;
                    mbx0 mbx0Var2 = mbx0.this;
                    mbx0Var2.b.invoke(Boolean.valueOf(z3));
                    tls tlsVar = mbx0Var2.c;
                    if (tlsVar == null || (pair = (Pair) tlsVar.invoke(Boolean.valueOf(z3))) == null) {
                        return;
                    }
                    FormattedText formattedText3 = (FormattedText) pair.getFirst();
                    FormattedText formattedText4 = (FormattedText) pair.getSecond();
                    b bVar = this;
                    bVar.b(formattedText3, new BadgeViewHolder$bindSwitch$2$1(1, bVar.e, ListItemComponent.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 0));
                    bVar.b(formattedText4, new BadgeViewHolder$bindSwitch$2$2(1, bVar.e, ListItemComponent.class, "setSubtitle", "setSubtitle(Ljava/lang/CharSequence;)V", 0));
                }
            });
            switchComponent.setClickable(false);
            listItemComponent.setUseAutoAccessibilityDelegate(false);
            androidx.core.view.b.p(listItemComponent, switchComponent.getDefaultAccessibilityDelegate());
        } else if (nbx0Var instanceof kbx0) {
            final kbx0 kbx0Var = (kbx0) nbx0Var;
            SwitchComponent switchComponent3 = (SwitchComponent) listItemComponent.getTrailViewAs(SwitchComponent.class);
            if (switchComponent3 == null) {
                SwitchComponent switchComponent4 = new SwitchComponent(view.getContext(), null, 0, 6, null);
                switchComponent4.setLayoutParams(switchComponent4.generateDefaultFrameLayoutParams());
                listItemComponent.setTrailView(switchComponent4);
                switchComponent3 = switchComponent4;
            }
            switchComponent3.setOnCheckedChangedListener(null);
            switchComponent3.setChecked(kbx0Var.a);
            switchComponent3.setEnabled(true);
            listItemComponent.setTrailContainerClickListener(new Runnable(this) { // from class: gn4
                public final /* synthetic */ b b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i2;
                    b bVar = this.b;
                    switch (i6) {
                        case 0:
                            qke.v(bVar.d.getContext());
                            SwitchComponent switchComponent32 = (SwitchComponent) bVar.e.getTrailViewAs(SwitchComponent.class);
                            if (switchComponent32 != null) {
                                switchComponent32.toggleWithAnimation();
                                break;
                            }
                            break;
                        default:
                            qke.v(bVar.d.getContext());
                            SwitchComponent switchComponent42 = (SwitchComponent) bVar.e.getTrailViewAs(SwitchComponent.class);
                            if (switchComponent42 != null) {
                                switchComponent42.toggleWithAnimation();
                                break;
                            }
                            break;
                    }
                }
            });
            switchComponent3.setOnCheckedChangedListener(new hn4(r4 ? 1 : 0, kbx0Var));
            final int i6 = r4 ? 1 : 0;
            listItemComponent.setCenterClickListener(new Runnable() { // from class: in4
                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = i6;
                    kbx0 kbx0Var2 = kbx0Var;
                    switch (i7) {
                        case 0:
                            kbx0Var2.c.invoke();
                            break;
                        default:
                            kbx0Var2.c.invoke();
                            break;
                    }
                }
            });
            listItemComponent.setLeadContainerClickListener(new Runnable() { // from class: in4
                @Override // java.lang.Runnable
                public final void run() {
                    int i7 = i2;
                    kbx0 kbx0Var2 = kbx0Var;
                    switch (i7) {
                        case 0:
                            kbx0Var2.c.invoke();
                            break;
                        default:
                            kbx0Var2.c.invoke();
                            break;
                    }
                }
            });
        } else if (nbx0Var instanceof gbx0) {
            View trailViewAs = listItemComponent.getTrailViewAs(ListButtonComponent.class);
            if (trailViewAs == null) {
                View listButtonComponent = new ListButtonComponent(view.getContext(), null, 0, 6, null);
                listItemComponent.setTrailView(listButtonComponent);
                trailViewAs = listButtonComponent;
            }
            ((ListButtonComponent) trailViewAs).addButtons(((gbx0) nbx0Var).a);
        } else {
            if (!jl40.l(nbx0Var, vvb1.R)) {
                w511.b();
                return;
            }
            listItemComponent.getNavigationIconParams().b = kdcVar4;
            listItemComponent.setTrailMode(i4);
            listItemComponent.setDebounceClickListener(runnable);
            listItemComponent.setClickable(runnable != null);
        }
        if (formattedText2.a.isEmpty()) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
        } else {
            b(formattedText2, new BadgeViewHolder$bindItemView$3(1, this.e, ListItemComponent.class, "setTrailCompanionText", "setTrailCompanionText(Ljava/lang/CharSequence;)V", 0));
        }
        listItemComponent.stopProgressAnimation();
    }

    public final void b(FormattedText formattedText, tls tlsVar) {
        if (formattedText == null) {
            tlsVar.invoke(null);
        } else {
            tje.N(this.h.c(), null, null, new BadgeViewHolder$bindText$1(tlsVar, this, formattedText, null), 3);
        }
    }
}
