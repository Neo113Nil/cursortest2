package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.e7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0297e7 implements InterfaceC0331fc {
    public final InterfaceC0269d7 a;
    public final ICrashTransformer b;
    public final C0244cb c;

    public AbstractC0297e7(InterfaceC0269d7 interfaceC0269d7, ICrashTransformer iCrashTransformer, C0244cb c0244cb) {
        this.a = interfaceC0269d7;
        this.b = iCrashTransformer;
        this.c = c0244cb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0331fc
    public final void a(Throwable th, C0204b0 c0204b0) {
        if (this.a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                C0606or a = AbstractC0692rr.a(th, c0204b0, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                Wd wd = (Wd) ((C0599ok) this).d;
                wd.a.a().a(wd.b).a(a);
            }
        }
    }

    public final InterfaceC0269d7 b() {
        return this.a;
    }

    public final ICrashTransformer a() {
        return this.b;
    }
}
