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
    private static final String f21543s = "MBSplashNativeView";

    /* renamed from: A, reason: collision with root package name */
    private TextView f21544A;

    /* renamed from: B, reason: collision with root package name */
    private MBNoRecycledCrashImageView f21545B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21546C;

    /* renamed from: D, reason: collision with root package name */
    private TextView f21547D;

    /* renamed from: E, reason: collision with root package name */
    private int f21548E;

    /* renamed from: F, reason: collision with root package name */
    private int f21549F;

    /* renamed from: G, reason: collision with root package name */
    private int f21550G;

    /* renamed from: H, reason: collision with root package name */
    private int f21551H;

    /* renamed from: I, reason: collision with root package name */
    private int f21552I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f21553K;

    /* renamed from: L, reason: collision with root package name */
    private float f21554L;

    /* renamed from: M, reason: collision with root package name */
    private float f21555M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21556N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f21557O;

    /* renamed from: P, reason: collision with root package name */
    private String f21558P;

    /* renamed from: Q, reason: collision with root package name */
    private String f21559Q;

    /* renamed from: R, reason: collision with root package name */
    private String f21560R;

    /* renamed from: S, reason: collision with root package name */
    private String f21561S;

    /* renamed from: T, reason: collision with root package name */
    private String f21562T;

    /* renamed from: U, reason: collision with root package name */
    private String f21563U;

    /* renamed from: a, reason: collision with root package name */
    protected TextView f21564a;

    /* renamed from: b, reason: collision with root package name */
    protected RelativeLayout f21565b;

    /* renamed from: c, reason: collision with root package name */
    protected TextView f21566c;

    /* renamed from: d, reason: collision with root package name */
    protected TextView f21567d;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f21568e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f21569f;

    /* renamed from: g, reason: collision with root package name */
    protected MBSplashClickView f21570g;

    /* renamed from: h, reason: collision with root package name */
    protected int f21571h;
    protected int i;

    /* renamed from: j, reason: collision with root package name */
    protected int f21572j;

    /* renamed from: k, reason: collision with root package name */
    protected int f21573k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f21574l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f21575m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f21576n;

    /* renamed from: o, reason: collision with root package name */
    protected ATSplashView f21577o;

    /* renamed from: p, reason: collision with root package name */
    protected d f21578p;

    /* renamed from: q, reason: collision with root package name */
    protected MBShakeView f21579q;

    /* renamed from: r, reason: collision with root package name */
    protected com.anythink.core.express.c.b f21580r;

    /* renamed from: t, reason: collision with root package name */
    private MBNoRecycledCrashImageView f21581t;

    /* renamed from: u, reason: collision with root package name */
    private MBNoRecycledCrashImageView f21582u;

    /* renamed from: v, reason: collision with root package name */
    private RelativeLayout f21583v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f21584w;

    /* renamed from: x, reason: collision with root package name */
    private FeedBackButton f21585x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f21586y;

    /* renamed from: z, reason: collision with root package name */
    private MBNoRecycledCrashImageView f21587z;

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
                        BaseATSplashNativeView.this.f21586y.setVisibility(4);
                        BaseATSplashNativeView.this.f21582u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f21582u.setImageBitmap(bitmap);
                    } else if (BaseATSplashNativeView.this.f21552I == 1) {
                        BaseATSplashNativeView.this.f21586y.setVisibility(0);
                        try {
                            Bitmap a9 = q.a(bitmap, v.b(t.b().g(), 10.0f));
                            if (a9 != null && !a9.isRecycled()) {
                                BaseATSplashNativeView.this.f21545B.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseATSplashNativeView.this.f21545B.setImageBitmap(a9);
                            }
                        } catch (Throwable th) {
                            try {
                                th.getMessage();
                                BaseATSplashNativeView.this.f21545B.setImageBitmap(bitmap);
                            } catch (Throwable th2) {
                                th2.getMessage();
                            }
                        }
                        BaseATSplashNativeView.this.f21544A.setText(BaseATSplashNativeView.this.f21578p.bj());
                        BaseATSplashNativeView.g(BaseATSplashNativeView.this);
                    } else {
                        BaseATSplashNativeView.this.f21586y.setVisibility(4);
                        BaseATSplashNativeView.this.f21582u.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseATSplashNativeView.this.f21582u.setImageBitmap(bitmap);
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
                                BaseATSplashNativeView.this.f21581t.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                BaseATSplashNativeView.this.f21581t.setImageBitmap(bitmap2);
                            }
                        });
                    } catch (Throwable unused) {
                        BaseATSplashNativeView.this.f21582u.setImageBitmap(bitmap);
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
            if (baseATSplashNativeView.f21574l) {
                if (baseATSplashNativeView.f21577o.getSplashJSBridgeImpl() != null && BaseATSplashNativeView.this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    BaseATSplashNativeView.this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                }
                BaseATSplashNativeView.this.f21564a.setVisibility(4);
                BaseATSplashNativeView.this.f21564a.setEnabled(false);
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
            baseATSplashNativeView.f21576n = true;
            BaseATSplashNativeView.a(baseATSplashNativeView, false);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.f21576n = false;
            BaseATSplashNativeView.a(baseATSplashNativeView, true);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            BaseATSplashNativeView baseATSplashNativeView = BaseATSplashNativeView.this;
            baseATSplashNativeView.f21576n = false;
            BaseATSplashNativeView.a(baseATSplashNativeView, true);
        }
    }

    public BaseATSplashNativeView(Context context) {
        super(context);
        this.f21575m = false;
        this.f21576n = false;
    }

    private void g() {
        Drawable drawable;
        v.a(this.f21584w, this.f21578p, getContext(), true);
        try {
            drawable = getResources().getDrawable(k.a(getContext().getApplicationContext(), "anythink_splash_m_circle", k.f20419c));
            try {
                drawable.setBounds(0, 0, v.b(getContext(), 10.0f), v.b(getContext(), 10.0f));
            } catch (Throwable th) {
                th = th;
                th.getMessage();
                if (this.f21552I == 1) {
                }
                if (this.J != 0) {
                    this.f21546C.setCompoundDrawables(drawable, null, null, null);
                }
                this.f21546C.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f20423g));
                this.f21547D.setVisibility(4);
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        if (this.f21552I == 1 || !this.f21557O) {
            if (this.J != 0 && drawable != null) {
                this.f21546C.setCompoundDrawables(drawable, null, null, null);
            }
            this.f21546C.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f20423g));
            this.f21547D.setVisibility(4);
            return;
        }
        if (this.J != 0 && drawable != null) {
            this.f21547D.setCompoundDrawables(drawable, null, null, null);
        }
        this.f21547D.setText(k.a(t.b().g(), "anythink_splash_ad_text", k.f20423g));
        this.f21546C.setVisibility(4);
    }

    private void j() {
        d dVar = this.f21578p;
        if (dVar != null) {
            dVar.l(this.f21558P);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, new AnonymousClass6());
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21585x);
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21578p);
        } else {
            FeedBackButton feedBackButton = this.f21585x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
    }

    private void k() {
        if (this.f21580r != null) {
            com.anythink.core.express.c.a.a().a(this.f21580r);
        }
    }

    private void l() {
        if (this.f21580r != null) {
            com.anythink.core.express.c.a.a().b(this.f21580r);
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
            if (this.i != 1 || this.f21579q == null || this.f21580r == null) {
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
        this.f21554L = motionEvent.getRawX();
        this.f21555M = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        TextView textView = this.f21564a;
        if (textView == null || textView.getParent() == null || !(this.f21564a.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) this.f21564a.getParent()).getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int b9 = com.anythink.core.common.v.q.b(getContext()) + ((RelativeLayout.LayoutParams) layoutParams).topMargin;
            int[] iArr = new int[2];
            this.f21564a.getLocationOnScreen(iArr);
            int i10 = iArr[1];
            if (i10 < b9) {
                int i11 = b9 - i10;
                ViewParent parent = this.f21564a.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + i11, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + i11);
                }
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z6) {
        super.onVisibilityAggregated(z6);
        if (!z6) {
            l();
        } else {
            if (this.i != 1 || this.f21579q == null || this.f21580r == null) {
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
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (!z6) {
            l();
        } else {
            if (this.i != 1 || this.f21579q == null || this.f21580r == null) {
                return;
            }
            k();
        }
    }

    public void release() {
        try {
            if (this.f21580r != null) {
                l();
                this.f21580r = null;
            }
            com.anythink.expressad.foundation.f.b.a().c(this.f21558P);
            detachAllViewsFromParent();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setIsPause(boolean z6) {
        this.f21575m = z6;
    }

    public void setNotchPadding(int i, int i4, int i6, int i9) {
        try {
            RelativeLayout relativeLayout = this.f21583v;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i10 = this.f21553K;
            layoutParams.leftMargin = i + i10;
            layoutParams.rightMargin = i4 + i10;
            layoutParams.topMargin = i6 + i10;
            layoutParams.bottomMargin = i10 + i9;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void updateCountDown(int i) {
        String str;
        if (this.f21564a != null) {
            this.f21549F = i;
            if (i <= 0) {
                str = this.f21563U;
            } else if (this.f21574l) {
                str = this.f21561S + " " + i + this.f21560R;
            } else {
                str = i + this.f21560R + " " + this.f21562T;
            }
            this.f21564a.setText(str);
        }
    }

    public static /* synthetic */ boolean a(BaseATSplashNativeView baseATSplashNativeView) {
        baseATSplashNativeView.f21557O = true;
        return true;
    }

    private void c() {
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f21552I == 1 ? k.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout") : k.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout"), (ViewGroup) null);
            addView(inflate);
            this.f21581t = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.f21582u = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.f21583v = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.f21584w = (ImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f21585x = (FeedBackButton) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.f21564a = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.f21586y = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.f21587z = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.f21544A = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.f21545B = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.f21546C = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.f21565b = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.f21566c = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.f21567d = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.f21568e = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.f21569f = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_app_desc", "id"));
            this.f21570g = (MBSplashClickView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.f21547D = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int a9 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", k.f20423g);
            int a10 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", k.f20423g);
            int a11 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", k.f20423g);
            int a12 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f20423g);
            this.f21561S = getContext().getResources().getString(a9);
            this.f21562T = getContext().getResources().getString(a10);
            this.f21560R = getContext().getResources().getString(a11);
            this.f21563U = getContext().getResources().getString(a12);
            this.f21553K = v.b(getContext(), 9.0f);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void d() {
        try {
            this.f21556N = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f21883S);
        } catch (Throwable th) {
            th.getMessage();
        }
        d dVar = this.f21578p;
        if (dVar != null) {
            dVar.l(this.f21558P);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, new AnonymousClass6());
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21585x);
            com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21578p);
        } else {
            FeedBackButton feedBackButton = this.f21585x;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(this.f21578p.bm())) {
            this.f21582u.setVisibility(4);
        } else {
            com.IceFishing.LiveIceFishing.k.m().a(this.f21578p.bm(), new AnonymousClass1());
        }
        g();
        a();
        if (this.f21551H == 1) {
            this.f21570g.setVisibility(8);
        } else if (this.i == 1) {
            this.f21570g.setVisibility(8);
        } else {
            this.f21570g.initView(this.f21578p.dj);
        }
        if (this.f21550G == 1) {
            setOnClickListener(new AnonymousClass3());
        } else {
            this.f21570g.setOnClickListener(new AnonymousClass4());
        }
        this.f21564a.setOnClickListener(new AnonymousClass5());
        b();
        updateCountDown(this.f21548E);
    }

    private void e() {
        if (TextUtils.isEmpty(this.f21578p.bm())) {
            this.f21582u.setVisibility(4);
        } else {
            com.IceFishing.LiveIceFishing.k.m().a(this.f21578p.bm(), new AnonymousClass1());
        }
    }

    private void f() {
        if (TextUtils.isEmpty(this.f21578p.bl())) {
            this.f21587z.setVisibility(4);
        } else {
            com.IceFishing.LiveIceFishing.k.m().a(this.f21578p.bl(), new AnonymousClass2());
        }
    }

    private void h() {
        if (this.f21551H == 1) {
            this.f21570g.setVisibility(8);
        } else if (this.i == 1) {
            this.f21570g.setVisibility(8);
        } else {
            this.f21570g.initView(this.f21578p.dj);
        }
    }

    private void i() {
        if (this.f21550G == 1) {
            setOnClickListener(new AnonymousClass3());
        } else {
            this.f21570g.setOnClickListener(new AnonymousClass4());
        }
        this.f21564a.setOnClickListener(new AnonymousClass5());
    }

    public final void a(int i) {
        if (this.f21577o.getSplashJSBridgeImpl() == null || this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.a.a(com.anythink.expressad.splash.a.a.a.a(i, this.f21554L, this.f21555M), this.f21578p));
        } catch (Throwable th) {
            th.getMessage();
            this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().a(this.f21578p);
        }
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseATSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21575m = false;
        this.f21576n = false;
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
                        if (BaseATSplashNativeView.this.f21587z == null || (a9 = q.a(bitmap, v.b(t.b().g(), 40.0f))) == null || a9.isRecycled()) {
                            return;
                        }
                        BaseATSplashNativeView.this.f21587z.setImageBitmap(a9);
                    } catch (Throwable th) {
                        th.getMessage();
                        BaseATSplashNativeView.this.f21587z.setImageBitmap(bitmap);
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            BaseATSplashNativeView.this.f21587z.setVisibility(4);
        }
    }

    public BaseATSplashNativeView(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar) {
        super(context);
        int a9;
        this.f21575m = false;
        this.f21576n = false;
        if (bVar != null) {
            this.f21558P = bVar.b();
            this.f21559Q = bVar.a();
            this.f21578p = bVar.c();
            this.f21577o = aTSplashView;
            this.f21548E = bVar.e();
            this.f21551H = bVar.f();
            this.f21550G = bVar.g();
            this.f21571h = bVar.h();
            this.i = bVar.i();
            this.f21572j = bVar.j();
            this.f21573k = bVar.k();
            this.f21552I = bVar.l();
            this.f21574l = bVar.d();
            this.J = bVar.m();
            try {
                if (this.f21552I == 1) {
                    a9 = k.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
                } else {
                    a9 = k.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
                }
                View inflate = LayoutInflater.from(getContext()).inflate(a9, (ViewGroup) null);
                addView(inflate);
                this.f21581t = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
                this.f21582u = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
                this.f21583v = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
                this.f21584w = (ImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
                this.f21585x = (FeedBackButton) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
                this.f21564a = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
                this.f21586y = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
                this.f21587z = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
                this.f21544A = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
                this.f21545B = (MBNoRecycledCrashImageView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
                this.f21546C = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
                this.f21565b = (RelativeLayout) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
                this.f21566c = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
                this.f21567d = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
                this.f21568e = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
                this.f21569f = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_app_desc", "id"));
                this.f21570g = (MBSplashClickView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
                this.f21547D = (TextView) inflate.findViewById(k.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
                int a10 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", k.f20423g);
                int a11 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", k.f20423g);
                int a12 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", k.f20423g);
                int a13 = k.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f20423g);
                this.f21561S = getContext().getResources().getString(a10);
                this.f21562T = getContext().getResources().getString(a11);
                this.f21560R = getContext().getResources().getString(a12);
                this.f21563U = getContext().getResources().getString(a13);
                this.f21553K = v.b(getContext(), 9.0f);
            } catch (Throwable th) {
                th.getMessage();
            }
            try {
                this.f21556N = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.f21883S);
            } catch (Throwable th2) {
                th2.getMessage();
            }
            d dVar = this.f21578p;
            if (dVar != null) {
                dVar.l(this.f21558P);
            }
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f21558P, new AnonymousClass6());
                com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21585x);
                com.anythink.expressad.foundation.f.b.a().a(this.f21558P, this.f21578p);
            } else {
                FeedBackButton feedBackButton = this.f21585x;
                if (feedBackButton != null) {
                    feedBackButton.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(this.f21578p.bm())) {
                com.IceFishing.LiveIceFishing.k.m().a(this.f21578p.bm(), new AnonymousClass1());
            } else {
                this.f21582u.setVisibility(4);
            }
            g();
            a();
            if (this.f21551H == 1) {
                this.f21570g.setVisibility(8);
            } else if (this.i == 1) {
                this.f21570g.setVisibility(8);
            } else {
                this.f21570g.initView(this.f21578p.dj);
            }
            if (this.f21550G == 1) {
                setOnClickListener(new AnonymousClass3());
            } else {
                this.f21570g.setOnClickListener(new AnonymousClass4());
            }
            this.f21564a.setOnClickListener(new AnonymousClass5());
            b();
            updateCountDown(this.f21548E);
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a(boolean z6) {
        if (this.f21577o.getSplashJSBridgeImpl() == null || this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().a(z6 ? 2 : 1, this.f21549F);
    }

    public static /* synthetic */ void a(BaseATSplashNativeView baseATSplashNativeView, boolean z6) {
        if (baseATSplashNativeView.f21577o.getSplashJSBridgeImpl() == null || baseATSplashNativeView.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        baseATSplashNativeView.f21577o.getSplashJSBridgeImpl().getSplashBridgeListener().a(z6 ? 2 : 1, baseATSplashNativeView.f21549F);
    }

    public static /* synthetic */ void g(BaseATSplashNativeView baseATSplashNativeView) {
        if (!TextUtils.isEmpty(baseATSplashNativeView.f21578p.bl())) {
            com.IceFishing.LiveIceFishing.k.m().a(baseATSplashNativeView.f21578p.bl(), baseATSplashNativeView.new AnonymousClass2());
        } else {
            baseATSplashNativeView.f21587z.setVisibility(4);
        }
    }
}
