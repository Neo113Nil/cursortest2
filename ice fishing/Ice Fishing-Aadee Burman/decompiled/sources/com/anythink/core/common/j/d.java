package com.anythink.core.common.j;

import I0.j;
import M3.e;
import M3.f;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.common.d.t;
import com.google.android.gms.internal.consent_sdk.C;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4386w2;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import java.util.ArrayList;
import java.util.Queue;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f14270a;

    /* renamed from: b, reason: collision with root package name */
    private final e f14271b;

    public interface a {
        void a(String str);

        void a(boolean z3);
    }

    private d(Context context) {
        this.f14271b = (W0) ((Z2) C4300b.b(context).f35655h).f();
    }

    public static d a(Context context) {
        if (f14270a == null) {
            synchronized (d.class) {
                try {
                    if (f14270a == null) {
                        f14270a = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14270a;
    }

    public final void a(final Activity activity, final a aVar) {
        j jVar;
        Context applicationContext = activity.getApplicationContext();
        ATDebuggerConfig A9 = t.b().A();
        if (A9 != null && !TextUtils.isEmpty(A9.getUMPTestDeviceId())) {
            F.d dVar = new F.d(applicationContext);
            dVar.f854b = 1;
            ((ArrayList) dVar.f855c).add(A9.getUMPTestDeviceId());
            M3.a b9 = dVar.b();
            F1.a aVar2 = new F1.a(3, false);
            aVar2.f903u = b9;
            jVar = new j(aVar2);
        } else {
            jVar = new j(new F1.a(3, false));
        }
        ((W0) this.f14271b).b(activity, jVar, new M3.d() { // from class: com.anythink.core.common.j.d.1
            @Override // M3.d
            public final void onConsentInfoUpdateSuccess() {
                boolean z3;
                if (((W0) d.this.f14271b).f35624c.f35724b.get() == null) {
                    aVar.a("UMP Consent failed to load form.");
                    return;
                }
                W0 w02 = (W0) d.this.f14271b;
                synchronized (w02.f35625d) {
                    z3 = w02.f35627f;
                }
                if ((!z3 ? 0 : w02.f35622a.f35677b.getInt("consent_status", 0)) != 2) {
                    aVar.a(false);
                    return;
                }
                Activity activity2 = activity;
                M3.b bVar = new M3.b() { // from class: com.anythink.core.common.j.d.1.1
                    @Override // M3.b
                    public final void onConsentFormDismissed(f fVar) {
                        if (fVar != null) {
                            aVar.a("UMP Consent failed to show form.");
                        } else {
                            aVar.a(true);
                        }
                    }
                };
                C4300b b10 = C4300b.b(activity2);
                if (((W0) ((Z2) b10.f35655h).f()).a()) {
                    bVar.onConsentFormDismissed(null);
                    return;
                }
                ((Queue) ((C4387x) ((Z2) b10.f35654g).f()).i.get()).add(Long.valueOf(System.currentTimeMillis()));
                C4348n c4348n = (C4348n) ((Z2) b10.f35652e).f();
                C.a();
                c4348n.a(new C4344m(activity2, bVar), new C4386w2(3, bVar), true);
            }
        }, new M3.c() { // from class: com.anythink.core.common.j.d.2
            @Override // M3.c
            public final void onConsentInfoUpdateFailure(f fVar) {
                a aVar3 = aVar;
                if (aVar3 != null) {
                    if (fVar == null) {
                        aVar3.a("UMP Consent InfoUpdateFailure");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("UMP Consent InfoUpdateFailure,error:");
                    sb.append(fVar.f1868a);
                    sb.append(",");
                    String str = fVar.f1869b;
                    sb.append(str);
                    if (sb.toString() == null) {
                        str = "";
                    }
                    aVar3.a(str);
                }
            }
        });
    }

    public final boolean a() {
        return ((W0) this.f14271b).a();
    }
}
