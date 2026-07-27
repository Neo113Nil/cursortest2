package T0;

import B2.z;
import D.y;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.AbstractC4404y;
import com.google.android.gms.internal.consent_sdk.C4313b;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4354l0;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4361n;
import com.google.android.gms.internal.consent_sdk.C4365o;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.O;
import java.util.Queue;
import java.util.UUID;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3072n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3073u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3074v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3075w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3076x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3077y;

    public /* synthetic */ q(C4313b c4313b, Activity activity, I0.j jVar, I3.d dVar, I3.c cVar) {
        this.f3073u = c4313b;
        this.f3074v = activity;
        this.f3075w = jVar;
        this.f3076x = dVar;
        this.f3077y = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f3072n) {
            case 0:
                try {
                    if (!(((U0.k) this.f3073u).f3237n instanceof U0.a)) {
                        String uuid = ((UUID) this.f3074v).toString();
                        S0.p h9 = ((r) this.f3077y).f3080c.h(uuid);
                        if (h9 == null || y.b(h9.f2921b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((r) this.f3077y).f3079b.g(uuid, (J0.j) this.f3075w);
                        ((Context) this.f3076x).startService(R0.a.a((Context) this.f3076x, U2.a.e(h9), (J0.j) this.f3075w));
                    }
                    ((U0.k) this.f3073u).j(null);
                    return;
                } catch (Throwable th) {
                    ((U0.k) this.f3073u).k(th);
                    return;
                }
            default:
                C4313b c4313b = (C4313b) this.f3073u;
                Activity activity = (Activity) this.f3074v;
                I0.j jVar = (I0.j) this.f3075w;
                I3.d dVar = (I3.d) this.f3076x;
                final I3.c cVar = (I3.c) this.f3077y;
                try {
                    I3.a aVar = (I3.a) jVar.f1233u;
                    if (aVar == null || !aVar.f1256n) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + AbstractC4404y.a((Application) c4313b.f35811a) + "\") to set this as a debug device.");
                    }
                    K2.o r9 = ((S0.i) c4313b.f35817g).r(c4313b.e(((C4357m) c4313b.f35816f).b(activity, jVar)));
                    C4333g c4333g = (C4333g) c4313b.f35814d;
                    c4333g.f35840b.edit().putInt("consent_status", r9.f1608a).commit();
                    int i = r9.f1609b;
                    SharedPreferences.Editor edit = c4333g.f35840b.edit();
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
                    ((C4361n) c4313b.f35815e).f35887b.set((C4365o) r9.f1610c);
                    C4400x c4400x = (C4400x) c4313b.i;
                    c4400x.a((Queue) c4400x.f35950f.get(), 8, 9, null);
                    ((O) c4313b.f35818h).f35746a.execute(new z(c4313b, dVar, r9, 10));
                    return;
                } catch (C4354l0 e6) {
                    C4400x c4400x2 = (C4400x) c4313b.i;
                    c4400x2.a((Queue) c4400x2.f35950f.get(), 8, 9, "RequestConsentUpdate exception. Error: " + e6.getMessage() + ", cause: " + String.valueOf(e6.getCause()));
                    final int i4 = 0;
                    ((Handler) c4313b.f35812b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    cVar.onConsentInfoUpdateFailure(e6.a());
                                    break;
                                default:
                                    cVar.onConsentInfoUpdateFailure(e6.a());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e9) {
                    C4400x c4400x3 = (C4400x) c4313b.i;
                    c4400x3.a((Queue) c4400x3.f35950f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e9.getMessage())));
                    final int i9 = 1;
                    final C4354l0 c4354l0 = new C4354l0(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e9))));
                    ((Handler) c4313b.f35812b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    cVar.onConsentInfoUpdateFailure(c4354l0.a());
                                    break;
                                default:
                                    cVar.onConsentInfoUpdateFailure(c4354l0.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }

    public q(r rVar, U0.k kVar, UUID uuid, J0.j jVar, Context context) {
        this.f3077y = rVar;
        this.f3073u = kVar;
        this.f3074v = uuid;
        this.f3075w = jVar;
        this.f3076x = context;
    }
}
