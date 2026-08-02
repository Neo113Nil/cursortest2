package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.d.g;
import com.anythink.basead.e;
import com.anythink.basead.g.j;
import com.anythink.basead.ui.component.CTAButtonLayout;
import com.anythink.basead.ui.f.d;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class BaseSplashATView extends BaseATView {

    /* renamed from: A, reason: collision with root package name */
    private Map<String, Object> f10717A;

    /* renamed from: B, reason: collision with root package name */
    private final int f10718B;

    /* renamed from: C, reason: collision with root package name */
    private final int f10719C;

    /* renamed from: D, reason: collision with root package name */
    private final int f10720D;

    /* renamed from: E, reason: collision with root package name */
    private AtomicInteger f10721E;

    /* renamed from: I, reason: collision with root package name */
    protected TextView f10722I;
    protected CloseFrameLayout J;

    /* renamed from: K, reason: collision with root package name */
    protected ViewGroup f10723K;

    /* renamed from: L, reason: collision with root package name */
    protected String f10724L;

    /* renamed from: M, reason: collision with root package name */
    protected Timer f10725M;

    /* renamed from: N, reason: collision with root package name */
    protected volatile boolean f10726N;

    /* renamed from: O, reason: collision with root package name */
    protected com.anythink.basead.g.a f10727O;

    /* renamed from: P, reason: collision with root package name */
    protected c f10728P;

    /* renamed from: Q, reason: collision with root package name */
    final long f10729Q;

    /* renamed from: R, reason: collision with root package name */
    protected e f10730R;

    /* renamed from: S, reason: collision with root package name */
    protected final View.OnClickListener f10731S;

    /* renamed from: T, reason: collision with root package name */
    protected d f10732T;

    /* renamed from: U, reason: collision with root package name */
    protected int f10733U;

    /* renamed from: V, reason: collision with root package name */
    protected com.anythink.basead.ui.f.a f10734V;

    /* renamed from: W, reason: collision with root package name */
    boolean f10735W;

    /* renamed from: a, reason: collision with root package name */
    private f.b f10736a;
    boolean aa;
    boolean ab;
    boolean ac;

    /* renamed from: b, reason: collision with root package name */
    private long f10737b;

    /* renamed from: c, reason: collision with root package name */
    private long f10738c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10739d;

    /* renamed from: com.anythink.basead.ui.BaseSplashATView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseSplashATView.this.f10521f.f14954o.B() == 0 || BaseSplashATView.this.ab) {
                BaseSplashATView.this.a(true, 1);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashATView$3, reason: invalid class name */
    public class AnonymousClass3 extends TimerTask {
        public AnonymousClass3() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            BaseSplashATView baseSplashATView = BaseSplashATView.this;
            if (!am.a(baseSplashATView, baseSplashATView.f10736a)) {
                if (BaseSplashATView.this.f10721E.compareAndSet(2, 3)) {
                    BaseSplashATView.this.a(111);
                }
            } else {
                BaseSplashATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashATView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (BaseSplashATView.this.f10737b > 0) {
                            BaseSplashATView baseSplashATView2 = BaseSplashATView.this;
                            baseSplashATView2.a(baseSplashATView2.f10737b);
                            BaseSplashATView.this.f10737b -= 1000;
                            return;
                        }
                        if (!BaseSplashATView.this.needShowSplashEndCard()) {
                            BaseSplashATView.d(BaseSplashATView.this);
                            return;
                        }
                        BaseSplashATView baseSplashATView3 = BaseSplashATView.this;
                        baseSplashATView3.onSplashEndCardCountDownTick(baseSplashATView3.f10738c);
                        BaseSplashATView.this.f10738c -= 1000;
                        if (BaseSplashATView.this.f10738c <= 0) {
                            BaseSplashATView.d(BaseSplashATView.this);
                        }
                    }
                });
                if (BaseSplashATView.this.f10721E.compareAndSet(3, 2)) {
                    BaseSplashATView.this.a(110);
                }
            }
        }
    }

    public BaseSplashATView(Context context) {
        super(context);
        this.f10724L = "Skip";
        this.f10729Q = 1000L;
        this.f10737b = com.anythink.basead.exoplayer.f.f7973a;
        this.f10738c = com.anythink.basead.exoplayer.f.f7973a;
        this.f10739d = false;
        this.f10731S = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashATView baseSplashATView = BaseSplashATView.this;
                View view2 = baseSplashATView.f10531q;
                if (view2 == null || view2 != view) {
                    baseSplashATView.a(1, 2);
                } else {
                    baseSplashATView.a(1, 1);
                }
            }
        };
        this.f10733U = 2;
        this.f10718B = 1;
        this.f10719C = 2;
        this.f10720D = 3;
        this.f10721E = new AtomicInteger(1);
        this.f10735W = false;
        this.aa = false;
        this.ab = false;
    }

    private void d() {
        a(true, 2);
        this.f10722I.setText(this.f10724L);
        this.ab = true;
    }

    public final void A() {
        a(111);
        if (this.f10730R == null) {
            this.f10730R = new e();
        }
        this.f10730R.a(getContext(), this.f10522g, this.f10521f, new e.a() { // from class: com.anythink.basead.ui.BaseSplashATView.7
            @Override // com.anythink.basead.e.a
            public final void a() {
            }

            @Override // com.anythink.basead.e.a
            public final void b() {
                BaseSplashATView.this.a(110);
            }
        });
    }

    public final void B() {
        Timer timer = this.f10725M;
        if (timer != null) {
            timer.cancel();
        }
        this.f10725M = null;
    }

    public final boolean C() {
        return com.anythink.basead.ui.f.b.a(this.f10537w, this.f10521f) && !this.f10726N;
    }

    public void beforeSplashEndCardShow() {
        a(118);
        Map<String, Object> map = this.f10717A;
        if (map != null) {
            map.put(b.C0074b.f12897d, 1);
        }
    }

    public void checkSkipViewLocation() {
        try {
            ViewGroup.LayoutParams layoutParams = this.f10722I.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                int b9 = ((FrameLayout.LayoutParams) layoutParams).topMargin + q.b(getContext());
                int[] iArr = new int[2];
                this.f10722I.getLocationOnScreen(iArr);
                int i = iArr[1];
                if (i < b9) {
                    int i4 = b9 - i;
                    ViewParent parent = this.f10722I.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).setPadding(((ViewGroup) parent).getPaddingLeft(), ((ViewGroup) parent).getPaddingTop() + i4, ((ViewGroup) parent).getPaddingRight(), ((ViewGroup) parent).getPaddingBottom());
                    }
                    View findViewById = findViewById(q.a(getContext(), "myoffer_btn_mute_id", "id"));
                    if (findViewById != null && (findViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                        layoutParams2.topMargin += i4;
                        findViewById.setLayoutParams(layoutParams2);
                    }
                    View findViewById2 = findViewById(q.a(getContext(), "myoffer_feedback_ll_id", "id"));
                    if (findViewById2 == null || !(findViewById2.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
                    layoutParams3.topMargin += i4;
                    findViewById2.setLayoutParams(layoutParams3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        this.f10727O = null;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void f() {
        this.f10735W = true;
        com.anythink.basead.g.a aVar = this.f10727O;
        if (aVar != null) {
            aVar.onAdShow(new j());
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void g() {
        if (this.f10522g instanceof bj) {
            if (this.f10728P == null) {
                this.f10728P = new c(this);
            }
            this.f10728P.b();
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void h() {
        if (!(this.f10522g instanceof bj) || this.f10728P == null) {
            return;
        }
        post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashATView.5
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashATView.this.f10728P.c();
            }
        });
    }

    public boolean needShowSplashEndCard() {
        return (!this.f10526l || this.f10739d) && com.anythink.basead.b.e.b(this.f10522g, this.f10521f);
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false, 3);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        checkSkipViewLocation();
    }

    public void onSplashEndCardCountDownTick(long j6) {
        this.f10739d = true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z6) {
        super.onVisibilityAggregated(z6);
        if (z6) {
            a(110);
        } else {
            a(111);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (Build.VERSION.SDK_INT < 28) {
            if (z6) {
                a(110);
            } else {
                a(111);
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 || this.aa) {
            return;
        }
        this.aa = true;
        if (this.ac) {
            return;
        }
        this.J.setVisibility(0);
        this.J.setOnClickListener(new AnonymousClass2());
        this.ab = false;
        Timer timer = new Timer();
        this.f10725M = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        a(this.f10737b);
        this.f10737b -= 1000;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final RelativeLayout.LayoutParams q() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (this.f10521f.f14954o.C() == 2) {
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, q.a(getContext(), 154.0f));
            return layoutParams;
        }
        int measuredHeight = (getMeasuredHeight() * 2) / 3;
        layoutParams.addRule(11);
        layoutParams.setMargins(0, measuredHeight, 0, 0);
        return layoutParams;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public int r() {
        return 3;
    }

    public void setAdExtraInfoMap(Map<String, Object> map) {
        this.f10717A = map;
    }

    public void setDontCountDown(boolean z6) {
        CloseFrameLayout closeFrameLayout;
        this.ac = z6;
        if (!z6 || (closeFrameLayout = this.J) == null) {
            return;
        }
        closeFrameLayout.setVisibility(8);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void u() {
        super.u();
        a(g.a(g.f6965k, g.ag));
    }

    public void x() {
        int size = this.f10528n.size();
        for (int i = 0; i < size; i++) {
            View view = this.f10528n.get(i);
            if (view != null) {
                view.setOnClickListener(this.f10731S);
            }
        }
        ViewGroup viewGroup = this.f10723K;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashATView.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseSplashATView.this.A();
                }
            });
        }
    }

    public boolean y() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void e() {
        super.e();
        x xVar = this.f10521f;
        if (xVar != null) {
            this.f10732T = new d(this.f10522g, xVar.f14954o);
        }
    }

    private void b() {
        if (this.aa) {
            return;
        }
        this.aa = true;
        if (this.ac) {
            return;
        }
        this.J.setVisibility(0);
        this.J.setOnClickListener(new AnonymousClass2());
        this.ab = false;
        Timer timer = new Timer();
        this.f10725M = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        a(this.f10737b);
        this.f10737b -= 1000;
    }

    private void c() {
        this.J.setVisibility(0);
        this.J.setOnClickListener(new AnonymousClass2());
        this.ab = false;
        Timer timer = new Timer();
        this.f10725M = timer;
        timer.schedule(new AnonymousClass3(), 1000L, 1000L);
        a(this.f10737b);
        this.f10737b -= 1000;
    }

    public final void a(com.anythink.basead.d.f fVar) {
        if (this.f10735W) {
            return;
        }
        this.f10735W = true;
        com.anythink.basead.g.a aVar = this.f10727O;
        if (aVar != null) {
            aVar.onShowFailed(fVar);
        }
    }

    public static /* synthetic */ void d(BaseSplashATView baseSplashATView) {
        baseSplashATView.a(true, 2);
        baseSplashATView.f10722I.setText(baseSplashATView.f10724L);
        baseSplashATView.ab = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j6) {
        if (this.f10521f.f14954o.B() == 0) {
            this.f10722I.setText((j6 / 1000) + "s | " + this.f10724L);
            return;
        }
        this.f10722I.setText((j6 / 1000) + " s");
    }

    public void a(boolean z6, int i) {
        y yVar;
        y yVar2;
        com.anythink.basead.ui.component.a aVar;
        B();
        if (!((i != 2 && i != 7) || (yVar = this.f10521f.f14954o) == null || yVar.bJ() == 1) || this.f10726N) {
            return;
        }
        if (i == 2 && y()) {
            Map<String, Object> map = this.f10717A;
            if (map != null) {
                map.put(b.C0074b.f12896c, 1);
                return;
            }
            return;
        }
        this.f10726N = true;
        this.f10733U = i;
        if (i == 6 && (aVar = this.f10532r) != null) {
            aVar.c();
        }
        if (i == 1 && this.ab && (yVar2 = this.f10521f.f14954o) != null && yVar2.bJ() != 1) {
            i = 11;
        }
        a(115);
        if (!this.f10735W) {
            a(g.a(g.f6965k, "SplashView not showing on screen."));
        }
        com.anythink.core.common.u.e.a(this.f10522g, this.f10521f, this.f10539y, this.f10538x);
        Map<String, Object> map2 = this.f10717A;
        if (map2 != null) {
            map2.put(b.C0074b.f12894a, Integer.valueOf(i));
            this.f10717A.put(b.C0074b.f12895b, Boolean.valueOf(z6));
        }
        com.anythink.basead.g.a aVar2 = this.f10727O;
        if (aVar2 != null) {
            aVar2.onAdClosed();
        }
    }

    public BaseSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar);
        Drawable directlySplashAdCTAButtongBgDrawable;
        this.f10724L = "Skip";
        this.f10729Q = 1000L;
        this.f10737b = com.anythink.basead.exoplayer.f.f7973a;
        this.f10738c = com.anythink.basead.exoplayer.f.f7973a;
        this.f10739d = false;
        this.f10731S = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashATView baseSplashATView = BaseSplashATView.this;
                View view2 = baseSplashATView.f10531q;
                if (view2 == null || view2 != view) {
                    baseSplashATView.a(1, 2);
                } else {
                    baseSplashATView.a(1, 1);
                }
            }
        };
        this.f10733U = 2;
        int i = 1;
        this.f10718B = 1;
        this.f10719C = 2;
        this.f10720D = 3;
        this.f10721E = new AtomicInteger(1);
        this.f10735W = false;
        this.aa = false;
        this.ab = false;
        if (wVar != null && wVar.r() != null) {
            i = wVar.r().bO();
        }
        this.f10736a = new f.b(i);
        this.f10727O = aVar;
        this.f10724L = getResources().getString(q.a(getContext(), "myoffer_splash_skip_text", k.f20423g));
        this.f10722I = (TextView) findViewById(q.a(getContext(), "myoffer_splash_skip", "id"));
        this.J = (CloseFrameLayout) findViewById(q.a(getContext(), "myoffer_splash_skip_area", "id"));
        this.f10723K = (ViewGroup) findViewById(q.a(getContext(), "myoffer_feedback_ll_id", "id"));
        this.f10737b = this.f10521f.f14954o.x();
        this.f10726N = false;
        a((b) this.J, false);
        if (wVar.b() == 4) {
            try {
                View view = this.f10531q;
                if (view != null && (view instanceof CTAButtonLayout) && (directlySplashAdCTAButtongBgDrawable = ATSDKGlobalSetting.getDirectlySplashAdCTAButtongBgDrawable()) != null) {
                    ((CTAButtonLayout) this.f10531q).changeMajorButtonBackground(directlySplashAdCTAButtongBgDrawable);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f10738c = this.f10521f.f14954o.aD();
        com.anythink.basead.ui.f.a aVar2 = new com.anythink.basead.ui.f.a(this.f10522g, this.f10521f);
        this.f10734V = aVar2;
        aVar2.b(this);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(j jVar) {
        com.anythink.basead.g.a aVar = this.f10727O;
        if (aVar != null) {
            aVar.onAdClick(jVar);
        }
        w wVar = this.f10522g;
        if (wVar == null || wVar.r() == null || !this.f10522g.r().aG()) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashATView.4
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashATView.this.a(true, 6);
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(boolean z6) {
        com.anythink.basead.g.a aVar = this.f10727O;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z6);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a(int i, int i4) {
        super.a(i, i4);
        a((b) this.J, true);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void a(int i) {
        super.a(i);
        if (i == 110) {
            this.f10721E.set(2);
        } else {
            if (i != 111) {
                return;
            }
            this.f10721E.set(3);
        }
    }
}
