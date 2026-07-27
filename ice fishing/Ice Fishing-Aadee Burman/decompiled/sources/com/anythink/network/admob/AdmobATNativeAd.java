package com.anythink.network.admob;

import A2.b;
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
import com.google.android.gms.internal.ads.C3090de;
import com.google.android.gms.internal.ads.C3462kb;
import com.google.android.gms.internal.ads.I2;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.c;
import k2.d;
import k2.e;
import k2.f;
import k2.n;
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
import q2.Z0;
import v2.i;

/* loaded from: classes.dex */
public class AdmobATNativeAd extends CustomNativeAd implements b {

    /* renamed from: a, reason: collision with root package name */
    Context f22828a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f22829b;

    /* renamed from: c, reason: collision with root package name */
    String f22830c;

    /* renamed from: d, reason: collision with root package name */
    String f22831d;

    /* renamed from: e, reason: collision with root package name */
    MediaView f22832e;

    /* renamed from: f, reason: collision with root package name */
    NativeAd f22833f;

    /* renamed from: g, reason: collision with root package name */
    int f22834g;

    /* renamed from: h, reason: collision with root package name */
    int f22835h;
    NativeAdView i;

    /* renamed from: j, reason: collision with root package name */
    boolean f22836j;

    /* renamed from: k, reason: collision with root package name */
    boolean f22837k;

    /* renamed from: l, reason: collision with root package name */
    boolean f22838l;

    /* renamed from: m, reason: collision with root package name */
    boolean f22839m;

    /* renamed from: n, reason: collision with root package name */
    boolean f22840n;

    /* renamed from: o, reason: collision with root package name */
    boolean f22841o;

    /* renamed from: p, reason: collision with root package name */
    private final String f22842p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22843q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22844r;

    /* renamed from: s, reason: collision with root package name */
    private a f22845s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, Object> f22846t;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<AdmobATNativeAd> f22850a;

