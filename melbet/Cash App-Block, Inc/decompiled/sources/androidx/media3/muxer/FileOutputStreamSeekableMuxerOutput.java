package androidx.media3.muxer;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public final class FileOutputStreamSeekableMuxerOutput implements WritableByteChannel {
    public final FileChannel fileChannel;
    public final FileOutputStream fileOutputStream;

    public FileOutputStreamSeekableMuxerOutput(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
        this.fileChannel = fileOutputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.fileOutputStream.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.fileChannel.isOpen();
    }

    public final void setPosition(long j) {
        this.fileChannel.position(j);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.fileChannel.write(byteBuffer);
    }
}
