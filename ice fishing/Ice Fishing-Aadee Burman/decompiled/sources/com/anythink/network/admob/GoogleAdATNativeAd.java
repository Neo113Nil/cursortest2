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
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C3090de;
import com.google.android.gms.internal.ads.C3462kb;
import com.google.android.gms.internal.ads.I2;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.c;
import k2.d;
import k2.e;
import k2.n;
import k2.s;
import k2.u;
import k2.v;
import k2.w;
import l2.C4657a;
import q2.E0;
import q2.F0;
import q2.G;
import q2.N0;
import q2.Z0;
import v2.i;

/* loaded from: classes.dex */
public class GoogleAdATNativeAd extends CustomNativeAd implements b {

    /* renamed from: a, reason: collision with root package name */
    Context f22936a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f22937b;

    /* renamed from: c, reason: collision with root package name */
    String f22938c;

    /* renamed from: d, reason: collision with root package name */
    MediaView f22939d;

    /* renamed from: e, reason: collision with root package name */
    NativeAd f22940e;

    /* renamed from: f, reason: collision with root package name */
    int f22941f;

    /* renamed from: g, reason: collision with root package name */
    NativeAdView f22942g;

    /* renamed from: h, reason: collision with root package name */
    boolean f22943h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f22944j;

    /* renamed from: k, reason: collision with root package name */
    boolean f22945k;

    /* renamed from: l, reason: collision with root package name */
    boolean f22946l;

    /* renamed from: m, reason: collision with root package name */
    boolean f22947m;

