package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import o2.AbstractC4802b;
import r2.C4906k;
import s2.InterfaceC4957t0;
import s2.InterfaceC4963w0;
import y2.AbstractC5205a;

/* renamed from: com.google.android.gms.internal.ads.Zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2918Zo extends AbstractBinderC3359i8 implements InterfaceC4957t0 {

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29733n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f29734u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f29735v;

    /* renamed from: w, reason: collision with root package name */
    public final C2820To f29736w;

    /* renamed from: x, reason: collision with root package name */
    public final C3383ig f29737x;

    /* renamed from: y, reason: collision with root package name */
    public C2786Ro f29738y;

    public BinderC2918Zo(Context context, WeakReference weakReference, C2820To c2820To, C3383ig c3383ig) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f29733n = new HashMap();
        this.f29734u = context;
        this.f29735v = weakReference;
        this.f29736w = c2820To;
        this.f29737x = c3383ig;
    }

    public static String Y3(Object obj) {
        m2.s j6;
        InterfaceC4963w0 interfaceC4963w0;
        if (obj instanceof m2.n) {
            j6 = ((m2.n) obj).f39394e;
        } else if (obj instanceof AbstractC4802b) {
            j6 = ((AbstractC4802b) obj).a();
        } else if (obj instanceof AbstractC5205a) {
            j6 = ((AbstractC5205a) obj).a();
        } else if (obj instanceof I2.c) {
            j6 = ((I2.c) obj).a();
        } else if (obj instanceof J2.a) {
            C4190xf c4190xf = (C4190xf) ((J2.a) obj);
            c4190xf.getClass();
            InterfaceC4963w0 interfaceC4963w02 = null;
            try {
                InterfaceC3435jf interfaceC3435jf = c4190xf.f35811a;
                if (interfaceC3435jf != null) {
                    interfaceC4963w02 = interfaceC3435jf.l();
                }
            } catch (RemoteException e9) {
                x2.i.i("#007 Could not call remote method.", e9);
            }
            j6 = new m2.s(interfaceC4963w02);
        } else if (obj instanceof m2.j) {
            j6 = ((m2.j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            j6 = ((NativeAd) obj).j();
        }
        if (j6 == null || (interfaceC4963w0 = j6.f39399a) == null) {
            return "";
        }
        try {
            return interfaceC4963w0.j();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // s2.InterfaceC4957t0
    public final void E1(String str, Y2.a aVar, Y2.a aVar2) {
        Context context = (Context) Y2.b.D0(aVar);
        ViewGroup viewGroup = (ViewGroup) Y2.b.D0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.f29733n;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof m2.j) {
            m2.j jVar = (m2.j) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            MA.T(-1, -1, linearLayout);
            linearLayout.setGravity(17);
            linearLayout.addView(jVar);
            jVar.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            MA.T(-1, -1, nativeAdView);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            MA.T(-1, -1, linearLayout2);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources c9 = C4906k.f40186C.f40196h.c();
            linearLayout2.addView(MA.J(context, c9 == null ? "Headline" : c9.getString(C5248R.string.native_headline), R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String e9 = nativeAd.e();
            if (e9 == null) {
                e9 = "";
            }
            View J = MA.J(context, e9, R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(J);
            linearLayout2.addView(J);
            linearLayout2.addView(MA.J(context, c9 == null ? "Body" : c9.getString(C5248R.string.native_body), R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String c10 = nativeAd.c();
            if (c10 == null) {
                c10 = "";
            }
            View J8 = MA.J(context, c10, R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(J8);
            linearLayout2.addView(J8);
            linearLayout2.addView(MA.J(context, c9 == null ? "Media View" : c9.getString(C5248R.string.native_media_view), R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
        Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
        AbstractC3411j8.f(parcel);
        E1(readString, t02, t03);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void U3(Object obj, String str) {
        this.f29733n.put(str, obj);
        V3(Y3(obj));
    }

    public final synchronized void V3(String str) {
        try {
            C3490kg d9 = this.f29738y.d(str);
            Qx qx = new Qx(this);
            d9.a(new LD(0, d9, qx), this.f29737x);
        } catch (NullPointerException e9) {
            C4906k.f40186C.f40196h.d("OutOfContextTester.setAdAsOutOfContext", e9);
            this.f29736w.b();
        }
    }

    public final synchronized void W3(String str) {
        try {
            C3490kg d9 = this.f29738y.d(str);
            Ux ux = new Ux(this);
            d9.a(new LD(0, d9, ux), this.f29737x);
        } catch (NullPointerException e9) {
            C4906k.f40186C.f40196h.d("OutOfContextTester.setAdAsShown", e9);
            this.f29736w.b();
        }
    }

    public final Context X3() {
        Context context = (Context) this.f29735v.get();
        return context == null ? this.f29734u : context;
    }
}
