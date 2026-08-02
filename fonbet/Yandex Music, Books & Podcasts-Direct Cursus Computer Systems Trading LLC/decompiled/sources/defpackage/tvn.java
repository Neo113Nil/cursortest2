package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class tvn implements o3c {
    public final /* synthetic */ int a = 1;
    public final szm b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;

    public tvn(soe soeVar, szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4) {
        this.f = soeVar;
        this.b = szmVar;
        this.c = szmVar2;
        this.d = szmVar3;
        this.e = szmVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [xqf] */
    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                CoroutineContext coroutineContext = (CoroutineContext) this.b.get();
                iec iecVar = (iec) this.c.get();
                iw0 iw0Var = (iw0) this.d.get();
                rvn rvnVar = (rvn) this.e.get();
                szm szmVar = this.f;
                return new qvn(coroutineContext, iecVar, iw0Var, rvnVar, szmVar instanceof xqf ? (xqf) szmVar : new s8a(szmVar));
            default:
                return new zlp((aec) ((soe) this.f).a, (iec) this.b.get(), (lnp) this.c.get(), (eib) this.d.get(), (CoroutineContext) this.e.get());
        }
    }

    public tvn(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5) {
        this.b = szmVar;
        this.c = szmVar2;
        this.d = szmVar3;
        this.e = szmVar4;
        this.f = szmVar5;
    }
}
