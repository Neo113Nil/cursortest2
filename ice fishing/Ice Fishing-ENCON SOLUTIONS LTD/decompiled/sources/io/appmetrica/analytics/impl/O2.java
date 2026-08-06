package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class O2 implements InterfaceC0568lk {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4849a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f4850b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4851c;

    /* renamed from: d, reason: collision with root package name */
    public final G5 f4852d;

    /* renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f4853e;

    public O2(Context context, IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    public final synchronized Intent a(Consumer<Intent> consumer) {
        this.f4849a.add(consumer);
        return this.f4850b;
    }

    public final void b() {
        this.f4850b = null;
        G5 g5 = this.f4852d;
        Context context = this.f4851c;
        synchronized (g5) {
            if (g5.f4412b) {
                try {
                    context.unregisterReceiver(g5.f4411a);
                    g5.f4412b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final synchronized void onCreate() {
        Intent a2 = a();
        this.f4850b = a2;
        Iterator it = this.f4849a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(a2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0568lk
    public final synchronized void onDestroy() {
        this.f4850b = null;
        b();
        Iterator it = this.f4849a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public O2(Context context, IHandlerExecutor iHandlerExecutor, int i2) {
        this.f4849a = new ArrayList();
        this.f4850b = null;
        this.f4851c = context;
        this.f4853e = iHandlerExecutor;
        this.f4852d = F5.a(new C0757t2(new N2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        G5 g5 = this.f4852d;
        Context context = this.f4851c;
        IHandlerExecutor iHandlerExecutor = this.f4853e;
        synchronized (g5) {
            intent = null;
            try {
                intent = context.registerReceiver(g5.f4411a, intentFilter, null, iHandlerExecutor.getHandler());
                g5.f4412b = true;
            } catch (Throwable unused) {
            }
        }
        return intent;
    }
}
