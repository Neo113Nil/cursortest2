package com.caverock.androidsvg;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes4.dex */
public final class IntegerParser {
    public final int pos;
    public final long value;

    public /* synthetic */ IntegerParser(int i, long j) {
        this.pos = i;
        this.value = j;
    }

    public static IntegerParser parseInt(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new IntegerParser(j, i3);
    }

    public static IntegerParser peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
        extractorInput.peekFully(0, 8, parsableByteArray.data);
        parsableByteArray.setPosition(0);
        return new IntegerParser(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
    }

    public IntegerParser(long j, int i) {
        this.value = j;
        this.pos = i;
    }
}
