package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0347g implements InterfaceC0706sc {
    public final S5 a;
    public final C0516lo b;
    public final C0689ro c;
    public final C0458jo d;
    public final InterfaceC0620pc e;
    public final SystemTimeProvider f;

    public AbstractC0347g(S5 s5, C0516lo c0516lo, C0689ro c0689ro, C0458jo c0458jo, InterfaceC0620pc interfaceC0620pc, SystemTimeProvider systemTimeProvider) {
        this.a = s5;
        this.b = c0516lo;
        this.c = c0689ro;
        this.d = c0458jo;
        this.e = interfaceC0620pc;
        this.f = systemTimeProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0706sc
    public final Wn a(Xn xn) {
        boolean b;
        if (this.c.i()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        S5 s5 = this.a;
        C0689ro c0689ro = this.c;
        long a = this.b.a();
        C0689ro c0689ro2 = this.c;
        c0689ro2.a(C0689ro.f, Long.valueOf(a));
        c0689ro2.a(C0689ro.d, Long.valueOf(xn.a));
        c0689ro2.a(C0689ro.h, Long.valueOf(xn.a));
        c0689ro2.a(C0689ro.i, Long.valueOf(xn.b));
        c0689ro2.a(C0689ro.g, 0L);
        c0689ro2.a(C0689ro.j, Boolean.TRUE);
        c0689ro2.a();
        I7 i7 = this.a.e;
        EnumC0718so enumC0718so = this.d.a;
        long j = xn.b / 1000;
        i7.getClass();
        C0645q8 c0645q8 = new C0645q8(null, 1, null);
        Xj xj = (Xj) i7.e.k.a();
        Long valueOf = Long.valueOf(a);
        Long valueOf2 = Long.valueOf(j);
        String a2 = AbstractC0673r8.a(xj);
        Long valueOf3 = Long.valueOf(AbstractC0375gr.a());
        C0573nn c0573nn = AbstractC0544mn.a;
        synchronized (c0573nn) {
            b = c0573nn.b.b(true);
        }
        i7.a(c0645q8.fromModel(new C0616p8(valueOf, enumC0718so, a2, new C0587o8(valueOf2, valueOf3, Boolean.valueOf(b)))));
        return new Wn(s5, c0689ro, b(), new SystemTimeProvider());
    }

    public final Zn b() {
        Yn yn = new Yn(this.d);
        yn.h = this.c.c.a(C0689ro.j);
        yn.g = this.c.c.b(C0689ro.g);
        yn.d = this.c.c.b(C0689ro.h);
        yn.e = this.c.c.b(C0689ro.i);
        yn.c = this.c.c.b(C0689ro.f);
        yn.i = this.c.c.b(C0689ro.d);
        yn.a = this.c.c.b(C0689ro.e);
        yn.j = this.c.c.a(C0689ro.k);
        return new Zn(yn);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0706sc
    public final Wn a() {
        if (this.c.i()) {
            return new Wn(this.a, this.c, b(), this.f);
        }
        return null;
    }
}
