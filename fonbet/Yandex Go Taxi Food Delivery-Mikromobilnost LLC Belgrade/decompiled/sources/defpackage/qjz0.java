package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class qjz0 extends vx4 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e0->B:43:0x00e2, LOOP_START, PHI: r0
      0x00e0: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003c, B:43:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.og3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ByteBuffer byteBuffer) {
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
                                    ny61.k();
                                    return;
                                }
                            }
                        }
                        ByteBuffer i4 = i(i2);
                        i = this.b.c;
                        if (i == 3) {
                            while (position < limit) {
                                i4.put((byte) 0);
                                i4.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short h = (short) (tw21.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                i4.put((byte) (h & 255));
                                i4.put((byte) ((h >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                i4.put(byteBuffer.get(position + 1));
                                i4.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                i4.put(byteBuffer.get(position + 2));
                                i4.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                i4.put(byteBuffer.get(position + 1));
                                i4.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                i4.put(byteBuffer.get(position + 1));
                                i4.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i != 1610612736) {
                                ny61.k();
                                return;
                            }
                            while (position < limit) {
                                i4.put(byteBuffer.get(position + 1));
                                i4.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        i4.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer i42 = i(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            i42.flip();
        }
        i2 *= 2;
        ByteBuffer i422 = i(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        i422.flip();
    }

    @Override // defpackage.vx4
    public final ng3 e(ng3 ng3Var) {
        int i = ng3Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new ng3(ng3Var.a, ng3Var.b, 2) : ng3.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(ng3Var);
    }
}
