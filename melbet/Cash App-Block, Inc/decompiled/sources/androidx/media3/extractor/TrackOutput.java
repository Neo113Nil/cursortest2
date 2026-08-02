package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import java.util.Arrays;

/* loaded from: classes3.dex */
public interface TrackOutput {

    public final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i, byte[] bArr, int i2, int i3) {
            this.cryptoMode = i;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i2;
            this.clearBlocks = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CryptoData.class != obj.getClass()) {
                return false;
            }
            CryptoData cryptoData = (CryptoData) obj;
            return this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && Arrays.equals(this.encryptionKey, cryptoData.encryptionKey);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.encryptionKey) + (this.cryptoMode * 31)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    default void durationUs(long j) {
    }

    void format(Format format2);

    default int sampleData(DataReader dataReader, int i, boolean z) {
        return sampleData$1(dataReader, i, z);
    }

    void sampleData(ParsableByteArray parsableByteArray, int i, int i2);

    int sampleData$1(DataReader dataReader, int i, boolean z);

    void sampleMetadata(long j, int i, int i2, int i3, CryptoData cryptoData);

    default void sampleData(int i, ParsableByteArray parsableByteArray) {
        sampleData(parsableByteArray, i, 0);
    }
}
