package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.exoplayer.f.f;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.q;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.widget.FeedBackButton;

/* loaded from: classes.dex */
public class BaseATSplashNativeView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    private static final String f20756s = "MBSplashNativeView";

    /* renamed from: A, reason: collision with root package name */
    private TextView f20757A;

    /* renamed from: B, reason: collision with root package name */
    private MBNoRecycledCrashImageView f20758B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f20759C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f20760D;

    /* renamed from: E, reason: collision with root package name */
    private int f20761E;

    /* renamed from: F, reason: collision with root package name */
    private int f20762F;

    /* renamed from: G, reason: collision with root package name */
    private int f20763G;

    /* renamed from: H, reason: collision with root package name */
    private int f20764H;

    /* renamed from: I, reason: collision with root package name */
    private int f20765I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f20766K;

    /* renamed from: L, reason: collision with root package name */
    private float f20767L;

    /* renamed from: M, reason: collision with root package name */
    private float f20768M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20769N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f20770O;

    /* renamed from: P, reason: collision with root package name */
    private String f20771P;

    /* renamed from: Q, reason: collision with root package name */
    private String f20772Q;

    /* renamed from: R, reason: collision with root package name */
    private String f20773R;

    /* renamed from: S, reason: collision with root package name */
    private String f20774S;

    /* renamed from: T, reason: collision with root package name */
    private String f20775T;

    /* renamed from: U, reason: collision with root package name */
    private String f20776U;

    /* renamed from: a, reason: collision with root package name */
    protected TextView f20777a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f20778b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f20779c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f20780d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f20781e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f20782f;

    /* renamed from: g, reason: collision with root package name */
    protected MBSplashClickView f20783g;

    /* renamed from: h, reason: collision with root package name */
    protected int f20784h;
    protected int i;

    /* renamed from: j, reason: collision with root package name */
    protected int f20785j;

    /* renamed from: k, reason: collision with root package name */
    protected int f20786k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f20787l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f20788m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f20789n;

    /* renamed from: o, reason: collision with root package name */
    protected ATSplashView f20790o;

    /* renamed from: p, reason: collision with root package name */
    protected d f20791p;

    /* renamed from: q, reason: collision with root package name */
    protected MBShakeView f20792q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.core.express.c.b f20793r;

    /* renamed from: t, reason: collision with root package name */
    private MBNoRecycledCrashImageView f20794t;

    /* renamed from: u, reason: collision with root package name */
    private MBNoRecycledCrashImageView f20795u;

    /* renamed from: v, reason: collision with root package name */
    private RelativeLayout f20796v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f20797w;

    /* renamed from: x, reason: collision with root package name */
    private FeedBackButton f20798x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f20799y;

    /* renamed from: z, reason: collision with root package name */
    private MBNoRecycledCrashImageView f20800z;

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$1, reason: invalid class name */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseATSplashNativeView.a(BaseATSplashNativeView.this);
                        BaseATSplashNativeView.this.f20799y.setVisibility(4);
                        BaseATSplashNativeView.this.f20795u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f20795u.setImageBitmap(bitmap);
                    } else if (BaseATSplashNativeView.this.f20765I == 1) {
                        BaseATSplashNativeView.this.f20799y.setVisibility(0);
                        try {
                            Bitmap a9 = q.a(bitmap, v.b(t.b().g(), 10.0f));
                            if (a9 != null && !a9.isRecycled()) {
                                BaseATSplashNativeView.this.f20758B.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseATSplashNativeView.this.f20758B.setImageBitmap(a9);
                            }
                        } catch (Throwable th) {
                            try {
                                th.getMessage();
                                BaseATSplashNativeView.this.f20758B.setImageBitmap(bitmap);
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                        }
                        BaseATSplashNativeView.this.f20757A.setText(BaseATSplashNativeView.this.f20791p.bj());
                        BaseATSplashNativeView.g(BaseATSplashNativeView.this);
                    } else {
                        BaseATSplashNativeView.this.f20799y.setVisibility(4);
                        BaseATSplashNativeView.this.f20795u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f20795u.setImageBitmap(bitmap);
                    }
                    try {
                        h.a(t.b().g(), bitmap, new h.a() { // from class: com.anythink.expressad.splash.view.BaseATSplashNativeView.1.1
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                if (bitmap2 == null || bitmap2.isRecycled()) {
                                    return;
                                }
                                BaseATSplashNativeView.this.f20794t.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                BaseATSplashNativeView.this.f20794t.setImageBitmap(bitmap2);
                            }
                        });
                    } catch (Throwable unused) {
                        BaseATSplashNativeView.this.f20795u.setImageBitmap(bitmap);
                    }
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$3, reason: invalid class name */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseATSplashNativeView.this.a(1);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseATSplashNativeView.this.a(0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            if (baseATSplashNativeView.f20787l) {
                if (baseATSplashNativeView.f20790o.getSplashJSBridgeImpl() != null && BaseATSplashNativeView.this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    BaseATSplashNativeView.this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                }
                BaseATSplashNativeView.this.f20777a.setVisibility(4);
                BaseATSplashNativeView.this.f20777a.setEnabled(false);
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.f20789n = true;
            BaseATSplashNativeView.a(baseATSplashNativeView, false);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.f20789n = false;
            BaseATSplashNativeView.a(baseATSplashNativeView, true);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.f20789n = false;
            BaseATSplashNativeView.a(baseATSplashNativeView, true);
        }
    }

    public BaseATSplashNativeView(Context context) {
        super(context);
        this.f20788m = false;
        this.f20789n = false;
    }

    private void g() {
        Drawable drawable;
        v.a(this.f20797w, this.f20791p, getContext(), true);
        try {
            drawable = getResources().getDrawable(k.a(getContext().getApplicationContext(), "anythink_splash_m_circle", k.f19632c));
            try {
                drawable.setBounds(0, 0, v.b(getContext(), 10.0f), v.b(getContext(), 10.0f));
            } catch (Throwable th) {
                th = th;
                th.getMessage();
                if (this.f20765I == 1) {
                }
                if (this.J != 0) {
                    this.f20759C.setCompoundDrawables(drawable, null, null, null);
                }
                this.f20759C.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f19636g));
                this.f20760D.setVisibility(4);
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        if (this.f20765I == 1 || !this.f20770O) {
            if (this.J != 0 && drawable != null) {
                this.f20759C.setCompoundDrawables(drawable, null, null, null);
            }
            this.f20759C.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f19636g));
            this.f20760D.setVisibility(4);
            return;
        }
        if (this.J != 0 && drawable != null) {
            this.f20760D.setCompoundDrawables(drawable, null, null, null);
        }
        this.f20760D.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f19636g));
        this.f20759C.setVisibility(4);
    }

    private void j() {
        d dVar = this.f20791p;
        if (dVar != null) {
            dVar.l(this.f20771P);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, new AnonymousClass6());
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20798x);
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20791p);
        } else {
            FeedBackButton feedBackButton = this.f20798x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    private void k() {
        if (this.f20793r != null) {
            com.anythink.core.express.c.a.a().a(this.f20793r);
        }
    }

    private void l() {
        if (this.f20793r != null) {
            com.anythink.core.express.c.a.a().b(this.f20793r);
        }
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.i != 1 || this.f20792q == null || this.f20793r == null) {
                return;
            }
            k();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f20767L = motionEvent.getRawX();
        this.f20768M = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        TextView textView = this.f20777a;
        if (textView == null || textView.getParent() == null || !(this.f20777a.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) this.f20777a.getParent()).getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int b9 = com.anythink.core.common.v.q.b(getContext()) + ((RelativeLayout.LayoutParams) layoutParams).topMargin;
            int[] iArr = new int[2];
            this.f20777a.getLocationOnScreen(iArr);
            int i11 = iArr[1];
            if (i11 < b9) {
                int i12 = b9 - i11;
                ViewParent parent = this.f20777a.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + i12, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + i12);
                }
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        if (!z3) {
            l();
        } else {
            if (this.i != 1 || this.f20792q == null || this.f20793r == null) {
                return;
            }
            k();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (!z3) {
            l();
        } else {
            if (this.i != 1 || this.f20792q == null || this.f20793r == null) {
                return;
            }
            k();
        }
    }

    public void release() {
        try {
            if (this.f20793r != null) {
                l();
                this.f20793r = null;
            }
            com.anythink.expressad.foundation.f.b.a().c(this.f20771P);
            detachAllViewsFromParent();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setIsPause(boolean z3) {
        this.f20788m = z3;
    }

    public void setNotchPadding(int i, int i6, int i9, int i10) {
        try {
            RelativeLayout relativeLayout = this.f20796v;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i11 = this.f20766K;
            layoutParams.leftMargin = i + i11;
            layoutParams.rightMargin = i6 + i11;
            layoutParams.topMargin = i9 + i11;
            layoutParams.bottomMargin = i11 + i10;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void updateCountDown(int i) {
        String str;
        if (this.f20777a != null) {
            this.f20762F = i;
            if (i <= 0) {
                str = this.f20776U;
            } else if (this.f20787l) {
                str = this.f20774S + " " + i + this.f20773R;
            } else {
                str = i + this.f20773R + " " + this.f20775T;
            }
            this.f20777a.setText(str);
        }
    }

    public static /* synthetic */ boolean a(BaseATSplashNativeView baseATSplashNativeView) {
        baseATSplashNativeView.f20770O = true;
        return true;
    }

    private void c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f20765I == 1 ? k.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout") : k.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout"), (ViewGroup) null);
            addView(inflate);
            this.f20794t = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.f20795u = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.f20796v = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.f20797w = (ImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f20798x = (FeedBackButton) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.f20777a = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.f20799y = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.f20800z = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.f20757A = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.f20758B = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.f20759C = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.f20778b = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.f20779c = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.f20780d = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.f20781e = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.f20782f = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_app_desc", "id"));
            this.f20783g = (MBSplashClickView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.f20760D = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int a9 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", k.f19636g);
            int a10 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", k.f19636g);
            int a11 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", k.f19636g);
            int a12 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f19636g);
            this.f20774S = getContext().getResources().getString(a9);
            this.f20775T = getContext().getResources().getString(a10);
            this.f20773R = getContext().getResources().getString(a11);
            this.f20776U = getContext().getResources().getString(a12);
            this.f20766K = v.b(getContext(), 9.0f);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void d() {
        try {
            this.f20769N = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f21096S);
        } catch (Throwable th) {
            th.getMessage();
        }
        d dVar = this.f20791p;
        if (dVar != null) {
            dVar.l(this.f20771P);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, new AnonymousClass6());
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20798x);
            com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20791p);
        } else {
            FeedBackButton feedBackButton = this.f20798x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.f20791p.bm())) {
            this.f20795u.setVisibility(4);
        } else {
            f.l().a(this.f20791p.bm(), new AnonymousClass1());
        }
        g();
        a();
        if (this.f20764H == 1) {
            this.f20783g.setVisibility(8);
        } else if (this.i == 1) {
            this.f20783g.setVisibility(8);
        } else {
            this.f20783g.initView(this.f20791p.dj);
        }
        if (this.f20763G == 1) {
            setOnClickListener(new AnonymousClass3());
        } else {
            this.f20783g.setOnClickListener(new AnonymousClass4());
        }
        this.f20777a.setOnClickListener(new AnonymousClass5());
        b();
        updateCountDown(this.f20761E);
    }

    private void e() {
        if (TextUtils.isEmpty(this.f20791p.bm())) {
            this.f20795u.setVisibility(4);
        } else {
            f.l().a(this.f20791p.bm(), new AnonymousClass1());
        }
    }

    private void f() {
        if (TextUtils.isEmpty(this.f20791p.bl())) {
            this.f20800z.setVisibility(4);
        } else {
            f.l().a(this.f20791p.bl(), new AnonymousClass2());
        }
    }

    private void h() {
        if (this.f20764H == 1) {
            this.f20783g.setVisibility(8);
        } else if (this.i == 1) {
            this.f20783g.setVisibility(8);
        } else {
            this.f20783g.initView(this.f20791p.dj);
        }
    }

    private void i() {
        if (this.f20763G == 1) {
            setOnClickListener(new AnonymousClass3());
        } else {
            this.f20783g.setOnClickListener(new AnonymousClass4());
        }
        this.f20777a.setOnClickListener(new AnonymousClass5());
    }

    public final void a(int i) {
        if (this.f20790o.getSplashJSBridgeImpl() == null || this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.a.a(com.anythink.expressad.splash.a.a.a.a(i, this.f20767L, this.f20768M), this.f20791p));
        } catch (Throwable th) {
            th.getMessage();
            this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener().a(this.f20791p);
        }
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20788m = false;
        this.f20789n = false;
    }

    /* renamed from: com.anythink.expressad.splash.view.BaseATSplashNativeView$2, reason: invalid class name */
    public class AnonymousClass2 implements c {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            Bitmap a9;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseATSplashNativeView.this.f20800z == null || (a9 = q.a(bitmap, v.b(t.b().g(), 40.0f))) == null || a9.isRecycled()) {
                            return;
                        }
                        BaseATSplashNativeView.this.f20800z.setImageBitmap(a9);
                    } catch (Throwable th) {
                        th.getMessage();
                        BaseATSplashNativeView.this.f20800z.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            BaseATSplashNativeView.this.f20800z.setVisibility(4);
        }
    }

    public BaseATSplashNativeView(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar) {
        super(context);
        int a9;
        this.f20788m = false;
        this.f20789n = false;
        if (bVar != null) {
            this.f20771P = bVar.b();
            this.f20772Q = bVar.a();
            this.f20791p = bVar.c();
            this.f20790o = aTSplashView;
            this.f20761E = bVar.e();
            this.f20764H = bVar.f();
            this.f20763G = bVar.g();
            this.f20784h = bVar.h();
            this.i = bVar.i();
            this.f20785j = bVar.j();
            this.f20786k = bVar.k();
            this.f20765I = bVar.l();
            this.f20787l = bVar.d();
            this.J = bVar.m();
            try {
                if (this.f20765I == 1) {
                    a9 = k.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
                } else {
                    a9 = k.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
                }
                View inflate = LayoutInflater.from(getContext()).inflate(a9, (ViewGroup) null);
                addView(inflate);
                this.f20794t = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
                this.f20795u = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
                this.f20796v = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
                this.f20797w = (ImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
                this.f20798x = (FeedBackButton) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
                this.f20777a = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
                this.f20799y = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
                this.f20800z = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
                this.f20757A = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
                this.f20758B = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
                this.f20759C = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
                this.f20778b = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
                this.f20779c = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
                this.f20780d = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
                this.f20781e = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
                this.f20782f = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_app_desc", "id"));
                this.f20783g = (MBSplashClickView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
                this.f20760D = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
                int a10 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", k.f19636g);
                int a11 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", k.f19636g);
                int a12 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", k.f19636g);
                int a13 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f19636g);
                this.f20774S = getContext().getResources().getString(a10);
                this.f20775T = getContext().getResources().getString(a11);
                this.f20773R = getContext().getResources().getString(a12);
                this.f20776U = getContext().getResources().getString(a13);
                this.f20766K = v.b(getContext(), 9.0f);
            } catch (Throwable th) {
                th.getMessage();
            }
            try {
                this.f20769N = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f21096S);
            } catch (Throwable th2) {
                th2.getMessage();
            }
            d dVar = this.f20791p;
            if (dVar != null) {
                dVar.l(this.f20771P);
            }
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f20771P, new AnonymousClass6());
                com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20798x);
                com.anythink.expressad.foundation.f.b.a().a(this.f20771P, this.f20791p);
            } else {
                FeedBackButton feedBackButton = this.f20798x;
                if (feedBackButton != null) {
                    feedBackButton.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(this.f20791p.bm())) {
                f.l().a(this.f20791p.bm(), new AnonymousClass1());
            } else {
                this.f20795u.setVisibility(4);
            }
            g();
            a();
            if (this.f20764H == 1) {
                this.f20783g.setVisibility(8);
            } else if (this.i == 1) {
                this.f20783g.setVisibility(8);
            } else {
                this.f20783g.initView(this.f20791p.dj);
            }
            if (this.f20763G == 1) {
                setOnClickListener(new AnonymousClass3());
            } else {
                this.f20783g.setOnClickListener(new AnonymousClass4());
            }
            this.f20777a.setOnClickListener(new AnonymousClass5());
            b();
            updateCountDown(this.f20761E);
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a(boolean z3) {
        if (this.f20790o.getSplashJSBridgeImpl() == null || this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener().a(z3 ? 2 : 1, this.f20762F);
    }

    public static /* synthetic */ void a(BaseATSplashNativeView baseATSplashNativeView, boolean z3) {
        if (baseATSplashNativeView.f20790o.getSplashJSBridgeImpl() == null || baseATSplashNativeView.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        baseATSplashNativeView.f20790o.getSplashJSBridgeImpl().getSplashBridgeListener().a(z3 ? 2 : 1, baseATSplashNativeView.f20762F);
    }

    public static /* synthetic */ void g(BaseATSplashNativeView baseATSplashNativeView) {
        if (!TextUtils.isEmpty(baseATSplashNativeView.f20791p.bl())) {
            f.l().a(baseATSplashNativeView.f20791p.bl(), baseATSplashNativeView.new AnonymousClass2());
        } else {
            baseATSplashNativeView.f20800z.setVisibility(4);
        }
    }
}
