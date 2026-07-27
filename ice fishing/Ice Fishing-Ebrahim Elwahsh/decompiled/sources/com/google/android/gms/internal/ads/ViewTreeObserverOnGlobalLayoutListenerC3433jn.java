package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3433jn extends AbstractBinderC3186f8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC2481Bc {

    /* renamed from: n, reason: collision with root package name */
    public View f32193n;

    /* renamed from: u, reason: collision with root package name */
    public q2.A0 f32194u;

    /* renamed from: v, reason: collision with root package name */
    public C3648nm f32195v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32196w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32197x;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        C3756pm c3756pm;
        q2.A0 a02 = null;
        r3 = null;
        r3 = null;
        InterfaceC3529lb interfaceC3529lb = null;
        InterfaceC2515Dc interfaceC2515Dc = null;
        if (i == 3) {
            O2.w.d("#008 Must be called on the main UI thread.");
            if (this.f32196w) {
                int i4 = t2.C.f40822b;
                u2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                a02 = this.f32194u;
            }
            parcel2.writeNoException();
            AbstractC3241g8.e(parcel2, a02);
        } else if (i == 4) {
            O2.w.d("#008 Must be called on the main UI thread.");
            H3();
            C3648nm c3648nm = this.f32195v;
            if (c3648nm != null) {
                c3648nm.o();
            }
            this.f32195v = null;
            this.f32193n = null;
            this.f32194u = null;
            this.f32196w = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            V2.a u02 = V2.b.u0(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                interfaceC2515Dc = queryLocalInterface instanceof InterfaceC2515Dc ? (InterfaceC2515Dc) queryLocalInterface : new C2498Cc(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 2);
            }
            AbstractC3241g8.f(parcel);
            G3(u02, interfaceC2515Dc);
            parcel2.writeNoException();
        } else if (i == 6) {
            V2.a u03 = V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            O2.w.d("#008 Must be called on the main UI thread.");
            G3(u03, new BinderC3380in("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            O2.w.d("#008 Must be called on the main UI thread.");
            if (this.f32196w) {
                int i9 = t2.C.f40822b;
                u2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C3648nm c3648nm2 = this.f32195v;
                if (c3648nm2 != null && (c3756pm = c3648nm2.f33001F) != null) {
                    synchronized (c3756pm) {
                        interfaceC3529lb = c3756pm.f33505a;
                    }
                }
            }
            parcel2.writeNoException();
            AbstractC3241g8.e(parcel2, interfaceC3529lb);
        }
        return true;
    }

    public final void G3(V2.a aVar, InterfaceC2515Dc interfaceC2515Dc) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        O2.w.d("#008 Must be called on the main UI thread.");
        if (this.f32196w) {
            int i = t2.C.f40822b;
            u2.i.c("Instream ad can not be shown after destroy().");
            try {
                interfaceC2515Dc.s(2);
                return;
            } catch (RemoteException e6) {
                int i4 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
                return;
            }
        }
        View view = this.f32193n;
        if (view == null || this.f32194u == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i9 = t2.C.f40822b;
            u2.i.c("Instream internal error: ".concat(str));
            try {
                interfaceC2515Dc.s(0);
                return;
            } catch (RemoteException e9) {
                int i10 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e9);
                return;
            }
        }
        if (this.f32197x) {
            int i11 = t2.C.f40822b;
            u2.i.c("Instream ad should not be used again.");
            try {
                interfaceC2515Dc.s(1);
                return;
            } catch (RemoteException e10) {
                int i12 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
                return;
            }
        }
        this.f32197x = true;
        H3();
        ((ViewGroup) V2.b.A0(aVar)).addView(this.f32193n, new ViewGroup.LayoutParams(-1, -1));
        C2837Wb c2837Wb = p2.j.f39798C.f39800B;
        ViewTreeObserverOnGlobalLayoutListenerC3480kg viewTreeObserverOnGlobalLayoutListenerC3480kg = new ViewTreeObserverOnGlobalLayoutListenerC3480kg(this.f32193n, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3480kg.f29483n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC3480kg.v1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC3534lg viewTreeObserverOnScrollChangedListenerC3534lg = new ViewTreeObserverOnScrollChangedListenerC3534lg(this.f32193n, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3534lg.f29483n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC3534lg.v1(viewTreeObserver3);
        }
        I3();
        try {
            interfaceC2515Dc.c();
        } catch (RemoteException e11) {
            int i13 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e11);
        }
    }

    public final void H3() {
        View view = this.f32193n;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f32193n);
        }
    }

    public final void I3() {
        View view;
        C3648nm c3648nm = this.f32195v;
        if (c3648nm == null || (view = this.f32193n) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c3648nm.t(view, map, map, C3648nm.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        I3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        I3();
    }
}
