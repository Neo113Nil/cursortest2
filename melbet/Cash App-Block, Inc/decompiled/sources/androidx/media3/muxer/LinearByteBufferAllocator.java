package androidx.media3.muxer;

import com.bumptech.glide.load.Option;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class LinearByteBufferAllocator implements Option.CacheKeyUpdater {
    public ByteBuffer memoryPool;

    @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
    public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.memoryPool) {
            this.memoryPool.position(0);
            messageDigest.update(this.memoryPool.putInt(num.intValue()).array());
        }
    }
}
