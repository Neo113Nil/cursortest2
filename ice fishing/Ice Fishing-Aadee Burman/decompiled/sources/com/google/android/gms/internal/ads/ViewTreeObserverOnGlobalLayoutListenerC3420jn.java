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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.jn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3420jn extends AbstractBinderC3336i8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC2567Gc {

    /* renamed from: n, reason: collision with root package name */
    public View f31314n;

    /* renamed from: u, reason: collision with root package name */
    public q2.A0 f31315u;

    /* renamed from: v, reason: collision with root package name */
    public C3797qm f31316v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f31317w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f31318x;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3904sm c3904sm;
        q2.A0 a02 = null;
        r3 = null;
        r3 = null;
        InterfaceC3732pb interfaceC3732pb = null;
        InterfaceC2601Ic interfaceC2601Ic = null;
        if (i == 3) {
            P2.w.d("#008 Must be called on the main UI thread.");
            if (this.f31317w) {
                int i6 = u2.z.f41319b;
                v2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                a02 = this.f31315u;
            }
            parcel2.writeNoException();
            AbstractC3388j8.e(parcel2, a02);
        } else if (i == 4) {
            P2.w.d("#008 Must be called on the main UI thread.");
            V3();
            C3797qm c3797qm = this.f31316v;
            if (c3797qm != null) {
                c3797qm.n();
            }
            this.f31316v = null;
            this.f31314n = null;
            this.f31315u = null;
            this.f31317w = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                interfaceC2601Ic = queryLocalInterface instanceof InterfaceC2601Ic ? (InterfaceC2601Ic) queryLocalInterface : new C2584Hc(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 2);
            }
            AbstractC3388j8.f(parcel);
            U3(w02, interfaceC2601Ic);
            parcel2.writeNoException();
        } else if (i == 6) {
            W2.a w03 = W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            P2.w.d("#008 Must be called on the main UI thread.");
            U3(w03, new BinderC3367in("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            P2.w.d("#008 Must be called on the main UI thread.");
            if (this.f31317w) {
                int i9 = u2.z.f41319b;
                v2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C3797qm c3797qm2 = this.f31316v;
                if (c3797qm2 != null && (c3904sm = c3797qm2.f33397F) != null) {
                    synchronized (c3904sm) {
                        interfaceC3732pb = c3904sm.f34135a;
                    }
                }
            }
            parcel2.writeNoException();
            AbstractC3388j8.e(parcel2, interfaceC3732pb);
        }
        return true;
    }

    public final void U3(W2.a aVar, InterfaceC2601Ic interfaceC2601Ic) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        P2.w.d("#008 Must be called on the main UI thread.");
        if (this.f31317w) {
            int i = u2.z.f41319b;
            v2.i.c("Instream ad can not be shown after destroy().");
            try {
                interfaceC2601Ic.v(2);
                return;
            } catch (RemoteException e9) {
                int i6 = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e9);
                return;
            }
        }
        View view = this.f31314n;
        if (view == null || this.f31315u == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i9 = u2.z.f41319b;
            v2.i.c("Instream internal error: ".concat(str));
            try {
                interfaceC2601Ic.v(0);
                return;
            } catch (RemoteException e10) {
                int i10 = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (this.f31318x) {
            int i11 = u2.z.f41319b;
            v2.i.c("Instream ad should not be used again.");
            try {
                interfaceC2601Ic.v(1);
                return;
            } catch (RemoteException e11) {
                int i12 = u2.z.f41319b;
                v2.i.i("#007 Could not call remote method.", e11);
                return;
            }
        }
        this.f31318x = true;
        V3();
        ((ViewGroup) W2.b.F0(aVar)).addView(this.f31314n, new ViewGroup.LayoutParams(-1, -1));
        C2866Yb c2866Yb = C4835j.f39730C.f39732B;
        ViewTreeObserverOnGlobalLayoutListenerC3629ng viewTreeObserverOnGlobalLayoutListenerC3629ng = new ViewTreeObserverOnGlobalLayoutListenerC3629ng(this.f31314n, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3629ng.f26598n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC3629ng.Q1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC3683og viewTreeObserverOnScrollChangedListenerC3683og = new ViewTreeObserverOnScrollChangedListenerC3683og(this.f31314n, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3683og.f26598n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC3683og.Q1(viewTreeObserver3);
        }
        W3();
        try {
            interfaceC2601Ic.d();
        } catch (RemoteException e12) {
            int i13 = u2.z.f41319b;
            v2.i.i("#007 Could not call remote method.", e12);
        }
    }

    public final void V3() {
        View view = this.f31314n;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f31314n);
        }
    }

    public final void W3() {
        View view;
        C3797qm c3797qm = this.f31316v;
        if (c3797qm == null || (view = this.f31314n) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c3797qm.t(view, map, map, C3797qm.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        W3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        W3();
    }
}
