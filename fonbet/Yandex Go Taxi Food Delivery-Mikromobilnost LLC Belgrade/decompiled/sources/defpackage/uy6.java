package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uy6 extends az6 {
    public final boolean a;

    public uy6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy6) && this.a == ((uy6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("DoneButtonAction(shouldRestorePreorder=", Extension.C_BRAKE, this.a);
    }
}
