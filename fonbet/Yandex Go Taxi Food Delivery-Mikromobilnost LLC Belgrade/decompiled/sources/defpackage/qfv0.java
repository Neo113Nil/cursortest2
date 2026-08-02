package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qfv0 implements rfv0 {
    public final boolean a;

    public qfv0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfv0) && this.a == ((qfv0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("UserGestureAnimationCompleted(needShowButton=", Extension.C_BRAKE, this.a);
    }
}
