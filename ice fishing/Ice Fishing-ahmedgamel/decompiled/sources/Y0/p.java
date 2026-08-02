package Y0;

import S0.s;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.banner.api.ATBannerView;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.LP;
import h.AbstractActivityC4555k;
import i1.C4586c;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import s2.E0;
import s2.F0;
import y2.AbstractC5205a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: A, reason: collision with root package name */
    public static o f3855A = null;

    /* renamed from: B, reason: collision with root package name */
    public static ATBannerView f3856B = null;

    /* renamed from: C, reason: collision with root package name */
    public static ATNative f3857C = null;

    /* renamed from: D, reason: collision with root package name */
    public static ATNativeAdView f3858D = null;

    /* renamed from: E, reason: collision with root package name */
    public static int f3859E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static int f3860F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static int f3861G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static String f3862H = "";

    /* renamed from: I, reason: collision with root package name */
    public static String f3863I = "";
    public static String J = "";

    /* renamed from: K, reason: collision with root package name */
    public static String f3864K = "";

    /* renamed from: L, reason: collision with root package name */
    public static String f3865L = "";

    /* renamed from: M, reason: collision with root package name */
    public static AdView f3866M = null;

    /* renamed from: N, reason: collision with root package name */
    public static InterstitialAd f3867N = null;

    /* renamed from: O, reason: collision with root package name */
    public static ATNativePrepareInfo f3868O = null;

    /* renamed from: P, reason: collision with root package name */
    public static final String[] f3869P = {"Play & Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: Q, reason: collision with root package name */
    public static final String[] f3870Q = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f3871R = {C5248R.drawable.ads_round1, C5248R.drawable.ads_round2, C5248R.drawable.ads_round3, C5248R.drawable.ads_round4, C5248R.drawable.ads_round5};

    /* renamed from: S, reason: collision with root package name */
    public static final String[] f3872S = {"Play Cricket Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f3873T = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f3874U = {C5248R.drawable.ads_qureka, C5248R.drawable.ads_qureka1, C5248R.drawable.ads_qureka2, C5248R.drawable.ads_qureka3, C5248R.drawable.ads_qureka4};

    /* renamed from: d, reason: collision with root package name */
    public static SharedPreferences f3875d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Context f3876e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f3877f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f3878g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f3879h = 0;
    public static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f3880j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static String f3881k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f3882l = "";

    /* renamed from: m, reason: collision with root package name */
    public static String f3883m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f3884n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f3885o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f3886p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static String f3887q = "";

    /* renamed from: r, reason: collision with root package name */
    public static String f3888r = "";

    /* renamed from: s, reason: collision with root package name */
    public static String f3889s = "";

    /* renamed from: t, reason: collision with root package name */
    public static String f3890t = "";

    /* renamed from: u, reason: collision with root package name */
    public static String f3891u = "";

    /* renamed from: v, reason: collision with root package name */
    public static p f3892v = null;

    /* renamed from: w, reason: collision with root package name */
    public static String f3893w = "";

    /* renamed from: x, reason: collision with root package name */
    public static String f3894x = "";

    /* renamed from: y, reason: collision with root package name */
    public static String f3895y = "";

    /* renamed from: z, reason: collision with root package name */
    public static a f3896z;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences.Editor f3897a;

    /* renamed from: b, reason: collision with root package name */
    public ATInterstitial f3898b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5205a f3899c;

    public static void a(Context context, String str, String str2, String str3, String str4, ViewGroup viewGroup) {
        if (f3860F == 1) {
            if (f3861G == 1) {
                NativeBannerAd nativeBannerAd = new NativeBannerAd(context, str4);
                nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new j(context, viewGroup, nativeBannerAd)).build());
                return;
            }
            AdView adView = new AdView(context, str3, AdSize.BANNER_HEIGHT_50);
            f3866M = adView;
            viewGroup.addView(adView);
            AdView adView2 = f3866M;
            adView2.loadAd(adView2.buildLoadAdConfig().withAdListener(new k(context, viewGroup)).build());
            return;
        }
        if (f3859E == 1) {
            ATBannerView aTBannerView = new ATBannerView(context);
            f3856B = aTBannerView;
            aTBannerView.setPlacementId(str);
            viewGroup.addView(f3856B);
            f3856B.setBannerAdListener(new S0.l(6, context, viewGroup));
            f3856B.loadAd();
            return;
        }
        if (f3880j == 1) {
            m2.j jVar = new m2.j(f3876e);
            jVar.setAdSize(m2.h.i);
            jVar.setAdUnitId(str2);
            jVar.b(new m2.g(new m2.f(3)));
            jVar.setAdListener(new m(viewGroup, jVar, context));
        }
    }

    public static void c(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        if (f3860F == 1) {
            NativeAd nativeAd = new NativeAd(context, str3);
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new n(context, viewGroup, nativeAd)).build());
            return;
        }
        if (f3859E == 1) {
            f3858D = new ATNativeAdView(context);
            ATNative aTNative = new ATNative(context, str, new s(6, viewGroup, context));
            f3857C = aTNative;
            aTNative.makeAdRequest();
            return;
        }
        if (f3880j == 1) {
            m2.d dVar = new m2.d(context, str2);
            dVar.b(new S0.e(6, context, viewGroup));
            dVar.c(new b(0, context, viewGroup));
            try {
                dVar.f39370b.H3(new C3485kb(4, false, -1, false, 1, null, false, 0, 0, false, 1 - 1));
            } catch (RemoteException e9) {
                x2.i.g("Failed to specify native ad options", e9);
            }
            m2.e a9 = dVar.a();
            E0 e02 = new E0();
            e02.f40313d.add("B3EEABB8EE11C2BE770B684D95219ECB");
            a9.a(new F0(e02));
        }
    }

    public static void d(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.9f, 1.0f));
        ofPropertyValuesHolder.setDuration(500L);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
    }

    public static p e(Context context) {
        f3876e = context;
        if (f3892v == null) {
            p pVar = new p();
            f3876e = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("MyPref", 0);
            f3875d = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            pVar.f3897a = edit;
            String string = f3875d.getString("response", "");
            if (!string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f3877f = jSONObject.getInt("splash_inter");
                    i = jSONObject.getInt("link_redirect");
                    f3878g = jSONObject.getInt("splash_redirect");
                    f3893w = jSONObject.getString("link1");
                    f3894x = jSONObject.getString("link2");
                    f3895y = jSONObject.getString("link3");
                    jSONObject.getString("livetv");
                    f3887q = jSONObject.getString("topon_appid");
                    f3888r = jSONObject.getString("topon_appkey");
                    f3889s = jSONObject.getString("topon_banner");
                    f3890t = jSONObject.getString("topon_inter1");
                    jSONObject.getString("topon_inter2");
                    f3891u = jSONObject.getString("topon_native");
                    f3859E = jSONObject.getInt("topon_showStatus");
                    f3880j = jSONObject.getInt("admob_showAdStatus");
                    jSONObject.getString("AppID");
                    f3881k = jSONObject.getString("Admob_Banner");
                    f3882l = jSONObject.getString("Admob_Interstitial");
                    f3883m = jSONObject.getString("Admob_Native");
                    f3879h = jSONObject.getInt("adposition");
                    f3862H = jSONObject.getString("FB_banner");
                    f3865L = jSONObject.getString("FB_nativebanner");
                    f3863I = jSONObject.getString("FB_inter1");
                    J = jSONObject.getString("FB_inter2");
                    f3864K = jSONObject.getString("FB_native");
                    f3860F = jSONObject.getInt("FB_showAdStatus");
                    f3861G = jSONObject.getInt("FB_bannernative");
                    edit.putInt("adposition", f3879h);
                    edit.putString("interstitial_id", f3890t);
                    edit.commit();
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
            f3892v = pVar;
        }
        return f3892v;
    }

    public static void f() {
        o oVar = f3855A;
        if (oVar != null) {
            oVar.OnCall();
            f3855A = null;
        }
    }

    public static void g(Context context) {
        try {
            com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n();
            ((C4586c) nVar.f24250v).f38154u = Integer.valueOf(E.b.a(context, C5248R.color.colorPrimary) | (-16777216));
            ((Intent) nVar.f24249u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            int nextInt = new Random().nextInt(3);
            if (nextInt == 1) {
                h(context, nVar.b(), Uri.parse(f3893w));
            } else if (nextInt == 2) {
                h(context, nVar.b(), Uri.parse(f3894x));
            } else {
                h(context, nVar.b(), Uri.parse(f3895y));
            }
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public static void h(Context context, LP lp, Uri uri) {
        try {
            ((Intent) lp.f26916u).setPackage("com.android.chrome");
            lp.i(context, uri);
        } catch (Exception e9) {
            e9.printStackTrace();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void i(Context context, String str, String str2, String str3, String str4, ViewGroup viewGroup) {
        int i4 = f3885o + 1;
        f3885o = i4;
        int i6 = f3879h;
        if (i6 == 1) {
            if (i4 >= 2) {
                f3885o = 0;
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f3878g == 1) {
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            return;
        }
        if (i6 != 2) {
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        if (i4 >= 3) {
            f3885o = 0;
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f3878g == 1) {
            a(context, str, str2, str3, str4, viewGroup);
        }
    }

    public static void k(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        int i4 = f3886p + 1;
        f3886p = i4;
        int i6 = f3879h;
        if (i6 == 1) {
            if (i4 >= 3) {
                f3886p = 0;
                c(context, str, str2, str3, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f3878g == 1) {
                c(context, str, str2, str3, viewGroup);
                return;
            }
            return;
        }
        if (i6 != 2) {
            c(context, str, str2, str3, viewGroup);
            return;
        }
        if (i4 >= 2) {
            f3886p = 0;
            c(context, str, str2, str3, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f3878g == 1) {
            c(context, str, str2, str3, viewGroup);
        }
    }

    public final void b(AbstractActivityC4555k abstractActivityC4555k, String str, String str2, String str3, o oVar) {
        if (f3860F == 1) {
            InterstitialAd interstitialAd = new InterstitialAd(abstractActivityC4555k, str3);
            f3867N = interstitialAd;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new i(this, oVar, abstractActivityC4555k)).build());
            return;
        }
        if (f3859E == 1) {
            ATInterstitial aTInterstitial = new ATInterstitial(abstractActivityC4555k, str);
            this.f3898b = aTInterstitial;
            aTInterstitial.setAdListener(new f(1, oVar, this, abstractActivityC4555k));
            this.f3898b.load();
            return;
        }
        if (f3880j == 1) {
            AbstractC5205a.b(abstractActivityC4555k, str2, new m2.g(new m2.f(3)), new h(1, oVar, this, abstractActivityC4555k));
            return;
        }
        if (f3896z.isShowing()) {
            f3896z.dismiss();
        }
        f();
    }

    public final void j(AbstractActivityC4555k abstractActivityC4555k, String str, String str2, String str3, o oVar) {
        f3855A = oVar;
        f3884n++;
        try {
            a aVar = new a(abstractActivityC4555k);
            f3896z = aVar;
            if (aVar.getWindow() != null) {
                f3896z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            f3896z.setCanceledOnTouchOutside(false);
            f3896z.setCancelable(false);
            if (!abstractActivityC4555k.isFinishing()) {
                f3896z.show();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        int i4 = f3879h;
        if (i4 == 1) {
            if (f3884n >= 2) {
                f3884n = 0;
                b(abstractActivityC4555k, str, str2, str3, oVar);
                return;
            }
            try {
                a aVar2 = f3896z;
                if (aVar2 != null && aVar2.isShowing()) {
                    f3896z.dismiss();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            f();
            if (i == 1 && f3878g == 1) {
                g(abstractActivityC4555k);
                return;
            }
            return;
        }
        if (i4 != 2) {
            b(abstractActivityC4555k, str, str2, str3, oVar);
            return;
        }
        if (f3884n >= 3) {
            f3884n = 0;
            b(abstractActivityC4555k, str, str2, str3, oVar);
            return;
        }
        try {
            a aVar3 = f3896z;
            if (aVar3 != null && aVar3.isShowing()) {
                f3896z.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        f();
        if (i == 1 && f3878g == 1) {
            g(abstractActivityC4555k);
        }
    }
}
