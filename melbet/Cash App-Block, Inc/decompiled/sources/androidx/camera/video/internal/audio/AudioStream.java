package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface AudioStream {

    public final class AudioStreamException extends Exception {
    }

    AutoValue_AudioStream_PacketInfo read(ByteBuffer byteBuffer);
}
