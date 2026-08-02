package defpackage;

import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class wks extends dq2 {
    @Override // defpackage.dq2
    public final tx1 a(tx1 tx1Var) {
        int i = tx1Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new tx1(tx1Var.a, tx1Var.b, 2) : tx1.e;
        }
        throw new ux1(tx1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e0->B:43:0x00e2, LOOP_START, PHI: r0
      0x00e0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003c, B:43:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    e7o.n();
                                    return;
                                }
                            }
                        }
                        ByteBuffer k = k(i2);
                        i = this.b.c;
                        if (i == 3) {
                            while (position < limit) {
                                k.put((byte) 0);
                                k.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short h = (short) (dvt.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                k.put((byte) (h & 255));
                                k.put((byte) ((h >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                k.put(byteBuffer.get(position + 1));
                                k.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                k.put(byteBuffer.get(position + 2));
                                k.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                k.put(byteBuffer.get(position + 1));
                                k.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                k.put(byteBuffer.get(position + 1));
                                k.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i != 1610612736) {
                                e7o.n();
                                return;
                            }
                            while (position < limit) {
                                k.put(byteBuffer.get(position + 1));
                                k.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        k.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer k2 = k(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            k2.flip();
        }
        i2 *= 2;
        ByteBuffer k22 = k(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        k22.flip();
    }
}
