package defpackage;

import java.nio.ByteBuffer;
import yads.xj;

/* loaded from: classes7.dex */
public final class vk71 extends xm61 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // defpackage.lv81
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer c;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            c = c((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i4) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                c.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                ny61.k();
                return;
            }
            c = c(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                c.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        c.flip();
    }

    @Override // defpackage.xm61
    public final mp81 d(mp81 mp81Var) {
        int i2 = mp81Var.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new mp81(mp81Var.a, mp81Var.b, 4) : mp81.e;
        }
        throw new xj(mp81Var);
    }
}
