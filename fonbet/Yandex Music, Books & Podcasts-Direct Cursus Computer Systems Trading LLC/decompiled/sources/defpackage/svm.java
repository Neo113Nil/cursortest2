package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class svm implements aoo {
    public final int a;
    public final /* synthetic */ uvm b;

    public svm(uvm uvmVar, int i) {
        this.b = uvmVar;
        this.a = i;
    }

    @Override // defpackage.aoo
    public final void b() {
        int i = this.a;
        uvm uvmVar = this.b;
        uvmVar.u[i].v();
        osh oshVar = uvmVar.m;
        int r = uvmVar.d.r(uvmVar.E);
        IOException iOException = (IOException) oshVar.c;
        if (iOException != null) {
            throw iOException;
        }
        igg iggVar = (igg) oshVar.b;
        if (iggVar != null) {
            if (r == Integer.MIN_VALUE) {
                r = iggVar.a;
            }
            IOException iOException2 = iggVar.e;
            if (iOException2 != null && iggVar.f > r) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.aoo
    public final boolean p() {
        uvm uvmVar = this.b;
        return !uvmVar.D() && uvmVar.u[this.a].t(uvmVar.Z);
    }

    @Override // defpackage.aoo
    public final int q(qdc qdcVar, qg7 qg7Var, int i) {
        uvm uvmVar = this.b;
        if (uvmVar.D()) {
            return -3;
        }
        int i2 = this.a;
        uvmVar.y(i2);
        int y = uvmVar.u[i2].y(qdcVar, qg7Var, i, uvmVar.Z);
        if (y == -3) {
            uvmVar.z(i2);
        }
        return y;
    }

    @Override // defpackage.aoo
    public final int x(long j) {
        uvm uvmVar = this.b;
        if (uvmVar.D()) {
            return 0;
        }
        int i = this.a;
        uvmVar.y(i);
        zno znoVar = uvmVar.u[i];
        int r = znoVar.r(j, uvmVar.Z);
        znoVar.D(r);
        if (r == 0) {
            uvmVar.z(i);
        }
        return r;
    }
}
