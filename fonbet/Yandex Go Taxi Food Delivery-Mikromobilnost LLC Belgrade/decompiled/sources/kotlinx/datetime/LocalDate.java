package kotlinx.datetime;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.m2z;
import defpackage.s2z;
import defpackage.yci0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;

@gsq0(with = s2z.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u0011\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/datetime/LocalDate;", "", "Ljava/io/Serializable;", "Ljava/io/ObjectInputStream;", "ois", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDate;", "value", "Ljava/time/LocalDate;", "f", "()Ljava/time/LocalDate;", "Companion", "m2z", "n2z", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocalDate implements Comparable<LocalDate>, Serializable {
    public static final m2z Companion = new m2z();
    private static final long serialVersionUID = 0;
    private final java.time.LocalDate value;

    static {
        java.time.LocalDate localDate = java.time.LocalDate.MIN;
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
    }

    public LocalDate(int i, int i2, int i3) {
        try {
            this(java.time.LocalDate.of(i, i2, i3));
        } catch (DateTimeException e) {
            yci0.r(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream ois) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(2, this);
    }

    public final int a() {
        return this.value.getDayOfMonth();
    }

    public final DayOfWeek b() {
        return (DayOfWeek) DayOfWeek.a().get(this.value.getDayOfWeek().getValue() - 1);
    }

    public final Month c() {
        return (Month) Month.a().get(this.value.getMonth().getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalDate localDate) {
        return this.value.compareTo((ChronoLocalDate) localDate.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LocalDate) && jl40.l(this.value, ((LocalDate) obj).value);
        }
        return true;
    }

    /* renamed from: f, reason: from getter */
    public final java.time.LocalDate getValue() {
        return this.value;
    }

    public final int g() {
        return this.value.getYear();
    }

    public final long h() {
        return this.value.toEpochDay();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value.toString();
    }

    public LocalDate(java.time.LocalDate localDate) {
        this.value = localDate;
    }
}
