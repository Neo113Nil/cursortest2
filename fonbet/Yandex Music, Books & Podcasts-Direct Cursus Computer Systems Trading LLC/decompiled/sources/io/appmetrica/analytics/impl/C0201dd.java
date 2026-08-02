package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0201dd implements InterfaceC0158c {
    public final InterfaceC0389k0 a;
    public final Iq b = new Iq();

    public C0201dd(@NotNull InterfaceC0389k0 interfaceC0389k0) {
        this.a = interfaceC0389k0;
    }

    public static final void a(C0201dd c0201dd, Z z) {
        c0201dd.a.a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0158c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Iq iq = this.b;
        Thread a = iq.a.a();
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
        Z z = new Z((Bq) iq.b.apply(a, stackTraceElementArr), iq.a(a, null), iq.c.a());
        ((Ha) R4.l().c.a()).b.post(new com.yandex.passport.internal.interaction.c(11, this, z));
    }
}
