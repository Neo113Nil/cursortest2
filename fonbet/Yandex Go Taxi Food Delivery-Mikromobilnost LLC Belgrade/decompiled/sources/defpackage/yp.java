package defpackage;

import java.util.Collection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yp implements fr {
    public final Collection a;

    public yp(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp) && this.a.equals(((yp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ListAction(actions=" + this.a + Extension.C_BRAKE;
    }
}
