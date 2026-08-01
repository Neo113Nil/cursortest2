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
import com.icefishing.icefishingbigwin.C5275R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import m2.AbstractC4731b;
import p2.C4835j;
import q2.InterfaceC4908t0;
import q2.InterfaceC4914w0;
import w2.AbstractC5148a;

/* renamed from: com.google.android.gms.internal.ads.Zo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2895Zo extends AbstractBinderC3336i8 implements InterfaceC4908t0 {

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f28963n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f28964u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f28965v;

    /* renamed from: w, reason: collision with root package name */
    public final C2783So f28966w;

    /* renamed from: x, reason: collision with root package name */
    public final C3360ig f28967x;

    /* renamed from: y, reason: collision with root package name */
    public C2749Qo f28968y;

    public BinderC2895Zo(Context context, WeakReference weakReference, C2783So c2783So, C3360ig c3360ig) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f28963n = new HashMap();
        this.f28964u = context;
        this.f28965v = weakReference;
        this.f28966w = c2783So;
        this.f28967x = c3360ig;
    }

    public static String Y3(Object obj) {
        k2.s j6;
        InterfaceC4914w0 interfaceC4914w0;
        if (obj instanceof k2.n) {
            j6 = ((k2.n) obj).f38605e;
        } else if (obj instanceof AbstractC4731b) {
            j6 = ((AbstractC4731b) obj).a();
        } else if (obj instanceof AbstractC5148a) {
            j6 = ((AbstractC5148a) obj).a();
        } else if (obj instanceof G2.c) {
            j6 = ((G2.c) obj).a();
        } else if (obj instanceof H2.a) {
            C4167xf c4167xf = (C4167xf) ((H2.a) obj);
            c4167xf.getClass();
            InterfaceC4914w0 interfaceC4914w02 = null;
            try {
                InterfaceC3412jf interfaceC3412jf = c4167xf.f35032a;
                if (interfaceC3412jf != null) {
                    interfaceC4914w02 = interfaceC3412jf.l();
                }
            } catch (RemoteException e9) {
                v2.i.i("#007 Could not call remote method.", e9);
            }
            j6 = new k2.s(interfaceC4914w02);
        } else if (obj instanceof k2.j) {
            j6 = ((k2.j) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            j6 = ((NativeAd) obj).j();
        }
        if (j6 == null || (interfaceC4914w0 = j6.f38610a) == null) {
            return "";
        }
        try {
            return interfaceC4914w0.j();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        W2.a w02 = W2.b.w0(parcel.readStrongBinder());
        W2.a w03 = W2.b.w0(parcel.readStrongBinder());
        AbstractC3388j8.f(parcel);
        U2(readString, w02, w03);
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC4908t0
    public final void U2(String str, W2.a aVar, W2.a aVar2) {
        Context context = (Context) W2.b.F0(aVar);
        ViewGroup viewGroup = (ViewGroup) W2.b.F0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.f28963n;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof k2.j) {
            k2.j jVar = (k2.j) obj;
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
            Resources c9 = C4835j.f39733C.f39743h.c();
            linearLayout2.addView(MA.J(context, c9 == null ? "Headline" : c9.getString(C5275R.string.native_headline), R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String e9 = nativeAd.e();
            if (e9 == null) {
                e9 = "";
            }
            View J = MA.J(context, e9, R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(J);
            linearLayout2.addView(J);
            linearLayout2.addView(MA.J(context, c9 == null ? "Body" : c9.getString(C5275R.string.native_body), R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String c10 = nativeAd.c();
            if (c10 == null) {
                c10 = "";
            }
            View J2 = MA.J(context, c10, R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(J2);
            linearLayout2.addView(J2);
            linearLayout2.addView(MA.J(context, c9 == null ? "Media View" : c9.getString(C5275R.string.native_media_view), R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }

    public final synchronized void U3(Object obj, String str) {
        this.f28963n.put(str, obj);
        V3(Y3(obj));
    }

    public final synchronized void V3(String str) {
        try {
            C3467kg d2 = this.f28968y.d(str);
            Qx qx = new Qx(this);
            d2.a(new LD(0, d2, qx), this.f28967x);
        } catch (NullPointerException e9) {
            C4835j.f39733C.f39743h.d("OutOfContextTester.setAdAsOutOfContext", e9);
            this.f28966w.b();
        }
    }

    public final synchronized void W3(String str) {
        try {
            C3467kg d2 = this.f28968y.d(str);
            Ux ux = new Ux(this);
            d2.a(new LD(0, d2, ux), this.f28967x);
        } catch (NullPointerException e9) {
            C4835j.f39733C.f39743h.d("OutOfContextTester.setAdAsShown", e9);
            this.f28966w.b();
        }
    }

    public final Context X3() {
        Context context = (Context) this.f28965v.get();
        return context == null ? this.f28964u : context;
    }
}
