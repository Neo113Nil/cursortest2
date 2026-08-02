package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e4w implements p3c {
    public final szm a;
    public final szm b;
    public final uto c;
    public final szm d;

    public e4w(szm szmVar, szm szmVar2, uto utoVar, szm szmVar3) {
        this.a = szmVar;
        this.b = szmVar2;
        this.c = utoVar;
        this.d = szmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        return new bjt((Executor) this.a.get(), (bko) this.b.get(), (ime) this.c.get(), (bko) this.d.get());
    }
}
