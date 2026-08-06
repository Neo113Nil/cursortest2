package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0502j6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0477i6 f6251a;

    /* renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f6252b;

    /* renamed from: c, reason: collision with root package name */
    public final M9 f6253c;

    public AbstractC0502j6(InterfaceC0477i6 interfaceC0477i6, ICrashTransformer iCrashTransformer, M9 m9) {
        this.f6251a = interfaceC0477i6;
        this.f6252b = iCrashTransformer;
        this.f6253c = m9;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final void a(Throwable th, V v2) {
        if (this.f6251a.a(th)) {
            ICrashTransformer iCrashTransformer = this.f6252b;
            if (iCrashTransformer == null || th == null || (th = iCrashTransformer.process(th)) != null) {
                Qn a2 = Tn.a(th, v2, null, (String) this.f6253c.f4745b.a(), (Boolean) this.f6253c.f4746c.a());
                C0405fc c0405fc = (C0405fc) ((Bh) this).f4221d;
                c0405fc.f5337a.a().a(c0405fc.f5976b).a(a2);
            }
        }
    }

    public final InterfaceC0477i6 b() {
        return this.f6251a;
    }

    public final ICrashTransformer a() {
        return this.f6252b;
    }
}