    /* renamed from: n, reason: collision with root package name */
    private Map<String, Object> f22948n;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public GoogleAdATNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f22941f = 0;
        this.f22948n = new HashMap();
        this.f22943h = false;
        this.i = false;
        this.f22944j = false;
        this.f22945k = false;
        this.f22946l = false;
        this.f22936a = context.getApplicationContext();
        this.f22937b = loadCallbackListener;
        this.f22938c = str;
    }

    private NativeAdView a() {
        NativeAdView nativeAdView = new NativeAdView(this.f22936a);
        nativeAdView.setNativeAd(this.f22940e);
        return nativeAdView;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.f22942g;
        if (nativeAdView != null) {
            InterfaceC4055vb interfaceC4055vb = nativeAdView.f23596u;
            if (interfaceC4055vb != null) {
                try {
                    interfaceC4055vb.o();
                } catch (RemoteException e9) {
                    i.d("Unable to destroy native ad view", e9);
                }
            }
            this.f22942g = null;
        }
        this.f22939d = null;
        this.f22937b = null;
        this.f22936a = null;
        NativeAd nativeAd = this.f22940e;
        if (nativeAd != null) {
            nativeAd.a();
            this.f22940e = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        v a9;
        if (this.f22942g == null) {
            this.f22942g = a();
        }
        if (this.f22939d == null) {
            MediaView mediaView = new MediaView(this.f22936a);
            this.f22939d = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f22940e;
            if (nativeAd != null) {
                N0 h9 = nativeAd.h();
                this.f22939d.setMediaContent(h9);
                if (h9 != null && (a9 = h9.a()) != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.2
                        @Override // k2.u
                        public final void onVideoEnd() {
                            GoogleAdATNativeAd.this.notifyAdVideoEnd();
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
                            GoogleAdATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.f22942g.setMediaView(this.f22939d);
                this.f22942g.setNativeAd(this.f22940e);
            }
        }
        return this.f22939d;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView a9 = a();
        this.f22942g = a9;
        return a9;
    }

    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        d dVar;
        I2 i22 = new I2();
        i22.f25433a = true;
        w wVar = new w(i22);
        int i = this.f22941f;
        d dVar2 = new d(context, this.f22938c);
        dVar2.b(this);
        dVar2.c(new c() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.1
            @Override // k2.c
            public final void onAdClicked() {
                GoogleAdATNativeAd.this.notifyAdClicked();
            }

            @Override // k2.c
            public final void onAdFailedToLoad(n nVar) {
                LoadCallbackListener loadCallbackListener = GoogleAdATNativeAd.this.f22937b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(nVar.f38568a), nVar.f38569b);
                }
                GoogleAdATNativeAd.this.f22937b = null;
            }

            @Override // k2.c
            public final void onAdImpression() {
                try {
                    if (GoogleAdATNativeAd.this.f22940e != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATNativeAd.this.getShowId(), GoogleAdATNativeAd.this.f22940e);
                    }
                } catch (Throwable unused) {
                }
                GoogleAdATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g4 = dVar2.f38581b;
            try {
                Z0 z02 = new Z0(wVar);
                dVar = dVar2;
                try {
                    g4.J3(new C3462kb(4, false, -1, false, 1, z02, false, i, 0, false, 1 - 1));
                } catch (RemoteException e9) {
                    e = e9;
                    i.g("Failed to specify native ad options", e);
                    e a9 = dVar.a();
                    C4657a a10 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.NATIVE);
                    a10.getClass();
                    a9.a(new F0((E0) a10.f1720u));
                }
            } catch (RemoteException e10) {
                e = e10;
                dVar = dVar2;
            }
        } catch (RemoteException e11) {
            e = e11;
            dVar = dVar2;
        }
        e a92 = dVar.a();
        C4657a a102 = AdMobATInitManager.getInstance().a(context, map, map2, k2.b.NATIVE);
        a102.getClass();
        a92.a(new F0((E0) a102.f1720u));
    }

    @Override // A2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        this.f22940e = nativeAd;
        s j6 = nativeAd.j();
        if (j6 != null) {
            this.f22948n.put("response_info", j6);
            setNetworkInfoMap(this.f22948n);
        }
        setTitle(this.f22940e.e());
        setDescriptionText(this.f22940e.c());
        NativeAd nativeAd2 = this.f22940e;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f22940e.f().f29788c != null) {
            setIconImageUrl(this.f22940e.f().f29788c.toString());
        }
        NativeAd nativeAd3 = this.f22940e;
        if (nativeAd3 != null && nativeAd3.g() != null && this.f22940e.g().size() > 0 && ((C3090de) this.f22940e.g().get(0)).f29788c != null) {
            C3090de c3090de = (C3090de) this.f22940e.g().get(0);
            Drawable drawable = c3090de.f29787b;
            Uri uri = c3090de.f29788c;
            if (drawable != null) {
                setMainImageUrl(uri.toString());
                Drawable drawable2 = c3090de.f29787b;
                setMainImageWidth(drawable2.getIntrinsicWidth());
                setMainImageHeight(drawable2.getIntrinsicHeight());
            } else {
                setMainImageUrl(uri.toString());
            }
        }
        setCallToActionText(this.f22940e.d());
        setStarRating(Double.valueOf(this.f22940e.k() == null ? 5.0d : this.f22940e.k().doubleValue()));
        setAdFrom(this.f22940e.l());
        N0 h9 = this.f22940e.h();
        if (h9 == null || !h9.b()) {
            this.mAdSourceType = "2";
        } else {
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f22937b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f22937b = null;
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
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22940e.e(), ((TextView) view2).getText())) {
                            this.f22942g.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.f22942g.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22940e.c(), ((TextView) view2).getText())) {
                            this.f22942g.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.f22942g.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f22940e.d(), ((TextView) view2).getText())) {
                            this.f22942g.setCallToActionView(view2);
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView != null) {
                            this.f22942g.setImageView(view2);
                        }
                    } else if (view2 == ctaView) {
                        this.f22942g.setCallToActionView(view2);
                    } else if (iconView == null && view2 == iconView) {
                        this.f22942g.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.f22942g.setImageView(view2);
                    }
                }
                return;
            }
            this.f22943h = false;
            this.i = false;
            this.f22944j = false;
            this.f22945k = false;
            this.f22946l = false;
            if (titleView != null) {
                this.f22943h = true;
                this.f22942g.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.i = true;
                this.f22942g.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f22944j = true;
                this.f22942g.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f22946l = true;
                this.f22942g.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f22945k = true;
                this.f22942g.setImageView(mainImageView);
            }
            if (this.f22943h && this.i && this.f22944j && this.f22946l && this.f22945k) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.f22942g);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f22946l) {
                    this.f22946l = true;
                    this.f22942g.setIconView(view3);
                } else {
                    if (this.f22945k) {
                        return;
                    }
                    this.f22945k = true;
                    this.f22942g.setImageView(view3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z3) {
        this.f22947m = z3;
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f22939d) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f22946l && this.f22945k) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f22940e;
            if (nativeAd == null || this.f22942g == null) {
                return;
            }
            if (!this.f22943h && charSequence.equals(nativeAd.e())) {
                this.f22943h = true;
                this.f22942g.setHeadlineView(view);
            }
            if (!this.i && charSequence.equals(this.f22940e.c())) {
                this.i = true;
                this.f22942g.setBodyView(view);
            }
            if (this.f22944j || !charSequence.equals(this.f22940e.d())) {
                return;
            }
            this.f22944j = true;
            this.f22942g.setCallToActionView(view);
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
                this.f22941f = 1;
                break;
            case "2":
                this.f22941f = 2;
                break;
            case "3":
                this.f22941f = 3;
                break;
            case "4":
                this.f22941f = 4;
                break;
            default:
                this.f22941f = 0;
                break;
        }
    }
}
