package androidx.media3.muxer;

/* loaded from: classes3.dex */
public final class BufferInfo {
    public final int flags;
    public final long presentationTimeUs;
    public final int size;

    public BufferInfo(int i, int i2, long j) {
        this.presentationTimeUs = j;
        this.size = i;
        this.flags = i2;
    }
}
