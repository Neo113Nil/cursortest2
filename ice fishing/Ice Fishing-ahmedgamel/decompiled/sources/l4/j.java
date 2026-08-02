package l4;

import Z0.CallableC0421d;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import l3.InterfaceC4673a;
import n.ExecutorC4756a;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f38927c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static B f38928d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f38929a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38930b;

    public j(ExecutorService executorService) {
        this.f38930b = new s.b();
        this.f38929a = executorService;
    }

    public static l3.m a(Context context, Intent intent, boolean z6) {
        B b9;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f38927c) {
            try {
                if (f38928d == null) {
                    f38928d = new B(context);
                }
                b9 = f38928d;
            } finally {
            }
        }
        if (!z6) {
            return b9.b(intent).d(new ExecutorC4756a(1), new com.anythink.core.common.n.b.A(11));
        }
        if (q.g().i(context)) {
            synchronized (y.f38985b) {
                try {
                    y.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        y.f38986c.a(y.f38984a);
                    }
                    l3.m b10 = b9.b(intent);
                    J3.l lVar = new J3.l(11, intent);
                    b10.getClass();
                    b10.f38882b.f(new l3.k(l3.i.f38871a, lVar));
                    b10.o();
                } finally {
                }
            }
        } else {
            b9.b(intent);
        }
        return com.bumptech.glide.d.r(-1);
    }

    public l3.m b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean f2 = V2.b.f();
        final Context context = (Context) this.f38929a;
        boolean z6 = f2 && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z9 = (intent.getFlags() & 268435456) != 0;
        if (z6 && !z9) {
            return a(context, intent, z9);
        }
        ExecutorC4756a executorC4756a = (ExecutorC4756a) this.f38930b;
        return com.bumptech.glide.d.g(new CallableC0421d(1, context, intent), executorC4756a).e(executorC4756a, new InterfaceC4673a() { // from class: l4.i
            @Override // l3.InterfaceC4673a
            public final Object g(l3.m mVar) {
                return (V2.b.f() && ((Integer) mVar.g()).intValue() == 402) ? j.a(context, intent, z9).d(new ExecutorC4756a(1), new com.anythink.core.common.n.b.A(10)) : mVar;
            }
        });
    }

    public j(Context context) {
        this.f38929a = context;
        this.f38930b = new ExecutorC4756a(1);
    }
}
