package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0137b7 implements Qb {
    public final InterfaceC0108a7 a;
    public final ICrashTransformer b;
    public final Ua c;

    public AbstractC0137b7(InterfaceC0108a7 interfaceC0108a7, ICrashTransformer iCrashTransformer, Ua ua) {
        this.a = interfaceC0108a7;
        this.b = iCrashTransformer;
        this.c = ua;
    }

    @Override // io.appmetrica.analytics.impl.Qb
    public final void a(Throwable th, @NonNull Z z) {
        if (this.a.a(th)) {
            ICrashTransformer iCrashTransformer = this.b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Vq a = Yq.a(th, z, null, (String) this.c.b.a(), (Boolean) this.c.c.a());
                Gd gd = (Gd) ((C0236ek) this).d;
                gd.a.a().a(gd.b).a(a);
            }
        }
    }

    public final InterfaceC0108a7 b() {
        return this.a;
    }

    public final ICrashTransformer a() {
        return this.b;
    }
}
