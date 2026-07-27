package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.anythink.basead.b.c.d;
import com.anythink.basead.j.e;
import com.anythink.basead.mraid.MraidWebView;
import com.anythink.basead.mraid.i;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.ClickToReLoadView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidContainerView extends FrameLayout {
    public static final int ENDCARD_INIT = 1;
    public static final int LOAD_RETRY_CLICK = 3;
    public static final int PRE_LOAD = 5;
    public static final int VISIABLE_CLICK = 4;
    public static final int WINDOW_ATTACH_CHECK = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final String f10269o = "MraidContainerView";

    /* renamed from: a, reason: collision with root package name */
    protected w f10270a;

    /* renamed from: b, reason: collision with root package name */
    protected y f10271b;

    /* renamed from: c, reason: collision with root package name */
    protected x f10272c;

    /* renamed from: d, reason: collision with root package name */
    protected e f10273d;

    /* renamed from: e, reason: collision with root package name */
    protected c f10274e;

    /* renamed from: f, reason: collision with root package name */
    protected ClickToReLoadView f10275f;

    /* renamed from: g, reason: collision with root package name */
    protected MraidWebView f10276g;

    /* renamed from: h, reason: collision with root package name */
    protected a f10277h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f10278j;

    /* renamed from: k, reason: collision with root package name */
    boolean f10279k;

    /* renamed from: l, reason: collision with root package name */
    long f10280l;

    /* renamed from: m, reason: collision with root package name */
    final long f10281m;

    /* renamed from: n, reason: collision with root package name */
    boolean f10282n;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10283p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10284q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10285r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f10286s;

    /* renamed from: t, reason: collision with root package name */
    private f.b f10287t;

    /* renamed from: com.anythink.basead.ui.MraidContainerView$4, reason: invalid class name */
    public class AnonymousClass4 implements ClickToReLoadView.a {
        public AnonymousClass4() {
        }

        @Override // com.anythink.basead.ui.ClickToReLoadView.a
        public final void a() {
            MraidContainerView.this.loadMraidWebView(3);
        }
    }

    public interface a {
        void a();

        void a(String str);

        void b();

        void c();
    }

    public MraidContainerView(Context context) {
        super(context);
        this.f10281m = com.anythink.basead.exoplayer.f.f7344a;
    }

    public static /* synthetic */ boolean b(MraidContainerView mraidContainerView) {
        mraidContainerView.f10285r = false;
        return false;
    }

    private void e() {
        if (this.f10275f == null) {
            ClickToReLoadView clickToReLoadView = new ClickToReLoadView(getContext());
            this.f10275f = clickToReLoadView;
            clickToReLoadView.setListener(new AnonymousClass4());
        }
        addView(this.f10275f, new FrameLayout.LayoutParams(-1, -1));
    }

    private void f() {
        ClickToReLoadView clickToReLoadView = this.f10275f;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
    }

    private void g() {
        c cVar = this.f10274e;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        c cVar = this.f10274e;
        if (cVar != null) {
            cVar.c();
        }
    }

    private void i() {
        if (!this.f10278j && this.f10283p && this.i) {
            this.f10278j = true;
            e eVar = this.f10273d;
            if (eVar == null || !eVar.a()) {
                return;
            }
            this.f10273d.a(BaseATView.a.f9961z, this.f10276g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10280l = System.currentTimeMillis();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fireAudioVolumeChange(boolean z8) {
        try {
            if (!this.f10286s || this.f10276g == null) {
                return;
            }
            if (z8) {
                com.anythink.core.express.b.a.a();
                com.anythink.core.express.b.a.a(this.f10276g, 0.0d);
            } else {
                com.anythink.core.express.b.a.a();
                com.anythink.core.express.b.a.a(this.f10276g, 1.0d);
            }
        } catch (Exception unused) {
        }
    }

    public void fireMraidIsViewable(boolean z8) {
        MraidWebView mraidWebView;
        try {
            if (!this.f10286s || (mraidWebView = this.f10276g) == null) {
                return;
            }
            if (z8) {
                com.anythink.basead.mraid.c.a(mraidWebView, true);
            } else {
                com.anythink.basead.mraid.c.a(mraidWebView, false);
            }
        } catch (Throwable unused) {
        }
    }

    public void init() {
        if (d.a(this.f10272c, this.f10270a)) {
            b();
            return;
        }
        c cVar = new c(this);
        this.f10274e = cVar;
        cVar.a();
    }

    public void loadMraidWebView(final int i) {
        f();
        if (this.f10285r || this.f10286s) {
            return;
        }
        if (!this.f10279k || this.f10283p) {
            this.f10285r = true;
            c cVar = this.f10274e;
            if (cVar != null) {
                cVar.b();
            }
            final String a9 = i.a(this.f10272c, this.f10270a);
            if (TextUtils.isEmpty(a9)) {
                this.f10285r = false;
                h();
            } else {
                final String b9 = d.b(this.f10272c, this.f10270a);
                t.b().b(new Runnable() { // from class: com.anythink.basead.ui.MraidContainerView.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            MraidContainerView.this.f10276g = new MraidWebView(t.b().g());
                            MraidContainerView mraidContainerView = MraidContainerView.this;
                            if (mraidContainerView.f10279k) {
                                mraidContainerView.c();
                            }
                            String str = b9;
                            String str2 = a9;
                            MraidWebView mraidWebView = MraidContainerView.this.f10276g;
                            i.a aVar = new i.a() { // from class: com.anythink.basead.ui.MraidContainerView.3.1
                                @Override // com.anythink.basead.mraid.i.a
                                public final void a() {
                                    String unused = MraidContainerView.f10269o;
                                    MraidContainerView.b(MraidContainerView.this);
                                    MraidContainerView.this.b();
                                    MraidContainerView.this.h();
                                }

                                @Override // com.anythink.basead.mraid.i.a
                                public final void a(com.anythink.basead.d.f fVar) {
                                    MraidContainerView.b(MraidContainerView.this);
                                    String unused = MraidContainerView.f10269o;
                                    fVar.c();
                                    MraidContainerView.e(MraidContainerView.this);
                                    MraidContainerView.this.h();
                                }
                            };
                            MraidContainerView mraidContainerView2 = MraidContainerView.this;
                            i.a(str, str2, mraidWebView, aVar, mraidContainerView2.f10270a, mraidContainerView2.f10272c, i, mraidContainerView2.f10279k);
                        } catch (Throwable th) {
                            MraidContainerView.b(MraidContainerView.this);
                            String unused = MraidContainerView.f10269o;
                            th.getMessage();
                            MraidContainerView.this.h();
                            a aVar2 = MraidContainerView.this.f10277h;
                            if (aVar2 != null) {
                                th.getMessage();
                                aVar2.c();
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10283p = true;
        i();
        a(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10283p = false;
    }

    public void release() {
        MraidWebView mraidWebView;
        try {
            if (this.f10286s && (mraidWebView = this.f10276g) != null) {
                am.a(mraidWebView);
                this.f10276g.release();
                com.anythink.core.common.res.d.a(t.b().g()).a(this.f10272c, this.f10270a);
            }
            am.a(this);
        } catch (Throwable unused) {
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z8) {
        this.f10284q = z8;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f10283p) {
            a(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MraidWebView b9 = d.b(d.b(this.f10272c, this.f10270a));
        this.f10276g = b9;
        if (b9 != null) {
            f();
            this.f10286s = true;
            if (this.f10284q) {
                this.f10276g.setNeedRegisterVolumeChangeReceiver(true);
            }
            this.f10276g.prepare(getContext(), new com.anythink.basead.mraid.e() { // from class: com.anythink.basead.ui.MraidContainerView.1
                @Override // com.anythink.basead.mraid.e
                public final void a() {
                    a aVar = MraidContainerView.this.f10277h;
                    if (aVar != null) {
                        aVar.b();
                    }
                }

                @Override // com.anythink.core.express.b.b
                public final void close() {
                }

                @Override // com.anythink.core.express.b.b
                public final void open(String str) {
                    MraidContainerView mraidContainerView = MraidContainerView.this;
                    if (mraidContainerView.f10277h == null || !mraidContainerView.a(str)) {
                        return;
                    }
                    MraidContainerView.this.f10277h.a(str);
                    MraidContainerView.this.f10280l = 0L;
                }
            });
            c();
            d();
            this.i = true;
            i();
            a aVar = this.f10277h;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f10276g.getParent() == null) {
            this.f10276g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.f10276g);
        }
    }

    private void d() {
        if (this.f10270a.i() <= 0 || this.f10270a.j() <= 0) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.anythink.basead.ui.MraidContainerView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                try {
                    MraidContainerView mraidContainerView = MraidContainerView.this;
                    if (!mraidContainerView.f10282n) {
                        mraidContainerView.f10282n = true;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mraidContainerView.f10276g.getLayoutParams();
                        layoutParams.width = q.a(t.b().g(), MraidContainerView.this.f10270a.i());
                        layoutParams.height = q.a(t.b().g(), MraidContainerView.this.f10270a.j());
                        int width = (MraidContainerView.this.getWidth() - MraidContainerView.this.getPaddingLeft()) - MraidContainerView.this.getPaddingRight();
                        int height = (MraidContainerView.this.getHeight() - MraidContainerView.this.getPaddingBottom()) - MraidContainerView.this.getPaddingTop();
                        float i = MraidContainerView.this.f10270a.i() / (MraidContainerView.this.f10270a.j() * 1.0f);
                        layoutParams.width = Math.min(width, layoutParams.width);
                        int min = Math.min(height, layoutParams.height);
                        layoutParams.height = min;
                        int i4 = layoutParams.width;
                        float f6 = i4 / (min * 1.0f);
                        if (f6 > i) {
                            layoutParams.width = (int) (min * i);
                        } else if (f6 < i) {
                            layoutParams.height = (int) (i4 / i);
                        }
                        layoutParams.gravity = 17;
                        MraidContainerView.this.f10276g.setLayoutParams(layoutParams);
                    }
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public MraidContainerView(Context context, w wVar, x xVar, e eVar, a aVar) {
        super(context);
        this.f10281m = com.anythink.basead.exoplayer.f.f7344a;
        this.f10270a = wVar;
        this.f10271b = xVar.f14325o;
        this.f10272c = xVar;
        this.f10273d = eVar;
        this.f10277h = aVar;
        setBackgroundDrawable(new com.anythink.basead.ui.b.a());
        this.f10279k = false;
        y yVar = this.f10271b;
        if (yVar != null) {
            this.f10279k = yVar.bK() == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public synchronized boolean a(String str) {
        boolean z8;
        ?? r72;
        try {
            z8 = false;
            if (System.currentTimeMillis() - this.f10280l > com.anythink.basead.exoplayer.f.f7344a) {
                boolean bp = this.f10270a.r().bp();
                boolean z9 = !bp;
                if (!bp) {
                    if (this.f10287t == null) {
                        this.f10287t = new f.b(1);
                    }
                    if (!am.a(this, this.f10287t, 20)) {
                        r72 = 2;
                    }
                }
                r72 = bp;
                z8 = z9;
            } else {
                r72 = 0;
                z8 = true;
            }
            if (!z8) {
                String str2 = "";
                String str3 = "";
                String str4 = "";
                w wVar = this.f10270a;
                if (wVar != null && (wVar instanceof r)) {
                    str2 = ((r) wVar).aD();
                    str3 = ((r) this.f10270a).w();
                    str4 = ((r) this.f10270a).v();
                }
                com.anythink.core.common.u.e.a(this.f10272c, str4, str3, str2, str, (int) r72);
            }
        } finally {
        }
        return z8;
    }

    public static /* synthetic */ void e(MraidContainerView mraidContainerView) {
        if (mraidContainerView.f10275f == null) {
            ClickToReLoadView clickToReLoadView = new ClickToReLoadView(mraidContainerView.getContext());
            mraidContainerView.f10275f = clickToReLoadView;
            clickToReLoadView.setListener(mraidContainerView.new AnonymousClass4());
        }
        mraidContainerView.addView(mraidContainerView.f10275f, new FrameLayout.LayoutParams(-1, -1));
    }

    private void a(int i) {
        if (d.a(this.f10272c, this.f10270a)) {
            return;
        }
        loadMraidWebView(i);
    }
}
