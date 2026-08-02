package androidx.compose.ui.platform;

import android.os.Parcel;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.room.Room;
import kotlin.ULong;

/* loaded from: classes3.dex */
public final class EncodeHelper {
    public Parcel parcel;

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public long m929decodeColor0d7_KjU() {
        int i = Color.$r8$clinit;
        long readLong = this.parcel.readLong();
        long j = 63 & readLong;
        if (j >= 16) {
            readLong = (readLong & (-64)) | (j + 1);
        }
        ULong.Companion companion = ULong.Companion;
        return readLong;
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public long m930decodeTextUnitXSAIIZE() {
        Parcel parcel = this.parcel;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return TextUnitType.m1062equalsimpl0(j, 0L) ? TextUnit.Unspecified : Room.pack(j, parcel.readFloat());
    }

    public void encode(byte b) {
        this.parcel.writeByte(b);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public void m931encodeR2X_6o(long j) {
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        byte b = 0;
        if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 0L)) {
            if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
                b = 1;
            } else if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 0L)) {
            return;
        }
        encode(TextUnit.m1059getValueimpl(j));
    }

    /* renamed from: encode-8_81llA, reason: not valid java name */
    public void m932encode8_81llA(long j) {
        long j2 = 63 & j;
        ULong.Companion companion = ULong.Companion;
        if (Long.compareUnsigned(j2, 16L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.parcel.writeLong(j);
    }

    public void encode(float f) {
        this.parcel.writeFloat(f);
    }
}
