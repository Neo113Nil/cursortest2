package com.bumptech.glide.manager;

import B1.x;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC0490x;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC0508p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    public static final C3.e f23612w = new C3.e();

    /* renamed from: n, reason: collision with root package name */
    public volatile com.bumptech.glide.p f23613n;

    /* renamed from: u, reason: collision with root package name */
    public final f f23614u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.c f23615v = new S0.c(f23612w);

    public k() {
        this.f23614u = (x.f128f && x.f127e) ? new e() : new C3.e();
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
        char[] cArr = N1.p.f1976a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0490x) {
                AbstractActivityC0490x abstractActivityC0490x = (AbstractActivityC0490x) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC0490x.getApplicationContext());
                }
                if (abstractActivityC0490x.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f23614u.b(abstractActivityC0490x);
                Activity a9 = a(abstractActivityC0490x);
                boolean z8 = a9 == null || !a9.isFinishing();
                com.bumptech.glide.c a10 = com.bumptech.glide.c.a(abstractActivityC0490x.getApplicationContext());
                AbstractC0508p lifecycle = abstractActivityC0490x.getLifecycle();
                N supportFragmentManager = abstractActivityC0490x.getSupportFragmentManager();
                S0.c cVar = this.f23615v;
                cVar.getClass();
                N1.p.a();
                N1.p.a();
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) ((HashMap) cVar.f2886u).get(lifecycle);
                if (pVar != null) {
                    return pVar;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                W3.e eVar = new W3.e(cVar, supportFragmentManager);
                ((C3.e) cVar.f2887v).getClass();
                com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(a10, lifecycleLifecycle, eVar, abstractActivityC0490x);
                ((HashMap) cVar.f2886u).put(lifecycle, pVar2);
                lifecycleLifecycle.b(new i(cVar, lifecycle));
                if (z8) {
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
        if (this.f23613n == null) {
            synchronized (this) {
                try {
                    if (this.f23613n == null) {
                        this.f23613n = new com.bumptech.glide.p(com.bumptech.glide.c.a(context.getApplicationContext()), new L2.i(15), new L2.i(16), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f23613n;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
