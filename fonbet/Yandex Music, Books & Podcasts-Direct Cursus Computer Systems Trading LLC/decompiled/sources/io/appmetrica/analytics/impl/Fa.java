package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class Fa {
    public final ReentrantLock a;
    public final C0285gb b;

    public Fa(Context context, String str) {
        this(new ReentrantLock(), new C0285gb(context, str));
    }

    public final void a() {
        this.a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.a.unlock();
    }

    public final void c() {
        C0285gb c0285gb = this.b;
        synchronized (c0285gb) {
            c0285gb.b();
            c0285gb.a.delete();
        }
        this.a.unlock();
    }

    public Fa(ReentrantLock reentrantLock, C0285gb c0285gb) {
        this.a = reentrantLock;
        this.b = c0285gb;
    }
}
