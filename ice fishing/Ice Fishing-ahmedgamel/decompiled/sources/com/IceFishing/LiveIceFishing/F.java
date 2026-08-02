package com.IceFishing.LiveIceFishing;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import com.anythink.interstitial.api.ATInterstitial;
import com.facebook.ads.InterstitialAd;
import i1.C4585b;
import i1.C4586c;
import y2.AbstractC5205a;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5883n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4586c f5884u;

    public /* synthetic */ F(C4586c c4586c, int i) {
        this.f5883n = i;
        this.f5884u = c4586c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4586c c4586c = this.f5884u;
        int i = 1;
        int i4 = 0;
        switch (this.f5883n) {
            case 0:
                c4586c.getClass();
                int i6 = SplashActivity.f6375A;
                SplashActivity splashActivity = (SplashActivity) c4586c.f38154u;
                if (splashActivity.f()) {
                    if (((SharedPreferences) splashActivity.f6378x.f1291u).getBoolean("IsFirstTimeLaunch", true)) {
                        splashActivity.f6378x.getClass();
                        I0.j.f1289w.putBoolean("IsFirstTimeLaunch", false);
                        I0.j.f1289w.apply();
                        splashActivity.f6376v = new Intent(splashActivity, (Class<?>) IntroActivity.class);
                    } else {
                        splashActivity.f6376v = new Intent(splashActivity, (Class<?>) StartActivity.class);
                    }
                    F f2 = new F(c4586c, i);
                    if (splashActivity.f()) {
                        splashActivity.runOnUiThread(new F.n(13, splashActivity, f2));
                        break;
                    }
                }
                break;
            default:
                SplashActivity splashActivity2 = (SplashActivity) c4586c.f38154u;
                Y0.p e9 = Y0.p.e(splashActivity2.f6377w);
                String str = Y0.p.f3890t;
                String str2 = Y0.p.f3882l;
                String str3 = Y0.p.J;
                C4585b c4585b = new C4585b(22, c4586c);
                e9.getClass();
                Y0.p.f3855A = c4585b;
                try {
                    Y0.a aVar = new Y0.a(splashActivity2);
                    Y0.p.f3896z = aVar;
                    if (aVar.getWindow() != null) {
                        Y0.p.f3896z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    }
                    Y0.p.f3896z.setCanceledOnTouchOutside(false);
                    Y0.p.f3896z.setCancelable(false);
                    if (!splashActivity2.isFinishing()) {
                        Y0.p.f3896z.show();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (Y0.p.f3877f != 1) {
                    if (Y0.p.f3896z.isShowing()) {
                        Y0.p.f3896z.dismiss();
                    }
                    Y0.p.f();
                    if (Y0.p.f3878g == 1) {
                        Y0.p.g(splashActivity2);
                        break;
                    }
                } else if (Y0.p.f3860F != 1) {
                    if (Y0.p.f3859E != 1) {
                        if (Y0.p.f3880j != 1) {
                            if (Y0.p.f3896z.isShowing()) {
                                Y0.p.f3896z.dismiss();
                            }
                            Y0.p.f();
                            break;
                        } else {
                            AbstractC5205a.b(splashActivity2, str2, new m2.g(new m2.f(3)), new Y0.h(i4, c4585b, e9, splashActivity2));
                            break;
                        }
                    } else {
                        ATInterstitial aTInterstitial = new ATInterstitial(splashActivity2, str);
                        e9.f3898b = aTInterstitial;
                        aTInterstitial.setAdListener(new Y0.f(i4, c4585b, e9, splashActivity2));
                        e9.f3898b.load();
                        break;
                    }
                } else {
                    InterstitialAd interstitialAd = new InterstitialAd(splashActivity2, str3);
                    Y0.p.f3867N = interstitialAd;
                    interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new Y0.e(e9, c4585b, splashActivity2)).build());
                    break;
                }
                break;
        }
    }
}
