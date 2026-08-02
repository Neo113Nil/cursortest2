package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class t5s {
    public final o4s a;
    public final hmm.a b;
    public final hmm.a c;
    public final hmm.a d;
    public final hmm.a e;
    public final wb7 f;
    public final xdr g;

    public t5s(cc7 cc7Var, o4s o4sVar) {
        mn7 mn7Var = dm6.b;
        tf6 e = gld.e(mn7Var);
        this.a = o4sVar;
        this.b = new hmm.a("suspendEndTime");
        this.c = new hmm.a("featureCanceledByUser");
        this.d = new hmm.a("fakeLowChargePercent");
        this.e = new hmm.a("isFirstStart");
        this.f = ((dc7) cc7Var).b("TakeCharge");
        this.g = ydr.a(-1L);
        x97.y(e, mn7Var, null, new v0r(this, null, 20), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t5s t5sVar, cg6 cg6Var) {
        q5s q5sVar;
        int i;
        if (cg6Var instanceof q5s) {
            q5sVar = (q5s) cg6Var;
            int i2 = q5sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q5sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q5sVar.j;
                nm6 nm6Var = nm6.a;
                i = q5sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = t5sVar.f.getData();
                    q5sVar.l = 1;
                    obj = zsd.g0(data, q5sVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Long l = (Long) ((hmm) obj).a(t5sVar.b);
                return new Long(l == null ? l.longValue() : -1L);
            }
        }
        q5sVar = new q5s(t5sVar, cg6Var);
        Object obj2 = q5sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = q5sVar.l;
        if (i != 0) {
        }
        Long l2 = (Long) ((hmm) obj2).a(t5sVar.b);
        return new Long(l2 == null ? l2.longValue() : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        p5s p5sVar;
        int i;
        if (cg6Var instanceof p5s) {
            p5sVar = (p5s) cg6Var;
            int i2 = p5sVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p5sVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p5sVar.j;
                nm6 nm6Var = nm6.a;
                i = p5sVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = this.f.getData();
                    p5sVar.l = 1;
                    obj = zsd.g0(data, p5sVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Boolean bool = (Boolean) ((hmm) obj).a(this.d);
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        p5sVar = new p5s(this, cg6Var);
        Object obj2 = p5sVar.j;
        nm6 nm6Var2 = nm6.a;
        i = p5sVar.l;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) ((hmm) obj2).a(this.d);
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    public final void c(long j) {
        xdr xdrVar = this.g;
        if (((Number) xdrVar.getValue()).longValue() < j) {
            Long valueOf = Long.valueOf(j);
            xdrVar.getClass();
            xdrVar.m(null, valueOf);
        }
    }
}
