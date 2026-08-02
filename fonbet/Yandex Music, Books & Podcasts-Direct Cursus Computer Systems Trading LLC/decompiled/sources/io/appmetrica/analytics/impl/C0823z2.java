package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0823z2 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final Qb a;
    public final C0396k7 b = R4.l().n();
    public final C0310h7 c = new C0310h7();
    public final Iq d = new Iq();

    public C0823z2(C0166c7 c0166c7) {
        this.a = c0166c7;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        try {
            e.set(true);
            Qb qb = this.a;
            Bq apply = this.c.apply(thread);
            Iq iq = this.d;
            Thread a = iq.a.a();
            ArrayList a2 = iq.a(a, thread);
            if (thread != a) {
                try {
                    stackTraceElementArr = iq.a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a2.add(0, (Bq) iq.b.apply(a, stackTraceElementArr));
            }
            qb.a(th, new Z(apply, a2, this.b.a.a()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
