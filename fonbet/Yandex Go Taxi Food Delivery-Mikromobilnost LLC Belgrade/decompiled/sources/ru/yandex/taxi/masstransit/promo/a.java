package ru.yandex.taxi.masstransit.promo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aq30;
import defpackage.bdc;
import defpackage.bq30;
import defpackage.cd30;
import defpackage.cma1;
import defpackage.cq30;
import defpackage.dd30;
import defpackage.dq30;
import defpackage.dzg0;
import defpackage.ed30;
import defpackage.eq30;
import defpackage.f540;
import defpackage.fs30;
import defpackage.ijs;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.reh0;
import defpackage.se30;
import defpackage.sls;
import defpackage.uqh0;
import defpackage.v440;
import defpackage.w511;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yso;
import defpackage.zp30;
import ru.yandex.taxi.animation.AnimUtils$CancelAwareAnimationEndListener;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.LoadingComponent;
import ru.yandex.taxi.masstransit.promo.NotificationState;
import ru.yandex.taxi.masstransit.promo.a;

/* loaded from: classes6.dex */
public final class a {
    public final GoLinearLayout a;
    public final ImageView b;
    public final se30 c;
    public final f540 d;
    public NotificationState e;
    public int f;
    public ValueAnimator g;
    public boolean h;
    public final v440 i;

