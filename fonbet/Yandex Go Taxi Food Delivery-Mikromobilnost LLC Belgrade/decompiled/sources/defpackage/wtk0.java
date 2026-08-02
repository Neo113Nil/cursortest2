package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wtk0 {
    public final boolean a;
    public final boolean b;

    public wtk0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtk0)) {
            return false;
        }
        wtk0 wtk0Var = (wtk0) obj;
        return this.a == wtk0Var.a && this.b == wtk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("RoadsLoadingState(isTollRoadsLoading=", ", isFreeRoadsLoading=", Extension.C_BRAKE, this.a, this.b);
    }
}
