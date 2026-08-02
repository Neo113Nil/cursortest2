package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class chd implements svh {
    public final fzb a;
    public final jyr b;
    public volatile boolean c;
    public final AtomicReference d;
    public final AtomicLong e;
    public final AtomicReference f;
    public final mm6 g;
    public final qqi h;
    public volatile boolean i;
    public final x0q j;
    public rar k;
    public final bhd l;

    public chd(vqi vqiVar, xdr xdrVar, fzb fzbVar) {
        vqiVar.getClass();
        this.a = fzbVar;
        this.b = l18.b.b(hag.I(zzp.class), true);
        this.d = new AtomicReference(xdrVar.getValue());
        this.e = new AtomicLong(0L);
        Continuation continuation = null;
        this.f = new AtomicReference(null);
        mm6 r = hld.r(vqiVar, dm6.b());
        mm6 r2 = hld.r(vqiVar, dm6.b);
        this.g = r2;
        this.h = rqi.a();
        x0q b = y0q.b(0, 0, null, 7);
        this.j = b;
        this.l = new bhd(this, ((zgd) xdrVar.getValue()).a);
        x97.y(r, null, null, new fzb(jf0.z(xdrVar, new at5(28, this)), continuation, this, 22), 3);
        x97.y(r2, null, null, new fzb(ox6.L(b, 1000L), continuation, this, 23), 3);
    }

    @Override // defpackage.svh
    public final void c() {
        zgd zgdVar = (zgd) this.f.get();
        if (zgdVar != null) {
            this.d.set(zgdVar);
            this.l.e(zgdVar.a);
            this.f.set(null);
        }
        this.c = true;
    }

    @Override // defpackage.svh
    public final void d() {
        this.c = false;
    }

    @Override // defpackage.svh
    public final mch e() {
        return this.l;
    }
}
