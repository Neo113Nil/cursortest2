package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0868x9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f7194a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9 f7195b;

    public C0868x9(Context context, String str) {
        this(new ReentrantLock(), new Y9(context, str));
    }

    public final void a() {
        this.f7194a.lock();
        this.f7195b.a();
    }

    public final void b() {
        this.f7195b.b();
        this.f7194a.unlock();
    }

    public final void c() {
        Y9 y9 = this.f7195b;
        synchronized (y9) {
            y9.b();
            y9.f5424a.delete();
        }
        this.f7194a.unlock();
    }

    public C0868x9(ReentrantLock reentrantLock, Y9 y9) {
        this.f7194a = reentrantLock;
        this.f7195b = y9;
    }
}
