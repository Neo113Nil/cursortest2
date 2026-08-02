package kotlinx.datetime;

import defpackage.gsq0;
import defpackage.jb61;
import defpackage.jl40;
import defpackage.qb61;
import defpackage.rb61;
import defpackage.yci0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;

@gsq0(with = rb61.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/datetime/YearMonth;", "", "Ljava/io/Serializable;", "Ljava/io/ObjectInputStream;", "ois", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/YearMonth;", "value", "Ljava/time/YearMonth;", "getValue$kotlinx_datetime", "()Ljava/time/YearMonth;", "Companion", "jb61", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class YearMonth implements Comparable<YearMonth>, Serializable {
    public static final jb61 Companion = new jb61();
    private static final long serialVersionUID = 0;
    private final java.time.YearMonth value;

    public YearMonth(int i, int i2) {
        try {
            this(java.time.YearMonth.of(i, i2));
        } catch (DateTimeException e) {
            yci0.r(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream ois) {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(11, this);
    }

    public final int a() {
        return this.value.getMonthValue();
    }

    public final int b() {
        return this.value.getYear();
    }

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        return this.value.compareTo(yearMonth.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof YearMonth) && jl40.l(this.value, ((YearMonth) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return ((DateTimeFormatter) qb61.a.getValue()).format(this.value);
    }

    public YearMonth(java.time.YearMonth yearMonth) {
        this.value = yearMonth;
    }
}
