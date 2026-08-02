package coil3.decode;

import coil3.decode.ImageSource;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ByteBufferMetadata extends ImageSource.Metadata {
    public final ByteBuffer byteBuffer;

    public ByteBufferMetadata(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
}
