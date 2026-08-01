package androidx.lifecycle;

import Z.AbstractComponentCallbacksC0070s;

/* loaded from: classes.dex */
public final class x extends y implements InterfaceC0100q {
    public final AbstractComponentCallbacksC0070s e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f2055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s, h0.m mVar) {
        super(zVar, mVar);
        this.f2055f = zVar;
        this.e = abstractComponentCallbacksC0070s;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = this.e;
        EnumC0097n enumC0097n = abstractComponentCallbacksC0070s.f1592O.f2048c;
        if (enumC0097n != EnumC0097n.f2038a) {
            EnumC0097n enumC0097n2 = null;
            while (enumC0097n2 != enumC0097n) {
                b(e());
                enumC0097n2 = enumC0097n;
                enumC0097n = abstractComponentCallbacksC0070s.f1592O.f2048c;
            }
            return;
        }
        z zVar = this.f2055f;
        zVar.getClass();
        z.a("removeObserver");
        y yVar = (y) zVar.f2061b.b(this.f2056a);
        if (yVar == null) {
            return;
        }
        yVar.c();
        yVar.b(false);
    }

    @Override // androidx.lifecycle.y
    public final void c() {
        this.e.f1592O.f(this);
    }

    @Override // androidx.lifecycle.y
    public final boolean d(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        return this.e == abstractComponentCallbacksC0070s;
    }

    @Override // androidx.lifecycle.y
    public final boolean e() {
        return this.e.f1592O.f2048c.compareTo(EnumC0097n.f2041d) >= 0;
    }
}
