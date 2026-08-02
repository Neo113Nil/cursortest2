package androidx.media3.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SefReader {
    public final ArrayList dataReferences = new ArrayList();
    public int readerState = 0;
    public int tailLength;
    public static final Splitter COLON_SPLITTER = Splitter.on(':');
    public static final Splitter ASTERISK_SPLITTER = Splitter.on('*');

    public final class DataReference {
        public final int size;
        public final long startOffset;

        public DataReference(long j, int i) {
            this.startOffset = j;
            this.size = i;
        }
    }
}
