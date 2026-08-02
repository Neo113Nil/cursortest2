package ru.yandex.taxi.summary.solid;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.taxi.auction.ui.AuctionView;
import defpackage.ak60;
import defpackage.amp0;
import defpackage.bk60;
import defpackage.ck60;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.dk60;
import defpackage.dzg0;
import defpackage.ek60;
import defpackage.f540;
import defpackage.fcl0;
import defpackage.fk60;
import defpackage.gk60;
import defpackage.h7t0;
import defpackage.hbp0;
import defpackage.hk60;
import defpackage.ho4;
import defpackage.i3y;
import defpackage.i6t0;
import defpackage.ik60;
import defpackage.jl40;
import defpackage.kc;
import defpackage.mmp0;
import defpackage.mrg0;
import defpackage.mxp0;
import defpackage.ny61;
import defpackage.ons0;
import defpackage.pav;
import defpackage.qje;
import defpackage.rgb1;
import defpackage.rp31;
import defpackage.rsg0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.wfh0;
import defpackage.wrh0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zj60;
import defpackage.zss0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.animation.AnimUtils$CancelAwareAnimationEndListener;
import ru.yandex.taxi.design.DialogueComponent;
import ru.yandex.taxi.design.ListButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.summary.promotions.ui.PromotionCircularProgressView;
import ru.yandex.taxi.summary.solid.d;

/* loaded from: classes6.dex */
public final class d {
    public final p a;
    public final DialogueComponent b;
    public final RequirementsBubblesContainer c;
    public final LinearLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final h7t0 g;
    public final View h;
    public final ViewStub i;
    public final hbp0 j = new hbp0(new czo0(14), "SolidSummaryCommunicationsDelegate", null);
    public final amp0 k;
    public boolean l;
    public final f540 m;
    public final i3y n;
    public AuctionView o;
    public final ons0 p;
    public final int q;
    public SolidSummaryCommunicationsDelegate$NotificationState r;
    public int s;
    public ValueAnimator t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public final i3y y;

