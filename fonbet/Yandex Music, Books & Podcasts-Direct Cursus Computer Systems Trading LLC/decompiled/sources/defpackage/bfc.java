package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class bfc implements o3c {
    public final soe a;
    public final szm b;
    public final szm c;
    public final szm d;

    public bfc(soe soeVar, szm szmVar, szm szmVar2, szm szmVar3) {
        this.a = soeVar;
        this.b = szmVar;
        this.c = szmVar2;
        this.d = szmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        return new sec((aec) this.a.a, (lnp) this.b.get(), (CoroutineContext) this.c.get(), (hmp) this.d.get());
    }
}
