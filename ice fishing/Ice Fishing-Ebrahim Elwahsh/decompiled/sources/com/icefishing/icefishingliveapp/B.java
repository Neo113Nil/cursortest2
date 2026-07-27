package com.icefishing.icefishingliveapp;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import java.util.HashSet;
import java.util.Queue;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements I3.d, I3.c, I3.h, I3.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f36515n;

    public /* synthetic */ B(SplashActivity splashActivity) {
        this.f36515n = splashActivity;
    }

    @Override // I3.h
    public void a(C4349k c4349k) {
        int i = SplashActivity.f37047A;
        final SplashActivity splashActivity = this.f36515n;
        splashActivity.getClass();
        c4349k.a(splashActivity, new I3.b() { // from class: com.icefishing.icefishingliveapp.C
            @Override // I3.b
            public final void onConsentFormDismissed(I3.f fVar) {
                boolean z8;
                SplashActivity splashActivity2 = SplashActivity.this;
                W0 w02 = splashActivity2.f37051y;
                synchronized (w02.f35788d) {
                    z8 = w02.f35790f;
                }
                if ((!z8 ? 0 : w02.f35785a.f35840b.getInt("consent_status", 0)) != 2) {
                    splashActivity2.e();
                    return;
                }
                W0 w03 = splashActivity2.f37051y;
                w03.f35787c.f35887b.set(null);
                C4333g c4333g = w03.f35785a;
                HashSet hashSet = c4333g.f35841c;
                com.google.android.gms.internal.consent_sdk.E.e(c4333g.f35839a, hashSet);
                hashSet.clear();
                c4333g.f35840b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
                synchronized (w03.f35788d) {
                    w03.f35790f = false;
                }
                splashActivity2.g();
            }
        });
    }

    @Override // I3.g
    public void b(I3.f fVar) {
        int i = SplashActivity.f37047A;
        SplashActivity splashActivity = this.f36515n;
        splashActivity.getClass();
        Log.e("UMP", "Form load error: " + fVar.f1259b);
        splashActivity.e();
    }

    @Override // I3.c
    public void onConsentInfoUpdateFailure(I3.f fVar) {
        int i = SplashActivity.f37047A;
        SplashActivity splashActivity = this.f36515n;
        splashActivity.getClass();
        Log.e("UMP", "Consent error: " + fVar.f1259b);
        splashActivity.e();
    }

    @Override // I3.d
    public void onConsentInfoUpdateSuccess() {
        SplashActivity splashActivity = this.f36515n;
        if (splashActivity.f37051y.f35787c.f35887b.get() == null) {
            splashActivity.e();
            return;
        }
        B b9 = new B(splashActivity);
        B b10 = new B(splashActivity);
        C4313b b11 = C4313b.b(splashActivity);
        ((Queue) ((C4400x) ((Z2) b11.f35817g).d()).f35951g.get()).add(Long.valueOf(System.currentTimeMillis()));
        ((C4361n) ((Z2) b11.f35815e).d()).a(b9, b10, false);
    }
}
