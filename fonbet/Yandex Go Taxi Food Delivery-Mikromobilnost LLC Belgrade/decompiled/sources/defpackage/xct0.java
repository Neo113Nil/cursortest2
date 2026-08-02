package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class xct0 extends yct0 {
    public final Set a;

    public xct0(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xct0) && this.a.equals(((xct0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HiddenSourceChanged(deliveries=" + this.a + Extension.C_BRAKE;
    }
}
