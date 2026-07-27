package L3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.AbstractC4391y;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.google.android.gms.internal.consent_sdk.C4320g;
import com.google.android.gms.internal.consent_sdk.C4341l0;
import com.google.android.gms.internal.consent_sdk.C4344m;
import com.google.android.gms.internal.consent_sdk.C4348n;
import com.google.android.gms.internal.consent_sdk.C4352o;
import com.google.android.gms.internal.consent_sdk.C4387x;
import com.google.android.gms.internal.consent_sdk.O;
import java.util.HashMap;
import java.util.Queue;
import java.util.UUID;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1706n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1707u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1708v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1709w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f1710x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1711y;

    public /* synthetic */ l(Object obj, Activity activity, Object obj2, Object obj3, Object obj4, int i) {
        this.f1706n = i;
        this.f1707u = obj;
        this.f1708v = activity;
        this.f1709w = obj2;
        this.f1710x = obj3;
        this.f1711y = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f1706n) {
            case 0:
                ((n) this.f1707u).f1718z.c();
                ((Activity) this.f1708v).startActivityForResult(t8.g.I((String) this.f1709w, (String) this.f1710x, (HashMap) this.f1711y), 0);
                return;
            case 1:
                try {
                    if (!(((U0.k) this.f1707u).f3159n instanceof U0.a)) {
                        String uuid = ((UUID) this.f1708v).toString();
                        S0.p h9 = ((T0.q) this.f1711y).f3064c.h(uuid);
                        if (h9 == null || D.y.b(h9.f2809b)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((T0.q) this.f1711y).f3063b.g(uuid, (J0.j) this.f1709w);
                        ((Context) this.f1710x).startService(R0.a.a((Context) this.f1710x, com.bumptech.glide.e.c(h9), (J0.j) this.f1709w));
                    }
                    ((U0.k) this.f1707u).j(null);
                    return;
                } catch (Throwable th) {
                    ((U0.k) this.f1707u).k(th);
                    return;
                }
            default:
                C4300b c4300b = (C4300b) this.f1707u;
                Activity activity = (Activity) this.f1708v;
                I0.j jVar = (I0.j) this.f1709w;
                M3.d dVar = (M3.d) this.f1710x;
                final M3.c cVar = (M3.c) this.f1711y;
                try {
                    M3.a aVar = (M3.a) jVar.f1264u;
                    if (aVar == null || !aVar.f1866n) {
                        Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + AbstractC4391y.a((Application) c4300b.f35648a) + "\") to set this as a debug device.");
                    }
                    L2.o s9 = ((S0.n) c4300b.f35654g).s(c4300b.e(((C4344m) c4300b.f35653f).b(activity, jVar)));
                    C4320g c4320g = (C4320g) c4300b.f35651d;
                    c4320g.f35677b.edit().putInt("consent_status", s9.f1663a).commit();
                    int i = s9.f1664b;
                    SharedPreferences.Editor edit = c4320g.f35677b.edit();
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
                    ((C4348n) c4300b.f35652e).f35724b.set((C4352o) s9.f1665c);
                    C4387x c4387x = (C4387x) c4300b.i;
                    c4387x.a((Queue) c4387x.f35787f.get(), 8, 9, null);
                    ((O) c4300b.f35655h).f35583a.execute(new C2.y(12, c4300b, dVar, s9));
                    return;
                } catch (C4341l0 e9) {
                    C4387x c4387x2 = (C4387x) c4300b.i;
                    c4387x2.a((Queue) c4387x2.f35787f.get(), 8, 9, "RequestConsentUpdate exception. Error: " + e9.getMessage() + ", cause: " + String.valueOf(e9.getCause()));
                    final int i6 = 0;
                    ((Handler) c4300b.f35649b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    cVar.onConsentInfoUpdateFailure(e9.a());
                                    break;
                                default:
                                    cVar.onConsentInfoUpdateFailure(e9.a());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e10) {
                    C4387x c4387x3 = (C4387x) c4300b.i;
                    c4387x3.a((Queue) c4387x3.f35787f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e10.getMessage())));
                    final int i9 = 1;
                    final C4341l0 c4341l0 = new C4341l0(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e10))));
                    ((Handler) c4300b.f35649b).post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    cVar.onConsentInfoUpdateFailure(c4341l0.a());
                                    break;
                                default:
                                    cVar.onConsentInfoUpdateFailure(c4341l0.a());
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }

    public l(T0.q qVar, U0.k kVar, UUID uuid, J0.j jVar, Context context) {
        this.f1706n = 1;
        this.f1711y = qVar;
        this.f1707u = kVar;
        this.f1708v = uuid;
        this.f1709w = jVar;
        this.f1710x = context;
    }
}
