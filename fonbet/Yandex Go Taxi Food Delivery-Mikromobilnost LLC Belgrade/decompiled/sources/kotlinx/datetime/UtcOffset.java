package kotlinx.datetime;

import defpackage.gsq0;
import defpackage.iw21;
import defpackage.jl40;
import defpackage.zv21;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;
import kotlin.Metadata;

@gsq0(with = iw21.class)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lkotlinx/datetime/UtcOffset;", "Ljava/io/Serializable;", "Ljava/io/ObjectInputStream;", "ois", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/ZoneOffset;", "zoneOffset", "Ljava/time/ZoneOffset;", "b", "()Ljava/time/ZoneOffset;", "Companion", "zv21", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UtcOffset implements Serializable {
    public static final zv21 Companion = new zv21();
    private static final long serialVersionUID = 0;
    private final ZoneOffset zoneOffset;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
    }

    public UtcOffset(ZoneOffset zoneOffset) {
        this.zoneOffset = zoneOffset;
    }

    private final void readObject(ObjectInputStream ois) {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new Ser(10, this);
    }

    public final int a() {
        return this.zoneOffset.getTotalSeconds();
    }

    /* renamed from: b, reason: from getter */
    public final ZoneOffset getZoneOffset() {
        return this.zoneOffset;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UtcOffset) && jl40.l(this.zoneOffset, ((UtcOffset) obj).zoneOffset);
    }

    public final int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public final String toString() {
        return this.zoneOffset.toString();
    }
}
