package com.bumptech.glide.manager;

import B1.y;
import S0.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC0480x;
import androidx.lifecycle.AbstractC0498p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    public static final E3.e f23456w = new E3.e();

    /* renamed from: n, reason: collision with root package name */
    public volatile com.bumptech.glide.p f23457n;

    /* renamed from: u, reason: collision with root package name */
    public final f f23458u;

    /* renamed from: v, reason: collision with root package name */
    public final s f23459v = new s(f23456w);

    public k() {
        this.f23458u = (y.f163f && y.f162e) ? new e() : new E3.e();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.p b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = N1.p.f1932a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0480x) {
                AbstractActivityC0480x abstractActivityC0480x = (AbstractActivityC0480x) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC0480x.getApplicationContext());
                }
                if (abstractActivityC0480x.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f23458u.l(abstractActivityC0480x);
                Activity a9 = a(abstractActivityC0480x);
                boolean z3 = a9 == null || !a9.isFinishing();
                com.bumptech.glide.c a10 = com.bumptech.glide.c.a(abstractActivityC0480x.getApplicationContext());
                AbstractC0498p lifecycle = abstractActivityC0480x.getLifecycle();
                abstractActivityC0480x.getSupportFragmentManager();
                s sVar = this.f23459v;
                sVar.getClass();
                N1.p.a();
                N1.p.a();
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) ((HashMap) sVar.f2840u).get(lifecycle);
                if (pVar != null) {
                    return pVar;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                a4.e eVar = new a4.e();
                ((E3.e) sVar.f2841v).getClass();
                com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(a10, lifecycleLifecycle, eVar, abstractActivityC0480x);
                ((HashMap) sVar.f2840u).put(lifecycle, pVar2);
                lifecycleLifecycle.c(new i(sVar, lifecycle));
                if (z3) {
                    pVar2.onStart();
                }
                return pVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f23457n == null) {
            synchronized (this) {
                try {
                    if (this.f23457n == null) {
                        this.f23457n = new com.bumptech.glide.p(com.bumptech.glide.c.a(context.getApplicationContext()), new M2.i(15), new M2.i(16), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f23457n;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
