package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sm8 implements um8 {
    public final vrc a;

    public sm8(vrc vrcVar) {
        this.a = vrcVar;
    }

    public final vrc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm8) && this.a.equals(((sm8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReissueLanding(landingState=" + this.a + Extension.C_BRAKE;
    }
}
