package com.anythink.network.admob;

import C2.b;
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
import com.google.android.gms.internal.ads.C3113de;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.I2;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m2.c;
import m2.d;
import m2.e;
import m2.f;
import m2.n;
import m2.p;
import m2.s;
import m2.u;
import m2.v;
import m2.w;
import s2.A0;
import s2.E0;
import s2.F0;
import s2.G;
import s2.N0;
import s2.Z0;
import x2.i;

/* loaded from: classes.dex */
public class AdmobATNativeAd extends CustomNativeAd implements b {

    /* renamed from: a, reason: collision with root package name */
    Context f23615a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f23616b;

    /* renamed from: c, reason: collision with root package name */
    String f23617c;

    /* renamed from: d, reason: collision with root package name */
    String f23618d;

    /* renamed from: e, reason: collision with root package name */
    MediaView f23619e;

    /* renamed from: f, reason: collision with root package name */
    NativeAd f23620f;

    /* renamed from: g, reason: collision with root package name */
    int f23621g;

    /* renamed from: h, reason: collision with root package name */
    int f23622h;
    NativeAdView i;

    /* renamed from: j, reason: collision with root package name */
    boolean f23623j;

    /* renamed from: k, reason: collision with root package name */
    boolean f23624k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23625l;

    /* renamed from: m, reason: collision with root package name */
    boolean f23626m;

    /* renamed from: n, reason: collision with root package name */
    boolean f23627n;

    /* renamed from: o, reason: collision with root package name */
    boolean f23628o;

    /* renamed from: p, reason: collision with root package name */
    private final String f23629p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23630q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23631r;

    /* renamed from: s, reason: collision with root package name */
    private a f23632s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, Object> f23633t;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<AdmobATNativeAd> f23637a;

        public a(AdmobATNativeAd admobATNativeAd) {
            this.f23637a = new WeakReference<>(admobATNativeAd);
        }

