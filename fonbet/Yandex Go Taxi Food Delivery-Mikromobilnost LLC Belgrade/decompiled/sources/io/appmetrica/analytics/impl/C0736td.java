package io.appmetrica.analytics.impl;

import defpackage.fe71;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0736td implements InterfaceC0232c {
    public final InterfaceC0521m0 a;
    public final C0231br b = new C0231br();

    public C0736td(InterfaceC0521m0 interfaceC0521m0) {
        this.a = interfaceC0521m0;
    }

    public static final void a(C0736td c0736td, C0204b0 c0204b0) {
        c0736td.a.a(c0204b0);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0232c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        C0231br c0231br = this.b;
        Thread a = c0231br.a.a();
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
        C0204b0 c0204b0 = new C0204b0((Uq) c0231br.b.apply(a, stackTraceElementArr), c0231br.a(a, null), c0231br.c.a());
        ((Pa) V4.l().c.a()).b.post(new fe71(10, this, c0204b0));
    }
}
