package androidx.media3.extractor;

import androidx.media3.common.DataReader;

/* loaded from: classes3.dex */
public interface ExtractorInput extends DataReader {
    void advancePeekPosition(int i);

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(int i, int i2, byte[] bArr);

    void peekFully(int i, int i2, byte[] bArr);

    boolean peekFully(byte[] bArr, int i, int i2, boolean z);

    void readFully(byte[] bArr, int i, int i2);

    boolean readFully(byte[] bArr, int i, int i2, boolean z);

    void resetPeekPosition();

    int skip(int i);

    void skipFully(int i);

    boolean skipFully(int i, boolean z);
}
