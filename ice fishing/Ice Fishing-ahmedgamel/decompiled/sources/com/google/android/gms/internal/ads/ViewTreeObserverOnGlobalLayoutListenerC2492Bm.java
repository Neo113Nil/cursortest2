package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.anythink.core.api.ErrorCode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2492Bm extends AbstractBinderC4001ub implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2713Om {

    /* renamed from: I, reason: collision with root package name */
    public static final C3500lC f23937I;

    /* renamed from: B, reason: collision with root package name */
    public C3797qm f23939B;

    /* renamed from: C, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC3981u8 f23940C;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC3732pb f23942E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f23943F;

    /* renamed from: H, reason: collision with root package name */
    public GestureDetector f23945H;

    /* renamed from: u, reason: collision with root package name */
    public final String f23946u;

    /* renamed from: w, reason: collision with root package name */
    public FrameLayout f23948w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f23949x;

    /* renamed from: y, reason: collision with root package name */
    public final C3360ig f23950y;

    /* renamed from: z, reason: collision with root package name */
    public View f23951z;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f23947v = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    public W2.a f23941D = null;

    /* renamed from: G, reason: collision with root package name */
    public boolean f23944G = false;

    /* renamed from: A, reason: collision with root package name */
    public final int f23938A = ModuleDescriptor.MODULE_VERSION;

    static {
        PB pb = RB.f27177u;
        Object[] objArr = {ErrorCode.loadInShowingFilter, "1009", "3010"};
        AbstractC2772Sd.j(objArr, 3);
        f23937I = RB.p(objArr, 3);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2492Bm(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f23948w = frameLayout;
        this.f23949x = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = ErrorCode.loadCappingError;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f23946u = str;
        C2866Yb c2866Yb = C4835j.f39733C.f39735B;
        ViewTreeObserverOnGlobalLayoutListenerC3629ng viewTreeObserverOnGlobalLayoutListenerC3629ng = new ViewTreeObserverOnGlobalLayoutListenerC3629ng(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3629ng.f26598n).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3629ng.Q1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3683og viewTreeObserverOnScrollChangedListenerC3683og = new ViewTreeObserverOnScrollChangedListenerC3683og(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3683og.f26598n).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3683og.Q1(viewTreeObserver2);
        }
        this.f23950y = AbstractC3413jg.f31273f;
        this.f23940C = new ViewOnAttachStateChangeListenerC3981u8(this.f23948w.getContext(), this.f23948w);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void A3(W2.a aVar) {
        C3797qm c3797qm = this.f23939B;
        View view = (View) W2.b.F0(aVar);
        synchronized (c3797qm) {
            c3797qm.f33403n.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final FrameLayout D3() {
        return this.f23949x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized void F0(View view, String str) {
        if (!this.f23944G) {
            if (view == null) {
                this.f23947v.remove(str);
                return;
            }
            this.f23947v.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (L3.F.u(this.f23938A)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final /* synthetic */ View H0() {
        return this.f23948w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void K2(InterfaceC3732pb interfaceC3732pb) {
        if (!this.f23944G) {
            this.f23943F = true;
            this.f23942E = interfaceC3732pb;
            C3797qm c3797qm = this.f23939B;
            if (c3797qm != null) {
                C3904sm c3904sm = c3797qm.f33397F;
                synchronized (c3904sm) {
                    c3904sm.f34135a = interfaceC3732pb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void R0(W2.a aVar) {
        if (this.f23944G) {
            return;
        }
        Object F02 = W2.b.F0(aVar);
        if (!(F02 instanceof C3797qm)) {
            int i = u2.z.f41322b;
            v2.i.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C3797qm c3797qm = this.f23939B;
        if (c3797qm != null) {
            c3797qm.r(this);
        }
        synchronized (this) {
            this.f23950y.execute(new RunnableC3470kj(7, this));
            C3797qm c3797qm2 = (C3797qm) F02;
            this.f23939B = c3797qm2;
            c3797qm2.p(this);
            this.f23939B.f(this.f23948w);
            C3797qm c3797qm3 = this.f23939B;
            FrameLayout frameLayout = this.f23949x;
            C3209fq k9 = c3797qm3.f33402m.k();
            if (c3797qm3.f33405p.c() && k9 != null && frameLayout != null) {
                C3472kl c3472kl = C4835j.f39733C.f39758x;
                Uv uv = k9.f30456a;
                c3472kl.getClass();
                C3472kl.p(new RunnableC2995bq(uv, frameLayout, 0));
            }
            if (this.f23943F) {
                C3904sm c3904sm = this.f23939B.f33397F;
                InterfaceC3732pb interfaceC3732pb = this.f23942E;
                synchronized (c3904sm) {
                    c3904sm.f34135a = interfaceC3732pb;
                }
            }
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32075M4)).booleanValue() && !TextUtils.isEmpty(this.f23939B.f33405p.e())) {
                V3(this.f23939B.f33405p.e());
            }
            U3();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized View S(String str) {
        WeakReference weakReference;
        if (!this.f23944G && (weakReference = (WeakReference) this.f23947v.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final void S0(W2.a aVar) {
        onTouch(this.f23948w, (MotionEvent) W2.b.F0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void S2(W2.a aVar, String str) {
        F0((View) W2.b.F0(aVar), str);
    }

    public final synchronized void U3() {
        int y7;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Xc)).booleanValue()) {
            C3797qm c3797qm = this.f23939B;
            synchronized (c3797qm) {
                y7 = c3797qm.f33403n.y();
            }
            if (y7 != 0) {
                this.f23945H = new GestureDetector(this.f23948w.getContext(), new GestureDetectorOnGestureListenerC2560Fm(this.f23939B, this));
            }
        }
    }

    public final synchronized void V3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f23949x.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f23949x.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e9) {
                        v2.i.g("Encountered invalid base64 watermark.", e9);
                    }
                }
            }
            this.f23949x.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final W2.a b0() {
        return this.f23941D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final ViewOnAttachStateChangeListenerC3981u8 e() {
        return this.f23940C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map g() {
        return this.f23947v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized String l() {
        return this.f23946u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map n() {
        return this.f23947v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void n0(W2.a aVar) {
        if (this.f23944G) {
            return;
        }
        this.f23941D = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void o() {
        try {
            if (this.f23944G) {
                return;
            }
            C3797qm c3797qm = this.f23939B;
            if (c3797qm != null) {
                c3797qm.r(this);
                this.f23939B = null;
            }
            this.f23947v.clear();
            this.f23948w.removeAllViews();
            this.f23949x.removeAllViews();
            this.f23947v = null;
            this.f23948w = null;
            this.f23949x = null;
            this.f23951z = null;
            this.f23940C = null;
            this.f23944G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean B9;
        C3797qm c3797qm = this.f23939B;
        if (c3797qm != null) {
            synchronized (c3797qm) {
                B9 = c3797qm.f33403n.B();
            }
            if (B9) {
                C3797qm c3797qm2 = this.f23939B;
                synchronized (c3797qm2) {
                    c3797qm2.f33403n.m();
                }
                this.f23939B.s(view, this.f23948w, g(), n(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3797qm c3797qm = this.f23939B;
        if (c3797qm != null) {
            FrameLayout frameLayout = this.f23948w;
            c3797qm.t(frameLayout, g(), n(), C3797qm.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3797qm c3797qm = this.f23939B;
        if (c3797qm != null) {
            FrameLayout frameLayout = this.f23948w;
            c3797qm.t(frameLayout, g(), n(), C3797qm.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int y7;
        C3797qm c3797qm = this.f23939B;
        if (c3797qm != null) {
            FrameLayout frameLayout = this.f23948w;
            synchronized (c3797qm) {
                c3797qm.f33403n.w(frameLayout, motionEvent);
            }
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Xc)).booleanValue() && this.f23945H != null) {
                C3797qm c3797qm2 = this.f23939B;
                synchronized (c3797qm2) {
                    y7 = c3797qm2.f33403n.y();
                }
                if (y7 != 0) {
                    this.f23945H.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized JSONObject p() {
        JSONObject c9;
        C3797qm c3797qm = this.f23939B;
        if (c3797qm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f23948w;
        Map g4 = g();
        Map n9 = n();
        synchronized (c3797qm) {
            c9 = c3797qm.f33403n.c(frameLayout, g4, n9, c3797qm.k());
        }
        return c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized JSONObject s() {
        JSONObject l9;
        C3797qm c3797qm = this.f23939B;
        if (c3797qm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f23948w;
        Map g4 = g();
        Map n9 = n();
        synchronized (c3797qm) {
            l9 = c3797qm.f33403n.l(frameLayout, g4, n9, c3797qm.k());
        }
        return l9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized void y3(W2.b bVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4055vb
    public final synchronized W2.a z(String str) {
        return new W2.b(S(str));
    }
}
