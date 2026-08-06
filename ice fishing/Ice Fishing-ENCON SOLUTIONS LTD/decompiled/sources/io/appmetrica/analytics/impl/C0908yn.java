package io.appmetrica.analytics.impl;

import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908yn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f7260a = new CopyOnWriteArrayList();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Iterator it = this.f7260a.iterator();
        while (it.hasNext()) {
            ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
        }
    }
}
