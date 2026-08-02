package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public final class Ma {
    public final ReentrantLock a;
    public final C0619pb b;

    public Ma(Context context, String str) {
        this(new ReentrantLock(), new C0619pb(context, str));
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
        C0619pb c0619pb = this.b;
        synchronized (c0619pb) {
            c0619pb.b();
            c0619pb.a.delete();
        }
        this.a.unlock();
    }

    public Ma(ReentrantLock reentrantLock, C0619pb c0619pb) {
        this.a = reentrantLock;
        this.b = c0619pb;
    }
}
