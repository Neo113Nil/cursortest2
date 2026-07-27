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
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.common.d.j;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C2937ae;
import com.google.android.gms.internal.ads.C3261gb;
import com.google.android.gms.internal.ads.G2;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.AbstractC4632c;
import k2.C4633d;
import k2.C4634e;
import k2.C4635f;
import k2.C4638i;
import k2.C4643n;
import k2.EnumC4631b;
import k2.p;
import k2.s;
import k2.u;
import k2.v;
import k2.w;
import q2.A0;
import q2.E0;
import q2.F0;
import q2.G;
import q2.N0;
import q2.a1;
import u2.i;
import z2.InterfaceC5272b;

/* loaded from: classes.dex */
public class AdmobATNativeAd extends CustomNativeAd implements InterfaceC5272b {

    /* renamed from: a, reason: collision with root package name */
    Context f22986a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f22987b;

    /* renamed from: c, reason: collision with root package name */
    String f22988c;

    /* renamed from: d, reason: collision with root package name */
    String f22989d;

    /* renamed from: e, reason: collision with root package name */
    MediaView f22990e;

    /* renamed from: f, reason: collision with root package name */
    NativeAd f22991f;

    /* renamed from: g, reason: collision with root package name */
    int f22992g;

    /* renamed from: h, reason: collision with root package name */
    int f22993h;
    NativeAdView i;

    /* renamed from: j, reason: collision with root package name */
    boolean f22994j;

    /* renamed from: k, reason: collision with root package name */
    boolean f22995k;

    /* renamed from: l, reason: collision with root package name */
    boolean f22996l;

    /* renamed from: m, reason: collision with root package name */
    boolean f22997m;

    /* renamed from: n, reason: collision with root package name */
    boolean f22998n;

    /* renamed from: o, reason: collision with root package name */
    boolean f22999o;

    /* renamed from: p, reason: collision with root package name */
    private final String f23000p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23001q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23002r;

    /* renamed from: s, reason: collision with root package name */
    private a f23003s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, Object> f23004t;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<AdmobATNativeAd> f23008a;

