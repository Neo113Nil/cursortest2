package D1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class j implements l, com.bumptech.glide.load.data.f {

    /* renamed from: n, reason: collision with root package name */
    public final ByteBuffer f547n;

    public j(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.f547n = byteBuffer;
                break;
            default:
                this.f547n = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        ByteBuffer byteBuffer = this.f547n;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // D1.l
    public int h() {
        return (q() << 8) | q();
    }

    @Override // D1.l
    public long p(long j6) {
        ByteBuffer byteBuffer = this.f547n;
        int min = (int) Math.min(byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // D1.l
    public short q() {
        ByteBuffer byteBuffer = this.f547n;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new k();
    }

    @Override // D1.l
    public int v(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f547n;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
    }
}
