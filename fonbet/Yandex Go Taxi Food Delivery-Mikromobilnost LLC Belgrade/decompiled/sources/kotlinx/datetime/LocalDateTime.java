package kotlinx.datetime;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.t2z;
import defpackage.y2z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.chrono.ChronoLocalDateTime;
import kotlin.Metadata;

@gsq0(with = y2z.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u0011\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "Ljava/io/Serializable;", "Ljava/io/ObjectInputStream;", "ois", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "value", "Ljava/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDateTime;", "Companion", "t2z", "u2z", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalDateTime implements Comparable<LocalDateTime>, Serializable {
    public static final t2z Companion = new t2z();
    private static final long serialVersionUID = 0;
    private final java.time.LocalDateTime value;

    static {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.MIN;
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this(java.time.LocalDateTime.of(localDate.getValue(), localTime.getValue()));
    }

    private final void readObject(ObjectInputStream ois) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(4, this);
    }

    public final LocalDate a() {
        return new LocalDate(this.value.toLocalDate());
    }

    public final int b() {
        return this.value.getDayOfMonth();
    }

    public final LocalTime c() {
        return new LocalTime(this.value.toLocalTime());
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalDateTime localDateTime) {
        return this.value.compareTo((ChronoLocalDateTime<?>) localDateTime.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LocalDateTime) && jl40.l(this.value, ((LocalDateTime) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value.toString();
    }

    public LocalDateTime(java.time.LocalDateTime localDateTime) {
        this.value = localDateTime;
    }
}
