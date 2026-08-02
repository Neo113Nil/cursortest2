package ru.yandex.taxi.summary.solid;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.taxi.auction.ui.AuctionView;
import defpackage.bdc;
import defpackage.bsf0;
import defpackage.bvz0;
import defpackage.ce3;
import defpackage.cms;
import defpackage.cvz0;
import defpackage.de3;
import defpackage.dvz0;
import defpackage.dzg0;
import defpackage.f540;
import defpackage.fcl0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jms;
import defpackage.lev0;
import defpackage.ndj0;
import defpackage.pd6;
import defpackage.qd6;
import defpackage.rd6;
import defpackage.sls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements vpr, jms {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i;
        lev0 lev0Var = (lev0) obj;
        d dVar = this.a;
        LinearLayout linearLayout = dVar.d;
        i3y i3yVar = dVar.y;
        i3y i3yVar2 = dVar.n;
        dVar.k.M(lev0Var.a);
        rd6 rd6Var = lev0Var.c;
        f540 f540Var = dVar.m;
        if (jl40.l(rd6Var, pd6.a)) {
            SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState = dVar.r;
            SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState2 = SolidSummaryCommunicationsDelegate$NotificationState.HIDING;
            if (solidSummaryCommunicationsDelegate$NotificationState != solidSummaryCommunicationsDelegate$NotificationState2 && solidSummaryCommunicationsDelegate$NotificationState != SolidSummaryCommunicationsDelegate$NotificationState.HIDDEN) {
                dVar.a(f540Var.b.getTranslationY(), f540Var.b.getHeight(), new SolidSummaryCommunicationsDelegate$hideNotification$1(0, dVar, d.class, "hideNotificationAnimationEnd", "hideNotificationAnimationEnd()V", 0));
                dVar.r = solidSummaryCommunicationsDelegate$NotificationState2;
                dVar.s = 0;
                dVar.c(0);
            }
        } else if (jl40.l(rd6Var, pd6.b)) {
            f540Var.d.setVisibility(0);
            f540Var.c.setVisibility(8);
        } else {
            if (!(rd6Var instanceof qd6)) {
                w511.b();
                return null;
            }
            SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState3 = dVar.r;
            SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState4 = SolidSummaryCommunicationsDelegate$NotificationState.SHOWING;
            if (solidSummaryCommunicationsDelegate$NotificationState3 != solidSummaryCommunicationsDelegate$NotificationState4 && solidSummaryCommunicationsDelegate$NotificationState3 != SolidSummaryCommunicationsDelegate$NotificationState.SHOWED) {
                ValueAnimator valueAnimator = dVar.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                dVar.t = null;
                FrameLayout frameLayout = f540Var.b;
                frameLayout.setAlpha(1.0f);
                if (frameLayout.getParent() != null) {
                    frameLayout.requestLayout();
                } else {
                    linearLayout.addView(frameLayout, 1, new ViewGroup.LayoutParams(-1, -2));
                }
                dVar.r = solidSummaryCommunicationsDelegate$NotificationState4;
            }
            f540Var.d.setVisibility(8);
            ListItemComponent listItemComponent = f540Var.c;
            listItemComponent.setVisibility(0);
            qd6 qd6Var = (qd6) rd6Var;
            listItemComponent.setLeadImage(qd6Var.b);
            listItemComponent.setTitle(qd6Var.d);
            listItemComponent.setTitleTextColor(new bdc(xng0.textMain));
            listItemComponent.setSubtitle(qd6Var.e);
            listItemComponent.setSubtitleTextColor(new bdc(xng0.textMain));
            Integer num = qd6Var.a;
            if (num != null) {
                listItemComponent.setBackgroundColor(num.intValue());
            } else {
                listItemComponent.setBackgroundResource(dzg0.bg_floating_ripple);
            }
            listItemComponent.stopProgressAnimation();
            sls slsVar = qd6Var.j;
            listItemComponent.setDebounceClickListener(slsVar != null ? new fcl0(23, slsVar) : null);
            dVar.d(listItemComponent, qd6Var.f);
        }
        dvz0 dvz0Var = lev0Var.d;
        FrameLayout frameLayout2 = dVar.e;
        if (jl40.l(dvz0Var, bvz0.a)) {
            i = 8;
            frameLayout2.setVisibility(8);
            dVar.g.run();
        } else {
            i = 8;
            if (!(dvz0Var instanceof cvz0)) {
                w511.b();
                return null;
            }
            frameLayout2.setVisibility(0);
            if (!((ListItemComponent) i3yVar2.getValue()).isAttachedToWindow()) {
                frameLayout2.addView((ListItemComponent) i3yVar2.getValue(), new ViewGroup.LayoutParams(-2, -2));
                ListItemComponent listItemComponent2 = (ListItemComponent) i3yVar2.getValue();
                listItemComponent2.setPadding(listItemComponent2.getPaddingLeft(), ((Number) i3yVar.getValue()).intValue(), listItemComponent2.getPaddingRight(), listItemComponent2.getPaddingBottom());
                xw31.L(-((Number) i3yVar.getValue()).intValue(), (ListItemComponent) i3yVar2.getValue());
            }
            ListItemComponent listItemComponent3 = (ListItemComponent) i3yVar2.getValue();
            cvz0 cvz0Var = (cvz0) dvz0Var;
            listItemComponent3.getBackground().setTint(cvz0Var.a);
            listItemComponent3.setLeadImage(cvz0Var.b);
            listItemComponent3.setTitle(cvz0Var.c);
            listItemComponent3.setSubtitle(cvz0Var.d);
            bsf0 bsf0Var = cvz0Var.g;
            listItemComponent3.setDebounceClickListener(bsf0Var != null ? new fcl0(21, bsf0Var) : null);
            dVar.d(listItemComponent3, cvz0Var.e);
        }
        List<ndj0> list = lev0Var.b.a;
        RequirementsBubblesContainer requirementsBubblesContainer = dVar.c;
        boolean updateBubbles = requirementsBubblesContainer.updateBubbles(list);
        requirementsBubblesContainer.setVisibility(!list.isEmpty() ? 0 : i);
        if (dVar.r == SolidSummaryCommunicationsDelegate$NotificationState.SHOWING && updateBubbles && list.isEmpty()) {
            FrameLayout frameLayout3 = f540Var.b;
            if (frameLayout3.getMeasuredHeight() <= 0) {
                frameLayout3.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            dVar.c(frameLayout3.getMeasuredHeight());
        }
        de3 de3Var = lev0Var.e;
        if (dVar.o == null && !jl40.l(de3Var, ce3.a)) {
            AuctionView auctionView = new AuctionView(dVar.b.getContext(), null, 0, 6, null);
            ru.yandex.taxi.design.utils.c.w(dVar.i, auctionView);
            dVar.o = auctionView;
        }
        AuctionView auctionView2 = dVar.o;
        if (auctionView2 != null) {
            auctionView2.setState(de3Var);
        }
        dVar.h.setVisibility(lev0Var.f ? 0 : i);
        return zy11.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof vpr) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new AdaptedFunctionReference(2, this.a, d.class, "renderCommunications", "renderCommunications(Lru/yandex/taxi/summary/solid/models/SummaryCommunications;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
