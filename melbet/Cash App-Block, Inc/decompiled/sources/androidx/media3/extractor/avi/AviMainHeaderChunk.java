package androidx.media3.extractor.avi;

/* loaded from: classes3.dex */
public final class AviMainHeaderChunk implements AviChunk {
    public final int flags;
    public final int frameDurationUs;
    public final int totalFrames;

    public AviMainHeaderChunk(int i, int i2, int i3) {
        this.frameDurationUs = i;
        this.flags = i2;
        this.totalFrames = i3;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1751742049;
    }
}
