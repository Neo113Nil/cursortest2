package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import java.io.InterruptedIOException;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    public final DataReader dataReader;
    public int peekBufferLength;
    public int peekBufferPosition;
    public long position;
    public final long streamLength;
    public byte[] peekBuffer = new byte[65536];
    public final byte[] scratchSpace = new byte[4096];

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j, long j2) {
        this.dataReader = dataReader;
        this.position = j;
        this.streamLength = j2;
    }

    public final boolean advancePeekPosition(int i, boolean z) {
        ensureSpaceForPeek(i);
        int i2 = this.peekBufferLength - this.peekBufferPosition;
        while (i2 < i) {
            DefaultExtractorInput defaultExtractorInput = this;
            int i3 = i;
            boolean z2 = z;
            i2 = defaultExtractorInput.readFromUpstream(z2, this.peekBufferPosition, this.peekBuffer, i3, i2);
            if (i2 == -1) {
                return false;
            }
            defaultExtractorInput.peekBufferLength = defaultExtractorInput.peekBufferPosition + i2;
            this = defaultExtractorInput;
            z = z2;
            i = i3;
        }
        this.peekBufferPosition += i;
        return true;
    }

    public final void ensureSpaceForPeek(int i) {
        int i2 = this.peekBufferPosition + i;
        byte[] bArr = this.peekBuffer;
        if (i2 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i2, i2 + PKIFailureInfo.signerNotTrusted));
        }
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return this.streamLength;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return this.position;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int peek(int i, int i2, byte[] bArr) {
        DefaultExtractorInput defaultExtractorInput;
        int min;
        ensureSpaceForPeek(i2);
        int i3 = this.peekBufferLength;
        int i4 = this.peekBufferPosition;
        int i5 = i3 - i4;
        if (i5 == 0) {
            defaultExtractorInput = this;
            min = defaultExtractorInput.readFromUpstream(true, i4, this.peekBuffer, i2, 0);
            if (min == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += min;
        } else {
            defaultExtractorInput = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i, min);
        defaultExtractorInput.peekBufferPosition += min;
        return min;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean peekFully(byte[] bArr, int i, int i2, boolean z) {
        if (!advancePeekPosition(i2, z)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i2, bArr, i, i2);
        return true;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        DefaultExtractorInput defaultExtractorInput;
        int i3 = this.peekBufferLength;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.peekBuffer, 0, bArr, i, min);
            updatePeekBuffer(min);
            i4 = min;
        }
        if (i4 == 0) {
            defaultExtractorInput = this;
            i4 = defaultExtractorInput.readFromUpstream(true, i, bArr, i2, 0);
        } else {
            defaultExtractorInput = this;
        }
        if (i4 != -1) {
            defaultExtractorInput.position += i4;
        }
        return i4;
    }

    public final int readFromUpstream(boolean z, int i, byte[] bArr, int i2, int i3) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.dataReader.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean readFully(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.peekBufferLength;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.peekBuffer, 0, bArr, i, min);
            updatePeekBuffer(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = readFromUpstream(z, i, bArr, i2, i4);
        }
        if (i4 != -1) {
            this.position += i4;
        }
        return i4 != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final int skip(int i) {
        DefaultExtractorInput defaultExtractorInput;
        int min = Math.min(this.peekBufferLength, i);
        updatePeekBuffer(min);
        if (min == 0) {
            byte[] bArr = this.scratchSpace;
            defaultExtractorInput = this;
            min = defaultExtractorInput.readFromUpstream(true, 0, bArr, Math.min(i, bArr.length), 0);
        } else {
            defaultExtractorInput = this;
        }
        if (min != -1) {
            defaultExtractorInput.position += min;
        }
        return min;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final boolean skipFully(int i, boolean z) {
        int min = Math.min(this.peekBufferLength, i);
        updatePeekBuffer(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.scratchSpace;
            i2 = readFromUpstream(z, -i2, bArr, Math.min(i, bArr.length + i2), i2);
        }
        if (i2 != -1) {
            this.position += i2;
        }
        return i2 != -1;
    }

    public final void updatePeekBuffer(int i) {
        int i2 = this.peekBufferLength - i;
        this.peekBufferLength = i2;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i2 < bArr.length - PKIFailureInfo.signerNotTrusted ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.peekBuffer = bArr2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void peekFully(int i, int i2, byte[] bArr) {
        peekFully(bArr, i, i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void advancePeekPosition(int i) {
        advancePeekPosition(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void skipFully(int i) {
        skipFully(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public final void readFully(byte[] bArr, int i, int i2) {
        readFully(bArr, i, i2, false);
    }
}
