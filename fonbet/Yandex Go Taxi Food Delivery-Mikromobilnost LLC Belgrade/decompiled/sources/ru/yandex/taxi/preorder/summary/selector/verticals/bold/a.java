package ru.yandex.taxi.preorder.summary.selector.verticals.bold;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.ak31;
import defpackage.cvw;
import defpackage.eja1;
import defpackage.g2a;
import defpackage.h86;
import defpackage.hdc;
import defpackage.hf31;
import defpackage.hh31;
import defpackage.kdc;
import defpackage.lhc;
import defpackage.lys;
import defpackage.ob31;
import defpackage.q0v;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tf91;
import defpackage.tje;
import defpackage.up11;
import defpackage.vl4;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yj31;
import defpackage.zj31;
import defpackage.zo31;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class a extends lys {
    public static final /* synthetic */ int Z = 0;
    public final hf31 S;
    public final b T;
    public ob31 U;
    public hdc V;
    public ak31 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h86 h86Var, g2a g2aVar, q0v q0vVar, hf31 hf31Var, b bVar) {
        super(h86Var);
        RobotoTextView robotoTextView = h86Var.c;
        this.S = hf31Var;
        this.T = bVar;
        this.V = c0();
        if (g2aVar != null) {
            Typeface typeface = g2aVar.a;
            if (typeface == null) {
                int[] iArr = up11.a;
                typeface = eja1.w(6, 0);
            }
            robotoTextView.setTypeface(typeface);
            robotoTextView.setTextSize(0, g2aVar.b);
        }
        RobotoTextView robotoTextView2 = h86Var.b;
        GoLinearLayout goLinearLayout = h86Var.a;
        cvw.a0(c.h(100, goLinearLayout), robotoTextView2);
        c.z(new hh31(3, this, q0vVar), goLinearLayout);
    }

    public static void e0(RobotoTextView robotoTextView, Drawable drawable) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        robotoTextView.setBackground(drawable);
        robotoTextView.setPadding(tje.u(4, robotoTextView.getContext()) + rect.left, rect.top, tje.u(4, robotoTextView.getContext()) + rect.right, rect.bottom);
        xw31.E(robotoTextView, Integer.valueOf(tje.u(4, robotoTextView.getContext()) + (-rect.left)), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(-rect.bottom));
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        hdc c0 = c0();
        this.V = c0;
        ((h86) ((zo31) this.R)).b.setTextColor(c0);
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        ob31 ob31Var = (ob31) obj;
        zo31 zo31Var = (zo31) this.R;
        h86 h86Var = (h86) zo31Var;
        this.U = ob31Var;
        RobotoTextView robotoTextView = h86Var.c;
        RobotoTextView robotoTextView2 = h86Var.b;
        robotoTextView.setText(ob31Var.b);
        RobotoTextView robotoTextView3 = h86Var.c;
        robotoTextView3.setTextColor(this.V);
        robotoTextView3.setSelected(ob31Var.c);
        tf91.d(this.S, ob31Var.a, ob31Var.b, robotoTextView3);
        vl4 vl4Var = ob31Var.e;
        if (vl4Var == null) {
            robotoTextView2.setVisibility(8);
            return;
        }
        kdc kdcVar = vl4Var.d;
        GoLinearLayout goLinearLayout = h86Var.a;
        robotoTextView2.setText(vl4Var.a);
        kdc kdcVar2 = vl4Var.b;
        View view = this.a;
        robotoTextView2.setTextColor(kdcVar2 != null ? s8o.m(kdcVar2, goLinearLayout.getContext()) : c.c(xng0.textMain, view));
        robotoTextView2.setBackgroundColor(kdcVar != null ? s8o.m(kdcVar, goLinearLayout.getContext()) : c.c(xng0.bgMain, view));
        kdc kdcVar3 = vl4Var.f;
        int m = kdcVar3 != null ? s8o.m(kdcVar3, robotoTextView2.getContext()) : 0;
        Float f = vl4Var.h;
        int f2 = lhc.f(m, Math.abs((int) (255.0f * (f != null ? f.floatValue() : 1.0f))) & 255);
        int m2 = kdcVar != null ? s8o.m(kdcVar, robotoTextView2.getContext()) : c.c(xng0.bgMain, view);
        ak31 ak31Var = this.W;
        if (ak31Var instanceof yj31) {
            yj31 yj31Var = (yj31) ak31Var;
            if (yj31Var.a != f2 || yj31Var.b != m2) {
                d0(f2, m2);
                return;
            }
            e0(robotoTextView2, yj31Var.c);
            ob31 ob31Var2 = this.U;
            if ((ob31Var2 != null ? ob31Var2.e : null) != null) {
                ((h86) zo31Var).b.setVisibility(0);
                return;
            }
            return;
        }
        if (!(ak31Var instanceof zj31)) {
            if (ak31Var == null) {
                d0(f2, m2);
                return;
            } else {
                w511.b();
                return;
            }
        }
        zj31 zj31Var = (zj31) ak31Var;
        if (zj31Var.a == f2 && zj31Var.b == m2) {
            return;
        }
        W("badge_task");
        d0(f2, m2);
    }

    public final hdc c0() {
        int i = xng0.line;
        View view = this.a;
        int c = c.c(i, view);
        int t = qje.t(xng0.textMain, view.getContext());
        return new hdc(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{t, lhc.b(0.2f, c, t), c}));
    }

    public final void d0(int i, int i2) {
        this.W = new zj31(i, i2);
        Z(new VerticalViewHolder$loadShadow$1(this, i, i2, null), "badge_task", false);
    }
}
