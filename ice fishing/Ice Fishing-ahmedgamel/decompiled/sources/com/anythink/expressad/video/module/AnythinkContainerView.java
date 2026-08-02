package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.video.dynview.i.c;
import com.anythink.expressad.video.dynview.widget.AnyThinkOrderCampView;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.g;
import com.anythink.expressad.video.module.a.a.i;
import com.anythink.expressad.video.module.a.a.k;
import com.anythink.expressad.video.module.a.a.l;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.video.signal.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnythinkContainerView extends AnythinkBaseView implements e, h {

    /* renamed from: A, reason: collision with root package name */
    private int f22260A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22261B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f22262C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f22263D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f22264E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f22265F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f22266G;

    /* renamed from: H, reason: collision with root package name */
    private int f22267H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22268I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f22269K;

    /* renamed from: L, reason: collision with root package name */
    private int f22270L;

    /* renamed from: M, reason: collision with root package name */
    private int f22271M;

    /* renamed from: N, reason: collision with root package name */
    private int f22272N;

    /* renamed from: O, reason: collision with root package name */
    private int f22273O;

    /* renamed from: P, reason: collision with root package name */
    private String f22274P;

    /* renamed from: Q, reason: collision with root package name */
    private b f22275Q;

    /* renamed from: R, reason: collision with root package name */
    private AnyThinkOrderCampView f22276R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22277S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22278T;

    /* renamed from: U, reason: collision with root package name */
    private List<d> f22279U;

    /* renamed from: n, reason: collision with root package name */
    private AnythinkPlayableView f22280n;

    /* renamed from: o, reason: collision with root package name */
    private AnythinkClickCTAView f22281o;

    /* renamed from: p, reason: collision with root package name */
    private AnythinkClickMiniCardView f22282p;

    /* renamed from: q, reason: collision with root package name */
    private AnythinkNativeEndCardView f22283q;

    /* renamed from: r, reason: collision with root package name */
    private AnythinkH5EndCardView f22284r;

    /* renamed from: s, reason: collision with root package name */
    private AnythinkVideoEndCoverView f22285s;

    /* renamed from: t, reason: collision with root package name */
    private AnythinkVastEndCardView f22286t;

    /* renamed from: u, reason: collision with root package name */
    private AnythinkLandingPageView f22287u;

    /* renamed from: v, reason: collision with root package name */
    private AnythinkAlertWebview f22288v;

    /* renamed from: w, reason: collision with root package name */
    private String f22289w;

    /* renamed from: x, reason: collision with root package name */
    private int f22290x;

    /* renamed from: y, reason: collision with root package name */
    private int f22291y;

    /* renamed from: z, reason: collision with root package name */
    private int f22292z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkContainerView$4, reason: invalid class name */
    public class AnonymousClass4 extends i {
        public AnonymousClass4(a aVar) {
            super(aVar);
        }

        @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (i == 100) {
                AnythinkContainerView.this.webviewshow();
                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                anythinkContainerView.onConfigurationChanged(anythinkContainerView.getResources().getConfiguration());
            }
        }
    }

    public AnythinkContainerView(Context context) {
        super(context);
        this.f22291y = 1;
        this.f22292z = 1;
        this.f22260A = 1;
        this.f22261B = false;
        this.f22262C = false;
        this.f22263D = false;
        this.f22264E = false;
        this.f22265F = true;
        this.f22266G = false;
        this.f22268I = false;
        this.J = false;
        this.f22277S = false;
        this.f22278T = false;
        this.f22279U = new ArrayList();
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        d dVar = this.f22229b;
        if (dVar != null) {
            boolean j6 = dVar.j();
            boolean f2 = v.f(this.f22229b.J());
            if (j6 && !f2) {
                i();
                return;
            }
        }
        if (this.f22291y != 2 || this.f22268I) {
            i();
        } else {
            h();
        }
    }

    private void f() {
        if (this.f22286t == null) {
            a(this.f22275Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f22286t, layoutParams);
        this.f22286t.notifyShowListener();
    }

    private void g() {
        if (this.f22287u == null) {
            a(this.f22275Q, (Integer) 4);
        }
        this.f22287u.setUnitId(this.f22289w);
        this.f22287u.preLoadData(this.f22275Q);
        addView(this.f22287u);
    }

    private void h() {
        if (this.f22284r == null) {
            a(this.f22275Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView == null || !anythinkH5EndCardView.isLoadSuccess()) {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.f22284r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.f22284r.setError(true);
            }
        } else {
            this.f22268I = true;
            addView(this.f22284r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f22284r.excuteTask();
            this.f22284r.setNotchValue(this.f22274P, this.f22269K, this.f22270L, this.f22271M, this.f22272N);
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.f22284r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.f22289w);
        }
    }

    private void i() {
        this.f22291y = 1;
        if (this.f22283q == null) {
            a(this.f22275Q, (Integer) 2);
        }
        addView(this.f22283q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22283q.notifyShowListener();
        this.f22278T = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f22285s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f22275Q;
            this.f22275Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f22228a);
                this.f22285s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f22229b);
                this.f22285s.setNotifyListener(new i(this.f22232e));
                this.f22285s.preLoadData(bVar);
            }
        }
        addView(this.f22285s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22278T = true;
        bringToFront();
    }

    private void k() {
        if (this.f22280n == null) {
            preLoadData(this.f22275Q);
        }
        addView(this.f22280n);
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f22289w);
            d dVar = this.f22229b;
            if (dVar != null && dVar.I() && this.f22229b.K() == 2) {
                this.f22280n.setCloseVisible(0);
            }
            this.f22280n.setNotchValue(this.f22274P, this.f22269K, this.f22270L, this.f22271M, this.f22272N);
        }
    }

    private void l() {
        if (this.f22281o == null) {
            b(-1);
        }
        if (this.f22281o != null) {
            d dVar = this.f22229b;
            if (dVar == null || !dVar.j()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f22281o, 0, layoutParams);
            }
        }
    }

    private void m() {
        if (this.f22282p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f22263D && this.f22265F) {
            this.f22265F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f22282p, layoutParams);
    }

    private void n() {
        if (this.f22288v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f22288v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.f22288v);
        }
        addView(this.f22288v);
    }

    private void o() {
        if (this.f22288v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f22228a);
            this.f22288v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.f22289w);
            this.f22288v.setCampaign(this.f22229b);
        }
        this.f22288v.preLoadData(this.f22275Q);
    }

    private void p() {
        this.f22262C = false;
        this.f22278T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AnythinkContainerView) {
                    i++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    private void q() {
        d dVar = this.f22229b;
        if (dVar == null) {
            return;
        }
        String J = dVar.J();
        int i = 404;
        if (!TextUtils.isEmpty(J)) {
            try {
                i = Integer.parseInt(z.a(J, "ecid"));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        this.f22283q = new AnythinkNativeEndCardView(this.f22228a, null, true, i, this.f22229b.e() == 2, this.f22238l, this.f22229b.au());
        if (this.f22229b.k() != 5) {
            this.f22283q.setCampaign(this.f22229b);
            return;
        }
        a aVar = this.f22232e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f22229b);
        }
        this.f22283q.setCampaign(this.f22229b);
    }

    public void addOrderViewData(List<d> list) {
        if (list == null) {
            return;
        }
        this.f22279U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f22283q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f22287u;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i4, int i6) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f22282p.resizeMiniCard(i, i4);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.f22261B;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        return anythinkH5EndCardView == null ? this.f22280n : anythinkH5EndCardView;
    }

    public d getReSetCampaign() {
        if (!this.f22229b.j() || !TextUtils.isEmpty(this.f22229b.J())) {
            return null;
        }
        int size = this.f22279U.size();
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                if (this.f22279U.get(i4) != null && this.f22279U.get(i4).bh() == this.f22229b.bh()) {
                    i = i4 - 1;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f22279U.get(i) == null) {
            return null;
        }
        return this.f22279U.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f22263D;
    }

    public String getUnitID() {
        return this.f22289w;
    }

    public int getVideoInteractiveType() {
        return this.f22290x;
    }

    public int getVideoSkipTime() {
        return this.f22267H;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.f22268I) {
                return;
            }
        }
        e();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        if (isLast()) {
            return;
        }
        if (this.f22277S && !this.f22278T) {
            p();
            this.f22277S = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f22288v;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f22288v);
        AnythinkClickCTAView anythinkClickCTAView = this.f22281o;
        if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
            return;
        }
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(d dVar) {
        this.f22232e.a(105, dVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.f22232e.a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.f22262C;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f22280n, this.f22281o, this.f22282p, this.f22283q, this.f22284r, this.f22286t, this.f22287u, this.f22285s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    public void onEndcardBackPress() {
        if (this.f22283q != null || this.f22286t != null) {
            this.f22232e.a(104, "");
            return;
        }
        if (this.f22287u != null) {
            this.f22232e.a(103, "");
            return;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f22262C) {
            this.f22232e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f22280n, this.f22282p, this.f22284r, this.f22288v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.f22275Q = bVar;
        d dVar = this.f22229b;
        if (dVar != null) {
            if (dVar.K() == 2) {
                if (this.f22280n == null) {
                    this.f22280n = new AnythinkPlayableView(this.f22228a);
                }
                this.f22280n.setCloseDelayShowTime(this.f22292z);
                this.f22280n.setPlayCloseBtnTm(this.f22260A);
                this.f22280n.setCampaign(this.f22229b);
                this.f22280n.setNotifyListener(new AnonymousClass4(this.f22232e));
                this.f22280n.preLoadData(bVar);
            } else {
                b(this.f22290x);
                if (this.f22229b.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.f22229b.G()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f22229b.G()));
                            }
                        });
                    }
                    v.f(this.f22229b.J());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f22229b.G()));
                        }
                    }, getVideoSkipTime());
                }
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.f22284r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f22287u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f22283q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f22283q.release();
        }
        if (this.f22232e != null) {
            this.f22232e = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i4, int i6) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i4);
            this.f22282p.setRadius(i6);
            removeAllViews();
            setMatchParent();
            this.f22278T = true;
            bringToFront();
            m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.f22282p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i) {
        this.f22292z = i;
    }

    public void setEndscreenType(int i) {
        this.f22291y = i;
    }

    public void setJSFactory(b bVar) {
        this.f22275Q = bVar;
    }

    public void setNotchPadding(int i, int i4, int i6, int i9, int i10) {
        String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i));
        this.f22273O = i;
        this.f22269K = i4;
        this.f22270L = i6;
        this.f22271M = i9;
        this.f22272N = i10;
        this.f22274P = com.anythink.expressad.foundation.h.i.a(i, i4, i6, i9, i10);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f22283q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i4, i6, i9, i10);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.f22326s != null) {
            anythinkH5EndCardView.setNotchValue(this.f22274P, i4, i6, i9, i10);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f22284r.f22326s, "oncutoutfetched", Base64.encodeToString(this.f22274P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null && anythinkPlayableView.f22326s != null) {
            anythinkPlayableView.setNotchValue(this.f22274P, i4, i6, i9, i10);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f22280n.f22326s, "oncutoutfetched", Base64.encodeToString(this.f22274P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.f22276R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i4, i6, i9, i10);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f22280n, this.f22281o, this.f22282p, this.f22283q, this.f22284r, this.f22286t, this.f22287u, this.f22285s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f22282p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f22283q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f22283q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f22260A = i;
    }

    public void setRewardStatus(boolean z6) {
        this.J = z6;
    }

    public void setShowingTransparent(boolean z6) {
        this.f22263D = z6;
    }

    public void setUnitID(String str) {
        this.f22289w = str;
    }

    public void setVideoInteractiveType(int i) {
        d dVar = this.f22229b;
        if (dVar == null || !dVar.j()) {
            this.f22290x = i;
            return;
        }
        int a9 = c.a(this.f22229b);
        if (a9 == 100) {
            this.f22290x = i;
        } else {
            this.f22290x = a9;
        }
    }

    public void setVideoSkipTime(int i) {
        this.f22267H = i;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.f22288v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f22278T) {
            removeAllViews();
            bringToFront();
            this.f22277S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f22288v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.f22288v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.f22288v);
        }
        addView(this.f22288v);
        setBackgroundColor(0);
        this.f22288v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        d dVar = this.f22229b;
        if (dVar != null) {
            if (i == 1) {
                a aVar = this.f22232e;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            } else if (i == 100) {
                if (dVar.K() == 2) {
                    this.f22264E = true;
                }
                a(this.f22280n);
                setMatchParent();
                i();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f22286t == null) {
                    a(this.f22275Q, (Integer) 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f22286t, layoutParams);
                this.f22286t.notifyShowListener();
                this.f22278T = true;
                bringToFront();
            } else if (i == 4) {
                a aVar2 = this.f22232e;
                if (aVar2 != null) {
                    aVar2.a(113, "");
                }
                removeAllViews();
                setMatchParent();
                if (this.f22287u == null) {
                    a(this.f22275Q, (Integer) 4);
                }
                this.f22287u.setUnitId(this.f22289w);
                this.f22287u.preLoadData(this.f22275Q);
                addView(this.f22287u);
                this.f22278T = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f22278T = true;
                bringToFront();
                e();
                a aVar3 = this.f22232e;
                if (aVar3 != null) {
                    aVar3.a(117, "");
                }
            } else {
                a aVar4 = this.f22232e;
                if (aVar4 != null) {
                    aVar4.a(106, "");
                }
            }
        }
        this.f22261B = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i4, int i6, int i9, int i10) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i4, i6, i9);
            this.f22282p.setRadius(i10);
            this.f22282p.setCloseVisible(8);
            this.f22282p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f22278T = true;
            bringToFront();
            m();
            if (this.f22266G) {
                return;
            }
            this.f22266G = true;
            this.f22232e.a(a.f22543z, "");
            this.f22232e.a(117, "");
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f22228a);
        this.f22276R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.f22279U);
        a aVar = this.f22232e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f22279U);
        }
        this.f22276R.setNotifyListener(new i(this.f22232e));
        this.f22276R.setRewarded(this.J);
        this.f22276R.setNotchPadding(this.f22269K, this.f22270L, this.f22271M, this.f22272N);
        this.f22276R.setCampOrderViewBuildCallback(new com.anythink.expressad.video.dynview.f.b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.f.b
            public final void a() {
                a aVar2 = AnythinkContainerView.this.f22232e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.b
            public final void b() {
                if (AnythinkContainerView.this.f22229b.e() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.f22229b.G());
                }
            }
        });
        this.f22276R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.f22229b == null || this.f22264E) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.f22280n == null) {
            preLoadData(this.f22275Q);
        }
        addView(this.f22280n);
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f22289w);
            d dVar = this.f22229b;
            if (dVar != null && dVar.I() && this.f22229b.K() == 2) {
                this.f22280n.setCloseVisible(0);
            }
            this.f22280n.setNotchValue(this.f22274P, this.f22269K, this.f22270L, this.f22271M, this.f22272N);
        }
        this.f22278T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        d dVar;
        if (this.f22229b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                p();
                return;
            }
            if (i == 1) {
                if (this.f22261B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.f22284r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.f22282p);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.f22281o;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        d dVar2 = this.f22229b;
                        if (dVar2 != null && dVar2.K() == 1) {
                            this.f22278T = true;
                            if (this.f22281o == null) {
                                b(-1);
                            }
                            if (this.f22281o != null && ((dVar = this.f22229b) == null || !dVar.j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f22281o, 0, layoutParams);
                            }
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            AnythinkClickCTAView anythinkClickCTAView2 = this.f22281o;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.f22281o);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.f22288v;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f22282p;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        d dVar3 = this.f22229b;
                        if (dVar3 != null && dVar3.K() == 1) {
                            setMatchParent();
                            m();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    p();
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.f22284r;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.f22284r);
                }
                a aVar = this.f22232e;
                if (aVar != null) {
                    aVar.a(112, "");
                }
                d dVar4 = this.f22229b;
                if (dVar4 != null && !dVar4.ay()) {
                    this.f22229b.az();
                    com.anythink.expressad.video.module.b.a.e(this.f22228a, this.f22229b);
                }
                if (this.f22263D) {
                    a aVar2 = this.f22232e;
                    if (aVar2 != null) {
                        aVar2.a(115, "");
                    }
                } else {
                    this.f22278T = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f22262C = true;
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f22285s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f22275Q;
            this.f22275Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f22228a);
                this.f22285s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f22229b);
                this.f22285s.setNotifyListener(new i(this.f22232e));
                this.f22285s.preLoadData(bVar);
            }
        }
        addView(this.f22285s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f22278T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f22280n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f22284r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        a aVar;
        if (this.f22229b == null || (aVar = this.f22232e) == null) {
            return;
        }
        aVar.a(122, "");
        this.f22232e.a(104, "");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f22280n, this.f22282p, this.f22284r, this.f22288v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }

    private boolean a() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        }
    }

    private static void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private void b(b bVar) {
        this.f22275Q = bVar;
        if (this.f22285s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f22228a);
            this.f22285s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f22229b);
            this.f22285s.setNotifyListener(new i(this.f22232e));
            this.f22285s.preLoadData(bVar);
        }
    }

    private void a(b bVar) {
        if (this.f22280n == null) {
            this.f22280n = new AnythinkPlayableView(this.f22228a);
        }
        this.f22280n.setCloseDelayShowTime(this.f22292z);
        this.f22280n.setPlayCloseBtnTm(this.f22260A);
        this.f22280n.setCampaign(this.f22229b);
        this.f22280n.setNotifyListener(new AnonymousClass4(this.f22232e));
        this.f22280n.preLoadData(bVar);
    }

    private void b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f22281o == null) {
                    AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(this.f22228a);
                    this.f22281o = anythinkClickCTAView;
                    anythinkClickCTAView.setCampaign(this.f22229b);
                    this.f22281o.setUnitId(this.f22289w);
                    this.f22281o.setNotifyListener(new i(this.f22232e));
                    this.f22281o.preLoadData(this.f22275Q);
                    return;
                }
                return;
            }
            d dVar = this.f22229b;
            if (dVar == null || dVar.G() != 2) {
                return;
            }
            if (this.f22282p == null) {
                this.f22282p = new AnythinkClickMiniCardView(this.f22228a);
            }
            this.f22282p.setCampaign(this.f22229b);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.f22282p;
            anythinkClickMiniCardView.setNotifyListener(new g(anythinkClickMiniCardView, this.f22232e));
            this.f22282p.preLoadData(this.f22275Q);
            setMatchParent();
            m();
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        d dVar;
        this.f22275Q = bVar;
        d dVar2 = this.f22229b;
        if (dVar2 != null) {
            if (num == null) {
                num = Integer.valueOf(dVar2.G());
            }
            if (!isLast()) {
                p();
            }
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 3) {
                    if (this.f22286t == null) {
                        this.f22286t = new AnythinkVastEndCardView(this.f22228a);
                    }
                    this.f22286t.setCampaign(this.f22229b);
                    this.f22286t.setNotifyListener(new l(this.f22232e));
                    this.f22286t.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f22287u == null) {
                        this.f22287u = new AnythinkLandingPageView(this.f22228a);
                    }
                    this.f22287u.setCampaign(this.f22229b);
                    this.f22287u.setNotifyListener(new i(this.f22232e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f22291y == 2) {
                        boolean j6 = this.f22229b.j();
                        boolean f2 = v.f(this.f22229b.J());
                        if ((!j6 || f2 || (dVar = this.f22229b) == null || dVar.I()) && this.f22229b.e() != 2) {
                            if (this.f22284r == null) {
                                this.f22284r = new AnythinkH5EndCardView(this.f22228a);
                            }
                            if (this.f22229b.k() == 5 && (aVar = this.f22232e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f22229b);
                            }
                            this.f22284r.setCampaign(this.f22229b);
                            this.f22284r.setCloseDelayShowTime(this.f22292z);
                            this.f22284r.setNotifyListener(new i(this.f22232e));
                            this.f22284r.setUnitId(this.f22289w);
                            this.f22284r.setNotchValue(this.f22274P, this.f22269K, this.f22270L, this.f22271M, this.f22272N);
                            this.f22284r.preLoadData(bVar);
                            if (this.f22263D) {
                                return;
                            }
                            addView(this.f22284r);
                            return;
                        }
                        return;
                    }
                    d dVar3 = this.f22229b;
                    int c9 = (dVar3 == null || dVar3.N() == null) ? 0 : this.f22229b.N().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.f22283q;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.f22229b.j()) {
                            q();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f22228a, null, false, -1, this.f22229b.e() == 2, c9, this.f22229b.au());
                            this.f22283q = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.f22229b);
                        }
                    }
                    this.f22283q.setLayout();
                    this.f22283q.setCampaign(this.f22229b);
                    this.f22283q.setUnitId(this.f22289w);
                    this.f22283q.setCloseBtnDelay(this.f22292z);
                    this.f22283q.setNotifyListener(new i(this.f22232e));
                    this.f22283q.preLoadData(bVar);
                    this.f22283q.setNotchPadding(this.f22269K, this.f22270L, this.f22271M, this.f22272N);
                }
            }
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22291y = 1;
        this.f22292z = 1;
        this.f22260A = 1;
        this.f22261B = false;
        this.f22262C = false;
        this.f22263D = false;
        this.f22264E = false;
        this.f22265F = true;
        this.f22266G = false;
        this.f22268I = false;
        this.J = false;
        this.f22277S = false;
        this.f22278T = false;
        this.f22279U = new ArrayList();
    }

    private void b(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    private void a(a aVar, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f22282p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, AnythinkBaseView... anythinkBaseViewArr) {
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null && (anythinkBaseView instanceof AnythinkClickMiniCardView)) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            } else if (anythinkBaseView != null && anythinkBaseView.getVisibility() == 0 && anythinkBaseView.getParent() != null && !isLast()) {
                anythinkBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(AnythinkH5EndCardView... anythinkH5EndCardViewArr) {
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0 && anythinkH5EndCardView.getParent() != null && !isLast()) {
                anythinkH5EndCardView.webviewshow();
            }
        }
    }
}
