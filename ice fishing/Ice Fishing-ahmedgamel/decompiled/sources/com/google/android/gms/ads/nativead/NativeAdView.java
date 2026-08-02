package com.google.android.gms.ads.nativead;

import I0.j;
import Y2.a;
import Y2.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.core.api.ErrorCode;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import i1.C4585b;
import s2.C4943m;
import s2.C4945n;
import s2.C4949p;
import s2.r;
import x2.i;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f24375n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4078vb f24376u;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f24375n = frameLayout;
        this.f24376u = c();
    }

    public final View a(String str) {
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb == null) {
            return null;
        }
        try {
            a z6 = interfaceC4078vb.z(str);
            if (z6 != null) {
                return (View) b.D0(z6);
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
        super.bringChildToFront(this.f24375n);
    }

    public final void b(View view, String str) {
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb == null) {
            return;
        }
        try {
            interfaceC4078vb.t3(new b(view), str);
        } catch (RemoteException e9) {
            i.d("Unable to call setAssetView on delegate", e9);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f24375n;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final InterfaceC4078vb c() {
        if (isInEditMode()) {
            return null;
        }
        C4945n c4945n = C4949p.f40498g.f40500b;
        FrameLayout frameLayout = this.f24375n;
        Context context = frameLayout.getContext();
        c4945n.getClass();
        return (InterfaceC4078vb) new C4943m(c4945n, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb != null) {
            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.Xc)).booleanValue()) {
                try {
                    interfaceC4078vb.q3(new b(motionEvent));
                } catch (RemoteException e9) {
                    i.d("Unable to call handleTouchEvent on delegate", e9);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C2.a getAdChoicesView() {
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
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb == null) {
            return;
        }
        try {
            interfaceC4078vb.y3(new b(view), i);
        } catch (RemoteException e9) {
            i.d("Unable to call onVisibilityChanged on delegate", e9);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f24375n);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f24375n == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(C2.a aVar) {
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
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb == null) {
            return;
        }
        try {
            interfaceC4078vb.v3(new b(view));
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
        C4585b c4585b = new C4585b(4, this);
        synchronized (mediaView) {
            mediaView.f24371v = c4585b;
            if (mediaView.f24370u) {
                c4585b.u(mediaView.f24369n);
            }
        }
        j jVar = new j(3, this);
        synchronized (mediaView) {
            mediaView.f24374y = jVar;
            if (mediaView.f24373x) {
                jVar.v(mediaView.f24372w);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC4078vb interfaceC4078vb = this.f24376u;
        if (interfaceC4078vb == null) {
            return;
        }
        try {
            interfaceC4078vb.V0(nativeAd.n());
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
        this.f24375n = frameLayout;
        this.f24376u = c();
    }
}
