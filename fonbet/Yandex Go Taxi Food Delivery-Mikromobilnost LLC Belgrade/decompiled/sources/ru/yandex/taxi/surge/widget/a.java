package ru.yandex.taxi.surge.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a1x;
import defpackage.dgr0;
import defpackage.dv4;
import defpackage.ev4;
import defpackage.g36;
import defpackage.g8e;
import defpackage.hlx0;
import defpackage.ho4;
import defpackage.i36;
import defpackage.irv0;
import defpackage.j36;
import defpackage.jl40;
import defpackage.jrv0;
import defpackage.lrv0;
import defpackage.mrg0;
import defpackage.no6;
import defpackage.nrv0;
import defpackage.orv0;
import defpackage.po4;
import defpackage.prv0;
import defpackage.qrv0;
import defpackage.rrv0;
import defpackage.srv0;
import defpackage.tje;
import defpackage.u90;
import defpackage.w511;
import defpackage.xw31;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BalanceWidget;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class a implements jrv0 {
    public final /* synthetic */ irv0 a;

    public a(irv0 irv0Var) {
        this.a = irv0Var;
    }

    @Override // defpackage.jrv0
    public final void W9(srv0 srv0Var) {
        boolean l = jl40.l(srv0Var, qrv0.a);
        irv0 irv0Var = this.a;
        if (l) {
            no6 no6Var = irv0Var.f;
            if (no6Var != null) {
                BubbleComponent bubbleComponent = (BubbleComponent) no6Var.c;
                u90 u90Var = (u90) no6Var.y;
                if (no6Var.a) {
                    ((View) no6Var.b).removeOnLayoutChangeListener(u90Var);
                    bubbleComponent.removeOnLayoutChangeListener(u90Var);
                    no6Var.a = false;
                }
                bubbleComponent.hide(true);
            }
            irv0Var.e = "";
            return;
        }
        if (!(srv0Var instanceof rrv0)) {
            w511.b();
            return;
        }
        rrv0 rrv0Var = (rrv0) srv0Var;
        BalanceWidget balanceWidget = irv0Var.h;
        no6 no6Var2 = irv0Var.f;
        if (no6Var2 == null) {
            no6Var2 = new no6(balanceWidget);
        }
        a1x a1xVar = (a1x) no6Var2.x;
        dgr0 dgr0Var = (dgr0) no6Var2.w;
        BubbleComponent bubbleComponent2 = (BubbleComponent) no6Var2.c;
        if (no6Var2 != irv0Var.f) {
            ViewGroup viewGroup = (ViewGroup) balanceWidget.getParent();
            viewGroup.addView(bubbleComponent2, viewGroup.indexOfChild(balanceWidget) + 1, new ViewGroup.LayoutParams(-2, -2));
            dgr0Var.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
            dgr0Var.o(DefaultBubbleDecorator$Direction.UP);
            c.z(new SummaryWidgetHolderImpl$showOnBoardingBubble$1(0, irv0Var.a, lrv0.class, "onBoardingClick", "onBoardingClick()V", 0), a1xVar.b);
            xw31.D(tje.r(mrg0.go_design_s_space, balanceWidget.getContext()), bubbleComponent2);
            bubbleComponent2.setImportantForAccessibility(4);
            irv0Var.f = no6Var2;
        }
        String str = rrv0Var.c;
        String str2 = rrv0Var.d;
        irv0Var.e = g8e.p(str, " ", str2);
        RobotoTextView robotoTextView = a1xVar.d;
        RobotoTextView robotoTextView2 = a1xVar.c;
        robotoTextView.setText(str);
        a1xVar.d.setVisibility(str.length() > 0 ? 0 : 8);
        robotoTextView2.setText(str2);
        robotoTextView2.setVisibility(str2.length() <= 0 ? 8 : 0);
        dgr0Var.n(rrv0Var.a);
        Drawable drawable = rrv0Var.b;
        dgr0Var.E = drawable.mutate();
        dgr0Var.m();
        Drawable drawable2 = dgr0Var.E;
        Rect rect = dgr0Var.I;
        drawable2.getPadding(rect);
        dgr0Var.q((drawable.getIntrinsicWidth() - rect.left) - rect.right, (drawable.getIntrinsicHeight() - rect.top) - rect.bottom);
        u90 u90Var2 = (u90) no6Var2.y;
        if (!no6Var2.a) {
            ((View) no6Var2.b).addOnLayoutChangeListener(u90Var2);
            bubbleComponent2.addOnLayoutChangeListener(u90Var2);
            no6Var2.a = true;
        }
        bubbleComponent2.show(true);
    }

    @Override // defpackage.jrv0
    public final void i8(prv0 prv0Var) {
        g36 g36Var;
        irv0 irv0Var = this.a;
        BalanceWidget balanceWidget = irv0Var.h;
        if (jl40.l(prv0Var, nrv0.a)) {
            balanceWidget.setVisibility(8);
            return;
        }
        if (!(prv0Var instanceof orv0)) {
            w511.b();
            return;
        }
        balanceWidget.setVisibility(0);
        j36 j36Var = (j36) irv0Var.g.getValue();
        orv0 orv0Var = (orv0) prv0Var;
        i36 i36Var = orv0Var.e;
        if (i36Var != null) {
            g36Var = new g36(i36Var.b, i36Var.d, i36Var.e, i36Var.a, i36Var.c, i36Var.f);
        } else {
            g36Var = null;
        }
        j36Var.b = g36Var;
        if (g36Var != null) {
            ho4 ho4Var = j36Var.a;
            RobotoTextView robotoTextView = (RobotoTextView) ho4Var.d;
            ButtonComponent buttonComponent = (ButtonComponent) ho4Var.b;
            robotoTextView.setText(g36Var.a);
            ((RobotoTextView) ho4Var.d).setTextColor(g36Var.b);
            buttonComponent.setText(g36Var.c);
            buttonComponent.setButtonTitleColor(g36Var.d);
            buttonComponent.setButtonBackground(g36Var.e);
        }
        hlx0 hlx0Var = orv0Var.a;
        Drawable drawable = (Drawable) hlx0Var.b;
        List list = (List) hlx0Var.c;
        List list2 = (List) hlx0Var.w;
        ev4 ev4Var = (ev4) hlx0Var.x;
        BalanceWidget.updateState$default(balanceWidget, new po4(drawable, list, list2, new dv4(ev4Var.c, ev4Var.d, ev4Var.e, false), i36Var != null), false, 2, null);
        irv0Var.c = orv0Var.b;
        irv0Var.d = orv0Var.c;
    }
}
