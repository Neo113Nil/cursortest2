package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bd4 extends dq2 {
    public int[] i;
    public int[] j;

    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        int i = tx1Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return tx1.e;
        }
        int i2 = tx1Var.b;
        if (i != 2 && i != 4) {
            throw new ux1(tx1Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new ux1("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", tx1Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new tx1(tx1Var.a, iArr.length, i) : tx1.e;
    }

    @Override // defpackage.vx1
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                int v = (dvt.v(this.b.c) * i) + position;
                int i2 = this.b.c;
                if (i2 == 2) {
                    k.putShort(byteBuffer.getShort(v));
                } else {
                    if (i2 != 4) {
                        dlh.d(this.b.c, "Unexpected encoding: ");
                        return;
                    }
                    k.putFloat(byteBuffer.getFloat(v));
                }
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    @Override // defpackage.dq2
    public final void h() {
        this.j = this.i;
    }

    @Override // defpackage.dq2
    public final void j() {
        this.j = null;
        this.i = null;
    }
}
