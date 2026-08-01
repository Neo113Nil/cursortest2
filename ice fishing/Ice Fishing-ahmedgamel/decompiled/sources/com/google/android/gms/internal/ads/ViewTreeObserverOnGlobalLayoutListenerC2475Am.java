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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Am, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2475Am extends AbstractBinderC3336i8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2713Om {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f23727n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f23728u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f23729v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f23730w;

    /* renamed from: x, reason: collision with root package name */
    public C3797qm f23731x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC3981u8 f23732y;

    public ViewTreeObserverOnGlobalLayoutListenerC2475Am(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f23728u = new HashMap();
        this.f23729v = new HashMap();
        this.f23730w = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2866Yb c2866Yb = C4835j.f39733C.f39735B;
        ViewTreeObserverOnGlobalLayoutListenerC3629ng viewTreeObserverOnGlobalLayoutListenerC3629ng = new ViewTreeObserverOnGlobalLayoutListenerC3629ng(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3629ng.f26598n).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3629ng.Q1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3683og viewTreeObserverOnScrollChangedListenerC3683og = new ViewTreeObserverOnScrollChangedListenerC3683og(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3683og.f26598n).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3683og.Q1(viewTreeObserver2);
        }
        this.f23727n = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f23728u.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f23730w.putAll(this.f23728u);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f23729v.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f23730w.putAll(this.f23729v);
        this.f23732y = new ViewOnAttachStateChangeListenerC3981u8(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final FrameLayout D3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized void F0(View view, String str) {
        this.f23730w.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f23728u.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final View H0() {
        return (View) this.f23727n.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized View S(String str) {
        WeakReference weakReference = (WeakReference) this.f23730w.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                Object F02 = W2.b.F0(w02);
                if (F02 instanceof C3797qm) {
                    C3797qm c3797qm = this.f23731x;
                    if (c3797qm != null) {
                        c3797qm.r(this);
                    }
                    C3797qm c3797qm2 = (C3797qm) F02;
                    if (c3797qm2.f33405p.b()) {
                        this.f23731x = c3797qm2;
                        c3797qm2.p(this);
                        this.f23731x.f(H0());
                    } else {
                        int i6 = u2.z.f41322b;
                        v2.i.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i9 = u2.z.f41322b;
                    v2.i.f("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                C3797qm c3797qm3 = this.f23731x;
                if (c3797qm3 != null) {
                    c3797qm3.r(this);
                    this.f23731x = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            W2.a w03 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                try {
                    if (this.f23731x != null) {
                        Object F03 = W2.b.F0(w03);
                        if (!(F03 instanceof View)) {
                            int i10 = u2.z.f41322b;
                            v2.i.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        C3797qm c3797qm4 = this.f23731x;
                        View view = (View) F03;
                        synchronized (c3797qm4) {
                            c3797qm4.f33403n.a(view);
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

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized W2.a b0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final ViewOnAttachStateChangeListenerC3981u8 e() {
        return this.f23732y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map g() {
        return this.f23730w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map j() {
        return this.f23729v;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized String l() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized Map n() {
        return this.f23728u;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C3797qm c3797qm = this.f23731x;
        if (c3797qm != null) {
            c3797qm.s(view, H0(), g(), n(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3797qm c3797qm = this.f23731x;
        if (c3797qm != null) {
            c3797qm.t(H0(), g(), n(), C3797qm.d(H0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3797qm c3797qm = this.f23731x;
        if (c3797qm != null) {
            c3797qm.t(H0(), g(), n(), C3797qm.d(H0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C3797qm c3797qm = this.f23731x;
        if (c3797qm != null) {
            View H02 = H0();
            synchronized (c3797qm) {
                c3797qm.f33403n.w(H02, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized JSONObject p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om
    public final synchronized JSONObject s() {
        JSONObject l9;
        C3797qm c3797qm = this.f23731x;
        if (c3797qm == null) {
            return null;
        }
        View H02 = H0();
        Map g4 = g();
        Map n9 = n();
        synchronized (c3797qm) {
            l9 = c3797qm.f33403n.l(H02, g4, n9, c3797qm.k());
        }
        return l9;
    }
}
