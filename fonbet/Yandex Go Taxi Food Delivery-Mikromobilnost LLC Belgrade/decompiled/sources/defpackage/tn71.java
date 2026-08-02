package defpackage;

import java.nio.ByteBuffer;
import yads.xj;

/* loaded from: classes7.dex */
public final class tn71 extends xm61 {
    public int[] i;
    public int[] j;

    @Override // defpackage.lv81
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer c = c(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                c.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        c.flip();
    }

    @Override // defpackage.xm61
    public final mp81 d(mp81 mp81Var) {
        int[] iArr = this.i;
        if (iArr == null) {
            return mp81.e;
        }
        int i = mp81Var.c;
        int i2 = mp81Var.b;
        if (i != 2) {
            throw new xj(mp81Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new xj(mp81Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new mp81(mp81Var.a, iArr.length, 2) : mp81.e;
    }

    @Override // defpackage.xm61
    public final void e() {
        this.j = this.i;
    }

    @Override // defpackage.xm61
    public final void g() {
        this.j = null;
        this.i = null;
    }
}
