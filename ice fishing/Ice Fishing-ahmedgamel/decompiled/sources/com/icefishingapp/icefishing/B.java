package com.icefishingapp.icefishing;

import android.util.Log;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4336k;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import java.util.HashSet;
import java.util.Queue;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements M3.d, M3.c, M3.h, M3.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f36353n;

    public /* synthetic */ B(SplashActivity splashActivity) {
        this.f36353n = splashActivity;
    }

    @Override // M3.h
    public void a(C4336k c4336k) {
        int i = SplashActivity.f36886A;
        final SplashActivity splashActivity = this.f36353n;
        splashActivity.getClass();
        c4336k.a(splashActivity, new M3.b() { // from class: com.icefishingapp.icefishing.C
            @Override // M3.b
            public final void onConsentFormDismissed(M3.f fVar) {
                boolean z3;
                SplashActivity splashActivity2 = SplashActivity.this;
                W0 w02 = splashActivity2.f36890y;
                synchronized (w02.f35625d) {
                    z3 = w02.f35627f;
                }
                if ((!z3 ? 0 : w02.f35622a.f35677b.getInt("consent_status", 0)) != 2) {
                    splashActivity2.e();
                    return;
                }
                W0 w03 = splashActivity2.f36890y;
                w03.f35624c.f35724b.set(null);
                C4320g c4320g = w03.f35622a;
                HashSet hashSet = c4320g.f35678c;
                com.google.android.gms.internal.consent_sdk.E.e(c4320g.f35676a, hashSet);
                hashSet.clear();
                c4320g.f35677b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
                synchronized (w03.f35625d) {
                    w03.f35627f = false;
                }
                splashActivity2.g();
            }
        });
    }

    @Override // M3.g
    public void b(M3.f fVar) {
        int i = SplashActivity.f36886A;
        SplashActivity splashActivity = this.f36353n;
        splashActivity.getClass();
        Log.e("UMP", "Form load error: " + fVar.f1869b);
        splashActivity.e();
    }

    @Override // M3.c
    public void onConsentInfoUpdateFailure(M3.f fVar) {
        int i = SplashActivity.f36886A;
        SplashActivity splashActivity = this.f36353n;
        splashActivity.getClass();
        Log.e("UMP", "Consent error: " + fVar.f1869b);
        splashActivity.e();
    }

    @Override // M3.d
    public void onConsentInfoUpdateSuccess() {
        SplashActivity splashActivity = this.f36353n;
        if (splashActivity.f36890y.f35624c.f35724b.get() == null) {
            splashActivity.e();
            return;
        }
        B b9 = new B(splashActivity);
        B b10 = new B(splashActivity);
        C4300b b11 = C4300b.b(splashActivity);
        ((Queue) ((C4387x) ((Z2) b11.f35654g).f()).f35788g.get()).add(Long.valueOf(System.currentTimeMillis()));
        ((C4348n) ((Z2) b11.f35652e).f()).a(b9, b10, false);
    }
}
