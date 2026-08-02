package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sn8 implements av31 {
    public final bc a;

    public sn8(bc bcVar) {
        this.a = bcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sn8) && this.a == ((sn8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CardSelectorPage(cardSelectorInfo=" + this.a + Extension.C_BRAKE;
    }
}
