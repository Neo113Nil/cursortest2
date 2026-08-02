package com.anythink.interstitial.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.w;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialAutoLoadListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d implements com.anythink.core.common.p.b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile d f23481c;

    /* renamed from: a, reason: collision with root package name */
    String f23482a = "InterstitialAuto";

    /* renamed from: b, reason: collision with root package name */
    ATInterstitialAutoLoadListener f23483b = new ATInterstitialAutoLoadListener() { // from class: com.anythink.interstitial.a.d.1
        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoadFail(final String str, final AdError adError) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.a.d.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f23484d != null) {
                        d.this.f23484d.onInterstitialAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialAutoLoadListener
        public final void onInterstitialAutoLoaded(final String str) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.a.d.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f23484d != null) {
                        d.this.f23484d.onInterstitialAutoLoaded(str);
                    }
                }
            });
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private ATInterstitialAutoLoadListener f23484d;

    /* renamed from: e, reason: collision with root package name */
    private ATNativeAdCustomRender f23485e;

    public static List<ATAdInfo> d(String str) {
        com.anythink.core.common.f f2 = f(str);
        if (f2 != null) {
            return f2.a(t.b().M());
        }
        return null;
    }

    private ATAdStatusInfo e(String str) {
        if (t.b().g() == null || TextUtils.isEmpty(t.b().p()) || TextUtils.isEmpty(t.b().q())) {
            Log.e(this.f23482a, "SDK init error!");
            return null;
        }
        com.anythink.core.common.f f2 = f(str);
        if (f2 != null) {
            return f2.a(t.b().M(), (Map<String, Object>) null);
        }
        return null;
    }

    private static com.anythink.core.common.f f(String str) {
        return com.anythink.core.common.f.a(t.b().g(), str, "3");
    }

    public final boolean b(String str) {
        boolean z6 = false;
        if (!TextUtils.isEmpty(str)) {
            ATAdStatusInfo e9 = e(str);
            if (e9 == null) {
                return false;
            }
            z6 = e9.isReady();
        }
        ab.b(str, j.r.f13335v, j.r.f13310B, String.valueOf(z6), "");
        return z6;
    }

    public final ATAdStatusInfo c(String str) {
        ATAdStatusInfo aTAdStatusInfo;
        if (TextUtils.isEmpty(str)) {
            aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
        } else {
            aTAdStatusInfo = e(str);
            if (aTAdStatusInfo == null) {
                aTAdStatusInfo = new ATAdStatusInfo(false, false, null);
            }
        }
        ab.b(str, j.r.f13335v, j.r.f13311C, aTAdStatusInfo.toString(), "");
        return aTAdStatusInfo;
    }

    public static d a() {
        if (f23481c == null) {
            synchronized (d.class) {
                try {
                    if (f23481c == null) {
                        f23481c = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23481c;
    }

    private ATInterstitialAutoLoadListener b() {
        return this.f23483b;
    }

    public final void a(Context context, String[] strArr, ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener, ATAdRequest aTAdRequest) {
        if (context == null) {
            Log.e("anythink", this.f23482a + " init failed: context = null");
            return;
        }
        if (context instanceof Activity) {
            t.b().a((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    if (ATAdxSetting.getInstance().isAdxNetworkMode(str)) {
                        Log.w("anythink", "Forbidden placement, this placement is in adx network mode");
                    } else if (w.a().a(str)) {
                        Log.w("anythink", "Forbidden placement");
                    } else if (!u.a().e(str)) {
                        u.a().a(str, true);
                        com.anythink.core.common.p.d a9 = f(str).a();
                        if (a9 != null) {
                            a9.a(this);
                            a9.a(context, aTAdRequest, 3);
                        }
                    }
                }
            }
        }
        this.f23484d = aTInterstitialAutoLoadListener;
    }

    public final void a(ATAdRequest aTAdRequest, String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (ATAdxSetting.getInstance().isAdxNetworkMode(str)) {
                    Log.w("anythink", "Forbidden placement, this placement is in adx network mode");
                } else if (w.a().a(str)) {
                    Log.w("anythink", "Forbidden placement");
                } else if (!u.a().e(str)) {
                    u.a().a(str, true);
                    com.anythink.core.common.p.d a9 = f(str).a();
                    if (a9 != null) {
                        a9.a(this);
                        a9.a(t.b().M(), aTAdRequest, 3);
                    }
                }
            }
        }
    }

    public static void a(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                u.a().a(str, false);
                com.anythink.core.common.p.d a9 = f(str).a();
                if (a9 != null) {
                    a9.a((com.anythink.core.common.p.b) null);
                    a9.d();
                }
            }
        }
    }

    public static void a(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        u.a().a(str, map);
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t.b().a(str, str2, "3", map);
    }

    @Override // com.anythink.core.common.p.b
    public final void a(String str) {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = a().f23483b;
        if (aTInterstitialAutoLoadListener != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoaded(str);
        }
    }

    @Override // com.anythink.core.common.p.b
    public final void a(String str, AdError adError) {
        ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener = a().f23483b;
        if (aTInterstitialAutoLoadListener != null) {
            aTInterstitialAutoLoadListener.onInterstitialAutoLoadFail(str, adError);
        }
    }

    public final void a(ATNativeAdCustomRender aTNativeAdCustomRender) {
        this.f23485e = aTNativeAdCustomRender;
    }

    public final void a(Activity activity, String str, ATShowConfig aTShowConfig, ATInterstitialAutoEventListener aTInterstitialAutoEventListener, ATAdRevenueListener aTAdRevenueListener) {
        ab.b(str, j.r.f13335v, j.r.f13309A, j.r.f13328o, "");
        if (TextUtils.isEmpty(str)) {
            Log.e(this.f23482a, "PlacementId is Empty!");
            return;
        }
        if (t.b().g() != null && !TextUtils.isEmpty(t.b().p()) && !TextUtils.isEmpty(t.b().q())) {
            if (activity == null) {
                Log.e(this.f23482a, "Interstitial Show Activity is null.");
            }
            b.a(activity, str).a(activity, aTShowConfig, new e(aTInterstitialAutoEventListener, aTAdRevenueListener), null, null, this.f23485e);
            return;
        }
        Log.e(this.f23482a, "Show error: SDK init error!");
    }

    public final void a(ATInterstitialAutoLoadListener aTInterstitialAutoLoadListener) {
        this.f23484d = aTInterstitialAutoLoadListener;
    }
}
