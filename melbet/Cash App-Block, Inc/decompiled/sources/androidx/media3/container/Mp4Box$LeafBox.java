package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.decoder.Buffer;

/* loaded from: classes3.dex */
public final class Mp4Box$LeafBox extends Buffer {
    public final ParsableByteArray data;

    public Mp4Box$LeafBox(int i, ParsableByteArray parsableByteArray) {
        super(i);
        this.data = parsableByteArray;
    }
}
