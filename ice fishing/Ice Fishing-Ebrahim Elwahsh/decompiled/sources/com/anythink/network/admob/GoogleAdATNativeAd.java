package com.anythink.network.admob;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C2937ae;
import com.google.android.gms.internal.ads.C3261gb;
import com.google.android.gms.internal.ads.G2;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.AbstractC4632c;
import k2.C4633d;
import k2.C4634e;
import k2.C4643n;
import k2.EnumC4631b;
import k2.s;
import k2.u;
import k2.v;
import k2.w;
import l2.C4686a;
import q2.E0;
import q2.F0;
import q2.G;
import q2.N0;
import q2.a1;
import u2.i;
import z2.InterfaceC5272b;

/* loaded from: classes.dex */
public class GoogleAdATNativeAd extends CustomNativeAd implements InterfaceC5272b {

    /* renamed from: a, reason: collision with root package name */
    Context f23094a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f23095b;

    /* renamed from: c, reason: collision with root package name */
    String f23096c;

    /* renamed from: d, reason: collision with root package name */
    MediaView f23097d;

    /* renamed from: e, reason: collision with root package name */
    NativeAd f23098e;

    /* renamed from: f, reason: collision with root package name */
    int f23099f;

    /* renamed from: g, reason: collision with root package name */
    NativeAdView f23100g;

    /* renamed from: h, reason: collision with root package name */
    boolean f23101h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f23102j;

    /* renamed from: k, reason: collision with root package name */
    boolean f23103k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23104l;

    /* renamed from: m, reason: collision with root package name */
    boolean f23105m;

