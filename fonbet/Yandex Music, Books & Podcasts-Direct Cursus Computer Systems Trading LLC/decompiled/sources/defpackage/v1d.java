package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class v1d {
    public final jyr a;
    public final jyr b;

    public v1d(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar2;
        this.b = jyrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r6.a(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6.c(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        u1d u1dVar;
        int i;
        if (cg6Var instanceof u1d) {
            u1dVar = (u1d) cg6Var;
            int i2 = u1dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u1dVar.j;
                nm6 nm6Var = nm6.a;
                i = u1dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    p2d p2dVar = (p2d) this.a.getValue();
                    u1dVar.l = 1;
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
                t1d t1dVar = (t1d) this.b.getValue();
                u1dVar.l = 2;
            }
        }
        u1dVar = new u1d(this, cg6Var);
        Object obj2 = u1dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = u1dVar.l;
        if (i != 0) {
        }
        t1d t1dVar2 = (t1d) this.b.getValue();
        u1dVar.l = 2;
    }
}
