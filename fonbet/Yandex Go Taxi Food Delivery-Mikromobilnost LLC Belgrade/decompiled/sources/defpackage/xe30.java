package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.analytic.TransportVerticalAnalytics$TransportCardStatus;
import ru.yandex.taxi.masstransit.promo.a;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes6.dex */
public final class xe30 implements me30 {
    public final /* synthetic */ MtCollapsedRoutesView a;

    public xe30(MtCollapsedRoutesView mtCollapsedRoutesView) {
        this.a = mtCollapsedRoutesView;
    }

    @Override // defpackage.me30
    public final void D2(List list) {
        kk31 kk31Var;
        MtCollapsedRoutesView mtCollapsedRoutesView = this.a;
        kk31Var = mtCollapsedRoutesView.verticalsView;
        kk31Var.render(list);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((ob31) it.next()).c) {
                break;
            } else {
                i++;
            }
        }
        mtCollapsedRoutesView.initVerticalHeaderAndViewPagerPosition(i >= 0 ? i : 0, list.size());
    }

    @Override // defpackage.me30
    public final void d1(e040 e040Var) {
        this.a.renderRoutesState(e040Var);
    }

    @Override // defpackage.me30
    public final void k2(ed30 ed30Var) {
        a aVar;
        aVar = this.a.communicationsDelegate;
        aVar.b(ed30Var);
    }

    @Override // defpackage.me30
    public final void r1(h111 h111Var, e040 e040Var) {
        ye30 ye30Var;
        d dVar;
        MtCollapsedRoutesView mtCollapsedRoutesView = this.a;
        ye30Var = mtCollapsedRoutesView.binding;
        if (jl40.l(h111Var, h111.k)) {
            ye30Var.j.setVisibility(8);
            ye30Var.k.setVisibility(8);
            return;
        }
        GoConstraintLayout goConstraintLayout = ye30Var.j;
        GoImageButton goImageButton = ye30Var.l;
        GoConstraintLayout goConstraintLayout2 = ye30Var.k;
        PlaceholderView placeholderView = ye30Var.i;
        GoImageButton goImageButton2 = ye30Var.h;
        ShimmeringRobotoTextView shimmeringRobotoTextView = ye30Var.n;
        RobotoTextView robotoTextView = ye30Var.m;
        goConstraintLayout.setVisibility(0);
        if (e040Var instanceof ezy) {
            shimmeringRobotoTextView.setText(h111Var.g);
            placeholderView.setShimmering(true);
            shimmeringRobotoTextView.startAnimation();
            goConstraintLayout.setVisibility(8);
            goConstraintLayout2.setVisibility(0);
            return;
        }
        if (!(e040Var instanceof igl0)) {
            goConstraintLayout.setVisibility(8);
            goConstraintLayout2.setVisibility(8);
            placeholderView.setShimmering(false);
            shimmeringRobotoTextView.stopAnimation();
            return;
        }
        UiStateDrawableWrapper uiStateDrawableWrapper = h111Var.a;
        p011 p011Var = h111Var.j;
        goImageButton2.setImageDrawable(uiStateDrawableWrapper);
        goImageButton.setImageDrawable(h111Var.b);
        goImageButton.setBackgroundColor(qje.t(xng0.bgFloating, mtCollapsedRoutesView.getContext()));
        robotoTextView.setText(h111Var.c);
        robotoTextView.setContentDescription(h111Var.d);
        kdc kdcVar = h111Var.e;
        if (kdcVar != null) {
            robotoTextView.setTextColor(s8o.m(kdcVar, mtCollapsedRoutesView.getContext()));
        } else {
            robotoTextView.setTextColor(qje.t(xng0.textMain, mtCollapsedRoutesView.getContext()));
        }
        if (h111Var.f) {
            goImageButton2.setAlpha(1.0f);
        } else {
            goImageButton2.setAlpha(0.5f);
        }
        goImageButton2.setClickable(false);
        goImageButton2.setFocusable(false);
        robotoTextView.setClickable(false);
        robotoTextView.setFocusable(false);
        ve30 ve30Var = new ve30(0, mtCollapsedRoutesView, h111Var);
        c.z(ve30Var, goConstraintLayout);
        c.z(ve30Var, goImageButton);
        goConstraintLayout2.setVisibility(8);
        placeholderView.setShimmering(false);
        shimmeringRobotoTextView.stopAnimation();
        goConstraintLayout.setVisibility(0);
        dVar = mtCollapsedRoutesView.presenter;
        mb11 mb11Var = dVar.N;
        String str = p011Var.a;
        TransportVerticalAnalytics$TransportCardStatus d = ttb1.d(p011Var);
        kb11 c = ttb1.c(p011Var);
        mb11Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("card_id", str);
        }
        if (d != null) {
            hashMap.put("card_status", d.getEventValue());
        }
        if (c != null) {
            hashMap.put("card_balance", c.d);
        }
        mb11Var.a.a("TransportVertical.PaymentCard.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.me30
    public final void za(y91 y91Var) {
        ye30 ye30Var;
        ye30Var = this.a.binding;
        SourceDestinationComponent sourceDestinationComponent = ye30Var.b;
        sourceDestinationComponent.render(y91Var.a);
        fc30 fc30Var = y91Var.b;
        obm obmVar = fc30Var.a;
        Drawable drawable = obmVar != null ? obmVar.b : null;
        obm obmVar2 = fc30Var.b;
        sourceDestinationComponent.applyDrawables(drawable, obmVar2 != null ? obmVar2.b : null);
        if (y91Var.c) {
            sourceDestinationComponent.startProgressAnimation();
        } else {
            sourceDestinationComponent.stopProgressAnimation();
        }
    }
}
