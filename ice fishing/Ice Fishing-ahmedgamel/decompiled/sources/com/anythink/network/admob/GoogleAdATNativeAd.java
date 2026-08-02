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
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C3113de;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.I2;
import com.google.android.gms.internal.ads.InterfaceC4078vb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m2.c;
import m2.d;
import m2.e;
import m2.n;
import m2.s;
import m2.u;
import m2.v;
import m2.w;
import n2.C4766a;
import s2.E0;
import s2.F0;
import s2.G;
import s2.N0;
import s2.Z0;
import x2.i;

/* loaded from: classes.dex */
public class GoogleAdATNativeAd extends CustomNativeAd implements b {

    /* renamed from: a, reason: collision with root package name */
    Context f23723a;

    /* renamed from: b, reason: collision with root package name */
    LoadCallbackListener f23724b;

    /* renamed from: c, reason: collision with root package name */
    String f23725c;

    /* renamed from: d, reason: collision with root package name */
    MediaView f23726d;

    /* renamed from: e, reason: collision with root package name */
    NativeAd f23727e;

    /* renamed from: f, reason: collision with root package name */
    int f23728f;

    /* renamed from: g, reason: collision with root package name */
    NativeAdView f23729g;

    /* renamed from: h, reason: collision with root package name */
    boolean f23730h;
    boolean i;

    /* renamed from: j, reason: collision with root package name */
    boolean f23731j;

    /* renamed from: k, reason: collision with root package name */
    boolean f23732k;

    /* renamed from: l, reason: collision with root package name */
    boolean f23733l;

    /* renamed from: m, reason: collision with root package name */
    boolean f23734m;

    /* renamed from: n, reason: collision with root package name */
    private Map<String, Object> f23735n;

    public interface LoadCallbackListener {
        void onFail(String str, String str2);

        void onSuccess(CustomNativeAd customNativeAd);
    }

    public GoogleAdATNativeAd(Context context, String str, LoadCallbackListener loadCallbackListener, Map<String, Object> map) {
        this.f23728f = 0;
        this.f23735n = new HashMap();
        this.f23730h = false;
        this.i = false;
        this.f23731j = false;
        this.f23732k = false;
        this.f23733l = false;
        this.f23723a = context.getApplicationContext();
        this.f23724b = loadCallbackListener;
        this.f23725c = str;
    }

    private NativeAdView a() {
        NativeAdView nativeAdView = new NativeAdView(this.f23723a);
        nativeAdView.setNativeAd(this.f23727e);
        return nativeAdView;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        NativeAdView nativeAdView = this.f23729g;
        if (nativeAdView != null) {
            InterfaceC4078vb interfaceC4078vb = nativeAdView.f24376u;
            if (interfaceC4078vb != null) {
                try {
                    interfaceC4078vb.o();
                } catch (RemoteException e9) {
                    i.d("Unable to destroy native ad view", e9);
                }
            }
            this.f23729g = null;
        }
        this.f23726d = null;
        this.f23724b = null;
        this.f23723a = null;
        NativeAd nativeAd = this.f23727e;
        if (nativeAd != null) {
            nativeAd.a();
            this.f23727e = null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        v a9;
        if (this.f23729g == null) {
            this.f23729g = a();
        }
        if (this.f23726d == null) {
            MediaView mediaView = new MediaView(this.f23723a);
            this.f23726d = mediaView;
            mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            NativeAd nativeAd = this.f23727e;
            if (nativeAd != null) {
                N0 h3 = nativeAd.h();
                this.f23726d.setMediaContent(h3);
                if (h3 != null && (a9 = h3.a()) != null) {
                    a9.a(new u() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.2
                        @Override // m2.u
                        public final void onVideoEnd() {
                            GoogleAdATNativeAd.this.notifyAdVideoEnd();
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
                            GoogleAdATNativeAd.this.notifyAdVideoStart();
                        }
                    });
                }
                this.f23729g.setMediaView(this.f23726d);
                this.f23729g.setNativeAd(this.f23727e);
            }
        }
        return this.f23726d;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView a9 = a();
        this.f23729g = a9;
        return a9;
    }