        public a(AdmobATNativeAd admobATNativeAd) {
            this.f22850a = new WeakReference<>(admobATNativeAd);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdmobATNativeAd admobATNativeAd = this.f22850a.get();
            if (admobATNativeAd == null || admobATNativeAd.f22844r) {
                return;
            }
            AdmobATNativeAd.c(admobATNativeAd);
            admobATNativeAd.notifyAdImpression();
        }
    }

    private AdmobATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f22842p = "AdmobATNativeAd";
        this.f22834g = 0;
        this.f22835h = -1;
        this.f22843q = false;
        this.f22844r = false;
        this.f22846t = new HashMap();
        this.f22836j = false;
        this.f22837k = false;
        this.f22838l = false;
        this.f22839m = false;
        this.f22840n = false;
        this.f22828a = context.getApplicationContext();
        this.f22829b = loadCallbackListener;
        this.f22830c = str;
        this.f22831d = str2;
        this.f22843q = ATInitMediation.getIntFromMap(map, j.w.f12629q, 2) == 1;
    }

    public static /* synthetic */ boolean c(AdmobATNativeAd admobATNativeAd) {
        admobATNativeAd.f22844r = true;
        return true;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            a aVar = this.f22845s;
            if (aVar != null) {
                nativeAdView.removeCallbacks(aVar);
            }
            InterfaceC4055vb interfaceC4055vb = this.i.f23596u;
            if (interfaceC4055vb != null) {
                try {
                    interfaceC4055vb.o();
                } catch (RemoteException e9) {
                    i.d("Unable to destroy native ad view", e9);
                }
            }
            this.i = null;
        }
        this.f22832e = null;
        this.f22829b = null;
        this.f22828a = null;
        NativeAd nativeAd = this.f22833f;
        if (nativeAd != null) {
            nativeAd.a();
            this.f22833f = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        N0 h9;
        if (this.f22832e == null) {
            MediaView mediaView = new MediaView(this.f22828a);
            this.f22832e = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f22833f;
            if (nativeAd != null && (h9 = nativeAd.h()) != null) {
                this.f22832e.setMediaContent(h9);
                v a9 = h9.a();
                if (a9 != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.AdmobATNativeAd.3
                        @Override // k2.u
                        public final void onVideoEnd() {
                            AdmobATNativeAd.this.notifyAdVideoEnd();
                        }

                        @Override // k2.u
                        public final void onVideoMute(boolean z3) {
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
        return this.f22832e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdView = new NativeAdView(this.f22828a);
        this.i = nativeAdView;
        return nativeAdView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        d dVar;
        I2 i22 = new I2();
        i22.f25433a = true;
        w wVar = new w(i22);
        int i = this.f22834g;
        int i6 = this.f22835h;
        int i9 = i6 != -1 ? i6 : 1;
        d dVar2 = new d(context, this.f22830c);
        dVar2.b(this);
        dVar2.c(new c() { // from class: com.anythink.network.admob.AdmobATNativeAd.1
            @Override // k2.c
            public final void onAdClicked() {
                AdmobATNativeAd.this.notifyAdClicked();
            }

            @Override // k2.c
            public final void onAdFailedToLoad(n nVar) {
                LoadCallbackListener loadCallbackListener = AdmobATNativeAd.this.f22829b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(nVar.f38568a), nVar.f38569b);
                }
                AdmobATNativeAd.this.f22829b = null;
            }

            @Override // k2.c
            public final void onAdImpression() {
                try {
                    if (AdmobATNativeAd.this.f22833f != null) {
                        AdMobATInitManager.getInstance().a(AdmobATNativeAd.this.getShowId(), AdmobATNativeAd.this.f22833f);
                    }
                } catch (Throwable unused) {
                }
                if (AdmobATNativeAd.this.f22843q) {
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    if (admobATNativeAd.i != null) {
                        admobATNativeAd.f22845s = new a(admobATNativeAd);
                        AdmobATNativeAd admobATNativeAd2 = AdmobATNativeAd.this;
                        admobATNativeAd2.i.postDelayed(admobATNativeAd2.f22845s, 500L);
                        return;
                    }
                }
                AdmobATNativeAd.c(AdmobATNativeAd.this);
                AdmobATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g4 = dVar2.f38581b;
            Z0 z02 = new Z0(wVar);
            dVar = dVar2;
            try {
                g4.J3(new C3462kb(4, false, -1, false, i9, z02, false, i, 0, false, 1 - 1));
            } catch (RemoteException e9) {
                e = e9;
                i.g("Failed to specify native ad options", e);
                e a9 = dVar.a();
                f a10 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.NATIVE, !TextUtils.isEmpty(this.f22831d));
                if (!TextUtils.isEmpty(this.f22831d)) {
                }
                a10.getClass();
                a9.a(new F0((E0) a10.f1720u));
            }
        } catch (RemoteException e10) {
            e = e10;
            dVar = dVar2;
        }
        e a92 = dVar.a();
        f a102 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.NATIVE, !TextUtils.isEmpty(this.f22831d));
        if (!TextUtils.isEmpty(this.f22831d)) {
            ((E0) a102.f1720u).f40019m = this.f22831d;
        }
        a102.getClass();
        a92.a(new F0((E0) a102.f1720u));
    }

    @Override // A2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        float f3;
        C3090de c3090de;
        Uri uri;
        this.f22833f = nativeAd;
        s j6 = nativeAd.j();
        if (j6 != null) {
            this.f22846t.put("response_info", j6);
            setNetworkInfoMap(this.f22846t);
        }
        if (this.f22843q) {
            this.f22833f.m(new p() { // from class: com.anythink.network.admob.AdmobATNativeAd.2
                @Override // k2.p
                public final void onPaidEvent(k2.i iVar) {
                    if (AdmobATNativeAd.this.f22844r) {
                        return;
                    }
                    AdmobATNativeAd.c(AdmobATNativeAd.this);
                    AdMobATInitManager.getInstance();
                    AdMobATInitManager.a((Map<String, Object>) AdmobATNativeAd.this.f22846t, iVar);
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    admobATNativeAd.setNetworkInfoMap(admobATNativeAd.f22846t);
                    AdmobATNativeAd.this.notifyAdImpression();
                }
            });
        }
        setTitle(this.f22833f.e());
        setDescriptionText(this.f22833f.c());
        NativeAd nativeAd2 = this.f22833f;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f22833f.f().f29788c != null) {
            setIconImageUrl(this.f22833f.f().f29788c.toString());
        }
        ArrayList g4 = this.f22833f.g();
        if (g4 != null && g4.size() > 0 && (c3090de = (C3090de) g4.get(0)) != null && (uri = c3090de.f29788c) != null) {
            setMainImageUrl(uri.toString());
            Drawable drawable = c3090de.f29787b;
            if (drawable != null) {
                setMainImageWidth(drawable.getIntrinsicWidth());
                setMainImageHeight(drawable.getIntrinsicHeight());
            }
        }
        setCallToActionText(this.f22833f.d());
        setStarRating(Double.valueOf(this.f22833f.k() == null ? 5.0d : this.f22833f.k().doubleValue()));
        setAdFrom(this.f22833f.l());
        try {
            setAppPrice(Double.valueOf(this.f22833f.i()).doubleValue());
        } catch (Exception unused) {
        }
        setAdvertiserName(this.f22833f.b());
        N0 h9 = this.f22833f.h();
        if (h9 == null || !h9.b()) {
            this.mAdSourceType = "2";
        } else {
            try {
                f3 = h9.f40065a.g();
            } catch (RemoteException e9) {
                i.d("", e9);
                f3 = 0.0f;
            }
            setVideoDuration(f3);
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f22829b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f22829b = null;
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
            if (nativeAdView != null && (mediaView = this.f22832e) != null) {
                nativeAdView.setMediaView(mediaView);
            }
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                for (View view2 : clickViewList) {
                    if (titleView == null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22833f.e(), ((TextView) view2).getText())) {
                            this.i.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.i.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22833f.c(), ((TextView) view2).getText())) {
                            this.i.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.i.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22833f.d(), ((TextView) view2).getText())) {
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
                if (nativeAdView2 == null || (nativeAd3 = this.f22833f) == null) {
                    return;
                }
                nativeAdView2.setNativeAd(nativeAd3);
                return;
            }
            this.f22836j = false;
            this.f22837k = false;
            this.f22838l = false;
            this.f22839m = false;
            this.f22840n = false;
            if (titleView != null) {
                this.f22836j = true;
                this.i.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.f22837k = true;
                this.i.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f22838l = true;
                this.i.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f22840n = true;
                this.i.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f22839m = true;
                this.i.setImageView(mainImageView);
            }
            if (this.f22836j && this.f22837k && this.f22838l && this.f22840n && this.f22839m) {
                NativeAdView nativeAdView3 = this.i;
                if (nativeAdView3 == null || (nativeAd2 = this.f22833f) == null) {
                    return;
                }
                nativeAdView3.setNativeAd(nativeAd2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.i);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f22840n) {
                    this.f22840n = true;
                    this.i.setIconView(view3);
                } else {
                    if (this.f22839m) {
                        break;
                    }
                    this.f22839m = true;
                    this.i.setImageView(view3);
                }
            }
            NativeAdView nativeAdView4 = this.i;
            if (nativeAdView4 == null || (nativeAd = this.f22833f) == null) {
                return;
            }
            nativeAdView4.setNativeAd(nativeAd);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z3) {
        this.f22841o = z3;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void setVideoMute(boolean z3) {
        super.setVideoMute(z3);
        NativeAd nativeAd = this.f22833f;
        if (nativeAd == null || nativeAd.h() == null || this.f22833f.h().a() == null) {
            return;
        }
        v a9 = this.f22833f.h().a();
        synchronized (a9.f38616a) {
            A0 a02 = a9.f38617b;
            if (a02 == null) {
                return;
            }
            try {
                a02.l0(z3);
            } catch (RemoteException e9) {
                i.d("Unable to call mute on video controller.", e9);
            }
        }
    }

    private NativeAdView a() {
        return new NativeAdView(this.f22828a);
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f22832e) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f22840n && this.f22839m) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f22833f;
            if (nativeAd == null || this.i == null) {
                return;
            }
            if (!this.f22836j && charSequence.equals(nativeAd.e())) {
                this.f22836j = true;
                this.i.setHeadlineView(view);
            }
            if (!this.f22837k && charSequence.equals(this.f22833f.c())) {
                this.f22837k = true;
                this.i.setBodyView(view);
            }
            if (this.f22838l || !charSequence.equals(this.f22833f.d())) {
                return;
            }
            this.f22838l = true;
            this.i.setCallToActionView(view);
        }
    }

    public AdmobATNativeAd(Context context, String str, String str2, String str3, LoadCallbackListener loadCallbackListener, Map<String, Object> map, Map<String, Object> map2) {
        this(context, str2, str3, loadCallbackListener, map);
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "1":
                    this.f22834g = 1;
                    break;
                case "2":
                    this.f22834g = 2;
                    break;
                case "3":
                    this.f22834g = 3;
                    break;
                case "4":
                    this.f22834g = 4;
                    break;
                default:
                    this.f22834g = 0;
                    break;
            }
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (parseInt == 0) {
                        this.f22835h = 0;
                    } else if (parseInt == 1) {
                        this.f22835h = 1;
                    } else if (parseInt == 2) {
                        this.f22835h = 2;
                    } else if (parseInt == 3) {
                        this.f22835h = 3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (ATInitMediation.getIntFromMap(map, j.w.f12608E, 1) == 2) {
            this.f22835h = 0;
        }
    }
}
