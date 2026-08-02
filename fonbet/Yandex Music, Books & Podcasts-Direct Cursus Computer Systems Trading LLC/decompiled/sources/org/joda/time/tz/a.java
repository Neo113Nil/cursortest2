package org.joda.time.tz;

import defpackage.kac;
import java.io.DataInput;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public abstract class a {
    public static DateTimeZone a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return new CachedDateTimeZone(DateTimeZoneBuilder$PrecalculatedZone.v(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone((int) b(dataInput), (int) b(dataInput), str, dataInput.readUTF());
            DateTimeZone dateTimeZone = DateTimeZone.a;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        }
        if (readUnsignedByte == 80) {
            return DateTimeZoneBuilder$PrecalculatedZone.v(dataInput, str);
        }
        kac.f("Invalid encoding");
        return null;
    }

    public static long b(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return readUnsignedByte * j;
    }
}
