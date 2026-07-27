package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.b.e;
import com.anythink.basead.b.f;
import com.anythink.basead.d.g;
import com.anythink.basead.g.j;
import com.anythink.basead.mixad.f.b;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.BaseScreenATView;
import com.anythink.basead.ui.HalfScreenATView;
import com.anythink.basead.ui.MuteImageView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.thirdparty.b;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.p;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.t.d;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ThirdPartyHalfScreenATView extends HalfScreenATView implements com.anythink.core.common.l.e.a.c {
    private static final String an = "ThirdPartyHalfScreenATView";
    private final com.anythink.core.common.t.a ao;
    private BaseAd ap;
    private View aq;
    private Timer ar;
    private com.anythink.basead.mixad.f.b as;
    private boolean at;
    private boolean au;
    private FrameLayout av;
    private final com.anythink.core.common.t.b aw;

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView$5, reason: invalid class name */
    public class AnonymousClass5 extends TimerTask {
        public AnonymousClass5() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ThirdPartyHalfScreenATView thirdPartyHalfScreenATView = ThirdPartyHalfScreenATView.this;
            ThirdPartyHalfScreenATView.a(thirdPartyHalfScreenATView, (int) thirdPartyHalfScreenATView.ap.getVideoProgress());
        }
    }

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView$6, reason: invalid class name */
    public class AnonymousClass6 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11501a;

        public AnonymousClass6(int i) {
            this.f11501a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f11501a * 1000;
            ThirdPartyHalfScreenATView.this.b(i);
            if (((BaseScreenATView) ThirdPartyHalfScreenATView.this).f9999C < 0 || i < ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f9999C) {
                return;
            }
            ThirdPartyHalfScreenATView.this.T();
        }
    }

    public ThirdPartyHalfScreenATView(Context context) {
        super(context);
        this.ao = d.a();
        this.at = false;
        this.au = false;
        this.aw = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyHalfScreenATView.this.T();
            }
        };
    }

    private void ah() {
        ArrayList arrayList = new ArrayList();
        int J = this.f9892f.f14325o.J();
        if (J == 0) {
            arrayList.addAll(this.f10009N.getClickViews());
            arrayList.add(this.f10009N);
            BaseEndCardView baseEndCardView = this.f10010O;
            if (baseEndCardView != null) {
                arrayList.add(baseEndCardView);
            }
        } else if (J == 1) {
            if (this.f10009N.getCTAButton() != null) {
                arrayList.add(this.f10009N.getCTAButton());
            }
            if (ar()) {
                c.c(this.ap.getAdIconView());
            }
        } else if (J == 2) {
            arrayList.addAll(this.f10009N.getClickViews());
            arrayList.add(this.f10009N);
        }
        final com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
        bVar.a(this.f10009N.getTitleView());
        bVar.d(this.f10009N.getDescView());
        bVar.e(this.f10009N.getCTAButton());
        bVar.b(this.f10009N.getIconView());
        b.a(this.f10008M, this.ap, new b.a() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView.4
            @Override // com.anythink.basead.ui.thirdparty.b.a
            public final void a(View view, View view2, View view3) {
                bVar.g(view);
                bVar.h(view2);
                bVar.f(view3);
            }
        });
        this.ap.registerListener(this.av, arrayList, com.anythink.basead.mixad.f.a.a(this.f9892f.f14317f, 0, 0), bVar);
    }

    private void ai() {
        int i = this.f9999C;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            this.ao.a(this.aw, i, true);
        } else {
            T();
        }
    }

    private void aj() {
        if (this.ar == null) {
            Timer timer = new Timer();
            this.ar = timer;
            timer.schedule(new AnonymousClass5(), 0L, 300L);
        }
    }

    private void ak() {
        Timer timer = this.ar;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void al() {
        Timer timer = this.ar;
        if (timer != null) {
            timer.cancel();
            this.ar = null;
        }
        this.ao.b(this.aw);
    }

    private boolean am() {
        if (this.ap.isNativeExpress()) {
            return true;
        }
        BaseAd baseAd = this.ap;
        if (baseAd != null) {
            return TextUtils.equals(baseAd.getAdType(), "1") && this.aq != null;
        }
        return false;
    }

    private void an() {
        ViewGroup customAdContainer;
        if (this.f10008M == null || (customAdContainer = this.ap.getCustomAdContainer()) == null) {
            return;
        }
        if (!this.ap.isNativeExpress() && as()) {
            View view = this.aq;
            if (aq()) {
                c.c(customAdContainer);
                c.c(view);
            } else if (ar()) {
                c.c(view);
            }
        }
        ViewParent parent = this.f10008M.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(this.f10008M);
            if (indexOfChild >= 0) {
                viewGroup.removeViewAt(indexOfChild);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f10008M.getLayoutParams().height);
            layoutParams.gravity = 17;
            customAdContainer.addView(this.f10008M, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = q.a(getContext(), 26.0f);
            layoutParams2.rightMargin = q.a(getContext(), 26.0f);
            viewGroup.addView(customAdContainer, indexOfChild, layoutParams2);
        }
    }

    private void ao() {
        ArrayList arrayList = new ArrayList();
        View view = this.aq;
        if (view != null) {
            arrayList.add(view);
        }
        BaseEndCardView baseEndCardView = this.f10010O;
        if (baseEndCardView != null) {
            arrayList.add(baseEndCardView);
        }
        PanelView panelView = this.f10009N;
        if (panelView != null) {
            arrayList.add(panelView.getIconView());
        }
        this.as = new b.a().a(arrayList).a(this.f10009N.getTitleView()).b(this.f10009N.getDescView()).c(this.f10009N.getCTAButton()).a();
    }

    private boolean ap() {
        w wVar = this.f9893g;
        return (wVar == null || !TextUtils.isEmpty(wVar.B()) || this.aq == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aq() {
        x xVar = this.f9892f;
        return xVar != null && xVar.f14317f == 39;
    }

    private boolean ar() {
        x xVar = this.f9892f;
        return xVar != null && xVar.f14317f == 59;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean as() {
        y yVar;
        x xVar = this.f9892f;
        return (xVar == null || (yVar = xVar.f14325o) == null || yVar.J() == 0) ? false : true;
    }

    private boolean at() {
        return this.ap.isNativeExpress();
    }

    public static /* synthetic */ boolean b(ThirdPartyHalfScreenATView thirdPartyHalfScreenATView) {
        thirdPartyHalfScreenATView.at = true;
        return true;
    }

    public static /* synthetic */ void h(ThirdPartyHalfScreenATView thirdPartyHalfScreenATView) {
        if (thirdPartyHalfScreenATView.ar == null) {
            Timer timer = new Timer();
            thirdPartyHalfScreenATView.ar = timer;
            timer.schedule(thirdPartyHalfScreenATView.new AnonymousClass5(), 0L, 300L);
        }
    }

    public static /* synthetic */ boolean o(ThirdPartyHalfScreenATView thirdPartyHalfScreenATView) {
        thirdPartyHalfScreenATView.au = true;
        return true;
    }

    public static /* synthetic */ void p(ThirdPartyHalfScreenATView thirdPartyHalfScreenATView) {
        Timer timer = thirdPartyHalfScreenATView.ar;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void G() {
        String B8 = this.f9893g.B();
        if (TextUtils.isEmpty(B8)) {
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(2, B8));
        if (a9 != null) {
            int i = a9[0];
            this.af = i;
            int i4 = a9[1];
            this.ag = i4;
            this.ad = i;
            this.ae = i4;
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void H() {
        PanelView panelView = this.f10009N;
        if (panelView != null) {
            panelView.setVisibility(4);
            this.f10009N.init(this.f9893g, this.f9892f, this.f10020b, false, null);
            BaseAd baseAd = this.ap;
            if (baseAd != null) {
                this.f10009N.setBaseAdIconView(baseAd.getAdIconView());
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void K() {
        MuteImageView muteImageView = this.f10014S;
        if (muteImageView == null) {
            return;
        }
        if (this.f10006K) {
            muteImageView.setMute(true);
        } else {
            muteImageView.setMute(false);
        }
        this.f10014S.setVisibility(4);
        this.f10014S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ThirdPartyHalfScreenATView.this.aq == null || ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10014S == null || ThirdPartyHalfScreenATView.this.ap == null) {
                    return;
                }
                ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10006K = !((BaseScreenATView) r2).f10006K;
                ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10014S.setMute(((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10006K);
                ThirdPartyHalfScreenATView.this.ap.setVideoMute(((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10006K);
            }
        });
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void M() {
        super.c(1);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void P() {
        super.P();
        x xVar = this.f9892f;
        if (xVar == null) {
            return;
        }
        int i = xVar.f14317f;
        if (i == 22) {
            this.ap.setVideoMute(this.f10006K);
        }
        MuteImageView muteImageView = this.f10014S;
        if (muteImageView != null && i != 8) {
            muteImageView.setVisibility(8);
        }
        if (i == 28 || i == 22) {
            e(8);
            T();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void T() {
        if (X() != null && X().getVisibility() != 0) {
            X().setVisibility(0);
            X().setClickAreaScaleFactor(this.f10007L);
        }
        this.ao.b(this.aw);
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void U() {
        if (ap()) {
            am.a(this.aq);
            BasePlayerView l9 = this.f9903r.l();
            if (l9 != null) {
                this.f10008M.addView(this.aq, 1, l9.getLayoutParams());
            }
            T();
        } else {
            super.U();
        }
        ao();
        ah();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void V() {
        if (this.aq != null && !ap() && this.aq.getParent() != null) {
            ((ViewGroup) this.aq.getParent()).removeView(this.aq);
        }
        e(8);
        MuteImageView muteImageView = this.f10014S;
        if (muteImageView != null) {
            muteImageView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        Timer timer = this.ar;
        if (timer != null) {
            timer.cancel();
            this.ar = null;
        }
        this.ao.b(this.aw);
        BaseAd baseAd = this.ap;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.ap.clear(this);
            this.ap.destroy();
        }
        RelativeLayout relativeLayout = this.f10008M;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        PanelView panelView = this.f10009N;
        if (panelView != null) {
            panelView.removeAllViews();
        }
        BaseEndCardView baseEndCardView = this.f10010O;
        if (baseEndCardView != null) {
            baseEndCardView.mListener = null;
        }
        ViewGroup viewGroup = this.f10013R;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
            this.f10013R.removeAllViews();
        }
        removeAllViews();
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.anythink.basead.mixad.f.b bVar = this.as;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r6.aq != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @Override // com.anythink.basead.ui.BaseScreenATView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init() {
        boolean z8;
        b();
        this.f10000D = b(this.f10001E);
        this.ap.setNativeEventListener(new p() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView.2
            @Override // com.anythink.core.common.d.p
            public final void a(String str, String str2) {
                ThirdPartyHalfScreenATView.this.x();
                ThirdPartyHalfScreenATView.this.a(g.a(str, str2));
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdClicked(View view) {
                int i = com.anythink.basead.mixad.f.b.f9720a;
                if (ThirdPartyHalfScreenATView.this.as != null) {
                    i = ThirdPartyHalfScreenATView.this.as.a();
                }
                if (((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W.b(new j().a(1, i));
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdImpressed() {
                if (ThirdPartyHalfScreenATView.this.at) {
                    return;
                }
                ThirdPartyHalfScreenATView.b(ThirdPartyHalfScreenATView.this);
                if (((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W.a(new j());
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoEnd() {
                if (ThirdPartyHalfScreenATView.this.au) {
                    return;
                }
                ThirdPartyHalfScreenATView.o(ThirdPartyHalfScreenATView.this);
                ThirdPartyHalfScreenATView.p(ThirdPartyHalfScreenATView.this);
                ThirdPartyHalfScreenATView.this.T();
                if (((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W.b();
                }
                ThirdPartyHalfScreenATView.this.x();
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoProgress(int i) {
                ThirdPartyHalfScreenATView.p(ThirdPartyHalfScreenATView.this);
                ThirdPartyHalfScreenATView.a(ThirdPartyHalfScreenATView.this, i);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoStart() {
                ThirdPartyHalfScreenATView.h(ThirdPartyHalfScreenATView.this);
                if (((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyHalfScreenATView.this).f10018W.a();
                }
                if (ThirdPartyHalfScreenATView.this.aq() && ThirdPartyHalfScreenATView.this.as()) {
                    c.a(ThirdPartyHalfScreenATView.this.aq);
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onDeeplinkCallback(boolean z9) {
            }

            @Override // com.anythink.core.common.d.o
            public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            }
        });
        if (!this.f10005I) {
            if (3 == ((BaseScreenATView) this).f10019a) {
                if (!this.ap.isNativeExpress()) {
                    BaseAd baseAd = this.ap;
                    z8 = false;
                    if (baseAd != null) {
                        if (TextUtils.equals(baseAd.getAdType(), "1")) {
                        }
                    }
                    if (z8) {
                        w();
                        int i = this.f9999C;
                        if (i >= 0) {
                            if (i > 0) {
                                this.ao.a(this.aw, i, true);
                            } else {
                                T();
                            }
                        }
                    }
                }
                z8 = true;
                if (z8) {
                }
            }
            ao();
        }
        x();
        ao();
    }

    @Override // com.anythink.basead.ui.HalfScreenATView
    public boolean isAttachRoot() {
        return false;
    }

    private void f(int i) {
        post(new AnonymousClass6(i));
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void b() {
        ViewGroup customAdContainer;
        super.b();
        ViewGroup viewGroup = this.f10013R;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        com.anythink.basead.ui.f.d dVar = ((HalfScreenATView) this).ai;
        if (dVar != null) {
            dVar.a();
        }
        if (this.f10008M != null && (customAdContainer = this.ap.getCustomAdContainer()) != null) {
            if (!this.ap.isNativeExpress() && as()) {
                View view = this.aq;
                if (aq()) {
                    c.c(customAdContainer);
                    c.c(view);
                } else if (ar()) {
                    c.c(view);
                }
            }
            ViewParent parent = this.f10008M.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                int indexOfChild = viewGroup2.indexOfChild(this.f10008M);
                if (indexOfChild >= 0) {
                    viewGroup2.removeViewAt(indexOfChild);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.f10008M.getLayoutParams().height);
                layoutParams.gravity = 17;
                customAdContainer.addView(this.f10008M, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(15);
                layoutParams2.leftMargin = q.a(getContext(), 26.0f);
                layoutParams2.rightMargin = q.a(getContext(), 26.0f);
                viewGroup2.addView(customAdContainer, indexOfChild, layoutParams2);
            }
        }
        View findViewById = findViewById(q.a(getContext(), "myoffer_ad_lable", "id"));
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void w() {
        BaseAd baseAd;
        try {
            if (this.aq == null || (baseAd = this.ap) == null || this.f9903r == null) {
                return;
            }
            double videoDuration = baseAd.getVideoDuration();
            BasePlayerView l9 = this.f9903r.l();
            if (l9 != null) {
                this.f10008M.addView(this.aq, 1, l9.getLayoutParams());
            }
            if (aq()) {
                T();
                videoDuration = 0.0d;
            }
            c(((int) videoDuration) * 1000);
            P();
            ah();
            if (videoDuration <= 0.0d) {
                e(8);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void x() {
        if (this.ap.isNativeExpress()) {
            return;
        }
        w wVar = this.f9893g;
        if (wVar != null && TextUtils.isEmpty(wVar.B()) && this.aq == null) {
            return;
        }
        super.x();
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseATView
    public final void a() {
        super.a();
        this.av = new FrameLayout(getContext());
        this.av.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.av.addView(((HalfScreenATView) this).ah);
        addView(this.av);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyHalfScreenATView(Context context, x xVar, w wVar, String str, int i, int i4, BaseAd baseAd, com.anythink.core.common.l.a aVar) {
        super(context, xVar, wVar, str, i, i4);
        FrameLayout.LayoutParams layoutParams;
        this.ao = d.a();
        this.at = false;
        this.au = false;
        this.aw = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyHalfScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyHalfScreenATView.this.T();
            }
        };
        this.ap = baseAd;
        this.aq = baseAd.getAdMediaView(new Object[0]);
        if (aVar instanceof View) {
            View view = (View) aVar;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 17;
            this.av.addView(view, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.anythink.core.common.l.a aVar) {
        FrameLayout.LayoutParams layoutParams;
        if (aVar instanceof View) {
            View view = (View) aVar;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 17;
            this.av.addView(view, layoutParams);
        }
    }

    private void a(ViewGroup viewGroup) {
        if (!this.ap.isNativeExpress() && as()) {
            View view = this.aq;
            if (aq()) {
                c.c(viewGroup);
                c.c(view);
            } else if (ar()) {
                c.c(view);
            }
        }
    }

    public static /* synthetic */ void a(ThirdPartyHalfScreenATView thirdPartyHalfScreenATView, int i) {
        thirdPartyHalfScreenATView.post(thirdPartyHalfScreenATView.new AnonymousClass6(i));
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        if (i == 3 || i == 4) {
            return e.a(this.f9893g);
        }
        return i == 7;
    }
}
