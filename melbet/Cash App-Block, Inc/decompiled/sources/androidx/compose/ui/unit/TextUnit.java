package androidx.compose.ui.unit;

import androidx.room.Room;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextUnit {
    public static final TextUnitType[] TextUnitTypes = {new TextUnitType(0), new TextUnitType(4294967296L), new TextUnitType(8589934592L)};
    public static final long Unspecified = Room.pack(0, Float.NaN);
    public final long packedValue;

    public /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1057equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m1058getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) ((j & 1095216660480L) >>> 32)].f861type;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m1059getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m1060isSpimpl(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1061toStringimpl(long j) {
        long m1058getTypeUIouoOA = m1058getTypeUIouoOA(j);
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 0L)) {
            return "Unspecified";
        }
        if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
            return m1059getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
            return "Invalid";
        }
        return m1059getValueimpl(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.packedValue == ((TextUnit) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1061toStringimpl(this.packedValue);
    }
}
