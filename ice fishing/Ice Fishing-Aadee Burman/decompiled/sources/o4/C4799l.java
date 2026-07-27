package o4;

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
import com.anythink.banner.api.ATBannerView;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.bumptech.glide.manager.o;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.internal.ads.C2815Uo;
import com.google.android.gms.internal.ads.C3462kb;
import com.icefishing.icefishinglive2.C5275R;
import h.AbstractActivityC4551k;
import java.util.Random;
import l.C4648e;
import m1.C4726a;
import org.json.JSONException;
import org.json.JSONObject;
import q2.E0;
import q2.F0;
import w2.AbstractC5148a;

/* renamed from: o4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4799l {

    /* renamed from: A, reason: collision with root package name */
    public static InterfaceC4798k f39589A = null;

    /* renamed from: B, reason: collision with root package name */
    public static ATBannerView f39590B = null;

    /* renamed from: C, reason: collision with root package name */
    public static ATNative f39591C = null;

    /* renamed from: D, reason: collision with root package name */
    public static ATNativeAdView f39592D = null;

    /* renamed from: E, reason: collision with root package name */
    public static int f39593E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static int f39594F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static int f39595G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static String f39596H = "";

    /* renamed from: I, reason: collision with root package name */
    public static String f39597I = "";
    public static String J = "";

    /* renamed from: K, reason: collision with root package name */
    public static String f39598K = "";

    /* renamed from: L, reason: collision with root package name */
    public static String f39599L = "";

    /* renamed from: M, reason: collision with root package name */
    public static AdView f39600M = null;

    /* renamed from: N, reason: collision with root package name */
    public static InterstitialAd f39601N = null;

    /* renamed from: O, reason: collision with root package name */
    public static ATNativePrepareInfo f39602O = null;

    /* renamed from: P, reason: collision with root package name */
    public static final String[] f39603P = {"Play & Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: Q, reason: collision with root package name */
    public static final String[] f39604Q = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f39605R = {C5275R.drawable.ads_round1, C5275R.drawable.ads_round2, C5275R.drawable.ads_round3, C5275R.drawable.ads_round4, C5275R.drawable.ads_round5};

    /* renamed from: S, reason: collision with root package name */
    public static final String[] f39606S = {"Play Cricket Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f39607T = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f39608U = {C5275R.drawable.ads_qureka, C5275R.drawable.ads_qureka1, C5275R.drawable.ads_qureka2, C5275R.drawable.ads_qureka3, C5275R.drawable.ads_qureka4};

    /* renamed from: d, reason: collision with root package name */
    public static SharedPreferences f39609d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Context f39610e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f39611f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f39612g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f39613h = 0;
    public static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f39614j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static String f39615k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f39616l = "";

    /* renamed from: m, reason: collision with root package name */
    public static String f39617m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f39618n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f39619o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f39620p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static String f39621q = "";

    /* renamed from: r, reason: collision with root package name */
    public static String f39622r = "";

    /* renamed from: s, reason: collision with root package name */
    public static String f39623s = "";

    /* renamed from: t, reason: collision with root package name */
    public static String f39624t = "";

    /* renamed from: u, reason: collision with root package name */
    public static String f39625u = "";

    /* renamed from: v, reason: collision with root package name */
    public static C4799l f39626v = null;

    /* renamed from: w, reason: collision with root package name */
    public static String f39627w = "";

    /* renamed from: x, reason: collision with root package name */
    public static String f39628x = "";

    /* renamed from: y, reason: collision with root package name */
    public static String f39629y = "";

    /* renamed from: z, reason: collision with root package name */
    public static DialogC4788a f39630z;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences.Editor f39631a;

    /* renamed from: b, reason: collision with root package name */
    public ATInterstitial f39632b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5148a f39633c;

    public static void a(Context context, String str, String str2, String str3, String str4, ViewGroup viewGroup) {
        if (f39594F == 1) {
            if (f39595G == 1) {
                NativeBannerAd nativeBannerAd = new NativeBannerAd(context, str4);
                nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new C4794g(context, viewGroup, nativeBannerAd)).build());
                return;
            }
            AdView adView = new AdView(context, str3, AdSize.BANNER_HEIGHT_50);
            f39600M = adView;
            viewGroup.addView(adView);
            AdView adView2 = f39600M;
            adView2.loadAd(adView2.buildLoadAdConfig().withAdListener(new C4795h(context, viewGroup)).build());
            return;
        }
        if (f39593E == 1) {
            ATBannerView aTBannerView = new ATBannerView(context);
            f39590B = aTBannerView;
            aTBannerView.setPlacementId(str);
            viewGroup.addView(f39590B);
            f39590B.setBannerAdListener(new S0.l(29, context, viewGroup));
            f39590B.loadAd();
            return;
        }
        if (f39614j == 1) {
            k2.j jVar = new k2.j(f39610e);
            jVar.setAdSize(k2.h.i);
            jVar.setAdUnitId(str2);
            jVar.b(new k2.g(new k2.f(2)));
            jVar.setAdListener(new C2815Uo(viewGroup, jVar, context));
        }
    }

    public static void c(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        if (f39594F == 1) {
            NativeAd nativeAd = new NativeAd(context, str3);
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new C4797j(context, viewGroup, nativeAd)).build());
            return;
        }
        if (f39593E == 1) {
            f39592D = new ATNativeAdView(context);
            ATNative aTNative = new ATNative(context, str, new m1.e(viewGroup, context));
            f39591C = aTNative;
            aTNative.makeAdRequest();
            return;
        }
        if (f39614j == 1) {
            k2.d dVar = new k2.d(context, str2);
            int i6 = 1;
            dVar.b(new C4726a(i6, context, viewGroup));
            dVar.c(new com.google.ads.mediation.e(i6, context, viewGroup));
            try {
                dVar.f38581b.J3(new C3462kb(4, false, -1, false, 1, null, false, 0, 0, false, 1 - 1));
            } catch (RemoteException e9) {
                v2.i.g("Failed to specify native ad options", e9);
            }
            k2.e a9 = dVar.a();
            E0 e02 = new E0();
            e02.f40011d.add("B3EEABB8EE11C2BE770B684D95219ECB");
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

    public static C4799l e(Context context) {
        f39610e = context;
        if (f39626v == null) {
            C4799l c4799l = new C4799l();
            f39610e = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("MyPref", 0);
            f39609d = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            c4799l.f39631a = edit;
            String string = f39609d.getString("response", "");
            if (!string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f39611f = jSONObject.getInt("splash_link_all");
                    i = jSONObject.getInt("banner_native_all");
                    f39612g = jSONObject.getInt("splash_redirect");
                    f39627w = jSONObject.getString("link1");
                    f39628x = jSONObject.getString("link2");
                    f39629y = jSONObject.getString("link3");
                    jSONObject.getString("livetv");
                    f39621q = jSONObject.getString("topon_appid");
                    f39622r = jSONObject.getString("topon_appkey");
                    f39623s = jSONObject.getString("topon_banner");
                    f39624t = jSONObject.getString("topon_inter1");
                    jSONObject.getString("topon_inter2");
                    f39625u = jSONObject.getString("topon_native");
                    f39593E = jSONObject.getInt("topon_showStatus");
                    f39614j = jSONObject.getInt("admob_showAdStatus");
                    jSONObject.getString("AppID");
                    f39615k = jSONObject.getString("Admob_Banner");
                    f39616l = jSONObject.getString("Admob_Interstitial");
                    f39617m = jSONObject.getString("Admob_Native");
                    f39613h = jSONObject.getInt("adposition");
                    f39596H = jSONObject.getString("FB_banner");
                    f39599L = jSONObject.getString("FB_nativebanner");
                    f39597I = jSONObject.getString("FB_inter1");
                    J = jSONObject.getString("FB_inter2");
                    f39598K = jSONObject.getString("FB_native");
                    f39594F = jSONObject.getInt("FB_showAdStatus");
                    f39595G = jSONObject.getInt("FB_bannernative");
                    edit.putInt("adposition", f39613h);
                    edit.putString("interstitial_id", f39624t);
                    edit.commit();
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
            f39626v = c4799l;
        }
        return f39626v;
    }

    public static void f() {
        InterfaceC4798k interfaceC4798k = f39589A;
        if (interfaceC4798k != null) {
            interfaceC4798k.OnCall();
            f39589A = null;
        }
    }

    public static void g(Context context) {
        try {
            o oVar = new o();
            ((C4648e) oVar.f23465v).f38761u = Integer.valueOf(E.b.a(context, C5275R.color.colorPrimary) | (-16777216));
            ((Intent) oVar.f23464u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            int nextInt = new Random().nextInt(3);
            if (nextInt == 1) {
                h(context, oVar.b(), Uri.parse(f39627w));
            } else if (nextInt == 2) {
                h(context, oVar.b(), Uri.parse(f39628x));
            } else {
                h(context, oVar.b(), Uri.parse(f39629y));
            }
        } catch (ActivityNotFoundException e9) {
            e9.printStackTrace();
        }
    }

    public static void h(Context context, m8.i iVar, Uri uri) {
        try {
            ((Intent) iVar.f39362n).setPackage("com.android.chrome");
            iVar.f(context, uri);
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
        int i6 = f39619o + 1;
        f39619o = i6;
        int i9 = f39613h;
        if (i9 == 1) {
            if (i6 >= 2) {
                f39619o = 0;
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f39612g == 1) {
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            return;
        }
        if (i9 != 2) {
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        if (i6 >= 3) {
            f39619o = 0;
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f39612g == 1) {
            a(context, str, str2, str3, str4, viewGroup);
        }
    }

    public static void k(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        int i6 = f39620p + 1;
        f39620p = i6;
        int i9 = f39613h;
        if (i9 == 1) {
            if (i6 >= 3) {
                f39620p = 0;
                c(context, str, str2, str3, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f39612g == 1) {
                c(context, str, str2, str3, viewGroup);
                return;
            }
            return;
        }
        if (i9 != 2) {
            c(context, str, str2, str3, viewGroup);
            return;
        }
        if (i6 >= 2) {
            f39620p = 0;
            c(context, str, str2, str3, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f39612g == 1) {
            c(context, str, str2, str3, viewGroup);
        }
    }

    public final void b(AbstractActivityC4551k abstractActivityC4551k, String str, String str2, String str3, InterfaceC4798k interfaceC4798k) {
        if (f39594F == 1) {
            InterstitialAd interstitialAd = new InterstitialAd(abstractActivityC4551k, str3);
            f39601N = interstitialAd;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C4791d(abstractActivityC4551k, interfaceC4798k, this)).build());
            return;
        }
        if (f39593E == 1) {
            ATInterstitial aTInterstitial = new ATInterstitial(abstractActivityC4551k, str);
            this.f39632b = aTInterstitial;
            aTInterstitial.setAdListener(new C4792e(abstractActivityC4551k, interfaceC4798k, this));
            this.f39632b.load();
            return;
        }
        if (f39614j == 1) {
            AbstractC5148a.b(abstractActivityC4551k, str2, new k2.g(new k2.f(2)), new C4793f(abstractActivityC4551k, interfaceC4798k, this));
            return;
        }
        if (f39630z.isShowing()) {
            f39630z.dismiss();
        }
        f();
    }

    public final void j(AbstractActivityC4551k abstractActivityC4551k, String str, String str2, String str3, InterfaceC4798k interfaceC4798k) {
        f39589A = interfaceC4798k;
        f39618n++;
        try {
            DialogC4788a dialogC4788a = new DialogC4788a(abstractActivityC4551k);
            f39630z = dialogC4788a;
            if (dialogC4788a.getWindow() != null) {
                f39630z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            f39630z.setCanceledOnTouchOutside(false);
            f39630z.setCancelable(false);
            if (!abstractActivityC4551k.isFinishing()) {
                f39630z.show();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        int i6 = f39613h;
        if (i6 == 1) {
            if (f39618n >= 2) {
                f39618n = 0;
                b(abstractActivityC4551k, str, str2, str3, interfaceC4798k);
                return;
            }
            try {
                DialogC4788a dialogC4788a2 = f39630z;
                if (dialogC4788a2 != null && dialogC4788a2.isShowing()) {
                    f39630z.dismiss();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            f();
            if (f39611f == 1 && f39612g == 1) {
                g(abstractActivityC4551k);
                return;
            }
            return;
        }
        if (i6 != 2) {
            b(abstractActivityC4551k, str, str2, str3, interfaceC4798k);
            return;
        }
        if (f39618n >= 3) {
            f39618n = 0;
            b(abstractActivityC4551k, str, str2, str3, interfaceC4798k);
            return;
        }
        try {
            DialogC4788a dialogC4788a3 = f39630z;
            if (dialogC4788a3 != null && dialogC4788a3.isShowing()) {
                f39630z.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        f();
        if (f39611f == 1 && f39612g == 1) {
            g(abstractActivityC4551k);
        }
    }
}
