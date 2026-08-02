package defpackage;

import defpackage.hmm;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class x0f {
    public final hmm.a a;
    public final Class b;
    public final a1f c;
    public final b1f d;
    public final d1f e;

    public x0f(hmm.a aVar, Class cls, a1f a1fVar, b1f b1fVar, d1f d1fVar) {
        aVar.getClass();
        d1fVar.getClass();
        this.a = aVar;
        this.b = cls;
        this.c = a1fVar;
        this.d = b1fVar;
        this.e = d1fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        v0f v0fVar;
        int i;
        wb7 wb7Var;
        String str;
        if (cg6Var instanceof v0f) {
            v0fVar = (v0f) cg6Var;
            int i2 = v0fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0fVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v0fVar.j;
                nm6 nm6Var = nm6.a;
                i = v0fVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    v0fVar.l = 1;
                    obj = this.c.invoke(v0fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        return (hmmVar == null || (str = (String) hmmVar.a(this.a)) == null) ? c5b.a : this.e.a(str, this.b);
                    }
                    qgg.h0(obj);
                }
                wb7Var = (wb7) obj;
                if (wb7Var != null) {
                    return c5b.a;
                }
                pjc data = wb7Var.getData();
                v0fVar.l = 2;
                obj = zsd.i0(data, v0fVar);
            }
        }
        v0fVar = new v0f(this, cg6Var);
        Object obj2 = v0fVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v0fVar.l;
        if (i != 0) {
        }
        wb7Var = (wb7) obj2;
        if (wb7Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (defpackage.ec7.c(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, cg6 cg6Var) {
        w0f w0fVar;
        int i;
        wb7 wb7Var;
        if (cg6Var instanceof w0f) {
            w0fVar = (w0f) cg6Var;
            int i2 = w0fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0fVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = w0fVar.k;
                nm6 nm6Var = nm6.a;
                i = w0fVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    w0fVar.j = obj;
                    w0fVar.m = 1;
                    obj2 = this.c.invoke(w0fVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = w0fVar.j;
                    qgg.h0(obj2);
                }
                wb7Var = (wb7) obj2;
                if (wb7Var != null) {
                    return Unit.a;
                }
                dae daeVar = new dae(2, this, obj);
                w0fVar.j = null;
                w0fVar.m = 2;
            }
        }
        w0fVar = new w0f(this, cg6Var);
        Object obj22 = w0fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w0fVar.m;
        if (i != 0) {
        }
        wb7Var = (wb7) obj22;
        if (wb7Var != null) {
        }
    }
}
