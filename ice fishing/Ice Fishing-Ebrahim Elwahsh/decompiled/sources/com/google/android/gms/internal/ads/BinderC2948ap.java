package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k2.C4639j;
import k2.C4643n;
import m2.AbstractC4778b;
import q2.InterfaceC4915t0;
import q2.InterfaceC4921w0;
import v2.AbstractC5123a;

/* renamed from: com.google.android.gms.internal.ads.ap, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2948ap extends AbstractBinderC3186f8 implements InterfaceC4915t0 {

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29323n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f29324u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f29325v;

    /* renamed from: w, reason: collision with root package name */
    public final C2799To f29326w;

    /* renamed from: x, reason: collision with root package name */
    public final C3157eg f29327x;

    /* renamed from: y, reason: collision with root package name */
    public C2748Qo f29328y;

    public BinderC2948ap(Context context, WeakReference weakReference, C2799To c2799To, C3157eg c3157eg) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f29323n = new HashMap();
        this.f29324u = context;
        this.f29325v = weakReference;
        this.f29326w = c2799To;
        this.f29327x = c3157eg;
    }

    public static String K3(Object obj) {
        k2.s j9;
        InterfaceC4921w0 interfaceC4921w0;
        if (obj instanceof C4643n) {
            j9 = ((C4643n) obj).f38725e;
        } else if (obj instanceof AbstractC4778b) {
            j9 = ((AbstractC4778b) obj).a();
        } else if (obj instanceof AbstractC5123a) {
            j9 = ((AbstractC5123a) obj).a();
        } else if (obj instanceof F2.c) {
            j9 = ((F2.c) obj).a();
        } else if (obj instanceof G2.a) {
            C4018uf c4018uf = (C4018uf) ((G2.a) obj);
            c4018uf.getClass();
            InterfaceC4921w0 interfaceC4921w02 = null;
            try {
                InterfaceC3211ff interfaceC3211ff = c4018uf.f34633a;
                if (interfaceC3211ff != null) {
                    interfaceC4921w02 = interfaceC3211ff.m();
                }
            } catch (RemoteException e6) {
                u2.i.i("#007 Could not call remote method.", e6);
            }
            j9 = new k2.s(interfaceC4921w02);
        } else if (obj instanceof C4639j) {
            j9 = ((C4639j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            j9 = ((NativeAd) obj).j();
        }
        if (j9 == null || (interfaceC4921w0 = j9.f38730a) == null) {
            return "";
        }
        try {
            return interfaceC4921w0.h();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        V2.a u02 = V2.b.u0(parcel.readStrongBinder());
        V2.a u03 = V2.b.u0(parcel.readStrongBinder());
        AbstractC3241g8.f(parcel);
        r2(readString, u02, u03);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void G3(Object obj, String str) {
        this.f29323n.put(str, obj);
        H3(K3(obj));
    }

    public final synchronized void H3(String str) {
        try {
            C3320hg d2 = this.f29328y.d(str);
            Rx rx = new Rx(this);
            d2.c(new MD(0, d2, rx), this.f29327x);
        } catch (NullPointerException e6) {
            p2.j.f39798C.f39808h.d("OutOfContextTester.setAdAsOutOfContext", e6);
            this.f29326w.b();
        }
    }

    public final synchronized void I3(String str) {
        try {
            C3320hg d2 = this.f29328y.d(str);
            Vx vx = new Vx(this);
            d2.c(new MD(0, d2, vx), this.f29327x);
        } catch (NullPointerException e6) {
            p2.j.f39798C.f39808h.d("OutOfContextTester.setAdAsShown", e6);
            this.f29326w.b();
        }
    }

    public final Context J3() {
        Context context = (Context) this.f29325v.get();
        return context == null ? this.f29324u : context;
    }

    @Override // q2.InterfaceC4915t0
    public final void r2(String str, V2.a aVar, V2.a aVar2) {
        Context context = (Context) V2.b.A0(aVar);
        ViewGroup viewGroup = (ViewGroup) V2.b.A0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.f29323n;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof C4639j) {
            C4639j c4639j = (C4639j) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            AbstractC2720Pd.P(-1, -1, linearLayout);
            linearLayout.setGravity(17);
            linearLayout.addView(c4639j);
            c4639j.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            AbstractC2720Pd.P(-1, -1, nativeAdView);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            AbstractC2720Pd.P(-1, -1, linearLayout2);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources c4 = p2.j.f39798C.f39808h.c();
            linearLayout2.addView(AbstractC2720Pd.H(context, c4 == null ? "Headline" : c4.getString(C5284R.string.native_headline), R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String e6 = nativeAd.e();
            if (e6 == null) {
                e6 = "";
            }
            View H6 = AbstractC2720Pd.H(context, e6, R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(H6);
            linearLayout2.addView(H6);
            linearLayout2.addView(AbstractC2720Pd.H(context, c4 == null ? "Body" : c4.getString(C5284R.string.native_body), R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String c9 = nativeAd.c();
            if (c9 == null) {
                c9 = "";
            }
            View H8 = AbstractC2720Pd.H(context, c9, R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(H8);
            linearLayout2.addView(H8);
            linearLayout2.addView(AbstractC2720Pd.H(context, c4 == null ? "Media View" : c4.getString(C5284R.string.native_media_view), R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
