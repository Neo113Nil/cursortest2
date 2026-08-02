package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class iv0 implements dqi, av0 {
    public final dqi a;
    public final c9k b;
    public final tf6 c;
    public final nur d;
    public final uzc e;

    public iv0(Context context, dqi dqiVar, c9k c9kVar, cc7 cc7Var) {
        dqiVar.getClass();
        this.a = dqiVar;
        this.b = c9kVar;
        tf6 e = gld.e(dm6.b);
        this.c = e;
        this.d = new nur(1, new wns(cc7Var), c9kVar);
        msa msaVar = nsa.b;
        Continuation continuation = null;
        int i = 0;
        this.e = new uzc(context, new eno(new fv0(yd5.M(3, ssa.HOURS), continuation, i)), yd5.M(15, ssa.MINUTES), new hv0(this, continuation, i), e);
    }

    @Override // defpackage.dqi
    public final Object a(cg6 cg6Var) {
        return this.a.a(cg6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.d.c(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.a.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        ev0 ev0Var;
        int i;
        if (cg6Var instanceof ev0) {
            ev0Var = (ev0) cg6Var;
            int i2 = ev0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ev0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ev0Var.j;
                nm6 nm6Var = nm6.a;
                i = ev0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ev0Var.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ev0Var.l = 2;
            }
        }
        ev0Var = new ev0(this, cg6Var);
        Object obj2 = ev0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ev0Var.l;
        if (i != 0) {
        }
        ev0Var.l = 2;
    }

    @Override // defpackage.frt
    public final xxq c() {
        return this.a.c();
    }

    @Override // defpackage.frt
    public final vdr d() {
        return this.a.d();
    }

    @Override // defpackage.dqi
    public final Object e(String str, Continuation continuation) {
        return this.a.e(str, continuation);
    }

    @Override // defpackage.frt
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }

    @Override // defpackage.frt
    public final pjc g() {
        return this.a.g();
    }

    @Override // defpackage.dqi
    public final Object h(cv0 cv0Var, boolean z, Continuation continuation) {
        return this.a.h(cv0Var, true, continuation);
    }

    @Override // defpackage.dqi
    public final void i(String str) {
        this.a.i(str);
    }

    @Override // defpackage.frt
    public final pjc j() {
        return this.a.j();
    }

    @Override // defpackage.frt
    public final Object k(cg6 cg6Var) {
        return this.a.k(cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, cg6 cg6Var) {
        bv0 bv0Var;
        int i;
        if (cg6Var instanceof bv0) {
            bv0Var = (bv0) cg6Var;
            int i2 = bv0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bv0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = bv0Var.j;
                nm6 nm6Var = nm6.a;
                i = bv0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    bv0Var.l = 1;
                    Object h = this.d.h(str, bv0Var);
                    return h == nm6Var ? nm6Var : h;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return ((z7o) obj).a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        bv0Var = new bv0(this, cg6Var);
        Object obj2 = bv0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = bv0Var.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(cg6 cg6Var) {
        gv0 gv0Var;
        int i;
        xxq xxqVar;
        String str;
        if (cg6Var instanceof gv0) {
            gv0Var = (gv0) cg6Var;
            int i2 = gv0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gv0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = gv0Var.j;
                nm6 nm6Var = nm6.a;
                i = gv0Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = this.a.g();
                    gv0Var.l = 1;
                    obj = zsd.g0(g, gv0Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return ((z7o) obj).a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxqVar = (xxq) (((xxq) obj).a() ? obj : null);
                if (xxqVar != null || (str = xxqVar.a) == null) {
                    r7o r7oVar = z7o.b;
                    return new t7o(new IllegalStateException("Cannot update token for unauthorized"));
                }
                gv0Var.l = 2;
                Object j = this.d.j(str, gv0Var);
                return j == nm6Var ? nm6Var : j;
            }
        }
        gv0Var = new gv0(this, cg6Var);
        Object obj2 = gv0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = gv0Var.l;
        if (i != 0) {
        }
        xxqVar = (xxq) (((xxq) obj2).a() ? obj2 : null);
        if (xxqVar != null) {
        }
        r7o r7oVar2 = z7o.b;
        return new t7o(new IllegalStateException("Cannot update token for unauthorized"));
    }
}
