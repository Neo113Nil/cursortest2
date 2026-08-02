package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class xx71 {
    public final boolean a;

    public xx71(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx71) && this.a == ((xx71) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("DebugPanelErrorIndicatorData(isEnabled=", Extension.C_BRAKE, this.a);
    }
}
