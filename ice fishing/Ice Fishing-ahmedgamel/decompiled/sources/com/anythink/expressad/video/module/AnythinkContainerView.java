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
    private int f21473A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f21474B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f21475C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f21476D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21477E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21478F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21479G;

    /* renamed from: H, reason: collision with root package name */
    private int f21480H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21481I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f21482K;

    /* renamed from: L, reason: collision with root package name */
    private int f21483L;

    /* renamed from: M, reason: collision with root package name */
    private int f21484M;

    /* renamed from: N, reason: collision with root package name */
    private int f21485N;

    /* renamed from: O, reason: collision with root package name */
    private int f21486O;

    /* renamed from: P, reason: collision with root package name */
    private String f21487P;

    /* renamed from: Q, reason: collision with root package name */
    private b f21488Q;

    /* renamed from: R, reason: collision with root package name */
    private AnyThinkOrderCampView f21489R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21490S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21491T;

    /* renamed from: U, reason: collision with root package name */
    private List<d> f21492U;

    /* renamed from: n, reason: collision with root package name */
    private AnythinkPlayableView f21493n;

    /* renamed from: o, reason: collision with root package name */
    private AnythinkClickCTAView f21494o;

    /* renamed from: p, reason: collision with root package name */
    private AnythinkClickMiniCardView f21495p;

    /* renamed from: q, reason: collision with root package name */
    private AnythinkNativeEndCardView f21496q;

    /* renamed from: r, reason: collision with root package name */
    private AnythinkH5EndCardView f21497r;

    /* renamed from: s, reason: collision with root package name */
    private AnythinkVideoEndCoverView f21498s;

    /* renamed from: t, reason: collision with root package name */
    private AnythinkVastEndCardView f21499t;

    /* renamed from: u, reason: collision with root package name */
    private AnythinkLandingPageView f21500u;

    /* renamed from: v, reason: collision with root package name */
    private AnythinkAlertWebview f21501v;

    /* renamed from: w, reason: collision with root package name */
    private String f21502w;

    /* renamed from: x, reason: collision with root package name */
    private int f21503x;

    /* renamed from: y, reason: collision with root package name */
    private int f21504y;

    /* renamed from: z, reason: collision with root package name */
    private int f21505z;

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
        this.f21504y = 1;
        this.f21505z = 1;
        this.f21473A = 1;
        this.f21474B = false;
        this.f21475C = false;
        this.f21476D = false;
        this.f21477E = false;
        this.f21478F = true;
        this.f21479G = false;
        this.f21481I = false;
        this.J = false;
        this.f21490S = false;
        this.f21491T = false;
        this.f21492U = new ArrayList();
    }

    private void b() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    private void e() {
        d dVar = this.f21442b;
        if (dVar != null) {
            boolean j6 = dVar.j();
            boolean f3 = v.f(this.f21442b.J());
            if (j6 && !f3) {
                i();
                return;
            }
        }
        if (this.f21504y != 2 || this.f21481I) {
            i();
        } else {
            h();
        }
    }

    private void f() {
        if (this.f21499t == null) {
            a(this.f21488Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f21499t, layoutParams);
        this.f21499t.notifyShowListener();
    }

    private void g() {
        if (this.f21500u == null) {
            a(this.f21488Q, (Integer) 4);
        }
        this.f21500u.setUnitId(this.f21502w);
        this.f21500u.preLoadData(this.f21488Q);
        addView(this.f21500u);
    }

    private void h() {
        if (this.f21497r == null) {
            a(this.f21488Q, (Integer) 2);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView == null || !anythinkH5EndCardView.isLoadSuccess()) {
            i();
            AnythinkH5EndCardView anythinkH5EndCardView2 = this.f21497r;
            if (anythinkH5EndCardView2 != null) {
                anythinkH5EndCardView2.reportRenderResult("timeout", 3);
                this.f21497r.setError(true);
            }
        } else {
            this.f21481I = true;
            addView(this.f21497r);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f21497r.excuteTask();
            this.f21497r.setNotchValue(this.f21487P, this.f21482K, this.f21483L, this.f21484M, this.f21485N);
        }
        AnythinkH5EndCardView anythinkH5EndCardView3 = this.f21497r;
        if (anythinkH5EndCardView3 != null) {
            anythinkH5EndCardView3.setUnitId(this.f21502w);
        }
    }

    private void i() {
        this.f21504y = 1;
        if (this.f21496q == null) {
            a(this.f21488Q, (Integer) 2);
        }
        addView(this.f21496q);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21496q.notifyShowListener();
        this.f21491T = true;
        bringToFront();
    }

    private void j() {
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f21498s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f21488Q;
            this.f21488Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f21441a);
                this.f21498s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f21442b);
                this.f21498s.setNotifyListener(new i(this.f21445e));
                this.f21498s.preLoadData(bVar);
            }
        }
        addView(this.f21498s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21491T = true;
        bringToFront();
    }

    private void k() {
        if (this.f21493n == null) {
            preLoadData(this.f21488Q);
        }
        addView(this.f21493n);
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f21502w);
            d dVar = this.f21442b;
            if (dVar != null && dVar.I() && this.f21442b.K() == 2) {
                this.f21493n.setCloseVisible(0);
            }
            this.f21493n.setNotchValue(this.f21487P, this.f21482K, this.f21483L, this.f21484M, this.f21485N);
        }
    }

    private void l() {
        if (this.f21494o == null) {
            b(-1);
        }
        if (this.f21494o != null) {
            d dVar = this.f21442b;
            if (dVar == null || !dVar.j()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f21494o, 0, layoutParams);
            }
        }
    }

    private void m() {
        if (this.f21495p == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f21476D && this.f21478F) {
            this.f21478F = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f21495p, layoutParams);
    }

    private void n() {
        if (this.f21501v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f21501v;
        if (anythinkAlertWebview != null && anythinkAlertWebview.getParent() != null) {
            removeView(this.f21501v);
        }
        addView(this.f21501v);
    }

    private void o() {
        if (this.f21501v == null) {
            AnythinkAlertWebview anythinkAlertWebview = new AnythinkAlertWebview(this.f21441a);
            this.f21501v = anythinkAlertWebview;
            anythinkAlertWebview.setUnitId(this.f21502w);
            this.f21501v.setCampaign(this.f21442b);
        }
        this.f21501v.preLoadData(this.f21488Q);
    }

    private void p() {
        this.f21475C = false;
        this.f21491T = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i = 0;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
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
        d dVar = this.f21442b;
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
        this.f21496q = new AnythinkNativeEndCardView(this.f21441a, null, true, i, this.f21442b.e() == 2, this.f21451l, this.f21442b.au());
        if (this.f21442b.k() != 5) {
            this.f21496q.setCampaign(this.f21442b);
            return;
        }
        a aVar = this.f21445e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f21442b);
        }
        this.f21496q.setCampaign(this.f21442b);
    }

    public void addOrderViewData(List<d> list) {
        if (list == null) {
            return;
        }
        this.f21492U = list;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view != null) {
            a(view);
            super.addView(view);
        }
    }

    public boolean canBackPress() {
        if (this.f21496q != null) {
            return false;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            return anythinkH5EndCardView.canBackPress();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f21500u;
        if (anythinkLandingPageView != null) {
            return anythinkLandingPageView.canBackPress();
        }
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            return anythinkPlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i, int i6, int i9) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        if (anythinkClickMiniCardView == null || anythinkClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f21495p.resizeMiniCard(i, i6);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        return this.f21474B;
    }

    public boolean endcardIsPlayable() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        return anythinkH5EndCardView != null && anythinkH5EndCardView.isPlayable();
    }

    public AnythinkH5EndCardView getH5EndCardView() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        return anythinkH5EndCardView == null ? this.f21493n : anythinkH5EndCardView;
    }

    public d getReSetCampaign() {
        if (!this.f21442b.j() || !TextUtils.isEmpty(this.f21442b.J())) {
            return null;
        }
        int size = this.f21492U.size();
        int i = 0;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (this.f21492U.get(i6) != null && this.f21492U.get(i6).bh() == this.f21442b.bh()) {
                    i = i6 - 1;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        if (i < 0 || i >= size || this.f21492U.get(i) == null) {
            return null;
        }
        return this.f21492U.get(i);
    }

    public boolean getShowingTransparent() {
        return this.f21476D;
    }

    public String getUnitID() {
        return this.f21502w;
    }

    public int getVideoInteractiveType() {
        return this.f21503x;
    }

    public int getVideoSkipTime() {
        return this.f21480H;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.handlerPlayableException(str);
            if (!this.f21481I) {
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
        if (this.f21490S && !this.f21491T) {
            p();
            this.f21490S = false;
        }
        AnythinkAlertWebview anythinkAlertWebview = this.f21501v;
        if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
            return;
        }
        removeView(this.f21501v);
        AnythinkClickCTAView anythinkClickCTAView = this.f21494o;
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
        this.f21445e.a(105, dVar);
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        return viewGroup != null && viewGroup.indexOfChild(this) == 0;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        this.f21445e.a(103, str);
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        return anythinkClickMiniCardView != null && anythinkClickMiniCardView.isLoadSuccess();
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        return this.f21475C;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.notifyCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.notifyCloseBtn(i);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f21493n, this.f21494o, this.f21495p, this.f21496q, this.f21497r, this.f21499t, this.f21500u, this.f21498s};
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
        if (this.f21496q != null || this.f21499t != null) {
            this.f21445e.a(104, "");
            return;
        }
        if (this.f21500u != null) {
            this.f21445e.a(103, "");
            return;
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.f21475C) {
            this.f21445e.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.onBackPress();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f21493n, this.f21495p, this.f21497r, this.f21501v};
        for (int i = 0; i < 4; i++) {
            AnythinkH5EndCardView anythinkH5EndCardView = anythinkH5EndCardViewArr[i];
            if (anythinkH5EndCardView != null && anythinkH5EndCardView.getVisibility() == 0) {
                anythinkH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(final b bVar) {
        this.f21488Q = bVar;
        d dVar = this.f21442b;
        if (dVar != null) {
            if (dVar.K() == 2) {
                if (this.f21493n == null) {
                    this.f21493n = new AnythinkPlayableView(this.f21441a);
                }
                this.f21493n.setCloseDelayShowTime(this.f21505z);
                this.f21493n.setPlayCloseBtnTm(this.f21473A);
                this.f21493n.setCampaign(this.f21442b);
                this.f21493n.setNotifyListener(new AnonymousClass4(this.f21445e));
                this.f21493n.preLoadData(bVar);
            } else {
                b(this.f21503x);
                if (this.f21442b.j()) {
                    try {
                        a(bVar, Integer.valueOf(this.f21442b.G()));
                    } catch (Throwable th) {
                        th.getMessage();
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                                anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f21442b.G()));
                            }
                        });
                    }
                    v.f(this.f21442b.J());
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                            anythinkContainerView.a(bVar, Integer.valueOf(anythinkContainerView.f21442b.G()));
                        }
                    }, getVideoSkipTime());
                }
            }
            o();
        }
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.readyStatus(i);
        }
    }

    public void release() {
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.release();
            this.f21497r = null;
        }
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.release();
        }
        AnythinkLandingPageView anythinkLandingPageView = this.f21500u;
        if (anythinkLandingPageView != null) {
            anythinkLandingPageView.release();
        }
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21496q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.clearMoreOfferBitmap();
            this.f21496q.release();
        }
        if (this.f21445e != null) {
            this.f21445e = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i, int i6, int i9) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.resizeMiniCard(i, i6);
            this.f21495p.setRadius(i9);
            removeAllViews();
            setMatchParent();
            this.f21491T = true;
            bringToFront();
            m();
        }
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setAnythinkClickMiniCardViewTransparent();
            this.f21495p.setAnythinkClickMiniCardViewClickable(false);
        }
    }

    public void setCloseDelayTime(int i) {
        this.f21505z = i;
    }

    public void setEndscreenType(int i) {
        this.f21504y = i;
    }

    public void setJSFactory(b bVar) {
        this.f21488Q = bVar;
    }

    public void setNotchPadding(int i, int i6, int i9, int i10, int i11) {
        String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i));
        this.f21486O = i;
        this.f21482K = i6;
        this.f21483L = i9;
        this.f21484M = i10;
        this.f21485N = i11;
        this.f21487P = com.anythink.expressad.foundation.h.i.a(i, i6, i9, i10, i11);
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21496q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setNotchPadding(i6, i9, i10, i11);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null && anythinkH5EndCardView.f21539s != null) {
            anythinkH5EndCardView.setNotchValue(this.f21487P, i6, i9, i10, i11);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21497r.f21539s, "oncutoutfetched", Base64.encodeToString(this.f21487P.getBytes(), 0));
        }
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null && anythinkPlayableView.f21539s != null) {
            anythinkPlayableView.setNotchValue(this.f21487P, i6, i9, i10, i11);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21493n.f21539s, "oncutoutfetched", Base64.encodeToString(this.f21487P.getBytes(), 0));
        }
        AnyThinkOrderCampView anyThinkOrderCampView = this.f21489R;
        if (anyThinkOrderCampView != null) {
            anyThinkOrderCampView.setNotchPadding(i6, i9, i10, i11);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void setNotifyListener(a aVar) {
        super.setNotifyListener(aVar);
        AnythinkBaseView[] anythinkBaseViewArr = {this.f21493n, this.f21494o, this.f21495p, this.f21496q, this.f21497r, this.f21499t, this.f21500u, this.f21498s};
        for (int i = 0; i < 8; i++) {
            AnythinkBaseView anythinkBaseView = anythinkBaseViewArr[i];
            if (anythinkBaseView != null) {
                if (anythinkBaseView instanceof AnythinkClickMiniCardView) {
                    anythinkBaseView.setNotifyListener(new g(this.f21495p, aVar));
                } else {
                    anythinkBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    public void setOnPause() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21496q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21496q;
        if (anythinkNativeEndCardView != null) {
            anythinkNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i) {
        this.f21473A = i;
    }

    public void setRewardStatus(boolean z3) {
        this.J = z3;
    }

    public void setShowingTransparent(boolean z3) {
        this.f21476D = z3;
    }

    public void setUnitID(String str) {
        this.f21502w = str;
    }

    public void setVideoInteractiveType(int i) {
        d dVar = this.f21442b;
        if (dVar == null || !dVar.j()) {
            this.f21503x = i;
            return;
        }
        int a9 = c.a(this.f21442b);
        if (a9 == 100) {
            this.f21503x = i;
        } else {
            this.f21503x = a9;
        }
    }

    public void setVideoSkipTime(int i) {
        this.f21480H = i;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        AnythinkAlertWebview anythinkAlertWebview = this.f21501v;
        if (anythinkAlertWebview == null || !anythinkAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) != viewGroup.getChildCount() - 1 && !this.f21491T) {
            removeAllViews();
            bringToFront();
            this.f21490S = true;
        }
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
            return false;
        }
        if (this.f21501v == null) {
            o();
        }
        AnythinkAlertWebview anythinkAlertWebview2 = this.f21501v;
        if (anythinkAlertWebview2 != null && anythinkAlertWebview2.getParent() != null) {
            removeView(this.f21501v);
        }
        addView(this.f21501v);
        setBackgroundColor(0);
        this.f21501v.webviewshow();
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i) {
        d dVar = this.f21442b;
        if (dVar != null) {
            if (i == 1) {
                a aVar = this.f21445e;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            } else if (i == 100) {
                if (dVar.K() == 2) {
                    this.f21477E = true;
                }
                a(this.f21493n);
                setMatchParent();
                i();
            } else if (i == 3) {
                removeAllViews();
                setMatchParent();
                if (this.f21499t == null) {
                    a(this.f21488Q, (Integer) 3);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                addView(this.f21499t, layoutParams);
                this.f21499t.notifyShowListener();
                this.f21491T = true;
                bringToFront();
            } else if (i == 4) {
                a aVar2 = this.f21445e;
                if (aVar2 != null) {
                    aVar2.a(113, "");
                }
                removeAllViews();
                setMatchParent();
                if (this.f21500u == null) {
                    a(this.f21488Q, (Integer) 4);
                }
                this.f21500u.setUnitId(this.f21502w);
                this.f21500u.preLoadData(this.f21488Q);
                addView(this.f21500u);
                this.f21491T = true;
                bringToFront();
            } else if (i != 5) {
                removeAllViews();
                setMatchParent();
                this.f21491T = true;
                bringToFront();
                e();
                a aVar3 = this.f21445e;
                if (aVar3 != null) {
                    aVar3.a(117, "");
                }
            } else {
                a aVar4 = this.f21445e;
                if (aVar4 != null) {
                    aVar4.a(106, "");
                }
            }
        }
        this.f21474B = true;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i, int i6, int i9, int i10, int i11) {
        AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
        if (anythinkClickMiniCardView != null) {
            anythinkClickMiniCardView.setMiniCardLocation(i, i6, i9, i10);
            this.f21495p.setRadius(i11);
            this.f21495p.setCloseVisible(8);
            this.f21495p.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.f21491T = true;
            bringToFront();
            m();
            if (this.f21479G) {
                return;
            }
            this.f21479G = true;
            this.f21445e.a(a.f21756z, "");
            this.f21445e.a(117, "");
        }
    }

    public void showOrderCampView() {
        AnyThinkOrderCampView anyThinkOrderCampView = new AnyThinkOrderCampView(this.f21441a);
        this.f21489R = anyThinkOrderCampView;
        anyThinkOrderCampView.setCampaignExes(this.f21492U);
        a aVar = this.f21445e;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f21492U);
        }
        this.f21489R.setNotifyListener(new i(this.f21445e));
        this.f21489R.setRewarded(this.J);
        this.f21489R.setNotchPadding(this.f21482K, this.f21483L, this.f21484M, this.f21485N);
        this.f21489R.setCampOrderViewBuildCallback(new com.anythink.expressad.video.dynview.f.b() { // from class: com.anythink.expressad.video.module.AnythinkContainerView.3
            @Override // com.anythink.expressad.video.dynview.f.b
            public final void a() {
                a aVar2 = AnythinkContainerView.this.f21445e;
                if (aVar2 != null) {
                    aVar2.a(117, "");
                }
            }

            @Override // com.anythink.expressad.video.dynview.f.b
            public final void b() {
                if (AnythinkContainerView.this.f21442b.e() == 2) {
                    AnythinkContainerView.this.showVideoEndCover();
                } else {
                    AnythinkContainerView anythinkContainerView = AnythinkContainerView.this;
                    anythinkContainerView.showEndcard(anythinkContainerView.f21442b.G());
                }
            }
        });
        this.f21489R.createView(this);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        if (this.f21442b == null || this.f21477E) {
            return;
        }
        removeAllViews();
        setMatchParent();
        if (this.f21493n == null) {
            preLoadData(this.f21488Q);
        }
        addView(this.f21493n);
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.setUnitId(this.f21502w);
            d dVar = this.f21442b;
            if (dVar != null && dVar.I() && this.f21442b.K() == 2) {
                this.f21493n.setCloseVisible(0);
            }
            this.f21493n.setNotchValue(this.f21487P, this.f21482K, this.f21483L, this.f21484M, this.f21485N);
        }
        this.f21491T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i) {
        d dVar;
        if (this.f21442b != null) {
            if (i == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                p();
                return;
            }
            if (i == 1) {
                if (this.f21474B) {
                    return;
                }
                AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
                if (anythinkH5EndCardView != null && anythinkH5EndCardView.getParent() != null) {
                    removeView(this.f21497r);
                }
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
                if (anythinkClickMiniCardView != null && anythinkClickMiniCardView.getParent() != null) {
                    removeView(this.f21495p);
                }
                AnythinkClickCTAView anythinkClickCTAView = this.f21494o;
                if (anythinkClickCTAView == null || anythinkClickCTAView.getParent() == null) {
                    try {
                        d dVar2 = this.f21442b;
                        if (dVar2 != null && dVar2.K() == 1) {
                            this.f21491T = true;
                            if (this.f21494o == null) {
                                b(-1);
                            }
                            if (this.f21494o != null && ((dVar = this.f21442b) == null || !dVar.j())) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                                layoutParams.addRule(12, -1);
                                addView(this.f21494o, 0, layoutParams);
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
            AnythinkClickCTAView anythinkClickCTAView2 = this.f21494o;
            if (anythinkClickCTAView2 != null && anythinkClickCTAView2.getParent() != null) {
                removeView(this.f21494o);
            }
            AnythinkAlertWebview anythinkAlertWebview = this.f21501v;
            if (anythinkAlertWebview == null || anythinkAlertWebview.getParent() == null) {
                AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f21495p;
                if (anythinkClickMiniCardView2 == null || anythinkClickMiniCardView2.getParent() == null) {
                    try {
                        d dVar3 = this.f21442b;
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
                AnythinkH5EndCardView anythinkH5EndCardView2 = this.f21497r;
                if (anythinkH5EndCardView2 != null && anythinkH5EndCardView2.getParent() != null) {
                    removeView(this.f21497r);
                }
                a aVar = this.f21445e;
                if (aVar != null) {
                    aVar.a(112, "");
                }
                d dVar4 = this.f21442b;
                if (dVar4 != null && !dVar4.ay()) {
                    this.f21442b.az();
                    com.anythink.expressad.video.module.b.a.e(this.f21441a, this.f21442b);
                }
                if (this.f21476D) {
                    a aVar2 = this.f21445e;
                    if (aVar2 != null) {
                        aVar2.a(115, "");
                    }
                } else {
                    this.f21491T = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.f21475C = true;
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        AnythinkVideoEndCoverView anythinkVideoEndCoverView = this.f21498s;
        if (anythinkVideoEndCoverView == null) {
            b bVar = this.f21488Q;
            this.f21488Q = bVar;
            if (anythinkVideoEndCoverView == null) {
                AnythinkVideoEndCoverView anythinkVideoEndCoverView2 = new AnythinkVideoEndCoverView(this.f21441a);
                this.f21498s = anythinkVideoEndCoverView2;
                anythinkVideoEndCoverView2.setCampaign(this.f21442b);
                this.f21498s.setNotifyListener(new i(this.f21445e));
                this.f21498s.preLoadData(bVar);
            }
        }
        addView(this.f21498s);
        onConfigurationChanged(getResources().getConfiguration());
        this.f21491T = true;
        bringToFront();
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        AnythinkPlayableView anythinkPlayableView = this.f21493n;
        if (anythinkPlayableView != null) {
            anythinkPlayableView.toggleCloseBtn(i);
        }
        AnythinkH5EndCardView anythinkH5EndCardView = this.f21497r;
        if (anythinkH5EndCardView != null) {
            anythinkH5EndCardView.toggleCloseBtn(i);
        }
    }

    public void triggerCloseBtn(String str) {
        a aVar;
        if (this.f21442b == null || (aVar = this.f21445e) == null) {
            return;
        }
        aVar.a(122, "");
        this.f21445e.a(104, "");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        AnythinkH5EndCardView[] anythinkH5EndCardViewArr = {this.f21493n, this.f21495p, this.f21497r, this.f21501v};
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
        this.f21488Q = bVar;
        if (this.f21498s == null) {
            AnythinkVideoEndCoverView anythinkVideoEndCoverView = new AnythinkVideoEndCoverView(this.f21441a);
            this.f21498s = anythinkVideoEndCoverView;
            anythinkVideoEndCoverView.setCampaign(this.f21442b);
            this.f21498s.setNotifyListener(new i(this.f21445e));
            this.f21498s.preLoadData(bVar);
        }
    }

    private void a(b bVar) {
        if (this.f21493n == null) {
            this.f21493n = new AnythinkPlayableView(this.f21441a);
        }
        this.f21493n.setCloseDelayShowTime(this.f21505z);
        this.f21493n.setPlayCloseBtnTm(this.f21473A);
        this.f21493n.setCampaign(this.f21442b);
        this.f21493n.setNotifyListener(new AnonymousClass4(this.f21445e));
        this.f21493n.preLoadData(bVar);
    }

    private void b(int i) {
        if (i != -3) {
            if (i != -2) {
                if (this.f21494o == null) {
                    AnythinkClickCTAView anythinkClickCTAView = new AnythinkClickCTAView(this.f21441a);
                    this.f21494o = anythinkClickCTAView;
                    anythinkClickCTAView.setCampaign(this.f21442b);
                    this.f21494o.setUnitId(this.f21502w);
                    this.f21494o.setNotifyListener(new i(this.f21445e));
                    this.f21494o.preLoadData(this.f21488Q);
                    return;
                }
                return;
            }
            d dVar = this.f21442b;
            if (dVar == null || dVar.G() != 2) {
                return;
            }
            if (this.f21495p == null) {
                this.f21495p = new AnythinkClickMiniCardView(this.f21441a);
            }
            this.f21495p.setCampaign(this.f21442b);
            AnythinkClickMiniCardView anythinkClickMiniCardView = this.f21495p;
            anythinkClickMiniCardView.setNotifyListener(new g(anythinkClickMiniCardView, this.f21445e));
            this.f21495p.preLoadData(this.f21488Q);
            setMatchParent();
            m();
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Integer num) {
        a aVar;
        d dVar;
        this.f21488Q = bVar;
        d dVar2 = this.f21442b;
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
                    if (this.f21499t == null) {
                        this.f21499t = new AnythinkVastEndCardView(this.f21441a);
                    }
                    this.f21499t.setCampaign(this.f21442b);
                    this.f21499t.setNotifyListener(new l(this.f21445e));
                    this.f21499t.preLoadData(bVar);
                    return;
                }
                if (intValue == 4) {
                    if (this.f21500u == null) {
                        this.f21500u = new AnythinkLandingPageView(this.f21441a);
                    }
                    this.f21500u.setCampaign(this.f21442b);
                    this.f21500u.setNotifyListener(new i(this.f21445e));
                    return;
                }
                if (intValue != 5) {
                    if (this.f21504y == 2) {
                        boolean j6 = this.f21442b.j();
                        boolean f3 = v.f(this.f21442b.J());
                        if ((!j6 || f3 || (dVar = this.f21442b) == null || dVar.I()) && this.f21442b.e() != 2) {
                            if (this.f21497r == null) {
                                this.f21497r = new AnythinkH5EndCardView(this.f21441a);
                            }
                            if (this.f21442b.k() == 5 && (aVar = this.f21445e) != null && (aVar instanceof k)) {
                                ((k) aVar).a(this.f21442b);
                            }
                            this.f21497r.setCampaign(this.f21442b);
                            this.f21497r.setCloseDelayShowTime(this.f21505z);
                            this.f21497r.setNotifyListener(new i(this.f21445e));
                            this.f21497r.setUnitId(this.f21502w);
                            this.f21497r.setNotchValue(this.f21487P, this.f21482K, this.f21483L, this.f21484M, this.f21485N);
                            this.f21497r.preLoadData(bVar);
                            if (this.f21476D) {
                                return;
                            }
                            addView(this.f21497r);
                            return;
                        }
                        return;
                    }
                    d dVar3 = this.f21442b;
                    int c9 = (dVar3 == null || dVar3.N() == null) ? 0 : this.f21442b.N().c();
                    AnythinkNativeEndCardView anythinkNativeEndCardView = this.f21496q;
                    if (anythinkNativeEndCardView == null && anythinkNativeEndCardView == null) {
                        if (this.f21442b.j()) {
                            q();
                        } else {
                            AnythinkNativeEndCardView anythinkNativeEndCardView2 = new AnythinkNativeEndCardView(this.f21441a, null, false, -1, this.f21442b.e() == 2, c9, this.f21442b.au());
                            this.f21496q = anythinkNativeEndCardView2;
                            anythinkNativeEndCardView2.setCampaign(this.f21442b);
                        }
                    }
                    this.f21496q.setLayout();
                    this.f21496q.setCampaign(this.f21442b);
                    this.f21496q.setUnitId(this.f21502w);
                    this.f21496q.setCloseBtnDelay(this.f21505z);
                    this.f21496q.setNotifyListener(new i(this.f21445e));
                    this.f21496q.preLoadData(bVar);
                    this.f21496q.setNotchPadding(this.f21482K, this.f21483L, this.f21484M, this.f21485N);
                }
            }
        }
    }

    public AnythinkContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21504y = 1;
        this.f21505z = 1;
        this.f21473A = 1;
        this.f21474B = false;
        this.f21475C = false;
        this.f21476D = false;
        this.f21477E = false;
        this.f21478F = true;
        this.f21479G = false;
        this.f21481I = false;
        this.J = false;
        this.f21490S = false;
        this.f21491T = false;
        this.f21492U = new ArrayList();
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
                    anythinkBaseView.setNotifyListener(new g(this.f21495p, aVar));
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
