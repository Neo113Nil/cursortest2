package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366e {

    /* renamed from: g, reason: collision with root package name */
    public static final long f5850g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f5851h = "WatchDog-" + ThreadFactoryC0924zd.f7275a.incrementAndGet();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f5852a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5853b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5854c;

    /* renamed from: d, reason: collision with root package name */
    public C0341d f5855d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f5857f;

    public C0366e(Db db) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f5852a = copyOnWriteArrayList;
        this.f5853b = new AtomicInteger();
        this.f5854c = new Handler(Looper.getMainLooper());
        this.f5856e = new AtomicBoolean();
        this.f5857f = new F0.a(6, this);
        copyOnWriteArrayList.add(db);
    }

    public final /* synthetic */ void a() {
        this.f5856e.set(true);
    }

    public final synchronized void b() {
        C0341d c0341d = this.f5855d;
        if (c0341d != null) {
            c0341d.f5771a.set(false);
            this.f5855d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i2) {
        AtomicInteger atomicInteger = this.f5853b;
        int i3 = 5;
        if (i2 >= 5) {
            i3 = i2;
        }
        atomicInteger.set(i3);
        if (this.f5855d == null) {
            C0341d c0341d = new C0341d(this);
            this.f5855d = c0341d;
            try {
                c0341d.setName(f5851h);
            } catch (SecurityException unused) {
            }
            this.f5855d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i2));
        }
    }
}
