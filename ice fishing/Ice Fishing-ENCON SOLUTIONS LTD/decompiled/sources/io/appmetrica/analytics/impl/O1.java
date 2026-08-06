package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f4844e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Fa f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final C0709r6 f4846b = C0294b4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C0632o6 f4847c = new C0632o6();

    /* renamed from: d, reason: collision with root package name */
    public final Dn f4848d = new Dn();

    public O1(C0528k6 c0528k6) {
        this.f4845a = c0528k6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f4844e.set(true);
            Fa fa = this.f4845a;
            C0856wn apply = this.f4847c.apply(thread);
            Dn dn = this.f4848d;
            Thread a2 = dn.f4327a.a();
            ArrayList a3 = dn.a(a2, thread);
            if (thread != a2) {
                try {
                    stackTraceElementArr = dn.f4327a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a2.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a3.add(0, (C0856wn) dn.f4328b.apply(a2, stackTraceElementArr));
            }
            fa.a(th, new V(apply, a3, this.f4846b.f6811a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
