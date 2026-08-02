package androidx.media3.extractor.avi;

/* loaded from: classes3.dex */
public final class StreamNameChunk implements AviChunk {
    public final String name;

    public StreamNameChunk(String str) {
        this.name = str;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1852994675;
    }
}
