package androidx.media3.extractor.metadata.id3;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.id.equals(binaryFrame.id) && Arrays.equals(this.data, binaryFrame.data);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.data) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.id);
    }
}
