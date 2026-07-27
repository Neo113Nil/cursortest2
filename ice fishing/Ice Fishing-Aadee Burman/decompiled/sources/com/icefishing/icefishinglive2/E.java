package com.icefishing.icefishinglive2;

import android.content.Intent;
import android.content.SharedPreferences;
import g1.C4522b;
import o4.C4799l;

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
        int i = 1;
        F1.a aVar = this.f36389u;
        switch (this.f36388n) {
            case 0:
                aVar.getClass();
                int i6 = SplashActivity.f36886A;
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
                C4799l.e(((SplashActivity) aVar.f903u).f36888w).j((SplashActivity) aVar.f903u, C4799l.f39624t, C4799l.f39616l, C4799l.J, new F(aVar));
                break;
        }
    }
}
