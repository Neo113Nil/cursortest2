package f4;

import X0.CallableC0410d;
import a.AbstractC0415a;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import h3.InterfaceC4567a;
import java.util.concurrent.ExecutorService;
import n.ExecutorC4797a;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f37744c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ServiceConnectionC4510A f37745d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f37746a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37747b;

    public h(ExecutorService executorService) {
        this.f37747b = new s.b();
        this.f37746a = executorService;
    }

    public static h3.n a(Context context, Intent intent, boolean z8) {
        ServiceConnectionC4510A serviceConnectionC4510A;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f37744c) {
            try {
                if (f37745d == null) {
                    f37745d = new ServiceConnectionC4510A(context);
                }
                serviceConnectionC4510A = f37745d;
            } finally {
            }
        }
        if (!z8) {
            return serviceConnectionC4510A.b(intent).d(new ExecutorC4797a(1), new com.anythink.core.common.n.b.A(8));
        }
        if (p.f().j(context)) {
            synchronized (x.f37803b) {
                try {
                    x.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        x.f37804c.a(x.f37802a);
                    }
                    h3.n b9 = serviceConnectionC4510A.b(intent);
                    F3.l lVar = new F3.l(11, intent);
                    b9.getClass();
                    b9.f38221b.f(new h3.k(h3.i.f38207a, lVar));
                    b9.o();
                } finally {
                }
            }
        } else {
            serviceConnectionC4510A.b(intent);
        }
        return AbstractC0415a.r(-1);
    }

    public h3.n b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean f6 = S2.b.f();
        final Context context = (Context) this.f37746a;
        boolean z8 = f6 && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z9 = (intent.getFlags() & 268435456) != 0;
        if (z8 && !z9) {
            return a(context, intent, z9);
        }
        ExecutorC4797a executorC4797a = (ExecutorC4797a) this.f37747b;
        return AbstractC0415a.g(new CallableC0410d(1, context, intent), executorC4797a).e(executorC4797a, new InterfaceC4567a() { // from class: f4.g
            @Override // h3.InterfaceC4567a
            public final Object s(h3.n nVar) {
                return (S2.b.f() && ((Integer) nVar.g()).intValue() == 402) ? h.a(context, intent, z9).d(new ExecutorC4797a(1), new com.anythink.core.common.n.b.A(7)) : nVar;
            }
        });
    }

    public h(Context context) {
        this.f37746a = context;
        this.f37747b = new ExecutorC4797a(1);
    }
}
