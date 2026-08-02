package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fq7 implements p3c {
    public final szm a;
    public final szm b;
    public final uto c;
    public final szm d;
    public final szm e;

    public fq7(szm szmVar, szm szmVar2, uto utoVar, szm szmVar3, szm szmVar4) {
        this.a = szmVar;
        this.b = szmVar2;
        this.c = utoVar;
        this.d = szmVar3;
        this.e = szmVar4;
    }

    @Override // defpackage.szm
    public final Object get() {
        return new eq7((Executor) this.a.get(), (v2i) this.b.get(), (ime) this.c.get(), (bko) this.d.get(), (bko) this.e.get());
    }
}
