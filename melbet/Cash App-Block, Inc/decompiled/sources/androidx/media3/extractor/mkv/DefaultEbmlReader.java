package androidx.media3.extractor.mkv;

import androidx.appcompat.widget.Toolbar;
import androidx.media3.extractor.ExtractorInput;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class DefaultEbmlReader {
    public long elementContentSize;
    public int elementId;
    public int elementState;
    public Toolbar.AnonymousClass1 processor;
    public final byte[] scratch = new byte[8];
    public final ArrayDeque masterElementsStack = new ArrayDeque();
    public final VarintReader varintReader = new VarintReader();

    public final class MasterElement {
        public final long elementEndPosition;
        public final int elementId;

        public MasterElement(int i, long j) {
            this.elementId = i;
            this.elementEndPosition = j;
        }
    }

    public final long readInteger(ExtractorInput extractorInput, int i) {
        extractorInput.readFully(this.scratch, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
