package com.yandex.plus.metrica.utils;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class j implements a0 {
    public final ReentrantLock a = new ReentrantLock();
    public volatile String b;
    public volatile String c;

    public final void a(String str) {
        if (Intrinsics.d(this.b, str)) {
            return;
        }
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!Intrinsics.d(this.b, str)) {
                this.b = str;
                this.c = null;
                try {
                    b();
                } catch (Throwable th) {
                    Timber.INSTANCE.tag("Metrica7RtmConfigUpdater").e("Can't update config for RTM!", th);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void b();
}
