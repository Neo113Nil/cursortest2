package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qss0 implements tss0 {
    public final kdc a;

    public qss0(kdc kdcVar) {
        this.a = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qss0) && this.a.equals(((qss0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Nav(color=" + this.a + Extension.C_BRAKE;
    }
}
