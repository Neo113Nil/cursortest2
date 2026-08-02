package com.anythink.basead.ui.improveclick;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.ShakeBorderThumbView;
import com.anythink.basead.ui.ShakeNativeBorderThumbView;
import com.anythink.basead.ui.ShakeThumbView;
import com.anythink.basead.ui.ShakeView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.video.module.a.a.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    BaseShakeView f12024a;

    /* renamed from: b, reason: collision with root package name */
    BaseShakeView f12025b;

    /* renamed from: p, reason: collision with root package name */
    long f12031p;

    /* renamed from: q, reason: collision with root package name */
    private final int f12032q = 12;

    /* renamed from: r, reason: collision with root package name */
    private final int f12033r = 252;

    /* renamed from: s, reason: collision with root package name */
    private final int f12034s = 132;

    /* renamed from: t, reason: collision with root package name */
    private final int f12035t = 48;

    /* renamed from: u, reason: collision with root package name */
    private final int f12036u = 86;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12037v = false;

    /* renamed from: c, reason: collision with root package name */
    final long f12026c = m.ai;

    /* renamed from: l, reason: collision with root package name */
    final long f12027l = 500;

    /* renamed from: m, reason: collision with root package name */
    boolean f12028m = false;

    /* renamed from: n, reason: collision with root package name */
    boolean f12029n = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f12030o = false;

    private void b(Map<String, Object> map) {
        BaseShakeView baseShakeView;
        View view = this.f11929j;
        int indexOfChild = (view == null || this.f11927g.indexOfChild(view) <= 0) ? -1 : this.f11927g.indexOfChild(this.f11929j);
        int i = this.f11928h;
        RelativeLayout relativeLayout = null;
        if (i == 1 || i == 2) {
            try {
                relativeLayout = (RelativeLayout) this.f11927g.findViewById(q.a(this.f11924d, "myoffer_end_card_id", "id"));
            } catch (Throwable unused) {
            }
            BaseShakeView baseShakeView2 = this.f12024a;
            if (baseShakeView2 != null) {
                am.a(baseShakeView2);
                this.f12024a.setVisibility(8);
                if (relativeLayout != null) {
                    relativeLayout.addView(this.f12024a);
                    return;
                } else {
                    this.f11927g.addView(this.f12024a, indexOfChild);
                    return;
                }
            }
            return;
        }
        if (i == 3) {
            BaseShakeView baseShakeView3 = this.f12024a;
            if (baseShakeView3 != null) {
                am.a(baseShakeView3);
                this.f12024a.setVisibility(0);
                if (indexOfChild > 0) {
                    indexOfChild++;
                }
                this.f11927g.addView(this.f12024a, indexOfChild);
                return;
            }
            return;
        }
        if (i != 5 && i != 6) {
            if (i == 100 && (baseShakeView = this.f12024a) != null) {
                am.a(baseShakeView);
                this.f12024a.setVisibility(0);
                this.f11927g.addView(this.f12024a);
                return;
            }
            return;
        }
        BaseShakeView baseShakeView4 = this.f12024a;
        if (baseShakeView4 != null) {
            am.a(baseShakeView4);
            Object obj = map != null ? map.get(g.a.f11953b) : null;
            if (obj != null && (obj instanceof ViewGroup)) {
                BaseShakeView baseShakeView5 = this.f12024a;
                if (baseShakeView5 instanceof ShakeNativeBorderThumbView) {
                    ((ShakeNativeBorderThumbView) baseShakeView5).changeBackground();
                    if (obj instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        this.f12024a.setLayoutParams(layoutParams);
                    }
                }
                ((ViewGroup) obj).addView(this.f12024a);
                return;
            }
            if (this.f11927g.getMeasuredWidth() < i.a().a(this.f11924d) || this.f11927g.getMeasuredHeight() < i.a().b(this.f11924d)) {
                Object obj2 = map.get(g.a.f11954c);
                if (obj2 == null || !(obj2 instanceof com.anythink.basead.g.f)) {
                    return;
                }
                ((com.anythink.basead.g.f) obj2).onATImproveClickViewRenderFail(1);
                return;
            }
            if (this.f11927g instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 21;
                this.f12024a.setLayoutParams(layoutParams2);
            }
            this.f11927g.addView(this.f12024a);
        }
    }

    private void c() {
        if (this.f12024a == null || this.f12025b == null || this.f12037v || !f()) {
            return;
        }
        this.f12037v = true;
        this.f12024a.setVisibility(0);
        this.f12024a.postDelayed(new Runnable() { // from class: com.anythink.basead.ui.improveclick.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.this.f()) {
                    try {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.2f);
                        ofFloat.setDuration(500L);
                        ofFloat.setRepeatCount(1);
                        ofFloat.setRepeatMode(2);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.basead.ui.improveclick.j.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (j.this.f12025b != null) {
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    j jVar = j.this;
                                    if (jVar.f12024a != null && jVar.f12025b.getParent() == null) {
                                        j.this.f12024a.setAlpha(floatValue);
                                    }
                                    if (j.this.f12025b.getParent() != null) {
                                        j.this.f12025b.setAlpha(floatValue);
                                    }
                                }
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.anythink.basead.ui.improveclick.j.1.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationRepeat(Animator animator) {
                                int i;
                                super.onAnimationRepeat(animator);
                                try {
                                    j jVar = j.this;
                                    if (jVar.f12025b == null || !jVar.f()) {
                                        return;
                                    }
                                    am.a(j.this.f12025b);
                                    j jVar2 = j.this;
                                    RelativeLayout relativeLayout = (RelativeLayout) jVar2.f11927g.findViewById(q.a(jVar2.f11924d, "myoffer_end_card_id", "id"));
                                    if (relativeLayout != null) {
                                        relativeLayout.addView(j.this.f12025b);
                                    } else {
                                        j jVar3 = j.this;
                                        View view = jVar3.f11929j;
                                        if (view == null || jVar3.f11927g.indexOfChild(view) <= 0) {
                                            i = -1;
                                        } else {
                                            j jVar4 = j.this;
                                            i = jVar4.f11927g.indexOfChild(jVar4.f11929j);
                                        }
                                        j jVar5 = j.this;
                                        jVar5.f11927g.addView(jVar5.f12025b, i);
                                    }
                                    j.this.f12025b.setAlpha(0.2f);
                                    j.this.f12024a.setVisibility(8);
                                } catch (Throwable unused) {
                                }
                            }
                        });
                        ofFloat.start();
                    } catch (Throwable unused) {
                        if (j.this.f()) {
                            BaseShakeView baseShakeView = j.this.f12025b;
                            if (baseShakeView == null || baseShakeView.getParent() == null) {
                                j.this.f12024a.setVisibility(0);
                            } else {
                                j.this.f12024a.setVisibility(8);
                                j.this.f12025b.setVisibility(0);
                            }
                        }
                    }
                }
            }
        }, m.ai);
    }

    private void d() {
        e();
        if (this.f12025b == null || this.f11928h != 1 || com.anythink.basead.b.e.b(this.f11925e) || com.anythink.basead.b.e.a(this.f11925e)) {
            return;
        }
        if (this.f11926f.f14954o.J() == 0 || com.anythink.core.common.v.m.f(this.f11924d) == 2) {
            this.f12025b.setAlpha(1.0f);
            this.f12025b.setVisibility(0);
        }
    }

    private void e() {
        BaseShakeView baseShakeView = this.f12024a;
        if (baseShakeView != null) {
            baseShakeView.setVisibility(8);
        }
        BaseShakeView baseShakeView2 = this.f12025b;
        if (baseShakeView2 != null) {
            baseShakeView2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return (this.f11928h == 1 && com.anythink.basead.b.e.a(this.f11925e, this.f11926f) && this.f12028m) ? false : true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        boolean z6;
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        int i4 = this.f11928h;
        if (i4 == 1 || i4 == 2) {
            this.f12024a = new ShakeThumbView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            if (i == 2 && com.anythink.core.common.v.m.f(context) == 2 && xVar.f14954o.J() == 0) {
                this.f12024a.setPadding(0, 0, 0, q.a(context, 42.0f));
            }
            this.f12024a.setLayoutParams(layoutParams);
            this.f12025b = new ShakeBorderThumbView(context);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(9);
            layoutParams2.addRule(12);
            int a9 = q.a(context, 12.0f);
            if (i == 1) {
                if (com.anythink.core.common.v.m.f(context) == 2) {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 132.0f));
                } else {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 252.0f));
                }
            }
            if (i == 2 && !com.anythink.basead.b.e.a(this.f11925e)) {
                if (xVar.f14954o.J() == 0) {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 48.0f));
                } else {
                    layoutParams2.setMargins(a9, 0, 0, q.a(context, 86.0f));
                }
            }
            this.f12025b.setLayoutParams(layoutParams2);
            a(this.f12024a, xVar.f14954o.J() != 1);
            a(this.f12025b, xVar.f14954o.J() != 1);
        } else if (i4 == 3) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            boolean z9 = (this.f11926f.f14954o.au() == 1 && !TextUtils.isEmpty(this.f11926f.f14954o.aw())) || this.f11926f.f14954o.ah() || this.f11926f.f14954o.ar();
            if (this.f11925e.n()) {
                if (!z9) {
                    this.f12024a = new ShakeThumbView(context);
                    layoutParams3.addRule(13);
                    this.f12024a.setPadding(0, 0, 0, q.a(context, 26.0f));
                } else {
                    this.f12024a = new ShakeBorderThumbView(context);
                    layoutParams3.addRule(11);
                    layoutParams3.addRule(15);
                }
            } else if (BaseSdkSplashATView.isSinglePicture(this.f11925e, this.f11926f.f14954o)) {
                this.f12024a = new ShakeView(context);
                layoutParams3.addRule(14);
                layoutParams3.addRule(12);
                int a10 = this.f11926f.f14954o.C() == 2 ? q.a(context, 46.0f) : q.a(context, 63.0f);
                if (this.f11926f.f14954o.ar()) {
                    a10 = q.a(context, 100.0f);
                }
                if (wVar.b() == 4) {
                    String directlySplashAdShakeIconString = ATSDKGlobalSetting.getDirectlySplashAdShakeIconString();
                    if (!TextUtils.isEmpty(directlySplashAdShakeIconString)) {
                        ((ShakeView) this.f12024a).setShakeHintText(directlySplashAdShakeIconString);
                    }
                    View directlySplashShakeButton = ATSDKGlobalSetting.getDirectlySplashShakeButton();
                    if (directlySplashShakeButton != null) {
                        ((ShakeView) this.f12024a).replaceShakeCTAButton(directlySplashShakeButton);
                    }
                }
                ((ShakeView) this.f12024a).setNeedHideShakeIcon(z9);
                layoutParams3.setMargins(0, 0, 0, a10);
                z6 = true;
                this.f12024a.setLayoutParams(layoutParams3);
                BaseShakeView baseShakeView = this.f12024a;
                if (!z6 && xVar.f14954o.J() == 1) {
                    r7 = false;
                }
                a(baseShakeView, r7);
            } else if (z9 && this.f11926f.f14954o.C() != 1) {
                this.f12024a = new ShakeBorderThumbView(context);
                layoutParams3.addRule(11);
                layoutParams3.addRule(15);
            } else {
                this.f12024a = new ShakeThumbView(context);
                layoutParams3.addRule(13);
                if (this.f11926f.f14954o.C() == 2) {
                    this.f12024a.setPadding(0, 0, 0, q.a(context, 26.0f));
                }
            }
            z6 = false;
            this.f12024a.setLayoutParams(layoutParams3);
            BaseShakeView baseShakeView2 = this.f12024a;
            if (!z6) {
                r7 = false;
            }
            a(baseShakeView2, r7);
        } else if (i4 == 5 || i4 == 6) {
            this.f12024a = new ShakeNativeBorderThumbView(context);
            this.f12024a.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            a(this.f12024a, xVar.f14954o.J() != 1);
        } else if (i4 == 100) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            this.f12024a = new ShakeBorderThumbView(context);
            layoutParams4.addRule(13);
            this.f12024a.setAlpha(0.0f);
            this.f12024a.setLayoutParams(layoutParams4);
            a(this.f12024a, false);
        }
        BaseShakeView baseShakeView3 = this.f12024a;
        if (baseShakeView3 != null) {
            baseShakeView3.setShakeSetting(this.f11926f.f14954o, this.f11925e.K());
        }
        BaseShakeView baseShakeView4 = this.f12025b;
        if (baseShakeView4 != null) {
            baseShakeView4.setShakeSetting(this.f11926f.f14954o, this.f11925e.K());
        }
    }

    public final boolean b() {
        if (!com.anythink.basead.ui.f.b.a(this.f12031p, this.f11926f)) {
            return false;
        }
        int i = this.f11928h;
        if (i == 1 || i == 2) {
            return this.f12029n;
        }
        return (i == 3 && this.f12030o) ? false : true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        BaseShakeView baseShakeView;
        if (i != 102) {
            if (i != 103) {
                if (i == 105) {
                    e();
                    return;
                }
                if (i == 106) {
                    if (this.f11928h == 3 && com.anythink.basead.b.e.b(this.f11925e)) {
                        b(map);
                        return;
                    }
                    return;
                }
                if (i != 118) {
                    if (i == 119) {
                        e();
                        return;
                    }
                    if (i == 303) {
                        if (this.f11928h == 100) {
                            b(map);
                            return;
                        }
                        return;
                    }
                    if (i != 304) {
                        switch (i) {
                            case 110:
                                this.f12029n = true;
                                break;
                            case 111:
                                this.f12029n = false;
                                break;
                            case 112:
                                break;
                            default:
                                switch (i) {
                                    case 114:
                                        this.f12031p = System.currentTimeMillis();
                                        Object obj = map.get(g.a.f11952a);
                                        boolean z6 = (obj instanceof Integer) && ((Integer) obj).intValue() == 1;
                                        if (z6 && (baseShakeView = this.f12025b) != null) {
                                            ViewGroup.LayoutParams layoutParams = baseShakeView.getLayoutParams();
                                            int a9 = q.a(this.f11924d, 12.0f);
                                            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                                                ((RelativeLayout.LayoutParams) layoutParams).setMargins(a9, 0, 0, q.a(this.f11924d, 48.0f));
                                            }
                                        }
                                        int i4 = this.f11928h;
                                        if (i4 == 1) {
                                            b(map);
                                            c();
                                            break;
                                        } else if (!z6 && (i4 != 2 || com.anythink.basead.b.e.a(this.f11925e))) {
                                            int i6 = this.f11928h;
                                            if (i6 == 5 || i6 == 6) {
                                                b(map);
                                                break;
                                            }
                                        } else {
                                            b(map);
                                            c();
                                            break;
                                        }
                                        break;
                                    case 115:
                                        this.f12030o = true;
                                        break;
                                    case 116:
                                        if (this.f11928h == 3 && !com.anythink.basead.b.e.b(this.f11925e)) {
                                            b(map);
                                            break;
                                        }
                                        break;
                                }
                        }
                        return;
                    }
                    if (this.f11928h != 100) {
                        return;
                    }
                } else if (this.f11928h != 3 || !com.anythink.basead.b.e.b(this.f11925e, this.f11926f)) {
                    return;
                }
            } else if (!c.a(map)) {
                return;
            }
            e();
            return;
        }
        this.f12028m = true;
        if (this.f11928h == 1 && com.anythink.basead.b.e.a(this.f11925e, this.f11926f)) {
            e();
            if (this.f12025b == null || this.f11928h != 1 || com.anythink.basead.b.e.b(this.f11925e) || com.anythink.basead.b.e.a(this.f11925e)) {
                return;
            }
            if (this.f11926f.f14954o.J() == 0 || com.anythink.core.common.v.m.f(this.f11924d) == 2) {
                this.f12025b.setAlpha(1.0f);
                this.f12025b.setVisibility(0);
            }
        }
    }

    private void a(BaseShakeView baseShakeView, boolean z6) {
        if (z6) {
            baseShakeView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.improveclick.j.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.a aVar = j.this.f11930k;
                    if (aVar != null) {
                        aVar.a(1, 5);
                    }
                }
            });
        }
        baseShakeView.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.improveclick.j.3
            @Override // com.anythink.basead.ui.BaseShakeView.a
            public final boolean a() {
                if (!j.this.b()) {
                    return false;
                }
                c.a aVar = j.this.f11930k;
                if (aVar == null) {
                    return true;
                }
                aVar.a(4, 5);
                return true;
            }
        }, this.f11926f.f14954o);
    }
}
