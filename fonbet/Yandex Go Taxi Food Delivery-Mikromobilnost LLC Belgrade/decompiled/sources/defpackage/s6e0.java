package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class s6e0 {
    public static final r6e0 Companion = new r6e0();
    public final boolean a;

    public /* synthetic */ s6e0(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            qje.Z(i, 1, q6e0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6e0) && this.a == ((s6e0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Params(animated=", Extension.C_BRAKE, this.a);
    }
}