        @Override // java.lang.Runnable
        public final void run() {
            AdmobATNativeAd admobATNativeAd = this.f23637a.get();
            if (admobATNativeAd == null || admobATNativeAd.f23631r) {
                return;
            }
            AdmobATNativeAd.c(admobATNativeAd);
            admobATNativeAd.notifyAdImpression();
        }
    }

    private AdmobATNativeAd(Context context, String str, String str2, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f23629p = "AdmobATNativeAd";
        this.f23621g = 0;
        this.f23622h = -1;
        this.f23630q = false;
        this.f23631r = false;
        this.f23633t = new HashMap();
        this.f23623j = false;
        this.f23624k = false;
        this.f23625l = false;
        this.f23626m = false;
        this.f23627n = false;
        this.f23615a = context.getApplicationContext();
        this.f23616b = loadCallbackListener;
        this.f23617c = str;
        this.f23618d = str2;
        this.f23630q = ATInitMediation.getIntFromMap(map, j.w.f13415q, 2) == 1;
    }

    public static /* synthetic */ boolean c(AdmobATNativeAd admobATNativeAd) {
        admobATNativeAd.f23631r = true;
        return true;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.i;
        if (nativeAdView != null) {
            a aVar = this.f23632s;
            if (aVar != null) {
                nativeAdView.removeCallbacks(aVar);
            }
            InterfaceC4078vb interfaceC4078vb = this.i.f24376u;
            if (interfaceC4078vb != null) {
                try {
                    interfaceC4078vb.o();
                } catch (RemoteException e9) {
                    i.d("Unable to destroy native ad view", e9);
                }
            }
            this.i = null;
        }
        this.f23619e = null;
        this.f23616b = null;
        this.f23615a = null;
        NativeAd nativeAd = this.f23620f;
        if (nativeAd != null) {
            nativeAd.a();
            this.f23620f = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        N0 h3;
        if (this.f23619e == null) {
            MediaView mediaView = new MediaView(this.f23615a);
            this.f23619e = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f23620f;
            if (nativeAd != null && (h3 = nativeAd.h()) != null) {
                this.f23619e.setMediaContent(h3);
                v a9 = h3.a();
                if (a9 != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.AdmobATNativeAd.3
                        @Override // m2.u
                        public final void onVideoEnd() {
                            AdmobATNativeAd.this.notifyAdVideoEnd();
                        }

                        @Override // m2.u
                        public final void onVideoMute(boolean z6) {
                        }

                        @Override // m2.u
                        public final void onVideoPause() {
                        }

                        @Override // m2.u
                        public final void onVideoPlay() {
                        }

                        @Override // m2.u
                        public final void onVideoStart() {
                            AdmobATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
            }
        }
        return this.f23619e;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdView = new NativeAdView(this.f23615a);
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
        i22.f26176a = true;
        w wVar = new w(i22);
        int i = this.f23621g;
        int i4 = this.f23622h;
        int i6 = i4 != -1 ? i4 : 1;
        d dVar2 = new d(context, this.f23617c);
        dVar2.b(this);
        dVar2.c(new c() { // from class: com.anythink.network.admob.AdmobATNativeAd.1
            @Override // m2.c
            public final void onAdClicked() {
                AdmobATNativeAd.this.notifyAdClicked();
            }

            @Override // m2.c
            public final void onAdFailedToLoad(n nVar) {
                LoadCallbackListener loadCallbackListener = AdmobATNativeAd.this.f23616b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(nVar.f39357a), nVar.f39358b);
                }
                AdmobATNativeAd.this.f23616b = null;
            }

            @Override // m2.c
            public final void onAdImpression() {
                try {
                    if (AdmobATNativeAd.this.f23620f != null) {
                        AdMobATInitManager.getInstance().a(AdmobATNativeAd.this.getShowId(), AdmobATNativeAd.this.f23620f);
                    }
                } catch (Throwable unused) {
                }
                if (AdmobATNativeAd.this.f23630q) {
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    if (admobATNativeAd.i != null) {
                        admobATNativeAd.f23632s = new a(admobATNativeAd);
                        AdmobATNativeAd admobATNativeAd2 = AdmobATNativeAd.this;
                        admobATNativeAd2.i.postDelayed(admobATNativeAd2.f23632s, 500L);
                        return;
                    }
                }
                AdmobATNativeAd.c(AdmobATNativeAd.this);
                AdmobATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g9 = dVar2.f39370b;
            Z0 z02 = new Z0(wVar);
            dVar = dVar2;
            try {
                g9.H3(new C3485kb(4, false, -1, false, i6, z02, false, i, 0, false, 1 - 1));
            } catch (RemoteException e9) {
                e = e9;
                i.g("Failed to specify native ad options", e);
                e a9 = dVar.a();
                f a10 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.NATIVE, !TextUtils.isEmpty(this.f23618d));
                if (!TextUtils.isEmpty(this.f23618d)) {
                }
                a10.getClass();
                a9.a(new F0((E0) a10.f67u));
            }
        } catch (RemoteException e10) {
            e = e10;
            dVar = dVar2;
        }
        e a92 = dVar.a();
        f a102 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.NATIVE, !TextUtils.isEmpty(this.f23618d));
        if (!TextUtils.isEmpty(this.f23618d)) {
            ((E0) a102.f67u).f40321m = this.f23618d;
        }
        a102.getClass();
        a92.a(new F0((E0) a102.f67u));
    }

    @Override // C2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        float f2;
        C3113de c3113de;
        Uri uri;
        this.f23620f = nativeAd;
        s j6 = nativeAd.j();
        if (j6 != null) {
            this.f23633t.put("response_info", j6);
            setNetworkInfoMap(this.f23633t);
        }
        if (this.f23630q) {
            this.f23620f.m(new p() { // from class: com.anythink.network.admob.AdmobATNativeAd.2
                @Override // m2.p
                public final void onPaidEvent(m2.i iVar) {
                    if (AdmobATNativeAd.this.f23631r) {
                        return;
                    }
                    AdmobATNativeAd.c(AdmobATNativeAd.this);
                    AdMobATInitManager.getInstance();
                    AdMobATInitManager.a((Map<String, Object>) AdmobATNativeAd.this.f23633t, iVar);
                    AdmobATNativeAd admobATNativeAd = AdmobATNativeAd.this;
                    admobATNativeAd.setNetworkInfoMap(admobATNativeAd.f23633t);
                    AdmobATNativeAd.this.notifyAdImpression();
                }
            });
        }
        setTitle(this.f23620f.e());
        setDescriptionText(this.f23620f.c());
        NativeAd nativeAd2 = this.f23620f;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f23620f.f().f30561c != null) {
            setIconImageUrl(this.f23620f.f().f30561c.toString());
        }
        ArrayList g9 = this.f23620f.g();
        if (g9 != null && g9.size() > 0 && (c3113de = (C3113de) g9.get(0)) != null && (uri = c3113de.f30561c) != null) {
            setMainImageUrl(uri.toString());
            Drawable drawable = c3113de.f30560b;
            if (drawable != null) {
                setMainImageWidth(drawable.getIntrinsicWidth());
                setMainImageHeight(drawable.getIntrinsicHeight());
            }
        }
        setCallToActionText(this.f23620f.d());
        setStarRating(Double.valueOf(this.f23620f.k() == null ? 5.0d : this.f23620f.k().doubleValue()));
        setAdFrom(this.f23620f.l());
        try {
            setAppPrice(Double.valueOf(this.f23620f.i()).doubleValue());
        } catch (Exception unused) {
        }
        setAdvertiserName(this.f23620f.b());
        N0 h3 = this.f23620f.h();
        if (h3 == null || !h3.b()) {
            this.mAdSourceType = "2";
        } else {
            try {
                f2 = h3.f40367a.g();
            } catch (RemoteException e9) {
                i.d("", e9);
                f2 = 0.0f;
            }
            setVideoDuration(f2);
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f23616b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f23616b = null;
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
            if (nativeAdView != null && (mediaView = this.f23619e) != null) {
                nativeAdView.setMediaView(mediaView);
            }
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            if (clickViewList != null && clickViewList.size() > 0) {
                for (View view2 : clickViewList) {
                    if (titleView == null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23620f.e(), ((TextView) view2).getText())) {
                            this.i.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.i.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23620f.c(), ((TextView) view2).getText())) {
                            this.i.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.i.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23620f.d(), ((TextView) view2).getText())) {
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
                if (nativeAdView2 == null || (nativeAd3 = this.f23620f) == null) {
                    return;
                }
                nativeAdView2.setNativeAd(nativeAd3);
                return;
            }
            this.f23623j = false;
            this.f23624k = false;
            this.f23625l = false;
            this.f23626m = false;
            this.f23627n = false;
            if (titleView != null) {
                this.f23623j = true;
                this.i.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.f23624k = true;
                this.i.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f23625l = true;
                this.i.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f23627n = true;
                this.i.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f23626m = true;
                this.i.setImageView(mainImageView);
            }
            if (this.f23623j && this.f23624k && this.f23625l && this.f23627n && this.f23626m) {
                NativeAdView nativeAdView3 = this.i;
                if (nativeAdView3 == null || (nativeAd2 = this.f23620f) == null) {
                    return;
                }
                nativeAdView3.setNativeAd(nativeAd2);
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.i);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f23627n) {
                    this.f23627n = true;
                    this.i.setIconView(view3);
                } else {
                    if (this.f23626m) {
                        break;
                    }
                    this.f23626m = true;
                    this.i.setImageView(view3);
                }
            }
            NativeAdView nativeAdView4 = this.i;
            if (nativeAdView4 == null || (nativeAd = this.f23620f) == null) {
                return;
            }
            nativeAdView4.setNativeAd(nativeAd);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z6) {
        this.f23628o = z6;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void setVideoMute(boolean z6) {
        super.setVideoMute(z6);
        NativeAd nativeAd = this.f23620f;
        if (nativeAd == null || nativeAd.h() == null || this.f23620f.h().a() == null) {
            return;
        }
        v a9 = this.f23620f.h().a();
        synchronized (a9.f39405a) {
            A0 a02 = a9.f39406b;
            if (a02 == null) {
                return;
            }
            try {
                a02.l0(z6);
            } catch (RemoteException e9) {
                i.d("Unable to call mute on video controller.", e9);
            }
        }
    }

    private NativeAdView a() {
        return new NativeAdView(this.f23615a);
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f23619e) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f23627n && this.f23626m) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f23620f;
            if (nativeAd == null || this.i == null) {
                return;
            }
            if (!this.f23623j && charSequence.equals(nativeAd.e())) {
                this.f23623j = true;
                this.i.setHeadlineView(view);
            }
            if (!this.f23624k && charSequence.equals(this.f23620f.c())) {
                this.f23624k = true;
                this.i.setBodyView(view);
            }
            if (this.f23625l || !charSequence.equals(this.f23620f.d())) {
                return;
            }
            this.f23625l = true;
            this.i.setCallToActionView(view);
        }
    }

    public AdmobATNativeAd(Context context, String str, String str2, String str3, LoadCallbackListener loadCallbackListener, Map<String, Object> map, Map<String, Object> map2) {
        this(context, str2, str3, loadCallbackListener, map);
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "1":
                    this.f23621g = 1;
                    break;
                case "2":
                    this.f23621g = 2;
                    break;
                case "3":
                    this.f23621g = 3;
                    break;
                case "4":
                    this.f23621g = 4;
                    break;
                default:
                    this.f23621g = 0;
                    break;
            }
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(ATAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    int parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_CHOICES_PLACEMENT).toString());
                    if (parseInt == 0) {
                        this.f23622h = 0;
                    } else if (parseInt == 1) {
                        this.f23622h = 1;
                    } else if (parseInt == 2) {
                        this.f23622h = 2;
                    } else if (parseInt == 3) {
                        this.f23622h = 3;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (ATInitMediation.getIntFromMap(map, j.w.f13394E, 1) == 2) {
            this.f23622h = 0;
        }
    }
}
