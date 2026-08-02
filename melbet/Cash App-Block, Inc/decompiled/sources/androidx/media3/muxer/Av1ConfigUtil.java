package androidx.media3.muxer;

import androidx.media3.container.ObuParser$Obu;
import androidx.tracing.Trace;
import com.squareup.cash.clientroutes.ClientRoute;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Av1ConfigUtil {
    public static ByteBuffer getConfigObuWithHeaderAndLength(ObuParser$Obu obuParser$Obu) {
        ByteBuffer byteBuffer = obuParser$Obu.payload;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        allocate.put((byte) ((obuParser$Obu.f873type << 3) | 2));
        int remaining = byteBuffer.remaining();
        Trace.checkArgument(remaining > 0);
        int i = remaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
        Trace.checkState(i2 < 8);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (remaining & 127);
            remaining >>= 7;
            if (remaining != 0) {
                i4 |= 128;
            }
            allocate2.put((byte) i4);
        }
        allocate2.flip();
        allocate.put(allocate2);
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayMerchantSheet.deepLinkSpecs;
    }
}
