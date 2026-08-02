package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s9g0 implements w9g0 {
    public final lfv a;

    public s9g0(lfv lfvVar) {
        this.a = lfvVar;
    }

    @Override // defpackage.w9g0
    public final lfv c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9g0) && this.a.equals(((s9g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loading(toolbar=" + this.a + Extension.C_BRAKE;
    }
}
