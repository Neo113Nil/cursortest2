package B1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class j implements l, com.bumptech.glide.load.data.f {

    /* renamed from: n, reason: collision with root package name */
    public final ByteBuffer f133n;

    public j(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 1:
                this.f133n = byteBuffer;
                break;
            default:
                this.f133n = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        ByteBuffer byteBuffer = this.f133n;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // B1.l
    public int d() {
        return (j() << 8) | j();
    }

    @Override // B1.l
    public long e(long j6) {
        ByteBuffer byteBuffer = this.f133n;
        int min = (int) Math.min(byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // B1.l
    public short j() {
        ByteBuffer byteBuffer = this.f133n;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new k();
    }

    @Override // B1.l
    public int k(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f133n;
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
