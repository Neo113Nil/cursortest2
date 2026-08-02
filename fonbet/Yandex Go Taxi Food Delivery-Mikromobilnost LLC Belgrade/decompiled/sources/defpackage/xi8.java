package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xi8 implements zi8 {
    public final boolean a;

    public xi8(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zi8
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi8) && this.a == ((xi8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Fullscreen(isSlideable=", Extension.C_BRAKE, this.a);
    }
}
