package com.google.android.gms.ads.nativead;

import V2.a;
import V2.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ErrorCode;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import i8.m;
import q2.C4901m;
import q2.C4903n;
import q2.C4907p;
import q2.r;
import t2.w;
import u2.i;
import z2.AbstractC5271a;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f23748n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3852rb f23749u;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f23748n = frameLayout;
        this.f23749u = c();
    }

    public final View a(String str) {
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb == null) {
            return null;
        }
        try {
            a N8 = interfaceC3852rb.N(str);
            if (N8 != null) {
                return (View) b.A0(N8);
            }
            return null;
        } catch (RemoteException e6) {
            i.d("Unable to call getAssetView on delegate", e6);
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f23748n);
    }

    public final void b(View view, String str) {
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb == null) {
            return;
        }
        try {
            interfaceC3852rb.L1(new b(view), str);
        } catch (RemoteException e6) {
            i.d("Unable to call setAssetView on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f23748n;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final InterfaceC3852rb c() {
        if (isInEditMode()) {
            return null;
        }
        C4903n c4903n = C4907p.f40108g.f40110b;
        FrameLayout frameLayout = this.f23748n;
        Context context = frameLayout.getContext();
        c4903n.getClass();
        return (InterfaceC3852rb) new C4901m(c4903n, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb != null) {
            if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
                try {
                    interfaceC3852rb.l2(new b(motionEvent));
                } catch (RemoteException e6) {
                    i.d("Unable to call handleTouchEvent on delegate", e6);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AbstractC5271a getAdChoicesView() {
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
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb == null) {
            return;
        }
        try {
            interfaceC3852rb.k0(new b(view), i);
        } catch (RemoteException e6) {
            i.d("Unable to call onVisibilityChanged on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f23748n);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f23748n == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AbstractC5271a abstractC5271a) {
        b(abstractC5271a, "3011");
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
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb == null) {
            return;
        }
        try {
            interfaceC3852rb.n1(new b(view));
        } catch (RemoteException e6) {
            i.d("Unable to call setClickConfirmingView on delegate", e6);
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
        w wVar = new w(6, this);
        synchronized (mediaView) {
            mediaView.f23744v = wVar;
            if (mediaView.f23743u) {
                wVar.b(mediaView.f23742n);
            }
        }
        m mVar = new m(this);
        synchronized (mediaView) {
            mediaView.f23747y = mVar;
            if (mediaView.f23746x) {
                mVar.k(mediaView.f23745w);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC3852rb interfaceC3852rb = this.f23749u;
        if (interfaceC3852rb == null) {
            return;
        }
        try {
            interfaceC3852rb.w2(nativeAd.n());
        } catch (RemoteException e6) {
            i.d("Unable to call setNativeAd on delegate", e6);
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
        this.f23748n = frameLayout;
        this.f23749u = c();
    }
}
