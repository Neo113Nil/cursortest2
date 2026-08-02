package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class rm3 implements oa7, in7 {
    public final ByteBuffer a;

    public rm3(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.a = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.a = byteBuffer;
                break;
        }
    }

    @Override // defpackage.in7
    public short J() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new hn7();
    }

    @Override // defpackage.oa7
    public Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.in7
    public int h() {
        return (J() << 8) | J();
    }

    @Override // defpackage.in7
    public int s(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.a;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.in7
    public long skip(long j) {
        ByteBuffer byteBuffer = this.a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // defpackage.oa7
    public void b() {
    }
}
