package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes9.dex */
public final class tx90 {
    public static final tx90 b = new tx90(UserCardProfileName.YANDEX_DEFAULT);
    public final UserCardProfileName a;

    public tx90(UserCardProfileName userCardProfileName) {
        this.a = userCardProfileName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx90) && this.a == ((tx90) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PaymentCardProfile(userCardProfileName=" + this.a + Extension.C_BRAKE;
    }
}