    public void loadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        d dVar;
        I2 i22 = new I2();
        i22.f26176a = true;
        w wVar = new w(i22);
        int i = this.f23728f;
        d dVar2 = new d(context, this.f23725c);
        dVar2.b(this);
        dVar2.c(new c() { // from class: com.anythink.network.admob.GoogleAdATNativeAd.1
            @Override // m2.c
            public final void onAdClicked() {
                GoogleAdATNativeAd.this.notifyAdClicked();
            }

            @Override // m2.c
            public final void onAdFailedToLoad(n nVar) {
                LoadCallbackListener loadCallbackListener = GoogleAdATNativeAd.this.f23724b;
                if (loadCallbackListener != null) {
                    loadCallbackListener.onFail(String.valueOf(nVar.f39357a), nVar.f39358b);
                }
                GoogleAdATNativeAd.this.f23724b = null;
            }

            @Override // m2.c
            public final void onAdImpression() {
                try {
                    if (GoogleAdATNativeAd.this.f23727e != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATNativeAd.this.getShowId(), GoogleAdATNativeAd.this.f23727e);
                    }
                } catch (Throwable unused) {
                }
                GoogleAdATNativeAd.this.notifyAdImpression();
            }
        });
        try {
            G g9 = dVar2.f39370b;
            try {
                Z0 z02 = new Z0(wVar);
                dVar = dVar2;
                try {
                    g9.H3(new C3485kb(4, false, -1, false, 1, z02, false, i, 0, false, 1 - 1));
                } catch (RemoteException e9) {
                    e = e9;
                    i.g("Failed to specify native ad options", e);
                    e a9 = dVar.a();
                    C4766a a10 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.NATIVE);
                    a10.getClass();
                    a9.a(new F0((E0) a10.f67u));
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
        C4766a a102 = AdMobATInitManager.getInstance().a(context, map, map2, m2.b.NATIVE);
        a102.getClass();
        a92.a(new F0((E0) a102.f67u));
    }

    @Override // C2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        this.f23727e = nativeAd;
        s j6 = nativeAd.j();
        if (j6 != null) {
            this.f23735n.put("response_info", j6);
            setNetworkInfoMap(this.f23735n);
        }
        setTitle(this.f23727e.e());
        setDescriptionText(this.f23727e.c());
        NativeAd nativeAd2 = this.f23727e;
        if (nativeAd2 != null && nativeAd2.f() != null && this.f23727e.f().f30561c != null) {
            setIconImageUrl(this.f23727e.f().f30561c.toString());
        }
        NativeAd nativeAd3 = this.f23727e;
        if (nativeAd3 != null && nativeAd3.g() != null && this.f23727e.g().size() > 0 && ((C3113de) this.f23727e.g().get(0)).f30561c != null) {
            C3113de c3113de = (C3113de) this.f23727e.g().get(0);
            Drawable drawable = c3113de.f30560b;
            Uri uri = c3113de.f30561c;
            if (drawable != null) {
                setMainImageUrl(uri.toString());
                Drawable drawable2 = c3113de.f30560b;
                setMainImageWidth(drawable2.getIntrinsicWidth());
                setMainImageHeight(drawable2.getIntrinsicHeight());
            } else {
                setMainImageUrl(uri.toString());
            }
        }
        setCallToActionText(this.f23727e.d());
        setStarRating(Double.valueOf(this.f23727e.k() == null ? 5.0d : this.f23727e.k().doubleValue()));
        setAdFrom(this.f23727e.l());
        N0 h3 = this.f23727e.h();
        if (h3 == null || !h3.b()) {
            this.mAdSourceType = "2";
        } else {
            this.mAdSourceType = "1";
        }
        LoadCallbackListener loadCallbackListener = this.f23724b;
        if (loadCallbackListener != null) {
            loadCallbackListener.onSuccess(this);
        }
        this.f23724b = null;
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
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23727e.e(), ((TextView) view2).getText())) {
                            this.f23729g.setHeadlineView(view2);
                        }
                        if (descView != null) {
                        }
                    } else if (view2 == titleView) {
                        this.f23729g.setHeadlineView(view2);
                    } else if (descView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23727e.c(), ((TextView) view2).getText())) {
                            this.f23729g.setBodyView(view2);
                        }
                        if (ctaView != null) {
                        }
                    } else if (view2 == descView) {
                        this.f23729g.setBodyView(view2);
                    } else if (ctaView != null) {
                        if ((view2 instanceof TextView) && TextUtils.equals(this.f23727e.d(), ((TextView) view2).getText())) {
                            this.f23729g.setCallToActionView(view2);
                        }
                        if (iconView == null) {
                        }
                        if (mainImageView != null) {
                            this.f23729g.setImageView(view2);
                        }
                    } else if (view2 == ctaView) {
                        this.f23729g.setCallToActionView(view2);
                    } else if (iconView == null && view2 == iconView) {
                        this.f23729g.setIconView(view2);
                    } else if (mainImageView != null && view2 == mainImageView && (view2 instanceof ImageView)) {
                        this.f23729g.setImageView(view2);
                    }
                }
                return;
            }
            this.f23730h = false;
            this.i = false;
            this.f23731j = false;
            this.f23732k = false;
            this.f23733l = false;
            if (titleView != null) {
                this.f23730h = true;
                this.f23729g.setHeadlineView(titleView);
            }
            if (descView != null) {
                this.i = true;
                this.f23729g.setBodyView(descView);
            }
            if (ctaView != null) {
                this.f23731j = true;
                this.f23729g.setCallToActionView(ctaView);
            }
            if (iconView != null) {
                this.f23733l = true;
                this.f23729g.setIconView(iconView);
            }
            if (mainImageView != null && (mainImageView instanceof ImageView)) {
                this.f23732k = true;
                this.f23729g.setImageView(mainImageView);
            }
            if (this.f23730h && this.i && this.f23731j && this.f23733l && this.f23732k) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.f23729g);
            for (int i = 0; i < arrayList.size(); i++) {
                View view3 = (View) arrayList.get(i);
                if (!this.f23733l) {
                    this.f23733l = true;
                    this.f23729g.setIconView(view3);
                } else {
                    if (this.f23732k) {
                        return;
                    }
                    this.f23732k = true;
                    this.f23729g.setImageView(view3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setIsAutoPlay(boolean z6) {
        this.f23734m = z6;
    }

    private void a(List<View> list, View view) {
        if ((view instanceof ViewGroup) && view != this.f23726d) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(list, viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof ImageView) {
            if (this.f23733l && this.f23732k) {
                return;
            }
            list.add(view);
            return;
        }
        if ((view instanceof Button) || (view instanceof TextView)) {
            String charSequence = ((TextView) view).getText().toString();
            NativeAd nativeAd = this.f23727e;
            if (nativeAd == null || this.f23729g == null) {
                return;
            }
            if (!this.f23730h && charSequence.equals(nativeAd.e())) {
                this.f23730h = true;
                this.f23729g.setHeadlineView(view);
            }
            if (!this.i && charSequence.equals(this.f23727e.c())) {
                this.i = true;
                this.f23729g.setBodyView(view);
            }
            if (this.f23731j || !charSequence.equals(this.f23727e.d())) {
                return;
            }
            this.f23731j = true;
            this.f23729g.setCallToActionView(view);
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
                this.f23728f = 1;
                break;
            case "2":
                this.f23728f = 2;
                break;
            case "3":
                this.f23728f = 3;
                break;
            case "4":
                this.f23728f = 4;
                break;
            default:
                this.f23728f = 0;
                break;
        }
    }
}
