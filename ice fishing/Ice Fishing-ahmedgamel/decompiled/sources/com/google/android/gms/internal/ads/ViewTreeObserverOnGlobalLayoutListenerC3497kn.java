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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.kn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3497kn extends AbstractBinderC3359i8 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC2587Gc {

    /* renamed from: n, reason: collision with root package name */
    public View f32404n;

    /* renamed from: u, reason: collision with root package name */
    public s2.A0 f32405u;

    /* renamed from: v, reason: collision with root package name */
    public C3873rm f32406v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32407w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32408x;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C3981tm c3981tm;
        s2.A0 a02 = null;
        r3 = null;
        r3 = null;
        InterfaceC3755pb interfaceC3755pb = null;
        InterfaceC2621Ic interfaceC2621Ic = null;
        if (i == 3) {
            R2.w.d("#008 Must be called on the main UI thread.");
            if (this.f32407w) {
                int i4 = w2.z.f41712b;
                x2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                a02 = this.f32405u;
            }
            parcel2.writeNoException();
            AbstractC3411j8.e(parcel2, a02);
        } else if (i == 4) {
            R2.w.d("#008 Must be called on the main UI thread.");
            V3();
            C3873rm c3873rm = this.f32406v;
            if (c3873rm != null) {
                c3873rm.n();
            }
            this.f32406v = null;
            this.f32404n = null;
            this.f32405u = null;
            this.f32407w = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                interfaceC2621Ic = queryLocalInterface instanceof InterfaceC2621Ic ? (InterfaceC2621Ic) queryLocalInterface : new C2604Hc(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 1);
            }
            AbstractC3411j8.f(parcel);
            U3(t02, interfaceC2621Ic);
            parcel2.writeNoException();
        } else if (i == 6) {
            Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            R2.w.d("#008 Must be called on the main UI thread.");
            U3(t03, new BinderC3443jn("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            R2.w.d("#008 Must be called on the main UI thread.");
            if (this.f32407w) {
                int i6 = w2.z.f41712b;
                x2.i.c("getVideoController: Instream ad should not be used after destroyed");
            } else {
                C3873rm c3873rm2 = this.f32406v;
                if (c3873rm2 != null && (c3981tm = c3873rm2.f34497F) != null) {
                    synchronized (c3981tm) {
                        interfaceC3755pb = c3981tm.f35164a;
                    }
                }
            }
            parcel2.writeNoException();
            AbstractC3411j8.e(parcel2, interfaceC3755pb);
        }
        return true;
    }

    public final void U3(Y2.a aVar, InterfaceC2621Ic interfaceC2621Ic) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        R2.w.d("#008 Must be called on the main UI thread.");
        if (this.f32407w) {
            int i = w2.z.f41712b;
            x2.i.c("Instream ad can not be shown after destroy().");
            try {
                interfaceC2621Ic.v(2);
                return;
            } catch (RemoteException e9) {
                int i4 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e9);
                return;
            }
        }
        View view = this.f32404n;
        if (view == null || this.f32405u == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i6 = w2.z.f41712b;
            x2.i.c("Instream internal error: ".concat(str));
            try {
                interfaceC2621Ic.v(0);
                return;
            } catch (RemoteException e10) {
                int i9 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (this.f32408x) {
            int i10 = w2.z.f41712b;
            x2.i.c("Instream ad should not be used again.");
            try {
                interfaceC2621Ic.v(1);
                return;
            } catch (RemoteException e11) {
                int i11 = w2.z.f41712b;
                x2.i.i("#007 Could not call remote method.", e11);
                return;
            }
        }
        this.f32408x = true;
        V3();
        ((ViewGroup) Y2.b.D0(aVar)).addView(this.f32404n, new ViewGroup.LayoutParams(-1, -1));
        C2889Yb c2889Yb = C4906k.f40186C.f40188B;
        ViewTreeObserverOnGlobalLayoutListenerC3652ng viewTreeObserverOnGlobalLayoutListenerC3652ng = new ViewTreeObserverOnGlobalLayoutListenerC3652ng(this.f32404n, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC3652ng.f27380n).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC3652ng.R1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC3706og viewTreeObserverOnScrollChangedListenerC3706og = new ViewTreeObserverOnScrollChangedListenerC3706og(this.f32404n, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC3706og.f27380n).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC3706og.R1(viewTreeObserver3);
        }
        W3();
        try {
            interfaceC2621Ic.d();
        } catch (RemoteException e12) {
            int i12 = w2.z.f41712b;
            x2.i.i("#007 Could not call remote method.", e12);
        }
    }

    public final void V3() {
        View view = this.f32404n;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f32404n);
        }
    }

    public final void W3() {
        View view;
        C3873rm c3873rm = this.f32406v;
        if (c3873rm == null || (view = this.f32404n) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        c3873rm.t(view, map, map, C3873rm.d(view));
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
