package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b1n implements wxi {
    public final bml a;
    public final tn5 b;
    public final boolean c;

    public b1n(bml bmlVar, tn5 tn5Var, boolean z) {
        this.a = bmlVar;
        this.b = tn5Var;
        this.c = z;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (!this.c || i != 1 || enj.f(j2) <= 0.0f) {
            return 0L;
        }
        return swf.i(0.0f, ((Number) this.a.invoke(Float.valueOf(enj.f(j2)))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r0(long j, Continuation continuation) {
        a1n a1nVar;
        int i;
        if (continuation instanceof a1n) {
            a1nVar = (a1n) continuation;
            int i2 = a1nVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1nVar.l = i2 - Integer.MIN_VALUE;
                Object obj = a1nVar.j;
                nm6 nm6Var = nm6.a;
                i = a1nVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Float f = new Float(yzt.c(j));
                    a1nVar.l = 1;
                    obj = this.b.invoke(f, a1nVar);
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
                return new yzt(bzf.s(0.0f, ((Number) obj).floatValue()));
            }
        }
        a1nVar = new a1n(this, (cg6) continuation);
        Object obj2 = a1nVar.j;
        nm6 nm6Var2 = nm6.a;
        i = a1nVar.l;
        if (i != 0) {
        }
        return new yzt(bzf.s(0.0f, ((Number) obj2).floatValue()));
    }

    @Override // defpackage.wxi
    public final long x(int i, long j) {
        if (!this.c || i != 1 || enj.f(j) >= 0.0f) {
            return 0L;
        }
        return swf.i(0.0f, ((Number) this.a.invoke(Float.valueOf(enj.f(j)))).floatValue());
    }
}
