package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x9u0 implements hau0 {
    public final boolean a;

    public x9u0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.hau0
    public final boolean a() {
        return hgb1.c(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9u0) && this.a == ((x9u0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("CardBinding(isInputsLocked=", Extension.C_BRAKE, this.a);
    }

    public x9u0() {
        this(false);
    }
}
