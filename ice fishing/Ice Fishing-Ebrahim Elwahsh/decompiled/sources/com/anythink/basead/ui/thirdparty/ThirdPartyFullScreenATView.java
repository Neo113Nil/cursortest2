package com.anythink.basead.ui.thirdparty;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.b.e;
import com.anythink.basead.b.f;
import com.anythink.basead.d.g;
import com.anythink.basead.g.j;
import com.anythink.basead.mixad.f.b;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.basead.ui.BaseScreenATView;
import com.anythink.basead.ui.MuteImageView;
import com.anythink.basead.ui.PanelView;
import com.anythink.basead.ui.component.CTAButtonLayout;
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
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class ThirdPartyFullScreenATView extends BaseScreenATView implements com.anythink.core.common.l.e.a.c {
    private static final String aj = "ThirdPartyFullScreenATView";
    View ah;
    Timer ai;
    private BaseAd ak;
    private final com.anythink.core.common.t.a al;
    private final com.anythink.core.common.t.b am;
    private com.anythink.basead.mixad.f.b an;
    private boolean ao;
    private boolean ap;
    private FrameLayout aq;

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11489a;

        public AnonymousClass3(int i) {
            this.f11489a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.f11489a * 1000;
            ThirdPartyFullScreenATView.this.b(i);
            if (((BaseScreenATView) ThirdPartyFullScreenATView.this).f9999C < 0 || i < ((BaseScreenATView) ThirdPartyFullScreenATView.this).f9999C) {
                return;
            }
            ThirdPartyFullScreenATView.this.T();
        }
    }

    /* renamed from: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView$6, reason: invalid class name */
    public class AnonymousClass6 extends TimerTask {
        public AnonymousClass6() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ThirdPartyFullScreenATView thirdPartyFullScreenATView = ThirdPartyFullScreenATView.this;
            ThirdPartyFullScreenATView.a(thirdPartyFullScreenATView, (int) thirdPartyFullScreenATView.ak.getVideoProgress());
        }
    }

    public ThirdPartyFullScreenATView(Context context) {
        super(context);
        this.al = d.a();
        this.am = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenATView.this.T();
            }
        };
        this.ao = false;
        this.ap = false;
    }

    private void af() {
        ArrayList arrayList = new ArrayList();
        View view = this.ah;
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
        this.an = new b.a().a(arrayList).a(this.f10009N.getTitleView()).b(this.f10009N.getDescView()).c(this.f10009N.getCTAButton()).a();
    }

    private void ag() {
        int i = this.f9999C;
        if (i < 0) {
            return;
        }
        if (i > 0) {
            this.al.a(this.am, i, true);
        } else {
            T();
        }
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
            if (as()) {
                b(arrayList);
            }
        } else if (J == 1) {
            b(arrayList);
            if (ar()) {
                c.c(this.ak.getAdIconView());
            }
        } else if (J == 2) {
            arrayList.addAll(this.f10009N.getClickViews());
            arrayList.add(this.f10009N);
            if (as()) {
                b(arrayList);
            }
        }
        final com.anythink.core.basead.b.b bVar = new com.anythink.core.basead.b.b();
        bVar.a(this.f10009N.getTitleView());
        bVar.d(this.f10009N.getDescView());
        if (this.f10009N.getCTAButton() instanceof CTAButtonLayout) {
            bVar.e(((CTAButtonLayout) this.f10009N.getCTAButton()).getMajorCTAButtonView());
        } else {
            bVar.e(this.f10009N.getCTAButton());
        }
        bVar.b(this.f10009N.getIconView());
        b.a(this.f10008M, this.ak, new b.a() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView.4
            @Override // com.anythink.basead.ui.thirdparty.b.a
            public final void a(View view, View view2, View view3) {
                bVar.g(view);
                bVar.h(view2);
                bVar.f(view3);
            }
        });
        this.ak.registerListener(this.aq, arrayList, com.anythink.basead.mixad.f.a.a(this.f9892f.f14317f, 0, 0), bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 != 6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ai() {
        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (b(this.f10001E)) {
            int i = this.f10001E;
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i4 = this.f10022d;
                        int i9 = (int) (i4 * 0.5f);
                        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i9));
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = this.f10021c;
                            layoutParams.height = i9;
                            this.f10009N.setLayoutParams(layoutParams);
                            this.f10009N.removeAllViews();
                            this.f10009N.setLayoutType(this.f10001E);
                        }
                    }
                }
                int a9 = q.a(getContext(), 300.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(this.f10021c - a9, -1));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a9;
                    layoutParams2.height = -1;
                    this.f10009N.setLayoutParams(layoutParams2);
                    this.f10009N.removeAllViews();
                    this.f10009N.setLayoutType(this.f10001E);
                }
            } else {
                this.f10008M.setBackgroundColor(-1);
                int i10 = (int) (this.f10022d * 0.5f);
                int a10 = TextUtils.isEmpty(this.f9893g.z()) ? this.f10022d - i10 : (this.f10022d - i10) + q.a(getContext(), 50.0f);
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                this.f10010O.setNeedArc(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = this.f10021c;
                    layoutParams3.height = a10;
                    this.f10009N.setLayoutParams(layoutParams3);
                    this.f10009N.removeAllViews();
                    this.f10009N.setLayoutType(this.f10001E);
                }
            }
        }
        if (ap()) {
            a(this.f10010O.getLayoutParams());
        } else {
            this.f10008M.addView(this.f10010O, 1);
        }
    }

    private void aj() {
        if (this.ai == null) {
            Timer timer = new Timer();
            this.ai = timer;
            timer.schedule(new AnonymousClass6(), 0L, 300L);
        }
    }

    private void ak() {
        Timer timer = this.ai;
        if (timer != null) {
            timer.cancel();
        }
    }

    private void al() {
        Timer timer = this.ai;
        if (timer != null) {
            timer.cancel();
            this.ai = null;
        }
        this.al.b(this.am);
    }

    private boolean am() {
        if (this.ak.isNativeExpress()) {
            return true;
        }
        BaseAd baseAd = this.ak;
        if (baseAd != null) {
            return TextUtils.equals(baseAd.getAdType(), "1") && this.ah != null;
        }
        return false;
    }

    private void an() {
        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        aa().setVisibility(0);
        this.f10008M.addView(this.f10010O, 1);
    }

    private void ao() {
        BaseAd baseAd = this.ak;
        if (baseAd == null) {
            return;
        }
        baseAd.toString();
        baseAd.getTitle();
        baseAd.getDescriptionText();
        baseAd.getNativeType();
        Objects.toString(baseAd.getAdMediaView(new Object[0]));
        Objects.toString(baseAd.getAdIconView());
        baseAd.getIconImageUrl();
        baseAd.getMainImageUrl();
        baseAd.getMainImageWidth();
        baseAd.getMainImageHeight();
        baseAd.getVideoWidth();
        baseAd.getVideoHeight();
        baseAd.getAppPrice();
        baseAd.getAppCommentNum();
        baseAd.getCallToActionText();
        baseAd.getStarRating();
        baseAd.getVideoUrl();
        baseAd.getAdChoiceIconUrl();
        baseAd.getAdFrom();
        Objects.toString(baseAd.getImageUrlList());
        Objects.toString(baseAd.getNetworkInfoMap());
        Objects.toString(baseAd.getAdAppInfo());
        baseAd.getNativeAdInteractionType();
        baseAd.getVideoDuration();
        baseAd.getAdvertiserName();
        baseAd.getNativeType();
        baseAd.getAdType();
        Objects.toString(baseAd.getNativeCustomVideo());
        Objects.toString(baseAd.getAdLogo());
        baseAd.getNativeExpressWidth();
        baseAd.getNativeExpressHeight();
    }

    private boolean ap() {
        w wVar = this.f9893g;
        return (wVar == null || !TextUtils.isEmpty(wVar.B()) || this.ah == null) ? false : true;
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

    private boolean as() {
        x xVar = this.f9892f;
        return xVar != null && xVar.f14317f == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean at() {
        y yVar;
        x xVar = this.f9892f;
        return (xVar == null || (yVar = xVar.f14325o) == null || yVar.J() == 0) ? false : true;
    }

    private boolean au() {
        return this.ak.isNativeExpress();
    }

    public static /* synthetic */ boolean b(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        thirdPartyFullScreenATView.ao = true;
        return true;
    }

    public static /* synthetic */ void h(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        if (thirdPartyFullScreenATView.ai == null) {
            Timer timer = new Timer();
            thirdPartyFullScreenATView.ai = timer;
            timer.schedule(thirdPartyFullScreenATView.new AnonymousClass6(), 0L, 300L);
        }
    }

    public static /* synthetic */ boolean n(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        thirdPartyFullScreenATView.ap = true;
        return true;
    }

    public static /* synthetic */ void o(ThirdPartyFullScreenATView thirdPartyFullScreenATView) {
        Timer timer = thirdPartyFullScreenATView.ai;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
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
            BaseAd baseAd = this.ak;
            if (baseAd != null) {
                this.f10009N.setBaseAdIconView(baseAd.getAdIconView());
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void I() {
        super.I();
        if (this.f10009N != null) {
            if (e.a(this.f9893g)) {
                this.f10001E = 0;
            } else {
                this.f10001E = 8;
            }
            this.f10009N.setLayoutType(this.f10001E);
            if (this.f10001E == 8 && this.f9892f.f14325o.J() == 0) {
                this.f10009N.getCTAButton().setVisibility(8);
            }
            this.f10009N.setVisibility(0);
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
        this.f10014S.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThirdPartyFullScreenATView thirdPartyFullScreenATView = ThirdPartyFullScreenATView.this;
                if (thirdPartyFullScreenATView.ah == null || ((BaseScreenATView) thirdPartyFullScreenATView).f10014S == null || ThirdPartyFullScreenATView.this.ak == null) {
                    return;
                }
                ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10006K = !((BaseScreenATView) r2).f10006K;
                ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10014S.setMute(((BaseScreenATView) ThirdPartyFullScreenATView.this).f10006K);
                ThirdPartyFullScreenATView.this.ak.setVideoMute(((BaseScreenATView) ThirdPartyFullScreenATView.this).f10006K);
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
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
            this.ak.setVideoMute(this.f10006K);
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
        super.T();
        this.al.b(this.am);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r0 != 6) goto L34;
     */
    @Override // com.anythink.basead.ui.BaseScreenATView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        BaseEndCardView baseEndCardView;
        if (this.f10008M != null && (baseEndCardView = this.f10010O) != null && baseEndCardView.getParent() == null) {
            if (am()) {
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                if (b(this.f10001E)) {
                    int i = this.f10001E;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 5) {
                                int i4 = this.f10022d;
                                int i9 = (int) (i4 * 0.5f);
                                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i4 - i9));
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.width = this.f10021c;
                                    layoutParams.height = i9;
                                    this.f10009N.setLayoutParams(layoutParams);
                                    this.f10009N.removeAllViews();
                                    this.f10009N.setLayoutType(this.f10001E);
                                }
                            }
                        }
                        int a9 = q.a(getContext(), 300.0f);
                        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(this.f10021c - a9, -1));
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = a9;
                            layoutParams2.height = -1;
                            this.f10009N.setLayoutParams(layoutParams2);
                            this.f10009N.removeAllViews();
                            this.f10009N.setLayoutType(this.f10001E);
                        }
                    } else {
                        this.f10008M.setBackgroundColor(-1);
                        int i10 = (int) (this.f10022d * 0.5f);
                        int a10 = TextUtils.isEmpty(this.f9893g.z()) ? this.f10022d - i10 : (this.f10022d - i10) + q.a(getContext(), 50.0f);
                        this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
                        this.f10010O.setNeedArc(true);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = this.f10021c;
                            layoutParams3.height = a10;
                            this.f10009N.setLayoutParams(layoutParams3);
                            this.f10009N.removeAllViews();
                            this.f10009N.setLayoutType(this.f10001E);
                        }
                    }
                }
                if (ap()) {
                    a(this.f10010O.getLayoutParams());
                } else {
                    this.f10008M.addView(this.f10010O, 1);
                }
            } else if (ap()) {
                a(new RelativeLayout.LayoutParams(-1, -1));
                T();
            } else {
                this.f10010O.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                aa().setVisibility(0);
                this.f10008M.addView(this.f10010O, 1);
            }
            ah();
        }
        af();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void V() {
        if (this.ah != null && !ap() && this.ah.getParent() != null) {
            ((ViewGroup) this.ah.getParent()).removeView(this.ah);
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
        Timer timer = this.ai;
        if (timer != null) {
            timer.cancel();
            this.ai = null;
        }
        this.al.b(this.am);
        BaseAd baseAd = this.ak;
        if (baseAd != null) {
            baseAd.setNativeEventListener(null);
            this.ak.clear(this);
            this.ak.destroy();
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
        com.anythink.basead.mixad.f.b bVar = this.an;
        if (bVar != null) {
            bVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void handleFullScreenClick() {
        if (!this.ak.isNativeExpress() && at()) {
            View view = this.ah;
            if (!aq()) {
                if (ar()) {
                    c.c(view);
                }
            } else {
                Object parent = getParent();
                if (parent instanceof ViewGroup) {
                    c.c((View) parent);
                }
                c.c(view);
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public void init() {
        b();
        this.f10000D = b(this.f10001E);
        this.ak.setNativeEventListener(new p() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView.2
            @Override // com.anythink.core.common.d.p
            public final void a(String str, String str2) {
                ThirdPartyFullScreenATView.this.x();
                ThirdPartyFullScreenATView.this.a(g.a(str, str2));
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdClicked(View view) {
                int i = com.anythink.basead.mixad.f.b.f9720a;
                if (ThirdPartyFullScreenATView.this.an != null) {
                    i = ThirdPartyFullScreenATView.this.an.a();
                }
                if (((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W.b(new j().a(1, i));
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdDislikeButtonClick() {
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdImpressed() {
                if (ThirdPartyFullScreenATView.this.ao) {
                    return;
                }
                ThirdPartyFullScreenATView.b(ThirdPartyFullScreenATView.this);
                if (((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W.a(new j());
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoEnd() {
                if (ThirdPartyFullScreenATView.this.ap) {
                    return;
                }
                ThirdPartyFullScreenATView.n(ThirdPartyFullScreenATView.this);
                ThirdPartyFullScreenATView.o(ThirdPartyFullScreenATView.this);
                ThirdPartyFullScreenATView.this.T();
                if (((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W.b();
                }
                ThirdPartyFullScreenATView.this.x();
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoProgress(int i) {
                ThirdPartyFullScreenATView.o(ThirdPartyFullScreenATView.this);
                ThirdPartyFullScreenATView.a(ThirdPartyFullScreenATView.this, i);
            }

            @Override // com.anythink.core.common.d.o
            public final void onAdVideoStart() {
                ThirdPartyFullScreenATView.h(ThirdPartyFullScreenATView.this);
                if (((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W != null) {
                    ((BaseScreenATView) ThirdPartyFullScreenATView.this).f10018W.a();
                }
                if (ThirdPartyFullScreenATView.this.aq() && ThirdPartyFullScreenATView.this.at()) {
                    c.a(ThirdPartyFullScreenATView.this.ah);
                }
            }

            @Override // com.anythink.core.common.d.o
            public final void onDeeplinkCallback(boolean z8) {
            }

            @Override // com.anythink.core.common.d.o
            public final void onDownloadConfirmCallback(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            }
        });
        if (!this.f10005I) {
            int i = ((BaseScreenATView) this).f10019a;
            if (1 != i && 3 == i) {
                if (am()) {
                    w();
                    int i4 = this.f9999C;
                    if (i4 >= 0) {
                        if (i4 > 0) {
                            this.al.a(this.am, i4, true);
                        } else {
                            T();
                        }
                    }
                }
            }
            af();
        }
        x();
        af();
    }

    private void f(int i) {
        post(new AnonymousClass3(i));
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void b() {
        super.b();
        ViewGroup viewGroup = this.f10013R;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void w() {
        View view = this.ah;
        if (view != null) {
            this.f10008M.addView(view, 0, new RelativeLayout.LayoutParams(-1, -1));
            double videoDuration = this.ak.getVideoDuration();
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
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void x() {
        if (this.ak.isNativeExpress()) {
            return;
        }
        w wVar = this.f9893g;
        if (wVar != null && TextUtils.isEmpty(wVar.B()) && this.ah == null) {
            return;
        }
        super.x();
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final int y() {
        int i = this.f10001E;
        return i == 8 ? i : this.f10021c < this.f10022d ? this.ad >= this.ae ? 1 : 5 : this.ad < this.ae ? 2 : 6;
    }

    private void b(List<View> list) {
        if (this.f10009N.getCTAButton() != null) {
            if (this.f10009N.getCTAButton() instanceof CTAButtonLayout) {
                list.add(((CTAButtonLayout) this.f10009N.getCTAButton()).getMajorCTAButtonView());
            } else {
                list.add(this.f10009N.getCTAButton());
            }
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        this.aq = new FrameLayout(getContext());
        this.aq.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.aq.addView(LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_thirdparty_full_screen", "layout"), (ViewGroup) this, false));
        addView(this.aq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThirdPartyFullScreenATView(Context context, x xVar, w wVar, String str, int i, int i4, BaseAd baseAd, com.anythink.core.common.l.a aVar) {
        super(context, xVar, wVar, str, i, i4);
        this.al = d.a();
        this.am = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.ui.thirdparty.ThirdPartyFullScreenATView.1
            @Override // java.lang.Runnable
            public final void run() {
                ThirdPartyFullScreenATView.this.T();
            }
        };
        this.ao = false;
        this.ap = false;
        this.ak = baseAd;
        View adMediaView = baseAd.getAdMediaView(new Object[0]);
        this.ah = adMediaView;
        if (adMediaView != null && this.f9892f.f14317f == 28) {
            c.c(adMediaView);
        }
        if (aVar instanceof View) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.aq.addView((View) aVar, layoutParams);
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 5 || i == 6) {
            return e.a(this.f9893g);
        }
        return i == 8;
    }

    private void b(View view) {
        if (view == null || this.f9892f.f14317f != 28) {
            return;
        }
        c.c(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(com.anythink.core.common.l.a aVar) {
        if (aVar instanceof View) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.aq.addView((View) aVar, layoutParams);
        }
    }

    private void a(ViewGroup.LayoutParams layoutParams) {
        View view = this.ah;
        if (view == null || this.f10008M == null) {
            return;
        }
        am.a(view);
        this.f10008M.addView(this.ah, 1, layoutParams);
    }

    public static /* synthetic */ void a(ThirdPartyFullScreenATView thirdPartyFullScreenATView, int i) {
        thirdPartyFullScreenATView.post(thirdPartyFullScreenATView.new AnonymousClass3(i));
    }
}
