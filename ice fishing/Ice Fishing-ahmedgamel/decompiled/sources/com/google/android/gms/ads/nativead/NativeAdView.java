package com.google.android.gms.ads.nativead;

import I0.j;
import W2.a;
import W2.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ErrorCode;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import g1.C4522b;
import q2.C4894m;
import q2.C4896n;
import q2.C4900p;
import q2.r;
import v2.i;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f23595n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4055vb f23596u;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f23595n = frameLayout;
        this.f23596u = c();
    }

    public final View a(String str) {
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb == null) {
            return null;
        }
        try {
            a z3 = interfaceC4055vb.z(str);
            if (z3 != null) {
                return (View) b.F0(z3);
            }
            return null;
        } catch (RemoteException e9) {
            i.d("Unable to call getAssetView on delegate", e9);
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f23595n);
    }

    public final void b(View view, String str) {
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb == null) {
            return;
        }
        try {
            interfaceC4055vb.S2(new b(view), str);
        } catch (RemoteException e9) {
            i.d("Unable to call setAssetView on delegate", e9);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f23595n;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final InterfaceC4055vb c() {
        if (isInEditMode()) {
            return null;
        }
        C4896n c4896n = C4900p.f40199g.f40201b;
        FrameLayout frameLayout = this.f23595n;
        Context context = frameLayout.getContext();
        c4896n.getClass();
        return (InterfaceC4055vb) new C4894m(c4896n, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb != null) {
            if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.Xc)).booleanValue()) {
                try {
                    interfaceC4055vb.S0(new b(motionEvent));
                } catch (RemoteException e9) {
                    i.d("Unable to call handleTouchEvent on delegate", e9);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public A2.a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a(ErrorCode.placeDeletedError);
    }

    public final View getCallToActionView() {
        return a(ErrorCode.appIdOrPlaceIdEmpty);
    }

    public final View getHeadlineView() {
        return a(ErrorCode.placeStrategyError);
    }

    public final View getIconView() {
        return a(ErrorCode.formatError);
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a9 = a("3010");
        if (a9 instanceof MediaView) {
            return (MediaView) a9;
        }
        if (a9 == null) {
            return null;
        }
        i.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb == null) {
            return;
        }
        try {
            interfaceC4055vb.y3(new b(view), i);
        } catch (RemoteException e9) {
            i.d("Unable to call onVisibilityChanged on delegate", e9);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f23595n);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f23595n == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(A2.a aVar) {
        b(aVar, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, ErrorCode.placeDeletedError);
    }

    public final void setCallToActionView(View view) {
        b(view, ErrorCode.appIdOrPlaceIdEmpty);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb == null) {
            return;
        }
        try {
            interfaceC4055vb.A3(new b(view));
        } catch (RemoteException e9) {
            i.d("Unable to call setClickConfirmingView on delegate", e9);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, ErrorCode.placeStrategyError);
    }

    public final void setIconView(View view) {
        b(view, ErrorCode.formatError);
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        C4522b c4522b = new C4522b(1, this);
        synchronized (mediaView) {
            mediaView.f23591v = c4522b;
            if (mediaView.f23590u) {
                c4522b.X(mediaView.f23589n);
            }
        }
        j jVar = new j(1, this);
        synchronized (mediaView) {
            mediaView.f23594y = jVar;
            if (mediaView.f23593x) {
                jVar.b(mediaView.f23592w);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC4055vb interfaceC4055vb = this.f23596u;
        if (interfaceC4055vb == null) {
            return;
        }
        try {
            interfaceC4055vb.R0(nativeAd.n());
        } catch (RemoteException e9) {
            i.d("Unable to call setNativeAd on delegate", e9);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f23595n = frameLayout;
        this.f23596u = c();
    }
}
