package com.anythink.core.common.j;

import O3.e;
import O3.f;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATDebuggerConfig;
import com.anythink.core.common.d.t;
import com.google.android.gms.internal.consent_sdk.C;
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4409w2;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.W0;
import com.google.android.gms.internal.consent_sdk.Z2;
import i1.C4586c;
import java.util.ArrayList;
import java.util.Queue;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile d f15056a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15057b;

    public interface a {
        void a(String str);

        void a(boolean z6);
    }

    private d(Context context) {
        this.f15057b = (W0) ((Z2) C4323b.b(context).f36424h).f();
    }

    public static d a(Context context) {
        if (f15056a == null) {
            synchronized (d.class) {
                try {
                    if (f15056a == null) {
                        f15056a = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15056a;
    }

    public final void a(final Activity activity, final a aVar) {
        n4.c cVar;
        Context applicationContext = activity.getApplicationContext();
        ATDebuggerConfig A9 = t.b().A();
        if (A9 != null && !TextUtils.isEmpty(A9.getUMPTestDeviceId())) {
            F.d dVar = new F.d(applicationContext);
            dVar.f917b = 1;
            ((ArrayList) dVar.f918c).add(A9.getUMPTestDeviceId());
            O3.a b9 = dVar.b();
            C4586c c4586c = new C4586c(8, false);
            c4586c.f38154u = b9;
            cVar = new n4.c(c4586c);
        } else {
            cVar = new n4.c(new C4586c(8, false));
        }
        ((W0) this.f15057b).b(activity, cVar, new O3.d() { // from class: com.anythink.core.common.j.d.1
            @Override // O3.d
            public final void onConsentInfoUpdateSuccess() {
                boolean z6;
                if (((W0) d.this.f15057b).f36393c.f36493b.get() == null) {
                    aVar.a("UMP Consent failed to load form.");
                    return;
                }
                W0 w02 = (W0) d.this.f15057b;
                synchronized (w02.f36394d) {
                    z6 = w02.f36396f;
                }
                if ((!z6 ? 0 : w02.f36391a.f36446b.getInt("consent_status", 0)) != 2) {
                    aVar.a(false);
                    return;
                }
                Activity activity2 = activity;
                O3.b bVar = new O3.b() { // from class: com.anythink.core.common.j.d.1.1
                    @Override // O3.b
                    public final void onConsentFormDismissed(f fVar) {
                        if (fVar != null) {
                            aVar.a("UMP Consent failed to show form.");
                        } else {
                            aVar.a(true);
                        }
                    }
                };
                C4323b b10 = C4323b.b(activity2);
                if (((W0) ((Z2) b10.f36424h).f()).a()) {
                    bVar.onConsentFormDismissed(null);
                    return;
                }
                ((Queue) ((C4410x) ((Z2) b10.f36423g).f()).i.get()).add(Long.valueOf(System.currentTimeMillis()));
                C4371n c4371n = (C4371n) ((Z2) b10.f36421e).f();
                C.a();
                c4371n.a(new C4367m(activity2, bVar), new C4409w2(3, bVar), true);
            }
        }, new O3.c() { // from class: com.anythink.core.common.j.d.2
            @Override // O3.c
            public final void onConsentInfoUpdateFailure(f fVar) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    if (fVar == null) {
                        aVar2.a("UMP Consent InfoUpdateFailure");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("UMP Consent InfoUpdateFailure,error:");
                    sb.append(fVar.f2294a);
                    sb.append(",");
                    String str = fVar.f2295b;
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
        return ((W0) this.f15057b).a();
    }
}
