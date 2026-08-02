package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wo0 implements yo0 {
    public final Set a;

    public wo0(Set set) {
        this.a = set;
    }

    @Override // defpackage.yo0
    public final Set a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo0) && this.a.equals(((wo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiTariffSelection(tariffClasses=" + this.a + Extension.C_BRAKE;
    }
}
