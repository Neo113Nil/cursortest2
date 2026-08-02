package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import defpackage.ymp0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0289e {
    public static final long g = 1000;
    public static final String h = "WatchDog-" + ThreadFactoryC0450jg.a.incrementAndGet();
    public final CopyOnWriteArrayList a;
    public final AtomicInteger b;
    public final Handler c;
    public C0261d d;
    public final AtomicBoolean e;
    public final Runnable f;

    public C0289e(C0736td c0736td) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        this.b = new AtomicInteger();
        this.c = new Handler(Looper.getMainLooper());
        this.e = new AtomicBoolean();
        this.f = new ymp0(19, this);
        copyOnWriteArrayList.add(c0736td);
    }

    public final synchronized void a(int i) {
        AtomicInteger atomicInteger = this.b;
        int i2 = 5;
        if (i >= 5) {
            i2 = i;
        }
        atomicInteger.set(i2);
        if (this.d == null) {
            C0261d c0261d = new C0261d(this);
            this.d = c0261d;
            try {
                c0261d.setName(h);
            } catch (SecurityException unused) {
            }
            this.d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i));
        }
    }

    public final synchronized void b() {
        C0261d c0261d = this.d;
        if (c0261d != null) {
            c0261d.a.set(false);
            this.d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final /* synthetic */ void a() {
        this.e.set(true);
    }
}
