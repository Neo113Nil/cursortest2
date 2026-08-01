package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.basead.b.e;
import com.anythink.basead.ui.FullScreenHeaderPanelView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.f.d;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FullScreenATView extends BaseScreenATView {
    public static final String TAG = "FullScreenATView";
    LinearLayout ah;
    TextView ai;
    ImageView aj;
    private CountDownCloseView ak;
    private CloseHeaderView al;
    private PanelView am;
    private d an;
    private FullScreenHeaderPanelView ao;
    private long ap;
    private long aq;

    public FullScreenATView(Context context) {
        super(context);
    }

    private void ag() {
        this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (o()) {
            this.f9851M.addView(this.f9853O, 0);
            return;
        }
        if (b(this.f9844E)) {
            PanelView aa = aa();
            int i = this.f9844E;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i6 = this.f9865d;
                        int i9 = (int) (i6 * 0.5f);
                        this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i6 - i9));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = this.f9864c;
                            layoutParams.height = i9;
                            aa.setLayoutParams(layoutParams);
                            aa.removeAllViews();
                            aa.setLayoutType(this.f9844E);
                        }
                    } else if (i != 6) {
                        if (this.f9735f.f14168o.J() != 0) {
                            View shakeView = aa.getShakeView();
                            if (n()) {
                                if (shakeView != null) {
                                    shakeView.setVisibility(0);
                                }
                            } else if (shakeView != null) {
                                shakeView.setVisibility(8);
                            }
                        }
                    }
                }
                int a9 = q.a(getContext(), 300.0f);
                this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(this.f9864c - a9, -1));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a9;
                    layoutParams2.height = -1;
                    aa.setLayoutParams(layoutParams2);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f9844E);
                }
            } else {
                this.f9851M.setBackgroundColor(-1);
                int i10 = (int) (this.f9865d * 0.5f);
                int a10 = TextUtils.isEmpty(this.f9736g.z()) ? this.f9865d - i10 : (this.f9865d - i10) + q.a(getContext(), 50.0f);
                this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                this.f9853O.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f9864c;
                    layoutParams3.height = a10;
                    aa.setLayoutParams(layoutParams3);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f9844E);
                }
            }
        }
        this.f9851M.addView(this.f9853O, 0);
    }

    private void ah() {
        if (((BaseScreenATView) this).f9862a == 1 && this.J) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(q.a(getContext(), "myoffer_reward_icon", k.f19632c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q.a(getContext(), 60.0f), q.a(getContext(), 60.0f));
            int i = 2;
            if (b(this.f9844E)) {
                int i6 = this.f9844E;
                if (i6 == 2 || i6 == 6) {
                    layoutParams.leftMargin = this.f9864c - q.a(getContext(), 330.0f);
                    layoutParams.topMargin = q.a(getContext(), 22.0f);
                } else {
                    layoutParams.leftMargin = q.a(getContext(), 12.0f);
                    layoutParams.topMargin = q.a(getContext(), 12.0f);
                }
            } else {
                layoutParams.leftMargin = q.a(getContext(), 12.0f);
                layoutParams.topMargin = q.a(getContext(), 12.0f);
            }
            roundImageView.setLayoutParams(layoutParams);
            try {
                i = this.f9851M.indexOfChild(this.f9852N) + 1;
            } catch (Throwable unused) {
            }
            this.f9851M.addView(roundImageView, i);
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private boolean ai() {
        return ((BaseScreenATView) this).f9862a == 1 && this.f9845F != 100;
    }

    private boolean aj() {
        if (((BaseScreenATView) this).f9862a != 1) {
            return false;
        }
        int i = this.f9845F;
        return i == 1 || i == 101;
    }

    private boolean ak() {
        return Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        if (Y() || ((BaseScreenATView) this).f9862a != 1 || this.f9735f.f14168o.bj() <= 0) {
            return;
        }
        long min = Math.min(this.f9847H, this.f9846G);
        this.ap = Math.max(0L, min - this.f9735f.f14168o.bj());
        this.aq = Math.min(min, this.f9735f.f14168o.bj());
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void H() {
        PanelView panelView = this.am;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.am.init(this.f9736g, this.f9735f, this.f9863b, n(), new PanelView.a() { // from class: com.anythink.basead.ui.FullScreenATView.3
                @Override // com.anythink.basead.ui.PanelView.a
                public final void a(int i, int i6) {
                    FullScreenATView.this.a(i, i6);
                }

                @Override // com.anythink.basead.ui.PanelView.a
                public final boolean a() {
                    if (!FullScreenATView.this.J()) {
                        return false;
                    }
                    FullScreenATView.this.a(4, 5);
                    return true;
                }
            });
        }
        super.H();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void I() {
        super.I();
        if (e.a(this.f9736g)) {
            this.f9844E = 0;
        } else {
            this.f9844E = 8;
        }
        PanelView panelView = this.f9852N;
        if (panelView != null) {
            panelView.setLayoutType(this.f9844E);
            if (this.f9844E == 8 && this.f9735f.f14168o.J() == 0) {
                this.f9852N.getCTAButton().setVisibility(8);
            }
        }
        PanelView panelView2 = this.am;
        if (panelView2 != null) {
            panelView2.setLayoutType(this.f9844E);
            if (this.f9844E == 8 && this.f9735f.f14168o.J() == 0) {
                this.am.getCTAButton().setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void L() {
        super.L();
        if (ai()) {
            if (this.f9845F != 101) {
                CountDownCloseView countDownCloseView = this.ak;
                if (countDownCloseView != null) {
                    countDownCloseView.setVisibility(0);
                    return;
                }
                return;
            }
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null) {
                closeHeaderView.setVisibility(0);
                if (this.al.getCloseImageView() != null) {
                    this.al.getCloseImageView().setVisibility(0);
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void M() {
        int aC = this.f9735f.f14168o.aC();
        int i = ((BaseScreenATView) this).f9862a;
        if (i != 1) {
            if (i != 3) {
                c(1);
                return;
            }
            if (this.f9848I) {
                c(1);
                return;
            }
            N();
            if (aC == 1 || aC == 2) {
                c(1);
                return;
            }
            if (p()) {
                this.f9744p = true;
            }
            x();
            return;
        }
        if (this.f9744p) {
            c(1);
            return;
        }
        if (this.J) {
            if (aC == 1 || aC == 3) {
                N();
                c(1);
                return;
            } else {
                N();
                if (p()) {
                    this.f9744p = true;
                }
                x();
                return;
            }
        }
        if (aC == 1 || aC == 2) {
            try {
                Toast.makeText(getContext().getApplicationContext(), getContext().getString(q.a(getContext(), "myoffer_reward_exit_tips_msg", k.f19636g)), 0).show();
            } catch (Throwable unused) {
            }
            N();
            c(1);
            return;
        }
        double ceil = Math.ceil(this.f9847H / 1000.0d);
        if (this.f9746r != null) {
            double ceil2 = Math.ceil(r2.h() / 1000.0d);
            if (ceil > ceil2) {
                ceil = ceil2;
            }
        }
        RewardExitConfirmDialogActivity.a(getContext(), String.valueOf((int) ceil), new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.4
            @Override // java.lang.Runnable
            public final void run() {
                FullScreenATView.this.N();
                FullScreenATView.this.c(1);
            }
        }, ai() ? 2 : 1);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void O() {
        super.O();
        if (ai()) {
            S();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void P() {
        super.P();
        if (this.f9845F != 100) {
            d(8);
        }
        al();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void Q() {
        super.Q();
        d dVar = this.an;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void R() {
        super.R();
        d dVar = this.an;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void U() {
        BaseEndCardView baseEndCardView;
        if (this.f9851M == null || (baseEndCardView = this.f9853O) == null || baseEndCardView.getParent() != null) {
            return;
        }
        if (!e.a(this.f9736g, this.f9735f)) {
            af();
            return;
        }
        this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (!o() && b(this.f9844E)) {
            PanelView aa = aa();
            int i = this.f9844E;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i6 = this.f9865d;
                        int i9 = (int) (i6 * 0.5f);
                        this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i6 - i9));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = this.f9864c;
                            layoutParams.height = i9;
                            aa.setLayoutParams(layoutParams);
                            aa.removeAllViews();
                            aa.setLayoutType(this.f9844E);
                        }
                    } else if (i != 6) {
                        if (this.f9735f.f14168o.J() != 0) {
                            View shakeView = aa.getShakeView();
                            if (n()) {
                                if (shakeView != null) {
                                    shakeView.setVisibility(0);
                                }
                            } else if (shakeView != null) {
                                shakeView.setVisibility(8);
                            }
                        }
                    }
                }
                int a9 = q.a(getContext(), 300.0f);
                this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(this.f9864c - a9, -1));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a9;
                    layoutParams2.height = -1;
                    aa.setLayoutParams(layoutParams2);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f9844E);
                }
            } else {
                this.f9851M.setBackgroundColor(-1);
                int i10 = (int) (this.f9865d * 0.5f);
                int a10 = TextUtils.isEmpty(this.f9736g.z()) ? this.f9865d - i10 : (this.f9865d - i10) + q.a(getContext(), 50.0f);
                this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                this.f9853O.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aa.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f9864c;
                    layoutParams3.height = a10;
                    aa.setLayoutParams(layoutParams3);
                    aa.removeAllViews();
                    aa.setLayoutType(this.f9844E);
                }
            }
        }
        this.f9851M.addView(this.f9853O, 0);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void V() {
        super.V();
        if (((BaseScreenATView) this).f9862a == 1 && this.J) {
            RoundImageView roundImageView = new RoundImageView(getContext().getApplicationContext());
            roundImageView.setImageResource(q.a(getContext(), "myoffer_reward_icon", k.f19632c));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q.a(getContext(), 60.0f), q.a(getContext(), 60.0f));
            int i = 2;
            if (b(this.f9844E)) {
                int i6 = this.f9844E;
                if (i6 == 2 || i6 == 6) {
                    layoutParams.leftMargin = this.f9864c - q.a(getContext(), 330.0f);
                    layoutParams.topMargin = q.a(getContext(), 22.0f);
                } else {
                    layoutParams.leftMargin = q.a(getContext(), 12.0f);
                    layoutParams.topMargin = q.a(getContext(), 12.0f);
                }
            } else {
                layoutParams.leftMargin = q.a(getContext(), 12.0f);
                layoutParams.topMargin = q.a(getContext(), 12.0f);
            }
            roundImageView.setLayoutParams(layoutParams);
            try {
                i = this.f9851M.indexOfChild(this.f9852N) + 1;
            } catch (Throwable unused) {
            }
            this.f9851M.addView(roundImageView, i);
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (o()) {
            PanelView panelView = this.f9852N;
            if (panelView != null) {
                panelView.setVisibility(8);
            }
            PanelView panelView2 = this.am;
            if (panelView2 != null) {
                panelView2.setVisibility(8);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final CloseImageView X() {
        if (ai()) {
            if (this.f9845F == 101) {
                CloseHeaderView closeHeaderView = this.al;
                if (closeHeaderView != null && closeHeaderView.getCloseImageView() != null) {
                    return this.al.getCloseImageView();
                }
            } else {
                CountDownCloseView countDownCloseView = this.ak;
                if (countDownCloseView != null) {
                    return countDownCloseView;
                }
            }
        }
        return super.X();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final ViewGroup Z() {
        CloseHeaderView closeHeaderView = this.al;
        return (closeHeaderView == null || closeHeaderView.getVisibility() != 0 || this.al.getFeedbackButton() == null) ? super.Z() : this.al.getFeedbackButton();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final PanelView aa() {
        PanelView panelView;
        PanelView panelView2;
        return (e.a(this.f9736g, this.f9735f) || (panelView2 = this.am) == null) ? (this.f9848I || this.f9845F == 1 || (panelView = this.am) == null) ? super.aa() : panelView : panelView2;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void ab() {
        PanelView panelView;
        if (Y()) {
            return;
        }
        if (((BaseScreenATView) this).f9862a != 1 || this.f9845F == 100) {
            super.ab();
            if (!p() || (panelView = this.am) == null) {
                return;
            }
            panelView.setVisibility(8);
            return;
        }
        com.anythink.basead.ui.component.a aVar = this.f9746r;
        if (aVar == null || !aVar.a()) {
            return;
        }
        final BasePlayerView l9 = this.f9746r.l();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -getMeasuredWidth(), 0.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.4f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.basead.ui.FullScreenATView.5
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                View view = l9;
                if (view != null) {
                    view.post(new Runnable() { // from class: com.anythink.basead.ui.FullScreenATView.5.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            FullScreenATView.super.ab();
                            if (FullScreenATView.this.am != null) {
                                FullScreenATView.this.am.setVisibility(8);
                            }
                        }
                    });
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        l9.startAnimation(animationSet);
        PanelView panelView2 = this.am;
        if (panelView2 == null || panelView2.getVisibility() != 0) {
            return;
        }
        this.am.startAnimation(animationSet);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void ad() {
        super.ad();
        TextView textView = this.ai;
        if (textView != null) {
            textView.setText(getContext().getString(q.a(getContext(), "myoffer_reward_tips_rewarded", k.f19636g)));
        }
        ImageView imageView = this.aj;
        if (imageView != null) {
            imageView.setImageResource(q.a(getContext(), "reward_tips_icon_check", k.f19632c));
        }
    }

    public final void af() {
        this.f9853O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (o()) {
            this.f9851M.addView(this.f9853O, 0);
        } else {
            aa().setVisibility(0);
            this.f9851M.addView(this.f9853O, 0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void d() {
        super.d();
        if (this.f9746r == null || !ai()) {
            return;
        }
        if (this.f9747s != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(g.a.f11174j, Integer.valueOf(this.f9845F));
            this.f9747s.a(hashMap);
        }
        a(125);
        this.f9746r.e(this.f9845F);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void e(int i) {
        if (!ai()) {
            super.e(i);
            return;
        }
        this.f9855Q.setVisibility(8);
        com.anythink.basead.ui.component.b bVar = this.f9860V;
        if (bVar != null) {
            bVar.a(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final int r() {
        return 1;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final c.a s() {
        return new c.b() { // from class: com.anythink.basead.ui.FullScreenATView.6
            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void a() {
                FullScreenATView.this.C();
            }

            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void b() {
                FullScreenATView.this.E();
            }

            @Override // com.anythink.basead.ui.improveclick.c.b
            public final void a(long j6) {
                if (j6 <= 0) {
                    FullScreenATView.this.ad();
                    FullScreenATView.this.c(1);
                    return;
                }
                FullScreenATView fullScreenATView = FullScreenATView.this;
                fullScreenATView.f9847H = Math.max(0L, fullScreenATView.f9847H - j6);
                FullScreenATView fullScreenATView2 = FullScreenATView.this;
                if (fullScreenATView2.J) {
                    return;
                }
                fullScreenATView2.al();
                FullScreenATView fullScreenATView3 = FullScreenATView.this;
                if (fullScreenATView3.f9847H <= 0) {
                    fullScreenATView3.ad();
                    return;
                }
                com.anythink.basead.ui.component.a aVar = fullScreenATView3.f9746r;
                if (aVar != null) {
                    long i = aVar.i();
                    if (i > 0) {
                        FullScreenATView fullScreenATView4 = FullScreenATView.this;
                        if (i >= fullScreenATView4.f9847H) {
                            fullScreenATView4.ad();
                        } else {
                            fullScreenATView4.b(fullScreenATView4.f9746r.i());
                        }
                    }
                }
            }

            @Override // com.anythink.basead.ui.improveclick.c.a
            public final void a(int i, int i6) {
                FullScreenATView.this.a(i, i6);
            }
        };
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void x() {
        if (Y()) {
            return;
        }
        super.x();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public int y() {
        com.anythink.basead.ui.f.a aVar;
        int i = this.f9844E;
        if (i == 8) {
            return i;
        }
        if (this.f9864c < this.f9865d) {
            return this.af >= this.ag ? 1 : 5;
        }
        if (e.a(this.f9736g, this.f9735f) && (aVar = this.f9859U) != null) {
            aVar.a();
        }
        return this.af < this.ag ? 2 : 6;
    }

    public FullScreenATView(Context context, x xVar, w wVar, String str, int i, int i6) {
        super(context, xVar, wVar, str, i, i6);
        setId(q.a(getContext(), "myoffer_full_screen_view_id", "id"));
        if (xVar != null) {
            this.an = new d(wVar, xVar.f14168o);
        }
        this.ap = -1L;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_full_screen", "layout"), this);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void b() {
        super.b();
        d dVar = this.an;
        if (dVar != null) {
            dVar.a(this.f9844E == 8 ? d.f10800b : -100).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.FullScreenATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i6) {
                    FullScreenATView.this.a(i, i6);
                }
            }).a(getContext(), this);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void c() {
        super.c();
        this.ak = (CountDownCloseView) findViewById(q.a(getContext(), "myoffer_btn_countdown_close_id", "id"));
        this.al = (CloseHeaderView) findViewById(q.a(getContext(), "myoffer_btn_close_header_view_id", "id"));
        this.am = (PanelView) findViewById(q.a(getContext(), "myoffer_banner_view_for_anim_player_id", "id"));
        FullScreenHeaderPanelView fullScreenHeaderPanelView = (FullScreenHeaderPanelView) findViewById(q.a(getContext(), "myoffer_header_panel_view_id", "id"));
        this.ao = fullScreenHeaderPanelView;
        if (fullScreenHeaderPanelView != null && e.a(this.f9736g)) {
            this.ao.initSetting(this.f9736g, this.f9735f, new FullScreenHeaderPanelView.a() { // from class: com.anythink.basead.ui.FullScreenATView.2
                @Override // com.anythink.basead.ui.FullScreenHeaderPanelView.a
                public final void a() {
                    FullScreenATView.this.a(1, 23);
                }
            });
            this.f9858T = this.ao;
        }
        this.ah = (LinearLayout) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_ll_id", "id"));
        this.ai = (TextView) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_id", "id"));
        this.aj = (ImageView) findViewById(q.a(getContext(), "myoffer_tv_reward_tips_icon_id", "id"));
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        if (Y()) {
            this.f9848I = true;
            com.anythink.basead.ui.component.a aVar = this.f9746r;
            boolean z3 = aVar != null && aVar.a(str, iOfferClickHandler);
            if (z3) {
                a(105);
                d dVar = this.an;
                if (dVar != null) {
                    dVar.a();
                }
            }
            return z3;
        }
        return super.a(str, iOfferClickHandler);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public boolean b(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 5 || i == 6) {
            return e.a(this.f9736g);
        }
        return i == 8;
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void b(long j6) {
        if (ai()) {
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
                this.al.refresh(j6);
            }
            CountDownCloseView countDownCloseView = this.ak;
            if (countDownCloseView != null && countDownCloseView.getVisibility() == 0) {
                this.ak.refresh(j6);
            }
        } else {
            super.b(j6);
        }
        long j9 = this.ap;
        if (j9 < 0 || j6 < j9) {
            return;
        }
        LinearLayout linearLayout = this.ah;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            this.ah.setVisibility(0);
        }
        TextView textView = this.ai;
        if (textView == null || this.aq <= j6 - this.ap) {
            return;
        }
        textView.setText(String.format(getContext().getString(q.a(getContext(), "myoffer_reward_tips", k.f19636g)), Integer.valueOf((((int) (this.aq - (j6 - this.ap))) / 1000) + 1)));
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void a(long j6) {
        int i;
        if (((BaseScreenATView) this).f9862a == 1 && ((i = this.f9845F) == 1 || i == 101)) {
            return;
        }
        super.a(j6);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void c(long j6) {
        if (ai()) {
            CloseHeaderView closeHeaderView = this.al;
            if (closeHeaderView != null && closeHeaderView.getVisibility() == 0) {
                this.al.setDuration(j6);
            }
            CountDownCloseView countDownCloseView = this.ak;
            if (countDownCloseView == null || countDownCloseView.getVisibility() != 0) {
                return;
            }
            this.ak.setDuration(j6);
            return;
        }
        super.c(j6);
    }
}
