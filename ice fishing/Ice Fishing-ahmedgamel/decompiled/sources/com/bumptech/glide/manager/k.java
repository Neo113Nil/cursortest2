package com.bumptech.glide.manager;

import D1.x;
import S0.s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC0484x;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC0502p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    public static final c4.e f24243w = new c4.e();

    /* renamed from: n, reason: collision with root package name */
    public volatile com.bumptech.glide.p f24244n;

    /* renamed from: u, reason: collision with root package name */
    public final f f24245u;

    /* renamed from: v, reason: collision with root package name */
    public final s f24246v = new s(f24243w);

    public k() {
        this.f24245u = (x.f576f && x.f575e) ? new e() : new c4.e();
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
        char[] cArr = P1.p.f2376a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0484x) {
                AbstractActivityC0484x abstractActivityC0484x = (AbstractActivityC0484x) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(abstractActivityC0484x.getApplicationContext());
                }
                if (abstractActivityC0484x.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f24245u.h(abstractActivityC0484x);
                Activity a9 = a(abstractActivityC0484x);
                boolean z6 = a9 == null || !a9.isFinishing();
                com.bumptech.glide.c a10 = com.bumptech.glide.c.a(abstractActivityC0484x.getApplicationContext());
                AbstractC0502p lifecycle = abstractActivityC0484x.getLifecycle();
                N supportFragmentManager = abstractActivityC0484x.getSupportFragmentManager();
                s sVar = this.f24246v;
                sVar.getClass();
                P1.p.a();
                P1.p.a();
                com.bumptech.glide.p pVar = (com.bumptech.glide.p) ((HashMap) sVar.f2969u).get(lifecycle);
                if (pVar != null) {
                    return pVar;
                }
                LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
                O2.i iVar = new O2.i(sVar, supportFragmentManager);
                ((c4.e) sVar.f2970v).getClass();
                com.bumptech.glide.p pVar2 = new com.bumptech.glide.p(a10, lifecycleLifecycle, iVar, abstractActivityC0484x);
                ((HashMap) sVar.f2969u).put(lifecycle, pVar2);
                lifecycleLifecycle.h(new i(sVar, lifecycle));
                if (z6) {
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
        if (this.f24244n == null) {
            synchronized (this) {
                try {
                    if (this.f24244n == null) {
                        this.f24244n = new com.bumptech.glide.p(com.bumptech.glide.c.a(context.getApplicationContext()), new G3.e(17), new G3.e(18), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f24244n;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