    /* renamed from: n, reason: collision with root package name */
    private Map<String, Object> f23106n;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public GoogleAdATNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f23099f = 0;
        this.f23106n = new HashMap();
        this.f23101h = false;
        this.i = false;
        this.f23102j = false;
        this.f23103k = false;
        this.f23104l = false;
        this.f23094a = context.getApplicationContext();
        this.f23095b = loadCallbackListener;
        this.f23096c = str;
    }

    private NativeAdView a() {
        NativeAdView nativeAdView = new NativeAdView(this.f23094a);
        nativeAdView.setNativeAd(this.f23098e);
        return nativeAdView;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.f23100g;
        if (nativeAdView != null) {
            InterfaceC3852rb interfaceC3852rb = nativeAdView.f23749u;
            if (interfaceC3852rb != null) {
                try {
                    interfaceC3852rb.c();
                } catch (RemoteException e6) {
                    i.d("Unable to destroy native ad view", e6);
                }
            }
            this.f23100g = null;
        }
        this.f23097d = null;
        this.f23095b = null;
        this.f23094a = null;
        NativeAd nativeAd = this.f23098e;
        if (nativeAd != null) {
            nativeAd.a();
            this.f23098e = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        v a9;
        if (this.f23100g == null) {
            this.f23100g = a();
        }
        if (this.f23097d == null) {
            MediaView mediaView = new MediaView(this.f23094a);
            this.f23097d = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f23098e;
            if (nativeAd != null) {
                N0 h9 = nativeAd.h();
                this.f23097d.setMediaContent(h9);
                if (h9 != null && (a9 = h9.a()) != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.2
                        @Override // k2.u
                        public final void onVideoEnd() {
                            GoogleAdATNativeAd.this.notifyAdVideoEnd();
                        }

                        @Override // k2.u
                        public final void onVideoMute(boolean z8) {
                        }

                        @Override // k2.u
                        public final void onVideoPause() {
                        }

                        @Override // k2.u
                        public final void onVideoPlay() {
                        }

                        @Override // k2.u
                        public final void onVideoStart() {
                            GoogleAdATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.f23100g.setMediaView(this.f23097d);
                this.f23100g.setNativeAd(this.f23098e);
            }
        }
        return this.f23097d;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView a9 = a();
        this.f23100g = a9;
        return a9;
    }

    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4633d c4633d;
        G2 g22 = new G2();
        g22.f25091a = true;
        w wVar = new w(g22);
        int i = this.f23099f;
        C4633d c4633d2 = new C4633d(context, this.f23096c);
        c4633d2.b(this);
        c4633d2.c(new AbstractC4632c() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.1
            @Override // k2.AbstractC4632c
            public final void onAdClicked() {
                GoogleAdATNativeAd.this.notifyAdClicked();
            }

            @Override // k2.AbstractC4632c
            public final void onAdFailedToLoad(C4643n c4643n) {
                LoadCallbackListener loadCallbackListener = GoogleAdATNativeAd.this.f23095b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(c4643n.f38688a), c4643n.f38689b);
                }
                GoogleAdATNativeAd.this.f23095b = null;
            }

            @Override // k2.AbstractC4632c
            public final void onAdImpression() {
                try {
                    if (GoogleAdATNativeAd.this.f23098e != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATNativeAd.this.getShowId(), GoogleAdATNativeAd.this.f23098e);
                    }
                } catch (Throwable unused) {
                }
                GoogleAdATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g9 = c4633d2.f38701b;
            try {
                a1 a1Var = new a1(wVar);
                c4633d = c4633d2;
                try {
                    g9.t0(new C3261gb(4, false, -1, false, 1, a1Var, false, i, 0, false, 1 - 1));
                } catch (RemoteException e6) {
                    e = e6;
                    i.g("Failed to specify native ad options", e);
                    C4634e a9 = c4633d.a();
                    C4686a a10 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.NATIVE);
                    a10.getClass();
                    a9.a(new F0((E0) a10.f37200u));
                }
            } catch (RemoteException e9) {
                e = e9;
                c4633d = c4633d2;
            }
        } catch (RemoteException e10) {
            e = e10;
            c4633d = c4633d2;
        }
        C4634e a92 = c4633d.a();
        C4686a a102 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.NATIVE);
        a102.getClass();
        a92.a(new F0((E0) a102.f37200u));
    }

    @Override // z2.InterfaceC5272b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        this.f23098e = nativeAd;
        s j9 = nativeAd.j();
        if (j9 != null) {
            this.f23106n.put("response_info", j9);
            setNetworkInfoMap(this.f23106n);
        }
        setTitle(this.f23098e.e());
        setDescriptionText(this.f23098e.c());
        NativeAd nativeAd2 = this.f23098e;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f23098e.f().f29238c != null) {
            setIconImageUrl(this.f23098e.f().f29238c.toString());
        }
        NativeAd nativeAd3 = this.f23098e;
        if (nativeAd3 != null && nativeAd3.g() != null && this.f23098e.g().size() > 0 && ((C2937ae) this.f23098e.g().get(0)).f29238c != null) {
            C2937ae c2937ae = (C2937ae) this.f23098e.g().get(0);
            Drawable drawable = c2937ae.f29237b;
            Uri uri = c2937ae.f29238c;
            if (drawable != null) {
                setMainImageUrl(uri.toString());
                Drawable drawable2 = c2937ae.f29237b;
                setMainImageWidth(drawable2.getIntrinsicWidth());
                setMainImageHeight(drawable2.getIntrinsicHeight());
            } else {
                setMainImageUrl(uri.toString());
            }
        }
        setCallToActionText(this.f23098e.d());
        setStarRating(Double.valueOf(this.f23098e.k() == null ? 5.0d : this.f23098e.k().doubleValue()));
        setAdFrom(this.f23098e.l());
        N0 h9 = this.f23098e.h();
        if (h9 == null || !h9.b()) {
            this.mAdSourceType = "2";
        } else {
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f23095b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f23095b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c A[SYNTHETIC] */
    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        try {
            View titleView = aTNativePrepareInfo.getTitleView();
            View descView = aTNativePrepareInfo.getDescView();
            View ctaView = aTNativePrepareInfo.getCtaView();
            View mainImageView = aTNativePrepareInfo.getMainImageView();
            View iconView = aTNativePrepareInfo.getIconView();
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                for (View view2 : clickViewList) {
                    if (titleView == null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23098e.e(), ((TextView) view2).getText())) {
                            this.f23100g.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.f23100g.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23098e.c(), ((TextView) view2).getText())) {
                            this.f23100g.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.f23100g.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23098e.d(), ((TextView) view2).getText())) {
                            this.f23100g.setCallToActionView(view2);
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView != null) {
                            this.f23100g.setImageView(view2);
                        }
                    } else if (view2 == ctaView) {
                        this.f23100g.setCallToActionView(view2);
                    } else if (iconView == null && view2 == iconView) {
                        this.f23100g.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.f23100g.setImageView(view2);
                    }
                }
                return;
            }
            this.f23101h = false;
            this.i = false;
            this.f23102j = false;
            this.f23103k = false;
            this.f23104l = false;
            if (titleView != null) {
                this.f23101h = true;
                this.f23100g.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.i = true;
                this.f23100g.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f23102j = true;
                this.f23100g.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f23104l = true;
                this.f23100g.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f23103k = true;
                this.f23100g.setImageView(mainImageView);
            }
            if (this.f23101h && this.i && this.f23102j && this.f23104l && this.f23103k) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.f23100g);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f23104l) {
                    this.f23104l = true;
                    this.f23100g.setIconView(view3);
                } else {
                    if (this.f23103k) {
                        return;
                    }
                    this.f23103k = true;
                    this.f23100g.setImageView(view3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z8) {
        this.f23105m = z8;
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f23097d) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f23104l && this.f23103k) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f23098e;
            if (nativeAd == null || this.f23100g == null) {
                return;
            }
            if (!this.f23101h && charSequence.equals(nativeAd.e())) {
                this.f23101h = true;
                this.f23100g.setHeadlineView(view);
            }
            if (!this.i && charSequence.equals(this.f23098e.c())) {
                this.i = true;
                this.f23100g.setBodyView(view);
            }
            if (this.f23102j || !charSequence.equals(this.f23098e.d())) {
                return;
            }
            this.f23102j = true;
            this.f23100g.setCallToActionView(view);
        }
    }

    public GoogleAdATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this(context, str2, loadCallbackListener, map);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "1":
                this.f23099f = 1;
                break;
            case "2":
                this.f23099f = 2;
                break;
            case "3":
                this.f23099f = 3;
                break;
            case "4":
                this.f23099f = 4;
                break;
            default:
                this.f23099f = 0;
                break;
        }
    }
}
