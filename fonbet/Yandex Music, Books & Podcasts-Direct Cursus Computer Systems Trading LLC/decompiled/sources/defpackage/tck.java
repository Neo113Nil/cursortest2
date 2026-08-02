package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tck extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final q43 e;
    public final mck f;
    public final ick g;
    public final xdr h;
    public final x0q i;
    public final AtomicBoolean j;
    public hck k;

    public tck(s63 s63Var, q43 q43Var) {
        l18 l18Var = l18.b;
        bdt I = hag.I(mck.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        mck mckVar = (mck) qdcVar.C(I);
        drf drfVar = s63Var.a;
        this.d = bow.s((uvn) drfVar);
        this.e = q43Var;
        this.f = mckVar;
        this.g = (ick) drfVar;
        this.h = ydr.a(new ock(true));
        this.i = y0q.b(0, 0, null, 7);
        this.j = new AtomicBoolean(false);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof pck;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r13.a(false, r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r13.a(true, r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        rck rckVar;
        int i;
        rj6 rj6Var;
        boolean z2 = z;
        if (cg6Var instanceof rck) {
            rckVar = (rck) cg6Var;
            int i2 = rckVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rckVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rckVar.k;
                nm6 nm6Var = nm6.a;
                i = rckVar.m;
                xdr xdrVar = this.h;
                ick ickVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        ock ockVar = new ock(true);
                        xdrVar.getClass();
                        xdrVar.m(null, ockVar);
                    }
                    rckVar.j = z2;
                    rckVar.m = 1;
                    obj = this.f.a(ickVar, z2, rckVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(ickVar);
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return new b73(ickVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = rckVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    this.k = null;
                    if (!n()) {
                        ock ockVar2 = new ock(false);
                        xdrVar.getClass();
                        xdrVar.m(null, ockVar2);
                    }
                    return new c73(ickVar);
                }
                hck hckVar = (hck) ((qj6) rj6Var).a;
                this.k = hckVar;
                boolean z3 = hckVar instanceof fck;
                byd bydVar = this.d;
                q43 q43Var = this.e;
                if (z3) {
                    q43.c(q43Var, 1);
                    fck fckVar = (fck) hckVar;
                    pck pckVar = new pck(fckVar.b, fckVar.c, fckVar.d, fckVar.e, fckVar.f);
                    xdrVar.getClass();
                    xdrVar.m(null, pckVar);
                    rckVar.j = z2;
                    rckVar.m = 2;
                } else {
                    if (!Intrinsics.d(hckVar, gck.a)) {
                        b6e.s();
                        return null;
                    }
                    q43.c(q43Var, 0);
                    b(true);
                    rckVar.j = z2;
                    rckVar.m = 3;
                }
                return nm6Var;
            }
        }
        rckVar = new rck(this, cg6Var);
        Object obj2 = rckVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rckVar.m;
        xdr xdrVar2 = this.h;
        ick ickVar2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r7.i.emit(defpackage.nck.a, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (o(true, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(cg6 cg6Var) {
        sck sckVar;
        int i;
        boolean z;
        boolean andSet;
        hck hckVar;
        if (cg6Var instanceof sck) {
            sckVar = (sck) cg6Var;
            int i2 = sckVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sckVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sckVar.k;
                Object obj2 = nm6.a;
                i = sckVar.m;
                z = false;
                if (i != 0) {
                    qgg.h0(obj);
                    andSet = this.j.getAndSet(false);
                    if (andSet) {
                        sckVar.j = andSet;
                        sckVar.m = 1;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                andSet = sckVar.j;
                qgg.h0(obj);
                hckVar = this.k;
                if (!(hckVar instanceof fck)) {
                    z = ((fck) hckVar).d;
                } else if (Intrinsics.d(hckVar, gck.a)) {
                    z = true;
                } else if (hckVar != null) {
                    b6e.s();
                    return null;
                }
                if (z) {
                    sckVar.j = andSet;
                    sckVar.m = 2;
                }
                return Unit.a;
            }
        }
        sckVar = new sck(this, cg6Var);
        Object obj3 = sckVar.k;
        Object obj22 = nm6.a;
        i = sckVar.m;
        z = false;
        if (i != 0) {
        }
        hckVar = this.k;
        if (!(hckVar instanceof fck)) {
        }
        if (z) {
        }
        return Unit.a;
    }
}
