package kotlin.uuid;

import defpackage.cvu0;
import defpackage.cy21;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.ssl.Alerts;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0017J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "mostSignificantBits", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "leastSignificantBits", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "gwk0", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final Uuid a = new Uuid(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new UuidSerialized(this.mostSignificantBits, this.leastSignificantBits);
    }

    public final String a() {
        byte[] bArr = new byte[36];
        cy21.a(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = Alerts.alert_certificate_expired;
        cy21.a(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = Alerts.alert_certificate_expired;
        cy21.a(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = Alerts.alert_certificate_expired;
        cy21.a(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = Alerts.alert_certificate_expired;
        cy21.a(this.leastSignificantBits, bArr, 24, 2, 8);
        return cvu0.q(bArr);
    }

    public final String b() {
        byte[] bArr = new byte[32];
        cy21.a(this.mostSignificantBits, bArr, 0, 0, 8);
        cy21.a(this.leastSignificantBits, bArr, 16, 0, 8);
        return cvu0.q(bArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Uuid uuid) {
        Uuid uuid2 = uuid;
        long j = this.mostSignificantBits;
        long j2 = uuid2.mostSignificantBits;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.leastSignificantBits, uuid2.leastSignificantBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        return a();
    }
}
