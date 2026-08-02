package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xy20 implements yy20 {
    public final Set a;

    public xy20(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy20) && this.a.equals(((xy20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InterruptOnUnexpected(allowedModalNames=" + this.a + Extension.C_BRAKE;
    }
}
