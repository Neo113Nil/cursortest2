package defpackage;

/* loaded from: classes.dex */
public final class cyi {
    public gyi a;
    public gyi b;
    public uif c = new ypb(20, this);
    public mm6 d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, cg6 cg6Var) {
        ayi ayiVar;
        int i;
        long j3;
        if (cg6Var instanceof ayi) {
            ayiVar = (ayi) cg6Var;
            int i2 = ayiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ayiVar.l = i2 - Integer.MIN_VALUE;
                ayi ayiVar2 = ayiVar;
                Object obj = ayiVar2.j;
                nm6 nm6Var = nm6.a;
                i = ayiVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    gyi gyiVar = this.a;
                    gyi gyiVar2 = null;
                    j3 = 0;
                    if (((gyiVar == null || !gyiVar.n) ? null : (gyi) q7g.F(gyiVar)) == null) {
                        gyi gyiVar3 = this.b;
                        if (gyiVar3 != null) {
                            ayiVar2.l = 1;
                            obj = gyiVar3.k(j, j2, ayiVar2);
                        }
                    } else {
                        gyi gyiVar4 = this.a;
                        if (gyiVar4 != null && gyiVar4.n) {
                            gyiVar2 = (gyi) q7g.F(gyiVar4);
                        }
                        if (gyiVar2 != null) {
                            ayiVar2.l = 2;
                            obj = gyiVar2.k(j, j2, ayiVar2);
                        } else {
                            j3 = 0;
                        }
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                    j3 = ((yzt) obj).a;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j3 = ((yzt) obj).a;
                }
                return new yzt(j3);
            }
        }
        ayiVar = new ayi(this, cg6Var);
        ayi ayiVar22 = ayiVar;
        Object obj2 = ayiVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = ayiVar22.l;
        if (i != 0) {
        }
        return new yzt(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, cg6 cg6Var) {
        byi byiVar;
        int i;
        long j2;
        if (cg6Var instanceof byi) {
            byiVar = (byi) cg6Var;
            int i2 = byiVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byiVar.l = i2 - Integer.MIN_VALUE;
                Object obj = byiVar.j;
                nm6 nm6Var = nm6.a;
                i = byiVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    gyi gyiVar = this.a;
                    gyi gyiVar2 = null;
                    if (gyiVar != null && gyiVar.n) {
                        gyiVar2 = (gyi) q7g.F(gyiVar);
                    }
                    if (gyiVar2 == null) {
                        j2 = 0;
                        return new yzt(j2);
                    }
                    byiVar.l = 1;
                    obj = gyiVar2.r0(j, byiVar);
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
                j2 = ((yzt) obj).a;
                return new yzt(j2);
            }
        }
        byiVar = new byi(this, cg6Var);
        Object obj2 = byiVar.j;
        nm6 nm6Var2 = nm6.a;
        i = byiVar.l;
        if (i != 0) {
        }
        j2 = ((yzt) obj2).a;
        return new yzt(j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, uif] */
    public final mm6 c() {
        mm6 mm6Var = (mm6) this.c.invoke();
        if (mm6Var != null) {
            return mm6Var;
        }
        xq0.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
