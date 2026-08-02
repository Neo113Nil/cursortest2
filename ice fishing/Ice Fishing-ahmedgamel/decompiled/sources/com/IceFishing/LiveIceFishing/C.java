package com.IceFishing.LiveIceFishing;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4359k;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import java.util.HashSet;
import java.util.Queue;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements O3.d, O3.c, O3.h, O3.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f5848n;

    public /* synthetic */ C(SplashActivity splashActivity) {
        this.f5848n = splashActivity;
    }

    @Override // O3.h
    public void a(C4359k c4359k) {
        int i = SplashActivity.f6375A;
        final SplashActivity splashActivity = this.f5848n;
        splashActivity.getClass();
        c4359k.a(splashActivity, new O3.b() { // from class: com.IceFishing.LiveIceFishing.D
            @Override // O3.b
            public final void onConsentFormDismissed(O3.f fVar) {
                boolean z6;
                SplashActivity splashActivity2 = SplashActivity.this;
                W0 w02 = splashActivity2.f6379y;
                synchronized (w02.f36394d) {
                    z6 = w02.f36396f;
                }
                if ((!z6 ? 0 : w02.f36391a.f36446b.getInt("consent_status", 0)) != 2) {
                    splashActivity2.e();
                    return;
                }
                W0 w03 = splashActivity2.f6379y;
                w03.f36393c.f36493b.set(null);
                C4343g c4343g = w03.f36391a;
                HashSet hashSet = c4343g.f36447c;
                com.google.android.gms.internal.consent_sdk.E.e(c4343g.f36445a, hashSet);
                hashSet.clear();
                c4343g.f36446b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
                synchronized (w03.f36394d) {
                    w03.f36396f = false;
                }
                splashActivity2.g();
            }
        });
    }

    @Override // O3.g
    public void b(O3.f fVar) {
        int i = SplashActivity.f6375A;
        SplashActivity splashActivity = this.f5848n;
        splashActivity.getClass();
        Log.e("UMP", "Form load error: " + fVar.f2295b);
        splashActivity.e();
    }

    @Override // O3.c
    public void onConsentInfoUpdateFailure(O3.f fVar) {
        int i = SplashActivity.f6375A;
        SplashActivity splashActivity = this.f5848n;
        splashActivity.getClass();
        Log.e("UMP", "Consent error: " + fVar.f2295b);
        splashActivity.e();
    }

    @Override // O3.d
    public void onConsentInfoUpdateSuccess() {
        SplashActivity splashActivity = this.f5848n;
        if (splashActivity.f6379y.f36393c.f36493b.get() == null) {
            splashActivity.e();
            return;
        }
        C c9 = new C(splashActivity);
        C c10 = new C(splashActivity);
        C4323b b9 = C4323b.b(splashActivity);
        ((Queue) ((C4410x) ((Z2) b9.f36423g).f()).f36557g.get()).add(Long.valueOf(System.currentTimeMillis()));
        ((C4371n) ((Z2) b9.f36421e).f()).a(c9, c10, false);
    }
}
