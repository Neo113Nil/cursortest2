package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class eqp {
    public final pqp a;
    public final tpp b;
    public final hsp c;
    public final jsp d;
    public final boolean e;
    public final dn9 f;
    public final ofj g;
    public final xdr h;
    public final dkn i;
    public final x0q j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final xdr v;

    public eqp(pqp pqpVar, tpp tppVar, hsp hspVar, jsp jspVar, boolean z, dn9 dn9Var, ofj ofjVar) {
        pqpVar.getClass();
        tppVar.getClass();
        hspVar.getClass();
        jspVar.getClass();
        dn9Var.getClass();
        ofjVar.getClass();
        this.a = pqpVar;
        this.b = tppVar;
        this.c = hspVar;
        this.d = jspVar;
        this.e = z;
        this.f = dn9Var;
        this.g = ofjVar;
        this.h = pqpVar.k;
        this.i = pqpVar.J;
        this.j = y0q.a(1, 1, oi3.b);
        bdt I = hag.I(Context.class);
        l18 l18Var = l18.b;
        l18Var.b(I, true);
        this.k = l18Var.b(hag.I(t8q.class), true);
        this.l = l18Var.b(hag.I(d0q.class), true);
        this.m = l18Var.b(hag.I(syp.class), true);
        this.n = l18Var.b(hag.I(m8q.class), true);
        this.o = l18Var.b(hag.I(ezb.class), true);
        this.p = l18Var.b(hag.I(wst.class), true);
        this.q = l18Var.b(hag.I(frt.class), true);
        this.r = l18Var.b(hag.I(p8q.class), true);
        this.s = l18Var.b(hag.I(r2q.class), true);
        this.t = l18Var.b(hag.I(n8q.class), true);
        this.u = l18Var.b(hag.I(hyp.class), true);
        this.v = pqpVar.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r9.invoke(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (defpackage.zsd.h0(r3, r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(msp mspVar, bun bunVar, cg6 cg6Var) {
        dqp dqpVar;
        int i;
        if (cg6Var instanceof dqp) {
            dqpVar = (dqp) cg6Var;
            int i2 = dqpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqpVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dqpVar.k;
                nm6 nm6Var = nm6.a;
                i = dqpVar.m;
                x0q x0qVar = this.j;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    n6p n6pVar = new n6p(mspVar, continuation, 2);
                    dqpVar.j = bunVar;
                    dqpVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bunVar = dqpVar.j;
                    qgg.h0(obj);
                }
                x0qVar.g();
                dqpVar.j = null;
                dqpVar.m = 2;
            }
        }
        dqpVar = new dqp(this, cg6Var);
        Object obj2 = dqpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dqpVar.m;
        x0q x0qVar2 = this.j;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        x0qVar2.g();
        dqpVar.j = null;
        dqpVar.m = 2;
    }
}
