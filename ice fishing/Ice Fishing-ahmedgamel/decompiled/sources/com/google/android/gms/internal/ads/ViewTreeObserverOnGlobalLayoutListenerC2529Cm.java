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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Cm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2529Cm extends AbstractBinderC4024ub implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2750Pm {

    /* renamed from: I, reason: collision with root package name */
    public static final C3523lC f24950I;

    /* renamed from: B, reason: collision with root package name */
    public C3873rm f24952B;

    /* renamed from: C, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC4004u8 f24953C;

    /* renamed from: E, reason: collision with root package name */
    public InterfaceC3755pb f24955E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f24956F;

    /* renamed from: H, reason: collision with root package name */
    public GestureDetector f24958H;

    /* renamed from: u, reason: collision with root package name */
    public final String f24959u;

    /* renamed from: w, reason: collision with root package name */
    public FrameLayout f24961w;

    /* renamed from: x, reason: collision with root package name */
    public FrameLayout f24962x;

    /* renamed from: y, reason: collision with root package name */
    public final C3383ig f24963y;

    /* renamed from: z, reason: collision with root package name */
    public View f24964z;

    /* renamed from: v, reason: collision with root package name */
    public HashMap f24960v = new HashMap();

    /* renamed from: D, reason: collision with root package name */
    public Y2.a f24954D = null;

    /* renamed from: G, reason: collision with root package name */
    public boolean f24957G = false;

    /* renamed from: A, reason: collision with root package name */
    public final int f24951A = ModuleDescriptor.MODULE_VERSION;

    static {
        PB pb = RB.f27933u;
        Object[] objArr = {ErrorCode.loadInShowingFilter, "1009", "3010"};
        AbstractC2792Sd.j(objArr, 3);
        f24950I = RB.p(objArr, 3);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2529Cm(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f24961w = frameLayout;
        this.f24962x = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = ErrorCode.loadCappingError;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f24959u = str;
        C2889Yb c2889Yb = C4906k.f40186C.f40188B;
        ViewTreeObserverOnGlobalLayoutListenerC3652ng viewTreeObserverOnGlobalLayoutListenerC3652ng = new ViewTreeObserverOnGlobalLayoutListenerC3652ng(frameLayout, this);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3652ng.f27380n).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3652ng.R1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3706og viewTreeObserverOnScrollChangedListenerC3706og = new ViewTreeObserverOnScrollChangedListenerC3706og(frameLayout, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3706og.f27380n).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3706og.R1(viewTreeObserver2);
        }
        this.f24963y = AbstractC3436jg.f32060f;
        this.f24953C = new ViewOnAttachStateChangeListenerC4004u8(this.f24961w.getContext(), this.f24961w);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized void D0(View view, String str) {
        if (!this.f24957G) {
            if (view == null) {
                this.f24960v.remove(str);
                return;
            }
            this.f24960v.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (t8.g.r(this.f24951A)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final /* synthetic */ View F0() {
        return this.f24961w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void I2(InterfaceC3755pb interfaceC3755pb) {
        if (!this.f24957G) {
            this.f24956F = true;
            this.f24955E = interfaceC3755pb;
            C3873rm c3873rm = this.f24952B;
            if (c3873rm != null) {
                C3981tm c3981tm = c3873rm.f34497F;
                synchronized (c3981tm) {
                    c3981tm.f35164a = interfaceC3755pb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized View S(String str) {
        WeakReference weakReference;
        if (!this.f24957G && (weakReference = (WeakReference) this.f24960v.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final synchronized void U3() {
        int y7;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
            C3873rm c3873rm = this.f24952B;
            synchronized (c3873rm) {
                y7 = c3873rm.f34503n.y();
            }
            if (y7 != 0) {
                this.f24958H = new GestureDetector(this.f24961w.getContext(), new GestureDetectorOnGestureListenerC2597Gm(this.f24952B, this));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void V0(Y2.a aVar) {
        if (this.f24957G) {
            return;
        }
        Object D02 = Y2.b.D0(aVar);
        if (!(D02 instanceof C3873rm)) {
            int i = w2.z.f41712b;
            x2.i.f("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        C3873rm c3873rm = this.f24952B;
        if (c3873rm != null) {
            c3873rm.r(this);
        }
        synchronized (this) {
            this.f24963y.execute(new RunnableC3493kj(7, this));
            C3873rm c3873rm2 = (C3873rm) D02;
            this.f24952B = c3873rm2;
            c3873rm2.p(this);
            this.f24952B.f(this.f24961w);
            C3873rm c3873rm3 = this.f24952B;
            FrameLayout frameLayout = this.f24962x;
            C3232fq k9 = c3873rm3.f34502m.k();
            if (c3873rm3.f34505p.c() && k9 != null && frameLayout != null) {
                C3495kl c3495kl = C4906k.f40186C.f40211x;
                Uv uv = k9.f31219a;
                c3495kl.getClass();
                C3495kl.p(new RunnableC3018bq(uv, frameLayout, 0));
            }
            if (this.f24956F) {
                C3981tm c3981tm = this.f24952B.f34497F;
                InterfaceC3755pb interfaceC3755pb = this.f24955E;
                synchronized (c3981tm) {
                    c3981tm.f35164a = interfaceC3755pb;
                }
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32854M4)).booleanValue() && !TextUtils.isEmpty(this.f24952B.f34505p.e())) {
                V3(this.f24952B.f34505p.e());
            }
            U3();
        }
    }

    public final synchronized void V3(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f24962x.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f24962x.getContext();
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
                        x2.i.g("Encountered invalid base64 watermark.", e9);
                    }
                }
            }
            this.f24962x.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void Y2(Y2.a aVar) {
        if (this.f24957G) {
            return;
        }
        this.f24954D = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final Y2.a b0() {
        return this.f24954D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final ViewOnAttachStateChangeListenerC4004u8 e() {
        return this.f24953C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map g() {
        return this.f24960v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized String l() {
        return this.f24959u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map n() {
        return this.f24960v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void o() {
        try {
            if (this.f24957G) {
                return;
            }
            C3873rm c3873rm = this.f24952B;
            if (c3873rm != null) {
                c3873rm.r(this);
                this.f24952B = null;
            }
            this.f24960v.clear();
            this.f24961w.removeAllViews();
            this.f24962x.removeAllViews();
            this.f24960v = null;
            this.f24961w = null;
            this.f24962x = null;
            this.f24964z = null;
            this.f24953C = null;
            this.f24957G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean B3;
        C3873rm c3873rm = this.f24952B;
        if (c3873rm != null) {
            synchronized (c3873rm) {
                B3 = c3873rm.f34503n.B();
            }
            if (B3) {
                C3873rm c3873rm2 = this.f24952B;
                synchronized (c3873rm2) {
                    c3873rm2.f34503n.m();
                }
                this.f24952B.s(view, this.f24961w, g(), n(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3873rm c3873rm = this.f24952B;
        if (c3873rm != null) {
            FrameLayout frameLayout = this.f24961w;
            c3873rm.t(frameLayout, g(), n(), C3873rm.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3873rm c3873rm = this.f24952B;
        if (c3873rm != null) {
            FrameLayout frameLayout = this.f24961w;
            c3873rm.t(frameLayout, g(), n(), C3873rm.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int y7;
        C3873rm c3873rm = this.f24952B;
        if (c3873rm != null) {
            FrameLayout frameLayout = this.f24961w;
            synchronized (c3873rm) {
                c3873rm.f34503n.v(frameLayout, motionEvent);
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue() && this.f24958H != null) {
                C3873rm c3873rm2 = this.f24952B;
                synchronized (c3873rm2) {
                    y7 = c3873rm2.f34503n.y();
                }
                if (y7 != 0) {
                    this.f24958H.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized JSONObject p() {
        JSONObject c9;
        C3873rm c3873rm = this.f24952B;
        if (c3873rm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f24961w;
        Map g9 = g();
        Map n9 = n();
        synchronized (c3873rm) {
            c9 = c3873rm.f34503n.c(frameLayout, g9, n9, c3873rm.k());
        }
        return c9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final void q3(Y2.a aVar) {
        onTouch(this.f24961w, (MotionEvent) Y2.b.D0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized JSONObject s() {
        JSONObject l9;
        C3873rm c3873rm = this.f24952B;
        if (c3873rm == null) {
            return null;
        }
        FrameLayout frameLayout = this.f24961w;
        Map g9 = g();
        Map n9 = n();
        synchronized (c3873rm) {
            l9 = c3873rm.f34503n.l(frameLayout, g9, n9, c3873rm.k());
        }
        return l9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void t3(Y2.a aVar, String str) {
        D0((View) Y2.b.D0(aVar), str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void v3(Y2.a aVar) {
        C3873rm c3873rm = this.f24952B;
        View view = (View) Y2.b.D0(aVar);
        synchronized (c3873rm) {
            c3873rm.f34503n.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized void y3(Y2.b bVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4078vb
    public final synchronized Y2.a z(String str) {
        return new Y2.b(S(str));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final FrameLayout z3() {
        return this.f24962x;
    }
}
