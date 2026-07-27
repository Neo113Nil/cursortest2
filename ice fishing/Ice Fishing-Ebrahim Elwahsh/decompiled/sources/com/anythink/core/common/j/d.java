package com.anythink.core.common.j;

import I0.j;
import I3.e;
import I3.f;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.common.d.t;
import com.google.android.gms.internal.consent_sdk.C;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4399w2;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import java.util.ArrayList;
import java.util.Queue;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f14427a;

    /* renamed from: b, reason: collision with root package name */
    private final e f14428b;

    public interface a {
        void a(String str);

        void a(boolean z8);
    }

    private d(Context context) {
        this.f14428b = (W0) ((Z2) C4313b.b(context).f35818h).d();
    }

    public static d a(Context context) {
        if (f14427a == null) {
            synchronized (d.class) {
                try {
                    if (f14427a == null) {
                        f14427a = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14427a;
    }

    public final void a(final Activity activity, final a aVar) {
        j jVar;
        Context applicationContext = activity.getApplicationContext();
        ATDebuggerConfig A8 = t.b().A();
        if (A8 != null && !TextUtils.isEmpty(A8.getUMPTestDeviceId())) {
            F.d dVar = new F.d(applicationContext);
            dVar.f908b = 1;
            ((ArrayList) dVar.f909c).add(A8.getUMPTestDeviceId());
            I3.a b9 = dVar.b();
            h4.c cVar = new h4.c(6);
            cVar.f38233u = b9;
            jVar = new j(cVar);
        } else {
            jVar = new j(new h4.c(6));
        }
        ((W0) this.f14428b).b(activity, jVar, new I3.d() { // from class: com.anythink.core.common.j.d.1
            @Override // I3.d
            public final void onConsentInfoUpdateSuccess() {
                boolean z8;
                if (((W0) d.this.f14428b).f35787c.f35887b.get() == null) {
                    aVar.a("UMP Consent failed to load form.");
                    return;
                }
                W0 w02 = (W0) d.this.f14428b;
                synchronized (w02.f35788d) {
                    z8 = w02.f35790f;
                }
                if ((!z8 ? 0 : w02.f35785a.f35840b.getInt("consent_status", 0)) != 2) {
                    aVar.a(false);
                    return;
                }
                Activity activity2 = activity;
                I3.b bVar = new I3.b() { // from class: com.anythink.core.common.j.d.1.1
                    @Override // I3.b
                    public final void onConsentFormDismissed(f fVar) {
                        if (fVar != null) {
                            aVar.a("UMP Consent failed to show form.");
                        } else {
                            aVar.a(true);
                        }
                    }
                };
                C4313b b10 = C4313b.b(activity2);
                if (((W0) ((Z2) b10.f35818h).d()).a()) {
                    bVar.onConsentFormDismissed(null);
                    return;
                }
                ((Queue) ((C4400x) ((Z2) b10.f35817g).d()).i.get()).add(Long.valueOf(System.currentTimeMillis()));
                C4361n c4361n = (C4361n) ((Z2) b10.f35815e).d();
                C.a();
                c4361n.a(new C4357m(activity2, bVar), new C4399w2(3, bVar), true);
            }
        }, new I3.c() { // from class: com.anythink.core.common.j.d.2
            @Override // I3.c
            public final void onConsentInfoUpdateFailure(f fVar) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    if (fVar == null) {
                        aVar2.a("UMP Consent InfoUpdateFailure");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("UMP Consent InfoUpdateFailure,error:");
                    sb.append(fVar.f1258a);
                    sb.append(",");
                    String str = fVar.f1259b;
                    sb.append(str);
                    if (sb.toString() == null) {
                        str = "";
                    }
                    aVar2.a(str);
                }
            }
        });
    }

    public final boolean a() {
        return ((W0) this.f14428b).a();
    }
}
