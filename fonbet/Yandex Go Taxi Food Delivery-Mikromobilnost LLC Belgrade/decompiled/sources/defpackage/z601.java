package defpackage;

import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z601 extends c701 {
    public final UUID a;

    public z601(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z601) && this.a.equals(((z601) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Local(localUuid=" + this.a + Extension.C_BRAKE;
    }
}
