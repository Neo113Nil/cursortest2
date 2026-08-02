package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class i33 extends riq implements jpr {
    public final /* synthetic */ int o = 1;
    public final Object p;

    public i33(String str, upr uprVar) {
        super(new ppr[2], new qpr[2]);
        int i = this.g;
        qg7[] qg7VarArr = this.e;
        vq1.A(i == qg7VarArr.length);
        for (qg7 qg7Var : qg7VarArr) {
            qg7Var.B(1024);
        }
        this.p = uprVar;
    }

    @Override // defpackage.riq
    public final qg7 c() {
        switch (this.o) {
            case 0:
                return new qg7(1);
            default:
                return new ppr(1);
        }
    }

    @Override // defpackage.riq
    public final rg7 d() {
        switch (this.o) {
            case 0:
                return new h33(this);
            default:
                return new xjq(this);
        }
    }

    @Override // defpackage.riq
    public final og7 e(Throwable th) {
        switch (this.o) {
            case 0:
                return new obe("Unexpected decode error", th);
            default:
                return new kpr("Unexpected decode error", th);
        }
    }

    @Override // defpackage.riq
    public final og7 j(qg7 qg7Var, rg7 rg7Var, boolean z) {
        switch (this.o) {
            case 0:
                h33 h33Var = (h33) rg7Var;
                try {
                    ByteBuffer byteBuffer = qg7Var.i;
                    byteBuffer.getClass();
                    vq1.A(byteBuffer.hasArray());
                    vq1.v(byteBuffer.arrayOffset() == 0);
                    xq0 xq0Var = (xq0) this.p;
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    xq0Var.getClass();
                    h33Var.j = xq0.a(remaining, array);
                    h33Var.g = qg7Var.k;
                    return null;
                } catch (obe e) {
                    return e;
                }
            default:
                ppr pprVar = (ppr) qg7Var;
                qpr qprVar = (qpr) rg7Var;
                try {
                    ByteBuffer byteBuffer2 = pprVar.i;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    upr uprVar = (upr) this.p;
                    if (z) {
                        uprVar.reset();
                    }
                    ipr p = uprVar.p(array2, 0, limit);
                    long j = pprVar.k;
                    long j2 = pprVar.n;
                    qprVar.g = j;
                    qprVar.j = p;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    qprVar.k = j;
                    qprVar.i = false;
                    return null;
                } catch (kpr e2) {
                    return e2;
                }
        }
    }

    @Override // defpackage.jpr
    public void b(long j) {
    }

    public i33(xq0 xq0Var) {
        super(new qg7[1], new h33[1]);
        this.p = xq0Var;
    }
}
