package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class n4c extends cq2 {
    public l4c i;
    public volatile float j;
    public volatile h4c k;

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        if (tx1Var.c == 2) {
            return tx1Var;
        }
        throw new ux1(tx1Var);
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int position = limit - byteBuffer.position();
        if (position == 0) {
            return;
        }
        ByteBuffer k = k(position);
        k.getClass();
        while (byteBuffer.position() < limit) {
            k.putShort((short) (byteBuffer.getShort() * this.j));
        }
        k.flip();
    }

    public final void l(float f, h4c h4cVar) {
        h4c h4cVar2 = this.k;
        if (h4cVar2 == null || h4cVar.a >= h4cVar2.a) {
            int ordinal = this.i.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                f = 1 - f;
            }
            this.j = yhn.c(f, 0.0f, 1.0f);
        }
    }
}
