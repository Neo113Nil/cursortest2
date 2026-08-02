package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q63 implements l63 {
    public final jyr a;

    public q63(cc7 cc7Var, String str) {
        str.getClass();
        this.a = btf.b(new ap1(10, cc7Var, str));
    }

    @Override // defpackage.l63
    public final Object a(wfm wfmVar, boolean z, Continuation continuation) {
        if (wfmVar.d() != f73.d) {
            return Unit.a;
        }
        Object a = lmm.a((wb7) this.a.getValue(), new p63(this, wfmVar, z, null), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.l63
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(wfm wfmVar, Continuation continuation) {
        o63 o63Var;
        int i;
        Boolean bool;
        if (continuation instanceof o63) {
            o63Var = (o63) continuation;
            int i2 = o63Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o63Var.m = i2 - Integer.MIN_VALUE;
                Object obj = o63Var.k;
                nm6 nm6Var = nm6.a;
                i = o63Var.m;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    f73 d = wfmVar.d();
                    int i3 = d == null ? -1 : m63.a[d.ordinal()];
                    if (i3 == -1 || i3 == 1) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    if (i3 != 2) {
                        b6e.s();
                        return null;
                    }
                    pjc data = ((wb7) this.a.getValue()).getData();
                    o63Var.j = wfmVar;
                    o63Var.m = 1;
                    obj = zsd.g0(data, o63Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wfmVar = o63Var.j;
                    qgg.h0(obj);
                }
                String c = wfmVar.c();
                c.getClass();
                hmm.a aVar = new hmm.a(c);
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                bool = (Boolean) lpiVar.a.get(aVar);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                return Boolean.valueOf(z);
            }
        }
        o63Var = new o63(this, (cg6) continuation);
        Object obj2 = o63Var.k;
        nm6 nm6Var2 = nm6.a;
        i = o63Var.m;
        boolean z2 = true;
        if (i != 0) {
        }
        String c2 = wfmVar.c();
        c2.getClass();
        hmm.a aVar2 = new hmm.a(c2);
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        bool = (Boolean) lpiVar2.a.get(aVar2);
        if (bool != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wfm wfmVar, cg6 cg6Var) {
        n63 n63Var;
        int i;
        if (cg6Var instanceof n63) {
            n63Var = (n63) cg6Var;
            int i2 = n63Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n63Var.m = i2 - Integer.MIN_VALUE;
                Object obj = n63Var.k;
                nm6 nm6Var = nm6.a;
                i = n63Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) this.a.getValue()).getData();
                    n63Var.j = wfmVar;
                    n63Var.m = 1;
                    obj = zsd.g0(data, n63Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wfmVar = n63Var.j;
                    qgg.h0(obj);
                }
                String c = wfmVar.c();
                c.getClass();
                hmm.a aVar = new hmm.a(c);
                lpi lpiVar = (lpi) ((hmm) obj);
                lpiVar.getClass();
                return lpiVar.a.get(aVar);
            }
        }
        n63Var = new n63(this, cg6Var);
        Object obj2 = n63Var.k;
        nm6 nm6Var2 = nm6.a;
        i = n63Var.m;
        if (i != 0) {
        }
        String c2 = wfmVar.c();
        c2.getClass();
        hmm.a aVar2 = new hmm.a(c2);
        lpi lpiVar2 = (lpi) ((hmm) obj2);
        lpiVar2.getClass();
        return lpiVar2.a.get(aVar2);
    }
}
