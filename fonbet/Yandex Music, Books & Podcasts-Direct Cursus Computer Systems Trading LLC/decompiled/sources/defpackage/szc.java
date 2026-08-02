package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class szc extends cq2 {
    public boolean k;
    public final double i = -32767.0d;
    public final double j = 32767.0d;
    public double l = 1.0d;
    public double m = 32767.0d;
    public double n = -32767.0d;

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        if (tx1Var.c != 2) {
            throw new ux1(tx1Var);
        }
        this.m = this.j;
        this.n = this.i;
        return tx1Var;
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        double d = this.l;
        boolean z = this.k;
        double d2 = this.n;
        double d3 = this.m;
        int limit = byteBuffer.limit();
        int position = limit - byteBuffer.position();
        if (position == 0) {
            return;
        }
        ByteBuffer k = k(position);
        k.getClass();
        if (z) {
            while (byteBuffer.position() < limit) {
                k.putShort((short) yhn.b(byteBuffer.getShort() * d, d2, d3));
            }
        } else {
            k.put(byteBuffer);
        }
        k.flip();
    }
}
