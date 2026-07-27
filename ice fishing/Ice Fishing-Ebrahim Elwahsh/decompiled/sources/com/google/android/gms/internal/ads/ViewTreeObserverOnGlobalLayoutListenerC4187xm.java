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

/* renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4187xm extends AbstractBinderC3186f8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC2678Mm {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f35237n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f35238u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f35239v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f35240w;

    /* renamed from: x, reason: collision with root package name */
    public C3648nm f35241x;

    /* renamed from: y, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC3779q8 f35242y;

    public ViewTreeObserverOnGlobalLayoutListenerC4187xm(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f35238u = new HashMap();
        this.f35239v = new HashMap();
        this.f35240w = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C2837Wb c2837Wb = p2.j.f39798C.f39800B;
        ViewTreeObserverOnGlobalLayoutListenerC3480kg viewTreeObserverOnGlobalLayoutListenerC3480kg = new ViewTreeObserverOnGlobalLayoutListenerC3480kg(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3480kg.f29483n).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC3480kg.v1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC3534lg viewTreeObserverOnScrollChangedListenerC3534lg = new ViewTreeObserverOnScrollChangedListenerC3534lg(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3534lg.f29483n).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC3534lg.v1(viewTreeObserver2);
        }
        this.f35237n = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f35238u.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f35240w.putAll(this.f35238u);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f35239v.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f35240w.putAll(this.f35239v);
        this.f35242y = new ViewOnAttachStateChangeListenerC3779q8(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final View A0() {
        return (View) this.f35237n.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            V2.a u02 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                Object A02 = V2.b.A0(u02);
                if (A02 instanceof C3648nm) {
                    C3648nm c3648nm = this.f35241x;
                    if (c3648nm != null) {
                        c3648nm.r(this);
                    }
                    C3648nm c3648nm2 = (C3648nm) A02;
                    if (c3648nm2.f33009p.b()) {
                        this.f35241x = c3648nm2;
                        c3648nm2.q(this);
                        this.f35241x.f(A0());
                    } else {
                        int i4 = t2.C.f40822b;
                        u2.i.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i9 = t2.C.f40822b;
                    u2.i.f("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            synchronized (this) {
                C3648nm c3648nm3 = this.f35241x;
                if (c3648nm3 != null) {
                    c3648nm3.r(this);
                    this.f35241x = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            V2.a u03 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                try {
                    if (this.f35241x != null) {
                        Object A03 = V2.b.A0(u03);
                        if (!(A03 instanceof View)) {
                            int i10 = t2.C.f40822b;
                            u2.i.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        C3648nm c3648nm4 = this.f35241x;
                        View view = (View) A03;
                        synchronized (c3648nm4) {
                            c3648nm4.f33007n.a(view);
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

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized View G0(String str) {
        WeakReference weakReference = (WeakReference) this.f35240w.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized void N0(View view, String str) {
        this.f35240w.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f35238u.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final ViewOnAttachStateChangeListenerC3779q8 e() {
        return this.f35242y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map h() {
        return this.f35238u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map j() {
        return this.f35239v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized Map l() {
        return this.f35240w;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized String m() {
        return "1007";
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        C3648nm c3648nm = this.f35241x;
        if (c3648nm != null) {
            c3648nm.s(view, A0(), l(), h(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        C3648nm c3648nm = this.f35241x;
        if (c3648nm != null) {
            c3648nm.t(A0(), l(), h(), C3648nm.d(A0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        C3648nm c3648nm = this.f35241x;
        if (c3648nm != null) {
            c3648nm.t(A0(), l(), h(), C3648nm.d(A0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        C3648nm c3648nm = this.f35241x;
        if (c3648nm != null) {
            View A02 = A0();
            synchronized (c3648nm) {
                c3648nm.f33007n.w(A02, motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized V2.a p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized JSONObject q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final FrameLayout q3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2678Mm
    public final synchronized JSONObject r() {
        JSONObject j9;
        C3648nm c3648nm = this.f35241x;
        if (c3648nm == null) {
            return null;
        }
        View A02 = A0();
        Map l9 = l();
        Map h9 = h();
        synchronized (c3648nm) {
            j9 = c3648nm.f33007n.j(A02, l9, h9, c3648nm.k());
        }
        return j9;
    }
}
