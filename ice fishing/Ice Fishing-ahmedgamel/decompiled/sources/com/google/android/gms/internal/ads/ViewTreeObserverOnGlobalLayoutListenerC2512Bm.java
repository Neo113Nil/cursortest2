package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2512Bm extends AbstractBinderC3359i8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2750Pm {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f24708n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f24709u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f24710v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f24711w;

    /* renamed from: x, reason: collision with root package name */
    public C3873rm f24712x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC4004u8 f24713y;

    public ViewTreeObserverOnGlobalLayoutListenerC2512Bm(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f24709u = new HashMap();
        this.f24710v = new HashMap();
        this.f24711w = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2889Yb c2889Yb = C4906k.f40186C.f40188B;
        ViewTreeObserverOnGlobalLayoutListenerC3652ng viewTreeObserverOnGlobalLayoutListenerC3652ng = new ViewTreeObserverOnGlobalLayoutListenerC3652ng(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3652ng.f27380n).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3652ng.R1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3706og viewTreeObserverOnScrollChangedListenerC3706og = new ViewTreeObserverOnScrollChangedListenerC3706og(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3706og.f27380n).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3706og.R1(viewTreeObserver2);
        }
        this.f24708n = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f24709u.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f24711w.putAll(this.f24709u);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f24710v.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f24711w.putAll(this.f24710v);
        this.f24713y = new ViewOnAttachStateChangeListenerC4004u8(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized void D0(View view, String str) {
        this.f24711w.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f24709u.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final View F0() {
        return (View) this.f24708n.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized View S(String str) {
        WeakReference weakReference = (WeakReference) this.f24711w.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                Object D02 = Y2.b.D0(t02);
                if (D02 instanceof C3873rm) {
                    C3873rm c3873rm = this.f24712x;
                    if (c3873rm != null) {
                        c3873rm.r(this);
                    }
                    C3873rm c3873rm2 = (C3873rm) D02;
                    if (c3873rm2.f34505p.b()) {
                        this.f24712x = c3873rm2;
                        c3873rm2.p(this);
                        this.f24712x.f(F0());
                    } else {
                        int i4 = w2.z.f41712b;
                        x2.i.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i6 = w2.z.f41712b;
                    x2.i.f("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                C3873rm c3873rm3 = this.f24712x;
                if (c3873rm3 != null) {
                    c3873rm3.r(this);
                    this.f24712x = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                try {
                    if (this.f24712x != null) {
                        Object D03 = Y2.b.D0(t03);
                        if (!(D03 instanceof View)) {
                            int i9 = w2.z.f41712b;
                            x2.i.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        C3873rm c3873rm4 = this.f24712x;
                        View view = (View) D03;
                        synchronized (c3873rm4) {
                            c3873rm4.f34503n.b(view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Y2.a b0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final ViewOnAttachStateChangeListenerC4004u8 e() {
        return this.f24713y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map g() {
        return this.f24711w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map j() {
        return this.f24710v;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized String l() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized Map n() {
        return this.f24709u;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C3873rm c3873rm = this.f24712x;
        if (c3873rm != null) {
            c3873rm.s(view, F0(), g(), n(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3873rm c3873rm = this.f24712x;
        if (c3873rm != null) {
            c3873rm.t(F0(), g(), n(), C3873rm.d(F0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3873rm c3873rm = this.f24712x;
        if (c3873rm != null) {
            c3873rm.t(F0(), g(), n(), C3873rm.d(F0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C3873rm c3873rm = this.f24712x;
        if (c3873rm != null) {
            View F02 = F0();
            synchronized (c3873rm) {
                c3873rm.f34503n.v(F02, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized JSONObject p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final synchronized JSONObject s() {
        JSONObject l9;
        C3873rm c3873rm = this.f24712x;
        if (c3873rm == null) {
            return null;
        }
        View F02 = F0();
        Map g9 = g();
        Map n9 = n();
        synchronized (c3873rm) {
            l9 = c3873rm.f34503n.l(F02, g9, n9, c3873rm.k());
        }
        return l9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm
    public final FrameLayout z3() {
        return null;
    }
}
