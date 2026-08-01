package com.icefishing.icefishingbigwin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import com.anythink.interstitial.api.ATInterstitial;
import com.facebook.ads.InterstitialAd;
import g1.C4522b;
import o4.C4791d;
import o4.C4792e;
import o4.C4793f;
import o4.DialogC4788a;
import w2.AbstractC5148a;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36388n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ F1.a f36389u;

    public /* synthetic */ E(F1.a aVar, int i) {
        this.f36388n = i;
        this.f36389u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F1.a aVar = this.f36389u;
        int i = 1;
        int i6 = 0;
        switch (this.f36388n) {
            case 0:
                aVar.getClass();
                int i9 = SplashActivity.f36886A;
                SplashActivity splashActivity = (SplashActivity) aVar.f903u;
                if (splashActivity.f()) {
                    if (((SharedPreferences) splashActivity.f36889x.f37625u).getBoolean("IsFirstTimeLaunch", true)) {
                        splashActivity.f36889x.getClass();
                        C4522b.f37623v.putBoolean("IsFirstTimeLaunch", false);
                        C4522b.f37623v.apply();
                        splashActivity.f36887v = new Intent(splashActivity, (Class<?>) IntroActivity.class);
                    } else {
                        splashActivity.f36887v = new Intent(splashActivity, (Class<?>) StartActivity.class);
                    }
                    E e9 = new E(aVar, i);
                    if (splashActivity.f()) {
                        splashActivity.runOnUiThread(new F.n(13, splashActivity, e9));
                        break;
                    }
                }
                break;
            default:
                SplashActivity splashActivity2 = (SplashActivity) aVar.f903u;
                o4.m e10 = o4.m.e(splashActivity2.f36888w);
                String str = o4.m.f39627t;
                String str2 = o4.m.f39619l;
                String str3 = o4.m.J;
                F f3 = new F(aVar);
                e10.getClass();
                o4.m.f39592A = f3;
                try {
                    DialogC4788a dialogC4788a = new DialogC4788a(splashActivity2);
                    o4.m.f39633z = dialogC4788a;
                    if (dialogC4788a.getWindow() != null) {
                        o4.m.f39633z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    }
                    o4.m.f39633z.setCanceledOnTouchOutside(false);
                    o4.m.f39633z.setCancelable(false);
                    if (!splashActivity2.isFinishing()) {
                        o4.m.f39633z.show();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (o4.m.f39614f != 1) {
                    if (o4.m.f39633z.isShowing()) {
                        o4.m.f39633z.dismiss();
                    }
                    o4.m.f();
                    if (o4.m.f39615g == 1) {
                        o4.m.g(splashActivity2);
                        break;
                    }
                } else if (o4.m.f39597F != 1) {
                    if (o4.m.f39596E != 1) {
                        if (o4.m.f39617j != 1) {
                            if (o4.m.f39633z.isShowing()) {
                                o4.m.f39633z.dismiss();
                            }
                            o4.m.f();
                            break;
                        } else {
                            AbstractC5148a.b(splashActivity2, str2, new k2.g(new k2.f(2)), new C4793f(i6, splashActivity2, f3, e10));
                            break;
                        }
                    } else {
                        ATInterstitial aTInterstitial = new ATInterstitial(splashActivity2, str);
                        e10.f39635b = aTInterstitial;
                        aTInterstitial.setAdListener(new C4792e(i6, splashActivity2, f3, e10));
                        e10.f39635b.load();
                        break;
                    }
                } else {
                    InterstitialAd interstitialAd = new InterstitialAd(splashActivity2, str3);
                    o4.m.f39604N = interstitialAd;
                    interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C4791d(e10, f3, splashActivity2)).build());
                    break;
                }
                break;
        }
    }
}
