package defpackage;

import java.util.concurrent.CancellationException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tzl extends wzl {
    public final CancellationException a;

    public tzl(CancellationException cancellationException) {
        this.a = cancellationException;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return tzl.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((tzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentFetchCancelled(cause=" + this.a + Extension.C_BRAKE;
    }
}
