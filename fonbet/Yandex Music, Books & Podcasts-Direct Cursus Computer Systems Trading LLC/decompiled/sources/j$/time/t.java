package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public t() {
    }

    public t(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((l) obj).n0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.n0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.n0(objectOutput);
                zonedDateTime.b.j0(objectOutput);
                zonedDateTime.c.a0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((y) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).j0(objectOutput);
                return;
            case 9:
                r rVar = (r) obj;
                rVar.a.n0(objectOutput);
                rVar.b.j0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.n0(objectOutput);
                offsetDateTime.b.j0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((v) obj).a);
                return;
            case 12:
                x xVar = (x) obj;
                objectOutput.writeInt(xVar.a);
                objectOutput.writeByte(xVar.b);
                return;
            case 13:
                o oVar = (o) obj;
                objectOutput.writeByte(oVar.a);
                objectOutput.writeByte(oVar.b);
                return;
            case 14:
                s sVar = (s) obj;
                objectOutput.writeInt(sVar.a);
                objectOutput.writeInt(sVar.b);
                objectOutput.writeInt(sVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.E(Math.addExact(readLong, Math.floorDiv(readInt, 1000000000L)), (int) Math.floorMod(readInt, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.J(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return l.i0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.L(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime L = LocalDateTime.L(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput));
                ZoneOffset i0 = ZoneOffset.i0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || i0.equals(zoneId)) {
                    return new ZonedDateTime(L, zoneId, i0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = y.d;
                return ZoneId.J(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.i0(objectInput);
            case 9:
                int i2 = r.c;
                return new r(l.i0(objectInput), ZoneOffset.i0(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.d;
                return new OffsetDateTime(LocalDateTime.L(LocalDate.i0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.i0(objectInput)), ZoneOffset.i0(objectInput));
            case 11:
                int i4 = v.b;
                return v.u(objectInput.readInt());
            case 12:
                int i5 = x.c;
                int readInt2 = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.d0(readInt2);
                j$.time.temporal.a.MONTH_OF_YEAR.d0(readByte);
                return new x(readInt2, readByte);
            case 13:
                int i6 = o.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                Month L2 = Month.L(readByte2);
                Objects.requireNonNull(L2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.d0(readByte3);
                if (readByte3 <= L2.J()) {
                    return new o(L2.getValue(), readByte3);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + L2.name());
            case 14:
                s sVar = s.d;
                return s.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
