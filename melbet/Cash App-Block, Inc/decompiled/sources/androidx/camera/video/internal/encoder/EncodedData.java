package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface EncodedData extends AutoCloseable {
    MediaCodec.BufferInfo getBufferInfo();

    ByteBuffer getByteBuffer();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
