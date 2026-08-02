package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class w9u0 implements fau0 {
    public final boolean a;

    public w9u0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9u0) && this.a == ((w9u0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("CardBinding(isInputsLocked=", Extension.C_BRAKE, this.a);
    }

    public w9u0() {
        this(false);
    }
}
