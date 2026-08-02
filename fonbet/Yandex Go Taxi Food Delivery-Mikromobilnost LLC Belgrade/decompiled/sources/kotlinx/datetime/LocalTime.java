package kotlinx.datetime;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.s4z;
import defpackage.x4z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;

@gsq0(with = x4z.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/datetime/LocalTime;", "", "Ljava/io/Serializable;", "Ljava/io/ObjectInputStream;", "ois", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalTime;", "value", "Ljava/time/LocalTime;", "a", "()Ljava/time/LocalTime;", "Companion", "s4z", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LocalTime implements Comparable<LocalTime>, Serializable {
    public static final s4z Companion = new s4z();
    private static final long serialVersionUID = 0;
    private final java.time.LocalTime value;

    static {
        java.time.LocalTime localTime = java.time.LocalTime.MIN;
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
    }

    public LocalTime(java.time.LocalTime localTime) {
        this.value = localTime;
    }

    private final void readObject(ObjectInputStream ois) {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(3, this);
    }

    /* renamed from: a, reason: from getter */
    public final java.time.LocalTime getValue() {
        return this.value;
    }

    public final long b() {
        return this.value.toNanoOfDay();
    }

    public final int c() {
        return this.value.toSecondOfDay();
    }

    @Override // java.lang.Comparable
    public final int compareTo(LocalTime localTime) {
        return this.value.compareTo(localTime.value);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LocalTime) && jl40.l(this.value, ((LocalTime) obj).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value.toString();
    }
}
