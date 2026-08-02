package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class D3 implements Dn {
    public final ArrayList a;
    public Intent b;
    public final Context c;
    public final B6 d;
    public final IHandlerExecutor e;

    public D3(Context context, IHandlerExecutor iHandlerExecutor, int i) {
        this.a = new ArrayList();
        this.b = null;
        this.c = context;
        this.e = iHandlerExecutor;
        this.d = A6.a(new C0380h3(new C3(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        B6 b6 = this.d;
        Context context = this.c;
        IHandlerExecutor iHandlerExecutor = this.e;
        synchronized (b6) {
            intent = null;
            try {
                intent = context.registerReceiver(b6.a, intentFilter, null, iHandlerExecutor.getHandler());
                b6.b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }

    public final void b() {
        this.b = null;
        B6 b6 = this.d;
        Context context = this.c;
        synchronized (b6) {
            if (b6.b) {
                try {
                    context.unregisterReceiver(b6.a);
                    b6.b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final synchronized void onCreate() {
        Intent a = a();
        this.b = a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Dn
    public final synchronized void onDestroy() {
        this.b = null;
        b();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.a.add(consumer);
        return this.b;
    }

    public D3(Context context, IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }
}