    public d(p pVar, pav pavVar, DialogueComponent dialogueComponent, RequirementsBubblesContainer requirementsBubblesContainer, LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, h7t0 h7t0Var, View view, ViewStub viewStub) {
        this.a = pVar;
        this.b = dialogueComponent;
        this.c = requirementsBubblesContainer;
        this.d = linearLayout;
        this.e = frameLayout;
        this.f = imageView;
        this.g = h7t0Var;
        this.h = view;
        this.i = viewStub;
        int i = wfh0.solid_summary_dialog_header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.k = new amp0(dialogueComponent, ho4.q((View) rp31.d(dialogueComponent, i)));
        final int i2 = 0;
        View inflate = LayoutInflater.from(dialogueComponent.getContext()).inflate(wrh0.solid_summary_notification_view, (ViewGroup) null, false);
        int i3 = wfh0.notification_content_item;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate);
        if (listItemComponent != null) {
            i3 = wfh0.notification_loading_item;
            LoadingComponent loadingComponent = (LoadingComponent) cma1.O(i3, inflate);
            if (loadingComponent != null) {
                FrameLayout frameLayout2 = (FrameLayout) inflate;
                final int i4 = 1;
                this.m = new f540(frameLayout2, listItemComponent, loadingComponent, 1);
                sls slsVar = new sls(this) { // from class: h6t0
                    public final /* synthetic */ d b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i2;
                        d dVar = this.b;
                        switch (i5) {
                            case 0:
                                View inflate2 = LayoutInflater.from(dVar.b.getContext()).inflate(wrh0.solid_summary_tooltip_view, (ViewGroup) null, false);
                                if (inflate2 == null) {
                                    ny61.t("rootView");
                                    return null;
                                }
                                ListItemComponent listItemComponent2 = (ListItemComponent) inflate2;
                                listItemComponent2.setBackgroundResource(b1h0.bg_tooltip_notification);
                                listItemComponent2.setMinHeight(tje.u(32, listItemComponent2.getContext()));
                                return listItemComponent2;
                            default:
                                return Integer.valueOf(tje.r(rsg0.tooltip_tail_height, dVar.b.getContext()));
                        }
                    }
                };
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.n = kotlin.a.b(lazyThreadSafetyMode, slsVar);
                this.p = new ons0(1, this);
                this.q = tje.u(4, dialogueComponent.getContext());
                this.r = SolidSummaryCommunicationsDelegate$NotificationState.HIDDEN;
                this.y = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: h6t0
                    public final /* synthetic */ d b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        d dVar = this.b;
                        switch (i5) {
                            case 0:
                                View inflate2 = LayoutInflater.from(dVar.b.getContext()).inflate(wrh0.solid_summary_tooltip_view, (ViewGroup) null, false);
                                if (inflate2 == null) {
                                    ny61.t("rootView");
                                    return null;
                                }
                                ListItemComponent listItemComponent2 = (ListItemComponent) inflate2;
                                listItemComponent2.setBackgroundResource(b1h0.bg_tooltip_notification);
                                listItemComponent2.setMinHeight(tje.u(32, listItemComponent2.getContext()));
                                return listItemComponent2;
                            default:
                                return Integer.valueOf(tje.r(rsg0.tooltip_tail_height, dVar.b.getContext()));
                        }
                    }
                });
                listItemComponent.setTitleSubtitleMaxLinesPolicy(new zj60());
                listItemComponent.setVerticalPadding(tje.r(mrg0.go_design_s_space, dialogueComponent.getContext()));
                frameLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.summary.solid.b
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                        final int i13 = i8 - i6;
                        final d dVar = d.this;
                        f540 f540Var = dVar.m;
                        int i14 = dVar.s;
                        if (i13 == i14) {
                            return;
                        }
                        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState = dVar.r;
                        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState2 = SolidSummaryCommunicationsDelegate$NotificationState.SHOWING;
                        if (solidSummaryCommunicationsDelegate$NotificationState == solidSummaryCommunicationsDelegate$NotificationState2 || solidSummaryCommunicationsDelegate$NotificationState == SolidSummaryCommunicationsDelegate$NotificationState.SHOWED) {
                            dVar.s = i13;
                            if (!dVar.w) {
                                if (f540Var.b.getTranslationY() > 0.0f && i14 == 0) {
                                    i14 = i13;
                                }
                                dVar.a((f540Var.b.getTranslationY() + i13) - i14, 0.0f, new sls() { // from class: ru.yandex.taxi.summary.solid.a
                                    @Override // defpackage.sls
                                    public final Object invoke() {
                                        int i15 = i13;
                                        d dVar2 = d.this;
                                        dVar2.c(i15);
                                        dVar2.r = SolidSummaryCommunicationsDelegate$NotificationState.SHOWED;
                                        return zy11.a;
                                    }
                                });
                                dVar.r = solidSummaryCommunicationsDelegate$NotificationState2;
                                return;
                            }
                            ValueAnimator valueAnimator = dVar.t;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.t = null;
                            dVar.c(i13);
                            dVar.r = SolidSummaryCommunicationsDelegate$NotificationState.SHOWED;
                        }
                    }
                });
                requirementsBubblesContainer.init(pavVar);
                requirementsBubblesContainer.updateBubblesPadding(0, tje.r(rsg0.summary_bubbles_bottom_padding, dialogueComponent.getContext()));
                requirementsBubblesContainer.setBubbleClickListener(new SolidSummaryCommunicationsDelegate$2(2, pVar, p.class, "bubbleClick", "bubbleClick(Lru/yandex/taxi/requirements/models/domain/RequirementBubbleModel;Lru/yandex/taxi/requirements/models/domain/RequirementBubbleAction;)V", 0));
                dialogueComponent.setAnimationScheduledCallback(new mmp0(28, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
        throw null;
    }

    public final void a(float f, float f2, sls slsVar) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.t = null;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new mxp0(16, this));
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimUtils$CancelAwareAnimationEndListener(new fcl0(22, slsVar)));
        this.t = ofFloat;
        ofFloat.start();
    }

    public final void b() {
        this.a.s.a();
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new SolidSummaryCommunicationsDelegate$attach$1(this, null), 3);
        this.d.addOnLayoutChangeListener(this.p);
    }

    public final void c(int i) {
        this.v = i == 0 ? 0 : i - this.q;
        this.u = true;
        this.g.run();
    }

    public final void d(ListItemComponent listItemComponent, hk60 hk60Var) {
        if (jl40.l(hk60Var, ck60.a)) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.clearTrailView();
            return;
        }
        int i = 2;
        if (jl40.l(hk60Var, ck60.b)) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.getNavigationIconParams().b = null;
            listItemComponent.setTrailMode(2);
            return;
        }
        if (hk60Var instanceof dk60) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.setTrailImage(((dk60) hk60Var).a);
            return;
        }
        if (hk60Var instanceof ek60) {
            ek60 ek60Var = (ek60) hk60Var;
            listItemComponent.setTrailCompanionText(ek60Var.b);
            listItemComponent.getNavigationIconParams().b = ek60Var.a;
            listItemComponent.setTrailMode(2);
            rgb1.d(listItemComponent, ek60Var.c, ek60Var.d);
            return;
        }
        if (hk60Var instanceof gk60) {
            gk60 gk60Var = (gk60) hk60Var;
            listItemComponent.setTrailCompanionText(gk60Var.a);
            listItemComponent.clearTrailView();
            rgb1.d(listItemComponent, gk60Var.b, gk60Var.c);
            return;
        }
        if (hk60Var instanceof fk60) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            View trailViewAs = listItemComponent.getTrailViewAs(SwitchComponent.class);
            if (trailViewAs == null) {
                SwitchComponent switchComponent = new SwitchComponent(listItemComponent.getContext(), null, 0, 6, null);
                switchComponent.setLayoutParams(switchComponent.generateDefaultFrameLayoutParams());
                listItemComponent.setTrailView(switchComponent);
                trailViewAs = switchComponent;
            }
            SwitchComponent switchComponent2 = (SwitchComponent) trailViewAs;
            switchComponent2.setOnCheckedChangedListener(null);
            fk60 fk60Var = (fk60) hk60Var;
            switchComponent2.setChecked(fk60Var.a);
            switchComponent2.setOnCheckedChangedListener(new kc(3, fk60Var.c));
            switchComponent2.setClickable(false);
            listItemComponent.setUseAutoAccessibilityDelegate(false);
            androidx.core.view.b.p(listItemComponent, switchComponent2.getDefaultAccessibilityDelegate());
            int i2 = i6t0.a[fk60Var.b.ordinal()];
            int i3 = 1;
            if (i2 == 1) {
                listItemComponent.setDebounceClickListener(new zss0(listItemComponent, switchComponent2, i3));
                return;
            }
            f540 f540Var = this.m;
            if (i2 == 2) {
                f540Var.c.setTrailContainerClickListener(null);
                return;
            } else if (i2 == 3) {
                f540Var.c.setTrailContainerClickListener(new zss0(listItemComponent, switchComponent2, i));
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (!(hk60Var instanceof bk60)) {
            if (!(hk60Var instanceof ak60)) {
                w511.b();
                return;
            }
            listItemComponent.setTrailCompanionText((CharSequence) null);
            View trailViewAs2 = listItemComponent.getTrailViewAs(ListButtonComponent.class);
            if (trailViewAs2 == null) {
                View listButtonComponent = new ListButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                listItemComponent.setTrailView(listButtonComponent);
                trailViewAs2 = listButtonComponent;
            }
            ListButtonComponent listButtonComponent2 = (ListButtonComponent) trailViewAs2;
            ArrayList arrayList = ((ak60) hk60Var).a;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ik60) it.next()).a);
            }
            listButtonComponent2.addButtons(arrayList2);
            return;
        }
        listItemComponent.setTrailCompanionText((CharSequence) null);
        View trailViewAs3 = listItemComponent.getTrailViewAs(LinearLayout.class);
        View view = trailViewAs3;
        if (trailViewAs3 == null) {
            LinearLayout linearLayout = new LinearLayout(listItemComponent.getContext());
            linearLayout.setGravity(16);
            linearLayout.setOrientation(0);
            PromotionCircularProgressView promotionCircularProgressView = new PromotionCircularProgressView(linearLayout.getContext(), null, 0, 6, null);
            AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext());
            appCompatImageView.setImageResource(dzg0.chevron_next);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(qje.t(xng0.textMain, appCompatImageView.getContext())));
            appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams((int) tje.x(appCompatImageView.getContext(), 24.0f), (int) tje.x(appCompatImageView.getContext(), 24.0f)));
            int x = (int) tje.x(appCompatImageView.getContext(), 7.0f);
            appCompatImageView.setPadding(x, x, x, x);
            linearLayout.addView(promotionCircularProgressView);
            linearLayout.addView(appCompatImageView);
            linearLayout.setTag(promotionCircularProgressView);
            listItemComponent.setTrailView(linearLayout);
            view = linearLayout;
        }
        LinearLayout linearLayout2 = (LinearLayout) view;
        Object tag = linearLayout2.getTag();
        PromotionCircularProgressView promotionCircularProgressView2 = tag instanceof PromotionCircularProgressView ? (PromotionCircularProgressView) tag : null;
        if (promotionCircularProgressView2 != null) {
            bk60 bk60Var = (bk60) hk60Var;
            promotionCircularProgressView2.setProgress(bk60Var.a, bk60Var.b);
        }
        xw31.F(linearLayout2, Integer.valueOf((int) tje.x(listItemComponent.getContext(), 6.0f)), null, null, null);
        xw31.F(linearLayout2, null, null, Integer.valueOf((int) tje.x(listItemComponent.getContext(), 8.0f)), null);
    }

    public final void e(float f, float f2) {
        this.c.setAlpha(f);
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState = this.r;
        SolidSummaryCommunicationsDelegate$NotificationState solidSummaryCommunicationsDelegate$NotificationState2 = SolidSummaryCommunicationsDelegate$NotificationState.SHOWED;
        ImageView imageView = this.f;
        f540 f540Var = this.m;
        if (solidSummaryCommunicationsDelegate$NotificationState != solidSummaryCommunicationsDelegate$NotificationState2) {
            if (solidSummaryCommunicationsDelegate$NotificationState == SolidSummaryCommunicationsDelegate$NotificationState.HIDDEN) {
                f540Var.b.setTranslationY(0.0f);
                imageView.setTranslationY(0.0f);
                return;
            }
            return;
        }
        float min = Math.min(1.0f, f2 * 2.0f);
        float height = f540Var.b.getHeight() * min;
        f540Var.b.setTranslationY(height);
        imageView.setTranslationY(height);
        f540Var.b.setAlpha(1.0f - min);
    }
}
