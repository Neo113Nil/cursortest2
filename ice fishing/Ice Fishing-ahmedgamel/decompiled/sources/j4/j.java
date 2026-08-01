package j4;

import X0.CallableC0417d;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import j3.InterfaceC4604a;
import java.util.concurrent.ExecutorService;
import n.ExecutorC4742a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f38415c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ServiceConnectionC4606B f38416d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f38417a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38418b;

    public j(ExecutorService executorService) {
        this.f38418b = new s.b();
        this.f38417a = executorService;
    }

    public static j3.m a(Context context, Intent intent, boolean z3) {
        ServiceConnectionC4606B serviceConnectionC4606B;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f38415c) {
            try {
                if (f38416d == null) {
                    f38416d = new ServiceConnectionC4606B(context);
                }
                serviceConnectionC4606B = f38416d;
            } finally {
            }
        }
        if (!z3) {
            return serviceConnectionC4606B.b(intent).d(new ExecutorC4742a(1), new d4.f(9));
        }
        if (q.b().d(context)) {
            synchronized (y.f38473b) {
                try {
                    y.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        y.f38474c.a(y.f38472a);
                    }
                    j3.m b9 = serviceConnectionC4606B.b(intent);
                    H3.l lVar = new H3.l(11, intent);
                    b9.getClass();
                    b9.f38370b.f(new j3.k(j3.i.f38359a, lVar));
                    b9.o();
                } finally {
                }
            }
        } else {
            serviceConnectionC4606B.b(intent);
        }
        return S0.f.i(-1);
    }

    public j3.m b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean f3 = T2.b.f();
        final Context context = (Context) this.f38417a;
        boolean z3 = f3 && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z6 = (intent.getFlags() & 268435456) != 0;
        if (z3 && !z6) {
            return a(context, intent, z6);
        }
        ExecutorC4742a executorC4742a = (ExecutorC4742a) this.f38418b;
        return S0.f.d(new CallableC0417d(1, context, intent), executorC4742a).e(executorC4742a, new InterfaceC4604a() { // from class: j4.i
            @Override // j3.InterfaceC4604a
            public final Object h(j3.m mVar) {
                return (T2.b.f() && ((Integer) mVar.g()).intValue() == 402) ? j.a(context, intent, z6).d(new ExecutorC4742a(1), new d4.f(8)) : mVar;
            }
        });
    }

    public j(Context context) {
        this.f38417a = context;
        this.f38418b = new ExecutorC4742a(1);
    }
}
