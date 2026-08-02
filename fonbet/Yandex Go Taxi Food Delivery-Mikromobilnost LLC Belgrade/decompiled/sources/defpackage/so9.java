package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class so9 implements uj9 {
    public final oma a;

    public so9(oma omaVar) {
        this.a = omaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so9) && this.a == ((so9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowPopup(popup=" + this.a + Extension.C_BRAKE;
    }
}
