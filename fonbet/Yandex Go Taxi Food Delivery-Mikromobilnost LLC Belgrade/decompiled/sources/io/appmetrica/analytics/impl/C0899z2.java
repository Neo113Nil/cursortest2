package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0899z2 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final InterfaceC0331fc a;
    public final C0615p7 b = V4.l().n();
    public final C0499l7 c = new C0499l7();
    public final C0231br d = new C0231br();

    public C0899z2(C0326f7 c0326f7) {
        this.a = c0326f7;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            e.set(true);
            InterfaceC0331fc interfaceC0331fc = this.a;
            Uq apply = this.c.apply(thread);
            C0231br c0231br = this.d;
            Thread a = c0231br.a.a();
            ArrayList a2 = c0231br.a(a, thread);
            if (thread != a) {
                try {
                    stackTraceElementArr = c0231br.a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a2.add(0, (Uq) c0231br.b.apply(a, stackTraceElementArr));
            }
            interfaceC0331fc.a(th, new C0204b0(apply, a2, this.b.a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
