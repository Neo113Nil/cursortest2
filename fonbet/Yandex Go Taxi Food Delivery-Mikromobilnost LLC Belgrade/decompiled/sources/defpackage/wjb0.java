package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wjb0 extends yjb0 {
    public final kao a;

    public wjb0(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjb0) && this.a == ((wjb0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorState=", this.a, Extension.C_BRAKE);
    }
}
