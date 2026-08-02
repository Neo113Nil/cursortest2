package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class u2n0 implements x2n0 {
    public final Set a;

    public final boolean equals(Object obj) {
        if (obj instanceof u2n0) {
            return this.a.equals(((u2n0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FailedAttempt(exams=" + this.a + Extension.C_BRAKE;
    }
}
