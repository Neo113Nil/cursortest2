package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class yv2 extends qg7 {
    public long n;
    public int o;
    public int p;

    public yv2() {
        super(2);
        this.p = 32;
    }

    public final boolean D(qg7 qg7Var) {
        ByteBuffer byteBuffer;
        vq1.v(!qg7Var.f(1073741824));
        vq1.v(!qg7Var.f(268435456));
        vq1.v(!qg7Var.f(4));
        if (E()) {
            if (this.o >= this.p) {
                return false;
            }
            ByteBuffer byteBuffer2 = qg7Var.i;
            if (byteBuffer2 != null && (byteBuffer = this.i) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.o;
        this.o = i + 1;
        if (i == 0) {
            this.k = qg7Var.k;
            if (qg7Var.f(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = qg7Var.i;
        if (byteBuffer3 != null) {
            B(byteBuffer3.remaining());
            this.i.put(byteBuffer3);
        }
        this.n = qg7Var.k;
        return true;
    }

    public final boolean E() {
        return this.o > 0;
    }

    @Override // defpackage.qg7
    public final void z() {
        super.z();
        this.o = 0;
    }
}
