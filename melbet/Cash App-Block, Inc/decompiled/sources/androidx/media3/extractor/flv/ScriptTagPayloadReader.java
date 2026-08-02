package androidx.media3.extractor.flv;

import androidx.credentials.Credential;
import androidx.media3.common.util.ParsableByteArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ScriptTagPayloadReader extends Credential {
    public long durationUs;
    public long[] keyFrameTagPositions;
    public long[] keyFrameTimesUs;

    public static Serializable readAmfData(int i, ParsableByteArray parsableByteArray) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.readLong()));
        }
        if (i == 1) {
            return Boolean.valueOf(parsableByteArray.readUnsignedByte() == 1);
        }
        if (i == 2) {
            return readAmfString(parsableByteArray);
        }
        if (i != 3) {
            if (i == 8) {
                return readAmfEcmaArray(parsableByteArray);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(parsableByteArray.readLong()));
                parsableByteArray.skipBytes(2);
                return date;
            }
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            ArrayList arrayList = new ArrayList(readUnsignedIntToInt);
            for (int i2 = 0; i2 < readUnsignedIntToInt; i2++) {
                Serializable readAmfData = readAmfData(parsableByteArray.readUnsignedByte(), parsableByteArray);
                if (readAmfData != null) {
                    arrayList.add(readAmfData);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String readAmfString = readAmfString(parsableByteArray);
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 9) {
                return hashMap;
            }
            Serializable readAmfData2 = readAmfData(readUnsignedByte, parsableByteArray);
            if (readAmfData2 != null) {
                hashMap.put(readAmfString, readAmfData2);
            }
        }
    }

    public static HashMap readAmfEcmaArray(ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        HashMap hashMap = new HashMap(readUnsignedIntToInt);
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            String readAmfString = readAmfString(parsableByteArray);
            Serializable readAmfData = readAmfData(parsableByteArray.readUnsignedByte(), parsableByteArray);
            if (readAmfData != null) {
                hashMap.put(readAmfString, readAmfData);
            }
        }
        return hashMap;
    }

    public static String readAmfString(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int i = parsableByteArray.position;
        parsableByteArray.skipBytes(readUnsignedShort);
        return new String(parsableByteArray.data, i, readUnsignedShort);
    }
}
