package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class qc4 implements dib {
    public final zi3 a;
    public final nc4 b;

    public qc4() {
        zi3 g = men.g(0, 7, null);
        this.a = g;
        this.b = new nc4(g, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (new defpackage.cno(defpackage.qxe.b(r0)).a() != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.b.collect(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        pc4 pc4Var;
        int i;
        if (continuation instanceof pc4) {
            pc4Var = (pc4) continuation;
            int i2 = pc4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pc4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = pc4Var.j;
                nm6 nm6Var = nm6.a;
                i = pc4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pc4Var.l = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rj7.f();
                        return null;
                    }
                    qgg.h0(obj);
                }
                pc4Var.l = 2;
            }
        }
        pc4Var = new pc4(this, continuation);
        Object obj2 = pc4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = pc4Var.l;
        if (i != 0) {
        }
        pc4Var.l = 2;
    }
}
