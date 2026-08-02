package androidx.media3.extractor.avi;

import androidx.media3.common.Format;

/* loaded from: classes3.dex */
public final class StreamFormatChunk implements AviChunk {

    /* renamed from: format, reason: collision with root package name */
    public final Format f889format;

    public StreamFormatChunk(Format format2) {
        this.f889format = format2;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1718776947;
    }
}
