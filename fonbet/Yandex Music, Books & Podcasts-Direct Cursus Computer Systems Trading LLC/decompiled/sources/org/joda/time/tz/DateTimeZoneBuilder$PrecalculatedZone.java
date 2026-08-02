package org.joda.time.tz;

import defpackage.kac;
import defpackage.ud7;
import java.io.DataInput;
import java.util.Arrays;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
final class DateTimeZoneBuilder$PrecalculatedZone extends DateTimeZone {
    private static final long serialVersionUID = 7811976468055766265L;
    private final String[] iNameKeys;
    private final int[] iStandardOffsets;
    private final DateTimeZoneBuilder$DSTZone iTailZone;
    private final long[] iTransitions;
    private final int[] iWallOffsets;

    public DateTimeZoneBuilder$PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone) {
        super(str);
        this.iTransitions = jArr;
        this.iWallOffsets = iArr;
        this.iStandardOffsets = iArr2;
        this.iNameKeys = strArr;
        this.iTailZone = dateTimeZoneBuilder$DSTZone;
    }

    public static DateTimeZoneBuilder$PrecalculatedZone v(DataInput dataInput, String str) {
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = a.b(dataInput);
            iArr[i2] = (int) a.b(dataInput);
            iArr2[i2] = (int) a.b(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    kac.f("Invalid encoding");
                    return null;
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        return new DateTimeZoneBuilder$PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new DateTimeZoneBuilder$DSTZone(str, (int) a.b(dataInput), ud7.c(dataInput), ud7.c(dataInput)) : null);
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateTimeZoneBuilder$PrecalculatedZone) {
            DateTimeZoneBuilder$PrecalculatedZone dateTimeZoneBuilder$PrecalculatedZone = (DateTimeZoneBuilder$PrecalculatedZone) obj;
            if (f().equals(dateTimeZoneBuilder$PrecalculatedZone.f()) && Arrays.equals(this.iTransitions, dateTimeZoneBuilder$PrecalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, dateTimeZoneBuilder$PrecalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, dateTimeZoneBuilder$PrecalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, dateTimeZoneBuilder$PrecalculatedZone.iStandardOffsets)) {
                DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
                DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone2 = dateTimeZoneBuilder$PrecalculatedZone.iTailZone;
                if (dateTimeZoneBuilder$DSTZone != null ? dateTimeZoneBuilder$DSTZone.equals(dateTimeZoneBuilder$DSTZone2) : dateTimeZoneBuilder$DSTZone2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final String h(long j) {
        long[] jArr = this.iTransitions;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.iNameKeys[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.iNameKeys[i - 1] : "UTC";
        }
        DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
        return dateTimeZoneBuilder$DSTZone == null ? this.iNameKeys[i - 1] : dateTimeZoneBuilder$DSTZone.v(j).b;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return f().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public final int j(long j) {
        long[] jArr = this.iTransitions;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.iWallOffsets[binarySearch];
        }
        int i = ~binarySearch;
        if (i >= jArr.length) {
            DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
            return dateTimeZoneBuilder$DSTZone == null ? this.iWallOffsets[i - 1] : dateTimeZoneBuilder$DSTZone.j(j);
        }
        if (i > 0) {
            return this.iWallOffsets[i - 1];
        }
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public final int o(long j) {
        long[] jArr = this.iTransitions;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.iStandardOffsets[binarySearch];
        }
        int i = ~binarySearch;
        if (i >= jArr.length) {
            DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
            return dateTimeZoneBuilder$DSTZone == null ? this.iStandardOffsets[i - 1] : dateTimeZoneBuilder$DSTZone.iStandardOffset;
        }
        if (i > 0) {
            return this.iStandardOffsets[i - 1];
        }
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean p() {
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final long q(long j) {
        long[] jArr = this.iTransitions;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : ~binarySearch;
        if (i < jArr.length) {
            return jArr[i];
        }
        DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
        if (dateTimeZoneBuilder$DSTZone == null) {
            return j;
        }
        long j2 = jArr[jArr.length - 1];
        if (j < j2) {
            j = j2;
        }
        return dateTimeZoneBuilder$DSTZone.q(j);
    }

    @Override // org.joda.time.DateTimeZone
    public final long s(long j) {
        long[] jArr = this.iTransitions;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            int i = ~binarySearch;
            if (i >= jArr.length) {
                DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = this.iTailZone;
                if (dateTimeZoneBuilder$DSTZone != null) {
                    long s = dateTimeZoneBuilder$DSTZone.s(j);
                    if (s < j) {
                        return s;
                    }
                }
                long j2 = jArr[i - 1];
                if (j2 > Long.MIN_VALUE) {
                    return j2 - 1;
                }
            } else if (i > 0) {
                long j3 = jArr[i - 1];
                if (j3 > Long.MIN_VALUE) {
                    return j3 - 1;
                }
            }
        } else if (j > Long.MIN_VALUE) {
            return j - 1;
        }
        return j;
    }
}
