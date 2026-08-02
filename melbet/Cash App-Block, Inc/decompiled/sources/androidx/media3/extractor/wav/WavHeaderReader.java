package androidx.media3.extractor.wav;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import com.caverock.androidsvg.IntegerParser;

/* loaded from: classes3.dex */
public abstract class WavHeaderReader {
    public static final byte[] WAVEEXT_SUBFORMAT = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] AMBISONIC_SUBFORMAT = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean checkFileType(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i = IntegerParser.peek(extractorInput, parsableByteArray).pos;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        extractorInput.peekFully(0, 4, parsableByteArray.data);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt == 1463899717) {
            return true;
        }
        Log.e("WavHeaderReader", "Unsupported form type: " + readInt);
        return false;
    }

    public static IntegerParser skipToChunk(int i, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
        IntegerParser peek = IntegerParser.peek(extractorInput, parsableByteArray);
        while (true) {
            int i2 = peek.pos;
            if (i2 == i) {
                return peek;
            }
            Fragment$5$$ExternalSyntheticOutline0.m(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = peek.value;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            extractorInput.skipFully((int) j2);
            peek = IntegerParser.peek(extractorInput, parsableByteArray);
        }
    }
}