    /* JADX WARN: Type inference failed for: r7v5, types: [v440] */
    public a(Context context, GoLinearLayout goLinearLayout, ImageView imageView, se30 se30Var) {
        this.a = goLinearLayout;
        this.b = imageView;
        this.c = se30Var;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(uqh0.mt_summary_notification_view, (ViewGroup) null, false);
        int i2 = reh0.notification_content_item;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
        if (listItemComponent != null) {
            i2 = reh0.notification_loading_item;
            LoadingComponent loadingComponent = (LoadingComponent) cma1.O(i2, inflate);
            if (loadingComponent != null) {
                this.d = new f540((FrameLayout) inflate, listItemComponent, loadingComponent, 0);
                this.e = NotificationState.HIDDEN;
                this.i = new View.OnLayoutChangeListener(this) { // from class: v440
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int i11 = i;
                        a aVar = this.b;
                        switch (i11) {
                            case 0:
                                if (aVar.h) {
                                    aVar.h = false;
                                    aVar.b.setTranslationY(0.0f);
                                    break;
                                }
                                break;
                            default:
                                int i12 = i6 - i4;
                                GoLinearLayout goLinearLayout2 = aVar.a;
                                int i13 = aVar.f;
                                if (i12 != i13) {
                                    NotificationState notificationState = aVar.e;
                                    NotificationState notificationState2 = NotificationState.SHOWING;
                                    if (notificationState == notificationState2 || notificationState == NotificationState.SHOWED) {
                                        aVar.f = i12;
                                        if (goLinearLayout2.getTranslationY() > 0.0f && i13 == 0) {
                                            i13 = i12;
                                        }
                                        aVar.a((goLinearLayout2.getTranslationY() + i12) - i13, 0.0f, new d240(aVar, i12));
                                        aVar.e = notificationState2;
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                listItemComponent.setTitleSubtitleMaxLinesPolicy(new zp30());
                listItemComponent.setVerticalPadding(xw31.b(mrg0.go_design_s_space, context));
                loadingComponent.setVisibility(0);
                final int i3 = 1;
                goLinearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: v440
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        int i11 = i3;
                        a aVar = this.b;
                        switch (i11) {
                            case 0:
                                if (aVar.h) {
                                    aVar.h = false;
                                    aVar.b.setTranslationY(0.0f);
                                    break;
                                }
                                break;
                            default:
                                int i12 = i6 - i4;
                                GoLinearLayout goLinearLayout2 = aVar.a;
                                int i13 = aVar.f;
                                if (i12 != i13) {
                                    NotificationState notificationState = aVar.e;
                                    NotificationState notificationState2 = NotificationState.SHOWING;
                                    if (notificationState == notificationState2 || notificationState == NotificationState.SHOWED) {
                                        aVar.f = i12;
                                        if (goLinearLayout2.getTranslationY() > 0.0f && i13 == 0) {
                                            i13 = i12;
                                        }
                                        aVar.a((goLinearLayout2.getTranslationY() + i12) - i13, 0.0f, new d240(aVar, i12));
                                        aVar.e = notificationState2;
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(float f, float f2, sls slsVar) {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g = null;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new yso(11, this));
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimUtils$CancelAwareAnimationEndListener(new ijs(12, slsVar)));
        this.g = ofFloat;
        ofFloat.start();
    }

    public final void b(ed30 ed30Var) {
        boolean equals = ed30Var.equals(cd30.a);
        boolean z = false;
        f540 f540Var = this.d;
        if (equals) {
            NotificationState notificationState = this.e;
            NotificationState notificationState2 = NotificationState.HIDING;
            if (notificationState == notificationState2 || notificationState == NotificationState.HIDDEN) {
                return;
            }
            a(f540Var.b.getTranslationY(), f540Var.b.getHeight(), new MtSummaryCommunicationsDelegate$hideNotification$1(0, this, a.class, "hideNotificationAnimationEnd", "hideNotificationAnimationEnd()V", 0));
            this.e = notificationState2;
            this.f = 0;
            return;
        }
        if (ed30Var.equals(cd30.b)) {
            f540Var.d.setVisibility(0);
            f540Var.c.setVisibility(8);
            return;
        }
        if (!(ed30Var instanceof dd30)) {
            w511.b();
            return;
        }
        NotificationState notificationState3 = this.e;
        NotificationState notificationState4 = NotificationState.SHOWING;
        if (notificationState3 != notificationState4 && notificationState3 != NotificationState.SHOWED) {
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.g = null;
            FrameLayout frameLayout = f540Var.b;
            frameLayout.setAlpha(1.0f);
            if (frameLayout.getParent() != null) {
                frameLayout.requestLayout();
            } else {
                this.a.addView(frameLayout, 1, new ViewGroup.LayoutParams(-1, -2));
            }
            this.e = notificationState4;
        }
        f540Var.d.setVisibility(8);
        ListItemComponent listItemComponent = f540Var.c;
        listItemComponent.setVisibility(0);
        dd30 dd30Var = (dd30) ed30Var;
        eq30 eq30Var = dd30Var.e;
        listItemComponent.setLeadImage(dd30Var.b);
        listItemComponent.setTitle(dd30Var.c);
        listItemComponent.setTitleTextColor(new bdc(xng0.textMain));
        listItemComponent.setSubtitle(dd30Var.d);
        listItemComponent.setSubtitleTextColor(new bdc(xng0.textMain));
        listItemComponent.setBackgroundResource(dzg0.bg_floating_ripple);
        listItemComponent.stopProgressAnimation();
        if (!(eq30Var instanceof aq30) && !(eq30Var instanceof dq30)) {
            z = true;
        }
        listItemComponent.setUseAutoAccessibilityDelegate(z);
        fs30 fs30Var = dd30Var.i;
        listItemComponent.setDebounceClickListener(fs30Var != null ? new ijs(13, fs30Var) : null);
        if (jl40.l(eq30Var, aq30.a)) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.clearTrailView();
        } else if (jl40.l(eq30Var, bq30.a)) {
            listItemComponent.setTrailCompanionText((CharSequence) null);
            listItemComponent.getNavigationIconParams().b = null;
            listItemComponent.setTrailMode(2);
        } else if (eq30Var instanceof cq30) {
            cq30 cq30Var = (cq30) eq30Var;
            listItemComponent.setTrailCompanionText(cq30Var.b);
            listItemComponent.getNavigationIconParams().b = cq30Var.a;
            listItemComponent.setTrailMode(2);
        } else if (!(eq30Var instanceof dq30)) {
            w511.b();
            return;
        } else {
            listItemComponent.setTrailCompanionText(((dq30) eq30Var).a);
            listItemComponent.clearTrailView();
        }
        dd30Var.f.invoke();
        this.c.invoke(ed30Var);
    }
}
