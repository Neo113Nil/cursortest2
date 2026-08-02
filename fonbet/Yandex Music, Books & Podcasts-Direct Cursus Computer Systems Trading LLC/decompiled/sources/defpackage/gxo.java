package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gxo implements wxi {
    public final iyo a;
    public boolean b;

    public gxo(iyo iyoVar, boolean z) {
        this.a = iyoVar;
        this.b = z;
    }

    @Override // defpackage.wxi
    public final long K(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        iyo iyoVar = this.a;
        if (iyoVar.a.b()) {
            return 0L;
        }
        return iyoVar.g(iyoVar.c(iyoVar.a.e(iyoVar.c(iyoVar.f(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(long j, long j2, Continuation continuation) {
        fxo fxoVar;
        int i;
        long j3;
        long j4;
        if (continuation instanceof fxo) {
            fxoVar = (fxo) continuation;
            int i2 = fxoVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fxoVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fxoVar.k;
                nm6 nm6Var = nm6.a;
                i = fxoVar.m;
                if (i == 0) {
                    if (i == 1) {
                        j2 = fxoVar.j;
                        qgg.h0(obj);
                        j4 = ((yzt) obj).a;
                        j3 = yzt.d(j2, j4);
                        return new yzt(j3);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = fxoVar.j;
                    qgg.h0(obj);
                    j4 = ((yzt) obj).a;
                    j3 = yzt.d(j2, j4);
                    return new yzt(j3);
                }
                qgg.h0(obj);
                j3 = 0;
                if (this.b) {
                    iyo iyoVar = this.a;
                    if (iyoVar.h) {
                        j4 = 0;
                        j3 = yzt.d(j2, j4);
                    } else {
                        fxoVar.j = j2;
                        fxoVar.m = 1;
                        obj = iyoVar.b(j2, fxoVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        j4 = ((yzt) obj).a;
                        j3 = yzt.d(j2, j4);
                    }
                }
                return new yzt(j3);
            }
        }
        fxoVar = new fxo(this, (cg6) continuation);
        Object obj2 = fxoVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fxoVar.m;
        if (i == 0) {
        }
    }
}
