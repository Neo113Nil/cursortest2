package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class vks extends dq2 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        int i2 = tx1Var.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new tx1(tx1Var.a, tx1Var.b, 4) : tx1.e;
        }
        throw new ux1(tx1Var);
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer k;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 21) {
            k = k((i2 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k);
                position += 3;
            }
        } else if (i3 == 22) {
            k = k(i2);
            while (position < limit) {
                l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k);
                position += 4;
            }
        } else if (i3 == 1342177280) {
            k = k((i2 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k);
                position += 3;
            }
        } else {
            if (i3 != 1610612736) {
                e7o.n();
                return;
            }
            k = k(i2);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k.flip();
    }
}
