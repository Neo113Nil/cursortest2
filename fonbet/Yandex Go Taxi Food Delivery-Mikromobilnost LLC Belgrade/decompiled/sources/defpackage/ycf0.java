package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ycf0 extends adf0 {
    public final boolean a;

    public ycf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycf0) && this.a == ((ycf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ShowCreateName(once=", Extension.C_BRAKE, this.a);
    }
}
