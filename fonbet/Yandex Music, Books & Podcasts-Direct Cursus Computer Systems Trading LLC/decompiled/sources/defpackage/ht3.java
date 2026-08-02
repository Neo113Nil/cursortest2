package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ht3 extends at2 {
    public final qg7 r;
    public final d7k s;
    public gt3 t;
    public long u;

    public ht3() {
        super(6);
        this.r = new qg7(1);
        this.s = new d7k();
    }

    @Override // defpackage.at2
    public final void E(long j, long j2) {
        float[] fArr;
        while (!l() && this.u < 100000 + j) {
            qg7 qg7Var = this.r;
            qg7Var.z();
            qdc qdcVar = this.c;
            qdcVar.s();
            if (D(qdcVar, qg7Var, 0) != -4 || qg7Var.f(4)) {
                return;
            }
            long j3 = qg7Var.k;
            this.u = j3;
            boolean z = j3 < this.l;
            if (this.t != null && !z) {
                qg7Var.C();
                ByteBuffer byteBuffer = qg7Var.i;
                int i = dvt.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    d7k d7kVar = this.s;
                    d7kVar.F(limit, array);
                    d7kVar.H(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(d7kVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.t.c(this.u - this.k, fArr);
                }
            }
        }
    }

    @Override // defpackage.at2
    public final int I(dsc dscVar) {
        return "application/x-camera-motion".equals(dscVar.n) ? at2.e(4, 0, 0, 0) : at2.e(0, 0, 0, 0);
    }

    @Override // defpackage.at2, defpackage.ogl
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.t = (gt3) obj;
        }
    }

    @Override // defpackage.at2
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.at2
    public final boolean n() {
        return l();
    }

    @Override // defpackage.at2
    public final boolean p() {
        return true;
    }

    @Override // defpackage.at2
    public final void u() {
        gt3 gt3Var = this.t;
        if (gt3Var != null) {
            gt3Var.d();
        }
    }

    @Override // defpackage.at2
    public final void w(long j, boolean z) {
        this.u = Long.MIN_VALUE;
        gt3 gt3Var = this.t;
        if (gt3Var != null) {
            gt3Var.d();
        }
    }
}
