package kotlinx.datetime;

import defpackage.fw21;
import defpackage.i3y;
import defpackage.qb61;
import defpackage.s4z;
import defpackage.yci0;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/datetime/Ser;", "Ljava/io/Externalizable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "typeTag", CA20Status.STATUS_USER_I, "value", "Ljava/lang/Object;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Ser implements Externalizable {
    private static final long serialVersionUID = 0;
    private int typeTag;
    private Object value;

    public Ser(int i, Serializable serializable) {
        this.typeTag = i;
        this.value = serializable;
    }

    /* renamed from: readResolve, reason: from getter */
    private final Object getValue() {
        return this.value;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object localDate;
        byte readByte = objectInput.readByte();
        this.typeTag = readByte;
        if (readByte == 2) {
            localDate = new LocalDate(java.time.LocalDate.ofEpochDay(objectInput.readLong()));
        } else if (readByte == 3) {
            s4z s4zVar = LocalTime.Companion;
            long readLong = objectInput.readLong();
            s4zVar.getClass();
            try {
                localDate = new LocalTime(java.time.LocalTime.ofNanoOfDay(readLong));
            } catch (DateTimeException e) {
                yci0.r(e);
                return;
            }
        } else if (readByte == 4) {
            LocalDate localDate2 = new LocalDate(java.time.LocalDate.ofEpochDay(objectInput.readLong()));
            s4z s4zVar2 = LocalTime.Companion;
            long readLong2 = objectInput.readLong();
            s4zVar2.getClass();
            try {
                localDate = new LocalDateTime(localDate2, new LocalTime(java.time.LocalTime.ofNanoOfDay(readLong2)));
            } catch (DateTimeException e2) {
                yci0.r(e2);
                return;
            }
        } else if (readByte == 10) {
            localDate = fw21.a(null, null, Integer.valueOf(objectInput.readInt()));
        } else {
            if (readByte != 11) {
                yci0.s(this.typeTag, "Unknown type tag: ");
                return;
            }
            long readLong3 = objectInput.readLong();
            i3y i3yVar = qb61.a;
            long j = readLong3 / 12;
            if ((readLong3 ^ 12) < 0 && j * 12 != readLong3) {
                j--;
            }
            long j2 = readLong3 % 12;
            localDate = new YearMonth((int) (j + 1970), ((int) (j2 + (12 & (((j2 ^ 12) & ((-j2) | j2)) >> 63)))) + 1);
        }
        this.value = localDate;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.typeTag);
        Object obj = this.value;
        int i = this.typeTag;
        if (i == 2) {
            objectOutput.writeLong(((LocalDate) obj).getValue().toEpochDay());
            return;
        }
        if (i == 3) {
            objectOutput.writeLong(((LocalTime) obj).b());
            return;
        }
        if (i == 4) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            objectOutput.writeLong(localDateTime.a().getValue().toEpochDay());
            objectOutput.writeLong(localDateTime.c().b());
        } else if (i == 10) {
            objectOutput.writeInt(((UtcOffset) obj).a());
        } else {
            if (i != 11) {
                yci0.h(this.typeTag, " for value: ", obj, "Unknown type tag: ");
                return;
            }
            YearMonth yearMonth = (YearMonth) obj;
            i3y i3yVar = qb61.a;
            objectOutput.writeLong((((yearMonth.b() - 1970) * 12) + yearMonth.a()) - 1);
        }
    }

    public Ser() {
        this(0, null);
    }
}
