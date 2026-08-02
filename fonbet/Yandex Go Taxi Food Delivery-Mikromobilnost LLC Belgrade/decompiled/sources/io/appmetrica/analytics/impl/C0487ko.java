package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.ko, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0487ko implements InterfaceC0706sc {
    public final S5 a;
    public final C0516lo b;
    public final C0689ro c;
    public final C0458jo d = C0458jo.a(EnumC0718so.BACKGROUND).b().a();

    public C0487ko(S5 s5, C0516lo c0516lo) {
        this.a = s5;
        this.b = c0516lo;
        this.c = new C0689ro(s5.i(), C0553n3.g);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0706sc
    public final Wn a(Xn xn) {
        String a;
        boolean b;
        long a2 = this.b.a();
        C0689ro c0689ro = this.c;
        c0689ro.a(C0689ro.f, Long.valueOf(a2));
        c0689ro.a(C0689ro.d, Long.valueOf(xn.a));
        c0689ro.a(C0689ro.h, Long.valueOf(xn.a));
        c0689ro.a(C0689ro.i, Long.valueOf(xn.b));
        c0689ro.a(C0689ro.g, 0L);
        c0689ro.a(C0689ro.j, Boolean.FALSE);
        c0689ro.a();
        I7 i7 = this.a.e;
        EnumC0718so enumC0718so = EnumC0718so.BACKGROUND;
        long j = xn.b / 1000;
        C0603oo c0603oo = xn.c;
        i7.getClass();
        C0645q8 c0645q8 = new C0645q8(null, 1, null);
        Xj xj = (Xj) i7.e.k.a();
        Long valueOf = Long.valueOf(a2);
        Long valueOf2 = Long.valueOf(j);
        if (c0603oo == null || (a = c0603oo.a) == null) {
            a = AbstractC0673r8.a(xj);
        }
        Long valueOf3 = Long.valueOf(AbstractC0375gr.a());
        C0573nn c0573nn = AbstractC0544mn.a;
        synchronized (c0573nn) {
            b = c0573nn.b.b(true);
        }
        i7.a(c0645q8.fromModel(new C0616p8(valueOf, enumC0718so, a, new C0587o8(valueOf2, valueOf3, Boolean.valueOf(b)))));
        Yn yn = new Yn(this.d);
        yn.h = this.c.c.a(C0689ro.j);
        yn.g = this.c.c.b(C0689ro.g);
        yn.d = this.c.c.b(C0689ro.h);
        yn.e = this.c.c.b(C0689ro.i);
        yn.c = this.c.c.b(C0689ro.f);
        yn.i = this.c.c.b(C0689ro.d);
        yn.a = this.c.c.b(C0689ro.e);
        return new Wn(this.a, this.c, new Zn(yn), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0706sc
    public final Wn a() {
        return null;
    }
}