        public a(AdmobATNativeAd admobATNativeAd) {
            this.f23008a = new WeakReference<>(admobATNativeAd);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdmobATNativeAd admobATNativeAd = this.f23008a.get();
            if (admobATNativeAd == null || admobATNativeAd.f23002r) {
                return;
            }
            AdmobATNativeAd.c(admobATNativeAd);
            admobATNativeAd.notifyAdImpression();
        }
    }

    private AdmobATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f23000p = "AdmobATNativeAd";
        this.f22992g = 0;
        this.f22993h = -1;
        this.f23001q = false;
        this.f23002r = false;
        this.f23004t = new HashMap();
        this.f22994j = false;
        this.f22995k = false;
        this.f22996l = false;
        this.f22997m = false;
        this.f22998n = false;
        this.f22986a = context.getApplicationContext();
        this.f22987b = loadCallbackListener;
        this.f22988c = str;
        this.f22989d = str2;
        this.f23001q = ATInitMediation.getIntFromMap(map, j.w.f12786q, 2) == 1;
    }

    public static /* synthetic */ boolean c(AdmobATNativeAd admobATNativeAd) {
        admobATNativeAd.f23002r = true;
        return true;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            a aVar = this.f23003s;
            if (aVar != null) {
                nativeAdView.removeCallbacks(aVar);
            }
            InterfaceC3852rb interfaceC3852rb = this.i.f23749u;
            if (interfaceC3852rb != null) {
                try {
                    interfaceC3852rb.c();
                } catch (RemoteException e6) {
                    i.d("Unable to destroy native ad view", e6);
                }
            }
            this.i = null;
        }
        this.f22990e = null;
        this.f22987b = null;
        this.f22986a = null;
        NativeAd nativeAd = this.f22991f;
        if (nativeAd != null) {
            nativeAd.a();
            this.f22991f = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        N0 h9;
        if (this.f22990e == null) {
            MediaView mediaView = new MediaView(this.f22986a);
            this.f22990e = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f22991f;
            if (nativeAd != null && (h9 = nativeAd.h()) != null) {
                this.f22990e.setMediaContent(h9);
                v a9 = h9.a();
                if (a9 != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.AdmobATNativeAd.3
                        @Override // k2.u
                        public final void onVideoEnd() {
                            AdmobATNativeAd.this.notifyAdVideoEnd();
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
                            AdmobATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
            }
        }
        return this.f22990e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdView = new NativeAdView(this.f22986a);
        this.i = nativeAdView;
        return nativeAdView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4633d c4633d;
        G2 g22 = new G2();
        g22.f25091a = true;
        w wVar = new w(g22);
        int i = this.f22992g;
        int i4 = this.f22993h;
        int i9 = i4 != -1 ? i4 : 1;
        C4633d c4633d2 = new C4633d(context, this.f22988c);
        c4633d2.b(this);
        c4633d2.c(new AbstractC4632c() { // from class: com.anythink.network.admob.AdmobATNativeAd.1
            @Override // k2.AbstractC4632c
            public final void onAdClicked() {
                AdmobATNativeAd.this.notifyAdClicked();
            }

            @Override // k2.AbstractC4632c
            public final void onAdFailedToLoad(C4643n c4643n) {
                LoadCallbackListener loadCallbackListener = AdmobATNativeAd.this.f22987b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(c4643n.f38688a), c4643n.f38689b);
                }
                AdmobATNativeAd.this.f22987b = null;
            }

            @Override // k2.AbstractC4632c
            public final void onAdImpression() {
                try {
                    if (AdmobATNativeAd.this.f22991f != null) {
                        AdMobATInitManager.getInstance().a(AdmobATNativeAd.this.getShowId(), AdmobATNativeAd.this.f22991f);
                    }
                } catch (Throwable unused) {
                }
                if (AdmobATNativeAd.this.f23001q) {
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    if (admobATNativeAd.i != null) {
                        admobATNativeAd.f23003s = new a(admobATNativeAd);
                        AdmobATNativeAd admobATNativeAd2 = AdmobATNativeAd.this;
                        admobATNativeAd2.i.postDelayed(admobATNativeAd2.f23003s, 500L);
                        return;
                    }
                }
                AdmobATNativeAd.c(AdmobATNativeAd.this);
                AdmobATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g9 = c4633d2.f38701b;
            a1 a1Var = new a1(wVar);
            c4633d = c4633d2;
            try {
                g9.t0(new C3261gb(4, false, -1, false, i9, a1Var, false, i, 0, false, 1 - 1));
            } catch (RemoteException e6) {
                e = e6;
                i.g("Failed to specify native ad options", e);
                C4634e a9 = c4633d.a();
                C4635f a10 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.NATIVE, !TextUtils.isEmpty(this.f22989d));
                if (!TextUtils.isEmpty(this.f22989d)) {
                }
                a10.getClass();
                a9.a(new F0((E0) a10.f37200u));
            }
        } catch (RemoteException e9) {
            e = e9;
            c4633d = c4633d2;
        }
        C4634e a92 = c4633d.a();
        C4635f a102 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.NATIVE, !TextUtils.isEmpty(this.f22989d));
        if (!TextUtils.isEmpty(this.f22989d)) {
            ((E0) a102.f37200u).f39929m = this.f22989d;
        }
        a102.getClass();
        a92.a(new F0((E0) a102.f37200u));
    }

    @Override // z2.InterfaceC5272b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        float f6;
        C2937ae c2937ae;
        Uri uri;
        this.f22991f = nativeAd;
        s j9 = nativeAd.j();
        if (j9 != null) {
            this.f23004t.put("response_info", j9);
            setNetworkInfoMap(this.f23004t);
        }
        if (this.f23001q) {
            this.f22991f.m(new p() { // from class: com.anythink.network.admob.AdmobATNativeAd.2
                @Override // k2.p
                public final void onPaidEvent(C4638i c4638i) {
                    if (AdmobATNativeAd.this.f23002r) {
                        return;
                    }
                    AdmobATNativeAd.c(AdmobATNativeAd.this);
                    AdMobATInitManager.getInstance();
                    AdMobATInitManager.a((Map<String, Object>) AdmobATNativeAd.this.f23004t, c4638i);
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    admobATNativeAd.setNetworkInfoMap(admobATNativeAd.f23004t);
                    AdmobATNativeAd.this.notifyAdImpression();
                }
            });
        }
        setTitle(this.f22991f.e());
        setDescriptionText(this.f22991f.c());
        NativeAd nativeAd2 = this.f22991f;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f22991f.f().f29238c != null) {
            setIconImageUrl(this.f22991f.f().f29238c.toString());
        }
        ArrayList g9 = this.f22991f.g();
        if (g9 != null && g9.size() > 0 && (c2937ae = (C2937ae) g9.get(0)) != null && (uri = c2937ae.f29238c) != null) {
            setMainImageUrl(uri.toString());
            Drawable drawable = c2937ae.f29237b;
            if (drawable != null) {
                setMainImageWidth(drawable.getIntrinsicWidth());
                setMainImageHeight(drawable.getIntrinsicHeight());
            }
        }
        setCallToActionText(this.f22991f.d());
        setStarRating(Double.valueOf(this.f22991f.k() == null ? 5.0d : this.f22991f.k().doubleValue()));
        setAdFrom(this.f22991f.l());
        try {
            setAppPrice(Double.valueOf(this.f22991f.i()).doubleValue());
        } catch (Exception unused) {
        }
        setAdvertiserName(this.f22991f.b());
        N0 h9 = this.f22991f.h();
        if (h9 == null || !h9.b()) {
            this.mAdSourceType = "2";
        } else {
            try {
                f6 = h9.f39975a.g();
            } catch (RemoteException e6) {
                i.d("", e6);
                f6 = 0.0f;
            }
            setVideoDuration(f6);
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f22987b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f22987b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068 A[SYNTHETIC] */
    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        NativeAd nativeAd;
        NativeAd nativeAd2;
        NativeAd nativeAd3;
        MediaView mediaView;
        try {
            View titleView = aTNativePrepareInfo.getTitleView();
            View descView = aTNativePrepareInfo.getDescView();
            View ctaView = aTNativePrepareInfo.getCtaView();
            View mainImageView = aTNativePrepareInfo.getMainImageView();
            View iconView = aTNativePrepareInfo.getIconView();
            NativeAdView nativeAdView = this.i;
            if (nativeAdView != null && (mediaView = this.f22990e) != null) {
                nativeAdView.setMediaView(mediaView);
            }
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                for (View view2 : clickViewList) {
                    if (titleView == null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22991f.e(), ((TextView) view2).getText())) {
                            this.i.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.i.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22991f.c(), ((TextView) view2).getText())) {
                            this.i.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.i.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22991f.d(), ((TextView) view2).getText())) {
                            this.i.setCallToActionView(view2);
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView != null) {
                            this.i.setImageView(view2);
                        }
                    } else if (view2 == ctaView) {
                        this.i.setCallToActionView(view2);
                    } else if (iconView == null && view2 == iconView) {
                        this.i.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.i.setImageView(view2);
                    }
                }
                NativeAdView nativeAdView2 = this.i;
                if (nativeAdView2 == null || (nativeAd3 = this.f22991f) == null) {
                    return;
                }
                nativeAdView2.setNativeAd(nativeAd3);
                return;
            }
            this.f22994j = false;
            this.f22995k = false;
            this.f22996l = false;
            this.f22997m = false;
            this.f22998n = false;
            if (titleView != null) {
                this.f22994j = true;
                this.i.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.f22995k = true;
                this.i.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f22996l = true;
                this.i.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f22998n = true;
                this.i.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f22997m = true;
                this.i.setImageView(mainImageView);
            }
            if (this.f22994j && this.f22995k && this.f22996l && this.f22998n && this.f22997m) {
                NativeAdView nativeAdView3 = this.i;
                if (nativeAdView3 == null || (nativeAd2 = this.f22991f) == null) {
                    return;
                }
                nativeAdView3.setNativeAd(nativeAd2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.i);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f22998n) {
                    this.f22998n = true;
                    this.i.setIconView(view3);
                } else {
                    if (this.f22997m) {
                        break;
                    }
                    this.f22997m = true;
                    this.i.setImageView(view3);
                }
            }
            NativeAdView nativeAdView4 = this.i;
            if (nativeAdView4 == null || (nativeAd = this.f22991f) == null) {
                return;
            }
            nativeAdView4.setNativeAd(nativeAd);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z8) {
        this.f22999o = z8;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void setVideoMute(boolean z8) {
        super.setVideoMute(z8);
        NativeAd nativeAd = this.f22991f;
        if (nativeAd == null || nativeAd.h() == null || this.f22991f.h().a() == null) {
            return;
        }
        v a9 = this.f22991f.h().a();
        synchronized (a9.f38736a) {
            A0 a02 = a9.f38737b;
            if (a02 == null) {
                return;
            }
            try {
                a02.o0(z8);
            } catch (RemoteException e6) {
                i.d("Unable to call mute on video controller.", e6);
            }
        }
    }

    private NativeAdView a() {
        return new NativeAdView(this.f22986a);
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f22990e) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f22998n && this.f22997m) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f22991f;
            if (nativeAd == null || this.i == null) {
                return;
            }
            if (!this.f22994j && charSequence.equals(nativeAd.e())) {
                this.f22994j = true;
                this.i.setHeadlineView(view);
            }
            if (!this.f22995k && charSequence.equals(this.f22991f.c())) {
                this.f22995k = true;
                this.i.setBodyView(view);
            }
            if (this.f22996l || !charSequence.equals(this.f22991f.d())) {
                return;
            }
            this.f22996l = true;
            this.i.setCallToActionView(view);
        }
    }

    public AdmobATNativeAd(Context context, String str, String str2, String str3, LoadCallbackListener loadCallbackListener, Map<String, Object> map, Map<String, Object> map2) {
        this(context, str2, str3, loadCallbackListener, map);
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "1":
                    this.f22992g = 1;
                    break;
                case "2":
                    this.f22992g = 2;
                    break;
                case "3":
                    this.f22992g = 3;
                    break;
                case "4":
                    this.f22992g = 4;
                    break;
                default:
                    this.f22992g = 0;
                    break;
            }
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (parseInt == 0) {
                        this.f22993h = 0;
                    } else if (parseInt == 1) {
                        this.f22993h = 1;
                    } else if (parseInt == 2) {
                        this.f22993h = 2;
                    } else if (parseInt == 3) {
                        this.f22993h = 3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (ATInitMediation.getIntFromMap(map, j.w.f12765E, 1) == 2) {
            this.f22993h = 0;
        }
    }
}
