package androidx.media3.muxer;

import com.squareup.cash.clientroutes.ClientRoute;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class BoxUtils {
    public static ByteBuffer concatenateBuffers(ByteBuffer... byteBufferArr) {
        int i = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i += byteBuffer.remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayOrderDetails.deepLinkSpecs;
    }

    public static ByteBuffer wrapBoxesIntoBox(String str, List list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((ByteBuffer) list.get(i2)).remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            allocate.put((ByteBuffer) list.get(i3));
        }
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer wrapIntoBox(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        allocate.putInt(byteBuffer.remaining() + 8);
        allocate.put(bArr, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    public static ByteBuffer wrapIntoBox(String str, ByteBuffer byteBuffer) {
        return wrapIntoBox(str.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }
}
