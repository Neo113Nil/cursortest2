package N3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.AbstractC4414y;
import com.google.android.gms.internal.consent_sdk.C4323b;
import com.google.android.gms.internal.consent_sdk.C4343g;
import com.google.android.gms.internal.consent_sdk.C4364l0;
import com.google.android.gms.internal.consent_sdk.C4367m;
import com.google.android.gms.internal.consent_sdk.C4371n;
import com.google.android.gms.internal.consent_sdk.C4375o;
import com.google.android.gms.internal.consent_sdk.C4410x;
import com.google.android.gms.internal.consent_sdk.O;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1981n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1982u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1983v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1984w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1985x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1986y;

    public /* synthetic */ j(Object obj, Activity activity, Object obj2, Object obj3, Object obj4, int i) {
        this.f1981n = i;
        this.f1982u = obj;
        this.f1983v = activity;
        this.f1984w = obj2;
        this.f1985x = obj3;
        this.f1986y = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f1981n) {
            case 0:
                ((l) this.f1982u).f1993z.c();
                ((Activity) this.f1983v).startActivityForResult(Q3.b.v((String) this.f1984w, (String) this.f1985x, (HashMap) this.f1986y), 0);
                return;
            case 1:
                try {
                    if (!(((U0.k) this.f1982u).f3276n instanceof U0.a)) {
                        String uuid = ((UUID) this.f1983v).toString();
                        S0.p h3 = ((T0.q) this.f1986y).f3147c.h(uuid);
                        if (h3 == null || D.x.b(h3.f2938b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((T0.q) this.f1986y).f3146b.g(uuid, (J0.i) this.f1984w);
                        ((Context) this.f1985x).startService(R0.a.a((Context) this.f1985x, Z2.d.k(h3), (J0.i) this.f1984w));
                    }
                    ((U0.k) this.f1982u).j(null);
                    return;
                } catch (Throwable th) {
                    ((U0.k) this.f1982u).k(th);
                    return;
                }
            default:
                C4323b c4323b = (C4323b) this.f1982u;
                Activity activity = (Activity) this.f1983v;
                n4.c cVar = (n4.c) this.f1984w;
                O3.d dVar = (O3.d) this.f1985x;
                final O3.c cVar2 = (O3.c) this.f1986y;
                try {
                    O3.a aVar = (O3.a) cVar.f39658u;
                    if (aVar == null || !aVar.f2292n) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + AbstractC4414y.a((Application) c4323b.f36417a) + "\") to set this as a debug device.");
                    }
                    N2.p m9 = ((S0.n) c4323b.f36423g).m(c4323b.e(((C4367m) c4323b.f36422f).b(activity, cVar)));
                    C4343g c4343g = (C4343g) c4323b.f36420d;
                    c4343g.f36446b.edit().putInt("consent_status", m9.f1953a).commit();
                    int i = m9.f1954b;
                    SharedPreferences.Editor edit = c4343g.f36446b.edit();
                    if (i == 1) {
                        str = "UNKNOWN";
                    } else if (i == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    edit.putString("privacy_options_requirement_status", str).commit();
                    ((C4371n) c4323b.f36421e).f36493b.set((C4375o) m9.f1955c);
                    C4410x c4410x = (C4410x) c4323b.i;
                    c4410x.a((Queue) c4410x.f36556f.get(), 8, 9, null);
                    ((O) c4323b.f36424h).f36352a.execute(new E2.x(12, c4323b, dVar, m9));
                    return;
                } catch (C4364l0 e9) {
                    C4410x c4410x2 = (C4410x) c4323b.i;
                    c4410x2.a((Queue) c4410x2.f36556f.get(), 8, 9, "RequestConsentUpdate exception. Error: " + e9.getMessage() + ", cause: " + String.valueOf(e9.getCause()));
                    final int i4 = 0;
                    ((Handler) c4323b.f36418b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    cVar2.onConsentInfoUpdateFailure(e9.a());
                                    break;
                                default:
                                    cVar2.onConsentInfoUpdateFailure(e9.a());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e10) {
                    C4410x c4410x3 = (C4410x) c4323b.i;
                    c4410x3.a((Queue) c4410x3.f36556f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e10.getMessage())));
                    final int i6 = 1;
                    final C4364l0 c4364l0 = new C4364l0(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e10))));
                    ((Handler) c4323b.f36418b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    cVar2.onConsentInfoUpdateFailure(c4364l0.a());
                                    break;
                                default:
                                    cVar2.onConsentInfoUpdateFailure(c4364l0.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }

    public j(T0.q qVar, U0.k kVar, UUID uuid, J0.i iVar, Context context) {
        this.f1981n = 1;
        this.f1986y = qVar;
        this.f1982u = kVar;
        this.f1983v = uuid;
        this.f1984w = iVar;
        this.f1985x = context;
    }
}
